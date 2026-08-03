package p000;

/* JADX INFO: renamed from: Dg */
/* JADX INFO: loaded from: classes.dex */
public final class C0152Dg {

    /* JADX INFO: renamed from: a */
    public final long f408a;

    /* JADX INFO: renamed from: b */
    public final long f409b;

    public C0152Dg(long j, long j2) {
        if (j2 == 0) {
            this.f408a = 0L;
            this.f409b = 1L;
        } else {
            this.f408a = j;
            this.f409b = j2;
        }
    }

    public final String toString() {
        return this.f408a + "/" + this.f409b;
    }
}
