package p000;

/* JADX INFO: renamed from: jx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0448jx {

    /* JADX INFO: renamed from: α */
    public final android.content.SharedPreferences f5616;

    static {
            return
    }

    public C0448jx(android.content.Context r2, int r3) {
            r1 = this;
            switch(r3) {
                case 1: goto L13;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.lang.String r3 = "dyhelper_dexkit_cache"
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            r2.getClass()
            r1.f5616 = r2
            return
        L13:
            r1.<init>()
            android.content.Context r3 = r2.getApplicationContext()
            if (r3 != 0) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            java.lang.String r3 = "xhshelper_dexkit_cache"
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            r2.getClass()
            r1.f5616 = r2
            return
    }

    /* JADX INFO: renamed from: ι */
    public static android.content.SharedPreferences.Editor m3000(android.content.SharedPreferences.Editor r3, p000.C0703px r4) {
            java.lang.String r0 = "__schema"
            r1 = 5
            android.content.SharedPreferences$Editor r3 = r3.putInt(r0, r1)
            java.lang.String r0 = "__host_package"
            java.lang.String r1 = r4.f8750
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r1)
            java.lang.String r0 = "__host_version_code"
            long r1 = r4.f8751
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r1)
            java.lang.String r0 = "__host_version_name"
            java.lang.String r1 = r4.f8752
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r1)
            java.lang.String r0 = "__host_source_dir"
            java.lang.String r1 = r4.f8753
            android.content.SharedPreferences$Editor r3 = r3.putString(r0, r1)
            java.lang.String r0 = "__host_last_update_time"
            long r1 = r4.f8754
            android.content.SharedPreferences$Editor r3 = r3.putLong(r0, r1)
            java.lang.String r4 = "__module_version_code"
            r0 = 60
            android.content.SharedPreferences$Editor r3 = r3.putLong(r4, r0)
            java.lang.String r4 = "__module_version_name"
            java.lang.String r0 = "1.4.15"
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r0)
            r3.getClass()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public synchronized void m3001(p000.C0703px r4) {
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r3.m3006(r4)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto Lc
            monitor-exit(r3)
            return
        Lc:
            android.content.SharedPreferences r0 = r3.f5616     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$Editor r4 = m3000(r0, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "__meta_written_at"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            android.content.SharedPreferences$Editor r4 = r4.putLong(r0, r1)     // Catch: java.lang.Throwable -> L2c
            r4.commit()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    /* JADX INFO: renamed from: β */
    public synchronized void m3002(p000.nd2 r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.m3007(r5)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L9
            monitor-exit(r4)
            return
        L9:
            android.content.SharedPreferences r0 = r4.f5616     // Catch: java.lang.Throwable -> L47
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L47
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "__schema"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "__host_package"
            java.lang.String r2 = r5.f7569     // Catch: java.lang.Throwable -> L47
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "__host_version_code"
            long r2 = r5.f7570     // Catch: java.lang.Throwable -> L47
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "__host_version_name"
            java.lang.String r2 = r5.f7571     // Catch: java.lang.Throwable -> L47
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "__module_version_code"
            r2 = 60
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "__module_version_name"
            java.lang.String r5 = r5.f7574     // Catch: java.lang.Throwable -> L47
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)     // Catch: java.lang.Throwable -> L47
            r5.commit()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r4)
            return
        L47:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public java.util.List m3003(p000.EnumC0491kx r7) {
            r6 = this;
            r7.getClass()
            java.lang.String r7 = r7.f6296
            java.lang.String r0 = "data_"
            java.lang.String r7 = r0.concat(r7)
            android.content.SharedPreferences r6 = r6.f5616
            r0 = 0
            java.lang.String r6 = r6.getString(r7, r0)
            if (r6 != 0) goto L15
            return r0
        L15:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L41
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L41
            r6.<init>()     // Catch: java.lang.Throwable -> L41
            int r1 = r7.length()     // Catch: java.lang.Throwable -> L41
            r2 = 0
        L24:
            if (r2 >= r1) goto L48
            org.json.JSONObject r3 = r7.optJSONObject(r2)     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L2d
            goto L3e
        L2d:
            cx r4 = new cx     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "className"
            java.lang.String r3 = r3.optString(r5)     // Catch: java.lang.Throwable -> L41
            r3.getClass()     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r6.add(r4)     // Catch: java.lang.Throwable -> L41
        L3e:
            int r2 = r2 + 1
            goto L24
        L41:
            r6 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L48:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r6
        L4e:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public p000.C0227dx m3004(p000.EnumC0491kx r5) {
            r4 = this;
            r5.getClass()
            java.lang.String r5 = r5.f6296
            java.lang.String r0 = "data_"
            java.lang.String r5 = r0.concat(r5)
            android.content.SharedPreferences r4 = r4.f5616
            r0 = 0
            java.lang.String r4 = r4.getString(r5, r0)
            if (r4 != 0) goto L15
            return r0
        L15:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3b
            dx r4 = new dx     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "className"
            java.lang.String r1 = r5.optString(r1)     // Catch: java.lang.Throwable -> L3b
            r1.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "fieldName"
            java.lang.String r2 = r5.optString(r2)     // Catch: java.lang.Throwable -> L3b
            r2.getClass()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "fieldType"
            java.lang.String r5 = r5.optString(r3)     // Catch: java.lang.Throwable -> L3b
            r5.getClass()     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L3b
            goto L42
        L3b:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L42:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L47
            goto L48
        L47:
            r0 = r4
        L48:
            dx r0 = (p000.C0227dx) r0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public java.util.List m3005(p000.EnumC0491kx r13) {
            r12 = this;
            r13.getClass()
            java.lang.String r13 = r13.f6296
            java.lang.String r0 = "data_"
            java.lang.String r13 = r0.concat(r13)
            android.content.SharedPreferences r12 = r12.f5616
            r1 = 0
            java.lang.String r12 = r12.getString(r13, r1)
            if (r12 != 0) goto L15
            return r1
        L15:
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3c
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r12.<init>()     // Catch: java.lang.Throwable -> L3c
            int r0 = r13.length()     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r0) goto L87
            org.json.JSONObject r4 = r13.optJSONObject(r3)     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L2e
            goto L7e
        L2e:
            java.lang.String r5 = "parameterTypes"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L3f
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3c
            r5.<init>()     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r0 = move-exception
            r12 = r0
            goto L81
        L3f:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r10.<init>()     // Catch: java.lang.Throwable -> L3c
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L3c
            r7 = r2
        L49:
            if (r7 >= r6) goto L55
            java.lang.String r8 = r5.optString(r7)     // Catch: java.lang.Throwable -> L3c
            r10.add(r8)     // Catch: java.lang.Throwable -> L3c
            int r7 = r7 + 1
            goto L49
        L55:
            sx r6 = new sx     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "className"
            java.lang.String r7 = r4.optString(r5)     // Catch: java.lang.Throwable -> L3c
            r7.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "methodName"
            java.lang.String r8 = r4.optString(r5)     // Catch: java.lang.Throwable -> L3c
            r8.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "returnType"
            java.lang.String r9 = r4.optString(r5)     // Catch: java.lang.Throwable -> L3c
            r9.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "isStatic"
            boolean r11 = r4.optBoolean(r5, r2)     // Catch: java.lang.Throwable -> L3c
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3c
            r12.add(r6)     // Catch: java.lang.Throwable -> L3c
        L7e:
            int r3 = r3 + 1
            goto L25
        L81:
            eo1 r13 = new eo1
            r13.<init>(r12)
            r12 = r13
        L87:
            boolean r13 = r12 instanceof p000.eo1
            if (r13 == 0) goto L8c
            goto L8d
        L8c:
            r1 = r12
        L8d:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public boolean m3006(p000.C0703px r10) {
            r9 = this;
            android.content.SharedPreferences r9 = r9.f5616
            java.lang.String r0 = "__schema"
            r1 = 0
            int r0 = r9.getInt(r0, r1)
            r2 = 5
            if (r0 == r2) goto Ld
            goto L57
        Ld:
            java.lang.String r0 = "__host_package"
            java.lang.String r2 = ""
            java.lang.String r0 = r9.getString(r0, r2)
            java.lang.String r3 = r10.f8750
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L1e
            goto L57
        L1e:
            java.lang.String r0 = "__host_version_code"
            r3 = -1
            long r5 = r9.getLong(r0, r3)
            long r7 = r10.f8751
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L2d
            goto L57
        L2d:
            java.lang.String r0 = "__host_version_name"
            java.lang.String r0 = r9.getString(r0, r2)
            java.lang.String r10 = r10.f8752
            boolean r10 = p000.ln0.m3626(r0, r10)
            if (r10 != 0) goto L3c
            goto L57
        L3c:
            java.lang.String r10 = "__module_version_code"
            long r3 = r9.getLong(r10, r3)
            r5 = 60
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 == 0) goto L49
            goto L57
        L49:
            java.lang.String r10 = "__module_version_name"
            java.lang.String r9 = r9.getString(r10, r2)
            java.lang.String r10 = "1.4.15"
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 != 0) goto L58
        L57:
            return r1
        L58:
            r9 = 1
            return r9
    }

    /* JADX INFO: renamed from: η */
    public boolean m3007(p000.nd2 r11) {
            r10 = this;
            android.content.SharedPreferences r10 = r10.f5616
            java.lang.String r0 = "__schema"
            r1 = 0
            int r0 = r10.getInt(r0, r1)
            r2 = 1
            if (r0 != r2) goto L53
            java.lang.String r0 = "__host_package"
            java.lang.String r3 = ""
            java.lang.String r0 = r10.getString(r0, r3)
            java.lang.String r4 = r11.f7569
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 == 0) goto L53
            java.lang.String r0 = "__host_version_code"
            r4 = -1
            long r6 = r10.getLong(r0, r4)
            long r8 = r11.f7570
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L53
            java.lang.String r0 = "__host_version_name"
            java.lang.String r0 = r10.getString(r0, r3)
            java.lang.String r6 = r11.f7571
            boolean r0 = p000.ln0.m3626(r0, r6)
            if (r0 == 0) goto L53
            java.lang.String r0 = "__module_version_code"
            long r4 = r10.getLong(r0, r4)
            r6 = 60
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L53
            java.lang.String r0 = "__module_version_name"
            java.lang.String r10 = r10.getString(r0, r3)
            java.lang.String r11 = r11.f7574
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L53
            return r2
        L53:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public void m3008(p000.EnumC0491kx r5, java.util.List r6) {
            r4 = this;
            r5.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r6.next()
            cx r1 = (p000.C0191cx) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "className"
            java.lang.String r1 = r1.f2791
            org.json.JSONObject r1 = r2.put(r3, r1)
            r0.put(r1)
            goto Lc
        L29:
            java.lang.String r5 = r5.f6296
            java.lang.String r6 = "data_"
            java.lang.String r5 = r6.concat(r5)
            java.lang.String r6 = r0.toString()
            r6.getClass()
            r4.m3010(r5, r6)
            return
    }

    /* JADX INFO: renamed from: κ */
    public void m3009(p000.EnumC0491kx r7, java.util.ArrayList r8) {
            r6 = this;
            r7.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r8.next()
            sx r1 = (p000.C0814sx) r1
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.ArrayList r3 = r1.f10067
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.put(r4)
            goto L23
        L33:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "className"
            java.lang.String r5 = r1.f10064
            org.json.JSONObject r3 = r3.put(r4, r5)
            java.lang.String r4 = "methodName"
            java.lang.String r5 = r1.f10065
            org.json.JSONObject r3 = r3.put(r4, r5)
            java.lang.String r4 = "returnType"
            java.lang.String r5 = r1.f10066
            org.json.JSONObject r3 = r3.put(r4, r5)
            java.lang.String r4 = "parameterTypes"
            org.json.JSONObject r2 = r3.put(r4, r2)
            java.lang.String r3 = "isStatic"
            boolean r1 = r1.f10068
            org.json.JSONObject r1 = r2.put(r3, r1)
            r0.put(r1)
            goto Lc
        L62:
            java.lang.String r7 = r7.f6296
            java.lang.String r8 = "data_"
            java.lang.String r7 = r8.concat(r7)
            java.lang.String r8 = r0.toString()
            r8.getClass()
            r6.m3010(r7, r8)
            return
    }

    /* JADX INFO: renamed from: λ */
    public void m3010(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r1.f5616
            java.lang.String r0 = r1.getString(r2, r0)
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto Le
            return
        Le:
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            r1.commit()
            return
    }
}
