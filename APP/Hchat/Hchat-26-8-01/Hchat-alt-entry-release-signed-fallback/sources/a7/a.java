package a7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b7.a f59a;

    public static boolean A(int r4) {
            r0 = 0
            r1 = -1
            if (r4 >= r1) goto L5
            return r0
        L5:
            r2 = 1
            if (r4 != r1) goto L9
            return r2
        L9:
            r1 = r4 & 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L1a
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L12
            goto L1a
        L12:
            r1 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r1
            if (r4 != 0) goto L19
            return r2
        L19:
            return r0
        L1a:
            return r2
    }

    public static final java.util.List B(int r9, long r10, java.lang.String r12, boolean r13) {
            r12.getClass()
            tf.t r0 = tf.t.f13167g
            if (r9 != 0) goto L8
            return r0
        L8:
            boolean r1 = og.m.t0(r12)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            na.h r2 = new na.h
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r0 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L24
            r6 = r0
        L20:
            r4 = r9
            r5 = r12
            r8 = r13
            goto L26
        L24:
            r6 = r10
            goto L20
        L26:
            r2.<init>(r3, r4, r5, r6, r8)
            java.util.List r9 = a.a.x0(r2)
            return r9
    }

    public static java.nio.MappedByteBuffer C(android.content.Context r8, android.net.Uri r9) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r0, r1)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L4c
            r8.close()     // Catch: java.io.IOException -> L4c
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r0
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r2.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r2     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }

    public static final java.util.List F(java.lang.String r15) {
            java.lang.String r0 = "label"
            boolean r1 = og.m.t0(r15)
            if (r1 == 0) goto La
            goto L98
        La:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L98
            r1.<init>(r15)     // Catch: java.lang.Throwable -> L98
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L98
            r15.<init>()     // Catch: java.lang.Throwable -> L98
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L98
            r3 = 0
            r4 = r3
        L1a:
            if (r4 < r2) goto L2a
            java.util.Collection r15 = r15.values()     // Catch: java.lang.Throwable -> L98
            r15.getClass()     // Catch: java.lang.Throwable -> L98
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch: java.lang.Throwable -> L98
            java.util.List r15 = tf.m.P1(r15)     // Catch: java.lang.Throwable -> L98
            return r15
        L2a:
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L95
            java.lang.String r6 = "targetId"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L98
            r6.getClass()     // Catch: java.lang.Throwable -> L98
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L98
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L98
            int r6 = r9.length()     // Catch: java.lang.Throwable -> L98
            if (r6 != 0) goto L48
            goto L95
        L48:
            java.lang.CharSequence r6 = og.m.R0(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = r5.optString(r0)     // Catch: java.lang.Throwable -> L98
            boolean r7 = og.m.t0(r6)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L5c
            r10 = r9
            goto L5d
        L5c:
            r10 = r6
        L5d:
            java.lang.String r6 = "enabled"
            boolean r11 = r5.optBoolean(r6, r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "templateId"
            java.lang.String r12 = r5.optString(r6)     // Catch: java.lang.Throwable -> L98
            r12.getClass()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "customRules"
            boolean r13 = r5.optBoolean(r6, r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "overrideRule"
            org.json.JSONObject r6 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L8b
            java.lang.String r5 = r5.optString(r0)     // Catch: java.lang.Throwable -> L98
            boolean r7 = og.m.t0(r5)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L85
            r5 = r9
        L85:
            na.j r5 = L(r5, r6)     // Catch: java.lang.Throwable -> L98
        L89:
            r14 = r5
            goto L8d
        L8b:
            r5 = 0
            goto L89
        L8d:
            na.i r7 = new na.i     // Catch: java.lang.Throwable -> L98
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L98
            r15.put(r8, r7)     // Catch: java.lang.Throwable -> L98
        L95:
            int r4 = r4 + 1
            goto L1a
        L98:
            tf.t r15 = tf.t.f13167g
            return r15
    }

    public static y9.f G(java.lang.String r6) {
            java.lang.String r6 = j(r6)
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto Lc
            goto L63
        Lc:
            r0 = 1
            char[] r2 = new char[r0]
            r3 = 44
            r4 = 0
            r2[r4] = r3
            r3 = 6
            java.util.List r6 = og.m.F0(r6, r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L22:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = i(r3)
            int r5 = r3.length()
            if (r5 != 0) goto L3a
            r3 = r1
            goto L52
        L3a:
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r3 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r3)
            r3 = r5
        L4a:
            boolean r5 = r3 instanceof sf.f
            if (r5 == 0) goto L50
            r3 = r1
        L50:
            java.lang.Integer r3 = (java.lang.Integer) r3
        L52:
            if (r3 == 0) goto L22
            r2.add(r3)
            goto L22
        L58:
            r6 = 2
            java.util.List r6 = tf.m.L1(r6, r2)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L64
        L63:
            return r1
        L64:
            int r1 = r6.size()
            if (r1 != r0) goto L7a
            java.lang.Object r6 = r6.get(r4)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            y9.f r0 = new y9.f
            r0.<init>(r6, r6)
            goto L93
        L7a:
            java.lang.Object r1 = r6.get(r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r6 = r6.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            y9.f r0 = new y9.f
            r0.<init>(r1, r6)
        L93:
            return r0
    }

    public static java.util.ArrayList H(ac.k r4, ac.k r5) {
            int r0 = a.a.H0(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L16
            nc.a r3 = N(r4, r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L16:
            return r1
    }

    public static long I(ac.k r9, int r10, boolean r11, int r12) {
            r0 = 0
            r2 = 0
            r3 = r0
            r5 = r3
        L5:
            if (r2 >= r10) goto L14
            int r5 = r9.K()
            long r5 = (long) r5
            int r7 = r2 * 8
            long r7 = r5 << r7
            long r3 = r3 | r7
            int r2 = r2 + 1
            goto L5
        L14:
            r9 = 8
            if (r12 == 0) goto L1f
        L18:
            if (r10 >= r12) goto L1e
            long r3 = r3 << r9
            int r10 = r10 + 1
            goto L18
        L1e:
            return r3
        L1f:
            if (r11 == 0) goto L34
            r11 = 128(0x80, double:6.3E-322)
            long r11 = r11 & r5
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 == 0) goto L34
        L28:
            if (r10 >= r9) goto L34
            int r11 = r10 * 8
            r0 = 255(0xff, double:1.26E-321)
            long r11 = r0 << r11
            long r3 = r3 | r11
            int r10 = r10 + 1
            goto L28
        L34:
            return r3
    }

    public static final java.util.List J(java.lang.String r1) {
            if (r1 == 0) goto L13
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L9
            goto L13
        L9:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            java.util.List r1 = K(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L13:
            tf.t r1 = tf.t.f13167g
            return r1
    }

    public static java.util.List K(org.json.JSONArray r13) {
            if (r13 != 0) goto L5
            tf.t r13 = tf.t.f13167g
            return r13
        L5:
            uf.c r0 = a.a.E()
            int r1 = r13.length()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 < r1) goto L16
            uf.c r13 = a.a.t(r0)
            return r13
        L16:
            org.json.JSONObject r4 = r13.optJSONObject(r3)
            if (r4 == 0) goto L70
            java.lang.String r5 = "mode"
            int r8 = r4.optInt(r5, r2)
            if (r8 != 0) goto L25
            goto L70
        L25:
            java.lang.String r5 = "content"
            java.lang.String r9 = r4.optString(r5)
            r9.getClass()
            boolean r5 = og.m.t0(r9)
            if (r5 == 0) goto L35
            goto L70
        L35:
            java.lang.String r5 = "id"
            java.lang.String r5 = r4.optString(r5)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L59
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "_"
            r7.append(r5)
            r7.append(r3)
            java.lang.String r5 = r7.toString()
        L59:
            r7 = r5
            java.lang.String r5 = "delayMs"
            r10 = 0
            long r10 = r4.optLong(r5, r10)
            java.lang.String r5 = "random"
            boolean r12 = r4.optBoolean(r5, r2)
            na.h r6 = new na.h
            r6.<init>(r7, r8, r9, r10, r12)
            r0.add(r6)
        L70:
            int r3 = r3 + 1
            goto Lf
    }

    public static na.j L(java.lang.String r48, org.json.JSONObject r49) {
            r0 = r49
            java.lang.String r1 = "replyMode"
            r2 = 0
            int r1 = r0.optInt(r1, r2)
            java.lang.String r3 = "replyText"
            java.lang.String r4 = "谢谢老板"
            java.lang.String r3 = r0.optString(r3, r4)
            java.lang.String r4 = "replyDelayMs"
            r5 = 0
            long r7 = r0.optLong(r4, r5)
            java.lang.String r4 = "replyRandom"
            boolean r4 = r0.optBoolean(r4, r2)
            java.lang.String r9 = "replySteps"
            boolean r10 = r0.has(r9)
            if (r10 == 0) goto L32
            org.json.JSONArray r9 = r0.optJSONArray(r9)
            java.util.List r9 = K(r9)
        L2f:
            r29 = r9
            goto L3a
        L32:
            r3.getClass()
            java.util.List r9 = B(r1, r7, r3, r4)
            goto L2f
        L3a:
            java.lang.String r9 = "groupReplySteps"
            boolean r10 = r0.has(r9)
            if (r10 == 0) goto L4d
            org.json.JSONArray r9 = r0.optJSONArray(r9)
            java.util.List r9 = K(r9)
        L4a:
            r30 = r9
            goto L4f
        L4d:
            r9 = 0
            goto L4a
        L4f:
            java.lang.String r9 = "notificationConfigured"
            boolean r10 = r0.has(r9)
            java.lang.String r12 = "announceText"
            java.lang.String r13 = "announceEnabled"
            java.lang.String r14 = "notifyFailedToastText"
            java.lang.String r15 = "notifyFailedText"
            java.lang.String r5 = "notifyFailedToastEnabled"
            java.lang.String r6 = "notifyFailedSystemEnabled"
            java.lang.String r11 = "notifyToastText"
            java.lang.String r2 = "notifyText"
            r24 = r1
            java.lang.String r1 = "notifySoundUri"
            r25 = r3
            java.lang.String r3 = "notifyVibrateEnabled"
            r28 = r4
            java.lang.String r4 = "notifySoundEnabled"
            r26 = r7
            java.lang.String r7 = "notifyToastEnabled"
            java.lang.String r8 = "notifySystemEnabled"
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r8)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r7)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r4)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r3)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r1)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r2)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r11)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r6)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r5)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r15)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r14)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r13)
            if (r10 != 0) goto Lcc
            boolean r10 = r0.has(r12)
            if (r10 == 0) goto Lc8
            goto Lcc
        Lc8:
            r10 = 0
        Lc9:
            r20 = r12
            goto Lce
        Lcc:
            r10 = 1
            goto Lc9
        Lce:
            java.lang.String r12 = "抢到红包 {amount} 元"
            java.lang.String r2 = r0.optString(r2, r12)
            r21 = r12
            java.lang.String r12 = "未抢到红包"
            java.lang.String r12 = r0.optString(r15, r12)
            java.lang.String r15 = "id"
            java.lang.String r15 = r0.optString(r15)
            boolean r22 = og.m.t0(r15)
            if (r22 == 0) goto Lf0
            long r22 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = java.lang.String.valueOf(r22)
        Lf0:
            r15.getClass()
            r22 = r15
            java.lang.String r15 = "name"
            java.lang.String r15 = r0.optString(r15)
            boolean r23 = og.m.t0(r15)
            if (r23 == 0) goto L102
            goto L104
        L102:
            r48 = r15
        L104:
            java.lang.String r15 = "enabled"
            r23 = r13
            r13 = 0
            boolean r15 = r0.optBoolean(r15, r13)
            java.lang.String r13 = "grabMode"
            r31 = r15
            r15 = 1
            int r13 = r0.optInt(r13, r15)
            java.lang.String r15 = "delayMode"
            r18 = r13
            r13 = 0
            int r15 = r0.optInt(r15, r13)
            java.lang.String r13 = "delayMs"
            r32 = r14
            r33 = r15
            r14 = 0
            long r16 = r0.optLong(r13, r14)
            java.lang.String r13 = "randomMinMs"
            long r34 = r0.optLong(r13, r14)
            java.lang.String r13 = "randomMaxMs"
            long r13 = r0.optLong(r13, r14)
            java.lang.String r15 = "skipSelf"
            r36 = r13
            r13 = 0
            boolean r15 = r0.optBoolean(r15, r13)
            java.lang.String r14 = "listMode"
            int r14 = r0.optInt(r14, r13)
            java.lang.String r13 = "whitelist"
            java.lang.String r13 = r0.optString(r13)
            r13.getClass()
            r38 = r13
            java.lang.String r13 = "blacklist"
            java.lang.String r13 = r0.optString(r13)
            r13.getClass()
            r39 = r13
            java.lang.String r13 = "keywordMode"
            r40 = r14
            r14 = 0
            int r19 = r0.optInt(r13, r14)
            java.lang.String r13 = "keywords"
            java.lang.String r13 = r0.optString(r13)
            r13.getClass()
            r41 = r13
            java.lang.String r13 = "quietEnabled"
            boolean r13 = r0.optBoolean(r13, r14)
            java.lang.String r14 = "quietStartSecond"
            boolean r43 = r0.has(r14)
            if (r43 == 0) goto L186
            r43 = r13
            r13 = 0
            int r14 = r0.optInt(r14, r13)
            goto L191
        L186:
            r43 = r13
            r13 = 0
            java.lang.String r14 = "quietStartMinute"
            int r14 = r0.optInt(r14, r13)
            int r14 = r14 * 60
        L191:
            java.lang.String r13 = "quietEndSecond"
            boolean r44 = r0.has(r13)
            if (r44 == 0) goto L1a1
            r44 = r14
            r14 = 0
            int r13 = r0.optInt(r13, r14)
            goto L1ac
        L1a1:
            r44 = r14
            r14 = 0
            java.lang.String r13 = "quietEndMinute"
            int r13 = r0.optInt(r13, r14)
            int r13 = r13 * 60
        L1ac:
            r25.getClass()
            boolean r9 = r0.optBoolean(r9, r10)
            boolean r8 = r0.optBoolean(r8, r14)
            boolean r7 = r0.optBoolean(r7, r14)
            boolean r4 = r0.optBoolean(r4, r14)
            java.lang.String r10 = "notifySoundMode"
            int r10 = r0.optInt(r10, r14)
            boolean r3 = r0.optBoolean(r3, r14)
            java.lang.String r1 = r0.optString(r1)
            r1.getClass()
            r2.getClass()
            java.lang.String r11 = r0.optString(r11, r2)
            r11.getClass()
            boolean r6 = r0.optBoolean(r6, r14)
            boolean r5 = r0.optBoolean(r5, r14)
            r42 = r1
            r1 = r32
            java.lang.String r1 = j8.b.i(r12, r1, r12, r0)
            r32 = r1
            r1 = r23
            boolean r1 = r0.optBoolean(r1, r14)
            r14 = r20
            r20 = r1
            r1 = r14
            r14 = r21
            java.lang.String r45 = r0.optString(r1, r14)
            r45.getClass()
            r23 = r13
            r13 = r36
            r36 = r3
            na.j r3 = new na.j
            r37 = r42
            r21 = r43
            r42 = r12
            r43 = r32
            r32 = r8
            r8 = r33
            r33 = r7
            r7 = r18
            r18 = r39
            r39 = r11
            r11 = r34
            r34 = r4
            r35 = r10
            r4 = r22
            r22 = r44
            r44 = r20
            r20 = r41
            r41 = r5
            r5 = r48
            r46 = r38
            r38 = r2
            r47 = r40
            r40 = r6
            r6 = r31
            r31 = r9
            r9 = r16
            r17 = r46
            r16 = r47
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r3
    }

    public static final java.util.List M(java.lang.String r7) {
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto L7
            goto L3f
        L7:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L3f
            uf.c r7 = a.a.E()     // Catch: java.lang.Throwable -> L3f
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L3f
            r2 = 0
        L15:
            if (r2 < r1) goto L1c
            uf.c r7 = a.a.t(r7)     // Catch: java.lang.Throwable -> L3f
            return r7
        L1c:
            org.json.JSONObject r3 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L3c
            int r4 = r2 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r5.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "模板 "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3f
            r5.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L3f
            na.j r3 = L(r4, r3)     // Catch: java.lang.Throwable -> L3f
            r7.add(r3)     // Catch: java.lang.Throwable -> L3f
        L3c:
            int r2 = r2 + 1
            goto L15
        L3f:
            tf.t r7 = tf.t.f13167g
            return r7
    }

    public static nc.a N(ac.k r17, ac.k r18) {
            r0 = r17
            r1 = r18
            int r2 = r0.K()
            r3 = r2 & 31
            r2 = r2 & 224(0xe0, float:3.14E-43)
            r4 = 5
            int r2 = r2 >> r4
            int r5 = r2 + 1
            r6 = 3
            if (r3 == 0) goto L1bf
            r8 = 6
            r9 = 0
            r10 = 1
            if (r3 == r8) goto L1b0
            r11 = 4
            r12 = 2
            if (r3 == r12) goto L1a0
            if (r3 == r6) goto L190
            if (r3 == r11) goto L181
            r13 = 16
            r14 = 8
            if (r3 == r13) goto L16e
            r15 = 9
            r6 = 17
            if (r3 == r6) goto L15c
            r7 = 0
            r16 = 65535(0xffff, float:9.1834E-41)
            switch(r3) {
                case 21: goto L14b;
                case 22: goto Lce;
                case 23: goto Lbd;
                case 24: goto Lac;
                case 25: goto L8d;
                case 26: goto L69;
                case 27: goto L8d;
                case 28: goto L5f;
                case 29: goto L53;
                case 30: goto L50;
                case 31: goto L43;
                default: goto L33;
            }
        L33:
            af.d r0 = new af.d
            java.lang.String r1 = java.lang.Integer.toHexString(r3)
            java.lang.String r2 = "Unknown encoded value type: 0x"
            java.lang.String r1 = wb.en.g(r2, r1)
            r0.<init>(r1)
            throw r0
        L43:
            nc.a r0 = new nc.a
            if (r2 != r10) goto L48
            r9 = r10
        L48:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0.<init>(r12, r1)
            return r0
        L50:
            nc.a r0 = nc.a.f9340i
            return r0
        L53:
            nc.a r2 = new nc.a
            r3 = 18
            nc.b r0 = f.r.c(r0, r1, r9)
            r2.<init>(r3, r0)
            return r2
        L5f:
            nc.a r2 = new nc.a
            java.util.ArrayList r0 = H(r17, r18)
            r2.<init>(r6, r0)
            return r2
        L69:
            nc.a r2 = new nc.a
            long r3 = I(r0, r5, r9, r9)
            int r0 = (int) r3
            jf.h r3 = new jf.h
            r3.<init>()
            java.lang.Object r4 = r1.f179j
            ff.e r4 = (ff.e) r4
            int r4 = r4.f3931a
            r4 = r4 & r16
            int r4 = r4 << r13
            r5 = r0 & r16
            r4 = r4 | r5
            r3.f6894a = r4
            r3.f6899f = r0
            r3.f6900g = r1
            r0 = 14
            r2.<init>(r0, r3)
            return r2
        L8d:
            nc.a r2 = new nc.a
            long r3 = I(r0, r5, r9, r9)
            int r0 = (int) r3
            r1.getClass()
            jf.d r3 = new jf.d
            r3.<init>(r7)
            int r0 = r1.j(r3, r0)
            java.lang.String r0 = r1.y(r0)
            r3.f6871b = r0
            r0 = 13
            r2.<init>(r0, r3)
            return r2
        Lac:
            nc.a r2 = new nc.a
            long r3 = I(r0, r5, r9, r9)
            int r0 = (int) r3
            java.lang.String r0 = r1.y(r0)
            r1 = 11
            r2.<init>(r1, r0)
            return r2
        Lbd:
            nc.a r2 = new nc.a
            long r3 = I(r0, r5, r9, r9)
            int r0 = (int) r3
            java.lang.String r0 = r1.v(r0)
            r1 = 10
            r2.<init>(r1, r0)
            return r2
        Lce:
            nc.a r2 = new nc.a
            long r5 = I(r0, r5, r9, r9)
            int r0 = (int) r5
            java.lang.Object r3 = r1.f179j
            ff.e r3 = (ff.e) r3
            jf.e r3 = r3.f3934d
            int r3 = r3.f6885i
            int r0 = r0 * r14
            int r0 = r0 + r3
            r1.a(r0)
            int r0 = r1.L()
            switch(r0) {
                case 0: goto L106;
                case 1: goto L104;
                case 2: goto L102;
                case 3: goto L100;
                case 4: goto L107;
                case 5: goto Lfe;
                case 6: goto Lfc;
                case 7: goto Lfa;
                case 8: goto Lf8;
                default: goto Le9;
            }
        Le9:
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = "Unknown method handle type: 0x"
            java.lang.String r0 = wb.en.g(r1, r0)
            j8.o.t(r0)
            r0 = 0
            return r0
        Lf8:
            r4 = r15
            goto L107
        Lfa:
            r4 = 7
            goto L107
        Lfc:
            r4 = r14
            goto L107
        Lfe:
            r4 = r8
            goto L107
        L100:
            r4 = r11
            goto L107
        L102:
            r4 = 3
            goto L107
        L104:
            r4 = r12
            goto L107
        L106:
            r4 = r10
        L107:
            r1.M(r12)
            int r0 = r1.L()
            boolean r3 = j8.b.a(r4)
            if (r3 == 0) goto L12a
            qc.d r3 = new qc.d
            jf.d r5 = new jf.d
            r5.<init>(r7)
            int r0 = r1.j(r5, r0)
            java.lang.String r0 = r1.y(r0)
            r5.f6871b = r0
            r0 = 0
            r3.<init>(r4, r0, r5)
            goto L147
        L12a:
            qc.d r3 = new qc.d
            jf.h r5 = new jf.h
            r5.<init>()
            java.lang.Object r6 = r1.f179j
            ff.e r6 = (ff.e) r6
            int r6 = r6.f3931a
            r6 = r6 & r16
            int r6 = r6 << r13
            r7 = r0 & r16
            r6 = r6 | r7
            r5.f6894a = r6
            r5.f6899f = r0
            r5.f6900g = r1
            r0 = 1
            r3.<init>(r4, r0, r5)
        L147:
            r2.<init>(r13, r3)
            return r2
        L14b:
            nc.a r2 = new nc.a
            long r3 = I(r0, r5, r9, r9)
            int r0 = (int) r3
            jf.g r0 = r1.s(r0)
            r1 = 15
            r2.<init>(r1, r0)
            return r2
        L15c:
            nc.a r1 = new nc.a
            long r2 = I(r0, r5, r9, r14)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r15, r0)
            return r1
        L16e:
            nc.a r1 = new nc.a
            long r2 = I(r0, r5, r9, r11)
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.<init>(r14, r0)
            return r1
        L181:
            nc.a r1 = new nc.a
            long r2 = I(r0, r5, r10, r9)
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r8, r0)
            return r1
        L190:
            nc.a r1 = new nc.a
            long r2 = I(r0, r5, r9, r9)
            int r0 = (int) r2
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1.<init>(r4, r0)
            return r1
        L1a0:
            nc.a r1 = new nc.a
            long r2 = I(r0, r5, r10, r9)
            int r0 = (int) r2
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r1.<init>(r11, r0)
            return r1
        L1b0:
            nc.a r1 = new nc.a
            long r2 = I(r0, r5, r10, r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 7
            r1.<init>(r2, r0)
            return r1
        L1bf:
            nc.a r1 = new nc.a
            java.lang.Object r0 = r0.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            byte r0 = r0.get()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2 = 3
            r1.<init>(r2, r0)
            return r1
    }

    public static ia.v O(java.lang.Object r8) {
            r8.getClass()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "toByteArray"
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r2, r1)
            boolean r1 = r8 instanceof byte[]
            r2 = 0
            if (r1 == 0) goto L14
            byte[] r8 = (byte[]) r8
            goto L15
        L14:
            r8 = r2
        L15:
            if (r8 == 0) goto L92
            ia.v r1 = new ia.v
        L19:
            int r3 = r8.length
            if (r0 >= r3) goto L39
            ia.w r0 = P(r8, r0)
            if (r0 == 0) goto L39
            int r3 = r0.f6639b
            long r4 = r0.f6638a
            r0 = 3
            long r6 = r4 >>> r0
            int r0 = (int) r6
            r6 = 7
            long r4 = r4 & r6
            int r4 = (int) r4
            if (r4 == 0) goto L64
            r5 = 1
            if (r4 == r5) goto L61
            r6 = 2
            if (r4 == r6) goto L3f
            r0 = 5
            if (r4 == r0) goto L3b
        L39:
            r5 = r2
            goto L72
        L3b:
            int r3 = r3 + 4
        L3d:
            r0 = r3
            goto L6c
        L3f:
            ia.w r3 = P(r8, r3)
            if (r3 == 0) goto L39
            int r4 = r3.f6639b
            long r6 = r3.f6638a
            int r3 = (int) r6
            if (r3 < 0) goto L39
            int r6 = r4 + r3
            int r7 = r8.length
            if (r6 <= r7) goto L52
            goto L39
        L52:
            if (r0 != r5) goto L5f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r0.getClass()
            java.lang.String r5 = new java.lang.String
            r5.<init>(r8, r4, r3, r0)
            goto L72
        L5f:
            r0 = r6
            goto L6c
        L61:
            int r3 = r3 + 8
            goto L3d
        L64:
            ia.w r0 = P(r8, r3)
            if (r0 == 0) goto L39
            int r0 = r0.f6639b
        L6c:
            if (r0 < 0) goto L39
            int r3 = r8.length
            if (r0 <= r3) goto L19
            goto L39
        L72:
            if (r5 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r0 = 4
            java.lang.Long r0 = Q(r8, r0)
            if (r0 == 0) goto L92
            long r3 = r0.longValue()
            int r0 = (int) r3
            r3 = 7
            java.lang.Long r8 = Q(r8, r3)
            if (r8 == 0) goto L92
            long r2 = r8.longValue()
            int r8 = (int) r2
            r1.<init>(r5, r0, r8)
            return r1
        L92:
            return r2
    }

    public static ia.w P(byte[] r6, int r7) {
            r0 = 0
            r1 = 0
        L3:
            int r3 = r6.length
            if (r7 >= r3) goto L20
            r3 = 64
            if (r0 >= r3) goto L20
            r3 = r6[r7]
            int r7 = r7 + 1
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r0
            long r1 = r1 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L1d
            ia.w r6 = new ia.w
            r6.<init>(r1, r7)
            return r6
        L1d:
            int r0 = r0 + 7
            goto L3
        L20:
            r6 = 0
            return r6
    }

    public static java.lang.Long Q(byte[] r6, int r7) {
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L4c
            ia.w r0 = P(r6, r0)
            if (r0 == 0) goto L4c
            int r1 = r0.f6639b
            long r2 = r0.f6638a
            r0 = 3
            long r4 = r2 >>> r0
            int r0 = (int) r4
            r4 = 7
            long r2 = r2 & r4
            int r2 = (int) r2
            if (r2 == 0) goto L36
            r0 = 1
            if (r2 == r0) goto L33
            r0 = 2
            if (r2 == r0) goto L26
            r0 = 5
            if (r2 == r0) goto L22
            goto L4c
        L22:
            int r1 = r1 + 4
        L24:
            r0 = r1
            goto L47
        L26:
            ia.w r0 = P(r6, r1)
            if (r0 == 0) goto L4c
            int r1 = r0.f6639b
            long r2 = r0.f6638a
            int r0 = (int) r2
            int r1 = r1 + r0
            goto L24
        L33:
            int r1 = r1 + 8
            goto L24
        L36:
            ia.w r1 = P(r6, r1)
            if (r1 == 0) goto L4c
            if (r0 != r7) goto L45
            long r6 = r1.f6638a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            return r6
        L45:
            int r0 = r1.f6639b
        L47:
            if (r0 < 0) goto L4c
            int r1 = r6.length
            if (r0 <= r1) goto L1
        L4c:
            r6 = 0
            return r6
    }

    public static java.lang.String R(java.lang.String r10) {
            boolean r0 = y7.a.f(r10)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 92
            r2 = 47
            java.lang.String r10 = r10.replace(r0, r2)
            char[] r10 = r10.toCharArray()
            int r0 = r10.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            int r4 = r0 + (-1)
            r5 = 0
            r7 = r1
            r6 = r5
        L1f:
            if (r5 >= r0) goto L58
            char r8 = r10[r5]
            if (r6 == 0) goto L29
            r3.append(r8)
            goto L55
        L29:
            r9 = 46
            if (r8 != r9) goto L39
            if (r7 != 0) goto L35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r9 = 5
            r7.<init>(r9)
        L35:
            r7.append(r8)
            goto L55
        L39:
            if (r8 != r2) goto L42
            if (r5 != r4) goto L40
            r3.append(r8)
        L40:
            r7 = r1
            goto L55
        L42:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            if (r7 == 0) goto L51
            java.lang.String r6 = r7.toString()
            r3.append(r6)
            r7 = r1
        L51:
            r3.append(r8)
            r6 = 1
        L55:
            int r5 = r5 + 1
            goto L1f
        L58:
            if (r7 != 0) goto L5f
            java.lang.String r10 = r3.toString()
            return r10
        L5f:
            java.lang.String r10 = r7.toString()
            int r0 = r10.length()
            r2 = 2
            if (r0 <= r2) goto L6b
            return r10
        L6b:
            return r1
    }

    public static void S(android.content.Context r23, wb.u2 r24, boolean r25) {
            r0 = r23
            r14 = r25
            boolean r1 = r0 instanceof android.app.Activity
            r15 = 0
            if (r1 == 0) goto Ld
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = r0
            goto Le
        Ld:
            r2 = r15
        Le:
            if (r2 == 0) goto L2c2
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L1b
            android.view.View r0 = r0.getDecorView()
            goto L1c
        L1b:
            r0 = r15
        L1c:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L24
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11 = r0
            goto L25
        L24:
            r11 = r15
        L25:
            if (r11 == 0) goto L2c2
            int r0 = r11.getChildCount()
            r12 = 1
            int r0 = r0 - r12
            lg.b r1 = new lg.b
            r13 = 0
            r3 = -1
            r1.<init>(r0, r13, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = tf.n.e1(r1)
            r0.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L41:
            r4 = r1
            lg.c r4 = (lg.c) r4
            boolean r5 = r4.f8047i
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r4.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.view.View r4 = r11.getChildAt(r4)
            r0.add(r4)
            goto L41
        L5a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r4 = r0.hasNext()
            java.lang.String r5 = "Hchat:MiuixSettingsPage"
            if (r4 == 0) goto L80
            java.lang.Object r4 = r0.next()
            r6 = r4
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r6 = r6.getTag()
            boolean r5 = gg.l.a(r6, r5)
            if (r5 == 0) goto L63
            r1.add(r4)
            goto L63
        L80:
            java.util.Iterator r0 = r1.iterator()
        L84:
            boolean r1 = r0.hasNext()
            r4 = 2131099714(0x7f060042, float:1.781179E38)
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r4 = r1.getTag(r4)
            boolean r6 = r4 instanceof wb.o6
            if (r6 == 0) goto L9e
            wb.o6 r4 = (wb.o6) r4
            goto L9f
        L9e:
            r4 = r15
        L9f:
            if (r4 == 0) goto La4
            wb.f6 r4 = r4.f18001b
            goto La5
        La4:
            r4 = r15
        La5:
            if (r4 == 0) goto Lab
            r4.invoke()
            goto L84
        Lab:
            r11.removeView(r1)
            goto L84
        Laf:
            wb.o6 r9 = new wb.o6
            r9.<init>(r14)
            c9.a1 r10 = new c9.a1
            r0 = 2
            r10.<init>(r0)
            i0.j1 r1 = i0.r.u(r24)
            i0.j1 r0 = i0.r.u(r15)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            i0.j1 r16 = i0.r.u(r6)
            gg.u r8 = new gg.u
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            gg.q r17 = new gg.q
            r17.<init>()
            gg.q r6 = new gg.q
            r6.<init>()
            r18 = r4
            r4 = r6
            gg.u r6 = new gg.u
            r6.<init>()
            r19 = r3
            wb.f6 r3 = new wb.f6
            r20 = r5
            r5 = r9
            r9 = r11
            r11 = 0
            r21 = r15
            r13 = r18
            r15 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r22 = r8
            r8 = r4
            r4 = r22
            r5.f18001b = r3
            if (r14 == 0) goto L113
            wb.f6 r3 = new wb.f6
            r11 = 1
            r22 = r8
            r8 = r4
            r4 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r22 = r8
            r8 = r4
            r4 = r22
            r5.f18002c = r3
        L113:
            r11 = r9
            r9 = r7
            r7 = r8
            r8 = r5
            r5 = r6
            r6 = r4
            r4 = r1
            wb.p6 r1 = new wb.p6
            r3 = r11
            r11 = r10
            r10 = r3
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = r1
            r1 = r5
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r10
            r10 = r11
            r3.setTag(r15)
            r3.setTag(r13, r5)
            og.k r11 = wb.ho.f16633a
            android.content.res.Resources r11 = r2.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            int r11 = r11.uiMode
            r11 = r11 & 48
            r13 = 32
            if (r11 != r13) goto L146
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L147
        L146:
            r11 = -1
        L147:
            r3.setBackgroundColor(r11)
            r3.setClickable(r12)
            r3.setFocusable(r12)
            r3.setFocusableInTouchMode(r12)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r13 = -1
            r11.<init>(r13, r13)
            r3.setLayoutParams(r11)
            r6.f4564g = r3
            x6.d.H(r9, r10, r10, r10, r10)
            java.lang.Object r3 = r6.f4564g
            java.lang.String r15 = "page"
            if (r3 == 0) goto L2bc
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            x6.d.H(r3, r10, r10, r10, r10)
            boolean r3 = r10.f1100l
            if (r3 != 0) goto L179
            p4.t r3 = r10.f1097i
            android.os.Bundle r11 = android.os.Bundle.EMPTY
            r3.F(r11)
            r10.f1100l = r12
        L179:
            androidx.lifecycle.s r3 = r10.f1096h
            java.lang.String r11 = "setCurrentState"
            r3.c(r11)
            androidx.lifecycle.l r13 = androidx.lifecycle.l.f291i
            r3.e(r13)
            r3.c(r11)
            androidx.lifecycle.l r13 = androidx.lifecycle.l.f292j
            r3.e(r13)
            r3.c(r11)
            androidx.lifecycle.l r11 = androidx.lifecycle.l.f293k
            r3.e(r11)
            wb.t4 r3 = wb.t4.f19164g
            i0.j1 r3 = i0.r.u(r3)
            java.lang.String r11 = "Hchat_global_config"
            java.lang.String r13 = "terms_accepted"
            android.content.SharedPreferences r12 = ub.b.c(r2, r11)     // Catch: java.lang.Throwable -> L1ab
            r24 = r0
            r0 = 0
            boolean r12 = r12.getBoolean(r13, r0)     // Catch: java.lang.Throwable -> L1ae
            goto L1af
        L1ab:
            r24 = r0
            r0 = 0
        L1ae:
            r12 = r0
        L1af:
            if (r12 == 0) goto L1c3
            java.lang.String r12 = "terms_version"
            android.content.SharedPreferences r11 = ub.b.c(r2, r11)     // Catch: java.lang.Throwable -> L1bd
            int r11 = r11.getInt(r12, r0)     // Catch: java.lang.Throwable -> L1bd
        L1bb:
            r12 = 1
            goto L1bf
        L1bd:
            r11 = r0
            goto L1bb
        L1bf:
            if (r11 != r12) goto L1c4
            r13 = r12
            goto L1c5
        L1c3:
            r12 = 1
        L1c4:
            r13 = r0
        L1c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            i0.j1 r0 = i0.r.u(r0)
            y1.c1 r11 = new y1.c1
            r11.<init>(r2)
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r11.setId(r13)
            x6.d.H(r11, r10, r10, r10, r10)
            y1.r1 r13 = y1.r1.f22061h
            r11.setViewCompositionStrategy(r13)
            r13 = r11
            r11 = r9
            r9 = r7
            r7 = r5
            r5 = r0
            wb.l6 r0 = new wb.l6
            r23 = r16
            r16 = r13
            r13 = r23
            r23 = r15
            r15 = r12
            r12 = r3
            r3 = r2
            r2 = r10
            r10 = r6
            r6 = r8
            r8 = r1
            r1 = r4
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r1
            r5 = r7
            r1 = r8
            r7 = r9
            r9 = r11
            r8 = r6
            r6 = r10
            r10 = r2
            r2 = r3
            s0.d r3 = new s0.d
            r11 = -541130442(0xffffffffdfbf0136, float:-2.7526683E19)
            r3.<init>(r11, r0, r15)
            r13 = r16
            r13.setContent(r3)
            java.lang.Object r0 = r6.f4564g
            if (r0 == 0) goto L2b8
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r11 = -1
            r3.<init>(r11, r11)
            r0.addView(r13, r3)
            java.lang.Object r0 = r6.f4564g
            if (r0 == 0) goto L2b4
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.addView(r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L232
            goto L2a6
        L232:
            wb.q6 r3 = new wb.q6
            r13 = 0
            r11 = r6
            r6 = r4
            r4 = r11
            r11 = r9
            r12 = r10
            r9 = r5
            r10 = r7
            r5 = r17
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r6
            r6 = r4
            r4 = r0
            r0 = r3
            r5 = r9
            r7 = r10
            r9 = r11
            r10 = r12
            wb.q6 r3 = new wb.q6
            r13 = 1
            r11 = r6
            r6 = r4
            r4 = r11
            r11 = r9
            r9 = r5
            r10 = r7
            r5 = r17
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = r4
            r7 = r10
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.Class r2 = r2.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
            java.util.List r1 = a.a.y0(r1)
            java.util.Iterator r1 = r1.iterator()
        L26d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a6
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r4 = "dispatchKeyEvent"
            java.util.Set r4 = de.robv.android.xposed.XposedBridge.hookAllMethods(r2, r4, r0)     // Catch: java.lang.Throwable -> L284
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L284
            r7.addAll(r4)     // Catch: java.lang.Throwable -> L284
        L284:
            java.lang.String r4 = "onKeyDown"
            java.util.Set r4 = de.robv.android.xposed.XposedBridge.hookAllMethods(r2, r4, r0)     // Catch: java.lang.Throwable -> L28f
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L28f
            r7.addAll(r4)     // Catch: java.lang.Throwable -> L28f
        L28f:
            java.lang.String r4 = "onKeyUp"
            java.util.Set r4 = de.robv.android.xposed.XposedBridge.hookAllMethods(r2, r4, r0)     // Catch: java.lang.Throwable -> L29a
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L29a
            r7.addAll(r4)     // Catch: java.lang.Throwable -> L29a
        L29a:
            java.lang.String r4 = "onBackPressed"
            java.util.Set r2 = de.robv.android.xposed.XposedBridge.hookAllMethods(r2, r4, r3)     // Catch: java.lang.Throwable -> L26d
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L26d
            r7.addAll(r2)     // Catch: java.lang.Throwable -> L26d
            goto L26d
        L2a6:
            java.lang.Object r0 = r6.f4564g
            if (r0 == 0) goto L2b0
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.requestFocus()
            return
        L2b0:
            gg.l.g(r23)
            throw r21
        L2b4:
            gg.l.g(r23)
            throw r21
        L2b8:
            gg.l.g(r23)
            throw r21
        L2bc:
            r23 = r15
            gg.l.g(r23)
            throw r21
        L2c2:
            return
    }

    public static final void T(gg.q r3, wb.o6 r4, gg.u r5, java.util.ArrayList r6, gg.u r7, android.view.ViewGroup r8, c9.a1 r9) {
            java.lang.String r0 = "page"
            sf.n r1 = sf.n.f12433a
            boolean r2 = r3.f4560g
            if (r2 == 0) goto La
            goto Le4
        La:
            r2 = 1
            r3.f4560g = r2
            r3 = 0
            r4.f18001b = r3
            r4.f18002c = r3
            r5.f4564g = r3
            java.util.Iterator r4 = r6.iterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L28
            java.lang.Object r5 = r4.next()
            de.robv.android.xposed.XC_MethodHook$Unhook r5 = (de.robv.android.xposed.XC_MethodHook.Unhook) r5
            r5.unhook()     // Catch: java.lang.Throwable -> L18
            goto L18
        L28:
            r6.clear()
            java.lang.Object r4 = r7.f4564g     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L45
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch: java.lang.Throwable -> L41
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r5)     // Catch: java.lang.Throwable -> L41
            y1.c1 r4 = (y1.c1) r4     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L43
            r4.f()     // Catch: java.lang.Throwable -> L41
            r4 = r1
            goto L4f
        L41:
            r4 = move-exception
            goto L49
        L43:
            r4 = r3
            goto L4f
        L45:
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L49:
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L4f:
            java.lang.Throwable r4 = sf.g.b(r4)
            if (r4 == 0) goto L5e
            java.lang.String r5 = r4.getMessage()
            java.lang.String r6 = "[Hchat:MiuixSettings] 销毁页面 Composition 失败: "
            eh.a.x(r6, r5, r4)
        L5e:
            java.lang.Object r4 = r7.f4564g     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L7c
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch: java.lang.Throwable -> L74
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L74
            if (r4 != r8) goto L7a
            java.lang.Object r4 = r7.f4564g     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L76
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch: java.lang.Throwable -> L74
            r8.removeView(r4)     // Catch: java.lang.Throwable -> L74
            goto L7a
        L74:
            r3 = move-exception
            goto L80
        L76:
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L74
            throw r3     // Catch: java.lang.Throwable -> L74
        L7a:
            r4 = r1
            goto L85
        L7c:
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L74
            throw r3     // Catch: java.lang.Throwable -> L74
        L80:
            sf.f r4 = new sf.f
            r4.<init>(r3)
        L85:
            java.lang.Throwable r3 = sf.g.b(r4)
            if (r3 == 0) goto L94
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "[Hchat:MiuixSettings] 移除页面失败: "
            eh.a.x(r5, r4, r3)
        L94:
            r9.getClass()     // Catch: java.lang.Throwable -> L9f
            r8.getClass()     // Catch: java.lang.Throwable -> L9f
            x6.d.p(r8)     // Catch: java.lang.Throwable -> L9f
            r4 = r1
            goto La5
        L9f:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
        La5:
            java.lang.Throwable r3 = sf.g.b(r4)
            if (r3 == 0) goto Lb4
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "[Hchat:MiuixSettings] 清理页面 Owner 失败: "
            eh.a.x(r5, r4, r3)
        Lb4:
            androidx.lifecycle.s r3 = r9.f1096h     // Catch: java.lang.Throwable -> Lcf
            androidx.lifecycle.l r4 = r3.f300c     // Catch: java.lang.Throwable -> Lcf
            androidx.lifecycle.l r5 = androidx.lifecycle.l.f289g     // Catch: java.lang.Throwable -> Lcf
            if (r4 == r5) goto Lc4
            java.lang.String r4 = "setCurrentState"
            r3.c(r4)     // Catch: java.lang.Throwable -> Lcf
            r3.e(r5)     // Catch: java.lang.Throwable -> Lcf
        Lc4:
            r3.a r3 = r9.f1099k     // Catch: java.lang.Throwable -> Lcf
            r3.a()     // Catch: java.lang.Throwable -> Lcf
            androidx.lifecycle.e0 r3 = r9.f1098j     // Catch: java.lang.Throwable -> Lcf
            r3.a()     // Catch: java.lang.Throwable -> Lcf
            goto Ld5
        Lcf:
            r3 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r3)
        Ld5:
            java.lang.Throwable r3 = sf.g.b(r1)
            if (r3 == 0) goto Le4
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "[Hchat:MiuixSettings] 销毁页面 Owner 失败: "
            eh.a.x(r5, r4, r3)
        Le4:
            return
    }

    public static org.json.JSONObject U(na.j r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r4.f9150a
            r0.put(r1, r2)
            java.lang.String r1 = "name"
            java.lang.String r2 = r4.f9151b
            r0.put(r1, r2)
            java.lang.String r1 = "enabled"
            boolean r2 = r4.f9152c
            r0.put(r1, r2)
            java.lang.String r1 = "grabMode"
            int r2 = r4.f9153d
            r0.put(r1, r2)
            java.lang.String r1 = "delayMode"
            int r2 = r4.f9154e
            r0.put(r1, r2)
            java.lang.String r1 = "delayMs"
            long r2 = r4.f9155f
            r0.put(r1, r2)
            java.lang.String r1 = "randomMinMs"
            long r2 = r4.f9156g
            r0.put(r1, r2)
            java.lang.String r1 = "randomMaxMs"
            long r2 = r4.f9157h
            r0.put(r1, r2)
            java.lang.String r1 = "skipSelf"
            boolean r2 = r4.f9158i
            r0.put(r1, r2)
            java.lang.String r1 = "listMode"
            int r2 = r4.f9159j
            r0.put(r1, r2)
            java.lang.String r1 = "whitelist"
            java.lang.String r2 = r4.f9160k
            r0.put(r1, r2)
            java.lang.String r1 = "blacklist"
            java.lang.String r2 = r4.f9161l
            r0.put(r1, r2)
            java.lang.String r1 = "keywordMode"
            int r2 = r4.f9162m
            r0.put(r1, r2)
            java.lang.String r1 = "keywords"
            java.lang.String r2 = r4.f9163n
            r0.put(r1, r2)
            java.lang.String r1 = "quietEnabled"
            boolean r2 = r4.f9164o
            r0.put(r1, r2)
            java.lang.String r1 = "quietStartSecond"
            int r2 = r4.f9165p
            r0.put(r1, r2)
            java.lang.String r1 = "quietEndSecond"
            int r2 = r4.f9166q
            r0.put(r1, r2)
            java.lang.String r1 = "replyMode"
            int r2 = r4.f9167r
            r0.put(r1, r2)
            java.lang.String r1 = "replyText"
            java.lang.String r2 = r4.f9168s
            r0.put(r1, r2)
            java.lang.String r1 = "replyDelayMs"
            long r2 = r4.f9169t
            r0.put(r1, r2)
            java.lang.String r1 = "replyRandom"
            boolean r2 = r4.f9170u
            r0.put(r1, r2)
            org.json.JSONArray r1 = new org.json.JSONArray
            java.util.List r2 = r4.f9171v
            java.lang.String r2 = r(r2)
            r1.<init>(r2)
            java.lang.String r2 = "replySteps"
            r0.put(r2, r1)
            java.util.List r1 = r4.f9172w
            if (r1 == 0) goto Lba
            org.json.JSONArray r2 = new org.json.JSONArray
            java.lang.String r1 = r(r1)
            r2.<init>(r1)
            java.lang.String r1 = "groupReplySteps"
            r0.put(r1, r2)
        Lba:
            java.lang.String r1 = "notificationConfigured"
            boolean r2 = r4.f9173x
            r0.put(r1, r2)
            java.lang.String r1 = "notifySystemEnabled"
            boolean r2 = r4.f9174y
            r0.put(r1, r2)
            java.lang.String r1 = "notifyToastEnabled"
            boolean r2 = r4.f9175z
            r0.put(r1, r2)
            java.lang.String r1 = "notifySoundEnabled"
            boolean r2 = r4.A
            r0.put(r1, r2)
            java.lang.String r1 = "notifySoundMode"
            int r2 = r4.B
            r0.put(r1, r2)
            java.lang.String r1 = "notifyVibrateEnabled"
            boolean r2 = r4.C
            r0.put(r1, r2)
            java.lang.String r1 = "notifySoundUri"
            java.lang.String r2 = r4.D
            r0.put(r1, r2)
            java.lang.String r1 = "notifyText"
            java.lang.String r2 = r4.E
            r0.put(r1, r2)
            java.lang.String r1 = "notifyToastText"
            java.lang.String r2 = r4.F
            r0.put(r1, r2)
            java.lang.String r1 = "notifyFailedSystemEnabled"
            boolean r2 = r4.G
            r0.put(r1, r2)
            java.lang.String r1 = "notifyFailedToastEnabled"
            boolean r2 = r4.H
            r0.put(r1, r2)
            java.lang.String r1 = "notifyFailedText"
            java.lang.String r2 = r4.I
            r0.put(r1, r2)
            java.lang.String r1 = "notifyFailedToastText"
            java.lang.String r2 = r4.J
            r0.put(r1, r2)
            java.lang.String r1 = "announceEnabled"
            boolean r2 = r4.K
            r0.put(r1, r2)
            java.lang.String r1 = "announceText"
            java.lang.String r4 = r4.L
            r0.put(r1, r4)
            return r0
    }

    public static final java.lang.String V(float r5) {
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L9
            java.lang.String r5 = "NaN"
            return r5
        L9:
            boolean r0 = java.lang.Float.isInfinite(r5)
            if (r0 == 0) goto L1a
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L17
            java.lang.String r5 = "-Infinity"
            return r5
        L17:
            java.lang.String r5 = "Infinity"
            return r5
        L1a:
            r0 = 0
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r1 = 1092616192(0x41200000, float:10.0)
            double r1 = (double) r1
            double r3 = (double) r0
            double r1 = java.lang.Math.pow(r1, r3)
            float r1 = (float) r1
            float r5 = r5 * r1
            int r2 = (int) r5
            float r3 = (float) r2
            float r5 = r5 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L35
            int r2 = r2 + 1
        L35:
            float r5 = (float) r2
            float r5 = r5 / r1
            if (r0 <= 0) goto L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
        L3e:
            int r5 = (int) r5
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
    }

    public static final boolean W(android.content.Context r4) {
            r4.getClass()
            boolean r0 = r4 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto Lb
            android.app.Activity r4 = (android.app.Activity) r4
            goto Lc
        Lb:
            r4 = r1
        Lc:
            if (r4 == 0) goto L58
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L19
            android.view.View r0 = r0.getDecorView()
            goto L1a
        L19:
            r0 = r1
        L1a:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L21
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L58
            android.view.View r0 = s(r0)
            if (r0 == 0) goto L32
            r2 = 2131099714(0x7f060042, float:1.781179E38)
            java.lang.Object r0 = r0.getTag(r2)
            goto L33
        L32:
            r0 = r1
        L33:
            boolean r2 = r0 instanceof wb.o6
            if (r2 == 0) goto L3a
            wb.o6 r0 = (wb.o6) r0
            goto L3b
        L3a:
            r0 = r1
        L3b:
            r2 = 1
            if (r0 == 0) goto L4f
            boolean r3 = r0.f18000a
            if (r3 != r2) goto L4f
            fg.a r4 = r0.f18002c
            if (r4 == 0) goto L47
            goto L49
        L47:
            wb.f6 r4 = r0.f18001b
        L49:
            if (r4 == 0) goto L4e
            r4.invoke()
        L4e:
            return r2
        L4f:
            wb.u2 r0 = new wb.u2
            r0.<init>(r1)
            S(r4, r0, r2)
            return r2
        L58:
            r4 = 0
            return r4
    }

    public static java.lang.Object X(ud.e r3, java.util.concurrent.Callable r4) {
            java.lang.Object r3 = r4.call()     // Catch: java.lang.Exception -> L5
            return r3
        L5:
            r0 = move-exception
            md.f r1 = r3.f8877g
            md.a r2 = md.a.f8818f0
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L21
            r3.D(r2)
            java.lang.Object r3 = r4.call()     // Catch: java.lang.Exception -> L18
            return r3
        L18:
            r3 = move-exception
            af.g r4 = new af.g
            java.lang.String r0 = "Code generation error after restart"
            r4.<init>(r0, r3)
            throw r4
        L21:
            af.g r3 = new af.g
            java.lang.String r4 = "Code generation error"
            r3.<init>(r4, r0)
            throw r3
    }

    public static final void a(y0.o r39, r.z r40, p.x0 r41, boolean r42, m.p r43, boolean r44, k.k1 r45, y0.e r46, p.i r47, y0.f r48, p.g r49, fg.l r50, i0.h0 r51, int r52, int r53, int r54) {
            r1 = r39
            r3 = r40
            r5 = r41
            r4 = r42
            r0 = r44
            r14 = r51
            r15 = r52
            r2 = r53
            r6 = r54
            r7 = 924924659(0x37213af3, float:9.610073E-6)
            r14.b0(r7)
            r7 = r15 & 6
            if (r7 != 0) goto L27
            boolean r7 = r14.f(r1)
            if (r7 == 0) goto L24
            r7 = 4
            goto L25
        L24:
            r7 = 2
        L25:
            r7 = r7 | r15
            goto L28
        L27:
            r7 = r15
        L28:
            r10 = r15 & 48
            if (r10 != 0) goto L38
            boolean r10 = r14.f(r3)
            if (r10 == 0) goto L35
            r10 = 32
            goto L37
        L35:
            r10 = 16
        L37:
            r7 = r7 | r10
        L38:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L48
            boolean r10 = r14.f(r5)
            if (r10 == 0) goto L45
            r10 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r10 = 128(0x80, float:1.8E-43)
        L47:
            r7 = r7 | r10
        L48:
            r10 = r15 & 3072(0xc00, float:4.305E-42)
            r8 = 0
            r18 = 1024(0x400, float:1.435E-42)
            if (r10 != 0) goto L5b
            boolean r10 = r14.g(r8)
            if (r10 == 0) goto L58
            r10 = 2048(0x800, float:2.87E-42)
            goto L5a
        L58:
            r10 = r18
        L5a:
            r7 = r7 | r10
        L5b:
            r10 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L6b
            boolean r10 = r14.g(r4)
            if (r10 == 0) goto L68
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L6a
        L68:
            r10 = 8192(0x2000, float:1.148E-41)
        L6a:
            r7 = r7 | r10
        L6b:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r15
            if (r10 != 0) goto L80
            r10 = r43
            boolean r21 = r14.f(r10)
            if (r21 == 0) goto L7b
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L7d
        L7b:
            r21 = 65536(0x10000, float:9.1835E-41)
        L7d:
            r7 = r7 | r21
            goto L82
        L80:
            r10 = r43
        L82:
            r21 = 1572864(0x180000, float:2.204052E-39)
            r22 = r15 & r21
            if (r22 != 0) goto L95
            boolean r22 = r14.g(r0)
            if (r22 == 0) goto L91
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L93
        L91:
            r22 = 524288(0x80000, float:7.34684E-40)
        L93:
            r7 = r7 | r22
        L95:
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r23 = r15 & r22
            r13 = r45
            if (r23 != 0) goto Laa
            boolean r24 = r14.f(r13)
            if (r24 == 0) goto La6
            r24 = 8388608(0x800000, float:1.1754944E-38)
            goto La8
        La6:
            r24 = 4194304(0x400000, float:5.877472E-39)
        La8:
            r7 = r7 | r24
        Laa:
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r15 & r24
            if (r25 != 0) goto Lb4
            r25 = 33554432(0x2000000, float:9.403955E-38)
            r7 = r7 | r25
        Lb4:
            r8 = r6 & 512(0x200, float:7.17E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto Lbf
            r7 = r7 | r26
            r11 = r46
            goto Ld2
        Lbf:
            r27 = r15 & r26
            r11 = r46
            if (r27 != 0) goto Ld2
            boolean r28 = r14.f(r11)
            if (r28 == 0) goto Lce
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ld0
        Lce:
            r28 = 268435456(0x10000000, float:2.524355E-29)
        Ld0:
            r7 = r7 | r28
        Ld2:
            r12 = r6 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto Ldb
            r16 = r2 | 6
            r9 = r47
            goto Lf1
        Ldb:
            r29 = r2 & 6
            r9 = r47
            if (r29 != 0) goto Lef
            boolean r30 = r14.f(r9)
            if (r30 == 0) goto Lea
            r16 = 4
            goto Lec
        Lea:
            r16 = 2
        Lec:
            r16 = r2 | r16
            goto Lf1
        Lef:
            r16 = r2
        Lf1:
            r30 = r7
            r7 = r6 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto Lfe
            r16 = r16 | 48
            r31 = r7
        Lfb:
            r7 = r16
            goto L119
        Lfe:
            r31 = r2 & 48
            if (r31 != 0) goto L114
            r31 = r7
            r7 = r48
            boolean r32 = r14.f(r7)
            if (r32 == 0) goto L10f
            r19 = 32
            goto L111
        L10f:
            r19 = 16
        L111:
            r16 = r16 | r19
            goto Lfb
        L114:
            r31 = r7
            r7 = r48
            goto Lfb
        L119:
            r16 = r8
            r8 = r6 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L124
            r7 = r7 | 384(0x180, float:5.38E-43)
        L121:
            r6 = r49
            goto L137
        L124:
            r6 = r2 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L121
            r6 = r49
            boolean r19 = r14.f(r6)
            if (r19 == 0) goto L133
            r20 = 256(0x100, float:3.59E-43)
            goto L135
        L133:
            r20 = 128(0x80, float:1.8E-43)
        L135:
            r7 = r7 | r20
        L137:
            r6 = r2 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L148
            r6 = r50
            boolean r19 = r14.h(r6)
            if (r19 == 0) goto L145
            r18 = 2048(0x800, float:2.87E-42)
        L145:
            r7 = r7 | r18
            goto L14a
        L148:
            r6 = r50
        L14a:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r30 & r18
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = 1
            if (r2 != r6) goto L15f
            r2 = r7 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r2 == r6) goto L15d
            goto L15f
        L15d:
            r2 = 0
            goto L161
        L15f:
            r2 = r18
        L161:
            r6 = r30 & 1
            boolean r2 = r14.S(r6, r2)
            if (r2 == 0) goto L455
            r14.X()
            r2 = r15 & 1
            r6 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r19 = 0
            if (r2 == 0) goto L189
            boolean r2 = r14.B()
            if (r2 == 0) goto L17c
            goto L189
        L17c:
            r14.V()
            r2 = r30 & r6
            r13 = r48
            r8 = r49
        L185:
            r6 = r7
            r7 = r9
            r12 = r11
            goto L1a7
        L189:
            r2 = r30 & r6
            if (r16 == 0) goto L18f
            r11 = r19
        L18f:
            if (r12 == 0) goto L193
            r9 = r19
        L193:
            if (r31 == 0) goto L198
            r6 = r19
            goto L19a
        L198:
            r6 = r48
        L19a:
            if (r8 == 0) goto L1a3
            r13 = r6
            r6 = r7
            r7 = r9
            r12 = r11
            r8 = r19
            goto L1a7
        L1a3:
            r8 = r49
            r13 = r6
            goto L185
        L1a7:
            r14.q()
            int r16 = r2 >> 3
            r9 = r16 & 14
            int r11 = r6 >> 6
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | r9
            r46 = r2
            i0.a1 r2 = i0.r.y(r50, r51)
            r20 = r11 & 14
            r47 = r6
            r6 = r20 ^ 6
            r48 = r9
            r9 = 4
            if (r6 <= r9) goto L1ca
            boolean r6 = r14.f(r3)
            if (r6 != 0) goto L1ce
        L1ca:
            r6 = r11 & 6
            if (r6 != r9) goto L1d1
        L1ce:
            r6 = r18
            goto L1d2
        L1d1:
            r6 = 0
        L1d2:
            java.lang.Object r9 = r14.P()
            i0.e r11 = i0.l.f5952a
            if (r6 != 0) goto L1dc
            if (r9 != r11) goto L224
        L1dc:
            r.d r6 = new r.d
            r6.<init>()
            i0.g1 r9 = new i0.g1
            r10 = 2147483647(0x7fffffff, float:NaN)
            r9.<init>(r10)
            r6.f11158a = r9
            i0.g1 r9 = new i0.g1
            r9.<init>(r10)
            r6.f11159b = r9
            b0.j r9 = new b0.j
            r10 = 11
            r9.<init>(r2, r10)
            i0.e r2 = i0.e.f5868k
            b5.c r20 = i0.k2.f5950a
            i0.x r10 = new i0.x
            r10.<init>(r9, r2)
            ab.e r9 = new ab.e
            r15 = 11
            r9.<init>(r10, r3, r6, r15)
            i0.x r6 = new i0.x
            r6.<init>(r9, r2)
            r.l r30 = new r.l
            r31 = 0
            r32 = 0
            java.lang.Class<i0.l2> r33 = i0.l2.class
            java.lang.String r35 = "value"
            java.lang.String r36 = "getValue()Ljava/lang/Object;"
            r34 = r6
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r9 = r30
            r14.k0(r9)
        L224:
            r2 = r9
            r.l r2 = (r.l) r2
            int r6 = r46 >> 9
            r9 = r6 & 112(0x70, float:1.57E-43)
            r9 = r48 | r9
            r10 = r9 & 14
            r10 = r10 ^ 6
            r15 = 4
            if (r10 <= r15) goto L23a
            boolean r10 = r14.f(r3)
            if (r10 != 0) goto L23e
        L23a:
            r10 = r9 & 6
            if (r10 != r15) goto L241
        L23e:
            r10 = r18
            goto L242
        L241:
            r10 = 0
        L242:
            r20 = r9 & 112(0x70, float:1.57E-43)
            r15 = r20 ^ 48
            r48 = r2
            r2 = 32
            if (r15 <= r2) goto L252
            boolean r15 = r14.g(r4)
            if (r15 != 0) goto L256
        L252:
            r9 = r9 & 48
            if (r9 != r2) goto L259
        L256:
            r2 = r18
            goto L25a
        L259:
            r2 = 0
        L25a:
            r2 = r2 | r10
            java.lang.Object r9 = r14.P()
            if (r2 != 0) goto L263
            if (r9 != r11) goto L26b
        L263:
            r.f r9 = new r.f
            r9.<init>(r3, r4)
            r14.k0(r9)
        L26b:
            r15 = r9
            r.f r15 = (r.f) r15
            java.lang.Object r2 = r14.P()
            if (r2 != r11) goto L27b
            qg.t r2 = i0.r.n(r14)
            r14.k0(r2)
        L27b:
            r9 = r2
            qg.t r9 = (qg.t) r9
            i0.m2 r2 = y1.h1.f21945g
            java.lang.Object r2 = r14.j(r2)
            r10 = r2
            f1.z r10 = (f1.z) r10
            i0.u r2 = y1.h1.f21961w
            java.lang.Object r2 = r14.j(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L297
            s.h r19 = s.e1.f12007a
        L297:
            r2 = r19
            r19 = 65520(0xfff0, float:9.1813E-41)
            r19 = r46 & r19
            r20 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r20
            r6 = r19 | r6
            int r19 = r47 << 18
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r31 = r19 & r30
            r6 = r6 | r31
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r19 & r31
            r6 = r6 | r19
            int r19 = r47 << 27
            r32 = 1879048192(0x70000000, float:1.5845633E29)
            r19 = r19 & r32
            r6 = r6 | r19
            r19 = r6 & 112(0x70, float:1.57E-43)
            r46 = r9
            r9 = r19 ^ 48
            r0 = 32
            if (r9 <= r0) goto L2ca
            boolean r9 = r14.f(r3)
            if (r9 != 0) goto L2ce
        L2ca:
            r9 = r6 & 48
            if (r9 != r0) goto L2d1
        L2ce:
            r0 = r18
            goto L2d2
        L2d1:
            r0 = 0
        L2d2:
            r9 = r6 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            r47 = r0
            r0 = 256(0x100, float:3.59E-43)
            if (r9 <= r0) goto L2e2
            boolean r9 = r14.f(r5)
            if (r9 != 0) goto L2e6
        L2e2:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != r0) goto L2e9
        L2e6:
            r0 = r18
            goto L2ea
        L2e9:
            r0 = 0
        L2ea:
            r0 = r47 | r0
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 ^ 3072(0xc00, float:4.305E-42)
            r47 = r0
            r0 = 2048(0x800, float:2.87E-42)
            if (r9 <= r0) goto L2fd
            r9 = 0
            boolean r17 = r14.g(r9)
            if (r17 != 0) goto L301
        L2fd:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != r0) goto L304
        L301:
            r9 = r18
            goto L305
        L304:
            r9 = 0
        L305:
            r0 = r47 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r6
            r9 = r9 ^ 24576(0x6000, float:3.4438E-41)
            r47 = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r9 <= r0) goto L319
            boolean r9 = r14.g(r4)
            if (r9 != 0) goto L31d
        L319:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != r0) goto L320
        L31d:
            r9 = r18
            goto L321
        L320:
            r9 = 0
        L321:
            r0 = r47 | r9
            r9 = 0
            boolean r17 = r14.d(r9)
            r0 = r0 | r17
            r17 = r6 & r20
            r9 = r17 ^ r21
            r47 = r0
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r9 <= r0) goto L33a
            boolean r9 = r14.f(r12)
            if (r9 != 0) goto L33e
        L33a:
            r9 = r6 & r21
            if (r9 != r0) goto L341
        L33e:
            r9 = r18
            goto L342
        L341:
            r9 = 0
        L342:
            r0 = r47 | r9
            r9 = r6 & r30
            r9 = r9 ^ r22
            r47 = r0
            r0 = 8388608(0x800000, float:1.1754944E-38)
            if (r9 <= r0) goto L354
            boolean r9 = r14.f(r13)
            if (r9 != 0) goto L358
        L354:
            r9 = r6 & r22
            if (r9 != r0) goto L35b
        L358:
            r9 = r18
            goto L35c
        L35b:
            r9 = 0
        L35c:
            r0 = r47 | r9
            r9 = r6 & r31
            r9 = r9 ^ r24
            r47 = r0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 <= r0) goto L36e
            boolean r9 = r14.f(r8)
            if (r9 != 0) goto L372
        L36e:
            r9 = r6 & r24
            if (r9 != r0) goto L375
        L372:
            r9 = r18
            goto L376
        L375:
            r9 = 0
        L376:
            r0 = r47 | r9
            r9 = r6 & r32
            r9 = r9 ^ r26
            r47 = r0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 <= r0) goto L388
            boolean r9 = r14.f(r7)
            if (r9 != 0) goto L38c
        L388:
            r6 = r6 & r26
            if (r6 != r0) goto L38f
        L38c:
            r9 = r18
            goto L390
        L38f:
            r9 = 0
        L390:
            r0 = r47 | r9
            boolean r6 = r14.f(r10)
            r0 = r0 | r6
            boolean r6 = r14.f(r2)
            r0 = r0 | r6
            java.lang.Object r6 = r14.P()
            if (r0 != 0) goto L3a4
            if (r6 != r11) goto L3a7
        L3a4:
            r0 = r11
            r11 = r2
            goto L3b0
        L3a7:
            r10 = r48
            r9 = r7
            r19 = r8
            r37 = r11
            r0 = 4
            goto L3c4
        L3b0:
            r.o r2 = new r.o
            r9 = r46
            r6 = r48
            r37 = r0
            r0 = 4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r10 = r6
            r9 = r7
            r19 = r8
            r14.k0(r2)
            r6 = r2
        L3c4:
            r11 = r6
            r.o r11 = (r.o) r11
            if (r42 == 0) goto L3cd
            m.p1 r2 = m.p1.f8324g
        L3cb:
            r4 = r2
            goto L3d0
        L3cd:
            m.p1 r2 = m.p1.f8325h
            goto L3cb
        L3d0:
            if (r44 == 0) goto L413
            r2 = -2077147368(0xffffffff84313f18, float:-2.0835221E-36)
            r14.a0(r2)
            r2 = r16 & 14
            r2 = r2 ^ 6
            if (r2 <= r0) goto L3e4
            boolean r2 = r14.f(r3)
            if (r2 != 0) goto L3e8
        L3e4:
            r2 = r16 & 6
            if (r2 != r0) goto L3ec
        L3e8:
            r8 = r18
        L3ea:
            r0 = 0
            goto L3ee
        L3ec:
            r8 = 0
            goto L3ea
        L3ee:
            boolean r2 = r14.d(r0)
            r0 = r8 | r2
            java.lang.Object r2 = r14.P()
            if (r0 != 0) goto L3fe
            r0 = r37
            if (r2 != r0) goto L406
        L3fe:
            r.g r2 = new r.g
            r2.<init>(r3)
            r14.k0(r2)
        L406:
            r.g r2 = (r.g) r2
            m.c r0 = r3.f11295p
            y0.o r0 = s.o.g(r2, r0, r4)
            r2 = 0
            r14.p(r2)
            goto L41f
        L413:
            r2 = 0
            r0 = -2076718545(0xffffffff8437ca2f, float:-2.1604385E-36)
            r14.a0(r0)
            r14.p(r2)
            y0.l r0 = y0.l.f21818a
        L41f:
            r.v r2 = r3.f11292m
            y0.o r2 = r1.d(r2)
            s.e r5 = r3.f11293n
            y0.o r2 = r2.d(r5)
            r6 = r44
            y0.o r2 = s.o.h(r2, r10, r15, r4, r6)
            y0.o r0 = r2.d(r0)
            s.z r2 = r3.f11294o
            y0.o r2 = r2.f12156k
            y0.o r2 = r0.d(r2)
            n.k r8 = r3.f11286g
            r7 = r43
            r5 = r45
            y0.o r0 = k.n.s(r2, r3, r4, r5, r6, r7, r8)
            r8 = r3
            s.m0 r4 = r8.f11296q
            r7 = 0
            r3 = r0
            r2 = r10
            r5 = r11
            r6 = r14
            s.o.a(r2, r3, r4, r5, r6, r7)
            r11 = r12
            r10 = r13
            goto L45d
        L455:
            r8 = r3
            r51.V()
            r10 = r48
            r19 = r49
        L45d:
            i0.r1 r0 = r51.t()
            if (r0 == 0) goto L485
            r2 = r0
            r.m r0 = new r.m
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r12 = r50
            r13 = r52
            r14 = r53
            r15 = r54
            r38 = r2
            r2 = r8
            r8 = r11
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r38
            r2.f6035d = r0
        L485:
            return
    }

    public static final og.i b(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            og.i r1 = new og.i
            r1.<init>(r0, r2)
            return r1
    }

    public static final void c(gg.q r3, i0.j1 r4, gg.u r5, gg.u r6, gg.q r7, wb.o6 r8, java.util.ArrayList r9, android.view.ViewGroup r10, c9.a1 r11) {
            boolean r0 = r3.f4560g
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f4560g = r0
            java.lang.Object r0 = r4.getValue()
            wb.x2 r0 = (wb.x2) r0
            boolean r1 = r0 instanceof wb.u2
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r5.f4564g
            if (r1 == 0) goto L1d
            fg.a r1 = (fg.a) r1
            r1.invoke()
            r9 = r6
            goto L32
        L1d:
            if (r0 != 0) goto L2a
            r2 = r7
            r7 = r5
            r5 = r2
            r2 = r9
            r9 = r6
            r6 = r8
            r8 = r2
            T(r5, r6, r7, r8, r9, r10, r11)
            goto L32
        L2a:
            r9 = r6
            wb.x2 r5 = wb.ho.C4(r0)
            r4.setValue(r5)
        L32:
            java.lang.Object r4 = r9.f4564g
            if (r4 == 0) goto L43
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            a1.a r5 = new a1.a
            r6 = 29
            r5.<init>(r3, r6)
            r4.post(r5)
            return
        L43:
            java.lang.String r3 = "page"
            gg.l.g(r3)
            r3 = 0
            throw r3
    }

    public static final double d(double r14, double r16, double r18, double r20) {
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r2 = r18 * r0
            double r2 = r2 / r14
            double r4 = r16 * r16
            double r6 = r14 * r14
            double r4 = r4 / r6
            double r2 = r2 - r4
            double r2 = r2 / r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r16 * r4
            double r8 = r8 * r16
            double r8 = r8 * r16
            double r10 = r6 * r14
            double r8 = r8 / r10
            r10 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r10 = r10 * r16
            double r10 = r10 * r18
            double r10 = r10 / r6
            double r8 = r8 - r10
            r6 = 4628293042053316608(0x403b000000000000, double:27.0)
            double r10 = r20 * r6
            double r10 = r10 / r14
            double r10 = r10 + r8
            double r10 = r10 / r6
            double r8 = r10 * r10
            r12 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r8 = r8 / r12
            double r12 = r2 * r2
            double r12 = r12 * r2
            double r12 = r12 / r6
            double r12 = r12 + r8
            double r2 = java.lang.Math.sqrt(r12)
            double r6 = -r10
            double r6 = r6 / r4
            double r4 = r6 + r2
            double r4 = java.lang.Math.cbrt(r4)
            double r6 = r6 - r2
            double r2 = java.lang.Math.cbrt(r6)
            double r2 = r2 + r4
            double r14 = r14 * r0
            double r14 = r16 / r14
            double r2 = r2 - r14
            return r2
    }

    public static final java.lang.String e(java.lang.String r0) {
            java.lang.String r0 = p.a.l(r0, r0)
            return r0
    }

    public static qd.m f(ud.u r4) {
            java.lang.String r0 = "java.lang.invoke.MethodHandles.Lookup"
            qd.j r0 = qd.j.x(r0)
            java.lang.String r1 = "java.lang.invoke.MethodHandles"
            qd.j r1 = qd.j.x(r1)
            od.a r1 = od.a.e(r4, r1)
            java.lang.String r2 = "lookup"
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            od.d r4 = od.d.b(r4, r1, r2, r3, r0)
            pd.n r0 = new pd.n
            r1 = 1
            r2 = 0
            r0.<init>(r4, r1, r2)
            qd.m r4 = qd.l.Z(r0)
            return r4
    }

    public static pd.n g(ud.u r6, mc.a r7) {
            java.lang.String r0 = r7.e()
            qd.j r0 = qd.j.z(r0)
            java.util.List r7 = r7.c()
            me.a r1 = new me.a
            r2 = 6
            r1.<init>(r2)
            java.util.List r7 = xe.s.c(r7, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r7.size()
            r3 = 1
            int r2 = r2 + r3
            r1.<init>(r2)
            r1.add(r0)
            r1.addAll(r7)
            java.lang.String r7 = "java.lang.invoke.MethodType"
            qd.j r7 = qd.j.x(r7)
            od.a r0 = od.a.e(r6, r7)
            java.lang.String r2 = "methodType"
            od.d r7 = od.d.b(r6, r0, r2, r1, r7)
            pd.n r0 = new pd.n
            int r2 = r1.size()
            r0.<init>(r7, r3, r2)
            java.util.Iterator r7 = r1.iterator()
        L44:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r7.next()
            qd.j r1 = (qd.j) r1
            r1.getClass()
            boolean r2 = r1 instanceof qd.g
            if (r2 == 0) goto L77
            pd.j r2 = new pd.j
            qd.q r1 = r1.o()
            qd.j r1 = r1.f10921i
            od.a r3 = od.a.e(r6, r1)
            od.c r4 = new od.c
            java.lang.String r5 = "TYPE"
            r4.<init>(r3, r5, r1)
            be.k r1 = r6.f13746e
            od.c r1 = r1.h(r4)
            r3 = 0
            pd.k r4 = pd.k.M
            r2.<init>(r4, r1, r3)
            goto L7c
        L77:
            pd.c r2 = new pd.c
            r2.<init>(r1)
        L7c:
            qd.m r1 = qd.l.Z(r2)
            r0.I(r1)
            goto L44
        L84:
            return r0
    }

    public static d9.a h(java.util.ArrayList r6) {
            r4 = 0
            r5 = 62
            java.lang.String r1 = " "
            r2 = 0
            r3 = 0
            r0 = r6
            java.lang.String r6 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            java.lang.String r0 = "chatting"
            r1 = 0
            boolean r0 = og.m.h0(r6, r0, r1)
            if (r0 == 0) goto L21
            d9.a r6 = d9.a.f2080g
            return r6
        L21:
            java.lang.String r0 = "conversation"
            boolean r0 = og.m.h0(r6, r0, r1)
            if (r0 == 0) goto L2c
            d9.a r6 = d9.a.f2081h
            return r6
        L2c:
            java.lang.String r0 = "addressui"
            boolean r0 = og.m.h0(r6, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "contact"
            boolean r0 = og.m.h0(r6, r0, r1)
            if (r0 == 0) goto L3d
            goto L5f
        L3d:
            java.lang.String r0 = "profile"
            boolean r0 = og.m.h0(r6, r0, r1)
            if (r0 == 0) goto L48
            d9.a r6 = d9.a.f2083j
            return r6
        L48:
            java.lang.String r0 = "sns"
            boolean r0 = og.m.h0(r6, r0, r1)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "moments"
            boolean r6 = og.m.h0(r6, r0, r1)
            if (r6 == 0) goto L59
            goto L5c
        L59:
            d9.a r6 = d9.a.f2085l
            return r6
        L5c:
            d9.a r6 = d9.a.f2084k
            return r6
        L5f:
            d9.a r6 = d9.a.f2082i
            return r6
    }

    public static java.lang.String i(java.lang.String r7) {
            if (r7 == 0) goto Lb
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            goto Lc
        Lb:
            r7 = 0
        Lc:
            java.lang.String r0 = ""
            if (r7 != 0) goto L11
            r7 = r0
        L11:
            int r1 = r7.length()
            if (r1 != 0) goto L18
            goto L64
        L18:
            java.lang.String r1 = "#"
            r2 = 0
            boolean r3 = og.t.d0(r7, r1, r2)
            if (r3 == 0) goto L22
            goto L26
        L22:
            java.lang.String r7 = r1.concat(r7)
        L26:
            r3 = 1
            java.lang.String r7 = r7.substring(r3)
            int r4 = r7.length()
            r5 = 6
            if (r4 == r5) goto L3a
            int r4 = r7.length()
            r5 = 8
            if (r4 != r5) goto L64
        L3a:
            r4 = r2
        L3b:
            int r5 = r7.length()
            if (r4 >= r5) goto L68
            char r5 = r7.charAt(r4)
            r6 = 48
            if (r6 > r5) goto L4e
            r6 = 58
            if (r5 >= r6) goto L4e
            goto L5f
        L4e:
            r6 = 97
            if (r6 > r5) goto L57
            r6 = 103(0x67, float:1.44E-43)
            if (r5 >= r6) goto L57
            goto L5f
        L57:
            r6 = 65
            if (r6 > r5) goto L61
            r6 = 71
            if (r5 >= r6) goto L61
        L5f:
            r5 = r3
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 != 0) goto L65
        L64:
            return r0
        L65:
            int r4 = r4 + 1
            goto L3b
        L68:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r0)
            r7.getClass()
            java.lang.String r7 = r1.concat(r7)
            return r7
    }

    public static java.lang.String j(java.lang.String r8) {
            if (r8 == 0) goto Lb
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            goto Lc
        Lb:
            r8 = 0
        Lc:
            java.lang.String r0 = ""
            if (r8 != 0) goto L11
            r8 = r0
        L11:
            int r1 = r8.length()
            if (r1 != 0) goto L18
            goto L74
        L18:
            r1 = 3
            char[] r1 = new char[r1]
            r1 = {x0082: FILL_ARRAY_DATA , data: [44, 45, -244} // fill-array
            r2 = 6
            java.util.List r8 = og.m.F0(r8, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r8)
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = i(r2)
            r1.add(r2)
            goto L30
        L44:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L62
            r3 = 1
            goto L63
        L62:
            r3 = 0
        L63:
            if (r3 == 0) goto L4d
            r8.add(r2)
            goto L4d
        L69:
            r1 = 2
            java.util.List r2 = tf.m.L1(r1, r8)
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L75
        L74:
            return r0
        L75:
            r6 = 0
            r7 = 62
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r8 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static java.lang.String k(java.lang.String r2) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            r0 = 10
            r1 = 32
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            r0 = 9
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            r0 = 8
            java.lang.String r2 = og.m.P0(r0, r2)
            return r2
    }

    public static final void l(android.content.Context r2) {
            r2.getClass()
            boolean r0 = r2 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto Lb
            android.app.Activity r2 = (android.app.Activity) r2
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L4b
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L19
            android.view.View r2 = r2.getDecorView()
            goto L1a
        L19:
            r2 = r1
        L1a:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L21
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L22
        L21:
            r2 = r1
        L22:
            if (r2 == 0) goto L4b
            android.view.View r2 = s(r2)
            if (r2 == 0) goto L4b
            r0 = 2131099714(0x7f060042, float:1.781179E38)
            java.lang.Object r2 = r2.getTag(r0)
            boolean r0 = r2 instanceof wb.o6
            if (r0 == 0) goto L38
            r1 = r2
            wb.o6 r1 = (wb.o6) r1
        L38:
            if (r1 == 0) goto L4b
            boolean r2 = r1.f18000a
            if (r2 != 0) goto L3f
            goto L4b
        L3f:
            fg.a r2 = r1.f18002c
            if (r2 == 0) goto L44
            goto L46
        L44:
            wb.f6 r2 = r1.f18001b
        L46:
            if (r2 == 0) goto L4b
            r2.invoke()
        L4b:
            return
    }

    public static int m(java.lang.Comparable r0, java.lang.Comparable r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static java.lang.Object n(nc.a r3) {
            if (r3 != 0) goto L3
            goto L10
        L3:
            java.lang.Object r0 = r3.f9342h
            int r3 = r3.f9341g
            int r3 = t3.c.b(r3)
            r1 = 0
            switch(r3) {
                case 0: goto L9e;
                case 1: goto L84;
                case 2: goto L76;
                case 3: goto L68;
                case 4: goto L5a;
                case 5: goto L4c;
                case 6: goto L3f;
                case 7: goto L2d;
                case 8: goto L1c;
                case 9: goto L19;
                case 10: goto L12;
                default: goto L10;
            }
        L10:
            r3 = 0
            return r3
        L12:
            java.lang.String r0 = (java.lang.String) r0
            qd.j r3 = qd.j.z(r0)
            return r3
        L19:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1c:
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            long r0 = java.lang.Double.doubleToLongBits(r0)
            qd.g r3 = qd.j.f10874h
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L2d:
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            long r0 = (long) r3
            qd.g r3 = qd.j.f10873g
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L3f:
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            qd.g r3 = qd.j.f10875i
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L4c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            long r0 = (long) r3
            qd.g r3 = qd.j.f10868b
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L5a:
            java.lang.Character r0 = (java.lang.Character) r0
            char r3 = r0.charValue()
            long r0 = (long) r3
            qd.g r3 = qd.j.f10872f
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L68:
            java.lang.Short r0 = (java.lang.Short) r0
            short r3 = r0.shortValue()
            long r0 = (long) r3
            qd.g r3 = qd.j.f10871e
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L76:
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r3 = r0.byteValue()
            long r0 = (long) r3
            qd.g r3 = qd.j.f10870d
            qd.n r3 = qd.l.S(r0, r3)
            return r3
        L84:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L96
            qd.n r3 = new qd.n
            r0 = 1
            qd.g r2 = qd.j.f10869c
            r3.<init>(r0, r2)
            return r3
        L96:
            qd.n r3 = new qd.n
            qd.g r0 = qd.j.f10869c
            r3.<init>(r1, r0)
            return r3
        L9e:
            qd.e r3 = qd.j.f10877k
            qd.n r3 = qd.l.S(r1, r3)
            return r3
    }

    public static qd.l o(ud.u r6, nc.a r7) {
            java.lang.Object r0 = r7.f9342h
            int r1 = r7.f9341g
            int r2 = t3.c.b(r1)
            r3 = 14
            if (r2 == r3) goto L114
            r3 = 15
            r4 = 0
            if (r2 == r3) goto L59
            switch(r2) {
                case 0: goto L52;
                case 1: goto L3e;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L52;
                case 5: goto L52;
                case 6: goto L52;
                case 7: goto L52;
                case 8: goto L52;
                case 9: goto L32;
                case 10: goto L22;
                default: goto L14;
            }
        L14:
            java.lang.String r6 = j8.b.w(r1)
            java.lang.String r7 = "Unsupported type for raw invoke-custom: "
            java.lang.String r6 = r7.concat(r6)
            ah.a.k(r6)
            return r4
        L22:
            pd.c r6 = new pd.c
            java.lang.String r0 = (java.lang.String) r0
            qd.j r7 = qd.j.z(r0)
            r6.<init>(r7)
            qd.m r6 = qd.l.Z(r6)
            return r6
        L32:
            pd.d r6 = new pd.d
            java.lang.String r0 = (java.lang.String) r0
            r6.<init>(r0)
            qd.m r6 = qd.l.Z(r6)
            return r6
        L3e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            if (r6 == 0) goto L49
            r6 = 0
            goto L4b
        L49:
            r6 = 1
        L4b:
            qd.g r0 = qd.j.f10869c
            qd.n r6 = qd.l.S(r6, r0)
            return r6
        L52:
            java.lang.Object r6 = n(r7)
            qd.l r6 = (qd.l) r6
            return r6
        L59:
            qc.d r0 = (qc.d) r0
            int r7 = r0.b()
            boolean r7 = j8.b.a(r7)
            if (r7 == 0) goto L81
            pd.d r6 = new pd.d
            int r7 = r0.f10860a
            switch(r7) {
                case 0: goto L6d;
                default: goto L6c;
            }
        L6c:
            goto L72
        L6d:
            java.lang.Object r7 = r0.f10862c
            r4 = r7
            jf.d r4 = (jf.d) r4
        L72:
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "FIELD:"
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            goto L10f
        L81:
            jf.h r7 = r0.a()
            r7.a()
            java.lang.String r1 = "java.lang.invoke.MethodHandles.Lookup"
            qd.j r1 = qd.j.x(r1)
            od.a r1 = od.a.e(r6, r1)
            int r0 = r0.b()
            int r2 = t3.c.b(r0)
            switch(r2) {
                case 4: goto Lb0;
                case 5: goto Lad;
                case 6: goto Lad;
                case 7: goto Laa;
                case 8: goto Lad;
                default: goto L9d;
            }
        L9d:
            java.lang.String r0 = j8.b.v(r0)
            java.lang.String r2 = "<"
            java.lang.String r3 = ">"
            java.lang.String r0 = eh.a.n(r2, r0, r3)
            goto Lb2
        Laa:
            java.lang.String r0 = "findConstructor"
            goto Lb2
        Lad:
            java.lang.String r0 = "findVirtual"
            goto Lb2
        Lb0:
            java.lang.String r0 = "findStatic"
        Lb2:
            java.lang.String r2 = "java.lang.invoke.MethodType"
            qd.j r2 = qd.j.x(r2)
            r3 = 3
            qd.j[] r3 = new qd.j[r3]
            qd.e r4 = qd.j.f10878l
            r5 = 0
            r3[r5] = r4
            qd.e r4 = qd.j.f10879m
            r5 = 1
            r3[r5] = r4
            r4 = 2
            r3[r4] = r2
            java.util.List r2 = java.util.Arrays.asList(r3)
            java.lang.String r3 = "java.lang.invoke.MethodHandle"
            qd.j r3 = qd.j.x(r3)
            od.d r0 = od.d.b(r6, r1, r0, r2, r3)
            pd.n r1 = new pd.n
            r2 = 4
            r1.<init>(r0, r4, r2)
            qd.m r0 = f(r6)
            r1.I(r0)
            pd.c r0 = new pd.c
            java.lang.String r2 = r7.f6896c
            qd.j r2 = qd.j.x(r2)
            r0.<init>(r2)
            qd.m r0 = qd.l.Z(r0)
            r1.I(r0)
            pd.d r0 = new pd.d
            java.lang.String r2 = r7.f6895b
            r0.<init>(r2)
            qd.m r0 = qd.l.Z(r0)
            r1.I(r0)
            pd.n r6 = g(r6, r7)
            qd.m r6 = qd.l.Z(r6)
            r1.I(r6)
            r6 = r1
        L10f:
            qd.m r6 = qd.l.Z(r6)
            return r6
        L114:
            mc.a r0 = (mc.a) r0
            pd.n r6 = g(r6, r0)
            qd.m r6 = qd.l.Z(r6)
            return r6
    }

    public static void p(a1.i r6, android.util.LongSparseArray r7) {
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = a1.c.r(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = a1.c.o(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = a1.c.s(r4)
            if (r4 == 0) goto L58
            f.k r5 = r6.h()
            int r2 = (int) r2
            java.lang.Object r2 = r5.b(r2)
            f2.r r2 = (f2.r) r2
            if (r2 == 0) goto L58
            f2.q r2 = r2.f3216a
            if (r2 == 0) goto L58
            f2.m r2 = r2.f3213d
            f2.x r3 = f2.l.f3189l
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            f2.a r2 = (f2.a) r2
            if (r2 == 0) goto L58
            sf.b r2 = r2.f3138b
            fg.l r2 = (fg.l) r2
            if (r2 == 0) goto L58
            i2.g r3 = new i2.g
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
    }

    public static final java.lang.String q(java.util.List r10) {
            r10.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L11:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r10.next()
            r3 = r2
            na.i r3 = (na.i) r3
            java.lang.String r2 = r3.f9144b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r5 = r2.toString()
            int r2 = r5.length()
            if (r2 <= 0) goto L11
            java.lang.CharSequence r2 = og.m.R0(r5)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r4 = og.m.R0(r5)
            java.lang.String r4 = r4.toString()
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r7 = 0
            na.i r3 = na.i.a(r3, r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            goto L11
        L4b:
            java.util.Collection r10 = r1.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L58:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r10.next()
            na.i r1 = (na.i) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r1.f9144b
            java.lang.String r3 = e(r3)
            java.lang.String r4 = "id"
            r2.put(r4, r3)
            java.lang.String r3 = "targetId"
            java.lang.String r4 = r1.f9144b
            r2.put(r3, r4)
            java.lang.String r3 = "label"
            java.lang.String r4 = r1.f9145c
            r2.put(r3, r4)
            java.lang.String r3 = "enabled"
            boolean r4 = r1.f9146d
            r2.put(r3, r4)
            java.lang.String r3 = "templateId"
            java.lang.String r4 = r1.f9147e
            r2.put(r3, r4)
            java.lang.String r3 = "customRules"
            boolean r4 = r1.f9148f
            r2.put(r3, r4)
            na.j r1 = r1.f9149g
            if (r1 == 0) goto La4
            java.lang.String r3 = "overrideRule"
            org.json.JSONObject r1 = U(r1)
            r2.put(r3, r1)
        La4:
            r0.put(r2)
            goto L58
        La8:
            java.lang.String r10 = r0.toString()
            r10.getClass()
            return r10
    }

    public static final java.lang.String r(java.util.List r8) {
            r8.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r8.next()
            na.h r1 = (na.h) r1
            int r2 = r1.f9139b
            if (r2 != 0) goto L1d
            goto Lc
        L1d:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r1.f9138a
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L32
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L32:
            java.lang.String r4 = "id"
            r2.put(r4, r3)
            java.lang.String r3 = "mode"
            int r4 = r1.f9139b
            r2.put(r3, r4)
            java.lang.String r3 = "content"
            java.lang.String r4 = r1.f9140c
            r2.put(r3, r4)
            long r3 = r1.f9141d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4e
            r3 = r5
        L4e:
            java.lang.String r5 = "delayMs"
            r2.put(r5, r3)
            java.lang.String r3 = "random"
            boolean r1 = r1.f9142e
            r2.put(r3, r1)
            r0.put(r2)
            goto Lc
        L5e:
            java.lang.String r8 = r0.toString()
            r8.getClass()
            return r8
    }

    public static android.view.View s(android.view.ViewGroup r4) {
            int r0 = r4.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 < r0) goto Lb
            r4 = 0
            return r4
        Lb:
            android.view.View r1 = r4.getChildAt(r0)
            java.lang.Object r2 = r1.getTag()
            java.lang.String r3 = "Hchat:MiuixSettingsPage"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + (-1)
            goto L6
    }

    public static d9.a t(java.lang.Object r6) {
            if (r6 == 0) goto L61
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.add(r1)
            java.lang.Class r1 = r6.getClass()
            r2 = 0
        L17:
            if (r1 == 0) goto L5c
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5c
            r3 = 3
            if (r2 >= r3) goto L5c
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            java.lang.String r5 = r5.getName()
            r0.add(r5)
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r6)
            if (r4 == 0) goto L2c
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.add(r4)
            goto L2c
        L55:
            java.lang.Class r1 = r1.getSuperclass()
            int r2 = r2 + 1
            goto L17
        L5c:
            d9.a r6 = h(r0)
            return r6
        L61:
            d9.a r6 = d9.a.f2085l
            return r6
    }

    public static int u(byte r1) {
            r0 = 1
            if (r1 != r0) goto L4
            return r0
        L4:
            r0 = 2
            if (r1 != r0) goto L8
            return r0
        L8:
            r0 = 3
            if (r1 != r0) goto Lc
            return r0
        Lc:
            r0 = 4
            if (r1 != r0) goto L10
            return r0
        L10:
            r0 = 5
            if (r1 != r0) goto L14
            return r0
        L14:
            r0 = 6
            if (r1 != r0) goto L18
            return r0
        L18:
            r0 = 7
            if (r1 != r0) goto L1c
            return r0
        L1c:
            r0 = 8
            if (r1 != r0) goto L21
            return r0
        L21:
            r0 = 9
            if (r1 != r0) goto L26
            return r0
        L26:
            r0 = 10
            if (r1 != r0) goto L2b
            return r0
        L2b:
            r0 = 11
            if (r1 != r0) goto L30
            return r0
        L30:
            r0 = 12
            if (r1 != r0) goto L35
            return r0
        L35:
            r0 = 13
            if (r1 != r0) goto L3a
            return r0
        L3a:
            r0 = 14
            if (r1 != r0) goto L3f
            return r0
        L3f:
            r0 = 15
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Unknown AnnotationEncodeValueType: "
            java.lang.String r1 = wb.en.g(r0, r1)
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static bc.d v(ud.e r3) {
            md.a r0 = md.a.f8838s
            md.f r1 = r3.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Ld
            fc.e r3 = bc.d.f707a
            return r3
        Ld:
            ud.u r0 = r3.f13688k
            bc.g r0 = r0.f13742a
            int r1 = r0.U
            int r1 = t3.c.b(r1)
            if (r1 == 0) goto L3a
            r0 = 1
            if (r1 != r0) goto L33
            gd.b r0 = new gd.b
            r0.<init>(r3)
            fd.b r1 = new fd.b
            r2 = 0
            r1.<init>(r0, r2)
            java.lang.Object r3 = X(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            fc.e r0 = new fc.e
            r0.<init>(r3)
            return r0
        L33:
            java.lang.String r3 = "Unknown output format"
            ah.a.k(r3)
            r3 = 0
            return r3
        L3a:
            fd.a r1 = new fd.a
            r1.<init>(r3, r0)
            fd.b r0 = new fd.b
            r2 = 1
            r0.<init>(r1, r2)
            java.lang.Object r3 = X(r3, r0)
            bc.d r3 = (bc.d) r3
            return r3
    }

    public static final k3.a w(android.view.View r2) {
            r0 = 2131099736(0x7f060058, float:1.7811834E38)
            java.lang.Object r1 = r2.getTag(r0)
            k3.a r1 = (k3.a) r1
            if (r1 != 0) goto L13
            k3.a r1 = new k3.a
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            return r1
    }

    public static final android.os.Bundle x(java.lang.String r1, android.os.Bundle r2) {
            android.os.Bundle r2 = r2.getBundle(r1)
            if (r2 == 0) goto L7
            return r2
        L7:
            java.lang.String r2 = "No valid saved state was found for the key '"
            java.lang.String r0 = "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."
            java.lang.String r1 = eh.a.n(r2, r1, r0)
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static final t2.j y(i2.k0 r4, int r5) {
            i2.j0 r0 = r4.f6346a
            i2.o r1 = r4.f6347b
            i2.g r2 = r0.f6334a
            java.lang.String r2 = r2.f6314h
            int r2 = r2.length()
            if (r2 != 0) goto Lf
            goto L35
        Lf:
            int r2 = r1.d(r5)
            if (r5 == 0) goto L1d
            int r3 = r5 + (-1)
            int r3 = r1.d(r3)
            if (r2 == r3) goto L30
        L1d:
            i2.g r0 = r0.f6334a
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            if (r5 == r0) goto L35
            int r0 = r5 + 1
            int r0 = r1.d(r0)
            if (r2 == r0) goto L30
            goto L35
        L30:
            t2.j r4 = r4.a(r5)
            return r4
        L35:
            t2.j r4 = r4.h(r5)
            return r4
    }

    public static boolean z(int r1, java.lang.Object r2) {
            ia.v r2 = O(r2)
            if (r2 == 0) goto L15
            int r0 = r2.f6636b
            if (r0 != r1) goto L15
            int r1 = r2.f6637c
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1 = r1 & r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public abstract void D(java.lang.Throwable r1);

    public abstract void E(hb.c r1);
}
