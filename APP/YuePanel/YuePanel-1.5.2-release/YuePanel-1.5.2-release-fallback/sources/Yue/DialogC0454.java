package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0454 extends Yue.DialogC1432 implements Yue.InterfaceC0437 {
    private androidx.appcompat.app.AbstractC7283 mDelegate;
    private final Yue.C3508.InterfaceC3509 mKeyDispatcher;

    public DialogC0454(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DialogC0454(@Yue.InterfaceC4410 android.content.Context r2, int r3) {
            r1 = this;
            int r0 = getThemeResId(r2, r3)
            r1.<init>(r2, r0)
            Yue.ۥ۟ۡۡ۠ r0 = new Yue.ۥ۟ۡۡ۠
            r0.<init>(r1)
            r1.mKeyDispatcher = r0
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            int r2 = getThemeResId(r2, r3)
            r0.mo28016(r2)
            r2 = 0
            r0.mo28001(r2)
            return
    }

    public DialogC0454(@Yue.InterfaceC4410 android.content.Context r1, boolean r2, @Yue.InterfaceC4544 android.content.DialogInterface.OnCancelListener r3) {
            r0 = this;
            r0.<init>(r1)
            Yue.ۥ۟ۡۡ۠ r1 = new Yue.ۥ۟ۡۡ۠
            r1.<init>(r0)
            r0.mKeyDispatcher = r1
            r0.setCancelable(r2)
            r0.setOnCancelListener(r3)
            return
    }

    public static int getThemeResId(android.content.Context r2, int r3) {
            if (r3 != 0) goto L13
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r0 = Yue.C5058.C5060.f16655
            r1 = 1
            r2.resolveAttribute(r0, r3, r1)
            int r3 = r3.resourceId
        L13:
            return r3
    }

    @Override // Yue.DialogC1432, android.app.Dialog
    public void addContentView(@Yue.InterfaceC4410 android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo27983(r2, r3)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            super.dismiss()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28002()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            Yue.ۥ۠ۦۥۤ$ۥ r1 = r2.mKeyDispatcher
            boolean r3 = Yue.C3508.m14387(r1, r0, r2, r3)
            return r3
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC4544
    public <T extends android.view.View> T findViewById(@Yue.InterfaceC3214 int r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            android.view.View r2 = r0.mo27990(r2)
            return r2
    }

    @Yue.InterfaceC4410
    public androidx.appcompat.app.AbstractC7283 getDelegate() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.mDelegate
            if (r0 != 0) goto La
            androidx.appcompat.app.ۥ۟۟۟ r0 = androidx.appcompat.app.AbstractC7283.m27962(r1, r1)
            r1.mDelegate = r0
        La:
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.mDelegate
            return r0
    }

    public androidx.appcompat.app.AbstractC7267 getSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            androidx.appcompat.app.ۥ r0 = r0.mo27995()
            return r0
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo27998()
            return
    }

    @Override // Yue.DialogC1432, android.app.Dialog
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo27997()
            super.onCreate(r2)
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28001(r2)
            return
    }

    @Override // Yue.DialogC1432, android.app.Dialog
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28007()
            return
    }

    @Override // Yue.InterfaceC0437
    public void onSupportActionModeFinished(Yue.AbstractC0181 r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC0437
    public void onSupportActionModeStarted(Yue.AbstractC0181 r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC0437
    @Yue.InterfaceC4544
    public Yue.AbstractC0181 onWindowStartingSupportActionMode(Yue.AbstractC0181.InterfaceC0182 r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.DialogC1432, android.app.Dialog
    public void setContentView(@Yue.InterfaceC3573 int r2) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28009(r2)
            return
    }

    @Override // Yue.DialogC1432, android.app.Dialog
    public void setContentView(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28010(r2)
            return
    }

    @Override // Yue.DialogC1432, android.app.Dialog
    public void setContentView(@Yue.InterfaceC4410 android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28011(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            androidx.appcompat.app.ۥ۟۟۟ r0 = r2.getDelegate()
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = r1.getString(r3)
            r0.mo28017(r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28017(r2)
            return
    }

    public boolean superDispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    public boolean supportRequestWindowFeature(int r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            boolean r2 = r0.mo28008(r2)
            return r2
    }
}
