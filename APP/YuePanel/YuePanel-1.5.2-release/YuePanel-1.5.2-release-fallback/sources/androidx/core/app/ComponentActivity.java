package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0004¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010!R.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0012\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "LYue/ۥ۠ۦۥۤ$ۥ;", "<init>", "()V", "Landroidx/core/app/ComponentActivity$ۥ;", "extraData", "LYue/ۥۣۢ۠ۤ;", "putExtraData", "(Landroidx/core/app/ComponentActivity$ۥ;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ۥ;", "Landroid/view/KeyEvent;", "event", "", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "shouldDumpInternalState", "([Ljava/lang/String;)Z", "ۥ۟۟", "LYue/ۥۢ۟ۡ;", "extraDataMap", "LYue/ۥۢ۟ۡ;", "ۥ", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "ۥ۟", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "core_release"}, k = 1, mv = {1, 8, 0})
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, Yue.C3508.InterfaceC3509 {

    @Yue.InterfaceC4418
    private final Yue.C5787<java.lang.Class<? extends androidx.core.app.ComponentActivity.C7502>, androidx.core.app.ComponentActivity.C7502> extraDataMap;

    @Yue.InterfaceC4418
    private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry;

    /* JADX INFO: renamed from: androidx.core.app.ComponentActivity$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC1816(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    public static class C7502 {
        public C7502() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
            r0.<init>()
            r1.extraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.lifecycleRegistry = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m28807() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m28808() {
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@Yue.InterfaceC4418 android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            Yue.C3329.m13905(r0, r1)
            boolean r1 = Yue.C3508.m14386(r0, r3)
            if (r1 == 0) goto L1a
            r3 = 1
            goto L1e
        L1a:
            boolean r3 = Yue.C3508.m14387(r2, r0, r2, r3)
        L1e:
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@Yue.InterfaceC4418 android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            Yue.C3329.m13905(r0, r1)
            boolean r0 = Yue.C3508.m14386(r0, r3)
            if (r0 == 0) goto L1a
            r3 = 1
            goto L1e
        L1a:
            boolean r3 = super.dispatchKeyShortcutEvent(r3)
        L1e:
            return r3
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC1816(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @Yue.InterfaceC4543
    public <T extends androidx.core.app.ComponentActivity.C7502> T getExtraData(@Yue.InterfaceC4418 java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "extraDataClass"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢ۟ۡ<java.lang.Class<? extends androidx.core.app.ComponentActivity$ۥ>, androidx.core.app.ComponentActivity$ۥ> r0 = r1.extraDataMap
            java.lang.Object r2 = r0.get(r2)
            androidx.core.app.ComponentActivity$ۥ r2 = (androidx.core.app.ComponentActivity.C7502) r2
            return r2
    }

    @Yue.InterfaceC4418
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.lifecycleRegistry
            return r0
    }

    @Override // android.app.Activity
    public void onCreate(@Yue.InterfaceC4543 android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.ReportFragment$Companion r1 = androidx.lifecycle.ReportFragment.Companion
            r1.injectIfNeededIn(r0)
            return
    }

    @Override // android.app.Activity
    @Yue.InterfaceC0907
    public void onSaveInstanceState(@Yue.InterfaceC4418 android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.LifecycleRegistry r0 = r2.lifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC1816(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(@Yue.InterfaceC4418 androidx.core.app.ComponentActivity.C7502 r3) {
            r2 = this;
            java.lang.String r0 = "extraData"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۢ۟ۡ<java.lang.Class<? extends androidx.core.app.ComponentActivity$ۥ>, androidx.core.app.ComponentActivity$ۥ> r0 = r2.extraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    public final boolean shouldDumpInternalState(@Yue.InterfaceC4543 java.lang.String[] r1) {
            r0 = this;
            boolean r1 = r0.m28809(r1)
            r1 = r1 ^ 1
            return r1
    }

    @Override // Yue.C3508.InterfaceC3509
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public boolean superDispatchKeyEvent(@Yue.InterfaceC4418 android.view.KeyEvent r2) {
            r1 = this;
            java.lang.String r0 = "event"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m28809(java.lang.String[] r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L57
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L57
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L47;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1c;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L57
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L57
        L1b:
            return r2
        L1c:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L25
            goto L57
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L2c
            r0 = r2
        L2c:
            return r0
        L2d:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3f
            goto L57
        L36:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3f
            goto L57
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L46
            r0 = r2
        L46:
            return r0
        L47:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L50
            goto L57
        L50:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L57
            r0 = r2
        L57:
            return r0
    }
}
