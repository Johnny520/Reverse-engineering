package p000;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0452k0 extends p000.AbstractC0974x7 implements p000.t40 {

    /* JADX INFO: renamed from: ε */
    public final p000.y21 f5681;

    /* JADX INFO: renamed from: ζ */
    public final p000.es1 f5682;

    /* JADX INFO: renamed from: η */
    public final androidx.compose.p001ui.platform.AndroidComposeView f5683;

    /* JADX INFO: renamed from: θ */
    public final p000.ol1 f5684;

    /* JADX INFO: renamed from: ι */
    public final java.lang.String f5685;

    /* JADX INFO: renamed from: κ */
    public final android.view.autofill.AutofillId f5686;

    /* JADX INFO: renamed from: λ */
    public final p000.o11 f5687;

    /* JADX INFO: renamed from: μ */
    public boolean f5688;

    public C0452k0(p000.y21 r1, p000.es1 r2, androidx.compose.p001ui.platform.AndroidComposeView r3, p000.ol1 r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f5681 = r1
            r0.f5682 = r2
            r0.f5683 = r3
            r0.f5684 = r4
            r0.f5685 = r5
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r1 = 1
            r3.setImportantForAutofill(r1)
            android.view.autofill.AutofillId r1 = r3.getAutofillId()
            if (r1 == 0) goto L26
            r0.f5686 = r1
            o11 r1 = new o11
            r1.<init>()
            r0.f5687 = r1
            return
        L26:
            java.lang.String r0 = "Required value was null."
            pm r0 = p000.lz1.m3680(r0)
            throw r0
    }

    @Override // p000.t40
    /* JADX INFO: renamed from: α */
    public final void mo384(p000.c50 r3, p000.c50 r4) {
            r2 = this;
            if (r3 == 0) goto L2d
            yp0 r3 = p000.h62.m2445(r3)
            if (r3 == 0) goto L2d
            xr1 r0 = r3.m7007()
            if (r0 == 0) goto L2d
            b21 r0 = r0.f12268
            is1 r1 = p000.wr1.f11817
            boolean r1 = r0.m690(r1)
            if (r1 != 0) goto L20
            is1 r1 = p000.wr1.f11818
            boolean r0 = r0.m690(r1)
            if (r0 == 0) goto L2d
        L20:
            int r3 = r3.f12744
            y21 r0 = r2.f5681
            java.lang.Object r0 = r0.f12428
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            androidx.compose.ui.platform.AndroidComposeView r1 = r2.f5683
            r0.notifyViewExited(r1, r3)
        L2d:
            if (r4 == 0) goto L5d
            yp0 r3 = p000.h62.m2445(r4)
            if (r3 == 0) goto L5d
            xr1 r4 = r3.m7007()
            if (r4 == 0) goto L5d
            b21 r4 = r4.f12268
            is1 r0 = p000.wr1.f11817
            boolean r0 = r4.m690(r0)
            if (r0 != 0) goto L4f
            is1 r0 = p000.wr1.f11818
            boolean r4 = r4.m690(r0)
            if (r4 == 0) goto L4e
            goto L4f
        L4e:
            return
        L4f:
            int r3 = r3.f12744
            ol1 r4 = r2.f5684
            n2 r4 = r4.f8138
            j0 r0 = new j0
            r0.<init>(r2, r3)
            r4.m3948(r3, r0)
        L5d:
            return
    }
}
