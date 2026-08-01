package p000;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0753r9 {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f9291 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f9292 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f9293 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile android.content.Context f9294;

    /* JADX INFO: renamed from: ε */
    public static volatile android.content.SharedPreferences f9295;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.ref.WeakReference f9296;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.C0753r9.f9291 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0753r9.f9292 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0753r9.f9293 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5069(android.content.Context r2) {
            r2.getClass()
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto La
            goto Lb
        La:
            r2 = r0
        Lb:
            p000.C0753r9.f9294 = r2
            android.content.SharedPreferences r0 = p000.C0753r9.f9295
            if (r0 != 0) goto L1a
            java.lang.String r0 = "dyhelper_beta_notice"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            p000.C0753r9.f9295 = r2
        L1a:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m5070(java.lang.String r14) {
            java.lang.String r0 = ""
            java.lang.String r1 = "r62fe5deb53d30681"
            android.content.SharedPreferences r2 = p000.C0753r9.f9295     // Catch: java.lang.Throwable -> L91
            r3 = 0
            if (r2 == 0) goto La
            goto L15
        La:
            android.content.Context r2 = p000.C0753r9.f9294     // Catch: java.lang.Throwable -> L91
            if (r2 != 0) goto L10
            r2 = r3
            goto L15
        L10:
            m5069(r2)     // Catch: java.lang.Throwable -> L91
            android.content.SharedPreferences r2 = p000.C0753r9.f9295     // Catch: java.lang.Throwable -> L91
        L15:
            if (r2 != 0) goto L19
            goto L131
        L19:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L91
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L91
            java.lang.String r14 = "update_time"
            java.lang.String r14 = r4.optString(r14, r0)     // Catch: java.lang.Throwable -> L91
            r14.getClass()     // Catch: java.lang.Throwable -> L91
            java.lang.CharSequence r14 = p000.q02.m4660(r14)     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = r14.toString()     // Catch: java.lang.Throwable -> L91
            java.lang.String r14 = "notice"
            java.lang.String r14 = r4.optString(r14, r0)     // Catch: java.lang.Throwable -> L91
            r14.getClass()     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "\r\n"
            java.lang.String r4 = "\n"
            java.lang.String r14 = p000.x02.m6483(r14, r0, r4)     // Catch: java.lang.Throwable -> L91
            r0 = 13
            r4 = 10
            java.lang.String r14 = r14.replace(r0, r4)     // Catch: java.lang.Throwable -> L91
            r14.getClass()     // Catch: java.lang.Throwable -> L91
            java.lang.CharSequence r14 = p000.q02.m4660(r14)     // Catch: java.lang.Throwable -> L91
            java.lang.String r7 = r14.toString()     // Catch: java.lang.Throwable -> L91
            boolean r14 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L91
            r0 = 4
            if (r14 != 0) goto L132
            boolean r14 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L91
            if (r14 == 0) goto L62
            goto L132
        L62:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = m5072(r7)     // Catch: java.lang.Throwable -> L91
            java.util.List r14 = m5071(r2)     // Catch: java.lang.Throwable -> L91
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L91
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r14 = r4.iterator()     // Catch: java.lang.Throwable -> L91
            r5 = 0
            r11 = r5
        L79:
            boolean r12 = r14.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r12 == 0) goto L95
            java.lang.Object r12 = r14.next()     // Catch: java.lang.Throwable -> L91
            p9 r12 = (p000.C0679p9) r12     // Catch: java.lang.Throwable -> L91
            java.lang.String r12 = r12.f8457     // Catch: java.lang.Throwable -> L91
            boolean r12 = p000.ln0.m3626(r12, r6)     // Catch: java.lang.Throwable -> L91
            if (r12 == 0) goto L8e
            goto L96
        L8e:
            int r11 = r11 + 1
            goto L79
        L91:
            r0 = move-exception
            r14 = r0
            goto L138
        L95:
            r11 = -1
        L96:
            r14 = 1
            if (r11 < 0) goto Lb9
            java.lang.Object r12 = r4.get(r11)     // Catch: java.lang.Throwable -> L91
            p9 r12 = (p000.C0679p9) r12     // Catch: java.lang.Throwable -> L91
            java.lang.String r13 = r12.f8459     // Catch: java.lang.Throwable -> L91
            boolean r13 = p000.ln0.m3626(r13, r8)     // Catch: java.lang.Throwable -> L91
            if (r13 == 0) goto Laf
            java.lang.String r12 = r12.f8458     // Catch: java.lang.Throwable -> L91
            boolean r12 = p000.ln0.m3626(r12, r7)     // Catch: java.lang.Throwable -> L91
            if (r12 != 0) goto Lc2
        Laf:
            p9 r5 = new p9     // Catch: java.lang.Throwable -> L91
            r5.<init>(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L91
            r4.set(r11, r5)     // Catch: java.lang.Throwable -> L91
        Lb7:
            r5 = r14
            goto Lc2
        Lb9:
            p9 r5 = new p9     // Catch: java.lang.Throwable -> L91
            r5.<init>(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L91
            r4.add(r5)     // Catch: java.lang.Throwable -> L91
            goto Lb7
        Lc2:
            java.util.List r14 = m5074(r4)     // Catch: java.lang.Throwable -> L91
            r4 = 30
            java.util.List r14 = p000.AbstractC0984xh.m6662(r14, r4)     // Catch: java.lang.Throwable -> L91
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "latest_date"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r6)     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "latest_notice"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r7)     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "latest_hash"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r8)     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "latest_record_time"
            android.content.SharedPreferences$Editor r2 = r2.putLong(r4, r9)     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "history_json"
            java.lang.String r14 = m5075(r14)     // Catch: java.lang.Throwable -> L91
            android.content.SharedPreferences$Editor r14 = r2.putString(r4, r14)     // Catch: java.lang.Throwable -> L91
            r14.apply()     // Catch: java.lang.Throwable -> L91
            if (r5 == 0) goto L119
            r14 = 8
            java.lang.String r14 = p000.q02.m4693(r8, r14)     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r2.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "notice saved date="
            r2.append(r4)     // Catch: java.lang.Throwable -> L91
            r2.append(r6)     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = " hash="
            r2.append(r4)     // Catch: java.lang.Throwable -> L91
            r2.append(r14)     // Catch: java.lang.Throwable -> L91
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L91
            p000.C0888ux.m5988(r1, r14, r3, r0, r3)     // Catch: java.lang.Throwable -> L91
        L119:
            java.lang.ref.WeakReference r14 = p000.C0753r9.f9296     // Catch: java.lang.Throwable -> L91
            if (r14 == 0) goto L131
            java.lang.Object r14 = r14.get()     // Catch: java.lang.Throwable -> L91
            android.app.Activity r14 = (android.app.Activity) r14     // Catch: java.lang.Throwable -> L91
            if (r14 != 0) goto L126
            goto L131
        L126:
            android.os.Handler r0 = p000.C0753r9.f9291     // Catch: java.lang.Throwable -> L91
            n9 r2 = new n9     // Catch: java.lang.Throwable -> L91
            r3 = 1
            r2.<init>(r14, r3)     // Catch: java.lang.Throwable -> L91
            r0.post(r2)     // Catch: java.lang.Throwable -> L91
        L131:
            return
        L132:
            java.lang.String r14 = "notice ignored, date or content empty"
            p000.C0888ux.m5988(r1, r14, r3, r0, r3)     // Catch: java.lang.Throwable -> L91
            return
        L138:
            java.lang.String r0 = "handle notice failed"
            p000.C0888ux.m5977(r1, r0, r14)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.List m5071(android.content.SharedPreferences r12) {
            java.lang.String r0 = "[]"
            java.lang.String r1 = ""
            java.lang.String r2 = "history_json"
            java.lang.String r12 = r12.getString(r2, r0)     // Catch: java.lang.Throwable -> L88
            if (r12 != 0) goto Ld
            goto Le
        Ld:
            r0 = r12
        Le:
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L88
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L88
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L88
            r0.<init>()     // Catch: java.lang.Throwable -> L88
            int r2 = r12.length()     // Catch: java.lang.Throwable -> L88
            r3 = 0
        L1d:
            if (r3 >= r2) goto L83
            org.json.JSONObject r4 = r12.optJSONObject(r3)     // Catch: java.lang.Throwable -> L88
            if (r4 != 0) goto L26
            goto L80
        L26:
            java.lang.String r5 = "date"
            java.lang.String r5 = r4.optString(r5, r1)     // Catch: java.lang.Throwable -> L88
            r5.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.CharSequence r5 = p000.q02.m4660(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = "notice"
            java.lang.String r5 = r4.optString(r5, r1)     // Catch: java.lang.Throwable -> L88
            r5.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.CharSequence r5 = p000.q02.m4660(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = "hash"
            java.lang.String r5 = r4.optString(r5, r1)     // Catch: java.lang.Throwable -> L88
            r5.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.CharSequence r5 = p000.q02.m4660(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L88
            boolean r6 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L63
            java.lang.String r5 = m5072(r8)     // Catch: java.lang.Throwable -> L88
        L63:
            r9 = r5
            java.lang.String r5 = "record_time"
            r10 = 0
            long r10 = r4.optLong(r5, r10)     // Catch: java.lang.Throwable -> L88
            boolean r4 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L88
            if (r4 != 0) goto L80
            boolean r4 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L88
            if (r4 != 0) goto L80
            p9 r6 = new p9     // Catch: java.lang.Throwable -> L88
            r6.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L88
            r0.add(r6)     // Catch: java.lang.Throwable -> L88
        L80:
            int r3 = r3 + 1
            goto L1d
        L83:
            java.util.List r12 = m5074(r0)     // Catch: java.lang.Throwable -> L88
            return r12
        L88:
            jz r12 = p000.C0450jz.f5672
            return r12
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m5072(java.lang.String r3) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L21
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L21
            byte[] r1 = r3.getBytes(r1)     // Catch: java.lang.Throwable -> L21
            r1.getClass()     // Catch: java.lang.Throwable -> L21
            byte[] r0 = r0.digest(r1)     // Catch: java.lang.Throwable -> L21
            r0.getClass()     // Catch: java.lang.Throwable -> L21
            n7 r1 = new n7     // Catch: java.lang.Throwable -> L21
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = p000.AbstractC0312g7.m2255(r0, r1)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public static void m5073(android.app.Activity r11) {
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0753r9.f9293
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L1c
            android.os.Handler r0 = p000.C0753r9.f9291
            n9 r1 = new n9
            r2 = 0
            r1.<init>(r11, r2)
            r0.post(r1)
            return
        L1c:
            android.content.SharedPreferences r0 = p000.C0753r9.f9295
            if (r0 == 0) goto L21
            goto L26
        L21:
            m5069(r11)
            android.content.SharedPreferences r0 = p000.C0753r9.f9295
        L26:
            if (r0 != 0) goto L2a
            goto Lcf
        L2a:
            boolean r2 = r11.isFinishing()
            if (r2 == 0) goto L32
            goto Lcf
        L32:
            boolean r2 = r11.isDestroyed()
            if (r2 == 0) goto L3a
            goto Lcf
        L3a:
            java.lang.String r2 = "latest_date"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.getString(r2, r3)
            r4 = 0
            if (r2 == 0) goto L4e
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 != 0) goto L53
            r6 = r3
            goto L54
        L53:
            r6 = r2
        L54:
            java.lang.String r2 = "latest_notice"
            java.lang.String r2 = r0.getString(r2, r3)
            if (r2 == 0) goto L65
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L66
        L65:
            r2 = r4
        L66:
            if (r2 != 0) goto L6a
            r7 = r3
            goto L6b
        L6a:
            r7 = r2
        L6b:
            java.lang.String r2 = "latest_hash"
            java.lang.String r2 = r0.getString(r2, r3)
            if (r2 == 0) goto L7c
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L7d
        L7c:
            r2 = r4
        L7d:
            if (r2 != 0) goto L80
            goto L81
        L80:
            r3 = r2
        L81:
            boolean r2 = p000.q02.m4671(r3)
            if (r2 == 0) goto L8b
            java.lang.String r3 = m5072(r7)
        L8b:
            r8 = r3
            java.lang.String r2 = "latest_record_time"
            r9 = 0
            long r9 = r0.getLong(r2, r9)
            boolean r2 = p000.q02.m4671(r6)
            if (r2 != 0) goto La7
            boolean r2 = p000.q02.m4671(r7)
            if (r2 == 0) goto La1
            goto La7
        La1:
            p9 r5 = new p9
            r5.<init>(r6, r7, r8, r9)
            r4 = r5
        La7:
            if (r4 != 0) goto Laa
            goto Lcf
        Laa:
            java.lang.String r2 = r4.f8457
            boolean r3 = p000.q02.m4671(r2)
            r5 = 1
            if (r3 == 0) goto Lb5
            r3 = r5
            goto Lc5
        Lb5:
            nz r3 = p000.C0604nz.f7825
            java.lang.String r6 = "shown_dates"
            java.util.Set r6 = r0.getStringSet(r6, r3)
            if (r6 != 0) goto Lc0
            goto Lc1
        Lc0:
            r3 = r6
        Lc1:
            boolean r3 = r3.contains(r2)
        Lc5:
            if (r3 == 0) goto Lc8
            goto Lcf
        Lc8:
            r3 = 0
            boolean r5 = r1.compareAndSet(r3, r5)
            if (r5 != 0) goto Ld0
        Lcf:
            return
        Ld0:
            java.util.List r0 = m5071(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ldd:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lf6
            java.lang.Object r6 = r0.next()
            r7 = r6
            p9 r7 = (p000.C0679p9) r7
            java.lang.String r7 = r7.f8457
            boolean r7 = p000.ln0.m3626(r7, r2)
            if (r7 != 0) goto Ldd
            r5.add(r6)
            goto Ldd
        Lf6:
            η r0 = new η     // Catch: java.lang.Throwable -> L107
            r2 = 3
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L107
            o7 r2 = new o7     // Catch: java.lang.Throwable -> L107
            r6 = 8
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L107
            p000.pd2.m4474(r11, r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L107
            return
        L107:
            r0 = move-exception
            r11 = r0
            r1.set(r3)
            java.lang.String r0 = "r62fe5deb53d30681"
            java.lang.String r1 = "show notice dialog failed"
            p000.C0888ux.m5977(r0, r1, r11)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.List m5074(java.util.ArrayList r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r5.next()
            r3 = r2
            p9 r3 = (p000.C0679p9) r3
            java.lang.String r4 = r3.f8457
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto Le
            java.lang.String r3 = r3.f8458
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto Le
            r1.add(r2)
            goto Le
        L2f:
            o9 r5 = new o9
            r2 = 0
            r5.<init>(r2)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r1, r5)
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()
            p9 r1 = (p000.C0679p9) r1
            java.lang.String r2 = r1.f8457
            boolean r2 = r0.containsKey(r2)
            if (r2 != 0) goto L3d
            java.lang.String r2 = r1.f8457
            r0.put(r2, r1)
            goto L3d
        L57:
            java.util.Collection r5 = r0.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            o9 r0 = new o9
            r1 = 1
            r0.<init>(r1)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r5, r0)
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m5075(java.util.List r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r6.next()
            p9 r1 = (p000.C0679p9) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "date"
            java.lang.String r4 = r1.f8457
            r2.put(r3, r4)
            java.lang.String r3 = "notice"
            java.lang.String r4 = r1.f8458
            r2.put(r3, r4)
            java.lang.String r3 = "hash"
            java.lang.String r4 = r1.f8459
            r2.put(r3, r4)
            java.lang.String r3 = "record_time"
            long r4 = r1.f8460
            r2.put(r3, r4)
            r0.put(r2)
            goto L9
        L3a:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
    }
}
