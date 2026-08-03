package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxCustomBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.MaxRelativeLayout boxCustom;

    @Yue.InterfaceC4410
    public final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;

    @Yue.InterfaceC4410
    private final com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout rootView;

    private LayoutDialogxCustomBinding(@Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.MaxRelativeLayout r2, @Yue.InterfaceC4410 com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.boxCustom = r2
            r0.boxRoot = r3
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding bind(@Yue.InterfaceC4410 android.view.View r2) {
            int r0 = com.kongzue.dialogx.R.id.box_custom
            android.view.View r1 = Yue.C6792.m26085(r2, r0)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r1
            if (r1 == 0) goto L12
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding r0 = new com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding
            r0.<init>(r2, r1, r2)
            return r0
        L12:
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_custom
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxCustomBinding r2 = bind(r2)
            return r2
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.getRoot()
            return r0
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout getRoot() {
            r1 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r1.rootView
            return r0
    }
}
