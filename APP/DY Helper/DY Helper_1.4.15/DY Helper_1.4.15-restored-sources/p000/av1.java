package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class av1 implements android.text.TextWatcher {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.um1 f1322;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f1323;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.TextView f1324;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.TextView f1325;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f1326;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.um1 f1327;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.qm1 f1328;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.qm1 f1329;

    public av1(p000.um1 r1, android.widget.EditText r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, p000.um1 r6, p000.qm1 r7, p000.qm1 r8) {
            r0 = this;
            r0.<init>()
            r0.f1322 = r1
            r0.f1323 = r2
            r0.f1324 = r3
            r0.f1325 = r4
            r0.f1326 = r5
            r0.f1327 = r6
            r0.f1328 = r7
            r0.f1329 = r8
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
    public final void onTextChanged(java.lang.CharSequence r9, int r10, int r11, int r12) {
            r8 = this;
            qm1 r6 = r8.f1328
            qm1 r7 = r8.f1329
            um1 r0 = r8.f1322
            android.widget.EditText r1 = r8.f1323
            android.widget.TextView r2 = r8.f1324
            android.widget.TextView r3 = r8.f1325
            android.widget.TextView r4 = r8.f1326
            um1 r5 = r8.f1327
            p000.bv1.m1052(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
