package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends fb.v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0.j0[] f8472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f8474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f8476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8477h;

    public l0() {
            r2 = this;
            r2.<init>()
            r0 = 16
            m0.j0[] r1 = new m0.j0[r0]
            r2.f8472c = r1
            int[] r1 = new int[r0]
            r2.f8474e = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f8476g = r0
            return
    }

    public final void R() {
            r4 = this;
            r0 = 0
            r4.f8473d = r0
            r4.f8475f = r0
            java.lang.Object[] r1 = r4.f8476g
            r2 = 0
            int r3 = r4.f8477h
            java.util.Arrays.fill(r1, r0, r3, r2)
            r4.f8477h = r0
            return
    }

    public final void S(i0.a r9, l0.k r10, b5.i r11, m0.k0 r12) {
            r8 = this;
            int r0 = r8.f8473d
            if (r0 == 0) goto L52
            h0.s r2 = new h0.s
            r2.<init>(r8)
            java.lang.Object r0 = r2.f4982e
            m0.l0 r0 = (m0.l0) r0
        Ld:
            m0.j0[] r1 = r0.f8472c
            int r3 = r2.f4979b
            r1 = r1[r3]
            l0.b r7 = r1.b(r2)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L42
            int r9 = r2.f4979b
            int r10 = r0.f8473d
            if (r9 < r10) goto L25
            goto L52
        L25:
            m0.j0[] r11 = r0.f8472c
            r11 = r11[r9]
            int r12 = r2.f4980c
            int r1 = r11.f8468a
            int r12 = r12 + r1
            r2.f4980c = r12
            int r12 = r2.f4981d
            int r11 = r11.f8469b
            int r12 = r12 + r11
            r2.f4981d = r12
            int r9 = r9 + 1
            r2.f4979b = r9
            if (r9 >= r10) goto L52
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            goto Ld
        L42:
            r0 = move-exception
            r9 = r0
            if (r6 != 0) goto L47
            goto L51
        L47:
            ab.e r10 = new ab.e
            r11 = 10
            r10.<init>(r7, r4, r6, r11)
            ig.a.b0(r9, r10)
        L51:
            throw r9
        L52:
            r8.R()
            return
    }

    public final boolean T() {
            r1 = this;
            int r0 = r1.f8473d
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void U(m0.j0 r8) {
            r7 = this;
            int r0 = r7.f8473d
            m0.j0[] r1 = r7.f8472c
            int r2 = r1.length
            r3 = 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r0 != r2) goto L17
            if (r0 <= r3) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r0
        Lf:
            int r2 = r2 + r0
            m0.j0[] r2 = new m0.j0[r2]
            java.lang.System.arraycopy(r1, r4, r2, r4, r0)
            r7.f8472c = r2
        L17:
            int r0 = r7.f8475f
            int r1 = r8.f8468a
            int r2 = r8.f8469b
            int r0 = r0 + r1
            int[] r1 = r7.f8474e
            int r5 = r1.length
            if (r0 <= r5) goto L34
            if (r5 <= r3) goto L27
            r6 = r3
            goto L28
        L27:
            r6 = r5
        L28:
            int r6 = r6 + r5
            if (r6 >= r0) goto L2c
            goto L2d
        L2c:
            r0 = r6
        L2d:
            int[] r0 = new int[r0]
            tf.l.p0(r1, r0, r4, r4, r5)
            r7.f8474e = r0
        L34:
            int r0 = r7.f8477h
            int r0 = r0 + r2
            java.lang.Object[] r1 = r7.f8476g
            int r5 = r1.length
            if (r0 <= r5) goto L4c
            if (r5 <= r3) goto L3f
            goto L40
        L3f:
            r3 = r5
        L40:
            int r3 = r3 + r5
            if (r3 >= r0) goto L44
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.System.arraycopy(r1, r4, r0, r4, r5)
            r7.f8476g = r0
        L4c:
            m0.j0[] r0 = r7.f8472c
            int r1 = r7.f8473d
            int r3 = r1 + 1
            r7.f8473d = r3
            r0[r1] = r8
            int r0 = r7.f8475f
            int r8 = r8.f8468a
            int r0 = r0 + r8
            r7.f8475f = r0
            int r8 = r7.f8477h
            int r8 = r8 + r2
            r7.f8477h = r8
            return
    }
}
