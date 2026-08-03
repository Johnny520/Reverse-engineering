package com.kongzue.dialogx.wrapper;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleContext extends ContextWrapper {
    private LayoutInflater mLayoutInflater;

    public ModuleContext(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return ModuleClassLoader.getInstance();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        ModuleUtil.injectModuleAppResources(resources);
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        if (!(systemService instanceof LayoutInflater)) {
            return systemService;
        }
        if (this.mLayoutInflater == null) {
            LayoutInflater layoutInflaterCloneInContext = ((LayoutInflater) systemService).cloneInContext(this);
            this.mLayoutInflater = layoutInflaterCloneInContext;
            this.mLayoutInflater.setFactory(new ModuleInflaterFactory(layoutInflaterCloneInContext.getFactory(), getClassLoader()));
        }
        return this.mLayoutInflater;
    }
}
