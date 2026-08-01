package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gd2 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f4332;

    /* JADX INFO: renamed from: κ */
    public int f4333;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f4334;

    public /* synthetic */ gd2(java.lang.Object r1, p000.InterfaceC0631op r2, int r3) {
            r0 = this;
            r0.f4332 = r3
            r0.f4334 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4332
            bq r2 = (p000.InterfaceC0086bq) r2
            op r3 = (p000.InterfaceC0631op) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            op r1 = r1.mo1119(r3, r2)
            gd2 r1 = (p000.gd2) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            op r1 = r1.mo1119(r3, r2)
            gd2 r1 = (p000.gd2) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L23:
            op r1 = r1.mo1119(r3, r2)
            gd2 r1 = (p000.gd2) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.f4332
            switch(r3) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            gd2 r3 = new gd2
            java.lang.Object r1 = r1.f4334
            e22 r1 = (p000.e22) r1
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        L10:
            gd2 r3 = new gd2
            java.lang.Object r1 = r1.f4334
            hd2 r1 = (p000.hd2) r1
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L1b:
            gd2 r3 = new gd2
            java.lang.Object r1 = r1.f4334
            hd2 r1 = (p000.hd2) r1
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f4332
            switch(r0) {
                case 0: goto L62;
                case 1: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f4334
            e22 r0 = (p000.e22) r0
            int r1 = r3.f4333
            r2 = 2
            if (r1 == 0) goto L1f
            r3 = 1
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            goto L1b
        L14:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r3)
            r3 = 0
            goto L32
        L1b:
            p000.i81.m2649(r4)
            goto L30
        L1f:
            p000.i81.m2649(r4)
            androidx.compose.ui.input.pointer.PointerInputEventHandler r4 = r0.f3386
            r3.f4333 = r2
            java.lang.Object r3 = r4.invoke(r0, r3)
            cq r4 = p000.EnumC0184cq.f2716
            if (r3 != r4) goto L30
            r3 = r4
            goto L32
        L30:
            s62 r3 = p000.s62.f9751
        L32:
            return r3
        L33:
            int r0 = r3.f4333
            s62 r1 = p000.s62.f9751
            r2 = 1
            if (r0 == 0) goto L47
            if (r0 != r2) goto L40
            p000.i81.m2649(r4)
            goto L61
        L40:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r3)
            r1 = 0
            goto L61
        L47:
            p000.i81.m2649(r4)
            java.lang.Object r4 = r3.f4334
            hd2 r4 = (p000.hd2) r4
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.f4698
            r3.f4333 = r2
            z1 r4 = r4.f881
            java.lang.Object r3 = r4.m7056(r3)
            cq r4 = p000.EnumC0184cq.f2716
            if (r3 != r4) goto L5d
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != r4) goto L61
            r1 = r4
        L61:
            return r1
        L62:
            int r0 = r3.f4333
            s62 r1 = p000.s62.f9751
            r2 = 1
            if (r0 == 0) goto L76
            if (r0 != r2) goto L6f
            p000.i81.m2649(r4)
            goto L90
        L6f:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r3)
            r1 = 0
            goto L90
        L76:
            p000.i81.m2649(r4)
            java.lang.Object r4 = r3.f4334
            hd2 r4 = (p000.hd2) r4
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.f4698
            r3.f4333 = r2
            l1 r4 = r4.f880
            java.lang.Object r3 = r4.m3450(r3)
            cq r4 = p000.EnumC0184cq.f2716
            if (r3 != r4) goto L8c
            goto L8d
        L8c:
            r3 = r1
        L8d:
            if (r3 != r4) goto L90
            r1 = r4
        L90:
            return r1
    }
}
