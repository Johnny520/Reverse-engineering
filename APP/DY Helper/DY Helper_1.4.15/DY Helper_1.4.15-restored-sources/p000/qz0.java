package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class qz0 {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f9163;

    /* JADX INFO: renamed from: β */
    public final p000.iz0 f9164;

    /* JADX INFO: renamed from: γ */
    public final boolean f9165;

    /* JADX INFO: renamed from: δ */
    public final int f9166;

    /* JADX INFO: renamed from: ε */
    public android.view.View f9167;

    /* JADX INFO: renamed from: ζ */
    public int f9168;

    /* JADX INFO: renamed from: η */
    public boolean f9169;

    /* JADX INFO: renamed from: θ */
    public p000.tz0 f9170;

    /* JADX INFO: renamed from: ι */
    public p000.oz0 f9171;

    /* JADX INFO: renamed from: κ */
    public android.widget.PopupWindow.OnDismissListener f9172;

    /* JADX INFO: renamed from: λ */
    public final p000.pz0 f9173;

    public qz0(android.content.Context r1, p000.iz0 r2, android.view.View r3, boolean r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r0.f9168 = r6
            pz0 r6 = new pz0
            r6.<init>(r0)
            r0.f9173 = r6
            r0.f9163 = r1
            r0.f9164 = r2
            r0.f9167 = r3
            r0.f9165 = r4
            r0.f9166 = r5
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.oz0 m5038() {
            r8 = this;
            oz0 r0 = r8.f9171
            if (r0 != 0) goto L6b
            java.lang.String r0 = "window"
            android.content.Context r1 = r8.f9163
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Context r3 = r8.f9163
            if (r0 < r1) goto L3d
            ie r0 = new ie
            android.view.View r1 = r8.f9167
            int r2 = r8.f9166
            boolean r4 = r8.f9165
            r0.<init>(r3, r1, r2, r4)
            goto L4b
        L3d:
            yz1 r2 = new yz1
            android.view.View r5 = r8.f9167
            int r6 = r8.f9166
            boolean r7 = r8.f9165
            iz0 r4 = r8.f9164
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r2
        L4b:
            iz0 r1 = r8.f9164
            r0.mo2745(r1)
            pz0 r1 = r8.f9173
            r0.mo2750(r1)
            android.view.View r1 = r8.f9167
            r0.mo2746(r1)
            tz0 r1 = r8.f9170
            r0.mo324(r1)
            boolean r1 = r8.f9169
            r0.mo2747(r1)
            int r1 = r8.f9168
            r0.mo2748(r1)
            r8.f9171 = r0
        L6b:
            oz0 r8 = r8.f9171
            return r8
    }

    /* JADX INFO: renamed from: β */
    public final boolean m5039() {
            r0 = this;
            oz0 r0 = r0.f9171
            if (r0 == 0) goto Lc
            boolean r0 = r0.mo340()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public void mo5040() {
            r1 = this;
            r0 = 0
            r1.f9171 = r0
            android.widget.PopupWindow$OnDismissListener r1 = r1.f9172
            if (r1 == 0) goto La
            r1.onDismiss()
        La:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m5041(int r3, int r4, boolean r5, boolean r6) {
            r2 = this;
            oz0 r0 = r2.m5038()
            r0.mo2751(r6)
            if (r5 == 0) goto L47
            int r5 = r2.f9168
            android.view.View r6 = r2.f9167
            int r6 = r6.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L21
            android.view.View r5 = r2.f9167
            int r5 = r5.getWidth()
            int r3 = r3 - r5
        L21:
            r0.mo2749(r3)
            r0.mo2752(r4)
            android.content.Context r2 = r2.f9163
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r5 = 1111490560(0x42400000, float:48.0)
            float r2 = r2 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            int r2 = (int) r2
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r3 - r2
            int r1 = r4 - r2
            int r3 = r3 + r2
            int r4 = r4 + r2
            r5.<init>(r6, r1, r3, r4)
            r0.f8360 = r5
        L47:
            r0.mo342()
            return
    }
}
