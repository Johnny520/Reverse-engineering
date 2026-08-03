package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends x1.j implements x1.z1 {
    public b5.k A;
    public h0.d1 B;
    public n2.j C;
    public d1.v D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n2.z f2960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n2.s f2961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w.q0 f2962y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2963z;

    public static void n1(w.q0 r5, java.lang.String r6, boolean r7) {
            if (r7 != 0) goto L3
            return
        L3:
            n2.y r7 = r5.f14604e
            w.w r0 = r5.f14621v
            if (r7 == 0) goto L2e
            n2.d r1 = new n2.d
            r1.<init>()
            n2.a r2 = new n2.a
            r3 = 1
            r2.<init>(r6, r3)
            r6 = 2
            n2.g[] r6 = new n2.g[r6]
            r4 = 0
            r6[r4] = r1
            r6[r3] = r2
            java.util.List r6 = a.a.y0(r6)
            b.e r5 = r5.f14603d
            n2.s r5 = r5.l(r6)
            r6 = 0
            r7.a(r6, r5)
            r0.invoke(r5)
            return
        L2e:
            n2.s r5 = new n2.s
            int r7 = r6.length()
            long r1 = i2.e0.b(r7, r7)
            r7 = 4
            r5.<init>(r7, r6, r1)
            r0.invoke(r5)
            return
    }

    @Override // x1.z1
    public final boolean S0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r10) {
            r9 = this;
            n2.s r0 = r9.f2961x
            i2.g r0 = r0.f8976a
            mg.d[] r1 = f2.w.f3251a
            f2.x r1 = f2.u.E
            mg.d[] r2 = f2.w.f3251a
            r3 = 18
            r3 = r2[r3]
            r10.a(r1, r0)
            n2.z r0 = r9.f2960w
            i2.g r0 = r0.f9005a
            f2.x r1 = f2.u.F
            r3 = 19
            r3 = r2[r3]
            r10.a(r1, r0)
            n2.s r0 = r9.f2961x
            long r0 = r0.f8977b
            f2.x r3 = f2.u.G
            r4 = 20
            r4 = r2[r4]
            i2.m0 r4 = new i2.m0
            r4.<init>(r0)
            r10.a(r3, r4)
            f2.x r0 = f2.u.f3240r
            r1 = 9
            r1 = r2[r1]
            z0.d r1 = z0.k.f22492a
            r10.a(r0, r1)
            n2.s r0 = r9.f2961x
            i2.g r0 = r0.f8976a
            z0.f r1 = new z0.f
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forText(r0)
            r1.<init>(r0)
            f2.x r0 = f2.u.f3241s
            r3 = 10
            r3 = r2[r3]
            r10.a(r0, r1)
            f0.g r0 = new f0.g
            r1 = 0
            r0.<init>(r9, r1)
            f2.w.b(r10, r0)
            n2.j r0 = r9.C
            int r0 = r0.f8956d
            r3 = 7
            r4 = 8
            r5 = 6
            if (r0 != r5) goto L73
            z0.l r0 = z0.m.f22498a
            r0.getClass()
            z0.e r0 = z0.l.f22496c
            f2.x r6 = f2.u.f3239q
            r4 = r2[r4]
            r10.a(r6, r0)
            goto L98
        L73:
            if (r0 != r3) goto L76
            goto L78
        L76:
            if (r0 != r4) goto L87
        L78:
            z0.l r0 = z0.m.f22498a
            r0.getClass()
            z0.e r0 = z0.l.f22495b
            f2.x r6 = f2.u.f3239q
            r4 = r2[r4]
            r10.a(r6, r0)
            goto L98
        L87:
            r6 = 4
            if (r0 != r6) goto L98
            z0.l r0 = z0.m.f22498a
            r0.getClass()
            z0.e r0 = z0.l.f22497d
            f2.x r6 = f2.u.f3239q
            r4 = r2[r4]
            r10.a(r6, r0)
        L98:
            boolean r0 = r9.f2963z
            if (r0 != 0) goto La3
            f2.x r0 = f2.u.f3232j
            sf.n r4 = sf.n.f12433a
            r10.a(r0, r4)
        La3:
            boolean r0 = r9.f2963z
            f2.x r4 = f2.u.N
            r6 = 28
            r2 = r2[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r10.a(r4, r2)
            f0.g r2 = new f0.g
            r4 = 1
            r2.<init>(r9, r4)
            f2.w.a(r10, r2)
            r2 = 2
            r6 = 0
            if (r0 == 0) goto Ldd
            f0.g r0 = new f0.g
            r0.<init>(r9, r2)
            f2.x r7 = f2.l.f3188k
            f2.a r8 = new f2.a
            r8.<init>(r6, r0)
            r10.a(r7, r8)
            f0.g r0 = new f0.g
            r0.<init>(r9, r10)
            f2.x r7 = f2.l.f3192o
            f2.a r8 = new f2.a
            r8.<init>(r6, r0)
            r10.a(r7, r8)
        Ldd:
            f0.h r0 = new f0.h
            r0.<init>(r9, r1)
            f2.x r1 = f2.l.f3187j
            f2.a r7 = new f2.a
            r7.<init>(r6, r0)
            r10.a(r1, r7)
            n2.j r0 = r9.C
            int r0 = r0.f8957e
            f0.f r1 = new f0.f
            r1.<init>(r9, r5)
            f2.x r5 = f2.u.H
            n2.i r7 = new n2.i
            r7.<init>(r0)
            r10.a(r5, r7)
            f2.x r0 = f2.l.f3193p
            f2.a r5 = new f2.a
            r5.<init>(r6, r1)
            r10.a(r0, r5)
            f0.f r0 = new f0.f
            r0.<init>(r9, r3)
            f2.x r1 = f2.l.f3179b
            f2.a r3 = new f2.a
            r3.<init>(r6, r0)
            r10.a(r1, r3)
            f0.f r0 = new f0.f
            r0.<init>(r9, r4)
            f2.x r1 = f2.l.f3180c
            f2.a r3 = new f2.a
            r3.<init>(r6, r0)
            r10.a(r1, r3)
            n2.s r0 = r9.f2961x
            long r0 = r0.f8977b
            boolean r0 = i2.m0.c(r0)
            if (r0 != 0) goto L154
            f0.f r0 = new f0.f
            r0.<init>(r9, r2)
            f2.x r1 = f2.l.f3194q
            f2.a r2 = new f2.a
            r2.<init>(r6, r0)
            r10.a(r1, r2)
            boolean r0 = r9.f2963z
            if (r0 == 0) goto L154
            f0.f r0 = new f0.f
            r1 = 3
            r0.<init>(r9, r1)
            f2.x r1 = f2.l.f3195r
            f2.a r2 = new f2.a
            r2.<init>(r6, r0)
            r10.a(r1, r2)
        L154:
            boolean r0 = r9.f2963z
            if (r0 == 0) goto L168
            f0.f r0 = new f0.f
            r1 = 5
            r0.<init>(r9, r1)
            f2.x r1 = f2.l.f3196s
            f2.a r2 = new f2.a
            r2.<init>(r6, r0)
            r10.a(r1, r2)
        L168:
            return
    }
}
