package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ck0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f2176 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.ck0.f2176 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1239(java.lang.Object r38, int r39, java.lang.StringBuilder r40, java.util.Set r41) {
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            java.lang.String r0 = "@"
            if (r1 != 0) goto Le
            goto L252
        Le:
            int r5 = r3.length()
            r6 = 12000(0x2ee0, float:1.6816E-41)
            if (r5 < r6) goto L18
            goto L252
        L18:
            boolean r5 = r1 instanceof java.lang.CharSequence
            if (r5 == 0) goto L24
            java.lang.String r0 = r1.toString()
            m1240(r3, r0)
            return
        L24:
            boolean r5 = r1 instanceof java.lang.Number
            if (r5 != 0) goto L253
            boolean r5 = r1 instanceof java.lang.Boolean
            if (r5 != 0) goto L253
            boolean r5 = r1 instanceof java.lang.Enum
            if (r5 == 0) goto L32
            goto L253
        L32:
            boolean r5 = r4.add(r1)
            if (r5 != 0) goto L3a
            goto L252
        L3a:
            java.lang.Class r5 = r1.getClass()
            java.lang.String r7 = r5.getName()
            m1240(r3, r7)
            r7 = 0
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L61
            boolean r9 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L61
            if (r9 != 0) goto L61
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r9.concat(r0)     // Catch: java.lang.Throwable -> L61
            boolean r0 = p000.x02.m6485(r8, r0, r7)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L61
            m1240(r3, r8)     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = 3
            if (r2 < r0) goto L66
            goto L252
        L66:
            boolean r0 = r5.isArray()
            r8 = 30
            r9 = 1
            if (r0 == 0) goto La0
            int r0 = java.lang.reflect.Array.getLength(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L7f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L88
            r0 = r5
        L88:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = java.lang.Math.min(r0, r8)
        L92:
            if (r7 >= r0) goto L252
            java.lang.Object r5 = java.lang.reflect.Array.get(r1, r7)     // Catch: java.lang.Throwable -> L9d
            int r6 = r2 + 1
            m1239(r5, r6, r3, r4)     // Catch: java.lang.Throwable -> L9d
        L9d:
            int r7 = r7 + 1
            goto L92
        La0:
            boolean r0 = r1 instanceof java.util.Map
            r10 = 0
            if (r0 == 0) goto Le9
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lb0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L252
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            int r6 = r7 + 1
            if (r7 >= r8) goto L252
            if (r5 == 0) goto Ld7
            java.lang.String r7 = r5.toString()
            if (r7 == 0) goto Ld7
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r7 = p000.AbstractC0602nx.m4134(r11, r7, r11)
            goto Ld8
        Ld7:
            r7 = r10
        Ld8:
            if (r7 != 0) goto Ldc
            java.lang.String r7 = ""
        Ldc:
            m1241(r3, r7, r1)
            int r7 = r2 + 1
            m1239(r5, r7, r3, r4)
            m1239(r1, r7, r3, r4)
            r7 = r6
            goto Lb0
        Le9:
            boolean r0 = r1 instanceof java.lang.Iterable
            if (r0 == 0) goto L109
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lf4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L252
            java.lang.Object r1 = r0.next()
            int r5 = r7 + 1
            if (r7 >= r8) goto L252
            int r6 = r2 + 1
            m1239(r1, r6, r3, r4)
            r7 = r5
            goto Lf4
        L109:
            java.lang.String r36 = "getUserInfo"
            java.lang.String r37 = "getMember"
            java.lang.String r11 = "getConversationId"
            java.lang.String r12 = "getConversationShortId"
            java.lang.String r13 = "getShortId"
            java.lang.String r14 = "getConversationType"
            java.lang.String r15 = "getUnreadCount"
            java.lang.String r16 = "getName"
            java.lang.String r17 = "getTitle"
            java.lang.String r18 = "getConversationName"
            java.lang.String r19 = "getNickName"
            java.lang.String r20 = "getNickname"
            java.lang.String r21 = "getDisplayName"
            java.lang.String r22 = "getRemark"
            java.lang.String r23 = "getAlias"
            java.lang.String r24 = "getLabel"
            java.lang.String r25 = "getUid"
            java.lang.String r26 = "getUserId"
            java.lang.String r27 = "getSecUid"
            java.lang.String r28 = "getAuthorUid"
            java.lang.String r29 = "getAvatarUid"
            java.lang.String r30 = "getExt"
            java.lang.String r31 = "getLocalExt"
            java.lang.String r32 = "getExtra"
            java.lang.String r33 = "getCoreInfo"
            java.lang.String r34 = "getConversationCoreInfo"
            java.lang.String r35 = "getSingleChatFromUser"
            java.lang.String[] r0 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37}
            r8 = r7
        L144:
            r11 = 27
            if (r8 >= r11) goto L198
            r11 = r0[r8]
            int r12 = r3.length()
            if (r12 < r6) goto L151
            goto L198
        L151:
            java.lang.Class r12 = r1.getClass()     // Catch: java.lang.Throwable -> L194
            java.lang.reflect.Method[] r12 = r12.getMethods()     // Catch: java.lang.Throwable -> L194
            r12.getClass()     // Catch: java.lang.Throwable -> L194
            int r13 = r12.length     // Catch: java.lang.Throwable -> L194
            r14 = r7
        L15e:
            if (r14 >= r13) goto L17b
            r15 = r12[r14]     // Catch: java.lang.Throwable -> L194
            java.lang.String r7 = r15.getName()     // Catch: java.lang.Throwable -> L194
            boolean r7 = p000.ln0.m3626(r7, r11)     // Catch: java.lang.Throwable -> L194
            if (r7 == 0) goto L177
            java.lang.Class[] r7 = r15.getParameterTypes()     // Catch: java.lang.Throwable -> L194
            r7.getClass()     // Catch: java.lang.Throwable -> L194
            int r7 = r7.length     // Catch: java.lang.Throwable -> L194
            if (r7 != 0) goto L177
            goto L17c
        L177:
            int r14 = r14 + 1
            r7 = 0
            goto L15e
        L17b:
            r15 = r10
        L17c:
            if (r15 != 0) goto L17f
            goto L194
        L17f:
            r15.setAccessible(r9)     // Catch: java.lang.Throwable -> L194
            java.lang.Object r7 = r15.invoke(r1, r10)     // Catch: java.lang.Throwable -> L194
            if (r7 != 0) goto L189
            goto L194
        L189:
            m1240(r3, r11)     // Catch: java.lang.Throwable -> L194
            m1242(r3, r11, r7)     // Catch: java.lang.Throwable -> L194
            int r11 = r2 + 1
            m1239(r7, r11, r3, r4)     // Catch: java.lang.Throwable -> L194
        L194:
            int r8 = r8 + 1
            r7 = 0
            goto L144
        L198:
            boolean r0 = m1245(r5)
            if (r0 != 0) goto L1a0
            goto L252
        L1a0:
            r0 = 0
        L1a1:
            if (r5 == 0) goto L252
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L252
            r7 = 5
            if (r0 >= r7) goto L252
            java.lang.reflect.Field[] r7 = r5.getDeclaredFields()
            r7.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r10 = r7.length
            r11 = 0
        L1bc:
            if (r11 >= r10) goto L1d0
            r12 = r7[r11]
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 != 0) goto L1cd
            r8.add(r12)
        L1cd:
            int r11 = r11 + 1
            goto L1bc
        L1d0:
            r7 = 80
            java.util.List r7 = p000.AbstractC0984xh.m6662(r8, r7)
            java.util.Iterator r7 = r7.iterator()
        L1da:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L24a
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            int r10 = r3.length()
            if (r10 < r6) goto L1ed
            goto L252
        L1ed:
            r8.setAccessible(r9)     // Catch: java.lang.Throwable -> L1da
            java.lang.Object r10 = r8.get(r1)     // Catch: java.lang.Throwable -> L1da
            if (r10 != 0) goto L1f7
            goto L1da
        L1f7:
            java.lang.String r11 = r8.getName()     // Catch: java.lang.Throwable -> L1da
            m1240(r3, r11)     // Catch: java.lang.Throwable -> L1da
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L1da
            r8.getClass()     // Catch: java.lang.Throwable -> L1da
            java.util.Locale r11 = java.util.Locale.US     // Catch: java.lang.Throwable -> L1da
            r11.getClass()     // Catch: java.lang.Throwable -> L1da
            java.lang.String r8 = r8.toLowerCase(r11)     // Catch: java.lang.Throwable -> L1da
            r8.getClass()     // Catch: java.lang.Throwable -> L1da
            m1241(r3, r8, r10)     // Catch: java.lang.Throwable -> L1da
            boolean r8 = r10 instanceof java.lang.CharSequence     // Catch: java.lang.Throwable -> L1da
            if (r8 != 0) goto L244
            boolean r8 = r10 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L1da
            if (r8 != 0) goto L244
            boolean r8 = r10 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1da
            if (r8 != 0) goto L244
            boolean r8 = r10 instanceof java.lang.Enum     // Catch: java.lang.Throwable -> L1da
            if (r8 == 0) goto L225
            goto L244
        L225:
            boolean r8 = r10 instanceof java.util.Map     // Catch: java.lang.Throwable -> L1da
            if (r8 != 0) goto L23e
            boolean r8 = r10 instanceof java.lang.Iterable     // Catch: java.lang.Throwable -> L1da
            if (r8 == 0) goto L22e
            goto L23e
        L22e:
            java.lang.Class r8 = r10.getClass()     // Catch: java.lang.Throwable -> L1da
            boolean r8 = m1245(r8)     // Catch: java.lang.Throwable -> L1da
            if (r8 == 0) goto L1da
            int r8 = r2 + 1
            m1239(r10, r8, r3, r4)     // Catch: java.lang.Throwable -> L1da
            goto L1da
        L23e:
            int r8 = r2 + 1
            m1239(r10, r8, r3, r4)     // Catch: java.lang.Throwable -> L1da
            goto L1da
        L244:
            int r8 = r2 + 1
            m1239(r10, r8, r3, r4)     // Catch: java.lang.Throwable -> L1da
            goto L1da
        L24a:
            java.lang.Class r5 = r5.getSuperclass()
            int r0 = r0 + 1
            goto L1a1
        L252:
            return
        L253:
            java.lang.String r0 = r1.toString()
            m1240(r3, r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1240(java.lang.StringBuilder r2, java.lang.String r3) {
            if (r3 == 0) goto L2a
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L9
            goto L2a
        L9:
            int r0 = r2.length()
            r1 = 12000(0x2ee0, float:1.6816E-41)
            if (r0 < r1) goto L12
            goto L2a
        L12:
            r0 = 32
            r2.append(r0)
            int r0 = r3.length()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto L27
            java.lang.String r3 = p000.q02.m4693(r3, r1)
            r2.append(r3)
            return
        L27:
            r2.append(r3)
        L2a:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m1241(java.lang.StringBuilder r3, java.lang.String r4, java.lang.Object r5) {
            if (r5 != 0) goto L4
            goto Lc8
        L4:
            boolean r0 = r5 instanceof java.lang.CharSequence
            if (r0 == 0) goto Ld
            java.lang.String r5 = r5.toString()
            goto L31
        Ld:
            boolean r0 = r5 instanceof java.lang.Number
            if (r0 == 0) goto L18
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.String r5 = r5.toString()
            goto L31
        L18:
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L27
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L31
        L27:
            boolean r0 = r5 instanceof java.lang.Enum
            if (r0 == 0) goto Lc8
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r5 = r5.name()
        L31:
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            boolean r0 = p000.q02.m4671(r5)
            if (r0 == 0) goto L41
            goto Lc8
        L41:
            java.lang.String r0 = "conversation"
            r1 = 0
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            java.lang.String r2 = "id"
            if (r0 == 0) goto L5c
            boolean r0 = p000.q02.m4654(r4, r2, r1)
            if (r0 == 0) goto L5c
            java.lang.String r4 = "cid:"
            java.lang.String r4 = r4.concat(r5)
            m1240(r3, r4)
            return
        L5c:
            java.lang.String r0 = "short"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 == 0) goto L74
            boolean r0 = p000.q02.m4654(r4, r2, r1)
            if (r0 == 0) goto L74
            java.lang.String r4 = "short:"
            java.lang.String r4 = r4.concat(r5)
            m1240(r3, r4)
            return
        L74:
            java.lang.String r0 = "uid"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 != 0) goto Lbf
            java.lang.String r0 = "user_id"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 != 0) goto Lbf
            java.lang.String r0 = "userid"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 == 0) goto L8d
            goto Lbf
        L8d:
            java.lang.String r0 = "name"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = "nick"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = "remark"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = "alias"
            boolean r0 = p000.q02.m4654(r4, r0, r1)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = "title"
            boolean r4 = p000.q02.m4654(r4, r0, r1)
            if (r4 == 0) goto Lc8
        Lb5:
            java.lang.String r4 = "name:"
            java.lang.String r4 = r4.concat(r5)
            m1240(r3, r4)
            return
        Lbf:
            java.lang.String r4 = "uid:"
            java.lang.String r4 = r4.concat(r5)
            m1240(r3, r4)
        Lc8:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m1242(java.lang.StringBuilder r2, java.lang.String r3, java.lang.Object r4) {
            boolean r0 = r4 instanceof java.lang.CharSequence
            if (r0 == 0) goto L9
            java.lang.String r4 = r4.toString()
            goto L2d
        L9:
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L14
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.String r4 = r4.toString()
            goto L2d
        L14:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L23
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L2d
        L23:
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 == 0) goto Ld8
            java.lang.Enum r4 = (java.lang.Enum) r4
            java.lang.String r4 = r4.name()
        L2d:
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L3d
            goto Ld8
        L3d:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = p000.AbstractC0602nx.m4134(r0, r3, r0)
            java.lang.String r0 = "conversationid"
            r1 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lc6
            java.lang.String r0 = "getconversationid"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L56
            goto Lc6
        L56:
            java.lang.String r0 = "conversationshortid"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "shortid"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L67
            goto Lbc
        L67:
            java.lang.String r0 = "uid"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = "userid"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = "user_id"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L80
            goto Lb2
        L80:
            java.lang.String r0 = "name"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La8
            java.lang.String r0 = "nick"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La8
            java.lang.String r0 = "remark"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La8
            java.lang.String r0 = "alias"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La8
            java.lang.String r0 = "title"
            boolean r3 = p000.q02.m4654(r3, r0, r1)
            if (r3 == 0) goto Ld8
        La8:
            java.lang.String r3 = "name:"
            java.lang.String r3 = r3.concat(r4)
            m1240(r2, r3)
            return
        Lb2:
            java.lang.String r3 = "uid:"
            java.lang.String r3 = r3.concat(r4)
            m1240(r2, r3)
            return
        Lbc:
            java.lang.String r3 = "short:"
            java.lang.String r3 = r3.concat(r4)
            m1240(r2, r3)
            return
        Lc6:
            java.lang.String r3 = "cid:"
            java.lang.String r3 = r3.concat(r4)
            m1240(r2, r3)
            java.lang.String r3 = "conversationid:"
            java.lang.String r3 = r3.concat(r4)
            m1240(r2, r3)
        Ld8:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1243(java.lang.Object r5, java.util.Set r6) {
            r0 = 0
            if (r5 == 0) goto L9f
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lb
            goto L9f
        Lb:
            boolean r1 = r5 instanceof java.lang.CharSequence
            if (r1 == 0) goto L14
            java.lang.String r5 = r5.toString()
            goto L64
        L14:
            boolean r1 = r5 instanceof java.lang.Number
            if (r1 != 0) goto L60
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 != 0) goto L60
            boolean r1 = r5 instanceof java.lang.Enum
            if (r1 == 0) goto L21
            goto L60
        L21:
            int r1 = java.lang.System.identityHashCode(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r3 = p000.ck0.f2176
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L35
            r5 = r2
            goto L64
        L35:
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2.getClass()
            m1239(r5, r0, r4, r2)
            java.lang.String r5 = r4.toString()
            int r2 = r3.size()
            r4 = 800(0x320, float:1.121E-42)
            if (r2 <= r4) goto L58
            r3.clear()
        L58:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r1, r5)
            goto L64
        L60:
            java.lang.String r5 = r5.toString()
        L64:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r5 = p000.AbstractC0602nx.m4134(r1, r5, r1)
            boolean r1 = p000.q02.m4671(r5)
            if (r1 == 0) goto L71
            goto L9f
        L71:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L81
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L81
            goto L9f
        L81:
            java.util.Iterator r6 = r6.iterator()
        L85:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = p000.q02.m4671(r1)
            if (r2 != 0) goto L85
            boolean r1 = p000.q02.m4654(r5, r1, r0)
            if (r1 == 0) goto L85
            r5 = 1
            return r5
        L9f:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.Set m1244(java.lang.String r3) {
            java.lang.String r0 = "\r"
            java.lang.String r1 = "\n"
            java.lang.String r3 = p000.x02.m6483(r3, r0, r1)
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x0076: FILL_ARRAY_DATA , data: [10, 44, 59, -244, -229} // fill-array
            r1 = 0
            r2 = 6
            java.util.List r3 = p000.q02.m4682(r3, r0, r1, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.String r2 = "#"
            java.lang.String r1 = p000.q02.m4690(r1, r2, r1)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = java.util.Locale.US
            r2.getClass()
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            r0.add(r1)
            goto L23
        L50:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto L59
            r3.add(r1)
            goto L59
        L70:
            java.util.Set r3 = p000.AbstractC0984xh.m6671(r3)
            return r3
    }

    /* JADX INFO: renamed from: η */
    public static boolean m1245(java.lang.Class r3) {
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "java.lang."
            r2 = 0
            boolean r1 = p000.x02.m6485(r0, r1, r2)
            if (r1 == 0) goto Le
            goto L50
        Le:
            java.lang.String r1 = "java.util."
            boolean r1 = p000.x02.m6485(r0, r1, r2)
            if (r1 == 0) goto L27
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L27
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r3 = r1.isAssignableFrom(r3)
            if (r3 != 0) goto L27
            goto L50
        L27:
            java.lang.String r3 = "~79AD51ECDCE0892D97569325DF07"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 != 0) goto L51
            java.lang.String r3 = "~79A9CCFE43C6F630EAFE1170674919"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 != 0) goto L51
            java.lang.String r3 = "X."
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 != 0) goto L51
            java.lang.String r3 = "kotlin."
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 == 0) goto L50
            goto L51
        L50:
            return r2
        L51:
            r3 = 1
            return r3
    }
}
