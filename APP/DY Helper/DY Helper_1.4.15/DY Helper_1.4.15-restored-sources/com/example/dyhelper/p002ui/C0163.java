package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.ζ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0163 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2646;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView f2647;

    public /* synthetic */ C0163(com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView r1, int r2) {
            r0 = this;
            r0.f2646 = r2
            r0.f2647 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2646
            switch(r0) {
                case 0: goto L64;
                case 1: goto L45;
                case 2: goto L26;
                case 3: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r3 = r3.f2647
            r3.f2467 = r4
            r3.m1543()
        L12:
            s62 r3 = p000.s62.f9751
            return r3
        L15:
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r3 = r3.f2647
            float[] r0 = r3.f2466
            r1 = 0
            r0[r1] = r4
            r3.m1543()
            goto L12
        L26:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r3 = r3.f2647
            boolean r0 = r3.f2470
            if (r0 != 0) goto L42
            int r0 = r3.f2465
            int r0 = android.graphics.Color.red(r0)
            int r1 = r3.f2465
            int r1 = android.graphics.Color.green(r1)
            r2 = 1
            r3.m1534(r0, r1, r4, r2)
        L42:
            s62 r3 = p000.s62.f9751
            return r3
        L45:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r3 = r3.f2647
            boolean r0 = r3.f2470
            if (r0 != 0) goto L61
            int r0 = r3.f2465
            int r0 = android.graphics.Color.red(r0)
            int r1 = r3.f2465
            int r1 = android.graphics.Color.blue(r1)
            r2 = 1
            r3.m1534(r0, r4, r1, r2)
        L61:
            s62 r3 = p000.s62.f9751
            return r3
        L64:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r3 = r3.f2647
            boolean r0 = r3.f2470
            if (r0 != 0) goto L80
            int r0 = r3.f2465
            int r0 = android.graphics.Color.green(r0)
            int r1 = r3.f2465
            int r1 = android.graphics.Color.blue(r1)
            r2 = 1
            r3.m1534(r4, r0, r1, r2)
        L80:
            s62 r3 = p000.s62.f9751
            return r3
    }
}
