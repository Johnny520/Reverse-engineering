package u9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u9.h f13551b;

    public /* synthetic */ g(u9.h r1, int r2) {
            r0 = this;
            r0.f13550a = r2
            r0.f13551b = r1
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            int r0 = r6.f13550a
            r7.getClass()
            switch(r0) {
                case 0: goto L87;
                default: goto L8;
            }
        L8:
            java.lang.Object r7 = r7.thisObject
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L11
            android.app.Activity r7 = (android.app.Activity) r7
            goto L64
        L11:
            r0 = 0
            if (r7 == 0) goto L63
            java.lang.Class r1 = r7.getClass()
        L18:
            if (r1 == 0) goto L63
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L63
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L2a
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            java.lang.Class r4 = r4.getType()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L2a
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            if (r3 == 0) goto L5e
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r3, r7)
            boolean r1 = r7 instanceof android.app.Activity
            if (r1 == 0) goto L63
            android.app.Activity r7 = (android.app.Activity) r7
            goto L64
        L5e:
            java.lang.Class r1 = r1.getSuperclass()
            goto L18
        L63:
            r7 = r0
        L64:
            if (r7 == 0) goto L86
            android.view.Window r7 = r7.getWindow()
            if (r7 == 0) goto L86
            android.view.View r7 = r7.getDecorView()
            if (r7 == 0) goto L86
            android.view.View r7 = u9.h.d(r7)
            if (r7 == 0) goto L86
            u9.h r0 = r6.f13551b
            android.content.SharedPreferences r1 = r0.f13556e
            java.lang.String r2 = "hide_wechat_bottom_bar_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.a(r7, r1)
        L86:
            return
        L87:
            java.lang.Object r7 = r7.thisObject
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L90
            android.app.Activity r7 = (android.app.Activity) r7
            goto L91
        L90:
            r7 = 0
        L91:
            if (r7 == 0) goto Lb3
            android.view.Window r7 = r7.getWindow()
            if (r7 == 0) goto Lb3
            android.view.View r7 = r7.getDecorView()
            if (r7 == 0) goto Lb3
            android.view.View r7 = u9.h.d(r7)
            if (r7 == 0) goto Lb3
            u9.h r0 = r6.f13551b
            android.content.SharedPreferences r1 = r0.f13556e
            java.lang.String r2 = "hide_wechat_bottom_bar_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.a(r7, r1)
        Lb3:
            return
    }
}
