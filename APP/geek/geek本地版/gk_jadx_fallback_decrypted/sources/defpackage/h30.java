package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h30 {
    public final defpackage.p30[] a;
    public final android.graphics.Matrix[] b;
    public final android.graphics.Matrix[] c;
    public final android.graphics.PointF d;
    public final android.graphics.Path e;
    public final android.graphics.Path f;
    public final defpackage.p30 g;
    public final float[] h;
    public final float[] i;
    public final android.graphics.Path j;
    public final android.graphics.Path k;
    public final boolean l;

    public h30() {
            r4 = this;
            r4.<init>()
            r0 = 4
            p30[] r1 = new defpackage.p30[r0]
            r4.a = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.b = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.c = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r4.d = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.e = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.f = r1
            p30 r1 = new p30
            r1.<init>()
            r4.g = r1
            r1 = 2
            float[] r2 = new float[r1]
            r4.h = r2
            float[] r1 = new float[r1]
            r4.i = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.j = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.k = r1
            r1 = 1
            r4.l = r1
            r1 = 0
        L47:
            if (r1 >= r0) goto L67
            p30[] r2 = r4.a
            p30 r3 = new p30
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.b
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.c
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L47
        L67:
            return
    }

    public final void a(defpackage.f30 r22, float r23, android.graphics.RectF r24, defpackage.l0 r25, android.graphics.Path r26) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r26
            r4.rewind()
            android.graphics.Path r5 = r0.e
            r5.rewind()
            android.graphics.Path r6 = r0.f
            r6.rewind()
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r6.addRect(r2, r7)
            r8 = 0
        L1d:
            android.graphics.Matrix[] r9 = r0.c
            r10 = 2
            r11 = 3
            float[] r12 = r0.h
            r13 = 4
            p30[] r14 = r0.a
            android.graphics.Matrix[] r15 = r0.b
            r16 = 0
            r7 = 1
            if (r8 >= r13) goto Ld0
            if (r8 == r7) goto L3c
            if (r8 == r10) goto L39
            if (r8 == r11) goto L36
            de r13 = r1.f
            goto L3e
        L36:
            de r13 = r1.e
            goto L3e
        L39:
            de r13 = r1.h
            goto L3e
        L3c:
            de r13 = r1.g
        L3e:
            if (r8 == r7) goto L4d
            if (r8 == r10) goto L4a
            if (r8 == r11) goto L47
            ip r11 = r1.b
            goto L4f
        L47:
            ip r11 = r1.a
            goto L4f
        L4a:
            ip r11 = r1.d
            goto L4f
        L4d:
            ip r11 = r1.c
        L4f:
            r10 = r14[r8]
            r11.getClass()
            float r13 = r13.a(r2)
            r7 = r23
            r11.w(r10, r7, r13)
            int r10 = r8 + 1
            int r11 = r10 % 4
            int r11 = r11 * 90
            float r11 = (float) r11
            r13 = r15[r8]
            r13.reset()
            android.graphics.PointF r13 = r0.d
            r7 = 1
            if (r8 == r7) goto L92
            r7 = 2
            if (r8 == r7) goto L88
            r7 = 3
            if (r8 == r7) goto L7e
            float r7 = r2.right
            r17 = r8
            float r8 = r2.top
            r13.set(r7, r8)
            goto L9b
        L7e:
            r17 = r8
            float r7 = r2.left
            float r8 = r2.top
            r13.set(r7, r8)
            goto L9b
        L88:
            r17 = r8
            float r7 = r2.left
            float r8 = r2.bottom
            r13.set(r7, r8)
            goto L9b
        L92:
            r17 = r8
            float r7 = r2.right
            float r8 = r2.bottom
            r13.set(r7, r8)
        L9b:
            r7 = r15[r17]
            float r8 = r13.x
            float r13 = r13.y
            r7.setTranslate(r8, r13)
            r7 = r15[r17]
            r7.preRotate(r11)
            r7 = r14[r17]
            float r8 = r7.b
            r12[r16] = r8
            float r7 = r7.c
            r18 = 1
            r12[r18] = r7
            r7 = r15[r17]
            r7.mapPoints(r12)
            r7 = r9[r17]
            r7.reset()
            r7 = r9[r17]
            r8 = r12[r16]
            r12 = r12[r18]
            r7.setTranslate(r8, r12)
            r7 = r9[r17]
            r7.preRotate(r11)
            r8 = r10
            goto L1d
        Ld0:
            r7 = r16
        Ld2:
            if (r7 >= r13) goto L24d
            r8 = r14[r7]
            r8.getClass()
            r10 = 0
            r12[r16] = r10
            float r8 = r8.a
            r18 = 1
            r12[r18] = r8
            r8 = r15[r7]
            r8.mapPoints(r12)
            if (r7 != 0) goto Lf1
            r8 = r12[r16]
            r11 = r12[r18]
            r4.moveTo(r8, r11)
            goto Lf8
        Lf1:
            r8 = r12[r16]
            r11 = r12[r18]
            r4.lineTo(r8, r11)
        Lf8:
            r8 = r14[r7]
            r11 = r15[r7]
            r8.b(r11, r4)
            if (r3 == 0) goto L130
            r8 = r14[r7]
            r11 = r15[r7]
            java.lang.Object r13 = r3.b
            eu r13 = (defpackage.eu) r13
            r23 = r10
            java.util.BitSet r10 = r13.d
            r8.getClass()
            r2 = r16
            r10.set(r7, r2)
            o30[] r2 = r13.b
            float r10 = r8.e
            r8.a(r10)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.ArrayList r8 = r8.g
            r11.<init>(r8)
            i30 r8 = new i30
            r8.<init>(r11, r10)
            r2[r7] = r8
            goto L132
        L130:
            r23 = r10
        L132:
            int r2 = r7 + 1
            int r8 = r2 % 4
            r10 = r14[r7]
            float r11 = r10.b
            r16 = 0
            r12[r16] = r11
            float r10 = r10.c
            r18 = 1
            r12[r18] = r10
            r10 = r15[r7]
            r10.mapPoints(r12)
            r10 = r14[r8]
            r10.getClass()
            float[] r11 = r0.i
            r11[r16] = r23
            float r10 = r10.a
            r11[r18] = r10
            r10 = r15[r8]
            r10.mapPoints(r11)
            r10 = r12[r16]
            r13 = r11[r16]
            float r10 = r10 - r13
            r13 = r9
            double r9 = (double) r10
            r19 = r12[r18]
            r11 = r11[r18]
            float r11 = r19 - r11
            r20 = r13
            r19 = r14
            double r13 = (double) r11
            double r9 = java.lang.Math.hypot(r9, r13)
            float r9 = (float) r9
            r10 = 981668463(0x3a83126f, float:0.001)
            float r9 = r9 - r10
            r10 = r23
            float r9 = java.lang.Math.max(r9, r10)
            r10 = r19[r7]
            float r11 = r10.b
            r16 = 0
            r12[r16] = r11
            float r10 = r10.c
            r11 = 1
            r12[r11] = r10
            r10 = r15[r7]
            r10.mapPoints(r12)
            if (r7 == r11) goto L19e
            r10 = 3
            if (r7 == r10) goto L19e
            float r10 = r24.centerY()
            r13 = r12[r11]
            float r10 = r10 - r13
            java.lang.Math.abs(r10)
            goto L1aa
        L19e:
            float r10 = r24.centerX()
            r16 = 0
            r11 = r12[r16]
            float r10 = r10 - r11
            java.lang.Math.abs(r10)
        L1aa:
            r10 = 1132920832(0x43870000, float:270.0)
            p30 r11 = r0.g
            r13 = 0
            r11.d(r13, r10, r13)
            r10 = 1
            if (r7 == r10) goto L1c5
            r10 = 2
            if (r7 == r10) goto L1c1
            r13 = 3
            if (r7 == r13) goto L1be
            vh r14 = r1.j
            goto L1c9
        L1be:
            vh r14 = r1.i
            goto L1c9
        L1c1:
            r13 = 3
            vh r14 = r1.l
            goto L1c9
        L1c5:
            r10 = 2
            r13 = 3
            vh r14 = r1.k
        L1c9:
            r14.getClass()
            r14 = 0
            r11.c(r9, r14)
            android.graphics.Path r9 = r0.j
            r9.reset()
            r14 = r20[r7]
            r11.b(r14, r9)
            boolean r14 = r0.l
            if (r14 == 0) goto L1eb
            boolean r14 = r0.b(r9, r7)
            if (r14 != 0) goto L1ee
            boolean r8 = r0.b(r9, r8)
            if (r8 == 0) goto L1eb
            goto L1ee
        L1eb:
            r18 = 1
            goto L210
        L1ee:
            android.graphics.Path$Op r8 = android.graphics.Path.Op.DIFFERENCE
            r9.op(r9, r6, r8)
            r14 = 0
            r16 = 0
            r12[r16] = r14
            float r8 = r11.a
            r18 = 1
            r12[r18] = r8
            r8 = r20[r7]
            r8.mapPoints(r12)
            r8 = r12[r16]
            r9 = r12[r18]
            r5.moveTo(r8, r9)
            r8 = r20[r7]
            r11.b(r8, r5)
            goto L215
        L210:
            r8 = r20[r7]
            r11.b(r8, r4)
        L215:
            if (r3 == 0) goto L240
            r8 = r20[r7]
            java.lang.Object r9 = r3.b
            eu r9 = (defpackage.eu) r9
            java.util.BitSet r14 = r9.d
            int r10 = r7 + 4
            r13 = 0
            r14.set(r10, r13)
            o30[] r9 = r9.c
            float r10 = r11.e
            r11.a(r10)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r11 = r11.g
            r8.<init>(r11)
            i30 r11 = new i30
            r11.<init>(r8, r10)
            r9[r7] = r11
            goto L241
        L240:
            r13 = 0
        L241:
            r7 = r2
            r16 = r13
            r14 = r19
            r9 = r20
            r13 = 4
            r2 = r24
            goto Ld2
        L24d:
            r4.close()
            r5.close()
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L25e
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r4.op(r5, r1)
        L25e:
            return
    }

    public final boolean b(android.graphics.Path r4, int r5) {
            r3 = this;
            android.graphics.Path r0 = r3.k
            r0.reset()
            p30[] r1 = r3.a
            r1 = r1[r5]
            android.graphics.Matrix[] r2 = r3.b
            r5 = r2[r5]
            r1.b(r5, r0)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r1 = 1
            r4.computeBounds(r5, r1)
            r0.computeBounds(r5, r1)
            android.graphics.Path$Op r2 = android.graphics.Path.Op.INTERSECT
            r4.op(r0, r2)
            r4.computeBounds(r5, r1)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L3f
            float r4 = r5.width()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L3d
            float r4 = r5.height()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L3d
            goto L3f
        L3d:
            r4 = 0
            return r4
        L3f:
            return r1
    }
}
