package p000;

import android.R;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.util.UUID;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: zn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1010zn extends Dialog implements x90, nx0 {

    /* JADX INFO: renamed from: d */
    public z90 f7928d;

    /* JADX INFO: renamed from: e */
    public final lx0 f7929e;

    /* JADX INFO: renamed from: f */
    public final x51 f7930f;

    /* JADX INFO: renamed from: g */
    public final x51 f7931g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0298hw f7932h;

    /* JADX INFO: renamed from: i */
    public C0932xn f7933i;

    /* JADX INFO: renamed from: j */
    public final View f7934j;

    /* JADX INFO: renamed from: k */
    public final C0895wn f7935k;

    /* JADX INFO: renamed from: l */
    public boolean f7936l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1010zn(InterfaceC0298hw interfaceC0298hw, C0932xn c0932xn, View view, k50 k50Var, InterfaceC0968ym interfaceC0968ym, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c0932xn.f7380e ? C0587R.style.DialogWindowTheme : C0587R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.f7929e = new lx0(new mx0(this, new C0381k6(9, this)));
        this.f7930f = new x51(new InterfaceC0298hw(this) { // from class: ih

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DialogC1010zn f2567e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2567e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i2 = i;
                DialogC1010zn dialogC1010zn = this.f2567e;
                switch (i2) {
                    case 0:
                        C0025ao c0025ao = new C0025ao();
                        ((bl0) dialogC1010zn.f7931g.getValue()).m356a().m3507a(c0025ao);
                        return c0025ao;
                    default:
                        return new bl0(new RunnableC0912x3(3, dialogC1010zn));
                }
            }
        });
        final int i2 = 1;
        x51 x51Var = new x51(new InterfaceC0298hw(this) { // from class: ih

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DialogC1010zn f2567e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2567e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i22 = i2;
                DialogC1010zn dialogC1010zn = this.f2567e;
                switch (i22) {
                    case 0:
                        C0025ao c0025ao = new C0025ao();
                        ((bl0) dialogC1010zn.f7931g.getValue()).m356a().m3507a(c0025ao);
                        return c0025ao;
                    default:
                        return new bl0(new RunnableC0912x3(3, dialogC1010zn));
                }
            }
        });
        this.f7931g = x51Var;
        this.f7932h = interfaceC0298hw;
        this.f7933i = c0932xn;
        this.f7934j = view;
        Window window = getWindow();
        if (window == null) {
            C0921xc.m5134o("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        w60.m4889K(window, this.f7933i.f7380e);
        window.setGravity(17);
        if (!this.f7933i.f7380e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            C0346j8.f2769a.m1680a(attributes);
            C0383k8 c0383k8 = C0383k8.f3046a;
            c0383k8.m1777b(attributes, 0);
            c0383k8.m1778c(attributes, 0);
            window.setAttributes(attributes);
        }
        C0895wn c0895wn = new C0895wn(getContext(), window);
        setTitle(this.f7933i.f7381f);
        c0895wn.setTag(C0587R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c0895wn.setClipChildren(false);
        c0895wn.setElevation(interfaceC0968ym.mo654p(8.0f));
        c0895wn.setOutlineProvider(new C0969yn(0));
        this.f7935k = c0895wn;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m5594b(viewGroup);
        }
        setContentView(c0895wn);
        c0895wn.setTag(C0587R.id.view_tree_lifecycle_owner, j50.m1663m(view));
        c0895wn.setTag(C0587R.id.view_tree_view_model_store_owner, v50.m4404i(view));
        c0895wn.setTag(C0587R.id.view_tree_saved_state_registry_owner, u50.m4269j(view));
        m5597e(this.f7932h, this.f7933i, k50Var);
        bl0 bl0Var = (bl0) x51Var.getValue();
        C0950y4 c0950y4 = new C0950y4(this, 1);
        bl0Var.getClass();
        cl0 cl0Var = new cl0(c0950y4);
        final z90 z90VarM5595c = m5595c();
        if (z90VarM5595c.f7841c == r90.f5332d) {
            return;
        }
        vk0 vk0Var = new vk0(cl0Var, new wk0(cl0Var, this));
        cl0Var.f851a.add(vk0Var);
        vk0Var.m4759a(false);
        ri0 ri0VarM356a = bl0Var.m356a();
        ri0VarM356a.getClass();
        if (ri0VarM356a.f5422c.add(vk0Var)) {
            ui0 ui0Var = ri0VarM356a.f5421b;
            ui0Var.getClass();
            if (vk0Var.f6739c != null) {
                C0921xc.m5127h("Handler '", vk0Var, "' is already registered with a dispatcher");
                throw null;
            }
            ui0Var.f6232e.addFirst(vk0Var);
            vk0Var.f6739c = ri0VarM356a;
            ui0Var.m4332b();
        }
        final C0251gm c0251gm = new C0251gm(vk0Var, bl0Var, z90VarM5595c);
        z90VarM5595c.mo4014a(c0251gm);
        cl0Var.f853c.add(new AutoCloseable() { // from class: xk0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.AutoCloseable
            public final void close() {
                z90VarM5595c.mo4015b(c0251gm);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5593a(DialogC1010zn dialogC1010zn) {
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5594b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C0895wn) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m5594b(viewGroup2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m5596d();
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final z90 m5595c() {
        z90 z90Var = this.f7928d;
        if (z90Var != null) {
            return z90Var;
        }
        z90 z90Var2 = new z90(this, true);
        this.f7928d = z90Var2;
        return z90Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5596d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(C0587R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(C0587R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(C0587R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(C0587R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5597e(InterfaceC0298hw interfaceC0298hw, C0932xn c0932xn, k50 k50Var) {
        int i;
        this.f7932h = interfaceC0298hw;
        this.f7933i = c0932xn;
        mz0 mz0Var = c0932xn.f7378c;
        int i2 = AbstractC0235g6.f1868a;
        ViewGroup.LayoutParams layoutParams = this.f7934j.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = mz0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    C0921xc.m5129j();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = k50Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                C0921xc.m5129j();
                return;
            }
            i = 1;
        }
        C0895wn c0895wn = this.f7935k;
        c0895wn.setLayoutDirection(i);
        boolean z2 = c0932xn.f7380e;
        boolean z3 = c0932xn.f7379d;
        Window window2 = c0895wn.f7151l;
        boolean z4 = (c0895wn.f7155p && z3 == c0895wn.f7153n && z2 == c0895wn.f7154o) ? false : true;
        c0895wn.f7153n = z3;
        c0895wn.f7154o = z2;
        if (z4) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z3 ? -2 : -1;
            if (i3 != attributes.width || !c0895wn.f7155p) {
                window2.setLayout(i3, -2);
                c0895wn.f7155p = true;
            }
        }
        setCanceledOnTouchOutside(c0932xn.f7377b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z2 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x90
    public final s90 getLifecycle() {
        return m5595c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nx0
    public final kx0 getSavedStateRegistry() {
        return this.f7929e.f3615b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C0025ao) this.f7930f.getValue()).m4208a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            bl0 bl0Var = (bl0) this.f7931g.getValue();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            bl0Var.m357b(onBackInvokedDispatcher);
        }
        this.f7929e.m2084a(bundle);
        m5595c().m5461e(q90.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f7933i.f7376a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f7932h.invoke();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f7929e.m2085b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m5595c().m5461e(q90.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStop() {
        m5595c().m5461e(q90.ON_DESTROY);
        this.f7928d = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iM3458Q;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f7933i.f7377b) {
            C0895wn c0895wn = this.f7935k;
            c0895wn.getClass();
            float x = motionEvent.getX();
            if (!Float.isInfinite(x) && !Float.isNaN(x)) {
                float y = motionEvent.getY();
                if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = c0895wn.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + c0895wn.getLeft();
                    int width = childAt.getWidth() + left;
                    int top2 = childAt.getTop() + c0895wn.getTop();
                    int height = childAt.getHeight() + top2;
                    int iM3458Q2 = rd0.m3458Q(motionEvent.getX());
                    if (left <= iM3458Q2 && iM3458Q2 <= width && top2 <= (iM3458Q = rd0.m3458Q(motionEvent.getY())) && iM3458Q <= height) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                            this.f7936l = false;
                            return zOnTouchEvent;
                        }
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f7936l = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.f7936l = false;
                    return zOnTouchEvent;
                }
            } else if (this.f7936l) {
                this.f7932h.invoke();
                this.f7936l = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        m5596d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        m5596d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m5596d();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
