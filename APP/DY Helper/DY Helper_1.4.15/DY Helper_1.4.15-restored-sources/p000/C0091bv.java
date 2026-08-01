package p000;

/* JADX INFO: renamed from: bv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0091bv implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1845;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f1846;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f1847;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.EditText f1848;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f1849;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f1850;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ android.widget.TextView f1851;

    public /* synthetic */ C0091bv(android.widget.EditText r1, p000.um1 r2, android.widget.EditText r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, int r7) {
            r0 = this;
            r0.f1845 = r7
            r0.f1846 = r1
            r0.f1847 = r2
            r0.f1848 = r3
            r0.f1849 = r4
            r0.f1850 = r5
            r0.f1851 = r6
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m1028(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: β */
    private final void m1029(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: γ */
    private final void m1030(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: δ */
    private final void m1031(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r15) {
            r14 = this;
            int r15 = r14.f1845
            switch(r15) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            android.widget.TextView r5 = r14.f1850
            android.widget.TextView r6 = r14.f1851
            android.widget.EditText r0 = r14.f1846
            um1 r1 = r14.f1847
            android.widget.EditText r2 = r14.f1848
            r3 = 0
            android.widget.TextView r4 = r14.f1849
            p000.h62.m2411(r0, r1, r2, r3, r4, r5, r6)
            return
        L16:
            android.widget.TextView r12 = r14.f1850
            android.widget.TextView r13 = r14.f1851
            android.widget.EditText r7 = r14.f1846
            um1 r8 = r14.f1847
            android.widget.EditText r9 = r14.f1848
            r10 = 0
            android.widget.TextView r11 = r14.f1849
            p000.h62.m2411(r7, r8, r9, r10, r11, r12, r13)
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f1845
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            int r0 = r0.f1845
            return
    }
}
