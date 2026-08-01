package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a02 extends p000.y12 implements p000.f80 {

    /* JADX INFO: renamed from: ι */
    public int f11;

    /* JADX INFO: renamed from: κ */
    public /* synthetic */ p000.g40 f12;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ int f13;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.b02 f14;

    public a02(p000.b02 r1, p000.InterfaceC0631op r2) {
            r0 = this;
            r0.f14 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo10(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            g40 r2 = (p000.g40) r2
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            op r4 = (p000.InterfaceC0631op) r4
            a02 r0 = new a02
            b02 r1 = r1.f14
            r0.<init>(r1, r4)
            r0.f12 = r2
            r0.f13 = r3
            s62 r1 = p000.s62.f9751
            java.lang.Object r1 = r0.mo11(r1)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f11
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            cq r6 = p000.EnumC0184cq.f2716
            if (r0 == 0) goto L33
            if (r0 == r5) goto L2f
            if (r0 == r4) goto L29
            if (r0 == r3) goto L23
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L16
            goto L2f
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
        L1d:
            g40 r0 = r7.f12
            p000.i81.m2649(r8)
            goto L71
        L23:
            g40 r0 = r7.f12
            p000.i81.m2649(r8)
            goto L61
        L29:
            g40 r0 = r7.f12
            p000.i81.m2649(r8)
            goto L54
        L2f:
            p000.i81.m2649(r8)
            goto L7f
        L33:
            p000.i81.m2649(r8)
            g40 r0 = r7.f12
            int r8 = r7.f13
            if (r8 <= 0) goto L47
            r7.f11 = r5
            bw1 r8 = p000.bw1.f1875
            java.lang.Object r7 = r0.mo1985(r8, r7)
            if (r7 != r6) goto L7f
            goto L7e
        L47:
            r7.f12 = r0
            r7.f11 = r4
            r4 = 0
            java.lang.Object r8 = p000.jx0.m3053(r4, r7)
            if (r8 != r6) goto L54
            goto L7e
        L54:
            r7.f12 = r0
            r7.f11 = r3
            bw1 r8 = p000.bw1.f1876
            java.lang.Object r8 = r0.mo1985(r8, r7)
            if (r8 != r6) goto L61
            goto L7e
        L61:
            r7.f12 = r0
            r7.f11 = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = p000.jx0.m3053(r2, r7)
            if (r8 != r6) goto L71
            goto L7e
        L71:
            r8 = 0
            r7.f12 = r8
            r7.f11 = r1
            bw1 r8 = p000.bw1.f1877
            java.lang.Object r7 = r0.mo1985(r8, r7)
            if (r7 != r6) goto L7f
        L7e:
            return r6
        L7f:
            s62 r7 = p000.s62.f9751
            return r7
    }
}
