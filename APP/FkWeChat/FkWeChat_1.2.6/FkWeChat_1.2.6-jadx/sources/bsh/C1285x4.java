package bsh;

/* JADX INFO: renamed from: bsh.x4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1285x4 extends C1279w4 {
    public C1285x4(Throwable th) {
        this(th.getMessage(), th);
    }

    @Override // bsh.C1279w4
    /* JADX INFO: renamed from: b */
    public C1163d2 mo5168b(String str, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        String message;
        if (str == null) {
            message = getMessage();
        } else {
            message = str + ": " + getMessage();
        }
        return new C1231o4(message, getCause(), interfaceC1188h3, c1174f1, false);
    }

    public C1285x4(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
