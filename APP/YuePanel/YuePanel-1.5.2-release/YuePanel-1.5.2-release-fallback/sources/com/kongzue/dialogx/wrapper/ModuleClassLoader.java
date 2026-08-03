package com.kongzue.dialogx.wrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleClassLoader extends java.lang.ClassLoader {
    private static com.kongzue.dialogx.wrapper.ModuleClassLoader instance;
    private final java.lang.ClassLoader moduleLoader;

    private ModuleClassLoader(java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>(r1)
            r0.moduleLoader = r1
            return
    }

    public static com.kongzue.dialogx.wrapper.ModuleClassLoader getInstance() {
            com.kongzue.dialogx.wrapper.ModuleClassLoader r0 = com.kongzue.dialogx.wrapper.ModuleClassLoader.instance
            if (r0 != 0) goto L11
            com.kongzue.dialogx.wrapper.ModuleClassLoader r0 = new com.kongzue.dialogx.wrapper.ModuleClassLoader
            java.lang.Class<com.kongzue.dialogx.wrapper.ModuleClassLoader> r1 = com.kongzue.dialogx.wrapper.ModuleClassLoader.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.<init>(r1)
            com.kongzue.dialogx.wrapper.ModuleClassLoader.instance = r0
        L11:
            com.kongzue.dialogx.wrapper.ModuleClassLoader r0 = com.kongzue.dialogx.wrapper.ModuleClassLoader.instance
            return r0
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.ClassLoader r0 = r1.moduleLoader     // Catch: java.lang.Throwable -> L9
            java.lang.Class r0 = r0.loadClass(r2)     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.Class r2 = super.loadClass(r2, r3)
            return r2
    }
}
