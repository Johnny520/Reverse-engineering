package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Constructor f10687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.b f10688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q8.h f10693g;

    public f(q8.h r1, java.lang.reflect.Constructor r2, q8.b r3, java.lang.Class r4, java.lang.Class r5, java.lang.Class r6, java.lang.Class r7) {
            r0 = this;
            r0.f10693g = r1
            r0.f10687a = r2
            r0.f10688b = r3
            r0.f10689c = r4
            r0.f10690d = r5
            r0.f10691e = r6
            r0.f10692f = r7
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            q8.h r0 = r7.f10693g
            java.lang.Object r1 = r8.getResult()     // Catch: java.lang.Throwable -> L42
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lc
            goto L79
        Lc:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            r2.putAll(r1)     // Catch: java.lang.Throwable -> L42
            e8.c r3 = r0.f10700c     // Catch: java.lang.Throwable -> L42
            java.lang.Class r4 = r3.f2370l     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L1b
            goto L60
        L1b:
            java.util.Collection r4 = r1.values()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L42
        L23:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L60
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L23
            java.lang.Class r6 = r3.f2370l     // Catch: java.lang.Throwable -> L42
            boolean r5 = r6.isInstance(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L23
            java.lang.Object[] r0 = r8.args     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L44
            int r1 = r0.length     // Catch: java.lang.Throwable -> L42
            if (r1 <= 0) goto L44
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r8 = move-exception
            goto L9f
        L44:
            r0 = 0
        L45:
            if (r0 != 0) goto L48
            goto L79
        L48:
            java.lang.reflect.Constructor r1 = r7.f10687a     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r1, r0)     // Catch: java.lang.Throwable -> L42
            q8.b r1 = r7.f10688b     // Catch: java.lang.Throwable -> L42
            y4.c.d(r0, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SettingGroup_Main_Other_Hchat"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L42
            r8.setResult(r2)     // Catch: java.lang.Throwable -> L42
            return
        L60:
            java.lang.Class r3 = r7.f10689c     // Catch: java.lang.Throwable -> L42
            java.lang.Class r4 = r7.f10690d     // Catch: java.lang.Throwable -> L42
            java.lang.Class r5 = r7.f10691e     // Catch: java.lang.Throwable -> L42
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5}     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = q8.h.e(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L71
            goto L79
        L71:
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r1 instanceof java.lang.Iterable     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L7a
        L79:
            return
        L7a:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L42
            r3.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L85:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L93
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L42
            r3.add(r4)     // Catch: java.lang.Throwable -> L42
            goto L85
        L93:
            java.lang.Class r1 = r7.f10692f     // Catch: java.lang.Throwable -> L42
            r3.add(r1)     // Catch: java.lang.Throwable -> L42
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L42
            r8.setResult(r2)     // Catch: java.lang.Throwable -> L42
            return
        L9f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [Modern] ClassesProvider 注入失败: "
            r0.<init>(r1)
            bc.e.s(r8, r0, r8)
            return
    }
}
