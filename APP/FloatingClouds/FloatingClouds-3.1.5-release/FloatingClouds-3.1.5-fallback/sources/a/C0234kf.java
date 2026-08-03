package a;

/* JADX INFO: renamed from: a.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234kf {
    public static final a.C0234kf.a m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f550a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.util.List<java.lang.String> j;
    public final long k;
    public final long l;

    /* JADX INFO: renamed from: a.kf$a */
    public static final class a {
        public static a.C0234kf a(org.json.JSONObject r21) {
                r0 = r21
                java.lang.String r1 = "loaderClass"
                java.lang.String r2 = ""
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                r4 = 0
                java.lang.String r5 = "null"
                if (r3 <= 0) goto L1e
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L1e
                r7 = r1
                goto L1f
            L1e:
                r7 = r4
            L1f:
                java.lang.String r1 = "loaderMethod"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto L36
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L36
                r8 = r1
                goto L37
            L36:
                r8 = r4
            L37:
                java.lang.String r1 = "loaderParamType"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto L4e
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L4e
                r9 = r1
                goto L4f
            L4e:
                r9 = r4
            L4f:
                java.lang.String r1 = "appClass"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto L66
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L66
                r10 = r1
                goto L67
            L66:
                r10 = r4
            L67:
                java.lang.String r1 = "appEntryMethod"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto L7e
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L7e
                r11 = r1
                goto L7f
            L7e:
                r11 = r4
            L7f:
                java.lang.String r1 = "securityClass"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto L96
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L96
                r12 = r1
                goto L97
            L96:
                r12 = r4
            L97:
                java.lang.String r1 = "securityMethod"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto Lae
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto Lae
                r13 = r1
                goto Laf
            Lae:
                r13 = r4
            Laf:
                java.lang.String r1 = "patchServiceClass"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto Lc6
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto Lc6
                r14 = r1
                goto Lc7
            Lc6:
                r14 = r4
            Lc7:
                java.lang.String r1 = "patchServiceEntry"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                if (r3 <= 0) goto Lde
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto Lde
                r15 = r1
                goto Ldf
            Lde:
                r15 = r4
            Ldf:
                java.lang.String r1 = "tinkerPathSegments"
                org.json.JSONArray r1 = r0.optJSONArray(r1)
                if (r1 != 0) goto Lec
                a.Y5 r1 = a.Y5.f351a
            Le9:
                r16 = r1
                goto L13d
            Lec:
                r3 = 0
                int r4 = r1.length()
                a.f9 r3 = a.Oc.D(r3, r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = a.C0312p3.g0(r3, r5)
                r4.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
            L104:
                r5 = r3
                a.e9 r5 = (a.C0121e9) r5
                boolean r5 = r5.c
                if (r5 == 0) goto L11a
                r5 = r3
                a.c9 r5 = (a.AbstractC0085c9) r5
                int r5 = r5.a()
                java.lang.String r5 = r1.optString(r5, r2)
                r4.add(r5)
                goto L104
            L11a:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r4.iterator()
            L123:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Le9
                java.lang.Object r3 = r2.next()
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
                a.C0193i9.b(r4)
                int r4 = r4.length()
                if (r4 <= 0) goto L123
                r1.add(r3)
                goto L123
            L13d:
                java.lang.String r1 = "locatedAtMs"
                r2 = 0
                long r17 = r0.optLong(r1, r2)
                java.lang.String r1 = "wxVersionCode"
                long r19 = r0.optLong(r1, r2)
                a.kf r6 = new a.kf
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
                return r6
        }
    }

    static {
            a.kf$a r0 = new a.kf$a
            r0.<init>()
            a.C0234kf.m = r0
            return
    }

    public C0234kf(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.List<java.lang.String> r10, long r11, long r13) {
            r0 = this;
            r0.<init>()
            r0.f550a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r13
            return
    }

    public final boolean a() {
            r1 = this;
            java.lang.String r0 = r1.f550a
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.b
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.d
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.f
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.g
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final org.json.JSONObject b() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r4.f550a
            if (r1 != 0) goto Lb
            java.lang.Object r1 = org.json.JSONObject.NULL
        Lb:
            java.lang.String r2 = "loaderClass"
            r0.put(r2, r1)
            java.lang.String r1 = r4.b
            if (r1 != 0) goto L16
            java.lang.Object r1 = org.json.JSONObject.NULL
        L16:
            java.lang.String r2 = "loaderMethod"
            r0.put(r2, r1)
            java.lang.String r1 = r4.c
            if (r1 != 0) goto L21
            java.lang.Object r1 = org.json.JSONObject.NULL
        L21:
            java.lang.String r2 = "loaderParamType"
            r0.put(r2, r1)
            java.lang.String r1 = r4.d
            if (r1 != 0) goto L2c
            java.lang.Object r1 = org.json.JSONObject.NULL
        L2c:
            java.lang.String r2 = "appClass"
            r0.put(r2, r1)
            java.lang.String r1 = r4.e
            if (r1 != 0) goto L37
            java.lang.Object r1 = org.json.JSONObject.NULL
        L37:
            java.lang.String r2 = "appEntryMethod"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f
            if (r1 != 0) goto L42
            java.lang.Object r1 = org.json.JSONObject.NULL
        L42:
            java.lang.String r2 = "securityClass"
            r0.put(r2, r1)
            java.lang.String r1 = r4.g
            if (r1 != 0) goto L4d
            java.lang.Object r1 = org.json.JSONObject.NULL
        L4d:
            java.lang.String r2 = "securityMethod"
            r0.put(r2, r1)
            java.lang.String r1 = r4.h
            if (r1 != 0) goto L58
            java.lang.Object r1 = org.json.JSONObject.NULL
        L58:
            java.lang.String r2 = "patchServiceClass"
            r0.put(r2, r1)
            java.lang.String r1 = r4.i
            if (r1 != 0) goto L63
            java.lang.Object r1 = org.json.JSONObject.NULL
        L63:
            java.lang.String r2 = "patchServiceEntry"
            r0.put(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            java.util.List<java.lang.String> r2 = r4.j
            r1.<init>(r2)
            java.lang.String r2 = "tinkerPathSegments"
            r0.put(r2, r1)
            java.lang.String r1 = "locatedAtMs"
            long r2 = r4.k
            r0.put(r1, r2)
            java.lang.String r1 = "wxVersionCode"
            long r2 = r4.l
            r0.put(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof a.C0234kf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.kf r8 = (a.C0234kf) r8
            java.lang.String r1 = r8.f550a
            java.lang.String r3 = r7.f550a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r7.h
            java.lang.String r3 = r8.h
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r7.i
            java.lang.String r3 = r8.i
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.util.List<java.lang.String> r1 = r7.j
            java.util.List<java.lang.String> r3 = r8.j
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            long r3 = r7.k
            long r5 = r8.k
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L83
            return r2
        L83:
            long r3 = r7.l
            long r5 = r8.l
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L8c
            return r2
        L8c:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.f550a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.String r2 = r4.b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.c
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.d
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.e
            if (r2 != 0) goto L3a
            r2 = r0
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.f
            if (r2 != 0) goto L47
            r2 = r0
            goto L4b
        L47:
            int r2 = r2.hashCode()
        L4b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.g
            if (r2 != 0) goto L54
            r2 = r0
            goto L58
        L54:
            int r2 = r2.hashCode()
        L58:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.h
            if (r2 != 0) goto L61
            r2 = r0
            goto L65
        L61:
            int r2 = r2.hashCode()
        L65:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r4.i
            if (r2 != 0) goto L6d
            goto L71
        L6d:
            int r0 = r2.hashCode()
        L71:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<java.lang.String> r0 = r4.j
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r4.k
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.l
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TinkerSymbols(loaderClass="
            r0.<init>(r1)
            java.lang.String r1 = r3.f550a
            r0.append(r1)
            java.lang.String r1 = ", loaderMethod="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", loaderParamType="
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", appClass="
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", appEntryMethod="
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", securityClass="
            r0.append(r1)
            java.lang.String r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", securityMethod="
            r0.append(r1)
            java.lang.String r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", patchServiceClass="
            r0.append(r1)
            java.lang.String r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", patchServiceEntry="
            r0.append(r1)
            java.lang.String r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", tinkerPathSegments="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", locatedAtMs="
            r0.append(r1)
            long r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", wxVersionCode="
            r0.append(r1)
            long r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
