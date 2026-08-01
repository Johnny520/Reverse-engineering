package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f6517;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.TextView f6518;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f6519;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.um1 f6520;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.um1 f6521;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.um1 f6522;

    public /* synthetic */ la0(android.app.Activity r1, android.widget.TextView r2, p000.um1 r3, p000.um1 r4, p000.um1 r5, p000.um1 r6) {
            r0 = this;
            r0.<init>()
            r0.f6517 = r1
            r0.f6518 = r2
            r0.f6519 = r3
            r0.f6520 = r4
            r0.f6521 = r5
            r0.f6522 = r6
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r4 = this;
            um1 r0 = r4.f6519
            java.lang.Object r0 = r0.f10912
            w90 r0 = (p000.w90) r0
            um1 r1 = r4.f6520
            java.lang.Object r1 = r1.f10912
            w90 r1 = (p000.w90) r1
            boolean r0 = p000.w90.m6331(r0, r1)
            if (r0 == 0) goto L23
            um1 r0 = r4.f6521
            java.lang.Object r0 = r0.f10912
            um1 r1 = r4.f6522
            java.lang.Object r1 = r1.f10912
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            android.widget.TextView r1 = r4.f6518
            r1.setEnabled(r0)
            r1.setClickable(r0)
            if (r0 == 0) goto L31
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L34
        L31:
            r2 = 1060655596(0x3f3851ec, float:0.72)
        L34:
            r1.setAlpha(r2)
            if (r0 == 0) goto L44
            r0 = 126(0x7e, float:1.77E-43)
            r2 = 235(0xeb, float:3.3E-43)
            r3 = 44
            int r0 = android.graphics.Color.rgb(r3, r0, r2)
            goto L4c
        L44:
            r0 = 100
            r2 = 96
            int r0 = android.graphics.Color.rgb(r2, r2, r0)
        L4c:
            android.app.Activity r4 = r4.f6517
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r2 = 1103101952(0x41c00000, float:24.0)
            float r2 = r2 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            int r4 = (int) r2
            android.graphics.drawable.GradientDrawable r0 = p000.lz1.m3681(r0)
            float r4 = (float) r4
            r0.setCornerRadius(r4)
            r1.setBackground(r0)
            s62 r4 = p000.s62.f9751
            return r4
    }
}
