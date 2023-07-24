package com.example.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class A2Controller {
    @FXML
    private Button typeA;

    @FXML
    private Button typeB;

    @FXML
    private Button typeC;

    @FXML
    private Button typeD;

    @FXML
    private Button typeE;

    @FXML
    private Button typeF;

    @FXML
    private Button typeG;

    @FXML
    private Button typeH;

    @FXML
    private Button typeI;

    @FXML
    private Button typeJ;

    @FXML
    private Button typeK;

    @FXML
    private Button typeL;

    @FXML
    private Button typeM;

    @FXML
    private Button typeN;

    @FXML
    private Button typeO;

    @FXML
    private Button typeP;

    @FXML
    private Button typeQ;

    @FXML
    private Button typeR;

    @FXML
    private Button typeS;

    @FXML
    private Button typeT;

    @FXML
    private Button typeU;

    @FXML
    private Button typeV;

    @FXML
    private Button typeW;

    @FXML
    private Button typeX;

    @FXML
    private Button typeY;

    @FXML
    private Button typeZ;
    //public int  availableAlphabets[] ={1,2,2,4,12,2,3,2,8,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};
    public String word="";
    A2Model model=new A2Model();
    public ArrayList<String> WordsEntered = new ArrayList<>();
    @FXML
    public Label Total;

    @FXML
    public Label ErrMsg = new Label();

    @FXML
    public TextField wordCatch=new TextField();
    @FXML
    public TextField pre= new TextField();

    @FXML
    public AnchorPane TheContainer;


    @FXML
    void letterA(ActionEvent event) {
        word+="A";
        wordCatch.setText(word);
        if(model.availableAlphabets[0]==1)
            typeA.setVisible(false);
    }
    @FXML
    void letterB(ActionEvent event) {
        word+="B";
        wordCatch.setText(word);
        if(model.availableAlphabets[1]==1)
            typeB.setVisible(false);
    }
    @FXML
    void letterC(ActionEvent event) {
        word+="C";
        wordCatch.setText(word);
        if(model.availableAlphabets[2]==1)
            typeC.setVisible(false);
    }

    @FXML
    void letterD(ActionEvent event) {
        word+="D";
        wordCatch.setText(word);
        if(model.availableAlphabets[3]==1)
            typeD.setVisible(false);
    }


    @FXML
    void letterE(ActionEvent event) {
        word+="E";
        wordCatch.setText(word);
        if(model.availableAlphabets[4]==1)
            typeE.setVisible(false);
    }


    @FXML
    void letterF(ActionEvent event) {
        word+="F";
        wordCatch.setText(word);
        if(model.availableAlphabets[5]==1)
            typeF.setVisible(false);
    }

    @FXML
    void letterG(ActionEvent event) {
        word+="G";
        wordCatch.setText(word);
        if(model.availableAlphabets[6]==1)
            typeG.setVisible(false);
    }


    @FXML
    void letterH(ActionEvent event) {
        word+="H";
        wordCatch.setText(word);
        if(model.availableAlphabets[7]==1)
            typeH.setVisible(false);
    }

    @FXML
    void letterI(ActionEvent event) {
        word+="I";
        wordCatch.setText(word);
        if(model.availableAlphabets[8]==1)
            typeI.setVisible(false);
    }


    @FXML
    void letterJ(ActionEvent event) {
        word+="J";
        wordCatch.setText(word);
        if(model.availableAlphabets[9]==1)
            typeJ.setVisible(false);
    }


    @FXML
    void letterK(ActionEvent event) {
        word+="K";
        wordCatch.setText(word);
        if(model.availableAlphabets[10]==1)
            typeK.setVisible(false);
    }

    @FXML
    void letterL(ActionEvent event) {
        word+="L";
        wordCatch.setText(word);
        if(model.availableAlphabets[11]==1)
            typeL.setVisible(false);
    }

    @FXML
    void letterM(ActionEvent event) {
        word+="M";
        wordCatch.setText(word);
        if(model.availableAlphabets[12]==1)
            typeM.setVisible(false);
    }

    @FXML
    void letterN(ActionEvent event) {
        word+="N";
        wordCatch.setText(word);
        if(model.availableAlphabets[13]==1)
            typeN.setVisible(false);

    }

    @FXML
    void letterO(ActionEvent event) {
        word+="O";
        wordCatch.setText(word);
        if(model.availableAlphabets[14]==1)
            typeO.setVisible(false);
    }


    @FXML
    void letterP(ActionEvent event) {
        word+="P";
        wordCatch.setText(word);
        if(model.availableAlphabets[15]==1)
            typeP.setVisible(false);
    }

    @FXML
    void letterQ(ActionEvent event) {
        word+="Q";
        wordCatch.setText(word);
        if(model.availableAlphabets[16]==1)
            typeQ.setVisible(false);
    }

    @FXML
    void letterR(ActionEvent event) {
        word+="R";
        wordCatch.setText(word);
        if(model.availableAlphabets[17]==1)
            typeR.setVisible(false);
    }

    @FXML
    void letterS(ActionEvent event) {
        word+="S";
        wordCatch.setText(word);
        if(model.availableAlphabets[18]==1)
            typeS.setVisible(false);
    }


    @FXML
    void letterT(ActionEvent event) {
        word+="T";
        wordCatch.setText(word);
        if(model.availableAlphabets[19]==1)
            typeT.setVisible(false);
    }


    @FXML
    void letterU(ActionEvent event) {
        word+="U";
        wordCatch.setText(word);
        if(model.availableAlphabets[20]==1)
            typeU.setVisible(false);
    }

    @FXML
    void letterV(ActionEvent event) {
        word+="V";
        wordCatch.setText(word);
        if(model.availableAlphabets[21]==1)
            typeV.setVisible(false);
    }

    @FXML
    void letterW(ActionEvent event) {
        word+="W";
        wordCatch.setText(word);
        if(model.availableAlphabets[22]==1)
            typeW.setVisible(false);
    }

    @FXML
    void letterX(ActionEvent event) {
        word+="X";
        wordCatch.setText(word);
        if(model.availableAlphabets[23]==1)
            typeX.setVisible(false);
    }


    @FXML
    void letterY(ActionEvent event) {
        word+="Y";
        wordCatch.setText(word);
        if(model.availableAlphabets[24]==1)
            typeY.setVisible(false);
    }

    @FXML
    void letterZ(ActionEvent event) {
        word+="Z";
        wordCatch.setText(word);
        if(model.availableAlphabets[25]==1)
            typeZ.setVisible(false);
    }



    @FXML
    void onSubmitClick(ActionEvent event){
        if(model.gameOver()==false){
            ErrMsg.setVisible(false);
            word=wordCatch.getText();
            int Totalpts=0;
            int errorsChecked= model.getCheck(word);
            System.out.println(errorsChecked);
            if(errorsChecked==100){
                WordsEntered.add(word);
                Totalpts= model.ptsCalculate(word);
                Total.setText(Integer.toString(Totalpts));

                word="";
                wordCatch.setText("");
            }
            else if (errorsChecked==1) {
                ErrMsg.setVisible(true); ErrMsg.setText("Word Entered should be min 3 letters");}
            else if (errorsChecked==2) {
                ErrMsg.setVisible(true);
                ErrMsg.setText("Word Entered Too Long");
            } else if (errorsChecked==3) {
                ErrMsg.setVisible(true);
                ErrMsg.setText("Input Word does not has vowel");
            } else if (errorsChecked==4) {
                ErrMsg.setVisible(true);
                ErrMsg.setText("Word Already entered");
            } else if(errorsChecked==5) {
                ErrMsg.setVisible(true);
                ErrMsg.setText("Word contains letter that is no longer available");
            }

        }
        else {
            ErrMsg.setVisible(true);
            ErrMsg.setText("One word left or no vowels are there");
        }
    }
    //sets the error message label to invisible before commencing the program
    @FXML
    void initialize(){
        ErrMsg.setVisible(false);
    }

    public void onPreviousClick(ActionEvent actionEvent) {
        pre.setText("");

        pre.setText(String.valueOf(WordsEntered));

    }
}