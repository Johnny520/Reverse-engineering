package p357y1;

import ac.AbstractC0063p;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0098d0;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.InterfaceC0112q;
import ci.C0589j;
import gg.C1425u;
import java.lang.ref.WeakReference;
import okio.C3193a;
import p002a1.C0010h;
import p007a7.AbstractC0018a;
import p014b.C0125d;
import p036c9.C0416a1;
import p069f.C0943k0;
import p071f1.ViewOnAttachStateChangeListenerC0999e;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p099h.Hchat.R;
import p117i0.AbstractC1863o;
import p117i0.C1819d;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1897y1;
import p117i0.EnumC1885u1;
import p136j8.C2095f;
import p136j8.C2104o;
import p249qg.AbstractC3546a;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3612z0;
import p249qg.EnumC3601u;
import p263rg.AbstractC3810g;
import p263rg.C3808e;
import p266s0.C3874d;
import p276sf.C3962i;
import p292u1.AbstractC4229a;
import p294u3.InterfaceC4250c;
import p332wb.RunnableC4794cr;
import p339x1.InterfaceC5641r1;
import p353xg.C5808e;
import p356y0.C5840b;
import p356y0.InterfaceC5854p;
import vg.C4554c;
import wf.C5558d;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5858a extends ViewGroup {

    /* JADX INFO: renamed from: g */
    public WeakReference f23806g;

    /* JADX INFO: renamed from: h */
    public IBinder f23807h;

    /* JADX INFO: renamed from: i */
    public C5953x2 f23808i;

    /* JADX INFO: renamed from: j */
    public AbstractC1863o f23809j;

    /* JADX INFO: renamed from: k */
    public C5880f1 f23810k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1220a f23811l;

    /* JADX INFO: renamed from: m */
    public boolean f23812m;

    /* JADX INFO: renamed from: n */
    public boolean f23813n;

    /* JADX INFO: renamed from: o */
    public boolean f23814o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5858a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC5893i2 viewOnAttachStateChangeListenerC5893i2 = new ViewOnAttachStateChangeListenerC5893i2(this, 1);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC5893i2);
        C3193a c3193a = new C3193a(27);
        AbstractC0018a.m259w(this).f7408a.add(c3193a);
        this.f23811l = new C5897j2(this, viewOnAttachStateChangeListenerC5893i2, c3193a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setParentContext(AbstractC1863o abstractC1863o) {
        if (this.f23809j != abstractC1863o) {
            this.f23809j = abstractC1863o;
            if (abstractC1863o != null) {
                this.f23806g = null;
            }
            C5953x2 c5953x2 = this.f23808i;
            if (c5953x2 != null) {
                c5953x2.m10672e();
                this.f23808i = null;
                if (isAttachedToWindow()) {
                    m10556g();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f23807h != iBinder) {
            this.f23807h = iBinder;
            this.f23806g = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10551a(C1836h0 c1836h0, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m10553d();
        super.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        m10553d();
        return super.addViewInLayout(view, i9, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10552b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f23810k == null) {
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t) {
                        viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                    viewTreeObserverOnGlobalLayoutListenerC5934t.setComposeViewContext(m10561l(AbstractC5883g0.m10593i(this), viewTreeObserverOnGlobalLayoutListenerC5934t.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m10556g();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10553d() {
        if (this.f23813n) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10554e() {
        C5880f1 c5880f1;
        View view;
        if (this.f23809j == null && !isAttachedToWindow() && ((c5880f1 = this.f23810k) == null || (view = c5880f1.f23857a) == null || !view.isAttachedToWindow())) {
            C2104o.m5276A("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m10556g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10555f() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC5934t != null && viewTreeObserverOnGlobalLayoutListenerC5934t.f24093P0) {
            viewTreeObserverOnGlobalLayoutListenerC5934t.getComposeViewContext().m10582b();
            viewTreeObserverOnGlobalLayoutListenerC5934t.f24093P0 = false;
        }
        C5953x2 c5953x2 = this.f23808i;
        if (c5953x2 != null) {
            c5953x2.m10672e();
        }
        this.f23808i = null;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10556g() {
        if (this.f23808i == null) {
            try {
                this.f23813n = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C5880f1 c5880f1M10559j = this.f23810k;
                    if (c5880f1M10559j == null) {
                        c5880f1M10559j = m10559j();
                    }
                    this.f23808i = AbstractC5961z2.m10709a(this, c5880f1M10559j, new C3874d(1003123809, new C0010h(this, 3), true));
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } finally {
                this.f23813n = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m11085getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C5939u0 c5939u0 = tag instanceof C5939u0 ? (C5939u0) tag : null;
        if (c5939u0 != null) {
            return c5939u0.f24155a;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C5880f1 getComposeViewContext$ui() {
        return this.f23810k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHasComposition() {
        return this.f23808i != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShowLayoutBounds() {
        return this.f23812m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void mo10557h(boolean z9, int i9, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i9) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void mo10558i(int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i9, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i9)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f23814o || super.isTransitionGroup();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5880f1 m10559j() {
        C5880f1 composeViewContext;
        C0416a1 c0416a1;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC5934t.getComposeViewContext();
            }
        }
        View viewM10593i = AbstractC5883g0.m10593i(this);
        C5880f1 c5880f1M10594j = AbstractC5883g0.m10594j(viewM10593i);
        if (c5880f1M10594j != null) {
            return m10561l(viewM10593i, c5880f1M10594j);
        }
        AbstractC1863o abstractC1863oM10560k = m10560k();
        InterfaceC0112q interfaceC0112qM543a = AbstractC0098d0.m543a(viewM10593i);
        if (interfaceC0112qM543a == null) {
            interfaceC0112qM543a = composeViewContext != null ? composeViewContext.f23859c : null;
            if (interfaceC0112qM543a == null) {
                C2104o.m5276A("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        InterfaceC0112q interfaceC0112q = interfaceC0112qM543a;
        InterfaceC4250c interfaceC4250cM427t = AbstractC0063p.m427t(viewM10593i);
        if (interfaceC4250cM427t == null) {
            interfaceC4250cM427t = composeViewContext != null ? composeViewContext.f23860d : null;
            if (interfaceC4250cM427t == null) {
                C2104o.m5276A("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        InterfaceC4250c interfaceC4250c = interfaceC4250cM427t;
        C0416a1 c0416a1M544b = AbstractC0098d0.m544b(viewM10593i);
        if (c0416a1M544b == null) {
            c0416a1 = composeViewContext != null ? composeViewContext.f23861e : null;
        } else {
            c0416a1 = c0416a1M544b;
        }
        C5880f1 c5880f1 = new C5880f1(AbstractC5883g0.m10594j(AbstractC5883g0.m10593i(viewM10593i)), viewM10593i, abstractC1863oM10560k, interfaceC0112q, interfaceC4250c, c0416a1);
        viewM10593i.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c5880f1));
        return c5880f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final AbstractC1863o m10560k() {
        C1897y1 c1897y1;
        InterfaceC5561g interfaceC5561g;
        C1819d c1819d;
        AbstractC1863o abstractC1863oM10671a = this.f23809j;
        if (abstractC1863oM10671a == null) {
            abstractC1863oM10671a = AbstractC5945v2.m10671a(this);
            if (abstractC1863oM10671a == null) {
                Object parent = getParent();
                while (abstractC1863oM10671a == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC1863oM10671a = AbstractC5945v2.m10671a(view);
                    parent = AbstractC1184v0.m3210t(view);
                }
            }
            boolean z9 = false;
            if (abstractC1863oM10671a != null) {
                AbstractC1863o abstractC1863o = (!(abstractC1863oM10671a instanceof C1897y1) || ((EnumC1885u1) ((C1897y1) abstractC1863oM10671a).f6323u.getValue()).compareTo(EnumC1885u1.f6257h) > 0) ? abstractC1863oM10671a : null;
                if (abstractC1863o != null) {
                    this.f23806g = new WeakReference(abstractC1863o);
                }
            } else {
                abstractC1863oM10671a = null;
            }
            if (abstractC1863oM10671a == null) {
                WeakReference weakReference = this.f23806g;
                if (weakReference == null || (abstractC1863oM10671a = (AbstractC1863o) weakReference.get()) == null || ((abstractC1863oM10671a instanceof C1897y1) && ((EnumC1885u1) ((C1897y1) abstractC1863oM10671a).f6323u.getValue()).compareTo(EnumC1885u1.f6257h) <= 0)) {
                    abstractC1863oM10671a = null;
                }
                if (abstractC1863oM10671a == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC4229a.m8494b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = AbstractC1184v0.m3210t(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC1863o abstractC1863oM10671a2 = AbstractC5945v2.m10671a(view2);
                    if (abstractC1863oM10671a2 == null) {
                        ((C5925q2) AbstractC5929r2.f24044a.get()).getClass();
                        InterfaceC5561g interfaceC5561g2 = C5562h.f22661g;
                        C3962i c3962i = C5911n0.f23984s;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC5561g = (InterfaceC5561g) C5911n0.f23984s.getValue();
                        } else {
                            interfaceC5561g = (InterfaceC5561g) C5911n0.f23985t.get();
                            if (interfaceC5561g == null) {
                                C2104o.m5276A("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        InterfaceC5561g interfaceC5561gMo2059e = interfaceC5561g.mo2059e(interfaceC5561g2);
                        C1819d c1819d2 = (C1819d) interfaceC5561gMo2059e.mo2062s(C1823e.f6048i);
                        if (c1819d2 != null) {
                            c1819d = new C1819d(c1819d2);
                            C2095f c2095f = (C2095f) c1819d.f6043i;
                            synchronized (c2095f.f7001b) {
                                c2095f.f7000a = false;
                            }
                        } else {
                            c1819d = null;
                        }
                        C1425u c1425u = new C1425u();
                        InterfaceC5561g c5960z1 = (InterfaceC5854p) interfaceC5561gMo2059e.mo2062s(C5840b.f23776v);
                        if (c5960z1 == null) {
                            c5960z1 = new C5960z1(view2.getContext().getApplicationContext());
                            c1425u.f4738g = c5960z1;
                        }
                        if (c1819d != null) {
                            interfaceC5561g2 = c1819d;
                        }
                        InterfaceC5561g interfaceC5561gMo2059e2 = interfaceC5561gMo2059e.mo2059e(interfaceC5561g2).mo2059e(c5960z1);
                        c1897y1 = new C1897y1(interfaceC5561gMo2059e2);
                        synchronized (c1897y1.f6305c) {
                            c1897y1.f6322t = true;
                        }
                        C4554c c4554cM7547a = AbstractC3603v.m7547a(interfaceC5561gMo2059e2);
                        InterfaceC0112q interfaceC0112qM543a = AbstractC0098d0.m543a(view2);
                        C0114s c0114sMo550f = interfaceC0112qM543a != null ? interfaceC0112qM543a.mo550f() : null;
                        if (c0114sMo550f == null) {
                            AbstractC4229a.m8495c("ViewTreeLifecycleOwner not found from " + view2);
                            C3193a.m6814c();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5933s2(view2, c1897y1));
                        c0114sMo550f.m552a(new C0125d(c4554cM7547a, c1819d, c1897y1, c1425u));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c1897y1);
                        Handler handler = view2.getHandler();
                        int i9 = AbstractC3810g.f12500a;
                        InterfaceC5561g interfaceC5561g3 = new C3808e(handler, "windowRecomposer cleanup", false).f12497l;
                        C0589j c0589j = new C0589j((Object) c1897y1, (Object) view2, (InterfaceC5557c) (z9 ? 1 : 0), 28);
                        EnumC3601u enumC3601u = EnumC3601u.f11616j;
                        if ((2 & 1) != 0) {
                            interfaceC5561g3 = C5562h.f22661g;
                        }
                        if ((2 & 2) != 0) {
                            enumC3601u = EnumC3601u.f11613g;
                        }
                        InterfaceC5561g interfaceC5561gM7554h = AbstractC3603v.m7554h(C5562h.f22661g, interfaceC5561g3, true);
                        C5808e c5808e = AbstractC3553c0.f11555a;
                        if (interfaceC5561gM7554h != c5808e && interfaceC5561gM7554h.mo2062s(C5558d.f22660g) == null) {
                            interfaceC5561gM7554h = interfaceC5561gM7554h.mo2059e(c5808e);
                        }
                        AbstractC3546a c3612z0 = enumC3601u == EnumC3601u.f11614h ? new C3612z0(interfaceC5561gM7554h, c0589j) : new C3560e1(interfaceC5561gM7554h, true);
                        c3612z0.m7472c0(enumC3601u, c3612z0, c0589j);
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0999e(c3612z0, 2));
                    } else {
                        if (!(abstractC1863oM10671a2 instanceof C1897y1)) {
                            C2104o.m5276A("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        c1897y1 = (C1897y1) abstractC1863oM10671a2;
                    }
                    C1897y1 c1897y12 = ((EnumC1885u1) c1897y1.f6323u.getValue()).compareTo(EnumC1885u1.f6257h) > 0 ? c1897y1 : null;
                    if (c1897y12 != null) {
                        this.f23806g = new WeakReference(c1897y12);
                    }
                    return c1897y1;
                }
            }
        }
        return abstractC1863oM10671a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C5880f1 m10561l(View view, C5880f1 c5880f1) {
        AbstractC1863o abstractC1863oM10560k = m10560k();
        InterfaceC0112q interfaceC0112qM543a = AbstractC0098d0.m543a(view);
        C0416a1 c0416a1M544b = AbstractC0098d0.m544b(view);
        InterfaceC4250c interfaceC4250cM427t = AbstractC0063p.m427t(view);
        AbstractC1863o abstractC1863o = c5880f1.f23858b;
        InterfaceC4250c interfaceC4250c = c5880f1.f23860d;
        InterfaceC0112q interfaceC0112q = c5880f1.f23859c;
        if (abstractC1863oM10560k == abstractC1863o && interfaceC0112qM543a == interfaceC0112q && c0416a1M544b == c5880f1.f23861e && interfaceC4250cM427t == interfaceC4250c) {
            return c5880f1;
        }
        if (abstractC1863oM10560k.mo4470j() != c5880f1.f23858b.mo4470j()) {
            m10555f();
        }
        if (interfaceC0112qM543a == null) {
            interfaceC0112qM543a = interfaceC0112q;
        }
        C5880f1 c5880f12 = new C5880f1(c5880f1, view, abstractC1863oM10560k, interfaceC0112qM543a, interfaceC4250cM427t == null ? interfaceC4250c : interfaceC4250cM427t, c0416a1M544b);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c5880f12));
        return c5880f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0943k0 c0943k0 = AbstractC5945v2.f24167a;
        Object objM3210t = AbstractC1184v0.m3210t(this);
        View view = this;
        while (objM3210t instanceof View) {
            View view2 = (View) objM3210t;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM3210t = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC4794cr(this, 6));
        } else {
            m10552b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        mo10557h(z9, i9, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        m10556g();
        mo10558i(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m11086setAutoClearFocusBehavior17tfJxM(int i9) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C5939u0(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComposeViewContext$ui(C5880f1 c5880f1) {
        if (this.f23810k != c5880f1) {
            if (c5880f1 == null) {
                m10555f();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC5934t.getCoroutineContext() != c5880f1.f23858b.mo4470j()) {
                        m10555f();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC5934t.setComposeViewContext(c5880f1);
                }
            }
            this.f23810k = c5880f1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setParentCompositionContext(AbstractC1863o abstractC1863o) {
        setParentContext(abstractC1863o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShowLayoutBounds(boolean z9) {
        this.f23812m = z9;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) ((InterfaceC5641r1) childAt)).setShowLayoutBounds(z9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z9) {
        super.setTransitionGroup(z9);
        this.f23814o = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setViewCompositionStrategy(InterfaceC5901k2 interfaceC5901k2) {
        InterfaceC1220a interfaceC1220a = this.f23811l;
        if (interfaceC1220a != null) {
            interfaceC1220a.invoke();
        }
        this.f23811l = interfaceC5901k2.mo10617a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9) {
        m10553d();
        super.addView(view, i9);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z9) {
        m10553d();
        return super.addViewInLayout(view, i9, layoutParams, z9);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, int i10) {
        m10553d();
        super.addView(view, i9, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m10553d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        m10553d();
        super.addView(view, i9, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
