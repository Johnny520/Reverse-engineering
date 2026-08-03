package io.sentry.util.thread;

/* JADX INFO: renamed from: io.sentry.util.thread.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2042c implements InterfaceC2040a {

    /* JADX INFO: renamed from: a */
    public static final long f7230a = 0;

    /* JADX INFO: renamed from: b */
    public static final C2042c f7231b = null;

    static {
        f7230a = Thread.currentThread().getId();
        f7231b = new C2042c();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: a */
    public final String mo3900a() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: b */
    public final long mo3901b() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: c */
    public final boolean mo3902c() {
        long r0 = Thread.currentThread().getId();
        if (f7230a != r0) goto L6;
        return true;
    L6:
        return false;
    }
}
