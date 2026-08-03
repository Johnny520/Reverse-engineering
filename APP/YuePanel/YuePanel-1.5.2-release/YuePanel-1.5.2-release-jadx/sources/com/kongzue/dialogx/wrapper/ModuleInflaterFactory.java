package com.kongzue.dialogx.wrapper;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleInflaterFactory implements LayoutInflater.Factory {
    private final ClassLoader mModuleLoader;
    private final LayoutInflater.Factory mOriginFactory;

    public ModuleInflaterFactory(LayoutInflater.Factory factory, ClassLoader classLoader) {
        this.mOriginFactory = factory;
        this.mModuleLoader = classLoader;
    }

    @Override // android.view.LayoutInflater.Factory
    @InterfaceC6490
    public View onCreateView(@InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        View view;
        try {
            view = (View) this.mModuleLoader.loadClass(str).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.mOriginFactory;
        if (factory != null) {
            return factory.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
