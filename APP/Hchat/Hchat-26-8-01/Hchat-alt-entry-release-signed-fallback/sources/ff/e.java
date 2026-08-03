package ff;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f3933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jf.e f3934d;

    public e(int r1, java.lang.String r2, byte[] r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f3931a = r1
            r0.f3932b = r2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r3)
            r0.f3933c = r1
            jf.e r1 = new jf.e
            ac.k r2 = new ac.k
            r2.<init>(r0, r4)
            r1.<init>(r2)
            r0.f3934d = r1
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f3932b
            return r0
    }
}
