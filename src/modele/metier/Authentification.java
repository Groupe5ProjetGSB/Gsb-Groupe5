/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;

/**
 *
 * @author Dimitri
 */
public class Authentification {

    private String login;
    private Date password;

    public Authentification(String login, Date password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getPassword() {
        return password;
    }

    public void setPassword(Date password) {
        this.password = password;
    }

}
