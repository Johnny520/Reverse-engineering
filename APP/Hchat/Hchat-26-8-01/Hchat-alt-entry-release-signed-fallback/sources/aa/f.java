package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    static {
            return
    }

    public static boolean a(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L30
        Ld:
            java.util.ArrayList r1 = e(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L18
            goto L30
        L18:
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = b(r0, r2, r3)
            if (r0 == 0) goto L1c
            r1 = 1
            return r1
        L30:
            r1 = 0
            return r1
    }

    public static boolean b(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            sf.e r1 = d(r1)
            if (r1 == 0) goto L18
            java.lang.Object r0 = r1.f12418g
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.f12419h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L18
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static boolean c(java.lang.String r4, java.lang.String r5) {
            r5.getClass()
            java.util.ArrayList r5 = e(r5)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto Lf
            goto L3c
        Lf:
            java.lang.String r0 = ":\n"
            r2 = 6
            r3 = 0
            int r0 = og.m.r0(r4, r0, r3, r3, r2)
            if (r0 <= 0) goto L1f
            int r0 = r0 + 2
            java.lang.String r4 = r4.substring(r0)
        L1f:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L26
            goto L3d
        L26:
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 == 0) goto L2a
        L3c:
            return r1
        L3d:
            return r3
    }

    public static sf.e d(java.lang.String r7) {
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x0080: FILL_ARRAY_DATA , data: [47, 35, 58, -230} // fill-array
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r0) goto L20
            char r5 = r1[r4]
            r6 = 6
            int r5 = og.m.q0(r7, r5, r3, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto Ld
        L20:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L29:
            boolean r2 = r1.hasNext()
            r4 = 1
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L3e
            goto L3f
        L3e:
            r4 = r3
        L3f:
            if (r4 == 0) goto L29
            r0.add(r2)
            goto L29
        L45:
            java.lang.Comparable r0 = tf.m.D1(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L7e
            int r0 = r0.intValue()
            java.lang.String r1 = r7.substring(r3, r0)
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            int r0 = r0 + r4
            java.lang.String r7 = r7.substring(r0)
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            int r0 = r1.length()
            if (r0 != 0) goto L71
            goto L7e
        L71:
            int r0 = r7.length()
            if (r0 != 0) goto L78
            goto L7e
        L78:
            sf.e r0 = new sf.e
            r0.<init>(r1, r7)
            return r0
        L7e:
            r7 = 0
            return r7
    }

    public static java.util.ArrayList e(java.lang.String r5) {
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r"
            java.lang.String r2 = "|"
            java.lang.String r3 = ","
            java.lang.String r4 = "，"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r5 = og.m.G0(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L1f
        L2f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L38
            r5.add(r1)
            goto L38
        L54:
            return r5
    }

    public static boolean f(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.util.ArrayList r1 = e(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            goto L23
        Lb:
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = g(r0, r2, r3)
            if (r0 == 0) goto Lf
            r1 = 1
            return r1
        L23:
            r1 = 0
            return r1
    }

    public static boolean g(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L3b
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L3b
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L13
            goto L3b
        L13:
            if (r1 != 0) goto L17
            java.lang.String r1 = ""
        L17:
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r0 = b(r1, r2, r3)
            if (r0 == 0) goto L26
            goto L39
        L26:
            sf.e r0 = d(r1)
            if (r0 == 0) goto L2d
            goto L3b
        L2d:
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L39
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L3b
        L39:
            r1 = 1
            return r1
        L3b:
            r1 = 0
            return r1
    }
}
