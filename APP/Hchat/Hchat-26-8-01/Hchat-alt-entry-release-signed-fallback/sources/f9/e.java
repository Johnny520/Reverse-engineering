package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f3359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f3360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f3361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f3362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3365g;

    public e(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3359a = r1
            r0.f3360b = r2
            java.util.Set r1 = j8.b.o()
            r0.f3361c = r1
            java.util.Map r1 = p.a.p()
            r0.f3362d = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f3363e = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f3364f = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f3365g = r1
            return
    }

    public static android.view.MenuItem a(java.lang.Object r2) {
            r0 = 1212368196(0x48434544, float:199957.06)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "findItem"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r1, r0)
            boolean r0 = r2 instanceof android.view.MenuItem
            if (r0 == 0) goto L18
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            return r2
        L18:
            r2 = 0
            return r2
    }

    public static void d(android.app.Activity r2, java.lang.String r3) {
            if (r2 == 0) goto L3
            goto Lf
        L3:
            q8.o r2 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r2 == 0) goto Le
            android.app.Activity r2 = r2.a()
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1a
            c9.t r0 = new c9.t
            r1 = 4
            r0.<init>(r2, r3, r1)
            r2.runOnUiThread(r0)
        L1a:
            return
    }

    public final boolean b(java.lang.reflect.Method r5, boolean r6) {
            r4 = this;
            f9.d r0 = new f9.d
            r1 = 0
            r0.<init>(r6, r4, r1)
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isAbstract(r6)
            if (r6 != 0) goto L45
            java.lang.Class r6 = r5.getDeclaringClass()
            boolean r6 = r6.isInterface()
            if (r6 != 0) goto L45
            java.util.Set r6 = r4.f3361c
            boolean r2 = r6.add(r5)
            r3 = 1
            if (r2 != 0) goto L24
            return r3
        L24:
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2a
            r2.b(r5, r0)     // Catch: java.lang.Throwable -> L2a
            return r3
        L2a:
            r0 = move-exception
            r6.remove(r5)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "修改聊天记录Hook安装失败: "
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            ab.b r6 = r4.f3360b
            r6.invoke(r5, r0)
        L45:
            return r1
    }

    public final long c(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
            f9.b r1 = new f9.b
            r2 = 0
            r1.<init>(r6, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r5.f3364f
            java.lang.Object r3 = r2.get(r0)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r4 = 0
            if (r3 == 0) goto L16
            goto L24
        L16:
            java.lang.Object r1 = r1.invoke()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L23
            r2.putIfAbsent(r0, r3)
            goto L24
        L23:
            r3 = r4
        L24:
            r0 = 0
            if (r3 == 0) goto L3c
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r3, r6, r1)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L34
            java.lang.Number r1 = (java.lang.Number) r1
            goto L35
        L34:
            r1 = r4
        L35:
            if (r1 == 0) goto L3c
            long r0 = r1.longValue()
            return r0
        L3c:
            java.lang.String r1 = "msgId"
            java.lang.String r2 = "msgID"
            java.lang.String r3 = "field_msgId"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
        L46:
            r2 = 3
            if (r0 < r2) goto L4a
            goto L57
        L4a:
            r2 = r1[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r6, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L61
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
        L57:
            if (r4 == 0) goto L5e
            long r0 = r4.longValue()
            return r0
        L5e:
            r0 = 0
            return r0
        L61:
            int r0 = r0 + 1
            goto L46
    }
}
