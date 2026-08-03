package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f7557a;

    public g(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Hchat_qq_music_order_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f7557a = r2
            return
    }

    public final java.util.Set a() {
            r7 = this;
            java.lang.String r0 = "qq_music_order_allowed_talkers"
            java.lang.String r1 = ""
            java.lang.String r0 = r7.d(r0, r1)
            boolean r1 = og.m.t0(r0)
            tf.v r2 = tf.v.f13169g
            if (r1 == 0) goto L11
            return r2
        L11:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L27
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L27
            uf.i r0 = new uf.i     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L27
            r4 = 0
        L20:
            if (r4 < r3) goto L29
            uf.i r0 = ac.p.h(r0)     // Catch: java.lang.Throwable -> L27
            goto L4e
        L27:
            r0 = move-exception
            goto L48
        L29:
            java.lang.String r5 = r1.optString(r4)     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L27
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L27
            if (r6 <= 0) goto L3f
            goto L40
        L3f:
            r5 = 0
        L40:
            if (r5 == 0) goto L45
            r0.add(r5)     // Catch: java.lang.Throwable -> L27
        L45:
            int r4 = r4 + 1
            goto L20
        L48:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L4e:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L54
            goto L55
        L54:
            r2 = r0
        L55:
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    public final boolean b(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f7557a     // Catch: java.lang.Throwable -> L9
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

    public final void c(java.util.Set r6) {
            r5 = this;
            r6.getClass()
            android.content.SharedPreferences r0 = r5.f7557a
            if (r0 == 0) goto L7d
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r0 == 0) goto L7d
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r6)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L21:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            j8.b.r(r3, r2)
            goto L21
        L31:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L3a
            r6.add(r3)
            goto L3a
        L51:
            java.util.Set r6 = tf.m.T1(r6)
            java.util.List r6 = tf.m.P1(r6)
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r6.next()
            r1.put(r2)
            goto L5d
        L6b:
            java.lang.String r6 = r1.toString()
            r6.getClass()
            java.lang.String r1 = "qq_music_order_allowed_talkers"
            android.content.SharedPreferences$Editor r6 = r0.putString(r1, r6)
            if (r6 == 0) goto L7d
            r6.commit()
        L7d:
            return
    }

    public final java.lang.String d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f7557a     // Catch: java.lang.Throwable -> Lb
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
}
