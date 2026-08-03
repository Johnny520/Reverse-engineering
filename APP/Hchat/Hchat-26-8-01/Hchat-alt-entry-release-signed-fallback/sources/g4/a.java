package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean A(java.util.ArrayList r3) {
            int r0 = r3.size()
            r1 = 6
            r2 = 0
            if (r0 >= r1) goto L9
            goto L44
        L9:
            java.lang.Object r3 = r3.get(r2)
            nc.a r3 = (nc.a) r3
            int r0 = r3.f9341g
            r1 = 16
            if (r0 == r1) goto L16
            goto L44
        L16:
            java.lang.Object r3 = r3.f9342h
            qc.d r3 = (qc.d) r3
            int r0 = r3.b()
            r1 = 5
            if (r0 == r1) goto L22
            goto L44
        L22:
            jf.h r3 = r3.a()
            java.lang.String r0 = r3.f6896c
            java.lang.String r1 = "Ljava/lang/invoke/LambdaMetafactory;"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L44
        L31:
            java.lang.String r3 = r3.f6895b
            java.lang.String r0 = "metafactory"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "altMetafactory"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L44
            goto L45
        L44:
            return r2
        L45:
            r3 = 1
            return r3
    }

    public static final long B(java.lang.Object r10) {
            r0 = 0
            if (r10 == 0) goto L4d
            java.lang.String r2 = "localId"
            java.lang.String r3 = "id"
            java.lang.String r4 = "field_localId"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            r3 = 0
            r4 = r3
        L10:
            r5 = 3
            if (r4 < r5) goto L14
            return r0
        L14:
            r5 = r2[r4]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r10, r5)
            boolean r6 = r5 instanceof java.lang.Number
            r7 = 0
            if (r6 == 0) goto L22
            java.lang.Number r5 = (java.lang.Number) r5
            goto L23
        L22:
            r5 = r7
        L23:
            if (r5 == 0) goto L4a
            long r5 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r8 = r5.longValue()
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 <= 0) goto L37
            r6 = 1
            goto L38
        L37:
            r6 = r3
        L38:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L43
            r7 = r5
        L43:
            if (r7 == 0) goto L4a
            long r0 = r7.longValue()
            return r0
        L4a:
            int r4 = r4 + 1
            goto L10
        L4d:
            return r0
    }

    public static java.util.List C(java.lang.String r13) {
            tf.t r1 = tf.t.f13167g
            if (r13 == 0) goto L86
            boolean r0 = og.m.t0(r13)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto Lc
            goto L86
        Lc:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L2c
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L2c
            r13.<init>()     // Catch: java.lang.Throwable -> L2c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r4 = r3
        L1c:
            if (r4 < r2) goto L2f
            java.util.Collection r13 = r13.values()     // Catch: java.lang.Throwable -> L2c
            r13.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch: java.lang.Throwable -> L2c
            java.util.List r13 = tf.m.P1(r13)     // Catch: java.lang.Throwable -> L2c
            goto L7d
        L2c:
            r0 = move-exception
            r13 = r0
            goto L77
        L2f:
            org.json.JSONObject r5 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L74
            java.lang.String r6 = "targetId"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L2c
            r6.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            boolean r6 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L4d
            goto L74
        L4d:
            java.lang.String r6 = "label"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L2c
            boolean r7 = og.m.t0(r6)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L5b
            r10 = r8
            goto L5c
        L5b:
            r10 = r6
        L5c:
            java.lang.String r6 = "enabled"
            boolean r12 = r5.optBoolean(r6, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = "templateId"
            java.lang.String r11 = r5.optString(r6)     // Catch: java.lang.Throwable -> L2c
            r11.getClass()     // Catch: java.lang.Throwable -> L2c
            ua.h r7 = new ua.h     // Catch: java.lang.Throwable -> L2c
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L2c
            r13.put(r8, r7)     // Catch: java.lang.Throwable -> L2c
        L74:
            int r4 = r4 + 1
            goto L1c
        L77:
            sf.f r0 = new sf.f
            r0.<init>(r13)
            r13 = r0
        L7d:
            boolean r0 = r13 instanceof sf.f
            if (r0 == 0) goto L83
            goto L84
        L83:
            r1 = r13
        L84:
            java.util.List r1 = (java.util.List) r1
        L86:
            return r1
    }

    public static ua.i D(java.lang.String r42, org.json.JSONObject r43) {
            r0 = r43
            java.lang.String r1 = "notifyText"
            java.lang.String r2 = "已收款 {amount} 元"
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.optString(r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L1e
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L1e:
            r4 = r2
            r4.getClass()
            java.lang.String r2 = "name"
            java.lang.String r2 = r0.optString(r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L31
            r5 = r42
            goto L32
        L31:
            r5 = r2
        L32:
            java.lang.String r2 = "enabled"
            r3 = 0
            boolean r6 = r0.optBoolean(r2, r3)
            java.lang.String r2 = "delayMode"
            int r7 = r0.optInt(r2, r3)
            java.lang.String r2 = "delayMs"
            r8 = 0
            long r10 = r0.optLong(r2, r8)
            java.lang.String r2 = "randomMinMs"
            long r12 = r0.optLong(r2, r8)
            java.lang.String r2 = "randomMaxMs"
            long r8 = r0.optLong(r2, r8)
            java.lang.String r2 = "receiveAccount"
            java.lang.String r14 = "default"
            java.lang.String r14 = r0.optString(r2, r14)
            r14.getClass()
            java.lang.String r2 = "listMode"
            int r15 = r0.optInt(r2, r3)
            java.lang.String r2 = "whitelist"
            java.lang.String r16 = r0.optString(r2)
            r16.getClass()
            java.lang.String r2 = "blacklist"
            java.lang.String r17 = r0.optString(r2)
            r17.getClass()
            java.lang.String r2 = "amountEnabled"
            boolean r18 = r0.optBoolean(r2, r3)
            java.lang.String r2 = "amountCondition"
            r3 = 1
            int r19 = r0.optInt(r2, r3)
            java.lang.String r2 = "amountValue"
            java.lang.String r3 = "0"
            java.lang.String r20 = r0.optString(r2, r3)
            r20.getClass()
            java.lang.String r2 = "amountAction"
            r3 = 0
            int r21 = r0.optInt(r2, r3)
            java.lang.String r2 = "keywordMode"
            int r22 = r0.optInt(r2, r3)
            java.lang.String r2 = "keywords"
            java.lang.String r23 = r0.optString(r2)
            r23.getClass()
            java.lang.String r2 = "quietEnabled"
            boolean r24 = r0.optBoolean(r2, r3)
            java.lang.String r2 = "quietStartSecond"
            int r25 = r0.optInt(r2, r3)
            java.lang.String r2 = "quietEndSecond"
            int r26 = r0.optInt(r2, r3)
            java.lang.String r2 = "refundRejected"
            boolean r27 = r0.optBoolean(r2, r3)
            java.lang.String r2 = "replySteps"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            if (r2 == 0) goto Lc9
            java.lang.String r2 = r2.toString()
            goto Lca
        Lc9:
            r2 = 0
        Lca:
            java.util.List r28 = a7.a.J(r2)
            java.lang.String r2 = "notificationConfigured"
            java.lang.String r3 = "notifySystemEnabled"
            r29 = r4
            boolean r4 = r0.has(r3)
            boolean r2 = r0.optBoolean(r2, r4)
            r4 = 0
            boolean r30 = r0.optBoolean(r3, r4)
            java.lang.String r3 = "notifyToastEnabled"
            boolean r31 = r0.optBoolean(r3, r4)
            java.lang.String r3 = "notifySoundEnabled"
            boolean r32 = r0.optBoolean(r3, r4)
            java.lang.String r3 = "notifySoundMode"
            int r33 = r0.optInt(r3, r4)
            java.lang.String r3 = "notifyVibrateEnabled"
            boolean r34 = r0.optBoolean(r3, r4)
            java.lang.String r3 = "notifySoundUri"
            java.lang.String r35 = r0.optString(r3)
            r35.getClass()
            r1.getClass()
            java.lang.String r3 = "notifyToastText"
            java.lang.String r37 = r0.optString(r3, r1)
            r37.getClass()
            java.lang.String r3 = "announceEnabled"
            boolean r38 = r0.optBoolean(r3, r4)
            java.lang.String r3 = "announceText"
            java.lang.String r4 = "收到转账 {amount} 元"
            java.lang.String r39 = r0.optString(r3, r4)
            r39.getClass()
            ua.i r3 = new ua.i
            r40 = r12
            r12 = r8
            r8 = r10
            r10 = r40
            r36 = r1
            r4 = r29
            r29 = r2
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r3
    }

    public static java.util.List E(java.lang.String r8) {
            tf.t r0 = tf.t.f13167g
            if (r8 == 0) goto L54
            boolean r1 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto Lb
            goto L54
        Lb:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L20
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L20
            uf.c r8 = a.a.E()     // Catch: java.lang.Throwable -> L20
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L20
            r3 = 0
        L19:
            if (r3 < r2) goto L22
            uf.c r8 = a.a.t(r8)     // Catch: java.lang.Throwable -> L20
            goto L4b
        L20:
            r8 = move-exception
            goto L45
        L22:
            org.json.JSONObject r4 = r1.optJSONObject(r3)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L42
            int r5 = r3 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r6.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r7 = "模板 "
            r6.append(r7)     // Catch: java.lang.Throwable -> L20
            r6.append(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L20
            ua.i r4 = D(r5, r4)     // Catch: java.lang.Throwable -> L20
            r8.add(r4)     // Catch: java.lang.Throwable -> L20
        L42:
            int r3 = r3 + 1
            goto L19
        L45:
            sf.f r1 = new sf.f
            r1.<init>(r8)
            r8 = r1
        L4b:
            boolean r1 = r8 instanceof sf.f
            if (r1 == 0) goto L51
            goto L52
        L51:
            r0 = r8
        L52:
            java.util.List r0 = (java.util.List) r0
        L54:
            return r0
    }

    public static final void F(float[] r16, float[] r17, int r18, float[] r19) {
            r0 = r18
            if (r0 != 0) goto L9
            java.lang.String r1 = "At least one point must be provided"
            u1.a.a(r1)
        L9:
            r1 = 2
            if (r1 < r0) goto Le
            int r1 = r0 + (-1)
        Le:
            int r2 = r1 + 1
            float[][] r3 = new float[r2][]
            r4 = 0
            r5 = r4
        L14:
            if (r5 >= r2) goto L1d
            float[] r6 = new float[r0]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L14
        L1d:
            r5 = r4
        L1e:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 >= r0) goto L3c
            r7 = r3[r4]
            r7[r5] = r6
            r6 = 1
        L27:
            if (r6 >= r2) goto L39
            int r7 = r6 + (-1)
            r7 = r3[r7]
            r7 = r7[r5]
            r8 = r16[r5]
            float r7 = r7 * r8
            r8 = r3[r6]
            r8[r5] = r7
            int r6 = r6 + 1
            goto L27
        L39:
            int r5 = r5 + 1
            goto L1e
        L3c:
            float[][] r5 = new float[r2][]
            r7 = r4
        L3f:
            if (r7 >= r2) goto L48
            float[] r8 = new float[r0]
            r5[r7] = r8
            int r7 = r7 + 1
            goto L3f
        L48:
            float[][] r7 = new float[r2][]
            r8 = r4
        L4b:
            if (r8 >= r2) goto L54
            float[] r9 = new float[r2]
            r7[r8] = r9
            int r8 = r8 + 1
            goto L4b
        L54:
            r8 = r4
        L55:
            if (r8 >= r2) goto Lb4
            r9 = r5[r8]
            r10 = r3[r8]
            r10.getClass()
            r9.getClass()
            java.lang.System.arraycopy(r10, r4, r9, r4, r0)
            r10 = r4
        L65:
            if (r10 >= r8) goto L7e
            r11 = r5[r10]
            float r12 = l(r9, r11)
            r13 = r4
        L6e:
            if (r13 >= r0) goto L7b
            r14 = r9[r13]
            r15 = r11[r13]
            float r15 = r15 * r12
            float r14 = r14 - r15
            r9[r13] = r14
            int r13 = r13 + 1
            goto L6e
        L7b:
            int r10 = r10 + 1
            goto L65
        L7e:
            float r10 = l(r9, r9)
            double r10 = (double) r10
            double r10 = java.lang.Math.sqrt(r10)
            float r10 = (float) r10
            r11 = 897988541(0x358637bd, float:1.0E-6)
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 >= 0) goto L90
            r10 = r11
        L90:
            float r10 = r6 / r10
            r11 = r4
        L93:
            if (r11 >= r0) goto L9d
            r12 = r9[r11]
            float r12 = r12 * r10
            r9[r11] = r12
            int r11 = r11 + 1
            goto L93
        L9d:
            r10 = r7[r8]
            r11 = r4
        La0:
            if (r11 >= r2) goto Lb1
            if (r11 >= r8) goto La6
            r12 = 0
            goto Lac
        La6:
            r12 = r3[r11]
            float r12 = l(r9, r12)
        Lac:
            r10[r11] = r12
            int r11 = r11 + 1
            goto La0
        Lb1:
            int r8 = r8 + 1
            goto L55
        Lb4:
            r0 = r1
        Lb5:
            r2 = -1
            if (r2 >= r0) goto Lda
            r2 = r5[r0]
            r3 = r17
            float r2 = l(r2, r3)
            r4 = r7[r0]
            int r6 = r0 + 1
            if (r6 > r1) goto Ld2
            r8 = r1
        Lc7:
            r9 = r4[r8]
            r10 = r19[r8]
            float r9 = r9 * r10
            float r2 = r2 - r9
            if (r8 == r6) goto Ld2
            int r8 = r8 + (-1)
            goto Lc7
        Ld2:
            r4 = r4[r0]
            float r2 = r2 / r4
            r19[r0] = r2
            int r0 = r0 + (-1)
            goto Lb5
        Lda:
            return
    }

    public static final byte[] G(java.io.InputStream r3) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 8192(0x2000, float:1.148E-41)
            int r2 = r3.available()
            int r1 = java.lang.Math.max(r1, r2)
            r0.<init>(r1)
            j(r3, r0)
            byte[] r3 = r0.toByteArray()
            r3.getClass()
            return r3
    }

    public static java.lang.Object H(java.lang.Object r13, java.util.LinkedHashSet r14) {
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L8
            goto L15c
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2}
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r4 = 1
            int r5 = tf.y.a0(r4)
            r3.<init>(r5)
            tf.l.J0(r2, r3)
            java.lang.Class r2 = r13.getClass()
        L27:
            if (r2 == 0) goto L6e
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L6e
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r6, r13)
            if (r6 == 0) goto L39
            boolean r7 = r6 instanceof android.widget.ListView
            if (r7 == 0) goto L5d
            android.widget.ListView r6 = (android.widget.ListView) r6
            int r6 = r6.getHeaderViewsCount()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.add(r6)
            goto L39
        L5d:
            java.lang.String r7 = "com.tencent.mm.plugin.fav.ui.adapter."
            boolean r7 = eh.a.z(r7, r6, r1)
            if (r7 == 0) goto L39
            r0.add(r6)
            goto L39
        L69:
            java.lang.Class r2 = r2.getSuperclass()
            goto L27
        L6e:
            java.util.Iterator r13 = r0.iterator()
        L72:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L15c
            java.lang.Object r0 = r13.next()
            java.lang.Class r2 = r0.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L8d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L8d
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != r4) goto L8d
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r1]
            java.lang.Class r9 = java.lang.Integer.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L8d
            java.lang.Class r8 = r7.getReturnType()
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L8d
            java.lang.Class r7 = r7.getReturnType()
            boolean r7 = r7.isPrimitive()
            if (r7 != 0) goto L8d
            r5.add(r6)
            goto L8d
        Ld3:
            java.util.Iterator r2 = r14.iterator()
        Ld7:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L72
            java.lang.Object r6 = r2.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.util.Iterator r7 = r3.iterator()
        Leb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Ld7
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r8 = r6 - r8
            int r9 = r8 + (-1)
            int r10 = r6 + (-1)
            int[] r8 = new int[]{r9, r8, r10, r6}
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r10 = 4
            int r11 = tf.y.a0(r10)
            r9.<init>(r11)
            r11 = r1
        L110:
            if (r11 >= r10) goto L11e
            r12 = r8[r11]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9.add(r12)
            int r11 = r11 + 1
            goto L110
        L11e:
            java.util.List r8 = tf.m.P1(r9)
            java.util.Iterator r8 = r8.iterator()
        L126:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Leb
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= 0) goto L139
            goto L126
        L139:
            java.util.Iterator r10 = r5.iterator()
        L13d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L126
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invoke(r11, r0, r12)
            boolean r12 = z(r11)
            if (r12 == 0) goto L13d
            return r11
        L15c:
            r13 = 0
            return r13
    }

    public static java.lang.Object I(int r8, java.lang.Object r9, java.util.Set r10) {
            r0 = 0
            if (r9 == 0) goto L17b
            r1 = 4
            if (r8 > r1) goto L17b
            boolean r1 = r10.add(r9)
            if (r1 != 0) goto Le
            goto L17b
        Le:
            boolean r1 = z(r9)
            if (r1 == 0) goto L15
            return r9
        L15:
            boolean r1 = r9 instanceof java.lang.Object[]
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            int r1 = r9.length
        L1d:
            if (r2 >= r1) goto L17b
            r3 = r9[r2]
            int r4 = r8 + 1
            java.lang.Object r3 = I(r4, r3, r10)
            if (r3 == 0) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto L1d
        L2d:
            boolean r1 = r9 instanceof java.util.Collection
            if (r1 == 0) goto L4a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L37:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L17b
            java.lang.Object r1 = r9.next()
            int r2 = r8 + 1
            java.lang.Object r1 = I(r2, r1, r10)
            if (r1 == 0) goto L37
            return r1
        L4a:
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto L5b
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r9 = r9.getTag()
            int r8 = r8 + 1
            java.lang.Object r8 = I(r8, r9, r10)
            return r8
        L5b:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto L17b
            java.lang.String r3 = "android."
            boolean r1 = og.t.d0(r1, r3, r2)
            if (r1 == 0) goto L75
            goto L17b
        L75:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class r4 = r9.getClass()
        L83:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r4 == 0) goto Lca
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto Lca
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r4)
            java.util.Iterator r5 = r5.iterator()
        L95:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lc5
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r6, r9)
            if (r6 == 0) goto L95
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto Lb9
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.add(r6)
            goto L95
        Lb9:
            java.lang.String r7 = "com.tencent.mm.plugin.fav.ui."
            boolean r7 = eh.a.z(r7, r6, r2)
            if (r7 == 0) goto L95
            r3.add(r6)
            goto L95
        Lc5:
            java.lang.Class r4 = r4.getSuperclass()
            goto L83
        Lca:
            java.util.Iterator r2 = r3.iterator()
        Lce:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ldf
            java.lang.Object r3 = r2.next()
            java.lang.Object r3 = H(r3, r1)
            if (r3 == 0) goto Lce
            r0 = r3
        Ldf:
            if (r0 == 0) goto Le2
            return r0
        Le2:
            java.lang.Class r0 = r9.getClass()
        Le6:
            if (r0 == 0) goto L134
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L134
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        Lf6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L12f
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            boolean r3 = r3.isPrimitive()
            if (r3 != 0) goto Lf6
            java.lang.Class r3 = r2.getType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L119
            goto Lf6
        L119:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r9)
            if (r2 == 0) goto Lf6
            boolean r3 = z(r2)
            if (r3 == 0) goto L126
            return r2
        L126:
            int r3 = r8 + 1
            java.lang.Object r2 = I(r3, r2, r10)
            if (r2 == 0) goto Lf6
            return r2
        L12f:
            java.lang.Class r0 = r0.getSuperclass()
            goto Le6
        L134:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.lang.Class r10 = r9.getClass()
        L13d:
            if (r10 == 0) goto L176
            boolean r0 = r10.equals(r5)
            if (r0 != 0) goto L176
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r10)
            java.util.Iterator r0 = r0.iterator()
        L14d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L171
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r9)
            if (r1 == 0) goto L14d
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L14d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.add(r1)
            goto L14d
        L171:
            java.lang.Class r10 = r10.getSuperclass()
            goto L13d
        L176:
            java.lang.Object r8 = H(r9, r8)
            return r8
        L17b:
            return r0
    }

    public static final java.lang.Object J(java.lang.Object r2) {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            java.lang.Object r2 = I(r1, r2, r0)
            return r2
    }

    public static m.a K(java.lang.Class r3) {
            m.a r0 = new m.a
            r6.c r1 = new r6.c
            r6.b r2 = r6.b.f11537g
            r1.<init>(r3, r2)
            r3 = 10
            r0.<init>(r1, r3)
            return r0
    }

    public static final int L(f.v r10) {
            int r0 = r10.f2916b
            r0 = 0
            int r1 = r10.c(r0)
        L7:
            int r2 = r10.f2916b
            if (r2 == 0) goto L5d
            int r2 = r10.c(r0)
            if (r2 != r1) goto L5d
            int r2 = r10.f2916b
            if (r2 == 0) goto L56
            int[] r3 = r10.f2915a
            int r2 = r2 + (-1)
            r2 = r3[r2]
            r10.e(r0, r2)
            int r2 = r10.f2916b
            int r2 = r2 + (-1)
            r10.d(r2)
            int r2 = r10.f2916b
            int r3 = r2 >>> 1
            r4 = r0
        L2a:
            if (r4 >= r3) goto L7
            int r5 = r10.c(r4)
            int r6 = r4 + 1
            int r6 = r6 * 2
            int r7 = r6 + (-1)
            int r8 = r10.c(r7)
            if (r6 >= r2) goto L4c
            int r9 = r10.c(r6)
            if (r9 <= r8) goto L4c
            if (r9 <= r5) goto L7
            r10.e(r4, r9)
            r10.e(r6, r5)
            r4 = r6
            goto L2a
        L4c:
            if (r8 <= r5) goto L7
            r10.e(r4, r8)
            r10.e(r7, r5)
            r4 = r7
            goto L2a
        L56:
            java.lang.String r10 = "IntList is empty."
            j8.o.l(r10)
            r10 = 0
            return r10
        L5d:
            return r1
    }

    public static final java.util.ArrayList M(l0.g r7, int r8, java.lang.Integer r9) {
            x0.j r0 = new x0.j
            r0.<init>(r7)
            int r1 = r7.q(r8)
            l0.b r2 = r7.a(r8)
        Ld:
            if (r8 < 0) goto L3e
            boolean r3 = r7.k(r8)
            if (r3 == 0) goto L1c
            int[] r3 = r7.f7667b
            java.lang.Object r3 = r7.p(r3, r8)
            goto L1e
        L1c:
            i0.e r3 = i0.l.f5952a
        L1e:
            int r4 = r7.i(r8)
            l0.h r5 = r7.f7666a
            l0.c r8 = r5.g(r8)
            r0.m(r4, r3, r8, r9)
            if (r1 < 0) goto L3b
            l0.b r8 = r7.a(r1)
            int r9 = r7.q(r1)
            r6 = r2
            r2 = r8
            r8 = r1
            r1 = r9
            r9 = r6
            goto Ld
        L3b:
            r8 = r1
            r9 = r2
            goto Ld
        L3e:
            java.lang.Object r7 = r0.f3080g
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            return r7
    }

    public static void N(z4.d r2, int r3, long r4) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r0 = 64 - r0
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r1 = r0 * 8
            int r1 = 64 - r1
            long r4 = r4 >> r1
            int r1 = r0 + (-1)
            int r1 = r1 << 5
            r3 = r3 | r1
            r2.j(r3)
        L1a:
            if (r0 <= 0) goto L27
            int r3 = (int) r4
            byte r3 = (byte) r3
            r2.j(r3)
            r3 = 8
            long r4 = r4 >> r3
            int r0 = r0 + (-1)
            goto L1a
        L27:
            return
    }

    public static void O(z4.d r2, int r3, long r4) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r4)
            int r0 = 64 - r0
            if (r0 != 0) goto L9
            r0 = 1
        L9:
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r1 = r0 + (-1)
            int r1 = r1 << 5
            r3 = r3 | r1
            r2.j(r3)
        L15:
            if (r0 <= 0) goto L22
            int r3 = (int) r4
            byte r3 = (byte) r3
            r2.j(r3)
            r3 = 8
            long r4 = r4 >> r3
            int r0 = r0 + (-1)
            goto L15
        L22:
            return
    }

    public static final z0.e a(java.lang.String r1) {
            z0.e r0 = new z0.e
            java.util.Set r1 = ac.p.N(r1)
            r0.<init>(r1)
            return r0
    }

    public static final void b(java.lang.String r34, long r35, long r37, long r39, long r41, long r43, boolean r45, i.c r46, i0.a1 r47, fg.a r48, y0.o r49, u2.f r50, s0.d r51, i0.h0 r52, int r53) {
            r0 = r34
            r1 = r39
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r52
            r4.getClass()
            r5.getClass()
            r10 = -482094145(0xffffffffe343d3bf, float:-3.612373E21)
            r9.b0(r10)
            boolean r10 = r9.f(r0)
            if (r10 == 0) goto L26
            r10 = 4
            goto L27
        L26:
            r10 = 2
        L27:
            r10 = r53 | r10
            r13 = r35
            boolean r15 = r9.e(r13)
            r16 = 16
            if (r15 == 0) goto L36
            r15 = 32
            goto L38
        L36:
            r15 = r16
        L38:
            r10 = r10 | r15
            r15 = 0
            boolean r18 = r9.f(r15)
            r19 = 128(0x80, float:1.8E-43)
            r20 = 256(0x100, float:3.59E-43)
            if (r18 == 0) goto L47
            r18 = r20
            goto L49
        L47:
            r18 = r19
        L49:
            r10 = r10 | r18
            r13 = r37
            boolean r18 = r9.e(r13)
            if (r18 == 0) goto L56
            r18 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r18 = 1024(0x400, float:1.435E-42)
        L58:
            r10 = r10 | r18
            boolean r18 = r9.e(r1)
            if (r18 == 0) goto L63
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L65
        L63:
            r18 = 8192(0x2000, float:1.148E-41)
        L65:
            r10 = r10 | r18
            r13 = r41
            boolean r18 = r9.e(r13)
            if (r18 == 0) goto L72
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L74
        L72:
            r18 = 65536(0x10000, float:9.1835E-41)
        L74:
            r10 = r10 | r18
            r13 = r43
            boolean r18 = r9.e(r13)
            if (r18 == 0) goto L81
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L83
        L81:
            r18 = 524288(0x80000, float:7.34684E-40)
        L83:
            r10 = r10 | r18
            boolean r18 = r9.g(r3)
            if (r18 == 0) goto L8e
            r18 = 8388608(0x800000, float:1.1754944E-38)
            goto L90
        L8e:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L90:
            r10 = r10 | r18
            boolean r18 = r9.h(r4)
            if (r18 == 0) goto L9b
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L9d
        L9b:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L9d:
            r10 = r10 | r18
            boolean r18 = r9.h(r6)
            if (r18 == 0) goto La8
            r17 = 4
            goto Laa
        La8:
            r17 = 2
        Laa:
            r18 = 3072(0xc00, float:4.305E-42)
            r17 = r18 | r17
            boolean r18 = r9.f(r7)
            if (r18 == 0) goto Lb6
            r16 = 32
        Lb6:
            r16 = r17 | r16
            boolean r17 = r9.f(r8)
            if (r17 == 0) goto Lc0
            r19 = r20
        Lc0:
            r12 = r16 | r19
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r10 & r16
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r11) goto Ld5
            r11 = r12 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 == r12) goto Ld3
            goto Ld5
        Ld3:
            r11 = 0
            goto Ld6
        Ld5:
            r11 = 1
        Ld6:
            r12 = r10 & 1
            boolean r11 = r9.S(r12, r11)
            if (r11 == 0) goto L4dd
            i0.m2 r11 = y1.h1.f21959u
            java.lang.Object r11 = r9.j(r11)
            y1.o2 r11 = (y1.o2) r11
            y1.v1 r11 = (y1.v1) r11
            long r11 = r11.a()
            float r11 = u2.h.a(r11)
            boolean r12 = xh.i.a(r9)
            boolean r15 = r9.g(r12)
            java.lang.Object r13 = r9.P()
            i0.e r14 = i0.l.f5952a
            if (r15 != 0) goto L102
            if (r13 != r14) goto L10c
        L102:
            if (r12 == 0) goto L107
            y0.g r13 = y0.b.f21796k
            goto L109
        L107:
            y0.g r13 = y0.b.f21799n
        L109:
            r9.k0(r13)
        L10c:
            y0.c r13 = (y0.c) r13
            i0.m2 r15 = y1.i0.f21966b
            java.lang.Object r15 = r9.j(r15)
            android.content.Context r15 = (android.content.Context) r15
            i0.m2 r0 = y1.h1.f21946h
            java.lang.Object r0 = r9.j(r0)
            u2.c r0 = (u2.c) r0
            float r0 = r0.d()
            r22 = r0
            i0.m2 r0 = y1.i0.f21970f
            java.lang.Object r0 = r9.j(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            boolean r23 = r9.f(r15)
            boolean r24 = r9.f(r0)
            r23 = r23 | r24
            r24 = r0
            java.lang.Object r0 = r9.P()
            if (r23 != 0) goto L14a
            if (r0 != r14) goto L145
            goto L14a
        L145:
            r25 = r10
            r26 = r11
            goto L1ab
        L14a:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android"
            r25 = r10
            java.lang.String r10 = "dimen"
            r26 = r11
            java.lang.String r11 = "rounded_corner_radius_bottom"
            r27 = r15
            r15 = 31
            if (r0 < r15) goto L18f
            if (r24 == 0) goto L177
            android.view.RoundedCorner r0 = a1.c.i(r24)
            if (r0 == 0) goto L177
            int r0 = a1.c.b(r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L16f
            goto L170
        L16f:
            r15 = 0
        L170:
            if (r15 == 0) goto L177
            int r0 = r15.intValue()
            goto L1a4
        L177:
            r27.getClass()
            android.content.res.Resources r0 = r27.getResources()
            int r0 = r0.getIdentifier(r11, r10, r3)
            if (r0 <= 0) goto L18d
            android.content.res.Resources r3 = r27.getResources()
            int r0 = r3.getDimensionPixelSize(r0)
            goto L1a4
        L18d:
            r0 = 0
            goto L1a4
        L18f:
            r27.getClass()
            android.content.res.Resources r0 = r27.getResources()
            int r0 = r0.getIdentifier(r11, r10, r3)
            if (r0 <= 0) goto L18d
            android.content.res.Resources r3 = r27.getResources()
            int r0 = r3.getDimensionPixelSize(r0)
        L1a4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.k0(r0)
        L1ab:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r0 = r0 / r22
            float r3 = u2.h.b(r41)
            boolean r10 = r9.c(r0)
            boolean r3 = r9.c(r3)
            r3 = r3 | r10
            boolean r10 = r9.g(r12)
            r3 = r3 | r10
            java.lang.Object r10 = r9.P()
            if (r3 != 0) goto L1ce
            if (r10 != r14) goto L1f6
        L1ce:
            if (r12 == 0) goto L1d3
            r3 = 0
            float r10 = (float) r3
            goto L1d7
        L1d3:
            float r10 = u2.h.b(r41)
        L1d7:
            float r0 = r0 - r10
            u2.f r3 = new u2.f
            r3.<init>(r0)
            r0 = 32
            float r0 = (float) r0
            u2.f r10 = new u2.f
            r10.<init>(r0)
            int r0 = r3.compareTo(r10)
            if (r0 >= 0) goto L1ec
            r3 = r10
        L1ec:
            u2.f r10 = new u2.f
            float r0 = r3.f13344g
            r10.<init>(r0)
            r9.k0(r10)
        L1f6:
            u2.f r10 = (u2.f) r10
            float r0 = r10.f13344g
            r3 = 0
            f1.r0 r0 = bi.k.b(r0, r9, r3)
            i0.a1 r10 = i0.r.y(r6, r9)
            if (r8 == 0) goto L213
            r11 = 305135435(0x122fff4b, float:5.5534936E-28)
            r9.a0(r11)
            r9.p(r3)
            float r3 = r8.f13344g
        L210:
            r29 = r3
            goto L26c
        L213:
            r3 = 305174774(0x123098f6, float:5.5724347E-28)
            r9.a0(r3)
            java.util.WeakHashMap r3 = p.s1.f9986v
            p.s1 r3 = p.c.e(r9)
            p.b r3 = r3.f9992f
            p.j0 r3 = p.d.d(r3, r9)
            float r3 = r3.c()
            p.s1 r11 = p.c.e(r9)
            p.b r11 = r11.f9987a
            p.j0 r11 = p.d.d(r11, r9)
            float r11 = r11.c()
            p.s1 r15 = p.c.e(r9)
            p.b r15 = r15.f9988b
            p.j0 r15 = p.d.d(r15, r9)
            float r15 = r15.c()
            u2.f r6 = new u2.f
            r6.<init>(r3)
            u2.f r3 = new u2.f
            r3.<init>(r11)
            u2.f r11 = new u2.f
            r11.<init>(r15)
            int r15 = r3.compareTo(r11)
            if (r15 < 0) goto L25b
            goto L25c
        L25b:
            r3 = r11
        L25c:
            int r11 = r6.compareTo(r3)
            if (r11 < 0) goto L264
        L262:
            r3 = 0
            goto L266
        L264:
            r6 = r3
            goto L262
        L266:
            r9.p(r3)
            float r3 = r6.f13344g
            goto L210
        L26c:
            r3 = 420(0x1a4, float:5.89E-43)
            float r3 = (float) r3
            y0.o r3 = p.h1.o(r7, r3)
            if (r12 == 0) goto L27b
            r6 = 1059760811(0x3f2aaaab, float:0.6666667)
            float r11 = r26 * r6
            goto L27d
        L27b:
            r11 = 2143289344(0x7fc00000, float:NaN)
        L27d:
            r6 = 0
            r15 = 1
            y0.o r3 = p.h1.g(r3, r6, r11, r15)
            java.lang.Object r11 = r9.P()
            if (r11 != r14) goto L293
            wb.lp r11 = new wb.lp
            r15 = 26
            r11.<init>(r5, r15)
            r9.k0(r11)
        L293:
            fg.l r11 = (fg.l) r11
            y0.o r3 = v1.w.m(r3, r11)
            y0.l r15 = y0.l.f21818a
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            if (r12 == 0) goto L2d4
            r12 = 305865330(0x123b2272, float:5.9049253E-28)
            r9.a0(r12)
            r12 = r25 & r16
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 == r6) goto L2b4
            boolean r6 = r9.h(r4)
            if (r6 == 0) goto L2b2
            goto L2b4
        L2b2:
            r6 = 0
            goto L2b5
        L2b4:
            r6 = 1
        L2b5:
            java.lang.Object r12 = r9.P()
            if (r6 != 0) goto L2c0
            if (r12 != r14) goto L2be
            goto L2c0
        L2be:
            r6 = 0
            goto L2c9
        L2c0:
            xh.a r12 = new xh.a
            r6 = 0
            r12.<init>(r4, r6)
            r9.k0(r12)
        L2c9:
            fg.l r12 = (fg.l) r12
            y0.o r12 = f1.c0.m(r15, r12)
            r9.p(r6)
            goto L350
        L2d4:
            r6 = 306126536(0x123f1ec8, float:6.0306914E-28)
            r9.a0(r6)
            java.util.WeakHashMap r6 = p.s1.f9986v
            p.s1 r6 = p.c.e(r9)
            p.b r6 = r6.f9991e
            p.j0 r6 = p.d.d(r6, r9)
            float r6 = r6.a()
            p.s1 r12 = p.c.e(r9)
            p.b r12 = r12.f9987a
            p.j0 r12 = p.d.d(r12, r9)
            float r12 = r12.a()
            float r12 = r12 + r6
            float r6 = u2.h.a(r41)
            boolean r22 = r9.c(r12)
            boolean r6 = r9.c(r6)
            r6 = r22 | r6
            java.lang.Object r11 = r9.P()
            if (r6 != 0) goto L30f
            if (r11 != r14) goto L31c
        L30f:
            float r6 = u2.h.a(r41)
            float r6 = r6 + r12
            u2.f r11 = new u2.f
            r11.<init>(r6)
            r9.k0(r11)
        L31c:
            u2.f r11 = (u2.f) r11
            float r6 = r11.f13344g
            boolean r11 = r9.c(r6)
            r12 = r25 & r16
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 == r7) goto L333
            boolean r7 = r9.h(r4)
            if (r7 == 0) goto L331
            goto L333
        L331:
            r7 = 0
            goto L334
        L333:
            r7 = 1
        L334:
            r7 = r7 | r11
            java.lang.Object r11 = r9.P()
            if (r7 != 0) goto L33d
            if (r11 != r14) goto L346
        L33d:
            m.e3 r11 = new m.e3
            r7 = 3
            r11.<init>(r5, r6, r4, r7)
            r9.k0(r11)
        L346:
            fg.l r11 = (fg.l) r11
            y0.o r12 = f1.c0.m(r15, r11)
            r6 = 0
            r9.p(r6)
        L350:
            y0.o r3 = r3.d(r12)
            java.lang.Object r6 = r9.P()
            if (r6 != r14) goto L35f
            xh.h r6 = xh.h.f21692a
            r9.k0(r6)
        L35f:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r6 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r6
            sf.n r7 = sf.n.f12433a
            y0.o r3 = s1.h0.a(r3, r7, r6)
            y0.o r0 = c1.h.b(r3, r0)
            f1.m0 r3 = f1.c0.f3038b
            y0.o r0 = k.n.g(r0, r1, r3)
            float r3 = u2.h.b(r43)
            float r6 = u2.h.a(r43)
            y0.o r0 = p.d.m(r0, r3, r6)
            if (r45 == 0) goto L392
            o9.e r3 = p.d.f9876e
            y0.o r3 = p.d.t(r15, r3)
            o9.e r6 = p.d.f9877f
            y0.o r3 = p.d.t(r3, r6)
            o9.e r6 = p.d.f9878g
            y0.o r3 = p.d.t(r3, r6)
            goto L393
        L392:
            r3 = r15
        L393:
            p.a0 r6 = p.h1.f9915c
            y0.o r3 = r3.d(r6)
            boolean r6 = r9.f(r10)
            java.lang.Object r11 = r9.P()
            if (r6 != 0) goto L3a5
            if (r11 != r14) goto L3ae
        L3a5:
            xh.g r11 = new xh.g
            r6 = 0
            r11.<init>(r10, r6)
            r9.k0(r11)
        L3ae:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r11
            y0.o r3 = s1.h0.a(r3, r7, r11)
            float r6 = u2.h.b(r41)
            r7 = 2
            r10 = 0
            y0.o r27 = p.d.n(r3, r6, r10, r7)
            float r31 = u2.h.a(r41)
            r32 = 5
            r28 = 0
            r30 = 0
            y0.o r3 = p.d.p(r27, r28, r29, r30, r31, r32)
            y0.g r6 = y0.b.f21792g
            r7 = 0
            v1.n0 r6 = p.o.d(r6, r7)
            long r10 = r9.T
            int r7 = java.lang.Long.hashCode(r10)
            s0.h r10 = r9.l()
            y0.o r3 = y0.a.c(r9, r3)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r9.d0()
            boolean r12 = r9.S
            if (r12 == 0) goto L3f3
            r9.k(r11)
            goto L3f6
        L3f3:
            r9.n0()
        L3f6:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r9, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r9, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            x1.e r10 = x1.f.f20887f
            i0.r.t(r9, r7, r10)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r9)
            x1.e r14 = x1.f.f20884c
            i0.r.A(r14, r9, r3)
            y0.o r0 = p.r.a(r0, r13)
            p.e r3 = p.j.f9926c
            y0.e r13 = y0.b.f21804s
            r1 = 0
            p.t r2 = p.s.a(r3, r13, r9, r1)
            long r3 = r9.T
            int r1 = java.lang.Long.hashCode(r3)
            s0.h r3 = r9.l()
            y0.o r0 = y0.a.c(r9, r0)
            r9.d0()
            boolean r4 = r9.S
            if (r4 == 0) goto L439
            r9.k(r11)
            goto L43c
        L439:
            r9.n0()
        L43c:
            i0.r.A(r12, r9, r2)
            i0.r.A(r6, r9, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            i0.r.t(r9, r1, r10)
            i0.r.w(r7, r9)
            i0.r.A(r14, r9, r0)
            if (r34 != 0) goto L45c
            r0 = -573316736(0xffffffffddd3e180, float:-1.9084531E18)
            r9.a0(r0)
            r3 = 0
            r9.p(r3)
            goto L4c2
        L45c:
            r3 = 0
            r0 = -573316735(0xffffffffddd3e181, float:-1.9084533E18)
            r9.a0(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            y0.o r26 = p.h1.d(r15, r0)
            r0 = 12
            float r0 = (float) r0
            r31 = 7
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = r0
            y0.o r1 = p.d.p(r26, r27, r28, r29, r30, r31)
            i0.m2 r0 = bi.m.f920a
            java.lang.Object r0 = r9.j(r0)
            bi.l r0 = (bi.l) r0
            i0.j1 r0 = r0.f919n
            java.lang.Object r0 = r0.getValue()
            i2.n0 r0 = (i2.n0) r0
            i2.f0 r0 = r0.f6365a
            long r6 = r0.f6299b
            r4 = r6
            m2.k r6 = m2.k.f8698j
            t2.k r10 = new t2.k
            r7 = 3
            r10.<init>(r7)
            int r0 = r25 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r2 = 1572912(0x180030, float:2.204119E-39)
            r20 = r0 | r2
            r21 = 0
            r22 = 261032(0x3fba8, float:3.65784E-40)
            r7 = 0
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r0 = r34
            r2 = r35
            r19 = r52
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            r3 = 0
            r9.p(r3)
        L4c2:
            r0 = -572917549(0xffffffffddd9f8d3, float:-1.963317E18)
            r9.a0(r0)
            r9.p(r3)
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r51
            r1.invoke(r9, r0)
            r15 = 1
            r9.p(r15)
            r9.p(r15)
            goto L4e2
        L4dd:
            r1 = r51
            r9.V()
        L4e2:
            i0.r1 r0 = r9.t()
            if (r0 == 0) goto L510
            r2 = r0
            xh.b r0 = new xh.b
            r4 = r37
            r6 = r39
            r8 = r41
            r10 = r43
            r12 = r45
            r13 = r46
            r14 = r47
            r15 = r48
            r16 = r49
            r17 = r50
            r19 = r53
            r18 = r1
            r33 = r2
            r1 = r34
            r2 = r35
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = r33
            r2.f6035d = r0
        L510:
            return
    }

    public static final void c(long r45, long r47, long r49, long r51, long r53, s0.d r55, y0.o r56, java.lang.String r57, boolean r58, fg.a r59, boolean r60, u2.f r61, s0.d r62, i0.h0 r63, int r64, int r65) {
            r11 = r55
            r0 = r63
            r1 = r64
            r2 = r65
            r3 = 1907584495(0x71b36def, float:1.776983E30)
            r0.b0(r3)
            r3 = r1 & 6
            r4 = 1
            if (r3 != 0) goto L1e
            boolean r3 = r0.g(r4)
            if (r3 == 0) goto L1b
            r3 = 4
            goto L1c
        L1b:
            r3 = 2
        L1c:
            r3 = r3 | r1
            goto L1f
        L1e:
            r3 = r1
        L1f:
            r7 = r1 & 48
            r12 = r45
            if (r7 != 0) goto L31
            boolean r7 = r0.e(r12)
            if (r7 == 0) goto L2e
            r7 = 32
            goto L30
        L2e:
            r7 = 16
        L30:
            r3 = r3 | r7
        L31:
            r7 = r1 & 384(0x180, float:5.38E-43)
            r8 = r47
            if (r7 != 0) goto L44
            boolean r17 = r0.e(r8)
            if (r17 == 0) goto L40
            r17 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r17 = 128(0x80, float:1.8E-43)
        L42:
            r3 = r3 | r17
        L44:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L5c
            r6 = r49
            boolean r21 = r0.e(r6)
            if (r21 == 0) goto L57
            r21 = r19
            goto L59
        L57:
            r21 = r18
        L59:
            r3 = r3 | r21
            goto L5e
        L5c:
            r6 = r49
        L5e:
            r10 = r1 & 24576(0x6000, float:3.4438E-41)
            r22 = 8192(0x2000, float:1.148E-41)
            r23 = 16384(0x4000, float:2.2959E-41)
            r4 = r51
            if (r10 != 0) goto L75
            boolean r25 = r0.e(r4)
            if (r25 == 0) goto L71
            r25 = r23
            goto L73
        L71:
            r25 = r22
        L73:
            r3 = r3 | r25
        L75:
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = r1 & r25
            r27 = 65536(0x10000, float:9.1835E-41)
            r28 = 131072(0x20000, float:1.83671E-40)
            r14 = r53
            if (r26 != 0) goto L8e
            boolean r29 = r0.e(r14)
            if (r29 == 0) goto L8a
            r29 = r28
            goto L8c
        L8a:
            r29 = r27
        L8c:
            r3 = r3 | r29
        L8e:
            r29 = 1572864(0x180000, float:2.204052E-39)
            r29 = r1 & r29
            if (r29 != 0) goto La1
            boolean r29 = r0.h(r11)
            if (r29 == 0) goto L9d
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L9f
        L9d:
            r29 = 524288(0x80000, float:7.34684E-40)
        L9f:
            r3 = r3 | r29
        La1:
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r29 = r1 & r29
            r10 = r56
            if (r29 != 0) goto Lb6
            boolean r30 = r0.f(r10)
            if (r30 == 0) goto Lb2
            r30 = 8388608(0x800000, float:1.1754944E-38)
            goto Lb4
        Lb2:
            r30 = 4194304(0x400000, float:5.877472E-39)
        Lb4:
            r3 = r3 | r30
        Lb6:
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r30 = r1 & r30
            r1 = r57
            if (r30 != 0) goto Lcb
            boolean r30 = r0.f(r1)
            if (r30 == 0) goto Lc7
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc9
        Lc7:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        Lc9:
            r3 = r3 | r30
        Lcb:
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r30 = r64 & r30
            r1 = 0
            if (r30 != 0) goto Ldf
            boolean r30 = r0.f(r1)
            if (r30 == 0) goto Ldb
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ldd
        Ldb:
            r30 = 268435456(0x10000000, float:2.524355E-29)
        Ldd:
            r3 = r3 | r30
        Ldf:
            r30 = r2 & 6
            r1 = r58
            if (r30 != 0) goto Lf3
            boolean r31 = r0.g(r1)
            if (r31 == 0) goto Lee
            r31 = 4
            goto Lf0
        Lee:
            r31 = 2
        Lf0:
            r31 = r2 | r31
            goto Lf5
        Lf3:
            r31 = r2
        Lf5:
            r32 = r2 & 48
            r1 = r59
            if (r32 != 0) goto L108
            boolean r32 = r0.h(r1)
            if (r32 == 0) goto L104
            r16 = 32
            goto L106
        L104:
            r16 = 16
        L106:
            r31 = r31 | r16
        L108:
            r43 = r3
            r3 = r2 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L11c
            r3 = 0
            boolean r16 = r0.h(r3)
            if (r16 == 0) goto L118
            r21 = 256(0x100, float:3.59E-43)
            goto L11a
        L118:
            r21 = 128(0x80, float:1.8E-43)
        L11a:
            r31 = r31 | r21
        L11c:
            r3 = r2 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L12d
            r3 = r60
            boolean r16 = r0.g(r3)
            if (r16 == 0) goto L12a
            r18 = r19
        L12a:
            r31 = r31 | r18
            goto L12f
        L12d:
            r3 = r60
        L12f:
            r3 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L140
            r3 = r61
            boolean r16 = r0.f(r3)
            if (r16 == 0) goto L13d
            r22 = r23
        L13d:
            r31 = r31 | r22
            goto L142
        L140:
            r3 = r61
        L142:
            r16 = r2 & r25
            r2 = r62
            if (r16 != 0) goto L152
            boolean r16 = r0.h(r2)
            if (r16 == 0) goto L150
            r27 = r28
        L150:
            r31 = r31 | r27
        L152:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r43 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L169
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r31 & r2
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r2 == r3) goto L167
            goto L169
        L167:
            r2 = 0
            goto L16a
        L169:
            r2 = 1
        L16a:
            r3 = r43 & 1
            boolean r2 = r0.S(r3, r2)
            if (r2 == 0) goto L2ff
            java.lang.Object r2 = r0.P()
            r3 = 0
            i0.e r5 = i0.l.f5952a
            if (r2 != r5) goto L185
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            i.c r2 = i.d.a(r3, r2)
            r0.k0(r2)
        L185:
            i.c r2 = (i.c) r2
            java.lang.Object r4 = r0.P()
            r6 = 1008981770(0x3c23d70a, float:0.01)
            if (r4 != r5) goto L197
            i.c r4 = i.d.a(r3, r6)
            r0.k0(r4)
        L197:
            i.c r4 = (i.c) r4
            r7 = 0
            i0.a1 r3 = i0.r.y(r7, r0)
            java.lang.Object r7 = r0.P()
            if (r7 != r5) goto L1ad
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            i0.j1 r7 = i0.r.u(r7)
            r0.k0(r7)
        L1ad:
            r32 = r7
            i0.a1 r32 = (i0.a1) r32
            i0.m2 r7 = y1.h1.f21946h
            java.lang.Object r7 = r0.j(r7)
            u2.c r7 = (u2.c) r7
            java.util.WeakHashMap r18 = p.s1.f9986v
            p.s1 r6 = p.c.e(r0)
            p.b r6 = r6.f9989c
            i0.m2 r8 = y1.h1.f21955q
            java.lang.Object r8 = r0.j(r8)
            y1.g2 r8 = (y1.g2) r8
            boolean r9 = xh.i.a(r0)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r12 = r43 & 14
            r13 = 4
            if (r12 != r13) goto L1d6
            r12 = 1
            goto L1d7
        L1d6:
            r12 = 0
        L1d7:
            boolean r13 = r0.h(r4)
            r12 = r12 | r13
            boolean r13 = r0.h(r2)
            r12 = r12 | r13
            boolean r13 = r0.g(r9)
            r12 = r12 | r13
            boolean r13 = r0.f(r6)
            r12 = r12 | r13
            boolean r13 = r0.f(r7)
            r12 = r12 | r13
            boolean r13 = r0.f(r8)
            r12 = r12 | r13
            boolean r13 = r0.f(r3)
            r12 = r12 | r13
            java.lang.Object r13 = r0.P()
            if (r12 != 0) goto L20a
            if (r13 != r5) goto L203
            goto L20a
        L203:
            r33 = r2
            r38 = r4
            r34 = r9
            goto L224
        L20a:
            wb.zp r31 = new wb.zp
            r40 = 0
            r33 = r2
            r39 = r3
            r38 = r4
            r35 = r6
            r36 = r7
            r37 = r8
            r34 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r13 = r31
            r0.k0(r13)
        L224:
            fg.p r13 = (fg.p) r13
            i0.r.f(r13, r0, r10)
            java.lang.Object r2 = r0.P()
            if (r2 != r5) goto L236
            qg.t r2 = i0.r.n(r0)
            r0.k0(r2)
        L236:
            qg.t r2 = (qg.t) r2
            java.lang.Object r3 = r0.P()
            if (r3 != r5) goto L248
            i0.f1 r3 = new i0.f1
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4)
            r0.k0(r3)
        L248:
            i0.f1 r3 = (i0.f1) r3
            java.lang.Object r4 = r0.P()
            if (r4 != r5) goto L259
            i0.g1 r4 = new i0.g1
            r6 = 0
            r4.<init>(r6)
            r0.k0(r4)
        L259:
            r39 = r4
            i0.g1 r39 = (i0.g1) r39
            java.lang.Object r4 = r0.P()
            if (r4 != r5) goto L26e
            r6 = 1008981770(0x3c23d70a, float:0.01)
            r8 = 0
            i.c r4 = i.d.a(r8, r6)
            r0.k0(r4)
        L26e:
            i.c r4 = (i.c) r4
            i0.a1 r6 = i0.r.y(r1, r0)
            i0.m2 r8 = y1.h1.f21959u
            java.lang.Object r8 = r0.j(r8)
            y1.o2 r8 = (y1.o2) r8
            y1.v1 r8 = (y1.v1) r8
            long r8 = r8.a()
            float r8 = u2.h.a(r8)
            float r26 = r7.x0(r8)
            boolean r7 = r0.f(r6)
            java.lang.Object r8 = r0.P()
            if (r7 != 0) goto L296
            if (r8 != r5) goto L29f
        L296:
            wb.ht r8 = new wb.ht
            r10 = 1
            r8.<init>(r6, r10)
            r0.k0(r8)
        L29f:
            r19 = r8
            fg.a r19 = (fg.a) r19
            boolean r6 = r0.h(r4)
            java.lang.Object r7 = r0.P()
            if (r6 != 0) goto L2af
            if (r7 != r5) goto L2b9
        L2af:
            b0.g r7 = new b0.g
            r5 = 0
            r6 = 2
            r7.<init>(r4, r3, r5, r6)
            r0.k0(r7)
        L2b9:
            r18 = r7
            fg.l r18 = (fg.l) r18
            java.lang.Object r5 = r32.getValue()
            xh.c r16 = new xh.c
            r28 = r45
            r30 = r47
            r23 = r56
            r27 = r57
            r21 = r58
            r40 = r61
            r42 = r62
            r17 = r2
            r41 = r3
            r20 = r4
            r36 = r14
            r24 = r33
            r25 = r34
            r22 = r38
            r32 = r49
            r34 = r51
            r38 = r60
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41, r42)
            r2 = r16
            r3 = -1052785207(0xffffffffc13fc5c9, float:-11.985787)
            s0.d r2 = s0.i.e(r3, r2, r0)
            int r3 = r43 >> 12
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.c(r5, r2, r0, r3)
            goto L302
        L2ff:
            r0.V()
        L302:
            i0.r1 r0 = r0.t()
            if (r0 == 0) goto L32f
            r2 = r0
            xh.d r0 = new xh.d
            r3 = r47
            r5 = r49
            r7 = r51
            r9 = r53
            r12 = r56
            r13 = r57
            r14 = r58
            r16 = r60
            r17 = r61
            r18 = r62
            r19 = r64
            r20 = r65
            r15 = r1
            r44 = r2
            r1 = r45
            r0.<init>(r1, r3, r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = r44
            r2.f6035d = r0
        L32f:
            return
    }

    public static final long d(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static final void e(f.v r3, int r4) {
            int r0 = r3.f2916b
            if (r0 == 0) goto L16
            r0 = 0
            int r0 = r3.c(r0)
            if (r0 == r4) goto L15
            int r0 = r3.f2916b
            int r0 = r0 + (-1)
            int r0 = r3.c(r0)
            if (r0 != r4) goto L16
        L15:
            return
        L16:
            int r0 = r3.f2916b
            r3.a(r4)
        L1b:
            if (r0 <= 0) goto L2e
            int r1 = r0 + 1
            int r1 = r1 >>> 1
            int r1 = r1 + (-1)
            int r2 = r3.c(r1)
            if (r4 <= r2) goto L2e
            r3.e(r0, r2)
            r0 = r1
            goto L1b
        L2e:
            r3.e(r0, r4)
            return
    }

    public static final void f(m.a r17, s1.t r18, long r19) {
            r0 = r18
            r1 = r17
            r2 = r19
            java.lang.Object r1 = r1.f8069h
            t1.b r1 = (t1.b) r1
            r1.getClass()
            t1.d r4 = r1.f12981b
            t1.d r5 = r1.f12980a
            boolean r6 = s1.s.b(r0)
            long r7 = r0.f12292b
            r9 = 0
            r11 = 0
            r12 = 0
            if (r6 == 0) goto L2d
            t1.a[] r6 = r5.f12989d
            tf.l.x0(r11, r6)
            r5.f12990e = r12
            t1.a[] r6 = r4.f12989d
            tf.l.x0(r11, r6)
            r4.f12990e = r12
            r1.f12982c = r9
        L2d:
            boolean r6 = s1.s.d(r0)
            if (r6 != 0) goto L64
            java.util.ArrayList r6 = r0.f12303m
            if (r6 != 0) goto L39
            tf.t r6 = tf.t.f13167g
        L39:
            int r13 = r6.size()
            r14 = r12
        L3e:
            if (r14 >= r13) goto L5b
            java.lang.Object r15 = r6.get(r14)
            s1.c r15 = (s1.c) r15
            long r9 = r15.f12210a
            r16 = r13
            long r12 = r15.f12214e
            long r12 = e1.b.e(r12, r2)
            r1.a(r9, r12)
            int r14 = r14 + 1
            r13 = r16
            r9 = 0
            r12 = 0
            goto L3e
        L5b:
            long r9 = r0.f12304n
            long r2 = e1.b.e(r9, r2)
            r1.a(r7, r2)
        L64:
            boolean r0 = s1.s.d(r0)
            if (r0 == 0) goto L87
            long r2 = r1.f12982c
            long r2 = r7 - r2
            r9 = 40
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L87
            t1.a[] r0 = r5.f12989d
            tf.l.x0(r11, r0)
            r0 = 0
            r5.f12990e = r0
            t1.a[] r2 = r4.f12989d
            tf.l.x0(r11, r2)
            r4.f12990e = r0
            r2 = 0
            r1.f12982c = r2
        L87:
            r1.f12982c = r7
            return
    }

    public static pd.l g(ud.r r17, gf.a r18, boolean r19, java.util.ArrayList r20) {
            r0 = r17
            r1 = r20
            ud.e r2 = r0.f13718l
            r3 = 4
            java.lang.Object r3 = r1.get(r3)
            nc.a r3 = (nc.a) r3
            java.lang.Object r3 = r3.f9342h
            qc.d r3 = (qc.d) r3
            int r4 = r3.b()
            boolean r4 = j8.b.a(r4)
            if (r4 != 0) goto L137
            ud.u r4 = r2.f13688k
            r5 = 2
            java.lang.Object r5 = r1.get(r5)
            nc.a r5 = (nc.a) r5
            java.lang.Object r5 = r5.f9342h
            mc.a r5 = (mc.a) r5
            od.a r6 = r2.f13690m
            java.lang.String r7 = ""
            od.d r9 = od.d.c(r4, r6, r7, r5)
            int r5 = r3.b()
            pd.l r8 = new pd.l
            r12 = 0
            r11 = 7
            r10 = r18
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13)
            r8.f10519r = r5
            qd.j r6 = r9.f9778h
            od.a r6 = od.a.e(r4, r6)
            r7 = 1
            java.lang.Object r9 = r1.get(r7)
            nc.a r9 = (nc.a) r9
            java.lang.Object r9 = r9.f9342h
            java.lang.String r9 = (java.lang.String) r9
            r10 = 3
            java.lang.Object r10 = r1.get(r10)
            nc.a r10 = (nc.a) r10
            java.lang.Object r10 = r10.f9342h
            mc.a r10 = (mc.a) r10
            od.d r6 = od.d.c(r4, r6, r9, r10)
            r8.f10518q = r6
            jf.h r3 = r3.a()
            od.d r3 = od.d.d(r4, r3)
            int r6 = r9.e0.w(r5)
            java.util.List r9 = r3.f9779i
            int r10 = r9.size()
            r11 = 0
            if (r6 == r7) goto L7a
            r12 = r7
            goto L7b
        L7a:
            r12 = r11
        L7b:
            if (r12 == 0) goto L7f
            int r10 = r10 + 1
        L7f:
            pd.n r13 = new pd.n
            r13.<init>(r3, r6, r10)
            java.util.List r6 = r8.f13715m
            int r14 = r6.size()
        L8a:
            if (r11 >= r14) goto L9a
            qd.l r15 = r8.S(r11)
            qd.l r15 = r15.H()
            r13.I(r15)
            int r11 = r11 + 1
            goto L8a
        L9a:
            if (r10 <= r14) goto Lca
            if (r12 == 0) goto La1
            int r11 = r14 + (-1)
            goto La2
        La1:
            r11 = r14
        La2:
            if (r14 >= r10) goto Lca
            if (r11 >= 0) goto Lab
            od.a r12 = r3.f9780j
            qd.j r12 = r12.f9765g
            goto Lb8
        Lab:
            int r12 = r11 + 1
            java.lang.Object r11 = r9.get(r11)
            qd.j r11 = (qd.j) r11
            r16 = r12
            r12 = r11
            r11 = r16
        Lb8:
            qd.p r15 = new qd.p
            java.lang.String r7 = "v"
            java.lang.String r7 = eh.a.l(r14, r7)
            r15.<init>(r7, r12)
            r13.I(r15)
            int r14 = r14 + 1
            r7 = 1
            goto La2
        Lca:
            r7 = 8
            if (r5 != r7) goto Ld8
            td.a r5 = new td.a
            od.d r7 = r13.f10526p
            r5.<init>(r0, r13, r7)
            r8.f10520s = r5
            goto Lda
        Ld8:
            r8.f10520s = r13
        Lda:
            ud.r r0 = r4.i(r3)
            if (r0 == 0) goto Lfd
            pd.b r3 = r8.f10520s
            r3.y(r0)
            b5.k r3 = r0.f13719m
            boolean r3 = r3.i()
            if (r3 == 0) goto Lfd
            ud.e r3 = r0.f13718l
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lfd
            md.a r2 = md.a.f8838s
            r0.w(r2)
            r0 = 1
            r8.f10521t = r0
        Lfd:
            boolean r0 = r8.f10521t
            if (r0 != 0) goto L120
            r0 = 5
            java.lang.Object r0 = r1.get(r0)
            nc.a r0 = (nc.a) r0
            java.lang.Object r0 = r0.f9342h
            mc.a r0 = (mc.a) r0
            java.util.List r0 = r0.c()
            me.a r1 = new me.a
            r2 = 6
            r1.<init>(r2)
            java.util.List r0 = xe.s.c(r0, r1)
            boolean r0 = r0.equals(r9)
            r8.f10522u = r0
        L120:
            java.util.Iterator r0 = r6.iterator()
        L124:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L136
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            md.a r2 = md.a.f8836q
            r1.w(r2)
            goto L124
        L136:
            return r8
        L137:
            java.lang.String r0 = "Not yet supported"
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public static final java.util.List h(l0.k r5, java.lang.Integer r6, int r7, java.lang.Integer r8) {
            boolean r0 = r5.f7716w
            if (r0 != 0) goto L9d
            int r0 = r5.p()
            if (r0 == 0) goto L9d
            x0.j r0 = new x0.j
            r0.<init>(r5)
            if (r8 == 0) goto L16
            int r8 = r8.intValue()
            goto L20
        L16:
            int r8 = r5.f7715v
            if (r8 >= 0) goto L20
            int[] r8 = r5.f7695b
            int r8 = r5.E(r8, r7)
        L20:
            if (r6 != 0) goto L44
            int r6 = r5.f7702i
            int[] r1 = r5.f7695b
            int r2 = r5.r(r7)
            int r1 = r5.N(r1, r2)
            int r6 = r6 - r1
            f.w r1 = r5.f7712s
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.b(r7)
            f.f0 r1 = (f.f0) r1
            if (r1 == 0) goto L3e
            int r1 = r1.f2804b
            goto L3f
        L3e:
            r1 = 0
        L3f:
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L44:
            int r1 = r5.r(r7)
            int r1 = r1 * 5
            int[] r2 = r5.f7695b
            int r3 = r2.length
            if (r1 >= r3) goto L54
            int r1 = r5.s(r7)
            goto L61
        L54:
            if (r8 < 0) goto L5b
            int r7 = r5.E(r2, r8)
            goto L5c
        L5b:
            r7 = r8
        L5c:
            int r1 = r5.s(r8)
            goto L92
        L61:
            if (r7 < 0) goto L98
            int r2 = r5.r(r7)
            int[] r3 = r5.f7695b
            int r2 = r2 * 5
            int r2 = r2 + 1
            r2 = r3[r2]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 == 0) goto L79
            java.lang.Object r2 = r5.t(r7)
            goto L7b
        L79:
            i0.e r2 = i0.l.f5952a
        L7b:
            l0.c r3 = r5.O(r7)
            r0.m(r1, r2, r3, r6)
            l0.b r6 = r5.b(r7)
            if (r8 < 0) goto L96
            int[] r7 = r5.f7695b
            int r7 = r5.E(r7, r8)
            int r1 = r5.s(r8)
        L92:
            r4 = r8
            r8 = r7
            r7 = r4
            goto L61
        L96:
            r7 = r8
            goto L61
        L98:
            java.lang.Object r5 = r0.f3080g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            return r5
        L9d:
            tf.t r5 = tf.t.f13167g
            return r5
    }

    public static void i(ud.r r14) {
            md.a r0 = md.a.f8830l0
            md.f r1 = r14.f8877g
            boolean r0 = r1.a(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.List r0 = r14.f13732z     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            be.m0 r2 = new be.m0     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r3 = 3
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r3 = r14.C     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ae.d r4 = new ae.d     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r5 = 27
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            a.a.d1(r14, r3, r4, r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int[] r3 = new int[r0]     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r4 = 0
            r5 = r4
        L30:
            if (r5 >= r2) goto L48
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r6 = (ud.a) r6     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r6 = r6.f13672j     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r3[r5] = r6     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r5 = r5 + 1
            goto L30
        L3f:
            r0 = move-exception
            goto L116
        L42:
            r0 = move-exception
            goto L10d
        L45:
            r0 = move-exception
            goto L10d
        L48:
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r6 = r4
        L4d:
            if (r6 >= r5) goto L5a
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r7 = (ud.a) r7     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r7.f13672j = r6     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r6 = r6 + 1
            goto L4d
        L5a:
            ae.d r5 = new ae.d     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r6 = 28
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a[] r5 = f8.i.h(r1, r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.lang.Object r6 = r1.get(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r6 = (ud.a) r6     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            xe.g r7 = xe.g.f21560g     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r6.f13679q = r7     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r7 = 0
            r6.f13682t = r7     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r6 = 1
            r8 = r6
        L74:
            if (r8 >= r2) goto La1
            java.lang.Object r9 = r1.get(r8)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r9 = (ud.a) r9     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r10 = r5[r8]     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r9.f13682t = r10     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.BitSet r11 = new java.util.BitSet     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r12 = r5.length     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
        L86:
            int r12 = r10.f13672j     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            boolean r13 = r11.get(r12)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            if (r13 == 0) goto L8f
            goto L99
        L8f:
            r11.set(r12)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.BitSet r10 = r10.f13678p     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            if (r10 == 0) goto L9e
            r11.or(r10)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
        L99:
            r9.f13679q = r11     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r8 = r8 + 1
            goto L74
        L9e:
            r10 = r5[r12]     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            goto L86
        La1:
            if (r6 >= r2) goto Lc6
            java.lang.Object r5 = r1.get(r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r5 = (ud.a) r5     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.BitSet r8 = new java.util.BitSet     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.BitSet r9 = r5.f13679q     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.stream.IntStream r9 = r9.stream()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ce.q r10 = new ce.q     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r10.<init>(r8, r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r9.forEach(r10)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r9 = r3[r6]     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r8.clear(r9)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r5.f13679q = r8     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r6 = r6 + 1
            goto La1
        Lc6:
            int r0 = r0 - r2
            if (r0 == 0) goto L109
            java.util.List r1 = r14.f13732z     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
        Lcf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            if (r2 == 0) goto Led
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            ud.a r2 = (ud.a) r2     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.BitSet r3 = r2.f13679q     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            if (r3 != 0) goto Lcf
            xe.g r3 = xe.g.f21560g     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r2.f13679q = r3     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r2.f13682t = r7     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.util.ArrayList r2 = r2.f13674l     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            int r4 = r4 + r2
            goto Lcf
        Led:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r1.<init>()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.lang.String r2 = "Infinite loop detected, blocks: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.lang.String r0 = ", insns: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r1.append(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
            r14.J(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42 java.lang.StackOverflowError -> L45
        L109:
            r14.f0()
            return
        L10d:
            java.lang.String r1 = "Failed to build post-dominance tree"
            r14.M(r1, r0)     // Catch: java.lang.Throwable -> L3f
            r14.f0()
            return
        L116:
            r14.f0()
            throw r0
    }

    public static final long j(java.io.InputStream r6, java.io.OutputStream r7) {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            int r1 = r6.read(r0)
            r2 = 0
        La:
            if (r1 < 0) goto L17
            r4 = 0
            r7.write(r0, r4, r1)
            long r4 = (long) r1
            long r2 = r2 + r4
            int r1 = r6.read(r0)
            goto La
        L17:
            return r2
    }

    public static java.lang.String k(java.lang.String r5) {
            r5.getClass()
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto Lc
            java.lang.String r5 = ""
            return r5
        Lc:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L54
            h.Hchat.hooks.api.model.WeChatContact r1 = r0.n(r5)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L1e:
            boolean r2 = r1 instanceof sf.f
            r3 = 0
            if (r2 == 0) goto L25
            r1 = r3
        L25:
            h.Hchat.hooks.api.model.WeChatContact r1 = (h.Hchat.hooks.api.model.WeChatContact) r1
            if (r1 == 0) goto L48
            boolean r2 = r1.isOfficialAccount()
            if (r2 != 0) goto L48
            java.lang.String r2 = r1.remarkName
            boolean r4 = og.m.t0(r2)
            if (r4 != 0) goto L38
            goto L39
        L38:
            r2 = r3
        L39:
            if (r2 == 0) goto L3c
            return r2
        L3c:
            java.lang.String r1 = r1.nickname
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L45
            r3 = r1
        L45:
            if (r3 == 0) goto L48
            return r3
        L48:
            java.lang.String r0 = r0.r(r5)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L53
            goto L54
        L53:
            r5 = r0
        L54:
            return r5
    }

    public static final float l(float[] r5, float[] r6) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            r3 = r5[r2]
            r4 = r6[r2]
            float r3 = r3 * r4
            float r1 = r1 + r3
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    public static void m(ac.o r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.f192b
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "FastKV"
            android.util.Log.e(r2, r1)
            return
    }

    public static final java.lang.Integer n(l0.g r5, i0.o r6, int r7, int r8) {
            int[] r0 = r5.f7667b
        L2:
            r1 = 0
            if (r7 >= r8) goto L68
            int r2 = r7 * 5
            int r2 = r2 + 3
            r2 = r0[r2]
            int r2 = r2 + r7
            boolean r3 = r5.j(r7)
            if (r3 == 0) goto L4f
            int r3 = r5.i(r7)
            r4 = 206(0xce, float:2.89E-43)
            if (r3 != r4) goto L4f
            java.lang.Object r3 = r5.p(r0, r7)
            i0.d1 r4 = i0.m.f5970e
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L4f
            r3 = 0
            java.lang.Object r3 = r5.h(r7, r3)
            boolean r4 = r3 instanceof i0.k0
            if (r4 == 0) goto L32
            i0.k0 r3 = (i0.k0) r3
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            i0.a2 r3 = r3.f5944a
            goto L39
        L38:
            r3 = r1
        L39:
            boolean r4 = r3 instanceof i0.e0
            if (r4 == 0) goto L40
            r1 = r3
            i0.e0 r1 = (i0.e0) r1
        L40:
            if (r1 == 0) goto L4f
            i0.f0 r1 = r1.f5872g
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            return r5
        L4f:
            boolean r1 = r5.d(r7)
            if (r1 == 0) goto L66
            int r7 = r7 + 1
            java.lang.Integer r7 = n(r5, r6, r7, r2)
            if (r7 == 0) goto L66
            int r5 = r7.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L66:
            r7 = r2
            goto L2
        L68:
            return r1
    }

    public static k9.c o(k9.j r3) {
            r3.getClass()
            java.lang.String r0 = r3.f7503a
            java.lang.String r1 = r3.f7505c
            java.lang.String r2 = "module_settings"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L12
            k9.c r3 = k9.c.f7480h
            return r3
        L12:
            java.lang.String r3 = r3.f7506d
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            java.lang.String r1 = "scan"
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L8a
            java.lang.String r1 = "scanner"
            r2 = 0
            boolean r1 = og.m.h0(r3, r1, r2)
            if (r1 == 0) goto L2f
            goto L8a
        L2f:
            java.lang.String r1 = "moments"
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L87
            java.lang.String r1 = ".sns."
            boolean r1 = og.m.h0(r3, r1, r2)
            if (r1 == 0) goto L40
            goto L87
        L40:
            java.lang.String r1 = "finder"
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L84
            java.lang.String r1 = ".finder."
            boolean r1 = og.m.h0(r3, r1, r2)
            if (r1 == 0) goto L51
            goto L84
        L51:
            java.lang.String r1 = "favorite"
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L81
            java.lang.String r1 = ".fav."
            boolean r1 = og.m.h0(r3, r1, r2)
            if (r1 == 0) goto L62
            goto L81
        L62:
            java.lang.String r1 = "wallet"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L7e
            java.lang.String r0 = ".mall."
            boolean r0 = og.m.h0(r3, r0, r2)
            if (r0 != 0) goto L7e
            java.lang.String r0 = ".wallet"
            boolean r3 = og.m.h0(r3, r0, r2)
            if (r3 == 0) goto L7b
            goto L7e
        L7b:
            k9.c r3 = k9.c.f7486n
            return r3
        L7e:
            k9.c r3 = k9.c.f7485m
            return r3
        L81:
            k9.c r3 = k9.c.f7484l
            return r3
        L84:
            k9.c r3 = k9.c.f7483k
            return r3
        L87:
            k9.c r3 = k9.c.f7482j
            return r3
        L8a:
            k9.c r3 = k9.c.f7481i
            return r3
    }

    public static hh.o p(org.luckypray.dexkit.DexKitBridge r14, jh.p r15) {
            r14.getClass()
            r0 = 10
            int r0 = r15.b(r0)
            r1 = 0
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r2 = r15.f4332b
            int r3 = r15.f4331a
            int r0 = r0 + r3
            int r0 = r2.getInt(r0)
            goto L17
        L16:
            r0 = r1
        L17:
            r2 = 131072(0x20000, float:1.83671E-40)
            r3 = r0 & r2
            if (r3 <= 0) goto L20
            r0 = r0 ^ r2
            r0 = r0 | 32
        L20:
            r7 = r0
            r0 = 4
            int r0 = r15.b(r0)
            if (r0 == 0) goto L33
            java.nio.ByteBuffer r2 = r15.f4332b
            int r3 = r15.f4331a
            int r0 = r0 + r3
            int r0 = r2.getInt(r0)
            r4 = r0
            goto L34
        L33:
            r4 = r1
        L34:
            r0 = 6
            int r0 = r15.b(r0)
            if (r0 == 0) goto L46
            java.nio.ByteBuffer r2 = r15.f4332b
            int r3 = r15.f4331a
            int r0 = r0 + r3
            int r0 = r2.getInt(r0)
            r5 = r0
            goto L47
        L46:
            r5 = r1
        L47:
            r0 = 8
            int r0 = r15.b(r0)
            if (r0 == 0) goto L5a
            java.nio.ByteBuffer r2 = r15.f4332b
            int r3 = r15.f4331a
            int r0 = r0 + r3
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L5b
        L5a:
            r6 = r1
        L5b:
            r0 = 12
            int r0 = r15.b(r0)
            if (r0 == 0) goto L6b
            int r2 = r15.f4331a
            int r0 = r0 + r2
            java.lang.String r0 = r15.d(r0)
            goto L6c
        L6b:
            r0 = 0
        L6c:
            if (r0 != 0) goto L70
            java.lang.String r0 = ""
        L70:
            r8 = r0
            r0 = 14
            int r0 = r15.b(r0)
            if (r0 == 0) goto L84
            java.nio.ByteBuffer r2 = r15.f4332b
            int r3 = r15.f4331a
            int r0 = r0 + r3
            int r0 = r2.getInt(r0)
            r9 = r0
            goto L85
        L84:
            r9 = r1
        L85:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0 = 16
            int r2 = r15.b(r0)
            if (r2 == 0) goto L97
            int r2 = r15.f(r2)
            goto L98
        L97:
            r2 = r1
        L98:
            r3 = r1
        L99:
            if (r3 >= r2) goto Lba
            int r11 = r15.b(r0)
            if (r11 == 0) goto Laf
            java.nio.ByteBuffer r12 = r15.f4332b
            int r11 = r15.e(r11)
            int r13 = r3 * 4
            int r13 = r13 + r11
            int r11 = r12.getInt(r13)
            goto Lb0
        Laf:
            r11 = r1
        Lb0:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.add(r11)
            int r3 = r3 + 1
            goto L99
        Lba:
            hh.o r2 = new hh.o
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
    }

    public static final int q(m2.k r2, int r3) {
            m2.k r0 = m2.k.f8696h
            int r2 = r2.f8701g
            int r0 = r0.f8701g
            int r2 = gg.l.c(r2, r0)
            r0 = 0
            r1 = 1
            if (r2 < 0) goto L10
            r2 = r1
            goto L11
        L10:
            r2 = r0
        L11:
            if (r3 != r1) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r0
        L16:
            if (r3 == 0) goto L1c
            if (r2 == 0) goto L1c
            r2 = 3
            return r2
        L1c:
            if (r2 == 0) goto L1f
            return r1
        L1f:
            if (r3 == 0) goto L23
            r2 = 2
            return r2
        L23:
            return r0
    }

    public static bi.b r(i0.h0 r1) {
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r1 = r1.j(r0)
            bi.b r1 = (bi.b) r1
            return r1
    }

    public static v4.f0 s(java.lang.Object r3) {
            if (r3 != 0) goto L5
            v4.r r3 = v4.r.f14120g
            return r3
        L5:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L14
            v4.f r3 = v4.f.f14094i
            return r3
        L14:
            v4.f r3 = v4.f.f14093h
            return r3
        L17:
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto L27
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            v4.g r0 = new v4.g
            r0.<init>(r3)
            return r0
        L27:
            boolean r0 = r3 instanceof java.lang.Character
            if (r0 == 0) goto L37
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
            v4.j r0 = new v4.j
            r0.<init>(r3)
            return r0
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4b
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            long r0 = java.lang.Double.doubleToLongBits(r0)
            v4.k r3 = new v4.k
            r3.<init>(r0)
            return r3
        L4b:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L5f
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            v4.n r0 = new v4.n
            r0.<init>(r3)
            return r0
        L5f:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L6e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            v4.o r3 = v4.o.o(r3)
            return r3
        L6e:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L7e
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            v4.v r3 = new v4.v
            r3.<init>(r0)
            return r3
        L7e:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L8e
            java.lang.Short r3 = (java.lang.Short) r3
            short r3 = r3.shortValue()
            v4.b0 r0 = new v4.b0
            r0.<init>(r3)
            return r0
        L8e:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L9a
            v4.c0 r0 = new v4.c0
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r3)
            return r0
        L9a:
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lac
            v4.d0 r0 = new v4.d0
            java.lang.Class r3 = (java.lang.Class) r3
            g4.j r3 = g4.j.a(r3)
            w4.c r3 = r3.f4312b
            r0.<init>(r3)
            return r0
        Lac:
            boolean r0 = r3 instanceof g4.j
            if (r0 == 0) goto Lba
            v4.d0 r0 = new v4.d0
            g4.j r3 = (g4.j) r3
            w4.c r3 = r3.f4312b
            r0.<init>(r3)
            return r0
        Lba:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not a constant: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final java.lang.String[] t(z0.m r1) {
            r1.getClass()
            z0.e r1 = (z0.e) r1
            java.util.Set r1 = r1.f22488b
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static java.lang.String u(java.lang.ClassLoader r6, java.lang.Class r7) {
            r0 = 1
            java.lang.String r1 = "path"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L11
            r7.setAccessible(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L11
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L11
            return r7
        L11:
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "DexPathList"
            boolean r1 = r6.contains(r7)
            r2 = 93
            r3 = 0
            r4 = 91
            if (r1 == 0) goto L94
            int r7 = r6.indexOf(r7)
            int r1 = r7 + 11
            int r5 = r6.length()
            int r7 = r7 + 15
            if (r5 <= r7) goto Lac
            java.lang.String r7 = r6.substring(r1)
            int r1 = r7.indexOf(r2)
            char r2 = r7.charAt(r3)
            if (r2 != r4) goto Lac
            char r0 = r7.charAt(r0)
            if (r0 != r4) goto Lac
            if (r1 < 0) goto Lac
            r6 = 2
            java.lang.String r6 = r7.substring(r6, r1)
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            r7 = r3
        L52:
            int r0 = r6.length
            if (r7 >= r0) goto L74
            r0 = r6[r7]
            r1 = 34
            int r0 = r0.indexOf(r1)
            r2 = r6[r7]
            int r1 = r2.lastIndexOf(r1)
            if (r0 <= 0) goto L71
            if (r0 >= r1) goto L71
            r2 = r6[r7]
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0, r1)
            r6[r7] = r0
        L71:
            int r7 = r7 + 1
            goto L52
        L74:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r0 = r6.length
        L7a:
            if (r3 >= r0) goto L8f
            r1 = r6[r3]
            int r2 = r7.length()
            if (r2 <= 0) goto L89
            r2 = 58
            r7.append(r2)
        L89:
            r7.append(r1)
            int r3 = r3 + 1
            goto L7a
        L8f:
            java.lang.String r6 = r7.toString()
            goto Lac
        L94:
            int r7 = r6.lastIndexOf(r4)
            r1 = -1
            if (r7 != r1) goto L9c
            goto La1
        L9c:
            int r7 = r7 + r0
            java.lang.String r6 = r6.substring(r7)
        La1:
            int r7 = r6.indexOf(r2)
            if (r7 != r1) goto La8
            goto Lac
        La8:
            java.lang.String r6 = r6.substring(r3, r7)
        Lac:
            return r6
    }

    public static java.io.File[] v(java.lang.String r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "dexPath="
            boolean r1 = r8.startsWith(r1)
            r2 = -1
            if (r1 == 0) goto L21
            r1 = 44
            int r1 = r8.indexOf(r1)
            r3 = 8
            if (r1 != r2) goto L1d
            java.lang.String r8 = r8.substring(r3)
            goto L21
        L1d:
            java.lang.String r8 = r8.substring(r3, r1)
        L21:
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            r3 = 0
        L29:
            if (r3 >= r1) goto Lf1
            r4 = r8[r3]
            java.lang.String r5 = "/data/app/"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L37
            goto Led
        L37:
            java.lang.String r5 = ".apk"
            int r5 = r4.lastIndexOf(r5)
            int r6 = r4.length()
            int r6 = r6 + (-4)
            if (r5 == r6) goto L47
            goto Led
        L47:
            java.lang.String r6 = "/"
            int r5 = r4.lastIndexOf(r6, r5)
            r7 = 9
            if (r5 != r7) goto L53
            goto Led
        L53:
            int r5 = r5 + (-1)
            int r5 = r4.lastIndexOf(r6, r5)
            if (r5 != r2) goto L5d
            goto Led
        L5d:
            java.lang.String r6 = "-"
            int r6 = r4.indexOf(r6, r5)
            if (r6 != r2) goto L67
            goto Led
        L67:
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r5 = "/data/data/"
            java.lang.String r5 = r5.concat(r4)
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.isDirectory()
            r7 = 0
            if (r5 == 0) goto L86
            boolean r5 = r6.canWrite()
            if (r5 == 0) goto L86
            goto L87
        L86:
            r6 = r7
        L87:
            if (r6 != 0) goto Lc9
            java.lang.String r5 = "android.os.Process"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L9c
            java.lang.String r6 = "myUid"
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.Exception -> L9c
            java.lang.Object r5 = r5.invoke(r7, r7)     // Catch: java.lang.Exception -> L9c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L9c
            goto L9d
        L9c:
            r5 = r7
        L9d:
            if (r5 != 0) goto La0
            goto Lc8
        La0:
            int r5 = r5.intValue()
            r6 = 100000(0x186a0, float:1.4013E-40)
            int r5 = r5 / r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            java.lang.String r5 = "/data/user/%d/%s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.isDirectory()
            if (r4 == 0) goto Lc8
            boolean r4 = r5.canWrite()
            if (r4 == 0) goto Lc8
            r7 = r5
        Lc8:
            r6 = r7
        Lc9:
            if (r6 == 0) goto Led
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "cache"
            r4.<init>(r6, r5)
            boolean r5 = r4.exists()
            if (r5 != 0) goto Lde
            boolean r5 = r4.mkdir()
            if (r5 == 0) goto Led
        Lde:
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto Led
            boolean r5 = r4.canWrite()
            if (r5 == 0) goto Led
            r0.add(r4)
        Led:
            int r3 = r3 + 1
            goto L29
        Lf1:
            int r8 = r0.size()
            java.io.File[] r8 = new java.io.File[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.io.File[] r8 = (java.io.File[]) r8
            return r8
    }

    public static fb.j0 w(h.Hchat.dexkit.DexBridgeHolder r9, android.content.Context r10) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r9.getApkPath()     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L15:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r9.getApkPath()
            r1.<init>(r2)
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L23
            r0 = r1
        L23:
            java.io.File r0 = (java.io.File) r0
            fb.j0 r1 = new fb.j0
            org.luckypray.dexkit.DexKitBridge r3 = r9.getDexKitBridge()
            r3.getClass()
            java.lang.String r4 = r0.getPath()
            r4.getClass()
            java.util.Set r2 = fb.n0.f3650a
            java.lang.String r5 = fb.n0.c0(r0)
            java.lang.ClassLoader r9 = r9.getHostClassLoader()
            java.lang.String r7 = r9.toString()
            r8 = 0
            java.lang.String r6 = "current_wechat_apk"
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public static final int x(int r0, int r1) {
            int r0 = r0 >> r1
            r0 = r0 & 31
            return r0
    }

    public static void y(ac.o r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.f192b
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "FastKV"
            android.util.Log.i(r2, r1)
            return
    }

    public static boolean z(java.lang.Object r5) {
            r0 = 0
            if (r5 == 0) goto L45
            long r1 = B(r5)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto Le
            goto L45
        Le:
            java.lang.String r1 = "field_type"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r5, r1)
            boolean r2 = r1 instanceof java.lang.Number
            r3 = 0
            if (r2 == 0) goto L1c
            java.lang.Number r1 = (java.lang.Number) r1
            goto L1d
        L1c:
            r1 = r3
        L1d:
            if (r1 == 0) goto L24
            int r1 = r1.intValue()
            goto L39
        L24:
            java.lang.String r1 = "type"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r5, r1)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L31
            r3 = r1
            java.lang.Number r3 = (java.lang.Number) r3
        L31:
            if (r3 == 0) goto L38
            int r1 = r3.intValue()
            goto L39
        L38:
            r1 = r0
        L39:
            if (r1 <= 0) goto L45
            java.lang.String r1 = "field_favProto"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r1)
            if (r5 == 0) goto L45
            r5 = 1
            return r5
        L45:
            return r0
    }
}
