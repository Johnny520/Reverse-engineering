package defpackage;

/* JADX INFO: renamed from: ᛷᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1252 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f5583;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0055 f5584;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.widget.OverScroller f5585;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f5586;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f5587;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.view.animation.Interpolator f5588;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f5589;

    public RunnableC1252(defpackage.C0055 r3) {
            r2 = this;
            r2.<init>()
            r2.f5584 = r3
            ᛵᛳᛱᛳ r0 = defpackage.C0055.f609
            r2.f5588 = r0
            r1 = 0
            r2.f5589 = r1
            r2.f5583 = r1
            android.widget.OverScroller r1 = new android.widget.OverScroller
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r0)
            r2.f5585 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r14 = this;
            ᛱᛳᛶᛱ r0 = r14.f5584
            int[] r8 = r0.f662
            ᛷᛵᛱᲀ r1 = r0.f682
            if (r1 != 0) goto L11
            r0.removeCallbacks(r14)
            android.widget.OverScroller r14 = r14.f5585
            r14.abortAnimation()
            return
        L11:
            r9 = 0
            r14.f5583 = r9
            r10 = 1
            r14.f5589 = r10
            r0.m446()
            android.widget.OverScroller r11 = r14.f5585
            boolean r1 = r11.computeScrollOffset()
            if (r1 == 0) goto L1b1
            int r1 = r11.getCurrX()
            int r2 = r11.getCurrY()
            int r3 = r14.f5587
            int r3 = r1 - r3
            int r4 = r14.f5586
            int r4 = r2 - r4
            r14.f5587 = r1
            r14.f5586 = r2
            android.widget.EdgeEffect r1 = r0.f650
            android.widget.EdgeEffect r2 = r0.f626
            int r5 = r0.getWidth()
            int r1 = defpackage.C0055.m400(r3, r1, r2, r5)
            android.widget.EdgeEffect r2 = r0.f657
            android.widget.EdgeEffect r3 = r0.f680
            int r5 = r0.getHeight()
            int r2 = defpackage.C0055.m400(r4, r2, r3, r5)
            int[] r4 = r0.f662
            r4[r9] = r9
            r4[r10] = r9
            r5 = 0
            r3 = 1
            boolean r3 = r0.m425(r1, r2, r3, r4, r5)
            if (r3 == 0) goto L62
            r3 = r8[r9]
            int r1 = r1 - r3
            r3 = r8[r10]
            int r2 = r2 - r3
        L62:
            int r3 = r0.getOverScrollMode()
            r12 = 2
            if (r3 == r12) goto L6c
            r0.m415(r1, r2)
        L6c:
            ᛶᲈᲀᲇ r3 = r0.f633
            if (r3 == 0) goto Lac
            r8[r9] = r9
            r8[r10] = r9
            r0.m443(r1, r2, r8)
            r3 = r8[r9]
            r4 = r8[r10]
            int r1 = r1 - r3
            int r2 = r2 - r4
            ᛷᛵᛱᲀ r5 = r0.f682
            ᛱᛶᛲ r5 = r5.f5684
            if (r5 == 0) goto La5
            boolean r6 = r5.f946
            if (r6 != 0) goto La5
            boolean r6 = r5.f944
            if (r6 == 0) goto La5
            ᛵᲈᲁᲀ r6 = r0.f623
            int r6 = r6.m1957()
            if (r6 != 0) goto L97
            r5.m598()
            goto La5
        L97:
            int r7 = r5.f948
            if (r7 < r6) goto La2
            int r6 = r6 - r10
            r5.f948 = r6
            r5.m599(r3, r4)
            goto La5
        La2:
            r5.m599(r3, r4)
        La5:
            r13 = r3
            r3 = r1
            r1 = r13
            r13 = r4
            r4 = r2
            r2 = r13
            goto Lb0
        Lac:
            r3 = r1
            r4 = r2
            r1 = r9
            r2 = r1
        Lb0:
            java.util.ArrayList r5 = r0.f677
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lbb
            r0.invalidate()
        Lbb:
            int[] r7 = r0.f662
            r7[r9] = r9
            r7[r10] = r9
            r5 = 0
            r6 = 1
            r0.m420(r1, r2, r3, r4, r5, r6, r7)
            r5 = r8[r9]
            int r3 = r3 - r5
            r5 = r8[r10]
            int r4 = r4 - r5
            if (r1 != 0) goto Ld0
            if (r2 == 0) goto Ld3
        Ld0:
            r0.m444(r1, r2)
        Ld3:
            boolean r5 = defpackage.C0055.m403(r0)
            if (r5 != 0) goto Ldc
            r0.invalidate()
        Ldc:
            int r5 = r11.getCurrX()
            int r6 = r11.getFinalX()
            if (r5 != r6) goto Le8
            r5 = r10
            goto Le9
        Le8:
            r5 = r9
        Le9:
            int r6 = r11.getCurrY()
            int r7 = r11.getFinalY()
            if (r6 != r7) goto Lf5
            r6 = r10
            goto Lf6
        Lf5:
            r6 = r9
        Lf6:
            boolean r7 = r11.isFinished()
            if (r7 != 0) goto L107
            if (r5 != 0) goto L100
            if (r3 == 0) goto L105
        L100:
            if (r6 != 0) goto L107
            if (r4 == 0) goto L105
            goto L107
        L105:
            r5 = r9
            goto L108
        L107:
            r5 = r10
        L108:
            ᛷᛵᛱᲀ r6 = r0.f682
            ᛱᛶᛲ r6 = r6.f5684
            if (r6 == 0) goto L114
            boolean r6 = r6.f946
            if (r6 == 0) goto L114
            goto L196
        L114:
            if (r5 == 0) goto L196
            int r1 = r0.getOverScrollMode()
            if (r1 == r12) goto L185
            float r1 = r11.getCurrVelocity()
            int r1 = (int) r1
            if (r3 >= 0) goto L125
            int r2 = -r1
            goto L12a
        L125:
            if (r3 <= 0) goto L129
            r2 = r1
            goto L12a
        L129:
            r2 = r9
        L12a:
            if (r4 >= 0) goto L12e
            int r1 = -r1
            goto L132
        L12e:
            if (r4 <= 0) goto L131
            goto L132
        L131:
            r1 = r9
        L132:
            if (r2 >= 0) goto L146
            r0.m454()
            android.widget.EdgeEffect r3 = r0.f650
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L158
            android.widget.EdgeEffect r3 = r0.f650
            int r4 = -r2
            r3.onAbsorb(r4)
            goto L158
        L146:
            if (r2 <= 0) goto L158
            r0.m463()
            android.widget.EdgeEffect r3 = r0.f626
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L158
            android.widget.EdgeEffect r3 = r0.f626
            r3.onAbsorb(r2)
        L158:
            if (r1 >= 0) goto L16c
            r0.m460()
            android.widget.EdgeEffect r3 = r0.f657
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L17e
            android.widget.EdgeEffect r3 = r0.f657
            int r4 = -r1
            r3.onAbsorb(r4)
            goto L17e
        L16c:
            if (r1 <= 0) goto L17e
            r0.m449()
            android.widget.EdgeEffect r3 = r0.f680
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L17e
            android.widget.EdgeEffect r3 = r0.f680
            r3.onAbsorb(r1)
        L17e:
            if (r2 != 0) goto L182
            if (r1 == 0) goto L185
        L182:
            r0.postInvalidateOnAnimation()
        L185:
            boolean r1 = defpackage.C0055.f608
            if (r1 == 0) goto L1a0
            ᛱᛷᛴᲁ r1 = r0.f669
            int[] r2 = r1.f1059
            if (r2 == 0) goto L193
            r3 = -1
            java.util.Arrays.fill(r2, r3)
        L193:
            r1.f1058 = r9
            goto L1a0
        L196:
            r14.m2358()
            ᲁᛷᛱᲀ r3 = r0.f646
            if (r3 == 0) goto L1a0
            r3.m3289(r0, r1, r2)
        L1a0:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L1b1
            float r1 = r11.getCurrVelocity()
            float r1 = java.lang.Math.abs(r1)
            defpackage.AbstractC2227.m3617(r0, r1)
        L1b1:
            ᛷᛵᛱᲀ r1 = r0.f682
            ᛱᛶᛲ r1 = r1.f5684
            if (r1 == 0) goto L1be
            boolean r2 = r1.f946
            if (r2 == 0) goto L1be
            r1.m599(r9, r9)
        L1be:
            r14.f5589 = r9
            boolean r1 = r14.f5583
            if (r1 == 0) goto L1cd
            r0.removeCallbacks(r14)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            r0.postOnAnimation(r14)
            return
        L1cd:
            r0.setScrollState(r9)
            r0.m424(r10)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m2356(int r10, int r11, int r12, android.view.animation.BaseInterpolator r13) {
            r9 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            ᛱᛳᛶᛱ r2 = r9.f5584
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
            ᛵᛳᛱᛳ r13 = defpackage.C0055.f609
        L38:
            android.view.animation.Interpolator r12 = r9.f5588
            if (r12 == r13) goto L49
            r9.f5588 = r13
            android.widget.OverScroller r12 = new android.widget.OverScroller
            android.content.Context r0 = r2.getContext()
            r12.<init>(r0, r13)
            r9.f5585 = r12
        L49:
            r9.f5586 = r1
            r9.f5587 = r1
            r12 = 2
            r2.setScrollState(r12)
            android.widget.OverScroller r3 = r9.f5585
            r4 = 0
            r5 = 0
            r6 = r10
            r7 = r11
            r3.startScroll(r4, r5, r6, r7, r8)
            r9.m2358()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2357(int r13, int r14) {
            r12 = this;
            r0 = 2
            ᛱᛳᛶᛱ r1 = r12.f5584
            r1.setScrollState(r0)
            r0 = 0
            r12.f5586 = r0
            r12.f5587 = r0
            android.view.animation.Interpolator r0 = r12.f5588
            ᛵᛳᛱᛳ r2 = defpackage.C0055.f609
            if (r0 == r2) goto L1e
            r12.f5588 = r2
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            r12.f5585 = r0
        L1e:
            android.widget.OverScroller r3 = r12.f5585
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = r13
            r7 = r14
            r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.m2358()
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2358() {
            r2 = this;
            boolean r0 = r2.f5589
            if (r0 == 0) goto L8
            r0 = 1
            r2.f5583 = r0
            return
        L8:
            ᛱᛳᛶᛱ r0 = r2.f5584
            r0.removeCallbacks(r2)
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            r0.postOnAnimation(r2)
            return
    }
}
