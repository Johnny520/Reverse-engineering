package com.kongzue.dialogx.wrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleUtil {
    public static java.lang.String modulePath = "";

    static {
            return
    }

    public ModuleUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getContext(android.content.Context r1) {
            com.kongzue.dialogx.wrapper.ModuleContext r0 = new com.kongzue.dialogx.wrapper.ModuleContext
            r0.<init>(r1)
            return r0
    }

    public static android.view.LayoutInflater getLayoutInflater(android.content.Context r1) {
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            android.content.Context r1 = getContext(r1)
            android.view.LayoutInflater r1 = r0.cloneInContext(r1)
            return r1
    }

    public static void injectModuleAppResources(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            injectModuleAppResources(r0)
            return
    }

    @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
    public static void injectModuleAppResources(android.content.res.Resources r3) {
            java.lang.String r0 = com.kongzue.dialogx.wrapper.ModuleUtil.modulePath
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L28
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.String r1 = "addAssetPath"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L28
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = com.kongzue.dialogx.wrapper.ModuleUtil.modulePath     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L28
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }
}
