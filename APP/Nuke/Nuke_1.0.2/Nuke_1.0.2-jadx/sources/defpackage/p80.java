package defpackage;

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
    public la1 h;
    public final rc2 i;
    public final hx2 j;
    public final hx2 k;
    public xm0 l;
    public n80 m;
    public final View n;
    public final m80 o;
    public boolean p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(xm0 xm0Var, n80 n80Var, View view, d61 d61Var, e70 e70Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), n80Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.i = new rc2(new sc2(this, new ta(20, this)));
        this.j = new hx2(new xm0(this) { // from class: fw
            public final /* synthetic */ p80 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i2 = i;
                p80 p80Var = this.i;
                switch (i2) {
                    case 0:
                        q80 q80Var = new q80();
                        p80Var.getNavigationEventDispatcher().b(q80Var);
                        return q80Var;
                    default:
                        return new ot1(new m2(6, p80Var));
                }
            }
        });
        final int i2 = 1;
        this.k = new hx2(new xm0(this) { // from class: fw
            public final /* synthetic */ p80 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i22 = i2;
                p80 p80Var = this.i;
                switch (i22) {
                    case 0:
                        q80 q80Var = new q80();
                        p80Var.getNavigationEventDispatcher().b(q80Var);
                        return q80Var;
                    default:
                        return new ot1(new m2(6, p80Var));
                }
            }
        });
        this.l = xm0Var;
        this.m = n80Var;
        this.n = view;
        Window window = getWindow();
        if (window == null) {
            s.l("Dialog has no window");
            throw null;
        }
        n80 n80Var2 = this.m;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = n80Var2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        rd3.a(window, this.m.e);
        window.setGravity(17);
        if (!this.m.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                ke.a.a(attributes2);
            }
            if (i3 >= 30) {
                le leVar = le.a;
                leVar.b(attributes2, 0);
                leVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        m80 m80Var = new m80(getContext(), window);
        setTitle(this.m.f);
        m80Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        m80Var.setClipChildren(false);
        m80Var.setElevation(e70Var.A(8.0f));
        m80Var.setOutlineProvider(new o80(0));
        this.o = m80Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(m80Var);
        m80Var.setTag(R.id.view_tree_lifecycle_owner, rb3.b(view));
        m80Var.setTag(R.id.view_tree_view_model_store_owner, tb3.b(view));
        m80Var.setTag(R.id.view_tree_saved_state_registry_owner, sb3.b(view));
        e(this.l, this.m, d61Var);
        ot1 onBackPressedDispatcher = getOnBackPressedDispatcher();
        g8 g8Var = new g8(this, 1);
        onBackPressedDispatcher.getClass();
        fj fjVar = new fj(g8Var);
        final la1 la1VarC = c();
        if (la1VarC.h == aa1.h) {
            return;
        }
        jt1 jt1Var = new jt1(fjVar, new kt1(fjVar, this));
        fjVar.a.add(jt1Var);
        jt1Var.g(false);
        fm1.a(onBackPressedDispatcher.a(), jt1Var);
        final y50 y50Var = new y50(jt1Var, onBackPressedDispatcher, la1VarC);
        la1VarC.a(y50Var);
        fjVar.c.add(new AutoCloseable() { // from class: lt1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.AutoCloseable
            public final void close() {
                la1VarC.b(y50Var);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(p80 p80Var) {
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof m80) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final la1 c() {
        la1 la1Var = this.h;
        if (la1Var != null) {
            return la1Var;
        }
        la1 la1Var2 = new la1(this, true);
        this.h = la1Var2;
        return la1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(xm0 xm0Var, n80 n80Var, d61 d61Var) {
        int i;
        this.l = xm0Var;
        this.m = n80Var;
        km2 km2Var = n80Var.c;
        boolean zB = pa.b(this.n);
        int iOrdinal = km2Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    c80.s();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = d61Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                c80.s();
                return;
            }
            i = 1;
        }
        m80 m80Var = this.o;
        m80Var.setLayoutDirection(i);
        boolean z = n80Var.e;
        boolean z2 = n80Var.d;
        Window window2 = m80Var.q;
        boolean z3 = (m80Var.u && z2 == m80Var.s && z == m80Var.t) ? false : true;
        m80Var.s = z2;
        m80Var.t = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !m80Var.u) {
                window2.setLayout(i2, -2);
                m80Var.u = true;
            }
        }
        setCanceledOnTouchOutside(n80Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ia1
    public final ba1 getLifecycle() {
        return c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gm1
    public final fm1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pt1
    public final ot1 getOnBackPressedDispatcher() {
        return (ot1) this.k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tc2
    public final qc2 getSavedStateRegistry() {
        return this.i.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((q80) this.j.getValue()).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ot1 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.b(onBackInvokedDispatcher);
        }
        this.i.a(bundle);
        c().e(z91.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.m.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.l.a();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.i.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().e(z91.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStop() {
        c().e(z91.ON_DESTROY);
        this.h = null;
        super.onStop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iQ;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.m.b) {
            m80 m80Var = this.o;
            m80Var.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = m80Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + m80Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + m80Var.getTop();
                int height = childAt.getHeight() + top;
                int iQ2 = gf1.Q(motionEvent.getX());
                if (left <= iQ2 && iQ2 <= width && top <= (iQ = gf1.Q(motionEvent.getY())) && iQ <= height) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                        this.p = false;
                        return zOnTouchEvent;
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.p = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.p = false;
                    return zOnTouchEvent;
                }
            } else if (this.p) {
                this.l.a();
                this.p = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
