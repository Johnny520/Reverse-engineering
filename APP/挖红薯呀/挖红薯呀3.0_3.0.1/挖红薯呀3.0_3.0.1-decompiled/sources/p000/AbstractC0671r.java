package p000;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: r */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0671r extends ViewGroup {

    /* JADX INFO: renamed from: d */
    public WeakReference f5252d;

    /* JADX INFO: renamed from: e */
    public IBinder f5253e;

    /* JADX INFO: renamed from: f */
    public we1 f5254f;

    /* JADX INFO: renamed from: g */
    public AbstractC0727si f5255g;

    /* JADX INFO: renamed from: h */
    public lc1 f5256h;

    /* JADX INFO: renamed from: i */
    public boolean f5257i;

    /* JADX INFO: renamed from: j */
    public boolean f5258j;

    /* JADX INFO: renamed from: k */
    public boolean f5259k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0671r(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC0677r5 viewOnAttachStateChangeListenerC0677r5 = new ViewOnAttachStateChangeListenerC0677r5(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0677r5);
        C0921xc c0921xc = new C0921xc(22);
        j50.m1665o(this).f6285a.add(c0921xc);
        this.f5256h = new lc1(this, viewOnAttachStateChangeListenerC0677r5, c0921xc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setParentContext(AbstractC0727si abstractC0727si) {
        if (this.f5255g != abstractC0727si) {
            this.f5255g = abstractC0727si;
            if (abstractC0727si != null) {
                this.f5252d = null;
            }
            we1 we1Var = this.f5254f;
            if (we1Var != null) {
                we1Var.m5011d();
                this.f5254f = null;
                if (isAttachedToWindow()) {
                    m3368d();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f5253e != iBinder) {
            this.f5253e = iBinder;
            this.f5252d = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m3367c();
        super.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3367c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1246b(InterfaceC0356ji interfaceC0356ji, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3367c() {
        if (this.f5258j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m3368d() {
        if (this.f5254f == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.f5258j = true;
                this.f5254f = ye1.m5256a(this, m3371g(), new C0474mh(-656146368, true, new C0634q(objArr == true ? 1 : 0, this)));
            } finally {
                this.f5258j = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void mo3369e(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void mo3370f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final AbstractC0727si m3371g() {
        ot0 ot0Var;
        InterfaceC0618pk interfaceC0618pk;
        C0715s6 c0715s6;
        AbstractC0727si abstractC0727siM2888b = this.f5255g;
        if (abstractC0727siM2888b == null) {
            abstractC0727siM2888b = oe1.m2888b(this);
            if (abstractC0727siM2888b == null) {
                Object parent = getParent();
                while (abstractC0727siM2888b == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC0727siM2888b = oe1.m2888b(view);
                    parent = z60.m5455y(view);
                }
            }
            boolean z = false;
            if (abstractC0727siM2888b != null) {
                AbstractC0727si abstractC0727si = (!(abstractC0727siM2888b instanceof ot0) || ((jt0) ((ot0) abstractC0727siM2888b).f4651u.getValue()).compareTo(jt0.f2942e) > 0) ? abstractC0727siM2888b : null;
                if (abstractC0727si != null) {
                    this.f5252d = new WeakReference(abstractC0727si);
                }
            } else {
                abstractC0727siM2888b = null;
            }
            if (abstractC0727siM2888b == null) {
                WeakReference weakReference = this.f5252d;
                if (weakReference == null || (abstractC0727siM2888b = (AbstractC0727si) weakReference.get()) == null || ((abstractC0727siM2888b instanceof ot0) && ((jt0) ((ot0) abstractC0727siM2888b).f4651u.getValue()).compareTo(jt0.f2942e) <= 0)) {
                    abstractC0727siM2888b = null;
                }
                if (abstractC0727siM2888b == null) {
                    if (!isAttachedToWindow()) {
                        w10.m4824b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC0727si abstractC0727siM2888b2 = oe1.m2888b(view2);
                    if (abstractC0727siM2888b2 == null) {
                        ((ie1) je1.f2807a.get()).getClass();
                        InterfaceC0618pk interfaceC0618pk2 = C0220fs.f1799d;
                        x51 x51Var = C0641q6.f5044p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC0618pk = (InterfaceC0618pk) C0641q6.f5044p.getValue();
                        } else {
                            interfaceC0618pk = (InterfaceC0618pk) C0641q6.f5045q.get();
                            if (interfaceC0618pk == null) {
                                C0921xc.m5134o("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        InterfaceC0618pk interfaceC0618pkMo63h = interfaceC0618pk.mo63h(interfaceC0618pk2);
                        C0715s6 c0715s62 = (C0715s6) interfaceC0618pkMo63h.mo64l(C0496n2.f4130J);
                        if (c0715s62 != null) {
                            c0715s6 = new C0715s6(c0715s62);
                            d50 d50Var = (d50) c0715s6.f5657f;
                            synchronized (d50Var.f970b) {
                                d50Var.f969a = false;
                            }
                        } else {
                            c0715s6 = null;
                        }
                        zt0 zt0Var = new zt0();
                        InterfaceC0618pk yf0Var = (xf0) interfaceC0618pkMo63h.mo64l(C0496n2.f4131K);
                        if (yf0Var == null) {
                            yf0Var = new yf0();
                            zt0Var.f7995d = yf0Var;
                        }
                        if (c0715s6 != null) {
                            interfaceC0618pk2 = c0715s6;
                        }
                        InterfaceC0618pk interfaceC0618pkMo63h2 = interfaceC0618pkMo63h.mo63h(interfaceC0618pk2).mo63h(yf0Var);
                        ot0Var = new ot0(interfaceC0618pkMo63h2);
                        synchronized (ot0Var.f4633c) {
                            ot0Var.f4650t = true;
                        }
                        C0286hk c0286hkM2995e = p30.m2995e(interfaceC0618pkMo63h2);
                        x90 x90VarM1663m = j50.m1663m(view2);
                        s90 lifecycle = x90VarM1663m != null ? x90VarM1663m.getLifecycle() : null;
                        if (lifecycle == null) {
                            w10.m4825c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new C0725sg();
                        }
                        view2.addOnAttachStateChangeListener(new ke1(view2, ot0Var));
                        lifecycle.mo4014a(new me1(c0286hkM2995e, c0715s6, ot0Var, zt0Var, view2));
                        view2.setTag(C0587R.id.androidx_compose_ui_view_composition_context, ot0Var);
                        Handler handler = view2.getHandler();
                        int i = AbstractC0335iy.f2634a;
                        InterfaceC0618pk interfaceC0618pk3 = new C0300hy(handler, "windowRecomposer cleanup", false).f2375i;
                        C0154e c0154e = new C0154e(ot0Var, view2, z ? 1 : 0, 14);
                        EnumC0059bl enumC0059bl = EnumC0059bl.f541g;
                        if ((2 & 1) != 0) {
                            interfaceC0618pk3 = C0220fs.f1799d;
                        }
                        int i2 = 2;
                        if ((2 & 2) != 0) {
                            enumC0059bl = EnumC0059bl.f538d;
                        }
                        InterfaceC0618pk interfaceC0618pkM1540p = AbstractC0307i4.m1540p(C0220fs.f1799d, interfaceC0618pk3, true);
                        C0436lm c0436lm = AbstractC0326io.f2592a;
                        if (interfaceC0618pkM1540p != c0436lm && interfaceC0618pkM1540p.mo64l(C0496n2.f4163w) == null) {
                            interfaceC0618pkM1540p = interfaceC0618pkM1540p.mo63h(c0436lm);
                        }
                        AbstractC0708s g90Var = enumC0059bl == EnumC0059bl.f539e ? new g90(interfaceC0618pkM1540p, c0154e) : new r31(interfaceC0618pkM1540p, true);
                        g90Var.m3990l0(enumC0059bl, g90Var, c0154e);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0677r5(i2, g90Var));
                    } else {
                        if (!(abstractC0727siM2888b2 instanceof ot0)) {
                            C0921xc.m5134o("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        ot0Var = (ot0) abstractC0727siM2888b2;
                    }
                    ot0 ot0Var2 = ((jt0) ot0Var.f4651u.getValue()).compareTo(jt0.f2942e) > 0 ? ot0Var : null;
                    if (ot0Var2 != null) {
                        this.f5252d = new WeakReference(ot0Var2);
                    }
                    return ot0Var;
                }
            }
        }
        return abstractC0727siM2888b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m5737getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(C0587R.id.auto_clear_focus_behavior_tag);
        C0275h9 c0275h9 = tag instanceof C0275h9 ? (C0275h9) tag : null;
        if (c0275h9 != null) {
            return c0275h9.f2180a;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHasComposition() {
        return this.f5254f != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShowLayoutBounds() {
        return this.f5257i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f5259k || super.isTransitionGroup();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m3368d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo3369e(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m3368d();
        mo3370f(i, i2);
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
    public final void m5738setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(C0587R.id.auto_clear_focus_behavior_tag, new C0275h9(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setParentCompositionContext(AbstractC0727si abstractC0727si) {
        setParentContext(abstractC0727si);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShowLayoutBounds(boolean z) {
        this.f5257i = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) ((dn0) childAt)).setShowLayoutBounds(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f5259k = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setViewCompositionStrategy(mc1 mc1Var) {
        lc1 lc1Var = this.f5256h;
        if (lc1Var != null) {
            lc1Var.invoke();
        }
        ((w60) mc1Var).getClass();
        ViewOnAttachStateChangeListenerC0677r5 viewOnAttachStateChangeListenerC0677r5 = new ViewOnAttachStateChangeListenerC0677r5(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0677r5);
        C0921xc c0921xc = new C0921xc(22);
        j50.m1665o(this).f6285a.add(c0921xc);
        this.f5256h = new lc1(this, viewOnAttachStateChangeListenerC0677r5, c0921xc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m3367c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m3367c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m3367c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3367c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3367c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
