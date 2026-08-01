package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l40 extends p000.y12 implements p000.f80 {

    /* JADX INFO: renamed from: ι */
    public int f6412;

    /* JADX INFO: renamed from: κ */
    public /* synthetic */ p000.g40 f6413;

    /* JADX INFO: renamed from: λ */
    public /* synthetic */ java.lang.Object f6414;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.y12 f6415;

    public l40(p000.e80 r1, p000.InterfaceC0631op r2) {
            r0 = this;
            y12 r1 = (p000.y12) r1
            r0.f6415 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo10(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            g40 r2 = (p000.g40) r2
            op r4 = (p000.InterfaceC0631op) r4
            l40 r0 = new l40
            y12 r1 = r1.f6415
            r0.<init>(r1, r4)
            r0.f6413 = r2
            r0.f6414 = r3
            s62 r1 = p000.s62.f9751
            java.lang.Object r1 = r0.mo11(r1)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f6412
            r1 = 2
            r2 = 1
            cq r3 = p000.EnumC0184cq.f2716
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p000.i81.m2649(r5)
            goto L3d
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
        L17:
            g40 r0 = r4.f6413
            p000.i81.m2649(r5)
            goto L31
        L1d:
            p000.i81.m2649(r5)
            g40 r0 = r4.f6413
            java.lang.Object r5 = r4.f6414
            r4.f6413 = r0
            r4.f6412 = r2
            y12 r2 = r4.f6415
            java.lang.Object r5 = r2.invoke(r5, r4)
            if (r5 != r3) goto L31
            goto L3c
        L31:
            r2 = 0
            r4.f6413 = r2
            r4.f6412 = r1
            java.lang.Object r4 = r0.mo1985(r5, r4)
            if (r4 != r3) goto L3d
        L3c:
            return r3
        L3d:
            s62 r4 = p000.s62.f9751
            return r4
    }
}
