package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ng extends RuntimeException {
    public final transient ge a;

    public ng(ge r1) {
        this.a = r1;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
