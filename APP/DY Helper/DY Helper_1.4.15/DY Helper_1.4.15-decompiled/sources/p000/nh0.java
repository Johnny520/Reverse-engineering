package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nh0 {

    /* JADX INFO: renamed from: α */
    public static final p000.nh0 f7619 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f7620 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile android.content.Context f7621;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f7622 = null;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ref.WeakReference f7623;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.String f7624;

    /* JADX INFO: renamed from: η */
    public static volatile java.lang.String f7625;

    /* JADX INFO: renamed from: θ */
    public static volatile boolean f7626;

    static {
            nh0 r0 = new nh0
            r0.<init>()
            p000.nh0.f7619 = r0
            java.lang.String r10 = "share_text"
            java.lang.String r11 = "content"
            java.lang.String r1 = "text"
            java.lang.String r2 = "title"
            java.lang.String r3 = "description"
            java.lang.String r4 = "desc"
            java.lang.String r5 = "tips"
            java.lang.String r6 = "hint"
            java.lang.String r7 = "msgHint"
            java.lang.String r8 = "push_detail"
            java.lang.String r9 = "room_description"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.nh0.f7620 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.nh0.f7622 = r0
            java.lang.String r0 = ""
            p000.nh0.f7625 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static java.lang.String m4043(java.lang.Object r11) {
            ch0 r2 = p000.ch0.f2113
            java.util.List r1 = m4057(r11)
            java.util.concurrent.ConcurrentHashMap r3 = p000.ch0.f2114
            r11.getClass()
            java.lang.String r0 = p000.ch0.m1180(r11)
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.Class r0 = r11.getClass()
            java.lang.Object r0 = r3.get(r0)
            bh0 r0 = (p000.bh0) r0
            if (r0 == 0) goto L25
            java.lang.String r0 = p000.ch0.m1182(r11, r0)
            if (r0 == 0) goto L25
            return r0
        L25:
            java.lang.Class r0 = r11.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L2e:
            if (r0 == 0) goto L7e
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L7e
            java.lang.reflect.Field[] r5 = r0.getDeclaredFields()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r5.length
            r8 = 0
        L46:
            if (r8 >= r7) goto L65
            r9 = r5[r8]
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L62
            java.lang.Class r10 = r9.getType()
            boolean r10 = r10.isPrimitive()
            if (r10 == 0) goto L5f
            goto L62
        L5f:
            r6.add(r9)
        L62:
            int r8 = r8 + 1
            goto L46
        L65:
            java.util.Iterator r5 = r6.iterator()
        L69:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            r4.add(r6)
            goto L69
        L79:
            java.lang.Class r0 = r0.getSuperclass()
            goto L2e
        L7e:
            java.util.Iterator r4 = r4.iterator()
        L82:
            boolean r0 = r4.hasNext()
            r5 = 0
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r4.next()
            r6 = r0
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            r0 = 1
            r6.setAccessible(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r6.get(r11)     // Catch: java.lang.Throwable -> L99
            goto La0
        L99:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        La0:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto La5
            goto La6
        La5:
            r5 = r0
        La6:
            if (r5 != 0) goto La9
            goto L82
        La9:
            java.lang.Class r0 = r5.getClass()
            java.lang.reflect.Method r0 = p000.ch0.m1179(r0)
            if (r0 != 0) goto Lb4
            goto L82
        Lb4:
            bh0 r5 = new bh0
            r5.<init>(r6, r0)
            java.lang.String r0 = p000.ch0.m1182(r11, r5)
            if (r0 == 0) goto L82
        Lbf:
            if (r5 == 0) goto Lcf
            java.lang.Class r0 = r11.getClass()
            r3.put(r0, r5)
            java.lang.String r11 = p000.ch0.m1182(r11, r5)
            if (r11 == 0) goto Lcf
            goto Lf3
        Lcf:
            f7 r11 = new f7
            r0 = 1
            r11.<init>(r0, r1)
            ng r0 = new ng
            r6 = 0
            r7 = 13
            r1 = 1
            java.lang.Class<ch0> r3 = p000.ch0.class
            java.lang.String r4 = "invokeConversationGetter"
            java.lang.String r5 = "invokeConversationGetter(Ljava/lang/Object;)Ljava/lang/String;"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            y30 r11 = p000.us1.m5943(r11, r0)
            java.lang.Object r11 = p000.us1.m5953(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto Lf1
            goto Lf3
        Lf1:
            java.lang.String r11 = ""
        Lf3:
            return r11
    }

    /* JADX INFO: renamed from: Β */
    public static java.lang.Object m4044(int r5, java.lang.Object r6) {
            if (r6 != 0) goto L8
            java.lang.Object r5 = org.json.JSONObject.NULL
            r5.getClass()
            return r5
        L8:
            r0 = 5
            if (r5 <= r0) goto L10
            java.lang.String r5 = r6.toString()
            return r5
        L10:
            boolean r0 = r6 instanceof org.json.JSONObject
            if (r0 != 0) goto Ldb
            boolean r0 = r6 instanceof org.json.JSONArray
            if (r0 != 0) goto Ldb
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto Ldb
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L21
            return r6
        L21:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L5c
            boolean r5 = r6 instanceof java.lang.Double
            if (r5 == 0) goto L3d
            r5 = r6
            java.lang.Number r5 = (java.lang.Number) r5
            double r0 = r5.doubleValue()
            double r0 = java.lang.Math.abs(r0)
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L54
        L3d:
            boolean r5 = r6 instanceof java.lang.Float
            if (r5 == 0) goto L59
            r5 = r6
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = java.lang.Math.abs(r5)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L54
            goto L59
        L54:
            java.lang.String r5 = r6.toString()
            return r5
        L59:
            java.io.Serializable r6 = (java.io.Serializable) r6
            return r6
        L5c:
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L94
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            if (r2 == 0) goto L6f
            java.lang.String r2 = r2.toString()
            int r3 = r5 + 1
            java.lang.Object r1 = m4044(r3, r1)
            r0.put(r2, r1)
            goto L6f
        L93:
            return r0
        L94:
            boolean r0 = r6 instanceof java.lang.Iterable
            if (r0 == 0) goto Lb8
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        La3:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r6.next()
            int r2 = r5 + 1
            java.lang.Object r1 = m4044(r2, r1)
            r0.put(r1)
            goto La3
        Lb7:
            return r0
        Lb8:
            boolean r0 = r6 instanceof java.lang.Object[]
            if (r0 == 0) goto Ld6
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r1 = r6.length
            r2 = 0
        Lc5:
            if (r2 >= r1) goto Ld5
            r3 = r6[r2]
            int r4 = r5 + 1
            java.lang.Object r3 = m4044(r4, r3)
            r0.put(r3)
            int r2 = r2 + 1
            goto Lc5
        Ld5:
            return r0
        Ld6:
            java.lang.String r5 = r6.toString()
            return r5
        Ldb:
            return r6
    }

    /* JADX INFO: renamed from: α */
    public static final void m4045(p000.nh0 r4, java.lang.Object r5) {
            if (r5 != 0) goto L6
            r4.getClass()
            return
        L6:
            r4.getClass()
            java.lang.String r4 = m4043(r5)
            java.util.concurrent.ConcurrentHashMap r0 = p000.nh0.f7622
            java.util.Set r0 = r0.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L36
            if (r2 != r5) goto L1c
        L36:
            java.util.concurrent.ConcurrentHashMap r2 = p000.nh0.f7622
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.remove(r3, r1)
            goto L1c
        L44:
            java.lang.ref.WeakReference r0 = p000.nh0.f7623
            r1 = 0
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r0.get()
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 != r5) goto Lac
            p000.nh0.f7623 = r1
            java.lang.String r5 = p000.nh0.f7624
            boolean r5 = p000.ln0.m3626(r5, r4)
            if (r5 != 0) goto L61
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto L63
        L61:
            p000.nh0.f7624 = r1
        L63:
            java.util.concurrent.ConcurrentHashMap r5 = p000.nh0.f7622
            java.util.Set r5 = r5.entrySet()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L98
            java.util.concurrent.ConcurrentHashMap r2 = p000.nh0.f7622
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.remove(r3, r0)
            goto L72
        L98:
            java.lang.ref.WeakReference r3 = p000.nh0.f7623
            if (r3 != 0) goto L72
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            p000.nh0.f7624 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            p000.nh0.f7623 = r0
            goto L72
        Lac:
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto Lb4
            java.lang.String r4 = "unknown"
        Lb4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "release conversationId="
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 4
            java.lang.String r0 = "rfae3094b732ade5a"
            p000.C0888ux.m5988(r0, r4, r1, r5, r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Object m4046(java.lang.Object r1, java.lang.String r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L8
            java.lang.Object r1 = p000.qe0.m4869(r1, r2, r0)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        Lf:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L14
            r1 = 0
        L14:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m4047(java.lang.Object r3) {
            java.lang.String r0 = "hasMoreMessage"
            java.lang.Object r3 = m4046(r3, r0)
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L11:
            boolean r0 = r3 instanceof java.lang.Number
            r1 = 1
            if (r0 == 0) goto L1f
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == 0) goto L37
            goto L39
        L1f:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L39
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "true"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L39
            java.lang.String r0 = "1"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r3 = 0
            return r3
        L39:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static int m4048(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = m4046(r0, r1)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto Lf
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        Lf:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L1a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2d
            java.lang.String r0 = (java.lang.String) r0
            r1 = 10
            java.lang.Integer r0 = p000.x02.m6487(r0, r1)
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()
            return r0
        L2d:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static long m4049(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = m4046(r0, r1)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto Lf
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        Lf:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L1a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2d
            java.lang.String r0 = (java.lang.String) r0
            r1 = 10
            java.lang.Long r0 = p000.x02.m6489(r0, r1)
            if (r0 == 0) goto L2d
            long r0 = r0.longValue()
            return r0
        L2d:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.Map m4050(java.lang.Object r2, java.lang.String r3) {
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = p000.qe0.m4869(r2, r3, r0)     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r2 instanceof java.util.Map     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L11
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> Lf
            goto L19
        Lf:
            r2 = move-exception
            goto L13
        L11:
            r2 = r1
            goto L19
        L13:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L19:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            java.util.Map r1 = (java.util.Map) r1
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m4051(java.lang.Object r3, java.lang.String r4) {
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = p000.qe0.m4869(r3, r4, r1)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r3 = move-exception
            goto L18
        L13:
            r3 = r2
        L14:
            if (r3 != 0) goto L1e
            r3 = r0
            goto L1e
        L18:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L1e:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L23
            goto L24
        L23:
            r2 = r3
        L24:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L29
            goto L2a
        L29:
            r0 = r2
        L2a:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static final int m4052(java.util.LinkedHashMap r8, java.lang.Object r9, p000.um1 r10, p000.um1 r11) {
            int r0 = r8.size()
            java.util.List r9 = m4057(r9)
            java.util.Iterator r9 = r9.iterator()
        Lc:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r9.next()
            java.lang.String r2 = m4060(r1)
            boolean r3 = r8.containsKey(r2)
            if (r3 != 0) goto L60
            java.lang.String r3 = "getCreatedAt"
            long r3 = m4049(r1, r3)
            long r3 = m4061(r3)
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L60
            java.lang.Object r5 = r10.f10912
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L44
            long r5 = r5.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L3f
            r5 = r3
        L3f:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L48
        L44:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
        L48:
            r10.f10912 = r5
            java.lang.Object r5 = r11.f10912
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L5a
            long r5 = r5.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L59
            goto L5a
        L59:
            r3 = r5
        L5a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11.f10912 = r3
        L60:
            r8.put(r2, r1)
            goto Lc
        L64:
            int r8 = r8.size()
            int r8 = r8 - r0
            return r8
    }

    /* JADX INFO: renamed from: ι */
    public static void m4053(java.lang.Object r6, java.util.LinkedHashSet r7, java.util.LinkedHashSet r8, int r9) {
            if (r6 == 0) goto L98
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r6 == r0) goto L98
            r0 = 6
            if (r9 <= r0) goto Lb
            goto L98
        Lb:
            boolean r0 = r6 instanceof org.json.JSONObject
            r1 = 0
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r0 == 0) goto L5f
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.util.Iterator r0 = r6.keys()
            r0.getClass()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L98
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L59
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            int r5 = r4.length()
            if (r5 <= 0) goto L46
            int r5 = r4.length()
            if (r5 > r2) goto L46
            goto L47
        L46:
            r4 = r1
        L47:
            if (r4 == 0) goto L1b
            java.util.Set r5 = p000.nh0.f7620
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L55
            r7.add(r4)
            goto L1b
        L55:
            r8.add(r4)
            goto L1b
        L59:
            int r3 = r9 + 1
            m4053(r4, r7, r8, r3)
            goto L1b
        L5f:
            boolean r0 = r6 instanceof org.json.JSONArray
            if (r0 == 0) goto L78
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r0 = r6.length()
            r1 = 0
        L6a:
            if (r1 >= r0) goto L98
            java.lang.Object r2 = r6.opt(r1)
            int r3 = r9 + 1
            m4053(r2, r7, r8, r3)
            int r1 = r1 + 1
            goto L6a
        L78:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L98
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            int r7 = r6.length()
            if (r7 <= 0) goto L93
            int r7 = r6.length()
            if (r7 > r2) goto L93
            r1 = r6
        L93:
            if (r1 == 0) goto L98
            r8.add(r1)
        L98:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.Object m4054() {
            java.lang.ref.WeakReference r0 = p000.nh0.f7623
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.get()
            goto Lb
        La:
            r0 = r1
        Lb:
            java.lang.String r2 = p000.nh0.f7624
            if (r0 == 0) goto L32
            java.lang.String r3 = m4043(r0)
            boolean r4 = p000.q02.m4671(r3)
            if (r4 != 0) goto L26
            java.util.concurrent.ConcurrentHashMap r1 = p000.nh0.f7622
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r1.put(r3, r2)
            p000.nh0.f7624 = r3
            return r0
        L26:
            java.lang.String r0 = "findLatestLogic latest invalid, clear latest"
            r3 = 4
            java.lang.String r4 = "rfae3094b732ade5a"
            p000.C0888ux.m5988(r4, r0, r1, r3, r1)
            p000.nh0.f7623 = r1
            p000.nh0.f7624 = r1
        L32:
            if (r2 == 0) goto L6a
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L3b
            goto L6a
        L3b:
            java.util.concurrent.ConcurrentHashMap r0 = p000.nh0.f7622
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L4a
            java.lang.Object r4 = r3.get()
            goto L4b
        L4a:
            r4 = r1
        L4b:
            if (r4 == 0) goto L65
            java.lang.String r5 = m4043(r4)
            boolean r6 = p000.q02.m4671(r5)
            if (r6 != 0) goto L61
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            p000.nh0.f7623 = r0
            p000.nh0.f7624 = r5
            return r4
        L61:
            r0.remove(r2, r3)
            goto L6a
        L65:
            if (r3 == 0) goto L6a
            r0.remove(r2, r3)
        L6a:
            java.util.concurrent.ConcurrentHashMap r0 = p000.nh0.f7622
            java.util.Set r0 = r0.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L9f
            java.util.concurrent.ConcurrentHashMap r3 = p000.nh0.f7622
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r3.remove(r4, r2)
            goto L79
        L9f:
            java.lang.String r2 = m4043(r3)
            boolean r4 = p000.q02.m4671(r2)
            if (r4 != 0) goto L79
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            p000.nh0.f7623 = r0
            p000.nh0.f7624 = r2
            return r3
        Lb3:
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m4055(long r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            java.lang.String r3 = r0.format(r1)
            r3.getClass()
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public static p000.gh0 m4056() {
            boolean r0 = p000.nh0.f7626
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L2a
            java.lang.String r0 = p000.nh0.f7625
            boolean r3 = p000.q02.m4671(r0)
            if (r3 != 0) goto Lf
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L19
            java.lang.String r3 = "："
            java.lang.String r0 = r3.concat(r0)
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 != 0) goto L1e
            java.lang.String r0 = ""
        L1e:
            gh0 r3 = new gh0
            java.lang.String r4 = "当前抖音版本暂不支持聊天导出"
            java.lang.String r0 = r4.concat(r0)
            r3.<init>(r2, r0, r1)
            return r3
        L2a:
            java.lang.Object r0 = m4054()
            if (r0 != 0) goto L38
            gh0 r0 = new gh0
            java.lang.String r3 = "请先打开并停留在一个聊天会话页面"
            r0.<init>(r2, r3, r1)
            return r0
        L38:
            java.lang.String r0 = m4043(r0)
            boolean r3 = p000.q02.m4671(r0)
            if (r3 != 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L4e
            gh0 r0 = new gh0
            java.lang.String r3 = "当前聊天会话信息尚未准备完成"
            r0.<init>(r2, r3, r1)
            return r0
        L4e:
            gh0 r1 = new gh0
            r2 = 1
            java.lang.String r3 = "已识别当前聊天会话"
            r1.<init>(r0, r3, r2)
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static java.util.List m4057(java.lang.Object r2) {
            java.lang.String r0 = "getMessageList"
            java.lang.Object r2 = m4046(r2, r0)
            boolean r0 = r2 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto Le
            java.util.List r2 = (java.util.List) r2
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L15
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6637(r2)
        L15:
            if (r1 != 0) goto L1a
            jz r2 = p000.C0450jz.f5672
            return r2
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m4058(java.lang.Object r3) {
            if (r3 != 0) goto L3
            goto L4c
        L3:
            boolean r0 = r3 instanceof java.lang.CharSequence
            if (r0 == 0) goto L29
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "[]"
            java.lang.String r1 = "null"
            java.lang.String r2 = "{}"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L4c
            goto L4e
        L29:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L36
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L4c
            goto L4e
        L36:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L43
            java.util.Map r3 = (java.util.Map) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L4c
            goto L4e
        L43:
            boolean r0 = r3 instanceof java.lang.Object[]
            if (r0 == 0) goto L4e
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r3 = r3.length
            if (r3 != 0) goto L4e
        L4c:
            r3 = 0
            return r3
        L4e:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: π */
    public static void m4059(java.lang.Class r2, java.lang.String r3, p000.a80 r4) {
            xq0 r0 = p000.xq0.f12253
            qg r1 = new qg
            r1.<init>(r3, r4)
            java.util.Set r2 = r0.m6774(r2, r3, r1)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L14
            return
        L14:
            java.lang.String r2 = "未找到 ChatListLogic#"
            java.lang.String r2 = r2.concat(r3)
            p000.C1080.m7273(r2)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m4060(java.lang.Object r4) {
            java.lang.String r0 = "getUuid"
            java.lang.String r0 = m4051(r4, r0)
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L13
            java.lang.String r4 = "uuid:"
            java.lang.String r4 = r4.concat(r0)
            return r4
        L13:
            java.lang.String r0 = "getMsgId"
            long r0 = m4049(r4, r0)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L26
            java.lang.String r4 = "msgId:"
            java.lang.String r4 = p000.AbstractC0602nx.m4126(r0, r4)
            return r4
        L26:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "identity:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    /* JADX INFO: renamed from: σ */
    public static long m4061(long r3) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            r0 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L13
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
        L13:
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.Object m4062(java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Ld:
            boolean r1 = r0 instanceof p000.eo1
            r2 = 0
            if (r1 == 0) goto L13
            r0 = r2
        L13:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L28
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L1d:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L23:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L28
            goto L29
        L28:
            r2 = r0
        L29:
            return r2
    }

    /* JADX INFO: renamed from: υ */
    public static void m4063(p000.p70 r3) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0 r1 = new r0
            r2 = 5
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    /* JADX INFO: renamed from: φ */
    public static void m4064(org.json.JSONObject r3, java.lang.String r4, java.util.Map r5) {
            if (r5 != 0) goto Lb
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r3.put(r4, r5)
            return
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            if (r2 == 0) goto L18
            java.lang.String r2 = r2.toString()
            if (r1 == 0) goto L3a
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L3c
        L3a:
            java.lang.String r1 = ""
        L3c:
            r0.put(r2, r1)
            goto L18
        L40:
            r3.put(r4, r0)
            return
    }

    /* JADX INFO: renamed from: χ */
    public static void m4065(p000.eh0 r8, int r9, p000.C1085 r10) {
            java.util.ArrayList r8 = r8.f3560
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L9
            return
        L9:
            jh0 r0 = new jh0
            java.lang.String r6 = "没有符合当前条件的消息"
            r7 = 16
            kh0 r1 = p000.kh0.f5926
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.invoke(r0)
            return
    }

    /* JADX INFO: renamed from: ψ */
    public static void m4066(p000.eh0 r9, int r10, java.lang.String r11, int r12, java.lang.String r13, p000.C1085 r14) {
            jh0 r0 = new jh0
            java.lang.Long r3 = r9.f3558
            java.lang.Long r4 = r9.f3559
            java.util.ArrayList r9 = r9.f3560
            int r7 = r9.size()
            kh0 r1 = p000.kh0.f5926
            r2 = r10
            r5 = r11
            r6 = r12
            r8 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.invoke(r0)
            return
    }

    /* JADX INFO: renamed from: ω */
    public static android.content.Context m4067(android.content.Context r4) {
            java.lang.String r0 = "currentApplication"
            java.lang.String r1 = "android.app.ActivityThread"
            if (r4 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
            if (r4 == 0) goto Ld
            return r4
        Ld:
            android.content.Context r4 = p000.nh0.f7621
            if (r4 == 0) goto L12
            return r4
        L12:
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r0, r4)     // Catch: java.lang.Throwable -> L2a
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.invoke(r4, r4)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2 instanceof android.app.Application     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L2a
            goto L34
        L2a:
            r2 = move-exception
            goto L2e
        L2c:
            r2 = r4
            goto L34
        L2e:
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L42
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r2 = r3
        L34:
            boolean r3 = r2 instanceof p000.eo1     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L39
            r2 = r4
        L39:
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L44
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L42
            goto L4c
        L42:
            r2 = move-exception
            goto L46
        L44:
            r2 = r4
            goto L4c
        L46:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L4c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L51
            r2 = r4
        L51:
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L56
            return r2
        L56:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L68
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = p000.qe0.m4870(r1, r0, r2)     // Catch: java.lang.Throwable -> L68
            boolean r1 = r0 instanceof android.content.Context     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6a
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L68
            goto L6b
        L68:
            r0 = move-exception
            goto L74
        L6a:
            r0 = r4
        L6b:
            if (r0 == 0) goto L72
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L68
            goto L7a
        L72:
            r0 = r4
            goto L7a
        L74:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L7a:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L7f
            r0 = r4
        L7f:
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L84
            return r0
        L84:
            return r4
    }

    /* JADX INFO: renamed from: κ */
    public final p000.lh0 m4068(android.content.Context r38, java.lang.Object r39, p000.ih0 r40, p000.C0568n r41, p000.C1085 r42) {
            r37 = this;
            r1 = r39
            r6 = r40
            r7 = r42
            int r0 = r6.f5089
            boolean r8 = r6.f5084
            hh0 r9 = r6.f5087
            r10 = 0
            r11 = 1
            if (r11 > r0) goto L757
            r2 = 501(0x1f5, float:7.02E-43)
            if (r0 >= r2) goto L757
            long r2 = r6.f5088
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L74f
            r4 = 60001(0xea61, double:2.96444E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L74f
            r41.m3924()
            java.lang.String r0 = m4043(r1)
            boolean r2 = p000.q02.m4671(r0)
            if (r2 != 0) goto L32
            r12 = r0
            goto L33
        L32:
            r12 = r10
        L33:
            if (r12 == 0) goto L747
            r2 = 0
            java.lang.String r3 = "rfae3094b732ade5a"
            if (r8 == 0) goto L339
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            um1 r0 = new um1
            r0.<init>()
            r16 = 0
            um1 r14 = new um1
            r14.<init>()
            m4052(r5, r1, r0, r14)
            jh0 r18 = new jh0
            int r20 = r5.size()
            java.lang.Object r15 = r0.f10912
            r21 = r15
            java.lang.Long r21 = (java.lang.Long) r21
            java.lang.Object r15 = r14.f10912
            r22 = r15
            java.lang.Long r22 = (java.lang.Long) r22
            java.lang.String r24 = "正在读取更早的聊天记录"
            r25 = 112(0x70, float:1.57E-43)
            kh0 r27 = p000.kh0.f5924
            r23 = 0
            r19 = r27
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r15 = r18
            r7.invoke(r15)
            int r15 = r5.size()
            r20 = r2
            r19 = r14
            r13 = r16
        L7c:
            r41.m3924()
            boolean r21 = m4047(r1)
            java.lang.String r11 = "已加载到会话最早消息"
            java.lang.String r4 = ", size="
            if (r21 != 0) goto Lc3
            int r0 = r5.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r15 = "fullLoad stop, hasMoreMessage=false, round="
            r1.<init>(r15)
            r1.append(r13)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            p000.C0888ux.m5988(r3, r0, r10, r1, r10)
            mh0 r0 = new mh0
            java.util.Collection r4 = r5.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            r5 = 1
            r0.<init>(r4, r5, r11)
            r2 = r7
            r34 = r8
            r21 = r9
            r23 = r12
            r8 = 2
            r12 = r3
            goto L336
        Lc3:
            r21 = r2
            r23 = 4
            int r2 = r6.f5089
            java.lang.String r10 = "DYHelperExportFull"
            r25 = r0
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            r26 = r2
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            boolean r0 = p000.ln0.m3626(r0, r2)     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            if (r0 == 0) goto L114
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            java.lang.String r0 = "loadOld"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r10}     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            p000.qe0.m4869(r1, r0, r2)     // Catch: java.lang.Throwable -> Lfb java.lang.InterruptedException -> L108
            r10 = r5
            r34 = r8
            r21 = r9
            r35 = r11
            r23 = r12
            r9 = r25
            r12 = r3
            r11 = r4
            goto L16f
        Lfb:
            r0 = move-exception
            r10 = r5
        Lfd:
            r2 = r7
            r34 = r8
            r21 = r9
            r23 = r12
            r8 = 2
            r12 = r3
            goto L309
        L108:
            r10 = r5
        L109:
            r2 = r7
            r34 = r8
            r21 = r9
            r23 = r12
            r8 = 2
            r12 = r3
            goto L30f
        L114:
            r2 = r5
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L302 java.lang.InterruptedException -> L306
            r10 = 1
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L302 java.lang.InterruptedException -> L306
            r10 = r3
            qm1 r3 = new qm1     // Catch: java.lang.Throwable -> L2fb java.lang.InterruptedException -> L2ff
            r3.<init>()     // Catch: java.lang.Throwable -> L2fb java.lang.InterruptedException -> L2ff
            r0 = r4
            um1 r4 = new um1     // Catch: java.lang.Throwable -> L2fb java.lang.InterruptedException -> L2ff
            r4.<init>()     // Catch: java.lang.Throwable -> L2fb java.lang.InterruptedException -> L2ff
            r34 = r8
            android.os.Handler r8 = new android.os.Handler     // Catch: java.lang.Throwable -> L2e8 java.lang.InterruptedException -> L2f2
            r28 = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L2e8 java.lang.InterruptedException -> L2f2
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2e8 java.lang.InterruptedException -> L2f2
            m9 r0 = new m9     // Catch: java.lang.Throwable -> L2e8 java.lang.InterruptedException -> L2f2
            r21 = r9
            r35 = r11
            r23 = r12
            r9 = r25
            r11 = r28
            r12 = r10
            r10 = r2
            r2 = r26
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2e1 java.lang.InterruptedException -> L2e5
            r8.post(r0)     // Catch: java.lang.Throwable -> L2e1 java.lang.InterruptedException -> L2e5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2e1 java.lang.InterruptedException -> L2e5
            r7 = 3
            boolean r0 = r5.await(r7, r0)     // Catch: java.lang.Throwable -> L15e java.lang.InterruptedException -> L164
            java.lang.Object r2 = r4.f10912     // Catch: java.lang.Throwable -> L15e java.lang.InterruptedException -> L164
            if (r2 == 0) goto L169
            java.lang.String r4 = "callLoadOldOnMain error"
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L15e java.lang.InterruptedException -> L164
            p000.C0888ux.m5977(r12, r4, r2)     // Catch: java.lang.Throwable -> L15e java.lang.InterruptedException -> L164
            goto L169
        L15e:
            r0 = move-exception
            r2 = r42
        L161:
            r8 = 2
            goto L309
        L164:
            r2 = r42
        L166:
            r8 = 2
            goto L30f
        L169:
            if (r0 == 0) goto L2dd
            boolean r0 = r3.f9050     // Catch: java.lang.Throwable -> L15e java.lang.InterruptedException -> L164
            if (r0 == 0) goto L2dd
        L16f:
            long r2 = r6.f5088
            long r4 = java.lang.System.nanoTime()
            r30 = 1000(0x3e8, double:4.94E-321)
            r32 = 60000(0xea60, double:2.9644E-319)
            r28 = r2
            long r2 = p000.j81.m2908(r28, r30, r32)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.toNanos(r2)
            long r2 = r2 + r4
        L187:
            long r4 = java.lang.System.nanoTime()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1a2
            r41.m3924()
            java.util.List r0 = m4057(r1)
            int r0 = r0.size()
            if (r0 > r15) goto L1a2
            boolean r0 = m4047(r1)
            if (r0 != 0) goto L1a5
        L1a2:
            r0 = r19
            goto L1ba
        L1a5:
            r4 = 100
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L1ab
            goto L187
        L1ab:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "聊天记录加载线程已中断"
            r0.<init>(r1)
            throw r0
        L1ba:
            int r2 = m4052(r10, r1, r9, r0)
            int r3 = r10.size()
            boolean r4 = m4047(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "fullLoad round="
            r5.<init>(r7)
            r5.append(r13)
            r5.append(r11)
            r5.append(r3)
            java.lang.String r7 = ", lastSize="
            r5.append(r7)
            r5.append(r15)
            java.lang.String r7 = ", added="
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = ", hasMore="
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r7 = 4
            r8 = 0
            p000.C0888ux.m5988(r12, r5, r8, r7, r8)
            if (r2 < 0) goto L2d5
            if (r2 <= 0) goto L1fd
            r5 = 0
            goto L203
        L1fd:
            r22 = 1
            int r20 = r20 + 1
            r5 = r20
        L203:
            if (r4 != 0) goto L208
            fh0 r4 = p000.fh0.f3937
            goto L210
        L208:
            r4 = 3
            if (r5 < r4) goto L20e
            fh0 r4 = p000.fh0.f3938
            goto L210
        L20e:
            fh0 r4 = p000.fh0.f3936
        L210:
            java.lang.Object r7 = r9.f10912
            if (r2 <= 0) goto L233
            jh0 r26 = new jh0
            r29 = r7
            java.lang.Long r29 = (java.lang.Long) r29
            java.lang.Object r2 = r0.f10912
            r30 = r2
            java.lang.Long r30 = (java.lang.Long) r30
            java.lang.String r32 = "正在读取更早的聊天记录"
            r33 = 112(0x70, float:1.57E-43)
            r31 = 0
            r28 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r2 = r42
            r3 = r26
            r2.invoke(r3)
            goto L257
        L233:
            r2 = r42
            r28 = r3
            jh0 r26 = new jh0
            r29 = r7
            java.lang.Long r29 = (java.lang.Long) r29
            java.lang.Object r3 = r0.f10912
            r30 = r3
            java.lang.Long r30 = (java.lang.Long) r30
            java.lang.String r3 = "正在确认是否还有更早消息（"
            java.lang.String r7 = "/3）"
            java.lang.String r32 = p000.AbstractC0602nx.m4127(r3, r5, r7)
            r33 = 112(0x70, float:1.57E-43)
            r31 = 0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r3 = r26
            r2.invoke(r3)
        L257:
            int r3 = r4.ordinal()
            if (r3 == 0) goto L2bc
            r4 = 1
            if (r3 == r4) goto L2a4
            r8 = 2
            if (r3 != r8) goto L29f
            int r0 = r10.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "fullLoad stop, noGrowth="
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r3 = ", round="
            r1.append(r3)
            r1.append(r13)
            r1.append(r11)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            r3 = 0
            p000.C0888ux.m5988(r12, r0, r3, r1, r3)
            mh0 r0 = new mh0
            java.util.Collection r1 = r10.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)
            java.lang.String r4 = "已连续确认没有更早消息"
            r5 = 1
            r0.<init>(r1, r5, r4)
            goto L336
        L29f:
            r3 = 0
            p000.C1080.m7272()
            return r3
        L2a4:
            r5 = r4
            r8 = 2
            mh0 r0 = new mh0
            java.util.Collection r1 = r10.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)
            r3 = r35
            r0.<init>(r1, r5, r3)
            goto L336
        L2bc:
            r8 = 2
            r3 = 1
            long r13 = r13 + r3
            r19 = r0
            r7 = r2
            r20 = r5
            r0 = r9
            r5 = r10
            r3 = r12
            r9 = r21
            r12 = r23
            r15 = r28
            r8 = r34
            r2 = 0
            r10 = 0
            r11 = 1
            goto L7c
        L2d5:
            java.lang.String r0 = "新增消息数量不能为负数"
            p000.C1080.m7275(r0)
            r24 = 0
            return r24
        L2dd:
            r2 = r42
            r8 = 2
            goto L316
        L2e1:
            r0 = move-exception
            r2 = r7
            goto L161
        L2e5:
            r2 = r7
            goto L166
        L2e8:
            r0 = move-exception
        L2e9:
            r21 = r9
            r23 = r12
            r8 = 2
            r12 = r10
            r10 = r2
            r2 = r7
            goto L309
        L2f2:
            r21 = r9
            r23 = r12
            r8 = 2
            r12 = r10
            r10 = r2
            r2 = r7
            goto L30f
        L2fb:
            r0 = move-exception
            r34 = r8
            goto L2e9
        L2ff:
            r34 = r8
            goto L2f2
        L302:
            r0 = move-exception
            r10 = r2
            goto Lfd
        L306:
            r10 = r2
            goto L109
        L309:
            java.lang.String r1 = "callLoadOldOnMain failed"
            p000.C0888ux.m5977(r12, r1, r0)
            goto L316
        L30f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L316:
            java.lang.String r0 = "fullLoad loadOld failed, round="
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r13, r0)
            r1 = 4
            r3 = 0
            p000.C0888ux.m5988(r12, r0, r3, r1, r3)
            mh0 r0 = new mh0
            java.util.Collection r1 = r10.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)
            java.lang.String r3 = "暂时无法读取更早的消息，已保存当前结果"
            r4 = 0
            r0.<init>(r1, r4, r3)
        L336:
            r5 = 1
        L337:
            r4 = r0
            goto L351
        L339:
            r2 = r7
            r34 = r8
            r21 = r9
            r23 = r12
            r8 = 2
            r16 = 0
            r12 = r3
            mh0 r0 = new mh0
            java.util.List r1 = m4057(r1)
            java.lang.String r3 = "已导出当前页面已加载的消息"
            r5 = 1
            r0.<init>(r1, r5, r3)
            goto L337
        L351:
            r41.m3924()
            f7 r0 = new f7
            java.util.List r3 = r4.f7132
            r0.<init>(r5, r3)
            θ r1 = new θ
            r7 = 18
            r1.<init>(r7, r6)
            y30 r7 = new y30
            r7.<init>(r0, r5, r1)
            ng r26 = new ng
            r32 = 0
            r33 = 14
            r27 = 1
            java.lang.Class<nh0> r29 = p000.nh0.class
            java.lang.String r30 = "messageKey"
            java.lang.String r31 = "messageKey(Ljava/lang/Object;)Ljava/lang/String;"
            r28 = r37
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r0 = r26
            qt r1 = new qt
            r5 = 26
            r1.<init>(r5)
            ye r5 = new ye
            r9 = 11
            r5.<init>(r9, r1)
            ye r1 = new ye
            r9 = 12
            r1.<init>(r9, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            bu r9 = new bu
            java.util.Iterator r7 = r7.iterator()
            r9.<init>(r7, r0)
        L39f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L3ad
            java.lang.Object r0 = r9.next()
            r5.add(r0)
            goto L39f
        L3ad:
            p000.AbstractC0019ai.m168(r5, r1)
            java.util.Iterator r0 = r5.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L3be
            jz r0 = p000.C0450jz.f5672
        L3bc:
            r9 = r0
            goto L3e0
        L3be:
            java.lang.Object r1 = r0.next()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L3cd
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            goto L3bc
        L3cd:
            java.util.ArrayList r1 = p000.lz1.m3696(r1)
        L3d1:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L3df
            java.lang.Object r5 = r0.next()
            r1.add(r5)
            goto L3d1
        L3df:
            r9 = r1
        L3e0:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.CHINA
            java.lang.String r5 = "yyyy-MM"
            r0.<init>(r5, r1)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r7 = "yyyy年MM月"
            r5.<init>(r7, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r10 = r9.iterator()
            r11 = 0
            r13 = 0
        L400:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L479
            java.lang.Object r14 = r10.next()
            r14.getClass()
            java.lang.String r15 = "getCreatedAt"
            long r18 = m4049(r14, r15)
            r37 = r9
            long r8 = m4061(r18)
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 <= 0) goto L45a
            java.util.Date r15 = new java.util.Date
            r15.<init>(r8)
            java.lang.String r19 = r0.format(r15)
            r19.getClass()
            java.lang.String r15 = r5.format(r15)
            r15.getClass()
            if (r11 == 0) goto L441
            long r26 = r11.longValue()
            int r11 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r11 <= 0) goto L43c
            r26 = r8
        L43c:
            java.lang.Long r11 = java.lang.Long.valueOf(r26)
            goto L445
        L441:
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
        L445:
            if (r13 == 0) goto L452
            long r26 = r13.longValue()
            int r13 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r13 >= 0) goto L450
            goto L452
        L450:
            r8 = r26
        L452:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r13 = r8
        L457:
            r8 = r19
            goto L45f
        L45a:
            java.lang.String r19 = "unknown"
            java.lang.String r15 = "时间未知"
            goto L457
        L45f:
            java.lang.Object r9 = r1.get(r8)
            if (r9 != 0) goto L46d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.put(r8, r9)
        L46d:
            java.util.List r9 = (java.util.List) r9
            r9.add(r14)
            r7.put(r8, r15)
            r8 = 2
            r9 = r37
            goto L400
        L479:
            r37 = r9
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = r1.size()
            r0.<init>(r5)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L48c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4ba
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            dh0 r9 = new dh0
            java.lang.Object r10 = r7.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L4af
            r10 = r8
        L4af:
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            r9.<init>(r8, r10, r5)
            r0.add(r9)
            goto L48c
        L4ba:
            eh0 r1 = new eh0
            r1.<init>(r11, r13, r0)
            jh0 r26 = new jh0
            int r28 = r37.size()
            int r31 = r0.size()
            java.lang.String r32 = "消息读取完成，正在按月份整理"
            r33 = 48
            kh0 r27 = p000.kh0.f5925
            r29 = r11
            r30 = r13
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r0 = r26
            r2.invoke(r0)
            r41.m3924()
            java.lang.Long r0 = r6.f5086
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.CHINA
            java.lang.String r8 = "yyyyMMdd_HHmmss"
            r5.<init>(r8, r7)
            java.util.Date r8 = new java.util.Date
            r8.<init>()
            java.lang.String r5 = r5.format(r8)
            java.lang.String r8 = "[^a-zA-Z0-9_\\-]"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            r8.getClass()
            r10 = r23
            java.util.regex.Matcher r8 = r8.matcher(r10)
            java.lang.String r9 = "_"
            java.lang.String r8 = r8.replaceAll(r9)
            r8.getClass()
            r11 = 1
            char[] r13 = new char[r11]
            r11 = 95
            r25 = 0
            r13[r25] = r11
            java.lang.String r8 = p000.q02.m4661(r8, r13)
            r11 = 48
            java.lang.String r8 = p000.q02.m4693(r8, r11)
            boolean r11 = p000.q02.m4671(r8)
            if (r11 == 0) goto L525
            java.lang.String r8 = "conversation"
        L525:
            if (r34 == 0) goto L52a
            java.lang.String r11 = "full"
            goto L52c
        L52a:
            java.lang.String r11 = "loaded"
        L52c:
            java.lang.Long r13 = r6.f5085
            java.lang.String r14 = ""
            if (r13 != 0) goto L53b
            if (r0 == 0) goto L535
            goto L53b
        L535:
            r39 = r1
            r0 = r14
        L538:
            r13 = r21
            goto L576
        L53b:
            java.lang.String r15 = "yyyyMMdd"
            r16 = r0
            r39 = r1
            if (r13 == 0) goto L557
            long r0 = r13.longValue()
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat
            r13.<init>(r15, r7)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r0 = r13.format(r2)
            if (r0 != 0) goto L559
        L557:
            java.lang.String r0 = "start"
        L559:
            if (r16 == 0) goto L56f
            long r1 = r16.longValue()
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat
            r13.<init>(r15, r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r1)
            java.lang.String r1 = r13.format(r7)
            if (r1 != 0) goto L571
        L56f:
            java.lang.String r1 = "end"
        L571:
            java.lang.String r0 = p000.a12.m18(r9, r0, r9, r1)
            goto L538
        L576:
            java.lang.String r1 = r13.f4739
            java.lang.String r2 = "chat_"
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r8, r9, r11, r0)
            r0.append(r9)
            r0.append(r5)
            java.lang.String r2 = "."
            r0.append(r2)
            r0.append(r1)
            java.lang.String r8 = r0.toString()
            java.lang.String r11 = r13.f4740
            a9 r0 = new a9
            r2 = r39
            r7 = r42
            r5 = r6
            r1 = r10
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r1 = r38.getApplicationContext()
            r1.getClass()
            android.net.Uri r6 = p000.AbstractC1021yh.m6864(r1)
            if (r6 == 0) goto L73f
            cw1 r6 = p000.cw1.m1627(r1, r6)
            boolean r7 = r6.m1631()
            if (r7 == 0) goto L5bd
            boolean r7 = r6.m1628()
            if (r7 == 0) goto L5bd
            goto L5be
        L5bd:
            r6 = 0
        L5be:
            if (r6 == 0) goto L737
            java.lang.String r7 = "聊天记录"
            cw1 r15 = r6.m1629(r7)
            if (r15 == 0) goto L5dd
            boolean r16 = r15.m1631()
            if (r16 == 0) goto L5d5
            boolean r16 = r15.m1628()
            if (r16 == 0) goto L5d5
            goto L5d6
        L5d5:
            r15 = 0
        L5d6:
            if (r15 == 0) goto L5dd
            r38 = r1
            r39 = r3
            goto L612
        L5dd:
            java.lang.Object r15 = r6.f2789
            android.content.Context r15 = (android.content.Context) r15
            java.lang.Object r6 = r6.f2790
            android.net.Uri r6 = (android.net.Uri) r6
            r38 = r1
            java.lang.String r1 = "vnd.android.document/directory"
            r39 = r3
            android.content.ContentResolver r3 = r15.getContentResolver()     // Catch: java.lang.Exception -> L5f4
            android.net.Uri r1 = android.provider.DocumentsContract.createDocument(r3, r6, r1, r7)     // Catch: java.lang.Exception -> L5f4
            goto L5f5
        L5f4:
            r1 = 0
        L5f5:
            if (r1 == 0) goto L5fe
            cw1 r3 = new cw1
            r6 = 1
            r3.<init>(r15, r6, r1)
            goto L5ff
        L5fe:
            r3 = 0
        L5ff:
            if (r3 == 0) goto L72f
            boolean r1 = r3.m1631()
            if (r1 == 0) goto L60e
            boolean r1 = r3.m1628()
            if (r1 == 0) goto L60e
            goto L60f
        L60e:
            r3 = 0
        L60f:
            if (r3 == 0) goto L72f
            r15 = r3
        L612:
            r1 = 46
            r3 = 6
            r6 = 0
            int r1 = p000.q02.m4674(r8, r1, r6, r3)
            if (r1 <= 0) goto L621
            java.lang.String r3 = r8.substring(r6, r1)
            goto L622
        L621:
            r3 = r8
        L622:
            if (r1 <= 0) goto L628
            java.lang.String r14 = r8.substring(r1)
        L628:
            r6 = r8
            r1 = 2
        L62a:
            cw1 r7 = r15.m1629(r6)
            if (r7 == 0) goto L64d
            int r6 = r1 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r9)
            r7.append(r1)
            r7.append(r14)
            java.lang.String r1 = r7.toString()
            r36 = r6
            r6 = r1
            r1 = r36
            goto L62a
        L64d:
            java.lang.Object r1 = r15.f2789
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r3 = r15.f2790
            android.net.Uri r3 = (android.net.Uri) r3
            android.content.ContentResolver r7 = r1.getContentResolver()     // Catch: java.lang.Exception -> L65e
            android.net.Uri r3 = android.provider.DocumentsContract.createDocument(r7, r3, r11, r6)     // Catch: java.lang.Exception -> L65e
            goto L65f
        L65e:
            r3 = 0
        L65f:
            if (r3 == 0) goto L668
            cw1 r6 = new cw1
            r11 = 1
            r6.<init>(r1, r11, r3)
            goto L669
        L668:
            r6 = 0
        L669:
            if (r6 == 0) goto L727
            java.lang.Object r1 = r6.f2790     // Catch: java.lang.Throwable -> L705
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> L705
            android.content.ContentResolver r3 = r38.getContentResolver()     // Catch: java.lang.Throwable -> L705
            java.lang.String r7 = "w"
            java.io.OutputStream r3 = r3.openOutputStream(r1, r7)     // Catch: java.lang.Throwable -> L705
            if (r3 == 0) goto L70f
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L705
            java.nio.charset.Charset r9 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L705
            r7.<init>(r3, r9)     // Catch: java.lang.Throwable -> L705
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L705
            r9 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r7, r9)     // Catch: java.lang.Throwable -> L705
            r0.invoke(r3)     // Catch: java.lang.Throwable -> L707
            r3.flush()     // Catch: java.lang.Throwable -> L707
            r3.close()     // Catch: java.lang.Throwable -> L705
            r1.getClass()     // Catch: java.lang.Throwable -> L705
            java.lang.Object r0 = r6.f2789     // Catch: java.lang.Throwable -> L705
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L705
            java.lang.Object r3 = r6.f2790     // Catch: java.lang.Throwable -> L705
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.Throwable -> L705
            java.lang.String r7 = "_display_name"
            java.lang.String r0 = p000.AbstractC0073bd.m858(r0, r3, r7)     // Catch: java.lang.Throwable -> L705
            if (r0 != 0) goto L6a8
            r27 = r8
            goto L6aa
        L6a8:
            r27 = r0
        L6aa:
            int r0 = r37.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "export done, conversationId="
            r3.<init>(r6)
            r3.append(r10)
            java.lang.String r6 = ", format="
            r3.append(r6)
            r3.append(r13)
            java.lang.String r6 = ", messages="
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = ", complete="
            r3.append(r0)
            boolean r0 = r4.f7133
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 0
            r7 = 4
            p000.C0888ux.m5988(r12, r0, r3, r7, r3)
            lh0 r25 = new lh0
            hh0 r0 = r5.f5087
            int r29 = r37.size()
            int r30 = r39.size()
            java.util.ArrayList r3 = r2.f3560
            int r35 = r3.size()
            boolean r3 = r4.f7133
            java.lang.String r4 = r4.f7134
            java.lang.Long r5 = r2.f3558
            java.lang.Long r2 = r2.f3559
            r28 = r0
            r26 = r1
            r34 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r25
        L705:
            r0 = move-exception
            goto L717
        L707:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L70a
        L70a:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r1)     // Catch: java.lang.Throwable -> L705
            throw r0     // Catch: java.lang.Throwable -> L705
        L70f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L705
            java.lang.String r1 = "系统文档提供者无法创建输出流"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L705
            throw r0     // Catch: java.lang.Throwable -> L705
        L717:
            java.lang.Object r1 = r6.f2789     // Catch: java.lang.Throwable -> L726
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L726
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L726
            java.lang.Object r2 = r6.f2790     // Catch: java.lang.Throwable -> L726
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L726
            android.provider.DocumentsContract.deleteDocument(r1, r2)     // Catch: java.lang.Throwable -> L726
        L726:
            throw r0
        L727:
            java.lang.String r0 = "系统文档提供者无法创建导出文件"
            p000.C1080.m7279(r0)
            r24 = 0
            return r24
        L72f:
            r24 = 0
            java.lang.String r0 = "无法在所选目录中创建“聊天记录”文件夹"
            p000.C1080.m7279(r0)
            return r24
        L737:
            vh r0 = new vh
            java.lang.String r1 = "保存目录授权已失效，请重新选择"
            r0.<init>(r1)
            throw r0
        L73f:
            vh r0 = new vh
            java.lang.String r1 = "请先选择聊天记录保存目录"
            r0.<init>(r1)
            throw r0
        L747:
            r24 = r10
            java.lang.String r0 = "当前会话 ID 尚未准备完成"
            p000.C1080.m7279(r0)
            return r24
        L74f:
            r24 = r10
            java.lang.String r0 = "单次消息等待时间必须在 1 到 60 秒之间"
            p000.C1080.m7275(r0)
            return r24
        L757:
            r24 = r10
            java.lang.String r0 = "每页消息数必须在 1 到 500 之间"
            p000.C1080.m7275(r0)
            return r24
    }
}
