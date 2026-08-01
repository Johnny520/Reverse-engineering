package p000;

/* JADX INFO: renamed from: av */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0054av extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.widget.EditText f1312;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f1313;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f1314;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.EditText f1315;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f1316;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f1317;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ android.widget.TextView f1318;

    public C0054av(p000.um1 r1, android.app.Activity r2, android.widget.EditText r3, android.widget.EditText r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7) {
            r0 = this;
            r0.f1312 = r3
            r0.f1313 = r2
            r0.f1314 = r1
            r0.f1315 = r4
            r0.f1316 = r5
            r0.f1317 = r6
            r0.f1318 = r7
            java.lang.String r4 = "showInternal$insertToken(Landroid/widget/EditText;Landroid/app/Activity;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/EditText;Lcom/example/dyhelper/model/AwemeInfo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;)V"
            r5 = 0
            r1 = 1
            java.lang.Class<kn0> r2 = p000.kn0.class
            java.lang.String r3 = "insertToken"
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            android.widget.EditText r0 = r7.f1312
            android.text.Editable r1 = r0.getText()
            if (r1 != 0) goto Le
            goto L56
        Le:
            int r2 = r0.getSelectionStart()
            r3 = 0
            if (r2 >= 0) goto L16
            r2 = r3
        L16:
            int r4 = r0.getSelectionEnd()
            if (r4 >= 0) goto L1d
            goto L1e
        L1d:
            r3 = r4
        L1e:
            int r4 = java.lang.Math.min(r2, r3)
            int r2 = java.lang.Math.max(r2, r3)
            r1.replace(r4, r2, r8)
            int r8 = r8.length()
            int r8 = r8 + r4
            int r1 = r1.length()
            if (r8 <= r1) goto L35
            r8 = r1
        L35:
            r0.setSelection(r8)
            r0.requestFocus()
            qu r8 = new qu
            r1 = 0
            android.app.Activity r2 = r7.f1313
            r8.<init>(r2, r0, r1)
            r1 = 120(0x78, double:5.93E-322)
            r0.postDelayed(r8, r1)
            um1 r1 = r7.f1314
            android.widget.EditText r2 = r7.f1315
            r3 = 0
            android.widget.TextView r4 = r7.f1316
            android.widget.TextView r5 = r7.f1317
            android.widget.TextView r6 = r7.f1318
            p000.h62.m2411(r0, r1, r2, r3, r4, r5, r6)
        L56:
            s62 r7 = p000.s62.f9751
            return r7
    }
}
