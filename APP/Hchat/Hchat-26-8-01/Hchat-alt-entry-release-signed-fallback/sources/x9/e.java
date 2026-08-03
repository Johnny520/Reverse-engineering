package x9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f21415a;

    public e(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Hchat_keyword_notification_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f21415a = r2
            return
    }

    public final boolean a(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f21415a     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            boolean r2 = r0.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r2 = move-exception
            goto L11
        Lb:
            r2 = r3
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L9
            goto L17
        L11:
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L17:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L20
            r2 = r3
        L20:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public final java.lang.String b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f21415a     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Ld
            goto L15
        Lb:
            r2 = move-exception
            goto Lf
        Ld:
            r2 = r3
            goto L15
        Lf:
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L15:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r3 = r2
        L1c:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public final java.util.List c() {
            r10 = this;
            java.lang.String r0 = "keyword_notify_keywords"
            java.lang.String r1 = ""
            java.lang.String r0 = r10.b(r0, r1)
            boolean r1 = og.m.t0(r0)
            tf.t r2 = tf.t.f13167g
            if (r1 == 0) goto L11
            return r2
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.CharSequence r3 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "["
            r5 = 0
            boolean r3 = og.t.d0(r3, r4, r5)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L84
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L61
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L61
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L61
            r4 = r5
        L31:
            if (r4 < r0) goto L35
            goto Lb7
        L35:
            org.json.JSONObject r6 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L64
            java.lang.String r7 = "keyword"
            java.lang.String r7 = r6.optString(r7)     // Catch: java.lang.Throwable -> L61
            r7.getClass()     // Catch: java.lang.Throwable -> L61
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L61
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L61
            if (r8 <= 0) goto L81
            x9.f r8 = new x9.f     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = "wholeWord"
            boolean r6 = r6.optBoolean(r9, r5)     // Catch: java.lang.Throwable -> L61
            r8.<init>(r7, r6)     // Catch: java.lang.Throwable -> L61
            r1.add(r8)     // Catch: java.lang.Throwable -> L61
            goto L81
        L61:
            r0 = move-exception
            goto Lde
        L64:
            java.lang.String r6 = r3.optString(r4)     // Catch: java.lang.Throwable -> L61
            r6.getClass()     // Catch: java.lang.Throwable -> L61
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L61
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L61
            if (r7 <= 0) goto L81
            x9.f r7 = new x9.f     // Catch: java.lang.Throwable -> L61
            r7.<init>(r6, r5)     // Catch: java.lang.Throwable -> L61
            r1.add(r7)     // Catch: java.lang.Throwable -> L61
        L81:
            int r4 = r4 + 1
            goto L31
        L84:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L61
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r0 = r3.keys()     // Catch: java.lang.Throwable -> L61
        L8d:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L61
            r4.getClass()     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L61
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L61
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L61
            if (r6 <= 0) goto L8d
            x9.f r6 = new x9.f     // Catch: java.lang.Throwable -> L61
            boolean r7 = r3.optBoolean(r4, r5)     // Catch: java.lang.Throwable -> L61
            r6.<init>(r4, r7)     // Catch: java.lang.Throwable -> L61
            r1.add(r6)     // Catch: java.lang.Throwable -> L61
            goto L8d
        Lb7:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L61
        Lc5:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r4 == 0) goto Le3
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L61
            r5 = r4
            x9.f r5 = (x9.f) r5     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r5.f21416a     // Catch: java.lang.Throwable -> L61
            boolean r5 = r0.add(r5)     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto Lc5
            r3.add(r4)     // Catch: java.lang.Throwable -> L61
            goto Lc5
        Lde:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        Le3:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto Le8
            goto Le9
        Le8:
            r2 = r3
        Le9:
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public final void d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f21415a
            if (r0 == 0) goto L13
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r0 == 0) goto L13
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)
            if (r2 == 0) goto L13
            r2.apply()
        L13:
            return
    }

    public final boolean e(java.lang.String r4) {
            r3 = this;
            boolean r0 = og.m.t0(r4)
            r1 = 0
            if (r0 == 0) goto L8
            goto L33
        L8:
            java.lang.String r0 = "keyword_notify_filter_mode"
            boolean r0 = r3.a(r0, r1)
            java.lang.String r2 = ""
            if (r0 == 0) goto L21
            java.lang.String r0 = "keyword_notify_include_contacts"
            java.lang.String r0 = r3.b(r0, r2)
            java.util.Set r0 = x6.d.T(r0)
            boolean r4 = r0.contains(r4)
            return r4
        L21:
            java.lang.String r0 = "keyword_notify_exclude_contacts"
            java.lang.String r0 = r3.b(r0, r2)
            java.util.Set r0 = x6.d.T(r0)
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L33
            r4 = 1
            return r4
        L33:
            return r1
    }
}
