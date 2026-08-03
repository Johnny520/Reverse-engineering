package pa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f10454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f10455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f10456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f10457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f10458g;

    public c(java.lang.ClassLoader r2, h.Hchat.dexkit.DexFinder r3, l3.l r4, na.b r5) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f10458g = r0
            r1.f10454c = r2
            r1.f10455d = r3
            r1.f10456e = r4
            r1.f10457f = r5
            return
    }

    public c(u3.c r1, i.e0 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f10454c = r1
            r0.f10455d = r2
            uf.d r1 = new uf.d
            r2 = 4
            r1.<init>(r2)
            r0.f10456e = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f10457f = r1
            return
    }

    public static java.lang.Object c(java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L4f
        L3:
            java.lang.String r0 = "a"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r5, r0)     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            return r0
        Lc:
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L4f
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4f
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r5)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L2b
            goto L18
        L2b:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "toByteArray"
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L3b
            goto L18
        L3b:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "parseFrom"
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L4e
            goto L18
        L4e:
            return r1
        L4f:
            r5 = 0
            return r5
    }

    public static long[] e(byte[] r7, int r8, int r9) {
            r0 = 0
            r2 = 0
            r3 = r2
        L4:
            if (r8 >= r9) goto L25
            r4 = 64
            if (r3 >= r4) goto L25
            int r4 = r8 + 1
            r8 = r7[r8]
            r5 = r8 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r5 = r5 << r3
            long r0 = r0 | r5
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 != 0) goto L21
            long r7 = (long) r4
            r9 = 2
            long[] r9 = new long[r9]
            r9[r2] = r0
            r0 = 1
            r9[r0] = r7
            return r9
        L21:
            int r3 = r3 + 7
            r8 = r4
            goto L4
        L25:
            java.lang.String r7 = "bad varint"
            j8.o.t(r7)
            r7 = 0
            return r7
    }

    public static g8.b g(byte[] r12, int r13, int r14) {
            r0 = 0
            if (r13 < 0) goto Lb9
            int r1 = r12.length
            if (r13 > r1) goto Lb9
            r1 = 12
            if (r14 <= r1) goto Lc
            goto Lb9
        Lc:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
        L14:
            if (r3 >= r13) goto Laf
            long[] r3 = e(r12, r3, r13)     // Catch: java.lang.Throwable -> Lb9
            r5 = r3[r2]     // Catch: java.lang.Throwable -> Lb9
            r7 = 1
            r8 = r3[r7]     // Catch: java.lang.Throwable -> Lb9
            int r3 = (int) r8     // Catch: java.lang.Throwable -> Lb9
            r8 = 0
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L28
            goto Lb9
        L28:
            r8 = 3
            long r9 = r5 >>> r8
            int r9 = (int) r9     // Catch: java.lang.Throwable -> Lb9
            r10 = 7
            long r10 = r10 & r5
            int r10 = (int) r10     // Catch: java.lang.Throwable -> Lb9
            if (r9 <= 0) goto Lb9
            if (r10 == r8) goto Lb9
            r8 = 4
            if (r10 == r8) goto Lb9
            r9 = 5
            if (r10 <= r9) goto L3c
            goto Lb9
        L3c:
            i(r1, r5)     // Catch: java.lang.Throwable -> Lb9
            if (r10 != 0) goto L4e
            long[] r3 = e(r12, r3, r13)     // Catch: java.lang.Throwable -> Lb9
            r5 = r3[r2]     // Catch: java.lang.Throwable -> Lb9
            i(r1, r5)     // Catch: java.lang.Throwable -> Lb9
            r5 = r3[r7]     // Catch: java.lang.Throwable -> Lb9
            int r3 = (int) r5     // Catch: java.lang.Throwable -> Lb9
            goto L14
        L4e:
            if (r10 != r7) goto L5d
            int r5 = r3 + 8
            if (r5 <= r13) goto L56
            goto Lb9
        L56:
            r6 = 8
            r1.write(r12, r3, r6)     // Catch: java.lang.Throwable -> Lb9
        L5b:
            r3 = r5
            goto L14
        L5d:
            r5 = 2
            if (r10 != r5) goto La4
            long[] r3 = e(r12, r3, r13)     // Catch: java.lang.Throwable -> Lb9
            r5 = r3[r2]     // Catch: java.lang.Throwable -> Lb9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> Lb9
            r8 = r3[r7]     // Catch: java.lang.Throwable -> Lb9
            int r3 = (int) r8     // Catch: java.lang.Throwable -> Lb9
            if (r5 < 0) goto Lb9
            int r5 = r5 + r3
            if (r5 <= r13) goto L70
            goto Lb9
        L70:
            byte[] r3 = java.util.Arrays.copyOfRange(r12, r3, r5)     // Catch: java.lang.Throwable -> Lb9
            int r6 = r3.length     // Catch: java.lang.Throwable -> Lb9
            if (r6 <= 0) goto L7e
            int r6 = r3.length     // Catch: java.lang.Throwable -> Lb9
            int r7 = r7 + r14
            g8.b r6 = g(r3, r6, r7)     // Catch: java.lang.Throwable -> Lb9
            goto L7f
        L7e:
            r6 = r0
        L7f:
            if (r6 == 0) goto L88
            int r7 = r6.f4344c     // Catch: java.lang.Throwable -> Lb9
            if (r7 <= 0) goto L88
            byte[] r6 = r6.f4343b     // Catch: java.lang.Throwable -> Lb9
            goto L8a
        L88:
            r7 = r2
            r6 = r3
        L8a:
            if (r7 != 0) goto L99
            byte[] r8 = h(r3)     // Catch: java.lang.Throwable -> Lb9
            boolean r3 = java.util.Arrays.equals(r3, r8)     // Catch: java.lang.Throwable -> Lb9
            if (r3 != 0) goto L99
            int r7 = r7 + 1
            r6 = r8
        L99:
            int r3 = r6.length     // Catch: java.lang.Throwable -> Lb9
            long r8 = (long) r3     // Catch: java.lang.Throwable -> Lb9
            i(r1, r8)     // Catch: java.lang.Throwable -> Lb9
            int r3 = r6.length     // Catch: java.lang.Throwable -> Lb9
            r1.write(r6, r2, r3)     // Catch: java.lang.Throwable -> Lb9
            int r4 = r4 + r7
            goto L5b
        La4:
            if (r10 != r9) goto L14
            int r5 = r3 + 4
            if (r5 <= r13) goto Lab
            goto Lb9
        Lab:
            r1.write(r12, r3, r8)     // Catch: java.lang.Throwable -> Lb9
            goto L5b
        Laf:
            g8.b r12 = new g8.b     // Catch: java.lang.Throwable -> Lb9
            byte[] r13 = r1.toByteArray()     // Catch: java.lang.Throwable -> Lb9
            r12.<init>(r13, r4)     // Catch: java.lang.Throwable -> Lb9
            return r12
        Lb9:
            return r0
    }

    public static byte[] h(byte[] r7) {
            int r0 = r7.length
            if (r0 != 0) goto L4
            goto L69
        L4:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L69
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L69
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "username="
            int r2 = r0.indexOf(r2)     // Catch: java.lang.Throwable -> L69
            if (r2 >= 0) goto L14
            goto L69
        L14:
            int r2 = r2 + 9
            java.lang.String r3 = "&"
            int r3 = r0.indexOf(r3, r2)     // Catch: java.lang.Throwable -> L69
            if (r3 >= 0) goto L22
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L69
        L22:
            r4 = 0
            java.lang.String r4 = r0.substring(r4, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = r0.substring(r2, r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.ConcurrentHashMap r3 = pa.a.f10449a     // Catch: java.lang.Throwable -> L69
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L39
            r3 = r2
            goto L49
        L39:
            java.lang.String r3 = "%40"
            java.lang.String r5 = "%40%40"
            java.lang.String r3 = r2.replace(r3, r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = "@"
            java.lang.String r6 = "@@"
            java.lang.String r3 = r3.replace(r5, r6)     // Catch: java.lang.Throwable -> L69
        L49:
            boolean r5 = r3.equals(r2)     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L50
            goto L69
        L50:
            pa.a.b(r2, r3)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r2.<init>()     // Catch: java.lang.Throwable -> L69
            r2.append(r4)     // Catch: java.lang.Throwable -> L69
            r2.append(r3)     // Catch: java.lang.Throwable -> L69
            r2.append(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L69
            byte[] r7 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L69
        L69:
            return r7
    }

    public static void i(java.io.ByteArrayOutputStream r4, long r5) {
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

    public void a(java.lang.String r2, java.util.ArrayList r3) {
            r1 = this;
            java.lang.Object r0 = r1.f10454c     // Catch: java.lang.Throwable -> L13
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch: java.lang.Throwable -> L13
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L13
            boolean r0 = r3.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L13
            r3.add(r2)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public void b(java.util.ArrayList r11) {
            r10 = this;
            java.lang.Object r0 = r10.f10455d     // Catch: java.lang.Throwable -> L6b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0     // Catch: java.lang.Throwable -> L6b
            java.util.List<java.lang.Class<?>> r0 = r0.packetQueueClasses     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L6b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r1)     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6b
        L1e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto La
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L31
            goto L1e
        L31:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L6b
            r4 = 0
        L33:
            if (r4 >= r3) goto L1e
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L6b
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r5)     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L68
        L3f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L68
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = "dispatch"
            java.lang.String r9 = r7.getName()     // Catch: java.lang.Throwable -> L68
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L3f
            java.lang.Class[] r7 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L68
            int r7 = r7.length     // Catch: java.lang.Throwable -> L68
            r8 = 3
            if (r7 != r8) goto L3f
            boolean r7 = r11.contains(r5)     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L3f
            r11.add(r5)     // Catch: java.lang.Throwable -> L68
        L68:
            int r4 = r4 + 1
            goto L33
        L6b:
            return
    }

    public void d(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10457f
            na.b r0 = (na.b) r0
            if (r0 == 0) goto Lb
            na.e r0 = r0.f9099h
            r0.d(r2)
        Lb:
            return
    }

    public byte[] f(byte[] r7) {
            r6 = this;
            r0 = 0
            int r1 = r7.length     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L5
            goto L3b
        L5:
            r1 = 0
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L1c
            int r3 = r7.length     // Catch: java.lang.Throwable -> L1c
            r4 = 4
            if (r3 < r4) goto L1e
            r3 = r7[r1]     // Catch: java.lang.Throwable -> L1c
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L1e
            byte[] r2 = java.util.Arrays.copyOfRange(r7, r1, r4)     // Catch: java.lang.Throwable -> L1c
            int r3 = r7.length     // Catch: java.lang.Throwable -> L1c
            byte[] r3 = java.util.Arrays.copyOfRange(r7, r4, r3)     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            r7 = move-exception
            goto L67
        L1e:
            r3 = r7
        L1f:
            if (r3 == 0) goto L34
            int r4 = r3.length     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L25
            goto L34
        L25:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L34
            g8.b r4 = g(r3, r4, r1)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L2d
            goto L34
        L2d:
            int r5 = r4.f4344c     // Catch: java.lang.Throwable -> L34
            if (r5 <= 0) goto L34
            byte[] r4 = r4.f4343b     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
            r4 = r3
        L35:
            boolean r3 = java.util.Arrays.equals(r3, r4)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L3c
        L3b:
            return r0
        L3c:
            if (r2 == 0) goto L58
            int r3 = r2.length     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L42
            goto L58
        L42:
            if (r4 == 0) goto L5e
            int r3 = r4.length     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L48
            goto L5e
        L48:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L1c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + r5
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1c
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1c
            java.lang.System.arraycopy(r2, r1, r3, r1, r5)     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L1c
            java.lang.System.arraycopy(r4, r1, r3, r2, r5)     // Catch: java.lang.Throwable -> L1c
            r2 = r3
            goto L5e
        L58:
            if (r4 != 0) goto L5d
            byte[] r2 = new byte[r1]     // Catch: java.lang.Throwable -> L1c
            goto L5e
        L5d:
            r2 = r4
        L5e:
            boolean r7 = java.util.Arrays.equals(r7, r2)     // Catch: java.lang.Throwable -> L1c
            if (r7 == 0) goto L65
            goto L66
        L65:
            r0 = r2
        L66:
            return r0
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ERROR 发包PB篡改失败: "
            r1.<init>(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r6.d(r7)
            return r0
    }
}
