package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f2199a;

    static {
            return
    }

    public g(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Hchat_scheduled_task_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f2199a = r2
            return
    }

    public final void a(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            java.util.List r0 = r4.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            r3 = r2
            db.c r3 = (db.c) r3
            java.lang.String r3 = r3.f2168a
            boolean r3 = gg.l.a(r3, r5)
            if (r3 != 0) goto L10
            r1.add(r2)
            goto L10
        L29:
            r4.e(r1)
            return
    }

    public final db.c b(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.util.List r0 = r3.f()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r2 = r1
            db.c r2 = (db.c) r2
            java.lang.String r2 = r2.f2168a
            boolean r2 = gg.l.a(r2, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb
            goto L2a
        L29:
            r1 = 0
        L2a:
            db.c r1 = (db.c) r1
            return r1
    }

    public final boolean c() {
            r3 = this;
            java.lang.String r0 = "scheduled_task_enable"
            android.content.SharedPreferences r1 = r3.f2199a     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 == 0) goto Le
            boolean r2 = r1.getBoolean(r0, r2)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L13
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lc
            goto L19
        L13:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L19:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L20
            r0 = r1
        L20:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void d(db.c r6) {
            r5 = this;
            java.util.List r0 = r5.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            r3 = r2
            db.c r3 = (db.c) r3
            java.lang.String r3 = r3.f2168a
            java.lang.String r4 = r6.f2168a
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto Ld
            r1.add(r2)
            goto Ld
        L28:
            java.util.ArrayList r6 = tf.m.G1(r1, r6)
            r5.e(r6)
            return
    }

    public final void e(java.util.ArrayList r17) {
            r16 = this;
            r0 = r16
            android.content.SharedPreferences r1 = r0.f2199a
            if (r1 == 0) goto L2cc
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r1 == 0) goto L2cc
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            a9.h r3 = new a9.h
            r4 = 9
            r3.<init>(r4)
            r4 = r17
            java.util.List r3 = tf.m.K1(r4, r3)
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2ba
            java.lang.Object r4 = r3.next()
            db.c r4 = (db.c) r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.util.ArrayList r6 = a2.a.t(r4)
            int r7 = r4.f2185r
            java.lang.Object r8 = tf.m.v1(r6)
            db.a r8 = (db.a) r8
            r10 = 0
            if (r8 == 0) goto L45
            int r8 = r8.f2166a
            goto L5b
        L45:
            int r8 = r4.f2169b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            if (r8 < 0) goto L52
            r12 = 9
            if (r8 >= r12) goto L52
            goto L53
        L52:
            r11 = 0
        L53:
            if (r11 == 0) goto L5a
            int r8 = r11.intValue()
            goto L5b
        L5a:
            r8 = r10
        L5b:
            r11 = 6
            tf.t r12 = tf.t.f13167g
            if (r8 == 0) goto L65
            if (r8 != r11) goto L63
            goto L65
        L63:
            r9 = r12
            goto La2
        L65:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r6.iterator()
        L6e:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L83
            java.lang.Object r15 = r14.next()
            r9 = r15
            db.a r9 = (db.a) r9
            int r9 = r9.f2166a
            if (r9 != r8) goto L6e
            r13.add(r15)
            goto L6e
        L83:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r14 = tf.n.e1(r13)
            r9.<init>(r14)
            java.util.Iterator r13 = r13.iterator()
        L90:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto La2
            java.lang.Object r14 = r13.next()
            db.a r14 = (db.a) r14
            java.lang.String r14 = r14.f2167b
            r9.add(r14)
            goto L90
        La2:
            if (r8 == 0) goto Lf0
            if (r8 != r11) goto La7
            goto Lf0
        La7:
            r11 = 8
            if (r8 == r11) goto Lf0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r6.iterator()
        Lb4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lc9
            java.lang.Object r13 = r12.next()
            r14 = r13
            db.a r14 = (db.a) r14
            int r14 = r14.f2166a
            if (r14 != r8) goto Lb4
            r11.add(r13)
            goto Lb4
        Lc9:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = tf.n.e1(r11)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        Ld6:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Le8
            java.lang.Object r13 = r11.next()
            db.a r13 = (db.a) r13
            java.lang.String r13 = r13.f2167b
            r12.add(r13)
            goto Ld6
        Le8:
            java.util.Set r11 = tf.m.T1(r12)
            java.util.List r12 = tf.m.P1(r11)
        Lf0:
            java.lang.String r11 = "id"
            java.lang.String r13 = r4.f2168a
            r5.put(r11, r13)
            java.lang.String r11 = r4.f2184q
            java.lang.CharSequence r11 = og.m.R0(r11)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "remark"
            r5.put(r13, r11)
            java.lang.String r11 = "type"
            r5.put(r11, r8)
            java.lang.Object r8 = tf.m.v1(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L115
            java.lang.String r8 = ""
        L115:
            java.lang.String r13 = "content"
            r5.put(r13, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L123:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L133
            java.lang.Object r13 = r9.next()
            java.lang.String r13 = (java.lang.String) r13
            r8.put(r13)
            goto L123
        L133:
            java.lang.String r9 = "contentItems"
            r5.put(r9, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r9 = r12.iterator()
        L141:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L151
            java.lang.Object r12 = r9.next()
            java.lang.String r12 = (java.lang.String) r12
            r8.put(r12)
            goto L141
        L151:
            java.lang.String r9 = "mediaPaths"
            r5.put(r9, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L15f:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L180
            java.lang.Object r9 = r6.next()
            db.a r9 = (db.a) r9
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r13 = r9.f2166a
            r12.put(r11, r13)
            java.lang.String r13 = "value"
            java.lang.String r9 = r9.f2167b
            r12.put(r13, r9)
            r8.put(r12)
            goto L15f
        L180:
            java.lang.String r6 = "items"
            r5.put(r6, r8)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.List r8 = r4.f2173f
            java.util.Set r8 = tf.m.T1(r8)
            java.util.List r8 = tf.m.P1(r8)
            java.util.Iterator r8 = r8.iterator()
        L198:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L1a8
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            r6.put(r9)
            goto L198
        L1a8:
            java.lang.String r8 = "targetIds"
            r5.put(r8, r6)
            java.util.List r6 = a2.a.v(r4)
            java.lang.Object r8 = tf.m.v1(r6)
            java.lang.Long r8 = (java.lang.Long) r8
            r11 = 0
            if (r8 == 0) goto L1c0
            long r8 = r8.longValue()
            goto L1c1
        L1c0:
            r8 = r11
        L1c1:
            java.lang.String r13 = "planTime"
            r5.put(r13, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1cf:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L1e3
            java.lang.Object r9 = r6.next()
            java.lang.Number r9 = (java.lang.Number) r9
            long r13 = r9.longValue()
            r8.put(r13)
            goto L1cf
        L1e3:
            java.lang.String r6 = "planTimes"
            r5.put(r6, r8)
            java.lang.String r6 = "repeatType"
            int r8 = r4.f2175h
            r5.put(r6, r8)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Set r8 = r4.f2176i
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = tf.m.J1(r8)
            java.util.Iterator r8 = r8.iterator()
        L200:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L214
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r6.put(r9)
            goto L200
        L214:
            java.lang.String r8 = "repeatDays"
            r5.put(r8, r6)
            int r6 = r4.f2177j
            r8 = 3600(0xe10, float:5.045E-42)
            int r6 = r9.e0.r(r6, r10, r8)
            java.lang.String r9 = "intervalSeconds"
            r5.put(r9, r6)
            int r6 = r4.f2178k
            int r6 = r9.e0.r(r6, r10, r8)
            java.lang.String r8 = "mediaIntervalSeconds"
            r5.put(r8, r6)
            java.lang.String r6 = "sendOnTimeout"
            boolean r8 = r4.f2179l
            r5.put(r6, r8)
            java.lang.String r6 = r4.f2180m
            boolean r8 = og.m.t0(r6)
            if (r8 == 0) goto L242
            java.lang.String r6 = "pending"
        L242:
            java.lang.String r8 = "status"
            r5.put(r8, r6)
            long r8 = r4.f2181n
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 >= 0) goto L24e
            goto L24f
        L24e:
            r11 = r8
        L24f:
            java.lang.String r6 = "lastExecutedTime"
            r5.put(r6, r11)
            int r6 = r4.f2182o
            if (r6 >= 0) goto L259
            r6 = r10
        L259:
            java.lang.String r8 = "lastSuccessCount"
            r5.put(r8, r6)
            int r6 = r4.f2183p
            if (r6 >= 0) goto L263
            r6 = r10
        L263:
            java.lang.String r8 = "lastFailCount"
            r5.put(r8, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8 = 1
            if (r7 == 0) goto L273
            if (r7 != r8) goto L272
            goto L273
        L272:
            r6 = 0
        L273:
            if (r6 == 0) goto L27a
            int r6 = r6.intValue()
            goto L27b
        L27a:
            r6 = r10
        L27b:
            java.lang.String r9 = "targetType"
            r5.put(r9, r6)
            int r6 = r4.f2186s
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            if (r6 < 0) goto L28c
            r11 = 5
            if (r6 >= r11) goto L28c
            goto L28d
        L28c:
            r9 = 0
        L28d:
            if (r9 == 0) goto L294
            int r6 = r9.intValue()
            goto L295
        L294:
            r6 = r10
        L295:
            java.lang.String r9 = "momentsType"
            r5.put(r9, r6)
            if (r7 != 0) goto L2b0
            int r4 = r4.f2188u
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            if (r4 == 0) goto L2a9
            if (r4 != r8) goto L2a7
            goto L2a9
        L2a7:
            r9 = 0
            goto L2aa
        L2a9:
            r9 = r6
        L2aa:
            if (r9 == 0) goto L2b0
            int r10 = r9.intValue()
        L2b0:
            java.lang.String r4 = "sendChannel"
            r5.put(r4, r10)
            r2.put(r5)
            goto L22
        L2ba:
            java.lang.String r2 = r2.toString()
            r2.getClass()
            java.lang.String r3 = "scheduled_task_items_v1"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            if (r1 == 0) goto L2cc
            r1.apply()
        L2cc:
            return
    }

    public final java.util.List f() {
            r41 = this;
            java.lang.String r0 = "scheduled_task_items_v1"
            java.lang.String r1 = ""
            r2 = r41
            android.content.SharedPreferences r3 = r2.f2199a     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            java.lang.String r0 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            goto L1b
        L11:
            r0 = move-exception
            goto L15
        L13:
            r0 = r1
            goto L1b
        L15:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L1b:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L21
            r0 = r1
        L21:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "pending"
            boolean r4 = og.m.t0(r0)
            tf.t r5 = tf.t.f13167g
            if (r4 == 0) goto L2f
            goto L234
        L2f:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L51
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L51
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L51
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L51
            r7 = 0
            r8 = r7
        L3e:
            if (r8 < r6) goto L54
            uf.c r0 = a.a.t(r0)     // Catch: java.lang.Throwable -> L51
            a9.h r1 = new a9.h     // Catch: java.lang.Throwable -> L51
            r3 = 10
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L51
            java.util.List r0 = tf.m.K1(r0, r1)     // Catch: java.lang.Throwable -> L51
            goto L22b
        L51:
            r0 = move-exception
            goto L225
        L54:
            org.json.JSONObject r9 = r4.optJSONObject(r8)     // Catch: java.lang.Throwable -> L51
            if (r9 == 0) goto L71
            java.lang.String r10 = "id"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L51
            r10.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.CharSequence r10 = og.m.R0(r10)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = r10.toString()     // Catch: java.lang.Throwable -> L51
            boolean r10 = og.m.t0(r12)     // Catch: java.lang.Throwable -> L51
            if (r10 == 0) goto L7d
        L71:
            r33 = r0
            r38 = r1
            r39 = r3
            r36 = r7
            r37 = r8
            goto L217
        L7d:
            java.util.List r35 = a2.a.z(r9)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "remark"
            java.lang.String r30 = r9.optString(r10, r1)     // Catch: java.lang.Throwable -> L51
            r30.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "type"
            int r13 = r9.optInt(r10, r7)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "content"
            java.lang.String r14 = r9.optString(r10, r1)     // Catch: java.lang.Throwable -> L51
            r14.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "contentItems"
            org.json.JSONArray r10 = r9.optJSONArray(r10)     // Catch: java.lang.Throwable -> L51
            java.util.List r15 = a2.a.A(r10)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "mediaPaths"
            org.json.JSONArray r10 = r9.optJSONArray(r10)     // Catch: java.lang.Throwable -> L51
            java.util.List r16 = a2.a.A(r10)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "targetIds"
            org.json.JSONArray r10 = r9.optJSONArray(r10)     // Catch: java.lang.Throwable -> L51
            java.util.List r17 = a2.a.A(r10)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r10 = tf.m.v1(r35)     // Catch: java.lang.Throwable -> L51
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Throwable -> L51
            r37 = r8
            if (r10 == 0) goto Lc8
            long r10 = r10.longValue()     // Catch: java.lang.Throwable -> L51
            r18 = r10
            goto Lca
        Lc8:
            r18 = 0
        Lca:
            java.lang.String r10 = "repeatType"
            r11 = 0
            int r20 = r9.optInt(r10, r11)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "repeatDays"
            org.json.JSONArray r10 = r9.optJSONArray(r10)     // Catch: java.lang.Throwable -> L51
            java.util.Set r21 = a2.a.y(r10)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "intervalSeconds"
            int r10 = r9.optInt(r10, r11)     // Catch: java.lang.Throwable -> L51
            r7 = 3600(0xe10, float:5.045E-42)
            int r8 = r9.e0.r(r10, r11, r7)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "mediaIntervalSeconds"
            int r10 = r9.optInt(r10, r11)     // Catch: java.lang.Throwable -> L51
            int r7 = r9.e0.r(r10, r11, r7)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "sendOnTimeout"
            r11 = 1
            boolean r24 = r9.optBoolean(r10, r11)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = "status"
            java.lang.String r10 = r9.optString(r10, r3)     // Catch: java.lang.Throwable -> L51
            boolean r25 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L51
            if (r25 == 0) goto L107
            r25 = r3
            goto L109
        L107:
            r25 = r10
        L109:
            java.lang.String r10 = "lastExecutedTime"
            r26 = r12
            r11 = 0
            long r10 = r9.optLong(r10, r11)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = "lastSuccessCount"
            r38 = r1
            r1 = 0
            int r36 = r9.optInt(r12, r1)     // Catch: java.lang.Throwable -> L51
            if (r36 >= 0) goto L121
            r28 = r1
            goto L123
        L121:
            r28 = r36
        L123:
            java.lang.String r12 = "lastFailCount"
            int r36 = r9.optInt(r12, r1)     // Catch: java.lang.Throwable -> L51
            if (r36 >= 0) goto L12e
            r29 = r1
            goto L130
        L12e:
            r29 = r36
        L130:
            java.lang.String r12 = "targetType"
            int r12 = r9.optInt(r12, r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L51
            r22 = r1
            if (r12 == 0) goto L144
            r1 = 1
            if (r12 != r1) goto L142
            goto L144
        L142:
            r1 = 0
            goto L145
        L144:
            r1 = 1
        L145:
            if (r1 == 0) goto L14a
            r1 = r22
            goto L14b
        L14a:
            r1 = 0
        L14b:
            if (r1 == 0) goto L154
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L51
            r31 = r1
            goto L156
        L154:
            r31 = 0
        L156:
            java.lang.String r1 = "momentsType"
            r12 = 0
            int r1 = r9.optInt(r1, r12)     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L51
            if (r1 < 0) goto L168
            r2 = 5
            if (r1 >= r2) goto L168
            r1 = 1
            goto L169
        L168:
            r1 = 0
        L169:
            if (r1 == 0) goto L16c
            goto L16d
        L16c:
            r12 = 0
        L16d:
            if (r12 == 0) goto L176
            int r1 = r12.intValue()     // Catch: java.lang.Throwable -> L51
            r32 = r1
            goto L178
        L176:
            r32 = 0
        L178:
            java.lang.String r1 = "items"
            org.json.JSONArray r1 = r9.optJSONArray(r1)     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L187
            tf.t r1 = tf.t.f13167g     // Catch: java.lang.Throwable -> L51
            r39 = r3
        L184:
            r33 = r1
            goto L199
        L187:
            uf.c r2 = a.a.E()     // Catch: java.lang.Throwable -> L51
            int r12 = r1.length()     // Catch: java.lang.Throwable -> L51
            r39 = r3
            r3 = 0
        L192:
            if (r3 < r12) goto L1d1
            uf.c r1 = a.a.t(r2)     // Catch: java.lang.Throwable -> L51
            goto L184
        L199:
            java.lang.String r1 = "sendChannel"
            r2 = 0
            int r1 = r9.optInt(r1, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L51
            r9 = 1
            if (r1 == 0) goto L1ab
            if (r1 != r9) goto L1aa
            goto L1ab
        L1aa:
            r9 = r2
        L1ab:
            if (r9 == 0) goto L1af
            r12 = r3
            goto L1b0
        L1af:
            r12 = 0
        L1b0:
            if (r12 == 0) goto L1bd
            int r1 = r12.intValue()     // Catch: java.lang.Throwable -> L51
            r34 = r1
        L1b8:
            r12 = r26
            r26 = r10
            goto L1c0
        L1bd:
            r34 = r2
            goto L1b8
        L1c0:
            db.c r11 = new db.c     // Catch: java.lang.Throwable -> L51
            r23 = r7
            r22 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch: java.lang.Throwable -> L51
            r0.add(r11)     // Catch: java.lang.Throwable -> L51
            r33 = r0
            r36 = r2
            goto L217
        L1d1:
            r27 = r8
            r8 = r7
            r7 = r27
            r33 = r0
            r27 = 1
            r36 = 0
            org.json.JSONObject r0 = r1.optJSONObject(r3)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L208
            r34 = r1
            java.lang.String r1 = "type"
            r40 = r3
            r3 = 0
            int r1 = r0.optInt(r1, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = "value"
            java.lang.String r0 = wb.en.j(r3, r0)     // Catch: java.lang.Throwable -> L51
            if (r1 < 0) goto L20c
            r3 = 9
            if (r1 >= r3) goto L20c
            boolean r3 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L20c
            db.a r3 = new db.a     // Catch: java.lang.Throwable -> L51
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L51
            r2.add(r3)     // Catch: java.lang.Throwable -> L51
            goto L20c
        L208:
            r34 = r1
            r40 = r3
        L20c:
            int r3 = r40 + 1
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r33
            r1 = r34
            goto L192
        L217:
            int r8 = r37 + 1
            r2 = r41
            r0 = r33
            r7 = r36
            r1 = r38
            r3 = r39
            goto L3e
        L225:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L22b:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L231
            goto L232
        L231:
            r5 = r0
        L232:
            java.util.List r5 = (java.util.List) r5
        L234:
            return r5
    }
}
