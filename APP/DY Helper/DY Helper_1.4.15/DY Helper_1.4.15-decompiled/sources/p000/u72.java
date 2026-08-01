package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u72 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f10628 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f10629 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10630 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10631 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f10632 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10633 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicBoolean f10634 = null;

    /* JADX INFO: renamed from: θ */
    public static volatile android.content.Context f10635;

    /* JADX INFO: renamed from: ι */
    public static volatile android.app.Activity f10636;

    /* JADX INFO: renamed from: κ */
    public static volatile int f10637;

    static {
            java.lang.String r0 = "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/update.json"
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            p000.u72.f10628 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.u72.f10629 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.u72.f10630 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.u72.f10631 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.u72.f10632 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.u72.f10633 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.u72.f10634 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5792(boolean r13) {
            android.content.Context r0 = p000.u72.f10635
            if (r0 != 0) goto L5
            goto L5b
        L5:
            m5796(r0)
            r0 = 0
            r1 = 4
            java.lang.String r2 = "r5f3b6ae7236977e4"
            r3 = 0
            if (r13 != 0) goto L1d
            java.lang.String r4 = "version_update_check_enabled"
            boolean r4 = p000.ui1.m5887(r4, r0)
            if (r4 != 0) goto L1d
            java.lang.String r13 = "version update check disabled"
            p000.C0888ux.m5988(r2, r13, r3, r1, r3)
            return
        L1d:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "blacklist_update_checked_at"
            r7 = 0
            android.content.SharedPreferences r9 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2e
            long r9 = r9.getLong(r6, r7)     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r9 = r7
        L2f:
            if (r13 != 0) goto L60
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L60
            long r6 = r4 - r9
            r11 = 21600000(0x1499700, double:1.0671818E-316)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L60
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "skip update check by interval now="
            r13.<init>(r0)
            r13.append(r4)
            java.lang.String r0 = " last="
            r13.append(r0)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            p000.C0888ux.m5988(r2, r13, r3, r1, r3)
            android.app.Activity r13 = p000.u72.f10636
            if (r13 != 0) goto L5c
        L5b:
            return
        L5c:
            m5798(r13)
            return
        L60:
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.u72.f10631
            r5 = 1
            boolean r0 = r4.compareAndSet(r0, r5)
            if (r0 != 0) goto L6f
            java.lang.String r13 = "skip update check because another check is running"
            p000.C0888ux.m5988(r2, r13, r3, r1, r3)
            return
        L6f:
            java.lang.Thread r0 = new java.lang.Thread
            is r1 = new is
            r2 = 1
            r1.<init>(r2, r13)
            java.lang.String r13 = "DY-VersionUpdateCheck"
            r0.<init>(r1, r13)
            r0.start()
            return
    }

    /* JADX INFO: renamed from: β */
    public static android.net.Uri m5793(android.content.Context r6, p000.t72 r7, p000.C0391ic r8) {
            android.content.ContentResolver r6 = r6.getContentResolver()
            int r0 = r7.f10235
            java.lang.String r1 = "dyhelper_"
            java.lang.String r2 = ".apk"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
            java.lang.String r1 = "external_primary"
            android.net.Uri r1 = android.provider.MediaStore.Downloads.getContentUri(r1)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "_display_name"
            r2.put(r3, r0)
            java.lang.String r0 = "mime_type"
            java.lang.String r3 = "application/vnd.android.package-archive"
            r2.put(r0, r3)
            java.lang.String r0 = "relative_path"
            java.lang.String r3 = "Download/DYHelper"
            r2.put(r0, r3)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "is_pending"
            r2.put(r3, r0)
            android.net.Uri r0 = r6.insert(r1, r2)
            r1 = 0
            if (r0 == 0) goto L67
            java.util.List r2 = p000.s72.f9760     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.f10237     // Catch: java.lang.Throwable -> L62
            z61 r2 = new z61     // Catch: java.lang.Throwable -> L62
            r4 = 10
            r2.<init>(r6, r4, r0)     // Catch: java.lang.Throwable -> L62
            zd r4 = new zd     // Catch: java.lang.Throwable -> L62
            r5 = 3
            r4.<init>(r5, r8)     // Catch: java.lang.Throwable -> L62
            p000.s72.m5373(r7, r2, r4)     // Catch: java.lang.Throwable -> L62
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L62
            r7.put(r3, r8)     // Catch: java.lang.Throwable -> L62
            r6.update(r0, r7, r1, r1)     // Catch: java.lang.Throwable -> L62
            return r0
        L62:
            r7 = move-exception
            r6.delete(r0, r1, r1)     // Catch: java.lang.Throwable -> L66
        L66:
            throw r7
        L67:
            java.lang.String r6 = "无法创建下载文件"
            p000.C1080.m7279(r6)
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static p000.t72 m5794() {
            java.util.List r0 = p000.s72.f9760
            java.util.List r0 = p000.u72.f10628
            r1 = 3
            java.lang.String r0 = p000.s72.m5374(r1, r0)
            java.lang.String r1 = "r5f3b6ae7236977e4"
            r2 = 0
            r3 = 4
            p000.C0888ux.m5988(r1, r0, r2, r3, r2)
            boolean r4 = p000.q02.m4671(r0)
            if (r4 == 0) goto L17
            return r2
        L17:
            java.lang.String r4 = ""
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "latest"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L28
        L26:
            r6 = r2
            goto L71
        L28:
            java.lang.String r5 = "version_code"
            r6 = -1
            int r5 = r0.optInt(r5, r6)     // Catch: java.lang.Throwable -> L6b
            if (r5 > 0) goto L32
            goto L26
        L32:
            t72 r6 = new t72     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "version_name"
            java.lang.String r7 = r0.optString(r7, r4)     // Catch: java.lang.Throwable -> L6b
            r7.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.CharSequence r7 = p000.q02.m4660(r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = "download_url"
            java.lang.String r8 = r0.optString(r8, r4)     // Catch: java.lang.Throwable -> L6b
            r8.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.CharSequence r8 = p000.q02.m4660(r8)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r9 = "message"
            java.lang.String r0 = r0.optString(r9, r4)     // Catch: java.lang.Throwable -> L6b
            r0.getClass()     // Catch: java.lang.Throwable -> L6b
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r5, r7, r8, r0)     // Catch: java.lang.Throwable -> L6b
            goto L71
        L6b:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
        L71:
            boolean r0 = r6 instanceof p000.eo1
            if (r0 == 0) goto L76
            r6 = r2
        L76:
            t72 r6 = (p000.t72) r6
            if (r6 != 0) goto L80
            java.lang.String r0 = "update json invalid"
            p000.C0888ux.m5988(r1, r0, r2, r3, r2)
            return r2
        L80:
            int r0 = r6.f10235
            java.lang.String r4 = r6.f10237
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "update json parsed version="
            r5.<init>(r7)
            r5.append(r0)
            java.lang.String r0 = " url="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            p000.C0888ux.m5988(r1, r0, r2, r3, r2)
            return r6
    }

    /* JADX INFO: renamed from: δ */
    public static p000.t72 m5795() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto Ld
            android.content.Context r0 = p000.u72.f10635
            if (r0 == 0) goto Ld
            p000.ui1.m5896(r0)
        Ld:
            java.lang.String r0 = "blacklist_update_version_code"
            r1 = 0
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L18
            int r1 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L18
        L18:
            java.lang.String r0 = "blacklist_update_version_name"
            java.lang.String r2 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r2)
            java.lang.String r3 = "blacklist_update_url"
            java.lang.String r3 = p000.ui1.m5893(r3, r2)
            java.lang.String r4 = "blacklist_update_message"
            java.lang.String r2 = p000.ui1.m5893(r4, r2)
            if (r1 > 0) goto L30
            r0 = 0
            return r0
        L30:
            t72 r4 = new t72
            r4.<init>(r1, r0, r3, r2)
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static void m5796(android.content.Context r3) {
            r3.getClass()
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 != 0) goto La
            goto Lb
        La:
            r3 = r0
        Lb:
            p000.u72.f10635 = r3
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L37
            p000.ui1.m5896(r3)     // Catch: java.lang.Throwable -> L19
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L20:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L37
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "PrefsManager init failed: "
            java.lang.String r3 = p000.lz1.m3687(r0, r3)
            r0 = 4
            java.lang.String r1 = "r5f3b6ae7236977e4"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
        L37:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m5797(p000.t72 r5) {
            java.lang.Object r0 = p000.ui1.f10844
            int r0 = r5.f10235
            java.lang.String r1 = r5.f10236
            java.lang.String r2 = r5.f10237
            java.lang.String r5 = r5.f10238
            java.lang.String r3 = "blacklist_update_version_code"
            r1.getClass()
            r2.getClass()
            r5.getClass()
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r0 = r4.putInt(r3, r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "blacklist_update_version_name"
            java.lang.CharSequence r1 = p000.q02.m4660(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "blacklist_update_url"
            java.lang.CharSequence r2 = p000.q02.m4660(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "blacklist_update_message"
            java.lang.CharSequence r5 = p000.q02.m4660(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)     // Catch: java.lang.Throwable -> L52
            r5.apply()     // Catch: java.lang.Throwable -> L52
            p000.ui1.m5868(r3)     // Catch: java.lang.Throwable -> L52
            goto L64
        L52:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r0 = "saveBlacklistUpdateInfo failed: "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            r0 = 4
            java.lang.String r1 = "r24d5e64064e1c279"
            r2 = 0
            p000.C0888ux.m5988(r1, r5, r2, r0, r2)
        L64:
            java.lang.Object r5 = p000.ui1.f10844
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "blacklist_update_checked_at"
            p000.ui1.m5874(r0, r5)
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m5798(android.app.Activity r4) {
            t72 r0 = m5795()
            if (r0 != 0) goto L7
            goto Lf
        L7:
            java.lang.String r1 = r0.f10237
            int r2 = r0.f10235
            r3 = 60
            if (r2 > r3) goto L10
        Lf:
            return
        L10:
            java.lang.String r2 = "/releases/latest"
            r3 = 1
            boolean r2 = p000.q02.m4654(r1, r2, r3)
            if (r2 == 0) goto L2a
            java.lang.String r4 = "skip cached update prompt because download url is stale: "
            java.lang.String r4 = r4.concat(r1)
            r0 = 4
            java.lang.String r1 = "r5f3b6ae7236977e4"
            r2 = 0
            p000.C0888ux.m5988(r1, r4, r2, r0, r2)
            m5792(r3)
            return
        L2a:
            m5799(r0, r4)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m5799(p000.t72 r3, android.app.Activity r4) {
            int r0 = r3.f10235
            r1 = 60
            if (r0 > r1) goto L7
            goto L36
        L7:
            java.lang.String r0 = r3.f10237
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L10
            goto L36
        L10:
            java.lang.String r0 = "version_update_skipped_version_code"
            r1 = 0
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1b
            int r1 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L1b
        L1b:
            int r0 = r3.f10235
            if (r1 != r0) goto L2d
            java.lang.String r3 = "skip prompt for skipped version="
            java.lang.String r3 = p000.a12.m17(r3, r0)
            r4 = 4
            java.lang.String r0 = "r5f3b6ae7236977e4"
            r1 = 0
            p000.C0888ux.m5988(r0, r3, r1, r4, r1)
            return
        L2d:
            int r0 = p000.u72.f10637
            int r1 = r3.f10235
            if (r0 != r1) goto L34
            goto L36
        L34:
            if (r4 != 0) goto L37
        L36:
            return
        L37:
            android.os.Handler r0 = p000.u72.f10629
            ii0 r1 = new ii0
            r2 = 29
            r1.<init>(r4, r2, r3)
            r0.post(r1)
            return
    }
}
