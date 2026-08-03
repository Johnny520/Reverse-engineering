package Yue;

import Yue.C8403;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6348 extends C3455 implements InterfaceC6347 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f16119;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6348(String str, String str2) {
        super("xmlns", str, str2);
        this.f16119 = false;
    }

    @Override // Yue.InterfaceC6347
    public String getPrefix() {
        return this.f16119 ? "" : super.m9158();
    }

    @Override // Yue.C3455, Yue.InterfaceC8543
    public boolean isAttribute() {
        return false;
    }

    @Override // Yue.C3455
    public String toString() {
        if (this.f16119) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("xmlns='");
            stringBuffer.append(mo9147());
            stringBuffer.append("'");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(C8403.C1519.f25098);
        stringBuffer2.append(getPrefix());
        stringBuffer2.append("='");
        stringBuffer2.append(mo9147());
        stringBuffer2.append("'");
        return stringBuffer2.toString();
    }

    @Override // Yue.C3455, Yue.InterfaceC6347
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo9147() {
        return super.getValue();
    }

    @Override // Yue.C3455, Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public int mo9150() {
        return 13;
    }

    @Override // Yue.C3455, Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public boolean mo9154() {
        return true;
    }

    @Override // Yue.InterfaceC6347
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public boolean mo19842() {
        return this.f16119;
    }

    public C6348(String str) {
        super("xmlns", "", str);
        this.f16119 = true;
    }
}
