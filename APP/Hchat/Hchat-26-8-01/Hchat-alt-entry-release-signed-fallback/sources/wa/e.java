package wa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.String[][] f14905c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f14906d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f14907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f14908b;

    static {
            java.lang.String r0 = "sendId"
            java.lang.String r1 = "sendid"
            java.lang.String[] r2 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = "nativeUrl"
            java.lang.String r1 = "nativeurl"
            java.lang.String[] r3 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = "headImg"
            java.lang.String r1 = "headimg"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = "nickName"
            java.lang.String r1 = "nickname"
            java.lang.String[] r5 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = "sessionUserName"
            java.lang.String r1 = "sessionUser"
            java.lang.String[] r6 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = "ver"
            java.lang.String[] r7 = new java.lang.String[]{r0}
            java.lang.String r0 = "timingIdentifier"
            java.lang.String[] r8 = new java.lang.String[]{r0}
            java.lang.String r0 = "left_button_continue"
            java.lang.String r1 = "leftButtonContinue"
            java.lang.String[] r9 = new java.lang.String[]{r0, r1}
            java.lang.String[][] r0 = new java.lang.String[][]{r2, r3, r4, r5, r6, r7, r8, r9}
            wa.e.f14905c = r0
            java.lang.String r0 = "channelId"
            java.lang.String r1 = "channelid"
            java.lang.String r2 = "msgType"
            java.lang.String r3 = "msgtype"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            wa.e.f14906d = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f14907a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f14908b = r0
            return
    }

    public e(h.Hchat.dexkit.DexFinder r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            r0.f14907a = r1
            r0.f14908b = r2
            return
    }

    public static void a(java.lang.Object r0, java.lang.String r1, java.lang.StringBuilder r2) {
            if (r0 == 0) goto L3
            return
        L3:
            int r0 = r2.length()
            if (r0 <= 0) goto Le
            r0 = 44
            r2.append(r0)
        Le:
            r2.append(r1)
            return
    }

    public static java.lang.Object d(byte[] r3, java.lang.Class r4) {
            if (r4 != 0) goto L3
            goto L12
        L3:
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r4, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r4, r0)
            if (r4 != 0) goto L14
        L12:
            r3 = 0
            return r3
        L14:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "parseFrom"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r0, r2, r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r0, r4, r3)
            if (r3 == 0) goto L2f
            return r3
        L2f:
            return r4
    }

    public static byte[] f(java.lang.Object r5) {
            r0 = 0
            if (r5 != 0) goto L4
            goto L45
        L4:
            java.lang.String r1 = "b"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "a"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r1)     // Catch: java.lang.Throwable -> L45
            r1 = 0
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "initialProtobufBytes"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r5, r3)     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r2 = r0
        L25:
            boolean r3 = r2 instanceof byte[]     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L2c
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L45
            return r2
        L2c:
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "toByteArray"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r2, r5, r1)     // Catch: java.lang.Throwable -> L45
            boolean r1 = r5 instanceof byte[]     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L45
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L45
            r0 = r5
        L45:
            return r0
    }

    public static void g(wa.h r2, boolean r3, java.lang.String r4) {
            if (r2 != 0) goto L3
            return
        L3:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            wa.b r1 = new wa.b
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    public static void l(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r0, r2)
            if (r0 == 0) goto L17
            boolean r1 = h.Hchat.utils.KavaReflector.writeField(r0, r1, r3)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.IllegalAccessException r1 = new java.lang.IllegalAccessException
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException
            r1.<init>(r2)
            throw r1
    }

    public java.lang.Object b(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.f14907a
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            r1 = 0
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "a"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r7, r3)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L28
            java.lang.Class<?> r3 = r0.protobufReqRespClass     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L27
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L28
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L28
        L27:
            return r2
        L28:
            java.lang.Class r2 = r7.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L34
            int r4 = r4.length     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L48
            goto L34
        L48:
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.Throwable -> L34
            java.lang.Class r5 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L34
            if (r4 == r5) goto L34
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.Throwable -> L34
            if (r4 != r5) goto L57
            goto L34
        L57:
            java.lang.Class<?> r4 = r0.protobufReqRespClass     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L66
            java.lang.Class r5 = r3.getReturnType()     // Catch: java.lang.Throwable -> L34
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L66
            goto L34
        L66:
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r3, r7, r4)     // Catch: java.lang.Throwable -> L34
            return r7
        L6d:
            r7 = 0
            return r7
    }

    public void c(java.lang.Object r10) {
            r9 = this;
            java.lang.String r0 = "UTF-8"
            if (r10 == 0) goto La9
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r10 != r1) goto La
            goto La9
        La:
            boolean r1 = r10 instanceof org.json.JSONObject
            if (r1 == 0) goto L28
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.util.Iterator r0 = r10.keys()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r10.opt(r1)
            r9.c(r1)
            goto L14
        L28:
            boolean r1 = r10 instanceof org.json.JSONArray
            r2 = 0
            if (r1 == 0) goto L3f
            org.json.JSONArray r10 = (org.json.JSONArray) r10
        L2f:
            int r0 = r10.length()
            if (r2 >= r0) goto La9
            java.lang.Object r0 = r10.opt(r2)
            r9.c(r0)
            int r2 = r2 + 1
            goto L2f
        L3f:
            boolean r1 = r10 instanceof java.lang.Number
            if (r1 != 0) goto La9
            boolean r1 = r10 instanceof java.lang.Boolean
            if (r1 == 0) goto L48
            return
        L48:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L53
            goto La9
        L53:
            r1 = 61
            int r3 = r10.indexOf(r1)
            if (r3 < 0) goto La2
            r3 = 38
            int r3 = r10.indexOf(r3)
            if (r3 < 0) goto La2
            java.lang.Object r3 = r9.f14907a
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.String r4 = "&"
            java.lang.String[] r10 = r10.split(r4)
            int r4 = r10.length
            r5 = r2
        L6f:
            if (r5 >= r4) goto La9
            r6 = r10[r5]
            int r7 = r6.indexOf(r1)
            if (r7 > 0) goto L7a
            goto L9f
        L7a:
            java.lang.String r8 = r6.substring(r2, r7)
            java.lang.String r8 = java.net.URLDecoder.decode(r8, r0)     // Catch: java.lang.Throwable -> L82
        L82:
            int r7 = r7 + 1
            java.lang.String r6 = r6.substring(r7)
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r0)     // Catch: java.lang.Throwable -> L8c
        L8c:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L9f
            boolean r7 = r3.containsKey(r8)
            if (r7 != 0) goto L9f
            if (r6 != 0) goto L9c
            java.lang.String r6 = ""
        L9c:
            r3.put(r8, r6)
        L9f:
            int r5 = r5 + 1
            goto L6f
        La2:
            java.lang.Object r0 = r9.f14908b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r10)
        La9:
            return
    }

    public void e(int r7, java.lang.String r8, byte[] r9, java.lang.Object r10, wa.h r11, java.lang.String r12) {
            r6 = this;
            java.lang.String r0 = ": "
            java.lang.String r1 = "通用发包失败: Dispatch异常 "
            java.lang.Object r2 = r6.f14908b
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            java.lang.Object r3 = r6.f14907a
            h.Hchat.dexkit.DexFinder r3 = (h.Hchat.dexkit.DexFinder) r3
            java.lang.Class<?> r4 = r3.protobufCallbackClass
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            wa.c r5 = new wa.c
            r5.<init>(r6, r7, r8, r11)
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r2, r4, r5)
            r4 = 0
            java.lang.reflect.Method r3 = r3.protobufStaticDispatchMethod     // Catch: java.lang.Throwable -> L90 java.lang.reflect.InvocationTargetException -> L92
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L90 java.lang.reflect.InvocationTargetException -> L92
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r2, r5}     // Catch: java.lang.Throwable -> L90 java.lang.reflect.InvocationTargetException -> L92
            r5 = 0
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r5, r2)     // Catch: java.lang.Throwable -> L90 java.lang.reflect.InvocationTargetException -> L92
            if (r0 == 0) goto L32
            java.util.Map r1 = wa.j.f14926b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.put(r0, r2)
        L32:
            java.lang.String r1 = "[Hchat:Protobuf] 发包Dispatch: type="
            java.lang.String r2 = " reqResp="
            java.lang.StringBuilder r1 = eh.a.t(r7, r1, r2)
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            r1.append(r10)
            java.lang.String r10 = " req="
            r1.append(r10)
            r1.append(r12)
            java.lang.String r10 = " len="
            r1.append(r10)
            if (r9 != 0) goto L55
            goto L56
        L55:
            int r4 = r9.length
        L56:
            r1.append(r4)
            java.lang.String r9 = " scene="
            r1.append(r9)
            if (r0 != 0) goto L63
            java.lang.String r9 = "null"
            goto L6b
        L63:
            java.lang.Class r9 = r0.getClass()
            java.lang.String r9 = r9.getName()
        L6b:
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            de.robv.android.xposed.XposedBridge.log(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "通用发包已发送: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = " type="
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8 = 1
            g(r11, r8, r7)
            return
        L90:
            r7 = move-exception
            goto L94
        L92:
            r7 = move-exception
            goto Lb6
        L94:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.Class r9 = r7.getClass()
            java.lang.String r9 = r9.getSimpleName()
            r8.append(r9)
            r8.append(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            g(r11, r4, r7)
            return
        Lb6:
            java.lang.Throwable r8 = r7.getCause()
            if (r8 == 0) goto Lc0
            java.lang.Throwable r7 = r7.getCause()
        Lc0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            java.lang.Class r9 = r7.getClass()
            java.lang.String r9 = r9.getSimpleName()
            r8.append(r9)
            r8.append(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            g(r11, r4, r7)
            return
    }

    public java.util.ArrayList h() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            r3 = 8
            if (r2 >= r3) goto L2f
            java.lang.String[][] r3 = wa.e.f14905c
            r3 = r3[r2]
            java.lang.String r4 = ""
            if (r3 != 0) goto L14
            goto L29
        L14:
            int r5 = r3.length
            r6 = r1
        L16:
            if (r6 >= r5) goto L29
            r7 = r3[r6]
            java.lang.String r7 = r9.k(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L26
            r4 = r7
            goto L29
        L26:
            int r6 = r6 + 1
            goto L16
        L29:
            r0.add(r4)
            int r2 = r2 + 1
            goto L7
        L2f:
            java.lang.Object r1 = r9.f14907a
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3b
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L3b
            r0.add(r2)
            goto L3b
        L57:
            java.lang.Object r1 = r9.f14908b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L5f
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L5f
            r0.add(r2)
            goto L5f
        L7b:
            return r0
    }

    public java.lang.String i() {
            r4 = this;
            java.lang.Object r0 = r4.f14907a
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RawReq"
            java.lang.Class<?> r3 = r0.protobufRawReqClass
            a(r3, r2, r1)
            java.lang.String r2 = "GenericResp"
            java.lang.Class<?> r3 = r0.protobufGenericRespClass
            a(r3, r2, r1)
            java.lang.String r2 = "ConfigBuilder"
            java.lang.Class<?> r3 = r0.protobufConfigBuilderClass
            a(r3, r2, r1)
            java.lang.String r2 = "ReqResp"
            java.lang.Class<?> r3 = r0.protobufReqRespClass
            a(r3, r2, r1)
            java.lang.String r2 = "Callback"
            java.lang.Class<?> r3 = r0.protobufCallbackClass
            a(r3, r2, r1)
            java.lang.Class<?> r2 = r0.protobufCallbackClass
            if (r2 == 0) goto L50
            boolean r2 = r2.isInterface()
            if (r2 != 0) goto L50
            java.lang.Class<?> r2 = r0.protobufCallbackClass
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "Callback非接口="
            java.lang.String r2 = r3.concat(r2)
            int r3 = r1.length()
            if (r3 <= 0) goto L4d
            r3 = 44
            r1.append(r3)
        L4d:
            r1.append(r2)
        L50:
            java.lang.String r2 = "Dispatch"
            java.lang.reflect.Method r0 = r0.protobufStaticDispatchMethod
            a(r0, r2, r1)
            int r0 = r1.length()
            if (r0 != 0) goto L60
            java.lang.String r0 = "已就绪"
            return r0
        L60:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public boolean j(java.lang.String r17, int r18, int r19, int r20, byte[] r21, wa.h r22) {
            r16 = this;
            r1 = r16
            r2 = r18
            r4 = r21
            r6 = r22
            java.lang.String r0 = "[Hchat:Protobuf] 发包请求: type="
            java.lang.Object r3 = r1.f14907a
            h.Hchat.dexkit.DexFinder r3 = (h.Hchat.dexkit.DexFinder) r3
            java.lang.Class<?> r5 = r3.protobufRawReqClass
            r8 = 0
            if (r5 == 0) goto L156
            java.lang.Class<?> r5 = r3.protobufGenericRespClass
            if (r5 == 0) goto L156
            java.lang.Class<?> r5 = r3.protobufConfigBuilderClass
            if (r5 == 0) goto L156
            java.lang.Class<?> r5 = r3.protobufReqRespClass
            if (r5 == 0) goto L156
            java.lang.Class<?> r5 = r3.protobufCallbackClass
            if (r5 == 0) goto L156
            boolean r5 = r5.isInterface()
            if (r5 == 0) goto L156
            java.lang.reflect.Method r5 = r3.protobufStaticDispatchMethod
            if (r5 == 0) goto L156
            r5 = 522(0x20a, float:7.31E-43)
            r9 = 1
            if (r2 != r5) goto L39
            java.lang.Class<?> r7 = r3.protobufNewSendMsgReqClass     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r7 = d(r4, r7)     // Catch: java.lang.Throwable -> L12a
            goto L3a
        L39:
            r7 = 0
        L3a:
            r10 = 681(0x2a9, float:9.54E-43)
            if (r7 != 0) goto L46
            if (r2 != r10) goto L46
            java.lang.Class<?> r7 = r3.protobufOplogReqClass     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r7 = d(r4, r7)     // Catch: java.lang.Throwable -> L12a
        L46:
            if (r7 == 0) goto L49
            goto L5d
        L49:
            java.lang.Class<?> r7 = r3.protobufRawReqClass     // Catch: java.lang.Throwable -> L12a
            java.lang.Class<byte[]> r11 = byte[].class
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L12a
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.findConstructor(r7, r11)     // Catch: java.lang.Throwable -> L12a
            java.lang.Object[] r11 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.newInstance(r7, r11)     // Catch: java.lang.Throwable -> L12a
        L5d:
            java.lang.Class<?> r11 = r3.protobufGenericRespClass     // Catch: java.lang.Throwable -> L12a
            java.lang.Class[] r12 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L12a
            java.lang.reflect.Constructor r11 = h.Hchat.utils.KavaReflector.findConstructor(r11, r12)     // Catch: java.lang.Throwable -> L12a
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.newInstance(r11, r12)     // Catch: java.lang.Throwable -> L12a
            java.lang.Class<?> r12 = r3.protobufConfigBuilderClass     // Catch: java.lang.Throwable -> L12a
            java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L12a
            java.lang.reflect.Constructor r12 = h.Hchat.utils.KavaReflector.findConstructor(r12, r13)     // Catch: java.lang.Throwable -> L12a
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.newInstance(r12, r13)     // Catch: java.lang.Throwable -> L12a
            if (r7 == 0) goto L13a
            if (r11 == 0) goto L13a
            if (r12 != 0) goto L81
            goto L13a
        L81:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12a
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L12a
            r13.append(r2)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = " req="
            r13.append(r0)     // Catch: java.lang.Throwable -> L12a
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L12a
            r13.append(r0)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = " len="
            r13.append(r0)     // Catch: java.lang.Throwable -> L12a
            if (r4 != 0) goto La2
            r0 = r8
            goto La3
        La2:
            int r0 = r4.length     // Catch: java.lang.Throwable -> L12a
        La3:
            r13.append(r0)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = " func="
            r13.append(r0)     // Catch: java.lang.Throwable -> L12a
            r0 = r19
            r13.append(r0)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r14 = " route="
            r13.append(r14)     // Catch: java.lang.Throwable -> L12a
            r14 = r20
            r13.append(r14)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r15 = " special="
            r13.append(r15)     // Catch: java.lang.Throwable -> L12a
            java.lang.Class r15 = r7.getClass()     // Catch: java.lang.Throwable -> L12a
            if (r2 != r5) goto Lce
            java.lang.Class<?> r5 = r3.protobufNewSendMsgReqClass     // Catch: java.lang.Throwable -> L12a
            if (r5 == 0) goto Lce
            boolean r3 = r5.isAssignableFrom(r15)     // Catch: java.lang.Throwable -> L12a
            goto Lda
        Lce:
            if (r2 != r10) goto Ld9
            java.lang.Class<?> r3 = r3.protobufOplogReqClass     // Catch: java.lang.Throwable -> L12a
            if (r3 == 0) goto Ld9
            boolean r3 = r3.isAssignableFrom(r15)     // Catch: java.lang.Throwable -> L12a
            goto Lda
        Ld9:
            r3 = r8
        Lda:
            r13.append(r3)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = r13.toString()     // Catch: java.lang.Throwable -> L12a
            de.robv.android.xposed.XposedBridge.log(r3)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = "a"
            l(r12, r3, r7)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = "b"
            l(r12, r3, r11)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = "c"
            r5 = r17
            l(r12, r3, r5)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = "d"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12a
            l(r12, r3, r10)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = "e"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L12a
            l(r12, r3, r0)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = "f"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L12a
            l(r12, r0, r3)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = "l"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L12a
            l(r12, r0, r3)     // Catch: java.lang.Throwable -> L12a
            java.lang.String r0 = "n"
            l(r12, r0, r4)     // Catch: java.lang.Throwable -> L12a
            java.lang.Object r0 = r1.b(r12)     // Catch: java.lang.Throwable -> L12a
            if (r0 != 0) goto L12c
            java.lang.String r0 = "通用发包失败: ReqResp构造失败"
            g(r6, r8, r0)     // Catch: java.lang.Throwable -> L12a
            return r9
        L12a:
            r0 = move-exception
            goto L140
        L12c:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L12a
            java.lang.String r7 = r3.getName()     // Catch: java.lang.Throwable -> L12a
            r3 = r5
            r5 = r0
            r1.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12a
            return r9
        L13a:
            java.lang.String r0 = "通用发包失败: 对象创建失败"
            g(r6, r8, r0)     // Catch: java.lang.Throwable -> L12a
            return r9
        L140:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "通用发包失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            g(r6, r8, r0)
            return r9
        L156:
            return r8
    }

    public java.lang.String k(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f14907a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r2 = ""
            if (r1 == 0) goto Ld
            return r2
        Ld:
            java.lang.Object r1 = r0.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L22
            java.lang.Object r5 = r1.getValue()
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L41:
            return r2
    }
}
