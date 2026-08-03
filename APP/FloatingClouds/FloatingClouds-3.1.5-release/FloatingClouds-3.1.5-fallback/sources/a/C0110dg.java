package a;

/* JADX INFO: renamed from: a.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110dg extends a.AbstractC0092cg {
    public static final android.graphics.PorterDuff.Mode j = null;
    public a.C0110dg.g b;
    public android.graphics.PorterDuffColorFilter c;
    public android.graphics.ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final android.graphics.Matrix h;
    public final android.graphics.Rect i;

    /* JADX INFO: renamed from: a.dg$a */
    public static class a extends a.C0110dg.e {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: a.dg$b */
    public static class b extends a.C0110dg.e {
        public a.C0491z3 d;
        public float e;
        public a.C0491z3 f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
        public android.graphics.Paint.Cap l;
        public android.graphics.Paint.Join m;
        public float n;

        public b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.e = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.g = r1
                r2.h = r1
                r2.i = r0
                r2.j = r1
                r2.k = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.l = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.m = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.n = r0
                return
        }

        @Override // a.C0110dg.d
        public final boolean a() {
                r1 = this;
                a.z3 r0 = r1.f
                boolean r0 = r0.b()
                if (r0 != 0) goto L13
                a.z3 r0 = r1.d
                boolean r0 = r0.b()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                return r0
            L13:
                r0 = 1
                return r0
        }

        @Override // a.C0110dg.d
        public final boolean b(int[] r7) {
                r6 = this;
                a.z3 r0 = r6.f
                boolean r1 = r0.b()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.c
                if (r1 == r4) goto L1c
                r0.c = r1
                r0 = r3
                goto L1d
            L1c:
                r0 = r2
            L1d:
                a.z3 r1 = r6.d
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.c
                if (r7 == r4) goto L36
                r1.c = r7
                r2 = r3
            L36:
                r7 = r0 | r2
                return r7
        }

        public float getFillAlpha() {
                r1 = this;
                float r0 = r1.h
                return r0
        }

        public int getFillColor() {
                r1 = this;
                a.z3 r0 = r1.f
                int r0 = r0.c
                return r0
        }

        public float getStrokeAlpha() {
                r1 = this;
                float r0 = r1.g
                return r0
        }

        public int getStrokeColor() {
                r1 = this;
                a.z3 r0 = r1.d
                int r0 = r0.c
                return r0
        }

        public float getStrokeWidth() {
                r1 = this;
                float r0 = r1.e
                return r0
        }

        public float getTrimPathEnd() {
                r1 = this;
                float r0 = r1.j
                return r0
        }

        public float getTrimPathOffset() {
                r1 = this;
                float r0 = r1.k
                return r0
        }

        public float getTrimPathStart() {
                r1 = this;
                float r0 = r1.i
                return r0
        }

        public void setFillAlpha(float r1) {
                r0 = this;
                r0.h = r1
                return
        }

        public void setFillColor(int r2) {
                r1 = this;
                a.z3 r0 = r1.f
                r0.c = r2
                return
        }

        public void setStrokeAlpha(float r1) {
                r0 = this;
                r0.g = r1
                return
        }

        public void setStrokeColor(int r2) {
                r1 = this;
                a.z3 r0 = r1.d
                r0.c = r2
                return
        }

        public void setStrokeWidth(float r1) {
                r0 = this;
                r0.e = r1
                return
        }

        public void setTrimPathEnd(float r1) {
                r0 = this;
                r0.j = r1
                return
        }

        public void setTrimPathOffset(float r1) {
                r0 = this;
                r0.k = r1
                return
        }

        public void setTrimPathStart(float r1) {
                r0 = this;
                r0.i = r1
                return
        }
    }

    /* JADX INFO: renamed from: a.dg$c */
    public static class c extends a.C0110dg.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Matrix f441a;
        public final java.util.ArrayList<a.C0110dg.d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final android.graphics.Matrix j;
        public java.lang.String k;

        public c() {
                r2 = this;
                r2.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r2.f441a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.b = r0
                r0 = 0
                r2.c = r0
                r2.d = r0
                r2.e = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f = r1
                r2.g = r1
                r2.h = r0
                r2.i = r0
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r2.j = r0
                r0 = 0
                r2.k = r0
                return
        }

        public c(a.C0110dg.c r7, a.J1<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                r6.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r6.f441a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.b = r0
                r0 = 0
                r6.c = r0
                r6.d = r0
                r6.e = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r6.f = r1
                r6.g = r1
                r6.h = r0
                r6.i = r0
                android.graphics.Matrix r2 = new android.graphics.Matrix
                r2.<init>()
                r6.j = r2
                r3 = 0
                r6.k = r3
                float r3 = r7.c
                r6.c = r3
                float r3 = r7.d
                r6.d = r3
                float r3 = r7.e
                r6.e = r3
                float r3 = r7.f
                r6.f = r3
                float r3 = r7.g
                r6.g = r3
                float r3 = r7.h
                r6.h = r3
                float r3 = r7.i
                r6.i = r3
                java.lang.String r3 = r7.k
                r6.k = r3
                if (r3 == 0) goto L51
                r8.put(r3, r6)
            L51:
                android.graphics.Matrix r3 = r7.j
                r2.set(r3)
                java.util.ArrayList<a.dg$d> r7 = r7.b
                r2 = 0
            L59:
                int r3 = r7.size()
                if (r2 >= r3) goto Leb
                java.lang.Object r3 = r7.get(r2)
                boolean r4 = r3 instanceof a.C0110dg.c
                if (r4 == 0) goto L74
                a.dg$c r3 = (a.C0110dg.c) r3
                java.util.ArrayList<a.dg$d> r4 = r6.b
                a.dg$c r5 = new a.dg$c
                r5.<init>(r3, r8)
                r4.add(r5)
                goto Ldf
            L74:
                boolean r4 = r3 instanceof a.C0110dg.b
                if (r4 == 0) goto Lc8
                a.dg$b r4 = new a.dg$b
                a.dg$b r3 = (a.C0110dg.b) r3
                r4.<init>(r3)
                r4.e = r0
                r4.g = r1
                r4.h = r1
                r4.i = r0
                r4.j = r1
                r4.k = r0
                android.graphics.Paint$Cap r5 = android.graphics.Paint.Cap.BUTT
                r4.l = r5
                android.graphics.Paint$Join r5 = android.graphics.Paint.Join.MITER
                r4.m = r5
                r5 = 1082130432(0x40800000, float:4.0)
                r4.n = r5
                a.z3 r5 = r3.d
                r4.d = r5
                float r5 = r3.e
                r4.e = r5
                float r5 = r3.g
                r4.g = r5
                a.z3 r5 = r3.f
                r4.f = r5
                int r5 = r3.c
                r4.c = r5
                float r5 = r3.h
                r4.h = r5
                float r5 = r3.i
                r4.i = r5
                float r5 = r3.j
                r4.j = r5
                float r5 = r3.k
                r4.k = r5
                android.graphics.Paint$Cap r5 = r3.l
                r4.l = r5
                android.graphics.Paint$Join r5 = r3.m
                r4.m = r5
                float r3 = r3.n
                r4.n = r3
                goto Ld3
            Lc8:
                boolean r4 = r3 instanceof a.C0110dg.a
                if (r4 == 0) goto Le3
                a.dg$a r4 = new a.dg$a
                a.dg$a r3 = (a.C0110dg.a) r3
                r4.<init>(r3)
            Ld3:
                java.util.ArrayList<a.dg$d> r3 = r6.b
                r3.add(r4)
                java.lang.String r3 = r4.b
                if (r3 == 0) goto Ldf
                r8.put(r3, r4)
            Ldf:
                int r2 = r2 + 1
                goto L59
            Le3:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "Unknown object in the tree!"
                r7.<init>(r8)
                throw r7
            Leb:
                return
        }

        @Override // a.C0110dg.d
        public final boolean a() {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<a.dg$d> r2 = r4.b
                int r3 = r2.size()
                if (r1 >= r3) goto L1b
                java.lang.Object r2 = r2.get(r1)
                a.dg$d r2 = (a.C0110dg.d) r2
                boolean r2 = r2.a()
                if (r2 == 0) goto L18
                r0 = 1
                return r0
            L18:
                int r1 = r1 + 1
                goto L2
            L1b:
                return r0
        }

        @Override // a.C0110dg.d
        public final boolean b(int[] r5) {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<a.dg$d> r2 = r4.b
                int r3 = r2.size()
                if (r0 >= r3) goto L18
                java.lang.Object r2 = r2.get(r0)
                a.dg$d r2 = (a.C0110dg.d) r2
                boolean r2 = r2.b(r5)
                r1 = r1 | r2
                int r0 = r0 + 1
                goto L2
            L18:
                return r1
        }

        public final void c() {
                r4 = this;
                android.graphics.Matrix r0 = r4.j
                r0.reset()
                float r1 = r4.d
                float r1 = -r1
                float r2 = r4.e
                float r2 = -r2
                r0.postTranslate(r1, r2)
                float r1 = r4.f
                float r2 = r4.g
                r0.postScale(r1, r2)
                float r1 = r4.c
                r2 = 0
                r0.postRotate(r1, r2, r2)
                float r1 = r4.h
                float r2 = r4.d
                float r1 = r1 + r2
                float r2 = r4.i
                float r3 = r4.e
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        public java.lang.String getGroupName() {
                r1 = this;
                java.lang.String r0 = r1.k
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.j
                return r0
        }

        public float getPivotX() {
                r1 = this;
                float r0 = r1.d
                return r0
        }

        public float getPivotY() {
                r1 = this;
                float r0 = r1.e
                return r0
        }

        public float getRotation() {
                r1 = this;
                float r0 = r1.c
                return r0
        }

        public float getScaleX() {
                r1 = this;
                float r0 = r1.f
                return r0
        }

        public float getScaleY() {
                r1 = this;
                float r0 = r1.g
                return r0
        }

        public float getTranslateX() {
                r1 = this;
                float r0 = r1.h
                return r0
        }

        public float getTranslateY() {
                r1 = this;
                float r0 = r1.i
                return r0
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.d
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.d = r2
                r1.c()
            Lb:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.e
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.e = r2
                r1.c()
            Lb:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.c
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.c = r2
                r1.c()
            Lb:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.f
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f = r2
                r1.c()
            Lb:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.g
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.g = r2
                r1.c()
            Lb:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.h
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.h = r2
                r1.c()
            Lb:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.i
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.i = r2
                r1.c()
            Lb:
                return
        }
    }

    /* JADX INFO: renamed from: a.dg$d */
    public static abstract class d {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean a() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean b(int[] r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: a.dg$e */
    public static abstract class e extends a.C0110dg.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.C0374sc.a[] f442a;
        public java.lang.String b;
        public int c;

        public e() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f442a = r0
                r0 = 0
                r1.c = r0
                return
        }

        public e(a.C0110dg.e r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f442a = r0
                r0 = 0
                r1.c = r0
                java.lang.String r0 = r2.b
                r1.b = r0
                a.sc$a[] r2 = r2.f442a
                a.sc$a[] r2 = a.C0374sc.c(r2)
                r1.f442a = r2
                return
        }

        public a.C0374sc.a[] getPathData() {
                r1 = this;
                a.sc$a[] r0 = r1.f442a
                return r0
        }

        public java.lang.String getPathName() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }

        public void setPathData(a.C0374sc.a[] r8) {
                r7 = this;
                a.sc$a[] r0 = r7.f442a
                r1 = 0
                if (r0 == 0) goto L28
                if (r8 != 0) goto L8
                goto L28
            L8:
                int r2 = r0.length
                int r3 = r8.length
                if (r2 == r3) goto Ld
                goto L28
            Ld:
                r2 = r1
            Le:
                int r3 = r0.length
                if (r2 >= r3) goto L27
                r3 = r0[r2]
                char r4 = r3.f687a
                r5 = r8[r2]
                char r6 = r5.f687a
                if (r4 != r6) goto L28
                float[] r3 = r3.b
                int r3 = r3.length
                float[] r4 = r5.b
                int r4 = r4.length
                if (r3 == r4) goto L24
                goto L28
            L24:
                int r2 = r2 + 1
                goto Le
            L27:
                r1 = 1
            L28:
                if (r1 != 0) goto L31
                a.sc$a[] r8 = a.C0374sc.c(r8)
                r7.f442a = r8
                return
            L31:
                a.sc$a[] r0 = r7.f442a
                r1 = 0
                r2 = r1
            L35:
                int r3 = r8.length
                if (r2 >= r3) goto L56
                r3 = r0[r2]
                r4 = r8[r2]
                char r4 = r4.f687a
                r3.f687a = r4
                r3 = r1
            L41:
                r4 = r8[r2]
                float[] r4 = r4.b
                int r5 = r4.length
                if (r3 >= r5) goto L53
                r5 = r0[r2]
                float[] r5 = r5.b
                r4 = r4[r3]
                r5[r3] = r4
                int r3 = r3 + 1
                goto L41
            L53:
                int r2 = r2 + 1
                goto L35
            L56:
                return
        }
    }

    /* JADX INFO: renamed from: a.dg$f */
    public static class f {
        public static final android.graphics.Matrix p = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Path f443a;
        public final android.graphics.Path b;
        public final android.graphics.Matrix c;
        public android.graphics.Paint d;
        public android.graphics.Paint e;
        public android.graphics.PathMeasure f;
        public final a.C0110dg.c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public java.lang.String m;
        public java.lang.Boolean n;
        public final a.J1<java.lang.String, java.lang.Object> o;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                a.C0110dg.f.p = r0
                return
        }

        public f() {
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
                a.J1 r0 = new a.J1
                r0.<init>()
                r1.o = r0
                a.dg$c r0 = new a.dg$c
                r0.<init>()
                r1.g = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f443a = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.b = r0
                return
        }

        public f(a.C0110dg.f r4) {
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
                a.J1 r0 = new a.J1
                r0.<init>()
                r3.o = r0
                a.dg$c r1 = new a.dg$c
                a.dg$c r2 = r4.g
                r1.<init>(r2, r0)
                r3.g = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.f443a
                r1.<init>(r2)
                r3.f443a = r1
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

        public final void a(a.C0110dg.c r22, android.graphics.Matrix r23, android.graphics.Canvas r24, int r25, int r26) {
                r21 = this;
                r6 = r22
                r7 = 1
                android.graphics.Matrix r0 = r6.f441a
                r1 = r23
                r0.set(r1)
                android.graphics.Matrix r2 = r6.f441a
                android.graphics.Matrix r0 = r6.j
                r2.preConcat(r0)
                r24.save()
                r8 = 0
                r9 = r8
            L16:
                java.util.ArrayList<a.dg$d> r0 = r6.b
                int r1 = r0.size()
                if (r9 >= r1) goto L22b
                java.lang.Object r0 = r0.get(r9)
                a.dg$d r0 = (a.C0110dg.d) r0
                boolean r1 = r0 instanceof a.C0110dg.c
                if (r1 == 0) goto L3d
                r1 = r0
                a.dg$c r1 = (a.C0110dg.c) r1
                r0 = r21
                r3 = r24
                r4 = r25
                r5 = r26
                r0.a(r1, r2, r3, r4, r5)
                r1 = r0
            L37:
                r10 = r26
                r19 = r7
                goto L222
            L3d:
                r1 = r21
                r3 = r24
                boolean r4 = r0 instanceof a.C0110dg.e
                if (r4 == 0) goto L21e
                a.dg$e r0 = (a.C0110dg.e) r0
                r4 = r25
                float r5 = (float) r4
                float r10 = r1.j
                float r5 = r5 / r10
                r10 = r26
                float r11 = (float) r10
                float r12 = r1.k
                float r11 = r11 / r12
                float r12 = java.lang.Math.min(r5, r11)
                android.graphics.Matrix r13 = r1.c
                r13.set(r2)
                r13.postScale(r5, r11)
                r14 = 4
                float[] r14 = new float[r14]
                r14 = {x0234: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
                r2.mapVectors(r14)
                r15 = r14[r8]
                r23 = r12
                r16 = 1065353216(0x3f800000, float:1.0)
                double r11 = (double) r15
                r15 = r14[r7]
                r17 = 0
                double r5 = (double) r15
                double r5 = java.lang.Math.hypot(r11, r5)
                float r5 = (float) r5
                r6 = 2
                r11 = r14[r6]
                double r11 = (double) r11
                r15 = 3
                r18 = r6
                r6 = r14[r15]
                r19 = r7
                r20 = r8
                double r7 = (double) r6
                double r6 = java.lang.Math.hypot(r11, r7)
                float r6 = (float) r6
                r7 = r14[r20]
                r8 = r14[r19]
                r11 = r14[r18]
                r12 = r14[r15]
                float r7 = r7 * r12
                float r8 = r8 * r11
                float r7 = r7 - r8
                float r5 = java.lang.Math.max(r5, r6)
                int r6 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
                if (r6 <= 0) goto La5
                float r6 = java.lang.Math.abs(r7)
                float r6 = r6 / r5
                goto La7
            La5:
                r6 = r17
            La7:
                int r5 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                if (r5 != 0) goto Lad
                goto L21b
            Lad:
                android.graphics.Path r5 = r1.f443a
                r0.getClass()
                r5.reset()
                a.sc$a[] r7 = r0.f442a
                if (r7 == 0) goto Lbc
                a.C0374sc.a.b(r7, r5)
            Lbc:
                android.graphics.Path r7 = r1.b
                r7.reset()
                boolean r8 = r0 instanceof a.C0110dg.a
                if (r8 == 0) goto Ld9
                int r0 = r0.c
                if (r0 != 0) goto Lcc
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
                goto Lce
            Lcc:
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            Lce:
                r7.setFillType(r0)
                r7.addPath(r5, r13)
                r3.clipPath(r7)
                goto L21b
            Ld9:
                a.dg$b r0 = (a.C0110dg.b) r0
                float r8 = r0.i
                int r11 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
                if (r11 != 0) goto Le7
                float r11 = r0.j
                int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                if (r11 == 0) goto L12d
            Le7:
                float r11 = r0.k
                float r8 = r8 + r11
                float r8 = r8 % r16
                float r12 = r0.j
                float r12 = r12 + r11
                float r12 = r12 % r16
                android.graphics.PathMeasure r11 = r1.f
                if (r11 != 0) goto Lfc
                android.graphics.PathMeasure r11 = new android.graphics.PathMeasure
                r11.<init>()
                r1.f = r11
            Lfc:
                android.graphics.PathMeasure r11 = r1.f
                r14 = r20
                r11.setPath(r5, r14)
                android.graphics.PathMeasure r11 = r1.f
                float r11 = r11.getLength()
                float r8 = r8 * r11
                float r12 = r12 * r11
                r5.reset()
                int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r15 <= 0) goto L121
                android.graphics.PathMeasure r15 = r1.f
                r14 = r19
                r15.getSegment(r8, r11, r5, r14)
                android.graphics.PathMeasure r8 = r1.f
                r11 = r17
                r8.getSegment(r11, r12, r5, r14)
                goto L12a
            L121:
                r11 = r17
                r14 = r19
                android.graphics.PathMeasure r15 = r1.f
                r15.getSegment(r8, r12, r5, r14)
            L12a:
                r5.rLineTo(r11, r11)
            L12d:
                r7.addPath(r5, r13)
                a.z3 r5 = r0.f
                android.graphics.Shader r8 = r5.f775a
                if (r8 == 0) goto L137
                goto L13b
            L137:
                int r8 = r5.c
                if (r8 == 0) goto L13d
            L13b:
                r8 = 1
                goto L13e
            L13d:
                r8 = 0
            L13e:
                r12 = 0
                r14 = 255(0xff, float:3.57E-43)
                r15 = 1132396544(0x437f0000, float:255.0)
                if (r8 == 0) goto L1a6
                android.graphics.Paint r8 = r1.e
                if (r8 != 0) goto L15a
                android.graphics.Paint r8 = new android.graphics.Paint
                r11 = 1
                r16 = 16777215(0xffffff, float:2.3509886E-38)
                r8.<init>(r11)
                r1.e = r8
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
                r8.setStyle(r11)
                goto L15d
            L15a:
                r16 = 16777215(0xffffff, float:2.3509886E-38)
            L15d:
                android.graphics.Paint r8 = r1.e
                android.graphics.Shader r11 = r5.f775a
                if (r11 == 0) goto L176
                r11.setLocalMatrix(r13)
                r8.setShader(r11)
                float r5 = r0.h
                float r5 = r5 * r15
                int r5 = java.lang.Math.round(r5)
                r8.setAlpha(r5)
                r17 = r15
                goto L193
            L176:
                r8.setShader(r12)
                r8.setAlpha(r14)
                int r5 = r5.c
                float r11 = r0.h
                android.graphics.PorterDuff$Mode r17 = a.C0110dg.j
                r17 = r15
                int r15 = android.graphics.Color.alpha(r5)
                r5 = r5 & r16
                float r15 = (float) r15
                float r15 = r15 * r11
                int r11 = (int) r15
                int r11 = r11 << 24
                r5 = r5 | r11
                r8.setColor(r5)
            L193:
                r8.setColorFilter(r12)
                int r5 = r0.c
                if (r5 != 0) goto L19d
                android.graphics.Path$FillType r5 = android.graphics.Path.FillType.WINDING
                goto L19f
            L19d:
                android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            L19f:
                r7.setFillType(r5)
                r3.drawPath(r7, r8)
                goto L1ab
            L1a6:
                r17 = r15
                r16 = 16777215(0xffffff, float:2.3509886E-38)
            L1ab:
                a.z3 r5 = r0.d
                android.graphics.Shader r8 = r5.f775a
                if (r8 == 0) goto L1b2
                goto L1b6
            L1b2:
                int r8 = r5.c
                if (r8 == 0) goto L21b
            L1b6:
                android.graphics.Paint r8 = r1.d
                if (r8 != 0) goto L1c7
                android.graphics.Paint r8 = new android.graphics.Paint
                r11 = 1
                r8.<init>(r11)
                r1.d = r8
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
                r8.setStyle(r11)
            L1c7:
                android.graphics.Paint r8 = r1.d
                android.graphics.Paint$Join r11 = r0.m
                if (r11 == 0) goto L1d0
                r8.setStrokeJoin(r11)
            L1d0:
                android.graphics.Paint$Cap r11 = r0.l
                if (r11 == 0) goto L1d7
                r8.setStrokeCap(r11)
            L1d7:
                float r11 = r0.n
                r8.setStrokeMiter(r11)
                android.graphics.Shader r11 = r5.f775a
                if (r11 == 0) goto L1f2
                r11.setLocalMatrix(r13)
                r8.setShader(r11)
                float r5 = r0.g
                float r5 = r5 * r17
                int r5 = java.lang.Math.round(r5)
                r8.setAlpha(r5)
                goto L20d
            L1f2:
                r8.setShader(r12)
                r8.setAlpha(r14)
                int r5 = r5.c
                float r11 = r0.g
                android.graphics.PorterDuff$Mode r13 = a.C0110dg.j
                int r13 = android.graphics.Color.alpha(r5)
                r5 = r5 & r16
                float r13 = (float) r13
                float r13 = r13 * r11
                int r11 = (int) r13
                int r11 = r11 << 24
                r5 = r5 | r11
                r8.setColor(r5)
            L20d:
                r8.setColorFilter(r12)
                float r12 = r23 * r6
                float r0 = r0.e
                float r0 = r0 * r12
                r8.setStrokeWidth(r0)
                r3.drawPath(r7, r8)
            L21b:
                r19 = 1
                goto L222
            L21e:
                r4 = r25
                goto L37
            L222:
                int r9 = r9 + 1
                r6 = r22
                r7 = r19
                r8 = 0
                goto L16
            L22b:
                r1 = r21
                r3 = r24
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

    /* JADX INFO: renamed from: a.dg$g */
    public static class g extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f444a;
        public a.C0110dg.f b;
        public android.content.res.ColorStateList c;
        public android.graphics.PorterDuff.Mode d;
        public boolean e;
        public android.graphics.Bitmap f;
        public android.content.res.ColorStateList g;
        public android.graphics.PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public android.graphics.Paint l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f444a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                a.dg r0 = new a.dg
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                a.dg r1 = new a.dg
                r1.<init>(r0)
                return r1
        }
    }

    /* JADX INFO: renamed from: a.dg$h */
    public static class h extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.drawable.Drawable.ConstantState f445a;

        public h(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f445a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f445a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f445a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                a.dg r0 = new a.dg
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f445a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f428a = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                a.dg r0 = new a.dg
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f445a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f428a = r3
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                a.dg r0 = new a.dg
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f445a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f428a = r3
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            a.C0110dg.j = r0
            return
    }

    public C0110dg() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.g = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.i = r0
            a.dg$g r0 = new a.dg$g
            r0.<init>()
            r1 = 0
            r0.c = r1
            android.graphics.PorterDuff$Mode r1 = a.C0110dg.j
            r0.d = r1
            a.dg$f r1 = new a.dg$f
            r1.<init>()
            r0.b = r1
            r2.b = r0
            return
    }

    public C0110dg(a.C0110dg.g r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.g = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.i = r0
            r1.b = r2
            android.content.res.ColorStateList r0 = r2.c
            android.graphics.PorterDuff$Mode r2 = r2.d
            android.graphics.PorterDuffColorFilter r2 = r1.a(r0, r2)
            r1.c = r2
            return
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L7
            a.C0439w5.a.b(r0)
        L7:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.drawable.Drawable r2 = r0.f428a
            if (r2 == 0) goto Lc
            r2.draw(r1)
            return
        Lc:
            android.graphics.Rect r2 = r0.i
            r0.copyBounds(r2)
            int r3 = r2.width()
            if (r3 <= 0) goto L16e
            int r3 = r2.height()
            if (r3 > 0) goto L1f
            goto L16e
        L1f:
            android.graphics.ColorFilter r3 = r0.d
            if (r3 != 0) goto L25
            android.graphics.PorterDuffColorFilter r3 = r0.c
        L25:
            android.graphics.Matrix r4 = r0.h
            r1.getMatrix(r4)
            float[] r5 = r0.g
            r4.getValues(r5)
            r4 = 0
            r6 = r5[r4]
            float r6 = java.lang.Math.abs(r6)
            r7 = 4
            r7 = r5[r7]
            float r7 = java.lang.Math.abs(r7)
            r8 = 1
            r9 = r5[r8]
            float r9 = java.lang.Math.abs(r9)
            r10 = 3
            r5 = r5[r10]
            float r5 = java.lang.Math.abs(r5)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto L56
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L58
        L56:
            r6 = r11
            r7 = r6
        L58:
            int r5 = r2.width()
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r2.height()
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            r7 = 2048(0x800, float:2.87E-42)
            int r5 = java.lang.Math.min(r7, r5)
            int r6 = java.lang.Math.min(r7, r6)
            if (r5 <= 0) goto L16e
            if (r6 > 0) goto L76
            goto L16e
        L76:
            int r7 = r1.save()
            int r9 = r2.left
            float r9 = (float) r9
            int r12 = r2.top
            float r12 = (float) r12
            r1.translate(r9, r12)
            boolean r9 = r0.isAutoMirrored()
            if (r9 == 0) goto L9c
            int r9 = a.C0439w5.b.a(r0)
            if (r9 != r8) goto L9c
            int r9 = r2.width()
            float r9 = (float) r9
            r1.translate(r9, r10)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r9, r11)
        L9c:
            r2.offsetTo(r4, r4)
            a.dg$g r9 = r0.b
            android.graphics.Bitmap r10 = r9.f
            if (r10 == 0) goto Lb4
            int r10 = r10.getWidth()
            if (r5 != r10) goto Lb4
            android.graphics.Bitmap r10 = r9.f
            int r10 = r10.getHeight()
            if (r6 != r10) goto Lb4
            goto Lbe
        Lb4:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            r9.f = r10
            r9.k = r8
        Lbe:
            boolean r9 = r0.f
            if (r9 != 0) goto Lde
            a.dg$g r9 = r0.b
            android.graphics.Bitmap r10 = r9.f
            r10.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r4 = r9.f
            r15.<init>(r4)
            a.dg$f r12 = r9.b
            android.graphics.Matrix r14 = a.C0110dg.f.p
            a.dg$c r13 = r12.g
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            goto L134
        Lde:
            r16 = r5
            r17 = r6
            a.dg$g r5 = r0.b
            boolean r6 = r5.k
            if (r6 != 0) goto L105
            android.content.res.ColorStateList r6 = r5.g
            android.content.res.ColorStateList r9 = r5.c
            if (r6 != r9) goto L105
            android.graphics.PorterDuff$Mode r6 = r5.h
            android.graphics.PorterDuff$Mode r9 = r5.d
            if (r6 != r9) goto L105
            boolean r6 = r5.j
            boolean r9 = r5.e
            if (r6 != r9) goto L105
            int r6 = r5.i
            a.dg$f r5 = r5.b
            int r5 = r5.getRootAlpha()
            if (r6 != r5) goto L105
            goto L134
        L105:
            a.dg$g r5 = r0.b
            android.graphics.Bitmap r6 = r5.f
            r6.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r6 = r5.f
            r15.<init>(r6)
            a.dg$f r12 = r5.b
            android.graphics.Matrix r14 = a.C0110dg.f.p
            a.dg$c r13 = r12.g
            r12.a(r13, r14, r15, r16, r17)
            a.dg$g r5 = r0.b
            android.content.res.ColorStateList r6 = r5.c
            r5.g = r6
            android.graphics.PorterDuff$Mode r6 = r5.d
            r5.h = r6
            a.dg$f r6 = r5.b
            int r6 = r6.getRootAlpha()
            r5.i = r6
            boolean r6 = r5.e
            r5.j = r6
            r5.k = r4
        L134:
            a.dg$g r4 = r0.b
            a.dg$f r5 = r4.b
            int r5 = r5.getRootAlpha()
            r6 = 255(0xff, float:3.57E-43)
            r9 = 0
            if (r5 >= r6) goto L142
            goto L146
        L142:
            if (r3 != 0) goto L146
            r3 = r9
            goto L166
        L146:
            android.graphics.Paint r5 = r4.l
            if (r5 != 0) goto L154
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.l = r5
            r5.setFilterBitmap(r8)
        L154:
            android.graphics.Paint r5 = r4.l
            a.dg$f r6 = r4.b
            int r6 = r6.getRootAlpha()
            r5.setAlpha(r6)
            android.graphics.Paint r5 = r4.l
            r5.setColorFilter(r3)
            android.graphics.Paint r3 = r4.l
        L166:
            android.graphics.Bitmap r4 = r4.f
            r1.drawBitmap(r4, r9, r2, r3)
            r1.restoreToCount(r7)
        L16e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getAlpha()
            return r0
        L9:
            a.dg$g r0 = r1.b
            a.dg$f r0 = r0.b
            int r0 = r0.getRootAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            a.dg$g r1 = r2.b
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = a.C0439w5.a.c(r0)
            return r0
        L9:
            android.graphics.ColorFilter r0 = r1.d
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L10
            a.dg$h r0 = new a.dg$h
            android.graphics.drawable.Drawable r1 = r2.f428a
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            a.dg$g r0 = r2.b
            int r1 = r2.getChangingConfigurations()
            r0.f444a = r1
            a.dg$g r0 = r2.b
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            a.dg$g r0 = r1.b
            a.dg$f r0 = r0.b
            float r0 = r0.i
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            a.dg$g r0 = r1.b
            a.dg$f r0 = r0.b
            float r0 = r0.h
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.inflate(r2, r3, r4)
            return
        L8:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L12
            a.C0439w5.a.d(r0, r2, r3, r4, r5)
            return
        L12:
            a.dg$g r6 = r1.b
            a.dg$f r0 = new a.dg$f
            r0.<init>()
            r6.b = r0
            int[] r0 = a.C0327q0.f646a
            android.content.res.TypedArray r7 = a.Lf.c(r2, r5, r4, r0)
            a.dg$g r8 = r1.b
            a.dg$f r9 = r8.b
            java.lang.String r0 = "tintMode"
            boolean r0 = a.Lf.b(r3, r0)
            r10 = 6
            r11 = -1
            if (r0 != 0) goto L31
            r0 = r11
            goto L35
        L31:
            int r0 = r7.getInt(r10, r11)
        L35:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 3
            r14 = 9
            r15 = 5
            if (r0 == r13) goto L51
            if (r0 == r15) goto L53
            if (r0 == r14) goto L4e
            switch(r0) {
                case 14: goto L4b;
                case 15: goto L48;
                case 16: goto L45;
                default: goto L44;
            }
        L44:
            goto L53
        L45:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L53
        L48:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L53
        L4b:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L53
        L4e:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L53
        L51:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L53:
            r8.d = r12
            java.lang.String r12 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = "tint"
            java.lang.String r0 = r3.getAttributeValue(r12, r0)
            r10 = 0
            r14 = 1
            if (r0 == 0) goto L63
            r0 = r14
            goto L64
        L63:
            r0 = r10
        L64:
            r17 = 0
            r11 = 2
            if (r0 == 0) goto L83
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.getValue(r14, r0)
            int r13 = r0.type
            if (r13 == r11) goto La2
            r11 = 28
            if (r13 < r11) goto L86
            r11 = 31
            if (r13 > r11) goto L86
            int r0 = r0.data
            android.content.res.ColorStateList r17 = android.content.res.ColorStateList.valueOf(r0)
        L83:
            r0 = r17
            goto Lb6
        L86:
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r7.getResourceId(r14, r10)
            java.lang.ThreadLocal<android.util.TypedValue> r13 = a.C0401u3.f706a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch: java.lang.Exception -> L99
            android.content.res.ColorStateList r17 = a.C0401u3.a(r0, r11, r5)     // Catch: java.lang.Exception -> L99
            goto L83
        L99:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r13 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r13, r0)
            goto L83
        La2:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to resolve attribute at index 1: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Lb6:
            if (r0 == 0) goto Lba
            r8.c = r0
        Lba:
            boolean r0 = r8.e
            java.lang.String r11 = "autoMirrored"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto Lc8
            boolean r0 = r7.getBoolean(r15, r0)
        Lc8:
            r8.e = r0
            float r0 = r9.j
            java.lang.String r8 = "viewportWidth"
            java.lang.String r8 = r3.getAttributeValue(r12, r8)
            if (r8 == 0) goto Ld6
            r8 = r14
            goto Ld7
        Ld6:
            r8 = r10
        Ld7:
            r11 = 7
            if (r8 != 0) goto Ldb
            goto Ldf
        Ldb:
            float r0 = r7.getFloat(r11, r0)
        Ldf:
            r9.j = r0
            float r0 = r9.k
            java.lang.String r8 = "viewportHeight"
            java.lang.String r8 = r3.getAttributeValue(r12, r8)
            if (r8 == 0) goto Led
            r8 = r14
            goto Lee
        Led:
            r8 = r10
        Lee:
            r13 = 8
            if (r8 != 0) goto Lf3
            goto Lf7
        Lf3:
            float r0 = r7.getFloat(r13, r0)
        Lf7:
            r9.k = r0
            float r8 = r9.j
            r17 = 0
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L47a
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L45f
            float r0 = r9.h
            r8 = 3
            float r0 = r7.getDimension(r8, r0)
            r9.h = r0
            float r0 = r9.i
            r8 = 2
            float r0 = r7.getDimension(r8, r0)
            r9.i = r0
            float r8 = r9.h
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 <= 0) goto L444
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 <= 0) goto L429
            float r0 = r9.getAlpha()
            java.lang.String r8 = "alpha"
            java.lang.String r8 = r3.getAttributeValue(r12, r8)
            if (r8 == 0) goto L12f
            r8 = r14
            goto L130
        L12f:
            r8 = r10
        L130:
            r15 = 4
            if (r8 != 0) goto L134
            goto L138
        L134:
            float r0 = r7.getFloat(r15, r0)
        L138:
            r9.setAlpha(r0)
            java.lang.String r0 = r7.getString(r10)
            if (r0 == 0) goto L148
            r9.m = r0
            a.J1<java.lang.String, java.lang.Object> r8 = r9.o
            r8.put(r0, r9)
        L148:
            r7.recycle()
            int r0 = r1.getChangingConfigurations()
            r6.f444a = r0
            r6.k = r14
            a.dg$g r0 = r1.b
            a.dg$f r7 = r0.b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            a.dg$c r9 = r7.g
            r8.push(r9)
            int r9 = r3.getEventType()
            int r18 = r3.getDepth()
            int r11 = r18 + 1
            r18 = r14
        L16d:
            if (r9 == r14) goto L414
            int r15 = r3.getDepth()
            if (r15 >= r11) goto L178
            r15 = 3
            if (r9 == r15) goto L414
        L178:
            java.lang.String r15 = "group"
            r13 = 2
            if (r9 != r13) goto L3eb
            java.lang.String r9 = r3.getName()
            java.lang.Object r13 = r8.peek()
            a.dg$c r13 = (a.C0110dg.c) r13
            java.lang.String r14 = "path"
            boolean r14 = r14.equals(r9)
            java.lang.String r10 = "fillType"
            r21 = r11
            java.lang.String r11 = "pathData"
            r22 = r14
            a.J1<java.lang.String, java.lang.Object> r14 = r7.o
            if (r22 == 0) goto L2dc
            a.dg$b r9 = new a.dg$b
            r9.<init>()
            int[] r15 = a.C0327q0.c
            android.content.res.TypedArray r15 = a.Lf.c(r2, r5, r4, r15)
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L2b7
            r22 = r7
            r11 = 0
            java.lang.String r7 = r15.getString(r11)
            if (r7 == 0) goto L1b5
            r9.b = r7
        L1b5:
            r7 = 2
            java.lang.String r11 = r15.getString(r7)
            if (r11 == 0) goto L1c2
            a.sc$a[] r7 = a.C0374sc.b(r11)
            r9.f442a = r7
        L1c2:
            java.lang.String r7 = "fillColor"
            r11 = 1
            a.z3 r7 = a.Lf.a(r15, r3, r5, r7, r11)
            r9.f = r7
            float r7 = r9.h
            java.lang.String r11 = "fillAlpha"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L1db
            r11 = 12
            float r7 = r15.getFloat(r11, r7)
        L1db:
            r9.h = r7
            java.lang.String r7 = "strokeLineCap"
            java.lang.String r7 = r3.getAttributeValue(r12, r7)
            if (r7 == 0) goto L1ef
            r7 = -1
            r11 = 8
            int r18 = r15.getInt(r11, r7)
            r7 = r18
            goto L1f0
        L1ef:
            r7 = -1
        L1f0:
            android.graphics.Paint$Cap r11 = r9.l
            if (r7 == 0) goto L205
            r18 = r11
            r11 = 1
            if (r7 == r11) goto L202
            r11 = 2
            if (r7 == r11) goto L1ff
            r11 = r18
            goto L207
        L1ff:
            android.graphics.Paint$Cap r11 = android.graphics.Paint.Cap.SQUARE
            goto L207
        L202:
            android.graphics.Paint$Cap r11 = android.graphics.Paint.Cap.ROUND
            goto L207
        L205:
            android.graphics.Paint$Cap r11 = android.graphics.Paint.Cap.BUTT
        L207:
            r9.l = r11
            java.lang.String r7 = "strokeLineJoin"
            java.lang.String r7 = r3.getAttributeValue(r12, r7)
            if (r7 == 0) goto L21b
            r7 = -1
            r11 = 9
            int r16 = r15.getInt(r11, r7)
            r7 = r16
            goto L21c
        L21b:
            r7 = -1
        L21c:
            android.graphics.Paint$Join r11 = r9.m
            if (r7 == 0) goto L231
            r18 = r11
            r11 = 1
            if (r7 == r11) goto L22e
            r11 = 2
            if (r7 == r11) goto L22b
            r11 = r18
            goto L233
        L22b:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.BEVEL
            goto L233
        L22e:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.ROUND
            goto L233
        L231:
            android.graphics.Paint$Join r11 = android.graphics.Paint.Join.MITER
        L233:
            r9.m = r11
            float r7 = r9.n
            java.lang.String r11 = "strokeMiterLimit"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L245
            r11 = 10
            float r7 = r15.getFloat(r11, r7)
        L245:
            r9.n = r7
            java.lang.String r7 = "strokeColor"
            r11 = 3
            a.z3 r7 = a.Lf.a(r15, r3, r5, r7, r11)
            r9.d = r7
            float r7 = r9.g
            java.lang.String r11 = "strokeAlpha"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L260
            r11 = 11
            float r7 = r15.getFloat(r11, r7)
        L260:
            r9.g = r7
            float r7 = r9.e
            java.lang.String r11 = "strokeWidth"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L271
            r11 = 4
            float r7 = r15.getFloat(r11, r7)
        L271:
            r9.e = r7
            float r7 = r9.j
            java.lang.String r11 = "trimPathEnd"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L282
            r11 = 6
            float r7 = r15.getFloat(r11, r7)
        L282:
            r9.j = r7
            float r7 = r9.k
            java.lang.String r11 = "trimPathOffset"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L293
            r11 = 7
            float r7 = r15.getFloat(r11, r7)
        L293:
            r9.k = r7
            float r7 = r9.i
            java.lang.String r11 = "trimPathStart"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L2a4
            r11 = 5
            float r7 = r15.getFloat(r11, r7)
        L2a4:
            r9.i = r7
            int r7 = r9.c
            java.lang.String r10 = r3.getAttributeValue(r12, r10)
            if (r10 == 0) goto L2b4
            r10 = 13
            int r7 = r15.getInt(r10, r7)
        L2b4:
            r9.c = r7
            goto L2b9
        L2b7:
            r22 = r7
        L2b9:
            r15.recycle()
            java.util.ArrayList<a.dg$d> r7 = r13.b
            r7.add(r9)
            java.lang.String r7 = r9.getPathName()
            if (r7 == 0) goto L2ce
            java.lang.String r7 = r9.getPathName()
            r14.put(r7, r9)
        L2ce:
            int r7 = r0.f444a
            r0.f444a = r7
            r10 = 0
            r15 = 1
            r16 = 9
            r18 = 0
            r19 = 8
            goto L3e7
        L2dc:
            r22 = r7
            r16 = 9
            r19 = 8
            java.lang.String r7 = "clip-path"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L33f
            a.dg$a r7 = new a.dg$a
            r7.<init>()
            java.lang.String r9 = r3.getAttributeValue(r12, r11)
            if (r9 == 0) goto L325
            int[] r9 = a.C0327q0.d
            android.content.res.TypedArray r9 = a.Lf.c(r2, r5, r4, r9)
            r11 = 0
            java.lang.String r15 = r9.getString(r11)
            if (r15 == 0) goto L304
            r7.b = r15
        L304:
            r11 = 1
            java.lang.String r15 = r9.getString(r11)
            if (r15 == 0) goto L311
            a.sc$a[] r11 = a.C0374sc.b(r15)
            r7.f442a = r11
        L311:
            boolean r10 = a.Lf.b(r3, r10)
            if (r10 != 0) goto L319
            r11 = 0
            goto L320
        L319:
            r10 = 2
            r11 = 0
            int r15 = r9.getInt(r10, r11)
            r11 = r15
        L320:
            r7.c = r11
            r9.recycle()
        L325:
            java.util.ArrayList<a.dg$d> r9 = r13.b
            r9.add(r7)
            java.lang.String r9 = r7.getPathName()
            if (r9 == 0) goto L337
            java.lang.String r9 = r7.getPathName()
            r14.put(r9, r7)
        L337:
            int r7 = r0.f444a
            r0.f444a = r7
        L33b:
            r10 = 0
            r15 = 1
            goto L3e7
        L33f:
            boolean r7 = r15.equals(r9)
            if (r7 == 0) goto L33b
            a.dg$c r7 = new a.dg$c
            r7.<init>()
            int[] r9 = a.C0327q0.b
            android.content.res.TypedArray r9 = a.Lf.c(r2, r5, r4, r9)
            float r10 = r7.c
            java.lang.String r11 = "rotation"
            boolean r11 = a.Lf.b(r3, r11)
            if (r11 != 0) goto L35c
            r11 = 5
            goto L361
        L35c:
            r11 = 5
            float r10 = r9.getFloat(r11, r10)
        L361:
            r7.c = r10
            float r10 = r7.d
            r15 = 1
            float r10 = r9.getFloat(r15, r10)
            r7.d = r10
            float r10 = r7.e
            r11 = 2
            float r10 = r9.getFloat(r11, r10)
            r7.e = r10
            float r10 = r7.f
            java.lang.String r11 = "scaleX"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L384
            r11 = 3
            float r10 = r9.getFloat(r11, r10)
        L384:
            r7.f = r10
            float r10 = r7.g
            java.lang.String r11 = "scaleY"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L396
            r11 = 4
            float r10 = r9.getFloat(r11, r10)
            goto L397
        L396:
            r11 = 4
        L397:
            r7.g = r10
            float r10 = r7.h
            java.lang.String r11 = "translateX"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L3a9
            r11 = 6
            float r10 = r9.getFloat(r11, r10)
            goto L3aa
        L3a9:
            r11 = 6
        L3aa:
            r7.h = r10
            float r10 = r7.i
            java.lang.String r11 = "translateY"
            java.lang.String r11 = r3.getAttributeValue(r12, r11)
            if (r11 == 0) goto L3bc
            r11 = 7
            float r10 = r9.getFloat(r11, r10)
            goto L3bd
        L3bc:
            r11 = 7
        L3bd:
            r7.i = r10
            r10 = 0
            java.lang.String r11 = r9.getString(r10)
            if (r11 == 0) goto L3c8
            r7.k = r11
        L3c8:
            r7.c()
            r9.recycle()
            java.util.ArrayList<a.dg$d> r9 = r13.b
            r9.add(r7)
            r8.push(r7)
            java.lang.String r9 = r7.getGroupName()
            if (r9 == 0) goto L3e3
            java.lang.String r9 = r7.getGroupName()
            r14.put(r9, r7)
        L3e3:
            int r7 = r0.f444a
            r0.f444a = r7
        L3e7:
            r20 = r15
            r11 = 3
            goto L405
        L3eb:
            r22 = r7
            r21 = r11
            r20 = r14
            r11 = 3
            r16 = 9
            r19 = 8
            if (r9 != r11) goto L405
            java.lang.String r7 = r3.getName()
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L405
            r8.pop()
        L405:
            int r9 = r3.next()
            r13 = r19
            r14 = r20
            r11 = r21
            r7 = r22
            r15 = 4
            goto L16d
        L414:
            if (r18 != 0) goto L421
            android.content.res.ColorStateList r0 = r6.c
            android.graphics.PorterDuff$Mode r2 = r6.d
            android.graphics.PorterDuffColorFilter r0 = r1.a(r0, r2)
            r1.c = r0
            return
        L421:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r0.<init>(r2)
            throw r0
        L429:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L444:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L45f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L47a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.invalidateSelf()
            return
        L8:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r0 = r0.isAutoMirrored()
            return r0
        L9:
            a.dg$g r0 = r1.b
            boolean r0 = r0.e
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L3c
            a.dg$g r0 = r2.b
            if (r0 == 0) goto L3a
            a.dg$f r0 = r0.b
            java.lang.Boolean r1 = r0.n
            if (r1 != 0) goto L25
            a.dg$c r1 = r0.g
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.n = r1
        L25:
            java.lang.Boolean r0 = r0.n
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
            a.dg$g r0 = r2.b
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L3a
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3a
            goto L3c
        L3a:
            r0 = 0
            return r0
        L3c:
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f428a
            if (r0 == 0) goto L8
            r0.mutate()
            return r5
        L8:
            boolean r0 = r5.e
            if (r0 != 0) goto L64
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r5) goto L64
            a.dg$g r0 = new a.dg$g
            a.dg$g r1 = r5.b
            r0.<init>()
            r2 = 0
            r0.c = r2
            android.graphics.PorterDuff$Mode r2 = a.C0110dg.j
            r0.d = r2
            if (r1 == 0) goto L5f
            int r2 = r1.f444a
            r0.f444a = r2
            a.dg$f r2 = new a.dg$f
            a.dg$f r3 = r1.b
            r2.<init>(r3)
            r0.b = r2
            a.dg$f r3 = r1.b
            android.graphics.Paint r3 = r3.e
            if (r3 == 0) goto L40
            android.graphics.Paint r3 = new android.graphics.Paint
            a.dg$f r4 = r1.b
            android.graphics.Paint r4 = r4.e
            r3.<init>(r4)
            r2.e = r3
        L40:
            a.dg$f r2 = r1.b
            android.graphics.Paint r2 = r2.d
            if (r2 == 0) goto L53
            a.dg$f r2 = r0.b
            android.graphics.Paint r3 = new android.graphics.Paint
            a.dg$f r4 = r1.b
            android.graphics.Paint r4 = r4.d
            r3.<init>(r4)
            r2.d = r3
        L53:
            android.content.res.ColorStateList r2 = r1.c
            r0.c = r2
            android.graphics.PorterDuff$Mode r2 = r1.d
            r0.d = r2
            boolean r1 = r1.e
            r0.e = r1
        L5f:
            r5.b = r0
            r0 = 1
            r5.e = r0
        L64:
            return r5
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f428a
            if (r0 == 0) goto L9
            boolean r6 = r0.setState(r6)
            return r6
        L9:
            a.dg$g r0 = r5.b
            android.content.res.ColorStateList r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L1f
            android.graphics.PorterDuff$Mode r3 = r0.d
            if (r3 == 0) goto L1f
            android.graphics.PorterDuffColorFilter r1 = r5.a(r1, r3)
            r5.c = r1
            r5.invalidateSelf()
            r1 = r2
            goto L20
        L1f:
            r1 = 0
        L20:
            a.dg$f r3 = r0.b
            java.lang.Boolean r4 = r3.n
            if (r4 != 0) goto L32
            a.dg$c r4 = r3.g
            boolean r4 = r4.a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.n = r4
        L32:
            java.lang.Boolean r3 = r3.n
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4d
            a.dg$f r3 = r0.b
            a.dg$c r3 = r3.g
            boolean r6 = r3.b(r6)
            boolean r3 = r0.k
            r3 = r3 | r6
            r0.k = r3
            if (r6 == 0) goto L4d
            r5.invalidateSelf()
            return r2
        L4d:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.scheduleSelf(r2, r3)
            return
        L8:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            a.dg$g r0 = r1.b
            a.dg$f r0 = r0.b
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1c
            a.dg$g r0 = r1.b
            a.dg$f r0 = r0.b
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setAutoMirrored(r2)
            return
        L8:
            a.dg$g r0 = r1.b
            r0.e = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            r1.d = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a(r0, r2)
            return
        L8:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a.h(r0, r3)
            return
        L8:
            a.dg$g r0 = r2.b
            android.content.res.ColorStateList r1 = r0.c
            if (r1 == r3) goto L1b
            r0.c = r3
            android.graphics.PorterDuff$Mode r0 = r0.d
            android.graphics.PorterDuffColorFilter r3 = r2.a(r3, r0)
            r2.c = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f428a
            if (r0 == 0) goto L8
            a.C0439w5.a.i(r0, r3)
            return
        L8:
            a.dg$g r0 = r2.b
            android.graphics.PorterDuff$Mode r1 = r0.d
            if (r1 == r3) goto L1b
            r0.d = r3
            android.content.res.ColorStateList r0 = r0.c
            android.graphics.PorterDuffColorFilter r3 = r2.a(r0, r3)
            r2.c = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f428a
            if (r0 == 0) goto L8
            r0.unscheduleSelf(r2)
            return
        L8:
            super.unscheduleSelf(r2)
            return
    }
}
