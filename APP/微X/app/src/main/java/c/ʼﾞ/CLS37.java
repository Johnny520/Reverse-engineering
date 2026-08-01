// Decompiled by JEB v5.42.0.202606242140

package c.ʼﾞ;

import c.ᐧᵔ.CLS329;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

public final class CLS37 {
    public ErrorCorrectionLevel FLD141;
    public CLS32 FLD142;
    public Mode FLD143;
    public CLS329 FLD144;
    public int FLD145;

    public CLS37() {
        this.FLD145 = -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(200);
        stringBuilder0.append("<<\n");
        stringBuilder0.append(" mode: ");
        stringBuilder0.append(this.FLD143);
        stringBuilder0.append("\n ecLevel: ");
        stringBuilder0.append(this.FLD141);
        stringBuilder0.append("\n version: ");
        stringBuilder0.append(this.FLD144);
        stringBuilder0.append("\n maskPattern: ");
        stringBuilder0.append(this.FLD145);
        if(this.FLD142 == null) {
            stringBuilder0.append("\n matrix: null\n");
        }
        else {
            stringBuilder0.append("\n matrix:\n");
            stringBuilder0.append(this.FLD142);
        }
        stringBuilder0.append(">>\n");
        return stringBuilder0.toString();
    }

    public static boolean MTH889(int v) {
        return v >= 0 && v < 8;
    }

    public void MTH890(CLS32 ʻᵢ0) {
        this.FLD142 = ʻᵢ0;
    }

    public CLS32 MTH891() {
        return this.FLD142;
    }

    public void MTH892(ErrorCorrectionLevel errorCorrectionLevel0) {
        this.FLD141 = errorCorrectionLevel0;
    }

    public void MTH893(CLS329 ٴⁱ0) {
        this.FLD144 = ٴⁱ0;
    }

    public void MTH894(Mode mode0) {
        this.FLD143 = mode0;
    }

    public void MTH895(int v) {
        this.FLD145 = v;
    }
}

