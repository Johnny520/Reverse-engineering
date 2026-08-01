package p000;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0976x9 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f12071 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f12072 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f12073 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile long f12074;

    /* JADX INFO: renamed from: ε */
    public static volatile android.content.Context f12075;

    /* JADX INFO: renamed from: ζ */
    public static volatile android.content.SharedPreferences f12076;

    /* JADX INFO: renamed from: η */
    public static volatile android.content.SharedPreferences f12077;

    /* JADX INFO: renamed from: θ */
    public static volatile java.lang.String f12078;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.AbstractC0976x9.f12071 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            p000.AbstractC0976x9.f12072 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.AbstractC0976x9.f12073 = r0
            java.lang.String r0 = ""
            p000.AbstractC0976x9.f12078 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m6523() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1282()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m6524() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1285()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m6525() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1287()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m6526() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1288()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m6527() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1289()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m6528() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1290()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static boolean m6529() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1291()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m6530() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1292()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m6531() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1293()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m6532() {
            boolean r0 = m6538()
            if (r0 == 0) goto Le
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1294()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static void m6533(java.lang.String r8, java.lang.String r9) {
            java.lang.CharSequence r8 = p000.q02.m4660(r8)
            java.lang.String r8 = r8.toString()
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto Lf1
            java.lang.String r0 = "0"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L18
            goto Lf1
        L18:
            java.lang.String r0 = p000.AbstractC0976x9.f12078
            boolean r0 = p000.ln0.m3626(r0, r8)
            if (r0 != 0) goto L23
            com.example.dyhelper.beta.BetaNativeBridge.m1302()
        L23:
            p000.AbstractC0976x9.f12078 = r8
            android.content.Context r0 = p000.AbstractC0976x9.f12075
            if (r0 != 0) goto L2b
            goto Lf1
        L2b:
            java.lang.CharSequence r1 = p000.q02.m4660(r8)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r1.length()
            r4 = 0
            r5 = r4
        L3e:
            if (r5 >= r3) goto L58
            char r6 = r1.charAt(r5)
            boolean r7 = java.lang.Character.isLetterOrDigit(r6)
            if (r7 != 0) goto L52
            r7 = 95
            if (r6 == r7) goto L52
            r7 = 45
            if (r6 != r7) goto L55
        L52:
            r2.append(r6)
        L55:
            int r5 = r5 + 1
            goto L3e
        L58:
            java.lang.String r1 = r2.toString()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L64
            java.lang.String r1 = "unknown"
        L64:
            java.lang.String r2 = "dyhelper_beta_uid_"
            java.lang.String r1 = r2.concat(r1)
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r4)
            r0.getClass()
            java.lang.String r1 = "__beta_schema_version"
            int r2 = r0.getInt(r1, r4)
            r3 = 3
            if (r2 < r3) goto L7b
            goto La3
        L7b:
            android.content.SharedPreferences$Editor r2 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r2.clear()
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r3)
            java.lang.String r2 = "__beta_account_uid"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r8)
            r1.apply()
            android.content.SharedPreferences r1 = p000.AbstractC0976x9.f12076
            if (r1 == 0) goto La3
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto La3
            android.content.SharedPreferences$Editor r1 = r1.clear()
            if (r1 == 0) goto La3
            r1.apply()
        La3:
            p000.AbstractC0976x9.f12077 = r0
            java.lang.String r1 = "opaque_ticket"
            java.lang.String r2 = ""
            java.lang.String r3 = r0.getString(r1, r2)
            if (r3 != 0) goto Lb0
            goto Lb1
        Lb0:
            r2 = r3
        Lb1:
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto Lc6
            boolean r3 = com.example.dyhelper.beta.BetaNativeBridge.m1303(r8, r2)
            if (r3 == 0) goto Lc6
            r4 = 1
        Lc6:
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto Ld9
            if (r4 != 0) goto Ld9
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
        Ld9:
            java.lang.String r0 = " source="
            java.lang.String r1 = " restored="
            java.lang.String r2 = "beta account bound uid="
            java.lang.StringBuilder r8 = p000.lz1.m3695(r2, r8, r0, r9, r1)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            r9 = 4
            java.lang.String r0 = "r267d1c3d8cdbcdb7"
            r1 = 0
            p000.C0888ux.m5988(r0, r8, r1, r9, r1)
        Lf1:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m6534(java.lang.String r3, p000.a80 r4) {
            r3.getClass()
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            boolean r0 = p000.q02.m4671(r3)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L40
            java.lang.String r0 = "0"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1c
            goto L40
        L1c:
            java.util.Set r0 = p000.AbstractC0976x9.f12072
            boolean r0 = r0.add(r3)
            if (r0 != 0) goto L2f
            v9 r3 = new v9
            java.lang.String r0 = "checking..."
            r3.<init>(r2, r0, r1)
            r4.invoke(r3)
            return
        L2f:
            java.lang.Thread r0 = new java.lang.Thread
            w1 r1 = new w1
            r2 = 2
            r1.<init>(r4, r2, r3)
            java.lang.String r3 = "DY-Beta-Refresh"
            r0.<init>(r1, r3)
            r0.start()
            return
        L40:
            v9 r3 = new v9
            java.lang.String r0 = "UID invalid"
            r3.<init>(r2, r0, r1)
            r4.invoke(r3)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static p000.C0901v9 m6535(java.lang.String r9) {
            java.lang.String[] r0 = com.example.dyhelper.beta.BetaNativeBridge.m1296()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 2
            if (r1 >= r4) goto L12
            v9 r9 = new v9
            java.lang.String r0 = "native URL unavailable"
            r9.<init>(r3, r0, r2)
            return r9
        L12:
            r1 = r0[r3]
            java.lang.String r1 = m6536(r1)
            boolean r5 = p000.q02.m4671(r1)
            r6 = 1
            if (r5 != 0) goto L4b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L34
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r7 = "beta_users"
            org.json.JSONArray r5 = r5.optJSONArray(r7)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L2e
            r5 = r6
            goto L2f
        L2e:
            r5 = r3
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r5 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r5)
            r5 = r7
        L3b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r8 = r5 instanceof p000.eo1
            if (r8 == 0) goto L42
            r5 = r7
        L42:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4b
            goto L51
        L4b:
            r0 = r0[r6]
            java.lang.String r1 = m6536(r0)
        L51:
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto L5f
            v9 r9 = new v9
            java.lang.String r0 = "cannot connect server, please retry later"
            r9.<init>(r3, r0, r2)
            return r9
        L5f:
            android.os.Handler r0 = p000.C0753r9.f9291     // Catch: java.lang.Throwable -> L67
            p000.C0753r9.m5070(r1)     // Catch: java.lang.Throwable -> L67
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L67
            goto L6e
        L67:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L6e:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            r5 = 4
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getMessage()
            java.lang.String r7 = "notice parse/save failed: "
            java.lang.String r0 = p000.lz1.m3687(r7, r0)
            java.lang.String r7 = "r267d1c3d8cdbcdb7"
            p000.C0888ux.m5988(r7, r0, r2, r5, r2)
        L84:
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1299()
            if (r0 != 0) goto L92
            v9 r9 = new v9
            java.lang.String r0 = "native unavailable"
            r9.<init>(r3, r0, r2)
            return r9
        L92:
            java.lang.String r0 = com.example.dyhelper.beta.BetaNativeBridge.m1301(r9, r1)     // Catch: java.lang.Throwable -> La1
            char[] r1 = new char[r6]     // Catch: java.lang.Throwable -> La1
            r7 = 10
            r1[r3] = r7     // Catch: java.lang.Throwable -> La1
            java.util.List r0 = p000.q02.m4682(r0, r1, r5, r4)     // Catch: java.lang.Throwable -> La1
            goto La8
        La1:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        La8:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L15a
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = p000.AbstractC0984xh.m6640(r0)
            java.lang.String r5 = "1"
            boolean r1 = p000.ln0.m3626(r1, r5)
            java.lang.String r5 = "opaque_ticket"
            if (r1 == 0) goto L12c
            int r1 = r0.size()
            r7 = 3
            if (r1 >= r7) goto Lc6
            goto L12c
        Lc6:
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r4 = p000.q02.m4671(r0)
            if (r4 != 0) goto L121
            java.lang.String r4 = p000.AbstractC0976x9.f12078
            boolean r4 = p000.ln0.m3626(r9, r4)
            if (r4 != 0) goto Lf1
            goto L121
        Lf1:
            android.content.SharedPreferences r4 = p000.AbstractC0976x9.f12077
            if (r4 != 0) goto Lfd
            v9 r9 = new v9
            java.lang.String r0 = "preferences unavailable"
            r9.<init>(r3, r0, r2)
            return r9
        Lfd:
            android.content.SharedPreferences$Editor r2 = r4.edit()
            java.lang.String r3 = "__beta_schema_version"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r3, r7)
            java.lang.String r3 = "__beta_account_uid"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r9)
            android.content.SharedPreferences$Editor r0 = r2.putString(r5, r0)
            r0.apply()
            v9 r0 = new v9
            u9 r2 = new u9
            r2.<init>(r9, r1)
            java.lang.String r9 = "native verification passed"
            r0.<init>(r6, r9, r2)
            return r0
        L121:
            com.example.dyhelper.beta.BetaNativeBridge.m1302()
            v9 r9 = new v9
            java.lang.String r0 = "current account changed, please retry"
            r9.<init>(r3, r0, r2)
            return r9
        L12c:
            java.lang.String r1 = p000.AbstractC0976x9.f12078
            boolean r9 = p000.ln0.m3626(r9, r1)
            if (r9 == 0) goto L14a
            android.content.SharedPreferences r9 = p000.AbstractC0976x9.f12077
            if (r9 == 0) goto L147
            android.content.SharedPreferences$Editor r9 = r9.edit()
            if (r9 == 0) goto L147
            android.content.SharedPreferences$Editor r9 = r9.remove(r5)
            if (r9 == 0) goto L147
            r9.apply()
        L147:
            com.example.dyhelper.beta.BetaNativeBridge.m1302()
        L14a:
            v9 r9 = new v9
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r6, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L156
            java.lang.String r0 = "denied"
        L156:
            r9.<init>(r3, r0, r2)
            return r9
        L15a:
            v9 r9 = new v9
            java.lang.String r0 = "native refresh failed"
            r9.<init>(r3, r0, r2)
            return r9
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m6536(java.lang.String r4) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L14
            java.lang.String[] r4 = com.example.dyhelper.beta.BetaNativeBridge.m1296()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r4 = p000.AbstractC0312g7.m2250(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto L14
            r4 = r0
            goto L14
        L12:
            r4 = move-exception
            goto L3d
        L14:
            boolean r1 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L1b
            return r0
        L1b:
            t41 r1 = p000.C0963wx.f11880     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            l91 r3 = new l91     // Catch: java.lang.Throwable -> L12
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            java.util.Map r1 = p000.ex0.m1971(r3)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = p000.C0963wx.m6407(r4, r1)     // Catch: java.lang.Throwable -> L12
            java.lang.CharSequence r4 = p000.q02.m4660(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "\ufeff"
            java.lang.String r4 = p000.q02.m4678(r4, r1)     // Catch: java.lang.Throwable -> L12
            return r4
        L3d:
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "fetch beta list failed: "
            java.lang.String r4 = p000.lz1.m3687(r1, r4)
            r1 = 4
            java.lang.String r2 = "r267d1c3d8cdbcdb7"
            r3 = 0
            p000.C0888ux.m5988(r2, r4, r3, r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static void m6537(android.content.Context r7) {
            r7.getClass()
            android.content.Context r0 = r7.getApplicationContext()
            if (r0 != 0) goto La
            goto Lb
        La:
            r7 = r0
        Lb:
            p000.AbstractC0976x9.f12075 = r7
            boolean r0 = p000.ui1.m5867()
            r1 = 4
            java.lang.String r2 = "r267d1c3d8cdbcdb7"
            r3 = 0
            if (r0 != 0) goto L37
            p000.ui1.m5896(r7)     // Catch: java.lang.Throwable -> L1d
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L24:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "PrefsManager init failed: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
        L37:
            java.lang.String r0 = "dyhelper_beta"
            r4 = 0
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r0, r4)
            p000.AbstractC0976x9.f12076 = r0
            android.os.Handler r0 = p000.C0753r9.f9291
            p000.C0753r9.m5069(r7)
            boolean r7 = com.example.dyhelper.beta.BetaNativeBridge.m1299()
            java.lang.String r0 = p000.ui1.m5890()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r4 = p000.q02.m4671(r0)
            if (r4 == 0) goto L65
            java.lang.String r0 = p000.AbstractC0976x9.f12078
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
        L65:
            boolean r4 = p000.q02.m4671(r0)
            if (r4 != 0) goto L79
            java.lang.String r4 = "0"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L79
            java.lang.String r4 = "init"
            m6533(r0, r4)
            goto L7c
        L79:
            com.example.dyhelper.beta.BetaNativeBridge.m1302()
        L7c:
            java.lang.String r0 = p000.AbstractC0976x9.f12078
            w9 r4 = m6539()
            boolean r4 = r4.f11604
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "init uid="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " native="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r7 = " state="
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = r5.toString()
            p000.C0888ux.m5988(r2, r7, r3, r1, r3)
            return
    }

    /* JADX INFO: renamed from: π */
    public static boolean m6538() {
            java.lang.String r0 = p000.ui1.m5890()     // Catch: java.lang.Throwable -> Ld
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L14:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L1a
            java.lang.String r0 = ""
        L1a:
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L37
            java.lang.String r1 = "0"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L37
            java.lang.String r1 = p000.AbstractC0976x9.f12078
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L37
            java.lang.String r1 = "action-sync"
            m6533(r0, r1)
        L37:
            java.lang.String r0 = p000.AbstractC0976x9.f12078
            boolean r0 = p000.q02.m4671(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static p000.C0939w9 m6539() {
            r0 = 1
            java.lang.String r1 = com.example.dyhelper.beta.BetaNativeBridge.m1300()     // Catch: java.lang.Throwable -> L13
            char[] r2 = new char[r0]     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r4 = 10
            r2[r3] = r4     // Catch: java.lang.Throwable -> L13
            r3 = 3
            r4 = 2
            java.util.List r1 = p000.q02.m4682(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1a:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L20
            jz r1 = p000.C0450jz.f5672
        L20:
            java.util.List r1 = (java.util.List) r1
            w9 r2 = new w9
            java.lang.Object r3 = p000.AbstractC0984xh.m6640(r1)
            java.lang.String r4 = "1"
            boolean r3 = p000.ln0.m3626(r3, r4)
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L38
            java.lang.String r0 = ""
        L38:
            r2.<init>(r0, r3)
            return r2
    }
}
