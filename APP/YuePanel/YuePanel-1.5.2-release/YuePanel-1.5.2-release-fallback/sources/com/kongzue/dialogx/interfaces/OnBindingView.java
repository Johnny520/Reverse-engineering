package com.kongzue.dialogx.interfaces;

import Yue.InterfaceC6791;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OnBindingView<D, VB extends Yue.InterfaceC6791> extends com.kongzue.dialogx.interfaces.OnBindView<D> {
    protected VB binding;

    public OnBindingView() {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            Yue.ۥۣۢۤۤ r0 = r2.getViewBinding()
            android.view.View r0 = getBindingRootView(r0)
            r2.setCustomView(r0)
            android.view.View r0 = r2.getCustomView()
            int r1 = com.kongzue.dialogx.R.id.dialogx_view_binding_tag_key
            java.lang.Object r0 = r0.getTag(r1)
            Yue.ۥۣۢۤۤ r0 = (Yue.InterfaceC6791) r0
            r2.binding = r0
            return
    }

    public OnBindingView(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public OnBindingView(int r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public OnBindingView(VB r2) {
            r1 = this;
            android.view.View r0 = r2.getRoot()
            r1.<init>(r0)
            r1.binding = r2
            return
    }

    public OnBindingView(android.app.Fragment r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public OnBindingView(android.view.View r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public OnBindingView(androidx.fragment.app.Fragment r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public OnBindingView(java.lang.Class r2) {
            r1 = this;
            Yue.ۥۣۢۤۤ r2 = getViewBinding(r2)
            android.view.View r2 = getBindingRootView(r2)
            r1.<init>(r2)
            android.view.View r2 = r1.getCustomView()
            int r0 = com.kongzue.dialogx.R.id.dialogx_view_binding_tag_key
            java.lang.Object r2 = r2.getTag(r0)
            Yue.ۥۣۢۤۤ r2 = (Yue.InterfaceC6791) r2
            r1.binding = r2
            return
    }

    public OnBindingView(java.lang.String r2) {
            r1 = this;
            Yue.ۥۣۢۤۤ r2 = getViewBinding(r2)
            android.view.View r2 = getBindingRootView(r2)
            r1.<init>(r2)
            android.view.View r2 = r1.getCustomView()
            int r0 = com.kongzue.dialogx.R.id.dialogx_view_binding_tag_key
            java.lang.Object r2 = r2.getTag(r0)
            Yue.ۥۣۢۤۤ r2 = (Yue.InterfaceC6791) r2
            r1.binding = r2
            return
    }

    private static android.view.View getBindingRootView(Yue.InterfaceC6791 r2) {
            if (r2 != 0) goto Lc
            android.view.View r2 = new android.view.View
            android.content.Context r0 = com.kongzue.dialogx.interfaces.BaseDialog.getContext()
            r2.<init>(r0)
            return r2
        Lc:
            android.view.View r0 = r2.getRoot()
            int r1 = com.kongzue.dialogx.R.id.dialogx_view_binding_tag_key
            r0.setTag(r1, r2)
            return r0
    }

    private Yue.InterfaceC6791 getViewBinding() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L1c
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 1
            r0 = r0[r1]
            java.lang.Class r0 = (java.lang.Class) r0
            Yue.ۥۣۢۤۤ r0 = getViewBinding(r0)
            return r0
        L1c:
            java.lang.String r0 = "DialogX: OnBindingView初始化异常，若要使用无参构建，必须指定ViewBinding泛型"
            com.kongzue.dialogx.interfaces.BaseDialog.error(r0)
            r0 = 0
            return r0
    }

    private static Yue.InterfaceC6791 getViewBinding(java.lang.Class r3) {
            r0 = 0
            java.lang.String r1 = "inflate"
            java.lang.Class<android.view.LayoutInflater> r2 = android.view.LayoutInflater.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L20
            java.lang.reflect.Method r3 = r3.getMethod(r1, r2)     // Catch: java.lang.Exception -> L20
            android.content.Context r1 = com.kongzue.dialogx.interfaces.BaseDialog.getContext()     // Catch: java.lang.Exception -> L20
            android.view.LayoutInflater r1 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r1)     // Catch: java.lang.Exception -> L20
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.Exception -> L20
            Yue.ۥۣۢۤۤ r3 = (Yue.InterfaceC6791) r3     // Catch: java.lang.Exception -> L20
            return r3
        L20:
            r3 = move-exception
            java.lang.String r1 = "DialogX: OnBindingView初始化异常，未能根据bindingClass找到对应的ViewBinding，请尝试指定ViewBinding实例"
            com.kongzue.dialogx.interfaces.BaseDialog.error(r1)
            r3.printStackTrace()
            return r0
    }

    private static Yue.InterfaceC6791 getViewBinding(java.lang.String r3) {
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L9
            Yue.ۥۣۢۤۤ r3 = getViewBinding(r0)     // Catch: java.lang.ClassNotFoundException -> L9
            return r3
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DialogX: OnBindingView初始化异常，未能根据bindingClassName："
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "找到对应的ViewBinding，请尝试指定ViewBinding实例"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r3)
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r0)
            throw r3
    }

    @Override // com.kongzue.dialogx.interfaces.OnBindView
    public void onBind(D r2, android.view.View r3) {
            r1 = this;
            VB extends Yue.ۥۣۢۤۤ r0 = r1.binding
            r1.onBind(r2, r3, r0)
            return
    }

    public abstract void onBind(D r1, android.view.View r2, VB r3);
}
