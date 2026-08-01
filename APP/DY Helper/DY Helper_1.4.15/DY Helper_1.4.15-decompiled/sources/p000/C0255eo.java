package p000;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0255eo extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3614;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.e80 f3615;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.gr0 f3616;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f3617;

    public C0255eo(androidx.compose.p001ui.platform.AndroidComposeView r1, p000.C0381i2 r2, p000.e80 r3, int r4) {
            r0 = this;
            r4 = 0
            r0.f3614 = r4
            r0.f3616 = r1
            r0.f3617 = r2
            r0.f3615 = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    public C0255eo(p000.hd2 r2, p000.C0693pn r3, p000.e80 r4) {
            r1 = this;
            r0 = 1
            r1.f3614 = r0
            r1.f3616 = r2
            r1.f3617 = r3
            r1.f3615 = r4
            r2 = 2
            r1.<init>(r2)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f3614
            switch(r0) {
                case 0: goto L6b;
                default: goto L5;
            }
        L5:
            v80 r7 = (p000.v80) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            gr0 r0 = r6.f3616
            hd2 r0 = (p000.hd2) r0
            r1 = r8 & 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = r4
        L1b:
            r8 = r8 & r3
            boolean r8 = r7.m6075(r8, r1)
            if (r8 == 0) goto L65
            androidx.compose.ui.platform.AndroidComposeView r8 = r0.f4698
            boolean r1 = r7.m6092(r0)
            java.lang.Object r2 = r7.m6073()
            r3 = 0
            i2 r5 = p000.C0730qn.f9051
            if (r1 != 0) goto L33
            if (r2 != r5) goto L3c
        L33:
            gd2 r2 = new gd2
            r1 = 0
            r2.<init>(r0, r3, r1)
            r7.m6115(r2)
        L3c:
            e80 r2 = (p000.e80) r2
            p000.AbstractC0978xb.m6580(r2, r7, r8)
            boolean r1 = r7.m6092(r0)
            java.lang.Object r2 = r7.m6073()
            if (r1 != 0) goto L4d
            if (r2 != r5) goto L56
        L4d:
            gd2 r2 = new gd2
            r1 = 1
            r2.<init>(r0, r3, r1)
            r7.m6115(r2)
        L56:
            e80 r2 = (p000.e80) r2
            p000.AbstractC0978xb.m6580(r2, r7, r8)
            java.lang.Object r0 = r6.f3617
            pn r0 = (p000.C0693pn) r0
            e80 r6 = r6.f3615
            r0.m4552(r8, r6, r7, r4)
            goto L68
        L65:
            r7.m6078()
        L68:
            s62 r6 = p000.s62.f9751
            return r6
        L6b:
            v80 r7 = (p000.v80) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            gr0 r8 = r6.f3616
            androidx.compose.ui.platform.AndroidComposeView r8 = (androidx.compose.p001ui.platform.AndroidComposeView) r8
            java.lang.Object r0 = r6.f3617
            i2 r0 = (p000.C0381i2) r0
            r1 = 1
            int r1 = p000.v81.m6136(r1)
            e80 r6 = r6.f3615
            p000.AbstractC0292fo.m2154(r8, r0, r6, r7, r1)
            s62 r6 = p000.s62.f9751
            return r6
    }
}
