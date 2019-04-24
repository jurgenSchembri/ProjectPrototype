package com.example.jurge.quiz;

public class QuestionLibrary
{

    public String mQuestions [] = {
            "a","b","ċ","d","e","f","g","ġ"
    };

    private String mChoices [][] = {
            {"ajruplan", "xemx", "elmu"},
            {"xemx", "ballun", "ajruplan"},
            {"ċikkulata", "elmu", "siġra"},
            {"dulliegħa", "ballun", "funtana"},
            {"elmu", "ċikkulata", "xemx"},
            {"fjura", "karozza", "ajruplan"},
            {"dulliegħa", "gallettina", "funtana"},
            {"larinġa", "ballun", "ġelat"}
    };

    private String mCorrectAnswers [] = {"ajruplan", "ballun", "ċikkulata", "dulliegħa", "elmu", "fjura", "gallettina", "ġelat"};

    public String getQuestion(int i){
        String question = mQuestions[i];
        return  question;
    }

    public String getChoice1(int i){
        String choice1 = mChoices[i][0];
        return  choice1;
    }

    public String getChoice2(int i){
        String choice2 = mChoices[i][1];
        return  choice2;
    }

    public String getChoice3(int i){
        String choice3 = mChoices[i][2];
        return  choice3;
    }

    public String getCorrectAnswer(int i){
        String answer = mCorrectAnswers[i];
        return  answer;
    }

}
