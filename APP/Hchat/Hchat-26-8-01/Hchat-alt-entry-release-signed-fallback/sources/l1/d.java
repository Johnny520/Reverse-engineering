package l1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7751e;

    public d(float r9, float r10, long r11) {
            r8 = this;
            r0 = 0
            float r3 = (float) r0
            r0 = 16
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto La
        L8:
            r4 = r11
            goto Ld
        La:
            long r11 = f1.w.f3126b
            goto L8
        Ld:
            r7 = 3
            r1 = r8
            r2 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r6, r7)
            return
    }

    public d(float r1, float r2, long r3, float r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f7747a = r1
            r0.f7748b = r2
            r0.f7749c = r6
            r0.f7750d = r3
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r9.e0.q(r5, r1, r2)
            r0.f7751e = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L39
        L3:
            boolean r0 = r5 instanceof l1.d
            if (r0 != 0) goto L8
            goto L3b
        L8:
            l1.d r5 = (l1.d) r5
            float r0 = r5.f7747a
            float r1 = r4.f7747a
            boolean r0 = u2.f.b(r1, r0)
            if (r0 != 0) goto L15
            goto L3b
        L15:
            float r0 = r4.f7748b
            float r1 = r5.f7748b
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L20
            goto L3b
        L20:
            float r0 = r4.f7751e
            float r1 = r5.f7751e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            int r0 = r4.f7749c
            int r1 = r5.f7749c
            if (r0 != r1) goto L3b
            long r0 = r4.f7750d
            long r2 = r5.f7750d
            boolean r5 = f1.w.c(r0, r2)
            if (r5 != 0) goto L39
            goto L3b
        L39:
            r5 = 1
            return r5
        L3b:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.f7747a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.f7748b
            int r0 = eh.a.d(r2, r0, r1)
            r2 = 0
            int r0 = eh.a.f(r0, r1, r2)
            float r2 = r4.f7751e
            int r0 = eh.a.d(r2, r0, r1)
            int r2 = r4.f7749c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = f1.w.f3132h
            long r2 = r4.f7750d
            int r0 = eh.a.f(r0, r1, r2)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Shadow(radius="
            r0.<init>(r1)
            float r1 = r3.f7747a
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", spread="
            r0.append(r1)
            float r1 = r3.f7748b
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            r1 = 0
            java.lang.String r1 = u2.g.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r3.f7751e
            r0.append(r1)
            java.lang.String r1 = ", blendMode="
            r0.append(r1)
            int r1 = r3.f7749c
            java.lang.String r1 = f1.c0.A(r1)
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            long r1 = r3.f7750d
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", brush=null)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
