
package br.com.lucas.enadesimulator.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginBean {
  private String username;
 
  private String password;
 
  private String menssagem;
 
  public void setUsername(String name) {
    this.username = name;
  }
 
  public String getUsername() {
    return username;
  }
 
 
  public String getPassword() {
    return password;
  }
 
 
  public void setPassword(String password) {
    this.password = password;
  }
 
  public void login() {
    if ("BootsFaces".equalsIgnoreCase(username) && "rocks!".equalsIgnoreCase(password)) {
      FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Congratulations! You've successfully logged in.");
      FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
 
    } else {
      FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "That's the wrong password. Hint: BootsFaces rocks!");
      FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
    }
  }
 
  public void forgotPassword() {
    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Default user name: BootsFaces");
    FacesContext.getCurrentInstance().addMessage("loginForm:username", msg);
    msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Default password: rocks!");
    FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
  }

    public String getMenssagem() {
        return menssagem;
    }

    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
    }
}