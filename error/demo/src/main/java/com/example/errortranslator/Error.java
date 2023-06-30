package com.example.errortranslator;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="error_list")
@AllArgsConstructor
@NoArgsConstructor
public class Error{

    public void setId(Integer id) {
        this.id = id;
    }

    public void setErrorType(String errorType){
        this.errorType=errorType;
    }

    public void setSourceECode(String sourceECode){
        this.sourceECode=sourceECode;
    }

    public void setSourceEPhrase(String sourceEPhrase){
        this.sourceEPhrase= sourceEPhrase;
    }

    public void setSourceEMsg(String sourceEMsg){
        this.sourceEMsg=sourceEMsg;
    }

    public void setTargetECode(String targetECode){
        this.targetECode=targetECode;
    }

    public void setTargetEPhrase(String targetEPhrase){
        this.targetEPhrase=targetEPhrase;
    }

    public void setTargetEMsg(String targetEMsg){
        this.targetEMsg=targetEMsg;
    }

    public Integer getId() {
        return id;
    }

    public String getErrorType() {
        return errorType;
    }
    public String getSEcode() {
        return sECode;
    }

    public String getSEphrase() {
        return sEPhrase;
    }

    public String getSEmsg() {
        return sEMsg;
    }
    public String getTEcode() {
        return tECode;
    }

    public String getTEphrase() {
        return tEPhrase;
    }

    public String getTEmsg() {
        return tEMsg;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "etype", columnDefinition = "TEXT")
    public String errorType;

    @Column(name = "seCode", columnDefinition = "TEXT")
    public String sECode;

    @Column(name = "sePhrase", columnDefinition = "TEXT")
    public String sEPhrase;

    @Column(name = "seMsg", columnDefinition = "TEXT")
    public String sEMsg;

    @Column(name = "teCode", columnDefinition = "TEXT")
    public String tECode;

    @Column(name = "tePhrase", columnDefinition = "TEXT")
    public String tEPhrase;

    @Column(name = "teMsg", columnDefinition = "TEXT")
    public String tEMsg;

    /*public Error(){
    }*/

    /*public Error(String eType, String sECode, String sEPhrase, String sEMsg, String tECode, String tEPhrase, String tEMsg) {
        this.eType=eType;
        this.sECode=sECode;
        this.sEPhrase=sEPhrase;
        this.sEMsg=sEMsg;
        this.tECode=tECode;
        this.tEPhrase=tEPhrase;
        this.tEMsg=tEMsg;
    }*/
}