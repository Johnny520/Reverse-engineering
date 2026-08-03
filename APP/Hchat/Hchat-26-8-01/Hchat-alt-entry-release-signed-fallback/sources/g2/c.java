package g2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f4162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s.d f4163g;

    public c(long r1, long r3, long r5, long r7, long r9, float[] r11, s.d r12) {
            r0 = this;
            r0.<init>()
            r0.f4157a = r1
            r0.f4158b = r3
            r0.f4159c = r5
            r0.f4160d = r7
            r0.f4161e = r9
            r0.f4162f = r11
            r0.f4163g = r12
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<g2.c> r2 = g2.c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            g2.c r7 = (g2.c) r7
            long r2 = r6.f4157a
            long r4 = r7.f4157a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f4158b
            long r4 = r7.f4158b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f4161e
            long r4 = r7.f4161e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f4159c
            long r4 = r7.f4159c
            boolean r2 = u2.j.b(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f4160d
            long r4 = r7.f4160d
            boolean r2 = u2.j.b(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f4162f
            float[] r3 = r6.f4162f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            s.d r2 = r6.f4163g
            s.d r7 = r7.f4163g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f4157a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f4158b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f4161e
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f4159c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f4160d
            int r0 = eh.a.f(r0, r1, r2)
            float[] r2 = r4.f4162f
            if (r2 == 0) goto L2a
            int r2 = java.util.Arrays.hashCode(r2)
            goto L2b
        L2a:
            r2 = 0
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            s.d r1 = r4.f4163g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
