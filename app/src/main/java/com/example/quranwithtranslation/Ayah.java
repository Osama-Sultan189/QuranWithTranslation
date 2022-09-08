package com.example.quranwithtranslation;

public class Ayah {
    public int ayahID;
    public int surahID;
    public int ayahNo;
    public int rukuID;
    public int paraRukuID;
    public int paraID;
    public String AyahtextArabic;
    public String transFatehMohammad;
    public String transMehmoodUlHaq;
    public String transDrMohsin;
    public String transMuftiTaqiUsmani;

    public Ayah(int ayahID, int surahID, int ayahNo, String ayahtextArabic, String transFatehMohammad, String transMehmoodUlHaq, String transDrMohsin, String transMuftiTaqiUsmani, int rukuID, int paraRukuID, int paraID) {
        this.ayahID = ayahID;
        this.surahID = surahID;
        this.ayahNo = ayahNo;
        this.rukuID = rukuID;
        this.paraRukuID = paraRukuID;
        this.paraID = paraID;
        AyahtextArabic = ayahtextArabic;
        this.transFatehMohammad = transFatehMohammad;
        this.transMehmoodUlHaq = transMehmoodUlHaq;
        this.transDrMohsin = transDrMohsin;
        this.transMuftiTaqiUsmani = transMuftiTaqiUsmani;
    }

    public int getAyahID() {
        return ayahID;
    }

    public void setAyahID(int ayahID) {
        this.ayahID = ayahID;
    }

    public int getSurahID() {
        return surahID;
    }

    public void setSurahID(int surahID) {
        this.surahID = surahID;
    }

    public int getAyahNo() {
        return ayahNo;
    }

    public void setAyahNo(int ayahNo) {
        this.ayahNo = ayahNo;
    }

    public int getRukuID() {
        return rukuID;
    }

    public void setRukuID(int rukuID) {
        this.rukuID = rukuID;
    }

    public int getParaRukuID() {
        return paraRukuID;
    }

    public void setParaRukuID(int paraRukuID) {
        this.paraRukuID = paraRukuID;
    }

    public int getParaID() {
        return paraID;
    }

    public void setParaID(int paraID) {
        this.paraID = paraID;
    }

    public String getAyahtextArabic() {
        return AyahtextArabic;
    }

    public void setAyahtextArabic(String ayahtextArabic) {
        AyahtextArabic = ayahtextArabic;
    }

    public String getTransFatehMohammad() {
        return transFatehMohammad;
    }

    public void setTransFatehMohammad(String transFatehMohammad) {
        this.transFatehMohammad = transFatehMohammad;
    }

    public String getTransMehmoodUlHaq() {
        return transMehmoodUlHaq;
    }

    public void setTransMehmoodUlHaq(String transMehmoodUlHaq) {
        this.transMehmoodUlHaq = transMehmoodUlHaq;
    }

    public String getTransDrMohsin() {
        return transDrMohsin;
    }

    public void setTransDrMohsin(String transDrMohsin) {
        this.transDrMohsin = transDrMohsin;
    }

    public String getTransMuftiTaqiUsmani() {
        return transMuftiTaqiUsmani;
    }

    public void setTransMuftiTaqiUsmani(String transMuftiTaqiUsmani) {
        this.transMuftiTaqiUsmani = transMuftiTaqiUsmani;
    }
}
