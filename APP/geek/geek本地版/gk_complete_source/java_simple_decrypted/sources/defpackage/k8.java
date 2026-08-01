package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k8 {
    public boolean a;
    public j8 b;
    public boolean c;

    public final void a(j8 r2) {
        monitor-enter(this);
    L25:
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.c == false) goto L8;
        wait();     // Catch: InterruptedException -> L22 Throwable -> L11
        goto L25
    L8:
        if (this.b != r2) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L11
        return;
    L13:
        this.b = r2;     // Catch: Throwable -> L11
        if (this.a == false) goto L18;
        monitor-exit(this);     // Catch: Throwable -> L11
        r2.onCancel();
        return;
    L18:
        monitor-exit(this);     // Catch: Throwable -> L11
    }
}
