package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zt {
    public static boolean a = true;
    public static java.lang.reflect.Field b = null;
    public static boolean c = false;
    public static boolean d = true;

    public static boolean B(android.view.MotionEvent r0, int r1) {
            int r0 = r0.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static int E(float r1, int r2, int r3) {
            int r0 = android.graphics.Color.alpha(r3)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = java.lang.Math.round(r0)
            int r1 = defpackage.ib.d(r3, r1)
            int r1 = defpackage.ib.b(r1, r2)
            return r1
    }

    public static double[] F(double[] r17, double[][] r18) {
            r0 = 0
            r1 = r17[r0]
            r3 = r18[r0]
            r4 = r3[r0]
            double r4 = r4 * r1
            r6 = 1
            r7 = r17[r6]
            r9 = r3[r6]
            double r9 = r9 * r7
            double r9 = r9 + r4
            r4 = 2
            r11 = r17[r4]
            r13 = r3[r4]
            double r13 = r13 * r11
            double r13 = r13 + r9
            r3 = r18[r6]
            r9 = r3[r0]
            double r9 = r9 * r1
            r15 = r3[r6]
            double r15 = r15 * r7
            double r15 = r15 + r9
            r9 = r3[r4]
            double r9 = r9 * r11
            double r9 = r9 + r15
            r3 = r18[r4]
            r15 = r3[r0]
            double r1 = r1 * r15
            r15 = r3[r6]
            double r7 = r7 * r15
            double r7 = r7 + r1
            r1 = r3[r4]
            double r11 = r11 * r1
            double r11 = r11 + r7
            r1 = 3
            double[] r1 = new double[r1]
            r1[r0] = r13
            r1[r6] = r9
            r1[r4] = r11
            return r1
    }

    public static android.graphics.Typeface G(android.content.res.Configuration r2, android.graphics.Typeface r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            int r0 = defpackage.p7.a(r2)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L30
            int r0 = defpackage.p7.a(r2)
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            int r0 = defpackage.c0.a(r3)
            int r2 = defpackage.p7.a(r2)
            int r2 = r2 + r0
            r0 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = defpackage.ct.d(r2, r0, r1)
            boolean r0 = r3.isItalic()
            android.graphics.Typeface r2 = defpackage.c0.e(r3, r2, r0)
            return r2
        L30:
            r2 = 0
            return r2
    }

    public static android.content.res.TypedArray H(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }

    public static java.util.ArrayList K() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            gn r1 = defpackage.gn.a
            java.lang.String r2 = "AvbEVb8fVz8I/9FVpBA=\n"
            java.lang.String r3 = "aZO9Cst+NWA=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            r1.getClass()
            r1 = 1
            boolean r2 = defpackage.gn.a(r2, r1)
            if (r2 == 0) goto L24
            java.lang.String r2 = "oDXd\n"
            java.lang.String r3 = "wVmxIXAtpvA=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            r0.add(r2)
        L24:
            java.lang.String r2 = "EIggdPAGm7sOgytO5QOmixU=\n"
            java.lang.String r3 = "e+1ZK4Rn+eQ=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.gn.a(r2, r1)
            if (r2 == 0) goto L3d
            java.lang.String r2 = "3nm11q19\n"
            java.lang.String r3 = "qxfHs8wZnaM=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            r0.add(r2)
        L3d:
            java.lang.String r2 = "Oh28bbrbJeg3CqxXoN4Y2D8=\n"
            java.lang.String r3 = "UXjFMs66R7c=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.gn.a(r2, r1)
            if (r2 == 0) goto L56
            java.lang.String r2 = "cRhv4K4R\n"
            java.lang.String r3 = "F2oGhcB1/cA=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            r0.add(r2)
        L56:
            java.lang.String r2 = "zCZ6zpPezJ3AMWzkl+DBrA==\n"
            java.lang.String r3 = "p0MDkee/rsI=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r1 = defpackage.gn.a(r2, r1)
            if (r1 == 0) goto L6f
            java.lang.String r1 = "dCKsfrU=\n"
            java.lang.String r2 = "E1DDC8XbniQ=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            r0.add(r1)
        L6f:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L80
            java.lang.String r1 = "cdAa\n"
            java.lang.String r2 = "ELx2TsGvrkk=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            r0.add(r1)
        L80:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.cb.h0(r0)
            r1.<init>(r2)
            int r2 = r0.size()
            r3 = 0
        L8e:
            if (r3 >= r2) goto L158
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.hashCode()
            switch(r5) {
                case -1266283874: goto L11e;
                case -840272977: goto Lf5;
                case 96673: goto Lcc;
                case 98629247: goto La1;
                default: goto L9f;
            }
        L9f:
            goto L12c
        La1:
            java.lang.String r5 = "pPhyaE0=\n"
            java.lang.String r6 = "w4odHT18jls=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r6)
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto Lb1
            goto L12c
        Lb1:
            gn r5 = defpackage.gn.a
            java.lang.String r6 = "Aqz+27dAeZMHqOrhnEZpoxy5\n"
            java.lang.String r7 = "acmHhMMhG8w=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r7)
            java.lang.String r7 = "X9o8b/Bf\n"
            java.lang.String r8 = "uGSYh3HVYRs=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            r5.getClass()
            java.lang.String r5 = defpackage.gn.d(r6, r7)
            goto L14e
        Lcc:
            java.lang.String r5 = "0zGy\n"
            java.lang.String r6 = "sl3eq/UaykU=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r6)
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto Ldb
            goto L12c
        Ldb:
            gn r5 = defpackage.gn.a
            java.lang.String r6 = "miPQ7zRzZbWfJ8TVH3Nrhg==\n"
            java.lang.String r7 = "8UapsEASB+o=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r7)
            java.lang.String r7 = "MN+onXpi\n"
            java.lang.String r8 = "1VoAdPnKHj0=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            r5.getClass()
            java.lang.String r5 = defpackage.gn.d(r6, r7)
            goto L14e
        Lf5:
            java.lang.String r5 = "xVCXM1jK\n"
            java.lang.String r6 = "sD7lVjmuJ94=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r6)
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L104
            goto L12c
        L104:
            gn r5 = defpackage.gn.a
            java.lang.String r6 = "XSPW0/SViz9YJ8Lp34GHElMnyw==\n"
            java.lang.String r7 = "NkavjID06WA=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r7)
            java.lang.String r7 = "dNUMKvUA\n"
            java.lang.String r8 = "kkmmwlq7b1M=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            r5.getClass()
            java.lang.String r5 = defpackage.gn.d(r6, r7)
            goto L14e
        L11e:
            java.lang.String r5 = "LoZJFZcT\n"
            java.lang.String r6 = "SPQgcPl3514=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r6)
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L135
        L12c:
            java.lang.String r5 = "pTWhm2ZW\n"
            java.lang.String r6 = "QLAJcuX+8jA=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r6)
            goto L14e
        L135:
            gn r5 = defpackage.gn.a
            java.lang.String r6 = "7pUw3JIbo23rkSTmuRyzW+CeLQ==\n"
            java.lang.String r7 = "hfBJg+Z6wTI=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r7)
            java.lang.String r7 = "M4HsKI9Z\n"
            java.lang.String r8 = "1iRRzQDSi1g=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            r5.getClass()
            java.lang.String r5 = defpackage.gn.d(r6, r7)
        L14e:
            s50 r6 = new s50
            r6.<init>(r5, r4)
            r1.add(r6)
            goto L8e
        L158:
            return r1
    }

    public static void L(android.widget.TextView r3, int r4) {
            e(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            defpackage.n60.c(r3, r4)
            return
        Ld:
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = defpackage.j60.a(r3)
            if (r1 == 0) goto L1e
            int r0 = r0.top
            goto L20
        L1e:
            int r0 = r0.ascent
        L20:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L36
            int r4 = r4 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
        L36:
            return
    }

    public static void M(android.widget.TextView r3, int r4) {
            e(r4)
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r1 = defpackage.j60.a(r3)
            if (r1 == 0) goto L14
            int r0 = r0.bottom
            goto L16
        L14:
            int r0 = r0.descent
        L16:
            int r1 = java.lang.Math.abs(r0)
            if (r4 <= r1) goto L2c
            int r4 = r4 - r0
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
        L2c:
            return
    }

    public static void Q(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            defpackage.f0.o(r2, r3)
            return
        La:
            boolean r0 = defpackage.zt.a
            if (r0 == 0) goto L15
            defpackage.f0.o(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r2 = 0
            defpackage.zt.a = r2
        L15:
            return
    }

    public static android.view.ActionMode.Callback S(android.view.ActionMode.Callback r2, android.widget.TextView r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 > r1) goto L13
            boolean r0 = r2 instanceof defpackage.o60
            if (r0 != 0) goto L13
            if (r2 != 0) goto Ld
            goto L13
        Ld:
            o60 r0 = new o60
            r0.<init>(r2, r3)
            return r0
        L13:
            return r2
    }

    public static void d(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static void e(int r0) {
            if (r0 < 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void f(java.lang.String r0, java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
    }

    public static int g(defpackage.yz r0, defpackage.ai r1, android.view.View r2, android.view.View r3, defpackage.nz r4, boolean r5) {
            int r4 = r4.v()
            if (r4 == 0) goto L35
            int r0 = r0.b()
            if (r0 == 0) goto L35
            if (r2 == 0) goto L35
            if (r3 != 0) goto L11
            goto L35
        L11:
            if (r5 != 0) goto L23
            int r0 = defpackage.nz.F(r2)
            int r1 = defpackage.nz.F(r3)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + 1
            return r0
        L23:
            int r0 = r1.b(r3)
            int r2 = r1.e(r2)
            int r0 = r0 - r2
            int r1 = r1.l()
            int r0 = java.lang.Math.min(r1, r0)
            return r0
        L35:
            r0 = 0
            return r0
    }

    public static int h(defpackage.yz r3, defpackage.ai r4, android.view.View r5, android.view.View r6, defpackage.nz r7, boolean r8, boolean r9) {
            int r7 = r7.v()
            r0 = 0
            if (r7 == 0) goto L70
            int r7 = r3.b()
            if (r7 == 0) goto L70
            if (r5 == 0) goto L70
            if (r6 != 0) goto L12
            goto L70
        L12:
            int r7 = defpackage.nz.F(r5)
            int r1 = defpackage.nz.F(r6)
            int r7 = java.lang.Math.min(r7, r1)
            int r1 = defpackage.nz.F(r5)
            int r2 = defpackage.nz.F(r6)
            int r1 = java.lang.Math.max(r1, r2)
            if (r9 == 0) goto L38
            int r3 = r3.b()
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.max(r0, r3)
            goto L3c
        L38:
            int r3 = java.lang.Math.max(r0, r7)
        L3c:
            if (r8 != 0) goto L3f
            return r3
        L3f:
            int r7 = r4.b(r6)
            int r8 = r4.e(r5)
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = defpackage.nz.F(r5)
            int r6 = defpackage.nz.F(r6)
            int r8 = r8 - r6
            int r6 = java.lang.Math.abs(r8)
            int r6 = r6 + 1
            float r7 = (float) r7
            float r6 = (float) r6
            float r7 = r7 / r6
            float r3 = (float) r3
            float r3 = r3 * r7
            int r6 = r4.k()
            int r4 = r4.e(r5)
            int r6 = r6 - r4
            float r4 = (float) r6
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            return r3
        L70:
            return r0
    }

    public static int i(defpackage.yz r0, defpackage.ai r1, android.view.View r2, android.view.View r3, defpackage.nz r4, boolean r5) {
            int r4 = r4.v()
            if (r4 == 0) goto L3b
            int r4 = r0.b()
            if (r4 == 0) goto L3b
            if (r2 == 0) goto L3b
            if (r3 != 0) goto L11
            goto L3b
        L11:
            if (r5 != 0) goto L18
            int r0 = r0.b()
            return r0
        L18:
            int r4 = r1.b(r3)
            int r1 = r1.e(r2)
            int r4 = r4 - r1
            int r1 = defpackage.nz.F(r2)
            int r2 = defpackage.nz.F(r3)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            float r2 = (float) r4
            float r1 = (float) r1
            float r2 = r2 / r1
            int r0 = r0.b()
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            return r0
        L3b:
            r0 = 0
            return r0
    }

    public static int j(android.content.Context r1, int r2, int r3) {
            android.util.TypedValue r2 = defpackage.gt.y(r1, r2)
            if (r2 == 0) goto L16
            int r0 = r2.resourceId
            if (r0 == 0) goto Lf
            int r1 = defpackage.hd.a(r1, r0)
            goto L11
        Lf:
            int r1 = r2.data
        L11:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1e
            int r1 = r1.intValue()
            return r1
        L1e:
            return r3
    }

    public static int k(android.view.View r2, int r3) {
            android.content.Context r0 = r2.getContext()
            android.content.Context r1 = r2.getContext()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            android.util.TypedValue r2 = defpackage.gt.A(r1, r3, r2)
            int r3 = r2.resourceId
            if (r3 == 0) goto L1d
            int r2 = defpackage.hd.a(r0, r3)
            return r2
        L1d:
            int r2 = r2.data
            return r2
    }

    public static defpackage.z3 p(android.content.res.TypedArray r3, org.xmlpull.v1.XmlPullParser r4, android.content.res.Resources.Theme r5, java.lang.String r6, int r7) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r4 = r4.getAttributeValue(r0, r6)
            r6 = 0
            r0 = 0
            if (r4 == 0) goto L3d
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r3.getValue(r7, r4)
            int r1 = r4.type
            r2 = 28
            if (r1 < r2) goto L24
            r2 = 31
            if (r1 > r2) goto L24
            int r3 = r4.data
            z3 r4 = new z3
            r4.<init>(r6, r6, r3)
            return r4
        L24:
            android.content.res.Resources r4 = r3.getResources()
            int r3 = r3.getResourceId(r7, r0)
            z3 r3 = defpackage.z3.b(r4, r3, r5)     // Catch: java.lang.Exception -> L31
            goto L3a
        L31:
            r3 = move-exception
            java.lang.String r4 = "ComplexColorCompat"
            java.lang.String r5 = "Failed to inflate ComplexColor."
            android.util.Log.e(r4, r5, r3)
            r3 = r6
        L3a:
            if (r3 == 0) goto L3d
            return r3
        L3d:
            z3 r3 = new z3
            r3.<init>(r6, r6, r0)
            return r3
    }

    public static android.content.Intent r(androidx.appcompat.app.AppCompatActivity r3) {
            android.content.Intent r0 = defpackage.ew.a(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.content.ComponentName r0 = r3.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            java.lang.String r0 = t(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = t(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L23
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            return r3
        L23:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            return r3
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "' in manifest"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
        L46:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    public static android.content.Intent s(androidx.appcompat.app.AppCompatActivity r2, android.content.ComponentName r3) {
            java.lang.String r0 = t(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = t(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            return r2
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
            return r2
    }

    public static java.lang.String t(android.content.Context r3, android.content.ComponentName r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Le
            r1 = 269222528(0x100c0280, float:2.7612058E-29)
            goto L11
        Le:
            r1 = 787072(0xc0280, float:1.102923E-39)
        L11:
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r4, r1)
            java.lang.String r0 = r4.parentActivityName
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.os.Bundle r4 = r4.metaData
            r0 = 0
            if (r4 != 0) goto L20
            return r0
        L20:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r4 = r4.getString(r1)
            if (r4 != 0) goto L29
            return r0
        L29:
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L46:
            return r4
    }

    public static defpackage.wx w(defpackage.g5 r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            wx r0 = new wx
            android.text.PrecomputedText$Params r8 = defpackage.n60.b(r8)
            r0.<init>(r8)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r8.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r4 = defpackage.l60.a(r8)
            int r5 = defpackage.l60.d(r8)
            android.text.method.TransformationMethod r6 = r8.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            if (r6 == 0) goto L2e
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L7f
        L2e:
            r6 = 1
            r7 = 0
            if (r0 < r1) goto L5d
            int r0 = r8.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L5d
            java.util.Locale r8 = defpackage.k60.d(r8)
            android.icu.text.DecimalFormatSymbols r8 = defpackage.m60.a(r8)
            java.lang.String[] r8 = defpackage.n60.a(r8)
            r8 = r8[r7]
            int r8 = r8.codePointAt(r7)
            byte r8 = java.lang.Character.getDirectionality(r8)
            if (r8 == r6) goto L5a
            r0 = 2
            if (r8 != r0) goto L57
            goto L5a
        L57:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L7f
        L5a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L7f
        L5d:
            int r0 = defpackage.k60.b(r8)
            if (r0 != r6) goto L64
            goto L65
        L64:
            r6 = r7
        L65:
            int r8 = defpackage.k60.c(r8)
            switch(r8) {
                case 2: goto L7d;
                case 3: goto L7a;
                case 4: goto L77;
                case 5: goto L74;
                case 6: goto L7f;
                case 7: goto L71;
                default: goto L6c;
            }
        L6c:
            if (r6 == 0) goto L7f
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L7f
        L71:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L7f
        L74:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L7f
        L77:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L7f
        L7a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L7f
        L7d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L7f:
            wx r8 = new wx
            r8.<init>(r2, r3, r4, r5)
            return r8
    }

    public static boolean y(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean z(int r21) {
            if (r21 == 0) goto Lcb
            java.lang.ThreadLocal r1 = defpackage.ib.a
            java.lang.Object r2 = r1.get()
            double[] r2 = (double[]) r2
            r3 = 3
            if (r2 != 0) goto L12
            double[] r2 = new double[r3]
            r1.set(r2)
        L12:
            int r1 = android.graphics.Color.red(r21)
            int r4 = android.graphics.Color.green(r21)
            int r5 = android.graphics.Color.blue(r21)
            int r6 = r2.length
            if (r6 != r3) goto Lc3
            double r6 = (double) r1
            r8 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r6 = r6 / r8
            r10 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r12 = 4612586738352862003(0x4003333333333333, double:2.4)
            r14 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r16 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r18 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            if (r1 >= 0) goto L48
            double r6 = r6 / r18
            goto L4f
        L48:
            double r6 = r6 + r16
            double r6 = r6 / r14
            double r6 = java.lang.Math.pow(r6, r12)
        L4f:
            double r3 = (double) r4
            double r3 = r3 / r8
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L5a
            double r3 = r3 / r18
        L57:
            r20 = 0
            goto L62
        L5a:
            double r3 = r3 + r16
            double r3 = r3 / r14
            double r3 = java.lang.Math.pow(r3, r12)
            goto L57
        L62:
            double r0 = (double) r5
            double r0 = r0 / r8
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 >= 0) goto L6b
            double r0 = r0 / r18
            goto L72
        L6b:
            double r0 = r0 + r16
            double r0 = r0 / r14
            double r0 = java.lang.Math.pow(r0, r12)
        L72:
            r8 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r8 = r8 * r6
            r10 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r10 = r10 * r3
            double r10 = r10 + r8
            r8 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r8 = r8 * r0
            double r8 = r8 + r10
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 * r10
            r2[r20] = r8
            r8 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r8 = r8 * r6
            r12 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r12 = r12 * r3
            double r12 = r12 + r8
            r8 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r8 = r8 * r0
            double r8 = r8 + r12
            double r8 = r8 * r10
            r5 = 1
            r2[r5] = r8
            r12 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r6 = r6 * r12
            r12 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r3 = r3 * r12
            double r3 = r3 + r6
            r6 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r0 = r0 * r6
            double r0 = r0 + r3
            double r0 = r0 * r10
            r3 = 2
            r2[r3] = r0
            double r8 = r8 / r10
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lcd
            return r5
        Lc3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outXyz must have a length of 3."
            r0.<init>(r1)
            throw r0
        Lcb:
            r20 = 0
        Lcd:
            return r20
    }

    public abstract boolean A(float r1);

    public abstract boolean C(android.view.View r1);

    public abstract boolean D(float r1, float r2);

    public abstract void I(int r1);

    public abstract void J(android.graphics.Typeface r1);

    public void N(android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = defpackage.zt.d
            if (r0 == 0) goto Lb
            defpackage.f0.k(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            defpackage.zt.d = r0
        Lb:
            r2.setAlpha(r3)
            return
    }

    public void O(android.view.View r4, int r5) {
            r3 = this;
            boolean r0 = defpackage.zt.c
            if (r0 != 0) goto L1c
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mViewFlags"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L13
            defpackage.zt.b = r1     // Catch: java.lang.NoSuchFieldException -> L13
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L13
            goto L1a
        L13:
            java.lang.String r1 = "ViewUtilsBase"
            java.lang.String r2 = "fetchViewFlagsField: "
            android.util.Log.i(r1, r2)
        L1a:
            defpackage.zt.c = r0
        L1c:
            java.lang.reflect.Field r0 = defpackage.zt.b
            if (r0 == 0) goto L2c
            int r0 = r0.getInt(r4)     // Catch: java.lang.IllegalAccessException -> L2c
            java.lang.reflect.Field r1 = defpackage.zt.b     // Catch: java.lang.IllegalAccessException -> L2c
            r0 = r0 & (-13)
            r5 = r5 | r0
            r1.setInt(r4, r5)     // Catch: java.lang.IllegalAccessException -> L2c
        L2c:
            return
    }

    public abstract boolean P(android.view.View r1, float r2);

    public abstract void R(android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3);

    public abstract int a(android.view.ViewGroup.MarginLayoutParams r1);

    public abstract float b(int r1);

    public void c(int r4) {
            r3 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ks r1 = new ks
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int q(android.view.View r1);

    public abstract int u(androidx.coordinatorlayout.widget.CoordinatorLayout r1);

    public abstract int v();

    public float x(android.view.View r2) {
            r1 = this;
            boolean r0 = defpackage.zt.d
            if (r0 == 0) goto Lc
            float r2 = defpackage.f0.a(r2)     // Catch: java.lang.NoSuchMethodError -> L9
            return r2
        L9:
            r0 = 0
            defpackage.zt.d = r0
        Lc:
            float r2 = r2.getAlpha()
            return r2
    }
}
