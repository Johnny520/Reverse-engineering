package com.kongzue.dialogx.wrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleContext extends android.content.ContextWrapper {
    private android.view.LayoutInflater mLayoutInflater;

    public ModuleContext(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
            r1 = this;
            com.kongzue.dialogx.wrapper.ModuleClassLoader r0 = com.kongzue.dialogx.wrapper.ModuleClassLoader.getInstance()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = super.getResources()
            com.kongzue.dialogx.wrapper.ModuleUtil.injectModuleAppResources(r0)
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.getSystemService(r3)
            boolean r0 = r3 instanceof android.view.LayoutInflater
            if (r0 == 0) goto L28
            android.view.LayoutInflater r0 = r2.mLayoutInflater
            if (r0 != 0) goto L26
            android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
            android.view.LayoutInflater r3 = r3.cloneInContext(r2)
            r2.mLayoutInflater = r3
            android.view.LayoutInflater$Factory r3 = r3.getFactory()
            com.kongzue.dialogx.wrapper.ModuleInflaterFactory r0 = new com.kongzue.dialogx.wrapper.ModuleInflaterFactory
            java.lang.ClassLoader r1 = r2.getClassLoader()
            r0.<init>(r3, r1)
            android.view.LayoutInflater r3 = r2.mLayoutInflater
            r3.setFactory(r0)
        L26:
            android.view.LayoutInflater r3 = r2.mLayoutInflater
        L28:
            return r3
    }
}
