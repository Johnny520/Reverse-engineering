package p176i1;

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
import com.bumptech.glide.AbstractC1924f;
import java.util.UUID;
import me.dartcv.nuke.R;
import p000A.C0099z;
import p002A1.AbstractC0116E;
import p002A1.AbstractC0142o;
import p002A1.C0134g;
import p002A1.C0147t;
import p002A1.EnumC0140m;
import p002A1.EnumC0141n;
import p002A1.InterfaceC0145r;
import p027E4.C0330q;
import p028F.RunnableC0346g;
import p030F1.C0436a;
import p030F1.C0438c;
import p030F1.InterfaceC0439d;
import p047I0.C0699U0;
import p048I1.C0780e;
import p048I1.C0781f;
import p048I1.InterfaceC0782g;
import p049I2.AbstractC0797o;
import p055K1.C0874a;
import p056K2.C0887m;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p135b.C1809A;
import p135b.C1810B;
import p135b.C1833u;
import p135b.C1834v;
import p135b.InterfaceC1811C;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p176i1.DialogC2308x;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: i1.x */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2308x extends Dialog implements InterfaceC0145r, InterfaceC1811C, InterfaceC0439d, InterfaceC0782g {

    /* JADX INFO: renamed from: d */
    public C0147t f7512d;

    /* JADX INFO: renamed from: e */
    public final C0781f f7513e;

    /* JADX INFO: renamed from: f */
    public final C0887m f7514f;

    /* JADX INFO: renamed from: g */
    public final C0887m f7515g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1599a f7516h;

    /* JADX INFO: renamed from: i */
    public C2307w f7517i;

    /* JADX INFO: renamed from: j */
    public final View f7518j;

    /* JADX INFO: renamed from: k */
    public final C2306v f7519k;

    /* JADX INFO: renamed from: l */
    public boolean f7520l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogC2308x(InterfaceC1599a interfaceC1599a, C2307w c2307w, View view, EnumC2017m enumC2017m, InterfaceC2007c interfaceC2007c, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c2307w.f7510e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f7513e = new C0781f(new C0874a(this, new C0099z(6, this)));
        final int i5 = 0;
        this.f7514f = AbstractC0797o.m1396u(new InterfaceC1599a(this) { // from class: b.l

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DialogC2308x f6221e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6221e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i5) {
                    case 0:
                        C0436a c0436a = new C0436a();
                        this.f6221e.getNavigationEventDispatcher().m700b(c0436a);
                        return c0436a;
                    default:
                        return new C1809A(new RunnableC0346g(6, this.f6221e));
                }
            }
        });
        final int i6 = 1;
        this.f7515g = AbstractC0797o.m1396u(new InterfaceC1599a(this) { // from class: b.l

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DialogC2308x f6221e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6221e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                switch (i6) {
                    case 0:
                        C0436a c0436a = new C0436a();
                        this.f6221e.getNavigationEventDispatcher().m700b(c0436a);
                        return c0436a;
                    default:
                        return new C1809A(new RunnableC0346g(6, this.f6221e));
                }
            }
        });
        this.f7516h = interfaceC1599a;
        this.f7517i = c2307w;
        this.f7518j = view;
        float f2 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC1924f.m3511y(window, this.f7517i.f7510e);
        window.setGravity(17);
        if (!this.f7517i.f7510e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                C2300p.f7493a.m4125a(attributes);
            }
            if (i7 >= 30) {
                C2301q c2301q = C2301q.f7494a;
                c2301q.m4127b(attributes, 0);
                c2301q.m4128c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        C2306v c2306v = new C2306v(getContext(), window);
        setTitle(this.f7517i.f7511f);
        c2306v.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c2306v.setClipChildren(false);
        c2306v.setElevation(interfaceC2007c.mo268G(f2));
        c2306v.setOutlineProvider(new C0699U0(1));
        this.f7519k = c2306v;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m4134b(viewGroup);
        }
        setContentView(c2306v);
        AbstractC0116E.m165g(c2306v, AbstractC0116E.m162d(view));
        c2306v.setTag(R.id.view_tree_view_model_store_owner, AbstractC0116E.m163e(view));
        c2306v.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC2352g.m4206s(view));
        m4136d(this.f7516h, this.f7517i, enumC2017m);
        C1809A onBackPressedDispatcher = getOnBackPressedDispatcher();
        C2285a c2285a = new C2285a(this, 1);
        AbstractC1665j.m2985e(onBackPressedDispatcher, "<this>");
        C1810B c1810b = new C1810B(c2285a);
        final AbstractC0142o lifecycle = getLifecycle();
        if (((C0147t) lifecycle).f541c == EnumC0141n.f531d) {
            return;
        }
        C1833u c1833u = new C1833u(c1810b, new C1834v(c1810b, this));
        c1810b.f6193a.add(c1833u);
        c1833u.m3298g(false);
        C0438c.m699a(onBackPressedDispatcher.m3285a().f6237c, c1833u);
        final C0134g c0134g = new C0134g(c1833u, onBackPressedDispatcher, lifecycle);
        lifecycle.mo184a(c0134g);
        c1810b.f6195c.add(new AutoCloseable() { // from class: b.w
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.mo185b(c0134g);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m4133a(DialogC2308x dialogC2308x) {
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4134b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C2306v) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m4134b(viewGroup2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1665j.m2985e(view, "view");
        m4135c();
        super.addContentView(view, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4135c() {
        Window window = getWindow();
        AbstractC1665j.m2982b(window);
        View decorView = window.getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        AbstractC0116E.m165g(decorView, this);
        Window window2 = getWindow();
        AbstractC1665j.m2982b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC1665j.m2984d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC1665j.m2982b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC1665j.m2984d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        AbstractC1665j.m2982b(window4);
        View decorView4 = window4.getDecorView();
        AbstractC1665j.m2984d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4136d(InterfaceC1599a interfaceC1599a, C2307w c2307w, EnumC2017m enumC2017m) {
        int i5;
        this.f7516h = interfaceC1599a;
        this.f7517i = c2307w;
        EnumC2284E enumC2284E = c2307w.f7508c;
        boolean zM4123b = AbstractC2298n.m4123b(this.f7518j);
        int iOrdinal = enumC2284E.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zM4123b = true;
            } else {
                if (iOrdinal != 2) {
                    throw new C0330q();
                }
                zM4123b = false;
            }
        }
        Window window = getWindow();
        AbstractC1665j.m2982b(window);
        window.setFlags(zM4123b ? 8192 : -8193, 8192);
        int iOrdinal2 = enumC2017m.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new C0330q();
            }
            i5 = 1;
        }
        C2306v c2306v = this.f7519k;
        c2306v.setLayoutDirection(i5);
        boolean z5 = c2307w.f7510e;
        boolean z6 = c2307w.f7509d;
        Window window2 = c2306v.f7500l;
        boolean z7 = (c2306v.f7504p && z6 == c2306v.f7502n && z5 == c2306v.f7503o) ? false : true;
        c2306v.f7502n = z6;
        c2306v.f7503o = z5;
        if (z7) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i6 = z6 ? -2 : -1;
            if (i6 != attributes.width || !c2306v.f7504p) {
                window2.setLayout(i6, -2);
                c2306v.f7504p = true;
            }
        }
        setCanceledOnTouchOutside(c2307w.f7507b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z5 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0145r
    public final AbstractC0142o getLifecycle() {
        C0147t c0147t = this.f7512d;
        if (c0147t != null) {
            return c0147t;
        }
        C0147t c0147t2 = new C0147t(this, true);
        this.f7512d = c0147t2;
        return c0147t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.InterfaceC0439d
    public final C0438c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().m3285a().f6237c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p135b.InterfaceC1811C
    public final C1809A getOnBackPressedDispatcher() {
        return (C1809A) this.f7515g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p048I1.InterfaceC0782g
    public final C0780e getSavedStateRegistry() {
        return this.f7513e.f2525b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C0436a) this.f7514f.getValue()).m709a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C1809A onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1665j.m2984d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.m3286b(onBackInvokedDispatcher);
        }
        this.f7513e.m1329a(bundle);
        C0147t c0147t = this.f7512d;
        if (c0147t == null) {
            c0147t = new C0147t(this, true);
            this.f7512d = c0147t;
        }
        c0147t.m189e(EnumC0140m.ON_CREATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (!this.f7517i.f7506a || !keyEvent.isTracking() || keyEvent.isCanceled() || i5 != 111) {
            return super.onKeyUp(i5, keyEvent);
        }
        this.f7516h.mo6a();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC1665j.m2984d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f7513e.m1330b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0147t c0147t = this.f7512d;
        if (c0147t == null) {
            c0147t = new C0147t(this, true);
            this.f7512d = c0147t;
        }
        c0147t.m189e(EnumC0140m.ON_RESUME);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void onStop() {
        C0147t c0147t = this.f7512d;
        if (c0147t == null) {
            c0147t = new C0147t(this, true);
            this.f7512d = c0147t;
        }
        c0147t.m189e(EnumC0140m.ON_DESTROY);
        this.f7512d = null;
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
        int iM3200N;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f7517i.f7507b) {
            C2306v c2306v = this.f7519k;
            c2306v.getClass();
            float x5 = motionEvent.getX();
            if (!Float.isInfinite(x5) && !Float.isNaN(x5)) {
                float y5 = motionEvent.getY();
                if (!Float.isInfinite(y5) && !Float.isNaN(y5) && (childAt = c2306v.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + c2306v.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + c2306v.getTop();
                    int height = childAt.getHeight() + top;
                    int iM3200N2 = AbstractC1784a.m3200N(motionEvent.getX());
                    if (left <= iM3200N2 && iM3200N2 <= width && top <= (iM3200N = AbstractC1784a.m3200N(motionEvent.getY())) && iM3200N <= height) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                            this.f7520l = false;
                            return zOnTouchEvent;
                        }
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f7520l = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.f7520l = false;
                    return zOnTouchEvent;
                }
            } else if (this.f7520l) {
                this.f7516h.mo6a();
                this.f7520l = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public final void setContentView(int i5) {
        m4135c();
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        AbstractC1665j.m2985e(view, "view");
        m4135c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1665j.m2985e(view, "view");
        m4135c();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
