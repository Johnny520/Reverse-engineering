package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.h f10682b;

    public /* synthetic */ d(q8.h r1, int r2) {
            r0 = this;
            r0.f10681a = r2
            r0.f10682b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            int r0 = r5.f10681a
            switch(r0) {
                case 0: goto Lcb;
                case 1: goto La6;
                case 2: goto L5;
                case 3: goto L66;
                case 4: goto L5e;
                case 5: goto L5;
                case 6: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r6)
            return
        L9:
            q8.h r0 = r5.f10682b
            e8.c r0 = r0.f10700c
            java.lang.Object r6 = r6.thisObject
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Class r1 = r0.f2364f     // Catch: java.lang.Throwable -> L52
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r1, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r2 = r0.f2365g     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "Hchat_settings"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L52
            h.Hchat.utils.KavaReflector.invoke(r2, r1, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r2 = r0.f2366h     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "Hchat"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L52
            h.Hchat.utils.KavaReflector.invoke(r2, r1, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "getPreferenceScreen"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r2, r4)     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r0 = r0.f2368j     // Catch: java.lang.Throwable -> L52
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L52
            h.Hchat.utils.KavaReflector.invoke(r0, r6, r1)     // Catch: java.lang.Throwable -> L52
            goto L5d
        L52:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [Legacy] 插入失败: "
            r0.<init>(r1)
            bc.e.s(r6, r0, r6)
        L5d:
            return
        L5e:
            q8.h r0 = r5.f10682b
            java.lang.Object r6 = r6.thisObject
            q8.h.a(r0, r6)
            return
        L66:
            q8.h r0 = r5.f10682b
            java.lang.Object[] r1 = r6.args     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto La5
            int r1 = r1.length     // Catch: java.lang.Throwable -> L9a
            r2 = 1
            if (r1 >= r2) goto L71
            goto La5
        L71:
            java.lang.Object r1 = r6.getResult()     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r1 instanceof android.view.View     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L7a
            goto La5
        L7a:
            java.lang.Object[] r2 = r6.args     // Catch: java.lang.Throwable -> L9a
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L9a
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L9a
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r6 = r6.thisObject     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r6 = q8.h.d(r0, r6)     // Catch: java.lang.Throwable -> L9a
            int r6 = q8.h.f(r0, r6, r2)     // Catch: java.lang.Throwable -> L9a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r0) goto L94
            goto La5
        L94:
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L9a
            q8.h.b(r1, r6)     // Catch: java.lang.Throwable -> L9a
            goto La5
        L9a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [PlusMenu] 设置菜单图标失败: "
            r0.<init>(r1)
            bc.e.s(r6, r0, r6)
        La5:
            return
        La6:
            java.lang.Object r0 = r6.getResult()     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = r0 instanceof android.widget.BaseAdapter     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r6.getResult()     // Catch: java.lang.Throwable -> Lb5
            android.widget.BaseAdapter r0 = (android.widget.BaseAdapter) r0     // Catch: java.lang.Throwable -> Lb5
            goto Lb8
        Lb5:
            r6 = move-exception
            goto Lc0
        Lb7:
            r0 = 0
        Lb8:
            q8.h r1 = r5.f10682b     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r6 = r6.thisObject     // Catch: java.lang.Throwable -> Lb5
            r1.h(r6, r0)     // Catch: java.lang.Throwable -> Lb5
            goto Lca
        Lc0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [PlusMenu] 添加入口失败: "
            r0.<init>(r1)
            bc.e.s(r6, r0, r6)
        Lca:
            return
        Lcb:
            java.lang.Object r6 = r6.thisObject     // Catch: java.lang.Throwable -> L121
            boolean r0 = r6 instanceof android.view.View     // Catch: java.lang.Throwable -> L121
            if (r0 == 0) goto Ld4
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L121
            goto L102
        Ld4:
            if (r6 == 0) goto L101
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L121
            java.lang.String r1 = "HomeUI$PlusActionView"
        Ldc:
            if (r0 == 0) goto L101
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L101
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L121
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> L121
            if (r2 == 0) goto Lfc
            java.lang.String r0 = "h"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L101
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r0, r1)     // Catch: java.lang.Throwable -> L101
            boolean r0 = r6 instanceof android.view.View     // Catch: java.lang.Throwable -> L101
            if (r0 == 0) goto L101
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L101
            goto L102
        Lfc:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L121
            goto Ldc
        L101:
            r6 = 0
        L102:
            if (r6 != 0) goto L105
            goto L12c
        L105:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L121
            r1 = -1212373074(0xffffffffb7bca7ae, float:-2.2489428E-5)
            java.lang.Object r2 = r6.getTag(r1)     // Catch: java.lang.Throwable -> L121
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L121
            if (r2 == 0) goto L115
            goto L12c
        L115:
            r6.setTag(r1, r0)     // Catch: java.lang.Throwable -> L121
            q8.c r0 = new q8.c     // Catch: java.lang.Throwable -> L121
            r0.<init>()     // Catch: java.lang.Throwable -> L121
            r6.setOnLongClickListener(r0)     // Catch: java.lang.Throwable -> L121
            goto L12c
        L121:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [PlusLongPress] 绑定加号入口失败: "
            r0.<init>(r1)
            bc.e.s(r6, r0, r6)
        L12c:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            int r0 = r7.f10681a
            switch(r0) {
                case 2: goto L46;
                case 5: goto L3e;
                case 7: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r8)
            return
        L9:
            q8.h r0 = r7.f10682b
            java.lang.Object[] r1 = r8.args     // Catch: java.lang.Throwable -> L3d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3d
            r3 = 2
            if (r2 >= r3) goto L12
            goto L3d
        L12:
            r2 = 1
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L18
            goto L3d
        L18:
            e8.c r0 = r0.f10700c     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r0 = r0.f2367i     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "Hchat_settings"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r8.thisObject     // Catch: java.lang.Throwable -> L3d
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L3d
            r0.getClass()     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            a7.a.S(r0, r1, r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3d
            r8.setResult(r0)     // Catch: java.lang.Throwable -> L3d
        L3d:
            return
        L3e:
            q8.h r0 = r7.f10682b
            java.lang.Object r8 = r8.thisObject
            q8.h.a(r0, r8)
            return
        L46:
            q8.h r0 = r7.f10682b
            java.lang.Object[] r1 = r8.args     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto Lbe
            int r2 = r1.length     // Catch: java.lang.Throwable -> L9a
            r3 = 3
            if (r2 >= r3) goto L52
            goto Lbe
        L52:
            r2 = 2
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L9a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L9a
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r8.thisObject     // Catch: java.lang.Throwable -> L9a
            int r1 = q8.h.f(r0, r2, r1)     // Catch: java.lang.Throwable -> L9a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L66
            goto Lbe
        L66:
            r2 = 0
            r8.setResult(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = r8.thisObject     // Catch: java.lang.Throwable -> L9a
            r4 = 0
            java.lang.String r5 = "a"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L78
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r5, r6)     // Catch: java.lang.Throwable -> L78
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = -1212373072(0xffffffffb7bca7b0, float:-2.2489432E-5)
            if (r1 != r3) goto L88
            int r8 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L9a
            android.os.Process.killProcess(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.System.exit(r4)     // Catch: java.lang.Throwable -> L9a
            goto Lbe
        L88:
            java.lang.Object r8 = r8.thisObject     // Catch: java.lang.Throwable -> L9a
            android.content.Context r8 = q8.h.c(r0, r8)     // Catch: java.lang.Throwable -> L9a
            if (r8 != 0) goto L91
            goto Lbe
        L91:
            r0 = -1212373075(0xffffffffb7bca7ad, float:-2.2489427E-5)
            if (r1 != r0) goto L9c
            a7.a.S(r8, r2, r4)     // Catch: java.lang.Throwable -> L9a
            goto Lbe
        L9a:
            r8 = move-exception
            goto Lb4
        L9c:
            r0 = -1212373071(0xffffffffb7bca7b1, float:-2.2489434E-5)
            if (r1 != r0) goto Laa
            wb.u2 r0 = new wb.u2     // Catch: java.lang.Throwable -> L9a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9a
            a7.a.S(r8, r0, r4)     // Catch: java.lang.Throwable -> L9a
            goto Lbe
        Laa:
            r0 = -1212373073(0xffffffffb7bca7af, float:-2.248943E-5)
            if (r1 != r0) goto Lbe
            r0 = 1
            ya.i.e(r8, r0)     // Catch: java.lang.Throwable -> L9a
            goto Lbe
        Lb4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [PlusMenu] 处理菜单点击失败: "
            r0.<init>(r1)
            bc.e.s(r8, r0, r8)
        Lbe:
            return
    }
}
