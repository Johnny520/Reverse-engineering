package p000;

/* JADX INFO: renamed from: ｑ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1147 extends p000.qz0 {

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ int f13508;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ androidx.appcompat.widget.C0030 f13509;

    public C1147(androidx.appcompat.widget.C0030 r9, android.content.Context r10, p000.b12 r11, android.view.View r12) {
            r8 = this;
            r0 = 0
            r8.f13508 = r0
            r8.f13509 = r9
            r6 = 2130968608(0x7f040020, float:1.7545874E38)
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            lz0 r8 = r3.f1420
            int r8 = r8.f6876
            r10 = 32
            r8 = r8 & r10
            if (r8 != r10) goto L1b
            goto L25
        L1b:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r8 = r9.f798
            if (r8 != 0) goto L23
            wz0 r8 = r9.f797
            android.view.View r8 = (android.view.View) r8
        L23:
            r1.f9167 = r8
        L25:
            n r8 = r9.f789
            r1.f9170 = r8
            oz0 r9 = r1.f9171
            if (r9 == 0) goto L30
            r9.mo324(r8)
        L30:
            return
    }

    public C1147(androidx.appcompat.widget.C0030 r9, android.content.Context r10, p000.iz0 r11, android.view.View r12) {
            r8 = this;
            r0 = 1
            r8.f13508 = r0
            r8.f13509 = r9
            r6 = 2130968608(0x7f040020, float:1.7545874E38)
            r7 = 0
            r5 = 1
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 8388613(0x800005, float:1.175495E-38)
            r1.f9168 = r8
            n r8 = r9.f789
            r1.f9170 = r8
            oz0 r9 = r1.f9171
            if (r9 == 0) goto L21
            r9.mo324(r8)
        L21:
            return
    }

    @Override // p000.qz0
    /* JADX INFO: renamed from: γ */
    public final void mo5040() {
            r3 = this;
            int r0 = r3.f13508
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.γ r0 = r3.f13509
            iz0 r1 = r0.f792
            if (r1 == 0) goto Lf
            r2 = 1
            r1.m2831(r2)
        Lf:
            r1 = 0
            r0.f808 = r1
            super.mo5040()
            return
        L16:
            androidx.appcompat.widget.γ r0 = r3.f13509
            r1 = 0
            r0.f809 = r1
            super.mo5040()
            return
    }
}
