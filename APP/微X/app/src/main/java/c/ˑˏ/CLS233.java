// Decompiled by JEB v5.42.0.202606242140

package c.ˑˏ;

import c.ᵢˎ.CLS327;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

public final class CLS233 {
    public CLS327 FLD930;
    public CLS235 FLD931;
    public int FLD932;
    public Mode FLD933;
    public ErrorCorrectionLevel FLD934;

    public CLS233() {
        this.FLD932 = -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(200);
        stringBuilder0.append("<<\n");
        stringBuilder0.append(" mode: ");
        stringBuilder0.append(this.FLD933);
        stringBuilder0.append("\n ecLevel: ");
        stringBuilder0.append(this.FLD934);
        stringBuilder0.append("\n version: ");
        stringBuilder0.append(this.FLD930);
        stringBuilder0.append("\n maskPattern: ");
        stringBuilder0.append(this.FLD932);
        if(this.FLD931 == null) {
            stringBuilder0.append("\n matrix: null\n");
        }
        else {
            stringBuilder0.append("\n matrix:\n");
            stringBuilder0.append(this.FLD931);
        }
        stringBuilder0.append(">>\n");
        return stringBuilder0.toString();
    }

    public void MTH3180(ErrorCorrectionLevel errorCorrectionLevel0) {
        this.FLD934 = errorCorrectionLevel0;
    }

    public void MTH3181(CLS235 ﾞⁱ0) {
        this.FLD931 = ﾞⁱ0;
    }

    public void MTH3182(int v) {
        this.FLD932 = v;
    }

    public void MTH3183(Mode mode0) {
        this.FLD933 = mode0;
    }

    public CLS235 MTH3184() {
        return this.FLD931;
    }

    public void MTH3185(CLS327 ᵔʼ0) {
        this.FLD930 = ᵔʼ0;
    }

    public static boolean MTH3186(int v) {
        return v >= 0 && v < 8;
    }
}

