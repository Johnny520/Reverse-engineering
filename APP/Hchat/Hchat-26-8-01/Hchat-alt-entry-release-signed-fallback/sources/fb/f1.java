package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3519h;

    public /* synthetic */ f1(android.content.Context r1, int r2) {
            r0 = this;
            r0.f3518g = r2
            r0.f3519h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f3518g
            java.lang.String r1 = "profile_id_enable"
            java.lang.String r2 = "Hchat_profile_id_config"
            sf.n r3 = sf.n.f12433a
            r4 = 0
            r5 = 0
            android.content.Context r6 = r7.f3519h
            switch(r0) {
                case 0: goto L101;
                case 1: goto Lbf;
                case 2: goto L85;
                case 3: goto L5e;
                default: goto Lf;
            }
        Lf:
            i0.a0 r8 = (i0.a0) r8
            r8.getClass()
            r6.getClass()
        L17:
            boolean r8 = r6 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L29
            boolean r8 = r6 instanceof android.app.Activity
            if (r8 == 0) goto L22
            android.app.Activity r6 = (android.app.Activity) r6
            goto L31
        L22:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            goto L17
        L29:
            boolean r8 = r6 instanceof android.app.Activity
            if (r8 == 0) goto L30
            android.app.Activity r6 = (android.app.Activity) r6
            goto L31
        L30:
            r6 = r5
        L31:
            if (r6 == 0) goto L38
            android.view.Window r8 = r6.getWindow()
            goto L39
        L38:
            r8 = r5
        L39:
            if (r8 == 0) goto L47
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            if (r0 == 0) goto L47
            int r0 = r0.softInputMode
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L47:
            if (r8 == 0) goto L56
            if (r5 == 0) goto L56
            int r0 = r5.intValue()
            r0 = r0 & 15
            r0 = r0 | 16
            r8.setSoftInputMode(r0)
        L56:
            ci.w r0 = new ci.w
            r1 = 9
            r0.<init>(r8, r1, r5)
            return r0
        L5e:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r6.getSystemService(r0)
            boolean r1 = r0 instanceof android.content.ClipboardManager
            if (r1 == 0) goto L70
            r5 = r0
            android.content.ClipboardManager r5 = (android.content.ClipboardManager) r5
        L70:
            if (r5 == 0) goto L7b
            java.lang.String r0 = "Agent 代码"
            android.content.ClipData r8 = android.content.ClipData.newPlainText(r0, r8)
            r5.setPrimaryClip(r8)
        L7b:
            java.lang.String r8 = "代码已复制"
            android.widget.Toast r8 = android.widget.Toast.makeText(r6, r8, r4)
            r8.show()
            return r3
        L85:
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r8 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r8
            r8.getClass()
            java.lang.Object r8 = r8.thisObject
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L93
            r5 = r8
            android.app.Activity r5 = (android.app.Activity) r5
        L93:
            if (r5 == 0) goto Lbe
            android.content.SharedPreferences r8 = ub.b.c(r6, r2)
            boolean r8 = r8.getBoolean(r1, r4)
            if (r8 != 0) goto La0
            goto Lbe
        La0:
            va.b r8 = va.b.f14296h
            java.lang.String r8 = uf.d.K(r5, r8)
            if (r8 == 0) goto Lbe
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto Lbe
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto Lbe
            c9.t r1 = new c9.t
            r2 = 10
            r1.<init>(r5, r8, r2)
            r0.post(r1)
        Lbe:
            return r3
        Lbf:
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r8 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r8
            r8.getClass()
            java.lang.Object r8 = r8.thisObject
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto Lcd
            android.app.Activity r8 = (android.app.Activity) r8
            goto Lce
        Lcd:
            r8 = r5
        Lce:
            if (r8 == 0) goto L100
            android.content.SharedPreferences r0 = ub.b.c(r6, r2)
            boolean r0 = r0.getBoolean(r1, r4)
            if (r0 != 0) goto Ldb
            goto L100
        Ldb:
            va.b r0 = va.b.f14295g
            java.lang.String r0 = uf.d.K(r8, r0)
            if (r0 == 0) goto L100
            android.view.Window r1 = r8.getWindow()
            if (r1 == 0) goto Lee
            android.view.View r1 = r1.getDecorView()
            goto Lef
        Lee:
            r1 = r5
        Lef:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto Lf6
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        Lf6:
            if (r5 == 0) goto L100
            c9.t r1 = new c9.t
            r1.<init>(r8, r0)
            r5.post(r1)
        L100:
            return r3
        L101:
            fb.a r8 = (fb.a) r8
            r8.getClass()
            fb.g1 r0 = fb.g1.f3523a
            java.lang.String r8 = r8.f3387b
            java.io.File r8 = fb.g1.j(r6, r8)
            return r8
    }
}
