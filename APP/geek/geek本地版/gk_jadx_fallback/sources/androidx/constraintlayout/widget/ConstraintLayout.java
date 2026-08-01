package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    public final android.util.SparseArray a;
    public final java.util.ArrayList b;
    public final defpackage.qc c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public defpackage.oc j;
    public defpackage.d4 k;
    public int l;
    public java.util.HashMap m;
    public final android.util.SparseArray n;
    public final defpackage.hc o;

    public ConstraintLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 4
            r2.<init>(r0)
            r1.b = r2
            qc r2 = new qc
            r2.<init>()
            r1.c = r2
            r2 = 0
            r1.d = r2
            r1.e = r2
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f = r0
            r1.g = r0
            r0 = 1
            r1.h = r0
            r0 = 263(0x107, float:3.69E-43)
            r1.i = r0
            r0 = 0
            r1.j = r0
            r1.k = r0
            r0 = -1
            r1.l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.m = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.n = r0
            hc r0 = new hc
            r0.<init>(r1)
            r1.o = r0
            r1.c(r3, r2)
            return
    }

    public ConstraintLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 4
            r2.<init>(r0)
            r1.b = r2
            qc r2 = new qc
            r2.<init>()
            r1.c = r2
            r2 = 0
            r1.d = r2
            r1.e = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f = r2
            r1.g = r2
            r2 = 1
            r1.h = r2
            r2 = 263(0x107, float:3.69E-43)
            r1.i = r2
            r2 = 0
            r1.j = r2
            r1.k = r2
            r2 = -1
            r1.l = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.m = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.n = r2
            hc r2 = new hc
            r2.<init>(r1)
            r1.o = r2
            r1.c(r3, r4)
            return
    }

    public static defpackage.gc a() {
            gc r0 = new gc
            r1 = -2
            r0.<init>(r1, r1)
            r1 = -1
            r0.a = r1
            r0.b = r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.c = r2
            r0.d = r1
            r0.e = r1
            r0.f = r1
            r0.g = r1
            r0.h = r1
            r0.i = r1
            r0.j = r1
            r0.k = r1
            r0.l = r1
            r0.m = r1
            r3 = 0
            r0.n = r3
            r4 = 0
            r0.o = r4
            r0.p = r1
            r0.q = r1
            r0.r = r1
            r0.s = r1
            r0.t = r1
            r0.u = r1
            r0.v = r1
            r0.w = r1
            r0.x = r1
            r0.y = r1
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.z = r4
            r0.A = r4
            r5 = 0
            r0.B = r5
            r6 = 1
            r0.C = r6
            r0.D = r2
            r0.E = r2
            r0.F = r3
            r0.G = r3
            r0.H = r3
            r0.I = r3
            r0.J = r3
            r0.K = r3
            r0.L = r3
            r0.M = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.N = r2
            r0.O = r2
            r0.P = r1
            r0.Q = r1
            r0.R = r1
            r0.S = r3
            r0.T = r3
            r0.U = r5
            r0.V = r6
            r0.W = r6
            r0.X = r3
            r0.Y = r3
            r0.Z = r3
            r0.a0 = r1
            r0.b0 = r1
            r0.c0 = r1
            r0.d0 = r1
            r0.e0 = r1
            r0.f0 = r1
            r0.g0 = r4
            pc r1 = new pc
            r1.<init>()
            r0.k0 = r1
            return r0
    }

    private int getPaddingWidth() {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r4.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r2 = r2 + r0
            int r0 = r4.getPaddingStart()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r4.getPaddingEnd()
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + r0
            if (r1 <= 0) goto L26
            return r1
        L26:
            return r2
    }

    public final defpackage.pc b(android.view.View r1) {
            r0 = this;
            if (r1 != r0) goto L5
            qc r1 = r0.c
            return r1
        L5:
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gc r1 = (defpackage.gc) r1
            pc r1 = r1.k0
            return r1
    }

    public final void c(android.util.AttributeSet r8, int r9) {
            r7 = this;
            qc r0 = r7.c
            r0.U = r7
            hc r1 = r7.o
            r0.g0 = r1
            ig r2 = r0.f0
            r2.f = r1
            android.util.SparseArray r1 = r7.a
            int r2 = r7.getId()
            r1.put(r2, r7)
            r1 = 0
            r7.j = r1
            r2 = 0
            if (r8 == 0) goto La2
            android.content.Context r3 = r7.getContext()
            int[] r4 = defpackage.ry.b
            android.content.res.TypedArray r8 = r3.obtainStyledAttributes(r8, r4, r9, r2)
            int r9 = r8.getIndexCount()
            r3 = r2
        L2a:
            if (r3 >= r9) goto L9f
            int r4 = r8.getIndex(r3)
            r5 = 9
            if (r4 != r5) goto L3d
            int r5 = r7.d
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.d = r4
            goto L9c
        L3d:
            r5 = 10
            if (r4 != r5) goto L4a
            int r5 = r7.e
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.e = r4
            goto L9c
        L4a:
            r5 = 7
            if (r4 != r5) goto L56
            int r5 = r7.f
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.f = r4
            goto L9c
        L56:
            r5 = 8
            if (r4 != r5) goto L63
            int r5 = r7.g
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.g = r4
            goto L9c
        L63:
            r5 = 89
            if (r4 != r5) goto L70
            int r5 = r7.i
            int r4 = r8.getInt(r4, r5)
            r7.i = r4
            goto L9c
        L70:
            r5 = 38
            if (r4 != r5) goto L81
            int r4 = r8.getResourceId(r4, r2)
            if (r4 == 0) goto L9c
            r7.d(r4)     // Catch: android.content.res.Resources.NotFoundException -> L7e
            goto L9c
        L7e:
            r7.k = r1
            goto L9c
        L81:
            r5 = 18
            if (r4 != r5) goto L9c
            int r4 = r8.getResourceId(r4, r2)
            oc r5 = new oc     // Catch: android.content.res.Resources.NotFoundException -> L98
            r5.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L98
            r7.j = r5     // Catch: android.content.res.Resources.NotFoundException -> L98
            android.content.Context r6 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L98
            r5.e(r6, r4)     // Catch: android.content.res.Resources.NotFoundException -> L98
            goto L9a
        L98:
            r7.j = r1
        L9a:
            r7.l = r4
        L9c:
            int r3 = r3 + 1
            goto L2a
        L9f:
            r8.recycle()
        La2:
            int r8 = r7.i
            r0.p0 = r8
            r9 = 256(0x100, float:3.59E-43)
            r8 = r8 & r9
            if (r8 != r9) goto Lac
            r2 = 1
        Lac:
            defpackage.ar.p = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof defpackage.gc
            return r1
    }

    public final void d(int r8) {
            r7 = this;
            d4 r0 = new d4
            android.content.Context r1 = r7.getContext()
            r2 = 7
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r8 = r2.getXml(r8)
            int r2 = r8.getEventType()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r3 = 0
        L26:
            r4 = 1
            if (r2 == r4) goto Lb3
            if (r2 == 0) goto La3
            r4 = 2
            if (r2 == r4) goto L30
            goto La6
        L30:
            java.lang.String r2 = r8.getName()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            switch(r4) {
                case -1349929691: goto L80;
                case 80204913: goto L69;
                case 1382829617: goto L60;
                case 1657696882: goto L57;
                case 1901439077: goto L3c;
                default: goto L3b;
            }     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
        L3b:
            goto L8c
        L3c:
            java.lang.String r4 = "Variant"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            if (r4 == 0) goto L8c
            ic r2 = new ic     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r2.<init>(r1, r8)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            if (r3 == 0) goto La6
            java.lang.Object r4 = r3.a     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r4.add(r2)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            goto La6
        L53:
            r8 = move-exception
            goto Lac
        L55:
            r8 = move-exception
            goto Lb0
        L57:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            if (r4 == 0) goto L8c
            goto La6
        L60:
            java.lang.String r4 = "StateSet"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            if (r4 == 0) goto L8c
            goto La6
        L69:
            java.lang.String r4 = "State"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            if (r4 == 0) goto L8c
            au r3 = new au     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r3.<init>(r1, r8)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            java.lang.Object r2 = r0.b     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            int r4 = r3.b     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r2.put(r4, r3)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            goto La6
        L80:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            if (r4 == 0) goto L8c
            r0.G(r1, r8)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            goto La6
        L8c:
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r5.<init>()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            r5.append(r2)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            java.lang.String r2 = r5.toString()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            android.util.Log.v(r4, r2)     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            goto La6
        La3:
            r8.getName()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
        La6:
            int r2 = r8.next()     // Catch: java.io.IOException -> L53 org.xmlpull.v1.XmlPullParserException -> L55
            goto L26
        Lac:
            r8.printStackTrace()
            goto Lb3
        Lb0:
            r8.printStackTrace()
        Lb3:
            r7.k = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = 0
            java.util.ArrayList r2 = r0.b
            if (r2 == 0) goto L1c
            int r3 = r2.size()
            if (r3 <= 0) goto L1c
            r4 = r1
        Le:
            if (r4 >= r3) goto L1c
            java.lang.Object r5 = r2.get(r4)
            ec r5 = (defpackage.ec) r5
            r5.getClass()
            int r4 = r4 + 1
            goto Le
        L1c:
            super.dispatchDraw(r18)
            boolean r2 = r0.isInEditMode()
            if (r2 == 0) goto Lcb
            int r2 = r0.getChildCount()
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r5 = r1
        L34:
            if (r5 >= r2) goto Lcb
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L44
            goto Lc7
        L44:
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto Lc7
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lc7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 4
            if (r7 != r8) goto Lc7
            r7 = r6[r1]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 1
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r9 = 2
            r9 = r6[r9]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 3
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            float r7 = (float) r7
            r10 = 1149698048(0x44870000, float:1080.0)
            float r7 = r7 / r10
            float r7 = r7 * r3
            int r7 = (int) r7
            float r8 = (float) r8
            r11 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 / r11
            float r8 = r8 * r4
            int r8 = (int) r8
            float r9 = (float) r9
            float r9 = r9 / r10
            float r9 = r9 * r3
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r6 * r4
            int r6 = (int) r6
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r10)
            float r11 = (float) r7
            float r12 = (float) r8
            int r7 = r7 + r9
            float r13 = (float) r7
            r14 = r12
            r10 = r18
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            int r8 = r8 + r6
            float r14 = (float) r8
            r11 = r13
            r10.drawLine(r11, r12, r13, r14, r15)
            r6 = r12
            r12 = r14
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            r11 = r13
            r14 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r6 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.setColor(r6)
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
        Lc7:
            int r5 = r5 + 1
            goto L34
        Lcb:
            return
    }

    @Override // android.view.View
    public final void forceLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.forceLayout()
            return
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            gc r0 = a()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r13) {
            r12 = this;
            gc r0 = new gc
            android.content.Context r1 = r12.getContext()
            r0.<init>(r1, r13)
            r2 = -1
            r0.a = r2
            r0.b = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.c = r3
            r0.d = r2
            r0.e = r2
            r0.f = r2
            r0.g = r2
            r0.h = r2
            r0.i = r2
            r0.j = r2
            r0.k = r2
            r0.l = r2
            r0.m = r2
            r4 = 0
            r0.n = r4
            r5 = 0
            r0.o = r5
            r0.p = r2
            r0.q = r2
            r0.r = r2
            r0.s = r2
            r0.t = r2
            r0.u = r2
            r0.v = r2
            r0.w = r2
            r0.x = r2
            r0.y = r2
            r6 = 1056964608(0x3f000000, float:0.5)
            r0.z = r6
            r0.A = r6
            r7 = 0
            r0.B = r7
            r8 = 1
            r0.C = r8
            r0.D = r3
            r0.E = r3
            r0.F = r4
            r0.G = r4
            r0.H = r4
            r0.I = r4
            r0.J = r4
            r0.K = r4
            r0.L = r4
            r0.M = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.N = r3
            r0.O = r3
            r0.P = r2
            r0.Q = r2
            r0.R = r2
            r0.S = r4
            r0.T = r4
            r0.U = r7
            r0.V = r8
            r0.W = r8
            r0.X = r4
            r0.Y = r4
            r0.Z = r4
            r0.a0 = r2
            r0.b0 = r2
            r0.c0 = r2
            r0.d0 = r2
            r0.e0 = r2
            r0.f0 = r2
            r0.g0 = r6
            pc r3 = new pc
            r3.<init>()
            r0.k0 = r3
            int[] r3 = defpackage.ry.b
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r13, r3)
            int r1 = r13.getIndexCount()
            r3 = r4
        L9c:
            if (r3 >= r1) goto L3c0
            int r6 = r13.getIndex(r3)
            android.util.SparseIntArray r7 = defpackage.fc.a
            int r7 = r7.get(r6)
            java.lang.String r9 = "ConstraintLayout"
            r10 = 2
            r11 = -2
            switch(r7) {
                case 1: goto L3b4;
                case 2: goto L3a3;
                case 3: goto L39a;
                case 4: goto L385;
                case 5: goto L37c;
                case 6: goto L373;
                case 7: goto L36a;
                case 8: goto L359;
                case 9: goto L348;
                case 10: goto L336;
                case 11: goto L324;
                case 12: goto L312;
                case 13: goto L300;
                case 14: goto L2ee;
                case 15: goto L2dc;
                case 16: goto L2ca;
                case 17: goto L2b8;
                case 18: goto L2a6;
                case 19: goto L294;
                case 20: goto L282;
                case 21: goto L278;
                case 22: goto L26e;
                case 23: goto L264;
                case 24: goto L25a;
                case 25: goto L250;
                case 26: goto L246;
                case 27: goto L23c;
                case 28: goto L232;
                case 29: goto L228;
                case 30: goto L21e;
                case 31: goto L20f;
                case 32: goto L200;
                case 33: goto L1ea;
                case 34: goto L1d4;
                case 35: goto L1c4;
                case 36: goto L1ae;
                case 37: goto L198;
                case 38: goto L188;
                default: goto Laf;
            }
        Laf:
            switch(r7) {
                case 44: goto Lf4;
                case 45: goto Lea;
                case 46: goto Le0;
                case 47: goto Ld8;
                case 48: goto Ld0;
                case 49: goto Lc6;
                case 50: goto Lbc;
                case 51: goto Lb4;
                default: goto Lb2;
            }
        Lb2:
            goto L3bc
        Lb4:
            java.lang.String r6 = r13.getString(r6)
            r0.U = r6
            goto L3bc
        Lbc:
            int r7 = r0.Q
            int r6 = r13.getDimensionPixelOffset(r6, r7)
            r0.Q = r6
            goto L3bc
        Lc6:
            int r7 = r0.P
            int r6 = r13.getDimensionPixelOffset(r6, r7)
            r0.P = r6
            goto L3bc
        Ld0:
            int r6 = r13.getInt(r6, r4)
            r0.G = r6
            goto L3bc
        Ld8:
            int r6 = r13.getInt(r6, r4)
            r0.F = r6
            goto L3bc
        Le0:
            float r7 = r0.E
            float r6 = r13.getFloat(r6, r7)
            r0.E = r6
            goto L3bc
        Lea:
            float r7 = r0.D
            float r6 = r13.getFloat(r6, r7)
            r0.D = r6
            goto L3bc
        Lf4:
            java.lang.String r6 = r13.getString(r6)
            r0.B = r6
            r0.C = r2
            if (r6 == 0) goto L3bc
            int r6 = r6.length()
            java.lang.String r7 = r0.B
            r9 = 44
            int r7 = r7.indexOf(r9)
            if (r7 <= 0) goto L12e
            int r9 = r6 + (-1)
            if (r7 >= r9) goto L12e
            java.lang.String r9 = r0.B
            java.lang.String r9 = r9.substring(r4, r7)
            java.lang.String r10 = "W"
            boolean r10 = r9.equalsIgnoreCase(r10)
            if (r10 == 0) goto L121
            r0.C = r4
            goto L12b
        L121:
            java.lang.String r10 = "H"
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L12b
            r0.C = r8
        L12b:
            int r7 = r7 + 1
            goto L12f
        L12e:
            r7 = r4
        L12f:
            java.lang.String r9 = r0.B
            r10 = 58
            int r9 = r9.indexOf(r10)
            if (r9 < 0) goto L177
            int r6 = r6 + (-1)
            if (r9 >= r6) goto L177
            java.lang.String r6 = r0.B
            java.lang.String r6 = r6.substring(r7, r9)
            java.lang.String r7 = r0.B
            int r9 = r9 + 1
            java.lang.String r7 = r7.substring(r9)
            int r9 = r6.length()
            if (r9 <= 0) goto L3bc
            int r9 = r7.length()
            if (r9 <= 0) goto L3bc
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L3bc
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.NumberFormatException -> L3bc
            int r9 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r9 <= 0) goto L3bc
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L3bc
            int r9 = r0.C     // Catch: java.lang.NumberFormatException -> L3bc
            if (r9 != r8) goto L171
            float r7 = r7 / r6
            java.lang.Math.abs(r7)     // Catch: java.lang.NumberFormatException -> L3bc
            goto L3bc
        L171:
            float r6 = r6 / r7
            java.lang.Math.abs(r6)     // Catch: java.lang.NumberFormatException -> L3bc
            goto L3bc
        L177:
            java.lang.String r6 = r0.B
            java.lang.String r6 = r6.substring(r7)
            int r7 = r6.length()
            if (r7 <= 0) goto L3bc
            java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L3bc
            goto L3bc
        L188:
            float r7 = r0.O
            float r6 = r13.getFloat(r6, r7)
            float r6 = java.lang.Math.max(r5, r6)
            r0.O = r6
            r0.I = r10
            goto L3bc
        L198:
            int r7 = r0.M     // Catch: java.lang.Exception -> L1a2
            int r7 = r13.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L1a2
            r0.M = r7     // Catch: java.lang.Exception -> L1a2
            goto L3bc
        L1a2:
            int r7 = r0.M
            int r6 = r13.getInt(r6, r7)
            if (r6 != r11) goto L3bc
            r0.M = r11
            goto L3bc
        L1ae:
            int r7 = r0.K     // Catch: java.lang.Exception -> L1b8
            int r7 = r13.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L1b8
            r0.K = r7     // Catch: java.lang.Exception -> L1b8
            goto L3bc
        L1b8:
            int r7 = r0.K
            int r6 = r13.getInt(r6, r7)
            if (r6 != r11) goto L3bc
            r0.K = r11
            goto L3bc
        L1c4:
            float r7 = r0.N
            float r6 = r13.getFloat(r6, r7)
            float r6 = java.lang.Math.max(r5, r6)
            r0.N = r6
            r0.H = r10
            goto L3bc
        L1d4:
            int r7 = r0.L     // Catch: java.lang.Exception -> L1de
            int r7 = r13.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L1de
            r0.L = r7     // Catch: java.lang.Exception -> L1de
            goto L3bc
        L1de:
            int r7 = r0.L
            int r6 = r13.getInt(r6, r7)
            if (r6 != r11) goto L3bc
            r0.L = r11
            goto L3bc
        L1ea:
            int r7 = r0.J     // Catch: java.lang.Exception -> L1f4
            int r7 = r13.getDimensionPixelSize(r6, r7)     // Catch: java.lang.Exception -> L1f4
            r0.J = r7     // Catch: java.lang.Exception -> L1f4
            goto L3bc
        L1f4:
            int r7 = r0.J
            int r6 = r13.getInt(r6, r7)
            if (r6 != r11) goto L3bc
            r0.J = r11
            goto L3bc
        L200:
            int r6 = r13.getInt(r6, r4)
            r0.I = r6
            if (r6 != r8) goto L3bc
            java.lang.String r6 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            android.util.Log.e(r9, r6)
            goto L3bc
        L20f:
            int r6 = r13.getInt(r6, r4)
            r0.H = r6
            if (r6 != r8) goto L3bc
            java.lang.String r6 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            android.util.Log.e(r9, r6)
            goto L3bc
        L21e:
            float r7 = r0.A
            float r6 = r13.getFloat(r6, r7)
            r0.A = r6
            goto L3bc
        L228:
            float r7 = r0.z
            float r6 = r13.getFloat(r6, r7)
            r0.z = r6
            goto L3bc
        L232:
            boolean r7 = r0.T
            boolean r6 = r13.getBoolean(r6, r7)
            r0.T = r6
            goto L3bc
        L23c:
            boolean r7 = r0.S
            boolean r6 = r13.getBoolean(r6, r7)
            r0.S = r6
            goto L3bc
        L246:
            int r7 = r0.y
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.y = r6
            goto L3bc
        L250:
            int r7 = r0.x
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.x = r6
            goto L3bc
        L25a:
            int r7 = r0.w
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.w = r6
            goto L3bc
        L264:
            int r7 = r0.v
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.v = r6
            goto L3bc
        L26e:
            int r7 = r0.u
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.u = r6
            goto L3bc
        L278:
            int r7 = r0.t
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.t = r6
            goto L3bc
        L282:
            int r7 = r0.s
            int r7 = r13.getResourceId(r6, r7)
            r0.s = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.s = r6
            goto L3bc
        L294:
            int r7 = r0.r
            int r7 = r13.getResourceId(r6, r7)
            r0.r = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.r = r6
            goto L3bc
        L2a6:
            int r7 = r0.q
            int r7 = r13.getResourceId(r6, r7)
            r0.q = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.q = r6
            goto L3bc
        L2b8:
            int r7 = r0.p
            int r7 = r13.getResourceId(r6, r7)
            r0.p = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.p = r6
            goto L3bc
        L2ca:
            int r7 = r0.l
            int r7 = r13.getResourceId(r6, r7)
            r0.l = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.l = r6
            goto L3bc
        L2dc:
            int r7 = r0.k
            int r7 = r13.getResourceId(r6, r7)
            r0.k = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.k = r6
            goto L3bc
        L2ee:
            int r7 = r0.j
            int r7 = r13.getResourceId(r6, r7)
            r0.j = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.j = r6
            goto L3bc
        L300:
            int r7 = r0.i
            int r7 = r13.getResourceId(r6, r7)
            r0.i = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.i = r6
            goto L3bc
        L312:
            int r7 = r0.h
            int r7 = r13.getResourceId(r6, r7)
            r0.h = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.h = r6
            goto L3bc
        L324:
            int r7 = r0.g
            int r7 = r13.getResourceId(r6, r7)
            r0.g = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.g = r6
            goto L3bc
        L336:
            int r7 = r0.f
            int r7 = r13.getResourceId(r6, r7)
            r0.f = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.f = r6
            goto L3bc
        L348:
            int r7 = r0.e
            int r7 = r13.getResourceId(r6, r7)
            r0.e = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.e = r6
            goto L3bc
        L359:
            int r7 = r0.d
            int r7 = r13.getResourceId(r6, r7)
            r0.d = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.d = r6
            goto L3bc
        L36a:
            float r7 = r0.c
            float r6 = r13.getFloat(r6, r7)
            r0.c = r6
            goto L3bc
        L373:
            int r7 = r0.b
            int r6 = r13.getDimensionPixelOffset(r6, r7)
            r0.b = r6
            goto L3bc
        L37c:
            int r7 = r0.a
            int r6 = r13.getDimensionPixelOffset(r6, r7)
            r0.a = r6
            goto L3bc
        L385:
            float r7 = r0.o
            float r6 = r13.getFloat(r6, r7)
            r7 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 % r7
            r0.o = r6
            int r9 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r9 >= 0) goto L3bc
            float r6 = r7 - r6
            float r6 = r6 % r7
            r0.o = r6
            goto L3bc
        L39a:
            int r7 = r0.n
            int r6 = r13.getDimensionPixelSize(r6, r7)
            r0.n = r6
            goto L3bc
        L3a3:
            int r7 = r0.m
            int r7 = r13.getResourceId(r6, r7)
            r0.m = r7
            if (r7 != r2) goto L3bc
            int r6 = r13.getInt(r6, r2)
            r0.m = r6
            goto L3bc
        L3b4:
            int r7 = r0.R
            int r6 = r13.getInt(r6, r7)
            r0.R = r6
        L3bc:
            int r3 = r3 + 1
            goto L9c
        L3c0:
            r13.recycle()
            r0.a()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r7) {
            r6 = this;
            gc r0 = new gc
            r0.<init>(r7)
            r7 = -1
            r0.a = r7
            r0.b = r7
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.c = r1
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            r0.i = r7
            r0.j = r7
            r0.k = r7
            r0.l = r7
            r0.m = r7
            r2 = 0
            r0.n = r2
            r3 = 0
            r0.o = r3
            r0.p = r7
            r0.q = r7
            r0.r = r7
            r0.s = r7
            r0.t = r7
            r0.u = r7
            r0.v = r7
            r0.w = r7
            r0.x = r7
            r0.y = r7
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.z = r3
            r0.A = r3
            r4 = 0
            r0.B = r4
            r5 = 1
            r0.C = r5
            r0.D = r1
            r0.E = r1
            r0.F = r2
            r0.G = r2
            r0.H = r2
            r0.I = r2
            r0.J = r2
            r0.K = r2
            r0.L = r2
            r0.M = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.N = r1
            r0.O = r1
            r0.P = r7
            r0.Q = r7
            r0.R = r7
            r0.S = r2
            r0.T = r2
            r0.U = r4
            r0.V = r5
            r0.W = r5
            r0.X = r2
            r0.Y = r2
            r0.Z = r2
            r0.a0 = r7
            r0.b0 = r7
            r0.c0 = r7
            r0.d0 = r7
            r0.e0 = r7
            r0.f0 = r7
            r0.g0 = r3
            pc r7 = new pc
            r7.<init>()
            r0.k0 = r7
            return r0
    }

    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int getOptimizationLevel() {
            r1 = this;
            qc r0 = r1.c
            int r0 = r0.p0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L43
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            gc r0 = (defpackage.gc) r0
            pc r1 = r0.k0
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2b
            boolean r2 = r0.Y
            if (r2 != 0) goto L2b
            boolean r0 = r0.Z
            if (r0 != 0) goto L2b
            if (r6 != 0) goto L2b
            goto L40
        L2b:
            int r0 = r1.m()
            int r2 = r1.n()
            int r3 = r1.l()
            int r3 = r3 + r0
            int r1 = r1.i()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
        L40:
            int r8 = r8 + 1
            goto La
        L43:
            java.util.ArrayList r5 = r4.b
            int r6 = r5.size()
            if (r6 <= 0) goto L59
        L4b:
            if (r7 >= r6) goto L59
            java.lang.Object r8 = r5.get(r7)
            ec r8 = (defpackage.ec) r8
            r8.getClass()
            int r7 = r7 + 1
            goto L4b
        L59:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r42, int r43) {
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r43
            android.content.Context r3 = r0.getContext()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.flags
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L1f
            int r3 = r0.getLayoutDirection()
            if (r5 != r3) goto L1f
            r3 = r5
            goto L20
        L1f:
            r3 = r6
        L20:
            qc r7 = r0.c
            r7.h0 = r3
            r5 r3 = r7.e0
            ig r8 = r7.f0
            boolean r9 = r0.h
            if (r9 == 0) goto L61b
            r0.h = r6
            int r9 = r0.getChildCount()
            r18 = r4
            r4 = r6
        L35:
            if (r4 >= r9) goto L46
            android.view.View r16 = r0.getChildAt(r4)
            boolean r16 = r16.isLayoutRequested()
            if (r16 == 0) goto L43
            r4 = r5
            goto L47
        L43:
            int r4 = r4 + 1
            goto L35
        L46:
            r4 = r6
        L47:
            if (r4 == 0) goto L5e2
            boolean r9 = r0.isInEditMode()
            r19 = r5
            int r5 = r0.getChildCount()
            r10 = r6
        L54:
            if (r10 >= r5) goto L67
            android.view.View r11 = r0.getChildAt(r10)
            pc r11 = r0.b(r11)
            if (r11 != 0) goto L61
            goto L64
        L61:
            r11.s()
        L64:
            int r10 = r10 + 1
            goto L54
        L67:
            android.util.SparseArray r11 = r0.a
            r13 = -1
            if (r9 == 0) goto Lef
            r12 = r6
            r17 = 2
        L6f:
            if (r12 >= r5) goto Lf1
            android.view.View r21 = r0.getChildAt(r12)
            android.content.res.Resources r14 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            int r15 = r21.getId()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            java.lang.String r14 = r14.getResourceName(r15)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            int r15 = r21.getId()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r14 == 0) goto Lab
            java.util.HashMap r10 = r0.m     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r10 != 0) goto L96
            java.util.HashMap r10 = new java.util.HashMap     // Catch: android.content.res.Resources.NotFoundException -> Leb
            r10.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            r0.m = r10     // Catch: android.content.res.Resources.NotFoundException -> Leb
        L96:
            java.lang.String r10 = "/"
            int r10 = r14.indexOf(r10)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r10 == r13) goto La5
            int r10 = r10 + 1
            java.lang.String r10 = r14.substring(r10)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            goto La6
        La5:
            r10 = r14
        La6:
            java.util.HashMap r6 = r0.m     // Catch: android.content.res.Resources.NotFoundException -> Leb
            r6.put(r10, r15)     // Catch: android.content.res.Resources.NotFoundException -> Leb
        Lab:
            r6 = 47
            int r6 = r14.indexOf(r6)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r6 == r13) goto Lb9
            int r6 = r6 + 1
            java.lang.String r14 = r14.substring(r6)     // Catch: android.content.res.Resources.NotFoundException -> Leb
        Lb9:
            int r6 = r21.getId()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r6 != 0) goto Lc1
        Lbf:
            r6 = r7
            goto Le9
        Lc1:
            java.lang.Object r10 = r11.get(r6)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            android.view.View r10 = (android.view.View) r10     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r10 != 0) goto Lda
            android.view.View r10 = r0.findViewById(r6)     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r10 == 0) goto Lda
            if (r10 == r0) goto Lda
            android.view.ViewParent r6 = r10.getParent()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            if (r6 != r0) goto Lda
            r0.onViewAdded(r10)     // Catch: android.content.res.Resources.NotFoundException -> Leb
        Lda:
            if (r10 != r0) goto Ldd
            goto Lbf
        Ldd:
            if (r10 != 0) goto Le1
            r6 = 0
            goto Le9
        Le1:
            android.view.ViewGroup$LayoutParams r6 = r10.getLayoutParams()     // Catch: android.content.res.Resources.NotFoundException -> Leb
            gc r6 = (defpackage.gc) r6     // Catch: android.content.res.Resources.NotFoundException -> Leb
            pc r6 = r6.k0     // Catch: android.content.res.Resources.NotFoundException -> Leb
        Le9:
            r6.W = r14     // Catch: android.content.res.Resources.NotFoundException -> Leb
        Leb:
            int r12 = r12 + 1
            r6 = 0
            goto L6f
        Lef:
            r17 = 2
        Lf1:
            int r6 = r0.l
            if (r6 == r13) goto L102
            r6 = 0
        Lf6:
            if (r6 >= r5) goto L102
            android.view.View r10 = r0.getChildAt(r6)
            r10.getId()
            int r6 = r6 + 1
            goto Lf6
        L102:
            oc r6 = r0.j
            if (r6 == 0) goto L109
            r6.a(r0)
        L109:
            java.util.ArrayList r6 = r7.d0
            r6.clear()
            java.util.ArrayList r6 = r0.b
            int r10 = r6.size()
            if (r10 <= 0) goto L1d3
            r12 = 0
        L117:
            if (r12 >= r10) goto L1d3
            java.lang.Object r14 = r6.get(r12)
            ec r14 = (defpackage.ec) r14
            java.util.HashMap r15 = r14.f
            boolean r21 = r14.isInEditMode()
            if (r21 == 0) goto L12c
            java.lang.String r13 = r14.e
            r14.setIds(r13)
        L12c:
            oo r13 = r14.d
            if (r13 != 0) goto L138
            r26 = r4
            r29 = r6
            r30 = r9
            goto L1c8
        L138:
            r26 = r4
            r4 = 0
            r13.e0 = r4
            pc[] r4 = r13.d0
            r13 = 0
            java.util.Arrays.fill(r4, r13)
            r4 = 0
        L144:
            int r13 = r14.b
            if (r4 >= r13) goto L1bf
            int[] r13 = r14.a
            r13 = r13[r4]
            java.lang.Object r27 = r11.get(r13)
            android.view.View r27 = (android.view.View) r27
            if (r27 != 0) goto L17e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r15.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            r28 = r4
            int r4 = r14.d(r0, r13)
            r29 = r6
            if (r4 == 0) goto L17b
            int[] r6 = r14.a
            r6[r28] = r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r15.put(r6, r13)
            java.lang.Object r4 = r11.get(r4)
            r27 = r4
            android.view.View r27 = (android.view.View) r27
        L17b:
            r4 = r27
            goto L183
        L17e:
            r28 = r4
            r29 = r6
            goto L17b
        L183:
            if (r4 == 0) goto L1b6
            oo r6 = r14.d
            pc r4 = r0.b(r4)
            r6.getClass()
            if (r4 == r6) goto L1b6
            if (r4 != 0) goto L193
            goto L1b6
        L193:
            int r13 = r6.e0
            int r13 = r13 + 1
            r27 = r4
            pc[] r4 = r6.d0
            r30 = r9
            int r9 = r4.length
            if (r13 <= r9) goto L1ab
            int r9 = r4.length
            int r9 = r9 * 2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
            pc[] r4 = (defpackage.pc[]) r4
            r6.d0 = r4
        L1ab:
            pc[] r4 = r6.d0
            int r9 = r6.e0
            r4[r9] = r27
            int r9 = r9 + 1
            r6.e0 = r9
            goto L1b8
        L1b6:
            r30 = r9
        L1b8:
            int r4 = r28 + 1
            r6 = r29
            r9 = r30
            goto L144
        L1bf:
            r29 = r6
            r30 = r9
            oo r4 = r14.d
            r4.B()
        L1c8:
            int r12 = r12 + 1
            r4 = r26
            r6 = r29
            r9 = r30
            r13 = -1
            goto L117
        L1d3:
            r26 = r4
            r30 = r9
            r4 = 0
        L1d8:
            if (r4 >= r5) goto L1e0
            r0.getChildAt(r4)
            int r4 = r4 + 1
            goto L1d8
        L1e0:
            android.util.SparseArray r4 = r0.n
            r4.clear()
            r6 = 0
            r4.put(r6, r7)
            int r6 = r0.getId()
            r4.put(r6, r7)
            r6 = 0
        L1f1:
            if (r6 >= r5) goto L205
            android.view.View r9 = r0.getChildAt(r6)
            pc r10 = r0.b(r9)
            int r9 = r9.getId()
            r4.put(r9, r10)
            int r6 = r6 + 1
            goto L1f1
        L205:
            r6 = 0
        L206:
            if (r6 >= r5) goto L5df
            android.view.View r9 = r0.getChildAt(r6)
            pc r10 = r0.b(r9)
            if (r10 != 0) goto L21f
            r16 = r4
            r27 = r5
            r39 = r6
            r13 = r11
            r4 = 3
            r12 = 4
            r24 = 0
            goto L5d2
        L21f:
            android.view.ViewGroup$LayoutParams r12 = r9.getLayoutParams()
            gc r12 = (defpackage.gc) r12
            java.util.ArrayList r13 = r7.d0
            r13.add(r10)
            pc r13 = r10.I
            if (r13 == 0) goto L239
            qc r13 = (defpackage.qc) r13
            java.util.ArrayList r13 = r13.d0
            r13.remove(r10)
            r13 = 0
            r10.I = r13
            goto L23a
        L239:
            r13 = 0
        L23a:
            r10.I = r7
            r12.a()
            int r14 = r9.getVisibility()
            r10.V = r14
            r10.U = r9
            boolean r14 = r9 instanceof defpackage.ec
            if (r14 == 0) goto L252
            ec r9 = (defpackage.ec) r9
            boolean r14 = r7.h0
            r9.f(r10, r14)
        L252:
            boolean r9 = r12.Y
            if (r9 == 0) goto L291
            go r10 = (defpackage.go) r10
            int r9 = r12.h0
            int r14 = r12.i0
            float r12 = r12.j0
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r24 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r24 == 0) goto L27a
            if (r24 <= 0) goto L26d
            r10.d0 = r12
            r12 = -1
            r10.e0 = r12
            r10.f0 = r12
        L26d:
            r16 = r4
            r27 = r5
            r39 = r6
            r24 = r13
            r4 = 3
            r12 = 4
            r13 = r11
            goto L5d2
        L27a:
            r12 = -1
            if (r9 == r12) goto L286
            if (r9 <= r12) goto L26d
            r10.d0 = r15
            r10.e0 = r9
            r10.f0 = r12
            goto L26d
        L286:
            if (r14 == r12) goto L26d
            if (r14 <= r12) goto L26d
            r10.d0 = r15
            r10.e0 = r12
            r10.f0 = r14
            goto L26d
        L291:
            int r9 = r12.a0
            int r14 = r12.b0
            int r15 = r12.c0
            int r13 = r12.d0
            r27 = r5
            int r5 = r12.e0
            r28 = r13
            int r13 = r12.f0
            r29 = r11
            float r11 = r12.g0
            r35 = r5
            int r5 = r12.m
            r37 = 2
            r38 = 3
            r39 = r6
            r6 = -1
            if (r5 == r6) goto L2dd
            java.lang.Object r5 = r4.get(r5)
            r36 = r5
            pc r36 = (defpackage.pc) r36
            if (r36 == 0) goto L2cf
            float r5 = r12.o
            int r6 = r12.n
            r32 = 7
            r35 = 0
            r33 = r32
            r34 = r6
            r31 = r10
            r31.o(r32, r33, r34, r35, r36)
            r10.v = r5
        L2cf:
            r16 = r4
            r9 = r12
            r13 = r29
            r11 = r38
            r6 = -1
            r20 = 0
            r24 = 0
            goto L442
        L2dd:
            if (r9 == r6) goto L305
            java.lang.Object r5 = r4.get(r9)
            r36 = r5
            pc r36 = (defpackage.pc) r36
            if (r36 == 0) goto L2f7
            int r5 = r12.leftMargin
            r33 = r37
            r34 = r5
            r31 = r10
            r32 = r37
            r31.o(r32, r33, r34, r35, r36)
            goto L2f9
        L2f7:
            r32 = r37
        L2f9:
            r31 = r10
            r9 = r12
            r22 = r13
            r10 = r15
            r5 = r28
            r13 = 4
            r24 = 0
            goto L32b
        L305:
            r32 = r37
            if (r14 == r6) goto L2f9
            java.lang.Object r5 = r4.get(r14)
            pc r5 = (defpackage.pc) r5
            if (r5 == 0) goto L2f9
            r9 = r15
            int r15 = r12.leftMargin
            r14 = r10
            r10 = r9
            r9 = r12
            r12 = r14
            r17 = r5
            r22 = r13
            r5 = r28
            r13 = r32
            r16 = r35
            r14 = 4
            r24 = 0
            r12.o(r13, r14, r15, r16, r17)
            r31 = r12
            r13 = r14
        L32b:
            if (r10 == r6) goto L349
            java.lang.Object r5 = r4.get(r10)
            r17 = r5
            pc r17 = (defpackage.pc) r17
            if (r17 == 0) goto L344
            int r15 = r9.rightMargin
            r16 = r22
            r12 = r31
            r14 = r32
            r12.o(r13, r14, r15, r16, r17)
            r10 = r12
            goto L346
        L344:
            r10 = r31
        L346:
            r5 = r32
            goto L362
        L349:
            r16 = r22
            r10 = r31
            if (r5 == r6) goto L346
            java.lang.Object r5 = r4.get(r5)
            r17 = r5
            pc r17 = (defpackage.pc) r17
            if (r17 == 0) goto L346
            int r15 = r9.rightMargin
            r14 = r13
            r12 = r10
            r5 = r32
            r12.o(r13, r14, r15, r16, r17)
        L362:
            int r12 = r9.h
            if (r12 == r6) goto L38b
            java.lang.Object r12 = r4.get(r12)
            r36 = r12
            pc r36 = (defpackage.pc) r36
            if (r36 == 0) goto L382
            int r12 = r9.topMargin
            int r14 = r9.u
            r33 = r38
            r31 = r10
            r34 = r12
            r35 = r14
            r32 = r38
            r31.o(r32, r33, r34, r35, r36)
            goto L384
        L382:
            r32 = r38
        L384:
            r5 = r11
            r40 = r29
            r11 = 5
            r20 = 0
            goto L3ad
        L38b:
            r32 = r38
            int r12 = r9.i
            if (r12 == r6) goto L384
            java.lang.Object r12 = r4.get(r12)
            r15 = r12
            pc r15 = (defpackage.pc) r15
            if (r15 == 0) goto L384
            r14 = r13
            int r13 = r9.topMargin
            r16 = r14
            int r14 = r9.u
            r5 = r11
            r40 = r29
            r11 = r32
            r12 = 5
            r20 = 0
            r10.o(r11, r12, r13, r14, r15)
            r11 = r12
        L3ad:
            int r12 = r9.j
            if (r12 == r6) goto L3c4
            java.lang.Object r12 = r4.get(r12)
            r15 = r12
            pc r15 = (defpackage.pc) r15
            if (r15 == 0) goto L3d9
            int r13 = r9.bottomMargin
            int r14 = r9.w
            r12 = r32
            r10.o(r11, r12, r13, r14, r15)
            goto L3d9
        L3c4:
            int r12 = r9.k
            if (r12 == r6) goto L3d9
            java.lang.Object r12 = r4.get(r12)
            r15 = r12
            pc r15 = (defpackage.pc) r15
            if (r15 == 0) goto L3d9
            int r13 = r9.bottomMargin
            int r14 = r9.w
            r12 = r11
            r10.o(r11, r12, r13, r14, r15)
        L3d9:
            int r12 = r9.l
            if (r12 == r6) goto L42f
            r13 = r40
            java.lang.Object r12 = r13.get(r12)
            android.view.View r12 = (android.view.View) r12
            int r14 = r9.l
            java.lang.Object r14 = r4.get(r14)
            pc r14 = (defpackage.pc) r14
            if (r14 == 0) goto L42b
            if (r12 == 0) goto L42b
            android.view.ViewGroup$LayoutParams r15 = r12.getLayoutParams()
            boolean r15 = r15 instanceof defpackage.gc
            if (r15 == 0) goto L42b
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            gc r12 = (defpackage.gc) r12
            r15 = r19
            r9.X = r15
            r12.X = r15
            r11 = 6
            r16 = r4
            cc r4 = r10.g(r11)
            cc r11 = r14.g(r11)
            r14 = 0
            r4.b(r11, r14, r6, r15)
            r10.w = r15
            pc r4 = r12.k0
            r4.w = r15
            r11 = 3
            cc r4 = r10.g(r11)
            r4.h()
            r12 = 5
            cc r4 = r10.g(r12)
            r4.h()
            goto L434
        L42b:
            r16 = r4
        L42d:
            r11 = 3
            goto L434
        L42f:
            r16 = r4
            r13 = r40
            goto L42d
        L434:
            int r4 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r4 < 0) goto L43a
            r10.S = r5
        L43a:
            float r4 = r9.A
            int r5 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r5 < 0) goto L442
            r10.T = r4
        L442:
            if (r30 == 0) goto L452
            int r4 = r9.P
            if (r4 != r6) goto L44c
            int r5 = r9.Q
            if (r5 == r6) goto L452
        L44c:
            int r5 = r9.Q
            r10.N = r4
            r10.O = r5
        L452:
            boolean r4 = r9.V
            r5 = -2
            if (r4 != 0) goto L488
            int r4 = r9.width
            if (r4 != r6) goto L47e
            boolean r4 = r9.S
            if (r4 == 0) goto L466
            r4 = 3
            r10.w(r4)
            r12 = 4
        L464:
            r14 = 2
            goto L46c
        L466:
            r4 = 3
            r12 = 4
            r10.w(r12)
            goto L464
        L46c:
            cc r14 = r10.g(r14)
            int r15 = r9.leftMargin
            r14.e = r15
            r14 = 4
            cc r15 = r10.g(r14)
            int r14 = r9.rightMargin
            r15.e = r14
            goto L49b
        L47e:
            r4 = 3
            r12 = 4
            r10.w(r4)
            r14 = 0
            r10.y(r14)
            goto L49b
        L488:
            r4 = 3
            r12 = 4
            r15 = 1
            r10.w(r15)
            int r14 = r9.width
            r10.y(r14)
            int r14 = r9.width
            if (r14 != r5) goto L49b
            r14 = 2
            r10.w(r14)
        L49b:
            boolean r14 = r9.W
            if (r14 != 0) goto L4c8
            int r5 = r9.height
            if (r5 != r6) goto L4c0
            boolean r5 = r9.T
            if (r5 == 0) goto L4ab
            r10.x(r4)
            goto L4ae
        L4ab:
            r10.x(r12)
        L4ae:
            cc r5 = r10.g(r11)
            int r11 = r9.topMargin
            r5.e = r11
            r11 = 5
            cc r5 = r10.g(r11)
            int r11 = r9.bottomMargin
            r5.e = r11
            goto L4d9
        L4c0:
            r10.x(r4)
            r14 = 0
            r10.v(r14)
            goto L4d9
        L4c8:
            r15 = 1
            r10.x(r15)
            int r11 = r9.height
            r10.v(r11)
            int r11 = r9.height
            if (r11 != r5) goto L4d9
            r14 = 2
            r10.x(r14)
        L4d9:
            java.lang.String r5 = r9.B
            if (r5 == 0) goto L4e3
            int r11 = r5.length()
            if (r11 != 0) goto L4e7
        L4e3:
            r5 = r20
            goto L571
        L4e7:
            int r11 = r5.length()
            r14 = 44
            int r14 = r5.indexOf(r14)
            if (r14 <= 0) goto L514
            int r15 = r11 + (-1)
            if (r14 >= r15) goto L514
            r15 = 0
            java.lang.String r6 = r5.substring(r15, r14)
            java.lang.String r15 = "W"
            boolean r15 = r6.equalsIgnoreCase(r15)
            if (r15 == 0) goto L506
            r6 = 0
            goto L511
        L506:
            java.lang.String r15 = "H"
            boolean r6 = r6.equalsIgnoreCase(r15)
            if (r6 == 0) goto L510
            r6 = 1
            goto L511
        L510:
            r6 = -1
        L511:
            int r14 = r14 + 1
            goto L516
        L514:
            r6 = -1
            r14 = 0
        L516:
            r15 = 58
            int r15 = r5.indexOf(r15)
            if (r15 < 0) goto L557
            int r11 = r11 + (-1)
            if (r15 >= r11) goto L557
            java.lang.String r11 = r5.substring(r14, r15)
            int r15 = r15 + 1
            java.lang.String r5 = r5.substring(r15)
            int r14 = r11.length()
            if (r14 <= 0) goto L566
            int r14 = r5.length()
            if (r14 <= 0) goto L566
            float r11 = java.lang.Float.parseFloat(r11)     // Catch: java.lang.NumberFormatException -> L566
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L566
            int r14 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r14 <= 0) goto L566
            int r14 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r14 <= 0) goto L566
            r15 = 1
            if (r6 != r15) goto L551
            float r5 = r5 / r11
            float r5 = java.lang.Math.abs(r5)     // Catch: java.lang.NumberFormatException -> L566
            goto L568
        L551:
            float r11 = r11 / r5
            float r5 = java.lang.Math.abs(r11)     // Catch: java.lang.NumberFormatException -> L566
            goto L568
        L557:
            java.lang.String r5 = r5.substring(r14)
            int r11 = r5.length()
            if (r11 <= 0) goto L566
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L566
            goto L568
        L566:
            r5 = r20
        L568:
            int r11 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r11 <= 0) goto L573
            r10.L = r5
            r10.M = r6
            goto L573
        L571:
            r10.L = r5
        L573:
            float r5 = r9.D
            float[] r6 = r10.Z
            r25 = 0
            r6[r25] = r5
            float r5 = r9.E
            r19 = 1
            r6[r19] = r5
            int r5 = r9.F
            r10.X = r5
            int r5 = r9.G
            r10.Y = r5
            int r5 = r9.H
            int r6 = r9.J
            int r11 = r9.L
            float r14 = r9.N
            r10.j = r5
            r10.m = r6
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r11 != r6) goto L59b
            r11 = 0
        L59b:
            r10.n = r11
            r10.o = r14
            r20 = 0
            int r11 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r11 <= 0) goto L5b0
            int r11 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5b0
            if (r5 != 0) goto L5b0
            r14 = 2
            r10.j = r14
        L5b0:
            int r5 = r9.I
            int r11 = r9.K
            int r14 = r9.M
            float r9 = r9.O
            r10.k = r5
            r10.p = r11
            if (r14 != r6) goto L5bf
            r14 = 0
        L5bf:
            r10.q = r14
            r10.r = r9
            r20 = 0
            int r6 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r6 <= 0) goto L5d2
            int r6 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r6 >= 0) goto L5d2
            if (r5 != 0) goto L5d2
            r14 = 2
            r10.k = r14
        L5d2:
            int r6 = r39 + 1
            r11 = r13
            r4 = r16
            r5 = r27
            r17 = 2
            r19 = 1
            goto L206
        L5df:
            r4 = 3
            r12 = 4
            goto L5e5
        L5e2:
            r26 = r4
            goto L5df
        L5e5:
            if (r26 == 0) goto L61f
            java.lang.Object r5 = r3.b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.clear()
            java.util.ArrayList r6 = r7.d0
            int r6 = r6.size()
            r9 = 0
        L5f5:
            if (r9 >= r6) goto L617
            java.util.ArrayList r10 = r7.d0
            java.lang.Object r10 = r10.get(r9)
            pc r10 = (defpackage.pc) r10
            int[] r11 = r10.c0
            r25 = 0
            r13 = r11[r25]
            if (r13 == r4) goto L611
            if (r13 == r12) goto L611
            r19 = 1
            r11 = r11[r19]
            if (r11 == r4) goto L611
            if (r11 != r12) goto L614
        L611:
            r5.add(r10)
        L614:
            int r9 = r9 + 1
            goto L5f5
        L617:
            r15 = 1
            r8.b = r15
            goto L61f
        L61b:
            r18 = r4
            r4 = 3
            r12 = 4
        L61f:
            int r5 = r0.i
            int r6 = android.view.View.MeasureSpec.getMode(r1)
            int r9 = android.view.View.MeasureSpec.getSize(r1)
            int r10 = android.view.View.MeasureSpec.getMode(r2)
            int r11 = android.view.View.MeasureSpec.getSize(r2)
            int r13 = r0.getPaddingTop()
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)
            int r15 = r0.getPaddingBottom()
            int r15 = java.lang.Math.max(r14, r15)
            int r12 = r13 + r15
            int r4 = r0.getPaddingWidth()
            hc r14 = r0.o
            r14.b = r13
            r14.c = r15
            r14.d = r4
            r14.e = r12
            r14.f = r1
            r14.g = r2
            int r15 = r0.getPaddingStart()
            r16 = r4
            r4 = 0
            int r15 = java.lang.Math.max(r4, r15)
            r17 = r9
            int r9 = r0.getPaddingEnd()
            int r9 = java.lang.Math.max(r4, r9)
            if (r15 > 0) goto L679
            if (r9 <= 0) goto L670
            goto L679
        L670:
            int r9 = r0.getPaddingLeft()
            int r15 = java.lang.Math.max(r4, r9)
            goto L692
        L679:
            android.content.Context r4 = r0.getContext()
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.flags
            r4 = r4 & r18
            if (r4 == 0) goto L692
            int r4 = r0.getLayoutDirection()
            r18 = r9
            r9 = 1
            if (r9 != r4) goto L692
            r15 = r18
        L692:
            int r9 = r17 - r16
            int r11 = r11 - r12
            int r4 = r14.e
            int r12 = r14.d
            int r16 = r0.getChildCount()
            r17 = r4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r4) goto L6d2
            if (r6 == 0) goto L6bc
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 == r4) goto L6b0
            r26 = r12
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
        L6ae:
            r12 = 1
            goto L6e0
        L6b0:
            int r4 = r0.f
            int r4 = r4 - r12
            int r4 = java.lang.Math.min(r4, r9)
            r26 = r12
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L6ae
        L6bc:
            if (r16 != 0) goto L6cd
            int r4 = r0.d
            r26 = r12
            r12 = 0
            int r25 = java.lang.Math.max(r12, r4)
            r4 = r25
        L6c9:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2
            goto L6e0
        L6cd:
            r26 = r12
            r12 = 0
            r4 = r12
            goto L6c9
        L6d2:
            r26 = r12
            r12 = 0
            if (r16 != 0) goto L6de
            int r4 = r0.d
            int r4 = java.lang.Math.max(r12, r4)
            goto L6c9
        L6de:
            r4 = r9
            goto L6c9
        L6e0:
            if (r10 == r2) goto L70d
            if (r10 == 0) goto L6f9
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L6ed
            r16 = r14
            r1 = 1
            r2 = 0
            goto L719
        L6ed:
            int r2 = r0.g
            int r2 = r2 - r17
            int r2 = java.lang.Math.min(r2, r11)
            r16 = r14
            r1 = 1
            goto L719
        L6f9:
            if (r16 != 0) goto L708
            int r2 = r0.e
            r1 = 0
            int r25 = java.lang.Math.max(r1, r2)
            r16 = r14
            r2 = r25
        L706:
            r1 = 2
            goto L719
        L708:
            r1 = 0
            r2 = r1
        L70a:
            r16 = r14
            goto L706
        L70d:
            r1 = 0
            if (r16 != 0) goto L717
            int r2 = r0.e
            int r2 = java.lang.Math.max(r1, r2)
            goto L70a
        L717:
            r2 = r11
            goto L70a
        L719:
            int r14 = r7.l()
            r24 = r11
            int[] r11 = r7.u
            if (r4 != r14) goto L729
            int r14 = r7.i()
            if (r2 == r14) goto L72b
        L729:
            r14 = 1
            goto L72f
        L72b:
            r19 = 1
        L72d:
            r14 = 0
            goto L734
        L72f:
            r8.c = r14
            r19 = r14
            goto L72d
        L734:
            r7.N = r14
            r7.O = r14
            r25 = r14
            int r14 = r0.f
            int r14 = r14 - r26
            r11[r25] = r14
            int r14 = r0.g
            int r14 = r14 - r17
            r11[r19] = r14
            r14 = r25
            r7.Q = r14
            r7.R = r14
            r7.w(r12)
            r7.y(r4)
            r7.x(r1)
            r7.v(r2)
            int r1 = r0.d
            int r1 = r1 - r26
            if (r1 >= 0) goto L761
            r7.Q = r14
            goto L763
        L761:
            r7.Q = r1
        L763:
            int r1 = r0.e
            int r1 = r1 - r17
            if (r1 >= 0) goto L76c
            r7.R = r14
            goto L76e
        L76c:
            r7.R = r1
        L76e:
            r7.j0 = r15
            r7.k0 = r13
            java.lang.Object r1 = r3.d
            qc r1 = (defpackage.qc) r1
            java.lang.Object r2 = r3.b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            hc r4 = r7.g0
            java.util.ArrayList r12 = r7.d0
            int r12 = r12.size()
            int r13 = r7.l()
            int r14 = r7.i()
            r15 = r5 & 128(0x80, float:1.8E-43)
            r17 = r5
            r5 = 128(0x80, float:1.8E-43)
            if (r15 != r5) goto L794
            r5 = 1
            goto L795
        L794:
            r5 = 0
        L795:
            if (r5 != 0) goto L7a2
            r15 = 64
            r26 = r11
            r11 = r17 & 64
            if (r11 != r15) goto L7a0
            goto L7a4
        L7a0:
            r11 = 0
            goto L7a5
        L7a2:
            r26 = r11
        L7a4:
            r11 = 1
        L7a5:
            if (r11 == 0) goto L812
            r15 = 0
        L7a8:
            if (r15 >= r12) goto L812
            r17 = r11
            java.util.ArrayList r11 = r7.d0
            java.lang.Object r11 = r11.get(r15)
            pc r11 = (defpackage.pc) r11
            r27 = r12
            int[] r12 = r11.c0
            r28 = r12
            r25 = 0
            r12 = r28[r25]
            r29 = r15
            r15 = 3
            if (r12 != r15) goto L7c8
            r30 = 1
        L7c5:
            r19 = 1
            goto L7cb
        L7c8:
            r30 = 0
            goto L7c5
        L7cb:
            r12 = r28[r19]
            if (r12 != r15) goto L7d1
            r12 = 1
            goto L7d2
        L7d1:
            r12 = 0
        L7d2:
            if (r30 == 0) goto L7e0
            if (r12 == 0) goto L7e0
            float r12 = r11.L
            r20 = 0
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 <= 0) goto L7e2
            r12 = 1
            goto L7e3
        L7e0:
            r20 = 0
        L7e2:
            r12 = 0
        L7e3:
            boolean r15 = r11.q()
            if (r15 == 0) goto L7f0
            if (r12 == 0) goto L7f0
        L7eb:
            r11 = 1073741824(0x40000000, float:2.0)
            r17 = 0
            goto L818
        L7f0:
            boolean r15 = r11.r()
            if (r15 == 0) goto L7f9
            if (r12 == 0) goto L7f9
            goto L7eb
        L7f9:
            boolean r12 = r11 instanceof defpackage.rk
            if (r12 == 0) goto L7fe
            goto L7eb
        L7fe:
            boolean r12 = r11.q()
            if (r12 != 0) goto L7eb
            boolean r11 = r11.r()
            if (r11 == 0) goto L80b
            goto L7eb
        L80b:
            int r15 = r29 + 1
            r11 = r17
            r12 = r27
            goto L7a8
        L812:
            r17 = r11
            r27 = r12
            r11 = 1073741824(0x40000000, float:2.0)
        L818:
            if (r6 != r11) goto L81c
            if (r10 == r11) goto L81e
        L81c:
            if (r5 == 0) goto L820
        L81e:
            r11 = 1
            goto L821
        L820:
            r11 = 0
        L821:
            r11 = r17 & r11
            if (r11 == 0) goto La6f
            r25 = 0
            r11 = r26[r25]
            int r9 = java.lang.Math.min(r11, r9)
            r15 = 1
            r11 = r26[r15]
            r12 = r24
            int r11 = java.lang.Math.min(r11, r12)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 != r12) goto L847
            int r12 = r7.l()
            if (r12 == r9) goto L845
            r7.y(r9)
            r8.b = r15
        L845:
            r12 = 1073741824(0x40000000, float:2.0)
        L847:
            if (r10 != r12) goto L854
            int r9 = r7.i()
            if (r9 == r11) goto L854
            r7.v(r11)
            r8.b = r15
        L854:
            if (r6 != r12) goto L9d8
            if (r10 != r12) goto L9d8
            java.util.ArrayList r9 = r8.e
            qc r11 = r8.a
            boolean r12 = r8.b
            if (r12 != 0) goto L867
            boolean r12 = r8.c
            if (r12 == 0) goto L865
            goto L867
        L865:
            r12 = 0
            goto L89f
        L867:
            java.util.ArrayList r12 = r11.d0
            int r15 = r12.size()
            r0 = 0
        L86e:
            if (r0 >= r15) goto L890
            java.lang.Object r17 = r12.get(r0)
            int r0 = r0 + 1
            r20 = r0
            r0 = r17
            pc r0 = (defpackage.pc) r0
            r17 = r12
            r12 = 0
            r0.a = r12
            po r12 = r0.d
            r12.n()
            m90 r0 = r0.e
            r0.m()
            r12 = r17
            r0 = r20
            goto L86e
        L890:
            r12 = 0
            r11.a = r12
            po r0 = r11.d
            r0.n()
            m90 r0 = r11.e
            r0.m()
            r8.c = r12
        L89f:
            qc r0 = r8.d
            r8.b(r0)
            r11.N = r12
            int[] r0 = r11.c0
            m90 r15 = r11.e
            r17 = r0
            po r0 = r11.d
            r11.O = r12
            r20 = r4
            int r4 = r11.h(r12)
            r24 = r2
            r12 = 1
            int r2 = r11.h(r12)
            boolean r12 = r8.b
            if (r12 == 0) goto L8c4
            r8.c()
        L8c4:
            int r12 = r11.m()
            r26 = r1
            int r1 = r11.n()
            r28 = r13
            jg r13 = r0.h
            r29 = r14
            sg r14 = r0.e
            r13.d(r12)
            jg r13 = r15.h
            r30 = r12
            sg r12 = r15.e
            r13.d(r1)
            r8.g()
            r13 = 2
            if (r4 == r13) goto L8f1
            if (r2 != r13) goto L8eb
            goto L8f1
        L8eb:
            r31 = r1
        L8ed:
            r1 = 1
        L8ee:
            r25 = 0
            goto L93e
        L8f1:
            if (r5 == 0) goto L90c
            int r13 = r9.size()
            r31 = r1
            r1 = 0
        L8fa:
            if (r1 >= r13) goto L90e
            java.lang.Object r32 = r9.get(r1)
            int r1 = r1 + 1
            qb0 r32 = (defpackage.qb0) r32
            boolean r32 = r32.k()
            if (r32 != 0) goto L8fa
            r5 = 0
            goto L90e
        L90c:
            r31 = r1
        L90e:
            if (r5 == 0) goto L926
            r13 = 2
            if (r4 != r13) goto L926
            r1 = 1
            r11.w(r1)
            r1 = 0
            int r13 = r8.d(r11, r1)
            r11.y(r13)
            int r1 = r11.l()
            r14.d(r1)
        L926:
            if (r5 == 0) goto L8ed
            r13 = 2
            if (r2 != r13) goto L8ed
            r1 = 1
            r11.x(r1)
            int r5 = r8.d(r11, r1)
            r11.v(r5)
            int r5 = r11.i()
            r12.d(r5)
            goto L8ee
        L93e:
            r5 = r17[r25]
            if (r5 == r1) goto L948
            r1 = 4
            if (r5 != r1) goto L946
            goto L948
        L946:
            r0 = 0
            goto L977
        L948:
            int r1 = r11.l()
            int r1 = r1 + r30
            jg r0 = r0.i
            r0.d(r1)
            int r1 = r1 - r30
            r14.d(r1)
            r8.g()
            r1 = 1
            r0 = r17[r1]
            if (r0 == r1) goto L963
            r1 = 4
            if (r0 != r1) goto L973
        L963:
            int r0 = r11.i()
            int r0 = r0 + r31
            jg r1 = r15.i
            r1.d(r0)
            int r0 = r0 - r31
            r12.d(r0)
        L973:
            r8.g()
            r0 = 1
        L977:
            int r1 = r9.size()
            r5 = 0
        L97c:
            if (r5 >= r1) goto L993
            java.lang.Object r8 = r9.get(r5)
            int r5 = r5 + 1
            qb0 r8 = (defpackage.qb0) r8
            pc r12 = r8.b
            if (r12 != r11) goto L98f
            boolean r12 = r8.g
            if (r12 != 0) goto L98f
            goto L97c
        L98f:
            r8.e()
            goto L97c
        L993:
            int r1 = r9.size()
            r5 = 0
        L998:
            if (r5 >= r1) goto L9cb
            java.lang.Object r8 = r9.get(r5)
            int r5 = r5 + 1
            qb0 r8 = (defpackage.qb0) r8
            if (r0 != 0) goto L9a9
            pc r12 = r8.b
            if (r12 != r11) goto L9a9
            goto L998
        L9a9:
            jg r12 = r8.h
            boolean r12 = r12.j
            if (r12 != 0) goto L9b1
        L9af:
            r0 = 0
            goto L9cc
        L9b1:
            jg r12 = r8.i
            boolean r12 = r12.j
            if (r12 != 0) goto L9bc
            boolean r12 = r8 instanceof defpackage.ho
            if (r12 != 0) goto L9bc
            goto L9af
        L9bc:
            sg r12 = r8.e
            boolean r12 = r12.j
            if (r12 != 0) goto L998
            boolean r12 = r8 instanceof defpackage.v8
            if (r12 != 0) goto L998
            boolean r8 = r8 instanceof defpackage.ho
            if (r8 != 0) goto L998
            goto L9af
        L9cb:
            r0 = 1
        L9cc:
            r11.w(r4)
            r11.x(r2)
            r1 = r0
            r0 = 2
            r12 = 1073741824(0x40000000, float:2.0)
            goto La5f
        L9d8:
            r26 = r1
            r24 = r2
            r20 = r4
            r28 = r13
            r29 = r14
            qc r0 = r8.a
            boolean r1 = r8.b
            if (r1 == 0) goto La30
            java.util.ArrayList r1 = r0.d0
            int r2 = r1.size()
            r4 = 0
        L9ef:
            if (r4 >= r2) goto La13
            java.lang.Object r9 = r1.get(r4)
            int r4 = r4 + 1
            pc r9 = (defpackage.pc) r9
            r14 = 0
            r9.a = r14
            po r11 = r9.d
            sg r12 = r11.e
            r12.j = r14
            r11.g = r14
            r11.n()
            m90 r9 = r9.e
            sg r11 = r9.e
            r11.j = r14
            r9.g = r14
            r9.m()
            goto L9ef
        La13:
            r14 = 0
            r0.a = r14
            po r1 = r0.d
            sg r2 = r1.e
            r2.j = r14
            r1.g = r14
            r1.n()
            m90 r1 = r0.e
            sg r2 = r1.e
            r2.j = r14
            r1.g = r14
            r1.m()
            r8.c()
            goto La31
        La30:
            r14 = 0
        La31:
            qc r1 = r8.d
            r8.b(r1)
            r0.N = r14
            r0.O = r14
            po r1 = r0.d
            jg r1 = r1.h
            r1.d(r14)
            m90 r0 = r0.e
            jg r0 = r0.h
            r0.d(r14)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 != r12) goto La53
            boolean r0 = r7.D(r14, r5)
            r1 = r0
            r0 = 1
            goto La55
        La53:
            r0 = 0
            r1 = 1
        La55:
            if (r10 != r12) goto La5f
            r15 = 1
            boolean r2 = r7.D(r15, r5)
            r1 = r1 & r2
            int r0 = r0 + 1
        La5f:
            if (r1 == 0) goto La7b
            if (r6 != r12) goto La65
            r2 = 1
            goto La66
        La65:
            r2 = 0
        La66:
            if (r10 != r12) goto La6a
            r4 = 1
            goto La6b
        La6a:
            r4 = 0
        La6b:
            r7.z(r2, r4)
            goto La7b
        La6f:
            r26 = r1
            r24 = r2
            r20 = r4
            r28 = r13
            r29 = r14
            r0 = 0
            r1 = 0
        La7b:
            if (r1 == 0) goto La80
            r14 = 2
            if (r0 == r14) goto Lce0
        La80:
            if (r27 <= 0) goto Laf1
            java.util.ArrayList r0 = r7.d0
            int r0 = r0.size()
            hc r1 = r7.g0
            r2 = 0
        La8b:
            if (r2 >= r0) goto Lacb
            java.util.ArrayList r4 = r7.d0
            java.lang.Object r4 = r4.get(r2)
            pc r4 = (defpackage.pc) r4
            boolean r5 = r4 instanceof defpackage.go
            if (r5 == 0) goto La9b
        La99:
            r8 = 3
            goto Lac8
        La9b:
            po r5 = r4.d
            sg r5 = r5.e
            boolean r5 = r5.j
            if (r5 == 0) goto Laac
            m90 r5 = r4.e
            sg r5 = r5.e
            boolean r5 = r5.j
            if (r5 == 0) goto Laac
            goto La99
        Laac:
            r14 = 0
            int r5 = r4.h(r14)
            r15 = 1
            int r6 = r4.h(r15)
            r8 = 3
            if (r5 != r8) goto Lac4
            int r5 = r4.j
            if (r5 == r15) goto Lac4
            if (r6 != r8) goto Lac4
            int r5 = r4.k
            if (r5 == r15) goto Lac4
            goto Lac8
        Lac4:
            r14 = 0
            r3.x(r1, r4, r14)
        Lac8:
            int r2 = r2 + 1
            goto La8b
        Lacb:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.a
            int r1 = r0.getChildCount()
            java.util.ArrayList r2 = r0.b
            r4 = 0
        Lad4:
            if (r4 >= r1) goto Ladc
            r0.getChildAt(r4)
            int r4 = r4 + 1
            goto Lad4
        Ladc:
            int r0 = r2.size()
            if (r0 <= 0) goto Laf1
            r1 = 0
        Lae3:
            if (r1 >= r0) goto Laf1
            java.lang.Object r4 = r2.get(r1)
            ec r4 = (defpackage.ec) r4
            r4.getClass()
            int r1 = r1 + 1
            goto Lae3
        Laf1:
            int r0 = r7.p0
            int r1 = r24.size()
            r2 = r28
            r4 = r29
            if (r27 <= 0) goto Lb00
            r3.A(r7, r2, r4)
        Lb00:
            if (r1 <= 0) goto Lcd4
            int[] r5 = r7.c0
            r25 = 0
            r6 = r5[r25]
            r14 = 2
            if (r6 != r14) goto Lb0f
            r6 = 1
        Lb0c:
            r19 = 1
            goto Lb11
        Lb0f:
            r6 = 0
            goto Lb0c
        Lb11:
            r5 = r5[r19]
            if (r5 != r14) goto Lb17
            r5 = 1
            goto Lb18
        Lb17:
            r5 = 0
        Lb18:
            int r8 = r7.l()
            r9 = r26
            int r10 = r9.Q
            int r8 = java.lang.Math.max(r8, r10)
            int r10 = r7.i()
            int r9 = r9.R
            int r9 = java.lang.Math.max(r10, r9)
            r10 = r8
            r11 = r9
            r8 = 0
            r9 = 0
        Lb32:
            if (r8 >= r1) goto Lbc9
            r12 = r24
            java.lang.Object r13 = r12.get(r8)
            pc r13 = (defpackage.pc) r13
            boolean r14 = r13 instanceof defpackage.rk
            if (r14 != 0) goto Lb48
            r17 = r5
            r18 = r6
            r5 = r20
            goto Lbbd
        Lb48:
            int r14 = r13.l()
            int r15 = r13.i()
            r17 = r5
            r18 = r6
            r5 = r20
            r6 = 1
            boolean r20 = r3.x(r5, r13, r6)
            r6 = r9 | r20
            int r9 = r13.l()
            r20 = r6
            int r6 = r13.i()
            if (r9 == r14) goto Lb8e
            r13.y(r9)
            if (r18 == 0) goto Lb8c
            int r9 = r13.m()
            int r14 = r13.J
            int r9 = r9 + r14
            if (r9 <= r10) goto Lb8c
            int r9 = r13.m()
            int r14 = r13.J
            int r9 = r9 + r14
            r14 = 4
            cc r20 = r13.g(r14)
            int r14 = r20.c()
            int r14 = r14 + r9
            int r10 = java.lang.Math.max(r10, r14)
        Lb8c:
            r20 = 1
        Lb8e:
            if (r6 == r15) goto Lbb5
            r13.v(r6)
            if (r17 == 0) goto Lbb3
            int r6 = r13.n()
            int r9 = r13.K
            int r6 = r6 + r9
            if (r6 <= r11) goto Lbb3
            int r6 = r13.n()
            int r9 = r13.K
            int r6 = r6 + r9
            r9 = 5
            cc r14 = r13.g(r9)
            int r9 = r14.c()
            int r9 = r9 + r6
            int r11 = java.lang.Math.max(r11, r9)
        Lbb3:
            r15 = 1
            goto Lbb7
        Lbb5:
            r15 = r20
        Lbb7:
            rk r13 = (defpackage.rk) r13
            boolean r6 = r13.l0
            r6 = r6 | r15
            r9 = r6
        Lbbd:
            int r8 = r8 + 1
            r20 = r5
            r24 = r12
            r5 = r17
            r6 = r18
            goto Lb32
        Lbc9:
            r17 = r5
            r18 = r6
            r5 = r20
            r12 = r24
            r6 = 0
        Lbd2:
            r14 = 2
            if (r6 >= r14) goto Lcb2
            r8 = 0
        Lbd6:
            if (r8 >= r1) goto Lc9b
            java.lang.Object r13 = r12.get(r8)
            pc r13 = (defpackage.pc) r13
            boolean r15 = r13 instanceof defpackage.oo
            if (r15 == 0) goto Lbe6
            boolean r15 = r13 instanceof defpackage.rk
            if (r15 == 0) goto Lc07
        Lbe6:
            boolean r15 = r13 instanceof defpackage.go
            if (r15 == 0) goto Lbeb
            goto Lc07
        Lbeb:
            int r15 = r13.V
            r14 = 8
            if (r15 != r14) goto Lbf2
            goto Lc07
        Lbf2:
            po r14 = r13.d
            sg r14 = r14.e
            boolean r14 = r14.j
            if (r14 == 0) goto Lc03
            m90 r14 = r13.e
            sg r14 = r14.e
            boolean r14 = r14.j
            if (r14 == 0) goto Lc03
            goto Lc07
        Lc03:
            boolean r14 = r13 instanceof defpackage.rk
            if (r14 == 0) goto Lc11
        Lc07:
            r20 = r1
            r23 = r5
            r22 = r6
            r6 = 5
            r14 = 4
            goto Lc90
        Lc11:
            int r14 = r13.l()
            int r15 = r13.i()
            r20 = r1
            int r1 = r13.P
            r22 = r6
            r6 = 1
            boolean r19 = r3.x(r5, r13, r6)
            r9 = r9 | r19
            int r6 = r13.l()
            r23 = r5
            int r5 = r13.i()
            if (r6 == r14) goto Lc59
            r13.y(r6)
            if (r18 == 0) goto Lc56
            int r6 = r13.m()
            int r9 = r13.J
            int r6 = r6 + r9
            if (r6 <= r10) goto Lc56
            int r6 = r13.m()
            int r9 = r13.J
            int r6 = r6 + r9
            r14 = 4
            cc r9 = r13.g(r14)
            int r9 = r9.c()
            int r9 = r9 + r6
            int r10 = java.lang.Math.max(r10, r9)
            goto Lc57
        Lc56:
            r14 = 4
        Lc57:
            r9 = 1
            goto Lc5a
        Lc59:
            r14 = 4
        Lc5a:
            if (r5 == r15) goto Lc83
            r13.v(r5)
            if (r17 == 0) goto Lc80
            int r5 = r13.n()
            int r6 = r13.K
            int r5 = r5 + r6
            if (r5 <= r11) goto Lc80
            int r5 = r13.n()
            int r6 = r13.K
            int r5 = r5 + r6
            r6 = 5
            cc r9 = r13.g(r6)
            int r9 = r9.c()
            int r9 = r9 + r5
            int r11 = java.lang.Math.max(r11, r9)
            goto Lc81
        Lc80:
            r6 = 5
        Lc81:
            r15 = 1
            goto Lc85
        Lc83:
            r6 = 5
            r15 = r9
        Lc85:
            boolean r5 = r13.w
            if (r5 == 0) goto Lc8f
            int r5 = r13.P
            if (r1 == r5) goto Lc8f
            r9 = 1
            goto Lc90
        Lc8f:
            r9 = r15
        Lc90:
            int r8 = r8 + 1
            r1 = r20
            r6 = r22
            r5 = r23
            r14 = 2
            goto Lbd6
        Lc9b:
            r20 = r1
            r23 = r5
            r22 = r6
            r6 = 5
            r14 = 4
            if (r9 == 0) goto Lca9
            r3.A(r7, r2, r4)
            r9 = 0
        Lca9:
            int r1 = r22 + 1
            r6 = r1
            r1 = r20
            r5 = r23
            goto Lbd2
        Lcb2:
            if (r9 == 0) goto Lcd4
            r3.A(r7, r2, r4)
            int r1 = r7.l()
            if (r1 >= r10) goto Lcc2
            r7.y(r10)
            r1 = 1
            goto Lcc3
        Lcc2:
            r1 = 0
        Lcc3:
            int r5 = r7.i()
            if (r5 >= r11) goto Lcce
            r7.v(r11)
            r15 = 1
            goto Lccf
        Lcce:
            r15 = r1
        Lccf:
            if (r15 == 0) goto Lcd4
            r3.A(r7, r2, r4)
        Lcd4:
            r7.p0 = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != r1) goto Lcdd
            r5 = 1
            goto Lcde
        Lcdd:
            r5 = 0
        Lcde:
            defpackage.ar.p = r5
        Lce0:
            int r0 = r7.l()
            int r1 = r7.i()
            boolean r2 = r7.q0
            boolean r3 = r7.r0
            r4 = r16
            int r5 = r4.e
            int r4 = r4.d
            int r0 = r0 + r4
            int r1 = r1 + r5
            r4 = r42
            r14 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r14)
            r4 = r43
            int r1 = android.view.View.resolveSizeAndState(r1, r4, r14)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r4
            r1 = r1 & r4
            r4 = r41
            int r5 = r4.f
            int r0 = java.lang.Math.min(r5, r0)
            int r5 = r4.g
            int r1 = java.lang.Math.min(r5, r1)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r2 == 0) goto Ld19
            r0 = r0 | r5
        Ld19:
            if (r3 == 0) goto Ld1c
            r1 = r1 | r5
        Ld1c:
            r4.setMeasuredDimension(r0, r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View r5) {
            r4 = this;
            super.onViewAdded(r5)
            pc r0 = r4.b(r5)
            boolean r1 = r5 instanceof defpackage.fo
            r2 = 1
            if (r1 == 0) goto L24
            boolean r0 = r0 instanceof defpackage.go
            if (r0 != 0) goto L24
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            gc r0 = (defpackage.gc) r0
            go r1 = new go
            r1.<init>()
            r0.k0 = r1
            r0.Y = r2
            int r0 = r0.R
            r1.B(r0)
        L24:
            boolean r0 = r5 instanceof defpackage.ec
            if (r0 == 0) goto L41
            r0 = r5
            ec r0 = (defpackage.ec) r0
            r0.g()
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            gc r1 = (defpackage.gc) r1
            r1.Z = r2
            java.util.ArrayList r1 = r4.b
            boolean r3 = r1.contains(r0)
            if (r3 != 0) goto L41
            r1.add(r0)
        L41:
            android.util.SparseArray r0 = r4.a
            int r1 = r5.getId()
            r0.put(r1, r5)
            r4.h = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            android.util.SparseArray r0 = r2.a
            int r1 = r3.getId()
            r0.remove(r1)
            pc r0 = r2.b(r3)
            qc r1 = r2.c
            java.util.ArrayList r1 = r1.d0
            r1.remove(r0)
            r1 = 0
            r0.I = r1
            java.util.ArrayList r0 = r2.b
            r0.remove(r3)
            r3 = 1
            r2.h = r3
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.requestLayout()
            return
    }

    public void setConstraintSet(defpackage.oc r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            int r0 = r2.getId()
            android.util.SparseArray r1 = r2.a
            r1.remove(r0)
            super.setId(r3)
            int r3 = r2.getId()
            r1.put(r3, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.f
            if (r2 != r0) goto L5
            return
        L5:
            r1.f = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.e
            if (r2 != r0) goto L5
            return
        L5:
            r1.e = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.d
            if (r2 != r0) goto L5
            return
        L5:
            r1.d = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(defpackage.rc r1) {
            r0 = this;
            d4 r1 = r0.k
            if (r1 == 0) goto L7
            r1.getClass()
        L7:
            return
    }

    public void setOptimizationLevel(int r2) {
            r1 = this;
            r1.i = r2
            qc r0 = r1.c
            r0.p0 = r2
            r0 = 256(0x100, float:3.59E-43)
            r2 = r2 & r0
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            defpackage.ar.p = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
