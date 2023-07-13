package com.example.exam_biologies

import android.content.Context
import android.content.DialogInterface
import android.util.Patterns
import androidx.appcompat.app.AlertDialog

class CheckCnx(private val context: Context) {

    private fun showAlertDialog(titre : String, message : String) {
        val alertDialogBuilder = AlertDialog.Builder(context)
        alertDialogBuilder.setTitle(titre)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setPositiveButton("OK") { dialog: DialogInterface, _: Int ->
            dialog.dismiss()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    private fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isPswValid(psw: String): Boolean {
        return !psw.isEmpty()
    }

    fun checkCredentials(email: String, password: String): Boolean {

        var TextError : String = ""
        if (!isEmailValid(email)) {
            TextError = "Votre mail n'est pas valide! "
        }

        if (password.isEmpty()) {
            TextError = TextError + "Votre mot de passe est vide! "
        }

        if (!TextError.isEmpty()){
            showAlertDialog("Error", TextError)
            return false
        }

        return true
    }

    fun checkCredentialsBloggies(email: String, login: String, password: String, password2: String): Boolean {

        var TextError : String = ""

        if (!isEmailValid(email)) {
            TextError = "Votre mail n'est pas valide! "
        }

        if (login.isEmpty()) {
            TextError = TextError + "Votre login est vide! "
        }

        if (password.isEmpty()) {
            TextError = TextError + "Votre mot de passe est vide! "
        }

        if (password2.isEmpty()) {
            TextError = TextError + "Votre mot de passe est vide! "
        }

        if (password != password2) {
            TextError = TextError + "Vos mots de passe ne correspondent pas ! "
        }

        if (!TextError.isEmpty()){
            showAlertDialog("Error", TextError)
            return false
        }

        return true
    }
}