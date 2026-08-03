package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0342 extends java.util.logging.Handler {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0342 f759 = null;

    static {
            Yue.ۥ۟۠ۥ۟ r0 = new Yue.ۥ۟۠ۥ۟
            r0.<init>()
            Yue.C0342.f759 = r0
            return
    }

    public C0342() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.logging.Handler
    public void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void publish(@Yue.InterfaceC4418 java.util.logging.LogRecord r6) {
            r5 = this;
            java.lang.String r0 = "record"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥ۟۠ۥ r0 = Yue.C0341.f755
            java.lang.String r1 = r6.getLoggerName()
            java.lang.String r2 = "record.loggerName"
            Yue.C3329.m13905(r1, r2)
            int r2 = Yue.C0343.m1418(r6)
            java.lang.String r3 = r6.getMessage()
            java.lang.String r4 = "record.message"
            Yue.C3329.m13905(r3, r4)
            java.lang.Throwable r6 = r6.getThrown()
            r0.m1414(r1, r2, r3, r6)
            return
    }
}
