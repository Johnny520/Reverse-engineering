package p047I0;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1924f;
import java.lang.ref.WeakReference;
import me.dartcv.nuke.R;
import p000A.C0039U;
import p002A1.AbstractC0116E;
import p002A1.AbstractC0142o;
import p002A1.InterfaceC0145r;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p029F0.C0363A;
import p041H0.InterfaceC0614q0;
import p056K2.C0887m;
import p068N1.C1013c;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1051i;
import p095T.AbstractC1391v;
import p095T.C1357e;
import p095T.C1400z0;
import p095T.EnumC1392v0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p117X2.C1675t;
import p136b0.C1843e;
import p160f3.AbstractC2100C;
import p160f3.AbstractC2123a;
import p160f3.AbstractC2162v;
import p160f3.C2124a0;
import p160f3.C2136g0;
import p160f3.EnumC2161u;
import p166g3.AbstractC2188e;
import p166g3.C2187d;
import p169h0.C2194c;
import p169h0.InterfaceC2208q;
import p190k3.C2455c;
import p201m3.C2608e;

/* JADX INFO: renamed from: I0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0713b extends ViewGroup {

    /* JADX INFO: renamed from: d */
    public WeakReference f2255d;

    /* JADX INFO: renamed from: e */
    public IBinder f2256e;

    /* JADX INFO: renamed from: f */
    public C0745l1 f2257f;

    /* JADX INFO: renamed from: g */
    public AbstractC1391v f2258g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1599a f2259h;

    /* JADX INFO: renamed from: i */
    public boolean f2260i;

    /* JADX INFO: renamed from: j */
    public boolean f2261j;

    /* JADX INFO: renamed from: k */
    public boolean f2262k;

    public AbstractC0713b(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC0690P0 viewOnAttachStateChangeListenerC0690P0 = new ViewOnAttachStateChangeListenerC0690P0(this, 1);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0690P0);
        C0363A c0363a = new C0363A(1);
        AbstractC1923e.m3444B(this).f10583a.add(c0363a);
        this.f2259h = new C0692Q0(this, viewOnAttachStateChangeListenerC0690P0, c0363a);
    }

    private final void setParentContext(AbstractC1391v abstractC1391v) {
        if (this.f2258g != abstractC1391v) {
            this.f2258g = abstractC1391v;
            if (abstractC1391v != null) {
                this.f2255d = null;
            }
            C0745l1 c0745l1 = this.f2257f;
            if (c0745l1 != null) {
                c0745l1.m1263a();
                this.f2257f = null;
                if (isAttachedToWindow()) {
                    m1213e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f2256e != iBinder) {
            this.f2256e = iBinder;
            this.f2255d = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m1211c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        m1211c();
        return super.addViewInLayout(view, i5, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1210b(int i5, InterfaceC1373m interfaceC1373m);

    /* JADX INFO: renamed from: c */
    public final void m1211c() {
        if (this.f2261j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: d */
    public final void m1212d() {
        C0745l1 c0745l1 = this.f2257f;
        if (c0745l1 != null) {
            c0745l1.m1263a();
        }
        this.f2257f = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public final void m1213e() {
        if (this.f2257f == null) {
            try {
                this.f2261j = true;
                this.f2257f = AbstractC0751n1.m1269a(this, m1216h(), new C1843e(-656146368, true, new C0710a(0, this)));
            } finally {
                this.f2261j = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo1214f(boolean z5, int i5, int i6, int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i7 - i5) - getPaddingRight(), (i8 - i6) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo1215g(int i5, int i6) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i5, i6);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i5)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i6)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m5891getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C0729g0 c0729g0 = tag instanceof C0729g0 ? (C0729g0) tag : null;
        if (c0729g0 != null) {
            return c0729g0.f2300a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.f2257f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f2260i;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC1391v m1216h() {
        C1400z0 c1400z0;
        InterfaceC1051i interfaceC1051i;
        C0711a0 c0711a0;
        AbstractC1391v abstractC1391vM1233b = this.f2258g;
        if (abstractC1391vM1233b == null) {
            abstractC1391vM1233b = AbstractC0736i1.m1233b(this);
            if (abstractC1391vM1233b == null) {
                Object parent = getParent();
                while (abstractC1391vM1233b == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC1391vM1233b = AbstractC0736i1.m1233b(view);
                    parent = AbstractC1924f.m3501m(view);
                }
            }
            boolean z5 = false;
            if (abstractC1391vM1233b != null) {
                AbstractC1391v abstractC1391v = (!(abstractC1391vM1233b instanceof C1400z0) || ((EnumC1392v0) ((C1400z0) abstractC1391vM1233b).f5015u.getValue()).compareTo(EnumC1392v0.f4935e) > 0) ? abstractC1391vM1233b : null;
                if (abstractC1391v != null) {
                    this.f2255d = new WeakReference(abstractC1391v);
                }
            } else {
                abstractC1391vM1233b = null;
            }
            if (abstractC1391vM1233b == null) {
                WeakReference weakReference = this.f2255d;
                if (weakReference == null || (abstractC1391vM1233b = (AbstractC1391v) weakReference.get()) == null || ((abstractC1391vM1233b instanceof C1400z0) && ((EnumC1392v0) ((C1400z0) abstractC1391vM1233b).f5015u.getValue()).compareTo(EnumC1392v0.f4935e) <= 0)) {
                    abstractC1391vM1233b = null;
                }
                if (abstractC1391vM1233b == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC0277a.m483b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                    AbstractC1391v abstractC1391vM1233b2 = AbstractC0736i1.m1233b(view2);
                    if (abstractC1391vM1233b2 == null) {
                        ((C0707Y0) AbstractC0712a1.f2254a.get()).getClass();
                        InterfaceC1051i interfaceC1051i2 = C1052j.f3286d;
                        C0887m c0887m = C0706Y.f2233p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC1051i = (InterfaceC1051i) C0706Y.f2233p.getValue();
                        } else {
                            interfaceC1051i = (InterfaceC1051i) C0706Y.f2234q.get();
                            if (interfaceC1051i == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC1051i interfaceC1051iMo1168m = interfaceC1051i.mo1168m(interfaceC1051i2);
                        C0711a0 c0711a02 = (C0711a0) interfaceC1051iMo1168m.mo1166C(C1357e.f4794f);
                        int i5 = 0;
                        if (c0711a02 != null) {
                            c0711a0 = new C0711a0(c0711a02);
                            C1013c c1013c = (C1013c) c0711a0.f2253f;
                            synchronized (c1013c.f3129b) {
                                c1013c.f3128a = false;
                            }
                        } else {
                            c0711a0 = null;
                        }
                        C1675t c1675t = new C1675t();
                        InterfaceC1051i c0670f0 = (InterfaceC2208q) interfaceC1051iMo1168m.mo1166C(C2194c.f7174r);
                        if (c0670f0 == null) {
                            c0670f0 = new C0670F0();
                            c1675t.f5710e = c0670f0;
                        }
                        if (c0711a0 != null) {
                            interfaceC1051i2 = c0711a0;
                        }
                        InterfaceC1051i interfaceC1051iMo1168m2 = interfaceC1051iMo1168m.mo1168m(interfaceC1051i2).mo1168m(c0670f0);
                        c1400z0 = new C1400z0(interfaceC1051iMo1168m2);
                        synchronized (c1400z0.f4997c) {
                            c1400z0.f5014t = true;
                        }
                        C2455c c2455cM3979a = AbstractC2162v.m3979a(interfaceC1051iMo1168m2);
                        InterfaceC0145r interfaceC0145rM162d = AbstractC0116E.m162d(view2);
                        AbstractC0142o lifecycle = interfaceC0145rM162d != null ? interfaceC0145rM162d.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC0277a.m484c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new C0330q();
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0715b1(view2, c1400z0));
                        lifecycle.mo184a(new C0727f1(c2455cM3979a, c0711a0, c1400z0, c1675t, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c1400z0);
                        Handler handler = view2.getHandler();
                        int i6 = AbstractC2188e.f7154a;
                        InterfaceC1051i interfaceC1051i3 = new C2187d(handler, "windowRecomposer cleanup", false).f7153i;
                        C0039U c0039u = new C0039U(c1400z0, view2, z5 ? 1 : 0, 2);
                        EnumC2161u enumC2161u = EnumC2161u.f7108g;
                        if ((2 & 1) != 0) {
                            interfaceC1051i3 = C1052j.f3286d;
                        }
                        if ((2 & 2) != 0) {
                            enumC2161u = EnumC2161u.f7105d;
                        }
                        InterfaceC1051i interfaceC1051iM3985g = AbstractC2162v.m3985g(C1052j.f3286d, interfaceC1051i3, true);
                        C2608e c2608e = AbstractC2100C.f7029a;
                        if (interfaceC1051iM3985g != c2608e && interfaceC1051iM3985g.mo1166C(C1047e.f3285d) == null) {
                            interfaceC1051iM3985g = interfaceC1051iM3985g.mo1168m(c2608e);
                        }
                        AbstractC2123a c2124a0 = enumC2161u == EnumC2161u.f7106e ? new C2124a0(interfaceC1051iM3985g, c0039u) : new C2136g0(interfaceC1051iM3985g, true);
                        c2124a0.m3949f0(enumC2161u, c2124a0, c0039u);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0709Z0(i5, c2124a0));
                    } else {
                        if (!(abstractC1391vM1233b2 instanceof C1400z0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c1400z0 = (C1400z0) abstractC1391vM1233b2;
                    }
                    C1400z0 c1400z02 = ((EnumC1392v0) c1400z0.f5015u.getValue()).compareTo(EnumC1392v0.f4935e) > 0 ? c1400z0 : null;
                    if (c1400z02 != null) {
                        this.f2255d = new WeakReference(c1400z02);
                    }
                    return c1400z0;
                }
            }
        }
        return abstractC1391vM1233b;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f2262k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m1213e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        mo1214f(z5, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        m1213e();
        mo1215g(i5, i6);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i5);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m5892setAutoClearFocusBehavior17tfJxM(int i5) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C0729g0(i5));
    }

    public final void setParentCompositionContext(AbstractC1391v abstractC1391v) {
        setParentContext(abstractC1391v);
    }

    public final void setShowLayoutBounds(boolean z5) {
        this.f2260i = z5;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) ((InterfaceC0614q0) childAt)).setShowLayoutBounds(z5);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z5) {
        super.setTransitionGroup(z5);
        this.f2262k = true;
    }

    public final void setViewCompositionStrategy(InterfaceC0693R0 interfaceC0693R0) {
        InterfaceC1599a interfaceC1599a = this.f2259h;
        if (interfaceC1599a != null) {
            interfaceC1599a.mo6a();
        }
        this.f2259h = interfaceC0693R0.mo64b(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5) {
        m1211c();
        super.addView(view, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z5) {
        m1211c();
        return super.addViewInLayout(view, i5, layoutParams, z5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, int i6) {
        m1211c();
        super.addView(view, i5, i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m1211c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        m1211c();
        super.addView(view, i5, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
