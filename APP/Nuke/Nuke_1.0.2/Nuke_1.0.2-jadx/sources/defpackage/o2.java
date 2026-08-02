package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o2 extends ViewGroup {
    public WeakReference h;
    public IBinder i;
    public bg3 j;
    public yx k;
    public lx l;
    public xm0 m;
    public boolean n;
    public boolean o;
    public boolean p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o2(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        b9 b9Var = new b9(1, this);
        addOnAttachStateChangeListener(b9Var);
        um2 um2Var = new um2(11);
        t11.y(this).a.add(um2Var);
        this.m = new xa3(this, b9Var, um2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setParentContext(yx yxVar) {
        if (this.k != yxVar) {
            this.k = yxVar;
            if (yxVar != null) {
                this.h = null;
            }
            bg3 bg3Var = this.j;
            if (bg3Var != null) {
                bg3Var.a();
                this.j = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.i != iBinder) {
            this.i = iBinder;
            this.h = null;
        }
    }

    public abstract void a(int i, px pxVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        d();
        super.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.l == null) {
                b7 b7Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof b7) {
                        b7Var = (b7) childAt;
                    }
                }
                if (b7Var != null) {
                    b7Var.setComposeViewContext(l(te.z(this), b7Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                g();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.o) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        lx lxVar;
        View view;
        if (this.k == null && !isAttachedToWindow() && ((lxVar = this.l) == null || (view = lxVar.a) == null || !view.isAttachedToWindow())) {
            s.l("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        View childAt = getChildAt(0);
        b7 b7Var = childAt instanceof b7 ? (b7) childAt : null;
        if (b7Var != null && b7Var.Q0) {
            b7Var.getComposeViewContext().b();
            b7Var.Q0 = false;
        }
        bg3 bg3Var = this.j;
        if (bg3Var != null) {
            bg3Var.a();
        }
        this.j = null;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        if (this.j == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.o = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    lx lxVarJ = this.l;
                    if (lxVarJ == null) {
                        lxVarJ = j();
                    }
                    this.j = dg3.a(this, lxVarJ, new kw(1003123809, true, new n2(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.o = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m14getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        yg ygVar = tag instanceof yg ? (yg) tag : null;
        if (ygVar != null) {
            return ygVar.a;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lx getComposeViewContext$ui() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHasComposition() {
        return this.j != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShowLayoutBounds() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.p || super.isTransitionGroup();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lx j() {
        lx composeViewContext;
        lb3 lb3Var;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            b7 b7Var = childAt instanceof b7 ? (b7) childAt : null;
            if (b7Var != null) {
                composeViewContext = b7Var.getComposeViewContext();
            }
        }
        View viewZ = te.z(this);
        lx lxVarE = te.E(viewZ);
        if (lxVarE != null) {
            return l(viewZ, lxVarE);
        }
        yx yxVarK = k();
        ia1 ia1VarB = rb3.b(viewZ);
        if (ia1VarB == null) {
            ia1VarB = composeViewContext != null ? composeViewContext.c : null;
            if (ia1VarB == null) {
                s.l("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        ia1 ia1Var = ia1VarB;
        tc2 tc2VarB = sb3.b(viewZ);
        if (tc2VarB == null) {
            tc2VarB = composeViewContext != null ? composeViewContext.d : null;
            if (tc2VarB == null) {
                s.l("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        tc2 tc2Var = tc2VarB;
        lb3 lb3VarB = tb3.b(viewZ);
        if (lb3VarB == null) {
            lb3Var = composeViewContext != null ? composeViewContext.e : null;
        } else {
            lb3Var = lb3VarB;
        }
        lx lxVar = new lx(te.E(te.z(viewZ)), viewZ, yxVarK, ia1Var, tc2Var, lb3Var);
        viewZ.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(lxVar));
        return lxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yx k() {
        i62 i62Var;
        a20 a20Var;
        xb xbVar;
        yx yxVarA = this.k;
        if (yxVarA == null) {
            yxVarA = wf3.a(this);
            if (yxVarA == null) {
                Object parent = getParent();
                while (yxVarA == null && (parent instanceof View)) {
                    View view = (View) parent;
                    yxVarA = wf3.a(view);
                    parent = pb3.b(view);
                }
            }
            boolean z = false;
            if (yxVarA != null) {
                yx yxVar = (!(yxVarA instanceof i62) || ((f62) ((i62) yxVarA).u.getValue()).compareTo(f62.i) > 0) ? yxVarA : null;
                if (yxVar != null) {
                    this.h = new WeakReference(yxVar);
                }
            } else {
                yxVarA = null;
            }
            if (yxVarA == null) {
                WeakReference weakReference = this.h;
                if (weakReference == null || (yxVarA = (yx) weakReference.get()) == null || ((yxVarA instanceof i62) && ((f62) ((i62) yxVarA).u.getValue()).compareTo(f62.i) <= 0)) {
                    yxVarA = null;
                }
                if (yxVarA == null) {
                    if (!isAttachedToWindow()) {
                        kz0.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = pb3.b(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    yx yxVarA2 = wf3.a(view2);
                    if (yxVarA2 == null) {
                        ((qf3) rf3.a.get()).getClass();
                        a20 a20Var2 = zd0.h;
                        hx2 hx2Var = vb.t;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            a20Var = (a20) vb.t.getValue();
                        } else {
                            a20Var = (a20) vb.u.get();
                            if (a20Var == null) {
                                s.l("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        a20 a20VarK = a20Var.k(a20Var2);
                        xb xbVar2 = (xb) a20VarK.o(gd3.A);
                        if (xbVar2 != null) {
                            xbVar = new xb(xbVar2);
                            f90 f90Var = (f90) xbVar.j;
                            synchronized (f90Var.b) {
                                f90Var.a = false;
                            }
                        } else {
                            xbVar = null;
                        }
                        o72 o72Var = new o72();
                        a20 gi1Var = (fi1) a20VarK.o(sn.M);
                        if (gi1Var == null) {
                            gi1Var = new gi1(view2.getContext().getApplicationContext());
                            o72Var.i = gi1Var;
                        }
                        if (xbVar != null) {
                            a20Var2 = xbVar;
                        }
                        a20 a20VarK2 = a20VarK.k(a20Var2).k(gi1Var);
                        i62Var = new i62(a20VarK2);
                        synchronized (i62Var.c) {
                            i62Var.t = true;
                        }
                        s00 s00VarE = te.e(a20VarK2);
                        ia1 ia1VarB = rb3.b(view2);
                        ba1 lifecycle = ia1VarB != null ? ia1VarB.getLifecycle() : null;
                        if (lifecycle == null) {
                            kz0.c("ViewTreeLifecycleOwner not found from " + view2);
                            s.b();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new sf3(view2, i62Var));
                        lifecycle.a(new uf3(s00VarE, xbVar, i62Var, o72Var));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, i62Var);
                        fq0 fq0Var = fq0.h;
                        Handler handler = view2.getHandler();
                        int i = wr0.a;
                        view2.addOnAttachStateChangeListener(new b9(2, p7.A(fq0Var, new vr0(handler, "windowRecomposer cleanup", false).m, new a2(i62Var, view2, z ? 1 : 0, 29), 2)));
                    } else {
                        if (!(yxVarA2 instanceof i62)) {
                            s.l("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        i62Var = (i62) yxVarA2;
                    }
                    i62 i62Var2 = ((f62) i62Var.u.getValue()).compareTo(f62.i) > 0 ? i62Var : null;
                    if (i62Var2 != null) {
                        this.h = new WeakReference(i62Var2);
                    }
                    return i62Var;
                }
            }
        }
        return yxVarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lx l(View view, lx lxVar) {
        yx yxVarK = k();
        ia1 ia1VarB = rb3.b(view);
        lb3 lb3VarB = tb3.b(view);
        tc2 tc2VarB = sb3.b(view);
        yx yxVar = lxVar.b;
        tc2 tc2Var = lxVar.d;
        ia1 ia1Var = lxVar.c;
        if (yxVarK == yxVar && ia1VarB == ia1Var && lb3VarB == lxVar.e && tc2VarB == tc2Var) {
            return lxVar;
        }
        if (yxVarK.j() != lxVar.b.j()) {
            f();
        }
        if (ia1VarB == null) {
            ia1VarB = ia1Var;
        }
        lx lxVar2 = new lx(lxVar, view, yxVarK, ia1VarB, tc2VarB == null ? tc2Var : tc2VarB, lb3VarB);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(lxVar2));
        return lxVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rk1 rk1Var = wf3.a;
        Object objB = pb3.b(this);
        View view = this;
        while (objB instanceof View) {
            View view2 = (View) objB;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objB = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new m2(0, this));
        } else {
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g();
        i(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m15setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new yg(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComposeViewContext$ui(lx lxVar) {
        if (this.l != lxVar) {
            if (lxVar == null) {
                f();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                b7 b7Var = childAt instanceof b7 ? (b7) childAt : null;
                if (b7Var != null) {
                    if (b7Var.getCoroutineContext() != lxVar.b.j()) {
                        f();
                    }
                    b7Var.setComposeViewContext(lxVar);
                }
            }
            this.l = lxVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setParentCompositionContext(yx yxVar) {
        setParentContext(yxVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShowLayoutBounds(boolean z) {
        this.n = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((b7) ((zv1) childAt)).setShowLayoutBounds(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.p = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setViewCompositionStrategy(ya3 ya3Var) {
        xm0 xm0Var = this.m;
        if (xm0Var != null) {
            xm0Var.a();
        }
        this.m = ya3Var.n(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        d();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        d();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        d();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
