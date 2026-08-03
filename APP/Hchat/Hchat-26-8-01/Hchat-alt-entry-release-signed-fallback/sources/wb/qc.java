package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18615i;

    public /* synthetic */ qc(i0.a1 r1, java.util.List r2, int r3) {
            r0 = this;
            r0.f18613g = r3
            r0.f18614h = r1
            r0.f18615i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ qc(java.util.List r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f18613g = r3
            r0.f18615i = r1
            r0.f18614h = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.f18613g
            r.d r4 = (r.d) r4
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            switch(r0) {
                case 0: goto Lf5;
                case 1: goto Lc8;
                case 2: goto L9b;
                case 3: goto L6e;
                case 4: goto L41;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L1b
            r4 = r1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L3b
            wb.ve r4 = new wb.ve
            r6 = 4
            i0.a1 r0 = r3.f18614h
            java.util.List r2 = r3.f18615i
            r4.<init>(r0, r2, r6)
            r6 = -399441659(0xffffffffe8310105, float:-3.3435107E24)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L3e
        L3b:
            r5.V()
        L3e:
            sf.n r4 = sf.n.f12433a
            return r4
        L41:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L48
            r4 = r1
            goto L49
        L48:
            r4 = 0
        L49:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L68
            wb.ve r4 = new wb.ve
            r6 = 0
            java.util.List r0 = r3.f18615i
            i0.a1 r2 = r3.f18614h
            r4.<init>(r0, r2, r6)
            r6 = -1489895996(0xffffffffa731fdc4, float:-2.470125E-15)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L6b
        L68:
            r5.V()
        L6b:
            sf.n r4 = sf.n.f12433a
            return r4
        L6e:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L75
            r4 = r1
            goto L76
        L75:
            r4 = 0
        L76:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L95
            wb.ve r4 = new wb.ve
            r6 = 2
            java.util.List r0 = r3.f18615i
            i0.a1 r2 = r3.f18614h
            r4.<init>(r0, r2, r6)
            r6 = 1057281497(0x3f04d5d9, float:0.51888806)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L98
        L95:
            r5.V()
        L98:
            sf.n r4 = sf.n.f12433a
            return r4
        L9b:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto La2
            r4 = r1
            goto La3
        La2:
            r4 = 0
        La3:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto Lc2
            wb.ve r4 = new wb.ve
            r6 = 5
            java.util.List r0 = r3.f18615i
            i0.a1 r2 = r3.f18614h
            r4.<init>(r0, r2, r6)
            r6 = -1962673116(0xffffffff8b03fc24, float:-2.5419372E-32)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto Lc5
        Lc2:
            r5.V()
        Lc5:
            sf.n r4 = sf.n.f12433a
            return r4
        Lc8:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto Lcf
            r4 = r1
            goto Ld0
        Lcf:
            r4 = 0
        Ld0:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto Lef
            wb.ve r4 = new wb.ve
            r6 = 1
            i0.a1 r0 = r3.f18614h
            java.util.List r2 = r3.f18615i
            r4.<init>(r0, r2, r6)
            r6 = -1325955814(0xffffffffb0f7851a, float:-1.8009445E-9)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto Lf2
        Lef:
            r5.V()
        Lf2:
            sf.n r4 = sf.n.f12433a
            return r4
        Lf5:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto Lfc
            r4 = r1
            goto Lfd
        Lfc:
            r4 = 0
        Lfd:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L11c
            wb.ve r4 = new wb.ve
            r6 = 3
            java.util.List r0 = r3.f18615i
            i0.a1 r2 = r3.f18614h
            r4.<init>(r0, r2, r6)
            r6 = -606320327(0xffffffffdbdc4939, float:-1.2401001E17)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L11f
        L11c:
            r5.V()
        L11f:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
