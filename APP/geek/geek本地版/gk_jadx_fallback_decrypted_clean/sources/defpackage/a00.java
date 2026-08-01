package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a00 implements java.lang.Runnable {
    public int a;
    public int b;
    public android.widget.OverScroller c;
    public android.view.animation.Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView g;

    public a00(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            r2.<init>()
            r2.g = r3
            dz r0 = androidx.recyclerview.widget.RecyclerView.u0
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r1
            android.widget.OverScroller r1 = new android.widget.OverScroller
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r0)
            r2.c = r1
            return
    }

    public final void a() {
            r2 = this;
            boolean r0 = r2.e
            if (r0 == 0) goto L8
            r0 = 1
            r2.f = r0
            return
        L8:
            androidx.recyclerview.widget.RecyclerView r0 = r2.g
            r0.removeCallbacks(r2)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.m(r0, r2)
            return
    }

    public final void b(int r12, int r13, int r14, android.view.animation.Interpolator r15) {
            r11 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            androidx.recyclerview.widget.RecyclerView r2 = r11.g
            if (r14 != r0) goto L6f
            int r14 = java.lang.Math.abs(r12)
            int r0 = java.lang.Math.abs(r13)
            if (r14 <= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = r1
        L14:
            double r4 = (double) r1
            double r4 = java.lang.Math.sqrt(r4)
            int r4 = (int) r4
            int r5 = r12 * r12
            int r6 = r13 * r13
            int r6 = r6 + r5
            double r5 = (double) r6
            double r5 = java.lang.Math.sqrt(r5)
            int r5 = (int) r5
            if (r3 == 0) goto L2c
            int r6 = r2.getWidth()
            goto L30
        L2c:
            int r6 = r2.getHeight()
        L30:
            int r7 = r6 / 2
            float r5 = (float) r5
            r8 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r8
            float r6 = (float) r6
            float r5 = r5 / r6
            float r5 = java.lang.Math.min(r8, r5)
            float r7 = (float) r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 - r9
            r9 = 1055999547(0x3ef1463b, float:0.47123894)
            float r5 = r5 * r9
            double r9 = (double) r5
            double r9 = java.lang.Math.sin(r9)
            float r5 = (float) r9
            float r5 = r5 * r7
            float r5 = r5 + r7
            if (r4 <= 0) goto L5e
            float r14 = (float) r4
            float r5 = r5 / r14
            float r14 = java.lang.Math.abs(r5)
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r14 = r14 * r0
            int r14 = java.lang.Math.round(r14)
            int r14 = r14 * 4
            goto L69
        L5e:
            if (r3 == 0) goto L61
            goto L62
        L61:
            r14 = r0
        L62:
            float r14 = (float) r14
            float r14 = r14 / r6
            float r14 = r14 + r8
            r0 = 1133903872(0x43960000, float:300.0)
            float r14 = r14 * r0
            int r14 = (int) r14
        L69:
            r0 = 2000(0x7d0, float:2.803E-42)
            int r14 = java.lang.Math.min(r14, r0)
        L6f:
            r8 = r14
            if (r15 != 0) goto L74
            dz r15 = androidx.recyclerview.widget.RecyclerView.u0
        L74:
            android.view.animation.Interpolator r14 = r11.d
            if (r14 == r15) goto L85
            r11.d = r15
            android.widget.OverScroller r14 = new android.widget.OverScroller
            android.content.Context r0 = r2.getContext()
            r14.<init>(r0, r15)
            r11.c = r14
        L85:
            r11.b = r1
            r11.a = r1
            r14 = 2
            r2.setScrollState(r14)
            android.widget.OverScroller r3 = r11.c
            r4 = 0
            r5 = 0
            r6 = r12
            r7 = r13
            r3.startScroll(r4, r5, r6, r7, r8)
            r11.a()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r13.g
            int[] r8 = r0.o0
            nz r1 = r0.l
            if (r1 != 0) goto L11
            r0.removeCallbacks(r13)
            android.widget.OverScroller r0 = r13.c
            r0.abortAnimation()
            return
        L11:
            r9 = 0
            r13.f = r9
            r10 = 1
            r13.e = r10
            r0.m()
            android.widget.OverScroller r11 = r13.c
            boolean r1 = r11.computeScrollOffset()
            if (r1 == 0) goto L185
            int r1 = r11.getCurrX()
            int r2 = r11.getCurrY()
            int r3 = r13.a
            int r3 = r1 - r3
            int r4 = r13.b
            int r4 = r2 - r4
            r13.a = r1
            r13.b = r2
            r1 = r3
            int[] r3 = r0.o0
            r3[r9] = r9
            r3[r10] = r9
            r2 = r4
            r4 = 0
            r5 = 1
            boolean r3 = r0.r(r1, r2, r3, r4, r5)
            if (r3 == 0) goto L4f
            r3 = r8[r9]
            int r3 = r1 - r3
            r1 = r8[r10]
            int r4 = r2 - r1
            goto L51
        L4f:
            r3 = r1
            r4 = r2
        L51:
            int r1 = r0.getOverScrollMode()
            r12 = 2
            if (r1 == r12) goto L5b
            r0.l(r3, r4)
        L5b:
            fz r1 = r0.k
            if (r1 == 0) goto L95
            r8[r9] = r9
            r8[r10] = r9
            r0.X(r3, r4, r8)
            r1 = r8[r9]
            r2 = r8[r10]
            int r3 = r3 - r1
            int r4 = r4 - r2
            nz r5 = r0.l
            yq r5 = r5.e
            if (r5 == 0) goto L97
            boolean r6 = r5.d
            if (r6 != 0) goto L97
            boolean r6 = r5.e
            if (r6 == 0) goto L97
            yz r6 = r0.c0
            int r6 = r6.b()
            if (r6 != 0) goto L86
            r5.i()
            goto L97
        L86:
            int r7 = r5.a
            if (r7 < r6) goto L91
            int r6 = r6 - r10
            r5.a = r6
            r5.g(r1, r2)
            goto L97
        L91:
            r5.g(r1, r2)
            goto L97
        L95:
            r1 = r9
            r2 = r1
        L97:
            java.util.ArrayList r5 = r0.m
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto La2
            r0.invalidate()
        La2:
            int[] r7 = r0.o0
            r7[r9] = r9
            r7[r10] = r9
            r5 = 0
            r6 = 1
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r5 = r8[r9]
            int r3 = r3 - r5
            r5 = r8[r10]
            int r4 = r4 - r5
            if (r1 != 0) goto Lb7
            if (r2 == 0) goto Lba
        Lb7:
            r0.t(r1, r2)
        Lba:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.d(r0)
            if (r5 != 0) goto Lc3
            r0.invalidate()
        Lc3:
            int r5 = r11.getCurrX()
            int r6 = r11.getFinalX()
            if (r5 != r6) goto Lcf
            r5 = r10
            goto Ld0
        Lcf:
            r5 = r9
        Ld0:
            int r6 = r11.getCurrY()
            int r7 = r11.getFinalY()
            if (r6 != r7) goto Ldc
            r6 = r10
            goto Ldd
        Ldc:
            r6 = r9
        Ldd:
            boolean r7 = r11.isFinished()
            if (r7 != 0) goto Lee
            if (r5 != 0) goto Le7
            if (r3 == 0) goto Lec
        Le7:
            if (r6 != 0) goto Lee
            if (r4 == 0) goto Lec
            goto Lee
        Lec:
            r5 = r9
            goto Lef
        Lee:
            r5 = r10
        Lef:
            nz r6 = r0.l
            yq r6 = r6.e
            if (r6 == 0) goto Lfb
            boolean r6 = r6.d
            if (r6 == 0) goto Lfb
            goto L17b
        Lfb:
            if (r5 == 0) goto L17b
            int r1 = r0.getOverScrollMode()
            if (r1 == r12) goto L16e
            float r1 = r11.getCurrVelocity()
            int r1 = (int) r1
            if (r3 >= 0) goto L10c
            int r2 = -r1
            goto L111
        L10c:
            if (r3 <= 0) goto L110
            r2 = r1
            goto L111
        L110:
            r2 = r9
        L111:
            if (r4 >= 0) goto L115
            int r1 = -r1
            goto L119
        L115:
            if (r4 <= 0) goto L118
            goto L119
        L118:
            r1 = r9
        L119:
            if (r2 >= 0) goto L12d
            r0.v()
            android.widget.EdgeEffect r3 = r0.D
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L13f
            android.widget.EdgeEffect r3 = r0.D
            int r4 = -r2
            r3.onAbsorb(r4)
            goto L13f
        L12d:
            if (r2 <= 0) goto L13f
            r0.w()
            android.widget.EdgeEffect r3 = r0.F
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L13f
            android.widget.EdgeEffect r3 = r0.F
            r3.onAbsorb(r2)
        L13f:
            if (r1 >= 0) goto L153
            r0.x()
            android.widget.EdgeEffect r3 = r0.E
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L165
            android.widget.EdgeEffect r3 = r0.E
            int r4 = -r1
            r3.onAbsorb(r4)
            goto L165
        L153:
            if (r1 <= 0) goto L165
            r0.u()
            android.widget.EdgeEffect r3 = r0.G
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L165
            android.widget.EdgeEffect r3 = r0.G
            r3.onAbsorb(r1)
        L165:
            if (r2 != 0) goto L169
            if (r1 == 0) goto L16e
        L169:
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.k(r0)
        L16e:
            bn r1 = r0.b0
            int[] r2 = r1.c
            if (r2 == 0) goto L178
            r3 = -1
            java.util.Arrays.fill(r2, r3)
        L178:
            r1.d = r9
            goto L185
        L17b:
            r13.a()
            dn r3 = r0.a0
            if (r3 == 0) goto L185
            r3.a(r0, r1, r2)
        L185:
            nz r1 = r0.l
            yq r1 = r1.e
            if (r1 == 0) goto L192
            boolean r2 = r1.d
            if (r2 == 0) goto L192
            r1.g(r9, r9)
        L192:
            r13.e = r9
            boolean r1 = r13.f
            if (r1 == 0) goto L1a1
            r0.removeCallbacks(r13)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.s90.m(r0, r13)
            return
        L1a1:
            r0.setScrollState(r9)
            r0.c0(r10)
            return
    }
}
