package a;

/* JADX INFO: renamed from: a.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0282n9 implements a.Lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a.C0282n9 f600a;

    public static void A(android.view.View r3, a.Ta r4) {
            a.Ta$b r0 = r4.f278a
            a.J5 r0 = r0.b
            if (r0 == 0) goto L2f
            boolean r0 = r0.f134a
            if (r0 == 0) goto L2f
            android.view.ViewParent r3 = r3.getParent()
            r0 = 0
        Lf:
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L22
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            float r1 = a.C0414ug.d.i(r1)
            float r0 = r0 + r1
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L22:
            a.Ta$b r3 = r4.f278a
            float r1 = r3.l
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L2f
            r3.l = r0
            r4.n()
        L2f:
            return
    }

    public static final void B(java.lang.Object... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.e(r1)
            return
    }

    public static final boolean d(android.widget.TextView r1, int r2) {
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L1e
            int r0 = r1.getHeight()
            if (r0 > 0) goto Ld
            goto L1e
        Ld:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L1e
            int r1 = r0.top
            if (r1 >= r2) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static void e(java.lang.StringBuilder r0, java.lang.Object r1, a.D7 r2) {
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.f(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        Lc:
            if (r1 != 0) goto L10
            r2 = 1
            goto L12
        L10:
            boolean r2 = r1 instanceof java.lang.CharSequence
        L12:
            if (r2 == 0) goto L1a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        L1a:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L28
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            return
        L28:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            return
    }

    public static void f(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static void g(int r0) {
            if (r0 < 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void h(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static int i(android.content.Context r6, java.lang.String r7) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L14
            goto L2f
        L14:
            java.lang.String r7 = a.C0471y1.d(r7)
            r0 = 0
            if (r7 != 0) goto L1c
            goto L77
        L1c:
            if (r2 != 0) goto L30
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L2f
            int r4 = r2.length
            if (r4 > 0) goto L2c
            goto L2f
        L2c:
            r2 = r2[r0]
            goto L30
        L2f:
            return r3
        L30:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L6b
            boolean r3 = java.util.Objects.equals(r4, r2)
            if (r3 == 0) goto L6b
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L60
            android.app.AppOpsManager r3 = a.C0489z1.c(r6)
            int r4 = android.os.Binder.getCallingUid()
            int r2 = a.C0489z1.a(r3, r7, r4, r2)
            if (r2 == 0) goto L57
            goto L75
        L57:
            java.lang.String r6 = a.C0489z1.b(r6)
            int r2 = a.C0489z1.a(r3, r7, r1, r6)
            goto L75
        L60:
            java.lang.Object r6 = a.C0471y1.a(r6, r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = a.C0471y1.c(r6, r7, r2)
            goto L75
        L6b:
            java.lang.Object r6 = a.C0471y1.a(r6, r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = a.C0471y1.c(r6, r7, r2)
        L75:
            if (r2 != 0) goto L78
        L77:
            return r0
        L78:
            r6 = -2
            return r6
    }

    public static int j(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static final void k(android.view.View r4, a.Fc r5) {
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L7
            r5.f(r4)
        L7:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L23
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            k(r2, r5)
            int r1 = r1 + 1
            goto L12
        L23:
            return
    }

    public static a.C0435w1 l(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Lb
            a.Ad r1 = new a.Ad
            r1.<init>()
            return r1
        Lb:
            a.E4 r1 = new a.E4
            r1.<init>()
            return r1
        L11:
            a.Ad r1 = new a.Ad
            r1.<init>()
            return r1
    }

    public static final void m(java.lang.Object... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "args"
            a.C0193i9.e(r1, r0)
            return
    }

    public static java.lang.String n(java.nio.ByteBuffer r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r6.hasRemaining()
            if (r1 != 0) goto L10
            java.lang.String r6 = r0.toString()
            return r6
        L10:
            byte r1 = r6.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            if (r1 != 0) goto L1e
            java.lang.String r6 = r0.toString()
            return r6
        L1e:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L26
            r0.append(r1)
            goto L5
        L26:
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r4 = 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L48
            byte r3 = r6.get()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 != r2) goto L40
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r3 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L40:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r0 = "bad second byte"
            r6.<init>(r0)
            throw r6
        L48:
            r3 = r1 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r3 != r4) goto L77
            byte r3 = r6.get()
            byte r4 = r6.get()
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L6f
            r5 = r4 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L6f
            r1 = r1 & 15
            int r1 = r1 << 12
            r2 = r3 & 63
            int r2 = r2 << 6
            r1 = r1 | r2
            r2 = r4 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r0.append(r1)
            goto L5
        L6f:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r0 = "bad second or third byte"
            r6.<init>(r0)
            throw r6
        L77:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r0 = "bad byte"
            r6.<init>(r0)
            throw r6
    }

    public static java.lang.String o(java.lang.String r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r12 == 0) goto L6b
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L6b
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r12.length()
            if (r2 >= r3) goto L6b
            int r3 = java.lang.Character.codePointAt(r12, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\u"
            r4.<init>(r5)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r5 = "0"
            boolean r6 = r3.startsWith(r5)
            r7 = 1
            if (r6 == 0) goto L31
            java.lang.String r3 = r3.substring(r7)
        L31:
            int r6 = r3.length()
            r8 = 4
            if (r6 > r8) goto L53
            int r6 = r3.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r1
        L42:
            int r11 = 4 - r6
            if (r10 >= r11) goto L4c
            r9.append(r5)
            int r10 = r10 + 1
            goto L42
        L4c:
            java.lang.String r5 = r9.toString()
            r4.append(r5)
        L53:
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.append(r3)
            char r3 = r12.charAt(r2)
            boolean r3 = java.lang.Character.isHighSurrogate(r3)
            if (r3 == 0) goto L69
            int r2 = r2 + 1
        L69:
            int r2 = r2 + r7
            goto Lf
        L6b:
            java.lang.String r12 = r0.toString()
            return r12
    }

    public static android.view.View p(android.view.View r4, int r5) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.View r3 = r3.findViewById(r5)
            if (r3 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r1
    }

    public static final android.widget.TextView q(android.view.View r4, a.D7 r5) {
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L13
            java.lang.Object r0 = r5.f(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L13
            android.widget.TextView r4 = (android.widget.TextView) r4
            return r4
        L13:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L33
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L1e:
            if (r1 >= r0) goto L33
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            android.widget.TextView r2 = q(r2, r5)
            if (r2 == 0) goto L30
            return r2
        L30:
            int r1 = r1 + 1
            goto L1e
        L33:
            r4 = 0
            return r4
    }

    public static final java.lang.Class r(a.InterfaceC0318p9 r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            a.a3 r2 = (a.InterfaceC0041a3) r2
            java.lang.Class r2 = r2.a()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L13
            goto L88
        L13:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L80;
                case 104431: goto L74;
                case 3039496: goto L68;
                case 3052374: goto L5c;
                case 3327612: goto L50;
                case 3625364: goto L44;
                case 64711720: goto L38;
                case 97526364: goto L2c;
                case 109413500: goto L20;
                default: goto L1e;
            }
        L1e:
            goto L88
        L20:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L88
        L29:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L2c:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L88
        L35:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L38:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L88
        L41:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L44:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L88
        L4d:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L50:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L88
        L59:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L5c:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65
            goto L88
        L65:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L68:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L71
            goto L88
        L71:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L74:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            goto L88
        L7d:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L80:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L89
        L88:
            return r2
        L89:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
    }

    public static android.content.SharedPreferences s(java.lang.String r2) {
            android.content.Context r0 = a.C0435w1.p
            a.C0193i9.b(r0)
            r1 = 4
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r1)
            a.C0193i9.b(r2)
            return r2
    }

    public static final void t(java.lang.Object... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            return
    }

    public static a.C0212jb u(java.nio.MappedByteBuffer r13) {
            java.nio.ByteBuffer r13 = r13.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r13.order(r0)
            int r0 = r13.position()
            int r0 = r0 + 4
            r13.position(r0)
            short r0 = r13.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            java.lang.String r2 = "Cannot read metadata."
            if (r0 > r1) goto Ld5
            int r1 = r13.position()
            int r1 = r1 + 6
            r13.position(r1)
            r1 = 0
            r3 = r1
        L2b:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = -1
            if (r3 >= r0) goto L59
            int r8 = r13.getInt()
            int r9 = r13.position()
            int r9 = r9 + 4
            r13.position(r9)
            int r9 = r13.getInt()
            long r9 = (long) r9
            long r9 = r9 & r4
            int r11 = r13.position()
            int r11 = r11 + 4
            r13.position(r11)
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r11 != r8) goto L56
            goto L5a
        L56:
            int r3 = r3 + 1
            goto L2b
        L59:
            r9 = r6
        L5a:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto Lcf
            int r0 = r13.position()
            long r6 = (long) r0
            long r6 = r9 - r6
            int r0 = (int) r6
            int r3 = r13.position()
            int r3 = r3 + r0
            r13.position(r3)
            int r0 = r13.position()
            int r0 = r0 + 12
            r13.position(r0)
            int r0 = r13.getInt()
            long r6 = (long) r0
            long r6 = r6 & r4
        L7d:
            long r11 = (long) r1
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lcf
            int r0 = r13.getInt()
            int r3 = r13.getInt()
            long r11 = (long) r3
            long r11 = r11 & r4
            r13.getInt()
            r3 = 1164798569(0x456d6a69, float:3798.6506)
            if (r3 == r0) goto L9d
            r3 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r3 != r0) goto L9a
            goto L9d
        L9a:
            int r1 = r1 + 1
            goto L7d
        L9d:
            long r11 = r11 + r9
            int r0 = (int) r11
            r13.position(r0)
            a.jb r0 = new a.jb
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r13.order(r1)
            int r1 = r13.position()
            int r1 = r13.getInt(r1)
            int r2 = r13.position()
            int r2 = r2 + r1
            r0.d = r13
            r0.f233a = r2
            int r13 = r13.getInt(r2)
            int r2 = r2 - r13
            r0.b = r2
            java.lang.Object r13 = r0.d
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            short r13 = r13.getShort(r2)
            r0.c = r13
            return r0
        Lcf:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r2)
            throw r13
        Ld5:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r2)
            throw r13
    }

    public static final java.lang.String v(java.io.Reader r4) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            char[] r1 = new char[r1]
            int r2 = r4.read(r1)
        Ld:
            if (r2 < 0) goto L18
            r3 = 0
            r0.write(r1, r3, r2)
            int r2 = r4.read(r1)
            goto Ld
        L18:
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "toString(...)"
            a.C0193i9.d(r4, r0)
            return r4
    }

    public static int w(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Lb
            int r1 = java.lang.Math.round(r1)
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot round NaN value."
            r1.<init>(r0)
            throw r1
    }

    public static java.util.Set z(java.lang.Object... r4) {
            int r0 = r4.length
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1d
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r4.length
            int r1 = a.C0048aa.C(r1)
            r0.<init>(r1)
            int r1 = r4.length
        L12:
            if (r2 >= r1) goto L1c
            r3 = r4[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto L12
        L1c:
            return r0
        L1d:
            r4 = r4[r2]
            java.util.Set r4 = java.util.Collections.singleton(r4)
            java.lang.String r0 = "singleton(...)"
            a.C0193i9.d(r4, r0)
            return r4
        L29:
            a.b6 r4 = a.C0063b6.f410a
            return r4
    }

    @Override // a.Lg
    public void b() {
            r0 = this;
            return
    }

    @Override // a.Lg
    public void c() {
            r0 = this;
            return
    }

    public void x(boolean r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public void y(boolean r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
