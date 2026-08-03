package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7525c;

    public /* synthetic */ o(android.app.Activity r2, k9.j r3) {
            r1 = this;
            r0 = 0
            r1.f7523a = r0
            r1.<init>()
            r1.f7524b = r2
            r1.f7525c = r3
            return
    }

    public /* synthetic */ o(r9.d0 r2, android.app.Activity r3) {
            r1 = this;
            r0 = 1
            r1.f7523a = r0
            r1.<init>()
            r1.f7525c = r2
            r1.f7524b = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r8) {
            r7 = this;
            int r8 = r7.f7523a
            switch(r8) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r8 = r7.f7525c
            r9.d0 r8 = (r9.d0) r8
            android.app.Activity r0 = r7.f7524b
            r8.e0(r0)
            return
        Lf:
            android.app.Activity r8 = r7.f7524b
            java.lang.Object r0 = r7.f7525c
            k9.j r0 = (k9.j) r0
            java.lang.String r1 = r0.f7504b
            r2 = 0
            k9.r.d(r2)
            java.lang.String r3 = r0.f7505c     // Catch: java.lang.Throwable -> L4b
            int r4 = r3.hashCode()     // Catch: java.lang.Throwable -> L4b
            r5 = -1655966961(0xffffffff9d4bf30f, float:-2.6992485E-21)
            r6 = 1
            if (r4 == r5) goto L72
            r0 = 1834139798(0x6d52c096, float:4.076542E27)
            r5 = 0
            if (r4 == r0) goto L62
            r0 = 2033820409(0x7939a2f9, float:6.0242525E34)
            if (r4 == r0) goto L33
            goto L7a
        L33:
            java.lang.String r0 = "plugin_agent"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L3c
            goto L7a
        L3c:
            boolean r6 = a7.a.W(r8)     // Catch: java.lang.Throwable -> L4b
            android.view.Window r0 = r8.getWindow()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            goto Lbe
        L4e:
            r0 = r5
        L4f:
            boolean r3 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L56
            r5 = r0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch: java.lang.Throwable -> L4b
        L56:
            if (r5 == 0) goto Lb9
            h.Hchat.crash.e r0 = new h.Hchat.crash.e     // Catch: java.lang.Throwable -> L4b
            r3 = 2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4b
            r5.post(r0)     // Catch: java.lang.Throwable -> L4b
            goto Lb9
        L62:
            java.lang.String r0 = "module_settings"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L6b
            goto L7a
        L6b:
            r8.getClass()     // Catch: java.lang.Throwable -> L4b
            a7.a.S(r8, r5, r2)     // Catch: java.lang.Throwable -> L4b
            goto Lb9
        L72:
            java.lang.String r4 = "activity"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto L7c
        L7a:
            r6 = r2
            goto Lb9
        L7c:
            java.lang.String r0 = r0.f7506d     // Catch: java.lang.Throwable -> L4b
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4b
            r3 = 46
            boolean r3 = og.m.I0(r0, r3)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto La1
            java.lang.String r3 = r8.getPackageName()     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r4.<init>()     // Catch: java.lang.Throwable -> L4b
            r4.append(r3)     // Catch: java.lang.Throwable -> L4b
            r4.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L4b
        La1:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L4b
            r3.<init>()     // Catch: java.lang.Throwable -> L4b
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r8.getPackageName()     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L4b
            android.content.Intent r0 = r3.setComponent(r4)     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            r8.startActivity(r0)     // Catch: java.lang.Throwable -> L4b
        Lb9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L4b
            goto Lc4
        Lbe:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        Lc4:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto Ld5
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "[Hchat:FloatingShortcut] 打开快捷项失败: "
            java.lang.String r6 = " "
            eh.a.w(r5, r1, r6, r4, r3)
        Ld5:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto Ldc
            r0 = r3
        Ldc:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "无法打开"
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r2)
            r8.show()
        Lf9:
            return
    }
}
