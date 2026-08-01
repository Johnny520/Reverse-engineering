package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yu1 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.um1 f12797;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f12798;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f12799;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.um1 f12800;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.zc0 f12801;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f12802;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.qm1 f12803;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ android.widget.TextView f12804;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.um1 f12805;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ android.widget.TextView f12806;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ android.widget.TextView f12807;

    /* JADX INFO: renamed from: π */
    public final /* synthetic */ android.view.View f12808;

    /* JADX INFO: renamed from: ρ */
    public final /* synthetic */ java.util.LinkedHashSet f12809;

    public yu1(p000.um1 r1, p000.um1 r2, p000.um1 r3, p000.um1 r4, p000.zc0 r5, android.widget.TextView r6, p000.qm1 r7, android.widget.TextView r8, p000.um1 r9, android.widget.TextView r10, android.widget.TextView r11, android.view.View r12, java.util.LinkedHashSet r13) {
            r0 = this;
            r0.<init>()
            r0.f12797 = r1
            r0.f12798 = r2
            r0.f12799 = r3
            r0.f12800 = r4
            r0.f12801 = r5
            r0.f12802 = r6
            r0.f12803 = r7
            r0.f12804 = r8
            r0.f12805 = r9
            r0.f12806 = r10
            r0.f12807 = r11
            r0.f12808 = r12
            r0.f12809 = r13
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r17, int r18, int r19, int r20) {
            r16 = this;
            r0 = r16
            if (r17 == 0) goto L9
            java.lang.String r1 = r17.toString()
            goto La
        L9:
            r1 = 0
        La:
            if (r1 != 0) goto Le
            java.lang.String r1 = ""
        Le:
            r14 = r1
            um1 r1 = r0.f12797
            java.lang.Object r2 = r1.f10912
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L24
            bv1 r3 = p000.bv1.f1853
            h22 r3 = p000.bv1.f1868
            java.lang.Object r3 = r3.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            r3.removeCallbacks(r2)
        L24:
            xu1 r2 = new xu1
            zc0 r3 = r0.f12801
            qm1 r4 = r0.f12803
            um1 r5 = r0.f12798
            um1 r6 = r0.f12799
            um1 r7 = r0.f12800
            um1 r8 = r0.f12805
            android.view.View r9 = r0.f12808
            android.widget.TextView r10 = r0.f12802
            android.widget.TextView r11 = r0.f12804
            android.widget.TextView r12 = r0.f12806
            android.widget.TextView r13 = r0.f12807
            java.util.LinkedHashSet r15 = r0.f12809
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f10912 = r2
            bv1 r0 = p000.bv1.f1853
            h22 r0 = p000.bv1.f1868
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r3 = 160(0xa0, double:7.9E-322)
            r0.postDelayed(r2, r3)
            return
    }
}
