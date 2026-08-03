package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f2475b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f2476a;

    static {
            java.lang.String r9 = "feedsapp"
            java.lang.String r10 = "blogapp"
            java.lang.String r0 = "filehelper"
            java.lang.String r1 = "fmessage"
            java.lang.String r2 = "tmessage"
            java.lang.String r3 = "qqmail"
            java.lang.String r4 = "weixin"
            java.lang.String r5 = "floatbottle"
            java.lang.String r6 = "medianote"
            java.lang.String r7 = "medianote@chatroom"
            java.lang.String r8 = "masssend"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Set r0 = tf.d0.W(r0)
            e9.s.f2475b = r0
            return
    }

    public s(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lc
            java.lang.String r0 = "Hchat_custom_notification"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f2476a = r2
            return
    }

    public final e9.c a(java.lang.String r28) {
            r27 = this;
            r0 = r27
            java.lang.CharSequence r1 = og.m.R0(r28)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto Le
            java.lang.String r1 = ""
        Le:
            r3 = r1
            boolean r1 = og.m.t0(r3)
            r2 = 0
            if (r1 == 0) goto L17
            goto L27
        L17:
            java.lang.CharSequence r1 = og.m.R0(r3)
            java.lang.String r1 = r1.toString()
            java.util.Set r4 = e9.s.f2475b
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L28
        L27:
            return r2
        L28:
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto L2f
            goto L4f
        L2f:
            java.util.List r1 = r0.d()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            r5 = r4
            e9.c r5 = (e9.c) r5
            java.lang.String r5 = r5.f2391b
            boolean r5 = gg.l.a(r5, r3)
            if (r5 == 0) goto L37
            r2 = r4
        L4d:
            e9.c r2 = (e9.c) r2
        L4f:
            if (r2 == 0) goto L52
            return r2
        L52:
            java.lang.String r1 = "@chatroom"
            r2 = 0
            boolean r1 = og.t.W(r3, r1, r2)
            r4 = 1
            if (r1 != 0) goto L67
            java.lang.String r1 = "@im.chatroom"
            boolean r1 = og.t.W(r3, r1, r2)
            if (r1 == 0) goto L65
            goto L67
        L65:
            r6 = r2
            goto L68
        L67:
            r6 = r4
        L68:
            java.lang.String r1 = "gh_"
            boolean r1 = og.t.d0(r3, r1, r2)
            if (r1 != 0) goto L83
            java.lang.String r1 = "@app"
            boolean r1 = og.t.W(r3, r1, r2)
            if (r1 != 0) goto L83
            java.lang.String r1 = "newsapp"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L81
            goto L83
        L81:
            r7 = r2
            goto L84
        L83:
            r7 = r4
        L84:
            java.lang.String r1 = "custom_notification_ignore_wechat_dnd"
            if (r6 == 0) goto L98
            java.lang.String r5 = "custom_notification_default_group"
            java.lang.String r5 = r0.c(r5)
            boolean r1 = r0.b(r1)
            e9.c r1 = e9.r.f(r5, r4, r2, r1)
        L96:
            r2 = r1
            goto Lb8
        L98:
            if (r7 == 0) goto La9
            java.lang.String r5 = "custom_notification_default_official"
            java.lang.String r5 = r0.c(r5)
            boolean r1 = r0.b(r1)
            e9.c r1 = e9.r.f(r5, r2, r4, r1)
            goto L96
        La9:
            java.lang.String r4 = "custom_notification_default_private"
            java.lang.String r4 = r0.c(r4)
            boolean r1 = r0.b(r1)
            e9.c r1 = e9.r.f(r4, r2, r2, r1)
            goto L96
        Lb8:
            java.lang.String r25 = ""
            r26 = 2097120(0x1fffe0, float:2.938691E-39)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r24 = ""
            r4 = r3
            r5 = r3
            e9.c r1 = e9.c.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
    }

    public final boolean b(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f2476a     // Catch: java.lang.Throwable -> La
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

    public final java.lang.String c(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r2.f2476a     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            java.lang.String r3 = r1.getString(r3, r0)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto Lf
            goto L17
        Ld:
            r3 = move-exception
            goto L11
        Lf:
            r3 = r0
            goto L17
        L11:
            sf.f r1 = new sf.f
            r1.<init>(r3)
            r3 = r1
        L17:
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r3
        L1e:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.util.List d() {
            r35 = this;
            r1 = r35
            java.lang.String r0 = "custom_notification_rules"
            java.lang.String r0 = r1.c(r0)
            java.lang.String r2 = "custom_notification_ignore_wechat_dnd"
            boolean r2 = r1.b(r2)
            java.lang.String r3 = "ignoreWechatDnd"
            boolean r4 = og.m.t0(r0)
            tf.t r5 = tf.t.f13167g
            if (r4 == 0) goto L19
            return r5
        L19:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L52
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L52
            r7 = 0
            r8 = r7
        L29:
            if (r8 < r6) goto L55
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r3.<init>()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L52
        L39:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L151
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L52
            r6 = r4
            e9.c r6 = (e9.c) r6     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.f2391b     // Catch: java.lang.Throwable -> L52
            boolean r6 = r2.add(r6)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L39
            r3.add(r4)     // Catch: java.lang.Throwable -> L52
            goto L39
        L52:
            r0 = move-exception
            goto L14c
        L55:
            org.json.JSONObject r9 = r4.optJSONObject(r8)     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto L148
            java.lang.String r10 = "talker"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L52
            r10.getClass()     // Catch: java.lang.Throwable -> L52
            java.lang.CharSequence r10 = og.m.R0(r10)     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = r10.toString()     // Catch: java.lang.Throwable -> L52
            boolean r10 = og.m.t0(r13)     // Catch: java.lang.Throwable -> L52
            if (r10 == 0) goto L74
            goto L148
        L74:
            java.lang.String r10 = "id"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L52
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto L82
            r12 = r13
            goto L83
        L82:
            r12 = r10
        L83:
            java.lang.String r10 = "label"
            java.lang.String r10 = r9.optString(r10)     // Catch: java.lang.Throwable -> L52
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto L91
            r14 = r13
            goto L92
        L91:
            r14 = r10
        L92:
            java.lang.String r10 = "group"
            java.lang.String r11 = "@chatroom"
            boolean r11 = og.t.W(r13, r11, r7)     // Catch: java.lang.Throwable -> L52
            r15 = 1
            if (r11 != 0) goto La8
            java.lang.String r11 = "@im.chatroom"
            boolean r11 = og.t.W(r13, r11, r7)     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto La6
            goto La8
        La6:
            r11 = r7
            goto La9
        La8:
            r11 = r15
        La9:
            boolean r10 = r9.optBoolean(r10, r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "official"
            boolean r16 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "enabled"
            boolean r17 = r9.optBoolean(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "mode"
            int r18 = r9.optInt(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "vibrate"
            boolean r19 = r9.optBoolean(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "sound"
            boolean r20 = r9.optBoolean(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "markRead"
            boolean r21 = r9.optBoolean(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "quickReply"
            boolean r22 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "quoteQuickReply"
            boolean r23 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "mergeByTalker"
            boolean r24 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "showDetail"
            boolean r25 = r9.optBoolean(r11, r15)     // Catch: java.lang.Throwable -> L52
            boolean r11 = r9.has(r3)     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto Lf6
            boolean r11 = r9.optBoolean(r3, r7)     // Catch: java.lang.Throwable -> L52
            r26 = r11
            goto Lf8
        Lf6:
            r26 = r2
        Lf8:
            java.lang.String r11 = "muteEnable"
            boolean r27 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "muteStart"
            java.lang.String r11 = r9.optString(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r15 = "23:00:00"
            java.lang.String r28 = e9.r.e(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "muteEnd"
            java.lang.String r11 = r9.optString(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r15 = "07:00:00"
            java.lang.String r29 = e9.r.e(r11, r15)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "ringtone"
            java.lang.String r30 = r9.optString(r11)     // Catch: java.lang.Throwable -> L52
            r30.getClass()     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "blockAtAll"
            boolean r31 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "blockAtMe"
            boolean r32 = r9.optBoolean(r11, r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "onlyMembers"
            java.lang.String r11 = r9.optString(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r33 = e9.r.d(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = "blockMembers"
            java.lang.String r9 = r9.optString(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r34 = e9.r.d(r9)     // Catch: java.lang.Throwable -> L52
            e9.c r11 = new e9.c     // Catch: java.lang.Throwable -> L52
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch: java.lang.Throwable -> L52
            r0.add(r11)     // Catch: java.lang.Throwable -> L52
        L148:
            int r8 = r8 + 1
            goto L29
        L14c:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L151:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L156
            goto L157
        L156:
            r5 = r3
        L157:
            java.util.List r5 = (java.util.List) r5
            return r5
    }
}
