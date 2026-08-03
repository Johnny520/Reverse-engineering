package a;

/* JADX INFO: loaded from: classes.dex */
public final class Wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Yd[] f327a;
    public final android.graphics.Matrix[] b;
    public final android.graphics.Matrix[] c;
    public final android.graphics.PointF d;
    public final android.graphics.Path e;
    public final android.graphics.Path f;
    public final a.Yd g;
    public final float[] h;
    public final float[] i;
    public final android.graphics.Path j;
    public final android.graphics.Path k;
    public final boolean l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a.Wd f328a = null;

        static {
                a.Wd r0 = new a.Wd
                r0.<init>()
                a.Wd.a.f328a = r0
                return
        }
    }

    public Wd() {
            r4 = this;
            r4.<init>()
            r0 = 4
            a.Yd[] r1 = new a.Yd[r0]
            r4.f327a = r1
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
            a.Yd r1 = new a.Yd
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
            a.Yd[] r2 = r4.f327a
            a.Yd r3 = new a.Yd
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

    public final void a(a.Vd r22, float r23, android.graphics.RectF r24, a.Ta.a r25, android.graphics.Path r26) {
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
            android.graphics.Matrix[] r10 = r0.b
            a.Yd[] r11 = r0.f327a
            r12 = 1
            r13 = 4
            r14 = 2
            r15 = 3
            r16 = 0
            float[] r7 = r0.h
            if (r8 >= r13) goto Ld2
            if (r8 == r12) goto L3c
            if (r8 == r14) goto L39
            if (r8 == r15) goto L36
            a.w4 r13 = r1.f
            goto L3e
        L36:
            a.w4 r13 = r1.e
            goto L3e
        L39:
            a.w4 r13 = r1.h
            goto L3e
        L3c:
            a.w4 r13 = r1.g
        L3e:
            if (r8 == r12) goto L4d
            if (r8 == r14) goto L4a
            if (r8 == r15) goto L47
            a.w1 r15 = r1.b
            goto L4f
        L47:
            a.w1 r15 = r1.f307a
            goto L4f
        L4a:
            a.w1 r15 = r1.d
            goto L4f
        L4d:
            a.w1 r15 = r1.c
        L4f:
            r14 = r11[r8]
            r15.getClass()
            float r13 = r13.a(r2)
            r12 = r23
            r15.z(r14, r12, r13)
            int r13 = r8 + 1
            int r14 = r13 % 4
            int r14 = r14 * 90
            float r14 = (float) r14
            r15 = r10[r8]
            r15.reset()
            android.graphics.PointF r15 = r0.d
            r19 = r9
            r9 = 1
            if (r8 == r9) goto L94
            r9 = 2
            if (r8 == r9) goto L8a
            r9 = 3
            if (r8 == r9) goto L80
            float r9 = r2.right
            r17 = r8
            float r8 = r2.top
            r15.set(r9, r8)
            goto L9d
        L80:
            r17 = r8
            float r8 = r2.left
            float r9 = r2.top
            r15.set(r8, r9)
            goto L9d
        L8a:
            r17 = r8
            float r8 = r2.left
            float r9 = r2.bottom
            r15.set(r8, r9)
            goto L9d
        L94:
            r17 = r8
            float r8 = r2.right
            float r9 = r2.bottom
            r15.set(r8, r9)
        L9d:
            r8 = r10[r17]
            float r9 = r15.x
            float r15 = r15.y
            r8.setTranslate(r9, r15)
            r8 = r10[r17]
            r8.preRotate(r14)
            r8 = r11[r17]
            float r9 = r8.b
            r7[r16] = r9
            float r8 = r8.c
            r18 = 1
            r7[r18] = r8
            r8 = r10[r17]
            r8.mapPoints(r7)
            r8 = r19[r17]
            r8.reset()
            r8 = r19[r17]
            r9 = r7[r16]
            r7 = r7[r18]
            r8.setTranslate(r9, r7)
            r7 = r19[r17]
            r7.preRotate(r14)
            r8 = r13
            goto L1d
        Ld2:
            r19 = r9
            r8 = r16
        Ld6:
            if (r8 >= r13) goto L24c
            r9 = r11[r8]
            r9.getClass()
            r12 = 0
            r7[r16] = r12
            float r9 = r9.f359a
            r18 = 1
            r7[r18] = r9
            r9 = r10[r8]
            r9.mapPoints(r7)
            if (r8 != 0) goto Lf5
            r9 = r7[r16]
            r14 = r7[r18]
            r4.moveTo(r9, r14)
            goto Lfc
        Lf5:
            r9 = r7[r16]
            r14 = r7[r18]
            r4.lineTo(r9, r14)
        Lfc:
            r9 = r11[r8]
            r14 = r10[r8]
            r9.b(r14, r4)
            if (r3 == 0) goto L132
            r9 = r11[r8]
            r14 = r10[r8]
            a.Ta r15 = r3.f279a
            java.util.BitSet r13 = r15.d
            r9.getClass()
            r23 = r12
            r12 = r16
            r13.set(r8, r12)
            float r12 = r9.e
            r9.a(r12)
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>(r14)
            java.util.ArrayList r13 = new java.util.ArrayList
            java.util.ArrayList r9 = r9.g
            r13.<init>(r9)
            a.Xd r9 = new a.Xd
            r9.<init>(r13, r12)
            a.Yd$f[] r12 = r15.b
            r12[r8] = r9
            goto L134
        L132:
            r23 = r12
        L134:
            int r12 = r8 + 1
            int r9 = r12 % 4
            r13 = r11[r8]
            float r14 = r13.b
            r16 = 0
            r7[r16] = r14
            float r13 = r13.c
            r18 = 1
            r7[r18] = r13
            r13 = r10[r8]
            r13.mapPoints(r7)
            r13 = r11[r9]
            r13.getClass()
            float[] r14 = r0.i
            r16 = 0
            r14[r16] = r23
            float r13 = r13.f359a
            r18 = 1
            r14[r18] = r13
            r13 = r10[r9]
            r13.mapPoints(r14)
            r13 = r7[r16]
            r15 = r14[r16]
            float r13 = r13 - r15
            r20 = r10
            r15 = r11
            double r10 = (double) r13
            r13 = r7[r18]
            r14 = r14[r18]
            float r13 = r13 - r14
            double r13 = (double) r13
            double r10 = java.lang.Math.hypot(r10, r13)
            float r10 = (float) r10
            r11 = 981668463(0x3a83126f, float:0.001)
            float r10 = r10 - r11
            r11 = r23
            float r10 = java.lang.Math.max(r10, r11)
            r11 = r15[r8]
            float r13 = r11.b
            r16 = 0
            r7[r16] = r13
            float r11 = r11.c
            r13 = 1
            r7[r13] = r11
            r11 = r20[r8]
            r11.mapPoints(r7)
            if (r8 == r13) goto L1a1
            r11 = 3
            if (r8 == r11) goto L1a1
            float r11 = r2.centerY()
            r14 = r7[r13]
            float r11 = r11 - r14
            java.lang.Math.abs(r11)
            goto L1ad
        L1a1:
            float r11 = r2.centerX()
            r16 = 0
            r13 = r7[r16]
            float r11 = r11 - r13
            java.lang.Math.abs(r11)
        L1ad:
            r11 = 1132920832(0x43870000, float:270.0)
            a.Yd r13 = r0.g
            r14 = 0
            r13.d(r14, r11, r14)
            r11 = 1
            if (r8 == r11) goto L1c8
            r11 = 2
            if (r8 == r11) goto L1c4
            r14 = 3
            if (r8 == r14) goto L1c1
            a.H5 r11 = r1.j
            goto L1cb
        L1c1:
            a.H5 r11 = r1.i
            goto L1cb
        L1c4:
            r14 = 3
            a.H5 r11 = r1.l
            goto L1cb
        L1c8:
            r14 = 3
            a.H5 r11 = r1.k
        L1cb:
            r11.getClass()
            r11 = 0
            r13.c(r10, r11)
            android.graphics.Path r10 = r0.j
            r10.reset()
            r11 = r19[r8]
            r13.b(r11, r10)
            boolean r11 = r0.l
            if (r11 == 0) goto L1ed
            boolean r11 = r0.b(r10, r8)
            if (r11 != 0) goto L1f0
            boolean r9 = r0.b(r10, r9)
            if (r9 == 0) goto L1ed
            goto L1f0
        L1ed:
            r18 = 1
            goto L212
        L1f0:
            android.graphics.Path$Op r9 = android.graphics.Path.Op.DIFFERENCE
            r10.op(r10, r6, r9)
            r11 = 0
            r16 = 0
            r7[r16] = r11
            float r9 = r13.f359a
            r18 = 1
            r7[r18] = r9
            r9 = r19[r8]
            r9.mapPoints(r7)
            r9 = r7[r16]
            r10 = r7[r18]
            r5.moveTo(r9, r10)
            r9 = r19[r8]
            r13.b(r9, r5)
            goto L217
        L212:
            r9 = r19[r8]
            r13.b(r9, r4)
        L217:
            if (r3 == 0) goto L240
            r9 = r19[r8]
            a.Ta r10 = r3.f279a
            java.util.BitSet r11 = r10.d
            int r14 = r8 + 4
            r0 = 0
            r11.set(r14, r0)
            float r11 = r13.e
            r13.a(r11)
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.ArrayList r13 = r13.g
            r9.<init>(r13)
            a.Xd r13 = new a.Xd
            r13.<init>(r9, r11)
            a.Yd$f[] r9 = r10.c
            r9[r8] = r13
            goto L241
        L240:
            r0 = 0
        L241:
            r16 = r0
            r8 = r12
            r11 = r15
            r10 = r20
            r13 = 4
            r0 = r21
            goto Ld6
        L24c:
            r4.close()
            r5.close()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L25d
            android.graphics.Path$Op r0 = android.graphics.Path.Op.UNION
            r4.op(r5, r0)
        L25d:
            return
    }

    public final boolean b(android.graphics.Path r4, int r5) {
            r3 = this;
            android.graphics.Path r0 = r3.k
            r0.reset()
            a.Yd[] r1 = r3.f327a
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
