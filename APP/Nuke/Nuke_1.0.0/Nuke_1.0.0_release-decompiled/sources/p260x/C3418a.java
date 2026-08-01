package p260x;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3418a {

    /* JADX INFO: renamed from: a */
    public boolean f10686a;

    /* JADX INFO: renamed from: b */
    public long f10687b;

    /* JADX INFO: renamed from: a */
    public final long m5684a() {
        if (this.f10686a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f10687b - System.nanoTime());
    }
}
