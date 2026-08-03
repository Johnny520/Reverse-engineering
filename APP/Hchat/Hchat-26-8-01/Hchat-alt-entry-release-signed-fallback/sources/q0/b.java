package q0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends tf.i implements java.util.Set, java.util.Collection, hg.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q0.b f10567j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f10568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f10569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p0.b f10570i;

    static {
            q0.b r0 = new q0.b
            r0.b r1 = r0.b.f11305a
            p0.b r2 = p0.b.f10049i
            r0.<init>(r1, r1, r2)
            q0.b.f10567j = r0
            return
    }

    public b(java.lang.Object r1, java.lang.Object r2, p0.b r3) {
            r0 = this;
            r0.<init>()
            r0.f10568g = r1
            r0.f10569h = r2
            r0.f10570i = r3
            return
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            p0.b r0 = r1.f10570i
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            p0.b r0 = r1.f10570i
            int r0 = r0.f10051h
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r3 = this;
            f.i0 r0 = new f.i0
            java.lang.Object r1 = r3.f10568g
            p0.b r2 = r3.f10570i
            r0.<init>(r1, r2)
            return r0
    }
}
