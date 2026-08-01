package p000;

/* JADX INFO: renamed from: ru */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0774ru implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.um1 f9501;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f9502;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.util.LinkedHashMap f9503;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.TextView f9504;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f9505;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.app.Activity f9506;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ android.widget.LinearLayout f9507;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.C1000xx f9508;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ android.widget.EditText f9509;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ android.widget.TextView f9510;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ android.widget.TextView f9511;

    /* JADX INFO: renamed from: π */
    public final /* synthetic */ android.widget.TextView f9512;

    public /* synthetic */ C0774ru(p000.C1000xx r1, p000.um1 r2, android.app.Activity r3, android.widget.EditText r4, android.widget.EditText r5, android.widget.LinearLayout r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, java.util.LinkedHashMap r12) {
            r0 = this;
            r0.<init>()
            r0.f9501 = r2
            r0.f9502 = r4
            r0.f9503 = r12
            r0.f9504 = r7
            r0.f9505 = r8
            r0.f9506 = r3
            r0.f9507 = r6
            r0.f9508 = r1
            r0.f9509 = r5
            r0.f9510 = r9
            r0.f9511 = r10
            r0.f9512 = r11
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            zu r13 = (p000.EnumC1071zu) r13
            r13.getClass()
            um1 r1 = r12.f9501
            java.lang.Object r0 = r1.f10912
            if (r13 != r0) goto Lc
            goto L61
        Lc:
            java.util.LinkedHashMap r11 = r12.f9503
            android.widget.EditText r0 = r12.f9502
            p000.h62.m2410(r11, r1, r0)
            r1.f10912 = r13
            java.lang.String r13 = r13.f13301
            android.widget.TextView r6 = r12.f9504
            r6.setText(r13)
            java.lang.Object r13 = r1.f10912
            zu r13 = (p000.EnumC1071zu) r13
            java.lang.String r13 = r13.f13302
            android.widget.TextView r7 = r12.f9505
            r7.setText(r13)
            java.lang.Object r13 = r1.f10912
            java.lang.Object r13 = r11.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L33
            java.lang.String r13 = ""
        L33:
            r0.setText(r13)
            android.text.Editable r13 = r0.getText()
            if (r13 == 0) goto L41
            int r13 = r13.length()
            goto L42
        L41:
            r13 = 0
        L42:
            r0.setSelection(r13)
            r3 = r0
            xx r0 = r12.f9508
            android.app.Activity r2 = r12.f9506
            android.widget.EditText r4 = r12.f9509
            android.widget.LinearLayout r5 = r12.f9507
            android.widget.TextView r8 = r12.f9510
            android.widget.TextView r9 = r12.f9511
            android.widget.TextView r10 = r12.f9512
            p000.h62.m2409(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r4
            r4 = r8
            r5 = r9
            r6 = r10
            r12 = 0
            r0 = r3
            r3 = r12
            p000.h62.m2411(r0, r1, r2, r3, r4, r5, r6)
        L61:
            s62 r12 = p000.s62.f9751
            return r12
    }
}
