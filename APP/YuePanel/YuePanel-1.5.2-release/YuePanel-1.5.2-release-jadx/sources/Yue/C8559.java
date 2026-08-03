package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8559 extends Exception {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Throwable f25405;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public InterfaceC5801 f25406;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8559() {
    }

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5801 m4534() {
        return this.f25406;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Throwable m4535() {
        return this.f25405;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8559(String str) {
        super(str);
    }

    public C8559(Throwable th) {
        this.f25405 = th;
    }

    public C8559(String str, Throwable th) {
        super(str);
        this.f25405 = th;
    }

    public C8559(String str, InterfaceC5801 interfaceC5801, Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParseError at [row,col]:[");
        stringBuffer.append(interfaceC5801.mo9160());
        stringBuffer.append(",");
        stringBuffer.append(interfaceC5801.mo9152());
        stringBuffer.append("]\n");
        stringBuffer.append("Message: ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.f25405 = th;
        this.f25406 = interfaceC5801;
    }

    public C8559(String str, InterfaceC5801 interfaceC5801) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParseError at [row,col]:[");
        stringBuffer.append(interfaceC5801.mo9160());
        stringBuffer.append(",");
        stringBuffer.append(interfaceC5801.mo9152());
        stringBuffer.append("]\n");
        stringBuffer.append("Message: ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.f25406 = interfaceC5801;
    }
}
