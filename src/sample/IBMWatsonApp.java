package sample;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.Profile;
import com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class IBMWatsonApp {


    @FXML
    private TextArea text;

    @FXML
    private Button buttonResult;

    @FXML
    private Tab toneAnalyzer;

    @FXML
    private Tab docLevelView;

    @FXML
    private ProgressBar angerBarD;

    @FXML
    private Label angerValueD;

    @FXML
    private ProgressBar disgustBarD;

    @FXML
    private Label disgustValueD;

    @FXML
    private ProgressBar fearBarD;

    @FXML
    private Label fearValueD;

    @FXML
    private ProgressBar joyBarD;

    @FXML
    private Label joyValueD;

    @FXML
    private ProgressBar sadBarD;

    @FXML
    private Label sadValueD;

    @FXML
    private ProgressBar analyticalBarD;

    @FXML
    private Label analyticalValueD;

    @FXML
    private ProgressBar confidentBarD;

    @FXML
    private Label confidentValueD;

    @FXML
    private ProgressBar tentativeBarD;

    @FXML
    private Label tentativeValueD;

    @FXML
    private ProgressBar opennessBarD;

    @FXML
    private Label opennessValueD;

    @FXML
    private ProgressBar conscientiousnessBarD;

    @FXML
    private Label conscientiousnessValueD;

    @FXML
    private ProgressBar extraversionBarD;

    @FXML
    private Label extraversionValueD;

    @FXML
    private ProgressBar agreeablenessBarD;

    @FXML
    private Label agreeablenessValueD;

    @FXML
    private ProgressBar emotionalRangeBarD;

    @FXML
    private Label emotionalRangeValueD;

    @FXML
    private Tab sentencelevelView;

    @FXML
    private ListView<String> listBox;

    @FXML
    private TitledPane SEmotionTP;

    @FXML
    private ProgressBar angerBarS;

    @FXML
    private Label angerValueS;

    @FXML
    private ProgressBar disgustBarS;

    @FXML
    private Label disgustValueS;

    @FXML
    private ProgressBar fearBarS;

    @FXML
    private Label fearValueS;

    @FXML
    private ProgressBar joyBarS;

    @FXML
    private Label joyValueS;

    @FXML
    private ProgressBar sadBarS;

    @FXML
    private Label sadValueS;

    @FXML
    private TitledPane SLanguageTP;

    @FXML
    private ProgressBar analyticalBarS;

    @FXML
    private Label analyticalValueS;

    @FXML
    private ProgressBar confidentBarS;

    @FXML
    private Label confidentValueS;

    @FXML
    private ProgressBar tentativeBarS;

    @FXML
    private Label tentativeValueS;

    @FXML
    private TitledPane SSocialTP;

    @FXML
    private ProgressBar opennessBarS;

    @FXML
    private Label opennessValueS;

    @FXML
    private ProgressBar conscientiousnessBarS;

    @FXML
    private Label conscientiousnessValueS;

    @FXML
    private ProgressBar extraversionBarS;

    @FXML
    private Label extraversionValueS;

    @FXML
    private ProgressBar agreeablenessBarS;

    @FXML
    private Label agreeablenessValueS;

    @FXML
    private ProgressBar emotionalRangeBarS;

    @FXML
    private Label emotionalRangeValueS;

    @FXML
    private Tab personalityInsights;

    @FXML
    private ProgressBar agreeablenessBarP;

    @FXML
    private Label agreeablenessValueP;

    @FXML
    private Label trustValueP;

    @FXML
    private Label uncompromisingValueP;

    @FXML
    private Label cooperationValueP;

    @FXML
    private Label modestyValueP;

    @FXML
    private Label sympathyValueP;

    @FXML
    private Label altruismValueP;

    @FXML
    private ProgressBar conscientiousnessBarP;

    @FXML
    private Label conscientiousnessValueP;

    @FXML
    private Label orderlinessValueP;

    @FXML
    private Label selfDisciplineValueP;

    @FXML
    private Label cautiousnessValueP;

    @FXML
    private Label achievementStrivingValueP;

    @FXML
    private Label selfEfficacyP;

    @FXML
    private Label dutifulnessValueP;

    @FXML
    private ProgressBar extraversionBarP;

    @FXML
    private Label extraversionValueP;

    @FXML
    private Label cheerfulnessValueP;

    @FXML
    private Label outgoingValueP;

    @FXML
    private Label gregariousnessValueP;

    @FXML
    private Label assertivenessValueP;

    @FXML
    private Label activityLevelValueP;

    @FXML
    private Label excitementSeekingValueP;

    @FXML
    private ProgressBar emotionalRangeBarP;

    @FXML
    private Label emotionalRangeValueP;

    @FXML
    private Label fieryValueP;

    @FXML
    private Label selfConsciousnessValueP;

    @FXML
    private Label impulsivenessValueP;

    @FXML
    private Label proneToWorryValueP;

    @FXML
    private Label susceptibleToStressValueP;

    @FXML
    private Label melancholyValueP;

    @FXML
    private ProgressBar opennessBarP;

    @FXML
    private Label opennessValueP;

    @FXML
    private Label imaginationValueP;

    @FXML
    private Label adventurousnessValueP;

    @FXML
    private Label emotionalityValueP;

    @FXML
    private Label authoritychallengeValueP;

    @FXML
    private Label artisticInterestValueP;

    @FXML
    private Label intellectValueP;

    @FXML
    private ProgressBar challengeBarP;

    @FXML
    private Label challengeValueP;

    @FXML
    private ProgressBar stabilityBarP;

    @FXML
    private Label stabilityValueP;

    @FXML
    private ProgressBar structureBarP;

    @FXML
    private Label structureValueP;

    @FXML
    private ProgressBar excitementBarP;

    @FXML
    private Label excitementValueP;

    @FXML
    private ProgressBar idealBarP;

    @FXML
    private Label idealValueP;

    @FXML
    private ProgressBar libertyBarP;

    @FXML
    private Label libertyValueP;

    @FXML
    private ProgressBar loveBarP;

    @FXML
    private Label loveValueP;

    @FXML
    private ProgressBar curiosityBarP;

    @FXML
    private Label curiosityValueP;

    @FXML
    private ProgressBar selfExpressionBarP;

    @FXML
    private Label selfExpressionValueP;

    @FXML
    private ProgressBar harmonyBarP;

    @FXML
    private Label harmonyValueP;

    @FXML
    private ProgressBar practicalityBarP;

    @FXML
    private Label practicalityValueP;

    @FXML
    private ProgressBar closenessBarP;

    @FXML
    private Label closenessValueP;

    @FXML
    private ProgressBar selfExpressionBarP1;

    @FXML
    private Label excitementValueP1112;

    @FXML
    private ProgressBar closenessBarP3;

    @FXML
    private Label excitementValueP11113;

    @FXML
    private ProgressBar traditionsBarP;

    @FXML
    private Label traditionsValueP;

    @FXML
    private ProgressBar achievementBarP;

    @FXML
    private Label achievementValueP;

    @FXML
    private ProgressBar takePleasureBarP;

    @FXML
    private Label takePleasureValueP;

    @FXML
    private ProgressBar stimulationBarP;

    @FXML
    private Label stimulationValueP;

    @FXML
    private ProgressBar helpOthersBarP;

    @FXML
    private Label helpOthersValueP;

    private ToneAnalysis tone;

    private Profile profile;

    private ToneAnalysis GetTONE(String t)
    {
        try {
            return ToneAnalyzerClass.Parse(t);
        }
        catch(Exception e) {
            return null;
        }
    }
    private Profile GetPROFILE(String s)
    {
        try {
            return PersonalityInsightsClass.parse(s);
        }
        catch(Exception e) {
            e.toString();
            return null;
        }
    }
    @FXML
    void buttonResult_Clicked(ActionEvent event)
    {
        String str=text.getText();
        if(!str.isEmpty())
        {
            tone = GetTONE(str);
            profile = GetPROFILE(str);
            toneAnalyzer.setDisable(false);
            sentencelevelView.setDisable(true);
            setDocView();
            if (tone.getSentencesTone() != null) {
                sentencelevelView.setDisable(false);
                setSentenceView();
            }
            if (profile != null) {
                personalityInsights.setDisable(false);
                setPersonalView();
            }
        }
    }
    private void setPersonalView()
    {
        double a;String s;
        //Personality
        a=profile.getPersonality().get(0).getPercentile();
        s=Double.toString(a*100);
        opennessBarP.progressProperty().set(a);
        opennessValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
        {
            a = profile.getPersonality().get(0).getChildren().get(0).getPercentile();
            s = Double.toString(a * 100);
            adventurousnessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(0).getChildren().get(1).getPercentile();
            s = Double.toString(a * 100);
            artisticInterestValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(0).getChildren().get(2).getPercentile();
            s = Double.toString(a * 100);
            emotionalityValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(0).getChildren().get(3).getPercentile();
            s = Double.toString(a * 100);
            imaginationValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(0).getChildren().get(4).getPercentile();
            s = Double.toString(a * 100);
            intellectValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(0).getChildren().get(5).getPercentile();
            s = Double.toString(a * 100);
            authoritychallengeValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
        }

        a=profile.getPersonality().get(1).getPercentile();
        s=Double.toString(a*100);
        conscientiousnessBarP.progressProperty().set(a);
        conscientiousnessValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
        {
            a = profile.getPersonality().get(1).getChildren().get(0).getPercentile();
            s = Double.toString(a * 100);
            achievementStrivingValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(1).getChildren().get(1).getPercentile();
            s = Double.toString(a * 100);
            cautiousnessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(1).getChildren().get(2).getPercentile();
            s = Double.toString(a * 100);
            dutifulnessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(1).getChildren().get(3).getPercentile();
            s = Double.toString(a * 100);
            orderlinessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(1).getChildren().get(4).getPercentile();
            s = Double.toString(a * 100);
            selfDisciplineValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(1).getChildren().get(5).getPercentile();
            s = Double.toString(a * 100);
            selfEfficacyP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
        }

        a=profile.getPersonality().get(2).getPercentile();
        s=Double.toString(a*100);
        extraversionBarP.progressProperty().set(a);
        extraversionValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
        {
            a = profile.getPersonality().get(2).getChildren().get(0).getPercentile();
            s = Double.toString(a * 100);
            activityLevelValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(2).getChildren().get(1).getPercentile();
            s = Double.toString(a * 100);
            assertivenessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(2).getChildren().get(2).getPercentile();
            s = Double.toString(a * 100);
            cheerfulnessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(2).getChildren().get(3).getPercentile();
            s = Double.toString(a * 100);
            excitementSeekingValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(2).getChildren().get(4).getPercentile();
            s = Double.toString(a * 100);
            outgoingValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(2).getChildren().get(5).getPercentile();
            s = Double.toString(a * 100);
            gregariousnessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
        }

        a=profile.getPersonality().get(3).getPercentile();
        s=Double.toString(a*100);
        agreeablenessBarP.progressProperty().set(a);
        agreeablenessValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
        {
            a = profile.getPersonality().get(3).getChildren().get(0).getPercentile();
            s = Double.toString(a * 100);
            altruismValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(3).getChildren().get(1).getPercentile();
            s = Double.toString(a * 100);
            cooperationValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(3).getChildren().get(2).getPercentile();
            s = Double.toString(a * 100);
            modestyValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(3).getChildren().get(3).getPercentile();
            s = Double.toString(a * 100);
            uncompromisingValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(3).getChildren().get(4).getPercentile();
            s = Double.toString(a * 100);
            sympathyValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(3).getChildren().get(5).getPercentile();
            s = Double.toString(a * 100);
            trustValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
        }

        a=profile.getPersonality().get(4).getPercentile();
        s=Double.toString(a*100);
        emotionalRangeBarP.progressProperty().set(a);
        emotionalRangeValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
        {
            a = profile.getPersonality().get(4).getChildren().get(0).getPercentile();
            s = Double.toString(a * 100);
            fieryValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(4).getChildren().get(1).getPercentile();
            s = Double.toString(a * 100);
            proneToWorryValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(4).getChildren().get(2).getPercentile();
            s = Double.toString(a * 100);
            melancholyValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(4).getChildren().get(3).getPercentile();
            s = Double.toString(a * 100);
            impulsivenessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(4).getChildren().get(4).getPercentile();
            s = Double.toString(a * 100);
            selfConsciousnessValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
            a = profile.getPersonality().get(4).getChildren().get(5).getPercentile();
            s = Double.toString(a * 100);
            susceptibleToStressValueP.setText(s.substring(0, s.indexOf(".") + 2) + "%");
        }
        //Needs
        a=profile.getNeeds().get(0).getPercentile();
        s=Double.toString(a*100);
        challengeBarP.progressProperty().set(a);
        challengeValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(1).getPercentile();
        s=Double.toString(a*100);
        closenessBarP.progressProperty().set(a);
        closenessValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(2).getPercentile();
        s=Double.toString(a*100);
        curiosityBarP.progressProperty().set(a);
        curiosityValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(3).getPercentile();
        s=Double.toString(a*100);
        excitementBarP.progressProperty().set(a);
        excitementValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(4).getPercentile();
        s=Double.toString(a*100);
        harmonyBarP.progressProperty().set(a);
        harmonyValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(5).getPercentile();
        s=Double.toString(a*100);
        idealBarP.progressProperty().set(a);
        idealValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(6).getPercentile();
        s=Double.toString(a*100);
        libertyBarP.progressProperty().set(a);
        libertyValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(7).getPercentile();
        s=Double.toString(a*100);
        loveBarP.progressProperty().set(a);
        loveValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(8).getPercentile();
        s=Double.toString(a*100);
        practicalityBarP.progressProperty().set(a);
        practicalityValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(9).getPercentile();
        s=Double.toString(a*100);
        selfExpressionBarP.progressProperty().set(a);
        selfExpressionValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(10).getPercentile();
        s=Double.toString(a*100);
        stabilityBarP.progressProperty().set(a);
        stabilityValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getNeeds().get(11).getPercentile();
        s=Double.toString(a*100);
        structureBarP.progressProperty().set(a);
        structureValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
        //Values

        a=profile.getValues().get(0).getPercentile();
        s=Double.toString(a*100);
        traditionsBarP.progressProperty().set(a);
        traditionsValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getValues().get(1).getPercentile();;
        s=Double.toString(a*100);
        stimulationBarP.progressProperty().set(a);
        stimulationValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getValues().get(2).getPercentile();
        s=Double.toString(a*100);
        takePleasureBarP.progressProperty().set(a);
        takePleasureValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getValues().get(3).getPercentile();
        s=Double.toString(a*100);
        achievementBarP.progressProperty().set(a);
        achievementValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=profile.getValues().get(4).getPercentile();
        s=Double.toString(a*100);
        helpOthersBarP.progressProperty().set(a);
        helpOthersValueP.setText(s.substring(0,s.indexOf(".")+2)+"%");
    }

    private void setDocView()
    {
        double a;String s;
        //emotions
        a=tone.getDocumentTone().getTones().get(0).getTones().get(0).getScore();
        s=Double.toString(a*100);
        angerBarD.progressProperty().set(a);
        angerValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(0).getTones().get(1).getScore();
        s=Double.toString(a*100);
        disgustBarD.progressProperty().set(a);
        disgustValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(0).getTones().get(2).getScore();
        s=Double.toString(a*100);
        fearBarD.progressProperty().set(a);
        fearValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(0).getTones().get(3).getScore();
        s=Double.toString(a*100);
        joyBarD.progressProperty().set(a);
        joyValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(0).getTones().get(4).getScore();
        s=Double.toString(a*100);
        sadBarD.progressProperty().set(a);
        sadValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");
        //Language
        a=tone.getDocumentTone().getTones().get(1).getTones().get(0).getScore();
        s=Double.toString(a*100);
        analyticalBarD.progressProperty().set(a);
        analyticalValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(1).getTones().get(1).getScore();
        s=Double.toString(a*100);
        confidentBarD.progressProperty().set(a);
        confidentValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(1).getTones().get(2).getScore();
        s=Double.toString(a*100);
        tentativeBarD.progressProperty().set(a);
        tentativeValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");
        //Social

        a=tone.getDocumentTone().getTones().get(2).getTones().get(0).getScore();
        s=Double.toString(a*100);
        opennessBarD.progressProperty().set(a);
        opennessValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(2).getTones().get(1).getScore();
        s=Double.toString(a*100);
        conscientiousnessBarD.progressProperty().set(a);
        conscientiousnessValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(2).getTones().get(2).getScore();
        s=Double.toString(a*100);
        extraversionBarD.progressProperty().set(a);
        extraversionValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(2).getTones().get(3).getScore();
        s=Double.toString(a*100);
        agreeablenessBarD.progressProperty().set(a);
        agreeablenessValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");

        a=tone.getDocumentTone().getTones().get(2).getTones().get(4).getScore();
        s=Double.toString(a*100);
        emotionalRangeBarD.progressProperty().set(a);
        emotionalRangeValueD.setText(s.substring(0,s.indexOf(".")+2)+"%");
    }
    private void setSentenceView()
    {
        ObservableList<String> items =listBox.getItems();
        items.clear();
        for(int i=0;i<tone.getSentencesTone().size();i++)
        {
            items.add(tone.getSentencesTone().get(i).getText());
        }
        listBox.setItems(items);
    }
     @FXML
    void listView_Clicked(MouseEvent event)
    {

        String str,Lstr=listBox.getSelectionModel().getSelectedItem().toString();
        for(int j=0;j<tone.getSentencesTone().size();j++)
        {
            str=tone.getSentencesTone().get(j).getText();
            if(Lstr==str)
            {
                if(tone.getSentencesTone().get(j).getTones().isEmpty())
                {
                    double a;
                    String s;
                    //emotions
                    a = 00.00;
                    s = "00.00";
                    angerBarS.progressProperty().set(a);
                    angerValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    disgustBarS.progressProperty().set(a);
                    disgustValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    fearBarS.progressProperty().set(a);
                    fearValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    joyBarS.progressProperty().set(a);
                    joyValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    sadBarS.progressProperty().set(a);
                    sadValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");
                    //Language
                    analyticalBarS.progressProperty().set(a);
                    analyticalValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    confidentBarS.progressProperty().set(a);
                    confidentValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    tentativeBarS.progressProperty().set(a);
                    tentativeValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");
                    //Social

                    opennessBarS.progressProperty().set(a);
                    opennessValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    conscientiousnessBarS.progressProperty().set(a);
                    conscientiousnessValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    extraversionBarS.progressProperty().set(a);
                    extraversionValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    agreeablenessBarS.progressProperty().set(a);
                    agreeablenessValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    emotionalRangeBarS.progressProperty().set(a);
                    emotionalRangeValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    SEmotionTP.setDisable(true);
                    SLanguageTP.setDisable(true);
                    SSocialTP.setDisable(true);
                }
                else
                {
                    SEmotionTP.setDisable(false);
                    SLanguageTP.setDisable(false);
                    SSocialTP.setDisable(false);
                    double a;
                    String s;
                    //emotions
                    a = tone.getSentencesTone().get(j).getTones().get(0).getTones().get(0).getScore();
                    s = Double.toString(a * 100);
                    angerBarS.progressProperty().set(a);
                    angerValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(0).getTones().get(1).getScore();
                    s = Double.toString(a * 100);
                    disgustBarS.progressProperty().set(a);
                    disgustValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(0).getTones().get(2).getScore();
                    s = Double.toString(a * 100);
                    fearBarS.progressProperty().set(a);
                    fearValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(0).getTones().get(3).getScore();
                    s = Double.toString(a * 100);
                    joyBarS.progressProperty().set(a);
                    joyValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(0).getTones().get(4).getScore();
                    s = Double.toString(a * 100);
                    sadBarS.progressProperty().set(a);
                    sadValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");
                    //Language
                    a = tone.getSentencesTone().get(j).getTones().get(1).getTones().get(0).getScore();
                    s = Double.toString(a * 100);
                    analyticalBarS.progressProperty().set(a);
                    analyticalValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(1).getTones().get(1).getScore();
                    s = Double.toString(a * 100);
                    confidentBarS.progressProperty().set(a);
                    confidentValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(1).getTones().get(2).getScore();
                    s = Double.toString(a * 100);
                    tentativeBarS.progressProperty().set(a);
                    tentativeValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");
                    //Social

                    a = tone.getSentencesTone().get(j).getTones().get(2).getTones().get(0).getScore();
                    s = Double.toString(a * 100);
                    opennessBarS.progressProperty().set(a);
                    opennessValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(2).getTones().get(1).getScore();
                    s = Double.toString(a * 100);
                    conscientiousnessBarS.progressProperty().set(a);
                    conscientiousnessValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(2).getTones().get(2).getScore();
                    s = Double.toString(a * 100);
                    extraversionBarS.progressProperty().set(a);
                    extraversionValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(2).getTones().get(3).getScore();
                    s = Double.toString(a * 100);
                    agreeablenessBarS.progressProperty().set(a);
                    agreeablenessValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");

                    a = tone.getSentencesTone().get(j).getTones().get(2).getTones().get(4).getScore();
                    s = Double.toString(a * 100);
                    emotionalRangeBarS.progressProperty().set(a);
                    emotionalRangeValueS.setText(s.substring(0, s.indexOf(".") + 2) + "%");
                }
            }
        }
    }

    public void initialize()
    {
        personalityInsights.setDisable(true);
        toneAnalyzer.setDisable(true);
    }
}
