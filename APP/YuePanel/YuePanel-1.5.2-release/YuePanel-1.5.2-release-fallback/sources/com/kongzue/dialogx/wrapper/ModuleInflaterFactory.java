package com.kongzue.dialogx.wrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleInflaterFactory implements android.view.LayoutInflater.Factory {
    private final java.lang.ClassLoader mModuleLoader;
    private final android.view.LayoutInflater.Factory mOriginFactory;

    public ModuleInflaterFactory(android.view.LayoutInflater.Factory r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            r0.mOriginFactory = r1
            r0.mModuleLoader = r2
            return
    }

    @Override // android.view.LayoutInflater.Factory
    @Yue.InterfaceC4544
    public android.view.View onCreateView(@Yue.InterfaceC4410 java.lang.String r5, @Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 android.util.AttributeSet r7) {
            r4 = this;
            r0 = 0
            java.lang.ClassLoader r1 = r4.mModuleLoader     // Catch: java.lang.Exception -> L1e
            java.lang.Class r1 = r1.loadClass(r5)     // Catch: java.lang.Exception -> L1e
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r3 = android.util.AttributeSet.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Exception -> L1e
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Exception -> L1e
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L1e
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Exception -> L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L22
            return r1
        L22:
            android.view.LayoutInflater$Factory r1 = r4.mOriginFactory
            if (r1 == 0) goto L2b
            android.view.View r5 = r1.onCreateView(r5, r6, r7)
            return r5
        L2b:
            return r0
    }
}
