package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hc {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public hc(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a(defpackage.pc r22, defpackage.k7 r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            if (r1 != 0) goto L9
            return
        L9:
            cc r3 = r1.z
            cc r4 = r1.x
            int[] r5 = r1.g
            int r6 = r1.V
            r7 = 8
            r8 = 0
            if (r6 != r7) goto L1d
            r2.e = r8
            r2.f = r8
            r2.g = r8
            return
        L1d:
            int r6 = r2.a
            int r7 = r2.b
            int r9 = r2.c
            int r10 = r2.d
            int r11 = r0.b
            int r12 = r0.c
            int r11 = r11 + r12
            int r12 = r0.d
            android.view.View r13 = r1.U
            int r14 = defpackage.z30.t(r6)
            r15 = 1
            r16 = r8
            r8 = 2
            if (r14 == 0) goto Lb5
            if (r14 == r15) goto La7
            if (r14 == r8) goto L65
            r9 = 3
            if (r14 == r9) goto L46
            r19 = r8
            r8 = r16
            r9 = r8
            goto Lc1
        L46:
            int r9 = r0.f
            if (r4 == 0) goto L4d
            int r14 = r4.e
            goto L4f
        L4d:
            r14 = r16
        L4f:
            if (r3 == 0) goto L57
            r19 = r8
            int r8 = r3.e
            int r14 = r14 + r8
            goto L59
        L57:
            r19 = r8
        L59:
            int r12 = r12 + r14
            r8 = -1
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r9, r12, r8)
            r5[r19] = r8
        L61:
            r8 = r16
            goto Lc1
        L65:
            r19 = r8
            int r8 = r0.f
            r9 = -2
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r12, r9)
            int r9 = r1.j
            if (r9 != r15) goto L74
            r9 = r15
            goto L76
        L74:
            r9 = r16
        L76:
            r5[r19] = r16
            boolean r12 = r2.j
            if (r12 == 0) goto L96
            if (r9 == 0) goto L8f
            r18 = 3
            r12 = r5[r18]
            if (r12 == 0) goto L8f
            r12 = r5[r16]
            int r14 = r1.l()
            if (r12 != r14) goto L8d
            goto L8f
        L8d:
            r12 = r15
            goto L91
        L8f:
            r12 = r16
        L91:
            if (r9 == 0) goto L99
            if (r12 == 0) goto L96
            goto L99
        L96:
            r14 = 1073741824(0x40000000, float:2.0)
            goto La4
        L99:
            int r8 = r1.l()
            r14 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r14)
            goto L61
        La4:
            r9 = r8
            r8 = r15
            goto Lc1
        La7:
            r19 = r8
            r14 = 1073741824(0x40000000, float:2.0)
            int r8 = r0.f
            r9 = -2
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r12, r9)
            r5[r19] = r9
            goto La4
        Lb5:
            r19 = r8
            r14 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r14)
            r5[r19] = r9
            r9 = r8
            goto L61
        Lc1:
            int r12 = defpackage.z30.t(r7)
            if (r12 == 0) goto L14b
            if (r12 == r15) goto L13c
            r10 = r19
            if (r12 == r10) goto Lf8
            r10 = 3
            if (r12 == r10) goto Ld6
            r11 = r10
            r3 = r16
            r4 = r3
            goto L156
        Ld6:
            int r10 = r0.g
            if (r4 == 0) goto Ldf
            cc r4 = r1.y
            int r4 = r4.e
            goto Le1
        Ldf:
            r4 = r16
        Le1:
            if (r3 == 0) goto Le8
            cc r3 = r1.A
            int r3 = r3.e
            int r4 = r4 + r3
        Le8:
            int r11 = r11 + r4
            r3 = -1
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r10, r11, r3)
            r18 = 3
            r5[r18] = r3
            r3 = r16
            r11 = r18
            goto L156
        Lf8:
            r18 = 3
            int r3 = r0.g
            r4 = -2
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r3, r11, r4)
            int r3 = r1.k
            if (r3 != r15) goto L107
            r3 = r15
            goto L109
        L107:
            r3 = r16
        L109:
            r5[r18] = r16
            boolean r10 = r2.j
            if (r10 == 0) goto L129
            if (r3 == 0) goto L122
            r19 = 2
            r10 = r5[r19]
            if (r10 == 0) goto L122
            r10 = r5[r15]
            int r11 = r1.i()
            if (r10 != r11) goto L120
            goto L122
        L120:
            r10 = r15
            goto L124
        L122:
            r10 = r16
        L124:
            if (r3 == 0) goto L12c
            if (r10 == 0) goto L129
            goto L12c
        L129:
            r14 = 1073741824(0x40000000, float:2.0)
            goto L13a
        L12c:
            int r3 = r1.i()
            r14 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r14)
            r3 = r16
        L138:
            r11 = 3
            goto L156
        L13a:
            r3 = r15
            goto L138
        L13c:
            r14 = 1073741824(0x40000000, float:2.0)
            int r3 = r0.g
            r4 = -2
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r11, r4)
            r11 = 3
            r5[r11] = r4
            r4 = r3
            r3 = r15
            goto L156
        L14b:
            r11 = 3
            r14 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r14)
            r5[r11] = r10
            r3 = r16
        L156:
            if (r6 != r11) goto L15a
            r10 = r15
            goto L15c
        L15a:
            r10 = r16
        L15c:
            if (r7 != r11) goto L160
            r11 = r15
            goto L162
        L160:
            r11 = r16
        L162:
            r12 = 4
            if (r7 == r12) goto L16b
            if (r7 != r15) goto L168
            goto L16b
        L168:
            r7 = r16
            goto L16c
        L16b:
            r7 = r15
        L16c:
            if (r6 == r12) goto L174
            if (r6 != r15) goto L171
            goto L174
        L171:
            r6 = r16
            goto L175
        L174:
            r6 = r15
        L175:
            r12 = 0
            if (r10 == 0) goto L180
            float r14 = r1.L
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 <= 0) goto L180
            r14 = r15
            goto L182
        L180:
            r14 = r16
        L182:
            if (r11 == 0) goto L18e
            r17 = r12
            float r12 = r1.L
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 <= 0) goto L18e
            r12 = r15
            goto L190
        L18e:
            r12 = r16
        L190:
            android.view.ViewGroup$LayoutParams r17 = r13.getLayoutParams()
            r20 = r15
            r15 = r17
            gc r15 = (defpackage.gc) r15
            boolean r0 = r2.j
            if (r0 != 0) goto L1b2
            if (r10 == 0) goto L1b2
            int r0 = r1.j
            if (r0 != 0) goto L1b2
            if (r11 == 0) goto L1b2
            int r0 = r1.k
            if (r0 == 0) goto L1ab
            goto L1b2
        L1ab:
            r3 = r16
            r5 = r3
            r11 = r5
        L1af:
            r8 = -1
            goto L24f
        L1b2:
            boolean r0 = r13 instanceof defpackage.hb0
            if (r0 == 0) goto L1c4
            boolean r0 = r1 instanceof defpackage.rk
            if (r0 == 0) goto L1c4
            r0 = r1
            rk r0 = (defpackage.rk) r0
            r10 = r13
            hb0 r10 = (defpackage.hb0) r10
            r10.h(r0, r9, r4)
            goto L1c7
        L1c4:
            r13.measure(r9, r4)
        L1c7:
            int r0 = r13.getMeasuredWidth()
            int r10 = r13.getMeasuredHeight()
            int r11 = r13.getBaseline()
            if (r8 == 0) goto L1dc
            r5[r16] = r0
            r19 = 2
            r5[r19] = r10
            goto L1e2
        L1dc:
            r19 = 2
            r5[r16] = r16
            r5[r19] = r16
        L1e2:
            if (r3 == 0) goto L1eb
            r5[r20] = r10
            r18 = 3
            r5[r18] = r0
            goto L1f1
        L1eb:
            r18 = 3
            r5[r20] = r16
            r5[r18] = r16
        L1f1:
            int r3 = r1.m
            if (r3 <= 0) goto L1fa
            int r3 = java.lang.Math.max(r3, r0)
            goto L1fb
        L1fa:
            r3 = r0
        L1fb:
            int r5 = r1.n
            if (r5 <= 0) goto L203
            int r3 = java.lang.Math.min(r5, r3)
        L203:
            int r5 = r1.p
            if (r5 <= 0) goto L20c
            int r5 = java.lang.Math.max(r5, r10)
            goto L20d
        L20c:
            r5 = r10
        L20d:
            int r8 = r1.q
            if (r8 <= 0) goto L215
            int r5 = java.lang.Math.min(r8, r5)
        L215:
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r14 == 0) goto L222
            if (r7 == 0) goto L222
            float r3 = r1.L
            float r6 = (float) r5
            float r6 = r6 * r3
            float r6 = r6 + r8
            int r3 = (int) r6
            goto L22c
        L222:
            if (r12 == 0) goto L22c
            if (r6 == 0) goto L22c
            float r5 = r1.L
            float r6 = (float) r3
            float r6 = r6 / r5
            float r6 = r6 + r8
            int r5 = (int) r6
        L22c:
            if (r0 != r3) goto L230
            if (r10 == r5) goto L1af
        L230:
            r14 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L238
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r14)
        L238:
            if (r10 == r5) goto L23e
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r14)
        L23e:
            r13.measure(r9, r4)
            int r3 = r13.getMeasuredWidth()
            int r5 = r13.getMeasuredHeight()
            int r11 = r13.getBaseline()
            goto L1af
        L24f:
            if (r11 == r8) goto L254
            r0 = r20
            goto L256
        L254:
            r0 = r16
        L256:
            int r4 = r2.c
            if (r3 != r4) goto L262
            int r4 = r2.d
            if (r5 == r4) goto L25f
            goto L262
        L25f:
            r8 = r16
            goto L264
        L262:
            r8 = r20
        L264:
            r2.i = r8
            boolean r4 = r15.X
            if (r4 == 0) goto L26c
            r0 = r20
        L26c:
            if (r0 == 0) goto L279
            r8 = -1
            if (r11 == r8) goto L279
            int r1 = r1.P
            if (r1 == r11) goto L279
            r1 = r20
            r2.i = r1
        L279:
            r2.e = r3
            r2.f = r5
            r2.h = r0
            r2.g = r11
            return
    }
}
