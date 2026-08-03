package p000;

/* JADX INFO: renamed from: O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609O6 {

    /* JADX INFO: renamed from: a */
    public boolean f1951a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0566N6 f1952b;

    /* JADX INFO: renamed from: c */
    public boolean f1953c;

    /* JADX INFO: renamed from: a */
    public final void m1188a(InterfaceC0566N6 r2) {
        monitor-enter(this);
    L25:
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.f1953c == false) goto L8;
        wait();     // Catch: InterruptedException -> L22 Throwable -> L11
        goto L25
    L8:
        if (this.f1952b != r2) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L11
        return;
    L13:
        this.f1952b = r2;     // Catch: Throwable -> L11
        if (this.f1951a == false) goto L18;
        monitor-exit(this);     // Catch: Throwable -> L11
        r2.onCancel();
        return;
    L18:
        monitor-exit(this);     // Catch: Throwable -> L11
    }
}
