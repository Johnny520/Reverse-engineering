package p000;

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

/* JADX INFO: renamed from: o2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0526o2 extends ViewGroup {

    /* JADX INFO: renamed from: h */
    public WeakReference f7438h;

    /* JADX INFO: renamed from: i */
    public IBinder f7439i;

    /* JADX INFO: renamed from: j */
    public bg3 f7440j;

    /* JADX INFO: renamed from: k */
    public AbstractC0941yx f7441k;

    /* JADX INFO: renamed from: l */
    public C0440lx f7442l;

    /* JADX INFO: renamed from: m */
    public xm0 f7443m;

    /* JADX INFO: renamed from: n */
    public boolean f7444n;

    /* JADX INFO: renamed from: o */
    public boolean f7445o;

    /* JADX INFO: renamed from: p */
    public boolean f7446p;

    public AbstractC0526o2(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC0047b9 viewOnAttachStateChangeListenerC0047b9 = new ViewOnAttachStateChangeListenerC0047b9(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0047b9);
        um2 um2Var = new um2(11);
        t11.m5099y(this).f13705a.add(um2Var);
        this.f7443m = new xa3(this, viewOnAttachStateChangeListenerC0047b9, um2Var);
    }

    private final void setParentContext(AbstractC0941yx abstractC0941yx) {
        if (this.f7441k != abstractC0941yx) {
            this.f7441k = abstractC0941yx;
            if (abstractC0941yx != null) {
                this.f7438h = null;
            }
            bg3 bg3Var = this.f7440j;
            if (bg3Var != null) {
                bg3Var.m531a();
                this.f7440j = null;
                if (isAttachedToWindow()) {
                    m3469g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f7439i != iBinder) {
            this.f7439i = iBinder;
            this.f7438h = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo927a(int i, InterfaceC0596px interfaceC0596px);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m3466d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3466d();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m3465c() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f7442l == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7) {
                        viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.setComposeViewContext(m3472l(AbstractC0731te.m5243z(this), viewTreeObserverOnGlobalLayoutListenerC0045b7.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m3469g();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3466d() {
        if (this.f7445o) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: e */
    public final void m3467e() {
        C0440lx c0440lx;
        View view;
        if (this.f7441k == null && !isAttachedToWindow() && ((c0440lx = this.f7442l) == null || (view = c0440lx.f6348a) == null || !view.isAttachedToWindow())) {
            C0676s.m4653l("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m3469g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3468f() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null && viewTreeObserverOnGlobalLayoutListenerC0045b7.f659Q0) {
            viewTreeObserverOnGlobalLayoutListenerC0045b7.getComposeViewContext().m2981b();
            viewTreeObserverOnGlobalLayoutListenerC0045b7.f659Q0 = false;
        }
        bg3 bg3Var = this.f7440j;
        if (bg3Var != null) {
            bg3Var.m531a();
        }
        this.f7440j = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m3469g() {
        if (this.f7440j == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.f7445o = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C0440lx c0440lxM3470j = this.f7442l;
                    if (c0440lxM3470j == null) {
                        c0440lxM3470j = m3470j();
                    }
                    this.f7440j = dg3.m1028a(this, c0440lxM3470j, new C0402kw(1003123809, true, new C0483n2(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.f7445o = false;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m6536getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C0922yg c0922yg = tag instanceof C0922yg ? (C0922yg) tag : null;
        if (c0922yg != null) {
            return c0922yg.f13443a;
        }
        return 1;
    }

    public final C0440lx getComposeViewContext$ui() {
        return this.f7442l;
    }

    public final boolean getHasComposition() {
        return this.f7440j != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f7444n;
    }

    /* JADX INFO: renamed from: h */
    public void mo928h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo929i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f7446p || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0440lx m3470j() {
        C0440lx composeViewContext;
        lb3 lb3Var;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC0045b7.getComposeViewContext();
            }
        }
        View viewM5243z = AbstractC0731te.m5243z(this);
        C0440lx c0440lxM5176E = AbstractC0731te.m5176E(viewM5243z);
        if (c0440lxM5176E != null) {
            return m3472l(viewM5243z, c0440lxM5176E);
        }
        AbstractC0941yx abstractC0941yxM3471k = m3471k();
        ia1 ia1VarM4427b = rb3.m4427b(viewM5243z);
        if (ia1VarM4427b == null) {
            ia1VarM4427b = composeViewContext != null ? composeViewContext.f6350c : null;
            if (ia1VarM4427b == null) {
                C0676s.m4653l("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        ia1 ia1Var = ia1VarM4427b;
        tc2 tc2VarM4784b = sb3.m4784b(viewM5243z);
        if (tc2VarM4784b == null) {
            tc2VarM4784b = composeViewContext != null ? composeViewContext.f6351d : null;
            if (tc2VarM4784b == null) {
                C0676s.m4653l("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        tc2 tc2Var = tc2VarM4784b;
        lb3 lb3VarM5156b = tb3.m5156b(viewM5243z);
        if (lb3VarM5156b == null) {
            lb3Var = composeViewContext != null ? composeViewContext.f6352e : null;
        } else {
            lb3Var = lb3VarM5156b;
        }
        C0440lx c0440lx = new C0440lx(AbstractC0731te.m5176E(AbstractC0731te.m5243z(viewM5243z)), viewM5243z, abstractC0941yxM3471k, ia1Var, tc2Var, lb3Var);
        viewM5243z.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c0440lx));
        return c0440lx;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC0941yx m3471k() {
        i62 i62Var;
        a20 a20Var;
        C0880xb c0880xb;
        AbstractC0941yx abstractC0941yxM5885a = this.f7441k;
        if (abstractC0941yxM5885a == null) {
            abstractC0941yxM5885a = wf3.m5885a(this);
            if (abstractC0941yxM5885a == null) {
                Object parent = getParent();
                while (abstractC0941yxM5885a == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC0941yxM5885a = wf3.m5885a(view);
                    parent = pb3.m3845b(view);
                }
            }
            boolean z = false;
            if (abstractC0941yxM5885a != null) {
                AbstractC0941yx abstractC0941yx = (!(abstractC0941yxM5885a instanceof i62) || ((f62) ((i62) abstractC0941yxM5885a).f4311u.getValue()).compareTo(f62.f2817i) > 0) ? abstractC0941yxM5885a : null;
                if (abstractC0941yx != null) {
                    this.f7438h = new WeakReference(abstractC0941yx);
                }
            } else {
                abstractC0941yxM5885a = null;
            }
            if (abstractC0941yxM5885a == null) {
                WeakReference weakReference = this.f7438h;
                if (weakReference == null || (abstractC0941yxM5885a = (AbstractC0941yx) weakReference.get()) == null || ((abstractC0941yxM5885a instanceof i62) && ((f62) ((i62) abstractC0941yxM5885a).f4311u.getValue()).compareTo(f62.f2817i) <= 0)) {
                    abstractC0941yxM5885a = null;
                }
                if (abstractC0941yxM5885a == null) {
                    if (!isAttachedToWindow()) {
                        kz0.m2764b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = pb3.m3845b(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC0941yx abstractC0941yxM5885a2 = wf3.m5885a(view2);
                    if (abstractC0941yxM5885a2 == null) {
                        ((qf3) rf3.f9547a.get()).getClass();
                        a20 a20Var2 = zd0.f13837h;
                        hx2 hx2Var = C0804vb.f11872t;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            a20Var = (a20) C0804vb.f11872t.getValue();
                        } else {
                            a20Var = (a20) C0804vb.f11873u.get();
                            if (a20Var == null) {
                                C0676s.m4653l("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        a20 a20VarMo14k = a20Var.mo14k(a20Var2);
                        C0880xb c0880xb2 = (C0880xb) a20VarMo14k.mo15o(gd3.f3414A);
                        if (c0880xb2 != null) {
                            c0880xb = new C0880xb(c0880xb2);
                            f90 f90Var = (f90) c0880xb.f12935j;
                            synchronized (f90Var.f2863b) {
                                f90Var.f2862a = false;
                            }
                        } else {
                            c0880xb = null;
                        }
                        o72 o72Var = new o72();
                        a20 gi1Var = (fi1) a20VarMo14k.mo15o(C0700sn.f10209M);
                        if (gi1Var == null) {
                            gi1Var = new gi1(view2.getContext().getApplicationContext());
                            o72Var.f7574i = gi1Var;
                        }
                        if (c0880xb != null) {
                            a20Var2 = c0880xb;
                        }
                        a20 a20VarMo14k2 = a20VarMo14k.mo14k(a20Var2).mo14k(gi1Var);
                        i62Var = new i62(a20VarMo14k2);
                        synchronized (i62Var.f4293c) {
                            i62Var.f4310t = true;
                        }
                        s00 s00VarM5206e = AbstractC0731te.m5206e(a20VarMo14k2);
                        ia1 ia1VarM4427b = rb3.m4427b(view2);
                        ba1 lifecycle = ia1VarM4427b != null ? ia1VarM4427b.getLifecycle() : null;
                        if (lifecycle == null) {
                            kz0.m2765c("ViewTreeLifecycleOwner not found from " + view2);
                            C0676s.m4644b();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new sf3(view2, i62Var));
                        lifecycle.mo505a(new uf3(s00VarM5206e, c0880xb, i62Var, o72Var));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, i62Var);
                        fq0 fq0Var = fq0.f3108h;
                        Handler handler = view2.getHandler();
                        int i = wr0.f12620a;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0047b9(2, AbstractC0570p7.m3745A(fq0Var, new vr0(handler, "windowRecomposer cleanup", false).f12144m, new C0003a2(i62Var, view2, z ? 1 : 0, 29), 2)));
                    } else {
                        if (!(abstractC0941yxM5885a2 instanceof i62)) {
                            C0676s.m4653l("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        i62Var = (i62) abstractC0941yxM5885a2;
                    }
                    i62 i62Var2 = ((f62) i62Var.f4311u.getValue()).compareTo(f62.f2817i) > 0 ? i62Var : null;
                    if (i62Var2 != null) {
                        this.f7438h = new WeakReference(i62Var2);
                    }
                    return i62Var;
                }
            }
        }
        return abstractC0941yxM5885a;
    }

    /* JADX INFO: renamed from: l */
    public final C0440lx m3472l(View view, C0440lx c0440lx) {
        AbstractC0941yx abstractC0941yxM3471k = m3471k();
        ia1 ia1VarM4427b = rb3.m4427b(view);
        lb3 lb3VarM5156b = tb3.m5156b(view);
        tc2 tc2VarM4784b = sb3.m4784b(view);
        AbstractC0941yx abstractC0941yx = c0440lx.f6349b;
        tc2 tc2Var = c0440lx.f6351d;
        ia1 ia1Var = c0440lx.f6350c;
        if (abstractC0941yxM3471k == abstractC0941yx && ia1VarM4427b == ia1Var && lb3VarM5156b == c0440lx.f6352e && tc2VarM4784b == tc2Var) {
            return c0440lx;
        }
        if (abstractC0941yxM3471k.mo1384j() != c0440lx.f6349b.mo1384j()) {
            m3468f();
        }
        if (ia1VarM4427b == null) {
            ia1VarM4427b = ia1Var;
        }
        C0440lx c0440lx2 = new C0440lx(c0440lx, view, abstractC0941yxM3471k, ia1VarM4427b, tc2VarM4784b == null ? tc2Var : tc2VarM4784b, lb3VarM5156b);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c0440lx2));
        return c0440lx2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rk1 rk1Var = wf3.f12494a;
        Object objM3845b = pb3.m3845b(this);
        View view = this;
        while (objM3845b instanceof View) {
            View view2 = (View) objM3845b;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM3845b = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC0446m2(0, this));
        } else {
            m3465c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo928h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m3469g();
        mo929i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m6537setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C0922yg(i));
    }

    public final void setComposeViewContext$ui(C0440lx c0440lx) {
        if (this.f7442l != c0440lx) {
            if (c0440lx == null) {
                m3468f();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC0045b7.getCoroutineContext() != c0440lx.f6349b.mo1384j()) {
                        m3468f();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.setComposeViewContext(c0440lx);
                }
            }
            this.f7442l = c0440lx;
        }
    }

    public final void setParentCompositionContext(AbstractC0941yx abstractC0941yx) {
        setParentContext(abstractC0941yx);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f7444n = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) ((zv1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f7446p = true;
    }

    public final void setViewCompositionStrategy(ya3 ya3Var) {
        xm0 xm0Var = this.f7443m;
        if (xm0Var != null) {
            xm0Var.mo6a();
        }
        this.f7443m = ya3Var.mo2188n(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m3466d();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m3466d();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m3466d();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3466d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3466d();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
