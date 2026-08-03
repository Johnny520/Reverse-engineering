package com.kongzue.dialogx.impl;

/* JADX INFO: loaded from: classes2.dex */
public class DialogFragmentImpl extends androidx.fragment.app.DialogInterfaceOnCancelListenerC7607 {
    java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private com.kongzue.dialogx.interfaces.BaseDialog baseDialog;
    private android.view.View dialogView;


    public DialogFragmentImpl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.activityWeakReference = r0
            return
    }

    public DialogFragmentImpl(com.kongzue.dialogx.interfaces.BaseDialog r2, android.view.View r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.activityWeakReference = r0
            r1.dialogView = r3
            r1.baseDialog = r2
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            android.app.Activity r2 = r2.getOwnActivity()
            r3.<init>(r2)
            r1.activityWeakReference = r3
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog access$000(com.kongzue.dialogx.impl.DialogFragmentImpl r0) {
            com.kongzue.dialogx.interfaces.BaseDialog r0 = r0.baseDialog
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC7607
    public void dismiss() {
            r0 = this;
            r0.dismissAllowingStateLoss()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@Yue.InterfaceC4410 android.view.LayoutInflater r1, @Yue.InterfaceC4544 android.view.ViewGroup r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r0 = this;
            android.view.View r1 = r0.dialogView
            return r1
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC7607, androidx.fragment.app.Fragment
    public void onStart() {
            r6 = this;
            super.onStart()
            java.lang.ref.WeakReference<android.app.Activity> r0 = r6.activityWeakReference
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L12
            return
        L12:
            android.app.Dialog r1 = r6.getDialog()
            if (r1 != 0) goto L19
            return
        L19:
            android.app.Dialog r1 = r6.getDialog()
            android.view.Window r1 = r1.getWindow()
            if (r1 != 0) goto L24
            return
        L24:
            r2 = 8
            r1.clearFlags(r2)
            r2 = 16
            r1.setSoftInputMode(r2)
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            r3 = -1
            r2.width = r3
            r2.height = r3
            r3 = 0
            r2.dimAmount = r3
            r3 = -2
            r2.format = r3
            android.view.View r3 = r6.dialogView
            com.kongzue.dialogx.impl.DialogFragmentImpl$1 r4 = new com.kongzue.dialogx.impl.DialogFragmentImpl$1
            r4.<init>(r6, r0)
            r3.setOnTouchListener(r4)
            r1.setAttributes(r2)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r3)
            android.view.View r3 = r1.getDecorView()
            r4 = 0
            r3.setPadding(r4, r4, r4, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r3 < r5) goto L61
            r3 = 1
            Yue.C1836.m8599(r2, r3)
        L61:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r4)
            r1.setBackgroundDrawable(r2)
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r2 = 8192(0x2000, float:1.148E-41)
            r0 = r0 & r2
            if (r0 != r2) goto L7d
            r0 = 9472(0x2500, float:1.3273E-41)
            goto L7f
        L7d:
            r0 = 1280(0x500, float:1.794E-42)
        L7f:
            android.view.View r2 = r1.getDecorView()
            r2.setSystemUiVisibility(r0)
            r0 = -2013265920(0xffffffff88000000, float:-3.85186E-34)
            r1.addFlags(r0)
            r1.setStatusBarColor(r4)
            r1.setNavigationBarColor(r4)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC7607
    public void show(androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4544 java.lang.String r2) {
            r0 = this;
            if (r1 != 0) goto L8
            java.lang.String r1 = "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。"
            com.kongzue.dialogx.DialogX.error(r1)
            return
        L8:
            androidx.fragment.app.ۥ۟۟۠۟ r1 = r1.m29100()
            r1.m29437(r0, r2)
            r1.mo29269()
            return
    }
}
