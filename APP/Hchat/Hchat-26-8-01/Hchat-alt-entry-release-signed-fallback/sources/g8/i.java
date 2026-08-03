package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.String[] f4366k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.lang.String[] f4367l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f4368m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f4369n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f4370o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.hooks.api.runtime.WeChatDatabaseApi f4371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f4372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.c f4373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i8.f f4374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f4376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile java.lang.Class f4377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f4378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.reflect.Method f4379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile java.lang.reflect.Method f4380j;

    static {
            java.lang.String r0 = "ContactLabel"
            java.lang.String r1 = "contactlabel"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            g8.i.f4366k = r0
            java.lang.String r0 = "labelId"
            java.lang.String r1 = "labelid"
            java.lang.String r2 = "labelID"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            g8.i.f4367l = r0
            java.lang.String r0 = "labelName"
            java.lang.String r1 = "labelname"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            g8.i.f4368m = r0
            java.lang.String r0 = "contactLabelIds"
            java.lang.String r1 = "contactLabelids"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            g8.i.f4369n = r0
            java.lang.String r0 = "ig"
            java.lang.String r1 = "hh"
            java.lang.String r2 = "u"
            java.lang.String r3 = "r"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            g8.i.f4370o = r0
            return
    }

    public i(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2, h.Hchat.dexkit.DexFinder r3, m8.c r4, i8.f r5) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f4375e = r0
            r1.f4371a = r2
            r1.f4372b = r3
            r1.f4373c = r4
            r1.f4374d = r5
            return
    }

    public static java.lang.Object E(java.lang.Object r1, java.lang.String r2, java.lang.reflect.Method r3) {
            if (r1 == 0) goto L1c
            if (r3 == 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r3, r1, r0)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = J(r1, r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1c
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static boolean F(java.lang.reflect.Method r5, java.lang.Object r6, java.lang.String r7, java.lang.Object r8) {
            r0 = 0
            if (r5 == 0) goto L35
            if (r6 == 0) goto L35
            java.lang.Class[] r1 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L35
            int r2 = r1.length     // Catch: java.lang.Throwable -> L35
            r3 = 1
            if (r2 != r3) goto L16
            java.lang.Object[] r7 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            goto L28
        L16:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L35
            r4 = 2
            if (r2 != r4) goto L35
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L35
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r6, r7)     // Catch: java.lang.Throwable -> L35
        L28:
            boolean r6 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L34
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L35
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L35
        L34:
            return r3
        L35:
            return r0
    }

    public static boolean I(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "@chatroom"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "@im.chatroom"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static boolean J(java.lang.Object r3, java.lang.String r4) {
            if (r3 != 0) goto L3
            goto L4c
        L3:
            java.lang.String r0 = "field_username"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L10
            goto L4a
        L10:
            java.lang.String r1 = "username"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r3, r1)
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L1d
            goto L4a
        L1d:
            java.lang.Class r4 = r3.getClass()
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r0)
            if (r4 == 0) goto L34
            java.lang.Class r4 = r3.getClass()
            java.lang.String r0 = "field_conRemark"
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r0)
            if (r4 == 0) goto L34
            goto L4a
        L34:
            java.lang.Class r4 = r3.getClass()
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r1)
            if (r4 == 0) goto L4c
            java.lang.Class r3 = r3.getClass()
            java.lang.String r4 = "conRemark"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r4)
            if (r3 == 0) goto L4c
        L4a:
            r3 = 1
            return r3
        L4c:
            r3 = 0
            return r3
    }

    public static boolean K(java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L25
            java.lang.Class r1 = r4.getClass()
            java.lang.String r2 = "toByteArray"
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethodRecursive(r1, r2, r3)
            if (r1 == 0) goto L25
            java.lang.Class r4 = r4.getClass()
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "parseFrom"
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethodRecursive(r4, r2, r1)
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r0
    }

    public static java.util.ArrayList M(java.util.ArrayList r5, java.util.List r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L62
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Le
            goto L62
        Le:
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L25
            goto L12
        L25:
            java.lang.String r1 = r1.trim()
            java.util.Iterator r2 = r5.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L12
            java.lang.Object r3 = r2.next()
            h.Hchat.hooks.api.model.ContactLabelBean r3 = (h.Hchat.hooks.api.model.ContactLabelBean) r3
            java.lang.String r4 = r3.getLabelName()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L4e
            java.lang.String r4 = r3.getName()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L4e
            goto L2d
        L4e:
            java.lang.String r1 = r3.getLabelId()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L12
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L12
            r0.add(r1)
            goto L12
        L62:
            return r0
    }

    public static e8.a T(byte[] r6) {
            e8.a r0 = new e8.a
            r0.<init>()
            g8.b r1 = new g8.b     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            r3 = 0
            r1.<init>(r6, r2, r3)     // Catch: java.lang.Throwable -> L5d
        Lc:
            int r6 = r1.f4344c     // Catch: java.lang.Throwable -> L5d
            byte[] r2 = r1.f4343b     // Catch: java.lang.Throwable -> L5d
            int r2 = r2.length     // Catch: java.lang.Throwable -> L5d
            r3 = 1
            if (r6 < r2) goto L16
            r6 = r3
            goto L17
        L16:
            r6 = 0
        L17:
            if (r6 != 0) goto L5c
            int r6 = r1.j()     // Catch: java.lang.Throwable -> L5d
            int r2 = r6 >>> 3
            r6 = r6 & 7
            java.lang.String r4 = "UTF-8"
            r5 = 2
            if (r6 != r5) goto L3e
            if (r2 != r3) goto L3e
            byte[] r6 = r1.h()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L5d
        L37:
            java.lang.String r6 = r2.trim()     // Catch: java.lang.Throwable -> L5d
            r0.f2356b = r6     // Catch: java.lang.Throwable -> L5d
            goto Lc
        L3e:
            if (r6 != r5) goto L58
            if (r2 != r5) goto L58
            byte[] r6 = r1.h()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L5d
        L51:
            java.lang.String r6 = r2.trim()     // Catch: java.lang.Throwable -> L5d
            r0.f2357c = r6     // Catch: java.lang.Throwable -> L5d
            goto Lc
        L58:
            r1.l(r6)     // Catch: java.lang.Throwable -> L5d
            goto Lc
        L5c:
            return r0
        L5d:
            e8.a r6 = new e8.a
            r6.<init>()
            return r6
    }

    public static java.lang.String V(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L31
        L7:
            r0 = 0
        L8:
            int r1 = r3.length()
            if (r0 >= r1) goto L34
            char r1 = r3.charAt(r0)
            r2 = 97
            if (r1 < r2) goto L1a
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 <= r2) goto L2e
        L1a:
            r2 = 65
            if (r1 < r2) goto L22
            r2 = 90
            if (r1 <= r2) goto L2e
        L22:
            r2 = 48
            if (r1 < r2) goto L2a
            r2 = 57
            if (r1 <= r2) goto L2e
        L2a:
            r2 = 95
            if (r1 != r2) goto L31
        L2e:
            int r0 = r0 + 1
            goto L8
        L31:
            java.lang.String r3 = ""
            return r3
        L34:
            java.lang.String r0 = "`"
            java.lang.String r3 = eh.a.n(r0, r3, r0)
            return r3
    }

    public static java.lang.String W(java.nio.ByteBuffer r2) {
            r0 = 2
            f(r0, r2)
            short r0 = r2.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L11
            java.lang.String r2 = ""
            return r2
        L11:
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 > r1) goto L2b
            f(r0, r2)
            byte[] r0 = new byte[r0]
            r2.get(r0)
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "UTF-8"
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            return r2
        L2b:
            java.lang.String r2 = "字符串长度异常: "
            java.lang.String r2 = eh.a.l(r0, r2)
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    public static java.util.ArrayList Z(java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Lc
            goto L4b
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.String r5 = ""
            goto L23
        L16:
            java.lang.String r1 = "\u0000"
            boolean r1 = r5.endsWith(r1)
            if (r1 == 0) goto L23
            r1 = 1
            java.lang.String r5 = wb.en.f(r1, r2, r5)
        L23:
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
        L2a:
            if (r2 >= r1) goto L4b
            r3 = r5[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L35
            goto L48
        L35:
            java.lang.String r3 = r3.trim()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L48
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L48
            r0.add(r3)
        L48:
            int r2 = r2 + 1
            goto L2a
        L4b:
            return r0
    }

    public static java.lang.String a0(java.lang.String r0, java.util.Map r1) {
            if (r1 == 0) goto L7
            java.lang.Object r0 = r1.get(r0)
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto Lf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public static void e(java.lang.Object r2, java.util.IdentityHashMap r3, java.util.ArrayList r4) {
            if (r2 == 0) goto L3c
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L9
            goto L3c
        L9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.put(r2, r0)
            boolean r0 = K(r2)
            if (r0 == 0) goto L17
            r4.add(r2)
        L17:
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L23:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r2)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L23
            if (r1 != r2) goto L38
            goto L23
        L38:
            e(r1, r3, r4)     // Catch: java.lang.Throwable -> L3c
            goto L23
        L3c:
            return
    }

    public static void f(int r0, java.nio.ByteBuffer r1) {
            int r1 = r1.remaining()
            if (r1 < r0) goto L7
            return
        L7:
            java.lang.String r0 = "lvbuff长度不足"
            j8.o.A(r0)
            return
    }

    public static java.lang.reflect.Method g(java.lang.Class r5, java.lang.String r6, java.lang.Class... r7) {
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r1 = r0.getName()
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L1f
            goto L8
        L1f:
            java.lang.Class[] r1 = r0.getParameterTypes()
            if (r1 == 0) goto L8
            int r2 = r1.length
            int r3 = r7.length
            if (r2 == r3) goto L2a
            goto L8
        L2a:
            r2 = 0
        L2b:
            int r3 = r1.length
            if (r2 >= r3) goto L3c
            r3 = r1[r2]
            r4 = r7[r2]
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L39
            goto L8
        L39:
            int r2 = r2 + 1
            goto L2b
        L3c:
            return r0
        L3d:
            r5 = 0
            return r5
    }

    public static java.lang.Object i(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "d"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r3, r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "a"
            if (r1 == 0) goto L13
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 == 0) goto L1b
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r2)     // Catch: java.lang.Throwable -> L1f
            goto L1c
        L1b:
            r1 = r0
        L1c:
            if (r1 == 0) goto L1f
            return r1
        L1f:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.lang.Object r1 = k(r3, r1)
            if (r1 == 0) goto L2b
            return r1
        L2b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            e(r3, r2, r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3f
            goto L44
        L3f:
            r3 = 0
            java.lang.Object r0 = r1.get(r3)
        L44:
            return r0
    }

    public static java.lang.Object k(java.lang.Object r3, java.util.IdentityHashMap r4) {
            if (r3 != 0) goto L3
            goto L45
        L3:
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto La
            goto L45
        La:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.put(r3, r0)
            boolean r0 = K(r3)
            if (r0 == 0) goto L16
            return r3
        L16:
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L45
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L45
        L22:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r3)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L22
            if (r1 != r3) goto L37
            goto L22
        L37:
            boolean r2 = K(r1)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L3e
            return r1
        L3e:
            java.lang.Object r1 = k(r1, r4)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L22
            return r1
        L45:
            r3 = 0
            return r3
    }

    public final java.util.LinkedHashMap A(byte[] r6) {
            r5 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            if (r6 == 0) goto L6d
            int r1 = r6.length
            if (r1 != 0) goto Lb
            goto L6d
        Lb:
            g8.b r1 = new g8.b     // Catch: java.lang.Throwable -> L52
            r2 = 1
            r3 = 0
            r1.<init>(r6, r2, r3)     // Catch: java.lang.Throwable -> L52
        L12:
            int r6 = r1.f4344c     // Catch: java.lang.Throwable -> L52
            byte[] r2 = r1.f4343b     // Catch: java.lang.Throwable -> L52
            int r2 = r2.length     // Catch: java.lang.Throwable -> L52
            r3 = 1
            if (r6 < r2) goto L1c
            r6 = r3
            goto L1d
        L1c:
            r6 = 0
        L1d:
            if (r6 != 0) goto L6d
            int r6 = r1.j()     // Catch: java.lang.Throwable -> L52
            int r2 = r6 >>> 3
            r6 = r6 & 7
            if (r2 != r3) goto L54
            r2 = 2
            if (r6 != r2) goto L54
            byte[] r6 = r1.h()     // Catch: java.lang.Throwable -> L52
            e8.a r6 = T(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r6.f2356b     // Catch: java.lang.Throwable -> L52
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L12
            java.lang.String r2 = r6.f2357c     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = ""
            if (r2 == 0) goto L43
            goto L44
        L43:
            r2 = r3
        L44:
            java.lang.String r6 = r6.f2356b     // Catch: java.lang.Throwable -> L52
            boolean r4 = r6.equals(r2)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r3 = r2
        L4e:
            r0.put(r6, r3)     // Catch: java.lang.Throwable -> L52
            goto L12
        L52:
            r6 = move-exception
            goto L58
        L54:
            r1.l(r6)     // Catch: java.lang.Throwable -> L52
            goto L12
        L58:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "解析群roomdata失败: "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.N(r6)
        L6d:
            return r0
    }

    public final boolean B(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "PRAGMA table_info("
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r1 != 0) goto L7d
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L7d
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r7.f4371a
            if (r1 != 0) goto L14
            goto L7d
        L14:
            java.lang.String r3 = ":"
            java.lang.String r3 = wb.en.h(r8, r3, r9)
            java.util.concurrent.ConcurrentHashMap r4 = r7.f4375e
            java.lang.Object r5 = r4.get(r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L29
            boolean r8 = r5.booleanValue()
            return r8
        L29:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            r5.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            r5 = 0
            java.util.List r0 = r1.query(r0, r5)     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5d
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5d
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "name"
            java.lang.String r1 = a0(r5, r1)     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r9.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L43
            r2 = 1
            goto L76
        L5d:
            r0 = move-exception
            java.lang.String r1 = "."
            java.lang.String r5 = " "
            java.lang.String r6 = "检测字段失败: "
            java.lang.StringBuilder r8 = bc.e.p(r6, r8, r1, r9, r5)
            java.lang.String r9 = r0.getMessage()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.N(r8)
        L76:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r4.put(r3, r8)
        L7d:
            return r2
    }

    public final boolean C(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L65
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Le
            goto L65
        Le:
            java.lang.String r6 = r6.trim()
            java.util.List r6 = java.util.Collections.singletonList(r6)
            java.util.ArrayList r0 = r4.p()
            java.util.ArrayList r6 = M(r0, r6)
            int r0 = r6.size()
            r2 = 1
            if (r0 == r2) goto L26
            goto L65
        L26:
            java.lang.String r0 = "rcontact"
            java.lang.String[] r2 = g8.i.f4369n
            java.lang.String r0 = r4.l(r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L35
            goto L65
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SELECT "
            r2.<init>(r3)
            java.lang.String r0 = V(r0)
            r2.append(r0)
            java.lang.String r0 = " AS labelIds FROM rcontact WHERE username=? LIMIT 1"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r2 = "labelIds"
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r3 = r4.f4371a
            java.lang.String r5 = r3.queryFirstString(r0, r5, r2)
            java.util.ArrayList r5 = Z(r5)
            java.lang.Object r6 = r6.get(r1)
            boolean r5 = r5.contains(r6)
            return r5
        L65:
            return r1
    }

    public final void D() {
            r3 = this;
            boolean r0 = r3.f4376f
            if (r0 != 0) goto L28
            m8.c r0 = r3.f4373c
            if (r0 == 0) goto L28
            h.Hchat.dexkit.DexFinder r0 = r3.f4372b
            if (r0 != 0) goto Ld
            goto L28
        Ld:
            java.lang.Class<?> r1 = r0.netQueueClass
            if (r1 != 0) goto L1a
            java.util.List<java.lang.Class<?>> r0 = r0.netQueueCandidateClasses
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            goto L28
        L1a:
            m8.c r0 = r3.f4373c
            h.Hchat.dexkit.DexFinder r1 = r3.f4372b
            java.lang.Class<?> r2 = r1.netQueueClass
            java.util.List<java.lang.Class<?>> r1 = r1.netQueueCandidateClasses
            r0.c(r2, r1)
            r0 = 1
            r3.f4376f = r0
        L28:
            return
    }

    public final boolean G() {
            r1 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r1.f4371a
            if (r0 == 0) goto Lc
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean H(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = "SELECT r.username FROM rcontact r WHERE r.username=? AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom' AND (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) LIMIT 1"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r2.f4371a
            java.util.List r3 = r1.query(r0, r3)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            return r3
    }

    public final boolean L(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            r0 = 2
            java.lang.String r0 = r1.Y(r0)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final void N(java.lang.String r2) {
            r1 = this;
            i8.f r0 = r1.f4374d
            if (r0 == 0) goto Ld
            java.lang.String r0 = "[WeChatContactApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
        Ld:
            return
    }

    public final boolean O(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto Le
            r0.add(r4)
        Le:
            boolean r3 = r2.P(r3, r0)
            return r3
    }

    public final boolean P(java.lang.String r6, java.util.List r7) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L47
            if (r7 != 0) goto L9
            goto L47
        L9:
            java.lang.String r0 = "rcontact"
            java.lang.String[] r1 = g8.i.f4369n
            java.lang.String r0 = r5.l(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L18
            goto L47
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT "
            r1.<init>(r2)
            java.lang.String r2 = V(r0)
            r1.append(r2)
            java.lang.String r2 = " AS labelIds FROM rcontact WHERE username=? LIMIT 1"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r2 = new java.lang.String[]{r6}
            java.lang.String r3 = "labelIds"
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r4 = r5.f4371a
            java.lang.String r1 = r4.queryFirstString(r1, r2, r3)
            java.lang.String r7 = r5.c(r1, r7)
            if (r7 != 0) goto L42
            goto L47
        L42:
            boolean r6 = r5.b(r6, r0, r7)
            return r6
        L47:
            r6 = 0
            return r6
    }

    public final boolean Q(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ""
            if (r12 != 0) goto Le
            r12 = r0
            goto L12
        Le:
            java.lang.String r12 = r12.trim()
        L12:
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L1a
        L18:
            r0 = r1
            goto L6e
        L1a:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "2"
            r2.put(r3, r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "3"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "1"
            if (r12 != 0) goto L31
            r6 = r0
            goto L32
        L31:
            r6 = r12
        L32:
            org.json.JSONObject r4 = r4.put(r5, r6)     // Catch: java.lang.Throwable -> L46
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L46
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L46
            if (r3 != 0) goto L44
            java.lang.String r3 = "4"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L46
        L44:
            r0 = r2
            goto L48
        L46:
            r0 = move-exception
            goto L58
        L48:
            java.lang.String r2 = "/cgi-bin/micromsg-bin/setcontactproperty"
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L46
            r4 = 0
            r5 = 0
            r3 = 10022(0x2726, float:1.4044E-41)
            r7 = 0
            boolean r0 = wa.j.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L6e
        L58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "修改好友备注PB发包异常: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r10.N(r0)
            goto L18
        L6e:
            java.lang.String r2 = "conRemark"
            r3 = 1
            if (r0 != 0) goto L12d
            java.lang.String r0 = "修改好友备注失败: 未找到原生备注字段 username="
            boolean r4 = android.text.TextUtils.isEmpty(r11)
            if (r4 == 0) goto L7e
        L7b:
            r0 = r1
            goto L12d
        L7e:
            b.e r4 = r10.R(r11)     // Catch: java.lang.Throwable -> Lf1
            if (r4 == 0) goto L7b
            java.lang.Object r5 = r4.f333i     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r6 = r4.f332h     // Catch: java.lang.Throwable -> Lf1
            if (r6 != 0) goto L8b
            goto L7b
        L8b:
            java.lang.String r6 = "field_conRemark"
            boolean r6 = h.Hchat.utils.KavaReflector.writeField(r5, r6, r12)     // Catch: java.lang.Throwable -> Lf1
            if (r6 == 0) goto L94
            goto L9a
        L94:
            boolean r5 = h.Hchat.utils.KavaReflector.writeField(r5, r2, r12)     // Catch: java.lang.Throwable -> Lf1
            if (r5 == 0) goto Lf3
        L9a:
            java.lang.reflect.Method r0 = r10.f4380j     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r5 = r4.f332h     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r6 = r4.f333i     // Catch: java.lang.Throwable -> Lf1
            boolean r0 = F(r0, r5, r11, r6)     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto La9
        La6:
            r0 = r3
            goto L12d
        La9:
            java.lang.Object r0 = r4.f332h     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r5 = r4.f333i     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = "l0"
            java.lang.Class[] r7 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> Lf1
            java.lang.reflect.Method r6 = g(r0, r6, r7)     // Catch: java.lang.Throwable -> Lf1
            if (r6 == 0) goto Lc2
            goto Le2
        Lc2:
            java.lang.String r6 = "p0"
            java.lang.String r7 = "o0"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> Lf1
            r7 = r1
        Lcb:
            r8 = 2
            if (r7 >= r8) goto Le1
            r8 = r6[r7]     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9, r5}     // Catch: java.lang.Throwable -> Lf1
            java.lang.reflect.Method r8 = g(r0, r8, r9)     // Catch: java.lang.Throwable -> Lf1
            if (r8 == 0) goto Lde
            r6 = r8
            goto Le2
        Lde:
            int r7 = r7 + 1
            goto Lcb
        Le1:
            r6 = 0
        Le2:
            if (r6 == 0) goto L7b
            java.lang.Object r0 = r4.f332h     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r4 = r4.f333i     // Catch: java.lang.Throwable -> Lf1
            boolean r0 = F(r6, r0, r11, r4)     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto L7b
            r10.f4380j = r6     // Catch: java.lang.Throwable -> Lf1
            goto La6
        Lf1:
            r0 = move-exception
            goto L116
        Lf3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lf1
            r5.append(r11)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = " contact="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r0 = r4.f333i     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lf1
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lf1
            r10.N(r0)     // Catch: java.lang.Throwable -> Lf1
            goto L7b
        L116:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "修改好友备注原生存储异常: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r10.N(r0)
            goto L7b
        L12d:
            if (r0 != 0) goto L139
            java.lang.String r12 = "修改好友备注失败: 同步接口不可用 username="
            java.lang.String r11 = r12.concat(r11)
            r10.N(r11)
            return r1
        L139:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r0.put(r2, r12)
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = r10.f4371a
            java.lang.String r2 = "username=?"
            java.lang.String[] r4 = new java.lang.String[]{r11}
            java.lang.String r5 = "rcontact"
            int r12 = r12.update(r5, r0, r2, r4)
            if (r12 > 0) goto L16b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "修改好友备注本地刷新失败: username="
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r11 = " rows="
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = r0.toString()
            r10.N(r11)
            return r1
        L16b:
            return r3
    }

    public final b.e R(java.lang.String r6) {
            r5 = this;
            java.lang.Object r0 = r5.f4378h
            java.lang.reflect.Method r1 = r5.f4379i
            java.lang.Object r1 = E(r0, r6, r1)
            if (r1 == 0) goto L12
            b.e r6 = new b.e
            r2 = 9
            r6.<init>(r0, r2, r1)
            return r6
        L12:
            h.Hchat.dexkit.DexFinder r0 = r5.f4372b
            r1 = 0
            if (r0 != 0) goto L19
        L17:
            r3 = r1
            goto L53
        L19:
            java.lang.reflect.Method r2 = r0.contactStorageGetterMethod
            java.lang.reflect.Method r3 = r0.contactStorageQueryMethod
            if (r2 == 0) goto L17
            if (r3 != 0) goto L22
            goto L17
        L22:
            java.lang.Class r4 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = ig.a.A(r0, r4)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L2d
            goto L17
        L2d:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r2, r0, r4)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L17
            java.lang.Class r2 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.isInstance(r0)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L41
            goto L17
        L41:
            java.lang.Object r2 = E(r0, r6, r3)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L48
            goto L17
        L48:
            r5.f4378h = r0     // Catch: java.lang.Throwable -> L17
            r5.f4379i = r3     // Catch: java.lang.Throwable -> L17
            b.e r3 = new b.e     // Catch: java.lang.Throwable -> L17
            r4 = 9
            r3.<init>(r0, r4, r2)     // Catch: java.lang.Throwable -> L17
        L53:
            if (r3 == 0) goto L56
            return r3
        L56:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r5.f4371a
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r0.getCoreStorage()
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 != 0) goto L63
            return r1
        L63:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            b.e r6 = r5.j(r0, r6, r1)
            return r6
    }

    public final java.lang.String S(g8.h r4) {
            r3 = this;
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT MAX(CAST("
            r0.<init>(r1)
            java.lang.String r1 = r4.f4364c
            java.lang.String r1 = V(r1)
            r0.append(r1)
            java.lang.String r1 = " AS INTEGER)) AS maxId FROM "
            r0.append(r1)
            java.lang.String r4 = r4.f4363b
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r3.f4371a
            java.lang.String r4 = r1.quoteTable(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            java.lang.String r2 = "maxId"
            java.lang.String r4 = r1.queryFirstString(r4, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L38
            goto L3c
        L38:
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = 1
            int r1 = r1 + r4
            if (r1 > 0) goto L41
            goto L42
        L41:
            r4 = r1
        L42:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
    }

    public final java.util.ArrayList U(java.lang.String r3, java.lang.String[] r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r2.f4371a
            java.util.List r3 = r1.query(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L23
            java.lang.Object r4 = r3.next()
            java.util.Map r4 = (java.util.Map) r4
            h.Hchat.hooks.api.model.WeChatContact r4 = r2.b0(r4)
            r0.add(r4)
            goto Lf
        L23:
            return r0
    }

    public final java.lang.Class X(java.lang.reflect.Constructor r6) {
            r5 = this;
            java.lang.Class r0 = r5.f4377g
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.newInstance(r6, r1)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = i(r6)     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L1b
            goto L86
        L1b:
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L84
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r6)     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L84
        L27:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L86
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L84
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L84
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r3 = r1.getType()     // Catch: java.lang.Throwable -> L84
            boolean r2 = r2.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L40
            goto L27
        L40:
            java.lang.reflect.Type r1 = r1.getGenericType()     // Catch: java.lang.Throwable -> L84
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L49
            goto L27
        L49:
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1     // Catch: java.lang.Throwable -> L84
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L27
            int r2 = r1.length     // Catch: java.lang.Throwable -> L84
            r3 = 1
            if (r2 != r3) goto L27
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L84
            boolean r2 = r1 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L5d
            goto L27
        L5d:
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "d"
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "e"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r3)     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L27
            if (r3 != 0) goto L70
            goto L27
        L70:
            java.lang.Class r2 = r2.getType()     // Catch: java.lang.Throwable -> L84
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r2 != r4) goto L27
            java.lang.Class r2 = r3.getType()     // Catch: java.lang.Throwable -> L84
            if (r2 == r4) goto L7f
            goto L27
        L7f:
            r5.f4377g = r1     // Catch: java.lang.Throwable -> L84
            java.lang.Class r6 = r5.f4377g     // Catch: java.lang.Throwable -> L84
            return r6
        L84:
            r6 = move-exception
            goto L87
        L86:
            return r0
        L87:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "解析标签请求项类型失败: "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.N(r6)
            return r0
    }

    public final java.lang.String Y(int r4) {
            r3 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r3.f4371a
            if (r0 != 0) goto L7
            java.lang.String r4 = ""
            return r4
        L7:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r1 = "value"
            java.lang.String r2 = "SELECT value FROM userinfo WHERE id=?"
            java.lang.String r4 = r0.queryFirstString(r2, r4, r1)
            return r4
    }

    public final java.lang.String a(java.lang.String r8) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r8 = r8.trim()
            java.util.ArrayList r0 = r7.p()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            h.Hchat.hooks.api.model.ContactLabelBean r2 = (h.Hchat.hooks.api.model.ContactLabelBean) r2
            java.lang.String r3 = r2.getLabelName()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L35
            java.lang.String r3 = r2.getName()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L15
        L35:
            java.lang.String r8 = r2.getLabelId()
            return r8
        L3a:
            g8.h r0 = r7.h()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r7.S(r0)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r0 = r1
        L44:
            java.lang.String r2 = "增加联系人标签发包失败: "
            h.Hchat.dexkit.DexFinder r3 = r7.f4372b
            if (r3 == 0) goto L4d
            java.lang.reflect.Constructor<?> r4 = r3.addContactLabelCtorString
            goto L4e
        L4d:
            r4 = 0
        L4e:
            r5 = 0
            if (r4 == 0) goto L91
            m8.c r6 = r7.f4373c
            if (r6 == 0) goto L91
            if (r3 != 0) goto L58
            goto L91
        L58:
            r7.D()
            java.lang.Object[] r3 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r4, r3)     // Catch: java.lang.Throwable -> L7a
            boolean r3 = r6.j(r3)     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            r4.append(r8)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L7a
            r7.N(r8)     // Catch: java.lang.Throwable -> L7a
        L78:
            r5 = r3
            goto L96
        L7a:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "增加联系人标签发包异常: "
            r2.<init>(r3)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r7.N(r8)
            goto L96
        L91:
            java.lang.String r8 = "增加联系人标签失败: 网络API未就绪"
            r7.N(r8)
        L96:
            if (r5 == 0) goto L99
            r1 = r0
        L99:
            return r1
    }

    public final boolean b(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r12 = this;
            java.lang.String r1 = "修改好友标签发包失败: username="
            java.lang.String r0 = "2"
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Le
        Lc:
            r0 = r4
            goto L4f
        Le:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "1"
            r2.put(r5, r13)     // Catch: java.lang.Throwable -> L38
            r2.put(r0, r15)     // Catch: java.lang.Throwable -> L38
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            r5.put(r0, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "3"
            r5.put(r0, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "/cgi-bin/micromsg-bin/modifycontactlabellist"
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> L38
            r8 = 0
            r9 = 0
            r7 = 638(0x27e, float:8.94E-43)
            r11 = 0
            boolean r0 = wa.j.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L38
            goto L4f
        L38:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "修改好友标签PB发包异常: "
            r2.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r12.N(r0)
            goto Lc
        L4f:
            if (r0 == 0) goto L53
            r0 = r3
            goto Lb8
        L53:
            h.Hchat.dexkit.DexFinder r0 = r12.f4372b
            if (r0 == 0) goto L5a
            java.lang.reflect.Constructor<?> r2 = r0.modifyContactLabelListCtor
            goto L5b
        L5a:
            r2 = 0
        L5b:
            if (r2 == 0) goto Lb2
            m8.c r5 = r12.f4373c
            if (r5 == 0) goto Lb2
            if (r0 != 0) goto L64
            goto Lb2
        L64:
            r12.D()
            java.lang.Object r0 = r12.d(r2, r13, r15)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L76
            java.lang.String r0 = "修改好友标签失败: 构造请求项为空"
            r12.N(r0)     // Catch: java.lang.Throwable -> L74
        L72:
            r0 = r4
            goto Lb8
        L74:
            r0 = move-exception
            goto L9c
        L76:
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            r6.add(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r2, r0)     // Catch: java.lang.Throwable -> L74
            boolean r0 = r5.j(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto Lb8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L74
            r2.append(r13)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L74
            r12.N(r1)     // Catch: java.lang.Throwable -> L74
            goto Lb8
        L9c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "修改好友标签发包异常: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r12.N(r0)
            goto L72
        Lb2:
            java.lang.String r0 = "修改好友标签失败: 网络API未就绪"
            r12.N(r0)
            goto L72
        Lb8:
            if (r0 != 0) goto Lbb
            return r4
        Lbb:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r0.put(r14, r15)
            java.lang.String r14 = "username=?"
            java.lang.String[] r15 = new java.lang.String[]{r13}
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r12.f4371a
            java.lang.String r2 = "rcontact"
            int r14 = r1.update(r2, r0, r14, r15)
            if (r14 > 0) goto Led
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "修改好友标签失败: username="
            r15.<init>(r0)
            r15.append(r13)
            java.lang.String r13 = " rows="
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            r12.N(r13)
            return r4
        Led:
            return r3
    }

    public final h.Hchat.hooks.api.model.WeChatContact b0(java.util.Map r21) {
            r20 = this;
            r1 = r21
            r2 = 0
            if (r1 == 0) goto Lc
            java.lang.String r0 = "lvbuff"
            java.lang.Object r0 = r1.get(r0)
            goto Ld
        Lc:
            r0 = r2
        Ld:
            boolean r3 = r0 instanceof byte[]
            if (r3 == 0) goto L14
            byte[] r0 = (byte[]) r0
            goto L15
        L14:
            r0 = r2
        L15:
            r3 = 0
            java.lang.String r4 = ""
            if (r0 == 0) goto L1e
            int r5 = r0.length
            r6 = 2
            if (r5 >= r6) goto L22
        L1e:
            r7 = r20
            goto Lb1
        L22:
            r5 = r0[r3]
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 != r6) goto L1e
            int r5 = r0.length
            r6 = 1
            int r5 = r5 - r6
            r5 = r0[r5]
            r7 = 125(0x7d, float:1.75E-43)
            if (r5 == r7) goto L32
            goto L1e
        L32:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Throwable -> L97
            r0.position(r6)     // Catch: java.lang.Throwable -> L97
            r5 = 4
            f(r5, r0)     // Catch: java.lang.Throwable -> L97
            r0.getInt()     // Catch: java.lang.Throwable -> L97
            f(r5, r0)     // Catch: java.lang.Throwable -> L97
            int r6 = r0.getInt()     // Catch: java.lang.Throwable -> L97
            W(r0)     // Catch: java.lang.Throwable -> L92
            r7 = 8
            f(r7, r0)     // Catch: java.lang.Throwable -> L92
            r0.getLong()     // Catch: java.lang.Throwable -> L92
            f(r5, r0)     // Catch: java.lang.Throwable -> L92
            r0.getInt()     // Catch: java.lang.Throwable -> L92
            W(r0)     // Catch: java.lang.Throwable -> L92
            W(r0)     // Catch: java.lang.Throwable -> L92
            f(r5, r0)     // Catch: java.lang.Throwable -> L92
            r0.getInt()     // Catch: java.lang.Throwable -> L92
            f(r5, r0)     // Catch: java.lang.Throwable -> L92
            r0.getInt()     // Catch: java.lang.Throwable -> L92
            W(r0)     // Catch: java.lang.Throwable -> L92
            W(r0)     // Catch: java.lang.Throwable -> L92
            f(r5, r0)     // Catch: java.lang.Throwable -> L92
            r0.getInt()     // Catch: java.lang.Throwable -> L92
            f(r5, r0)     // Catch: java.lang.Throwable -> L92
            r0.getInt()     // Catch: java.lang.Throwable -> L92
            W(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r5 = W(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = W(r0)     // Catch: java.lang.Throwable -> L90
            r7 = r20
        L89:
            r17 = r4
            r16 = r5
            r18 = r6
            goto Lb7
        L90:
            r0 = move-exception
            goto L99
        L92:
            r0 = move-exception
        L93:
            r5 = r4
            goto L99
        L95:
            r6 = r3
            goto L93
        L97:
            r0 = move-exception
            goto L95
        L99:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "解析联系人lvbuff失败: "
            r7.<init>(r8)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r7 = r20
            r7.N(r0)
            goto L89
        Lb1:
            r18 = r3
            r16 = r4
            r17 = r16
        Lb7:
            h.Hchat.hooks.api.model.WeChatContact r8 = new h.Hchat.hooks.api.model.WeChatContact
            java.lang.String r0 = "username"
            java.lang.String r9 = a0(r0, r1)
            java.lang.String r0 = "nickname"
            java.lang.String r10 = a0(r0, r1)
            java.lang.String r0 = "alias"
            java.lang.String r11 = a0(r0, r1)
            java.lang.String r0 = "conRemark"
            java.lang.String r12 = a0(r0, r1)
            java.lang.String r0 = "avatarUrl"
            java.lang.String r13 = a0(r0, r1)
            java.lang.String r0 = "avatarBackupUrl"
            java.lang.String r14 = a0(r0, r1)
            java.lang.String r0 = "encryptUsername"
            java.lang.String r15 = a0(r0, r1)
            if (r1 == 0) goto Leb
            java.lang.String r0 = "type"
            java.lang.Object r2 = r1.get(r0)
        Leb:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Lf8
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
        Lf5:
            r19 = r3
            goto L104
        Lf8:
            if (r2 != 0) goto Lfb
            goto Lf5
        Lfb:
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lf5
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lf5
            goto Lf5
        L104:
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
    }

    public final java.lang.String c(java.lang.String r7, java.util.List r8) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        Ld:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L20
            goto Ld
        L20:
            java.lang.String r2 = r2.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Ld
            boolean r3 = r1.contains(r2)
            if (r3 != 0) goto Ld
            r1.add(r2)
            goto Ld
        L34:
            boolean r8 = r1.isEmpty()
            java.lang.String r2 = ""
            if (r8 == 0) goto L3e
            goto Lea
        L3e:
            java.util.ArrayList r8 = r6.p()
            java.util.ArrayList r3 = M(r8, r1)
            int r4 = r3.size()
            int r5 = r1.size()
            if (r4 == r5) goto L62
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "生成好友标签ID失败: 存在尚未同步的标签 names="
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.N(r7)
            return r0
        L62:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L6b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r8.next()
            h.Hchat.hooks.api.model.ContactLabelBean r1 = (h.Hchat.hooks.api.model.ContactLabelBean) r1
            java.lang.String r1 = r1.getLabelId()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L6b
            boolean r4 = r0.contains(r1)
            if (r4 != 0) goto L6b
            r0.add(r1)
            goto L6b
        L8b:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L92
            goto Lea
        L92:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = Z(r7)
            java.util.Iterator r7 = r7.iterator()
        L9f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lbb
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r0.contains(r1)
            if (r4 == 0) goto L9f
            boolean r4 = r8.contains(r1)
            if (r4 != 0) goto L9f
            r8.add(r1)
            goto L9f
        Lbb:
            java.util.Iterator r7 = r3.iterator()
        Lbf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lcf
            r0 = r2
            goto Ld3
        Lcf:
            java.lang.String r0 = r0.trim()
        Ld3:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lda
            goto Lbf
        Lda:
            boolean r1 = r8.contains(r0)
            if (r1 != 0) goto Lbf
            r8.add(r0)
            goto Lbf
        Le4:
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto Leb
        Lea:
            return r2
        Leb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = ","
            java.lang.String r8 = android.text.TextUtils.join(r0, r8)
            r7.append(r8)
            r8 = 0
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public final java.lang.Object d(java.lang.reflect.Constructor r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = "构造标签请求项失败: 字段写入失败 username="
            r1 = 0
            java.lang.Class r5 = r4.X(r5)     // Catch: java.lang.Throwable -> L20
            if (r5 != 0) goto La
            goto L24
        La:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r5, r3)     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L22
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Constructor r5 = h.Hchat.utils.KavaReflector.findConstructor(r5, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r5, r2)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r5 = move-exception
            goto L4f
        L22:
            if (r3 != 0) goto L25
        L24:
            return r1
        L25:
            java.lang.String r5 = "d"
            boolean r5 = h.Hchat.utils.KavaReflector.writeField(r3, r5, r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = "e"
            boolean r6 = h.Hchat.utils.KavaReflector.writeField(r3, r6, r7)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L37
            if (r6 != 0) goto L36
            goto L37
        L36:
            return r3
        L37:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L20
            r7.append(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = " labelIds="
            r7.append(r5)     // Catch: java.lang.Throwable -> L20
            r7.append(r6)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L20
            r4.N(r5)     // Catch: java.lang.Throwable -> L20
            return r1
        L4f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "构造标签请求项失败: "
            r6.<init>(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.N(r5)
            return r1
    }

    public final g8.h h() {
            r7 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r7.f4371a
            if (r0 != 0) goto L5
            goto L4d
        L5:
            r1 = 0
            r2 = r1
        L7:
            r3 = 2
            if (r2 >= r3) goto L4d
            java.lang.String[] r3 = g8.i.f4366k
            r3 = r3[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L27
            java.lang.String r4 = "SELECT name FROM sqlite_master WHERE type='table' AND name=? LIMIT 1"
            java.lang.String[] r5 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = "name"
            java.lang.String r4 = r0.queryFirstString(r4, r5, r6)     // Catch: java.lang.Throwable -> L27
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L27
            r4 = r4 ^ 1
            goto L28
        L27:
            r4 = r1
        L28:
            if (r4 != 0) goto L2b
            goto L4a
        L2b:
            java.lang.String[] r4 = g8.i.f4367l
            java.lang.String r4 = r7.l(r3, r4)
            java.lang.String[] r5 = g8.i.f4368m
            java.lang.String r5 = r7.l(r3, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L4a
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L44
            goto L4a
        L44:
            g8.h r0 = new g8.h
            r0.<init>(r3, r4, r5)
            return r0
        L4a:
            int r2 = r2 + 1
            goto L7
        L4d:
            r0 = 0
            return r0
    }

    public final b.e j(java.lang.Object r11, java.lang.String r12, java.util.Set r13) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L110
            boolean r1 = r13.contains(r11)
            if (r1 == 0) goto Lb
            goto L110
        Lb:
            r13.add(r11)
            java.lang.Class r1 = r11.getClass()
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r4 = r2.getParameterTypes()
            if (r4 == 0) goto L1a
            int r5 = r4.length
            r6 = 2
            if (r5 != r6) goto L1a
            r5 = 0
            r5 = r4[r5]
            if (r5 != r3) goto L1a
            r5 = 1
            r4 = r4[r5]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r4 == r5) goto L43
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r4 == r5) goto L43
            goto L1a
        L43:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1a
            java.lang.Object[] r4 = new java.lang.Object[]{r12, r4}     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r2, r11, r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = J(r4, r12)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1a
            goto L55
        L54:
            r2 = r0
        L55:
            java.lang.Object r1 = E(r11, r12, r2)
            if (r1 == 0) goto L67
            r10.f4378h = r11
            r10.f4379i = r2
            b.e r12 = new b.e
            r13 = 9
            r12.<init>(r11, r13, r1)
            return r12
        L67:
            java.lang.Class r1 = r11.getClass()
        L6b:
            if (r1 == 0) goto Ld3
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto Ld3
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r1)
            java.util.Iterator r2 = r2.iterator()
        L79:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lce
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L79
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r5 == 0) goto L8e
            goto L79
        L8e:
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            if (r5 == 0) goto L96
            goto L79
        L96:
            java.lang.Class r5 = r4.getReturnType()
            if (r5 == 0) goto L79
            boolean r6 = r5.isPrimitive()
            if (r6 != 0) goto L79
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 == r6) goto L79
            java.lang.Class r6 = java.lang.Void.TYPE
            if (r5 != r6) goto Lab
            goto L79
        Lab:
            java.lang.String r5 = r4.getName()
            java.lang.String[] r6 = g8.i.f4370o
            r7 = 0
            r8 = r7
        Lb3:
            r9 = 4
            if (r8 >= r9) goto L79
            r9 = r6[r8]
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto Lcb
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L79
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r4, r11, r5)     // Catch: java.lang.Throwable -> L79
            b.e r4 = r10.j(r4, r12, r13)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L79
            goto Ld4
        Lcb:
            int r8 = r8 + 1
            goto Lb3
        Lce:
            java.lang.Class r1 = r1.getSuperclass()
            goto L6b
        Ld3:
            r4 = 0
        Ld4:
            if (r4 == 0) goto Ld7
            return r4
        Ld7:
            java.lang.Class r1 = r11.getClass()
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r1 = r1.iterator()
        Le3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L110
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r2)     // Catch: java.lang.Throwable -> Le3
            if (r4 == 0) goto Lf6
            goto Le3
        Lf6:
            java.lang.Class r4 = r2.getType()     // Catch: java.lang.Throwable -> Le3
            if (r4 == 0) goto Le3
            boolean r5 = r4.isPrimitive()     // Catch: java.lang.Throwable -> Le3
            if (r5 != 0) goto Le3
            if (r4 != r3) goto L105
            goto Le3
        L105:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r11)     // Catch: java.lang.Throwable -> Le3
            b.e r2 = r10.j(r2, r12, r13)     // Catch: java.lang.Throwable -> Le3
            if (r2 == 0) goto Le3
            return r2
        L110:
            return r0
    }

    public final java.lang.String l(java.lang.String r5, java.lang.String[] r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r6[r1]
            boolean r3 = r4.B(r5, r2)
            if (r3 == 0) goto Ld
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.String r5 = ""
            return r5
    }

    public final java.lang.String m(java.lang.String r4, boolean r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L7
            goto L19
        L7:
            java.lang.String r0 = "SELECT reserved2, reserved1 FROM img_flag WHERE username=? LIMIT 1"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r3.f4371a
            java.util.List r4 = r1.query(r0, r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L1c
        L19:
            java.lang.String r4 = ""
            return r4
        L1c:
            r0 = 0
            java.lang.Object r1 = r4.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "reserved1"
            java.lang.String r1 = a0(r2, r1)
            java.lang.Object r4 = r4.get(r0)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "reserved2"
            java.lang.String r4 = a0(r0, r4)
            if (r5 == 0) goto L3e
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L44
            goto L45
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L45
        L44:
            return r4
        L45:
            return r1
    }

    public final h.Hchat.hooks.api.model.WeChatContact n(java.lang.String r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username=? LIMIT 1"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = r3.f4371a
            java.util.List r4 = r2.query(r0, r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L1b
            return r1
        L1b:
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            java.util.Map r4 = (java.util.Map) r4
            h.Hchat.hooks.api.model.WeChatContact r4 = r3.b0(r4)
            return r4
    }

    public final java.util.ArrayList o(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = ",%"
            java.lang.String r1 = " LIKE ? OR "
            java.lang.String r2 = "%,"
            java.lang.String r3 = "SELECT username FROM rcontact WHERE "
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L15
            goto Lb6
        L15:
            java.lang.String r5 = "rcontact"
            java.lang.String[] r6 = g8.i.f4369n
            java.lang.String r5 = r7.l(r5, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L25
            goto Lb6
        L25:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = V(r5)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = "=? OR "
            r6.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = V(r5)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r3)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = V(r5)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r3)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = V(r5)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = " LIKE ?"
            r6.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Lb4
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r3 = r7.f4371a     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r5.<init>()     // Catch: java.lang.Throwable -> Lb4
            r5.append(r8)     // Catch: java.lang.Throwable -> Lb4
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r8)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            r6.append(r8)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String[] r8 = new java.lang.String[]{r8, r5, r0, r2}     // Catch: java.lang.Throwable -> Lb4
            java.util.List r8 = r3.query(r1, r8)     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lb4
        L92:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lb6
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "username"
            java.lang.String r0 = a0(r1, r0)     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r1 != 0) goto L92
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r1 != 0) goto L92
            r4.add(r0)     // Catch: java.lang.Throwable -> Lb4
            goto L92
        Lb4:
            r8 = move-exception
            goto Lb7
        Lb6:
            return r4
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "按标签ID获取联系人失败: "
            r0.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.N(r8)
            return r4
    }

    public final java.util.ArrayList p() {
            r7 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r7.f4371a
            java.lang.String r1 = "SELECT "
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            g8.h r3 = r7.h()
            if (r3 != 0) goto L11
            goto L94
        L11:
            java.lang.String r4 = r3.f4365d     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r3.f4364c     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = V(r5)     // Catch: java.lang.Throwable -> L85
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = " AS labelId, "
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = V(r4)     // Catch: java.lang.Throwable -> L85
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = " AS labelName FROM "
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r3.f4363b     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r0.quoteTable(r1)     // Catch: java.lang.Throwable -> L85
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = " ORDER BY CAST("
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = V(r5)     // Catch: java.lang.Throwable -> L85
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = " AS INTEGER), "
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = V(r4)     // Catch: java.lang.Throwable -> L85
            r6.append(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L85
            r3 = 0
            java.util.List r0 = r0.query(r1, r3)     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L85
        L60:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L85
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "labelId"
            java.lang.String r3 = a0(r3, r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = "labelName"
            java.lang.String r1 = a0(r4, r1)     // Catch: java.lang.Throwable -> L85
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L87
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L87
            goto L60
        L85:
            r0 = move-exception
            goto L95
        L87:
            java.util.ArrayList r4 = r7.o(r3)     // Catch: java.lang.Throwable -> L85
            h.Hchat.hooks.api.model.ContactLabelBean r5 = new h.Hchat.hooks.api.model.ContactLabelBean     // Catch: java.lang.Throwable -> L85
            r5.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L85
            r2.add(r5)     // Catch: java.lang.Throwable -> L85
            goto L60
        L94:
            return r2
        L95:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "获取标签列表失败: "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.N(r0)
            return r2
    }

    public final java.util.ArrayList q(java.util.List r19) {
            r18 = this;
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r19.isEmpty()
            if (r2 != 0) goto Lce
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = r0.f4371a
            if (r2 != 0) goto L13
            goto Lce
        L13:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r19.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L1c
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L1c
            r2.add(r4)
            goto L1c
        L38:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L40
            goto Lce
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            r5 = r4
        L47:
            int r6 = r2.size()
            if (r5 >= r6) goto L5c
            if (r5 <= 0) goto L54
            r6 = 44
            r3.append(r6)
        L54:
            r6 = 63
            r3.append(r6)
            int r5 = r5 + 1
            goto L47
        L5c:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username IN ("
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.ArrayList r2 = r0.U(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L84:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r2.next()
            h.Hchat.hooks.api.model.WeChatContact r3 = (h.Hchat.hooks.api.model.WeChatContact) r3
            java.lang.String r4 = r3.wxId
            r5.put(r4, r3)
            goto L84
        L96:
            java.util.Iterator r2 = r19.iterator()
        L9a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r2.next()
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r5.get(r7)
            h.Hchat.hooks.api.model.WeChatContact r3 = (h.Hchat.hooks.api.model.WeChatContact) r3
            if (r3 == 0) goto Lb0
            goto Lca
        Lb0:
            h.Hchat.hooks.api.model.WeChatContact r6 = new h.Hchat.hooks.api.model.WeChatContact
            r16 = 0
            r17 = 0
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r6
        Lca:
            r1.add(r3)
            goto L9a
        Lce:
            return r1
    }

    public final java.lang.String r(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            boolean r0 = I(r5)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r4.f4371a     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "SELECT nickname FROM rcontact WHERE username=?"
            java.lang.String[] r2 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "nickname"
            java.lang.String r0 = r0.queryFirstString(r1, r2, r3)     // Catch: java.lang.Throwable -> L24
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L30
            return r0
        L24:
            r0 = move-exception
            goto L31
        L26:
            h.Hchat.hooks.api.model.WeChatContact r0 = r4.n(r5)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L30
            java.lang.String r5 = r0.displayName()     // Catch: java.lang.Throwable -> L24
        L30:
            return r5
        L31:
            java.lang.String r1 = "获取显示名失败: "
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = bc.e.o(r1, r5, r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.N(r0)
            return r5
    }

    public final int s(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            goto L2a
        L8:
            boolean r0 = r2.L(r3)
            if (r0 == 0) goto L21
            r3 = 12290(0x3002, float:1.7222E-41)
            java.lang.String r3 = r2.Y(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L1b
            return r1
        L1b:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L20
            return r3
        L20:
            return r1
        L21:
            h.Hchat.hooks.api.model.WeChatContact r3 = r2.n(r3)
            if (r3 == 0) goto L2a
            int r3 = r3.gender
            return r3
        L2a:
            return r1
    }

    public final java.lang.String t(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "微信内部群昵称返回: method="
            java.lang.String r2 = "微信内部群昵称方法未解析: group="
            boolean r3 = I(r7)
            java.lang.String r4 = " member="
            if (r3 == 0) goto Lb0
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto Lb0
            h.Hchat.dexkit.DexFinder r3 = r6.f4372b
            if (r3 != 0) goto L21
            goto Lb0
        L21:
            java.lang.reflect.Method r3 = r3.groupMemberDisplayNameMethod     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            r0.append(r7)     // Catch: java.lang.Throwable -> L3c
            r0.append(r4)     // Catch: java.lang.Throwable -> L3c
            r0.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r6.N(r0)     // Catch: java.lang.Throwable -> L3c
            goto Lb0
        L3c:
            r0 = move-exception
            goto L9a
        L3e:
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r7}     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r3, r5, r2)     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L52
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L3c
            goto L53
        L52:
            r2 = r1
        L53:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r0 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L3c
            r5.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "#"
            r5.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Throwable -> L3c
            r5.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = " group="
            r5.append(r0)     // Catch: java.lang.Throwable -> L3c
            r5.append(r7)     // Catch: java.lang.Throwable -> L3c
            r5.append(r4)     // Catch: java.lang.Throwable -> L3c
            r5.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = " name="
            r5.append(r0)     // Catch: java.lang.Throwable -> L3c
            r5.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L3c
            r6.N(r0)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Lb0
            boolean r0 = r8.equals(r2)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto Lb0
            r1 = r2
            goto Lb0
        L9a:
            java.lang.String r2 = "微信内部群昵称方法失败: group="
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = bc.e.p(r2, r7, r4, r8, r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.N(r0)
        Lb0:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb7
            return r1
        Lb7:
            java.lang.String r0 = r6.v(r7, r8)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lc2
            return r0
        Lc2:
            java.lang.String r0 = r6.r(r8)
            java.lang.String r1 = "群成员昵称回退: group="
            java.lang.String r2 = " contactName="
            java.lang.StringBuilder r7 = bc.e.p(r1, r7, r4, r8, r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.N(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto Ldf
            r8 = r0
        Ldf:
            return r8
    }

    public final java.util.ArrayList u(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = I(r6)
            if (r1 != 0) goto Lc
            goto L39
        Lc:
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r1 = "memberlist"
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = r5.f4371a
            java.lang.String r3 = "SELECT memberlist FROM chatroom WHERE chatroomname=?"
            java.lang.String r6 = r2.queryFirstString(r3, r6, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L21
            goto L39
        L21:
            java.lang.String r1 = ";"
            java.lang.String[] r6 = r6.split(r1)
            int r1 = r6.length
            r2 = 0
        L29:
            if (r2 >= r1) goto L39
            r3 = r6[r2]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L36
            r0.add(r3)
        L36:
            int r2 = r2 + 1
            goto L29
        L39:
            return r0
    }

    public final java.lang.String v(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L18
        L7:
            java.util.LinkedHashMap r2 = r1.w(r2)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L18
            return r2
        L18:
            java.lang.String r2 = ""
            return r2
    }

    public final java.util.LinkedHashMap w(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "roomdata"
            java.lang.String r1 = "SELECT memberlist, displayname"
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            boolean r3 = I(r11)
            if (r3 != 0) goto L11
            goto L11b
        L11:
            java.lang.String r3 = "chatroom"
            boolean r3 = r10.B(r3, r0)     // Catch: java.lang.Throwable -> L25
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r4 = r10.f4371a     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = ""
            if (r3 == 0) goto L28
            java.lang.String r6 = ", roomdata"
            goto L29
        L25:
            r0 = move-exception
            goto L11c
        L28:
            r6 = r1
        L29:
            r5.append(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = " FROM chatroom WHERE chatroomname=? LIMIT 1"
            r5.append(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L25
            java.util.List r4 = r4.query(r5, r6)     // Catch: java.lang.Throwable -> L25
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L45
            goto L11b
        L45:
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L25
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L65
            r3 = 0
            if (r4 == 0) goto L56
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L25
            goto L57
        L56:
            r0 = r3
        L57:
            boolean r6 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L5e
            r3 = r0
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L25
        L5e:
            java.util.LinkedHashMap r0 = r10.A(r3)     // Catch: java.lang.Throwable -> L25
            r2.putAll(r0)     // Catch: java.lang.Throwable -> L25
        L65:
            java.lang.String r0 = "memberlist"
            java.lang.String r0 = a0(r0, r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "displayname"
            java.lang.String r3 = a0(r3, r4)     // Catch: java.lang.Throwable -> L25
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L11b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L7f
            goto L11b
        L7f:
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = ";"
            if (r4 == 0) goto L8a
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L25
            goto L8e
        L8a:
            java.lang.String[] r0 = r0.split(r6)     // Catch: java.lang.Throwable -> L25
        L8e:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L25
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L25
            if (r7 == 0) goto L98
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L25
            goto Lc0
        L98:
            java.lang.String r7 = "\u0001"
            java.lang.String r8 = "\u0002"
            java.lang.String r9 = "\n"
            java.lang.String[] r6 = new java.lang.String[]{r7, r8, r9, r6}     // Catch: java.lang.Throwable -> L25
            r7 = r5
        La3:
            r8 = 4
            if (r7 >= r8) goto Lbc
            r8 = r6[r7]     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = java.util.regex.Pattern.quote(r8)     // Catch: java.lang.Throwable -> L25
            r9 = -1
            java.lang.String[] r8 = r3.split(r8, r9)     // Catch: java.lang.Throwable -> L25
            if (r4 <= 0) goto Lba
            int r9 = r8.length     // Catch: java.lang.Throwable -> L25
            if (r9 != r4) goto Lb7
            goto Lba
        Lb7:
            int r7 = r7 + 1
            goto La3
        Lba:
            r3 = r8
            goto Lc0
        Lbc:
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L25
        Lc0:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto Lf5
            int r4 = r0.length     // Catch: java.lang.Throwable -> L25
            int r6 = r3.length     // Catch: java.lang.Throwable -> L25
            if (r4 == r6) goto Lc8
            goto Lf5
        Lc8:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L25
            if (r5 >= r4) goto L11b
            r4 = r0[r5]     // Catch: java.lang.Throwable -> L25
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto Ld6
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> L25
            goto Ld7
        Ld6:
            r6 = r1
        Ld7:
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto Lf2
            boolean r7 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto Lf2
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto Lf2
            boolean r7 = r4.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r7 != 0) goto Lf2
            r2.put(r4, r6)     // Catch: java.lang.Throwable -> L25
        Lf2:
            int r5 = r5 + 1
            goto Lc8
        Lf5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "chatroom.displayname无法对齐: group="
            r1.append(r4)     // Catch: java.lang.Throwable -> L25
            r1.append(r11)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = " members="
            r1.append(r4)     // Catch: java.lang.Throwable -> L25
            int r0 = r0.length     // Catch: java.lang.Throwable -> L25
            r1.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = " names="
            r1.append(r0)     // Catch: java.lang.Throwable -> L25
            int r0 = r3.length     // Catch: java.lang.Throwable -> L25
            r1.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L25
            r10.N(r0)     // Catch: java.lang.Throwable -> L25
        L11b:
            return r2
        L11c:
            java.lang.String r1 = "获取群成员昵称失败: group="
            java.lang.String r3 = " "
            java.lang.StringBuilder r11 = bc.e.o(r1, r11, r3)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.N(r11)
            return r2
    }

    public final java.util.ArrayList x() {
            r2 = this;
            java.lang.String r0 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE '%@chatroom' OR r.username LIKE '%@im.chatroom'"
            r1 = 0
            java.util.ArrayList r0 = r2.U(r0, r1)
            return r0
    }

    public final java.util.ArrayList y() {
            r6 = this;
            java.lang.String r0 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.verifyFlag=0 AND r.username NOT LIKE '%@chatroom' AND r.username NOT LIKE '%@im.chatroom' AND r.username NOT LIKE 'gh\\_%' ESCAPE '\\' AND r.username NOT IN ('filehelper','fmessage','tmessage','qqmail','weixin','floatbottle','medianote','medianote@chatroom','newsapp','masssend','feedsapp','blogapp')"
            r1 = 0
            java.util.ArrayList r0 = r6.U(r0, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            return r0
        Le:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.String r3 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'"
            java.util.ArrayList r1 = r6.U(r3, r1)
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            h.Hchat.hooks.api.model.WeChatContact r3 = (h.Hchat.hooks.api.model.WeChatContact) r3
            if (r3 == 0) goto L1d
            java.lang.String r4 = r3.wxId
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L1d
            java.lang.String r3 = r3.wxId
            r2.add(r3)
            goto L1d
        L39:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r0.next()
            h.Hchat.hooks.api.model.WeChatContact r3 = (h.Hchat.hooks.api.model.WeChatContact) r3
            if (r3 == 0) goto L42
            java.lang.String r4 = r3.wxId
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L62
            java.lang.String r4 = r3.wxId
            java.lang.String r5 = "@openim"
            boolean r4 = r4.endsWith(r5)
            if (r4 == 0) goto L42
        L62:
            r1.add(r3)
            goto L42
        L66:
            return r1
    }

    public final java.lang.String z(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = r2.L(r3)
            if (r0 == 0) goto L45
            r3 = 12293(0x3005, float:1.7226E-41)
            java.lang.String r3 = r2.Y(r3)
            r0 = 12292(0x3004, float:1.7225E-41)
            java.lang.String r0 = r2.Y(r0)
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            java.lang.String r3 = r3.trim()
        L23:
            if (r0 != 0) goto L26
            goto L2a
        L26:
            java.lang.String r1 = r0.trim()
        L2a:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L31
            return r1
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L44
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L3e
            goto L44
        L3e:
            java.lang.String r0 = " "
            java.lang.String r3 = wb.en.h(r3, r0, r1)
        L44:
            return r3
        L45:
            h.Hchat.hooks.api.model.WeChatContact r3 = r2.n(r3)
            if (r3 == 0) goto L50
            java.lang.String r3 = r3.getRegion()
            return r3
        L50:
            return r1
    }
}
