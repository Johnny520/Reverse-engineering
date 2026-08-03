package p000;

/* JADX INFO: renamed from: Dg */
/* JADX INFO: loaded from: classes.dex */
public final class C0152Dg {

    /* JADX INFO: renamed from: a */
    public final long f408a;

    /* JADX INFO: renamed from: b */
    public final long f409b;

    public C0152Dg(long r4, long r6) {
        if (r6 != 0) goto L6;
        this.f408a = 0;
        this.f409b = 1;
        return;
    L6:
        this.f408a = r4;
        this.f409b = r6;
    }

    public final String toString() {
        return this.f408a + "/" + this.f409b;
    }
}
