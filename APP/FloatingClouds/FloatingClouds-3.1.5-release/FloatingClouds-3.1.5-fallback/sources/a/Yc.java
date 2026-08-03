package a;

/* JADX INFO: loaded from: classes.dex */
public final class Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f358a = null;
    public static volatile boolean b;
    public static volatile java.lang.String c;
    public static final java.util.concurrent.atomic.AtomicBoolean d = null;
    public static volatile android.content.SharedPreferences e;

    static {
            java.lang.String r0 = "https://raw.githubusercontent.com/mmjzmmww/FloatingClouds/main/kill_switch.json"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            a.Yc.f358a = r0
            java.lang.String r0 = ""
            a.Yc.c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            a.Yc.d = r0
            return
    }

    public static boolean a() {
            java.lang.String r0 = "fc-remote-killswitch"
            java.lang.String[] r1 = a.Yc.f358a
            r2 = 0
            r1 = r1[r2]
            java.lang.String r3 = " v=3.1.5) msg="
            java.lang.String r4 = "OK from "
            java.lang.String r5 = "HTTP "
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Exception -> L5b
            r6.<init>(r1)     // Catch: java.lang.Exception -> L5b
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.lang.Exception -> L5b
            java.lang.String r7 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            a.C0193i9.c(r6, r7)     // Catch: java.lang.Exception -> L5b
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Exception -> L5b
            r7 = 8000(0x1f40, float:1.121E-41)
            r6.setConnectTimeout(r7)     // Catch: java.lang.Throwable -> L5e
            r6.setReadTimeout(r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "Floatingclouds-KillSwitch"
            r6.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L5e
            r6.setUseCaches(r2)     // Catch: java.lang.Throwable -> L5e
            r7 = 1
            r6.setInstanceFollowRedirects(r7)     // Catch: java.lang.Throwable -> L5e
            int r8 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L5e
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L61
            int r3 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5e
            r4.append(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = " from "
            r4.append(r3)     // Catch: java.lang.Throwable -> L5e
            r4.append(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L5e
            r6.disconnect()     // Catch: java.lang.Exception -> L5b
            goto L109
        L5b:
            r3 = move-exception
            goto Lec
        L5e:
            r3 = move-exception
            goto Le8
        L61:
            java.io.InputStream r5 = r6.getInputStream()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "getInputStream(...)"
            a.C0193i9.d(r5, r8)     // Catch: java.lang.Throwable -> L5e
            java.nio.charset.Charset r8 = a.V2.f298a     // Catch: java.lang.Throwable -> L5e
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5e
            r9.<init>(r5, r8)     // Catch: java.lang.Throwable -> L5e
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5e
            r8 = 8192(0x2000, float:1.148E-41)
            r5.<init>(r9, r8)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = a.C0282n9.v(r5)     // Catch: java.lang.Throwable -> Le1
            r5.close()     // Catch: java.lang.Throwable -> L5e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "disabled"
            boolean r8 = r5.optBoolean(r8, r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r9 = "message"
            java.lang.String r10 = ""
            java.lang.String r9 = r5.optString(r9, r10)     // Catch: java.lang.Throwable -> L5e
            a.C0193i9.b(r9)     // Catch: java.lang.Throwable -> L5e
            a.mc r5 = c(r5, r8, r9)     // Catch: java.lang.Throwable -> L5e
            A r9 = r5.f578a     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L5e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L5e
            B r5 = r5.b     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L5e
            boolean r10 = a.Yc.b     // Catch: java.lang.Throwable -> L5e
            if (r9 != r10) goto Lb1
            java.lang.String r10 = a.Yc.c     // Catch: java.lang.Throwable -> L5e
            boolean r10 = a.C0193i9.a(r5, r10)     // Catch: java.lang.Throwable -> L5e
            if (r10 != 0) goto Lb8
        Lb1:
            a.Yc.b = r9     // Catch: java.lang.Throwable -> L5e
            a.Yc.c = r5     // Catch: java.lang.Throwable -> L5e
            b(r5, r9)     // Catch: java.lang.Throwable -> L5e
        Lb8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            r10.append(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = ": disabled="
            r10.append(r4)     // Catch: java.lang.Throwable -> L5e
            r10.append(r9)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = " (global="
            r10.append(r4)     // Catch: java.lang.Throwable -> L5e
            r10.append(r8)     // Catch: java.lang.Throwable -> L5e
            r10.append(r3)     // Catch: java.lang.Throwable -> L5e
            r10.append(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.i(r0, r3)     // Catch: java.lang.Throwable -> L5e
            r6.disconnect()     // Catch: java.lang.Exception -> L5b
            return r7
        Le1:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> Le3
        Le3:
            r4 = move-exception
            a.C0435w1.e(r5, r3)     // Catch: java.lang.Throwable -> L5e
            throw r4     // Catch: java.lang.Throwable -> L5e
        Le8:
            r6.disconnect()     // Catch: java.lang.Exception -> L5b
            throw r3     // Catch: java.lang.Exception -> L5b
        Lec:
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fetch failed from "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = ": "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            android.util.Log.w(r0, r1)
        L109:
            boolean r1 = a.Yc.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "all 1 mirrors failed (keep "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r0, r1)
            return r2
    }

    public static void b(java.lang.String r6, boolean r7) {
            java.lang.String r0 = "fc-remote-killswitch"
            java.lang.String r1 = "persisted disabled="
            android.content.SharedPreferences r2 = a.Yc.e
            if (r2 != 0) goto L9
            goto L54
        L9:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "remote_disabled"
            android.content.SharedPreferences$Editor r2 = r2.putBoolean(r3, r7)     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "remote_message"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r6)     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "last_fetch_ts"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3e
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r4)     // Catch: java.lang.Exception -> L3e
            r2.apply()     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L3e
            r2.append(r7)     // Catch: java.lang.Exception -> L3e
            java.lang.String r7 = " msg="
            r2.append(r7)     // Catch: java.lang.Exception -> L3e
            r2.append(r6)     // Catch: java.lang.Exception -> L3e
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L3e
            android.util.Log.i(r0, r6)     // Catch: java.lang.Exception -> L3e
            return
        L3e:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "persist failed: "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.w(r0, r6)
        L54:
            return
    }

    public static a.C0267mc c(org.json.JSONObject r2, boolean r3, java.lang.String r4) {
            if (r3 == 0) goto La
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            a.mc r3 = new a.mc
            r3.<init>(r2, r4)
            return r3
        La:
            java.lang.String r3 = "versions"
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            java.lang.String r3 = ""
            if (r2 == 0) goto L3b
            java.lang.String r0 = "3.1.5"
            org.json.JSONObject r2 = r2.optJSONObject(r0)
            if (r2 == 0) goto L3b
            java.lang.String r0 = "disabled"
            r1 = 0
            boolean r0 = r2.optBoolean(r0, r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "message"
            java.lang.String r2 = r2.optString(r0, r3)
            int r3 = r2.length()
            if (r3 != 0) goto L32
            goto L33
        L32:
            r4 = r2
        L33:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            a.mc r3 = new a.mc
            r3.<init>(r2, r4)
            return r3
        L3b:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            a.mc r4 = new a.mc
            r4.<init>(r2, r3)
            return r4
    }
}
