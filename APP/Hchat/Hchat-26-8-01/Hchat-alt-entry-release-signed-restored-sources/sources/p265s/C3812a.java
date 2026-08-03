package p265s;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3812a {

    /* JADX INFO: renamed from: a */
    public boolean f12502a;

    /* JADX INFO: renamed from: b */
    public long f12503b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m8001a() {
        if (this.f12502a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f12503b - System.nanoTime());
    }
}
