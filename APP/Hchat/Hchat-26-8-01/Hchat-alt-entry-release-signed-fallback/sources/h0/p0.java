package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0.p0 f4968a = null;

    static {
            h0.p0 r0 = new h0.p0
            r0.<init>()
            h0.p0.f4968a = r0
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r8, java.util.List r9, long r10) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L10:
            if (r2 >= r1) goto L2e
            java.lang.Object r5 = r9.get(r2)
            v1.m0 r5 = (v1.m0) r5
            v1.b1 r5 = r5.Q(r10)
            int r6 = r5.f13900g
            int r3 = java.lang.Math.max(r3, r6)
            int r6 = r5.f13901h
            int r4 = java.lang.Math.max(r4, r6)
            r0.add(r5)
            int r2 = r2 + 1
            goto L10
        L2e:
            h0.o0 r9 = new h0.o0
            r10 = 0
            r9.<init>(r10, r0)
            tf.u r10 = tf.u.f13168g
            v1.o0 r8 = r8.z(r3, r4, r10, r9)
            return r8
    }
}
