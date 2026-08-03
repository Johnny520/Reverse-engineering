package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f10345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f10346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8.p f10347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f10348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f10349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.ThreadLocal f10350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10351h;

    public e0(android.content.Context r1, java.lang.ClassLoader r2, org.luckypray.dexkit.DexKitBridge r3, p8.p r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f10344a = r1
            r0.f10345b = r2
            r0.f10346c = r3
            r0.f10347d = r4
            java.lang.String r2 = "Hchat_sns_post_observer_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f10348e = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.f10349f = r1
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.f10350g = r1
            return
    }

    public static boolean a(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            r2 = 0
            if (r1 != 0) goto L41
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L41
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L41
            r1 = r0[r2]
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L41
            r1 = 1
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L41
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage."
            boolean r4 = eh.a.A(r4, r2, r0)
            if (r4 == 0) goto L41
            return r1
        L41:
            return r2
    }

    public final java.lang.reflect.Method b() {
            r6 = this;
            r0 = 0
            org.luckypray.dexkit.DexKitBridge r1 = r6.f10346c
            if (r1 == 0) goto Led
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            java.lang.String r5 = "replaceUserBySnsId"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L55
            java.util.List r4 = a.a.y0(r4)     // Catch: java.lang.Throwable -> L55
            fh.k.u0(r3, r4)     // Catch: java.lang.Throwable -> L55
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L55
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L55
        L2d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L55
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L55
            java.lang.ClassLoader r4 = r6.f10345b     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r3 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L55
            r3 = r4
        L47:
            boolean r4 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L4d
            r3 = r0
        L4d:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L2d
            r2.add(r3)     // Catch: java.lang.Throwable -> L55
            goto L2d
        L55:
            r1 = move-exception
            goto La0
        L57:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L55
        L60:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L55
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L55
            boolean r4 = a(r4)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L60
            r1.add(r3)     // Catch: java.lang.Throwable -> L55
            goto L60
        L77:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r3.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L55
        L85:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto La5
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L55
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L55
            boolean r5 = r2.add(r5)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            r3.add(r4)     // Catch: java.lang.Throwable -> L55
            goto L85
        La0:
            sf.f r3 = new sf.f
            r3.<init>(r1)
        La5:
            java.lang.Throwable r1 = sf.g.b(r3)
            p8.p r2 = r6.f10347d
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "定位朋友圈入库方法失败: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.invoke(r1)
        Lc2:
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto Lc8
            tf.t r3 = tf.t.f13167g
        Lc8:
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            r4 = 1
            if (r1 == r4) goto Le7
            int r1 = r3.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "朋友圈入库方法数量异常: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.invoke(r1)
            return r0
        Le7:
            java.lang.Object r0 = tf.m.H1(r3)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
        Led:
            return r0
    }
}
