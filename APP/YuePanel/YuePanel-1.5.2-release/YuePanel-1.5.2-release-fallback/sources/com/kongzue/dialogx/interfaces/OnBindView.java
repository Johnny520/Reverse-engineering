package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBindView<D> {
    private final int PARENT_FLAG;
    android.view.View customView;
    private int dialogHash;
    private androidx.fragment.app.Fragment fragment;
    private int fragmentParentId;
    int layoutResId;
    private int parentViewHash;
    private android.app.Fragment supportFragment;
    private java.lang.Runnable waitBindRunnable;




    public OnBindView(int r4) {
            r3 = this;
            r3.<init>()
            r0 = -109(0xffffffffffffff93, float:NaN)
            r3.PARENT_FLAG = r0
            r0 = -1
            r3.fragmentParentId = r0
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            if (r0 != 0) goto L16
            java.lang.String r4 = "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki"
            com.kongzue.dialogx.DialogX.error(r4)
            return
        L16:
            r3.layoutResId = r4
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            android.view.LayoutInflater r0 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r0)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            android.app.Activity r2 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            r1.<init>(r2)
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.customView = r4
            return
    }

    public OnBindView(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = -109(0xffffffffffffff93, float:NaN)
            r2.PARENT_FLAG = r0
            r0 = -1
            r2.fragmentParentId = r0
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            if (r0 != 0) goto L16
            java.lang.String r3 = "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki"
            com.kongzue.dialogx.DialogX.error(r3)
            return
        L16:
            r2.layoutResId = r3
            if (r4 == 0) goto L23
            com.kongzue.dialogx.interfaces.OnBindView$1 r4 = new com.kongzue.dialogx.interfaces.OnBindView$1
            r4.<init>(r2, r3)
            r4.start()
            goto L3b
        L23:
            android.app.Activity r4 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            android.view.LayoutInflater r4 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r4)
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            r0.<init>(r1)
            r1 = 0
            android.view.View r3 = r4.inflate(r3, r0, r1)
            r2.customView = r3
        L3b:
            return
    }

    public OnBindView(android.app.Fragment r3) {
            r2 = this;
            r2.<init>()
            r0 = -109(0xffffffffffffff93, float:NaN)
            r2.PARENT_FLAG = r0
            r0 = -1
            r2.fragmentParentId = r0
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            if (r0 != 0) goto L11
            return
        L11:
            com.kongzue.dialogx.util.views.ExtendChildLayoutParamsFrameLayout r0 = new com.kongzue.dialogx.util.views.ExtendChildLayoutParamsFrameLayout
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            r0.<init>(r1)
            r2.customView = r0
            int r1 = r2.getFragmentParentId()
            r0.setId(r1)
            r2.supportFragment = r3
            r3 = 0
            r2.fragment = r3
            return
    }

    public OnBindView(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -109(0xffffffffffffff93, float:NaN)
            r1.PARENT_FLAG = r0
            r0 = -1
            r1.fragmentParentId = r0
            r1.customView = r2
            return
    }

    public OnBindView(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r2.<init>()
            r0 = -109(0xffffffffffffff93, float:NaN)
            r2.PARENT_FLAG = r0
            r0 = -1
            r2.fragmentParentId = r0
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            if (r0 != 0) goto L11
            return
        L11:
            com.kongzue.dialogx.util.views.ExtendChildLayoutParamsFrameLayout r0 = new com.kongzue.dialogx.util.views.ExtendChildLayoutParamsFrameLayout
            android.app.Activity r1 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            r0.<init>(r1)
            r2.customView = r0
            int r1 = r2.getFragmentParentId()
            r0.setId(r1)
            r2.fragment = r3
            r3 = 0
            r2.supportFragment = r3
            return
    }

    public static /* synthetic */ java.lang.Runnable access$000(com.kongzue.dialogx.interfaces.OnBindView r0) {
            java.lang.Runnable r0 = r0.waitBindRunnable
            return r0
    }

    public static /* synthetic */ java.lang.Runnable access$002(com.kongzue.dialogx.interfaces.OnBindView r0, java.lang.Runnable r1) {
            r0.waitBindRunnable = r1
            return r1
    }

    public static /* synthetic */ androidx.fragment.app.Fragment access$100(com.kongzue.dialogx.interfaces.OnBindView r0) {
            androidx.fragment.app.Fragment r0 = r0.fragment
            return r0
    }

    public static /* synthetic */ int access$200(com.kongzue.dialogx.interfaces.OnBindView r0) {
            int r0 = r0.getFragmentParentId()
            return r0
    }

    public static /* synthetic */ android.app.Fragment access$300(com.kongzue.dialogx.interfaces.OnBindView r0) {
            android.app.Fragment r0 = r0.supportFragment
            return r0
    }

    private void callSetEvent(D r3, android.view.View r4) {
            r2 = this;
            int r0 = r3.hashCode()
            int r1 = r2.dialogHash
            if (r0 != r1) goto L10
            int r0 = r4.hashCode()
            int r1 = r2.parentViewHash
            if (r0 == r1) goto L23
        L10:
            int r0 = r3.hashCode()
            r2.dialogHash = r0
            int r4 = r4.hashCode()
            r2.parentViewHash = r4
            android.view.View r4 = r2.getCustomView()
            r2.setEvent(r3, r4)
        L23:
            return
    }

    private int getFragmentParentId() {
            r2 = this;
            int r0 = r2.fragmentParentId
            r1 = -1
            if (r0 != r1) goto Lb
            int r0 = android.view.View.generateViewId()
            r2.fragmentParentId = r0
        Lb:
            int r0 = r2.fragmentParentId
            return r0
    }

    private void waitBind(android.view.ViewGroup r2, com.kongzue.dialogx.interfaces.BaseDialog r3) {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView$3 r0 = new com.kongzue.dialogx.interfaces.OnBindView$3
            r0.<init>(r1, r3, r2)
            r1.waitBindRunnable = r0
            return
    }

    @java.lang.Deprecated
    public void bindParent(android.view.ViewGroup r4) {
            r3 = this;
            android.view.View r0 = r3.getCustomView()
            if (r0 != 0) goto Lb
            r0 = 0
            r3.waitBind(r4, r0)
            return
        Lb:
            android.view.View r0 = r3.getCustomView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L31
            android.view.View r0 = r3.getCustomView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r4) goto L20
            return
        L20:
            android.view.View r0 = r3.getCustomView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.getCustomView()
            r0.removeView(r1)
        L31:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 != 0) goto L3e
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
        L3e:
            android.view.View r1 = r3.getCustomView()
            r4.addView(r1, r0)
            return
    }

    public void bindParent(android.view.ViewGroup r4, com.kongzue.dialogx.interfaces.BaseDialog r5) {
            r3 = this;
            android.view.View r0 = r3.getCustomView()
            if (r0 != 0) goto Lb
            r5 = 0
            r3.waitBind(r4, r5)
            return
        Lb:
            android.view.View r0 = r3.getCustomView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r4) goto L9c
            r0 = -109(0xffffffffffffff93, float:NaN)
            java.lang.Object r0 = r4.getTag(r0)
            android.view.View r1 = r3.getCustomView()
            java.lang.String r1 = r1.toString()
            if (r0 != r1) goto L26
            goto L9c
        L26:
            android.view.View r0 = r3.getCustomView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L41
            android.view.View r0 = r3.getCustomView()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.getCustomView()
            r0.removeView(r1)
        L41:
            android.view.View r0 = r3.getCustomView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L52
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
        L52:
            android.view.View r1 = r3.getCustomView()
            r4.addView(r1, r0)
            android.view.View r4 = r3.getCustomView()
            r3.onBind(r5, r4)
            android.view.View r4 = r3.getCustomView()
            r3.callSetEvent(r5, r4)
            androidx.fragment.app.Fragment r4 = r3.fragment
            if (r4 != 0) goto L6f
            android.app.Fragment r4 = r3.supportFragment
            if (r4 == 0) goto L9c
        L6f:
            com.kongzue.dialogx.DialogX$IMPL_MODE r4 = r5.getDialogImplMode()
            com.kongzue.dialogx.DialogX$IMPL_MODE r0 = com.kongzue.dialogx.DialogX.IMPL_MODE.VIEW
            if (r4 == r0) goto L90
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.dialogKey()
            r4.append(r5)
            java.lang.String r5 = "非 VIEW 实现模式不支持 fragment 作为子布局显示。\n其原因为 Window 中不存在 FragmentManager，无法对子布局中的 fragment 进行管理。"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r4)
            return
        L90:
            android.view.View r4 = r3.getCustomView()
            com.kongzue.dialogx.interfaces.OnBindView$2 r0 = new com.kongzue.dialogx.interfaces.OnBindView$2
            r0.<init>(r3, r5)
            r4.post(r0)
        L9c:
            return
    }

    public void clean() {
            r1 = this;
            r0 = 0
            r1.layoutResId = r0
            r0 = 0
            r1.customView = r0
            return
    }

    public android.view.View getCustomView() {
            r4 = this;
            android.view.View r0 = r4.customView
            if (r0 != 0) goto L1e
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            android.view.LayoutInflater r0 = com.kongzue.dialogx.wrapper.ModuleUtil.getLayoutInflater(r0)
            int r1 = r4.layoutResId
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            android.app.Activity r3 = com.kongzue.dialogx.interfaces.BaseDialog.getTopActivity()
            r2.<init>(r3)
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r4.customView = r0
        L1e:
            android.view.View r0 = r4.customView
            return r0
    }

    public int getLayoutResId() {
            r1 = this;
            int r0 = r1.layoutResId
            return r0
    }

    public abstract void onBind(D r1, android.view.View r2);

    public void onFragmentBind(D r1, android.view.View r2, android.app.Fragment r3, android.app.FragmentManager r4) {
            r0 = this;
            return
    }

    public void onFragmentBind(D r1, android.view.View r2, androidx.fragment.app.Fragment r3, androidx.fragment.app.FragmentManager r4) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.interfaces.OnBindView<D> setCustomView(android.view.View r1) {
            r0 = this;
            r0.customView = r1
            return r0
    }

    public void setEvent(D r1, android.view.View r2) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.interfaces.OnBindView<D> setLayoutResId(int r1) {
            r0 = this;
            r0.layoutResId = r1
            return r0
    }
}
