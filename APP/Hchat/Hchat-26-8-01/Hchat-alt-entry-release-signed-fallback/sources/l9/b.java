package l9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l9.d f7936h;

    public /* synthetic */ b(l9.d r1, int r2) {
            r0 = this;
            r0.f7935g = r2
            r0.f7936h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f7935g
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r4 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r4
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L1f;
                default: goto L7;
            }
        L7:
            r4.getClass()
            l9.d r0 = r3.f7936h
            android.content.SharedPreferences r0 = r0.f7942c
            java.lang.String r1 = "remove_forward_limit_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L1c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.setResult(r0)
        L1c:
            sf.n r4 = sf.n.f12433a
            return r4
        L1f:
            r4.getClass()
            l9.d r0 = r3.f7936h
            android.content.SharedPreferences r0 = r0.f7942c
            java.lang.String r1 = "remove_forward_limit_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L30
            goto L47
        L30:
            java.lang.Object r4 = r4.thisObject
            java.lang.String r0 = "getIntent"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r0, r1)
            boolean r0 = r4 instanceof android.content.Intent
            if (r0 == 0) goto L41
            android.content.Intent r4 = (android.content.Intent) r4
            goto L42
        L41:
            r4 = 0
        L42:
            if (r4 == 0) goto L47
            l9.d.h(r4)
        L47:
            sf.n r4 = sf.n.f12433a
            return r4
        L4a:
            r4.getClass()
            l9.d r0 = r3.f7936h
            android.content.SharedPreferences r0 = r0.f7942c
            java.lang.String r1 = "remove_forward_limit_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L5b
            goto L70
        L5b:
            java.lang.Object r4 = r4.thisObject
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L64
            android.app.Activity r4 = (android.app.Activity) r4
            goto L65
        L64:
            r4 = 0
        L65:
            if (r4 == 0) goto L70
            android.content.Intent r4 = r4.getIntent()
            if (r4 == 0) goto L70
            l9.d.h(r4)
        L70:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
