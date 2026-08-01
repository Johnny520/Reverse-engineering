package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class im1 {

    /* JADX INFO: renamed from: α */
    public int f5127;

    /* JADX INFO: renamed from: β */
    public int f5128;

    /* JADX INFO: renamed from: γ */
    public int f5129;

    /* JADX INFO: renamed from: δ */
    public int f5130;

    /* JADX INFO: renamed from: ε */
    public android.view.animation.Interpolator f5131;

    /* JADX INFO: renamed from: ζ */
    public boolean f5132;

    /* JADX INFO: renamed from: η */
    public int f5133;

    /* JADX INFO: renamed from: α */
    public final void m2763(androidx.recyclerview.widget.RecyclerView r7) {
            r6 = this;
            int r0 = r6.f5130
            r1 = 0
            if (r0 < 0) goto Le
            r2 = -1
            r6.f5130 = r2
            r7.m533(r0)
            r6.f5132 = r1
            return
        Le:
            boolean r0 = r6.f5132
            if (r0 == 0) goto L48
            android.view.animation.Interpolator r0 = r6.f5131
            r2 = 1
            if (r0 == 0) goto L22
            int r3 = r6.f5129
            if (r3 < r2) goto L1c
            goto L22
        L1c:
            java.lang.String r6 = "If you provide an interpolator, you must set a positive duration"
            p000.C1080.m7279(r6)
            return
        L22:
            int r3 = r6.f5129
            if (r3 < r2) goto L42
            nm1 r7 = r7.f1171
            int r4 = r6.f5127
            int r5 = r6.f5128
            r7.m4085(r4, r5, r3, r0)
            int r7 = r6.f5133
            int r7 = r7 + r2
            r6.f5133 = r7
            r0 = 10
            if (r7 <= r0) goto L3f
            java.lang.String r7 = "RecyclerView"
            java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
            android.util.Log.e(r7, r0)
        L3f:
            r6.f5132 = r1
            return
        L42:
            java.lang.String r6 = "Scroll duration must be a positive number"
            p000.C1080.m7279(r6)
            return
        L48:
            r6.f5133 = r1
            return
    }
}
