package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f11928a;

    public l(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Hchat_zombie_check_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f11928a = r2
            return
    }

    public static java.lang.String a(java.lang.Iterable r4) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L12
        L22:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L40
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            if (r3 == 0) goto L2b
            r4.add(r2)
            goto L2b
        L47:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r4)
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r1)
            goto L53
        L63:
            java.lang.String r4 = r0.toString()
            r4.getClass()
            return r4
    }

    public final java.util.List b(java.lang.String r8) {
            r7 = this;
            android.content.SharedPreferences r0 = r7.f11928a
            java.lang.String r1 = ""
            java.lang.String r8 = r0.getString(r8, r1)
            if (r8 != 0) goto Lb
            goto Lc
        Lb:
            r1 = r8
        Lc:
            boolean r8 = og.m.t0(r1)
            tf.t r0 = tf.t.f13167g
            if (r8 == 0) goto L15
            return r0
        L15:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            uf.c r1 = a.a.E()     // Catch: java.lang.Throwable -> L2f
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            r4 = r3
        L24:
            if (r4 < r2) goto L31
            uf.c r8 = a.a.t(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List r8 = tf.m.p1(r8)     // Catch: java.lang.Throwable -> L2f
            goto L5b
        L2f:
            r8 = move-exception
            goto L55
        L31:
            java.lang.String r5 = r8.optString(r4)     // Catch: java.lang.Throwable -> L2f
            r5.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2f
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L2f
            if (r6 <= 0) goto L48
            r6 = 1
            goto L49
        L48:
            r6 = r3
        L49:
            if (r6 == 0) goto L4c
            goto L4d
        L4c:
            r5 = 0
        L4d:
            if (r5 == 0) goto L52
            r1.add(r5)     // Catch: java.lang.Throwable -> L2f
        L52:
            int r4 = r4 + 1
            goto L24
        L55:
            sf.f r1 = new sf.f
            r1.<init>(r8)
            r8 = r1
        L5b:
            boolean r1 = r8 instanceof sf.f
            if (r1 == 0) goto L61
            goto L62
        L61:
            r0 = r8
        L62:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.Set c(java.lang.String r1) {
            r0 = this;
            java.util.List r1 = r0.b(r1)
            java.util.Set r1 = tf.m.U1(r1)
            return r1
    }
}
