package com.speddup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Login {

   // iniciar_seccion='guest_homepage-basic_nav-header-signin';
    public static final Target ENTER_LOGIN_SCREEN = Target
           .the("Seleccione el Boton ingresar")
           .located(By.className("nav__button-secondary"));

    public static final Target USER_NAME = Target
            .the("Se Ingresa el Usuario (email)")
            .located(By.id("username"));

    public static final Target USER_PASSWORD = Target
            .the("Se Ingresa la contraseña")
            .located(By.name("session_password"));
}
