package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f8560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l3.w f8561l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f8562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m1.g0 f8567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8571j;

    static {
            l3.w r0 = new l3.w
            r1 = 2
            r0.<init>(r1)
            m1.f.f8561l = r0
            return
    }

    public f(java.lang.String r4, float r5, float r6, float r7, float r8, m1.g0 r9, long r10, int r12, boolean r13) {
            r3 = this;
            l3.w r0 = m1.f.f8561l
            monitor-enter(r0)
            int r1 = m1.f.f8560k     // Catch: java.lang.Throwable -> L22
            int r2 = r1 + 1
            m1.f.f8560k = r2     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            r3.<init>()
            r3.f8562a = r4
            r3.f8563b = r5
            r3.f8564c = r6
            r3.f8565d = r7
            r3.f8566e = r8
            r3.f8567f = r9
            r3.f8568g = r10
            r3.f8569h = r12
            r3.f8570i = r13
            r3.f8571j = r1
            return
        L22:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L5e
        L3:
            boolean r0 = r5 instanceof m1.f
            if (r0 != 0) goto L8
            goto L60
        L8:
            m1.f r5 = (m1.f) r5
            java.lang.String r0 = r5.f8562a
            java.lang.String r1 = r4.f8562a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L60
        L15:
            float r0 = r4.f8563b
            float r1 = r5.f8563b
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L20
            goto L60
        L20:
            float r0 = r4.f8564c
            float r1 = r5.f8564c
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L2b
            goto L60
        L2b:
            float r0 = r4.f8565d
            float r1 = r5.f8565d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L60
            float r0 = r4.f8566e
            float r1 = r5.f8566e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L60
            m1.g0 r0 = r4.f8567f
            m1.g0 r1 = r5.f8567f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L60
        L46:
            long r0 = r4.f8568g
            long r2 = r5.f8568g
            boolean r0 = f1.w.c(r0, r2)
            if (r0 != 0) goto L51
            goto L60
        L51:
            int r0 = r4.f8569h
            int r1 = r5.f8569h
            if (r0 != r1) goto L60
            boolean r0 = r4.f8570i
            boolean r5 = r5.f8570i
            if (r0 == r5) goto L5e
            goto L60
        L5e:
            r5 = 1
            return r5
        L60:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f8562a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r5.f8563b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r5.f8564c
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r5.f8565d
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r5.f8566e
            int r0 = eh.a.d(r2, r0, r1)
            m1.g0 r2 = r5.f8567f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = f1.w.f3132h
            long r3 = r5.f8568g
            int r0 = eh.a.f(r2, r1, r3)
            int r2 = r5.f8569h
            int r0 = eh.a.e(r2, r0, r1)
            boolean r1 = r5.f8570i
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
