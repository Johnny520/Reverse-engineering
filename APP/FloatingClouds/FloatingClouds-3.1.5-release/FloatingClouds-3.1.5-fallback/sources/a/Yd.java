package a;

/* JADX INFO: loaded from: classes.dex */
public final class Yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @java.lang.Deprecated
    public float f359a;

    @java.lang.Deprecated
    public float b;

    @java.lang.Deprecated
    public float c;

    @java.lang.Deprecated
    public float d;

    @java.lang.Deprecated
    public float e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;

    public static class a extends a.Yd.f {
        public final a.Yd.c c;

        public a(a.Yd.c r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        @Override // a.Yd.f
        public final void a(android.graphics.Matrix r20, a.Ud r21, int r22, android.graphics.Canvas r23) {
                r19 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r6 = r19
                a.Yd$c r3 = r6.c
                float r4 = r3.f
                float r5 = r3.g
                android.graphics.RectF r7 = new android.graphics.RectF
                float r8 = r3.b
                float r9 = r3.c
                float r10 = r3.d
                float r3 = r3.e
                r7.<init>(r8, r9, r10, r3)
                r0.getClass()
                r3 = 0
                int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                r9 = 1
                r10 = 0
                if (r8 >= 0) goto L27
                r8 = r9
                goto L28
            L27:
                r8 = r10
            L28:
                android.graphics.Path r11 = r0.g
                int[] r16 = a.Ud.k
                r12 = 3
                r13 = 2
                if (r8 == 0) goto L3f
                r16[r10] = r10
                int r10 = r0.f
                r16[r9] = r10
                int r10 = r0.e
                r16[r13] = r10
                int r10 = r0.d
                r16[r12] = r10
                goto L66
            L3f:
                r11.rewind()
                float r14 = r7.centerX()
                float r15 = r7.centerY()
                r11.moveTo(r14, r15)
                r11.arcTo(r7, r4, r5)
                r11.close()
                int r14 = -r1
                float r14 = (float) r14
                r7.inset(r14, r14)
                r16[r10] = r10
                int r10 = r0.d
                r16[r9] = r10
                int r10 = r0.e
                r16[r13] = r10
                int r10 = r0.f
                r16[r12] = r10
            L66:
                float r10 = r7.width()
                r12 = 1073741824(0x40000000, float:2.0)
                float r15 = r10 / r12
                int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
                if (r3 > 0) goto L73
                return
            L73:
                float r1 = (float) r1
                float r1 = r1 / r15
                r3 = 1065353216(0x3f800000, float:1.0)
                float r1 = r3 - r1
                float r10 = r3 - r1
                float r10 = r10 / r12
                float r10 = r10 + r1
                float[] r17 = a.Ud.l
                r17[r9] = r1
                r17[r13] = r10
                android.graphics.RadialGradient r12 = new android.graphics.RadialGradient
                float r13 = r7.centerX()
                float r14 = r7.centerY()
                android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
                r12.<init>(r13, r14, r15, r16, r17, r18)
                r1 = r5
                android.graphics.Paint r5 = r0.b
                r5.setShader(r12)
                r2.save()
                r9 = r20
                r2.concat(r9)
                float r9 = r7.height()
                float r10 = r7.width()
                float r9 = r9 / r10
                r2.scale(r3, r9)
                if (r8 != 0) goto Lb8
                android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
                r2.clipPath(r11, r3)
                android.graphics.Paint r0 = r0.h
                r2.drawPath(r11, r0)
            Lb8:
                r2 = r4
                r4 = 1
                r0 = r23
                r3 = r1
                r1 = r7
                r0.drawArc(r1, r2, r3, r4, r5)
                r23.restore()
                return
        }
    }

    public static class b extends a.Yd.f {
        public final a.Yd.d c;
        public final float d;
        public final float e;

        public b(a.Yd.d r1, float r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.d = r2
                r0.e = r3
                return
        }

        @Override // a.Yd.f
        public final void a(android.graphics.Matrix r18, a.Ud r19, int r20, android.graphics.Canvas r21) {
                r17 = this;
                r0 = r17
                r1 = r19
                r2 = r20
                r3 = r21
                a.Yd$d r4 = r0.c
                float r5 = r4.c
                float r6 = r0.e
                float r5 = r5 - r6
                float r4 = r4.b
                float r7 = r0.d
                float r4 = r4 - r7
                android.graphics.RectF r8 = new android.graphics.RectF
                double r9 = (double) r5
                double r4 = (double) r4
                double r4 = java.lang.Math.hypot(r9, r4)
                float r4 = (float) r4
                r5 = 0
                r8.<init>(r5, r5, r4, r5)
                android.graphics.Matrix r4 = r0.f361a
                r9 = r18
                r4.set(r9)
                r4.preTranslate(r7, r6)
                float r6 = r0.b()
                r4.preRotate(r6)
                r1.getClass()
                float r6 = r8.bottom
                float r7 = (float) r2
                float r6 = r6 + r7
                r8.bottom = r6
                int r2 = -r2
                float r2 = (float) r2
                r8.offset(r5, r2)
                int[] r14 = a.Ud.i
                r2 = 0
                int r5 = r1.f
                r14[r2] = r5
                r2 = 1
                int r5 = r1.e
                r14[r2] = r5
                r2 = 2
                int r5 = r1.d
                r14[r2] = r5
                android.graphics.Paint r1 = r1.c
                android.graphics.LinearGradient r9 = new android.graphics.LinearGradient
                float r10 = r8.left
                float r11 = r8.top
                float r13 = r8.bottom
                float[] r15 = a.Ud.j
                android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
                r12 = r10
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                r1.setShader(r9)
                r3.save()
                r3.concat(r4)
                r3.drawRect(r8, r1)
                r3.restore()
                return
        }

        public final float b() {
                r3 = this;
                a.Yd$d r0 = r3.c
                float r1 = r0.c
                float r2 = r3.e
                float r1 = r1 - r2
                float r0 = r0.b
                float r2 = r3.d
                float r0 = r0 - r2
                float r1 = r1 / r0
                double r0 = (double) r1
                double r0 = java.lang.Math.atan(r0)
                double r0 = java.lang.Math.toDegrees(r0)
                float r0 = (float) r0
                return r0
        }
    }

    public static class c extends a.Yd.e {
        public static final android.graphics.RectF h = null;

        @java.lang.Deprecated
        public final float b;

        @java.lang.Deprecated
        public final float c;

        @java.lang.Deprecated
        public final float d;

        @java.lang.Deprecated
        public final float e;

        @java.lang.Deprecated
        public float f;

        @java.lang.Deprecated
        public float g;

        static {
                android.graphics.RectF r0 = new android.graphics.RectF
                r0.<init>()
                a.Yd.c.h = r0
                return
        }

        public c(float r1, float r2, float r3, float r4) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                return
        }

        @Override // a.Yd.e
        public final void a(android.graphics.Matrix r6, android.graphics.Path r7) {
                r5 = this;
                android.graphics.Matrix r0 = r5.f360a
                r6.invert(r0)
                r7.transform(r0)
                android.graphics.RectF r0 = a.Yd.c.h
                float r1 = r5.b
                float r2 = r5.c
                float r3 = r5.d
                float r4 = r5.e
                r0.set(r1, r2, r3, r4)
                float r1 = r5.f
                float r2 = r5.g
                r3 = 0
                r7.arcTo(r0, r1, r2, r3)
                r7.transform(r6)
                return
        }
    }

    public static class d extends a.Yd.e {
        public float b;
        public float c;

        @Override // a.Yd.e
        public final void a(android.graphics.Matrix r3, android.graphics.Path r4) {
                r2 = this;
                android.graphics.Matrix r0 = r2.f360a
                r3.invert(r0)
                r4.transform(r0)
                float r0 = r2.b
                float r1 = r2.c
                r4.lineTo(r0, r1)
                r4.transform(r3)
                return
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Matrix f360a;

        public e() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f360a = r0
                return
        }

        public abstract void a(android.graphics.Matrix r1, android.graphics.Path r2);
    }

    public static abstract class f {
        public static final android.graphics.Matrix b = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Matrix f361a;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                a.Yd.f.b = r0
                return
        }

        public f() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f361a = r0
                return
        }

        public abstract void a(android.graphics.Matrix r1, a.Ud r2, int r3, android.graphics.Canvas r4);
    }

    public Yd() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.g = r0
            r0 = 0
            r1 = 1132920832(0x43870000, float:270.0)
            r2.d(r0, r1, r0)
            return
    }

    public final void a(float r5) {
            r4 = this;
            float r0 = r4.d
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 != 0) goto L7
            goto L13
        L7:
            float r0 = r5 - r0
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 + r1
            float r0 = r0 % r1
            r1 = 1127481344(0x43340000, float:180.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L14
        L13:
            return
        L14:
            a.Yd$c r1 = new a.Yd$c
            float r2 = r4.b
            float r3 = r4.c
            r1.<init>(r2, r3, r2, r3)
            float r2 = r4.d
            r1.f = r2
            r1.g = r0
            java.util.ArrayList r0 = r4.g
            a.Yd$a r2 = new a.Yd$a
            r2.<init>(r1)
            r0.add(r2)
            r4.d = r5
            return
    }

    public final void b(android.graphics.Matrix r5, android.graphics.Path r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.f
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            java.lang.Object r3 = r0.get(r2)
            a.Yd$e r3 = (a.Yd.e) r3
            r3.a(r5, r6)
            int r2 = r2 + 1
            goto L7
        L15:
            return
    }

    public final void c(float r5, float r6) {
            r4 = this;
            a.Yd$d r0 = new a.Yd$d
            r0.<init>()
            r0.b = r5
            r0.c = r6
            java.util.ArrayList r1 = r4.f
            r1.add(r0)
            a.Yd$b r1 = new a.Yd$b
            float r2 = r4.b
            float r3 = r4.c
            r1.<init>(r0, r2, r3)
            float r0 = r1.b()
            r2 = 1132920832(0x43870000, float:270.0)
            float r0 = r0 + r2
            float r3 = r1.b()
            float r3 = r3 + r2
            r4.a(r0)
            java.util.ArrayList r0 = r4.g
            r0.add(r1)
            r4.d = r3
            r4.b = r5
            r4.c = r6
            return
    }

    public final void d(float r2, float r3, float r4) {
            r1 = this;
            r1.f359a = r2
            r0 = 0
            r1.b = r0
            r1.c = r2
            r1.d = r3
            float r3 = r3 + r4
            r2 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r2
            r1.e = r3
            java.util.ArrayList r2 = r1.f
            r2.clear()
            java.util.ArrayList r2 = r1.g
            r2.clear()
            return
    }
}
