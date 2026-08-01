package defpackage;

/* JADX INFO: renamed from: ᛵᛳᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0855 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0855 f3893;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.app.Application f3894;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1803(android.content.Context r0, defpackage.C1500 r1) {
            if (r0 == 0) goto L28
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            if (r0 != 0) goto L14
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            java.lang.String r0 = ">>>"
            java.lang.String r1 = "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            android.util.Log.e(r0, r1)
            return
        L14:
            defpackage.C0855.f3894 = r0
            ᛵᛳᲀᛵ r1 = defpackage.C0855.f3893
            if (r1 == 0) goto L1d
            r0.unregisterActivityLifecycleCallbacks(r1)
        L1d:
            ᛵᛳᲀᛵ r1 = new ᛵᛳᲀᛵ
            r1.<init>()
            defpackage.C0855.f3893 = r1
            r0.registerActivityLifecycleCallbacks(r1)
            return
        L28:
            android.app.Application r0 = defpackage.C0855.f3894
            if (r0 == 0) goto L2f
            m1803(r0, r1)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.app.Application m1804() {
            java.lang.String r0 = "android.app.ActivityThread"
            android.app.Application r1 = defpackage.C0855.f3894
            if (r1 == 0) goto L7
            return r1
        L7:
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "currentApplication"
            java.lang.reflect.Method r2 = r2.getMethod(r3, r1)     // Catch: java.lang.Exception -> L19
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Exception -> L19
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Exception -> L19
            return r2
        L19:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "currentActivityThread"
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L34
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r3 = "getApplication"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)     // Catch: java.lang.Exception -> L34
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L34
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Exception -> L34
            return r0
        L34:
            java.lang.String r0 = "android.app.AppGlobals"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = "getInitialApplication"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Exception -> L47
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Exception -> L47
            return r0
        L47:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.app.Activity m1805() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.String r2 = "currentActivityThread"
            java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Exception -> L5d
            java.lang.Object r2 = r2.invoke(r0, r0)     // Catch: java.lang.Exception -> L5d
            java.lang.String r3 = "mActivities"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Exception -> L5d
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L5d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L5d
            android.util.ArrayMap r1 = (android.util.ArrayMap) r1     // Catch: java.lang.Exception -> L5d
            int r2 = r1.size()     // Catch: java.lang.Exception -> L5d
            if (r2 >= r3) goto L28
            return r0
        L28:
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Exception -> L5d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L5d
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L5d
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L5d
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Exception -> L5d
            java.lang.String r5 = "paused"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L5d
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L5d
            boolean r5 = r5.getBoolean(r2)     // Catch: java.lang.Exception -> L5d
            if (r5 != 0) goto L30
            java.lang.String r1 = "activity"
            java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.Exception -> L5d
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L5d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L5d
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> L5d
            return r1
        L5d:
            r1 = move-exception
            r1.printStackTrace()
        L61:
            return r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            boolean r0 = r1 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r0 == 0) goto L5
            return
        L5:
            com.kongzue.dialogx.interfaces.AbstractC0008.m256(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            if (r0 != r1) goto L12
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f363
            if (r0 == 0) goto Ld
            r0.clear()
        Ld:
            r0 = 0
            com.kongzue.dialogx.interfaces.AbstractC0008.f363 = r0
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(android.app.Activity r1) {
            r0 = this;
            com.kongzue.dialogx.interfaces.AbstractC0008.m241(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(android.app.Activity r1) {
            r0 = this;
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L14
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L14
            boolean r0 = r1 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r0 == 0) goto L11
            goto L14
        L11:
            com.kongzue.dialogx.interfaces.AbstractC0008.m256(r1)
        L14:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r4) {
            r3 = this;
            boolean r3 = r4.isDestroyed()
            if (r3 != 0) goto L62
            boolean r3 = r4.isFinishing()
            if (r3 != 0) goto L62
            boolean r3 = r4 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r3 == 0) goto L11
            goto L62
        L11:
            java.util.concurrent.CopyOnWriteArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            if (r3 == 0) goto L62
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            r3.<init>(r0)
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L22:
            if (r0 < 0) goto L62
            java.lang.Object r1 = r3.get(r0)
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r1 = (com.kongzue.dialogx.interfaces.AbstractC0008) r1
            android.app.Activity r2 = r1.m271()
            if (r2 != r4) goto L5f
            boolean r2 = r1.f369
            if (r2 == 0) goto L5f
            android.view.View r2 = r1.m262()
            if (r2 == 0) goto L5f
            android.view.View r1 = r1.m262()
            r2 = 1711865999(0x6609008f, float:1.6174363E23)
            android.view.View r1 = r1.findViewById(r2)
            boolean r2 = r1 instanceof com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout
            if (r2 == 0) goto L5f
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r1
            boolean r2 = r1.f395
            if (r2 == 0) goto L5f
            android.view.View r3 = r1.findFocus()
            if (r3 == 0) goto L5b
            if (r3 == r1) goto L5b
            r3.requestFocus()
            return
        L5b:
            r1.requestFocus()
            return
        L5f:
            int r0 = r0 + (-1)
            goto L22
        L62:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            android.app.Application r0 = defpackage.C0855.f3894
            if (r0 != 0) goto L7
            com.kongzue.dialogx.interfaces.AbstractC0008.m253(r1)
        L7:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }
}
