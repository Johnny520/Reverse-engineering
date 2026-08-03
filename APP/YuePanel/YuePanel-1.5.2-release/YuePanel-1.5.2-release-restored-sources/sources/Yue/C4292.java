package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4292 extends IOException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f8814;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f8815;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f8816;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4292() {
        this.f8814 = "";
        this.f8815 = -1;
        this.f8816 = -1;
    }

    /* JADX INFO: renamed from: ۥ */
    public int m1248() {
        return this.f8816;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m1249() {
        return this.f8814;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m12393() {
        return this.f8815;
    }

    public C4292(String str) {
        super(str);
        this.f8814 = "";
        this.f8815 = -1;
        this.f8816 = -1;
    }

    public C4292(String str, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("At line ");
        stringBuffer.append(i);
        stringBuffer.append(", column ");
        stringBuffer.append(i2);
        stringBuffer.append(": ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.f8814 = "";
        this.f8815 = i;
        this.f8816 = i2;
    }

    public C4292(String str, String str2, int i, int i2) {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        if (str == null || str.length() <= 0) {
            string = "At ";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("URI ");
            stringBuffer2.append(str);
            stringBuffer2.append(" at ");
            string = stringBuffer2.toString();
        }
        stringBuffer.append(string);
        stringBuffer.append("line ");
        stringBuffer.append(i);
        stringBuffer.append(", column ");
        stringBuffer.append(i2);
        stringBuffer.append(": ");
        stringBuffer.append(str2);
        super(stringBuffer.toString());
        this.f8814 = "";
        if (str != null) {
            this.f8814 = str;
        }
        this.f8815 = i;
        this.f8816 = i2;
    }
}
