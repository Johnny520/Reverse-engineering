package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public int f7678;

    /* JADX INFO: renamed from: ζ */
    public int f7679;

    /* JADX INFO: renamed from: η */
    public android.widget.OverScroller f7680;

    /* JADX INFO: renamed from: θ */
    public android.view.animation.Interpolator f7681;

    /* JADX INFO: renamed from: ι */
    public boolean f7682;

    /* JADX INFO: renamed from: κ */
    public boolean f7683;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f7684;

    public nm1(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            r2.<init>()
            r2.f7684 = r3
            rl1 r0 = androidx.recyclerview.widget.RecyclerView.f1124
            r2.f7681 = r0
            r1 = 0
            r2.f7682 = r1
            r2.f7683 = r1
            android.widget.OverScroller r1 = new android.widget.OverScroller
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r0)
            r2.f7680 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r15.f7684
            int[] r6 = r0.f1181
            zl1 r1 = r0.f1160
            if (r1 != 0) goto L11
            r0.removeCallbacks(r15)
            android.widget.OverScroller r15 = r15.f7680
            r15.abortAnimation()
            return
        L11:
            r7 = 0
            r15.f7683 = r7
            r8 = 1
            r15.f7682 = r8
            r0.m520()
            android.widget.OverScroller r9 = r15.f7680
            boolean r1 = r9.computeScrollOffset()
            r10 = 2
            if (r1 == 0) goto L161
            int r1 = r9.getCurrX()
            int r2 = r9.getCurrY()
            int r3 = r15.f7678
            int r3 = r1 - r3
            int r4 = r15.f7679
            int r4 = r2 - r4
            r15.f7678 = r1
            r15.f7679 = r2
            android.widget.EdgeEffect r1 = r0.f1133
            android.widget.EdgeEffect r2 = r0.f1135
            int r5 = r0.getWidth()
            int r1 = androidx.recyclerview.widget.RecyclerView.m506(r3, r1, r2, r5)
            android.widget.EdgeEffect r2 = r0.f1134
            android.widget.EdgeEffect r3 = r0.f1136
            int r5 = r0.getHeight()
            int r2 = androidx.recyclerview.widget.RecyclerView.m506(r4, r2, r3, r5)
            int[] r4 = r0.f1181
            r4[r7] = r7
            r4[r8] = r7
            r5 = 0
            r3 = 1
            boolean r3 = r0.m522(r1, r2, r3, r4, r5)
            if (r3 == 0) goto L63
            r3 = r6[r7]
            int r1 = r1 - r3
            r3 = r6[r8]
            int r2 = r2 - r3
        L63:
            int r3 = r0.getOverScrollMode()
            if (r3 == r10) goto L6c
            r0.m519(r1, r2)
        L6c:
            java.util.ArrayList r3 = r0.f1161
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L77
            r0.invalidate()
        L77:
            int[] r5 = r0.f1181
            r5[r7] = r7
            r5[r8] = r7
            r4 = 0
            r3 = 1
            r0.m523(r1, r2, r3, r4, r5)
            r3 = r6[r7]
            int r1 = r1 - r3
            r3 = r6[r8]
            int r2 = r2 - r3
            boolean r3 = androidx.recyclerview.widget.RecyclerView.m505(r0)
            if (r3 != 0) goto L91
            r0.invalidate()
        L91:
            int r3 = r9.getCurrX()
            int r4 = r9.getFinalX()
            if (r3 != r4) goto L9d
            r3 = r8
            goto L9e
        L9d:
            r3 = r7
        L9e:
            int r4 = r9.getCurrY()
            int r5 = r9.getFinalY()
            if (r4 != r5) goto Laa
            r4 = r8
            goto Lab
        Laa:
            r4 = r7
        Lab:
            boolean r5 = r9.isFinished()
            if (r5 != 0) goto Lbc
            if (r3 != 0) goto Lb5
            if (r1 == 0) goto Lba
        Lb5:
            if (r4 != 0) goto Lbc
            if (r2 == 0) goto Lba
            goto Lbc
        Lba:
            r3 = r7
            goto Lbd
        Lbc:
            r3 = r8
        Lbd:
            zl1 r4 = r0.f1160
            ds0 r4 = r4.f13156
            if (r4 == 0) goto Lc9
            boolean r4 = r4.f3255
            if (r4 == 0) goto Lc9
            goto L146
        Lc9:
            if (r3 == 0) goto L146
            int r3 = r0.getOverScrollMode()
            if (r3 == r10) goto L13a
            float r3 = r9.getCurrVelocity()
            int r3 = (int) r3
            if (r1 >= 0) goto Lda
            int r1 = -r3
            goto Ldf
        Lda:
            if (r1 <= 0) goto Lde
            r1 = r3
            goto Ldf
        Lde:
            r1 = r7
        Ldf:
            if (r2 >= 0) goto Le3
            int r3 = -r3
            goto Le7
        Le3:
            if (r2 <= 0) goto Le6
            goto Le7
        Le6:
            r3 = r7
        Le7:
            if (r1 >= 0) goto Lfb
            r0.m525()
            android.widget.EdgeEffect r2 = r0.f1133
            boolean r2 = r2.isFinished()
            if (r2 == 0) goto L10d
            android.widget.EdgeEffect r2 = r0.f1133
            int r4 = -r1
            r2.onAbsorb(r4)
            goto L10d
        Lfb:
            if (r1 <= 0) goto L10d
            r0.m526()
            android.widget.EdgeEffect r2 = r0.f1135
            boolean r2 = r2.isFinished()
            if (r2 == 0) goto L10d
            android.widget.EdgeEffect r2 = r0.f1135
            r2.onAbsorb(r1)
        L10d:
            if (r3 >= 0) goto L121
            r0.m527()
            android.widget.EdgeEffect r2 = r0.f1134
            boolean r2 = r2.isFinished()
            if (r2 == 0) goto L133
            android.widget.EdgeEffect r2 = r0.f1134
            int r4 = -r3
            r2.onAbsorb(r4)
            goto L133
        L121:
            if (r3 <= 0) goto L133
            r0.m524()
            android.widget.EdgeEffect r2 = r0.f1136
            boolean r2 = r2.isFinished()
            if (r2 == 0) goto L133
            android.widget.EdgeEffect r2 = r0.f1136
            r2.onAbsorb(r3)
        L133:
            if (r1 != 0) goto L137
            if (r3 == 0) goto L13a
        L137:
            r0.postInvalidateOnAnimation()
        L13a:
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f1122
            if (r1 == 0) goto L150
            b90 r1 = r0.f1173
            r1.getClass()
            r1.f1567 = r7
            goto L150
        L146:
            r15.m4084()
            d90 r1 = r0.f1172
            if (r1 == 0) goto L150
            r1.m1675(r0, r7, r7)
        L150:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L161
            float r1 = r9.getCurrVelocity()
            float r1 = java.lang.Math.abs(r1)
            p000.ul1.m5936(r0, r1)
        L161:
            zl1 r1 = r0.f1160
            ds0 r1 = r1.f13156
            if (r1 == 0) goto L3a1
            boolean r2 = r1.f3255
            if (r2 == 0) goto L3a1
            im1 r2 = r1.f3258
            androidx.recyclerview.widget.RecyclerView r3 = r1.f3253
            int r4 = r1.f3252
            r5 = -1
            if (r4 == r5) goto L176
            if (r3 != 0) goto L179
        L176:
            r1.m1798()
        L179:
            boolean r4 = r1.f3255
            r6 = 0
            if (r4 == 0) goto L1fe
            android.view.View r4 = r1.f3257
            if (r4 != 0) goto L1fe
            zl1 r4 = r1.f3254
            if (r4 == 0) goto L1fe
            int r4 = r1.f3252
            android.graphics.PointF r4 = r1.m1797(r4)
            if (r4 == 0) goto L1fe
            float r9 = r4.x
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 != 0) goto L19a
            float r11 = r4.y
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L1fe
        L19a:
            float r9 = java.lang.Math.signum(r9)
            int r9 = (int) r9
            float r4 = r4.y
            float r4 = java.lang.Math.signum(r4)
            int r4 = (int) r4
            fm1 r11 = r3.f1151
            r3.m514()
            r3.m535()
            java.lang.String r12 = "RV Scroll"
            android.os.Trace.beginSection(r12)
            km1 r12 = r3.f1174
            int r13 = r3.getScrollState()
            if (r13 != r10) goto L1cf
            nm1 r10 = r3.f1171
            android.widget.OverScroller r10 = r10.f7680
            r10.getFinalX()
            r10.getCurrX()
            r12.getClass()
            r10.getFinalY()
            r10.getCurrY()
            goto L1d2
        L1cf:
            r12.getClass()
        L1d2:
            if (r9 == 0) goto L1d9
            zl1 r10 = r3.f1160
            r10.mo468(r9, r11, r12)
        L1d9:
            if (r4 == 0) goto L1e0
            zl1 r9 = r3.f1160
            r9.mo469(r4, r11, r12)
        L1e0:
            android.os.Trace.endSection()
            m6 r4 = r3.f1154
            int r4 = r4.m3789()
            r9 = r7
        L1ea:
            if (r9 >= r4) goto L1f8
            m6 r10 = r3.f1154
            android.view.View r10 = r10.m3788(r9)
            r3.m532(r10)
            int r9 = r9 + 1
            goto L1ea
        L1f8:
            r3.m536(r8)
            r3.m516(r7)
        L1fe:
            r1.f3255 = r7
            android.view.View r4 = r1.f3257
            if (r4 == 0) goto L2fe
            androidx.recyclerview.widget.RecyclerView r9 = r1.f3253
            r9.getClass()
            androidx.recyclerview.widget.RecyclerView.m507(r4)
            int r4 = r1.f3252
            if (r5 != r4) goto L2f4
            android.view.View r4 = r1.f3257
            km1 r9 = r3.f1174
            android.graphics.PointF r9 = r1.f3262
            if (r9 == 0) goto L225
            float r9 = r9.x
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L21f
            goto L225
        L21f:
            if (r9 <= 0) goto L223
            r9 = r8
            goto L226
        L223:
            r9 = r5
            goto L226
        L225:
            r9 = r7
        L226:
            zl1 r10 = r1.f3254
            if (r10 == 0) goto L26b
            boolean r11 = r10.mo492()
            if (r11 != 0) goto L231
            goto L26b
        L231:
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            am1 r11 = (p000.am1) r11
            int r12 = r4.getLeft()
            android.view.ViewGroup$LayoutParams r13 = r4.getLayoutParams()
            am1 r13 = (p000.am1) r13
            android.graphics.Rect r13 = r13.f326
            int r13 = r13.left
            int r12 = r12 - r13
            int r13 = r11.leftMargin
            int r12 = r12 - r13
            int r13 = r4.getRight()
            android.view.ViewGroup$LayoutParams r14 = r4.getLayoutParams()
            am1 r14 = (p000.am1) r14
            android.graphics.Rect r14 = r14.f326
            int r14 = r14.right
            int r13 = r13 + r14
            int r11 = r11.rightMargin
            int r13 = r13 + r11
            int r11 = r10.m7177()
            int r14 = r10.f13160
            int r10 = r10.m7178()
            int r14 = r14 - r10
            int r9 = p000.ds0.m1795(r12, r13, r11, r14, r9)
            goto L26c
        L26b:
            r9 = r7
        L26c:
            android.graphics.PointF r10 = r1.f3262
            if (r10 == 0) goto L27b
            float r10 = r10.y
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 != 0) goto L277
            goto L27b
        L277:
            if (r10 <= 0) goto L27c
            r5 = r8
            goto L27c
        L27b:
            r5 = r7
        L27c:
            zl1 r10 = r1.f3254
            if (r10 == 0) goto L2c1
            boolean r11 = r10.mo493()
            if (r11 != 0) goto L287
            goto L2c1
        L287:
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            am1 r11 = (p000.am1) r11
            int r12 = r4.getTop()
            android.view.ViewGroup$LayoutParams r13 = r4.getLayoutParams()
            am1 r13 = (p000.am1) r13
            android.graphics.Rect r13 = r13.f326
            int r13 = r13.top
            int r12 = r12 - r13
            int r13 = r11.topMargin
            int r12 = r12 - r13
            int r13 = r4.getBottom()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            am1 r4 = (p000.am1) r4
            android.graphics.Rect r4 = r4.f326
            int r4 = r4.bottom
            int r13 = r13 + r4
            int r4 = r11.bottomMargin
            int r13 = r13 + r4
            int r4 = r10.m7179()
            int r11 = r10.f13161
            int r10 = r10.m7176()
            int r11 = r11 - r10
            int r4 = p000.ds0.m1795(r12, r13, r4, r11, r5)
            goto L2c2
        L2c1:
            r4 = r7
        L2c2:
            int r5 = r9 * r9
            int r10 = r4 * r4
            int r10 = r10 + r5
            double r10 = (double) r10
            double r10 = java.lang.Math.sqrt(r10)
            int r5 = (int) r10
            int r5 = r1.m1796(r5)
            double r10 = (double) r5
            r12 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r10 = r10 / r12
            double r10 = java.lang.Math.ceil(r10)
            int r5 = (int) r10
            if (r5 <= 0) goto L2ed
            int r9 = -r9
            int r4 = -r4
            android.view.animation.DecelerateInterpolator r10 = r1.f3261
            r2.f5127 = r9
            r2.f5128 = r4
            r2.f5129 = r5
            r2.f5131 = r10
            r2.f5132 = r8
        L2ed:
            r2.m2763(r3)
            r1.m1798()
            goto L2fe
        L2f4:
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r4, r5)
            r4 = 0
            r1.f3257 = r4
        L2fe:
            boolean r4 = r1.f3256
            if (r4 == 0) goto L3a1
            km1 r4 = r3.f1174
            androidx.recyclerview.widget.RecyclerView r4 = r1.f3253
            zl1 r4 = r4.f1160
            int r4 = r4.m7175()
            if (r4 != 0) goto L313
            r1.m1798()
            goto L38a
        L313:
            int r4 = r1.f3266
            int r5 = r4 * r4
            if (r5 > 0) goto L31a
            r4 = r7
        L31a:
            r1.f3266 = r4
            int r5 = r1.f3267
            int r9 = r5 * r5
            if (r9 > 0) goto L323
            r5 = r7
        L323:
            r1.f3267 = r5
            if (r4 != 0) goto L38a
            if (r5 != 0) goto L38a
            int r4 = r1.f3252
            android.graphics.PointF r4 = r1.m1797(r4)
            if (r4 == 0) goto L383
            float r5 = r4.x
            int r9 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r9 != 0) goto L33e
            float r9 = r4.y
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 != 0) goto L33e
            goto L383
        L33e:
            float r5 = r5 * r5
            float r6 = r4.y
            float r6 = r6 * r6
            float r6 = r6 + r5
            double r5 = (double) r6
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            float r6 = r4.x
            float r6 = r6 / r5
            r4.x = r6
            float r9 = r4.y
            float r9 = r9 / r5
            r4.y = r9
            r1.f3262 = r4
            r4 = 1176256512(0x461c4000, float:10000.0)
            float r6 = r6 * r4
            int r5 = (int) r6
            r1.f3266 = r5
            float r9 = r9 * r4
            int r4 = (int) r9
            r1.f3267 = r4
            r4 = 10000(0x2710, float:1.4013E-41)
            int r4 = r1.m1796(r4)
            int r5 = r1.f3266
            float r5 = (float) r5
            r6 = 1067030938(0x3f99999a, float:1.2)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r9 = r1.f3267
            float r9 = (float) r9
            float r9 = r9 * r6
            int r9 = (int) r9
            float r4 = (float) r4
            float r4 = r4 * r6
            int r4 = (int) r4
            android.view.animation.LinearInterpolator r6 = r1.f3260
            r2.f5127 = r5
            r2.f5128 = r9
            r2.f5129 = r4
            r2.f5131 = r6
            r2.f5132 = r8
            goto L38a
        L383:
            int r4 = r1.f3252
            r2.f5130 = r4
            r1.m1798()
        L38a:
            int r4 = r2.f5130
            if (r4 < 0) goto L390
            r4 = r8
            goto L391
        L390:
            r4 = r7
        L391:
            r2.m2763(r3)
            if (r4 == 0) goto L3a1
            boolean r2 = r1.f3256
            if (r2 == 0) goto L3a1
            r1.f3255 = r8
            nm1 r1 = r3.f1171
            r1.m4084()
        L3a1:
            r15.f7682 = r7
            boolean r1 = r15.f7683
            if (r1 == 0) goto L3b0
            r0.removeCallbacks(r15)
            java.util.WeakHashMap r1 = p000.b92.f1572
            r0.postOnAnimation(r15)
            return
        L3b0:
            r0.setScrollState(r7)
            r0.m517(r8)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4083(int r13, int r14) {
            r12 = this;
            r0 = 2
            androidx.recyclerview.widget.RecyclerView r1 = r12.f7684
            r1.setScrollState(r0)
            r0 = 0
            r12.f7679 = r0
            r12.f7678 = r0
            android.view.animation.Interpolator r0 = r12.f7681
            rl1 r2 = androidx.recyclerview.widget.RecyclerView.f1124
            if (r0 == r2) goto L1e
            r12.f7681 = r2
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            r12.f7680 = r0
        L1e:
            android.widget.OverScroller r3 = r12.f7680
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = r13
            r7 = r14
            r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.m4084()
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m4084() {
            r2 = this;
            boolean r0 = r2.f7682
            if (r0 == 0) goto L8
            r0 = 1
            r2.f7683 = r0
            return
        L8:
            androidx.recyclerview.widget.RecyclerView r0 = r2.f7684
            r0.removeCallbacks(r2)
            java.util.WeakHashMap r1 = p000.b92.f1572
            r0.postOnAnimation(r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4085(int r10, int r11, int r12, android.view.animation.Interpolator r13) {
            r9 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            androidx.recyclerview.widget.RecyclerView r2 = r9.f7684
            if (r12 != r0) goto L33
            int r12 = java.lang.Math.abs(r10)
            int r0 = java.lang.Math.abs(r11)
            if (r12 <= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 == 0) goto L1b
            int r4 = r2.getWidth()
            goto L1f
        L1b:
            int r4 = r2.getHeight()
        L1f:
            if (r3 == 0) goto L22
            goto L23
        L22:
            r12 = r0
        L23:
            float r12 = (float) r12
            float r0 = (float) r4
            float r12 = r12 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 + r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r12 = r12 * r0
            int r12 = (int) r12
            r0 = 2000(0x7d0, float:2.803E-42)
            int r12 = java.lang.Math.min(r12, r0)
        L33:
            r8 = r12
            if (r13 != 0) goto L38
            rl1 r13 = androidx.recyclerview.widget.RecyclerView.f1124
        L38:
            android.view.animation.Interpolator r12 = r9.f7681
            if (r12 == r13) goto L49
            r9.f7681 = r13
            android.widget.OverScroller r12 = new android.widget.OverScroller
            android.content.Context r0 = r2.getContext()
            r12.<init>(r0, r13)
            r9.f7680 = r12
        L49:
            r9.f7679 = r1
            r9.f7678 = r1
            r12 = 2
            r2.setScrollState(r12)
            android.widget.OverScroller r3 = r9.f7680
            r4 = 0
            r5 = 0
            r6 = r10
            r7 = r11
            r3.startScroll(r4, r5, r6, r7, r8)
            r9.m4084()
            return
    }
}
