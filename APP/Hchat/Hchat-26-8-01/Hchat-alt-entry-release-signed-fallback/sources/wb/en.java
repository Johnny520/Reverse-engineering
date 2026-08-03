package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class en {
    public static af.d a(java.lang.String r0) {
            u1.a.c(r0)
            af.d r0 = new af.d
            r0.<init>()
            return r0
    }

    public static android.content.SharedPreferences.Editor b(java.lang.String r0, i0.a1 r1, java.lang.String r2, android.content.SharedPreferences r3) {
            r0.getClass()
            r1.setValue(r2)
            android.content.SharedPreferences$Editor r0 = r3.edit()
            return r0
    }

    public static g8.i c() {
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.e()
            return r0
    }

    public static i0.j1 d(android.content.SharedPreferences r0, java.lang.String r1, int r2, i0.h0 r3) {
            int r0 = r0.getInt(r1, r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r0 = i0.r.u(r0)
            r3.k0(r0)
            return r0
    }

    public static i0.j1 e(android.content.SharedPreferences r0, java.lang.String r1, boolean r2, i0.h0 r3) {
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.j1 r0 = i0.r.u(r0)
            r3.k0(r0)
            return r0
    }

    public static java.lang.String f(int r1, int r2, java.lang.String r3) {
            int r0 = r3.length()
            int r0 = r0 - r1
            java.lang.String r1 = r3.substring(r2, r0)
            return r1
    }

    public static java.lang.String g(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String h(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String i(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String j(java.lang.String r0, org.json.JSONObject r1) {
            java.lang.String r0 = r1.optString(r0)
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static org.json.JSONObject k(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r0.put(r1, r2)
            return r0
    }

    public static org.json.JSONObject l(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r0.put(r1, r2)
            r0.put(r3, r4)
            return r0
    }

    public static void m(i0.a1 r0, java.lang.Boolean r1, android.content.SharedPreferences r2, java.lang.String r3, boolean r4) {
            r0.setValue(r1)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r4)
            r0.apply()
            return
    }

    public static /* synthetic */ void n(java.lang.Object r0) {
            if (r0 != 0) goto L3
            return
        L3:
            ah.a.d()
            return
    }

    public static void o(java.lang.String r1, int r2, java.lang.String r3, android.content.Context r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            android.widget.Toast r1 = android.widget.Toast.makeText(r4, r1, r5)
            r1.show()
            return
    }

    public static void p(java.lang.StringBuilder r0, int r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    public static /* synthetic */ java.lang.String q(int r1) {
            r0 = 1
            if (r1 == r0) goto L1e
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L18
            r0 = 4
            if (r1 == r0) goto L15
            r0 = 5
            if (r1 == r0) goto L12
            java.lang.String r1 = "null"
            return r1
        L12:
            java.lang.String r1 = "OR"
            return r1
        L15:
            java.lang.String r1 = "AND"
            return r1
        L18:
            java.lang.String r1 = "NOT"
            return r1
        L1b:
            java.lang.String r1 = "TERNARY"
            return r1
        L1e:
            java.lang.String r1 = "COMPARE"
            return r1
    }
}
