package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: Α */
    public static final int[] f7829 = null;

    /* JADX INFO: renamed from: ω */
    public static final int[] f7830 = null;

    /* JADX INFO: renamed from: α */
    public final int f7831;

    /* JADX INFO: renamed from: β */
    public final android.graphics.drawable.StateListDrawable f7832;

    /* JADX INFO: renamed from: γ */
    public final android.graphics.drawable.Drawable f7833;

    /* JADX INFO: renamed from: δ */
    public final int f7834;

    /* JADX INFO: renamed from: ε */
    public final int f7835;

    /* JADX INFO: renamed from: ζ */
    public final android.graphics.drawable.StateListDrawable f7836;

    /* JADX INFO: renamed from: η */
    public final android.graphics.drawable.Drawable f7837;

    /* JADX INFO: renamed from: θ */
    public final int f7838;

    /* JADX INFO: renamed from: ι */
    public final int f7839;

    /* JADX INFO: renamed from: κ */
    public float f7840;

    /* JADX INFO: renamed from: λ */
    public float f7841;

    /* JADX INFO: renamed from: μ */
    public int f7842;

    /* JADX INFO: renamed from: ν */
    public int f7843;

    /* JADX INFO: renamed from: ξ */
    public final androidx.recyclerview.widget.RecyclerView f7844;

    /* JADX INFO: renamed from: ο */
    public final boolean f7845;

    /* JADX INFO: renamed from: π */
    public final boolean f7846;

    /* JADX INFO: renamed from: ρ */
    public int f7847;

    /* JADX INFO: renamed from: σ */
    public int f7848;

    /* JADX INFO: renamed from: τ */
    public final int[] f7849;

    /* JADX INFO: renamed from: υ */
    public final int[] f7850;

    /* JADX INFO: renamed from: φ */
    public final android.animation.ValueAnimator f7851;

    /* JADX INFO: renamed from: χ */
    public int f7852;

    /* JADX INFO: renamed from: ψ */
    public final p000.RunnableC0196d1 f7853;

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            p000.o00.f7830 = r0
            r0 = 0
            int[] r0 = new int[r0]
            p000.o00.f7829 = r0
            return
    }

    public o00(androidx.recyclerview.widget.RecyclerView r6, android.graphics.drawable.StateListDrawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.StateListDrawable r9, android.graphics.drawable.Drawable r10, int r11, int r12, int r13) {
            r5 = this;
            r5.<init>()
            r12 = 0
            r5.f7842 = r12
            r5.f7843 = r12
            r5.f7845 = r12
            r5.f7846 = r12
            r5.f7847 = r12
            r5.f7848 = r12
            r0 = 2
            int[] r1 = new int[r0]
            r5.f7849 = r1
            int[] r1 = new int[r0]
            r5.f7850 = r1
            float[] r1 = new float[r0]
            r1 = {x0100: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r5.f7851 = r1
            r5.f7852 = r12
            d1 r2 = new d1
            r3 = 5
            r2.<init>(r3, r5)
            r5.f7853 = r2
            l00 r3 = new l00
            r3.<init>()
            r5.f7832 = r7
            r5.f7833 = r8
            r5.f7836 = r9
            r5.f7837 = r10
            int r4 = r7.getIntrinsicWidth()
            int r4 = java.lang.Math.max(r11, r4)
            r5.f7834 = r4
            int r4 = r8.getIntrinsicWidth()
            int r4 = java.lang.Math.max(r11, r4)
            r5.f7835 = r4
            int r9 = r9.getIntrinsicWidth()
            int r9 = java.lang.Math.max(r11, r9)
            r5.f7838 = r9
            int r9 = r10.getIntrinsicWidth()
            int r9 = java.lang.Math.max(r11, r9)
            r5.f7839 = r9
            r5.f7831 = r13
            r9 = 255(0xff, float:3.57E-43)
            r7.setAlpha(r9)
            r8.setAlpha(r9)
            m00 r7 = new m00
            r7.<init>(r12, r5)
            r1.addListener(r7)
            n00 r7 = new n00
            r7.<init>(r5)
            r1.addUpdateListener(r7)
            androidx.recyclerview.widget.RecyclerView r7 = r5.f7844
            if (r7 != r6) goto L82
            return
        L82:
            if (r7 == 0) goto Lc6
            java.util.ArrayList r8 = r7.f1161
            zl1 r9 = r7.f1160
            if (r9 == 0) goto L8f
            java.lang.String r10 = "Cannot remove item decoration during a scroll  or layout"
            r9.mo491(r10)
        L8f:
            r8.remove(r5)
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto La4
            int r8 = r7.getOverScrollMode()
            if (r8 != r0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = r12
        La1:
            r7.setWillNotDraw(r8)
        La4:
            r7.m534()
            r7.requestLayout()
            androidx.recyclerview.widget.RecyclerView r7 = r5.f7844
            java.util.ArrayList r8 = r7.f1162
            r8.remove(r5)
            o00 r8 = r7.f1163
            if (r8 != r5) goto Lb8
            r8 = 0
            r7.f1163 = r8
        Lb8:
            androidx.recyclerview.widget.RecyclerView r7 = r5.f7844
            java.util.ArrayList r7 = r7.f1175
            if (r7 == 0) goto Lc1
            r7.remove(r3)
        Lc1:
            androidx.recyclerview.widget.RecyclerView r7 = r5.f7844
            r7.removeCallbacks(r2)
        Lc6:
            r5.f7844 = r6
            java.util.ArrayList r7 = r6.f1161
            zl1 r8 = r6.f1160
            if (r8 == 0) goto Ld3
            java.lang.String r9 = "Cannot add item decoration during a scroll  or layout"
            r8.mo491(r9)
        Ld3:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto Ldc
            r6.setWillNotDraw(r12)
        Ldc:
            r7.add(r5)
            r6.m534()
            r6.requestLayout()
            androidx.recyclerview.widget.RecyclerView r6 = r5.f7844
            java.util.ArrayList r6 = r6.f1162
            r6.add(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r5.f7844
            java.util.ArrayList r6 = r5.f1175
            if (r6 != 0) goto Lf9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f1175 = r6
        Lf9:
            java.util.ArrayList r5 = r5.f1175
            r5.add(r3)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m4146(float r2, float r3, int[] r4, int r5, int r6, int r7) {
            r0 = 1
            r0 = r4[r0]
            r1 = 0
            r4 = r4[r1]
            int r0 = r0 - r4
            if (r0 != 0) goto La
            goto L17
        La:
            float r3 = r3 - r2
            float r2 = (float) r0
            float r3 = r3 / r2
            int r5 = r5 - r7
            float r2 = (float) r5
            float r3 = r3 * r2
            int r2 = (int) r3
            int r6 = r6 + r2
            if (r6 >= r5) goto L17
            if (r6 < 0) goto L17
            return r2
        L17:
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final boolean m4147(float r2, float r3) {
            r1 = this;
            int r0 = r1.f7843
            int r1 = r1.f7838
            int r0 = r0 - r1
            float r1 = (float) r0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 0
            if (r1 < 0) goto L17
            float r1 = (float) r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L17
            float r1 = (float) r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L17
            r1 = 1
            return r1
        L17:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final boolean m4148(float r5, float r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f7844
            int r0 = r0.getLayoutDirection()
            r1 = 0
            int r2 = r4.f7834
            r3 = 1
            if (r0 != r3) goto L12
            float r4 = (float) r2
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto L25
            goto L1a
        L12:
            int r4 = r4.f7842
            int r4 = r4 - r2
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 < 0) goto L25
        L1a:
            float r4 = (float) r1
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L25
            float r4 = (float) r1
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L25
            return r3
        L25:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m4149(int r5) {
            r4 = this;
            d1 r0 = r4.f7853
            android.graphics.drawable.StateListDrawable r1 = r4.f7832
            r2 = 2
            if (r5 != r2) goto L15
            int r3 = r4.f7847
            if (r3 == r2) goto L15
            int[] r3 = p000.o00.f7830
            r1.setState(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r4.f7844
            r3.removeCallbacks(r0)
        L15:
            if (r5 != 0) goto L1d
            androidx.recyclerview.widget.RecyclerView r3 = r4.f7844
            r3.invalidate()
            goto L20
        L1d:
            r4.m4150()
        L20:
            int r3 = r4.f7847
            if (r3 != r2) goto L39
            if (r5 == r2) goto L39
            int[] r2 = p000.o00.f7829
            r1.setState(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r4.f7844
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.f7844
            r2 = 1200(0x4b0, float:1.682E-42)
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            goto L49
        L39:
            r1 = 1
            if (r5 != r1) goto L49
            androidx.recyclerview.widget.RecyclerView r1 = r4.f7844
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.f7844
            r2 = 1500(0x5dc, float:2.102E-42)
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
        L49:
            r4.f7847 = r5
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m4150() {
            r4 = this;
            int r0 = r4.f7852
            android.animation.ValueAnimator r1 = r4.f7851
            if (r0 == 0) goto Ld
            r2 = 3
            if (r0 == r2) goto La
            return
        La:
            r1.cancel()
        Ld:
            r0 = 1
            r4.f7852 = r0
            java.lang.Object r4 = r1.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r2[r0] = r4
            r1.setFloatValues(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r2 = 0
            r1.setStartDelay(r2)
            r1.start()
            return
    }
}
