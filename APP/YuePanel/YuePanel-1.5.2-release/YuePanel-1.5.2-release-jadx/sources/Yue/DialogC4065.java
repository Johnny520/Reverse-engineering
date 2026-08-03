package Yue;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleRegistry;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.savedstate.C1794;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogC4065 extends Dialog implements LifecycleOwner, InterfaceC6549, InterfaceC7235 {

    @InterfaceC6489
    private LifecycleRegistry _lifecycleRegistry;

    @InterfaceC6399
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    @InterfaceC6399
    private final C7234 savedStateRegistryController;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public DialogC4065(@InterfaceC6399 Context context) {
        this(context, 0, 2, null);
        C5499.m17103(context, "context");
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m11498(DialogC4065 dialogC4065) {
        C5499.m17103(dialogC4065, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@InterfaceC6399 View view, @InterfaceC6489 ViewGroup.LayoutParams layoutParams) {
        C5499.m17103(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // android.view.LifecycleOwner
    @InterfaceC6399
    public Lifecycle getLifecycle() {
        return m1016();
    }

    @Override // Yue.InterfaceC6549
    @InterfaceC6399
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // Yue.InterfaceC7235
    @InterfaceC6399
    public C1794 getSavedStateRegistry() {
        return this.savedStateRegistryController.m3518();
    }

    @InterfaceC3647
    public void initializeViewTreeOwners() {
        Window window = getWindow();
        C5499.m17100(window);
        View decorView = window.getDecorView();
        C5499.m17102(decorView, "window!!.decorView");
        android.view.View.set(decorView, this);
        Window window2 = getWindow();
        C5499.m17100(window2);
        View decorView2 = window2.getDecorView();
        C5499.m17102(decorView2, "window!!.decorView");
        C8364.m4337(decorView2, this);
        Window window3 = getWindow();
        C5499.m17100(window3);
        View decorView3 = window3.getDecorView();
        C5499.m17102(decorView3, "window!!.decorView");
        C8365.m4339(decorView3, this);
    }

    @Override // android.app.Dialog
    @InterfaceC3647
    public void onBackPressed() {
        this.onBackPressedDispatcher.m28640();
    }

    @Override // android.app.Dialog
    @InterfaceC3647
    public void onCreate(@InterfaceC6489 Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C5499.m17102(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.m28643(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m22641(bundle);
        m1016().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @InterfaceC6399
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C5499.m17102(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m22642(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    @InterfaceC3647
    public void onStart() {
        super.onStart();
        m1016().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    @InterfaceC3647
    public void onStop() {
        m1016().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final LifecycleRegistry m1016() {
        LifecycleRegistry lifecycleRegistry = this._lifecycleRegistry;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this._lifecycleRegistry = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(android.content.Context, int):void (m)] (LINE:2) call: Yue.ۥ۟ۦۤۦ.<init>(android.content.Context, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ DialogC4065(Context context, int i, int i2, C4335 c4335) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC5573
    public DialogC4065(@InterfaceC6399 Context context, @InterfaceC7651 int i) {
        super(context, i);
        C5499.m17103(context, "context");
        this.savedStateRegistryController = C7234.f21841.m3519(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: Yue.ۥ۟ۦۤۥ
            @Override // java.lang.Runnable
            public final void run() {
                DialogC4065.m11498(this.f8126);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@InterfaceC6399 View view) {
        C5499.m17103(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@InterfaceC6399 View view, @InterfaceC6489 ViewGroup.LayoutParams layoutParams) {
        C5499.m17103(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
