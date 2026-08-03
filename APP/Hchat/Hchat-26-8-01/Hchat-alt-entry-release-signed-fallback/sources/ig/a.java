package ig;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final java.lang.Object A(h.Hchat.dexkit.DexFinder r3, java.lang.Class r4) {
            r0 = 0
            if (r3 == 0) goto L34
            java.lang.reflect.Method r1 = r3.serviceGetterMethod
            if (r1 == 0) goto L34
            if (r4 != 0) goto La
            goto L34
        La:
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L11
            goto L22
        L11:
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r0, r2)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L22
            boolean r2 = r4.isInstance(r1)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L22
            r0 = r1
        L22:
            if (r0 == 0) goto L25
            return r0
        L25:
            java.lang.reflect.Method r3 = r3.serviceGetterMethod
            r3.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Object r3 = t(r3, r4, r4, r0)
            return r3
        L34:
            return r0
    }

    public static final i2.g B(n2.s r4, int r5) {
            i2.g r0 = r4.f8976a
            i2.g r1 = r4.f8976a
            long r2 = r4.f8977b
            int r4 = i2.m0.e(r2)
            int r2 = i2.m0.e(r2)
            int r3 = r2 + r5
            r2 = r2 ^ r3
            r5 = r5 ^ r3
            r5 = r5 & r2
            if (r5 >= 0) goto L1b
            java.lang.String r5 = r1.f6314h
            int r3 = r5.length()
        L1b:
            java.lang.String r5 = r1.f6314h
            int r5 = r5.length()
            int r5 = java.lang.Math.min(r3, r5)
            i2.g r4 = r0.b(r4, r5)
            return r4
    }

    public static final i2.g C(n2.s r4, int r5) {
            i2.g r0 = r4.f8976a
            long r1 = r4.f8977b
            int r4 = i2.m0.f(r1)
            int r3 = r4 - r5
            r5 = r5 ^ r4
            r4 = r4 ^ r3
            r4 = r4 & r5
            r5 = 0
            if (r4 >= 0) goto L11
            r3 = r5
        L11:
            int r4 = java.lang.Math.max(r5, r3)
            int r5 = i2.m0.f(r1)
            i2.g r4 = r0.b(r4, r5)
            return r4
    }

    public static void D(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) {
            boolean r0 = I(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L41
            boolean r0 = I(r4)
            if (r0 != 0) goto L41
            boolean r0 = I(r5)
            if (r0 != 0) goto L41
            r2 = r2 & 7
            int r2 = r2 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r2 = r2 | r3
            r3 = r4 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r5 & 63
            r2 = r2 | r3
            int r3 = r2 >>> 10
            r4 = 55232(0xd7c0, float:7.7397E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r6[r7] = r3
            int r7 = r7 + 1
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r3 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r3
            char r2 = (char) r2
            r6[r7] = r2
            return
        L41:
            java.lang.String r2 = "Invalid UTF-8"
            j8.o.t(r2)
            return
    }

    public static void E(byte r2, byte r3, byte r4, char[] r5, int r6) {
            boolean r0 = I(r3)
            if (r0 != 0) goto L2a
            r0 = -32
            r1 = -96
            if (r2 != r0) goto Le
            if (r3 < r1) goto L2a
        Le:
            r0 = -19
            if (r2 != r0) goto L14
            if (r3 >= r1) goto L2a
        L14:
            boolean r0 = I(r4)
            if (r0 != 0) goto L2a
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2a:
            java.lang.String r2 = "Invalid UTF-8"
            j8.o.t(r2)
            return
    }

    public static void F(byte r1, byte r2, char[] r3, int r4) {
            r0 = -62
            if (r1 < r0) goto L1b
            boolean r0 = I(r2)
            if (r0 != 0) goto L15
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r2 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r4] = r1
            return
        L15:
            java.lang.String r1 = "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"
            j8.o.t(r1)
            return
        L1b:
            java.lang.String r1 = "Invalid UTF-8: Illegal leading byte in 2 bytes utf"
            j8.o.t(r1)
            return
    }

    public static uf.g G(fb.v r3) {
            java.lang.String r0 = r3.f3825c
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r3.f3833k
            java.lang.String r1 = "anthropic"
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L30
            uf.g r3 = new uf.g
            r3.<init>()
            java.lang.String r1 = "anthropic-version"
            java.lang.String r2 = "2023-06-01"
            r3.put(r1, r2)
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "x-api-key"
            r3.put(r1, r0)
        L2b:
            uf.g r3 = r3.c()
            return r3
        L30:
            java.lang.String r1 = "gemini"
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L4d
            uf.g r3 = new uf.g
            r3.<init>()
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L48
            java.lang.String r1 = "x-goog-api-key"
            r3.put(r1, r0)
        L48:
            uf.g r3 = r3.c()
            return r3
        L4d:
            uf.g r3 = new uf.g
            r3.<init>()
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L63
            java.lang.String r1 = "Bearer "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "Authorization"
            r3.put(r1, r0)
        L63:
            uf.g r3 = r3.c()
            return r3
    }

    public static fb.w0 H(java.lang.String r7) {
            java.lang.String r0 = "data:"
            r1 = 0
            boolean r0 = og.t.d0(r7, r0, r1)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L2b
            java.lang.String r0 = "http://"
            boolean r0 = og.t.d0(r7, r0, r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "https://"
            boolean r0 = og.t.d0(r7, r0, r1)
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 == 0) goto L20
            goto L21
        L20:
            r7 = r3
        L21:
            if (r7 == 0) goto L54
            fb.w0 r0 = new fb.w0
            java.lang.String r2 = ""
            r0.<init>(r2, r7, r1)
            return r0
        L2b:
            java.lang.String r0 = ","
            r4 = 6
            int r0 = og.m.r0(r7, r0, r1, r1, r4)
            r4 = 5
            if (r0 <= r4) goto L54
            java.lang.String r5 = r7.substring(r4, r0)
            java.lang.String r6 = ";base64"
            boolean r1 = og.t.W(r5, r6, r1)
            if (r1 != 0) goto L42
            goto L54
        L42:
            java.lang.String r1 = r7.substring(r4, r0)
            fb.w0 r3 = new fb.w0
            java.lang.String r1 = og.m.B0(r1, r6)
            int r0 = r0 + r2
            java.lang.String r7 = r7.substring(r0)
            r3.<init>(r1, r7, r2)
        L54:
            return r3
    }

    public static boolean I(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean J(java.lang.Class r2, java.lang.reflect.Method r3) {
            r0 = 0
            if (r3 == 0) goto L37
            java.lang.Class r1 = r3.getDeclaringClass()
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto Le
            goto L37
        Le:
            java.lang.Class[] r2 = r3.getParameterTypes()
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L37
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L37
            int r3 = r2.length
            r1 = 1
            if (r3 != r1) goto L37
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2 = r2[r0]
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L37
            return r1
        L37:
            return r0
    }

    public static org.json.JSONObject K(java.lang.String r1) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r1 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r1)
        Lc:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L13
            goto L18
        L13:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L18:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
    }

    public static boolean L(java.io.File r2) {
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L7
            goto L1f
        L7:
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L21
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L19
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L21
        L19:
            boolean r2 = r2.createNewFile()
            if (r2 == 0) goto L21
        L1f:
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    public static java.lang.String M(fb.v r11) {
            java.lang.String r0 = r11.f3823a
            java.lang.String r1 = r11.f3833k
            java.lang.String r11 = r11.f3824b
            java.lang.String r11 = fb.w.p(r0, r1, r11)
            boolean r0 = og.m.t0(r11)
            r2 = 0
            if (r0 == 0) goto L13
            goto L104
        L13:
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.String r0 = "anthropic"
            boolean r0 = r1.equals(r0)
            r3 = 0
            java.lang.String r4 = "1000"
            r5 = 47
            java.lang.String r6 = ""
            r7 = 1
            if (r0 == 0) goto Lc0
            java.lang.String r0 = r11.getEncodedPath()
            if (r0 != 0) goto L2e
            goto L2f
        L2e:
            r6 = r0
        L2f:
            char[] r0 = new char[r7]
            r0[r3] = r5
            r1 = 6
            java.util.List r0 = og.m.F0(r6, r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L41
            r1.add(r5)
            goto L41
        L58:
            int r0 = r1.size()
            java.util.ListIterator r0 = r1.listIterator(r0)
        L60:
            boolean r5 = r0.hasPrevious()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r0.previous()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "messages"
            boolean r5 = og.t.X(r5, r6)
            if (r5 == 0) goto L60
            int r0 = r0.nextIndex()
            goto L7a
        L79:
            r0 = -1
        L7a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r0 < 0) goto L81
            r3 = r7
        L81:
            if (r3 == 0) goto L84
            r2 = r5
        L84:
            if (r2 == 0) goto L8e
            int r0 = r2.intValue()
            java.util.List r1 = tf.m.L1(r0, r1)
        L8e:
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r0 = "models"
            java.util.ArrayList r5 = tf.m.G1(r1, r0)
            r9 = 0
            r10 = 62
            java.lang.String r6 = "/"
            r7 = 0
            r8 = 0
            java.lang.String r0 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = "/"
            java.lang.String r0 = r1.concat(r0)
            android.net.Uri$Builder r11 = r11.encodedPath(r0)
            android.net.Uri$Builder r11 = r11.clearQuery()
            java.lang.String r0 = "limit"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r0, r4)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            return r11
        Lc0:
            java.lang.String r0 = "gemini"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L104
            android.net.Uri$Builder r0 = r11.buildUpon()
            java.lang.String r11 = r11.getEncodedPath()
            if (r11 != 0) goto Ld3
            goto Ld4
        Ld3:
            r6 = r11
        Ld4:
            char[] r11 = new char[r7]
            r11[r3] = r5
            java.lang.String r11 = og.m.U0(r6, r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = "/models"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            android.net.Uri$Builder r11 = r0.encodedPath(r11)
            android.net.Uri$Builder r11 = r11.clearQuery()
            java.lang.String r0 = "pageSize"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r0, r4)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            return r11
        L104:
            return r2
    }

    public static final long N(long r1, float r3) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Ld
            goto L16
        Ld:
            float r0 = f1.w.d(r1)
            float r0 = r0 * r3
            long r1 = f1.w.b(r1, r0)
        L16:
            return r1
    }

    public static java.util.List O(l0.k r24, int r25, l0.k r26, boolean r27, boolean r28, boolean r29) {
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.u(r25)
            int r4 = r1 + r3
            int r5 = r24.f(r25)
            int r6 = r0.f(r4)
            int r7 = r6 - r5
            r9 = 1
            if (r1 < 0) goto L2b
            int[] r10 = r0.f7695b
            int r11 = r24.r(r25)
            int r11 = r11 * 5
            int r11 = r11 + r9
            r10 = r10[r11]
            r11 = 201326592(0xc000000, float:9.8607613E-32)
            r10 = r10 & r11
            if (r10 == 0) goto L2b
            r10 = r9
            goto L2c
        L2b:
            r10 = 0
        L2c:
            r2.w(r3)
            int r11 = r2.f7713t
            r2.x(r7, r11)
            int r11 = r0.f7700g
            if (r11 >= r4) goto L3b
            r0.B(r4)
        L3b:
            int r11 = r0.f7704k
            if (r11 >= r6) goto L42
            r0.C(r6, r4)
        L42:
            int[] r6 = r2.f7695b
            int r11 = r2.f7713t
            int[] r12 = r0.f7695b
            int r13 = r11 * 5
            int r14 = r1 * 5
            int r15 = r4 * 5
            tf.l.p0(r12, r6, r13, r14, r15)
            java.lang.Object[] r12 = r2.f7696c
            int r14 = r2.f7702i
            java.lang.Object[] r15 = r0.f7696c
            java.lang.System.arraycopy(r15, r5, r12, r14, r7)
            int r15 = r2.f7715v
            int r16 = r13 + 2
            r6[r16] = r15
            int r16 = r11 - r1
            int r8 = r11 + r3
            int r18 = r2.g(r6, r11)
            int r18 = r14 - r18
            r19 = r9
            int r9 = r2.f7706m
            r20 = r9
            int r9 = r2.f7705l
            int r12 = r12.length
            r21 = r10
            r10 = r20
            r20 = r13
            r13 = r11
        L7a:
            if (r13 >= r8) goto Laf
            if (r13 == r11) goto L88
            int r22 = r13 * 5
            int r22 = r22 + 2
            r23 = r6[r22]
            int r23 = r23 + r16
            r6[r22] = r23
        L88:
            int r22 = r2.g(r6, r13)
            r23 = r6
            int r6 = r22 + r18
            if (r10 >= r13) goto L96
            r22 = r11
            r11 = 0
            goto L9a
        L96:
            r22 = r11
            int r11 = r2.f7704k
        L9a:
            int r6 = l0.k.i(r6, r11, r9, r12)
            int r11 = r13 * 5
            int r11 = r11 + 4
            r23[r11] = r6
            if (r13 != r10) goto La8
            int r10 = r10 + 1
        La8:
            int r13 = r13 + 1
            r11 = r22
            r6 = r23
            goto L7a
        Laf:
            r23 = r6
            r2.f7706m = r10
            java.util.ArrayList r6 = r0.f7697d
            int r9 = r0.p()
            int r6 = l0.j.a(r6, r1, r9)
            java.util.ArrayList r9 = r0.f7697d
            int r10 = r0.p()
            int r4 = l0.j.a(r9, r4, r10)
            if (r6 >= r4) goto L100
            java.util.ArrayList r9 = r0.f7697d
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4 - r6
            r10.<init>(r11)
            r11 = r6
        Ld3:
            if (r11 >= r4) goto Le7
            java.lang.Object r12 = r9.get(r11)
            l0.b r12 = (l0.b) r12
            int r13 = r12.f7654a
            int r13 = r13 + r16
            r12.f7654a = r13
            r10.add(r12)
            int r11 = r11 + 1
            goto Ld3
        Le7:
            java.util.ArrayList r11 = r2.f7697d
            int r12 = r2.f7713t
            int r13 = r2.p()
            int r11 = l0.j.a(r11, r12, r13)
            java.util.ArrayList r12 = r2.f7697d
            r12.addAll(r11, r10)
            java.util.List r4 = r9.subList(r6, r4)
            r4.clear()
            goto L102
        L100:
            tf.t r10 = tf.t.f13167g
        L102:
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L126
            java.util.HashMap r4 = r0.f7698e
            java.util.HashMap r6 = r2.f7698e
            if (r4 == 0) goto L126
            if (r6 == 0) goto L126
            int r6 = r10.size()
            r9 = 0
        L115:
            if (r9 >= r6) goto L126
            java.lang.Object r11 = r10.get(r9)
            l0.b r11 = (l0.b) r11
            java.lang.Object r11 = r4.get(r11)
            l0.c r11 = (l0.c) r11
            int r9 = r9 + 1
            goto L115
        L126:
            int r4 = r2.f7715v
            r2.O(r15)
            int[] r4 = r0.f7695b
            int r4 = r0.E(r4, r1)
            if (r29 != 0) goto L136
            r17 = 0
            goto L173
        L136:
            if (r27 == 0) goto L168
            if (r4 < 0) goto L13d
            r17 = r19
            goto L13f
        L13d:
            r17 = 0
        L13f:
            if (r17 == 0) goto L14d
            r0.P()
            int r3 = r0.f7713t
            int r4 = r4 - r3
            r0.a(r4)
            r0.P()
        L14d:
            int r3 = r0.f7713t
            int r1 = r1 - r3
            r0.a(r1)
            boolean r1 = r0.H()
            if (r17 == 0) goto L165
            r0.M()
            r0.j()
            r0.M()
            r0.j()
        L165:
            r17 = r1
            goto L173
        L168:
            boolean r3 = r0.I(r1, r3)
            int r1 = r1 + (-1)
            r0.J(r5, r7, r1)
            r17 = r3
        L173:
            if (r17 == 0) goto L17a
            java.lang.String r0 = "Unexpectedly removed anchors"
            i0.m.a(r0)
        L17a:
            int r0 = r2.f7708o
            int r13 = r20 + 1
            r1 = r23[r13]
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r1
            if (r3 == 0) goto L188
            r9 = r19
            goto L18d
        L188:
            r3 = 67108863(0x3ffffff, float:1.5046327E-36)
            r9 = r1 & r3
        L18d:
            int r0 = r0 + r9
            r2.f7708o = r0
            if (r28 == 0) goto L197
            r2.f7713t = r8
            int r14 = r14 + r7
            r2.f7702i = r14
        L197:
            if (r21 == 0) goto L19c
            r2.T(r15)
        L19c:
            return r10
    }

    public static java.lang.reflect.Field P(java.lang.Class r0, java.lang.String r1, java.lang.Class r2) {
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r0, r1)
            if (r0 == 0) goto L20
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L1c
            java.lang.Class r1 = r0.getType()
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L20
            return r0
        L20:
            r0 = 0
            return r0
    }

    public static void Q(org.json.JSONObject r10, byte[] r11, int r12, int r13) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r12) goto L12a
            r2 = 12
            if (r13 >= r2) goto L12a
            wa.a r1 = V(r11, r1, r12)
            int r2 = r1.f14893b
            long r3 = r1.f14892a
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L18
            goto L12a
        L18:
            r1 = 3
            long r7 = r3 >>> r1
            int r1 = (int) r7
            r7 = 7
            long r3 = r3 & r7
            int r3 = (int) r3
            if (r3 != 0) goto L30
            wa.a r2 = V(r11, r2, r12)
            int r3 = r2.f14893b
            long r4 = r2.f14892a
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto Lff
        L30:
            r4 = 1
            if (r3 != r4) goto L52
            int r3 = r2 + 8
            if (r3 <= r12) goto L39
            goto L12a
        L39:
            r4 = r0
        L3a:
            r7 = 8
            if (r4 >= r7) goto L4c
            int r7 = r2 + r4
            r7 = r11[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r7 = (long) r7
            int r9 = r4 * 8
            long r7 = r7 << r9
            long r5 = r5 | r7
            int r4 = r4 + 1
            goto L3a
        L4c:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            goto Lff
        L52:
            r4 = 2
            if (r3 != r4) goto Le1
            wa.a r2 = V(r11, r2, r12)
            int r3 = r2.f14893b
            long r4 = r2.f14892a
            int r2 = (int) r4
            if (r2 < 0) goto L12a
            int r4 = r3 + r2
            if (r4 <= r12) goto L66
            goto L12a
        L66:
            byte[] r5 = new byte[r2]
            java.lang.System.arraycopy(r11, r3, r5, r0, r2)
            int r2 = r13 + 1
            r3 = 12
            r6 = 0
            if (r2 >= r3) goto L8d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            int r7 = r5.length     // Catch: java.lang.Throwable -> L8d
            Q(r3, r5, r7, r2)     // Catch: java.lang.Throwable -> L8d
            byte[] r2 = q(r3)     // Catch: java.lang.Throwable -> L8d
            boolean r2 = java.util.Arrays.equals(r2, r5)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L8d
            m.a r2 = new m.a     // Catch: java.lang.Throwable -> L8d
            r7 = 27
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L8d
            r6 = r2
        L8d:
            if (r6 == 0) goto L9a
            java.lang.Object r2 = r6.f8069h
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            int r3 = r2.length()
            if (r3 <= 0) goto L9a
            goto Ldf
        L9a:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> Lac
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lac
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lac
            byte[] r3 = r2.getBytes(r3)     // Catch: java.lang.Throwable -> Lac
            boolean r3 = java.util.Arrays.equals(r3, r5)     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto Lac
            goto Ldf
        Lac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "hex->"
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r5.length
            r7 = 0
        Lba:
            if (r7 >= r6) goto Ld4
            r8 = r5[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "%02X"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            r3.append(r8)
            int r7 = r7 + 1
            goto Lba
        Ld4:
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        Ldf:
            r3 = r4
            goto Lff
        Le1:
            r4 = 5
            if (r3 != r4) goto L12a
            int r3 = r2 + 4
            if (r3 <= r12) goto Le9
            goto L12a
        Le9:
            r4 = r0
            r5 = r4
        Leb:
            r6 = 4
            if (r4 >= r6) goto Lfb
            int r6 = r2 + r4
            r6 = r11[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r4 * 8
            int r6 = r6 << r7
            r5 = r5 | r6
            int r4 = r4 + 1
            goto Leb
        Lfb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        Lff:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r4 = r10.has(r1)
            if (r4 != 0) goto L10d
            r10.put(r1, r2)
            goto L127
        L10d:
            java.lang.Object r4 = r10.get(r1)
            boolean r5 = r4 instanceof org.json.JSONArray
            if (r5 == 0) goto L118
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            goto L124
        L118:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r5.put(r4)
            r10.put(r1, r5)
            r4 = r5
        L124:
            r4.put(r2)
        L127:
            r1 = r3
            goto L2
        L12a:
            return
    }

    public static final long R(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = (float) r7
            float r6 = r6 + r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    public static final void S(android.view.ViewStructure r38, x1.f0 r39, android.view.autofill.AutofillId r40, java.lang.String r41, g2.b r42) {
            r0 = r38
            r1 = r39
            f2.x r2 = f2.u.f3223a
            f2.x r2 = f2.l.f3178a
            f2.m r2 = r1.w()
            r8 = 2
            r11 = 8
            r14 = 1
            if (r2 == 0) goto L1a0
            f.k0 r2 = r2.f3204g
            if (r2 == 0) goto L1a0
            java.lang.Object[] r15 = r2.f2849b
            r16 = 128(0x80, double:6.3E-322)
            java.lang.Object[] r3 = r2.f2850c
            long[] r2 = r2.f2848a
            int r4 = r2.length
            int r4 = r4 - r8
            r31 = r8
            if (r4 < 0) goto L179
            r28 = r14
            r5 = 0
            r6 = 0
            r18 = 255(0xff, double:1.26E-321)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 7
        L3e:
            r7 = r2[r5]
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = ~r7
            long r9 = r9 << r30
            long r9 = r9 & r7
            long r9 = r9 & r32
            int r9 = (r9 > r32 ? 1 : (r9 == r32 ? 0 : -1))
            if (r9 == 0) goto L173
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L57:
            if (r10 >= r9) goto L171
            long r34 = r7 & r18
            int r34 = (r34 > r16 ? 1 : (r34 == r16 ? 0 : -1))
            if (r34 >= 0) goto L16c
            int r34 = r5 << 3
            int r34 = r34 + r10
            r35 = r15[r34]
            r34 = r3[r34]
            r12 = r35
            f2.x r12 = (f2.x) r12
            f2.x r13 = f2.u.f3240r
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L7c
            r34.getClass()
            r6 = r34
            z0.d r6 = (z0.d) r6
            goto L16c
        L7c:
            f2.x r13 = f2.u.f3223a
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L96
            r34.getClass()
            java.util.List r34 = (java.util.List) r34
            java.lang.Object r12 = tf.m.v1(r34)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L16c
            r0.setContentDescription(r12)
            goto L16c
        L96:
            f2.x r13 = f2.u.f3239q
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto La7
            r34.getClass()
            r24 = r34
            z0.m r24 = (z0.m) r24
            goto L16c
        La7:
            f2.x r13 = f2.u.f3241s
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto Lb8
            r34.getClass()
            r23 = r34
            z0.f r23 = (z0.f) r23
            goto L16c
        Lb8:
            f2.x r13 = f2.u.F
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto Lc9
            r34.getClass()
            r22 = r34
            i2.g r22 = (i2.g) r22
            goto L16c
        Lc9:
            f2.x r13 = f2.u.f3234l
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto Ldf
            r34.getClass()
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            boolean r12 = r34.booleanValue()
            r0.setFocused(r12)
            goto L16c
        Ldf:
            f2.x r13 = f2.u.O
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto Lf0
            r34.getClass()
            r29 = r34
            java.lang.Integer r29 = (java.lang.Integer) r29
            goto L16c
        Lf0:
            f2.x r13 = f2.u.K
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto Lfc
            r27 = r14
            goto L16c
        Lfc:
            f2.x r13 = f2.u.f3236n
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L10e
            r34.getClass()
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            boolean r28 = r34.booleanValue()
            goto L16c
        L10e:
            f2.x r13 = f2.u.f3247y
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L11e
            r34.getClass()
            r26 = r34
            f2.i r26 = (f2.i) r26
            goto L16c
        L11e:
            f2.x r13 = f2.u.I
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L12e
            r34.getClass()
            r25 = r34
            java.lang.Boolean r25 = (java.lang.Boolean) r25
            goto L16c
        L12e:
            f2.x r13 = f2.u.J
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L13e
            r34.getClass()
            r21 = r34
            h2.a r21 = (h2.a) r21
            goto L16c
        L13e:
            f2.x r13 = f2.l.f3179b
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L14a
            r0.setClickable(r14)
            goto L16c
        L14a:
            f2.x r13 = f2.l.f3180c
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L156
            r0.setLongClickable(r14)
            goto L16c
        L156:
            f2.x r13 = f2.l.f3200w
            boolean r13 = gg.l.a(r12, r13)
            if (r13 == 0) goto L162
            r0.setFocusable(r14)
            goto L16c
        L162:
            f2.x r13 = f2.l.f3188k
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto L16c
            r20 = r14
        L16c:
            long r7 = r7 >> r11
            int r10 = r10 + 1
            goto L57
        L171:
            if (r9 != r11) goto L197
        L173:
            if (r5 == r4) goto L197
            int r5 = r5 + 1
            goto L3e
        L179:
            r18 = 255(0xff, double:1.26E-321)
            r30 = 7
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r28 = r14
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L197:
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r26
            goto L1be
        L1a0:
            r31 = r8
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r30 = 7
            r32 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r28 = r14
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r29 = 0
        L1be:
            f2.m r7 = r1.w()
            if (r7 == 0) goto L212
            boolean r8 = r7.f3206i
            if (r8 == 0) goto L212
            boolean r8 = r7.f3207j
            if (r8 == 0) goto L1cd
            goto L212
        L1cd:
            f2.m r7 = r7.c()
            f.f0 r8 = new f.f0
            java.util.List r9 = r1.n()
            f.d0 r9 = (f.d0) r9
            java.lang.Object r9 = r9.f2789h
            j0.b r9 = (j0.b) r9
            int r9 = r9.f6673i
            r8.<init>(r9)
            java.util.List r9 = r1.n()
            r8.c(r9)
        L1e9:
            boolean r9 = r8.i()
            if (r9 == 0) goto L212
            int r9 = r8.f2804b
            int r9 = r9 - r14
            java.lang.Object r9 = r8.k(r9)
            x1.f0 r9 = (x1.f0) r9
            f2.m r10 = r9.w()
            if (r10 == 0) goto L1e9
            boolean r12 = r10.f3206i
            if (r12 == 0) goto L203
            goto L1e9
        L203:
            r7.e(r10)
            boolean r10 = r10.f3207j
            if (r10 != 0) goto L1e9
            java.util.List r9 = r9.n()
            r8.c(r9)
            goto L1e9
        L212:
            if (r7 == 0) goto L29d
            f.k0 r7 = r7.f3204g
            if (r7 == 0) goto L29d
            java.lang.Object[] r8 = r7.f2849b
            java.lang.Object[] r9 = r7.f2850c
            long[] r7 = r7.f2848a
            int r10 = r7.length
            int r10 = r10 + (-2)
            r21 = r14
            if (r10 < 0) goto L29f
            r12 = 0
            r13 = 0
        L227:
            r14 = r7[r12]
            r22 = r11
            r23 = r12
            long r11 = ~r14
            long r11 = r11 << r30
            long r11 = r11 & r14
            long r11 = r11 & r32
            int r11 = (r11 > r32 ? 1 : (r11 == r32 ? 0 : -1))
            if (r11 == 0) goto L28c
            int r12 = r23 - r10
            int r11 = ~r12
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L23f:
            if (r12 >= r11) goto L281
            long r36 = r14 & r18
            int r26 = (r36 > r16 ? 1 : (r36 == r16 ? 0 : -1))
            if (r26 >= 0) goto L274
            int r26 = r23 << 3
            int r26 = r26 + r12
            r34 = r8[r26]
            r26 = r9[r26]
            r36 = r7
            r7 = r34
            f2.x r7 = (f2.x) r7
            r34 = r8
            f2.x r8 = f2.u.f3232j
            boolean r8 = gg.l.a(r7, r8)
            if (r8 == 0) goto L264
            r8 = 0
            r0.setEnabled(r8)
            goto L278
        L264:
            f2.x r8 = f2.u.B
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L278
            r26.getClass()
            r13 = r26
            java.util.List r13 = (java.util.List) r13
            goto L278
        L274:
            r36 = r7
            r34 = r8
        L278:
            long r14 = r14 >> r22
            int r12 = r12 + 1
            r8 = r34
            r7 = r36
            goto L23f
        L281:
            r36 = r7
            r34 = r8
            r7 = r22
            if (r11 != r7) goto L2a0
        L289:
            r8 = r23
            goto L293
        L28c:
            r36 = r7
            r34 = r8
            r7 = r22
            goto L289
        L293:
            if (r8 == r10) goto L2a0
            int r12 = r8 + 1
            r11 = r7
            r8 = r34
            r7 = r36
            goto L227
        L29d:
            r21 = r14
        L29f:
            r13 = 0
        L2a0:
            int r7 = r1.f20890h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            x1.f0 r8 = r1.u()
            if (r8 != 0) goto L2ad
            r7 = 0
        L2ad:
            if (r7 == 0) goto L2b6
            int r7 = r7.intValue()
        L2b3:
            r8 = r40
            goto L2b8
        L2b6:
            r7 = -1
            goto L2b3
        L2b8:
            r0.setAutofillId(r8, r7)
            r8 = r41
            r9 = 0
            r0.setId(r7, r8, r9, r9)
            if (r6 == 0) goto L2ca
            int r6 = r6.f22487a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            goto L2d9
        L2ca:
            if (r20 == 0) goto L2d1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            goto L2d9
        L2d1:
            if (r2 == 0) goto L2d8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r31)
            goto L2d9
        L2d8:
            r12 = r9
        L2d9:
            if (r12 == 0) goto L2e2
            int r6 = r12.intValue()
            r0.setAutofillType(r6)
        L2e2:
            if (r3 == 0) goto L315
            java.lang.String r3 = r3.f6314h
            int r6 = r3.length()
            r7 = 5000(0x1388, float:7.006E-42)
            if (r6 >= r7) goto L2ef
            goto L30e
        L2ef:
            r6 = 4999(0x1387, float:7.005E-42)
            char r8 = r3.charAt(r6)
            boolean r8 = java.lang.Character.isHighSurrogate(r8)
            if (r8 == 0) goto L30a
            char r8 = r3.charAt(r7)
            boolean r8 = java.lang.Character.isLowSurrogate(r8)
            if (r8 == 0) goto L30a
            java.lang.String r3 = og.m.P0(r6, r3)
            goto L30e
        L30a:
            java.lang.String r3 = og.m.P0(r7, r3)
        L30e:
            android.view.autofill.AutofillValue r3 = android.view.autofill.AutofillValue.forText(r3)
            r0.setAutofillValue(r3)
        L315:
            if (r4 == 0) goto L31c
            android.view.autofill.AutofillValue r3 = r4.f22489a
            r0.setAutofillValue(r3)
        L31c:
            if (r24 == 0) goto L327
            java.lang.String[] r3 = g4.a.t(r24)
            if (r3 == 0) goto L327
            r0.setAutofillHints(r3)
        L327:
            r3 = r42
            ac.k r3 = r3.f4147b
            int r4 = r1.f20890h
            z0.n r6 = new z0.n
            r6.<init>(r0)
            r3.P(r4, r6)
            if (r25 == 0) goto L33e
            boolean r3 = r25.booleanValue()
            r0.setSelected(r3)
        L33e:
            r8 = 4
            if (r2 == 0) goto L351
            r3 = r21
            r0.setCheckable(r3)
            h2.a r3 = h2.a.f5048g
            if (r2 != r3) goto L34c
            r2 = 1
            goto L34d
        L34c:
            r2 = 0
        L34d:
            r0.setChecked(r2)
            goto L366
        L351:
            if (r25 == 0) goto L366
            if (r5 != 0) goto L357
        L355:
            r3 = 1
            goto L35c
        L357:
            int r2 = r5.f3155a
            if (r2 != r8) goto L355
            goto L366
        L35c:
            r0.setCheckable(r3)
            boolean r2 = r25.booleanValue()
            r0.setChecked(r2)
        L366:
            z0.l r2 = z0.m.f22498a
            r2.getClass()
            z0.e r2 = z0.l.f22495b
            java.lang.String[] r2 = g4.a.t(r2)
            r2.getClass()
            int r3 = r2.length
            if (r3 == 0) goto L41a
            r35 = 0
            r2 = r2[r35]
            if (r24 == 0) goto L38f
            java.lang.String[] r3 = g4.a.t(r24)
            if (r3 == 0) goto L38f
            boolean r2 = tf.l.m0(r3, r2)
            r3 = 1
            if (r2 != r3) goto L38c
            r2 = r3
            goto L391
        L38c:
            r2 = r35
            goto L391
        L38f:
            r3 = 1
            goto L38c
        L391:
            if (r27 != 0) goto L399
            if (r2 == 0) goto L396
            goto L399
        L396:
            r2 = r35
            goto L39a
        L399:
            r2 = r3
        L39a:
            if (r2 != 0) goto L3a2
            if (r28 == 0) goto L39f
            goto L3a2
        L39f:
            r14 = r35
            goto L3a3
        L3a2:
            r14 = r3
        L3a3:
            r0.setDataIsSensitive(r14)
            x1.b1 r3 = r1.L
            x1.i1 r3 = r3.f20842d
            boolean r3 = r3.z1()
            if (r3 == 0) goto L3b1
            goto L3b3
        L3b1:
            r8 = r35
        L3b3:
            r0.setVisibility(r8)
            if (r13 == 0) goto L3e3
            int r3 = r13.size()
            java.lang.String r4 = ""
            r6 = r35
        L3c0:
            if (r6 >= r3) goto L3db
            java.lang.Object r7 = r13.get(r6)
            i2.g r7 = (i2.g) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = r7.f6314h
            r7 = 10
            java.lang.String r4 = eh.a.q(r8, r4, r7)
            int r6 = r6 + 1
            goto L3c0
        L3db:
            r0.setText(r4)
            java.lang.String r3 = "android.widget.TextView"
            r0.setClassName(r3)
        L3e3:
            java.util.List r1 = r1.n()
            f.d0 r1 = (f.d0) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3fc
            if (r5 == 0) goto L3fc
            int r1 = r5.f3155a
            java.lang.String r1 = y1.g0.v(r1)
            if (r1 == 0) goto L3fc
            r0.setClassName(r1)
        L3fc:
            if (r20 == 0) goto L419
            java.lang.String r1 = "android.widget.EditText"
            r0.setClassName(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L412
            if (r29 == 0) goto L412
            int r1 = r29.intValue()
            h3.c.i(r0, r1)
        L412:
            if (r2 == 0) goto L419
            r1 = 129(0x81, float:1.81E-43)
            r0.setInputType(r1)
        L419:
            return
        L41a:
            java.lang.String r0 = "Array is empty."
            j8.o.l(r0)
            return
    }

    public static fb.x0 T(fb.v r51, org.json.JSONObject r52, boolean r53, boolean r54) {
            r1 = r51
            r2 = r52
            r3 = r53
            java.lang.String r0 = r1.f3833k
            java.lang.String r4 = "deepseek"
            boolean r4 = gg.l.a(r0, r4)
            java.lang.String r5 = "image_url"
            java.lang.String r6 = "type"
            java.lang.String r7 = "content"
            java.lang.String r9 = "messages"
            if (r4 == 0) goto L59
            org.json.JSONArray r4 = r2.optJSONArray(r9)
            if (r4 == 0) goto L59
            int r11 = r4.length()
            r12 = 0
        L23:
            if (r12 < r11) goto L26
            goto L59
        L26:
            org.json.JSONObject r13 = r4.optJSONObject(r12)
            if (r13 == 0) goto L56
            org.json.JSONArray r13 = r13.optJSONArray(r7)
            if (r13 == 0) goto L56
            int r14 = r13.length()
            r15 = 0
        L37:
            if (r15 < r14) goto L3a
            goto L56
        L3a:
            org.json.JSONObject r8 = r13.optJSONObject(r15)
            if (r8 == 0) goto L45
            java.lang.String r8 = r8.optString(r6)
            goto L46
        L45:
            r8 = 0
        L46:
            boolean r8 = gg.l.a(r8, r5)
            if (r8 != 0) goto L4f
            int r15 = r15 + 1
            goto L37
        L4f:
            java.lang.String r0 = "DeepSeek 原生 Chat Completions 不支持图片输入"
            j8.o.t(r0)
            r0 = 0
            return r0
        L56:
            int r12 = r12 + 1
            goto L23
        L59:
            java.lang.String r4 = "anthropic"
            boolean r8 = gg.l.a(r0, r4)
            java.lang.String r11 = "hchat_cache_control"
            java.lang.String r12 = "data"
            java.lang.String r13 = "user"
            java.lang.String r14 = "{}"
            java.lang.String r15 = "arguments"
            java.lang.String r10 = "url"
            r16 = r8
            java.lang.String r8 = "tool_call_id"
            r17 = r13
            java.lang.String r13 = "tool"
            r18 = r11
            java.lang.String r11 = "developer"
            r19 = r12
            java.lang.String r12 = "role"
            r20 = r10
            java.lang.String r10 = "object"
            r21 = r5
            java.lang.String r5 = "parameters"
            r22 = r14
            java.lang.String r14 = "stream"
            r23 = r11
            r24 = r12
            java.lang.String r11 = "text"
            java.lang.String r12 = "name"
            r27 = r15
            java.lang.String r15 = "assistant"
            r28 = r15
            java.lang.String r15 = "model"
            r29 = r8
            java.lang.String r8 = "temperature"
            r30 = r13
            java.lang.String r13 = "system"
            java.lang.String r31 = ""
            r32 = r10
            java.lang.String r10 = "tools"
            r33 = r5
            java.lang.String r5 = "function"
            r34 = r12
            java.lang.String r12 = "description"
            r35 = r12
            java.lang.String r12 = "id"
            r36 = r12
            java.lang.String r12 = "tool_calls"
            if (r16 == 0) goto L5a4
            org.json.JSONArray r16 = r2.optJSONArray(r9)
            if (r16 == 0) goto Lc2
        Lbd:
            r37 = r16
            r16 = r12
            goto Lc8
        Lc2:
            org.json.JSONArray r16 = new org.json.JSONArray
            r16.<init>()
            goto Lbd
        Lc8:
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            r38 = r5
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r39 = 1
            r40 = r10
            if (r54 == 0) goto L113
            java.lang.String r10 = r1.f3832j
            boolean r4 = gg.l.a(r0, r4)
            if (r4 != 0) goto Le3
            goto Leb
        Le3:
            java.lang.String r4 = "off"
            boolean r4 = gg.l.a(r10, r4)
            if (r4 == 0) goto Led
        Leb:
            r0 = 0
            goto L10e
        Led:
            java.lang.String r4 = "force"
            boolean r4 = gg.l.a(r10, r4)
            if (r4 == 0) goto Lf8
            r0 = r39
            goto L10e
        Lf8:
            java.lang.String r4 = r1.f3823a
            java.lang.String r10 = r1.f3824b
            java.lang.String r0 = fb.w.p(r4, r0, r10)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            java.lang.String r4 = "api.anthropic.com"
            boolean r0 = og.t.X(r0, r4)
        L10e:
            if (r0 == 0) goto L113
            r4 = r39
            goto L114
        L113:
            r4 = 0
        L114:
            int r10 = r37.length()
            r1 = 0
        L119:
            java.lang.String r0 = "ephemeral"
            r54 = r4
            java.lang.String r4 = "cache_control"
            if (r1 < r10) goto L25c
            if (r54 == 0) goto L168
            int r1 = r12.length()
            int r1 = r1 + (-1)
        L129:
            r10 = -1
            if (r10 < r1) goto L12d
            goto L168
        L12d:
            org.json.JSONObject r10 = r12.optJSONObject(r1)
            if (r10 == 0) goto L15f
            org.json.JSONArray r10 = r10.optJSONArray(r7)
            if (r10 == 0) goto L15f
            int r17 = r10.length()
            int r17 = r17 + (-1)
            r18 = r1
            r37 = r7
            r1 = r17
        L145:
            r7 = -1
            if (r7 < r1) goto L149
            goto L163
        L149:
            org.json.JSONObject r7 = r10.optJSONObject(r1)
            if (r7 == 0) goto L15c
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r0 = r1.put(r6, r0)
            r7.put(r4, r0)
            goto L168
        L15c:
            int r1 = r1 + (-1)
            goto L145
        L15f:
            r18 = r1
            r37 = r7
        L163:
            int r1 = r18 + (-1)
            r7 = r37
            goto L129
        L168:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r2.optString(r15)
            r0.put(r15, r1)
            java.lang.String r1 = "max_tokens"
            r4 = 16384(0x4000, float:2.2959E-41)
            r0.put(r1, r4)
            r41 = r6
            r6 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r6 = r2.optDouble(r8, r6)
            r0.put(r8, r6)
            r0.put(r14, r3)
            int r1 = r5.length()
            if (r1 <= 0) goto L1ca
            if (r54 == 0) goto L195
            goto L1a5
        L195:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r5.length()
            r4 = 0
        L19f:
            if (r4 < r3) goto L1a9
            java.lang.String r5 = r1.toString()
        L1a5:
            r0.put(r13, r5)
            goto L1ca
        L1a9:
            int r6 = r1.length()
            if (r6 <= 0) goto L1b4
            java.lang.String r6 = "\n\n"
            r1.append(r6)
        L1b4:
            org.json.JSONObject r6 = r5.optJSONObject(r4)
            if (r6 == 0) goto L1bf
            java.lang.String r6 = r6.optString(r11)
            goto L1c0
        L1bf:
            r6 = 0
        L1c0:
            if (r6 != 0) goto L1c4
            r6 = r31
        L1c4:
            r1.append(r6)
            int r4 = r4 + 1
            goto L19f
        L1ca:
            r0.put(r9, r12)
            r6 = r40
            org.json.JSONArray r1 = r2.optJSONArray(r6)
            if (r1 == 0) goto La80
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            int r3 = r1.length()
            r4 = 0
        L1df:
            if (r4 < r3) goto L1ff
            r0.put(r6, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "auto"
            r7 = r41
            org.json.JSONObject r1 = r1.put(r7, r2)
            java.lang.String r2 = "disable_parallel_tool_use"
            r3 = 0
            org.json.JSONObject r1 = r1.put(r2, r3)
            java.lang.String r2 = "tool_choice"
            r0.put(r2, r1)
            goto La80
        L1ff:
            r7 = r41
            org.json.JSONObject r5 = r1.optJSONObject(r4)
            r8 = r38
            if (r5 == 0) goto L245
            org.json.JSONObject r5 = r5.optJSONObject(r8)
            if (r5 == 0) goto L245
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r10 = r34
            java.lang.String r11 = r5.optString(r10)
            r9.put(r10, r11)
            r11 = r35
            java.lang.String r12 = r5.optString(r11)
            r9.put(r11, r12)
            r12 = r33
            org.json.JSONObject r5 = r5.optJSONObject(r12)
            if (r5 == 0) goto L231
            r13 = r32
            goto L23c
        L231:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r13 = r32
            org.json.JSONObject r5 = r5.put(r7, r13)
        L23c:
            java.lang.String r14 = "input_schema"
            r9.put(r14, r5)
            r2.put(r9)
            goto L24d
        L245:
            r13 = r32
            r12 = r33
            r10 = r34
            r11 = r35
        L24d:
            int r4 = r4 + 1
            r41 = r7
            r38 = r8
            r34 = r10
            r35 = r11
            r33 = r12
            r32 = r13
            goto L1df
        L25c:
            r50 = r7
            r7 = r6
            r6 = r40
            r40 = r35
            r35 = r32
            r32 = r10
            r10 = r37
            r37 = r50
            r50 = r34
            r34 = r14
            r14 = r50
            r50 = r33
            r33 = r15
            r15 = r38
            r38 = r50
            org.json.JSONObject r3 = r10.optJSONObject(r1)
            r41 = r1
            if (r3 == 0) goto L54b
            r1 = r24
            r24 = r10
            java.lang.String r10 = r3.optString(r1)
            boolean r42 = gg.l.a(r10, r13)
            if (r42 != 0) goto L512
            r42 = r13
            r13 = r23
            boolean r23 = gg.l.a(r10, r13)
            if (r23 == 0) goto L2b9
            r23 = r13
        L29b:
            r43 = r1
            r46 = r15
            r49 = r16
            r13 = r19
            r48 = r27
            r10 = r28
            r44 = r29
            r15 = r36
            r29 = r6
            r16 = r12
            r6 = r37
            r37 = r8
            r8 = r20
            r20 = r22
            goto L516
        L2b9:
            r23 = r13
            r13 = r30
            boolean r0 = gg.l.a(r10, r13)
            if (r0 == 0) goto L343
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.lang.String r0 = "tool_result"
            r30 = r13
            org.json.JSONObject r13 = wb.en.k(r7, r0)
            java.lang.String r0 = "tool_use_id"
            r43 = r1
            r1 = r29
            r29 = r6
            java.lang.String r6 = r3.optString(r1)
            r13.put(r0, r6)
            r6 = r37
            java.lang.Object r0 = r3.opt(r6)
            java.lang.String r0 = h(r0)
            r13.put(r6, r0)
            java.lang.Object r0 = r3.opt(r6)
            r37 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L320
            r44 = r1
            java.lang.String r1 = h(r37)     // Catch: java.lang.Throwable -> L31c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31c
            java.lang.String r1 = "isError"
            r37 = r8
            r8 = 0
            boolean r1 = r0.optBoolean(r1, r8)     // Catch: java.lang.Throwable -> L313
            if (r1 != 0) goto L315
            java.lang.String r1 = "error"
            boolean r0 = r0.optBoolean(r1, r8)     // Catch: java.lang.Throwable -> L313
            if (r0 == 0) goto L311
            goto L315
        L311:
            r0 = 0
            goto L317
        L313:
            r0 = move-exception
            goto L324
        L315:
            r0 = r39
        L317:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L313
            goto L32a
        L31c:
            r0 = move-exception
        L31d:
            r37 = r8
            goto L324
        L320:
            r0 = move-exception
            r44 = r1
            goto L31d
        L324:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L32a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L331
            r0 = r1
        L331:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "is_error"
            r13.put(r1, r0)
            org.json.JSONArray r0 = r4.put(r13)
        L340:
            r4 = r28
            goto L388
        L343:
            r43 = r1
            r30 = r13
            r44 = r29
            r29 = r6
            r6 = r37
            r37 = r8
            java.lang.Object r0 = r3.opt(r6)
            boolean r1 = r0 instanceof org.json.JSONArray
            if (r1 != 0) goto L378
            java.lang.String r0 = h(r0)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            boolean r4 = og.m.t0(r0)
            if (r4 != 0) goto L376
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r4 = r4.put(r7, r11)
            org.json.JSONObject r0 = r4.put(r11, r0)
            r1.put(r0)
        L376:
            r0 = r1
            goto L340
        L378:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r8 = r0
            org.json.JSONArray r8 = (org.json.JSONArray) r8
            int r13 = r8.length()
            r0 = 0
        L385:
            if (r0 < r13) goto L432
            goto L376
        L388:
            boolean r1 = gg.l.a(r10, r4)
            if (r1 == 0) goto L39f
            r1 = r16
            org.json.JSONArray r3 = r3.optJSONArray(r1)
            if (r3 == 0) goto L39d
            int r8 = r3.length()
            r13 = 0
        L39b:
            if (r13 < r8) goto L3a7
        L39d:
            r16 = r1
        L39f:
            r46 = r15
            r13 = r27
            r15 = r36
            goto L412
        L3a7:
            r16 = r1
            org.json.JSONObject r1 = r3.optJSONObject(r13)
            r28 = r3
            if (r1 == 0) goto L3ff
            org.json.JSONObject r3 = r1.optJSONObject(r15)
            r45 = r8
            if (r3 == 0) goto L3f6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r46 = r15
            java.lang.String r15 = "toolu_"
            r8.<init>(r15)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            r15 = r36
            java.lang.String r1 = r1.optString(r15, r8)
            java.lang.String r8 = r3.optString(r14)
            r36 = r13
            java.lang.String r13 = "tool_use"
            org.json.JSONObject r1 = wb.en.l(r7, r13, r15, r1)
            r1.put(r14, r8)
            r8 = r22
            r13 = r27
            java.lang.String r3 = r3.optString(r13, r8)
            r3.getClass()
            org.json.JSONObject r3 = K(r3)
            java.lang.String r8 = "input"
            r1.put(r8, r3)
            r0.put(r1)
            goto L402
        L3f6:
            r46 = r15
            r15 = r36
            r36 = r13
            r13 = r27
            goto L402
        L3ff:
            r45 = r8
            goto L3f6
        L402:
            int r1 = r36 + 1
            r27 = r13
            r36 = r15
            r3 = r28
            r8 = r45
            r15 = r46
            r13 = r1
            r1 = r16
            goto L39b
        L412:
            boolean r1 = gg.l.a(r10, r4)
            if (r1 == 0) goto L41a
            r1 = r4
            goto L41c
        L41a:
            r1 = r17
        L41c:
            r0.getClass()
            e(r12, r1, r0)
            r10 = r4
            r48 = r13
            r49 = r16
            r13 = r18
            r8 = r20
            r20 = r22
            r16 = r12
        L42f:
            r12 = 0
            goto L56c
        L432:
            r46 = r27
            r27 = r10
            r10 = r22
            r22 = r13
            r13 = r16
            r16 = r12
            r12 = r46
            r46 = r15
            r15 = r36
            org.json.JSONObject r4 = r8.optJSONObject(r0)
            r36 = r0
            if (r4 == 0) goto L477
            java.lang.String r0 = r4.optString(r7)
            boolean r45 = gg.l.a(r0, r11)
            if (r45 == 0) goto L485
            java.lang.String r0 = r4.optString(r11)
            r0.getClass()
            boolean r4 = og.m.t0(r0)
            if (r4 != 0) goto L464
            goto L465
        L464:
            r0 = 0
        L465:
            if (r0 == 0) goto L477
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r4 = r4.put(r7, r11)
            org.json.JSONObject r0 = r4.put(r11, r0)
            r1.put(r0)
        L477:
            r45 = r8
        L479:
            r48 = r12
            r49 = r13
            r13 = r19
            r4 = r20
            r20 = r10
            goto L4f8
        L485:
            r45 = r8
            r8 = r21
            boolean r0 = gg.l.a(r0, r8)
            if (r0 == 0) goto L4f5
            org.json.JSONObject r0 = r4.optJSONObject(r8)
            r4 = r20
            if (r0 == 0) goto L49c
            java.lang.String r0 = r0.optString(r4)
            goto L49d
        L49c:
            r0 = 0
        L49d:
            if (r0 != 0) goto L4a1
            r0 = r31
        L4a1:
            fb.w0 r0 = H(r0)
            r21 = r8
            if (r0 == 0) goto L4ec
            java.lang.String r8 = r0.f3841c
            r20 = r10
            boolean r10 = r0.f3839a
            r47 = r10
            java.lang.String r10 = "image"
            org.json.JSONObject r10 = wb.en.k(r7, r10)
            r48 = r12
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            if (r47 == 0) goto L4c9
            java.lang.String r49 = "base64"
            r50 = r49
            r49 = r13
            r13 = r50
            goto L4cc
        L4c9:
            r49 = r13
            r13 = r4
        L4cc:
            r12.put(r7, r13)
            if (r47 == 0) goto L4de
            java.lang.String r13 = "media_type"
            java.lang.String r0 = r0.f3840b
            r12.put(r13, r0)
            r13 = r19
            r12.put(r13, r8)
            goto L4e3
        L4de:
            r13 = r19
            r12.put(r4, r8)
        L4e3:
            java.lang.String r0 = "source"
            r10.put(r0, r12)
            r1.put(r10)
            goto L4f8
        L4ec:
            r20 = r10
            r48 = r12
            r49 = r13
            r13 = r19
            goto L4f8
        L4f5:
            r21 = r8
            goto L479
        L4f8:
            int r0 = r36 + 1
            r19 = r13
            r36 = r15
            r12 = r16
            r13 = r22
            r10 = r27
            r8 = r45
            r15 = r46
            r27 = r48
            r16 = r49
            r22 = r20
            r20 = r4
            goto L385
        L512:
            r42 = r13
            goto L29b
        L516:
            java.lang.Object r1 = r3.opt(r6)
            java.lang.String r1 = h(r1)
            boolean r12 = og.m.t0(r1)
            if (r12 != 0) goto L545
            org.json.JSONObject r1 = wb.en.l(r7, r11, r11, r1)
            r19 = r13
            r13 = r18
            r12 = 0
            boolean r3 = r3.optBoolean(r13, r12)
            if (r3 == 0) goto L541
            if (r54 == 0) goto L541
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r0 = r3.put(r7, r0)
            r1.put(r4, r0)
        L541:
            r5.put(r1)
            goto L56c
        L545:
            r19 = r13
            r13 = r18
            goto L42f
        L54b:
            r42 = r13
            r46 = r15
            r49 = r16
            r13 = r18
            r43 = r24
            r48 = r27
            r44 = r29
            r15 = r36
            r29 = r6
            r24 = r10
            r16 = r12
            r10 = r28
            r6 = r37
            r12 = 0
            r37 = r8
            r8 = r20
            r20 = r22
        L56c:
            int r1 = r41 + 1
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r34
            r34 = r14
            r14 = r3
            r3 = r53
            r4 = r54
            r28 = r10
            r18 = r13
            r36 = r15
            r12 = r16
            r22 = r20
            r10 = r32
            r15 = r33
            r32 = r35
            r33 = r38
            r35 = r40
            r13 = r42
            r38 = r46
            r27 = r48
            r16 = r49
            r20 = r8
            r40 = r29
            r8 = r37
            r29 = r44
            r37 = r24
            r24 = r43
            goto L119
        L5a4:
            r37 = r7
            r7 = r6
            r6 = r37
            r37 = r34
            r34 = r14
            r14 = r37
            r46 = r5
            r37 = r8
            r49 = r12
            r42 = r13
            r13 = r18
            r8 = r20
            r20 = r22
            r43 = r24
            r48 = r27
            r44 = r29
            r38 = r33
            r40 = r35
            r12 = 0
            r29 = r10
            r33 = r15
            r10 = r28
            r35 = r32
            r15 = r36
            java.lang.String r1 = "gemini"
            boolean r0 = gg.l.a(r0, r1)
            java.lang.String r1 = "provider_metadata"
            if (r0 == 0) goto La00
            org.json.JSONArray r0 = r2.optJSONArray(r9)
            if (r0 == 0) goto L5e4
        L5e2:
            r3 = r0
            goto L5ea
        L5e4:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            goto L5e2
        L5ea:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            int r12 = r3.length()
            r16 = r8
            r8 = 0
        L605:
            if (r8 < r12) goto L6f8
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r5.length()
            if (r1 <= 0) goto L622
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "parts"
            org.json.JSONObject r1 = r1.put(r3, r5)
            java.lang.String r3 = "systemInstruction"
            r0.put(r3, r1)
        L622:
            java.lang.String r1 = "contents"
            r0.put(r1, r4)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5 = r37
            r3 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r3 = r2.optDouble(r5, r3)
            r1.put(r5, r3)
            java.lang.String r3 = "response_format"
            boolean r3 = r2.has(r3)
            if (r3 == 0) goto L649
            java.lang.String r3 = "responseMimeType"
            java.lang.String r4 = "application/json"
            r1.put(r3, r4)
        L649:
            java.lang.String r3 = "generationConfig"
            r0.put(r3, r1)
            r1 = r29
            org.json.JSONArray r2 = r2.optJSONArray(r1)
            if (r2 == 0) goto L696
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            int r6 = r2.length()
            r10 = 0
        L66a:
            if (r10 < r6) goto L699
            java.lang.String r2 = "functionDeclarations"
            org.json.JSONObject r2 = r4.put(r2, r5)
            org.json.JSONArray r2 = r3.put(r2)
            r0.put(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "mode"
            java.lang.String r4 = "AUTO"
            org.json.JSONObject r2 = r2.put(r3, r4)
            java.lang.String r3 = "functionCallingConfig"
            org.json.JSONObject r1 = r1.put(r3, r2)
            java.lang.String r2 = "toolConfig"
            r0.put(r2, r1)
        L696:
            r53 = r0
            goto L6f4
        L699:
            org.json.JSONObject r8 = r2.optJSONObject(r10)
            r9 = r46
            if (r8 == 0) goto L6de
            org.json.JSONObject r8 = r8.optJSONObject(r9)
            if (r8 == 0) goto L6de
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r12 = r8.optString(r14)
            r11.put(r14, r12)
            r12 = r40
            java.lang.String r13 = r8.optString(r12)
            r11.put(r12, r13)
            r13 = r38
            org.json.JSONObject r8 = r8.optJSONObject(r13)
            if (r8 == 0) goto L6c9
            r15 = r35
        L6c6:
            r53 = r0
            goto L6d5
        L6c9:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            r15 = r35
            org.json.JSONObject r8 = r8.put(r7, r15)
            goto L6c6
        L6d5:
            java.lang.String r0 = "parametersJsonSchema"
            r11.put(r0, r8)
            r5.put(r11)
            goto L6e6
        L6de:
            r53 = r0
            r15 = r35
            r13 = r38
            r12 = r40
        L6e6:
            int r10 = r10 + 1
            r0 = r53
            r46 = r9
            r40 = r12
            r38 = r13
            r35 = r15
            goto L66a
        L6f4:
            r0 = r53
            goto La80
        L6f8:
            r32 = r35
            r35 = r40
            r2 = r46
            r25 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            org.json.JSONObject r0 = r3.optJSONObject(r8)
            if (r0 == 0) goto L9ca
            r54 = r3
            r18 = r8
            r3 = r43
            java.lang.String r8 = r0.optString(r3)
            r24 = r3
            r3 = r42
            boolean r22 = gg.l.a(r8, r3)
            if (r22 != 0) goto L727
            r3 = r23
            boolean r22 = gg.l.a(r8, r3)
            if (r22 == 0) goto L73c
            r23 = r3
        L727:
            r46 = r2
            r28 = r4
            r27 = r5
            r41 = r7
            r53 = r9
            r22 = r12
            r9 = r13
            r13 = r16
            r7 = r19
            r12 = r49
            goto L9b3
        L73c:
            r23 = r3
            r3 = r30
            boolean r22 = gg.l.a(r8, r3)
            if (r22 == 0) goto L7bb
            r30 = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r22 = r12
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r27 = r5
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r28 = r4
            r41 = r7
            r7 = r44
            java.lang.String r4 = r0.optString(r7)
            java.lang.Object r34 = r13.get(r4)
            java.lang.String r34 = (java.lang.String) r34
            if (r34 == 0) goto L77f
            boolean r36 = og.m.t0(r34)
            r44 = r7
            if (r36 != 0) goto L778
            r7 = r34
            goto L779
        L778:
            r7 = 0
        L779:
            if (r7 == 0) goto L781
            r5.put(r15, r7)
            goto L781
        L77f:
            r44 = r7
        L781:
            java.lang.Object r4 = r9.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L78b
            r4 = r31
        L78b:
            boolean r7 = og.m.t0(r4)
            if (r7 == 0) goto L793
            r4 = r30
        L793:
            r5.put(r14, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.Object r7 = r0.opt(r6)
            java.lang.String r7 = h(r7)
            r53 = r13
            java.lang.String r13 = "result"
            org.json.JSONObject r4 = r4.put(r13, r7)
            java.lang.String r7 = "response"
            r5.put(r7, r4)
            java.lang.String r4 = "functionResponse"
            org.json.JSONObject r4 = r12.put(r4, r5)
            org.json.JSONArray r3 = r3.put(r4)
            goto L7f8
        L7bb:
            r30 = r3
            r28 = r4
            r27 = r5
            r41 = r7
            r22 = r12
            r53 = r13
            java.lang.Object r3 = r0.opt(r6)
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 != 0) goto L7e9
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r3 = h(r3)
            org.json.JSONObject r3 = r5.put(r11, r3)
            org.json.JSONArray r3 = r4.put(r3)
            r3.getClass()
            goto L7f8
        L7e9:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r5 = r3.length()
            r7 = 0
        L7f5:
            if (r7 < r5) goto L8fe
            r3 = r4
        L7f8:
            boolean r4 = gg.l.a(r8, r10)
            if (r4 == 0) goto L8d6
            r12 = r49
            org.json.JSONArray r4 = r0.optJSONArray(r12)
            if (r4 == 0) goto L80d
            int r5 = r4.length()
            r7 = 0
        L80b:
            if (r7 < r5) goto L818
        L80d:
            r7 = r9
            r9 = r53
            r53 = r7
            r46 = r2
            r7 = r48
            goto L8e1
        L818:
            org.json.JSONObject r0 = r4.optJSONObject(r7)
            if (r0 == 0) goto L8b4
            org.json.JSONObject r13 = r0.optJSONObject(r2)
            if (r13 == 0) goto L8b4
            r46 = r2
            java.lang.String r2 = r0.optString(r15)
            r34 = r4
            java.lang.String r4 = r13.optString(r14)
            r9.put(r2, r4)
            java.lang.String r0 = r0.optString(r1)
            r0.getClass()
            boolean r36 = og.m.t0(r0)
            if (r36 != 0) goto L841
            goto L842
        L841:
            r0 = 0
        L842:
            if (r0 == 0) goto L862
            r36 = r5
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L852
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L852
            java.lang.String r0 = "part"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L852
            goto L859
        L852:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L859:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L85f
            r0 = 0
        L85f:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L865
        L862:
            r36 = r5
            r0 = 0
        L865:
            java.lang.String r5 = "functionCall"
            r39 = r7
            if (r0 == 0) goto L876
            org.json.JSONObject r7 = r0.optJSONObject(r5)
            if (r7 == 0) goto L876
            java.lang.String r7 = r7.optString(r15)
            goto L877
        L876:
            r7 = 0
        L877:
            if (r7 != 0) goto L881
            r7 = r9
            r9 = r53
            r53 = r7
            r7 = r31
            goto L887
        L881:
            r50 = r9
            r9 = r53
            r53 = r50
        L887:
            r9.put(r2, r7)
            if (r0 == 0) goto L88f
            r7 = r48
            goto L8b0
        L88f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r2 = wb.en.k(r14, r4)
            r4 = r20
            r7 = r48
            java.lang.String r13 = r13.optString(r7, r4)
            r13.getClass()
            org.json.JSONObject r13 = K(r13)
            java.lang.String r4 = "args"
            r2.put(r4, r13)
            org.json.JSONObject r0 = r0.put(r5, r2)
        L8b0:
            r3.put(r0)
            goto L8c4
        L8b4:
            r34 = r9
            r9 = r53
            r53 = r34
            r46 = r2
            r34 = r4
            r36 = r5
            r39 = r7
            r7 = r48
        L8c4:
            int r0 = r39 + 1
            r2 = r9
            r9 = r53
            r53 = r2
            r48 = r7
            r4 = r34
            r5 = r36
            r2 = r46
            r7 = r0
            goto L80b
        L8d6:
            r7 = r9
            r9 = r53
            r53 = r7
            r46 = r2
            r7 = r48
            r12 = r49
        L8e1:
            boolean r0 = gg.l.a(r8, r10)
            if (r0 == 0) goto L8ea
            r0 = r33
            goto L8ec
        L8ea:
            r0 = r17
        L8ec:
            r3.getClass()
            r2 = r28
            e(r2, r0, r3)
            r48 = r7
            r13 = r16
            r7 = r19
            r2 = r27
            goto L9e2
        L8fe:
            r12 = r9
            r9 = r53
            r53 = r12
            r46 = r2
            r2 = r28
            r12 = r49
            org.json.JSONObject r13 = r3.optJSONObject(r7)
            r34 = r3
            if (r13 == 0) goto L92f
            r2 = r41
            java.lang.String r3 = r13.optString(r2)
            boolean r36 = gg.l.a(r3, r11)
            if (r36 == 0) goto L93b
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r13 = r13.optString(r11)
            org.json.JSONObject r3 = r3.put(r11, r13)
            r4.put(r3)
            r41 = r2
        L92f:
            r36 = r7
            r39 = r8
            r13 = r16
            r7 = r19
            r16 = r5
            goto L99b
        L93b:
            r41 = r2
            r2 = r21
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L998
            org.json.JSONObject r3 = r13.optJSONObject(r2)
            r13 = r16
            if (r3 == 0) goto L952
            java.lang.String r3 = r3.optString(r13)
            goto L953
        L952:
            r3 = 0
        L953:
            if (r3 != 0) goto L957
            r3 = r31
        L957:
            fb.w0 r3 = H(r3)
            r21 = r2
            if (r3 == 0) goto L98f
            boolean r2 = r3.f3839a
            if (r2 == 0) goto L964
            goto L965
        L964:
            r3 = 0
        L965:
            if (r3 == 0) goto L98f
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r16 = r5
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r36 = r7
            java.lang.String r7 = "mimeType"
            r39 = r8
            java.lang.String r8 = r3.f3840b
            r5.put(r7, r8)
            java.lang.String r3 = r3.f3841c
            r7 = r19
            r5.put(r7, r3)
            java.lang.String r3 = "inlineData"
            org.json.JSONObject r2 = r2.put(r3, r5)
            r4.put(r2)
            goto L99b
        L98f:
            r16 = r5
            r36 = r7
            r39 = r8
            r7 = r19
            goto L99b
        L998:
            r21 = r2
            goto L92f
        L99b:
            int r2 = r36 + 1
            r3 = r9
            r9 = r53
            r53 = r3
            r19 = r7
            r49 = r12
            r5 = r16
            r3 = r34
            r8 = r39
            r7 = r2
            r16 = r13
            r2 = r46
            goto L7f5
        L9b3:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.Object r0 = r0.opt(r6)
            java.lang.String r0 = h(r0)
            org.json.JSONObject r0 = r2.put(r11, r0)
            r2 = r27
            r2.put(r0)
            goto L9e2
        L9ca:
            r46 = r2
            r54 = r3
            r28 = r4
            r2 = r5
            r41 = r7
            r18 = r8
            r53 = r9
            r22 = r12
            r9 = r13
            r13 = r16
            r7 = r19
            r24 = r43
            r12 = r49
        L9e2:
            int r8 = r18 + 1
            r3 = r54
            r5 = r2
            r19 = r7
            r49 = r12
            r16 = r13
            r12 = r22
            r43 = r24
            r4 = r28
            r40 = r35
            r7 = r41
            r2 = r52
            r13 = r9
            r35 = r32
            r9 = r53
            goto L605
        La00:
            r12 = r49
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r2 = r52.toString()
            r0.<init>(r2)
            r3 = r53
            r2 = r34
            org.json.JSONObject r2 = r0.put(r2, r3)
            org.json.JSONArray r3 = r2.optJSONArray(r9)
            if (r3 == 0) goto La7f
            int r4 = r3.length()
            r5 = 0
        La1e:
            if (r5 < r4) goto La21
            goto La7f
        La21:
            org.json.JSONObject r0 = r3.optJSONObject(r5)
            if (r0 == 0) goto La7c
            r0.remove(r13)
            java.lang.String r6 = "reasoning_content"
            r0.remove(r6)
            org.json.JSONArray r6 = r0.optJSONArray(r12)
            if (r6 == 0) goto La7c
            int r7 = r6.length()
            r8 = 0
        La3a:
            if (r8 < r7) goto La3d
            goto La7c
        La3d:
            org.json.JSONObject r9 = r6.optJSONObject(r8)
            if (r9 == 0) goto La79
            java.lang.String r0 = r9.optString(r1)
            r0.getClass()
            boolean r10 = og.m.t0(r0)
            if (r10 != 0) goto La51
            goto La52
        La51:
            r0 = 0
        La52:
            if (r0 == 0) goto La68
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La5a
            r10.<init>(r0)     // Catch: java.lang.Throwable -> La5a
            goto La60
        La5a:
            r0 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r0)
        La60:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto La65
            r10 = 0
        La65:
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            goto La69
        La68:
            r10 = 0
        La69:
            r9.remove(r1)
            if (r10 == 0) goto La79
            java.lang.String r0 = "extra_content"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto La79
            r9.put(r0, r10)
        La79:
            int r8 = r8 + 1
            goto La3a
        La7c:
            int r5 = r5 + 1
            goto La1e
        La7f:
            r0 = r2
        La80:
            fb.x0 r1 = new fb.x0
            uf.g r2 = G(r51)
            r1.<init>(r0, r2)
            return r1
    }

    public static void U(java.io.File r2, byte[] r3, int r4) {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r2, r1)
            r2 = 0
        L8:
            if (r2 >= r4) goto L1a
            int r1 = r4 - r2
            int r1 = r0.read(r3, r2, r1)     // Catch: java.lang.Throwable -> L15
            if (r1 >= 0) goto L13
            goto L1a
        L13:
            int r2 = r2 + r1
            goto L8
        L15:
            r2 = move-exception
            j(r0)
            throw r2
        L1a:
            j(r0)
            return
    }

    public static wa.a V(byte[] r6, int r7, int r8) {
            r0 = 0
            r2 = 0
        L3:
            if (r7 >= r8) goto L20
            r3 = 64
            if (r2 >= r3) goto L20
            int r3 = r7 + 1
            r7 = r6[r7]
            r4 = r7 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 != 0) goto L1c
            wa.a r6 = new wa.a
            r6.<init>(r0, r3)
            return r6
        L1c:
            int r2 = r2 + 7
            r7 = r3
            goto L3
        L20:
            java.lang.String r6 = "bad varint"
            j8.o.t(r6)
            r6 = 0
            return r6
    }

    public static final long W(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = java.lang.Math.round(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = java.lang.Math.round(r6)
            long r4 = (long) r1
            long r0 = r4 << r0
            long r6 = (long) r6
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static int X(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Lb
            int r1 = java.lang.Math.round(r1)
            return r1
        Lb:
            java.lang.String r1 = "Cannot round NaN value."
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String Y(android.content.Context r7, java.lang.String r8, android.net.Uri r9) {
            java.lang.String r0 = "[^A-Za-z0-9_-]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = "_"
            java.util.regex.Matcher r8 = r0.matcher(r8)
            java.lang.String r8 = r8.replaceAll(r1)
            r8.getClass()
            r0 = 96
            java.lang.String r8 = og.m.P0(r0, r8)
            int r0 = r8.length()
            r1 = 0
            if (r0 != 0) goto L25
            goto Lca
        L25:
            android.graphics.Bitmap r9 = l(r7, r9)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r9 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        L31:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L37
            r9 = r1
        L37:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto Lca
            java.io.File r0 = new java.io.File
            java.io.File r7 = ub.b.d(r7)
            java.lang.String r2 = "FloatingShortcut/icons"
            r0.<init>(r7, r2)
            r0.mkdirs()
            java.io.File r7 = new java.io.File
            java.lang.String r2 = ".png"
            java.lang.String r2 = r8.concat(r2)
            r7.<init>(r0, r2)
            java.io.File r2 = new java.io.File
            long r3 = java.lang.System.nanoTime()
            java.lang.String r5 = "."
            java.lang.String r6 = "-"
            java.lang.StringBuilder r8 = eh.a.v(r5, r8, r6, r3)
            java.lang.String r3 = ".tmp"
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r2.<init>(r0, r8)
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc0
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lc0
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> Lb0
            r3 = 100
            boolean r0 = r9.compress(r0, r3, r8)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Lb2
            java.io.FileDescriptor r0 = r8.getFD()     // Catch: java.lang.Throwable -> Lb0
            r0.sync()     // Catch: java.lang.Throwable -> Lb0
            r8.close()     // Catch: java.lang.Throwable -> Lc0
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> Lc0
            if (r8 == 0) goto L9c
            boolean r8 = r7.delete()     // Catch: java.lang.Throwable -> Lc0
            if (r8 == 0) goto L94
            goto L9c
        L94:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r8 = "无法替换旧图标"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc0
            throw r7     // Catch: java.lang.Throwable -> Lc0
        L9c:
            boolean r8 = r2.renameTo(r7)     // Catch: java.lang.Throwable -> Lc0
            if (r8 != 0) goto La8
            dg.l.a0(r2, r7)     // Catch: java.lang.Throwable -> Lc0
            r2.delete()     // Catch: java.lang.Throwable -> Lc0
        La8:
            java.lang.String r1 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc0
        Lac:
            r9.recycle()
            goto Lc4
        Lb0:
            r7 = move-exception
            goto Lba
        Lb2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lb0
            throw r7     // Catch: java.lang.Throwable -> Lb0
        Lba:
            throw r7     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            i(r8, r7)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r2.delete()     // Catch: java.lang.Throwable -> Lc5
            goto Lac
        Lc4:
            return r1
        Lc5:
            r7 = move-exception
            r9.recycle()
            throw r7
        Lca:
            return r1
    }

    public static org.json.JSONObject Z(byte[] r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto Lb
            byte[] r5 = new byte[r1]     // Catch: java.lang.Throwable -> L27
            goto L23
        Lb:
            int r2 = r5.length     // Catch: java.lang.Throwable -> L27
            r3 = 4
            if (r2 < r3) goto L17
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L27
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 != 0) goto L1b
            goto L23
        L1b:
            int r2 = r5.length     // Catch: java.lang.Throwable -> L27
            int r2 = r2 - r3
            byte[] r4 = new byte[r2]     // Catch: java.lang.Throwable -> L27
            java.lang.System.arraycopy(r5, r3, r4, r1, r2)     // Catch: java.lang.Throwable -> L27
            r5 = r4
        L23:
            int r2 = r5.length     // Catch: java.lang.Throwable -> L27
            Q(r0, r5, r2, r1)     // Catch: java.lang.Throwable -> L27
        L27:
            return r0
    }

    public static final void a(boolean r46, s0.d r47, sh.y r48, sh.g0 r49, fg.a r50, fg.a r51, float r52, s0.d r53, i0.h0 r54, int r55) {
            r1 = r46
            r8 = r47
            r9 = r48
            r10 = r50
            r11 = r51
            r15 = r54
            r12 = r55
            r0 = -225084053(0xfffffffff2957d6b, float:-5.9219056E30)
            r15.b0(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L23
            boolean r0 = r15.g(r1)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r12
            goto L24
        L23:
            r0 = r12
        L24:
            r2 = r12 & 48
            if (r2 != 0) goto L34
            boolean r2 = r15.h(r8)
            if (r2 == 0) goto L31
            r2 = 32
            goto L33
        L31:
            r2 = 16
        L33:
            r0 = r0 | r2
        L34:
            r2 = r12 & 384(0x180, float:5.38E-43)
            y0.l r4 = y0.l.f21818a
            if (r2 != 0) goto L46
            boolean r2 = r15.f(r4)
            if (r2 == 0) goto L43
            r2 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r2 = 128(0x80, float:1.8E-43)
        L45:
            r0 = r0 | r2
        L46:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L56
            boolean r2 = r15.f(r9)
            if (r2 == 0) goto L53
            r2 = 2048(0x800, float:2.87E-42)
            goto L55
        L53:
            r2 = 1024(0x400, float:1.435E-42)
        L55:
            r0 = r0 | r2
        L56:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L6a
            int r2 = r49.ordinal()
            boolean r2 = r15.d(r2)
            if (r2 == 0) goto L67
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L69
        L67:
            r2 = 8192(0x2000, float:1.148E-41)
        L69:
            r0 = r0 | r2
        L6a:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r12
            r5 = 1
            if (r2 != 0) goto L7c
            boolean r2 = r15.g(r5)
            if (r2 == 0) goto L79
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L7b
        L79:
            r2 = 65536(0x10000, float:9.1835E-41)
        L7b:
            r0 = r0 | r2
        L7c:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r12
            if (r2 != 0) goto L8d
            boolean r2 = r15.h(r10)
            if (r2 == 0) goto L8a
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L8c
        L8a:
            r2 = 524288(0x80000, float:7.34684E-40)
        L8c:
            r0 = r0 | r2
        L8d:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r12
            if (r2 != 0) goto L9e
            boolean r2 = r15.h(r11)
            if (r2 == 0) goto L9b
            r2 = 8388608(0x800000, float:1.1754944E-38)
            goto L9d
        L9b:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L9d:
            r0 = r0 | r2
        L9e:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 & r12
            r6 = 0
            if (r2 != 0) goto Lb0
            boolean r2 = r15.f(r6)
            if (r2 == 0) goto Lad
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto Laf
        Lad:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        Laf:
            r0 = r0 | r2
        Lb0:
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 & r12
            if (r2 != 0) goto Lc6
            r2 = r52
            boolean r7 = r15.c(r2)
            if (r7 == 0) goto Lc0
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lc2
        Lc0:
            r7 = 268435456(0x10000000, float:2.524355E-29)
        Lc2:
            r0 = r0 | r7
        Lc3:
            r16 = r0
            goto Lc9
        Lc6:
            r2 = r52
            goto Lc3
        Lc9:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r16 & r0
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 2
            if (r0 != r7) goto Ld7
            r0 = 0
            goto Ld8
        Ld7:
            r0 = r5
        Ld8:
            r7 = r16 & 1
            boolean r0 = r15.S(r7, r0)
            if (r0 == 0) goto L6db
            java.lang.Object r0 = r15.P()
            r7 = 1008981770(0x3c23d70a, float:0.01)
            r14 = 0
            i0.e r13 = i0.l.f5952a
            if (r0 != r13) goto Lf3
            i.c r0 = i.d.a(r14, r7)
            r15.k0(r0)
        Lf3:
            i.c r0 = (i.c) r0
            java.lang.Object r3 = r15.P()
            if (r3 != r13) goto L102
            i.c r3 = i.d.a(r14, r7)
            r15.k0(r3)
        L102:
            i.c r3 = (i.c) r3
            java.lang.Object r5 = r15.P()
            if (r5 != r13) goto L111
            i.c r5 = i.d.a(r14, r7)
            r15.k0(r5)
        L111:
            i.c r5 = (i.c) r5
            i0.a1 r20 = i0.r.y(r10, r15)
            r7 = r6
            i0.a1 r6 = i0.r.y(r11, r15)
            java.lang.Object r7 = r15.P()
            if (r7 != r13) goto L129
            qg.t r7 = i0.r.n(r15)
            r15.k0(r7)
        L129:
            r22 = r7
            qg.t r22 = (qg.t) r22
            java.lang.Object r7 = r15.P()
            if (r7 != r13) goto L13c
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            i0.j1 r7 = i0.r.u(r7)
            r15.k0(r7)
        L13c:
            i0.a1 r7 = (i0.a1) r7
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r1 = r16 & 14
            r2 = 4
            if (r1 != r2) goto L149
            r1 = 1
            goto L14a
        L149:
            r1 = 0
        L14a:
            boolean r2 = r15.h(r0)
            r1 = r1 | r2
            boolean r2 = r15.h(r3)
            r1 = r1 | r2
            boolean r2 = r15.h(r5)
            r1 = r1 | r2
            boolean r2 = r15.f(r6)
            r1 = r1 | r2
            java.lang.Object r2 = r15.P()
            if (r1 != 0) goto L166
            if (r2 != r13) goto L169
        L166:
            r1 = r4
            r4 = r0
            goto L175
        L169:
            r19 = r0
            r23 = r3
            r8 = r4
            r24 = r5
            r25 = r7
            r9 = 32
            goto L18d
        L175:
            xh.p r0 = new xh.p
            r2 = r7
            r7 = 0
            r9 = 32
            r8 = r1
            r1 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r25 = r2
            r23 = r3
            r19 = r4
            r24 = r5
            r15.k0(r0)
            r2 = r0
        L18d:
            fg.p r2 = (fg.p) r2
            i0.r.f(r2, r15, r14)
            if (r46 != 0) goto L1bf
            java.lang.Object r0 = r25.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1bf
            i0.r1 r13 = r15.t()
            if (r13 == 0) goto L6fd
            xh.j r0 = new xh.j
            r10 = 0
            r1 = r46
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r7 = r52
            r8 = r53
            r6 = r11
            r9 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.f6035d = r0
            return
        L1bf:
            java.lang.Object r0 = r15.P()
            u2.k r1 = u2.k.f13348e
            if (r0 != r13) goto L1ce
            i0.j1 r0 = i0.r.u(r1)
            r15.k0(r0)
        L1ce:
            r12 = r0
            i0.a1 r12 = (i0.a1) r12
            java.lang.Object r0 = r15.P()
            if (r0 != r13) goto L1e1
            wb.lp r0 = new wb.lp
            r2 = 29
            r0.<init>(r12, r2)
            r15.k0(r0)
        L1e1:
            fg.l r0 = (fg.l) r0
            y0.o r0 = v1.w.m(r8, r0)
            p.d.c(r15, r0)
            java.lang.Object r0 = r12.getValue()
            u2.k r0 = (u2.k) r0
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L217
            i0.r1 r11 = r15.t()
            if (r11 == 0) goto L6fd
            xh.j r0 = new xh.j
            r10 = 1
            r1 = r46
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f6035d = r0
            return
        L217:
            r3 = r48
            r4 = r49
            java.lang.Object r0 = r15.P()
            r10 = 0
            if (r0 != r13) goto L22f
            u2.l r0 = new u2.l
            r0.<init>(r10)
            i0.j1 r0 = i0.r.u(r0)
            r15.k0(r0)
        L22f:
            r8 = r0
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r0 = r12.getValue()
            r1 = r0
            u2.k r1 = (u2.k) r1
            java.lang.Object r0 = r8.getValue()
            u2.l r0 = (u2.l) r0
            long r5 = r0.f13353a
            int r0 = r16 >> 12
            r0 = r0 & 14
            int r2 = r16 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r14 = r0 | r2
            r3.getClass()
            r1.getClass()
            int r0 = r1.f13350b
            int r2 = r1.f13351c
            int r7 = r1.f13349a
            i0.m2 r10 = y1.h1.f21946h
            java.lang.Object r10 = r15.j(r10)
            u2.c r10 = (u2.c) r10
            i0.m2 r11 = y1.h1.f21959u
            java.lang.Object r11 = r15.j(r11)
            y1.o2 r11 = (y1.o2) r11
            i0.m2 r9 = y1.h1.f21952n
            java.lang.Object r9 = r15.j(r9)
            u2.m r9 = (u2.m) r9
            java.util.WeakHashMap r27 = p.s1.f9986v
            r27 = r0
            p.s1 r0 = p.c.e(r15)
            p.b r0 = r0.f9988b
            r28 = r2
            p.s1 r2 = p.c.e(r15)
            p.b r2 = r2.f9992f
            r29 = r7
            p.s1 r7 = p.c.e(r15)
            p.b r7 = r7.f9991e
            r30 = r8
            p.s1 r8 = p.c.e(r15)
            p.b r8 = r8.f9987a
            r31 = r11
            int r11 = r9.ordinal()
            boolean r11 = r15.d(r11)
            boolean r32 = r15.f(r10)
            r11 = r11 | r32
            r32 = r14 & 112(0x70, float:1.57E-43)
            r33 = r11
            r11 = r32 ^ 48
            r32 = r12
            r12 = 32
            if (r11 <= r12) goto L2b7
            boolean r26 = r15.f(r3)
            if (r26 != 0) goto L2b4
            goto L2b7
        L2b4:
            r34 = r14
            goto L2bd
        L2b7:
            r34 = r14
            r14 = r34 & 48
            if (r14 != r12) goto L2bf
        L2bd:
            r12 = 1
            goto L2c0
        L2bf:
            r12 = 0
        L2c0:
            r12 = r33 | r12
            java.lang.Object r14 = r15.P()
            if (r12 != 0) goto L2d0
            if (r14 != r13) goto L2cb
            goto L2d0
        L2cb:
            r35 = r5
            r33 = r11
            goto L308
        L2d0:
            u2.k r14 = new u2.k
            p.z0 r12 = r3.b()
            float r12 = r12.d(r9)
            int r12 = r10.G0(r12)
            p.z0 r3 = r48.b()
            float r3 = r3.f10044b
            int r3 = r10.G0(r3)
            r33 = r11
            p.z0 r11 = r48.b()
            float r11 = r11.b(r9)
            int r11 = r10.G0(r11)
            r35 = r5
            p.z0 r5 = r48.b()
            float r5 = r5.f10046d
            int r5 = r10.G0(r5)
            r14.<init>(r12, r3, r11, r5)
            r15.k0(r14)
        L308:
            r6 = r14
            u2.k r6 = (u2.k) r6
            r11 = r31
            y1.v1 r11 = (y1.v1) r11
            i0.j1 r3 = r11.f22136b
            if (r3 != 0) goto L32a
            fg.a r3 = r11.f22135a
            if (r3 == 0) goto L31f
            java.lang.Object r3 = r3.invoke()
            y1.j1 r3 = (y1.j1) r3
            if (r3 != 0) goto L321
        L31f:
            y1.j1 r3 = y1.j1.f21979c
        L321:
            i0.j1 r3 = i0.r.u(r3)
            r11.f22136b = r3
            r3 = 0
            r11.f22135a = r3
        L32a:
            i0.j1 r3 = r11.f22136b
            r3.getClass()
            java.lang.Object r3 = r3.getValue()
            y1.j1 r3 = (y1.j1) r3
            long r11 = r3.f21980a
            int r3 = r9.ordinal()
            boolean r3 = r15.d(r3)
            boolean r5 = r15.f(r10)
            r3 = r3 | r5
            boolean r5 = r15.f(r0)
            r3 = r3 | r5
            boolean r5 = r15.f(r2)
            r3 = r3 | r5
            boolean r5 = r15.f(r7)
            r3 = r3 | r5
            boolean r5 = r15.f(r8)
            r3 = r3 | r5
            boolean r5 = r15.e(r11)
            r3 = r3 | r5
            java.lang.Object r5 = r15.P()
            r37 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r3 != 0) goto L36d
            if (r5 != r13) goto L36b
            goto L36d
        L36b:
            r0 = r9
            goto L3a1
        L36d:
            u2.k r5 = new u2.k
            b3.a r3 = r0.e()
            int r3 = r3.f445a
            b3.a r2 = r2.e()
            int r2 = r2.f446b
            r10 = r7
            r14 = r8
            r26 = 32
            long r7 = r11 >> r26
            int r7 = (int) r7
            b3.a r0 = r0.e()
            int r0 = r0.f447c
            int r7 = r7 - r0
            r0 = r9
            long r8 = r11 & r37
            int r8 = (int) r8
            b3.a r9 = r10.e()
            int r9 = r9.f448d
            int r8 = r8 - r9
            b3.a r9 = r14.e()
            int r9 = r9.f448d
            int r8 = r8 - r9
            r5.<init>(r3, r2, r7, r8)
            r15.k0(r5)
        L3a1:
            r2 = r5
            u2.k r2 = (u2.k) r2
            r3 = r34 & 14
            r8 = r3 ^ 6
            r3 = 4
            if (r8 <= r3) goto L3b5
            int r5 = r4.ordinal()
            boolean r5 = r15.d(r5)
            if (r5 != 0) goto L3b9
        L3b5:
            r5 = r34 & 6
            if (r5 != r3) goto L3bb
        L3b9:
            r5 = 1
            goto L3bc
        L3bb:
            r5 = 0
        L3bc:
            boolean r3 = r15.f(r6)
            r3 = r3 | r5
            boolean r5 = r15.f(r1)
            r3 = r3 | r5
            int r5 = r0.ordinal()
            boolean r5 = r15.d(r5)
            r3 = r3 | r5
            boolean r5 = r15.e(r11)
            r3 = r3 | r5
            java.lang.Object r5 = r15.P()
            r9 = 3
            r10 = 5
            if (r3 != 0) goto L3e2
            if (r5 != r13) goto L3df
            goto L3e2
        L3df:
            r39 = r11
            goto L42d
        L3e2:
            sh.g0 r3 = sh.s.s(r4, r0)
            int r3 = r3.ordinal()
            r5 = 1
            if (r3 == r5) goto L3f6
            if (r3 == r9) goto L3f6
            if (r3 == r10) goto L3f6
            int r3 = r6.f13349a
            int r7 = r29 + r3
            goto L3fa
        L3f6:
            int r3 = r6.f13351c
            int r7 = r28 - r3
        L3fa:
            sh.g0 r3 = sh.s.s(r4, r0)
            int r3 = r3.ordinal()
            r5 = 4
            if (r3 == r5) goto L40d
            if (r3 == r10) goto L40d
            int r3 = r1.f13352d
            int r5 = r6.f13352d
            int r3 = r3 + r5
            goto L411
        L40d:
            int r3 = r6.f13352d
            int r3 = r27 - r3
        L411:
            float r5 = (float) r7
            r39 = r11
            r26 = 32
            long r10 = r39 >> r26
            int r7 = (int) r10
            float r7 = (float) r7
            float r5 = r5 / r7
            float r3 = (float) r3
            long r10 = r39 & r37
            int r7 = (int) r10
            float r7 = (float) r7
            float r3 = r3 / r7
            long r10 = sh.s.t(r5, r3)
            f1.u0 r5 = new f1.u0
            r5.<init>(r10)
            r15.k0(r5)
        L42d:
            f1.u0 r5 = (f1.u0) r5
            long r10 = r5.f3124a
            r41 = r10
            r9 = r35
            boolean r3 = r15.e(r9)
            boolean r5 = r15.f(r2)
            r3 = r3 | r5
            boolean r5 = r15.f(r1)
            r3 = r3 | r5
            r5 = 4
            if (r8 <= r5) goto L450
            int r7 = r4.ordinal()
            boolean r7 = r15.d(r7)
            if (r7 != 0) goto L454
        L450:
            r7 = r34 & 6
            if (r7 != r5) goto L456
        L454:
            r5 = 1
            goto L457
        L456:
            r5 = 0
        L457:
            r3 = r3 | r5
            int r5 = r0.ordinal()
            boolean r5 = r15.d(r5)
            r3 = r3 | r5
            boolean r5 = r15.f(r6)
            r3 = r3 | r5
            r11 = r33
            r5 = 32
            r7 = r48
            if (r11 <= r5) goto L474
            boolean r21 = r15.f(r7)
            if (r21 != 0) goto L478
        L474:
            r12 = r34 & 48
            if (r12 != r5) goto L47a
        L478:
            r5 = 1
            goto L47b
        L47a:
            r5 = 0
        L47b:
            r3 = r3 | r5
            java.lang.Object r5 = r15.P()
            if (r3 != 0) goto L484
            if (r5 != r13) goto L487
        L484:
            r14 = 0
            goto L48b
        L487:
            r7 = r5
            r14 = r6
            r5 = r9
            goto L4ac
        L48b:
            boolean r3 = u2.l.a(r9, r14)
            if (r3 == 0) goto L496
            r14 = r6
            r5 = r9
            r9 = 0
            goto L4a2
        L496:
            r3 = r0
            r0 = r7
            r7 = r4
            r4 = r9
            long r9 = r0.a(r1, r2, r3, r4, r6, r7)
            r0 = r3
            r14 = r6
            r5 = r4
            r4 = r7
        L4a2:
            u2.j r7 = new u2.j
            r7.<init>(r9)
            r15 = r54
            r15.k0(r7)
        L4ac:
            u2.j r7 = (u2.j) r7
            long r9 = r7.f13347a
            boolean r7 = r15.e(r5)
            boolean r31 = r15.f(r2)
            r7 = r7 | r31
            boolean r31 = r15.f(r1)
            r7 = r7 | r31
            r12 = 4
            if (r8 <= r12) goto L4d1
            int r12 = r4.ordinal()
            boolean r12 = r15.d(r12)
            if (r12 != 0) goto L4ce
            goto L4d1
        L4ce:
            r33 = r7
            goto L4d8
        L4d1:
            r12 = r34 & 6
            r33 = r7
            r7 = 4
            if (r12 != r7) goto L4da
        L4d8:
            r7 = 1
            goto L4db
        L4da:
            r7 = 0
        L4db:
            r7 = r33 | r7
            boolean r12 = r15.e(r9)
            r7 = r7 | r12
            int r12 = r0.ordinal()
            boolean r12 = r15.d(r12)
            r7 = r7 | r12
            java.lang.Object r12 = r15.P()
            if (r7 != 0) goto L4f3
            if (r12 != r13) goto L4f7
        L4f3:
            r7 = r13
            r12 = 0
            goto L4ff
        L4f7:
            r21 = r0
            r35 = r9
            r7 = r13
            r13 = r1
            goto L56b
        L4ff:
            boolean r33 = u2.l.a(r5, r12)
            if (r33 == 0) goto L526
            sh.g0 r12 = sh.s.s(r4, r0)
            int r12 = r12.ordinal()
            r13 = 1
            if (r12 == r13) goto L518
            r13 = 3
            if (r12 == r13) goto L518
            r13 = 5
            if (r12 == r13) goto L518
            r12 = 0
            goto L519
        L518:
            r12 = 1
        L519:
            sh.f0 r13 = new sh.f0
            r21 = r0
            r0 = 0
            r13.<init>(r0, r0, r12)
            r35 = r9
            r12 = r13
            r13 = r1
            goto L568
        L526:
            r21 = r0
            r0 = 0
            long r12 = r9 & r37
            int r12 = (int) r12
            r13 = r1
            long r0 = r5 & r37
            int r0 = (int) r0
            int r0 = r0 / 2
            int r0 = r0 + r12
            int r1 = r13.a()
            int r1 = r1 / 2
            int r1 = r1 + r27
            if (r0 <= r1) goto L53f
            r12 = 1
            goto L540
        L53f:
            r12 = 0
        L540:
            if (r0 >= r1) goto L548
            r0 = 1
        L543:
            r35 = r9
            r26 = 32
            goto L54a
        L548:
            r0 = 0
            goto L543
        L54a:
            long r9 = r35 >> r26
            int r1 = (int) r9
            int r9 = r1 - r29
            int r9 = java.lang.Math.abs(r9)
            long r3 = r5 >> r26
            int r3 = (int) r3
            int r1 = r1 + r3
            int r1 = r1 - r28
            int r1 = java.lang.Math.abs(r1)
            if (r1 >= r9) goto L561
            r1 = 1
            goto L562
        L561:
            r1 = 0
        L562:
            sh.f0 r3 = new sh.f0
            r3.<init>(r12, r0, r1)
            r12 = r3
        L568:
            r15.k0(r12)
        L56b:
            sh.f0 r12 = (sh.f0) r12
            boolean r0 = r15.e(r5)
            r3 = 4
            if (r8 <= r3) goto L57e
            int r1 = r49.ordinal()
            boolean r1 = r15.d(r1)
            if (r1 != 0) goto L582
        L57e:
            r1 = r34 & 6
            if (r1 != r3) goto L584
        L582:
            r1 = 1
            goto L585
        L584:
            r1 = 0
        L585:
            r0 = r0 | r1
            int r1 = r21.ordinal()
            boolean r1 = r15.d(r1)
            r0 = r0 | r1
            boolean r1 = r15.f(r14)
            r0 = r0 | r1
            r1 = r13
            boolean r1 = r15.f(r1)
            r0 = r0 | r1
            boolean r1 = r15.f(r2)
            r0 = r0 | r1
            r9 = 32
            r3 = r48
            if (r11 <= r9) goto L5ab
            boolean r1 = r15.f(r3)
            if (r1 != 0) goto L5af
        L5ab:
            r1 = r34 & 48
            if (r1 != r9) goto L5b1
        L5af:
            r1 = 1
            goto L5b2
        L5b1:
            r1 = 0
        L5b2:
            r0 = r0 | r1
            r8 = r35
            boolean r1 = r15.e(r8)
            r0 = r0 | r1
            boolean r1 = r15.f(r12)
            r0 = r0 | r1
            r10 = r39
            boolean r1 = r15.e(r10)
            r0 = r0 | r1
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L5ce
            if (r1 != r7) goto L632
        L5ce:
            r0 = 0
            boolean r4 = u2.l.a(r5, r0)
            if (r4 == 0) goto L5d9
            r10 = r41
            goto L62a
        L5d9:
            boolean r0 = r12.f12577a
            boolean r1 = r12.f12578b
            boolean r4 = r12.f12579c
            if (r4 == 0) goto L5f1
            r4 = r0
            r13 = r1
            r26 = 32
            long r0 = r8 >> r26
            int r0 = (int) r0
            r17 = r0
            long r0 = r5 >> r26
            int r0 = (int) r0
            int r0 = r17 + r0
        L5ef:
            float r0 = (float) r0
            goto L5f9
        L5f1:
            r4 = r0
            r13 = r1
            r26 = 32
            long r0 = r8 >> r26
            int r0 = (int) r0
            goto L5ef
        L5f9:
            if (r4 != 0) goto L5ff
            if (r13 != 0) goto L5ff
            r1 = 1
            goto L600
        L5ff:
            r1 = 0
        L600:
            long r8 = r8 & r37
            int r8 = (int) r8
            if (r1 == 0) goto L611
            float r1 = (float) r8
            long r4 = r5 & r37
            int r4 = (int) r4
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r4 = r4 + r1
        L60e:
            r26 = 32
            goto L61c
        L611:
            if (r4 == 0) goto L615
        L613:
            float r4 = (float) r8
            goto L60e
        L615:
            if (r13 == 0) goto L613
            long r4 = r5 & r37
            int r1 = (int) r4
            int r8 = r8 + r1
            goto L613
        L61c:
            long r5 = r10 >> r26
            int r1 = (int) r5
            float r1 = (float) r1
            float r0 = r0 / r1
            long r5 = r10 & r37
            int r1 = (int) r5
            float r1 = (float) r1
            float r4 = r4 / r1
            long r10 = sh.s.t(r0, r4)
        L62a:
            f1.u0 r1 = new f1.u0
            r1.<init>(r10)
            r15.k0(r1)
        L632:
            f1.u0 r1 = (f1.u0) r1
            long r0 = r1.f3124a
            boolean r4 = r15.f(r12)
            java.lang.Object r5 = r15.P()
            if (r4 != 0) goto L642
            if (r5 != r7) goto L671
        L642:
            boolean r4 = r12.f12577a
            boolean r5 = r12.f12578b
            boolean r6 = r12.f12579c
            if (r4 != 0) goto L64f
            if (r5 != 0) goto L64f
            r18 = 1
            goto L651
        L64f:
            r18 = 0
        L651:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L657
            r6 = r8
            goto L658
        L657:
            r6 = 0
        L658:
            if (r18 == 0) goto L65e
            r4 = 1056964608(0x3f000000, float:0.5)
            r8 = r4
            goto L664
        L65e:
            if (r4 == 0) goto L662
        L660:
            r8 = 0
            goto L664
        L662:
            if (r5 == 0) goto L660
        L664:
            long r4 = f1.c0.g(r6, r8)
            f1.u0 r6 = new f1.u0
            r6.<init>(r4)
            r15.k0(r6)
            r5 = r6
        L671:
            f1.u0 r5 = (f1.u0) r5
            long r4 = r5.f3124a
            sh.d0 r37 = new sh.d0
            r40 = r0
            r38 = r2
            r42 = r4
            r44 = r12
            r39 = r14
            r37.<init>(r38, r39, r40, r42, r44)
            java.lang.Object r0 = r15.P()
            if (r0 != r7) goto L698
            e1.b r0 = new e1.b
            r12 = 0
            r0.<init>(r12)
            i0.j1 r0 = i0.r.u(r0)
            r15.k0(r0)
        L698:
            r11 = r0
            i0.a1 r11 = (i0.a1) r11
            java.lang.Object r0 = r25.getValue()
            r1 = r0
            xh.m r0 = new xh.m
            r10 = r49
            r8 = r52
            r14 = r53
            r45 = r1
            r9 = r3
            r3 = r19
            r6 = r20
            r2 = r22
            r4 = r23
            r5 = r24
            r13 = r30
            r12 = r32
            r7 = r37
            r31 = 3
            r1 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -297060143(0xffffffffee4b38d1, float:-1.5723536E28)
            s0.d r0 = s0.i.e(r1, r0, r15)
            int r1 = r16 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | 48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r47
            r3 = r45
            r2.c(r3, r0, r15, r1)
            goto L6df
        L6db:
            r2 = r8
            r15.V()
        L6df:
            i0.r1 r11 = r15.t()
            if (r11 == 0) goto L6fd
            xh.j r0 = new xh.j
            r10 = 2
            r1 = r46
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f6035d = r0
        L6fd:
            return
    }

    public static t4.b a0(v4.d0 r10, h4.u r11, boolean r12) {
            java.lang.String r0 = "InnerClasses"
            h4.s r11 = r11.o(r0)
            h4.h r11 = (h4.h) r11
            r0 = 0
            if (r11 != 0) goto Lc
            goto L43
        Lc:
            h4.u r11 = r11.f5084b
            java.lang.Object[] r1 = r11.f22543h
            int r1 = r1.length
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r5 = r0
            r4 = r3
        L19:
            if (r4 >= r1) goto L3b
            java.lang.Object r6 = r11.l(r4)
            h4.t r6 = (h4.t) r6
            v4.d0 r7 = r6.f5094a
            boolean r8 = r7.equals(r10)
            if (r8 == 0) goto L2b
            r5 = r6
            goto L38
        L2b:
            v4.d0 r6 = r6.f5095b
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L38
            w4.c r6 = r7.f14088g
            r2.add(r6)
        L38:
            int r4 = r4 + 1
            goto L19
        L3b:
            int r11 = r2.size()
            if (r5 != 0) goto L44
            if (r11 != 0) goto L44
        L43:
            return r0
        L44:
            t4.b r0 = new t4.b
            r0.<init>()
            r1 = 3
            if (r5 == 0) goto Lb5
            v4.c0 r4 = r5.f5096c
            int r6 = r5.f5097d
            t4.a r7 = new t4.a
            v4.d0 r8 = r4.d.f11385d
            r7.<init>(r8, r1)
            if (r4 == 0) goto L5a
            goto L5c
        L5a:
            v4.r r4 = v4.r.f14120g
        L5c:
            t4.d r8 = new t4.d
            v4.c0 r9 = r4.d.f11391j
            r8.<init>(r9, r4)
            r7.n(r8)
            t4.d r4 = new t4.d
            v4.c0 r8 = r4.d.f11390i
            v4.o r6 = v4.o.o(r6)
            r4.<init>(r8, r6)
            r7.n(r4)
            r7.f22555g = r3
            r0.l(r7)
            if (r12 == 0) goto Lb5
            v4.d0 r12 = r5.f5095b
            if (r12 == 0) goto L96
            t4.a r10 = new t4.a
            v4.d0 r4 = r4.d.f11383b
            r10.<init>(r4, r1)
            t4.d r4 = new t4.d
            v4.c0 r5 = r4.d.f11392k
            r4.<init>(r5, r12)
            r10.n(r4)
            r10.f22555g = r3
            r0.l(r10)
            goto Lb5
        L96:
            z4.l r11 = new z4.l
            w4.c r10 = r10.f14088g
            java.lang.String r10 = r10.a()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Ignoring InnerClasses attribute for an anonymous inner class\n("
            r12.<init>(r0)
            r12.append(r10)
            java.lang.String r10 = ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class."
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        Lb5:
            if (r11 == 0) goto Le7
            w4.b r10 = new w4.b
            r10.<init>(r11)
            r12 = r3
        Lbd:
            if (r12 >= r11) goto Lcb
            java.lang.Object r4 = r2.get(r12)
            w4.c r4 = (w4.c) r4
            r10.m(r12, r4)
            int r12 = r12 + 1
            goto Lbd
        Lcb:
            r10.f22555g = r3
            v4.d r10 = r4.d.a(r10)
            t4.a r11 = new t4.a
            v4.d0 r12 = r4.d.f11386e
            r11.<init>(r12, r1)
            t4.d r12 = new t4.d
            v4.c0 r1 = r4.d.f11392k
            r12.<init>(r1, r10)
            r11.n(r12)
            r11.f22555g = r3
            r0.l(r11)
        Le7:
            r0.f22555g = r3
            return r0
    }

    public static final void b(bi.b r137, bi.l r138, boolean r139, s0.d r140, i0.h0 r141, int r142) {
            r3 = r137
            r5 = r140
            r0 = r141
            r1 = r142
            i0.j1 r2 = r3.B
            i0.j1 r4 = r3.A
            i0.j1 r6 = r3.f890z
            i0.j1 r7 = r3.f889y
            i0.j1 r8 = r3.f888x
            i0.j1 r9 = r3.f886v
            i0.j1 r10 = r3.f885u
            i0.j1 r11 = r3.f884t
            i0.j1 r12 = r3.f881q
            i0.j1 r13 = r3.f880p
            i0.j1 r14 = r3.f879o
            i0.j1 r15 = r3.f878n
            r16 = r2
            i0.j1 r2 = r3.f877m
            r17 = r4
            i0.j1 r4 = r3.f876l
            r18 = r6
            i0.j1 r6 = r3.f875k
            r19 = r7
            i0.j1 r7 = r3.f873i
            r20 = r8
            i0.j1 r8 = r3.f872h
            r21 = r9
            i0.j1 r9 = r3.f871g
            r22 = r10
            i0.j1 r10 = r3.f870f
            r23 = r11
            i0.j1 r11 = r3.f869e
            r24 = r12
            i0.j1 r12 = r3.f868d
            r25 = r13
            i0.j1 r13 = r3.f867c
            r26 = r14
            r14 = 5539040(0x5484e0, float:7.761848E-39)
            r0.b0(r14)
            r14 = r1 & 6
            if (r14 != 0) goto L5f
            boolean r14 = r0.f(r3)
            if (r14 == 0) goto L5c
            r14 = 4
            goto L5d
        L5c:
            r14 = 2
        L5d:
            r14 = r14 | r1
            goto L60
        L5f:
            r14 = r1
        L60:
            r27 = r1 & 48
            if (r27 != 0) goto L66
            r14 = r14 | 16
        L66:
            r14 = r14 | 384(0x180, float:5.38E-43)
            r27 = r14
            r14 = r1 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L7c
            boolean r14 = r0.h(r5)
            if (r14 == 0) goto L77
            r14 = 2048(0x800, float:2.87E-42)
            goto L79
        L77:
            r14 = 1024(0x400, float:1.435E-42)
        L79:
            r14 = r27 | r14
            goto L7e
        L7c:
            r14 = r27
        L7e:
            r1 = r14 & 1171(0x493, float:1.641E-42)
            r27 = r14
            r14 = 1170(0x492, float:1.64E-42)
            r28 = 1
            if (r1 == r14) goto L8b
            r1 = r28
            goto L8c
        L8b:
            r1 = 0
        L8c:
            r14 = r27 & 1
            boolean r1 = r0.S(r14, r1)
            if (r1 == 0) goto L7f9
            r0.X()
            r1 = r142 & 1
            if (r1 == 0) goto Laa
            boolean r1 = r0.B()
            if (r1 == 0) goto La2
            goto Laa
        La2:
            r0.V()
            r1 = r138
            r28 = r139
            goto Lb2
        Laa:
            i0.m2 r1 = bi.m.f920a
            java.lang.Object r1 = r0.j(r1)
            bi.l r1 = (bi.l) r1
        Lb2:
            r0.q()
            java.lang.Object r14 = r0.P()
            i0.e r5 = i0.l.f5952a
            if (r14 != r5) goto L2cc
            long r30 = r3.j()
            long r32 = r3.e()
            java.lang.Object r14 = r13.getValue()
            f1.w r14 = (f1.w) r14
            r136 = r15
            long r14 = r14.f3133a
            java.lang.Object r29 = r12.getValue()
            r34 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r11.getValue()
            r36 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r10.getValue()
            r38 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r9.getValue()
            r40 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r8.getValue()
            r42 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r7.getValue()
            r44 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r48 = r3.b()
            java.lang.Object r29 = r6.getValue()
            r46 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r4.getValue()
            r50 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r2.getValue()
            r52 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r136.getValue()
            r54 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r26.getValue()
            r56 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r25.getValue()
            r58 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r24.getValue()
            r60 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r64 = r3.k()
            long r66 = r3.f()
            java.lang.Object r29 = r23.getValue()
            r62 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r22.getValue()
            r68 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r21.getValue()
            r70 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r74 = r3.c()
            java.lang.Object r29 = r20.getValue()
            r72 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r19.getValue()
            r76 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r18.getValue()
            r78 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r17.getValue()
            r80 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            java.lang.Object r29 = r16.getValue()
            r82 = r14
            r14 = r29
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r84 = r14
            i0.j1 r14 = r3.C
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r86 = r14
            i0.j1 r14 = r3.D
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r90 = r3.a()
            long r92 = r3.d()
            r88 = r14
            i0.j1 r14 = r3.G
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r96 = r3.l()
            long r98 = r3.g()
            long r100 = r3.n()
            r94 = r14
            i0.j1 r14 = r3.K
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r104 = r3.h()
            r102 = r14
            i0.j1 r14 = r3.M
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r106 = r14
            i0.j1 r14 = r3.N
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r110 = r3.m()
            r108 = r14
            i0.j1 r14 = r3.P
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r112 = r14
            i0.j1 r14 = r3.Q
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r114 = r14
            i0.j1 r14 = r3.R
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r116 = r14
            i0.j1 r14 = r3.S
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r118 = r14
            i0.j1 r14 = r3.T
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r120 = r14
            i0.j1 r14 = r3.U
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r124 = r3.i()
            r122 = r14
            i0.j1 r14 = r3.W
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            long r128 = r3.o()
            r126 = r14
            i0.j1 r14 = r3.Y
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r130 = r14
            i0.j1 r14 = r3.Z
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            r132 = r14
            i0.j1 r14 = r3.f865a0
            java.lang.Object r14 = r14.getValue()
            f1.w r14 = (f1.w) r14
            long r14 = r14.f3133a
            bi.b r29 = new bi.b
            r134 = r14
            r29.<init>(r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r104, r106, r108, r110, r112, r114, r116, r118, r120, r122, r124, r126, r128, r130, r132, r134)
            r14 = r29
            r0.k0(r14)
            goto L2ce
        L2cc:
            r136 = r15
        L2ce:
            bi.b r14 = (bi.b) r14
            i0.m2 r15 = bi.d.f892a
            r14.getClass()
            r15 = r1
            long r0 = r3.j()
            r138 = r15
            i0.j1 r15 = r14.f864a
            r139 = r5
            f1.w r5 = new f1.w
            r5.<init>(r0)
            r15.setValue(r5)
            long r0 = r3.e()
            i0.j1 r5 = r14.f866b
            java.lang.Object r0 = bc.e.e(r0, r5, r13)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f867c
            java.lang.Object r0 = bc.e.e(r0, r5, r12)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f868d
            java.lang.Object r0 = bc.e.e(r0, r5, r11)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f869e
            java.lang.Object r0 = bc.e.e(r0, r5, r10)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f870f
            java.lang.Object r0 = bc.e.e(r0, r5, r9)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f871g
            java.lang.Object r0 = bc.e.e(r0, r5, r8)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f872h
            java.lang.Object r0 = bc.e.e(r0, r5, r7)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f873i
            f1.w r7 = new f1.w
            r7.<init>(r0)
            r5.setValue(r7)
            long r0 = r3.b()
            i0.j1 r5 = r14.f874j
            java.lang.Object r0 = bc.e.e(r0, r5, r6)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r5 = r14.f875k
            java.lang.Object r0 = bc.e.e(r0, r5, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r4 = r14.f876l
            java.lang.Object r0 = bc.e.e(r0, r4, r2)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f877m
            r4 = r136
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f878n
            r4 = r26
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f879o
            r4 = r25
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f880p
            r4 = r24
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f881q
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.k()
            i0.j1 r2 = r14.f882r
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.f()
            i0.j1 r2 = r14.f883s
            r4 = r23
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f884t
            r4 = r22
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f885u
            r4 = r21
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f886v
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.c()
            i0.j1 r2 = r14.f887w
            r4 = r20
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f888x
            r4 = r19
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f889y
            r4 = r18
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f890z
            r4 = r17
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.A
            r4 = r16
            java.lang.Object r0 = bc.e.e(r0, r2, r4)
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.B
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.C
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.C
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.D
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.D
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.a()
            i0.j1 r2 = r14.E
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.d()
            i0.j1 r2 = r14.F
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.G
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.G
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.l()
            i0.j1 r2 = r14.H
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.g()
            i0.j1 r2 = r14.I
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.n()
            i0.j1 r2 = r14.J
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.K
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.K
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.h()
            i0.j1 r2 = r14.L
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.M
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.M
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.N
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.N
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.m()
            i0.j1 r2 = r14.O
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.P
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.P
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.Q
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.Q
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.R
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.R
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.S
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.S
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.T
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.T
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.U
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.U
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.i()
            i0.j1 r2 = r14.V
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.W
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.W
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            long r0 = r3.o()
            i0.j1 r2 = r14.X
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.Y
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.Y
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.Z
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.Z
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            i0.j1 r0 = r3.f865a0
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            i0.j1 r2 = r14.f865a0
            f1.w r4 = new f1.w
            r4.<init>(r0)
            r2.setValue(r4)
            java.lang.Object r0 = r141.P()
            r1 = r139
            if (r0 != r1) goto L6ad
            r15 = r138
            i0.j1 r0 = r15.f906a
            java.lang.Object r0 = r0.getValue()
            r30 = r0
            i2.n0 r30 = (i2.n0) r30
            i0.j1 r0 = r15.f907b
            java.lang.Object r0 = r0.getValue()
            r31 = r0
            i2.n0 r31 = (i2.n0) r31
            i0.j1 r0 = r15.f908c
            java.lang.Object r0 = r0.getValue()
            r32 = r0
            i2.n0 r32 = (i2.n0) r32
            i0.j1 r0 = r15.f909d
            java.lang.Object r0 = r0.getValue()
            r33 = r0
            i2.n0 r33 = (i2.n0) r33
            i0.j1 r0 = r15.f910e
            java.lang.Object r0 = r0.getValue()
            r34 = r0
            i2.n0 r34 = (i2.n0) r34
            i0.j1 r0 = r15.f911f
            java.lang.Object r0 = r0.getValue()
            r35 = r0
            i2.n0 r35 = (i2.n0) r35
            i0.j1 r0 = r15.f912g
            java.lang.Object r0 = r0.getValue()
            r36 = r0
            i2.n0 r36 = (i2.n0) r36
            i0.j1 r0 = r15.f913h
            java.lang.Object r0 = r0.getValue()
            r37 = r0
            i2.n0 r37 = (i2.n0) r37
            i0.j1 r0 = r15.f914i
            java.lang.Object r0 = r0.getValue()
            r38 = r0
            i2.n0 r38 = (i2.n0) r38
            i0.j1 r0 = r15.f915j
            java.lang.Object r0 = r0.getValue()
            r39 = r0
            i2.n0 r39 = (i2.n0) r39
            i0.j1 r0 = r15.f916k
            java.lang.Object r0 = r0.getValue()
            r40 = r0
            i2.n0 r40 = (i2.n0) r40
            i0.j1 r0 = r15.f917l
            java.lang.Object r0 = r0.getValue()
            r41 = r0
            i2.n0 r41 = (i2.n0) r41
            i0.j1 r0 = r15.f918m
            java.lang.Object r0 = r0.getValue()
            r42 = r0
            i2.n0 r42 = (i2.n0) r42
            i0.j1 r0 = r15.f919n
            java.lang.Object r0 = r0.getValue()
            r43 = r0
            i2.n0 r43 = (i2.n0) r43
            r30.getClass()
            r31.getClass()
            r32.getClass()
            r33.getClass()
            r34.getClass()
            r35.getClass()
            r36.getClass()
            r37.getClass()
            r38.getClass()
            r39.getClass()
            r40.getClass()
            r41.getClass()
            r42.getClass()
            r43.getClass()
            bi.l r29 = new bi.l
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r2 = r141
            r0 = r29
            r2.k0(r0)
            goto L6b1
        L6ad:
            r15 = r138
            r2 = r141
        L6b1:
            bi.l r0 = (bi.l) r0
            i0.m2 r4 = bi.m.f920a
            r0.getClass()
            r15.getClass()
            i0.j1 r4 = r15.f906a
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f906a
            r5.setValue(r4)
            i0.j1 r4 = r15.f907b
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f907b
            r5.setValue(r4)
            i0.j1 r4 = r15.f908c
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f908c
            r5.setValue(r4)
            i0.j1 r4 = r15.f909d
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f909d
            r5.setValue(r4)
            i0.j1 r4 = r15.f910e
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f910e
            r5.setValue(r4)
            i0.j1 r4 = r15.f911f
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f911f
            r5.setValue(r4)
            i0.j1 r4 = r15.f912g
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f912g
            r5.setValue(r4)
            i0.j1 r4 = r15.f913h
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f913h
            r5.setValue(r4)
            i0.j1 r4 = r15.f914i
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f914i
            r5.setValue(r4)
            i0.j1 r4 = r15.f915j
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f915j
            r5.setValue(r4)
            i0.j1 r4 = r15.f916k
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f916k
            r5.setValue(r4)
            i0.j1 r4 = r15.f917l
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f917l
            r5.setValue(r4)
            i0.j1 r4 = r15.f918m
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f918m
            r5.setValue(r4)
            i0.j1 r4 = r15.f919n
            java.lang.Object r4 = r4.getValue()
            i2.n0 r4 = (i2.n0) r4
            r4.getClass()
            i0.j1 r5 = r0.f919n
            r5.setValue(r4)
            long r4 = r14.d()
            boolean r4 = r2.e(r4)
            java.lang.Object r5 = r2.P()
            if (r4 != 0) goto L7ab
            if (r5 != r1) goto L7b7
        L7ab:
            ci.l r5 = new ci.l
            long r6 = r14.d()
            r5.<init>(r6)
            r2.k0(r5)
        L7b7:
            ci.l r5 = (ci.l) r5
            i0.m2 r1 = bi.d.f892a
            i0.q1 r1 = r1.a(r14)
            i0.m2 r4 = bi.m.f920a
            i0.q1 r0 = r4.a(r0)
            i0.u r4 = k.v0.f7087a
            i0.q1 r4 = r4.a(r5)
            i0.u r5 = k.m1.f7016a
            ci.t r6 = ci.t.f1798a
            i0.q1 r5 = r5.a(r6)
            i0.m2 r6 = bi.k.f905a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r28)
            i0.q1 r6 = r6.a(r7)
            i0.q1[] r0 = new i0.q1[]{r1, r0, r4, r5, r6}
            bi.i r1 = new bi.i
            r5 = r140
            r4 = 0
            r1.<init>(r5, r4)
            r4 = -1475504096(0xffffffffa80d9820, float:-7.860059E-15)
            s0.d r1 = s0.i.e(r4, r1, r2)
            r4 = 56
            i0.r.b(r0, r1, r2, r4)
            r4 = r15
            r6 = r28
            goto L803
        L7f9:
            r5 = r140
            r2 = r0
            r2.V()
            r4 = r138
            r6 = r139
        L803:
            i0.r1 r7 = r2.t()
            if (r7 == 0) goto L813
            bi.j r0 = new bi.j
            r2 = 0
            r1 = r142
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L813:
            return
    }

    public static final boolean b0(java.lang.Throwable r6, fg.a r7) {
            r6.getClass()
            java.lang.Integer r0 = bg.a.f862a
            r1 = 0
            if (r0 == 0) goto L28
            int r0 = r0.intValue()
            r2 = 19
            if (r0 < r2) goto L11
            goto L28
        L11:
            java.lang.reflect.Method r0 = ag.a.f251b
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.invoke(r6, r1)
            if (r0 == 0) goto L25
            java.lang.Throwable[] r0 = (java.lang.Throwable[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r0.getClass()
            goto L36
        L25:
            tf.t r0 = tf.t.f13167g
            goto L36
        L28:
            java.lang.Throwable[] r0 = r6.getSuppressed()
            r0.getClass()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r0.getClass()
        L36:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L3c:
            if (r4 >= r2) goto L4c
            java.lang.Object r5 = r0.get(r4)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r5 = r5 instanceof x0.f
            if (r5 == 0) goto L49
            return r3
        L49:
            int r4 = r4 + 1
            goto L3c
        L4c:
            java.lang.Object r7 = r7.invoke()     // Catch: java.lang.Throwable -> L6d
            x0.a r7 = (x0.a) r7     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L76
            boolean r0 = r7.f20822b     // Catch: java.lang.Throwable -> L6d
            java.util.List r2 = r7.f20821a
            if (r0 == 0) goto L6f
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L6d
            r4 = r3
        L5f:
            if (r4 >= r0) goto L76
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L6d
            x0.b r5 = (x0.b) r5     // Catch: java.lang.Throwable -> L6d
            r5.getClass()     // Catch: java.lang.Throwable -> L6d
            int r4 = r4 + 1
            goto L5f
        L6d:
            r7 = move-exception
            goto L81
        L6f:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L76
            r3 = 1
        L76:
            if (r3 == 0) goto L82
            x0.f r1 = new x0.f     // Catch: java.lang.Throwable -> L6d
            r7.getClass()     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L6d
            goto L82
        L81:
            r1 = r7
        L82:
            if (r1 == 0) goto L87
            ac.p.e(r6, r1)
        L87:
            return r3
    }

    public static final boolean c(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            r2 = 0
            if (r1 != 0) goto L5a
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L5a
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = "onLocationChanged"
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L5a
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L5a
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L5a
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "TencentLocation"
            boolean r4 = og.m.h0(r4, r1, r2)
            if (r4 == 0) goto L5a
            r4 = 1
            r1 = r0[r4]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L5a
            r1 = 2
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L5a
            return r4
        L5a:
            return r2
    }

    public static int c0(int r1) {
            int r1 = r1 >> 7
            r0 = 0
        L3:
            if (r1 == 0) goto La
            int r1 = r1 >> 7
            int r0 = r0 + 1
            goto L3
        La:
            int r0 = r0 + 1
            return r0
    }

    public static final ua.c d(ua.i r38, java.lang.String r39, ua.c r40) {
            r0 = r38
            r1 = r40
            boolean r2 = og.m.t0(r39)
            if (r2 == 0) goto Le
            java.lang.String r2 = r0.f13624b
            r4 = r2
            goto L10
        Le:
            r4 = r39
        L10:
            boolean r5 = r0.f13625c
            int r6 = r0.f13626d
            long r7 = r0.f13627e
            long r9 = r0.f13628f
            long r11 = r0.f13629g
            java.lang.String r13 = r0.f13630h
            int r14 = r0.f13631i
            java.lang.String r15 = r0.f13632j
            java.lang.String r2 = r0.f13633k
            boolean r3 = r0.f13634l
            r16 = r2
            int r2 = r0.f13635m
            r18 = r2
            java.lang.String r2 = r0.f13636n
            r19 = r2
            int r2 = r0.f13637o
            r20 = r2
            int r2 = r0.f13638p
            r21 = r2
            java.lang.String r2 = r0.f13639q
            r22 = r2
            boolean r2 = r0.f13640r
            r23 = r2
            int r2 = r0.f13641s
            r24 = r2
            int r2 = r0.f13642t
            r25 = r2
            boolean r2 = r0.f13643u
            r26 = r2
            java.util.List r2 = r0.f13644v
            r27 = r2
            boolean r2 = r0.f13645w
            if (r2 == 0) goto L59
            r17 = r2
            boolean r2 = r0.f13646x
        L56:
            r28 = r2
            goto L5e
        L59:
            r17 = r2
            boolean r2 = r1.f13594v
            goto L56
        L5e:
            if (r17 == 0) goto L65
            boolean r2 = r0.f13647y
        L62:
            r29 = r2
            goto L68
        L65:
            boolean r2 = r1.f13595w
            goto L62
        L68:
            if (r17 == 0) goto L6f
            boolean r2 = r0.f13648z
        L6c:
            r30 = r2
            goto L72
        L6f:
            boolean r2 = r1.f13596x
            goto L6c
        L72:
            if (r17 == 0) goto L79
            int r2 = r0.A
        L76:
            r31 = r2
            goto L7c
        L79:
            int r2 = r1.f13597y
            goto L76
        L7c:
            if (r17 == 0) goto L83
            boolean r2 = r0.B
        L80:
            r32 = r2
            goto L86
        L83:
            boolean r2 = r1.f13598z
            goto L80
        L86:
            if (r17 == 0) goto L8d
            java.lang.String r2 = r0.C
        L8a:
            r33 = r2
            goto L90
        L8d:
            java.lang.String r2 = r1.A
            goto L8a
        L90:
            if (r17 == 0) goto L97
            java.lang.String r2 = r0.D
        L94:
            r34 = r2
            goto L9a
        L97:
            java.lang.String r2 = r1.B
            goto L94
        L9a:
            if (r17 == 0) goto La1
            java.lang.String r2 = r0.E
        L9e:
            r35 = r2
            goto La4
        La1:
            java.lang.String r2 = r1.C
            goto L9e
        La4:
            if (r17 == 0) goto Lab
            boolean r2 = r0.F
        La8:
            r36 = r2
            goto Lae
        Lab:
            boolean r2 = r1.D
            goto La8
        Lae:
            if (r17 == 0) goto Lb7
            java.lang.String r0 = r0.G
        Lb2:
            r37 = r0
            r17 = r3
            goto Lba
        Lb7:
            java.lang.String r0 = r1.E
            goto Lb2
        Lba:
            ua.c r3 = new ua.c
            r3.<init>(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r3
    }

    public static void d0(java.io.ByteArrayOutputStream r2, int r3, byte[] r4) {
            int r3 = r3 << 3
            r3 = r3 | 2
            long r0 = (long) r3
            f0(r2, r0)
            if (r4 != 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            int r3 = r4.length
            long r0 = (long) r3
        Lf:
            f0(r2, r0)
            if (r4 == 0) goto L19
            r3 = 0
            int r0 = r4.length
            r2.write(r4, r3, r0)
        L19:
            return
    }

    public static void e(org.json.JSONArray r7, java.lang.String r8, org.json.JSONArray r9) {
            int r0 = r9.length()
            if (r0 != 0) goto L7
            goto L39
        L7:
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            java.lang.String r2 = "role"
            if (r0 == 0) goto L1a
            java.lang.String r3 = r0.optString(r2)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            boolean r3 = gg.l.a(r3, r8)
            r4 = 0
            java.lang.String r5 = "parts"
            java.lang.String r6 = "content"
            if (r3 == 0) goto L44
            org.json.JSONArray r3 = r0.optJSONArray(r6)
            if (r3 == 0) goto L2d
            goto L31
        L2d:
            org.json.JSONArray r3 = r0.optJSONArray(r5)
        L31:
            if (r3 == 0) goto L44
            int r0 = r9.length()
        L37:
            if (r4 < r0) goto L3a
        L39:
            return
        L3a:
            java.lang.Object r7 = r9.opt(r4)
            r3.put(r7)
            int r4 = r4 + 1
            goto L37
        L44:
            java.lang.String r0 = "model"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L4d
            goto L66
        L4d:
            java.lang.String r0 = "assistant"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L57
        L55:
            r5 = r6
            goto L66
        L57:
            org.json.JSONObject r0 = r9.optJSONObject(r4)
            if (r0 == 0) goto L66
            java.lang.String r3 = "type"
            boolean r0 = r0.has(r3)
            if (r0 != r1) goto L66
            goto L55
        L66:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r8 = r0.put(r2, r8)
            org.json.JSONObject r8 = r8.put(r5, r9)
            r7.put(r8)
            return
    }

    public static void e0(java.io.ByteArrayOutputStream r5, int r6, java.lang.Object r7) {
            boolean r0 = r7 instanceof org.json.JSONArray
            r1 = 0
            if (r0 == 0) goto L17
            org.json.JSONArray r7 = (org.json.JSONArray) r7
        L7:
            int r0 = r7.length()
            if (r1 >= r0) goto La4
            java.lang.Object r0 = r7.get(r1)
            e0(r5, r6, r0)
            int r1 = r1 + 1
            goto L7
        L17:
            boolean r0 = r7 instanceof org.json.JSONObject
            if (r0 == 0) goto L25
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            byte[] r7 = q(r7)
            d0(r5, r6, r7)
            return
        L25:
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 == 0) goto L39
            int r6 = r6 << 3
            long r0 = (long) r6
            f0(r5, r0)
            java.lang.Number r7 = (java.lang.Number) r7
            long r6 = r7.longValue()
            f0(r5, r6)
            return
        L39:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L54
            int r6 = r6 << 3
            long r0 = (long) r6
            f0(r5, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L4e
            r6 = 1
            goto L50
        L4e:
            r6 = 0
        L50:
            f0(r5, r6)
            return
        L54:
            if (r7 == 0) goto L95
            java.lang.String r0 = r7.toString()
            java.lang.String r2 = "hex->"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L95
            java.lang.String r7 = r7.toString()
            r0 = 5
            java.lang.String r7 = r7.substring(r0)
            java.lang.String r0 = "[^0-9A-Fa-f]"
            java.lang.String r2 = ""
            java.lang.String r7 = r7.replaceAll(r0, r2)
            int r0 = r7.length()
            int r0 = r0 / 2
            byte[] r2 = new byte[r0]
        L7b:
            if (r1 >= r0) goto L91
            int r3 = r1 * 2
            int r4 = r3 + 2
            java.lang.String r3 = r7.substring(r3, r4)
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            byte r3 = (byte) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L7b
        L91:
            d0(r5, r6, r2)
            return
        L95:
            if (r7 == 0) goto La4
            java.lang.String r7 = r7.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r7 = r7.getBytes(r0)
            d0(r5, r6, r7)
        La4:
            return
    }

    public static pd.m f(ud.r r12, gf.a r13, boolean r14, java.util.ArrayList r15) {
            r0 = 0
            java.lang.Object r0 = r15.get(r0)
            nc.a r0 = (nc.a) r0
            java.lang.Object r0 = r0.f9342h
            qc.d r0 = (qc.d) r0
            r1 = 1
            java.lang.Object r2 = r15.get(r1)
            nc.a r2 = (nc.a) r2
            java.lang.Object r2 = r2.f9342h
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            java.lang.Object r3 = r15.get(r3)
            nc.a r3 = (nc.a) r3
            java.lang.Object r3 = r3.f9342h
            mc.a r3 = (mc.a) r3
            int r4 = r15.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            ud.e r6 = r12.f13718l
            ud.u r7 = r6.f13688k
            qd.m r8 = a7.a.f(r7)
            r5.add(r8)
        L35:
            if (r1 >= r4) goto L66
            java.lang.Object r8 = r15.get(r1)
            nc.a r8 = (nc.a) r8
            qd.l r9 = a7.a.o(r7, r8)     // Catch: java.lang.Exception -> L45
            r5.add(r9)     // Catch: java.lang.Exception -> L45
            goto L63
        L45:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Failed to build arg in invoke-custom insn: "
            java.lang.String r10 = r11.concat(r10)
            r12.M(r10, r9)
            pd.d r9 = new pd.d
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            qd.m r8 = qd.l.Z(r9)
            r5.add(r8)
        L63:
            int r1 = r1 + 1
            goto L35
        L66:
            int r12 = r0.b()
            boolean r12 = j8.b.a(r12)
            if (r12 != 0) goto La7
            ud.u r12 = r6.f13688k
            jf.h r1 = r0.a()
            od.d r1 = od.d.d(r12, r1)
            int r0 = r0.b()
            int r0 = r9.e0.w(r0)
            pd.n r4 = new pd.n
            int r6 = r5.size()
            r4.<init>(r1, r0, r6)
            ae.g r0 = new ae.g
            r1 = 18
            r0.<init>(r4, r1)
            r5.forEach(r0)
            qd.e r0 = qd.j.f10877k
            od.a r0 = od.a.e(r12, r0)
            od.d r12 = od.d.c(r12, r0, r2, r3)
            pd.m r0 = new pd.m
            r0.<init>(r4, r12, r13, r14)
            r0.f10524r = r15
            return r0
        La7:
            java.lang.String r12 = "Field handle not yet supported"
            ah.a.k(r12)
            r12 = 0
            return r12
    }

    public static void f0(java.io.ByteArrayOutputStream r4, long r5) {
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r0 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r5
            r2 = 128(0x80, double:6.3E-322)
            long r0 = r0 | r2
            int r0 = (int) r0
            r4.write(r0)
            r0 = 7
            long r5 = r5 >>> r0
            goto L0
        L16:
            int r5 = (int) r5
            r4.write(r5)
            return
    }

    public static p8.y g(java.lang.Class r10, java.lang.Class r11, java.lang.reflect.Method r12) {
            boolean r10 = J(r10, r12)
            r0 = 0
            if (r10 == 0) goto Lbf
            if (r11 != 0) goto Lb
            goto Lbf
        Lb:
            java.lang.Class r10 = java.lang.Integer.TYPE
            r10.getClass()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r1, r10}
            java.lang.reflect.Constructor r5 = h.Hchat.utils.KavaReflector.findConstructor(r11, r2)
            if (r5 == 0) goto Lbf
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r11
        L22:
            if (r3 == 0) goto L6d
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6d
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r4.next()
            r8 = r7
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            int r8 = r8.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L39
            r6.add(r7)
            goto L39
        L54:
            java.util.Iterator r4 = r6.iterator()
        L58:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L68
            java.lang.Object r6 = r4.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            r2.add(r6)
            goto L58
        L68:
            java.lang.Class r3 = r3.getSuperclass()
            goto L22
        L6d:
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r0
        L73:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Class r7 = r7.getType()
            boolean r7 = gg.l.a(r7, r11)
            if (r7 == 0) goto L73
            if (r3 == 0) goto L8e
        L8c:
            r4 = r0
            goto L94
        L8e:
            r3 = 1
            r4 = r6
            goto L73
        L91:
            if (r3 != 0) goto L94
            goto L8c
        L94:
            r6 = r4
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 == 0) goto Lbf
            java.lang.String r2 = "m"
            java.lang.reflect.Field r7 = P(r11, r2, r1)
            if (r7 == 0) goto Lbf
            java.lang.String r1 = "p"
            java.lang.reflect.Field r8 = P(r11, r1, r10)
            if (r8 == 0) goto Lbf
            java.lang.Class r10 = java.lang.Long.TYPE
            r10.getClass()
            java.lang.String r1 = "t"
            java.lang.reflect.Field r9 = P(r11, r1, r10)
            if (r9 == 0) goto Lbf
            p8.y r3 = new p8.y
            if (r12 == 0) goto Lbf
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        Lbf:
            return r0
    }

    public static java.lang.String h(java.lang.Object r6) {
            if (r6 == 0) goto L4f
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            goto L4f
        Lb:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L12:
            boolean r0 = r6 instanceof org.json.JSONArray
            if (r0 == 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r6
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            int r2 = r1.length()
            r6 = 0
        L23:
            if (r6 < r2) goto L2a
            java.lang.String r6 = r0.toString()
            return r6
        L2a:
            org.json.JSONObject r3 = r1.optJSONObject(r6)
            if (r3 == 0) goto L37
            java.lang.String r4 = "type"
            java.lang.String r4 = r3.optString(r4)
            goto L38
        L37:
            r4 = 0
        L38:
            java.lang.String r5 = "text"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L47
            java.lang.String r3 = r3.optString(r5)
            r0.append(r3)
        L47:
            int r6 = r6 + 1
            goto L23
        L4a:
            java.lang.String r6 = r6.toString()
            return r6
        L4f:
            java.lang.String r6 = ""
            return r6
    }

    public static final void i(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            return
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            ac.p.e(r1, r0)
        L10:
            return
    }

    public static void j(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static final m2.e k(android.content.Context r4) {
            m2.e r0 = new m2.e
            l3.w r1 = new l3.w
            r2 = 3
            r1.<init>(r2)
            r4.getApplicationContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L18
            m2.l r2 = m2.l.f8702a
            int r4 = r2.a(r4)
            goto L19
        L18:
            r4 = 0
        L19:
            m2.a r2 = new m2.a
            r2.<init>(r4)
            r0.<init>(r1, r2)
            return r0
    }

    public static android.graphics.Bitmap l(android.content.Context r6, android.net.Uri r7) {
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            java.io.InputStream r2 = r6.openInputStream(r7)
            r3 = 0
            if (r2 == 0) goto L21
            android.graphics.BitmapFactory.decodeStream(r2, r3, r0)     // Catch: java.lang.Throwable -> L1a
            r2.close()
            goto L21
        L1a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L1c
        L1c:
            r7 = move-exception
            i(r2, r6)
            throw r7
        L21:
            int r2 = r0.outWidth
            if (r2 <= 0) goto L8f
            int r2 = r0.outHeight
            if (r2 > 0) goto L2a
            goto L8f
        L2a:
            r2 = r1
        L2b:
            int r4 = r0.outWidth
            int r4 = r4 / r2
            int r5 = r0.outHeight
            int r5 = r5 / r2
            int r4 = java.lang.Math.max(r4, r5)
            r5 = 512(0x200, float:7.17E-43)
            if (r4 <= r5) goto L3c
            int r2 = r2 * 2
            goto L2b
        L3c:
            java.io.InputStream r6 = r6.openInputStream(r7)
            if (r6 == 0) goto L8f
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L88
            r7.<init>()     // Catch: java.lang.Throwable -> L88
            r7.inSampleSize = r2     // Catch: java.lang.Throwable -> L88
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r6, r3, r7)     // Catch: java.lang.Throwable -> L88
            r6.close()
            if (r7 == 0) goto L8f
            int r6 = r7.getWidth()
            int r0 = r7.getHeight()
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r6 > r0) goto L63
            return r7
        L63:
            r0 = 1132462080(0x43800000, float:256.0)
            float r6 = (float) r6
            float r0 = r0 / r6
            int r6 = r7.getWidth()
            float r6 = (float) r6
            float r6 = r6 * r0
            int r6 = (int) r6
            if (r6 >= r1) goto L71
            r6 = r1
        L71:
            int r2 = r7.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            if (r0 >= r1) goto L7b
            r0 = r1
        L7b:
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r7, r6, r0, r1)
            r6.getClass()
            if (r6 == r7) goto L87
            r7.recycle()
        L87:
            return r6
        L88:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            i(r6, r7)
            throw r0
        L8f:
            return r3
    }

    public static void m(android.content.Context r3, java.lang.String r4) {
            r3.getClass()
            if (r4 == 0) goto L5a
            boolean r0 = og.m.t0(r4)
            r1 = 0
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r4 = r1
        Le:
            if (r4 == 0) goto L5a
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L25
            java.io.File r3 = ub.b.d(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "FloatingShortcut/icons"
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L25
            java.io.File r3 = r4.getCanonicalFile()     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L2c:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L32
            r3 = r1
        L32:
            java.io.File r3 = (java.io.File) r3
            if (r3 == 0) goto L5a
            java.io.File r4 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L3b
            goto L42
        L3b:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L42:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L48
            goto L49
        L48:
            r1 = r4
        L49:
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L5a
            java.io.File r4 = r1.getParentFile()
            boolean r3 = gg.l.a(r4, r3)
            if (r3 == 0) goto L5a
            r1.delete()     // Catch: java.lang.Throwable -> L5a
        L5a:
            return
    }

    public static void n(java.io.File r1) {
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            o(r1)     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    public static void o(java.io.File r4) {
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L18
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L18
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            o(r3)
            int r2 = r2 + 1
            goto Le
        L18:
            r4.delete()
            return
    }

    public static hh.q p(org.luckypray.dexkit.DexKitBridge r5, jh.a r6) {
            r5.getClass()
            jh.o r0 = new jh.o
            r0.<init>()
            r1 = 4
            int r1 = r6.b(r1)
            if (r1 == 0) goto L1f
            int r2 = r6.f4331a
            int r1 = r1 + r2
            int r1 = r6.a(r1)
            java.nio.ByteBuffer r2 = r6.f4332b
            r2.getClass()
            r0.c(r1, r2)
            goto L20
        L1f:
            r0 = 0
        L20:
            r0.getClass()
            hh.l r5 = fb.v0.r(r5, r0)
            r0 = 6
            int r1 = r6.b(r0)
            r2 = 0
            if (r1 == 0) goto L39
            java.nio.ByteBuffer r3 = r6.f4332b
            int r4 = r6.f4331a
            int r1 = r1 + r4
            byte r1 = r3.get(r1)
            goto L3a
        L39:
            r1 = r2
        L3a:
            r3 = 1
            if (r1 != r3) goto L3e
            goto L41
        L3e:
            r3 = 2
            if (r1 != r3) goto L47
        L41:
            hh.q r6 = new hh.q
            r6.<init>(r5, r3)
            return r6
        L47:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            int r0 = r6.b(r0)
            if (r0 == 0) goto L58
            java.nio.ByteBuffer r1 = r6.f4332b
            int r6 = r6.f4331a
            int r0 = r0 + r6
            byte r2 = r1.get(r0)
        L58:
            java.lang.String r6 = "Unknown using type: "
            java.lang.String r6 = eh.a.l(r2, r6)
            r5.<init>(r6)
            throw r5
    }

    public static byte[] q(org.json.JSONObject r5) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.json.JSONArray r1 = r5.names()
            r2 = 0
            if (r1 != 0) goto Lf
            byte[] r5 = new byte[r2]
            return r5
        Lf:
            int r3 = r1.length()
            if (r2 >= r3) goto L27
            java.lang.String r3 = r1.getString(r2)
            int r4 = java.lang.Integer.parseInt(r3)
            java.lang.Object r3 = r5.get(r3)
            e0(r0, r4, r3)
            int r2 = r2 + 1
            goto Lf
        L27:
            byte[] r5 = r0.toByteArray()
            return r5
    }

    public static org.json.JSONObject r(org.json.JSONObject r6) {
            java.lang.String r0 = "error"
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            if (r0 == 0) goto L1b
            java.lang.String r6 = "message"
            java.lang.String r6 = r0.optString(r6)
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L16
            java.lang.String r6 = "Gemini 请求失败"
        L16:
            j8.o.A(r6)
        L19:
            r6 = 0
            return r6
        L1b:
            java.lang.String r0 = "promptFeedback"
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = " - "
            r3 = 0
            if (r0 == 0) goto L5c
            java.lang.String r4 = "blockReason"
            java.lang.String r4 = r0.optString(r4)
            r4.getClass()
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L5c
            java.lang.String r6 = "blockReasonMessage"
            java.lang.String r6 = r0.optString(r6)
            r6.getClass()
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L47
            goto L48
        L47:
            r6 = r3
        L48:
            if (r6 == 0) goto L4e
            java.lang.String r3 = r2.concat(r6)
        L4e:
            if (r3 != 0) goto L51
            goto L52
        L51:
            r1 = r3
        L52:
            java.lang.String r6 = "Gemini 已拦截请求: "
            java.lang.String r6 = eh.a.n(r6, r4, r1)
            j8.o.A(r6)
            goto L19
        L5c:
            java.lang.String r0 = "candidates"
            org.json.JSONArray r6 = r6.optJSONArray(r0)
            if (r6 == 0) goto Lb3
            r0 = 0
            org.json.JSONObject r6 = r6.optJSONObject(r0)
            if (r6 == 0) goto Lb3
            java.lang.String r0 = "finishReason"
            java.lang.String r0 = r6.optString(r0)
            r0.getClass()
            boolean r4 = og.m.t0(r0)
            if (r4 != 0) goto Lb2
            java.lang.String r4 = "STOP"
            java.lang.String r5 = "MAX_TOKENS"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.Set r4 = tf.d0.W(r4)
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto Lb2
            java.lang.String r4 = "finishMessage"
            java.lang.String r6 = r6.optString(r4)
            r6.getClass()
            boolean r4 = og.m.t0(r6)
            if (r4 != 0) goto L9c
            goto L9d
        L9c:
            r6 = r3
        L9d:
            if (r6 == 0) goto La3
            java.lang.String r3 = r2.concat(r6)
        La3:
            if (r3 != 0) goto La6
            goto La7
        La6:
            r1 = r3
        La7:
            java.lang.String r6 = "Gemini 生成失败: "
            java.lang.String r6 = eh.a.n(r6, r0, r1)
            j8.o.A(r6)
            goto L19
        Lb2:
            return r6
        Lb3:
            return r3
    }

    public static t4.b s(h4.u r12) {
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            h4.s r0 = r12.o(r0)
            h4.m r0 = (h4.m) r0
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            h4.s r1 = r12.o(r1)
            h4.k r1 = (h4.k) r1
            r2 = 0
            if (r0 != 0) goto L1d
            if (r1 != 0) goto L18
            t4.b r0 = t4.b.f13073i
            goto L36
        L18:
            z4.j r0 = r1.f5092d
            t4.b r0 = (t4.b) r0
            goto L36
        L1d:
            z4.j r0 = r0.f5092d
            t4.b r0 = (t4.b) r0
            if (r1 != 0) goto L24
            goto L36
        L24:
            z4.j r1 = r1.f5092d
            t4.b r1 = (t4.b) r1
            t4.b r3 = new t4.b
            r3.<init>()
            r3.m(r0)
            r3.m(r1)
            r3.f22555g = r2
            r0 = r3
        L36:
            java.lang.String r1 = "Signature"
            h4.s r1 = r12.o(r1)
            h4.o r1 = (h4.o) r1
            r3 = 3
            r4 = 0
            if (r1 != 0) goto L45
            r5 = r4
            goto Lc2
        L45:
            v4.c0 r1 = r1.f5087b
            t4.a r5 = new t4.a
            v4.d0 r6 = r4.d.f11387f
            r5.<init>(r6, r3)
            java.lang.String r1 = r1.f14067g
            int r6 = r1.length()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            r8 = r2
        L5c:
            if (r8 >= r6) goto L92
            char r9 = r1.charAt(r8)
            int r10 = r8 + 1
            r11 = 76
            if (r9 != r11) goto L7d
        L68:
            if (r10 >= r6) goto L89
            char r9 = r1.charAt(r10)
            r11 = 59
            if (r9 != r11) goto L75
            int r10 = r10 + 1
            goto L89
        L75:
            r11 = 60
            if (r9 != r11) goto L7a
            goto L89
        L7a:
            int r10 = r10 + 1
            goto L68
        L7d:
            if (r10 >= r6) goto L89
            char r9 = r1.charAt(r10)
            if (r9 != r11) goto L86
            goto L89
        L86:
            int r10 = r10 + 1
            goto L7d
        L89:
            java.lang.String r8 = r1.substring(r8, r10)
            r7.add(r8)
            r8 = r10
            goto L5c
        L92:
            int r1 = r7.size()
            v4.c r6 = new v4.c
            r6.<init>(r1)
            r8 = r2
        L9c:
            if (r8 >= r1) goto Laf
            v4.c0 r9 = new v4.c0
            java.lang.Object r10 = r7.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            r9.<init>(r10)
            r6.m(r8, r9)
            int r8 = r8 + 1
            goto L9c
        Laf:
            r6.f22555g = r2
            t4.d r1 = new t4.d
            v4.c0 r7 = r4.d.f11392k
            v4.d r8 = new v4.d
            r8.<init>(r6)
            r1.<init>(r7, r8)
            r5.n(r1)
            r5.f22555g = r2
        Lc2:
            java.lang.String r1 = "SourceDebugExtension"
            h4.s r12 = r12.o(r1)
            h4.p r12 = (h4.p) r12
            if (r12 != 0) goto Lcd
            goto Le2
        Lcd:
            v4.c0 r12 = r12.f5088b
            t4.a r4 = new t4.a
            v4.d0 r1 = r4.d.f11388g
            r4.<init>(r1, r3)
            t4.d r1 = new t4.d
            v4.c0 r3 = r4.d.f11392k
            r1.<init>(r3, r12)
            r4.n(r1)
            r4.f22555g = r2
        Le2:
            if (r5 == 0) goto Le8
            t4.b r0 = t4.b.n(r0, r5)
        Le8:
            if (r4 == 0) goto Lef
            t4.b r12 = t4.b.n(r0, r4)
            return r12
        Lef:
            return r0
    }

    public static java.lang.Object t(java.lang.reflect.Method r7, java.lang.Class r8, java.lang.Class r9, java.util.HashSet r10) {
            r0 = 0
            if (r9 == 0) goto L51
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L51
            boolean r1 = r10.add(r9)
            if (r1 != 0) goto L12
            goto L51
        L12:
            java.lang.Class[] r1 = r9.getInterfaces()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L1b:
            if (r3 < r2) goto L26
            java.lang.Class r9 = r9.getSuperclass()
            java.lang.Object r7 = t(r7, r8, r9, r10)
            return r7
        L26:
            r4 = r1[r3]
            r4.getClass()
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r7)     // Catch: java.lang.Throwable -> L43
            if (r5 != 0) goto L32
            goto L43
        L32:
            java.lang.Object[] r5 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r7, r0, r5)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L43
            boolean r6 = r8.isInstance(r5)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L43
            goto L44
        L43:
            r5 = r0
        L44:
            if (r5 == 0) goto L47
            return r5
        L47:
            java.lang.Object r4 = t(r7, r8, r4, r10)
            if (r4 == 0) goto L4e
            return r4
        L4e:
            int r3 = r3 + 1
            goto L1b
        L51:
            return r0
    }

    public static byte[] u(java.io.File r6) {
            boolean r0 = r6.isFile()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            long r0 = r6.length()
            r2 = 32
            long r2 = r0 >> r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1d
            int r0 = (int) r0
            byte[] r1 = new byte[r0]
            U(r6, r1, r0)
            return r1
        L1d:
            java.lang.String r0 = "file too large, path:"
            java.lang.String r6 = r6.getPath()
            j8.o.x(r6, r0)
            r6 = 0
            return r6
    }

    public static qc.a v(gf.a r3) {
            gf.c r0 = r3.f4494d
            int r0 = r0.f4536d
            r1 = 6
            if (r0 == r1) goto L9
            r3 = 0
            return r3
        L9:
            sc.a r0 = r3.f4504n
            if (r0 == 0) goto L10
            qc.a r0 = (qc.a) r0
            return r0
        L10:
            ac.k r0 = r3.f4492b
            int r1 = r3.f4503m
            ac.k r3 = r3.f4493c
            java.lang.Object r2 = r0.f179j
            ff.e r2 = (ff.e) r2
            jf.e r2 = r2.f3934d
            int r2 = r2.f6884h
            int r1 = r1 * 4
            int r1 = r1 + r2
            r0.a(r1)
            java.lang.Object r1 = r0.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            r0.a(r1)
            qc.a r1 = new qc.a
            java.util.ArrayList r3 = a7.a.H(r0, r3)
            r1.<init>(r3)
            return r1
    }

    public static t4.b w(l4.b r4) {
            h4.u r0 = r4.getAttributes()
            t4.b r0 = s(r0)
            h4.u r4 = r4.getAttributes()
            java.lang.String r1 = "Exceptions"
            h4.s r4 = r4.o(r1)
            h4.g r4 = (h4.g) r4
            if (r4 != 0) goto L19
            w4.b r4 = w4.b.f14847i
            goto L1b
        L19:
            w4.e r4 = r4.f5083b
        L1b:
            int r1 = r4.size()
            if (r1 == 0) goto L3f
            v4.d r4 = r4.d.a(r4)
            t4.a r1 = new t4.a
            v4.d0 r2 = r4.d.f11389h
            r3 = 3
            r1.<init>(r2, r3)
            t4.d r2 = new t4.d
            v4.c0 r3 = r4.d.f11392k
            r2.<init>(r3, r4)
            r1.n(r2)
            r4 = 0
            r1.f22555g = r4
            t4.b r4 = t4.b.n(r0, r1)
            return r4
        L3f:
            return r0
    }

    public static jf.h x(gf.a r4) {
            gf.c r0 = r4.f4494d
            int r0 = r0.f4536d
            r1 = 5
            if (r0 == r1) goto L9
            r4 = 0
            return r4
        L9:
            sc.a r0 = r4.f4504n
            if (r0 == 0) goto L10
            jf.h r0 = (jf.h) r0
            return r0
        L10:
            ac.k r0 = r4.f4492b
            int r4 = r4.f4503m
            jf.h r1 = new jf.h
            r1.<init>()
            java.lang.Object r2 = r0.f179j
            ff.e r2 = (ff.e) r2
            int r2 = r2.f3931a
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            int r2 = r2 << 16
            r3 = r3 & r4
            r2 = r2 | r3
            r1.f6894a = r2
            r1.f6899f = r4
            r1.f6900g = r0
            return r1
    }

    public static t4.c y(l4.b r8) {
            h4.u r8 = r8.getAttributes()
            java.lang.String r0 = "RuntimeVisibleParameterAnnotations"
            h4.s r0 = r8.o(r0)
            h4.n r0 = (h4.n) r0
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            h4.s r8 = r8.o(r1)
            h4.l r8 = (h4.l) r8
            if (r0 != 0) goto L20
            if (r8 != 0) goto L1b
            t4.c r8 = t4.c.f13075i
            return r8
        L1b:
            z4.j r8 = r8.f5092d
            t4.c r8 = (t4.c) r8
            return r8
        L20:
            z4.j r0 = r0.f5092d
            t4.c r0 = (t4.c) r0
            if (r8 != 0) goto L27
            return r0
        L27:
            z4.j r8 = r8.f5092d
            t4.c r8 = (t4.c) r8
            t4.c r1 = t4.c.f13075i
            java.lang.Object[] r1 = r0.f22543h
            int r1 = r1.length
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            if (r1 != r2) goto L63
            t4.c r2 = new t4.c
            r2.<init>(r1)
            r3 = 0
            r4 = r3
        L3c:
            if (r4 >= r1) goto L60
            java.lang.Object r5 = r0.l(r4)
            t4.b r5 = (t4.b) r5
            java.lang.Object r6 = r8.l(r4)
            t4.b r6 = (t4.b) r6
            t4.b r7 = new t4.b
            r7.<init>()
            r7.m(r5)
            r7.m(r6)
            r7.f22555g = r3
            r7.k()
            r2.m(r4, r7)
            int r4 = r4 + 1
            goto L3c
        L60:
            r2.f22555g = r3
            return r2
        L63:
            java.lang.String r8 = "list1.size() != list2.size()"
            j8.o.t(r8)
            r8 = 0
            return r8
    }

    public static final i2.g z(n2.s r3) {
            i2.g r0 = r3.f8976a
            long r1 = r3.f8977b
            r0.getClass()
            int r3 = i2.m0.f(r1)
            int r1 = i2.m0.e(r1)
            i2.g r3 = r0.b(r3, r1)
            return r3
    }
}
