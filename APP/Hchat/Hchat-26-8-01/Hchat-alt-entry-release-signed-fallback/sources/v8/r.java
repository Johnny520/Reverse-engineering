package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v8.r f14282a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashSet f14283b = null;

    static {
            v8.r r0 = new v8.r
            r0.<init>()
            v8.r.f14282a = r0
            java.lang.String r13 = "note"
            java.lang.String r14 = "video_number_video"
            java.lang.String r1 = "text"
            java.lang.String r2 = "image"
            java.lang.String r3 = "voice"
            java.lang.String r4 = "video"
            java.lang.String r5 = "emoji"
            java.lang.String r6 = "quote"
            java.lang.String r7 = "file"
            java.lang.String r8 = "link"
            java.lang.String r9 = "music"
            java.lang.String r10 = "app"
            java.lang.String r11 = "location"
            java.lang.String r12 = "share_card"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.util.LinkedHashSet r0 = tf.d0.R(r0)
            v8.r.f14283b = r0
            return
    }

    public static boolean a(android.content.Context r2) {
            r2.getClass()
            java.lang.String r0 = "Hchat_auto_message_forward_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            java.lang.String r0 = "enabled"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static java.util.List b(android.content.Context r29) {
            r29.getClass()
            java.lang.String r0 = "Hchat_auto_message_forward_config"
            r1 = r29
            android.content.SharedPreferences r0 = ub.b.c(r1, r0)
            java.lang.String r1 = "rules_v1"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L16
            r0 = r2
        L16:
            java.lang.String r1 = "excludeKeywords"
            java.lang.String r3 = "includeKeywords"
            java.lang.String r4 = "delaySeconds"
            boolean r5 = og.m.t0(r0)
            tf.t r6 = tf.t.f13167g
            if (r5 == 0) goto L25
            return r6
        L25:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L3e
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L3e
            r8 = 0
            r9 = r8
        L34:
            if (r9 < r7) goto L43
            uf.c r0 = a.a.t(r0)     // Catch: java.lang.Throwable -> L3e
            r27 = r6
            goto L178
        L3e:
            r0 = move-exception
            r27 = r6
            goto L172
        L43:
            org.json.JSONObject r10 = r5.optJSONObject(r9)     // Catch: java.lang.Throwable -> L3e
            if (r10 == 0) goto L161
            java.lang.String r11 = "id"
            java.lang.String r11 = r10.optString(r11)     // Catch: java.lang.Throwable -> L3e
            boolean r12 = og.m.t0(r11)     // Catch: java.lang.Throwable -> L3e
            if (r12 == 0) goto L5d
            java.util.UUID r11 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L3e
        L5d:
            r11.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r12 = "name"
            int r13 = r9 + 1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r14.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r15 = "转发规则 "
            r14.append(r15)     // Catch: java.lang.Throwable -> L3e
            r14.append(r13)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r12 = r10.optString(r12, r13)     // Catch: java.lang.Throwable -> L3e
            r12.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r13 = "enabled"
            r14 = 1
            boolean r13 = r10.optBoolean(r13, r14)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r15 = "forwardOwnMessages"
            boolean r15 = r10.optBoolean(r15, r8)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r8 = "sourceIds"
            org.json.JSONArray r8 = r10.optJSONArray(r8)     // Catch: java.lang.Throwable -> L3e
            uf.i r8 = e(r8)     // Catch: java.lang.Throwable -> L3e
            r16 = r14
            java.lang.String r14 = "sourceMemberIds"
            org.json.JSONArray r14 = r10.optJSONArray(r14)     // Catch: java.lang.Throwable -> L3e
            uf.i r14 = e(r14)     // Catch: java.lang.Throwable -> L3e
            r26 = r5
            java.lang.String r5 = "targetIds"
            org.json.JSONArray r5 = r10.optJSONArray(r5)     // Catch: java.lang.Throwable -> L3e
            uf.i r17 = e(r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "messageKinds"
            org.json.JSONArray r5 = r10.optJSONArray(r5)     // Catch: java.lang.Throwable -> L3e
            uf.i r5 = e(r5)     // Catch: java.lang.Throwable -> L3e
            r18 = r5
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r18 = r18.iterator()     // Catch: java.lang.Throwable -> L3e
        Lc0:
            r19 = r18
            m3.c r19 = (m3.c) r19     // Catch: java.lang.Throwable -> L3e
            boolean r19 = r19.hasNext()     // Catch: java.lang.Throwable -> L3e
            r27 = r6
            java.util.LinkedHashSet r6 = v8.r.f14283b
            if (r19 == 0) goto Lf0
            r19 = r18
            uf.e r19 = (uf.e) r19     // Catch: java.lang.Throwable -> Led
            r28 = r7
            java.lang.Object r7 = r19.next()     // Catch: java.lang.Throwable -> Led
            r19 = r8
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> Led
            boolean r6 = r6.contains(r8)     // Catch: java.lang.Throwable -> Led
            if (r6 == 0) goto Le6
            r5.add(r7)     // Catch: java.lang.Throwable -> Led
        Le6:
            r8 = r19
            r6 = r27
            r7 = r28
            goto Lc0
        Led:
            r0 = move-exception
            goto L172
        Lf0:
            r28 = r7
            r19 = r8
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> Led
            if (r7 == 0) goto Lfd
            r18 = r6
            goto Lff
        Lfd:
            r18 = r5
        Lff:
            java.lang.String r5 = "delayEnabled"
            r6 = 0
            long r20 = r10.optLong(r4, r6)     // Catch: java.lang.Throwable -> Led
            int r8 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r8 <= 0) goto L10e
            r8 = r16
            goto L10f
        L10e:
            r8 = 0
        L10f:
            boolean r5 = r10.optBoolean(r5, r8)     // Catch: java.lang.Throwable -> Led
            long r20 = r10.optLong(r4, r6)     // Catch: java.lang.Throwable -> Led
            int r8 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r8 >= 0) goto L11d
            r20 = r6
        L11d:
            java.lang.String r6 = "includeKeywordsEnabled"
            java.lang.String r7 = r10.optString(r3, r2)     // Catch: java.lang.Throwable -> Led
            r7.getClass()     // Catch: java.lang.Throwable -> Led
            boolean r7 = og.m.t0(r7)     // Catch: java.lang.Throwable -> Led
            r7 = r7 ^ 1
            boolean r22 = r10.optBoolean(r6, r7)     // Catch: java.lang.Throwable -> Led
            java.lang.String r23 = r10.optString(r3, r2)     // Catch: java.lang.Throwable -> Led
            r23.getClass()     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = "excludeKeywordsEnabled"
            java.lang.String r7 = r10.optString(r1, r2)     // Catch: java.lang.Throwable -> Led
            r7.getClass()     // Catch: java.lang.Throwable -> Led
            boolean r7 = og.m.t0(r7)     // Catch: java.lang.Throwable -> Led
            r7 = r7 ^ 1
            boolean r24 = r10.optBoolean(r6, r7)     // Catch: java.lang.Throwable -> Led
            java.lang.String r25 = r10.optString(r1, r2)     // Catch: java.lang.Throwable -> Led
            r25.getClass()     // Catch: java.lang.Throwable -> Led
            v8.a r10 = new v8.a     // Catch: java.lang.Throwable -> Led
            r16 = r14
            r14 = r15
            r15 = r19
            r19 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> Led
            r0.add(r10)     // Catch: java.lang.Throwable -> Led
            goto L167
        L161:
            r26 = r5
            r27 = r6
            r28 = r7
        L167:
            int r9 = r9 + 1
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = 0
            goto L34
        L172:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L178:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L180
            r6 = r27
            goto L181
        L180:
            r6 = r0
        L181:
            java.util.List r6 = (java.util.List) r6
            return r6
    }

    public static java.util.ArrayList c(java.lang.String r3) {
            r0 = 7
            char[] r0 = new char[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [124, 44, -244, 59, -229, 10, 13} // fill-array
            r1 = 6
            java.util.List r3 = og.m.F0(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L46
            r2 = 1
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 == 0) goto L31
            r3.add(r1)
            goto L31
        L4d:
            return r3
    }

    public static org.json.JSONArray d(java.util.Set r4) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L14
        L24:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = 0
        L43:
            if (r3 == 0) goto L2d
            r4.add(r2)
            goto L2d
        L49:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r4)
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r1)
            goto L55
        L65:
            return r0
    }

    public static uf.i e(org.json.JSONArray r6) {
            uf.i r0 = new uf.i
            r0.<init>()
            if (r6 != 0) goto L8
            goto L10
        L8:
            int r1 = r6.length()
            r2 = 0
            r3 = r2
        Le:
            if (r3 < r1) goto L15
        L10:
            uf.i r6 = ac.p.h(r0)
            return r6
        L15:
            java.lang.String r4 = r6.optString(r3)
            r4.getClass()
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            int r5 = r4.length()
            if (r5 <= 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = r2
        L2d:
            if (r5 == 0) goto L30
            goto L31
        L30:
            r4 = 0
        L31:
            if (r4 == 0) goto L36
            r0.add(r4)
        L36:
            int r3 = r3 + 1
            goto Le
    }
}
