package p000;

/* JADX INFO: renamed from: tv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class C0849tv extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final p000.ep0 f10465;

    /* JADX INFO: renamed from: β */
    public final p000.p70 f10466;

    /* JADX INFO: renamed from: γ */
    public final p000.a80 f10467;

    /* JADX INFO: renamed from: δ */
    public final p000.a80 f10468;

    /* JADX INFO: renamed from: ε */
    public final p000.a80 f10469;

    /* JADX INFO: renamed from: ζ */
    public final p000.e80 f10470;

    /* JADX INFO: renamed from: η */
    public final p000.a80 f10471;

    /* JADX INFO: renamed from: θ */
    public final boolean f10472;

    public C0849tv(p000.ep0 r1, p000.p70 r2, p000.a80 r3, p000.a80 r4, p000.a80 r5, p000.e80 r6, p000.a80 r7, boolean r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f10465 = r1
            r0.f10466 = r2
            r0.f10467 = r3
            r0.f10468 = r4
            r0.f10469 = r5
            r0.f10470 = r6
            r0.f10471 = r7
            r0.f10472 = r8
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5f
        L3:
            boolean r0 = r3 instanceof p000.C0849tv
            if (r0 != 0) goto L8
            goto L5d
        L8:
            tv r3 = (p000.C0849tv) r3
            ep0 r0 = r3.f10465
            ep0 r1 = r2.f10465
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 != 0) goto L15
            goto L5d
        L15:
            p70 r0 = r2.f10466
            p70 r1 = r3.f10466
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L5d
        L20:
            a80 r0 = r2.f10467
            a80 r1 = r3.f10467
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L5d
        L2b:
            a80 r0 = r2.f10468
            a80 r1 = r3.f10468
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L5d
        L36:
            a80 r0 = r2.f10469
            a80 r1 = r3.f10469
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L5d
        L41:
            e80 r0 = r2.f10470
            e80 r1 = r3.f10470
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L5d
        L4c:
            a80 r0 = r2.f10471
            a80 r1 = r3.f10471
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L57
            goto L5d
        L57:
            boolean r2 = r2.f10472
            boolean r3 = r3.f10472
            if (r2 == r3) goto L5f
        L5d:
            r2 = 0
            return r2
        L5f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            ep0 r0 = r4.f10465
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            p70 r2 = r4.f10466
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            a80 r0 = r4.f10467
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            a80 r3 = r4.f10468
            if (r3 == 0) goto L23
            int r3 = r3.hashCode()
            goto L24
        L23:
            r3 = r2
        L24:
            int r0 = r0 + r3
            int r0 = r0 * r1
            a80 r3 = r4.f10469
            if (r3 == 0) goto L2f
            int r3 = r3.hashCode()
            goto L30
        L2f:
            r3 = r2
        L30:
            int r0 = r0 + r3
            int r0 = r0 * 961
            e80 r3 = r4.f10470
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            a80 r0 = r4.f10471
            if (r0 == 0) goto L43
            int r2 = r0.hashCode()
        L43:
            int r3 = r3 + r2
            int r3 = r3 * 961
            r0 = 3
            int r0 = p000.a12.m14(r0, r3, r1)
            boolean r4 = r4.f10472
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r9 = this;
            aw r0 = new aw
            a80 r7 = r9.f10471
            boolean r8 = r9.f10472
            ep0 r1 = r9.f10465
            p70 r2 = r9.f10466
            a80 r3 = r9.f10467
            a80 r4 = r9.f10468
            a80 r5 = r9.f10469
            e80 r6 = r9.f10470
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r5) {
            r4 = this;
            aw r5 = (p000.C0055aw) r5
            r5.getClass()
            boolean r0 = r5.f1330
            boolean r1 = r4.f10472
            if (r0 == r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            ep0 r2 = r4.f10465
            r2.getClass()
            r5.f1341 = r2
            p70 r2 = r4.f10466
            r2.getClass()
            kv1 r3 = r5.f1331
            r3.getClass()
            r3.f6123 = r2
            a80 r2 = r4.f10467
            r2.getClass()
            r5.f1342 = r2
            a80 r2 = r4.f10468
            r5.f1343 = r2
            a80 r2 = r4.f10469
            r5.f1344 = r2
            e80 r2 = r4.f10470
            r5.f1345 = r2
            a80 r4 = r4.f10471
            r5.f1346 = r4
            r5.f1330 = r1
            if (r0 == 0) goto L44
            if (r1 != 0) goto L41
            r5.m610()
        L41:
            p000.AbstractC0073bd.m847(r5)
        L44:
            η r4 = new η
            r0 = 8
            r4.<init>(r0, r5)
            p000.ln0.m3642(r5, r4)
            return
    }
}
