package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 {

    /* JADX INFO: renamed from: α */
    public int f3252;

    /* JADX INFO: renamed from: β */
    public androidx.recyclerview.widget.RecyclerView f3253;

    /* JADX INFO: renamed from: γ */
    public p000.zl1 f3254;

    /* JADX INFO: renamed from: δ */
    public boolean f3255;

    /* JADX INFO: renamed from: ε */
    public boolean f3256;

    /* JADX INFO: renamed from: ζ */
    public android.view.View f3257;

    /* JADX INFO: renamed from: η */
    public final p000.im1 f3258;

    /* JADX INFO: renamed from: θ */
    public boolean f3259;

    /* JADX INFO: renamed from: ι */
    public final android.view.animation.LinearInterpolator f3260;

    /* JADX INFO: renamed from: κ */
    public final android.view.animation.DecelerateInterpolator f3261;

    /* JADX INFO: renamed from: λ */
    public android.graphics.PointF f3262;

    /* JADX INFO: renamed from: μ */
    public final android.util.DisplayMetrics f3263;

    /* JADX INFO: renamed from: ν */
    public boolean f3264;

    /* JADX INFO: renamed from: ξ */
    public float f3265;

    /* JADX INFO: renamed from: ο */
    public int f3266;

    /* JADX INFO: renamed from: π */
    public int f3267;

    public ds0(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f3252 = r0
            im1 r1 = new im1
            r1.<init>()
            r1.f5130 = r0
            r0 = 0
            r1.f5132 = r0
            r1.f5133 = r0
            r1.f5127 = r0
            r1.f5128 = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f5129 = r2
            r2 = 0
            r1.f5131 = r2
            r3.f3258 = r1
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r3.f3260 = r1
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.f3261 = r1
            r3.f3264 = r0
            r3.f3266 = r0
            r3.f3267 = r0
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r3.f3263 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m1795(int r1, int r2, int r3, int r4, int r5) {
            r0 = -1
            if (r5 == r0) goto L1b
            if (r5 == 0) goto L11
            r1 = 1
            if (r5 != r1) goto La
            int r4 = r4 - r2
            return r4
        La:
            java.lang.String r1 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
        L11:
            int r3 = r3 - r1
            if (r3 <= 0) goto L15
            return r3
        L15:
            int r4 = r4 - r2
            if (r4 >= 0) goto L19
            return r4
        L19:
            r1 = 0
            return r1
        L1b:
            int r3 = r3 - r1
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final int m1796(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            boolean r0 = r2.f3264
            if (r0 != 0) goto L16
            android.util.DisplayMetrics r0 = r2.f3263
            int r0 = r0.densityDpi
            float r0 = (float) r0
            r1 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 / r0
            r2.f3265 = r1
            r0 = 1
            r2.f3264 = r0
        L16:
            float r2 = r2.f3265
            float r3 = r3 * r2
            double r2 = (double) r3
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final android.graphics.PointF m1797(int r2) {
            r1 = this;
            zl1 r1 = r1.f3254
            boolean r0 = r1 instanceof p000.jm1
            if (r0 == 0) goto Ld
            jm1 r1 = (p000.jm1) r1
            android.graphics.PointF r1 = r1.mo490(r2)
            return r1
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
            r1.<init>(r2)
            java.lang.Class<jm1> r2 = p000.jm1.class
            java.lang.String r2 = r2.getCanonicalName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m1798() {
            r4 = this;
            boolean r0 = r4.f3256
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.f3256 = r0
            r4.f3267 = r0
            r4.f3266 = r0
            r1 = 0
            r4.f3262 = r1
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3253
            km1 r2 = r2.f1174
            r3 = -1
            r2.f6027 = r3
            r4.f3257 = r1
            r4.f3252 = r3
            r4.f3255 = r0
            zl1 r0 = r4.f3254
            ds0 r2 = r0.f13156
            if (r2 != r4) goto L24
            r0.f13156 = r1
        L24:
            r4.f3254 = r1
            r4.f3253 = r1
            return
    }
}
