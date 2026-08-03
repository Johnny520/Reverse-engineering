package p000;

/* JADX INFO: renamed from: Mo */
/* JADX INFO: loaded from: classes.dex */
public final class C0547Mo {

    /* JADX INFO: renamed from: a */
    public final C0132D2 f1767a;

    /* JADX INFO: renamed from: b */
    public boolean f1768b;

    /* JADX INFO: renamed from: c */
    public int f1769c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2600us f1770d;

    public C0547Mo(C2600us r1, C0132D2 r2) {
        this.f1770d = r1;
        this.f1769c = -1;
        this.f1767a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1039a(boolean r4) {
        if (r4 == this.f1768b) goto L29;
        this.f1768b = r4;
        if (r4 == false) goto L8;
        int r42 = 1;
    L9:
        C2600us r1 = this.f1770d;
        int r2 = r1.f8979c;
        r1.f8979c = r42 + r2;
        if (r1.f8980d == true) goto L19;
        r1.f8980d = true;
    L25:
        int r0 = r1.f8979c;     // Catch: Throwable -> L22
        if (r2 == r0) goto L17;
        r2 = r0;
        goto L25
    L17:
        r1.f8980d = false;
    L22:
        th = move-exception;
        r1.f8980d = false;
        throw th;
    L19:
        if (this.f1768b == false) goto L28;
        r1.m5114c(this);
        return;
    L28:
        return;
    L8:
        r42 = -1;
        goto L9
    }
}
