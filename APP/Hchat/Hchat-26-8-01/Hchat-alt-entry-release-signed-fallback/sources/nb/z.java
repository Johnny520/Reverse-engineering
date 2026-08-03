package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f9339a;

    public z(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lc
            java.lang.String r0 = "Hchat_text_speech_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f9339a = r2
            return
    }

    public final java.util.Set a() {
            r7 = this;
            java.lang.String r0 = "text_speech_allowed_contacts"
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
            goto L4a
        L27:
            r0 = move-exception
            goto L44
        L29:
            java.lang.String r5 = r1.optString(r4)     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L27
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L27
            if (r6 <= 0) goto L41
            r0.add(r5)     // Catch: java.lang.Throwable -> L27
        L41:
            int r4 = r4 + 1
            goto L20
        L44:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L4a:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L50
            goto L51
        L50:
            r2 = r0
        L51:
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    public final boolean b(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f9339a     // Catch: java.lang.Throwable -> La
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r1 = r0.getBoolean(r3, r1)     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            r3 = move-exception
            goto L11
        Lc:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La
            goto L17
        L11:
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L1e
            r3 = r0
        L1e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    public final java.lang.String c() {
            r2 = this;
            java.lang.String r0 = "text_speech_tts_engine"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.d(r0, r1)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f9339a     // Catch: java.lang.Throwable -> Lb
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
