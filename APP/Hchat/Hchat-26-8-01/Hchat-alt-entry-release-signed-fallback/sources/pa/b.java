package pa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pa.c f10451b;

    public /* synthetic */ b(pa.c r1, int r2) {
            r0 = this;
            r0.f10450a = r2
            r0.f10451b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            int r0 = r7.f10450a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r8)
            return
        L9:
            java.lang.Object r8 = r8.thisObject
            java.lang.String r0 = "m"
            pa.c r1 = r7.f10451b
            java.lang.Object r2 = r1.f10456e
            l3.l r2 = (l3.l) r2
            java.lang.String r3 = "hb_fake_packet_enable"
            r2.getClass()
            r4 = 0
            android.content.SharedPreferences r2 = r2.b()     // Catch: java.lang.Throwable -> L21
            boolean r4 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L21
        L21:
            if (r4 != 0) goto L25
            goto Lb4
        L25:
            java.util.concurrent.ConcurrentHashMap r2 = pa.a.f10449a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb4
            if (r8 != 0) goto L31
            goto Lb4
        L31:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r8, r0)     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r2 = 0
        L37:
            java.lang.String r3 = "假红包群ID已修正，避免分裂群"
            if (r2 == 0) goto L52
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = pa.a.c(r2)     // Catch: java.lang.Throwable -> L50
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto Lb4
            h.Hchat.utils.KavaReflector.writeField(r8, r0, r4)     // Catch: java.lang.Throwable -> L50
            r1.d(r3)     // Catch: java.lang.Throwable -> L50
            goto Lb4
        L50:
            r8 = move-exception
            goto L9f
        L52:
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L50
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50
        L5e:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L50
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L50
            java.lang.Class r4 = r2.getType()     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 == r5) goto L73
            goto L5e
        L73:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r2, r8)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L5e
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "<wcpayinfo>"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto L86
            goto L5e
        L86:
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = pa.a.c(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5e
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L5e
            h.Hchat.utils.KavaReflector.writeField(r2, r8, r5)     // Catch: java.lang.Throwable -> L5e
            r1.d(r3)     // Catch: java.lang.Throwable -> L5e
            goto L5e
        L9f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ERROR 假红包响应修正失败: "
            r0.<init>(r2)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r1.d(r8)
        Lb4:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r12) {
            r11 = this;
            int r0 = r11.f10450a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r12)
            return
        L9:
            pa.c r0 = r11.f10451b
            r0.getClass()
            java.lang.String r1 = "|"
            java.lang.Object r2 = r0.f10456e     // Catch: java.lang.Throwable -> L76
            l3.l r2 = (l3.l) r2     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "hb_fake_packet_enable"
            r2.getClass()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            android.content.SharedPreferences r2 = r2.b()     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r4
        L24:
            if (r2 != 0) goto L28
            goto L1a3
        L28:
            if (r12 == 0) goto L1a3
            java.lang.Object[] r12 = r12.args     // Catch: java.lang.Throwable -> L76
            if (r12 == 0) goto L1a3
            int r2 = r12.length     // Catch: java.lang.Throwable -> L76
            r3 = 2
            if (r2 >= r3) goto L34
            goto L1a3
        L34:
            r2 = 1
            r12 = r12[r2]     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L3b
            goto L1a3
        L3b:
            java.lang.Class r2 = r12.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = "getType"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r12, r3)     // Catch: java.lang.Throwable -> L76
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L76
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L76
            java.lang.Class r3 = r12.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "getUri"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethod(r3, r5, r6)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r12, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L76
            r5 = 1575(0x627, float:2.207E-42)
            if (r2 == r5) goto L79
            java.lang.String r5 = "requestwxhb"
            boolean r5 = r3.contains(r5)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L1a3
            goto L79
        L76:
            r12 = move-exception
            goto L18e
        L79:
            java.lang.Class r5 = r12.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "getReqObj"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r5, r6, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r5, r12, r6)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r12 = pa.c.c(r12)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L93
            goto L1a3
        L93:
            java.lang.Class r5 = r12.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = "toByteArray"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r5, r6, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r12, r6)     // Catch: java.lang.Throwable -> L76
            r6 = 0
            if (r5 != 0) goto La9
            goto Ld0
        La9:
            java.lang.Class r7 = r5.getClass()     // Catch: java.lang.Throwable -> Ld0
            boolean r7 = r7.isArray()     // Catch: java.lang.Throwable -> Ld0
            if (r7 != 0) goto Lb4
            goto Ld0
        Lb4:
            int r7 = java.lang.reflect.Array.getLength(r5)     // Catch: java.lang.Throwable -> Ld0
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> Ld0
        Lba:
            if (r4 >= r7) goto Lcf
            java.lang.Object r9 = java.lang.reflect.Array.get(r5, r4)     // Catch: java.lang.Throwable -> Ld0
            boolean r10 = r9 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Ld0
            if (r10 == 0) goto Ld0
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> Ld0
            byte r9 = r9.byteValue()     // Catch: java.lang.Throwable -> Ld0
            r8[r4] = r9     // Catch: java.lang.Throwable -> Ld0
            int r4 = r4 + 1
            goto Lba
        Lcf:
            r6 = r8
        Ld0:
            if (r6 == 0) goto L1a3
            int r4 = r6.length     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto Ld7
            goto L1a3
        Ld7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            r4.append(r2)     // Catch: java.lang.Throwable -> L76
            r4.append(r1)     // Catch: java.lang.Throwable -> L76
            r4.append(r3)     // Catch: java.lang.Throwable -> L76
            r4.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Class r5 = r12.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            r4.append(r1)     // Catch: java.lang.Throwable -> L76
            int r1 = java.util.Arrays.hashCode(r6)     // Catch: java.lang.Throwable -> L76
            r4.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = r0.f10458g     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: java.lang.Throwable -> L76
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L10c
            goto L141
        L10c:
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L76
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r4.put(r1, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L76
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L76
            r9 = 20
            if (r5 <= r9) goto L133
            java.util.Set r5 = r4.keySet()     // Catch: java.lang.Throwable -> L133
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L133
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L133
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L133
            r4.remove(r5)     // Catch: java.lang.Throwable -> L133
        L133:
            if (r1 == 0) goto L141
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> L76
            long r7 = r7 - r4
            r4 = 500(0x1f4, double:2.47E-321)
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L141
            goto L1a3
        L141:
            byte[] r1 = r0.f(r6)     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L148
            goto L1a3
        L148:
            java.lang.Class r4 = r12.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "parseFrom"
            java.lang.Class<byte[]> r7 = byte[].class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r4, r5, r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L76
            h.Hchat.utils.KavaReflector.invoke(r4, r12, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r12.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "发包请求已篡改: uri="
            r12.append(r4)     // Catch: java.lang.Throwable -> L76
            r12.append(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = ", cgi="
            r12.append(r3)     // Catch: java.lang.Throwable -> L76
            r12.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = ", len="
            r12.append(r2)     // Catch: java.lang.Throwable -> L76
            int r2 = r6.length     // Catch: java.lang.Throwable -> L76
            r12.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "->"
            r12.append(r2)     // Catch: java.lang.Throwable -> L76
            int r1 = r1.length     // Catch: java.lang.Throwable -> L76
            r12.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L76
            r0.d(r12)     // Catch: java.lang.Throwable -> L76
            goto L1a3
        L18e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ERROR 发包请求Hook处理失败: "
            r1.<init>(r2)
            java.lang.String r12 = r12.getMessage()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.d(r12)
        L1a3:
            return
    }
}
