package com.kongzue.dialogx.impl;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycleImpl implements android.app.Application.ActivityLifecycleCallbacks {
    private static com.kongzue.dialogx.impl.ActivityLifecycleImpl activityLifecycle;
    private static android.app.Application application;
    private com.kongzue.dialogx.impl.ActivityLifecycleImpl.onActivityResumeCallBack onActivityResumeCallBack;

    public interface onActivityResumeCallBack {
        void getActivity(android.app.Activity r1);
    }

    public ActivityLifecycleImpl(com.kongzue.dialogx.impl.ActivityLifecycleImpl.onActivityResumeCallBack r1) {
            r0 = this;
            r0.<init>()
            r0.onActivityResumeCallBack = r1
            return
    }

    private void callOnResume(android.app.Activity r2) {
            r1 = this;
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L18
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r0 == 0) goto L11
            goto L18
        L11:
            com.kongzue.dialogx.impl.ActivityLifecycleImpl$onActivityResumeCallBack r0 = r1.onActivityResumeCallBack
            if (r0 == 0) goto L18
            r0.getActivity(r2)
        L18:
            return
    }

    public static android.app.Application getApplicationContext() {
            java.lang.String r0 = "android.app.ActivityThread"
            android.app.Application r1 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.application
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

    public static android.app.Application getApplicationContext(android.content.Context r3) {
            java.lang.String r0 = "android.app.ActivityThread"
            if (r3 == 0) goto Lb
            android.content.Context r3 = r3.getApplicationContext()
            android.app.Application r3 = (android.app.Application) r3
            return r3
        Lb:
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L1d
            java.lang.Object r1 = r1.invoke(r3, r3)     // Catch: java.lang.Exception -> L1d
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Exception -> L1d
            return r1
        L1d:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = "currentActivityThread"
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L38
            java.lang.Object r1 = r1.invoke(r3, r3)     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = "getApplication"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L38
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L38
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Exception -> L38
            return r0
        L38:
            java.lang.String r0 = "android.app.AppGlobals"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r1 = "getInitialApplication"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch: java.lang.Exception -> L4b
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Exception -> L4b
            return r0
        L4b:
            java.lang.String r0 = "DialogX.init: 初始化异常，请确保init方法内传入的Context是有效的。"
            com.kongzue.dialogx.DialogX.error(r0)
            return r3
    }

    public static android.app.Activity getTopActivity() {
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

    public static void init(android.content.Context r1, com.kongzue.dialogx.impl.ActivityLifecycleImpl.onActivityResumeCallBack r2) {
            if (r1 == 0) goto L22
            android.app.Application r1 = getApplicationContext(r1)
            if (r1 != 0) goto Le
            java.lang.String r1 = "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            com.kongzue.dialogx.DialogX.error(r1)
            return
        Le:
            com.kongzue.dialogx.impl.ActivityLifecycleImpl.application = r1
            com.kongzue.dialogx.impl.ActivityLifecycleImpl r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.activityLifecycle
            if (r0 == 0) goto L17
            r1.unregisterActivityLifecycleCallbacks(r0)
        L17:
            com.kongzue.dialogx.impl.ActivityLifecycleImpl r0 = new com.kongzue.dialogx.impl.ActivityLifecycleImpl
            r0.<init>(r2)
            com.kongzue.dialogx.impl.ActivityLifecycleImpl.activityLifecycle = r0
            r1.registerActivityLifecycleCallbacks(r0)
            goto L29
        L22:
            android.app.Application r1 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.application
            if (r1 == 0) goto L29
            init(r1, r2)
        L29:
            return
    }

    public static boolean isExemptActivities(android.app.Activity r7) {
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String[] r1 = com.kongzue.dialogx.DialogX.unsupportedActivitiesPackageNames
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L9:
            if (r4 >= r2) goto L1f
            r5 = r1[r4]
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L1c
            return r0
        L1c:
            int r4 = r4 + 1
            goto L9
        L1f:
            return r3
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@Yue.InterfaceC4410 android.app.Activity r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r1 = this;
            com.kongzue.dialogx.impl.ActivityLifecycleImpl$onActivityResumeCallBack r3 = r1.onActivityResumeCallBack
            if (r3 == 0) goto Lc
            boolean r0 = r2 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r0 == 0) goto L9
            return
        L9:
            r3.getActivity(r2)
        Lc:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@Yue.InterfaceC4410 android.app.Activity r3) {
            r2 = this;
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            if (r0 != r3) goto L9
            com.kongzue.dialogx.interfaces.BaseDialog.cleanContext()
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L12
            com.kongzue.dialogx.interfaces.BaseDialog.recycleDialog(r3)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@Yue.InterfaceC4410 android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@Yue.InterfaceC4410 android.app.Activity r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            com.kongzue.dialogx.interfaces.BaseDialog.recycleDialog(r3)
        L9:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(@Yue.InterfaceC4410 android.app.Activity r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            r2.callOnResume(r3)
        L9:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@Yue.InterfaceC4410 android.app.Activity r3) {
            r2 = this;
            boolean r0 = r3.isDestroyed()
            if (r0 != 0) goto L1d
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L1d
            boolean r0 = r3 instanceof com.kongzue.dialogx.util.DialogXFloatingWindowActivity
            if (r0 == 0) goto L11
            goto L1d
        L11:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L1a
            r2.callOnResume(r3)
        L1a:
            com.kongzue.dialogx.interfaces.BaseDialog.onActivityResume(r3)
        L1d:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@Yue.InterfaceC4410 android.app.Activity r1, @Yue.InterfaceC4410 android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@Yue.InterfaceC4410 android.app.Activity r2) {
            r1 = this;
            android.app.Application r0 = com.kongzue.dialogx.impl.ActivityLifecycleImpl.application
            if (r0 != 0) goto L7
            com.kongzue.dialogx.interfaces.BaseDialog.init(r2)
        L7:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@Yue.InterfaceC4410 android.app.Activity r1) {
            r0 = this;
            return
    }
}
