package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static e9.c a(boolean r8, boolean r9) {
            if (r9 == 0) goto L6
            java.lang.String r0 = "__hchat_custom_notification_default_official__"
        L4:
            r2 = r0
            goto Le
        L6:
            if (r8 == 0) goto Lb
            java.lang.String r0 = "__hchat_custom_notification_default_group__"
            goto L4
        Lb:
            java.lang.String r0 = "__hchat_custom_notification_default_private__"
            goto L4
        Le:
            if (r9 == 0) goto L14
            java.lang.String r0 = "默认公众号通知"
        L12:
            r4 = r0
            goto L1c
        L14:
            if (r8 == 0) goto L19
            java.lang.String r0 = "默认群聊通知"
            goto L12
        L19:
            java.lang.String r0 = "默认私聊通知"
            goto L12
        L1c:
            e9.c r1 = new e9.c
            r7 = 8388544(0x7fffc0, float:1.1754854E-38)
            r3 = r2
            r5 = r8
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public static java.lang.String b(e9.c r5, boolean r6, boolean r7) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "enabled"
            boolean r2 = r5.f2395f
            r0.put(r1, r2)
            java.lang.String r1 = "mode"
            int r2 = r5.f2396g
            r0.put(r1, r2)
            java.lang.String r1 = "vibrate"
            boolean r2 = r5.f2397h
            r0.put(r1, r2)
            java.lang.String r1 = "sound"
            boolean r2 = r5.f2398i
            r0.put(r1, r2)
            java.lang.String r1 = "markRead"
            boolean r2 = r5.f2399j
            r0.put(r1, r2)
            java.lang.String r1 = "quickReply"
            boolean r2 = r5.f2400k
            r0.put(r1, r2)
            java.lang.String r1 = "quoteQuickReply"
            boolean r2 = r5.f2401l
            r0.put(r1, r2)
            java.lang.String r1 = "mergeByTalker"
            boolean r2 = r5.f2402m
            r0.put(r1, r2)
            java.lang.String r1 = "showDetail"
            boolean r2 = r5.f2403n
            r0.put(r1, r2)
            java.lang.String r1 = "ignoreWechatDnd"
            boolean r2 = r5.f2404o
            r0.put(r1, r2)
            java.lang.String r1 = "muteEnable"
            boolean r2 = r5.f2405p
            r0.put(r1, r2)
            java.lang.String r1 = r5.f2406q
            java.lang.String r2 = "23:00:00"
            java.lang.String r1 = e(r1, r2)
            java.lang.String r2 = "muteStart"
            r0.put(r2, r1)
            java.lang.String r1 = r5.f2407r
            java.lang.String r2 = "07:00:00"
            java.lang.String r1 = e(r1, r2)
            java.lang.String r2 = "muteEnd"
            r0.put(r2, r1)
            java.lang.String r1 = "ringtone"
            java.lang.String r2 = r5.f2408s
            r0.put(r1, r2)
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L7f
            if (r7 != 0) goto L7f
            boolean r3 = r5.f2409t
            if (r3 == 0) goto L7f
            r3 = r2
            goto L80
        L7f:
            r3 = r1
        L80:
            java.lang.String r4 = "blockAtAll"
            r0.put(r4, r3)
            if (r6 == 0) goto L8e
            if (r7 != 0) goto L8e
            boolean r5 = r5.f2410u
            if (r5 == 0) goto L8e
            r1 = r2
        L8e:
            java.lang.String r5 = "blockAtMe"
            r0.put(r5, r1)
            java.lang.String r5 = r0.toString()
            r5.getClass()
            return r5
    }

    public static boolean c(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.util.Set r4 = h(r4)
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
            goto La1
        Ld:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = j8.b.l(r0, r5, r0)
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            if (r7 != 0) goto L1e
            java.lang.String r7 = ""
        L1e:
            java.lang.String r7 = r7.toLowerCase(r0)
            r7.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L36
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            goto La1
        L36:
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = j8.b.l(r2, r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r3 = 1
            if (r2 != 0) goto L65
            boolean r2 = r5.equals(r0)
            if (r2 != 0) goto L9b
            boolean r2 = og.m.h0(r5, r0, r1)
            if (r2 != 0) goto L9b
            boolean r2 = og.m.h0(r0, r5, r1)
            if (r2 != 0) goto L9b
        L65:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L7d
            boolean r2 = r6.equals(r0)
            if (r2 != 0) goto L9b
            boolean r2 = og.m.h0(r6, r0, r1)
            if (r2 != 0) goto L9b
            boolean r2 = og.m.h0(r0, r6, r1)
            if (r2 != 0) goto L9b
        L7d:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L9d
            java.lang.String r2 = ":"
            java.lang.String r2 = r0.concat(r2)
            boolean r2 = og.t.d0(r7, r2, r1)
            if (r2 != 0) goto L9b
            java.lang.String r2 = "："
            java.lang.String r0 = r0.concat(r2)
            boolean r0 = og.t.d0(r7, r0, r1)
            if (r0 == 0) goto L9d
        L9b:
            r0 = r3
            goto L9e
        L9d:
            r0 = r1
        L9e:
            if (r0 == 0) goto L3a
            return r3
        La1:
            return r1
    }

    public static java.lang.String d(java.lang.String r6) {
            java.util.Set r6 = h(r6)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            r5 = 62
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            java.lang.String r6 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String e(java.lang.String r2, java.lang.String r3) {
            int r2 = g(r2)
            if (r2 >= 0) goto L7
            return r3
        L7:
            java.util.Locale r3 = java.util.Locale.US
            int r0 = r2 / 3600
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2 / 60
            int r1 = r1 % 60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r2 % 60
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            r0 = 3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "%02d:%02d:%02d"
            java.lang.String r2 = java.lang.String.format(r3, r0, r2)
            return r2
    }

    public static e9.c f(java.lang.String r28, boolean r29, boolean r30, boolean r31) {
            r0 = r28
            java.lang.String r1 = "ignoreWechatDnd"
            if (r0 == 0) goto Lea
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto Le
            goto Lea
        Le:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            e9.c r3 = a(r29, r30)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "enabled"
            boolean r4 = r3.f2395f     // Catch: java.lang.Throwable -> L5e
            boolean r9 = r2.optBoolean(r0, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "mode"
            r4 = 1
            int r10 = r2.optInt(r0, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "vibrate"
            boolean r11 = r2.optBoolean(r0, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "sound"
            boolean r12 = r2.optBoolean(r0, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "markRead"
            boolean r13 = r2.optBoolean(r0, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "quickReply"
            r5 = 0
            boolean r14 = r2.optBoolean(r0, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "quoteQuickReply"
            boolean r15 = r2.optBoolean(r0, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "mergeByTalker"
            boolean r16 = r2.optBoolean(r0, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "showDetail"
            boolean r17 = r2.optBoolean(r0, r4)     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r2.has(r1)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L60
            boolean r0 = r2.optBoolean(r1, r5)     // Catch: java.lang.Throwable -> L5e
            r18 = r0
            goto L62
        L5e:
            r0 = move-exception
            goto Lb0
        L60:
            r18 = r31
        L62:
            java.lang.String r0 = "muteEnable"
            boolean r19 = r2.optBoolean(r0, r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "muteStart"
            java.lang.String r0 = r2.optString(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "23:00:00"
            java.lang.String r20 = e(r0, r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "muteEnd"
            java.lang.String r0 = r2.optString(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "07:00:00"
            java.lang.String r21 = e(r0, r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "ringtone"
            java.lang.String r22 = r2.optString(r0)     // Catch: java.lang.Throwable -> L5e
            r22.getClass()     // Catch: java.lang.Throwable -> L5e
            if (r29 == 0) goto L94
            java.lang.String r0 = "blockAtAll"
            boolean r0 = r2.optBoolean(r0, r5)     // Catch: java.lang.Throwable -> L5e
            r23 = r0
            goto L96
        L94:
            r23 = r5
        L96:
            if (r29 == 0) goto L9e
            java.lang.String r0 = "blockAtMe"
            boolean r5 = r2.optBoolean(r0, r5)     // Catch: java.lang.Throwable -> L5e
        L9e:
            r24 = r5
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            r27 = 31
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            e9.c r0 = e9.c.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L5e
            goto Lb6
        Lb0:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Lb6:
            e9.c r2 = a(r29, r30)
            r25 = 0
            r26 = 8372223(0x7fbfff, float:1.1731983E-38)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r31
            e9.c r1 = e9.c.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Le7
            r0 = r1
        Le7:
            e9.c r0 = (e9.c) r0
            return r0
        Lea:
            e9.c r2 = a(r29, r30)
            r25 = 0
            r26 = 8372223(0x7fbfff, float:1.1731983E-38)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r17 = r31
            e9.c r0 = e9.c.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
    }

    public static int g(java.lang.String r4) {
            if (r4 == 0) goto L72
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L9
            goto L72
        L9:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r4 = og.m.G0(r4, r0)
            int r0 = r4.size()
            r1 = 2
            if (r1 > r0) goto L72
            r2 = 4
            if (r0 >= r2) goto L72
            r0 = 0
            java.lang.Object r2 = r4.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = og.t.f0(r2)
            if (r2 == 0) goto L72
            int r2 = r2.intValue()
            r3 = 1
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r3 = og.t.f0(r3)
            if (r3 == 0) goto L72
            int r3 = r3.intValue()
            java.lang.Object r4 = tf.m.w1(r1, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L5b
            r1 = 10
            java.lang.Integer r4 = og.t.e0(r1, r4)
            if (r4 == 0) goto L5b
            int r0 = r4.intValue()
        L5b:
            if (r2 < 0) goto L72
            r4 = 24
            if (r2 >= r4) goto L72
            if (r3 < 0) goto L72
            r4 = 60
            if (r3 >= r4) goto L72
            if (r0 < 0) goto L72
            if (r0 >= r4) goto L72
            int r2 = r2 * 3600
            int r4 = p.a.g(r3, r4, r2, r0)
            return r4
        L72:
            r4 = -1
            return r4
    }

    public static java.util.Set h(java.lang.String r3) {
            if (r3 == 0) goto L7e
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L7e
        L9:
            r0 = 65292(0xff0c, float:9.1494E-41)
            r1 = 44
            java.lang.String r3 = r3.replace(r0, r1)
            r3.getClass()
            r0 = 65307(0xff1b, float:9.1515E-41)
            java.lang.String r3 = r3.replace(r0, r1)
            r3.getClass()
            r0 = 59
            java.lang.String r3 = r3.replace(r0, r1)
            r3.getClass()
            r0 = 10
            java.lang.String r3 = r3.replace(r0, r1)
            r3.getClass()
            r0 = 1
            char[] r0 = new char[r0]
            r2 = 0
            r0[r2] = r1
            r1 = 6
            java.util.List r3 = og.m.F0(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L49:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L49
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L62
            r3.add(r1)
            goto L62
        L79:
            java.util.Set r3 = tf.m.U1(r3)
            return r3
        L7e:
            tf.v r3 = tf.v.f13169g
            return r3
    }
}
