package h9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f5152a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f5153b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f5154c = null;

    static {
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            h9.d.f5152a = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            h9.d.f5153b = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            h9.d.f5154c = r0
            return
    }

    public static final void a(android.content.Context r3, java.lang.Object r4, fg.p r5) {
            if (r4 != 0) goto L3
            goto L54
        L3:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r0 = "getLatitude"
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r4, r0, r2)
            java.lang.String r2 = "getLongitude"
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethodRecursive(r4, r2, r1)
            boolean r2 = d(r0)
            if (r2 == 0) goto L3e
            boolean r2 = d(r1)
            if (r2 != 0) goto L25
            goto L3e
        L25:
            r0.getClass()
            h9.c r4 = new h9.c
            r5 = 0
            r4.<init>(r3, r5)
            b(r3, r0, r4)
            r1.getClass()
            h9.c r4 = new h9.c
            r5 = 1
            r4.<init>(r3, r5)
            b(r3, r1, r4)
            return
        L3e:
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = h9.d.f5154c
            boolean r3 = r3.add(r4)
            if (r3 == 0) goto L54
            java.lang.String r3 = r4.getName()
            java.lang.String r4 = "TencentLocation 经纬度 getter 不匹配: "
            java.lang.String r3 = r4.concat(r3)
            r4 = 0
            r5.invoke(r3, r4)
        L54:
            return
    }

    public static void b(android.content.Context r4, java.lang.reflect.Method r5, fg.a r6) {
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = h9.d.f5153b
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto L9
            goto L23
        L9:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L16
            c9.c2 r2 = new c9.c2     // Catch: java.lang.Throwable -> L16
            r3 = 2
            r2.<init>(r4, r3, r6)     // Catch: java.lang.Throwable -> L16
            de.robv.android.xposed.XC_MethodHook$Unhook r4 = r1.b(r5, r2)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r4 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r4)
            r4 = r6
        L1d:
            java.lang.Throwable r4 = sf.g.b(r4)
            if (r4 != 0) goto L24
        L23:
            return
        L24:
            r0.remove(r5)
            throw r4
    }

    public static boolean c(android.content.Context r5, java.util.ArrayList r6, fg.p r7) {
            java.util.Iterator r0 = r6.iterator()
        L4:
            boolean r1 = r0.hasNext()
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = h9.d.f5152a
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto L19
            goto L4
        L19:
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L25
            c9.c2 r4 = new c9.c2     // Catch: java.lang.Throwable -> L25
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> L25
            de.robv.android.xposed.XC_MethodHook$Unhook r3 = r3.b(r1, r4)     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L2c:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L4
            r2.remove(r1)
            java.lang.String r1 = r1.toGenericString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "虚拟定位回调 Hook 安装失败: "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r7.invoke(r1, r3)
            goto L4
        L4b:
            r2.getClass()
            boolean r5 = r6.isEmpty()
            r7 = 1
            if (r5 == 0) goto L56
            goto L6d
        L56:
            java.util.Iterator r5 = r6.iterator()
        L5a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            boolean r6 = r2.contains(r6)
            if (r6 != 0) goto L5a
            r7 = 0
        L6d:
            return r7
    }

    public static boolean d(java.lang.reflect.Method r2) {
            if (r2 != 0) goto L3
            goto L3b
        L3:
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L3b
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L3b
            java.lang.Class[] r0 = r2.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L3b
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Double.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L39
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L3b
        L39:
            r2 = 1
            return r2
        L3b:
            r2 = 0
            return r2
    }
}
