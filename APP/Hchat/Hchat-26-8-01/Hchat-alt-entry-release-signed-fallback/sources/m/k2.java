package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements m.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8249c;

    public /* synthetic */ k2(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f8247a = r2
            r0.f8248b = r1
            r0.f8249c = r3
            r0.<init>()
            return
    }

    public static int b(m.k2 r5, int r6) {
            java.lang.Object r0 = r5.f8249c
            r.z r0 = (r.z) r0
            r.p r1 = r0.j()
            java.lang.Object r2 = r1.f11229k
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L12
            goto L3e
        L12:
            int r2 = r0.h()
            int r5 = r5.c()
            if (r6 > r5) goto L3f
            if (r2 > r6) goto L3f
            java.lang.Object r5 = r1.f11229k
            int r0 = r5.size()
            r1 = r3
        L25:
            if (r1 >= r0) goto L36
            java.lang.Object r2 = r5.get(r1)
            r4 = r2
            r.q r4 = (r.q) r4
            int r4 = r4.f11236a
            if (r4 != r6) goto L33
            goto L37
        L33:
            int r1 = r1 + 1
            goto L25
        L36:
            r2 = 0
        L37:
            r.q r2 = (r.q) r2
            if (r2 == 0) goto L3e
            int r5 = r2.f11250o
            return r5
        L3e:
            return r3
        L3f:
            int r5 = ac.p.P(r1)
            int r1 = r0.h()
            int r6 = r6 - r1
            int r6 = r6 * r5
            int r5 = r0.i()
            int r6 = r6 - r5
            return r6
    }

    @Override // m.u1
    public final float a(float r5) {
            r4 = this;
            int r0 = r4.f8247a
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f8248b
            m.u1 r0 = (m.u1) r0
            float r5 = r0.a(r5)
            return r5
        Le:
            java.lang.Object r0 = r4.f8248b
            m.o2 r0 = (m.o2) r0
            float r1 = java.lang.Math.abs(r5)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L1c
            goto L2a
        L1c:
            m.c2 r1 = r0.f8312h
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L44
        L2a:
            java.lang.Object r1 = r4.f8249c
            m.m2 r1 = (m.m2) r1
            long r2 = r0.h(r5)
            long r2 = r0.e(r2)
            r5 = 2
            long r1 = r1.a(r5, r2)
            float r5 = r0.g(r1)
            float r5 = r0.d(r5)
            return r5
        L44:
            k.e1 r5 = new k.e1
            java.lang.String r0 = "The fling animation was cancelled"
            r1 = 0
            r5.<init>(r0, r1)
            throw r5
    }

    public int c() {
            r1 = this;
            java.lang.Object r0 = r1.f8249c
            r.z r0 = (r.z) r0
            r.p r0 = r0.j()
            java.lang.Object r0 = r0.f11229k
            java.lang.Object r0 = tf.m.C1(r0)
            r.q r0 = (r.q) r0
            if (r0 == 0) goto L15
            int r0 = r0.f11236a
            return r0
        L15:
            r0 = 0
            return r0
    }
}
