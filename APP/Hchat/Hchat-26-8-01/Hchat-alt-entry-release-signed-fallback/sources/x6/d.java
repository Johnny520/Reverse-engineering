package x6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements k2.d {
    public static final float A(android.text.Layout r4, int r5, android.graphics.Paint r6) {
            float r0 = r4.getLineLeft(r5)
            java.lang.ThreadLocal r1 = j2.l.f6712a
            int r1 = r4.getEllipsisCount(r5)
            r2 = 0
            if (r1 <= 0) goto L59
            int r1 = r4.getParagraphDirection(r5)
            r3 = 1
            if (r1 != r3) goto L59
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L59
            int r1 = r4.getLineStart(r5)
            int r2 = r4.getEllipsisStart(r5)
            int r2 = r2 + r1
            float r1 = r4.getPrimaryHorizontal(r2)
            float r1 = r1 - r0
            java.lang.String r2 = "…"
            float r6 = r6.measureText(r2)
            float r6 = r6 + r1
            android.text.Layout$Alignment r5 = r4.getParagraphAlignment(r5)
            if (r5 != 0) goto L35
            r5 = -1
            goto L3d
        L35:
            int[] r1 = l2.d.f7756a
            int r5 = r5.ordinal()
            r5 = r1[r5]
        L3d:
            if (r5 != r3) goto L4e
            float r5 = java.lang.Math.abs(r0)
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
        L4c:
            float r4 = r4 + r5
            return r4
        L4e:
            float r5 = java.lang.Math.abs(r0)
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r6
            goto L4c
        L59:
            return r2
    }

    public static final float B(android.text.Layout r3, int r4, android.graphics.Paint r5) {
            java.lang.ThreadLocal r0 = j2.l.f6712a
            int r0 = r3.getEllipsisCount(r4)
            if (r0 <= 0) goto L6d
            int r0 = r3.getParagraphDirection(r4)
            r1 = -1
            if (r0 != r1) goto L6d
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r2 = r3.getLineRight(r4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6d
            int r0 = r3.getLineStart(r4)
            int r2 = r3.getEllipsisStart(r4)
            int r2 = r2 + r0
            float r0 = r3.getPrimaryHorizontal(r2)
            float r2 = r3.getLineRight(r4)
            float r2 = r2 - r0
            java.lang.String r0 = "…"
            float r5 = r5.measureText(r0)
            float r5 = r5 + r2
            android.text.Layout$Alignment r0 = r3.getParagraphAlignment(r4)
            if (r0 != 0) goto L3c
            goto L44
        L3c:
            int[] r1 = l2.d.f7756a
            int r0 = r0.ordinal()
            r1 = r1[r0]
        L44:
            r0 = 1
            if (r1 != r0) goto L5c
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r3.getLineRight(r4)
            float r0 = r0 - r4
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
        L5a:
            float r0 = r0 - r3
            return r0
        L5c:
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r3.getLineRight(r4)
            float r0 = r0 - r4
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 - r5
            goto L5a
        L6d:
            r3 = 0
            return r3
    }

    public static final long C(androidx.lifecycle.x r6) {
            java.lang.Object r6 = r6.f310h
            android.view.DragEvent r6 = (android.view.DragEvent) r6
            float r0 = r6.getX()
            float r6 = r6.getY()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r6
            r6 = 32
            long r0 = r0 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public static final long D(int r2) {
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            float r2 = (float) r2
            long r0 = R(r0, r2)
            return r0
    }

    public static java.lang.String E(java.lang.String r1, java.lang.String r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static boolean F(java.lang.Class r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L32
        L7:
            if (r2 == 0) goto L32
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r2 == r0) goto L32
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r2)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L32
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L15
            r2 = 1
            return r2
        L2d:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L32
            goto L7
        L32:
            r2 = 0
            return r2
    }

    public static void H(android.view.View r1, androidx.lifecycle.q r2, u3.c r3, c9.a1 r4, c9.a1 r5) {
            r1.getClass()
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            r1.setTag(r0, r2)
            r2 = 2131099776(0x7f060080, float:1.7811915E38)
            r1.setTag(r2, r3)
            r2 = 2131099777(0x7f060081, float:1.7811917E38)
            r1.setTag(r2, r4)
            r2 = 2131099774(0x7f06007e, float:1.781191E38)
            r1.setTag(r2, r5)
            return
    }

    public static boolean I(w4.d r4, w4.d r5) {
            w4.c r4 = r4.getType()
            w4.c r5 = r5.getType()
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L10
            goto L75
        L10:
            int r0 = r4.f14879h
            int r1 = r5.f14879h
            r2 = 10
            r3 = 9
            if (r0 != r2) goto L1d
            w4.c r4 = w4.c.E
            r0 = r3
        L1d:
            if (r1 != r2) goto L22
            w4.c r5 = w4.c.E
            r1 = r3
        L22:
            if (r0 != r3) goto L69
            if (r1 == r3) goto L27
            goto L69
        L27:
            w4.c r0 = w4.c.f14875x
            if (r4 != r0) goto L2c
            goto L77
        L2c:
            if (r5 != r0) goto L2f
            goto L75
        L2f:
            w4.c r0 = w4.c.E
            if (r4 != r0) goto L34
            goto L75
        L34:
            boolean r0 = r4.p()
            if (r0 == 0) goto L5a
            boolean r0 = r5.p()
            if (r0 != 0) goto L41
            goto L77
        L41:
            w4.c r4 = r4.k()
            w4.c r5 = r5.k()
            boolean r0 = r4.p()
            if (r0 == 0) goto L55
            boolean r0 = r5.p()
            if (r0 != 0) goto L41
        L55:
            boolean r4 = I(r4, r5)
            return r4
        L5a:
            boolean r5 = r5.p()
            if (r5 == 0) goto L75
            w4.c r5 = w4.c.F
            if (r4 == r5) goto L75
            w4.c r5 = w4.c.A
            if (r4 != r5) goto L77
            goto L75
        L69:
            boolean r4 = r4.s()
            if (r4 == 0) goto L77
            boolean r4 = r5.s()
            if (r4 == 0) goto L77
        L75:
            r4 = 1
            return r4
        L77:
            r4 = 0
            return r4
    }

    public static java.util.List J(java.lang.String r5) {
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            r2 = 0
            java.lang.String r5 = og.t.a0(r5, r0, r1, r2)
            r0 = 13
            r1 = 10
            java.lang.String r5 = r5.replace(r0, r1)
            r5.getClass()
            int r0 = r5.length()
            if (r0 != 0) goto L1d
            tf.t r5 = tf.t.f13167g
            return r5
        L1d:
            boolean r0 = og.m.l0(r5, r1)
            r3 = 1
            r4 = 6
            if (r0 == 0) goto L32
            java.lang.String r5 = og.m.k0(r3, r5)
            char[] r0 = new char[r3]
            r0[r2] = r1
            java.util.List r5 = og.m.F0(r5, r0, r4)
            return r5
        L32:
            char[] r0 = new char[r3]
            r0[r2] = r1
            java.util.List r5 = og.m.F0(r5, r0, r4)
            return r5
    }

    public static final java.util.List K(android.content.Context r13) {
            r13.getClass()
            java.lang.String r0 = "Hchat_group_chat_labels"
            android.content.SharedPreferences r13 = ub.b.c(r13, r0)
            java.lang.String r0 = "labels"
            java.lang.String r1 = ""
            java.lang.String r13 = r13.getString(r0, r1)
            if (r13 != 0) goto L14
            goto L15
        L14:
            r1 = r13
        L15:
            boolean r13 = og.m.t0(r1)
            tf.t r0 = tf.t.f13167g
            if (r13 == 0) goto L1e
            return r0
        L1e:
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L35
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L35
            uf.c r1 = a.a.E()     // Catch: java.lang.Throwable -> L35
            int r2 = r13.length()     // Catch: java.lang.Throwable -> L35
            r3 = 0
            r4 = r3
        L2d:
            if (r4 < r2) goto L38
            uf.c r13 = a.a.t(r1)     // Catch: java.lang.Throwable -> L35
            goto Lb9
        L35:
            r13 = move-exception
            goto Lb3
        L38:
            org.json.JSONObject r5 = r13.optJSONObject(r4)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto Laf
            java.lang.String r6 = "id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L35
            r6.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "name"
            java.lang.String r7 = r5.optString(r7)     // Catch: java.lang.Throwable -> L35
            r7.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L35
            boolean r8 = og.m.t0(r6)     // Catch: java.lang.Throwable -> L35
            if (r8 != 0) goto Laf
            boolean r8 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L6d
            goto Laf
        L6d:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L35
            r8.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = "groups"
            org.json.JSONArray r5 = r5.optJSONArray(r9)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L7b
            goto L80
        L7b:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L35
            r5.<init>()     // Catch: java.lang.Throwable -> L35
        L80:
            int r9 = r5.length()     // Catch: java.lang.Throwable -> L35
            r10 = r3
        L85:
            if (r10 < r9) goto L90
            n9.a r5 = new n9.a     // Catch: java.lang.Throwable -> L35
            r5.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            r1.add(r5)     // Catch: java.lang.Throwable -> L35
            goto Laf
        L90:
            java.lang.String r11 = r5.optString(r10)     // Catch: java.lang.Throwable -> L35
            r11.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.CharSequence r11 = og.m.R0(r11)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L35
            boolean r12 = og.m.t0(r11)     // Catch: java.lang.Throwable -> L35
            if (r12 != 0) goto La6
            goto La7
        La6:
            r11 = 0
        La7:
            if (r11 == 0) goto Lac
            r8.add(r11)     // Catch: java.lang.Throwable -> L35
        Lac:
            int r10 = r10 + 1
            goto L85
        Laf:
            int r4 = r4 + 1
            goto L2d
        Lb3:
            sf.f r1 = new sf.f
            r1.<init>(r13)
            r13 = r1
        Lb9:
            boolean r1 = r13 instanceof sf.f
            if (r1 == 0) goto Lbf
            goto Lc0
        Lbf:
            r0 = r13
        Lc0:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static int[] L(int r0) {
            int r0 = r0 + 31
            int r0 = r0 >> 5
            int[] r0 = new int[r0]
            return r0
    }

    public static i4.u M(i4.u r9, i4.u r10) {
            w4.d[] r0 = r9.f6488h
            if (r9 != r10) goto L5
            goto L3d
        L5:
            int r1 = r0.length
            w4.d[] r2 = r10.f6488h
            int r2 = r2.length
            r3 = 0
            if (r2 != r1) goto L41
            r2 = 0
            r4 = r2
            r5 = r3
        Lf:
            if (r4 >= r1) goto L3b
            r6 = r0[r4]
            w4.d[] r7 = r10.f6488h
            r7 = r7[r4]
            w4.d r7 = O(r6, r7)
            if (r7 == r6) goto L38
            if (r5 != 0) goto L2b
            i4.u r5 = new i4.u
            int r6 = r0.length
            r5.<init>(r6)
            w4.d[] r6 = r5.f6488h
            int r8 = r0.length
            java.lang.System.arraycopy(r0, r2, r6, r2, r8)
        L2b:
            if (r7 != 0) goto L35
            r5.j()
            w4.d[] r6 = r5.f6488h
            r6[r4] = r3
            goto L38
        L35:
            r5.s(r4, r7)
        L38:
            int r4 = r4 + 1
            goto Lf
        L3b:
            if (r5 != 0) goto L3e
        L3d:
            return r9
        L3e:
            r5.f22555g = r2
            return r5
        L41:
            i4.b0 r9 = new i4.b0
            java.lang.String r10 = "mismatched maxLocals values"
            r9.<init>(r10, r3)
            throw r9
    }

    public static i4.n N(i4.n r8, i4.n r9) {
            if (r8 != r9) goto L3
            return r8
        L3:
            int r0 = r8.f6473i
            int r1 = r9.f6473i
            r2 = 0
            if (r1 != r0) goto L6e
            r1 = 0
            r3 = r1
            r4 = r2
        Ld:
            if (r3 >= r0) goto L68
            w4.d r5 = r8.o(r3)
            w4.d r6 = r9.o(r3)
            w4.d r7 = O(r5, r6)
            if (r7 == r5) goto L65
            if (r4 != 0) goto L23
            i4.n r4 = r8.n()
        L23:
            if (r7 == 0) goto L2b
            r4.m(r3, r7)     // Catch: i4.b0 -> L29
            goto L65
        L29:
            r8 = move-exception
            goto L4a
        L2b:
            i4.b0 r8 = new i4.b0     // Catch: i4.b0 -> L29
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: i4.b0 -> L29
            r9.<init>()     // Catch: i4.b0 -> L29
            java.lang.String r0 = "incompatible: "
            r9.append(r0)     // Catch: i4.b0 -> L29
            r9.append(r5)     // Catch: i4.b0 -> L29
            java.lang.String r0 = ", "
            r9.append(r0)     // Catch: i4.b0 -> L29
            r9.append(r6)     // Catch: i4.b0 -> L29
            java.lang.String r9 = r9.toString()     // Catch: i4.b0 -> L29
            r8.<init>(r9, r2)     // Catch: i4.b0 -> L29
            throw r8     // Catch: i4.b0 -> L29
        L4a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "...while merging stack["
            r9.<init>(r0)
            java.lang.String r0 = a.a.X0(r3)
            r9.append(r0)
            java.lang.String r0 = "]"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.a(r9)
            throw r8
        L65:
            int r3 = r3 + 1
            goto Ld
        L68:
            if (r4 != 0) goto L6b
            return r8
        L6b:
            r4.f22555g = r1
            return r4
        L6e:
            i4.b0 r8 = new i4.b0
            java.lang.String r9 = "mismatched stack depths"
            r8.<init>(r9, r2)
            throw r8
    }

    public static w4.d O(w4.d r2, w4.d r3) {
            if (r2 == 0) goto L63
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L9
            goto L63
        L9:
            r0 = 0
            if (r3 != 0) goto Ld
            return r0
        Ld:
            w4.c r2 = r2.getType()
            w4.c r3 = r3.getType()
            if (r2 != r3) goto L18
            return r2
        L18:
            boolean r1 = r2.t()
            if (r1 == 0) goto L53
            boolean r1 = r3.t()
            if (r1 == 0) goto L53
            w4.c r0 = w4.c.f14875x
            if (r2 != r0) goto L29
            return r3
        L29:
            if (r3 != r0) goto L2c
            return r2
        L2c:
            boolean r0 = r2.p()
            if (r0 == 0) goto L50
            boolean r0 = r3.p()
            if (r0 == 0) goto L50
            w4.c r2 = r2.k()
            w4.c r3 = r3.k()
            w4.d r2 = O(r2, r3)
            if (r2 != 0) goto L49
            w4.c r2 = w4.c.E
            return r2
        L49:
            w4.c r2 = (w4.c) r2
            w4.c r2 = r2.e()
            return r2
        L50:
            w4.c r2 = w4.c.E
            return r2
        L53:
            boolean r2 = r2.s()
            if (r2 == 0) goto L62
            boolean r2 = r3.s()
            if (r2 == 0) goto L62
            w4.c r2 = w4.c.f14871t
            return r2
        L62:
            return r0
        L63:
            return r2
    }

    public static java.lang.String Q(java.lang.String r3) {
            int r0 = r3.hashCode()
            r1 = 3029889(0x2e3b81, float:4.245779E-39)
            java.lang.String r2 = "text"
            if (r0 == r1) goto L26
            r1 = 3046160(0x2e7b10, float:4.26858E-39)
            if (r0 == r1) goto L1d
            r1 = 3556653(0x36452d, float:4.983932E-39)
            if (r0 == r1) goto L16
            goto L2e
        L16:
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L2f
            goto L2e
        L1d:
            java.lang.String r0 = "card"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
            goto L2e
        L26:
            java.lang.String r0 = "both"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
        L2e:
            return r2
        L2f:
            return r3
    }

    public static final long R(long r4, float r6) {
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r4 | r0
            u2.p[] r6 = u2.o.f13358b
            return r4
    }

    public static java.util.List S(java.lang.String r9) {
            boolean r0 = og.m.t0(r9)
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L9
            return r1
        L9:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L1e
            uf.c r9 = a.a.E()     // Catch: java.lang.Throwable -> L1e
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
        L17:
            if (r3 < r2) goto L20
            uf.c r9 = a.a.t(r9)     // Catch: java.lang.Throwable -> L1e
            goto L76
        L1e:
            r9 = move-exception
            goto L70
        L20:
            org.json.JSONObject r4 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L6d
            java.lang.String r5 = "groupId"
            java.lang.String r5 = r4.optString(r5)     // Catch: java.lang.Throwable -> L1e
            r5.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = "templateId"
            java.lang.String r6 = r4.optString(r6)     // Catch: java.lang.Throwable -> L1e
            r6.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1e
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L1e
            if (r7 <= 0) goto L6d
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L1e
            if (r7 <= 0) goto L6d
            q9.h r7 = new q9.h     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = "label"
            java.lang.String r4 = r4.optString(r8)     // Catch: java.lang.Throwable -> L1e
            r4.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1e
            r7.<init>(r5, r4, r6)     // Catch: java.lang.Throwable -> L1e
            r9.add(r7)     // Catch: java.lang.Throwable -> L1e
        L6d:
            int r3 = r3 + 1
            goto L17
        L70:
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        L76:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L7c
            goto L7d
        L7c:
            r1 = r9
        L7d:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static java.util.Set T(java.lang.String r6) {
            boolean r0 = og.m.t0(r6)
            tf.v r1 = tf.v.f13169g
            if (r0 == 0) goto L9
            return r1
        L9:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L1f
            uf.i r6 = new uf.i     // Catch: java.lang.Throwable -> L1f
            r6.<init>()     // Catch: java.lang.Throwable -> L1f
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L1f
            r3 = 0
        L18:
            if (r3 < r2) goto L21
            uf.i r6 = ac.p.h(r6)     // Catch: java.lang.Throwable -> L1f
            goto L42
        L1f:
            r6 = move-exception
            goto L3c
        L21:
            java.lang.String r4 = r0.optString(r3)     // Catch: java.lang.Throwable -> L1f
            r4.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1f
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L1f
            if (r5 <= 0) goto L39
            r6.add(r4)     // Catch: java.lang.Throwable -> L1f
        L39:
            int r3 = r3 + 1
            goto L18
        L3c:
            sf.f r0 = new sf.f
            r0.<init>(r6)
            r6 = r0
        L42:
            boolean r0 = r6 instanceof sf.f
            if (r0 == 0) goto L48
            goto L49
        L48:
            r1 = r6
        L49:
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    public static java.util.List U(java.lang.String r19) {
            java.lang.String r0 = "text_first"
            java.lang.String r1 = "text"
            boolean r2 = og.m.t0(r19)
            tf.t r3 = tf.t.f13167g
            if (r2 == 0) goto Ld
            return r3
        Ld:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L26
            r4 = r19
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L26
            uf.c r4 = a.a.E()     // Catch: java.lang.Throwable -> L26
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L26
            r6 = 0
            r7 = r6
        L1e:
            if (r7 < r5) goto L29
            uf.c r0 = a.a.t(r4)     // Catch: java.lang.Throwable -> L26
            goto Le4
        L26:
            r0 = move-exception
            goto Lde
        L29:
            org.json.JSONObject r8 = r2.optJSONObject(r7)     // Catch: java.lang.Throwable -> L26
            if (r8 == 0) goto Ld5
            java.lang.String r9 = "id"
            java.lang.String r9 = r8.optString(r9)     // Catch: java.lang.Throwable -> L26
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L26
            if (r10 == 0) goto L58
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r11.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r12 = "rename_"
            r11.append(r12)     // Catch: java.lang.Throwable -> L26
            r11.append(r9)     // Catch: java.lang.Throwable -> L26
            java.lang.String r9 = "_"
            r11.append(r9)     // Catch: java.lang.Throwable -> L26
            r11.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L26
        L58:
            java.lang.String r10 = "name"
            java.lang.String r10 = r8.optString(r10)     // Catch: java.lang.Throwable -> L26
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 == 0) goto L77
            int r10 = r7 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r11.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r12 = "模板 "
            r11.append(r12)     // Catch: java.lang.Throwable -> L26
            r11.append(r10)     // Catch: java.lang.Throwable -> L26
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L26
        L77:
            java.lang.String r11 = "enabled"
            r12 = 1
            boolean r11 = r8.optBoolean(r11, r12)     // Catch: java.lang.Throwable -> L26
            java.lang.String r12 = "delaySeconds"
            int r12 = r8.optInt(r12, r6)     // Catch: java.lang.Throwable -> L26
            r13 = 600(0x258, float:8.41E-43)
            int r12 = r9.e0.r(r12, r6, r13)     // Catch: java.lang.Throwable -> L26
            java.lang.String r13 = "promptType"
            java.lang.String r13 = r8.optString(r13, r1)     // Catch: java.lang.Throwable -> L26
            r13.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r13 = Q(r13)     // Catch: java.lang.Throwable -> L26
            java.lang.String r14 = "bothOrder"
            java.lang.String r14 = r8.optString(r14, r0)     // Catch: java.lang.Throwable -> L26
            r14.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r15 = "card_first"
            boolean r14 = r14.equals(r15)     // Catch: java.lang.Throwable -> L26
            if (r14 == 0) goto Laa
            r14 = r15
            goto Lab
        Laa:
            r14 = r0
        Lab:
            java.lang.String r15 = "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”"
            java.lang.String r15 = r8.optString(r1, r15)     // Catch: java.lang.Throwable -> L26
            r15.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "cardTitle"
            r18 = r0
            java.lang.String r0 = "%userName% 修改了群内昵称"
            java.lang.String r16 = r8.optString(r6, r0)     // Catch: java.lang.Throwable -> L26
            r16.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "cardDesc"
            java.lang.String r6 = "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%"
            java.lang.String r17 = r8.optString(r0, r6)     // Catch: java.lang.Throwable -> L26
            r17.getClass()     // Catch: java.lang.Throwable -> L26
            q9.g r8 = new q9.g     // Catch: java.lang.Throwable -> L26
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L26
            r4.add(r8)     // Catch: java.lang.Throwable -> L26
            goto Ld7
        Ld5:
            r18 = r0
        Ld7:
            int r7 = r7 + 1
            r0 = r18
            r6 = 0
            goto L1e
        Lde:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Le4:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto Lea
            goto Leb
        Lea:
            r3 = r0
        Leb:
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    public static java.lang.String W(int r1, int r2) {
            if (r2 != 0) goto Le
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L7
            r1 = 0
        L7:
            java.lang.String r2 = ",0"
            java.lang.String r1 = p.a.i(r1, r2)
            return r1
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.Long X(java.lang.Object r3, java.lang.String r4) {
            java.lang.String r0 = "\""
            java.lang.String r1 = a0(r3, r4)     // Catch: java.lang.Throwable -> L1d
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1d
            java.lang.String r2 = "^\\d+$"
            boolean r2 = r1.matches(r2)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)     // Catch: java.lang.Throwable -> L52
            r1.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "\"\\s*:\\s*(\"?)(\\d+)\\1"
            r1.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L52
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L52
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch: java.lang.Throwable -> L52
            boolean r4 = r3.find()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L52
            r4 = 2
            java.lang.String r3 = r3.group(r4)     // Catch: java.lang.Throwable -> L52
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            return r3
        L52:
            r3 = 0
            return r3
    }

    public static int Y(java.lang.Object r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = f0(r0, r1, r2, r3)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lb
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public static int Z(java.lang.Object r4, java.lang.String r5, int r6) {
            if (r4 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9
            goto L41
        L9:
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "optInt"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1}     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r4, r1)     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L32
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L32
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L32
            return r4
        L32:
            java.lang.String r4 = a0(r4, r5)     // Catch: java.lang.Throwable -> L41
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L41
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            return r6
    }

    public static final void a(fg.a r16, y2.u r17, s0.d r18, i0.h0 r19, int r20) {
            r1 = r16
            r2 = r17
            r7 = r19
            r0 = 826668973(0x3145f7ad, float:2.880806E-9)
            r7.b0(r0)
            boolean r0 = r7.h(r1)
            r3 = 2
            r8 = 4
            if (r0 == 0) goto L16
            r0 = r8
            goto L17
        L16:
            r0 = r3
        L17:
            r0 = r20 | r0
            boolean r4 = r7.f(r2)
            if (r4 == 0) goto L22
            r4 = 32
            goto L24
        L22:
            r4 = 16
        L24:
            r10 = r0 | r4
            r0 = r10 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r11 = 1
            r12 = 0
            if (r0 == r4) goto L30
            r0 = r11
            goto L31
        L30:
            r0 = r12
        L31:
            r4 = r10 & 1
            boolean r0 = r7.S(r4, r0)
            if (r0 == 0) goto L106
            i0.m2 r0 = y1.i0.f21970f
            java.lang.Object r0 = r7.j(r0)
            android.view.View r0 = (android.view.View) r0
            i0.m2 r4 = y1.h1.f21946h
            java.lang.Object r4 = r7.j(r4)
            r5 = r4
            u2.c r5 = (u2.c) r5
            i0.m2 r4 = y1.h1.f21952n
            java.lang.Object r4 = r7.j(r4)
            u2.m r4 = (u2.m) r4
            i0.f0 r13 = i0.r.x(r7)
            i0.a1 r14 = i0.r.y(r18, r19)
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Object r15 = r7.P()
            i0.e r12 = i0.l.f5952a
            if (r15 != r12) goto L69
            y2.d r15 = y2.d.f22207h
            r7.k0(r15)
        L69:
            fg.a r15 = (fg.a) r15
            r9 = 48
            java.lang.Object r6 = v0.k.c(r6, r15, r7, r9)
            java.util.UUID r6 = (java.util.UUID) r6
            boolean r9 = r7.f(r0)
            boolean r15 = r7.f(r5)
            r9 = r9 | r15
            boolean r3 = r7.d(r3)
            r3 = r3 | r9
            r9 = 0
            boolean r9 = r7.f(r9)
            r3 = r3 | r9
            java.lang.Object r9 = r7.P()
            if (r3 != 0) goto L8f
            if (r9 != r12) goto Lb6
        L8f:
            r3 = r0
            y2.v r0 = new y2.v
            r0.<init>(r1, r2, r3, r4, r5, r6)
            a1.h r3 = new a1.h
            r5 = 5
            r3.<init>(r14, r5)
            s0.d r5 = new s0.d
            r6 = -1338939603(0xffffffffb031672d, float:-6.4538846E-10)
            r5.<init>(r6, r3, r11)
            y2.t r3 = r0.f22267m
            r3.setParentCompositionContext(r13)
            i0.j1 r6 = r3.f22253q
            r6.setValue(r5)
            r3.f22257u = r11
            r3.e()
            r7.k0(r0)
            r9 = r0
        Lb6:
            y2.v r9 = (y2.v) r9
            boolean r0 = r7.h(r9)
            java.lang.Object r3 = r7.P()
            if (r0 != 0) goto Lc4
            if (r3 != r12) goto Lcd
        Lc4:
            y2.a r3 = new y2.a
            r0 = 0
            r3.<init>(r9, r0)
            r7.k0(r3)
        Lcd:
            fg.l r3 = (fg.l) r3
            i0.r.c(r9, r3, r7)
            boolean r0 = r7.h(r9)
            r3 = r10 & 14
            if (r3 != r8) goto Ldc
            r3 = r11
            goto Ldd
        Ldc:
            r3 = 0
        Ldd:
            r0 = r0 | r3
            r3 = r10 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r3 != r5) goto Le5
            goto Le6
        Le5:
            r11 = 0
        Le6:
            r0 = r0 | r11
            int r3 = r4.ordinal()
            boolean r3 = r7.d(r3)
            r0 = r0 | r3
            java.lang.Object r3 = r7.P()
            if (r0 != 0) goto Lf8
            if (r3 != r12) goto L100
        Lf8:
            y2.b r3 = new y2.b
            r3.<init>(r9, r1, r2, r4)
            r7.k0(r3)
        L100:
            fg.a r3 = (fg.a) r3
            i0.r.j(r3, r7)
            goto L109
        L106:
            r7.V()
        L109:
            i0.r1 r6 = r7.t()
            if (r6 == 0) goto L11b
            y1.g1 r0 = new y1.g1
            r5 = 2
            r3 = r18
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L11b:
            return
    }

    public static java.lang.String a0(java.lang.Object r3, java.lang.String r4) {
            if (r3 == 0) goto L28
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L9
            goto L28
        L9:
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "getString"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L28
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r0, r3, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L28
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r3 = 0
            return r3
    }

    public static long b0(java.lang.Object r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = f0(r0, r1, r2, r3)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lb
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            long r0 = r0.longValue()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public static java.lang.String c0(java.lang.Object r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L9
            r2 = r1
            goto Ld
        L9:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r3)
        Ld:
            if (r2 != 0) goto L10
            return r1
        L10:
            java.lang.String r3 = "d"
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L19
            goto L1d
        L19:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r2, r3)     // Catch: java.lang.Throwable -> L24
        L1d:
            if (r1 == 0) goto L24
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L24
            return r2
        L24:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
    }

    public static final void d(s3.e r11, boolean r12, fg.a r13, fg.a r14, i0.h0 r15, int r16, int r17) {
            r7 = r15
            r9 = r16
            r0 = 1220469155(0x48bee1a3, float:390925.1)
            r15.b0(r0)
            r0 = r9 & 6
            if (r0 != 0) goto L18
            boolean r1 = r15.f(r11)
            if (r1 == 0) goto L15
            r1 = 4
            goto L16
        L15:
            r1 = 2
        L16:
            r1 = r1 | r9
            goto L19
        L18:
            r1 = r9
        L19:
            r2 = r9 & 48
            if (r2 != 0) goto L29
            boolean r3 = r15.g(r12)
            if (r3 == 0) goto L26
            r3 = 32
            goto L28
        L26:
            r3 = 16
        L28:
            r1 = r1 | r3
        L29:
            r3 = r17 & 4
            if (r3 == 0) goto L30
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L40
        L30:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L40
            boolean r5 = r15.h(r13)
            if (r5 == 0) goto L3d
            r5 = 256(0x100, float:3.59E-43)
            goto L3f
        L3d:
            r5 = 128(0x80, float:1.8E-43)
        L3f:
            r1 = r1 | r5
        L40:
            r5 = r9 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L50
            boolean r5 = r15.h(r14)
            if (r5 == 0) goto L4d
            r5 = 2048(0x800, float:2.87E-42)
            goto L4f
        L4d:
            r5 = 1024(0x400, float:1.435E-42)
        L4f:
            r1 = r1 | r5
        L50:
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r5 == r8) goto L58
            r5 = 1
            goto L59
        L58:
            r5 = 0
        L59:
            r8 = r1 & 1
            boolean r5 = r15.S(r8, r5)
            if (r5 == 0) goto Lba
            i0.e r5 = i0.l.f5952a
            if (r3 == 0) goto L77
            java.lang.Object r3 = r15.P()
            if (r3 != r5) goto L74
            k.s1 r3 = new k.s1
            r4 = 7
            r3.<init>(r4)
            r15.k0(r3)
        L74:
            fg.a r3 = (fg.a) r3
            goto L78
        L77:
            r3 = r13
        L78:
            java.lang.Object r4 = r15.P()
            if (r4 != r5) goto L87
            k.s1 r4 = new k.s1
            r8 = 7
            r4.<init>(r8)
            r15.k0(r4)
        L87:
            fg.a r4 = (fg.a) r4
            java.lang.Object r8 = r15.P()
            if (r8 != r5) goto L98
            k.s1 r8 = new k.s1
            r5 = 7
            r8.<init>(r5)
            r15.k0(r8)
        L98:
            fg.a r8 = (fg.a) r8
            r5 = r1 & 14
            r5 = r5 | 3504(0xdb0, float:4.91E-42)
            int r1 = r1 << 9
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r1
            r5 = r5 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r1
            r5 = r5 | r10
            r10 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r10
            r1 = r1 | r5
            r5 = r3
            r3 = r8
            r8 = r1
            r1 = 0
            r0 = r11
            r6 = r14
            r2 = r4
            r4 = r12
            e(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r3 = r5
            goto Lbe
        Lba:
            r15.V()
            r3 = r13
        Lbe:
            i0.r1 r7 = r15.t()
            if (r7 == 0) goto Ld1
            s3.c r0 = new s3.c
            r1 = r11
            r2 = r12
            r4 = r14
            r6 = r17
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        Ld1:
            return
    }

    public static java.lang.String d0(java.lang.Object r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = f0(r0, r1, r2, r3)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            return r0
    }

    public static final void e(s3.e r18, boolean r19, fg.a r20, fg.a r21, boolean r22, fg.a r23, fg.a r24, i0.h0 r25, int r26) {
            r1 = r18
            r9 = r25
            r8 = r26
            r0 = 898330592(0x358b6fe0, float:1.0388867E-6)
            r9.b0(r0)
            r0 = r8 & 6
            r10 = 4
            if (r0 != 0) goto L1c
            boolean r0 = r9.f(r1)
            if (r0 == 0) goto L19
            r0 = r10
            goto L1a
        L19:
            r0 = 2
        L1a:
            r0 = r0 | r8
            goto L1d
        L1c:
            r0 = r8
        L1d:
            r2 = r8 & 48
            r3 = 32
            if (r2 != 0) goto L31
            r2 = r19
            boolean r4 = r9.g(r2)
            if (r4 == 0) goto L2d
            r4 = r3
            goto L2f
        L2d:
            r4 = 16
        L2f:
            r0 = r0 | r4
            goto L33
        L31:
            r2 = r19
        L33:
            r4 = r8 & 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L47
            r4 = r20
            boolean r6 = r9.h(r4)
            if (r6 == 0) goto L43
            r6 = r5
            goto L45
        L43:
            r6 = 128(0x80, float:1.8E-43)
        L45:
            r0 = r0 | r6
            goto L49
        L47:
            r4 = r20
        L49:
            r6 = r8 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L5c
            r6 = r21
            boolean r11 = r9.h(r6)
            if (r11 == 0) goto L58
            r11 = 2048(0x800, float:2.87E-42)
            goto L5a
        L58:
            r11 = 1024(0x400, float:1.435E-42)
        L5a:
            r0 = r0 | r11
            goto L5e
        L5c:
            r6 = r21
        L5e:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L71
            r11 = r22
            boolean r13 = r9.g(r11)
            if (r13 == 0) goto L6d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L6f
        L6d:
            r13 = 8192(0x2000, float:1.148E-41)
        L6f:
            r0 = r0 | r13
            goto L73
        L71:
            r11 = r22
        L73:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r8
            if (r13 != 0) goto L87
            r13 = r23
            boolean r15 = r9.h(r13)
            if (r15 == 0) goto L83
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L85
        L83:
            r15 = 65536(0x10000, float:9.1835E-41)
        L85:
            r0 = r0 | r15
            goto L89
        L87:
            r13 = r23
        L89:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r8
            if (r15 != 0) goto L9e
            r15 = r24
            boolean r16 = r9.h(r15)
            if (r16 == 0) goto L99
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L9b
        L99:
            r16 = 524288(0x80000, float:7.34684E-40)
        L9b:
            r0 = r0 | r16
            goto La0
        L9e:
            r15 = r24
        La0:
            r16 = 599187(0x92493, float:8.3964E-40)
            r14 = r0 & r16
            r12 = 599186(0x92492, float:8.39638E-40)
            r7 = 0
            r17 = 1
            if (r14 == r12) goto Lb0
            r12 = r17
            goto Lb1
        Lb0:
            r12 = r7
        Lb1:
            r14 = r0 & 1
            boolean r12 = r9.S(r14, r12)
            if (r12 == 0) goto L220
            i0.m2 r12 = y1.u1.f22127a
            java.lang.Object r12 = r9.j(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Ldb
            i0.r1 r10 = r9.t()
            if (r10 == 0) goto L23f
            s3.d r0 = new s3.d
            r9 = 0
            r3 = r4
            r4 = r6
            r5 = r11
            r6 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
            return
        Ldb:
            i0.u r2 = s3.b.f12341a
            java.lang.Object r2 = r9.j(r2)
            c9.a1 r2 = (c9.a1) r2
            if (r2 != 0) goto L11e
            r2 = 950836184(0x38ac9bd8, float:8.230627E-5)
            r9.a0(r2)
            i0.m2 r2 = y1.i0.f21970f
            java.lang.Object r2 = r9.j(r2)
            android.view.View r2 = (android.view.View) r2
            r2.getClass()
        Lf6:
            r4 = 0
            if (r2 == 0) goto L119
            r6 = 2131099774(0x7f06007e, float:1.781191E38)
            java.lang.Object r6 = r2.getTag(r6)
            boolean r8 = r6 instanceof c9.a1
            if (r8 == 0) goto L107
            c9.a1 r6 = (c9.a1) r6
            goto L108
        L107:
            r6 = r4
        L108:
            if (r6 == 0) goto L10c
            r2 = r6
            goto L11a
        L10c:
            android.view.ViewParent r2 = fb.v0.t(r2)
            boolean r6 = r2 instanceof android.view.View
            if (r6 == 0) goto L117
            android.view.View r2 = (android.view.View) r2
            goto Lf6
        L117:
            r2 = r4
            goto Lf6
        L119:
            r2 = r4
        L11a:
            r9.p(r7)
            goto L127
        L11e:
            r4 = 950834231(0x38ac9437, float:8.229206E-5)
            r9.a0(r4)
            r9.p(r7)
        L127:
            if (r2 == 0) goto L21a
            int r4 = r2.f1095g
            switch(r4) {
                case 0: goto L13e;
                case 1: goto L13b;
                case 2: goto L138;
                case 3: goto L135;
                case 4: goto L132;
                default: goto L12e;
            }
        L12e:
            r3.a r2 = r2.f1099k
        L130:
            r11 = r2
            goto L141
        L132:
            r3.a r2 = r2.f1099k
            goto L130
        L135:
            r3.a r2 = r2.f1099k
            goto L130
        L138:
            r3.a r2 = r2.f1099k
            goto L130
        L13b:
            r3.a r2 = r2.f1099k
            goto L130
        L13e:
            r3.a r2 = r2.f1099k
            goto L130
        L141:
            r12 = r0 & 14
            if (r12 != r10) goto L148
            r2 = r17
            goto L149
        L148:
            r2 = r7
        L149:
            java.lang.Object r4 = r9.P()
            i0.e r13 = i0.l.f5952a
            if (r2 != 0) goto L153
            if (r4 != r13) goto L179
        L153:
            s3.a r4 = new s3.a
            i0.j1 r2 = r1.f12360c
            java.lang.Object r2 = r2.getValue()
            r3.c r2 = (r3.c) r2
            nb.a r6 = new nb.a
            r8 = 9
            r6.<init>(r1, r8)
            r2.getClass()
            r4.<init>()
            r4.f12335a = r2
            tf.t r2 = tf.t.f13167g
            r4.f12336b = r2
            r4.f12337c = r2
            r4.f12338d = r7
            r4.f12339e = r7
            r9.k0(r4)
        L179:
            s3.a r4 = (s3.a) r4
            boolean r2 = r9.h(r4)
            r6 = r0 & 112(0x70, float:1.57E-43)
            if (r6 != r3) goto L186
            r3 = r17
            goto L187
        L186:
            r3 = r7
        L187:
            r2 = r2 | r3
            r3 = r0 & 896(0x380, float:1.256E-42)
            if (r3 != r5) goto L18f
            r3 = r17
            goto L190
        L18f:
            r3 = r7
        L190:
            r2 = r2 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r5 = 2048(0x800, float:2.87E-42)
            if (r3 != r5) goto L19a
            r3 = r17
            goto L19b
        L19a:
            r3 = r7
        L19b:
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r5) goto L1a7
            r3 = r17
            goto L1a8
        L1a7:
            r3 = r7
        L1a8:
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r5) goto L1b3
            r3 = r17
            goto L1b4
        L1b3:
            r3 = r7
        L1b4:
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r3
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r0 != r3) goto L1bf
            r0 = r17
            goto L1c0
        L1bf:
            r0 = r7
        L1c0:
            r0 = r0 | r2
            if (r12 != r10) goto L1c6
            r2 = r17
            goto L1c7
        L1c6:
            r2 = r7
        L1c7:
            r0 = r0 | r2
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto L1d3
            if (r2 != r13) goto L1d1
            goto L1d3
        L1d1:
            r14 = r7
            goto L1ed
        L1d3:
            ia.y r0 = new ia.y
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r8 = r1
            r1 = r4
            r14 = r7
            r4 = r21
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r4 = r1
            r1 = r8
            r9.k0(r0)
            r2 = r0
        L1ed:
            fg.a r2 = (fg.a) r2
            i0.r.j(r2, r9)
            if (r12 != r10) goto L1f7
            r7 = r17
            goto L1f8
        L1f7:
            r7 = r14
        L1f8:
            boolean r0 = r9.h(r4)
            r0 = r0 | r7
            boolean r2 = r9.h(r11)
            r0 = r0 | r2
            java.lang.Object r2 = r9.P()
            if (r0 != 0) goto L20a
            if (r2 != r13) goto L214
        L20a:
            b0.s r2 = new b0.s
            r0 = 17
            r2.<init>(r1, r4, r11, r0)
            r9.k0(r2)
        L214:
            fg.l r2 = (fg.l) r2
            i0.r.c(r1, r2, r9)
            goto L223
        L21a:
            java.lang.String r0 = "No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner"
            j8.o.A(r0)
            return
        L220:
            r9.V()
        L223:
            i0.r1 r10 = r9.t()
            if (r10 == 0) goto L23f
            s3.d r0 = new s3.d
            r9 = 1
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L23f:
            return
    }

    public static int e0(byte[] r3, int r4) {
            int r0 = r4 + 1
            r1 = r3[r4]
            int r2 = r4 + 2
            r0 = r3[r0]
            int r4 = r4 + 3
            r2 = r3[r2]
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            r4 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r4 = r1 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            return r3
    }

    public static final void f(y0.o r8, fg.p r9, i0.h0 r10, int r11) {
            r0 = 1090521195(0x4100086b, float:8.002055)
            r10.b0(r0)
            r0 = r11 & 6
            if (r0 != 0) goto L15
            boolean r0 = r10.f(r8)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r11
            goto L16
        L15:
            r0 = r11
        L16:
            r1 = r11 & 48
            if (r1 != 0) goto L26
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L2f
            r1 = r3
            goto L30
        L2f:
            r1 = 0
        L30:
            r2 = r0 & 1
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto La7
            java.lang.Object r1 = r10.P()
            i0.e r2 = i0.l.f5952a
            if (r1 != r2) goto L45
            y2.e r1 = y2.e.f22215b
            r10.k0(r1)
        L45:
            v1.n0 r1 = (v1.n0) r1
            int r2 = r0 >> 3
            r2 = r2 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            long r4 = r10.T
            int r2 = java.lang.Long.hashCode(r4)
            s0.h r4 = r10.l()
            y0.o r5 = y0.a.c(r10, r8)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | 6
            r10.d0()
            boolean r7 = r10.S
            if (r7 == 0) goto L78
            r10.k(r6)
            goto L7b
        L78:
            r10.n0()
        L7b:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r10, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r10, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r10, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r10)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r10, r5)
            int r0 = r0 >> 6
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.invoke(r10, r0)
            r10.p(r3)
            goto Laa
        La7:
            r10.V()
        Laa:
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto Lb7
            y2.f r0 = new y2.f
            r0.<init>(r8, r9, r11)
            r10.f6035d = r0
        Lb7:
            return
    }

    public static java.lang.Object f0(java.lang.Object r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r2, r0)
            if (r2 == 0) goto La
            return r2
        La:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r1, r3)
            if (r2 == 0) goto L11
            return r2
        L11:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r4)
            return r1
    }

    public static void g0(int[] r2, int r3) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r1 = r2[r0]
            r3 = r3 | r1
            r2[r0] = r3
            return
    }

    public static void h0(ud.r r3, ke.e r4, ud.j r5) {
            boolean r0 = r5 instanceof ud.h
            if (r0 == 0) goto La
            ud.h r5 = (ud.h) r5
            r4.d(r3, r5)
            return
        La:
            boolean r0 = r5 instanceof ud.n
            if (r0 == 0) goto L27
            ud.n r5 = (ud.n) r5
            boolean r0 = r4.a(r3, r5)
            if (r0 == 0) goto L24
            java.util.List r0 = r5.u()
            be.w r1 = new be.w
            r2 = 10
            r1.<init>(r3, r2, r4)
            r0.forEach(r1)
        L24:
            r4.b(r3, r5)
        L27:
            return
    }

    public static final h0.v i(h0.q0 r4, h0.w r5) {
            h0.h r0 = r4.d()
            java.lang.Object r4 = r4.f4972d
            h0.s r4 = (h0.s) r4
            h0.h r1 = h0.h.f4898g
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            h0.v r1 = new h0.v
            h0.u r3 = l(r4, r0, r3, r5)
            h0.u r4 = l(r4, r0, r2, r5)
            r1.<init>(r3, r4, r0)
            return r1
    }

    public static void i0(ud.r r4, ke.d r5) {
            java.util.List r0 = r4.f13732z
            int r0 = r0.size()
            int r0 = r0 * 5
            r1 = 0
        L9:
            xd.b r2 = r4.G
            boolean r2 = j0(r4, r5, r2)
            int r3 = r1 + 1
            if (r1 > r0) goto L18
            if (r2 != 0) goto L16
            return
        L16:
            r1 = r3
            goto L9
        L18:
            af.g r1 = new af.g
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.util.List r4 = r4.f13732z
            int r4 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Iterative traversal limit reached: limit: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", visitor: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ", blocks count: "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public static final boolean j(java.lang.reflect.Method r4) {
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r4)
            r1 = 0
            if (r0 != 0) goto L41
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L41
            int r0 = r4.getParameterCount()
            r2 = 3
            if (r0 != r2) goto L41
            java.lang.Class[] r0 = r4.getParameterTypes()
            r2 = 1
            r0 = r0[r2]
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L41
            java.lang.Class[] r0 = r4.getParameterTypes()
            r3 = 2
            r0 = r0[r3]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L41
            java.lang.String r0 = "com.tencent.mm.plugin.appbrand.jsapi."
            boolean r4 = eh.a.A(r4, r1, r0)
            if (r4 == 0) goto L41
            return r2
        L41:
            return r1
    }

    public static boolean j0(ud.r r1, ke.d r2, ud.j r3) {
            boolean r0 = r3 instanceof ud.n
            if (r0 == 0) goto L31
            ud.n r3 = (ud.n) r3
            boolean r0 = r2.c(r1, r3)
            if (r0 == 0) goto Ld
            goto L27
        Ld:
            java.util.List r3 = r3.u()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            ud.j r0 = (ud.j) r0
            boolean r0 = j0(r1, r2, r0)     // Catch: java.lang.StackOverflowError -> L29
            if (r0 == 0) goto L15
        L27:
            r1 = 1
            return r1
        L29:
            af.f r1 = new af.f
            java.lang.String r2 = "Region traversal failed: Recursive call in traverseIterativeStepInternal method"
            r1.<init>(r2)
            throw r1
        L31:
            r1 = 0
            return r1
    }

    public static final h0.u k(h0.q0 r13, h0.s r14, h0.u r15) {
            int r0 = r14.f4980c
            int r1 = r14.f4979b
            boolean r2 = r13.f4970b
            if (r2 == 0) goto La
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            java.lang.Object r3 = r14.f4982e
            r9 = r3
            i2.k0 r9 = (i2.k0) r9
            int r10 = r14.f4981d
            sh.v r3 = new sh.v
            r4 = 5
            r3.<init>(r5, r4, r14)
            sf.d r11 = sf.d.f12416h
            sf.c r8 = be.h.G(r11, r3)
            if (r2 == 0) goto L22
            r6 = r0
            goto L23
        L22:
            r6 = r1
        L23:
            h0.x r3 = new h0.x
            r7 = r13
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            sf.c r13 = be.h.G(r11, r3)
            r6 = 1
            long r11 = r15.f4998c
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 == 0) goto L3d
            java.lang.Object r13 = r13.getValue()
            h0.u r13 = (h0.u) r13
            return r13
        L3d:
            if (r5 != r10) goto L40
            return r15
        L40:
            i2.o r14 = r9.f6347b
            int r14 = r14.d(r10)
            java.lang.Object r3 = r8.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == r14) goto L59
            java.lang.Object r13 = r13.getValue()
            h0.u r13 = (h0.u) r13
            return r13
        L59:
            int r14 = r15.f4997b
            long r6 = r9.j(r14)
            r15 = -1
            if (r10 != r15) goto L63
            goto L80
        L63:
            if (r5 != r10) goto L66
            goto L9f
        L66:
            h0.h r15 = h0.h.f4898g
            if (r1 >= r0) goto L6d
            h0.h r0 = h0.h.f4899h
            goto L73
        L6d:
            if (r1 <= r0) goto L71
            r0 = r15
            goto L73
        L71:
            h0.h r0 = h0.h.f4900i
        L73:
            if (r0 != r15) goto L77
            r15 = 1
            goto L78
        L77:
            r15 = 0
        L78:
            r15 = r15 ^ r2
            if (r15 == 0) goto L7e
            if (r5 >= r10) goto L9f
            goto L80
        L7e:
            if (r5 <= r10) goto L9f
        L80:
            int r15 = i2.m0.f6359c
            r15 = 32
            long r0 = r6 >> r15
            int r15 = (int) r0
            if (r14 == r15) goto L98
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r15 = (int) r0
            if (r14 != r15) goto L93
            goto L98
        L93:
            h0.u r13 = r4.a(r5)
            return r13
        L98:
            java.lang.Object r13 = r13.getValue()
            h0.u r13 = (h0.u) r13
            return r13
        L9f:
            h0.u r13 = r4.a(r5)
            return r13
    }

    public static final h0.u l(h0.s r2, boolean r3, boolean r4, h0.w r5) {
            if (r4 == 0) goto L5
            int r0 = r2.f4979b
            goto L7
        L5:
            int r0 = r2.f4980c
        L7:
            int r5 = r5.f5013a
            switch(r5) {
                case 0: goto L15;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r5 = r2.f4982e
            i2.k0 r5 = (i2.k0) r5
            long r0 = r5.j(r0)
            goto L2b
        L15:
            java.lang.Object r5 = r2.f4982e
            i2.k0 r5 = (i2.k0) r5
            i2.j0 r5 = r5.f6346a
            i2.g r5 = r5.f6334a
            java.lang.String r5 = r5.f6314h
            int r1 = w.s.s(r5, r0)
            int r5 = w.s.r(r5, r0)
            long r0 = i2.e0.b(r1, r5)
        L2b:
            r3 = r3 ^ r4
            if (r3 == 0) goto L36
            int r3 = i2.m0.f6359c
            r3 = 32
            long r3 = r0 >> r3
        L34:
            int r3 = (int) r3
            goto L3f
        L36:
            int r3 = i2.m0.f6359c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            goto L34
        L3f:
            h0.u r2 = r2.a(r3)
            return r2
    }

    public static final void m(ai.b r9, java.lang.String r10, uh.d r11, boolean r12) {
            r11.getClass()
            long r0 = r11.f13856b
            uh.c r2 = r11.f13855a
            float r3 = r2.f13852a
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r4
            float r4 = r2.f13853b
            r5 = 1060320051(0x3f333333, float:0.7)
            float r4 = r4 - r5
            float r2 = r2.f13854c
            float r5 = r3 * r3
            float r6 = r4 * r4
            float r6 = r6 + r5
            float r5 = r2 * r2
            float r5 = r5 + r6
            double r5 = (double) r5
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            r6 = 897988541(0x358637bd, float:1.0E-6)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L2a
            r5 = r6
        L2a:
            float r3 = r3 / r5
            float r4 = r4 / r5
            java.lang.String r6 = "lightDir"
            java.lang.String r6 = r6.concat(r10)
            float r2 = r2 / r5
            android.graphics.RuntimeShader r5 = r9.f255a
            ai.a.u(r5, r6, r3, r4, r2)
            java.lang.String r2 = "lightColor"
            java.lang.String r2 = r2.concat(r10)
            r5 = 1065353216(0x3f800000, float:1.0)
            long r6 = f1.w.b(r0, r5)
            android.graphics.RuntimeShader r8 = r9.f255a
            int r6 = f1.c0.w(r6)
            ai.a.v(r8, r2, r6)
            java.lang.String r2 = "lightIntensity"
            java.lang.String r2 = r2.concat(r10)
            float r0 = f1.w.d(r0)
            float r11 = r11.f13857c
            float r0 = r0 * r11
            android.graphics.RuntimeShader r11 = r9.f255a
            ai.a.s(r11, r2, r0)
            if (r12 == 0) goto L95
            float r11 = r3 * r3
            float r12 = r4 * r4
            float r12 = r12 + r11
            double r11 = (double) r12
            double r11 = java.lang.Math.sqrt(r11)
            float r11 = (float) r11
            r12 = 981668463(0x3a83126f, float:0.001)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            java.lang.String r0 = "axis"
            if (r12 <= 0) goto L81
            java.lang.String r10 = r0.concat(r10)
            float r3 = r3 / r11
            float r4 = r4 / r11
            android.graphics.RuntimeShader r9 = r9.f255a
            ai.a.t(r9, r10, r3, r4)
            return
        L81:
            java.lang.String r11 = "1"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L8b
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L8b:
            java.lang.String r10 = r0.concat(r10)
            r11 = 0
            android.graphics.RuntimeShader r9 = r9.f255a
            ai.a.t(r9, r10, r11, r5)
        L95:
            return
    }

    public static final android.os.Bundle n(sf.e... r9) {
            android.os.Bundle r0 = new android.os.Bundle
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19a
            r3 = r9[r2]
            java.lang.Object r4 = r3.f12418g
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.f12419h
            if (r3 != 0) goto L1a
            r3 = 0
            r0.putString(r4, r3)
            goto L188
        L1a:
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L29
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r0.putBoolean(r4, r3)
            goto L188
        L29:
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L38
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r0.putByte(r4, r3)
            goto L188
        L38:
            boolean r5 = r3 instanceof java.lang.Character
            if (r5 == 0) goto L47
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            r0.putChar(r4, r3)
            goto L188
        L47:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L56
            java.lang.Number r3 = (java.lang.Number) r3
            double r5 = r3.doubleValue()
            r0.putDouble(r4, r5)
            goto L188
        L56:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L65
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0.putFloat(r4, r3)
            goto L188
        L65:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L74
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.putInt(r4, r3)
            goto L188
        L74:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L83
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            r0.putLong(r4, r5)
            goto L188
        L83:
            boolean r5 = r3 instanceof java.lang.Short
            if (r5 == 0) goto L92
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            r0.putShort(r4, r3)
            goto L188
        L92:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L9d
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L188
        L9d:
            boolean r5 = r3 instanceof java.lang.CharSequence
            if (r5 == 0) goto La8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.putCharSequence(r4, r3)
            goto L188
        La8:
            boolean r5 = r3 instanceof android.os.Parcelable
            if (r5 == 0) goto Lb3
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r0.putParcelable(r4, r3)
            goto L188
        Lb3:
            boolean r5 = r3 instanceof boolean[]
            if (r5 == 0) goto Lbe
            boolean[] r3 = (boolean[]) r3
            r0.putBooleanArray(r4, r3)
            goto L188
        Lbe:
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto Lc9
            byte[] r3 = (byte[]) r3
            r0.putByteArray(r4, r3)
            goto L188
        Lc9:
            boolean r5 = r3 instanceof char[]
            if (r5 == 0) goto Ld4
            char[] r3 = (char[]) r3
            r0.putCharArray(r4, r3)
            goto L188
        Ld4:
            boolean r5 = r3 instanceof double[]
            if (r5 == 0) goto Ldf
            double[] r3 = (double[]) r3
            r0.putDoubleArray(r4, r3)
            goto L188
        Ldf:
            boolean r5 = r3 instanceof float[]
            if (r5 == 0) goto Lea
            float[] r3 = (float[]) r3
            r0.putFloatArray(r4, r3)
            goto L188
        Lea:
            boolean r5 = r3 instanceof int[]
            if (r5 == 0) goto Lf5
            int[] r3 = (int[]) r3
            r0.putIntArray(r4, r3)
            goto L188
        Lf5:
            boolean r5 = r3 instanceof long[]
            if (r5 == 0) goto L100
            long[] r3 = (long[]) r3
            r0.putLongArray(r4, r3)
            goto L188
        L100:
            boolean r5 = r3 instanceof short[]
            if (r5 == 0) goto L10b
            short[] r3 = (short[]) r3
            r0.putShortArray(r4, r3)
            goto L188
        L10b:
            boolean r5 = r3 instanceof java.lang.Object[]
            r6 = 34
            java.lang.String r7 = " for key \""
            if (r5 == 0) goto L161
            java.lang.Class r5 = r3.getClass()
            java.lang.Class r5 = r5.getComponentType()
            r5.getClass()
            java.lang.Class<android.os.Parcelable> r8 = android.os.Parcelable.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L12c
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r0.putParcelableArray(r4, r3)
            goto L188
        L12c:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L13a
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.putStringArray(r4, r3)
            goto L188
        L13a:
            java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L148
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            r0.putCharSequenceArray(r4, r3)
            goto L188
        L148:
            java.lang.Class<java.io.Serializable> r8 = java.io.Serializable.class
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L156
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putSerializable(r4, r3)
            goto L188
        L156:
            java.lang.String r9 = r5.getCanonicalName()
            java.lang.String r0 = "Illegal value array type "
            ah.a.j(r9, r0, r7, r4, r6)
        L15f:
            r9 = 0
            return r9
        L161:
            boolean r5 = r3 instanceof java.io.Serializable
            if (r5 == 0) goto L16b
            java.io.Serializable r3 = (java.io.Serializable) r3
            r0.putSerializable(r4, r3)
            goto L188
        L16b:
            boolean r5 = r3 instanceof android.os.IBinder
            if (r5 == 0) goto L175
            android.os.IBinder r3 = (android.os.IBinder) r3
            r0.putBinder(r4, r3)
            goto L188
        L175:
            boolean r5 = r3 instanceof android.util.Size
            if (r5 == 0) goto L17f
            android.util.Size r3 = (android.util.Size) r3
            r0.putSize(r4, r3)
            goto L188
        L17f:
            boolean r5 = r3 instanceof android.util.SizeF
            if (r5 == 0) goto L18c
            android.util.SizeF r3 = (android.util.SizeF) r3
            r0.putSizeF(r4, r3)
        L188:
            int r2 = r2 + 1
            goto L8
        L18c:
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getCanonicalName()
            java.lang.String r0 = "Illegal value type "
            ah.a.j(r9, r0, r7, r4, r6)
            goto L15f
        L19a:
            return r0
    }

    public static final h0.u o(h0.u r2, h0.s r3, int r4) {
            java.lang.Object r3 = r3.f4982e
            i2.k0 r3 = (i2.k0) r3
            t2.j r3 = r3.a(r4)
            long r0 = r2.f4998c
            h0.u r2 = new h0.u
            r2.<init>(r3, r4, r0)
            return r2
    }

    public static void p(android.view.View r2) {
            r2.getClass()
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            r1 = 0
            r2.setTag(r0, r1)
            r0 = 2131099776(0x7f060080, float:1.7811915E38)
            r2.setTag(r0, r1)
            r0 = 2131099777(0x7f060081, float:1.7811917E38)
            r2.setTag(r0, r1)
            r0 = 2131099774(0x7f06007e, float:1.781191E38)
            r2.setTag(r0, r1)
            return
    }

    public static void q(int[] r2, int r3) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r1 = r2[r0]
            int r3 = ~r3
            r3 = r3 & r1
            r2[r0] = r3
            return
    }

    public static final void r(int r3, int r4) {
            if (r3 > r4) goto L3
            return
        L3:
            java.lang.String r0 = ") is greater than size ("
            java.lang.String r1 = ")."
            java.lang.String r2 = "toIndex ("
            java.lang.String r3 = eh.a.k(r3, r4, r2, r0, r1)
            okio.a.i(r3)
            return
    }

    public static hb.t s(java.lang.String r34) {
            java.lang.String r0 = "type"
            r34.getClass()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6e
            r3 = r34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = "retransmit"
            org.json.JSONObject r3 = r2.optJSONObject(r3)     // Catch: java.lang.Throwable -> L6e
            r4 = 1
            java.lang.String r5 = "imagePath"
            java.lang.String r6 = "content"
            java.lang.String r7 = "sourceTalker"
            java.lang.String r8 = "msgId"
            r9 = 0
            if (r3 == 0) goto L71
            k8.t r10 = new k8.t     // Catch: java.lang.Throwable -> L6e
            long r11 = r2.optLong(r8)     // Catch: java.lang.Throwable -> L6e
            long r16 = r3.optLong(r8, r11)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = r2.optString(r7)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r13 = r3.optString(r7, r11)     // Catch: java.lang.Throwable -> L6e
            r13.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = r2.optString(r6)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r14 = r3.optString(r6, r11)     // Catch: java.lang.Throwable -> L6e
            r14.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r11 = "retrType"
            r12 = -1
            int r11 = r3.optInt(r11, r12)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r12 = "msgFromScene"
            r15 = 2
            int r12 = r3.optInt(r12, r15)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r15 = "fileName"
            java.lang.String r1 = r2.optString(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r15 = r3.optString(r15, r1)     // Catch: java.lang.Throwable -> L6e
            r15.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "length"
            int r18 = r3.optInt(r1, r9)     // Catch: java.lang.Throwable -> L6e
            r10.<init>(r11, r12, r13, r14, r15, r16, r18)     // Catch: java.lang.Throwable -> L6e
            if (r11 < 0) goto L66
            r1 = r4
            goto L67
        L66:
            r1 = r9
        L67:
            if (r1 == 0) goto L6a
            goto L6b
        L6a:
            r10 = 0
        L6b:
            r28 = r10
            goto L73
        L6e:
            r0 = move-exception
            goto Lf9
        L71:
            r28 = 0
        L73:
            long r20 = r2.optLong(r8)     // Catch: java.lang.Throwable -> L6e
            int r22 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r23 = r2.optString(r7)     // Catch: java.lang.Throwable -> L6e
            r23.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r24 = r2.optString(r6)     // Catch: java.lang.Throwable -> L6e
            r24.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r25 = r2.optString(r5)     // Catch: java.lang.Throwable -> L6e
            r25.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "createTime"
            long r26 = r2.optLong(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "voicePath"
            java.lang.String r29 = r2.optString(r1)     // Catch: java.lang.Throwable -> L6e
            r29.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "voiceDurationMillis"
            r3 = 1000(0x3e8, float:1.401E-42)
            int r30 = r2.optInt(r1, r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "voiceFileName"
            java.lang.String r1 = r2.optString(r1)     // Catch: java.lang.Throwable -> L6e
            boolean r3 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto Lcf
            java.lang.String r1 = r2.optString(r5)     // Catch: java.lang.Throwable -> L6e
            int r0 = r2.optInt(r0)     // Catch: java.lang.Throwable -> L6e
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            r2 = 34
            if (r0 != r2) goto Lc5
            r0 = r4
            goto Lc6
        Lc5:
            r0 = r9
        Lc6:
            if (r0 == 0) goto Lc9
            goto Lca
        Lc9:
            r1 = 0
        Lca:
            if (r1 != 0) goto Lcf
            java.lang.String r0 = ""
            r1 = r0
        Lcf:
            r31 = r1
            hb.t r19 = new hb.t     // Catch: java.lang.Throwable -> L6e
            r32 = 0
            r33 = 1024(0x400, float:1.435E-42)
            r19.<init>(r20, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L6e
            r0 = r29
            r1 = 0
            int r1 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lf0
            if (r28 != 0) goto Lf1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r1.isFile()     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto Lf0
            goto Lf1
        Lf0:
            r4 = r9
        Lf1:
            if (r4 == 0) goto Lf4
            goto Lf6
        Lf4:
            r19 = 0
        Lf6:
            r1 = r19
            goto Lfe
        Lf9:
            sf.f r1 = new sf.f
            r1.<init>(r0)
        Lfe:
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L103
            r1 = 0
        L103:
            hb.t r1 = (hb.t) r1
            return r1
    }

    public static java.lang.String t(java.util.List r5) {
            r5.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r5.next()
            r4 = r3
            q9.h r4 = (q9.h) r4
            java.lang.String r4 = r4.f10768a
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L16
            r2.add(r3)
            goto L16
        L2f:
            java.util.Iterator r5 = r2.iterator()
        L33:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r5.next()
            q9.h r1 = (q9.h) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r1.f10768a
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "groupId"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f10769b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "label"
            r2.put(r4, r3)
            java.lang.String r1 = r1.f10770c
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "templateId"
            r2.put(r3, r1)
            r0.put(r2)
            goto L33
        L75:
            java.lang.String r5 = r0.toString()
            r5.getClass()
            return r5
    }

    public static java.lang.String u(java.util.Set r4) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L14
        L24:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = 0
        L43:
            if (r3 == 0) goto L2d
            r4.add(r2)
            goto L2d
        L49:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r4)
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r1)
            goto L55
        L65:
            java.lang.String r4 = r0.toString()
            r4.getClass()
            return r4
    }

    public static java.lang.String v(java.util.List r6) {
            r6.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            q9.g r1 = (q9.g) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.f10759a
            r2.put(r3, r4)
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.f10760b
            r2.put(r3, r4)
            java.lang.String r3 = "enabled"
            boolean r4 = r1.f10761c
            r2.put(r3, r4)
            int r3 = r1.f10762d
            r4 = 0
            r5 = 600(0x258, float:8.41E-43)
            int r3 = r9.e0.r(r3, r4, r5)
            java.lang.String r4 = "delaySeconds"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f10763e
            java.lang.String r3 = Q(r3)
            java.lang.String r4 = "promptType"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f10764f
            java.lang.String r4 = "card_first"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L56
            goto L58
        L56:
            java.lang.String r4 = "text_first"
        L58:
            java.lang.String r3 = "bothOrder"
            r2.put(r3, r4)
            java.lang.String r3 = "text"
            java.lang.String r4 = r1.f10765g
            r2.put(r3, r4)
            java.lang.String r3 = "cardTitle"
            java.lang.String r4 = r1.f10766h
            r2.put(r3, r4)
            java.lang.String r3 = "cardDesc"
            java.lang.String r1 = r1.f10767i
            r2.put(r3, r1)
            r0.put(r2)
            goto Lc
        L76:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
    }

    public static java.lang.String w(int r8, java.lang.Object r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "retcode"
            r2 = 0
            int r1 = Z(r9, r1, r2)
            java.lang.String r2 = "isSender"
            r3 = -1
            int r2 = Z(r9, r2, r3)
            java.lang.String r4 = "receiveStatus"
            int r3 = Z(r9, r4, r3)
            if (r8 != 0) goto L69
            if (r1 != 0) goto L69
            r8 = 1
            if (r2 != r8) goto L20
            goto L69
        L20:
            java.lang.String r1 = "amount"
            java.lang.Long r1 = X(r9, r1)
            if (r1 != 0) goto L2e
            java.lang.String r1 = "receiveAmount"
            java.lang.Long r1 = X(r9, r1)
        L2e:
            if (r1 != 0) goto L36
            java.lang.String r1 = "recAmount"
            java.lang.Long r1 = X(r9, r1)
        L36:
            if (r1 == 0) goto L69
            long r4 = r1.longValue()
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L43
            goto L69
        L43:
            if (r3 < 0) goto L4b
            if (r3 == r8) goto L4b
            r8 = 2
            if (r3 == r8) goto L4b
            return r0
        L4b:
            long r8 = r1.longValue()
            double r8 = (double) r8
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 / r0
            java.text.DecimalFormat r0 = new java.text.DecimalFormat     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "0.00"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.Throwable -> L64
            r0.setRoundingMode(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = r0.format(r8)     // Catch: java.lang.Throwable -> L64
            return r8
        L64:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            return r8
        L69:
            return r0
    }

    public static int x(int[] r5, int r6) {
            int r0 = r5.length
            r1 = r6 & 31
            int r6 = r6 >> 5
        L5:
            r2 = -1
            if (r6 >= r0) goto L26
            r3 = r5[r6]
            if (r3 == 0) goto L22
            r4 = 1
            int r1 = r4 << r1
            int r1 = r1 - r4
            int r1 = ~r1
            r1 = r1 & r3
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            r3 = 32
            if (r1 != r3) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 < 0) goto L22
            int r5 = r6 << 5
            int r5 = r5 + r2
            return r5
        L22:
            int r6 = r6 + 1
            r1 = 0
            goto L5
        L26:
            return r2
    }

    public static hb.t y(java.lang.Object r32) {
            r13 = r32
            r13.getClass()
            java.lang.String r0 = "field_msgId"
            java.lang.String r1 = "msgId"
            java.lang.String r2 = "getMsgId"
            long r0 = b0(r13, r2, r0, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            long r5 = r2.longValue()
            goto L2d
        L23:
            java.lang.String r0 = "msgID"
            java.lang.String r2 = "id"
            java.lang.String r5 = "getMsgID"
            long r5 = b0(r13, r5, r0, r2)
        L2d:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L33
            goto L1fa
        L33:
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L40
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.c(r5)     // Catch: java.lang.Throwable -> L3e
            goto L48
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = r1
            goto L48
        L42:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L48:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L4e
            r0 = r1
        L4e:
            h.Hchat.hooks.api.model.WeChatMessage r0 = (h.Hchat.hooks.api.model.WeChatMessage) r0
            if (r0 == 0) goto L54
            goto Lde
        L54:
            java.lang.String r0 = "field_content"
            java.lang.String r2 = "content"
            java.lang.String r3 = "getContent"
            java.lang.String r25 = d0(r13, r3, r0, r2)
            java.lang.String r0 = "field_type"
            java.lang.String r2 = "type"
            java.lang.String r3 = "getType"
            int r0 = Y(r13, r3, r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L6f
            goto L70
        L6f:
            r2 = r1
        L70:
            if (r2 == 0) goto L79
            int r0 = r2.intValue()
        L76:
            r19 = r0
            goto L83
        L79:
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r0.getClass()
            int r0 = l8.d.f(r25)
            goto L76
        L83:
            if (r19 > 0) goto L87
            r0 = r1
            goto Ldc
        L87:
            h.Hchat.hooks.api.model.WeChatMessage r14 = new h.Hchat.hooks.api.model.WeChatMessage
            java.lang.String r0 = "field_msgSvrId"
            java.lang.String r2 = "msgSvrId"
            java.lang.String r3 = "getMsgSvrId"
            long r17 = b0(r13, r3, r0, r2)
            java.lang.String r0 = "field_status"
            java.lang.String r2 = "status"
            java.lang.String r3 = "getStatus"
            int r20 = Y(r13, r3, r0, r2)
            java.lang.String r0 = "field_isSend"
            java.lang.String r2 = "isSend"
            java.lang.String r3 = "getIsSend"
            int r21 = Y(r13, r3, r0, r2)
            java.lang.String r0 = "field_createTime"
            java.lang.String r2 = "createTime"
            java.lang.String r3 = "getCreateTime"
            long r22 = b0(r13, r3, r0, r2)
            java.lang.String r0 = "field_talker"
            java.lang.String r2 = "talker"
            java.lang.String r3 = "getTalker"
            java.lang.String r24 = d0(r13, r3, r0, r2)
            java.lang.String r0 = "field_imgPath"
            java.lang.String r2 = "imgPath"
            java.lang.String r3 = "getImgPath"
            java.lang.String r26 = d0(r13, r3, r0, r2)
            java.lang.String r0 = "field_msgSource"
            java.lang.String r2 = "msgSource"
            java.lang.String r3 = "getMsgSource"
            java.lang.String r30 = d0(r13, r3, r0, r2)
            java.lang.String r31 = ""
            java.lang.String r27 = ""
            java.lang.String r28 = ""
            r29 = 0
            r15 = r5
            r14.<init>(r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = r14
        Ldc:
            if (r0 == 0) goto L1fa
        Lde:
            boolean r2 = r0.isSystem()
            if (r2 != 0) goto L1fa
            boolean r2 = r0.isRecalled()
            if (r2 != 0) goto L1fa
            boolean r2 = r0.isVoip()
            if (r2 != 0) goto L1fa
            boolean r2 = r0.isRedPacket()
            if (r2 != 0) goto L1fa
            boolean r2 = r0.isTransfer()
            if (r2 == 0) goto Lfe
            goto L1fa
        Lfe:
            boolean r2 = r0.isVoice()
            if (r2 == 0) goto L1d5
            java.lang.String r2 = r0.imagePath
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L10d
            goto L10e
        L10d:
            r2 = r1
        L10e:
            if (r2 == 0) goto L111
            goto L17a
        L111:
            java.lang.String r2 = r0.bodyContent()
            r3 = 2
            char[] r3 = new char[r3]
            r3 = {x01fc: FILL_ARRAY_DATA , data: [10, 13} // fill-array
            java.lang.String r3 = og.m.U0(r2, r3)
            r4 = 1
            char[] r5 = new char[r4]
            r6 = 58
            r7 = 0
            r5[r7] = r6
            r6 = 6
            java.util.List r3 = og.m.F0(r3, r5, r6)
            int r5 = r3.size()
            r6 = 3
            if (r5 < r6) goto L157
            r5 = 60
            boolean r5 = og.m.i0(r2, r5)
            if (r5 != 0) goto L157
            int r2 = r3.size()
            r5 = 4
            if (r2 != r5) goto L149
            java.lang.Object r2 = r3.get(r4)
        L146:
            java.lang.String r2 = (java.lang.String) r2
            goto L14e
        L149:
            java.lang.Object r2 = r3.get(r7)
            goto L146
        L14e:
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto L17a
        L157:
            l8.d r3 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r3.getClass()
            java.lang.String r3 = "filename"
            java.lang.String r4 = l8.d.m(r2, r3)
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L16e
            java.lang.String r4 = "voiceurl"
            java.lang.String r4 = l8.d.m(r2, r4)
        L16e:
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L179
            java.lang.String r2 = l8.d.o(r2, r3)
            goto L17a
        L179:
            r2 = r4
        L17a:
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L182
            goto L1fa
        L182:
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto L191
            j8.y r3 = r3.f6816b
            if (r3 == 0) goto L191
            java.lang.String r3 = r3.q(r2)
            goto L192
        L191:
            r3 = r1
        L192:
            if (r3 != 0) goto L196
            java.lang.String r3 = ""
        L196:
            r10 = r3
            boolean r3 = eh.a.y(r10)
            if (r3 != 0) goto L19f
            goto L1fa
        L19f:
            java.util.concurrent.ConcurrentHashMap r1 = j8.e.f6779a
            long r3 = r0.msgId
            java.lang.String r1 = r0.content
            java.lang.String r5 = r0.bodyContent()
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            java.util.List r5 = a.a.y0(r1)
            r6 = 1000(0x3e8, float:1.401E-42)
            r1 = r13
            int r11 = j8.e.d(r1, r2, r3, r5, r6)
            hb.t r1 = new hb.t
            r3 = r1
            r12 = r2
            long r1 = r0.msgId
            r4 = r3
            int r3 = r0.type
            r5 = r4
            java.lang.String r4 = r0.talker
            r6 = r5
            java.lang.String r5 = r0.content
            r7 = r6
            java.lang.String r6 = r0.imagePath
            r9 = r7
            long r7 = r0.createTime
            r0 = r9
            r9 = 0
            r13 = r32
            r0.<init>(r1, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13)
            return r0
        L1d5:
            k8.t r9 = fb.v0.e(r0, r13)
            if (r9 == 0) goto L1fa
            hb.t r1 = new hb.t
            r3 = r1
            long r1 = r0.msgId
            r4 = r3
            int r3 = r0.type
            r5 = r4
            java.lang.String r4 = r0.talker
            r6 = r5
            java.lang.String r5 = r0.content
            r7 = r6
            java.lang.String r6 = r0.imagePath
            long r10 = r0.createTime
            r12 = 0
            r14 = 512(0x200, float:7.17E-43)
            r0 = r7
            r7 = r10
            java.lang.String r10 = ""
            r11 = 0
            r0.<init>(r1, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r0
        L1fa:
            return r1
    }

    public static boolean z(int[] r2, int r3) {
            int r0 = r3 >> 5
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r2 = r2[r0]
            r2 = r2 & r3
            if (r2 == 0) goto Ld
            return r1
        Ld:
            r2 = 0
            return r2
    }

    public abstract int G(g6.b r1);

    public abstract int P(int r1);

    public abstract int V(int r1);

    @Override // k2.d
    public int b(int r3) {
            r2 = this;
            int r3 = r2.P(r3)
            r0 = -1
            if (r3 != r0) goto L8
            return r0
        L8:
            int r1 = r2.P(r3)
            if (r1 != r0) goto Lf
            return r0
        Lf:
            return r3
    }

    @Override // k2.d
    public int c(int r3) {
            r2 = this;
            int r3 = r2.V(r3)
            r0 = -1
            if (r3 != r0) goto L8
            return r0
        L8:
            int r1 = r2.V(r3)
            if (r1 != r0) goto Lf
            return r0
        Lf:
            return r3
    }

    @Override // k2.d
    public int g(int r1) {
            r0 = this;
            int r1 = r0.V(r1)
            return r1
    }

    @Override // k2.d
    public int h(int r1) {
            r0 = this;
            int r1 = r0.P(r1)
            return r1
    }
}
