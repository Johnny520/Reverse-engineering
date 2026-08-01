package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h92 {

    /* JADX INFO: renamed from: ψ */
    public static final p000.rl1 f4642 = null;

    /* JADX INFO: renamed from: α */
    public int f4643;

    /* JADX INFO: renamed from: β */
    public int f4644;

    /* JADX INFO: renamed from: γ */
    public int f4645;

    /* JADX INFO: renamed from: δ */
    public float[] f4646;

    /* JADX INFO: renamed from: ε */
    public float[] f4647;

    /* JADX INFO: renamed from: ζ */
    public float[] f4648;

    /* JADX INFO: renamed from: η */
    public float[] f4649;

    /* JADX INFO: renamed from: θ */
    public int[] f4650;

    /* JADX INFO: renamed from: ι */
    public int[] f4651;

    /* JADX INFO: renamed from: κ */
    public int[] f4652;

    /* JADX INFO: renamed from: λ */
    public int f4653;

    /* JADX INFO: renamed from: μ */
    public android.view.VelocityTracker f4654;

    /* JADX INFO: renamed from: ν */
    public final float f4655;

    /* JADX INFO: renamed from: ξ */
    public float f4656;

    /* JADX INFO: renamed from: ο */
    public final int f4657;

    /* JADX INFO: renamed from: π */
    public int f4658;

    /* JADX INFO: renamed from: ρ */
    public final android.widget.OverScroller f4659;

    /* JADX INFO: renamed from: σ */
    public final p000.C0709q2 f4660;

    /* JADX INFO: renamed from: τ */
    public android.view.View f4661;

    /* JADX INFO: renamed from: υ */
    public boolean f4662;

    /* JADX INFO: renamed from: φ */
    public final androidx.drawerlayout.widget.DrawerLayout f4663;

    /* JADX INFO: renamed from: χ */
    public final p000.RunnableC0196d1 f4664;

    static {
            rl1 r0 = new rl1
            r1 = 1
            r0.<init>(r1)
            p000.h92.f4642 = r0
            return
    }

    public h92(android.content.Context r3, androidx.drawerlayout.widget.DrawerLayout r4, p000.C0709q2 r5) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f4645 = r0
            d1 r0 = new d1
            r1 = 12
            r0.<init>(r1, r2)
            r2.f4664 = r0
            r2.f4663 = r4
            r2.f4660 = r5
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r3)
            android.content.res.Resources r5 = r3.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r5 = r5 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r0
            int r5 = (int) r5
            r2.f4657 = r5
            int r5 = r4.getScaledTouchSlop()
            r2.f4644 = r5
            int r5 = r4.getScaledMaximumFlingVelocity()
            float r5 = (float) r5
            r2.f4655 = r5
            int r4 = r4.getScaledMinimumFlingVelocity()
            float r4 = (float) r4
            r2.f4656 = r4
            android.widget.OverScroller r4 = new android.widget.OverScroller
            rl1 r5 = p000.h92.f4642
            r4.<init>(r3, r5)
            r2.f4659 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2459() {
            r2 = this;
            r0 = -1
            r2.f4645 = r0
            float[] r0 = r2.f4646
            if (r0 != 0) goto L8
            goto L2d
        L8:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f4647
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f4648
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f4649
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f4650
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f4651
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.f4652
            java.util.Arrays.fill(r0, r1)
            r2.f4653 = r1
        L2d:
            android.view.VelocityTracker r0 = r2.f4654
            if (r0 == 0) goto L37
            r0.recycle()
            r0 = 0
            r2.f4654 = r0
        L37:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m2460(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            androidx.drawerlayout.widget.DrawerLayout r1 = r2.f4663
            if (r0 != r1) goto L2f
            r2.f4661 = r3
            r2.f4645 = r4
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            kw r3 = (p000.C0490kw) r3
            r4 = 0
            r3.f6132 = r4
            q2 r3 = r2.f4660
            java.lang.Object r4 = r3.f8802
            androidx.drawerlayout.widget.DrawerLayout r4 = (androidx.drawerlayout.widget.DrawerLayout) r4
            int r3 = r3.f8799
            r0 = 3
            if (r3 != r0) goto L21
            r0 = 5
        L21:
            android.view.View r3 = r4.m453(r0)
            if (r3 == 0) goto L2a
            r4.m451(r3)
        L2a:
            r3 = 1
            r2.m2475(r3)
            return
        L2f:
            java.lang.String r2 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            java.lang.String r3 = ")"
            p000.ql1.m4938(r2, r1, r3)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m2461(float r3, float r4, int r5, int r6) {
            r2 = this;
            float r3 = java.lang.Math.abs(r3)
            float r4 = java.lang.Math.abs(r4)
            int[] r0 = r2.f4650
            r0 = r0[r5]
            r0 = r0 & r6
            if (r0 != r6) goto L3a
            int r0 = r2.f4658
            r0 = r0 & r6
            if (r0 == 0) goto L3a
            int[] r0 = r2.f4652
            r0 = r0[r5]
            r0 = r0 & r6
            if (r0 == r6) goto L3a
            int[] r0 = r2.f4651
            r5 = r0[r5]
            r0 = r5 & r6
            if (r0 == r6) goto L3a
            int r2 = r2.f4644
            float r0 = (float) r2
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 > 0) goto L2f
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L2f
            goto L3a
        L2f:
            r4 = r5 & r6
            if (r4 != 0) goto L3a
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L3a
            r2 = 1
            return r2
        L3a:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m2462(android.view.View r3, float r4) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            goto L24
        L4:
            boolean r1 = androidx.drawerlayout.widget.DrawerLayout.m449(r3)
            if (r1 == 0) goto Lf
            int r3 = r3.getWidth()
            goto L10
        Lf:
            r3 = r0
        L10:
            r1 = 1
            if (r3 <= 0) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r0
        L16:
            if (r3 == 0) goto L24
            float r3 = java.lang.Math.abs(r4)
            int r2 = r2.f4644
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L24
            return r1
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final void m2463(int r5) {
            r4 = this;
            float[] r0 = r4.f4646
            if (r0 == 0) goto L2c
            int r1 = r4.f4653
            r2 = 1
            int r2 = r2 << r5
            r3 = r1 & r2
            if (r3 == 0) goto L2c
            r3 = 0
            r0[r5] = r3
            float[] r0 = r4.f4647
            r0[r5] = r3
            float[] r0 = r4.f4648
            r0[r5] = r3
            float[] r0 = r4.f4649
            r0[r5] = r3
            int[] r0 = r4.f4650
            r3 = 0
            r0[r5] = r3
            int[] r0 = r4.f4651
            r0[r5] = r3
            int[] r0 = r4.f4652
            r0[r5] = r3
            int r5 = ~r2
            r5 = r5 & r1
            r4.f4653 = r5
        L2c:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final int m2464(int r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            androidx.drawerlayout.widget.DrawerLayout r3 = r3.f4663
            int r3 = r3.getWidth()
            int r0 = r3 / 2
            int r1 = java.lang.Math.abs(r4)
            float r1 = (float) r1
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r3, r1)
            float r0 = (float) r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 - r2
            r2 = 1055999547(0x3ef1463b, float:0.47123894)
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sin(r1)
            float r1 = (float) r1
            float r1 = r1 * r0
            float r1 = r1 + r0
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L3f
            float r3 = (float) r5
            float r1 = r1 / r3
            float r3 = java.lang.Math.abs(r1)
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r3 = r3 * 4
            goto L4b
        L3f:
            int r4 = java.lang.Math.abs(r4)
            float r4 = (float) r4
            float r5 = (float) r6
            float r4 = r4 / r5
            float r4 = r4 + r3
            r3 = 1132462080(0x43800000, float:256.0)
            float r4 = r4 * r3
            int r3 = (int) r4
        L4b:
            r4 = 600(0x258, float:8.41E-43)
            int r3 = java.lang.Math.min(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: η */
    public final boolean m2465() {
            r10 = this;
            int r0 = r10.f4643
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L5c
            android.widget.OverScroller r0 = r10.f4659
            boolean r3 = r0.computeScrollOffset()
            int r4 = r0.getCurrX()
            int r5 = r0.getCurrY()
            android.view.View r6 = r10.f4661
            int r6 = r6.getLeft()
            int r6 = r4 - r6
            android.view.View r7 = r10.f4661
            int r7 = r7.getTop()
            int r7 = r5 - r7
            if (r6 == 0) goto L2d
            android.view.View r8 = r10.f4661
            java.util.WeakHashMap r9 = p000.b92.f1572
            r8.offsetLeftAndRight(r6)
        L2d:
            if (r7 == 0) goto L36
            android.view.View r8 = r10.f4661
            java.util.WeakHashMap r9 = p000.b92.f1572
            r8.offsetTopAndBottom(r7)
        L36:
            if (r6 != 0) goto L3a
            if (r7 == 0) goto L41
        L3a:
            q2 r6 = r10.f4660
            android.view.View r7 = r10.f4661
            r6.m4711(r7, r4)
        L41:
            if (r3 == 0) goto L53
            int r6 = r0.getFinalX()
            if (r4 != r6) goto L53
            int r4 = r0.getFinalY()
            if (r5 != r4) goto L53
            r0.abortAnimation()
            r3 = r1
        L53:
            if (r3 != 0) goto L5c
            androidx.drawerlayout.widget.DrawerLayout r0 = r10.f4663
            d1 r3 = r10.f4664
            r0.post(r3)
        L5c:
            int r10 = r10.f4643
            if (r10 != r2) goto L62
            r10 = 1
            return r10
        L62:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public final void m2466(float r12) {
            r11 = this;
            r0 = 1
            r11.f4662 = r0
            android.view.View r1 = r11.f4661
            q2 r2 = r11.f4660
            java.lang.Object r3 = r2.f8802
            androidx.drawerlayout.widget.DrawerLayout r3 = (androidx.drawerlayout.widget.DrawerLayout) r3
            int[] r4 = androidx.drawerlayout.widget.DrawerLayout.f1064
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            kw r4 = (p000.C0490kw) r4
            float r4 = r4.f6131
            int r5 = r1.getWidth()
            r6 = 3
            boolean r6 = r3.m450(r1, r6)
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            if (r6 == 0) goto L33
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 > 0) goto L31
            if (r12 != 0) goto L2f
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 <= 0) goto L2f
            goto L31
        L2f:
            int r12 = -r5
            goto L48
        L31:
            r12 = r7
            goto L48
        L33:
            int r6 = r3.getWidth()
            int r10 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r10 < 0) goto L46
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 != 0) goto L44
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 <= 0) goto L44
            goto L46
        L44:
            r12 = r6
            goto L48
        L46:
            int r6 = r6 - r5
            goto L44
        L48:
            java.lang.Object r2 = r2.f8800
            h92 r2 = (p000.h92) r2
            int r1 = r1.getTop()
            boolean r4 = r2.f4662
            if (r4 == 0) goto L76
            android.view.VelocityTracker r4 = r2.f4654
            int r5 = r2.f4645
            float r4 = r4.getXVelocity(r5)
            int r4 = (int) r4
            android.view.VelocityTracker r5 = r2.f4654
            int r6 = r2.f4645
            float r5 = r5.getYVelocity(r6)
            int r5 = (int) r5
            r2.m2468(r12, r1, r4, r5)
            r3.invalidate()
            r11.f4662 = r7
            int r12 = r11.f4643
            if (r12 != r0) goto L75
            r11.m2475(r7)
        L75:
            return
        L76:
            java.lang.String r11 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            p000.C1080.m7279(r11)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final android.view.View m2467(int r4, int r5) {
            r3 = this;
            androidx.drawerlayout.widget.DrawerLayout r3 = r3.f4663
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L2a
            android.view.View r1 = r3.getChildAt(r0)
            int r2 = r1.getLeft()
            if (r4 < r2) goto L27
            int r2 = r1.getRight()
            if (r4 >= r2) goto L27
            int r2 = r1.getTop()
            if (r5 < r2) goto L27
            int r2 = r1.getBottom()
            if (r5 >= r2) goto L27
            return r1
        L27:
            int r0 = r0 + (-1)
            goto L8
        L2a:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m2468(int r12, int r13, int r14, int r15) {
            r11 = this;
            android.view.View r0 = r11.f4661
            int r2 = r0.getLeft()
            android.view.View r0 = r11.f4661
            int r3 = r0.getTop()
            int r4 = r12 - r2
            int r5 = r13 - r3
            android.widget.OverScroller r1 = r11.f4659
            r12 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r11.m2475(r12)
            return r12
        L1e:
            android.view.View r13 = r11.f4661
            float r0 = r11.f4656
            int r0 = (int) r0
            float r6 = r11.f4655
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L2e
            r14 = r12
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r14 <= 0) goto L34
            r14 = r6
            goto L35
        L34:
            int r14 = -r6
        L35:
            float r0 = r11.f4656
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r15)
            if (r7 >= r0) goto L40
            r15 = r12
            goto L47
        L40:
            if (r7 <= r6) goto L47
            if (r15 <= 0) goto L46
            r15 = r6
            goto L47
        L46:
            int r15 = -r6
        L47:
            int r0 = java.lang.Math.abs(r4)
            int r6 = java.lang.Math.abs(r5)
            int r7 = java.lang.Math.abs(r14)
            int r8 = java.lang.Math.abs(r15)
            int r9 = r7 + r8
            int r10 = r0 + r6
            if (r14 == 0) goto L61
            float r0 = (float) r7
            float r7 = (float) r9
        L5f:
            float r0 = r0 / r7
            goto L64
        L61:
            float r0 = (float) r0
            float r7 = (float) r10
            goto L5f
        L64:
            if (r15 == 0) goto L6a
            float r6 = (float) r8
            float r7 = (float) r9
        L68:
            float r6 = r6 / r7
            goto L6d
        L6a:
            float r6 = (float) r6
            float r7 = (float) r10
            goto L68
        L6d:
            boolean r7 = androidx.drawerlayout.widget.DrawerLayout.m449(r13)
            if (r7 == 0) goto L78
            int r13 = r13.getWidth()
            goto L79
        L78:
            r13 = r12
        L79:
            int r13 = r11.m2464(r4, r14, r13)
            int r12 = r11.m2464(r5, r15, r12)
            float r13 = (float) r13
            float r13 = r13 * r0
            float r12 = (float) r12
            float r12 = r12 * r6
            float r12 = r12 + r13
            int r6 = (int) r12
            r1.startScroll(r2, r3, r4, r5, r6)
            r12 = 2
            r11.m2475(r12)
            r11 = 1
            return r11
    }

    /* JADX INFO: renamed from: λ */
    public final boolean m2469(int r3) {
            r2 = this;
            int r2 = r2.f4653
            r0 = 1
            int r1 = r0 << r3
            r2 = r2 & r1
            if (r2 == 0) goto L9
            return r0
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Ignoring pointerId="
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ViewDragHelper"
            android.util.Log.e(r3, r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public final void m2470(android.view.MotionEvent r11) {
            r10 = this;
            q2 r0 = r10.f4660
            java.lang.Object r1 = r0.f8801
            d1 r1 = (p000.RunnableC0196d1) r1
            java.lang.Object r2 = r0.f8802
            androidx.drawerlayout.widget.DrawerLayout r2 = (androidx.drawerlayout.widget.DrawerLayout) r2
            int r3 = r11.getActionMasked()
            int r4 = r11.getActionIndex()
            if (r3 != 0) goto L17
            r10.m2459()
        L17:
            android.view.VelocityTracker r5 = r10.f4654
            if (r5 != 0) goto L21
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r10.f4654 = r5
        L21:
            android.view.VelocityTracker r5 = r10.f4654
            r5.addMovement(r11)
            r5 = 160(0xa0, double:7.9E-322)
            r7 = 0
            if (r3 == 0) goto L19f
            r8 = 1
            if (r3 == r8) goto L194
            r9 = 2
            if (r3 == r9) goto Ldd
            r0 = 3
            if (r3 == r0) goto Ld1
            r0 = 5
            if (r3 == r0) goto L80
            r0 = 6
            if (r3 == r0) goto L3c
            goto L1c3
        L3c:
            int r0 = r11.getPointerId(r4)
            int r1 = r10.f4643
            if (r1 != r8) goto L7c
            int r1 = r10.f4645
            if (r0 != r1) goto L7c
            int r1 = r11.getPointerCount()
        L4c:
            r2 = -1
            if (r7 >= r1) goto L76
            int r3 = r11.getPointerId(r7)
            int r4 = r10.f4645
            if (r3 != r4) goto L58
            goto L73
        L58:
            float r4 = r11.getX(r7)
            float r5 = r11.getY(r7)
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r10.m2467(r4, r5)
            android.view.View r5 = r10.f4661
            if (r4 != r5) goto L73
            boolean r3 = r10.m2478(r5, r3)
            if (r3 == 0) goto L73
            int r11 = r10.f4645
            goto L77
        L73:
            int r7 = r7 + 1
            goto L4c
        L76:
            r11 = r2
        L77:
            if (r11 != r2) goto L7c
            r10.m2471()
        L7c:
            r10.m2463(r0)
            return
        L80:
            int r0 = r11.getPointerId(r4)
            float r3 = r11.getX(r4)
            float r11 = r11.getY(r4)
            r10.m2473(r3, r11, r0)
            int r4 = r10.f4643
            if (r4 != 0) goto La9
            int r3 = (int) r3
            int r11 = (int) r11
            android.view.View r11 = r10.m2467(r3, r11)
            r10.m2478(r11, r0)
            int[] r11 = r10.f4650
            r11 = r11[r0]
            int r10 = r10.f4658
            r10 = r10 & r11
            if (r10 == 0) goto L1c3
            r2.postDelayed(r1, r5)
            return
        La9:
            int r1 = (int) r3
            int r11 = (int) r11
            android.view.View r2 = r10.f4661
            if (r2 != 0) goto Lb0
            goto Lc9
        Lb0:
            int r3 = r2.getLeft()
            if (r1 < r3) goto Lc9
            int r3 = r2.getRight()
            if (r1 >= r3) goto Lc9
            int r1 = r2.getTop()
            if (r11 < r1) goto Lc9
            int r1 = r2.getBottom()
            if (r11 >= r1) goto Lc9
            r7 = r8
        Lc9:
            if (r7 == 0) goto L1c3
            android.view.View r11 = r10.f4661
            r10.m2478(r11, r0)
            return
        Ld1:
            int r11 = r10.f4643
            if (r11 != r8) goto Ld9
            r11 = 0
            r10.m2466(r11)
        Ld9:
            r10.m2459()
            return
        Ldd:
            int r1 = r10.f4643
            if (r1 != r8) goto L14d
            int r1 = r10.f4645
            boolean r1 = r10.m2469(r1)
            if (r1 != 0) goto Leb
            goto L1c3
        Leb:
            int r1 = r10.f4645
            int r1 = r11.findPointerIndex(r1)
            float r2 = r11.getX(r1)
            float r1 = r11.getY(r1)
            float[] r3 = r10.f4648
            int r4 = r10.f4645
            r3 = r3[r4]
            float r2 = r2 - r3
            int r2 = (int) r2
            float[] r3 = r10.f4649
            r3 = r3[r4]
            float r1 = r1 - r3
            int r1 = (int) r1
            android.view.View r3 = r10.f4661
            int r3 = r3.getLeft()
            int r3 = r3 + r2
            android.view.View r4 = r10.f4661
            r4.getTop()
            android.view.View r4 = r10.f4661
            int r4 = r4.getLeft()
            android.view.View r5 = r10.f4661
            int r5 = r5.getTop()
            if (r2 == 0) goto L130
            android.view.View r6 = r10.f4661
            int r3 = r0.m4710(r6, r3)
            android.view.View r6 = r10.f4661
            int r4 = r3 - r4
            java.util.WeakHashMap r7 = p000.b92.f1572
            r6.offsetLeftAndRight(r4)
        L130:
            if (r1 == 0) goto L140
            android.view.View r4 = r10.f4661
            int r4 = r4.getTop()
            android.view.View r6 = r10.f4661
            int r4 = r4 - r5
            java.util.WeakHashMap r5 = p000.b92.f1572
            r6.offsetTopAndBottom(r4)
        L140:
            if (r2 != 0) goto L144
            if (r1 == 0) goto L149
        L144:
            android.view.View r1 = r10.f4661
            r0.m4711(r1, r3)
        L149:
            r10.m2474(r11)
            return
        L14d:
            int r0 = r11.getPointerCount()
        L151:
            if (r7 >= r0) goto L190
            int r1 = r11.getPointerId(r7)
            boolean r2 = r10.m2469(r1)
            if (r2 != 0) goto L15e
            goto L18d
        L15e:
            float r2 = r11.getX(r7)
            float r3 = r11.getY(r7)
            float[] r4 = r10.f4646
            r4 = r4[r1]
            float r4 = r2 - r4
            float[] r5 = r10.f4647
            r5 = r5[r1]
            float r5 = r3 - r5
            r10.m2472(r4, r5, r1)
            int r5 = r10.f4643
            if (r5 != r8) goto L17a
            goto L190
        L17a:
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r10.m2467(r2, r3)
            boolean r3 = r10.m2462(r2, r4)
            if (r3 == 0) goto L18d
            boolean r1 = r10.m2478(r2, r1)
            if (r1 == 0) goto L18d
            goto L190
        L18d:
            int r7 = r7 + 1
            goto L151
        L190:
            r10.m2474(r11)
            return
        L194:
            int r11 = r10.f4643
            if (r11 != r8) goto L19b
            r10.m2471()
        L19b:
            r10.m2459()
            return
        L19f:
            float r0 = r11.getX()
            float r3 = r11.getY()
            int r11 = r11.getPointerId(r7)
            int r4 = (int) r0
            int r7 = (int) r3
            android.view.View r4 = r10.m2467(r4, r7)
            r10.m2473(r0, r3, r11)
            r10.m2478(r4, r11)
            int[] r0 = r10.f4650
            r11 = r0[r11]
            int r10 = r10.f4658
            r10 = r10 & r11
            if (r10 == 0) goto L1c3
            r2.postDelayed(r1, r5)
        L1c3:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m2471() {
            r5 = this;
            android.view.VelocityTracker r0 = r5.f4654
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r5.f4655
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r5.f4654
            int r1 = r5.f4645
            float r0 = r0.getXVelocity(r1)
            float r1 = r5.f4656
            float r3 = java.lang.Math.abs(r0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r1 >= 0) goto L1e
            r2 = r4
            goto L2a
        L1e:
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L29
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L27
            goto L2a
        L27:
            float r2 = -r2
            goto L2a
        L29:
            r2 = r0
        L2a:
            android.view.VelocityTracker r0 = r5.f4654
            int r1 = r5.f4645
            float r0 = r0.getYVelocity(r1)
            java.lang.Math.abs(r0)
            r5.m2466(r2)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m2472(float r4, float r5, int r6) {
            r3 = this;
            r0 = 1
            boolean r1 = r3.m2461(r4, r5, r6, r0)
            r2 = 4
            boolean r2 = r3.m2461(r5, r4, r6, r2)
            if (r2 == 0) goto Le
            r1 = r1 | 4
        Le:
            r2 = 2
            boolean r2 = r3.m2461(r4, r5, r6, r2)
            if (r2 == 0) goto L17
            r1 = r1 | 2
        L17:
            r2 = 8
            boolean r4 = r3.m2461(r5, r4, r6, r2)
            if (r4 == 0) goto L21
            r1 = r1 | 8
        L21:
            if (r1 == 0) goto L4e
            int[] r4 = r3.f4651
            r5 = r4[r6]
            r5 = r5 | r1
            r4[r6] = r5
            r4 = r1 & 1
            q2 r3 = r3.f4660
            java.lang.Object r5 = r3.f8802
            androidx.drawerlayout.widget.DrawerLayout r5 = (androidx.drawerlayout.widget.DrawerLayout) r5
            if (r4 != r0) goto L3a
            r4 = 3
            android.view.View r4 = r5.m453(r4)
            goto L3f
        L3a:
            r4 = 5
            android.view.View r4 = r5.m453(r4)
        L3f:
            if (r4 == 0) goto L4e
            int r5 = r5.m455(r4)
            if (r5 != 0) goto L4e
            java.lang.Object r3 = r3.f8800
            h92 r3 = (p000.h92) r3
            r3.m2460(r4, r6)
        L4e:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m2473(float r11, float r12, int r13) {
            r10 = this;
            float[] r0 = r10.f4646
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r13) goto L50
        L8:
            int r2 = r13 + 1
            float[] r3 = new float[r2]
            float[] r4 = new float[r2]
            float[] r5 = new float[r2]
            float[] r6 = new float[r2]
            int[] r7 = new int[r2]
            int[] r8 = new int[r2]
            int[] r2 = new int[r2]
            if (r0 == 0) goto L42
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r1, r9)
            float[] r0 = r10.f4647
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r4, r1, r9)
            float[] r0 = r10.f4648
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r5, r1, r9)
            float[] r0 = r10.f4649
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r6, r1, r9)
            int[] r0 = r10.f4650
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r7, r1, r9)
            int[] r0 = r10.f4651
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r8, r1, r9)
            int[] r0 = r10.f4652
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r9)
        L42:
            r10.f4646 = r3
            r10.f4647 = r4
            r10.f4648 = r5
            r10.f4649 = r6
            r10.f4650 = r7
            r10.f4651 = r8
            r10.f4652 = r2
        L50:
            float[] r0 = r10.f4646
            float[] r2 = r10.f4648
            r2[r13] = r11
            r0[r13] = r11
            float[] r0 = r10.f4647
            float[] r2 = r10.f4649
            r2[r13] = r12
            r0[r13] = r12
            int[] r0 = r10.f4650
            int r11 = (int) r11
            int r12 = (int) r12
            androidx.drawerlayout.widget.DrawerLayout r2 = r10.f4663
            int r3 = r2.getLeft()
            int r4 = r10.f4657
            int r3 = r3 + r4
            r5 = 1
            if (r11 >= r3) goto L71
            r1 = r5
        L71:
            int r3 = r2.getTop()
            int r3 = r3 + r4
            if (r12 >= r3) goto L7a
            r1 = r1 | 4
        L7a:
            int r3 = r2.getRight()
            int r3 = r3 - r4
            if (r11 <= r3) goto L83
            r1 = r1 | 2
        L83:
            int r11 = r2.getBottom()
            int r11 = r11 - r4
            if (r12 <= r11) goto L8c
            r1 = r1 | 8
        L8c:
            r0[r13] = r1
            int r11 = r10.f4653
            int r12 = r5 << r13
            r11 = r11 | r12
            r10.f4653 = r11
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m2474(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L25
            int r2 = r7.getPointerId(r1)
            boolean r3 = r6.m2469(r2)
            if (r3 != 0) goto L12
            goto L22
        L12:
            float r3 = r7.getX(r1)
            float r4 = r7.getY(r1)
            float[] r5 = r6.f4648
            r5[r2] = r3
            float[] r3 = r6.f4649
            r3[r2] = r4
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m2475(int r8) {
            r7 = this;
            androidx.drawerlayout.widget.DrawerLayout r0 = r7.f4663
            d1 r1 = r7.f4664
            r0.removeCallbacks(r1)
            int r0 = r7.f4643
            if (r0 == r8) goto Lc9
            r7.f4643 = r8
            q2 r0 = r7.f4660
            java.lang.Object r1 = r0.f8802
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            java.lang.Object r0 = r0.f8800
            h92 r0 = (p000.h92) r0
            android.view.View r0 = r0.f4661
            h92 r2 = r1.f1077
            int r2 = r2.f4643
            h92 r3 = r1.f1078
            int r3 = r3.f4643
            r4 = 0
            r5 = 1
            if (r2 == r5) goto L30
            if (r3 != r5) goto L28
            goto L30
        L28:
            r6 = 2
            if (r2 == r6) goto L31
            if (r3 != r6) goto L2e
            goto L31
        L2e:
            r6 = r4
            goto L31
        L30:
            r6 = r5
        L31:
            if (r0 == 0) goto La9
            if (r8 != 0) goto La9
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            kw r8 = (p000.C0490kw) r8
            float r8 = r8.f6131
            r2 = 0
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r3 = 32
            if (r2 != 0) goto L77
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            kw r8 = (p000.C0490kw) r8
            int r2 = r8.f6133
            r2 = r2 & r5
            if (r2 != r5) goto La9
            r8.f6133 = r4
            java.util.ArrayList r8 = r1.f1089
            if (r8 == 0) goto L64
            int r8 = r8.size()
            int r8 = r8 - r5
            if (r8 >= 0) goto L5d
            goto L64
        L5d:
            java.util.ArrayList r7 = r1.f1089
            java.lang.ClassCastException r7 = p000.lz1.m3685(r8, r7)
            throw r7
        L64:
            r1.m460(r0, r4)
            boolean r8 = r1.hasWindowFocus()
            if (r8 == 0) goto La9
            android.view.View r8 = r1.getRootView()
            if (r8 == 0) goto La9
            r8.sendAccessibilityEvent(r3)
            goto La9
        L77:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto La9
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            kw r8 = (p000.C0490kw) r8
            int r2 = r8.f6133
            r2 = r2 & r5
            if (r2 != 0) goto La9
            r8.f6133 = r5
            java.util.ArrayList r8 = r1.f1089
            if (r8 == 0) goto L9d
            int r8 = r8.size()
            int r8 = r8 - r5
            if (r8 >= 0) goto L96
            goto L9d
        L96:
            java.util.ArrayList r7 = r1.f1089
            java.lang.ClassCastException r7 = p000.lz1.m3685(r8, r7)
            throw r7
        L9d:
            r1.m460(r0, r5)
            boolean r8 = r1.hasWindowFocus()
            if (r8 == 0) goto La9
            r1.sendAccessibilityEvent(r3)
        La9:
            int r8 = r1.f1081
            if (r6 == r8) goto Lc2
            r1.f1081 = r6
            java.util.ArrayList r8 = r1.f1089
            if (r8 == 0) goto Lc2
            int r8 = r8.size()
            int r8 = r8 - r5
            if (r8 >= 0) goto Lbb
            goto Lc2
        Lbb:
            java.util.ArrayList r7 = r1.f1089
            java.lang.ClassCastException r7 = p000.lz1.m3685(r8, r7)
            throw r7
        Lc2:
            int r8 = r7.f4643
            if (r8 != 0) goto Lc9
            r8 = 0
            r7.f4661 = r8
        Lc9:
            return
    }

    /* JADX INFO: renamed from: σ */
    public final boolean m2476(android.view.MotionEvent r14) {
            r13 = this;
            q2 r0 = r13.f4660
            java.lang.Object r1 = r0.f8801
            d1 r1 = (p000.RunnableC0196d1) r1
            java.lang.Object r2 = r0.f8802
            androidx.drawerlayout.widget.DrawerLayout r2 = (androidx.drawerlayout.widget.DrawerLayout) r2
            int r3 = r14.getActionMasked()
            int r4 = r14.getActionIndex()
            if (r3 != 0) goto L17
            r13.m2459()
        L17:
            android.view.VelocityTracker r5 = r13.f4654
            if (r5 != 0) goto L21
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r13.f4654 = r5
        L21:
            android.view.VelocityTracker r5 = r13.f4654
            r5.addMovement(r14)
            r5 = 160(0xa0, double:7.9E-322)
            r7 = 2
            r8 = 0
            r9 = 1
            if (r3 == 0) goto Lf9
            if (r3 == r9) goto Lf5
            if (r3 == r7) goto L77
            r0 = 3
            if (r3 == r0) goto Lf5
            r0 = 5
            if (r3 == r0) goto L45
            r0 = 6
            if (r3 == r0) goto L3c
            goto L125
        L3c:
            int r14 = r14.getPointerId(r4)
            r13.m2463(r14)
            goto L125
        L45:
            int r0 = r14.getPointerId(r4)
            float r3 = r14.getX(r4)
            float r14 = r14.getY(r4)
            r13.m2473(r3, r14, r0)
            int r4 = r13.f4643
            if (r4 != 0) goto L66
            int[] r14 = r13.f4650
            r14 = r14[r0]
            int r0 = r13.f4658
            r14 = r14 & r0
            if (r14 == 0) goto L125
            r2.postDelayed(r1, r5)
            goto L125
        L66:
            if (r4 != r7) goto L125
            int r1 = (int) r3
            int r14 = (int) r14
            android.view.View r14 = r13.m2467(r1, r14)
            android.view.View r1 = r13.f4661
            if (r14 != r1) goto L125
            r13.m2478(r14, r0)
            goto L125
        L77:
            float[] r1 = r13.f4646
            if (r1 == 0) goto L125
            float[] r1 = r13.f4647
            if (r1 != 0) goto L81
            goto L125
        L81:
            int r1 = r14.getPointerCount()
            r2 = r8
        L86:
            if (r2 >= r1) goto Lf1
            int r3 = r14.getPointerId(r2)
            boolean r4 = r13.m2469(r3)
            if (r4 != 0) goto L93
            goto Lee
        L93:
            float r4 = r14.getX(r2)
            float r5 = r14.getY(r2)
            float[] r6 = r13.f4646
            r6 = r6[r3]
            float r6 = r4 - r6
            float[] r7 = r13.f4647
            r7 = r7[r3]
            float r7 = r5 - r7
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r13.m2467(r4, r5)
            if (r4 == 0) goto Lb7
            boolean r5 = r13.m2462(r4, r6)
            if (r5 == 0) goto Lb7
            r5 = r9
            goto Lb8
        Lb7:
            r5 = r8
        Lb8:
            if (r5 == 0) goto Ldd
            int r10 = r4.getLeft()
            int r11 = (int) r6
            int r11 = r11 + r10
            int r11 = r0.m4710(r4, r11)
            r4.getTop()
            r4.getTop()
            boolean r12 = androidx.drawerlayout.widget.DrawerLayout.m449(r4)
            if (r12 == 0) goto Ld5
            int r12 = r4.getWidth()
            goto Ld6
        Ld5:
            r12 = r8
        Ld6:
            if (r12 == 0) goto Lf1
            if (r12 <= 0) goto Ldd
            if (r11 != r10) goto Ldd
            goto Lf1
        Ldd:
            r13.m2472(r6, r7, r3)
            int r6 = r13.f4643
            if (r6 != r9) goto Le5
            goto Lf1
        Le5:
            if (r5 == 0) goto Lee
            boolean r3 = r13.m2478(r4, r3)
            if (r3 == 0) goto Lee
            goto Lf1
        Lee:
            int r2 = r2 + 1
            goto L86
        Lf1:
            r13.m2474(r14)
            goto L125
        Lf5:
            r13.m2459()
            goto L125
        Lf9:
            float r0 = r14.getX()
            float r3 = r14.getY()
            int r14 = r14.getPointerId(r8)
            r13.m2473(r0, r3, r14)
            int r0 = (int) r0
            int r3 = (int) r3
            android.view.View r0 = r13.m2467(r0, r3)
            android.view.View r3 = r13.f4661
            if (r0 != r3) goto L119
            int r3 = r13.f4643
            if (r3 != r7) goto L119
            r13.m2478(r0, r14)
        L119:
            int[] r0 = r13.f4650
            r14 = r0[r14]
            int r0 = r13.f4658
            r14 = r14 & r0
            if (r14 == 0) goto L125
            r2.postDelayed(r1, r5)
        L125:
            int r13 = r13.f4643
            if (r13 != r9) goto L12a
            return r9
        L12a:
            return r8
    }

    /* JADX INFO: renamed from: τ */
    public final boolean m2477(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.f4661 = r1
            r1 = -1
            r0.f4645 = r1
            r1 = 0
            boolean r1 = r0.m2468(r2, r3, r1, r1)
            if (r1 != 0) goto L17
            int r2 = r0.f4643
            if (r2 != 0) goto L17
            android.view.View r2 = r0.f4661
            if (r2 == 0) goto L17
            r2 = 0
            r0.f4661 = r2
        L17:
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public final boolean m2478(android.view.View r5, int r6) {
            r4 = this;
            android.view.View r0 = r4.f4661
            r1 = 1
            if (r5 != r0) goto La
            int r0 = r4.f4645
            if (r0 != r6) goto La
            return r1
        La:
            if (r5 == 0) goto L2c
            q2 r0 = r4.f4660
            java.lang.Object r2 = r0.f8802
            androidx.drawerlayout.widget.DrawerLayout r2 = (androidx.drawerlayout.widget.DrawerLayout) r2
            boolean r3 = androidx.drawerlayout.widget.DrawerLayout.m449(r5)
            if (r3 == 0) goto L2c
            int r0 = r0.f8799
            boolean r0 = r2.m450(r5, r0)
            if (r0 == 0) goto L2c
            int r0 = r2.m455(r5)
            if (r0 != 0) goto L2c
            r4.f4645 = r6
            r4.m2460(r5, r6)
            return r1
        L2c:
            r4 = 0
            return r4
    }
}
