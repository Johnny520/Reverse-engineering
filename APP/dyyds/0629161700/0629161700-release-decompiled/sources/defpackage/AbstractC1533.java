package defpackage;

/* JADX INFO: renamed from: ᛸᛷᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1533 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1671 f6753 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.Object[] f6754 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1671 f6755 = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            defpackage.AbstractC1533.f6754 = r0
            ᲀᛵᛳᲁ r0 = new ᲀᛵᛳᲁ
            r1 = 2
            r0.<init>(r1)
            defpackage.AbstractC1533.f6755 = r0
            ᲀᛵᛳᲁ r0 = new ᲀᛵᛳᲁ
            r1 = 3
            r0.<init>(r1)
            defpackage.AbstractC1533.f6753 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static android.content.Intent m2773(androidx.appcompat.app.AppCompatActivity r2, android.content.ComponentName r3) {
            java.lang.String r0 = m2775(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = m2775(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            return r2
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final void m2774(java.util.logging.Logger r1, defpackage.AbstractC1714 r2, defpackage.C0658 r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.f3204
            r0.<init>(r3)
            r3 = 32
            r0.append(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r4 = "%-22s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r2 = r2.f7626
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.fine(r2)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.lang.String m2775(android.content.Context r2, android.content.ComponentName r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            r1 = 269222528(0x100c0280, float:2.7612058E-29)
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r3, r1)
            java.lang.String r0 = r3.parentActivityName
            if (r0 == 0) goto L10
            return r0
        L10:
            android.os.Bundle r3 = r3.metaData
            r0 = 0
            if (r3 != 0) goto L16
            return r0
        L16:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r3 = r3.getString(r1)
            if (r3 != 0) goto L1f
            return r0
        L1f:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.getPackageName()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
        L3c:
            return r3
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static defpackage.C0982 m2776(defpackage.C0024 r26) {
            r0 = r26
            int r1 = r0.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L1a:
            if (r6 >= r1) goto L1b9
            java.lang.String r2 = defpackage.AbstractC0729.m1649(r0, r6)
            r22 = 1
            java.lang.String r4 = defpackage.AbstractC0729.m1635(r0, r6)
            java.lang.String r5 = "Cache-Control"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L34
            if (r8 == 0) goto L32
        L30:
            r7 = 0
            goto L3d
        L32:
            r8 = r4
            goto L3d
        L34:
            java.lang.String r5 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L1ae
            goto L30
        L3d:
            r2 = 0
        L3e:
            int r5 = r4.length()
            if (r2 >= r5) goto L1ae
            int r5 = r4.length()
            r3 = r2
        L49:
            if (r3 >= r5) goto L61
            char r0 = r4.charAt(r3)
            r23 = r1
            java.lang.String r1 = "=,;"
            boolean r0 = defpackage.AbstractC1347.m2510(r1, r0)
            if (r0 == 0) goto L5a
            goto L67
        L5a:
            int r3 = r3 + 1
            r0 = r26
            r1 = r23
            goto L49
        L61:
            r23 = r1
            int r3 = r4.length()
        L67:
            java.lang.String r0 = r4.substring(r2, r3)
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r4.length()
            if (r3 == r1) goto Lf6
            char r1 = r4.charAt(r3)
            r2 = 44
            if (r1 == r2) goto Lf6
            char r1 = r4.charAt(r3)
            r2 = 59
            if (r1 != r2) goto L8b
            goto Lf6
        L8b:
            int r3 = r3 + 1
            byte[] r1 = defpackage.AbstractC0709.f3358
            int r1 = r4.length()
        L93:
            if (r3 >= r1) goto La5
            char r2 = r4.charAt(r3)
            r5 = 32
            if (r2 == r5) goto La2
            r5 = 9
            if (r2 == r5) goto La2
            goto La9
        La2:
            int r3 = r3 + 1
            goto L93
        La5:
            int r3 = r4.length()
        La9:
            int r1 = r4.length()
            if (r3 >= r1) goto Lc5
            char r1 = r4.charAt(r3)
            r2 = 34
            if (r1 != r2) goto Lc5
            int r3 = r3 + 1
            r1 = 4
            int r1 = defpackage.AbstractC1347.m2514(r4, r2, r3, r1)
            java.lang.String r2 = r4.substring(r3, r1)
            int r1 = r1 + 1
            goto Lfa
        Lc5:
            int r1 = r4.length()
            r2 = r3
        Lca:
            if (r2 >= r1) goto Le0
            char r5 = r4.charAt(r2)
            r24 = r1
            java.lang.String r1 = ",;"
            boolean r1 = defpackage.AbstractC1347.m2510(r1, r5)
            if (r1 == 0) goto Ldb
            goto Le4
        Ldb:
            int r2 = r2 + 1
            r1 = r24
            goto Lca
        Le0:
            int r2 = r4.length()
        Le4:
            java.lang.String r1 = r4.substring(r3, r2)
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r25 = r2
            r2 = r1
            r1 = r25
            goto Lfa
        Lf6:
            int r3 = r3 + 1
            r1 = r3
            r2 = 0
        Lfa:
            java.lang.String r3 = "no-cache"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L10b
            r0 = r26
            r2 = r1
            r9 = r22
        L107:
            r1 = r23
            goto L3e
        L10b:
            java.lang.String r3 = "no-store"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L119
            r0 = r26
            r2 = r1
            r10 = r22
            goto L107
        L119:
            java.lang.String r3 = "max-age"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L12a
            r3 = -1
            int r11 = defpackage.AbstractC0709.m1610(r3, r2)
        L126:
            r0 = r26
            r2 = r1
            goto L107
        L12a:
            r3 = -1
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L138
            int r12 = defpackage.AbstractC0709.m1610(r3, r2)
            goto L126
        L138:
            java.lang.String r3 = "private"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L146
            r0 = r26
            r2 = r1
            r13 = r22
            goto L107
        L146:
            java.lang.String r3 = "public"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L154
            r0 = r26
            r2 = r1
            r14 = r22
            goto L107
        L154:
            java.lang.String r3 = "must-revalidate"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L162
            r0 = r26
            r2 = r1
            r15 = r22
            goto L107
        L162:
            java.lang.String r3 = "max-stale"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L172
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r16 = defpackage.AbstractC0709.m1610(r0, r2)
            goto L126
        L172:
            java.lang.String r3 = "min-fresh"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L180
            r3 = -1
            int r17 = defpackage.AbstractC0709.m1610(r3, r2)
            goto L126
        L180:
            r3 = -1
            java.lang.String r2 = "only-if-cached"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L190
            r0 = r26
            r2 = r1
            r18 = r22
            goto L107
        L190:
            java.lang.String r2 = "no-transform"
            boolean r2 = r2.equalsIgnoreCase(r0)
            if (r2 == 0) goto L19f
            r0 = r26
            r2 = r1
            r19 = r22
            goto L107
        L19f:
            java.lang.String r2 = "immutable"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L126
            r0 = r26
            r2 = r1
            r20 = r22
            goto L107
        L1ae:
            r23 = r1
            r3 = -1
            int r6 = r6 + 1
            r0 = r26
            r1 = r23
            goto L1a
        L1b9:
            if (r7 != 0) goto L1be
            r21 = 0
            goto L1c0
        L1be:
            r21 = r8
        L1c0:
            ᛵᲇᛶᲁ r8 = new ᛵᲇᛶᲁ
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r8
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.lang.Class m2777(defpackage.C0355 r2) {
            ᲇᲇᛲᲈ r2 = (defpackage.InterfaceC2139) r2
            java.lang.Class r2 = r2.mo1084()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto Le
            goto L83
        Le:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L7b;
                case 104431: goto L6f;
                case 3039496: goto L63;
                case 3052374: goto L57;
                case 3327612: goto L4b;
                case 3625364: goto L3f;
                case 64711720: goto L33;
                case 97526364: goto L27;
                case 109413500: goto L1b;
                default: goto L19;
            }
        L19:
            goto L83
        L1b:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L83
        L24:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L27:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L83
        L30:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L33:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L83
        L3c:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L3f:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L83
        L48:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L4b:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L54
            goto L83
        L54:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L57:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L60
            goto L83
        L60:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L63:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            goto L83
        L6c:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L6f:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L78
            goto L83
        L78:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L7b:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L84
        L83:
            return r2
        L84:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0355 m2778(java.lang.annotation.Annotation r0) {
            java.lang.Class r0 = r0.annotationType()
            ᛲᲀᲈᛳ r0 = defpackage.AbstractC1168.m2249(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String m2779(long r18) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            java.lang.String r1 = " s "
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r4 = 500000000(0x1dcd6500, double:2.47032823E-315)
            if (r0 > 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = r18 - r4
            long r4 = r4 / r2
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Laa
        L23:
            r6 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            java.lang.String r6 = " ms"
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = 500000(0x7a120, double:2.47033E-318)
            if (r0 > 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 - r9
            long r1 = r1 / r7
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto Laa
        L45:
            r11 = 0
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            java.lang.String r11 = " µs"
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 500(0x1f4, double:2.47E-321)
            if (r0 > 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 - r14
            long r1 = r1 / r12
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            goto Laa
        L64:
            r16 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 + r14
            long r1 = r1 / r12
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            goto Laa
        L7e:
            r11 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r0 >= 0) goto L98
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 + r9
            long r1 = r1 / r7
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto Laa
        L98:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = r18 + r4
            long r4 = r4 / r2
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Laa:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "%6s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final void m2780(java.util.LinkedHashMap r7, android.view.View r8) {
            boolean r0 = r8 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r1 = r8.getChildCount()
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r1) goto L27
            android.view.View r4 = r8.getChildAt(r3)
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L24
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L24
            r0.add(r4)
        L24:
            int r3 = r3 + 1
            goto L11
        L27:
            int r1 = r0.size()
            r3 = 2
            if (r1 != r3) goto La7
            java.lang.Object r1 = r0.get(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 1
            java.lang.Object r0 = r0.get(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r3 = r1.getText()
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r4 = r0.getText()
            java.lang.String r4 = r4.toString()
            r5 = r2
        L4c:
            int r6 = r3.length()
            if (r5 >= r6) goto L60
            char r6 = r3.charAt(r5)
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 != 0) goto L5d
            goto L6c
        L5d:
            int r5 = r5 + 1
            goto L4c
        L60:
            boolean r5 = defpackage.AbstractC1347.m2524(r4)
            if (r5 != 0) goto L6c
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r1)
            goto L94
        L6c:
            r1 = r2
        L6d:
            int r5 = r4.length()
            if (r1 >= r5) goto L81
            char r5 = r4.charAt(r1)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L7e
            goto L8e
        L7e:
            int r1 = r1 + 1
            goto L6d
        L81:
            boolean r1 = defpackage.AbstractC1347.m2524(r3)
            if (r1 != 0) goto L8e
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r3, r0)
            r0 = r1
            goto L94
        L8e:
            kotlin.Pair r0 = new kotlin.Pair
            r1 = 0
            r0.<init>(r1, r1)
        L94:
            java.lang.Object r1 = r0.component1()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.component2()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r1 == 0) goto La7
            if (r0 == 0) goto La7
            r7.put(r1, r0)
        La7:
            int r0 = r8.getChildCount()
        Lab:
            if (r2 >= r0) goto Lbf
            android.view.View r1 = r8.getChildAt(r2)
            r3 = -494445509647918(0xfffe3e4def0961d2, double:NaN)
            m2780(r7, r1)
            int r2 = r2 + 1
            goto Lab
        Lbf:
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final void m2781(defpackage.InterfaceC0493 r4, java.lang.Throwable r5) {
            java.util.List r0 = defpackage.AbstractC2081.f8924
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            ᛲᛲᲀᛸ r1 = (defpackage.C0258) r1
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            if (r5 != r1) goto L1b
            r2 = r5
            goto L25
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Exception while trying to handle coroutine exception"
            r2.<init>(r3, r1)
            defpackage.AbstractC2193.m3595(r2, r5)
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r1.getUncaughtExceptionHandler()
            r3.uncaughtException(r1, r2)
            goto L6
        L31:
            ᲇᛴᲈᲇ r0 = new ᲇᛴᲈᲇ     // Catch: java.lang.Throwable -> L39
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L39
            defpackage.AbstractC2193.m3595(r5, r0)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.getUncaughtExceptionHandler()
            r0.uncaughtException(r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static void m2782(android.content.Context r6, java.lang.String r7) {
            r0 = -284211155476014(0xfffefd82ef0961d2, double:NaN)
            r0 = -284245515214382(0xfffefd7aef0961d2, double:NaN)
            r0 = -284262695083566(0xfffefd76ef0961d2, double:NaN)
            java.lang.String r0 = "com.bytedance.router.SmartRouter"     // Catch: java.lang.Exception -> La3
            r1 = 3
            r2 = 0
            java.lang.Class r0 = defpackage.AbstractC0350.m1058(r0, r2, r1)     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto L8e
            int r1 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Exception -> La3
            ᛶᲈᛱᲈ r0 = defpackage.AbstractC2279.m3695(r0)     // Catch: java.lang.Exception -> La3
            java.lang.Object r1 = r0.f5356     // Catch: java.lang.Exception -> La3
            ᛷᲇᛱᲈ r1 = (defpackage.C1380) r1     // Catch: java.lang.Exception -> La3
            r3 = 2
            r1.f6021 = r3     // Catch: java.lang.Exception -> La3
            ᛶᛶᛲᛱ r0 = r0.m2298()     // Catch: java.lang.Exception -> La3
            ᛳᛸᲈᲁ r1 = defpackage.EnumC0538.f2659     // Catch: java.lang.Exception -> La3
            ᛳᛸᲈᲁ r4 = defpackage.EnumC0538.f2658     // Catch: java.lang.Exception -> La3
            ᛳᛸᲈᲁ[] r1 = new defpackage.EnumC0538[]{r1, r4}     // Catch: java.lang.Exception -> La3
            r0.m2061(r1)     // Catch: java.lang.Exception -> La3
            r4 = -284404429004334(0xfffefd55ef0961d2, double:NaN)
            java.lang.String r1 = "buildRoute"     // Catch: java.lang.Exception -> La3
            r0.f4431 = r1     // Catch: java.lang.Exception -> La3
            r4 = -284451673644590(0xfffefd4aef0961d2, double:NaN)
            java.lang.String r1 = "android.content.Context"     // Catch: java.lang.Exception -> La3
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            ᛲᲀᲈᛳ r4 = defpackage.AbstractC1168.m2249(r4)     // Catch: java.lang.Exception -> La3
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4}     // Catch: java.lang.Exception -> La3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch: java.lang.Exception -> La3
            r0.m2288(r1)     // Catch: java.lang.Exception -> La3
            r3 = -284554752859694(0xfffefd32ef0961d2, double:NaN)
            java.lang.String r1 = "com.bytedance.router.SmartRoute"     // Catch: java.lang.Exception -> La3
            r0.f4872 = r1     // Catch: java.lang.Exception -> La3
            java.util.List r0 = r0.mo1885()     // Catch: java.lang.Exception -> La3
            java.lang.Object r0 = defpackage.AbstractC1107.m2124(r0)     // Catch: java.lang.Exception -> La3
            ᛱᲁᛲᲁ r0 = (defpackage.C0178) r0     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto L8e
            r1 = -284692191813166(0xfffefd12ef0961d2, double:NaN)
            java.lang.String r1 = "aweme://user/profile/"     // Catch: java.lang.Exception -> La3
            java.lang.String r7 = r1.concat(r7)     // Catch: java.lang.Exception -> La3
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Exception -> La3
            java.lang.Object r2 = r0.m716(r6)     // Catch: java.lang.Exception -> La3
        L8e:
            ᲀᛵᲈᛳ r6 = defpackage.C1682.f7493     // Catch: java.lang.Exception -> La3
            r0 = -284786681093678(0xfffefcfcef0961d2, double:NaN)
            java.lang.String r7 = "open"     // Catch: java.lang.Exception -> La3
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> La3
            r6.getClass()     // Catch: java.lang.Exception -> La3
            defpackage.AbstractC0343.m1011(r2, r7, r0)     // Catch: java.lang.Exception -> La3
            return
        La3:
            r6 = move-exception
            r0 = -284808155930158(0xfffefcf7ef0961d2, double:NaN)
            java.lang.String r7 = "打开路由失败"
            r0 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r0 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r0 = -284838220701230(0xfffefcf0ef0961d2, double:NaN)
            java.lang.String r0 = "打开失败: "
            r7.<init>(r0)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.AbstractC0209.m764(r6)
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static final java.lang.Object[] m2783(java.util.Collection r5, java.lang.Object[] r6) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Le
            int r5 = r6.length
            if (r5 <= 0) goto L1d
            r6[r2] = r1
            return r6
        Le:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L1e
            int r5 = r6.length
            if (r5 <= 0) goto L1d
            r6[r2] = r1
        L1d:
            return r6
        L1e:
            int r3 = r6.length
            if (r0 > r3) goto L23
            r0 = r6
            goto L31
        L23:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L31:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L5d
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L43
            return r0
        L43:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L57
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L51
            goto L57
        L51:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L57:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
        L5b:
            r2 = r3
            goto L31
        L5d:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L5b
            if (r0 != r6) goto L68
            r6[r3] = r1
            return r6
        L68:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.view.View m2784(android.view.ViewGroup r5, defpackage.InterfaceC0598 r6) {
            r0 = -492800537173550(0xfffe3fccef0961d2, double:NaN)
            r0 = -492830601944622(0xfffe3fc5ef0961d2, double:NaN)
            r0 = 0
            int r1 = r5.getChildCount()
            ᛱᛵᲇᲇ r0 = defpackage.AbstractC1754.m3143(r0, r1)
            int r1 = r0.f9424
            int r0 = r0.f9423
            if (r1 > r0) goto L4a
        L1f:
            android.view.View r2 = r5.getChildAt(r1)
            r3 = -492873551617582(0xfffe3fbbef0961d2, double:NaN)
            java.lang.Object r3 = r6.mo617(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L38
            return r2
        L38:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L45
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = m2784(r2, r6)
            if (r2 == 0) goto L45
            return r2
        L45:
            if (r1 == r0) goto L4a
            int r1 = r1 + 1
            goto L1f
        L4a:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.Class m2785(defpackage.C0355 r1) {
            java.lang.Class r1 = r1.mo1084()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = r1.getName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L78;
                case -527879800: goto L6c;
                case -515992664: goto L60;
                case 155276373: goto L54;
                case 344809556: goto L48;
                case 398507100: goto L3c;
                case 398795216: goto L30;
                case 399092968: goto L24;
                case 761287205: goto L18;
                default: goto L16;
            }
        L16:
            goto L80
        L18:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L21
            goto L80
        L21:
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L24:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L80
        L2d:
            java.lang.Class r1 = java.lang.Void.TYPE
            return r1
        L30:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L39
            goto L80
        L39:
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L3c:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L45
            goto L80
        L45:
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L48:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L51
            goto L80
        L51:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        L54:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5d
            goto L80
        L5d:
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        L60:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L80
        L69:
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L6c:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L75
            goto L80
        L75:
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        L78:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L82
        L80:
            r1 = 0
            return r1
        L82:
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final java.lang.Object[] m2786(java.util.Collection r4) {
            int r0 = r4.size()
            if (r0 != 0) goto L7
            goto L11
        L7:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L14
        L11:
            java.lang.Object[] r4 = defpackage.AbstractC1533.f6754
            return r4
        L14:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L17:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L43
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L29
            return r0
        L29:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L3d
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L37
            goto L3d
        L37:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L3d:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
        L41:
            r1 = r2
            goto L17
        L43:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L41
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static android.content.Intent m2787(androidx.appcompat.app.AppCompatActivity r3) {
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.content.ComponentName r0 = r3.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            java.lang.String r0 = m2775(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = m2775(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
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

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public abstract void mo1878(java.lang.Throwable r1);

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public abstract void mo1879(defpackage.C0302 r1);
}
