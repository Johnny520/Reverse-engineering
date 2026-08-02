package p000;

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
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p80 extends Dialog implements ia1, pt1, gm1, tc2 {

    /* JADX INFO: renamed from: h */
    public la1 f8022h;

    /* JADX INFO: renamed from: i */
    public final rc2 f8023i;

    /* JADX INFO: renamed from: j */
    public final hx2 f8024j;

    /* JADX INFO: renamed from: k */
    public final hx2 f8025k;

    /* JADX INFO: renamed from: l */
    public xm0 f8026l;

    /* JADX INFO: renamed from: m */
    public n80 f8027m;

    /* JADX INFO: renamed from: n */
    public final View f8028n;

    /* JADX INFO: renamed from: o */
    public final m80 f8029o;

    /* JADX INFO: renamed from: p */
    public boolean f8030p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(xm0 xm0Var, n80 n80Var, View view, d61 d61Var, e70 e70Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), n80Var.f7046e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.f8023i = new rc2(new sc2(this, new C0727ta(20, this)));
        this.f8024j = new hx2(new xm0(this) { // from class: fw

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ p80 f3153i;

            {
                this.f3153i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i2 = i;
                p80 p80Var = this.f3153i;
                switch (i2) {
                    case 0:
                        q80 q80Var = new q80();
                        p80Var.getNavigationEventDispatcher().m1663b(q80Var);
                        return q80Var;
                    default:
                        return new ot1(new RunnableC0446m2(6, p80Var));
                }
            }
        });
        final int i2 = 1;
        this.f8025k = new hx2(new xm0(this) { // from class: fw

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ p80 f3153i;

            {
                this.f3153i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i22 = i2;
                p80 p80Var = this.f3153i;
                switch (i22) {
                    case 0:
                        q80 q80Var = new q80();
                        p80Var.getNavigationEventDispatcher().m1663b(q80Var);
                        return q80Var;
                    default:
                        return new ot1(new RunnableC0446m2(6, p80Var));
                }
            }
        });
        this.f8026l = xm0Var;
        this.f8027m = n80Var;
        this.f8028n = view;
        Window window = getWindow();
        if (window == null) {
            C0676s.m4653l("Dialog has no window");
            throw null;
        }
        n80 n80Var2 = this.f8027m;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = n80Var2.f7048g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        rd3.m4434a(window, this.f8027m.f7046e);
        window.setGravity(17);
        if (!this.f8027m.f7046e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                C0384ke.f5478a.m2645a(attributes2);
            }
            if (i3 >= 30) {
                C0421le c0421le = C0421le.f6075a;
                c0421le.m2900b(attributes2, 0);
                c0421le.m2901c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        m80 m80Var = new m80(getContext(), window);
        setTitle(this.f8027m.f7047f);
        m80Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        m80Var.setClipChildren(false);
        m80Var.setElevation(e70Var.mo689A(8.0f));
        m80Var.setOutlineProvider(new o80(0));
        this.f8029o = m80Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m3794b(viewGroup);
        }
        setContentView(m80Var);
        m80Var.setTag(R.id.view_tree_lifecycle_owner, rb3.m4427b(view));
        m80Var.setTag(R.id.view_tree_view_model_store_owner, tb3.m5156b(view));
        m80Var.setTag(R.id.view_tree_saved_state_registry_owner, sb3.m4784b(view));
        m3797e(this.f8026l, this.f8027m, d61Var);
        ot1 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C0231g8 c0231g8 = new C0231g8(this, 1);
        onBackPressedDispatcher.getClass();
        C0205fj c0205fj = new C0205fj(c0231g8);
        final la1 la1VarM3795c = m3795c();
        if (la1VarM3795c.f6009h == aa1.f119h) {
            return;
        }
        jt1 jt1Var = new jt1(c0205fj, new kt1(c0205fj, this));
        c0205fj.f3011a.add(jt1Var);
        jt1Var.m2563g(false);
        fm1.m1662a(onBackPressedDispatcher.m3639a(), jt1Var);
        final y50 y50Var = new y50(jt1Var, onBackPressedDispatcher, la1VarM3795c);
        la1VarM3795c.mo505a(y50Var);
        c0205fj.f3013c.add(new AutoCloseable() { // from class: lt1
            @Override // java.lang.AutoCloseable
            public final void close() {
                la1VarM3795c.mo506b(y50Var);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m3793a(p80 p80Var) {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: b */
    public static final void m3794b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof m80) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m3794b(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m3796d();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final la1 m3795c() {
        la1 la1Var = this.f8022h;
        if (la1Var != null) {
            return la1Var;
        }
        la1 la1Var2 = new la1(this, true);
        this.f8022h = la1Var2;
        return la1Var2;
    }

    /* JADX INFO: renamed from: d */
    public final void m3796d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX INFO: renamed from: e */
    public final void m3797e(xm0 xm0Var, n80 n80Var, d61 d61Var) {
        int i;
        this.f8026l = xm0Var;
        this.f8027m = n80Var;
        km2 km2Var = n80Var.f7044c;
        boolean zM3832b = AbstractC0573pa.m3832b(this.f8028n);
        int iOrdinal = km2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zM3832b = true;
            } else {
                if (iOrdinal != 2) {
                    c80.m675s();
                    return;
                }
                zM3832b = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zM3832b ? 8192 : -8193, 8192);
        int iOrdinal2 = d61Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                c80.m675s();
                return;
            }
            i = 1;
        }
        m80 m80Var = this.f8029o;
        m80Var.setLayoutDirection(i);
        boolean z = n80Var.f7046e;
        boolean z2 = n80Var.f7045d;
        Window window2 = m80Var.f6505q;
        boolean z3 = (m80Var.f6509u && z2 == m80Var.f6507s && z == m80Var.f6508t) ? false : true;
        m80Var.f6507s = z2;
        m80Var.f6508t = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !m80Var.f6509u) {
                window2.setLayout(i2, -2);
                m80Var.f6509u = true;
            }
        }
        setCanceledOnTouchOutside(n80Var.f7043b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // p000.ia1
    public final ba1 getLifecycle() {
        return m3795c();
    }

    @Override // p000.gm1
    public final fm1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m3639a();
    }

    @Override // p000.pt1
    public final ot1 getOnBackPressedDispatcher() {
        return (ot1) this.f8025k.getValue();
    }

    @Override // p000.tc2
    public final qc2 getSavedStateRegistry() {
        return this.f8023i.f9512b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((q80) this.f8024j.getValue()).m2515a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ot1 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.m3640b(onBackInvokedDispatcher);
        }
        this.f8023i.m4432a(bundle);
        m3795c().m2892e(z91.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f8027m.f7042a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f8026l.mo6a();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f8023i.m4433b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m3795c().m2892e(z91.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        m3795c().m2892e(z91.ON_DESTROY);
        this.f8022h = null;
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iM1869Q;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f8027m.f7043b) {
            m80 m80Var = this.f8029o;
            m80Var.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = m80Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + m80Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + m80Var.getTop();
                int height = childAt.getHeight() + top;
                int iM1869Q2 = gf1.m1869Q(motionEvent.getX());
                if (left <= iM1869Q2 && iM1869Q2 <= width && top <= (iM1869Q = gf1.m1869Q(motionEvent.getY())) && iM1869Q <= height) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                        this.f8030p = false;
                        return zOnTouchEvent;
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f8030p = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.f8030p = false;
                    return zOnTouchEvent;
                }
            } else if (this.f8030p) {
                this.f8026l.mo6a();
                this.f8030p = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        m3796d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        m3796d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m3796d();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
