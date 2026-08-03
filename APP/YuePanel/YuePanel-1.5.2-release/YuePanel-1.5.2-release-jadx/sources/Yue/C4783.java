package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4783 extends Error {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Exception f10709;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4783() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.f10709) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.f10709.getClass().toString() : message2;
    }

    /* JADX INFO: renamed from: ۥ */
    public Exception m1688() {
        return this.f10709;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4783(Exception exc) {
        this.f10709 = exc;
    }

    public C4783(Exception exc, String str) {
        super(str);
        this.f10709 = exc;
    }

    public C4783(String str, Exception exc) {
        super(str);
        this.f10709 = exc;
    }

    public C4783(String str) {
        super(str);
    }
}
