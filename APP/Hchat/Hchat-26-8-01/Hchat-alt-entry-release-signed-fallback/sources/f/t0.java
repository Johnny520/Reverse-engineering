package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ int[] f2904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object[] f2905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f2906i;

    public t0() {
            r4 = this;
            r4.<init>()
            r0 = 4
            r1 = r0
        L5:
            r2 = 32
            r3 = 40
            if (r1 >= r2) goto L16
            r2 = 1
            int r2 = r2 << r1
            int r2 = r2 + (-12)
            if (r3 > r2) goto L13
            r3 = r2
            goto L16
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            int r3 = r3 / r0
            int[] r0 = new int[r3]
            r4.f2904g = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r4.f2905h = r0
            return
    }

    public final f.t0 a() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            r0.getClass()
            f.t0 r0 = (f.t0) r0
            int[] r1 = r2.f2904g
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.f2904g = r1
            java.lang.Object[] r1 = r2.f2905h
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.f2905h = r1
            return r0
    }

    public final java.lang.Object b(int r3) {
            r2 = this;
            int[] r0 = r2.f2904g
            int r1 = r2.f2906i
            int r3 = g.a.a(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r0 = r2.f2905h
            r3 = r0[r3]
            java.lang.Object r0 = f.q.f2886c
            if (r3 != r0) goto L13
            goto L14
        L13:
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final void c(int r7, java.lang.Object r8) {
            r6 = this;
            int[] r0 = r6.f2904g
            int r1 = r6.f2906i
            int r0 = g.a.a(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r7 = r6.f2905h
            r7[r0] = r8
            return
        Lf:
            int r0 = ~r0
            int r1 = r6.f2906i
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.f2905h
            r3 = r2[r0]
            java.lang.Object r4 = f.q.f2886c
            if (r3 != r4) goto L23
            int[] r1 = r6.f2904g
            r1[r0] = r7
            r2[r0] = r8
            return
        L23:
            int[] r2 = r6.f2904g
            int r2 = r2.length
            r3 = 1
            if (r1 < r2) goto L4d
            int r1 = r1 + r3
            r2 = 4
            int r1 = r1 * r2
            r4 = r2
        L2d:
            r5 = 32
            if (r4 >= r5) goto L3c
            int r5 = r3 << r4
            int r5 = r5 + (-12)
            if (r1 > r5) goto L39
            r1 = r5
            goto L3c
        L39:
            int r4 = r4 + 1
            goto L2d
        L3c:
            int r1 = r1 / r2
            int[] r2 = r6.f2904g
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r6.f2904g = r2
            java.lang.Object[] r2 = r6.f2905h
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r6.f2905h = r1
        L4d:
            int r1 = r6.f2906i
            int r2 = r1 - r0
            if (r2 == 0) goto L61
            int[] r2 = r6.f2904g
            int r4 = r0 + 1
            tf.l.p0(r2, r2, r4, r0, r1)
            java.lang.Object[] r1 = r6.f2905h
            int r2 = r6.f2906i
            tf.l.n0(r4, r0, r1, r2, r1)
        L61:
            int[] r1 = r6.f2904g
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f2905h
            r7[r0] = r8
            int r7 = r6.f2906i
            int r7 = r7 + r3
            r6.f2906i = r7
            return
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            f.t0 r0 = r1.a()
            return r0
    }

    public final java.lang.Object d(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f2905h
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            return r3
        L8:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f2906i
            if (r0 > 0) goto L7
            java.lang.String r0 = "{}"
            return r0
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 28
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.f2906i
            r2 = 0
        L16:
            if (r2 >= r0) goto L3d
            if (r2 <= 0) goto L1f
            java.lang.String r3 = ", "
            r1.append(r3)
        L1f:
            int[] r3 = r4.f2904g
            r3 = r3[r2]
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r4.d(r2)
            if (r3 == r4) goto L35
            r1.append(r3)
            goto L3a
        L35:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3a:
            int r2 = r2 + 1
            goto L16
        L3d:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
