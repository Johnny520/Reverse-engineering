package com.kongzue.dialogx.databinding;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDialogxEmptyBinding implements Yue.InterfaceC6791 {

    @Yue.InterfaceC4410
    private final android.widget.RelativeLayout rootView;

    private LayoutDialogxEmptyBinding(@Yue.InterfaceC4410 android.widget.RelativeLayout r1) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            return
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding bind(@Yue.InterfaceC4410 android.view.View r1) {
            if (r1 == 0) goto La
            com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding r0 = new com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.<init>(r1)
            return r0
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "rootView"
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4410
    public static com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding inflate(@Yue.InterfaceC4410 android.view.LayoutInflater r2, @Yue.InterfaceC4544 android.view.ViewGroup r3, boolean r4) {
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_empty
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            com.kongzue.dialogx.databinding.LayoutDialogxEmptyBinding r2 = bind(r2)
            return r2
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.RelativeLayout r0 = r1.getRoot()
            return r0
    }

    @Override // Yue.InterfaceC6791
    @Yue.InterfaceC4410
    public android.widget.RelativeLayout getRoot() {
            r1 = this;
            android.widget.RelativeLayout r0 = r1.rootView
            return r0
    }
}
