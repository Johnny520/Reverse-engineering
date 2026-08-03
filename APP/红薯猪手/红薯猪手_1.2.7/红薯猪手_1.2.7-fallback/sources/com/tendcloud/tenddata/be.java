package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class be {
    private static volatile com.tendcloud.tenddata.be a;
    private static java.lang.String b;
    private static java.lang.String c;
    private static java.lang.String d;
    private static java.lang.String e;
    private static java.lang.String f;
    private static java.lang.String g;
    private static java.lang.String h;
    private static java.lang.String i;
    private static java.lang.String j;
    private static java.lang.String k;
    private static java.lang.String l;
    private static java.lang.String m;
    private static java.lang.String n;
    private static java.lang.String o;
    private static java.lang.String p;
    private static java.lang.String q;
    private static java.lang.String r;
    private static java.lang.String t;
    private static org.json.JSONObject z;
    private java.util.Map<java.lang.String, java.lang.Object> A;
    private java.lang.String s;
    private com.tendcloud.tenddata.be.a u;
    private java.lang.String v;
    private int w;
    private java.lang.String x;
    private org.json.JSONObject y;

    public enum a extends java.lang.Enum<com.tendcloud.tenddata.be.a> {
        private static final /* synthetic */ com.tendcloud.tenddata.be.a[] $VALUES = null;
        public static final com.tendcloud.tenddata.be.a FEMALE = null;
        public static final com.tendcloud.tenddata.be.a MALE = null;
        public static final com.tendcloud.tenddata.be.a UNKNOWN = null;

        static {
                com.tendcloud.tenddata.be$a r0 = new com.tendcloud.tenddata.be$a
                java.lang.String r1 = "MALE"
                r2 = 0
                r0.<init>(r1, r2)
                com.tendcloud.tenddata.be.a.MALE = r0
                com.tendcloud.tenddata.be$a r1 = new com.tendcloud.tenddata.be$a
                java.lang.String r3 = "FEMALE"
                r4 = 1
                r1.<init>(r3, r4)
                com.tendcloud.tenddata.be.a.FEMALE = r1
                com.tendcloud.tenddata.be$a r3 = new com.tendcloud.tenddata.be$a
                java.lang.String r5 = "UNKNOWN"
                r6 = 2
                r3.<init>(r5, r6)
                com.tendcloud.tenddata.be.a.UNKNOWN = r3
                r5 = 3
                com.tendcloud.tenddata.be$a[] r5 = new com.tendcloud.tenddata.be.a[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.tendcloud.tenddata.be.a.$VALUES = r5
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.tendcloud.tenddata.be.a valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.be$a> r0 = com.tendcloud.tenddata.be.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.be$a r1 = (com.tendcloud.tenddata.be.a) r1
                return r1
        }

        public static com.tendcloud.tenddata.be.a[] values() {
                com.tendcloud.tenddata.be$a[] r0 = com.tendcloud.tenddata.be.a.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.be$a[] r0 = (com.tendcloud.tenddata.be.a[]) r0
                return r0
        }
    }

    static {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.be r1 = a()     // Catch: java.lang.Throwable -> Lb
            r0.register(r1)     // Catch: java.lang.Throwable -> Lb
        Lb:
            java.lang.String r0 = "account"
            com.tendcloud.tenddata.be.b = r0
            java.lang.String r0 = "accountId"
            com.tendcloud.tenddata.be.c = r0
            java.lang.String r0 = "name"
            com.tendcloud.tenddata.be.d = r0
            java.lang.String r0 = "gender"
            com.tendcloud.tenddata.be.e = r0
            java.lang.String r0 = "age"
            com.tendcloud.tenddata.be.f = r0
            java.lang.String r0 = "type"
            com.tendcloud.tenddata.be.g = r0
            java.lang.String r0 = "accountCus"
            com.tendcloud.tenddata.be.h = r0
            java.lang.String r0 = "property1"
            com.tendcloud.tenddata.be.i = r0
            java.lang.String r0 = "property2"
            com.tendcloud.tenddata.be.j = r0
            java.lang.String r0 = "property3"
            com.tendcloud.tenddata.be.k = r0
            java.lang.String r0 = "property4"
            com.tendcloud.tenddata.be.l = r0
            java.lang.String r0 = "property5"
            com.tendcloud.tenddata.be.m = r0
            java.lang.String r0 = "property6"
            com.tendcloud.tenddata.be.n = r0
            java.lang.String r0 = "property7"
            com.tendcloud.tenddata.be.o = r0
            java.lang.String r0 = "property8"
            com.tendcloud.tenddata.be.p = r0
            java.lang.String r0 = "property9"
            com.tendcloud.tenddata.be.q = r0
            java.lang.String r0 = "property10"
            com.tendcloud.tenddata.be.r = r0
            java.lang.String r0 = "default"
            com.tendcloud.tenddata.be.t = r0
            return
    }

    private be() {
            r1 = this;
            r1.<init>()
            com.tendcloud.tenddata.be$a r0 = com.tendcloud.tenddata.be.a.UNKNOWN
            r1.u = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.A = r0
            return
    }

    public static com.tendcloud.tenddata.be a() {
            com.tendcloud.tenddata.be r0 = com.tendcloud.tenddata.be.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.be> r0 = com.tendcloud.tenddata.be.class
            monitor-enter(r0)
            com.tendcloud.tenddata.be r1 = com.tendcloud.tenddata.be.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.be r1 = new com.tendcloud.tenddata.be     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.be.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.be r0 = com.tendcloud.tenddata.be.a
            return r0
    }

    private void a(com.tendcloud.tenddata.a r3) {
            r2 = this;
            com.tendcloud.tenddata.bu r0 = new com.tendcloud.tenddata.bu     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            com.tendcloud.tenddata.bu$a r1 = com.tendcloud.tenddata.bu.a.IMMEDIATELY     // Catch: java.lang.Throwable -> L12
            r0.b = r1     // Catch: java.lang.Throwable -> L12
            r0.a = r3     // Catch: java.lang.Throwable -> L12
            com.tendcloud.tenddata.z r3 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L12
            r3.post(r0)     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static void a(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, com.tendcloud.tenddata.a r4) {
            r0 = 0
            a(r1, r2, r3, r0, r4)
            return
    }

    public static void a(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, com.tendcloud.tenddata.a r5) {
            if (r5 != 0) goto L3
            return
        L3:
            if (r1 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L3a
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L3a
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv
            r0.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.b = r1
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.c = r1
            if (r3 == 0) goto L31
            boolean r1 = r3 instanceof java.util.Map
            if (r1 == 0) goto L31
            java.util.Map r3 = (java.util.Map) r3
            if (r4 == 0) goto L2f
            java.lang.String r1 = "eventValue"
            r3.put(r1, r4)
        L2f:
            r0.d = r3
        L31:
            r0.a = r5
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a()
            r1.post(r0)
        L3a:
            return
    }

    private void a(java.lang.String r2) {
            r1 = this;
            r1.s = r2     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.tendcloud.tenddata.i.a(r2)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L61
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L61
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = com.tendcloud.tenddata.be.d     // Catch: java.lang.Throwable -> L61
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L1d
            java.lang.String r2 = com.tendcloud.tenddata.be.d     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L61
            r1.v = r2     // Catch: java.lang.Throwable -> L61
        L1d:
            java.lang.String r2 = com.tendcloud.tenddata.be.e     // Catch: java.lang.Throwable -> L61
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L31
            java.lang.String r2 = com.tendcloud.tenddata.be.e     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L61
            com.tendcloud.tenddata.be$a r2 = com.tendcloud.tenddata.be.a.valueOf(r2)     // Catch: java.lang.Throwable -> L61
            r1.u = r2     // Catch: java.lang.Throwable -> L61
        L31:
            java.lang.String r2 = com.tendcloud.tenddata.be.f     // Catch: java.lang.Throwable -> L61
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L41
            java.lang.String r2 = com.tendcloud.tenddata.be.f     // Catch: java.lang.Throwable -> L61
            int r2 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L61
            r1.w = r2     // Catch: java.lang.Throwable -> L61
        L41:
            java.lang.String r2 = com.tendcloud.tenddata.be.g     // Catch: java.lang.Throwable -> L61
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L51
            java.lang.String r2 = com.tendcloud.tenddata.be.g     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L61
            r1.x = r2     // Catch: java.lang.Throwable -> L61
        L51:
            java.lang.String r2 = com.tendcloud.tenddata.be.h     // Catch: java.lang.Throwable -> L61
            boolean r2 = r0.has(r2)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L61
            java.lang.String r2 = com.tendcloud.tenddata.be.h     // Catch: java.lang.Throwable -> L61
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch: java.lang.Throwable -> L61
            r1.y = r2     // Catch: java.lang.Throwable -> L61
        L61:
            return
    }

    public static synchronized void a(java.lang.String r3, com.tendcloud.tenddata.a r4) {
            java.lang.Class<com.tendcloud.tenddata.be> r0 = com.tendcloud.tenddata.be.class
            monitor-enter(r0)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.be.z = r1     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.be.t = r3     // Catch: java.lang.Throwable -> L23
            java.util.Map r3 = g()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = com.tendcloud.tenddata.be.b     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "roleCreate"
            a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.ct r4 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L23
            r4.setSubprofile(r1)     // Catch: java.lang.Throwable -> L23
        L23:
            monitor-exit(r0)
            return
    }

    private void a(java.lang.String r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, com.tendcloud.tenddata.a r14) {
            r8 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private void a(java.lang.String r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, com.tendcloud.tenddata.a r9) {
            r2 = this;
            r2.c()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r2.s     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L12
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L12
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.A     // Catch: java.lang.Throwable -> L4d
            r0.clear()     // Catch: java.lang.Throwable -> L4d
        L12:
            r2.s = r3     // Catch: java.lang.Throwable -> L4d
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L4d
            r3.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = com.tendcloud.tenddata.be.c     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r2.s     // Catch: java.lang.Throwable -> L4d
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L4d
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L4d
            r3.putAll(r4)     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L30
            java.lang.String r4 = "invitationCode"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L4d
            r3.put(r4, r7)     // Catch: java.lang.Throwable -> L4d
        L30:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.A     // Catch: java.lang.Throwable -> L4d
            r4.putAll(r3)     // Catch: java.lang.Throwable -> L4d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.A     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            com.tendcloud.tenddata.i.setUniversalProfileInfo(r7)     // Catch: java.lang.Throwable -> L4d
            com.tendcloud.tenddata.ct r7 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L4d
            r7.setProfile(r4)     // Catch: java.lang.Throwable -> L4d
            a(r6, r5, r3, r8, r9)     // Catch: java.lang.Throwable -> L4d
        L4d:
            return
    }

    private boolean a(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L9
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    private java.util.Map<java.lang.String, java.lang.Object> b() {
            r3 = this;
            java.lang.String r0 = r3.s     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Lb
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.A     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = com.tendcloud.tenddata.be.c     // Catch: java.lang.Throwable -> Lb
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> Lb
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.A
            return r0
    }

    private static void b(com.tendcloud.tenddata.a r3) {
            java.util.Map r0 = g()     // Catch: java.lang.Throwable -> L17
            com.tendcloud.tenddata.ct r1 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L17
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r1.setSubprofile(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = com.tendcloud.tenddata.be.b     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "roleUpdate"
            a(r1, r2, r0, r3)     // Catch: java.lang.Throwable -> L17
        L17:
            return
    }

    private void b(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, com.tendcloud.tenddata.a r6) {
            r2 = this;
            r2.c()     // Catch: java.lang.Throwable -> L23
            java.util.Map r0 = r2.b()     // Catch: java.lang.Throwable -> L23
            r1 = r3
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L23
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.i.setUniversalProfileInfo(r0)     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.ct r0 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L23
            r0.setProfile(r1)     // Catch: java.lang.Throwable -> L23
            a(r5, r4, r3, r6)     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    private void c() {
            r4 = this;
            java.lang.String r0 = com.tendcloud.tenddata.i.m()     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L138
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L138
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L138
            java.lang.String r0 = com.tendcloud.tenddata.be.c     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L22
            java.lang.String r0 = com.tendcloud.tenddata.be.c     // Catch: java.lang.Throwable -> L138
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L138
            r4.s = r0     // Catch: java.lang.Throwable -> L138
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r3 = com.tendcloud.tenddata.be.c     // Catch: java.lang.Throwable -> L138
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L138
        L22:
            java.lang.String r0 = com.tendcloud.tenddata.be.d     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L35
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.d     // Catch: java.lang.Throwable -> L138
            java.lang.String r3 = r1.getString(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L35:
            java.lang.String r0 = com.tendcloud.tenddata.be.g     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.g     // Catch: java.lang.Throwable -> L138
            int r3 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L138
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L4c:
            java.lang.String r0 = com.tendcloud.tenddata.be.e     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L63
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.e     // Catch: java.lang.Throwable -> L138
            int r3 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L138
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L63:
            java.lang.String r0 = com.tendcloud.tenddata.be.f     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L7a
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.f     // Catch: java.lang.Throwable -> L138
            int r3 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L138
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L7a:
            java.lang.String r0 = com.tendcloud.tenddata.be.i     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L8d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.i     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L8d:
            java.lang.String r0 = com.tendcloud.tenddata.be.j     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto La0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.j     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        La0:
            java.lang.String r0 = com.tendcloud.tenddata.be.k     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto Lb3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.k     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        Lb3:
            java.lang.String r0 = com.tendcloud.tenddata.be.l     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto Lc6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.l     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        Lc6:
            java.lang.String r0 = com.tendcloud.tenddata.be.m     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto Ld9
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.m     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        Ld9:
            java.lang.String r0 = com.tendcloud.tenddata.be.n     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto Lec
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.n     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        Lec:
            java.lang.String r0 = com.tendcloud.tenddata.be.o     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto Lff
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.o     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        Lff:
            java.lang.String r0 = com.tendcloud.tenddata.be.p     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L112
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.p     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L112:
            java.lang.String r0 = com.tendcloud.tenddata.be.q     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L125
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.q     // Catch: java.lang.Throwable -> L138
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L138
        L125:
            java.lang.String r0 = com.tendcloud.tenddata.be.r     // Catch: java.lang.Throwable -> L138
            boolean r0 = r1.has(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L138
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.A     // Catch: java.lang.Throwable -> L138
            java.lang.String r2 = com.tendcloud.tenddata.be.r     // Catch: java.lang.Throwable -> L138
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L138
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L138
        L138:
            return
    }

    private void d() {
            r5 = this;
            java.util.Map r0 = r5.f()     // Catch: java.lang.Throwable -> L48
            com.tendcloud.tenddata.zz$a r1 = new com.tendcloud.tenddata.zz$a     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r1.paraMap     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "apiType"
            r4 = 9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L48
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r1.paraMap     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "domain"
            java.lang.String r4 = com.tendcloud.tenddata.be.b     // Catch: java.lang.Throwable -> L48
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r1.paraMap     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "action"
            java.lang.String r4 = "update"
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r1.paraMap     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "data"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L48
            android.os.Handler r2 = com.tendcloud.tenddata.zz.c()     // Catch: java.lang.Throwable -> L48
            r3 = 102(0x66, float:1.43E-43)
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch: java.lang.Throwable -> L48
            r1.sendToTarget()     // Catch: java.lang.Throwable -> L48
            com.tendcloud.tenddata.ct r1 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L48
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L48
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r1.setProfile(r2)     // Catch: java.lang.Throwable -> L48
        L48:
            return
    }

    private static void e() {
            java.lang.String r0 = com.tendcloud.tenddata.be.t
            com.tendcloud.tenddata.i.setLastRoleName(r0)
            java.lang.String r0 = com.tendcloud.tenddata.be.t
            org.json.JSONObject r1 = com.tendcloud.tenddata.be.z
            java.lang.String r1 = r1.toString()
            com.tendcloud.tenddata.i.b(r0, r1)
            return
    }

    private java.util.Map<java.lang.String, java.lang.Object> f() {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.tendcloud.tenddata.be.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r3.s     // Catch: java.lang.Throwable -> L55
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L55
            int r1 = r3.w     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L19
            java.lang.String r2 = com.tendcloud.tenddata.be.f     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L55
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L55
        L19:
            java.lang.String r1 = "UNKNOWN"
            com.tendcloud.tenddata.be$a r2 = r3.u     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r2.name()     // Catch: java.lang.Throwable -> L55
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L32
            java.lang.String r1 = com.tendcloud.tenddata.be.e     // Catch: java.lang.Throwable -> L55
            com.tendcloud.tenddata.be$a r2 = r3.u     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r2.name()     // Catch: java.lang.Throwable -> L55
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L55
        L32:
            java.lang.String r1 = r3.v     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L3b
            java.lang.String r2 = com.tendcloud.tenddata.be.d     // Catch: java.lang.Throwable -> L55
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L55
        L3b:
            java.lang.String r1 = r3.x     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L44
            java.lang.String r2 = com.tendcloud.tenddata.be.g     // Catch: java.lang.Throwable -> L55
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L55
        L44:
            org.json.JSONObject r1 = r3.y     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L55
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L55
            if (r1 <= 0) goto L55
            java.lang.String r1 = "custom"
            org.json.JSONObject r2 = r3.y     // Catch: java.lang.Throwable -> L55
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L55
        L55:
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.Object> g() {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = com.tendcloud.tenddata.be.t     // Catch: java.lang.Throwable -> L1d
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1d
            org.json.JSONObject r1 = com.tendcloud.tenddata.be.z     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1d
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L1d
            if (r1 <= 0) goto L1d
            java.lang.String r1 = "custom"
            org.json.JSONObject r2 = com.tendcloud.tenddata.be.z     // Catch: java.lang.Throwable -> L1d
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L1d
        L1d:
            return r0
    }

    private static void h() {
            java.util.Map r0 = g()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.ct r1 = com.tendcloud.tenddata.ct.a()     // Catch: java.lang.Throwable -> L14
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L14
            r1.setSubprofile(r2)     // Catch: java.lang.Throwable -> L14
            r0 = 0
            b(r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    public synchronized void a(java.lang.String r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = com.tendcloud.tenddata.be.z     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto Lc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            com.tendcloud.tenddata.be.z = r0     // Catch: java.lang.Throwable -> L19
        Lc:
            org.json.JSONObject r0 = com.tendcloud.tenddata.be.z     // Catch: java.lang.Throwable -> L17
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L17
            e()     // Catch: java.lang.Throwable -> L17
            h()     // Catch: java.lang.Throwable -> L17
        L17:
            monitor-exit(r1)
            return
        L19:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = com.tendcloud.tenddata.be.z     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto Lc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            com.tendcloud.tenddata.be.z = r0     // Catch: java.lang.Throwable -> L19
        Lc:
            org.json.JSONObject r0 = com.tendcloud.tenddata.be.z     // Catch: java.lang.Throwable -> L17
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L17
            e()     // Catch: java.lang.Throwable -> L17
            h()     // Catch: java.lang.Throwable -> L17
        L17:
            monitor-exit(r1)
            return
        L19:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void b(java.lang.String r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.y     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            r1.y = r0     // Catch: java.lang.Throwable -> L16
        Lc:
            org.json.JSONObject r0 = r1.y     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
            r1.d()     // Catch: java.lang.Throwable -> L14
        L14:
            monitor-exit(r1)
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public synchronized void b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.y     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L16
            r0.<init>()     // Catch: java.lang.Throwable -> L16
            r1.y = r0     // Catch: java.lang.Throwable -> L16
        Lc:
            org.json.JSONObject r0 = r1.y     // Catch: java.lang.Throwable -> L14
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L14
            r1.d()     // Catch: java.lang.Throwable -> L14
        L14:
            monitor-exit(r1)
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final void onTDEBEventAccount(com.tendcloud.tenddata.zz.a r10) {
            r9 = this;
            if (r10 == 0) goto Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb2
            java.lang.String r1 = "apiType"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lb2
            r1 = 9
            if (r0 == r1) goto L1a
            goto Lb2
        L1a:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "account"
            r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "service"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            r8 = r0
            com.tendcloud.tenddata.a r8 = (com.tendcloud.tenddata.a) r8     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "data"
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "domain"
            java.lang.Object r5 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "action"
            java.lang.Object r4 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "immediate"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r4 == 0) goto La4
            java.lang.String r1 = "login"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r1 != 0) goto L83
            java.lang.String r1 = "register"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L5f
            goto L83
        L5f:
            java.lang.String r1 = "roleCreate"
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L77
            java.util.HashMap<java.lang.String, java.lang.Object> r10 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "parameter"
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lb2
            a(r10, r8)     // Catch: java.lang.Throwable -> Lb2
            return
        L77:
            java.lang.String r10 = "update"
            boolean r10 = r4.equals(r10)     // Catch: java.lang.Throwable -> Lb2
            if (r10 == 0) goto La4
            r9.b(r3, r4, r5, r8)     // Catch: java.lang.Throwable -> Lb2
            return
        L83:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "accountId"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = "invitationCode"
            java.lang.Object r6 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap<java.lang.String, java.lang.Object> r10 = r10.paraMap     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "eventValue"
            java.lang.Object r7 = r10.get(r0)     // Catch: java.lang.Throwable -> Lb2
            r1 = r9
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb2
            return
        La4:
            if (r4 == 0) goto Lb2
            a(r5, r4, r3, r8)     // Catch: java.lang.Throwable -> Lb2
            boolean r10 = r9.a(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r10 == 0) goto Lb2
            r9.a(r8)     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            return
    }

    public void setAccountType(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.x     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto La
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lf
        La:
            r1.x = r2     // Catch: java.lang.Throwable -> Lf
            r1.d()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public void setAge(int r2) {
            r1 = this;
            int r0 = r1.w     // Catch: java.lang.Throwable -> L9
            if (r0 == r2) goto L9
            r1.w = r2     // Catch: java.lang.Throwable -> L9
            r1.d()     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    public void setGender(com.tendcloud.tenddata.be.a r2) {
            r1 = this;
            com.tendcloud.tenddata.be$a r0 = r1.u     // Catch: java.lang.Throwable -> L9
            if (r0 == r2) goto L9
            r1.u = r2     // Catch: java.lang.Throwable -> L9
            r1.d()     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    public void setName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.v     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto La
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lf
        La:
            r1.v = r2     // Catch: java.lang.Throwable -> Lf
            r1.d()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }
}
