package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ng extends java.lang.RuntimeException {
    public final transient defpackage.ge a;

    public ng(defpackage.ge r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
            r1 = this;
            ge r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
