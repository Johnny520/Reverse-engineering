package com.example.dyhelper.beta;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class BlacklistVerifier {

    /* JADX INFO: renamed from: α */
    public static final com.example.dyhelper.beta.BlacklistVerifier f2226 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f2227 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Set f2228 = null;

    /* JADX INFO: renamed from: δ */
    public static final android.os.Handler f2229 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object f2230 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object f2231 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.Set f2232 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.concurrent.atomic.AtomicBoolean f2233 = null;

    /* JADX INFO: renamed from: ι */
    public static volatile android.content.Context f2234;

    /* JADX INFO: renamed from: κ */
    public static volatile java.lang.String f2235;

    /* JADX INFO: renamed from: λ */
    public static java.lang.ref.WeakReference f2236;

    /* JADX INFO: renamed from: μ */
    public static volatile boolean f2237;

    /* JADX INFO: renamed from: ν */
    public static volatile java.lang.String f2238;

    /* JADX INFO: renamed from: ξ */
    public static volatile boolean f2239;

    /* JADX INFO: renamed from: ο */
    public static volatile boolean f2240;

    /* JADX INFO: renamed from: π */
    public static volatile boolean f2241;

    /* JADX INFO: renamed from: ρ */
    public static volatile boolean f2242;

    /* JADX INFO: renamed from: σ */
    public static volatile boolean f2243;

    /* JADX INFO: renamed from: τ */
    public static volatile java.lang.String f2244;

    /* JADX INFO: renamed from: υ */
    public static volatile boolean f2245;

    /* JADX INFO: renamed from: φ */
    public static volatile java.lang.String f2246;

    static {
            com.example.dyhelper.beta.BlacklistVerifier r0 = new com.example.dyhelper.beta.BlacklistVerifier
            r0.<init>()
            com.example.dyhelper.beta.BlacklistVerifier.f2226 = r0
            java.lang.String r0 = "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/blacklist_users.json"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            com.example.dyhelper.beta.BlacklistVerifier.f2227 = r0
            java.lang.String r5 = "native parse failed"
            java.lang.String r6 = "java parse failed"
            java.lang.String r1 = "verification abnormal"
            java.lang.String r2 = "verification_pending"
            java.lang.String r3 = "runtime_untrusted"
            java.lang.String r4 = "native unavailable"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            com.example.dyhelper.beta.BlacklistVerifier.f2228 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.example.dyhelper.beta.BlacklistVerifier.f2229 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.example.dyhelper.beta.BlacklistVerifier.f2230 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.example.dyhelper.beta.BlacklistVerifier.f2231 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            com.example.dyhelper.beta.BlacklistVerifier.f2232 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.beta.BlacklistVerifier.f2233 = r0
            java.lang.String r0 = ""
            com.example.dyhelper.beta.BlacklistVerifier.f2235 = r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            com.example.dyhelper.beta.BlacklistVerifier.f2236 = r1
            com.example.dyhelper.beta.BlacklistVerifier.f2238 = r0
            com.example.dyhelper.beta.BlacklistVerifier.f2244 = r0
            com.example.dyhelper.beta.BlacklistVerifier.f2246 = r0
            return
    }

    private final native java.lang.String nativeCheckUidInBlacklist(java.lang.String r1, java.lang.String r2);

    private final native java.lang.String nativeGetReason();

    private final native boolean nativeIsBlocked();

    private final native void nativeSetBlocked(boolean r1, java.lang.String r2);

    private final native void nativeStartBlockEnforcer(long r1);

    /* JADX INFO: renamed from: γ */
    public static boolean m1304() {
            java.lang.String r0 = "native library load failed: "
            boolean r1 = com.example.dyhelper.beta.BlacklistVerifier.f2242
            r2 = 1
            if (r1 == 0) goto L8
            return r2
        L8:
            java.lang.Object r1 = com.example.dyhelper.beta.BlacklistVerifier.f2230
            monitor-enter(r1)
            boolean r3 = com.example.dyhelper.beta.BlacklistVerifier.f2242     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L10
            goto L3c
        L10:
            boolean r3 = com.example.dyhelper.beta.BlacklistVerifier.f2241     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            if (r3 == 0) goto L17
            r2 = r4
            goto L3c
        L17:
            com.example.dyhelper.beta.BlacklistVerifier.f2241 = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "blacklist_verify"
            java.lang.System.loadLibrary(r3)     // Catch: java.lang.Throwable -> L1f
            goto L38
        L1f:
            r2 = move-exception
            java.lang.String r3 = "rc2b948eb05c3593c"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            r5.append(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            r2 = 4
            r5 = 0
            p000.C0888ux.m5988(r3, r0, r5, r2, r5)     // Catch: java.lang.Throwable -> L3e
            r2 = r4
        L38:
            com.example.dyhelper.beta.BlacklistVerifier.f2242 = r2     // Catch: java.lang.Throwable -> L3e
            boolean r2 = com.example.dyhelper.beta.BlacklistVerifier.f2242     // Catch: java.lang.Throwable -> L3e
        L3c:
            monitor-exit(r1)
            return r2
        L3e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: η */
    public static void m1305() {
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = com.example.dyhelper.beta.BlacklistVerifier.f2233
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            s0 r0 = new s0
            r1 = 2
            r0.<init>(r1)
            android.os.Handler r1 = com.example.dyhelper.beta.BlacklistVerifier.f2229
            r1.post(r0)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m1306(java.lang.String r2) {
            java.lang.String r0 = "<boolean\\s+name=\"blocked\"\\s+value=\"(true|false)\"\\s*/>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r2)
            r0.getClass()
            r1 = 0
            ix0 r2 = p000.v71.m6032(r0, r1, r2)
            if (r2 == 0) goto L42
            java.util.List r2 = r2.m2824()
            r0 = 1
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L42
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2f
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L3b
        L2f:
            java.lang.String r0 = "false"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L3a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L3b
        L3a:
            r2 = 0
        L3b:
            if (r2 == 0) goto L42
            boolean r2 = r2.booleanValue()
            return r2
        L42:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.String m1307(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<string\\s+name=\""
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "\">(.*?)</string>"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 32
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r0)
            r3.getClass()
            java.util.regex.Matcher r3 = r3.matcher(r2)
            r3.getClass()
            r0 = 0
            ix0 r2 = p000.v71.m6032(r3, r0, r2)
            if (r2 == 0) goto L68
            java.util.List r2 = r2.m2824()
            r3 = 1
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r3, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L68
            java.lang.String r3 = "&lt;"
            java.lang.String r0 = "<"
            java.lang.String r2 = p000.x02.m6483(r2, r3, r0)
            java.lang.String r3 = "&gt;"
            java.lang.String r0 = ">"
            java.lang.String r2 = p000.x02.m6483(r2, r3, r0)
            java.lang.String r3 = "&amp;"
            java.lang.String r0 = "&"
            java.lang.String r2 = p000.x02.m6483(r2, r3, r0)
            java.lang.String r3 = "&quot;"
            java.lang.String r0 = "\""
            java.lang.String r2 = p000.x02.m6483(r2, r3, r0)
            java.lang.String r3 = "&apos;"
            java.lang.String r0 = "'"
            java.lang.String r2 = p000.x02.m6483(r2, r3, r0)
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 != 0) goto L6d
            java.lang.String r2 = ""
        L6d:
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final void m1308(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "native block enforcer armed source="
            boolean r1 = m1304()
            if (r1 != 0) goto L9
            goto L6c
        L9:
            java.lang.Object r1 = com.example.dyhelper.beta.BlacklistVerifier.f2231
            monitor-enter(r1)
            boolean r2 = com.example.dyhelper.beta.BlacklistVerifier.f2243     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L12
            monitor-exit(r1)
            return
        L12:
            r2 = 1
            com.example.dyhelper.beta.BlacklistVerifier.f2243 = r2     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r1)
            r1 = 4
            r3 = 0
            java.lang.String r4 = com.example.dyhelper.beta.BlacklistVerifier.f2238     // Catch: java.lang.Throwable -> L23
            boolean r5 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            java.lang.String r4 = "blocked"
            goto L25
        L23:
            r6 = move-exception
            goto L46
        L25:
            r6.nativeSetBlocked(r2, r4)     // Catch: java.lang.Throwable -> L23
            r4 = 5000(0x1388, double:2.4703E-320)
            r6.nativeStartBlockEnforcer(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = "rc2b948eb05c3593c"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L23
            r2.append(r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = " delay=5000"
            r2.append(r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L23
            p000.C0888ux.m5988(r6, r7, r3, r1, r3)     // Catch: java.lang.Throwable -> L23
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L23
            goto L4c
        L46:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L4c:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L6c
            java.lang.Object r7 = com.example.dyhelper.beta.BlacklistVerifier.f2231
            monitor-enter(r7)
            r0 = 0
            com.example.dyhelper.beta.BlacklistVerifier.f2243 = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)
            java.lang.String r7 = "rc2b948eb05c3593c"
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "arm native enforcer failed: "
            java.lang.String r6 = p000.lz1.m3687(r0, r6)
            p000.C0888ux.m5988(r7, r6, r3, r1, r3)
            goto L6c
        L69:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L6c:
            return
        L6d:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
    }

    /* JADX INFO: renamed from: β */
    public final p000.C0278fa m1309(java.lang.String r12) {
            r11 = this;
            java.util.List r0 = p000.s72.f9760
            java.util.List r0 = com.example.dyhelper.beta.BlacklistVerifier.f2227
            r1 = 10
            java.lang.String r0 = p000.s72.m5374(r1, r0)
            boolean r2 = p000.q02.m4671(r0)
            r3 = 1
            r4 = 4
            java.lang.String r5 = "rc2b948eb05c3593c"
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L43
            java.lang.String r11 = "blacklist json unavailable, keep current state"
            p000.C0888ux.m5988(r5, r11, r6, r4, r6)
            boolean r11 = com.example.dyhelper.beta.BlacklistVerifier.f2237
            java.lang.String r12 = com.example.dyhelper.beta.BlacklistVerifier.f2238
            if (r11 == 0) goto L32
            java.util.Set r11 = com.example.dyhelper.beta.BlacklistVerifier.f2228
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r12 = r12.toString()
            boolean r11 = r11.contains(r12)
            if (r11 != 0) goto L32
            goto L33
        L32:
            r3 = r7
        L33:
            java.lang.String r11 = com.example.dyhelper.beta.BlacklistVerifier.f2238
            boolean r12 = p000.q02.m4671(r11)
            if (r12 == 0) goto L3d
            java.lang.String r11 = "network unavailable"
        L3d:
            fa r12 = new fa
            r12.<init>(r11, r3, r7)
            return r12
        L43:
            boolean r2 = m1304()
            java.lang.String r8 = ""
            java.lang.String r9 = "native unavailable"
            if (r2 != 0) goto L54
            fa r11 = new fa
            r11.<init>(r9, r7, r7)
            goto Led
        L54:
            java.lang.CharSequence r2 = p000.q02.m4660(r12)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = r11.nativeCheckUidInBlacklist(r2, r0)     // Catch: java.lang.Throwable -> L92
            char[] r2 = new char[r3]     // Catch: java.lang.Throwable -> L92
            r2[r7] = r1     // Catch: java.lang.Throwable -> L92
            r1 = 3
            r10 = 2
            java.util.List r11 = p000.q02.m4682(r11, r2, r1, r10)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = p000.AbstractC0984xh.m6640(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = "1"
            boolean r2 = p000.ln0.m3626(r1, r2)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L9b
            java.lang.Object r11 = p000.AbstractC0984xh.m6641(r3, r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L81
            r11 = r8
        L81:
            java.lang.CharSequence r11 = p000.q02.m4660(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L92
            boolean r1 = p000.q02.m4671(r11)     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L94
            java.lang.String r11 = "blocked"
            goto L94
        L92:
            r11 = move-exception
            goto Ld9
        L94:
            fa r1 = new fa     // Catch: java.lang.Throwable -> L92
            r1.<init>(r11, r3, r3)     // Catch: java.lang.Throwable -> L92
        L99:
            r11 = r1
            goto Led
        L9b:
            java.lang.String r2 = "0"
            boolean r1 = p000.ln0.m3626(r1, r2)     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto Lba
            fa r1 = new fa     // Catch: java.lang.Throwable -> L92
            java.lang.Object r11 = p000.AbstractC0984xh.m6641(r3, r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto Lae
            r11 = r8
        Lae:
            java.lang.CharSequence r11 = p000.q02.m4660(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L92
            r1.<init>(r11, r7, r3)     // Catch: java.lang.Throwable -> L92
            goto L99
        Lba:
            java.lang.Object r11 = p000.AbstractC0984xh.m6641(r3, r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto Lc3
            r11 = r8
        Lc3:
            java.lang.CharSequence r11 = p000.q02.m4660(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L92
            boolean r1 = p000.q02.m4671(r11)     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto Ld2
            goto Ld3
        Ld2:
            r9 = r11
        Ld3:
            fa r11 = new fa     // Catch: java.lang.Throwable -> L92
            r11.<init>(r9, r7, r7)     // Catch: java.lang.Throwable -> L92
            goto Led
        Ld9:
            java.lang.String r11 = r11.getMessage()
            java.lang.String r1 = "native blacklist parse failed: "
            java.lang.String r11 = p000.lz1.m3687(r1, r11)
            p000.C0888ux.m5988(r5, r11, r6, r4, r6)
            fa r11 = new fa
            java.lang.String r1 = "native parse failed"
            r11.<init>(r1, r7, r7)
        Led:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L100
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L100
            java.lang.String r0 = "blacklist_users"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: java.lang.Throwable -> L100
            if (r0 != 0) goto L102
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L100
            r0.<init>()     // Catch: java.lang.Throwable -> L100
            goto L102
        L100:
            r12 = move-exception
            goto L157
        L102:
            java.lang.CharSequence r12 = p000.q02.m4660(r12)     // Catch: java.lang.Throwable -> L100
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L100
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L100
            r2 = r7
        L10f:
            if (r2 >= r1) goto L14f
            org.json.JSONObject r9 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L100
            if (r9 != 0) goto L118
            goto L14c
        L118:
            java.lang.String r10 = "uid"
            java.lang.String r10 = r9.optString(r10, r8)     // Catch: java.lang.Throwable -> L100
            r10.getClass()     // Catch: java.lang.Throwable -> L100
            java.lang.CharSequence r10 = p000.q02.m4660(r10)     // Catch: java.lang.Throwable -> L100
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L100
            boolean r10 = p000.ln0.m3626(r10, r12)     // Catch: java.lang.Throwable -> L100
            if (r10 == 0) goto L14c
            java.lang.String r12 = "enabled"
            boolean r12 = r9.optBoolean(r12, r3)     // Catch: java.lang.Throwable -> L100
            fa r0 = new fa     // Catch: java.lang.Throwable -> L100
            java.lang.String r1 = "reason"
            java.lang.String r1 = r9.optString(r1, r8)     // Catch: java.lang.Throwable -> L100
            r1.getClass()     // Catch: java.lang.Throwable -> L100
            java.lang.CharSequence r1 = p000.q02.m4660(r1)     // Catch: java.lang.Throwable -> L100
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L100
            r0.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L100
            goto L16b
        L14c:
            int r2 = r2 + 1
            goto L10f
        L14f:
            fa r0 = new fa     // Catch: java.lang.Throwable -> L100
            java.lang.String r12 = "not_found"
            r0.<init>(r12, r7, r3)     // Catch: java.lang.Throwable -> L100
            goto L16b
        L157:
            java.lang.String r12 = r12.getMessage()
            java.lang.String r0 = "java blacklist parse failed: "
            java.lang.String r12 = p000.lz1.m3687(r0, r12)
            p000.C0888ux.m5988(r5, r12, r6, r4, r6)
            fa r0 = new fa
            java.lang.String r12 = "java parse failed"
            r0.<init>(r12, r7, r7)
        L16b:
            boolean r12 = r0.f3835
            java.lang.String r1 = "verification_pending"
            if (r12 == 0) goto L19b
            boolean r12 = r11.f3835
            if (r12 != 0) goto L176
            goto L19b
        L176:
            boolean r12 = r0.f3833
            boolean r0 = r11.f3833
            if (r12 == r0) goto L19a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "java/native blacklist mismatch java="
            r11.<init>(r2)
            r11.append(r12)
            java.lang.String r12 = " native="
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p000.C0888ux.m5988(r5, r11, r6, r4, r6)
            fa r11 = new fa
            r11.<init>(r1, r7, r7)
        L19a:
            return r11
        L19b:
            fa r11 = new fa
            r11.<init>(r1, r7, r7)
            return r11
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.String m1310() {
            r2 = this;
            boolean r0 = m1304()
            java.lang.String r1 = ""
            if (r0 == 0) goto L1c
            java.lang.String r2 = r2.nativeGetReason()     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L14:
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            java.lang.String r1 = (java.lang.String) r1
        L1c:
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L24
            java.lang.String r1 = com.example.dyhelper.beta.BlacklistVerifier.f2238
        L24:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final void m1311(android.content.Context r12) {
            r11 = this;
            android.content.Context r0 = r12.getApplicationContext()
            if (r0 != 0) goto L7
            goto L8
        L7:
            r12 = r0
        L8:
            com.example.dyhelper.beta.BlacklistVerifier.f2234 = r12
            boolean r0 = p000.ui1.m5867()
            r1 = 4
            r2 = 0
            if (r0 != 0) goto L34
            p000.ui1.m5896(r12)     // Catch: java.lang.Throwable -> L18
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L1f:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L34
            java.lang.String r3 = "rc2b948eb05c3593c"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "PrefsManager init failed: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            p000.C0888ux.m5988(r3, r0, r2, r1, r2)
        L34:
            java.lang.String r0 = "rc2b948eb05c3593c"
            java.lang.String r3 = ""
            java.lang.String r4 = "migrated legacy blacklist cache uid="
            java.lang.String r5 = "__dyhelper_blacklist_legacy_migrated"
            r6 = 0
            boolean r7 = p000.ui1.m5887(r5, r6)
            r8 = 1
            if (r7 == 0) goto L46
            goto Ld6
        L46:
            java.lang.String r7 = "dyhelper_blacklist"
            android.content.SharedPreferences r7 = r12.getSharedPreferences(r7, r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = "uid"
            java.lang.String r9 = r7.getString(r9, r3)     // Catch: java.lang.Throwable -> L5d
            if (r9 == 0) goto L5f
            java.lang.CharSequence r9 = p000.q02.m4660(r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r3 = move-exception
            goto Lbd
        L5f:
            r9 = r2
        L60:
            if (r9 != 0) goto L63
            r9 = r3
        L63:
            java.lang.String r10 = "blocked"
            boolean r6 = r7.getBoolean(r10, r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = "reason"
            java.lang.String r7 = r7.getString(r10, r3)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L7a
            java.lang.CharSequence r7 = p000.q02.m4660(r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5d
            goto L7b
        L7a:
            r7 = r2
        L7b:
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            r3 = r7
        L7f:
            boolean r7 = p000.q02.m4671(r9)     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto Lb7
            java.lang.String r7 = p000.ui1.m5890()     // Catch: java.lang.Throwable -> L5d
            java.lang.CharSequence r7 = p000.q02.m4660(r7)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5d
            boolean r10 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L5d
            if (r10 != 0) goto L9d
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto Lb7
        L9d:
            p000.ui1.m5878(r9, r3, r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            r3.append(r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = " blocked="
            r3.append(r4)     // Catch: java.lang.Throwable -> L5d
            r3.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5d
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L5d
        Lb7:
            p000.ui1.m5871(r5, r8)     // Catch: java.lang.Throwable -> L5d
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5d
            goto Lc3
        Lbd:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        Lc3:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto Ld6
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "legacy blacklist cache migration failed: "
            java.lang.String r3 = p000.lz1.m3687(r4, r3)
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)
        Ld6:
            java.lang.Object r0 = com.example.dyhelper.beta.BlacklistVerifier.f2231
            monitor-enter(r0)
            boolean r1 = com.example.dyhelper.beta.BlacklistVerifier.f2239     // Catch: java.lang.Throwable -> Lfa
            if (r1 != 0) goto Lfc
            com.example.dyhelper.beta.BlacklistVerifier.f2239 = r8     // Catch: java.lang.Throwable -> Lfa
            boolean r1 = com.example.dyhelper.beta.BlacklistVerifier.f2240     // Catch: java.lang.Throwable -> Lfa
            if (r1 == 0) goto Le4
            goto Lfc
        Le4:
            boolean r1 = r12 instanceof android.app.Application     // Catch: java.lang.Throwable -> Lfa
            if (r1 == 0) goto Leb
            r2 = r12
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> Lfa
        Leb:
            if (r2 != 0) goto Lee
            goto Lfc
        Lee:
            com.example.dyhelper.beta.BlacklistVerifier.f2240 = r8     // Catch: java.lang.Throwable -> Lfa
            q9 r12 = new q9     // Catch: java.lang.Throwable -> Lfa
            r1 = 1
            r12.<init>(r1)     // Catch: java.lang.Throwable -> Lfa
            r2.registerActivityLifecycleCallbacks(r12)     // Catch: java.lang.Throwable -> Lfa
            goto Lfc
        Lfa:
            r11 = move-exception
            goto L106
        Lfc:
            monitor-exit(r0)
            java.lang.String r12 = "init"
            r11.m1313(r12)
            m1304()
            return
        L106:
            monitor-exit(r0)
            throw r11
    }

    /* JADX INFO: renamed from: ζ */
    public final boolean m1312() {
            r6 = this;
            boolean r0 = com.example.dyhelper.beta.BlacklistVerifier.f2237
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L13
            android.content.Context r0 = com.example.dyhelper.beta.BlacklistVerifier.f2234
            if (r0 == 0) goto L13
            p000.ui1.m5896(r0)
        L13:
            boolean r0 = p000.ui1.m5867()
            r2 = 0
            if (r0 == 0) goto L52
            java.lang.String r0 = "blacklist_blocked"
            boolean r0 = p000.ui1.m5887(r0, r2)
            java.lang.String r3 = "blacklist_uid"
            java.lang.String r4 = ""
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "blacklist_reason"
            java.lang.String r4 = p000.ui1.m5893(r5, r4)
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            if (r0 == 0) goto L52
            boolean r0 = p000.q02.m4671(r3)
            if (r0 != 0) goto L52
            com.example.dyhelper.beta.BlacklistVerifier.f2237 = r1
            com.example.dyhelper.beta.BlacklistVerifier.f2238 = r4
            com.example.dyhelper.beta.BlacklistVerifier.f2235 = r3
            java.lang.String r0 = "isBlocked"
            r6.m1314(r4, r0, r1)
            return r1
        L52:
            boolean r0 = m1304()
            if (r0 == 0) goto L76
            boolean r6 = r6.nativeIsBlocked()     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L61
            goto L68
        L61:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L68:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r6 instanceof p000.eo1
            if (r1 == 0) goto L6f
            r6 = r0
        L6f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L76:
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public final void m1313(java.lang.String r9) {
            r8 = this;
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "blacklist_uid"
            java.lang.String r1 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "blacklist_blocked"
            r3 = 0
            boolean r2 = p000.ui1.m5887(r2, r3)
            java.lang.String r4 = "blacklist_reason"
            java.lang.String r4 = p000.ui1.m5893(r4, r1)
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            if (r2 == 0) goto L50
            if (r2 == 0) goto L41
            java.util.Set r5 = com.example.dyhelper.beta.BlacklistVerifier.f2228
            java.lang.CharSequence r6 = p000.q02.m4660(r4)
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L41
            goto L50
        L41:
            java.lang.String r4 = "verification_pending"
            p000.ui1.m5878(r0, r4, r3)
            java.lang.String r2 = "cleared legacy non-authoritative blacklist cache reason=verification_pending"
            r5 = 4
            java.lang.String r6 = "rc2b948eb05c3593c"
            r7 = 0
            p000.C0888ux.m5988(r6, r2, r7, r5, r7)
            r2 = r3
        L50:
            boolean r5 = p000.q02.m4671(r0)
            if (r5 != 0) goto L58
            com.example.dyhelper.beta.BlacklistVerifier.f2235 = r0
        L58:
            com.example.dyhelper.beta.BlacklistVerifier.f2237 = r2
            com.example.dyhelper.beta.BlacklistVerifier.f2238 = r4
            if (r2 == 0) goto L66
            r0 = 1
            r8.m1314(r4, r9, r0)
            m1305()
            return
        L66:
            r8.m1314(r1, r9, r3)
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m1314(java.lang.String r5, java.lang.String r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "same-state:"
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = com.example.dyhelper.beta.BlacklistVerifier.f2235
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = com.example.dyhelper.beta.BlacklistVerifier.f2231
            monitor-enter(r2)
            java.lang.String r3 = com.example.dyhelper.beta.BlacklistVerifier.f2244     // Catch: java.lang.Throwable -> L3b
            boolean r3 = p000.ln0.m3626(r3, r1)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3f
            boolean r3 = com.example.dyhelper.beta.BlacklistVerifier.f2245     // Catch: java.lang.Throwable -> L3b
            if (r3 != r7) goto L3f
            java.lang.String r3 = com.example.dyhelper.beta.BlacklistVerifier.f2246     // Catch: java.lang.Throwable -> L3b
            boolean r3 = p000.ln0.m3626(r3, r5)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3f
            if (r7 == 0) goto L3d
            boolean r4 = com.example.dyhelper.beta.BlacklistVerifier.f2243     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L3d
            com.example.dyhelper.beta.BlacklistVerifier r4 = com.example.dyhelper.beta.BlacklistVerifier.f2226     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r0.concat(r6)     // Catch: java.lang.Throwable -> L3b
            r4.m1308(r5)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r4 = move-exception
            goto L78
        L3d:
            monitor-exit(r2)
            return
        L3f:
            com.example.dyhelper.beta.BlacklistVerifier.f2244 = r1     // Catch: java.lang.Throwable -> L3b
            com.example.dyhelper.beta.BlacklistVerifier.f2245 = r7     // Catch: java.lang.Throwable -> L3b
            com.example.dyhelper.beta.BlacklistVerifier.f2246 = r5     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            boolean r0 = m1304()
            if (r0 != 0) goto L4d
            goto L77
        L4d:
            if (r7 == 0) goto L77
            r7 = 1
            r4.nativeSetBlocked(r7, r5)     // Catch: java.lang.Throwable -> L56
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r5 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r5)
            r5 = r7
        L5d:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L74
            java.lang.String r7 = "rc2b948eb05c3593c"
            java.lang.String r5 = r5.getMessage()
            java.lang.String r0 = "nativeSetBlocked(true) failed: "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            r0 = 4
            r1 = 0
            p000.C0888ux.m5988(r7, r5, r1, r0, r1)
        L74:
            r4.m1308(r6)
        L77:
            return
        L78:
            monitor-exit(r2)
            throw r4
    }
}
