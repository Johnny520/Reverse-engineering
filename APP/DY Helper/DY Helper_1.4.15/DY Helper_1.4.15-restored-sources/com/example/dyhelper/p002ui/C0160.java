package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.γ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0160 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2640;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f2641;

    public /* synthetic */ C0160(android.view.View r1, int r2) {
            r0 = this;
            r0.f2640 = r2
            r0.f2641 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2640
            r1 = 0
            s62 r2 = p000.s62.f9751
            android.view.View r4 = r4.f2641
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L4d;
                default: goto La;
            }
        La:
            com.example.dyhelper.ui.ColorPickerDialog$SvPanel r4 = (com.example.dyhelper.p002ui.ColorPickerDialog$SvPanel) r4
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
            int r0 = com.example.dyhelper.p002ui.ColorPickerDialog$SvPanel.f2504
            r5.getClass()
            float r0 = r5.getX()
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r0, r1, r3)
            r4.f2506 = r0
            float r5 = r5.getY()
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r5 = p000.j81.m2905(r5, r1, r3)
            float r3 = r3 - r5
            r4.f2507 = r3
            r4.invalidate()
            com.example.dyhelper.ui.ι r5 = r4.f2508
            if (r5 == 0) goto L4c
            float r0 = r4.f2506
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r4 = r4.f2507
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5.invoke(r0, r4)
        L4c:
            return r2
        L4d:
            com.example.dyhelper.ui.ColorPickerDialog$HueBar r4 = (com.example.dyhelper.p002ui.ColorPickerDialog$HueBar) r4
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
            int r0 = com.example.dyhelper.p002ui.ColorPickerDialog$HueBar.f2491
            r5.getClass()
            float r5 = r5.getX()
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 * r0
            float r5 = p000.j81.m2905(r5, r1, r0)
            r4.f2492 = r5
            r4.invalidate()
            com.example.dyhelper.ui.ζ r5 = r4.f2493
            if (r5 == 0) goto L79
            float r4 = r4.f2492
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5.invoke(r4)
        L79:
            return r2
        L7a:
            com.example.dyhelper.ui.ColorPickerDialog$AlphaBar r4 = (com.example.dyhelper.p002ui.ColorPickerDialog$AlphaBar) r4
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
            int r0 = com.example.dyhelper.p002ui.ColorPickerDialog$AlphaBar.f2437
            r5.getClass()
            float r5 = r5.getX()
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r0
            int r5 = p000.jx0.m3061(r5)
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            int r5 = p000.j81.m2906(r5, r0, r1)
            r4.f2438 = r5
            r4.invalidate()
            com.example.dyhelper.ui.ζ r5 = r4.f2440
            if (r5 == 0) goto Lad
            int r4 = r4.f2438
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.invoke(r4)
        Lad:
            return r2
    }
}
