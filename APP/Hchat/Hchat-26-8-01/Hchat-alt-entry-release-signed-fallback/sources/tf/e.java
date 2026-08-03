package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends tf.f implements java.util.RandomAccess {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tf.f f13148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13150i;

    public e(tf.f r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r1.f13148g = r2
            r1.f13149h = r3
            tf.c r0 = tf.f.Companion
            int r2 = r2.size()
            r0.getClass()
            tf.c.c(r3, r4, r2)
            int r4 = r4 - r3
            r1.f13150i = r4
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            tf.c r0 = tf.f.Companion
            r0.getClass()
            int r0 = r1.f13150i
            tf.c.a(r2, r0)
            int r0 = r1.f13149h
            int r0 = r0 + r2
            tf.f r2 = r1.f13148g
            java.lang.Object r2 = r2.get(r0)
            return r2
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f13150i
            return r0
    }

    @Override // tf.f, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            tf.c r0 = tf.f.Companion
            r0.getClass()
            int r0 = r2.f13150i
            tf.c.c(r3, r4, r0)
            tf.e r0 = new tf.e
            int r1 = r2.f13149h
            int r3 = r3 + r1
            int r1 = r1 + r4
            tf.f r4 = r2.f13148g
            r0.<init>(r4, r3, r1)
            return r0
    }
}
