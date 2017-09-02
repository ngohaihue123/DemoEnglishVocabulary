package com.example.ngohaihue.englishvocabulary.controllers;

import com.example.ngohaihue.englishvocabulary.model.Topic;
import com.example.ngohaihue.englishvocabulary.model.Vocabulary;

import java.util.ArrayList;

/**
 * Created by ngohaihue on 8/23/17.
 */

public class TopicManager {
    private ArrayList<Topic> mTopicList;
    private  ArrayList<Vocabulary> mVocabularyList;

    public TopicManager(ArrayList<Topic> aTopicList, ArrayList<Vocabulary> vocabularyArrayList) {
        this.mTopicList = aTopicList;
        this.mVocabularyList = vocabularyArrayList;
    }

    public TopicManager() {
    }

    private   void  load(){

    }
    public  ArrayList<Topic> getTopicList(){
        return  mTopicList;
    }
    public  ArrayList<Vocabulary> getVocabularyArrayList(Topic topic){
        ArrayList<Vocabulary> list=new ArrayList<>();
        for(Vocabulary vocabulary: mVocabularyList){
            if(vocabulary.getTopicId()==topic.getId()){
                list.add(vocabulary);
            }
        }
        return list;
    }
    public static void main(){

    }


}
