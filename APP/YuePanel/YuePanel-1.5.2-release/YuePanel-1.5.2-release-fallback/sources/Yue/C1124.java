package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1124 extends java.util.concurrent.CancellationException {
    public C1124() {
            r1 = this;
            java.lang.String r0 = "Child of the scoped flow was cancelled"
            r1.<init>(r0)
            return
    }

    @Override // java.lang.Throwable
    @Yue.InterfaceC4418
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }
}
