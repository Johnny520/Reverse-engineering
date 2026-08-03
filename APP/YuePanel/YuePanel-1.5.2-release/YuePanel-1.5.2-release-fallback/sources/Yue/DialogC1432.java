package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogC1432 extends android.app.Dialog implements androidx.lifecycle.LifecycleOwner, Yue.InterfaceC4611, Yue.InterfaceC5504 {

    @Yue.InterfaceC4543
    private androidx.lifecycle.LifecycleRegistry _lifecycleRegistry;

    @Yue.InterfaceC4418
    private final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;

    @Yue.InterfaceC4418
    private final Yue.C5502 savedStateRegistryController;

    @Yue.InterfaceC3422
    public DialogC1432(@Yue.InterfaceC4418 android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    @Yue.InterfaceC3422
    public DialogC1432(@Yue.InterfaceC4418 android.content.Context r2, @Yue.InterfaceC6018 int r3) {
            r1 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2, r3)
            Yue.ۥۡۧۤۡ$ۥ r2 = Yue.C5502.f20356
            Yue.ۥۡۧۤۡ r2 = r2.m20700(r1)
            r1.savedStateRegistryController = r2
            androidx.activity.OnBackPressedDispatcher r2 = new androidx.activity.OnBackPressedDispatcher
            Yue.ۥ۟ۦۤۥ r3 = new Yue.ۥ۟ۦۤۥ
            r3.<init>(r1)
            r2.<init>(r3)
            r1.onBackPressedDispatcher = r2
            return
    }

    public /* synthetic */ DialogC1432(android.content.Context r1, int r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m7069(Yue.DialogC1432 r0) {
            m7070(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m7070(Yue.DialogC1432 r1) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r1, r0)
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(@Yue.InterfaceC4418 android.view.View r2, @Yue.InterfaceC4543 android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            r1.initializeViewTreeOwners()
            super.addContentView(r2, r3)
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @Yue.InterfaceC4418
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.m7071()
            return r0
    }

    @Override // Yue.InterfaceC4611
    @Yue.InterfaceC4418
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            return r0
    }

    @Override // Yue.InterfaceC5504
    @Yue.InterfaceC4418
    public androidx.savedstate.C7816 getSavedStateRegistry() {
            r1 = this;
            Yue.ۥۡۧۤۡ r0 = r1.savedStateRegistryController
            androidx.savedstate.ۥ r0 = r0.m20696()
            return r0
    }

    @Yue.InterfaceC0907
    public void initializeViewTreeOwners() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            Yue.C3329.m13903(r0)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window!!.decorView"
            Yue.C3329.m13905(r0, r1)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            android.view.Window r0 = r2.getWindow()
            Yue.C3329.m13903(r0)
            android.view.View r0 = r0.getDecorView()
            Yue.C3329.m13905(r0, r1)
            Yue.C6917.m26783(r0, r2)
            android.view.Window r0 = r2.getWindow()
            Yue.C3329.m13903(r0)
            android.view.View r0 = r0.getDecorView()
            Yue.C3329.m13905(r0, r1)
            Yue.C6920.m26786(r0, r2)
            return
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC0907
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            r0.m27760()
            return
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC0907
    public void onCreate(@Yue.InterfaceC4543 android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L17
            androidx.activity.OnBackPressedDispatcher r0 = r3.onBackPressedDispatcher
            android.window.OnBackInvokedDispatcher r1 = Yue.C1430.m7068(r3)
            java.lang.String r2 = "onBackInvokedDispatcher"
            Yue.C3329.m13905(r1, r2)
            r0.m27763(r1)
        L17:
            Yue.ۥۡۧۤۡ r0 = r3.savedStateRegistryController
            r0.m20698(r4)
            androidx.lifecycle.LifecycleRegistry r4 = r3.m7071()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r4.handleLifecycleEvent(r0)
            return
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC4418
    public android.os.Bundle onSaveInstanceState() {
            r2 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            java.lang.String r1 = "super.onSaveInstanceState()"
            Yue.C3329.m13905(r0, r1)
            Yue.ۥۡۧۤۡ r1 = r2.savedStateRegistryController
            r1.m20699(r0)
            return r0
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC0907
    public void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.LifecycleRegistry r0 = r2.m7071()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Dialog
    @Yue.InterfaceC0907
    public void onStop() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.m7071()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2._lifecycleRegistry = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.initializeViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            r1.initializeViewTreeOwners()
            super.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(@Yue.InterfaceC4418 android.view.View r2, @Yue.InterfaceC4543 android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            r1.initializeViewTreeOwners()
            super.setContentView(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.lifecycle.LifecycleRegistry m7071() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1._lifecycleRegistry
            if (r0 != 0) goto Lb
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1._lifecycleRegistry = r0
        Lb:
            return r0
    }
}
