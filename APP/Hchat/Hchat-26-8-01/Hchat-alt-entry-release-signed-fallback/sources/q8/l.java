package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f10713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q8.m f10714c;

    public /* synthetic */ l(q8.m r1, java.lang.reflect.Method r2, int r3) {
            r0 = this;
            r0.f10712a = r3
            r0.f10714c = r1
            r0.f10713b = r2
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            int r0 = r7.f10712a
            switch(r0) {
                case 1: goto L2a;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r8)
            return
        L9:
            q8.m r8 = r7.f10714c
            java.lang.String r8 = r8.f10724j
            q8.m r0 = r7.f10714c
            java.lang.String r1 = ""
            r0.f10724j = r1
            q8.m r0 = r7.f10714c
            r0.f10725k = r1
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L29
            q8.m r0 = r7.f10714c
            java.lang.reflect.Method r1 = r7.f10713b
            q8.m.f(r1)
            java.lang.String r1 = "exit"
            r0.b(r1, r8)
        L29:
            return
        L2a:
            java.lang.Object r8 = r8.thisObject
            java.lang.String r0 = "getStringExtra"
            java.lang.String r1 = "Chat_User"
            java.lang.String r2 = ""
            if (r8 != 0) goto L35
            goto L67
        L35:
            java.lang.Class r3 = r8.getClass()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
        L3b:
            if (r3 == 0) goto L51
            java.lang.Class[] r5 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r3, r0, r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.Class r6 = r5.getReturnType()     // Catch: java.lang.Throwable -> L4c
            if (r6 != r4) goto L4c
            goto L52
        L4c:
            java.lang.Class r3 = r3.getSuperclass()
            goto L3b
        L51:
            r5 = 0
        L52:
            if (r5 != 0) goto L55
            goto L67
        L55:
            java.lang.Object[] r0 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L67
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r5, r8, r0)     // Catch: java.lang.Throwable -> L67
            boolean r0 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L67
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r8.trim()     // Catch: java.lang.Throwable -> L67
        L67:
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 == 0) goto L71
            q8.m r8 = r7.f10714c
            java.lang.String r2 = r8.f10725k
        L71:
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L81
            q8.m r8 = r7.f10714c
            java.lang.reflect.Method r0 = r7.f10713b
            q8.m.f(r0)
            r8.c(r2)
        L81:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            int r0 = r4.f10712a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r5)
            return
        L9:
            java.lang.Object[] r5 = r5.args
            if (r5 != 0) goto Le
            goto L22
        Le:
            int r0 = r5.length
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            r2 = r5[r1]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r2.trim()
            goto L24
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            java.lang.String r5 = ""
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L2b
            goto L39
        L2b:
            q8.m r0 = r4.f10714c
            r0.f10725k = r5
            q8.m r0 = r4.f10714c
            java.lang.reflect.Method r1 = r4.f10713b
            q8.m.f(r1)
            r0.c(r5)
        L39:
            return
    }
}
