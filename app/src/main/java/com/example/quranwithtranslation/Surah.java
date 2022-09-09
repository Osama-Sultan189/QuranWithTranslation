package com.example.quranwithtranslation;

public class Surah {
    public int surahID;
    public String surahIntro;
    public String surahName;
    public String surahNameArabic;
    public String Nazool;
    public Surah(int surahID, String surahIntro, String surahName, String nazool, String surahNameArabic) {
        this.surahID = surahID;
        this.surahIntro = surahIntro;
        this.surahName = surahName;
        this.surahNameArabic = surahNameArabic;
        Nazool = nazool;
    }

    public int getSurahID() {
        return surahID;
    }

    public void setSurahID(int surahID) {
        this.surahID = surahID;
    }

    public String getSurahIntro() {
        return surahIntro;
    }

    public void setSurahIntro(String surahIntro) {
        this.surahIntro = surahIntro;
    }

    public String getSurahName() {
        return surahName;
    }

    public void setSurahName(String surahName) {
        this.surahName = surahName;
    }

    public String getSurahNameArabic() {
        return surahNameArabic;
    }

    public void setSurahNameArabic(String surahNameArabic) {
        this.surahNameArabic = surahNameArabic;
    }

    public String getNazool() {
        return Nazool;
    }

    public void setNazool(String nazool) {
        Nazool = nazool;
    }
}
