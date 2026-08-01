package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b90 {
    public static final android.graphics.Matrix p = null;
    public final android.graphics.Path a;
    public final android.graphics.Path b;
    public final android.graphics.Matrix c;
    public android.graphics.Paint d;
    public android.graphics.Paint e;
    public android.graphics.PathMeasure f;
    public final defpackage.y80 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public java.lang.String m;
    public java.lang.Boolean n;
    public final defpackage.n6 o;

    static {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            defpackage.b90.p = r0
            return
    }

    public b90() {
            r1 = this;
            r1.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            r0 = 255(0xff, float:3.57E-43)
            r1.l = r0
            r0 = 0
            r1.m = r0
            r1.n = r0
            n6 r0 = new n6
            r0.<init>()
            r1.o = r0
            y80 r0 = new y80
            r0.<init>()
            r1.g = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.a = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.b = r0
            return
    }

    public b90(defpackage.b90 r4) {
            r3 = this;
            r3.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.c = r0
            r0 = 0
            r3.h = r0
            r3.i = r0
            r3.j = r0
            r3.k = r0
            r0 = 255(0xff, float:3.57E-43)
            r3.l = r0
            r0 = 0
            r3.m = r0
            r3.n = r0
            n6 r0 = new n6
            r0.<init>()
            r3.o = r0
            y80 r1 = new y80
            y80 r2 = r4.g
            r1.<init>(r2, r0)
            r3.g = r1
            android.graphics.Path r1 = new android.graphics.Path
            android.graphics.Path r2 = r4.a
            r1.<init>(r2)
            r3.a = r1
            android.graphics.Path r1 = new android.graphics.Path
            android.graphics.Path r2 = r4.b
            r1.<init>(r2)
            r3.b = r1
            float r1 = r4.h
            r3.h = r1
            float r1 = r4.i
            r3.i = r1
            float r1 = r4.j
            r3.j = r1
            float r1 = r4.k
            r3.k = r1
            int r1 = r4.l
            r3.l = r1
            java.lang.String r1 = r4.m
            r3.m = r1
            java.lang.String r1 = r4.m
            if (r1 == 0) goto L5d
            r0.put(r1, r3)
        L5d:
            java.lang.Boolean r4 = r4.n
            r3.n = r4
            return
    }

    public final void a(defpackage.y80 r21, android.graphics.Matrix r22, android.graphics.Canvas r23, int r24, int r25) {
            r20 = this;
            r0 = r21
            android.graphics.Matrix r1 = r0.a
            java.util.ArrayList r6 = r0.b
            r2 = r22
            r1.set(r2)
            android.graphics.Matrix r2 = r0.a
            android.graphics.Matrix r0 = r0.j
            r2.preConcat(r0)
            r23.save()
            r7 = 0
            r8 = r7
        L17:
            int r0 = r6.size()
            if (r8 >= r0) goto L221
            java.lang.Object r0 = r6.get(r8)
            z80 r0 = (defpackage.z80) r0
            boolean r1 = r0 instanceof defpackage.y80
            if (r1 == 0) goto L3c
            r1 = r0
            y80 r1 = (defpackage.y80) r1
            r0 = r20
            r3 = r23
            r4 = r24
            r5 = r25
            r0.a(r1, r2, r3, r4, r5)
            r1 = r0
        L36:
            r9 = r25
            r18 = r8
            goto L21c
        L3c:
            r1 = r20
            r3 = r23
            boolean r4 = r0 instanceof defpackage.a90
            if (r4 == 0) goto L218
            a90 r0 = (defpackage.a90) r0
            r4 = r24
            float r5 = (float) r4
            float r9 = r1.j
            float r5 = r5 / r9
            r9 = r25
            float r10 = (float) r9
            float r11 = r1.k
            float r10 = r10 / r11
            float r11 = java.lang.Math.min(r5, r10)
            android.graphics.Matrix r12 = r1.c
            r12.set(r2)
            r12.postScale(r5, r10)
            r5 = 4
            float[] r5 = new float[r5]
            r5 = {x022a: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
            r2.mapVectors(r5)
            r10 = r5[r7]
            double r13 = (double) r10
            r10 = 1
            r15 = r5[r10]
            r22 = r10
            r21 = r11
            double r10 = (double) r15
            double r10 = java.lang.Math.hypot(r13, r10)
            float r10 = (float) r10
            r11 = 2
            r13 = r5[r11]
            double r13 = (double) r13
            r15 = 3
            r16 = r11
            r11 = r5[r15]
            r17 = r7
            r18 = r8
            double r7 = (double) r11
            double r7 = java.lang.Math.hypot(r13, r7)
            float r7 = (float) r7
            r8 = r5[r17]
            r11 = r5[r22]
            r13 = r5[r16]
            r5 = r5[r15]
            float r8 = r8 * r5
            float r11 = r11 * r13
            float r8 = r8 - r11
            float r5 = java.lang.Math.max(r10, r7)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto La4
            float r8 = java.lang.Math.abs(r8)
            float r8 = r8 / r5
            goto La5
        La4:
            r8 = r7
        La5:
            int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r5 != 0) goto Lab
            goto L21c
        Lab:
            android.graphics.Path r5 = r1.a
            r5.reset()
            ox[] r10 = r0.a
            if (r10 == 0) goto Lb7
            defpackage.ox.b(r10, r5)
        Lb7:
            android.graphics.Path r10 = r1.b
            r10.reset()
            boolean r11 = r0 instanceof defpackage.w80
            if (r11 == 0) goto Ld4
            int r0 = r0.c
            if (r0 != 0) goto Lc7
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto Lc9
        Lc7:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        Lc9:
            r10.setFillType(r0)
            r10.addPath(r5, r12)
            r3.clipPath(r10)
            goto L21c
        Ld4:
            x80 r0 = (defpackage.x80) r0
            float r11 = r0.i
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto Le4
            float r13 = r0.j
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 == 0) goto L126
        Le4:
            float r13 = r0.k
            float r11 = r11 + r13
            float r11 = r11 % r14
            float r15 = r0.j
            float r15 = r15 + r13
            float r15 = r15 % r14
            android.graphics.PathMeasure r13 = r1.f
            if (r13 != 0) goto Lf7
            android.graphics.PathMeasure r13 = new android.graphics.PathMeasure
            r13.<init>()
            r1.f = r13
        Lf7:
            android.graphics.PathMeasure r13 = r1.f
            r14 = r17
            r13.setPath(r5, r14)
            android.graphics.PathMeasure r13 = r1.f
            float r13 = r13.getLength()
            float r11 = r11 * r13
            float r15 = r15 * r13
            r5.reset()
            int r16 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r16 <= 0) goto L11b
            android.graphics.PathMeasure r14 = r1.f
            r7 = r22
            r14.getSegment(r11, r13, r5, r7)
            android.graphics.PathMeasure r11 = r1.f
            r13 = 0
            r11.getSegment(r13, r15, r5, r7)
            goto L123
        L11b:
            r13 = r7
            r7 = r22
            android.graphics.PathMeasure r14 = r1.f
            r14.getSegment(r11, r15, r5, r7)
        L123:
            r5.rLineTo(r13, r13)
        L126:
            r10.addPath(r5, r12)
            z3 r5 = r0.f
            java.lang.Object r7 = r5.b
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            r13 = 0
            r14 = 255(0xff, float:3.57E-43)
            r15 = 1132396544(0x437f0000, float:255.0)
            if (r7 == 0) goto L137
            goto L13b
        L137:
            int r7 = r5.a
            if (r7 == 0) goto L19e
        L13b:
            android.graphics.Paint r7 = r1.e
            if (r7 != 0) goto L150
            android.graphics.Paint r7 = new android.graphics.Paint
            r11 = 1
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r7.<init>(r11)
            r1.e = r7
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r7.setStyle(r11)
            goto L153
        L150:
            r16 = 16777215(0xffffff, float:2.3509886E-38)
        L153:
            android.graphics.Paint r7 = r1.e
            java.lang.Object r11 = r5.b
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L16e
            r11.setLocalMatrix(r12)
            r7.setShader(r11)
            float r5 = r0.h
            float r5 = r5 * r15
            int r5 = java.lang.Math.round(r5)
            r7.setAlpha(r5)
            r19 = r15
            goto L18b
        L16e:
            r7.setShader(r13)
            r7.setAlpha(r14)
            int r5 = r5.a
            float r11 = r0.h
            android.graphics.PorterDuff$Mode r19 = defpackage.e90.j
            r19 = r15
            int r15 = android.graphics.Color.alpha(r5)
            r5 = r5 & r16
            float r15 = (float) r15
            float r15 = r15 * r11
            int r11 = (int) r15
            int r11 = r11 << 24
            r5 = r5 | r11
            r7.setColor(r5)
        L18b:
            r7.setColorFilter(r13)
            int r5 = r0.c
            if (r5 != 0) goto L195
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.WINDING
            goto L197
        L195:
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
        L197:
            r10.setFillType(r5)
            r3.drawPath(r10, r7)
            goto L1a3
        L19e:
            r19 = r15
            r16 = 16777215(0xffffff, float:2.3509886E-38)
        L1a3:
            z3 r5 = r0.d
            java.lang.Object r7 = r5.b
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            if (r7 == 0) goto L1ac
            goto L1b0
        L1ac:
            int r7 = r5.a
            if (r7 == 0) goto L21c
        L1b0:
            android.graphics.Paint r7 = r1.d
            if (r7 != 0) goto L1c1
            android.graphics.Paint r7 = new android.graphics.Paint
            r11 = 1
            r7.<init>(r11)
            r1.d = r7
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r11)
        L1c1:
            android.graphics.Paint r7 = r1.d
            android.graphics.Paint$Join r11 = r0.m
            if (r11 == 0) goto L1ca
            r7.setStrokeJoin(r11)
        L1ca:
            android.graphics.Paint$Cap r11 = r0.l
            if (r11 == 0) goto L1d1
            r7.setStrokeCap(r11)
        L1d1:
            float r11 = r0.n
            r7.setStrokeMiter(r11)
            java.lang.Object r11 = r5.b
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L1ee
            r11.setLocalMatrix(r12)
            r7.setShader(r11)
            float r5 = r0.g
            float r5 = r5 * r19
            int r5 = java.lang.Math.round(r5)
            r7.setAlpha(r5)
            goto L209
        L1ee:
            r7.setShader(r13)
            r7.setAlpha(r14)
            int r5 = r5.a
            float r11 = r0.g
            android.graphics.PorterDuff$Mode r12 = defpackage.e90.j
            int r12 = android.graphics.Color.alpha(r5)
            r5 = r5 & r16
            float r12 = (float) r12
            float r12 = r12 * r11
            int r11 = (int) r12
            int r11 = r11 << 24
            r5 = r5 | r11
            r7.setColor(r5)
        L209:
            r7.setColorFilter(r13)
            float r11 = r21 * r8
            float r0 = r0.e
            float r0 = r0 * r11
            r7.setStrokeWidth(r0)
            r3.drawPath(r10, r7)
            goto L21c
        L218:
            r4 = r24
            goto L36
        L21c:
            int r8 = r18 + 1
            r7 = 0
            goto L17
        L221:
            r1 = r20
            r3 = r23
            r3.restore()
            return
    }

    public float getAlpha() {
            r2 = this;
            int r0 = r2.getRootAlpha()
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            return r0
    }

    public int getRootAlpha() {
            r1 = this;
            int r0 = r1.l
            return r0
    }

    public void setAlpha(float r2) {
            r1 = this;
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1.setRootAlpha(r2)
            return
    }

    public void setRootAlpha(int r1) {
            r0 = this;
            r0.l = r1
            return
    }
}
