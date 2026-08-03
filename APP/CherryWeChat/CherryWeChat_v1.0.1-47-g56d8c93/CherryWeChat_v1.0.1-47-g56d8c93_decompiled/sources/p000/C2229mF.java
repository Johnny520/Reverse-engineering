package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mF */
/* JADX INFO: loaded from: classes.dex */
public final class C2229mF extends AbstractC2257n0 implements InterfaceC2523t0 {

    /* JADX INFO: renamed from: a */
    public Context f7772a;

    /* JADX INFO: renamed from: b */
    public Context f7773b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f7774c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f7775d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0492Lc f7776e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f7777f;

    /* JADX INFO: renamed from: g */
    public final View f7778g;

    /* JADX INFO: renamed from: h */
    public boolean f7779h;

    /* JADX INFO: renamed from: i */
    public C2186lF f7780i;

    /* JADX INFO: renamed from: j */
    public C2186lF f7781j;

    /* JADX INFO: renamed from: k */
    public C0649P3 f7782k;

    /* JADX INFO: renamed from: l */
    public boolean f7783l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f7784m;

    /* JADX INFO: renamed from: n */
    public int f7785n;

    /* JADX INFO: renamed from: o */
    public boolean f7786o;

    /* JADX INFO: renamed from: p */
    public boolean f7787p;

    /* JADX INFO: renamed from: q */
    public boolean f7788q;

    /* JADX INFO: renamed from: r */
    public boolean f7789r;

    /* JADX INFO: renamed from: s */
    public boolean f7790s;

    /* JADX INFO: renamed from: t */
    public C0316HE f7791t;

    /* JADX INFO: renamed from: u */
    public boolean f7792u;

    /* JADX INFO: renamed from: v */
    public boolean f7793v;

    /* JADX INFO: renamed from: w */
    public final C2138kF f7794w;

    /* JADX INFO: renamed from: x */
    public final C2138kF f7795x;

    /* JADX INFO: renamed from: y */
    public final C1017Xm f7796y;

    /* JADX INFO: renamed from: z */
    public static final AccelerateInterpolator f7771z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public static final DecelerateInterpolator f7770A = new DecelerateInterpolator();

    public C2229mF(Activity activity, boolean z) {
        new ArrayList();
        this.f7784m = new ArrayList();
        this.f7785n = 0;
        this.f7786o = true;
        this.f7790s = true;
        this.f7794w = new C2138kF(this, 0);
        this.f7795x = new C2138kF(this, 1);
        this.f7796y = new C1017Xm(19, this);
        View decorView = activity.getWindow().getDecorView();
        m4514r(decorView);
        if (z) {
            return;
        }
        this.f7778g = decorView.findViewById(R.id.content);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: b */
    public final boolean mo4502b() {
        C2354pB c2354pB;
        InterfaceC0492Lc interfaceC0492Lc = this.f7776e;
        if (interfaceC0492Lc == null || (c2354pB = ((C2663wB) interfaceC0492Lc).f9213a.f3815M) == null || c2354pB.f8238b == null) {
            return false;
        }
        C2354pB c2354pB2 = ((C2663wB) interfaceC0492Lc).f9213a.f3815M;
        C2427qr c2427qr = c2354pB2 == null ? null : c2354pB2.f8238b;
        if (c2427qr == null) {
            return true;
        }
        c2427qr.collapseActionView();
        return true;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: c */
    public final void mo4503c(boolean z) {
        if (z == this.f7783l) {
            return;
        }
        this.f7783l = z;
        ArrayList arrayList = this.f7784m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: d */
    public final int mo4504d() {
        return ((C2663wB) this.f7776e).f9214b;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: e */
    public final Context mo4505e() {
        if (this.f7773b == null) {
            TypedValue typedValue = new TypedValue();
            this.f7772a.getTheme().resolveAttribute(io.github.cherrywechat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f7773b = new ContextThemeWrapper(this.f7772a, i);
            } else {
                this.f7773b = this.f7772a;
            }
        }
        return this.f7773b;
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: f */
    public final void mo4506f() {
        if (this.f7787p) {
            return;
        }
        this.f7787p = true;
        m4516t(false);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: h */
    public final void mo4507h() {
        m4515s(this.f7772a.getResources().getBoolean(io.github.cherrywechat.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: j */
    public final boolean mo4508j(int i, KeyEvent keyEvent) {
        MenuC2204lr menuC2204lr;
        C2186lF c2186lF = this.f7780i;
        if (c2186lF == null || (menuC2204lr = c2186lF.f7624d) == null) {
            return false;
        }
        menuC2204lr.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC2204lr.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: m */
    public final void mo4509m(boolean z) {
        if (this.f7779h) {
            return;
        }
        int i = z ? 4 : 0;
        C2663wB c2663wB = (C2663wB) this.f7776e;
        int i2 = c2663wB.f9214b;
        this.f7779h = true;
        c2663wB.m5228a((i & 4) | (i2 & (-5)));
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: n */
    public final void mo4510n(boolean z) {
        C0316HE c0316he;
        this.f7792u = z;
        if (z || (c0316he = this.f7791t) == null) {
            return;
        }
        c0316he.m668a();
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: o */
    public final void mo4511o(CharSequence charSequence) {
        C2663wB c2663wB = (C2663wB) this.f7776e;
        if (c2663wB.f9219g) {
            return;
        }
        Toolbar toolbar = c2663wB.f9213a;
        c2663wB.f9220h = charSequence;
        if ((c2663wB.f9214b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c2663wB.f9219g) {
                AbstractC2185lE.m4400m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p000.AbstractC2257n0
    /* JADX INFO: renamed from: p */
    public final AbstractC0345I0 mo4512p(C0649P3 c0649p3) {
        C2186lF c2186lF = this.f7780i;
        if (c2186lF != null) {
            c2186lF.mo735a();
        }
        this.f7774c.setHideOnContentScrollEnabled(false);
        this.f7777f.m2081e();
        C2186lF c2186lF2 = new C2186lF(this, this.f7777f.getContext(), c0649p3);
        MenuC2204lr menuC2204lr = c2186lF2.f7624d;
        menuC2204lr.m4442w();
        try {
            if (!((InterfaceC0302H0) c2186lF2.f7625e.f2089b).mo642b(c2186lF2, menuC2204lr)) {
                return null;
            }
            this.f7780i = c2186lF2;
            c2186lF2.mo741h();
            this.f7777f.m2079c(c2186lF2);
            m4513q(true);
            return c2186lF2;
        } finally {
            menuC2204lr.m4441v();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m4513q(boolean z) {
        C0273GE c0273geM2083i;
        C0273GE c0273geM2083i2;
        if (z) {
            if (!this.f7789r) {
                this.f7789r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7774c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m4516t(false);
            }
        } else if (this.f7789r) {
            this.f7789r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7774c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m4516t(false);
        }
        if (!this.f7775d.isLaidOut()) {
            if (z) {
                ((C2663wB) this.f7776e).f9213a.setVisibility(4);
                this.f7777f.setVisibility(0);
                return;
            } else {
                ((C2663wB) this.f7776e).f9213a.setVisibility(0);
                this.f7777f.setVisibility(8);
                return;
            }
        }
        if (z) {
            C2663wB c2663wB = (C2663wB) this.f7776e;
            c0273geM2083i = AbstractC2185lE.m4388a(c2663wB.f9213a);
            c0273geM2083i.m553a(0.0f);
            c0273geM2083i.m555c(100L);
            c0273geM2083i.m556d(new C2620vB(c2663wB, 4));
            c0273geM2083i2 = this.f7777f.m2083i(0, 200L);
        } else {
            C2663wB c2663wB2 = (C2663wB) this.f7776e;
            C0273GE c0273geM4388a = AbstractC2185lE.m4388a(c2663wB2.f9213a);
            c0273geM4388a.m553a(1.0f);
            c0273geM4388a.m555c(200L);
            c0273geM4388a.m556d(new C2620vB(c2663wB2, 0));
            c0273geM2083i = this.f7777f.m2083i(8, 100L);
            c0273geM2083i2 = c0273geM4388a;
        }
        C0316HE c0316he = new C0316HE();
        ArrayList arrayList = c0316he.f1037a;
        arrayList.add(c0273geM2083i);
        View view = (View) c0273geM2083i.f890a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0273geM2083i2.f890a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0273geM2083i2);
        c0316he.m669b();
    }

    /* JADX INFO: renamed from: r */
    public final void m4514r(View view) {
        InterfaceC0492Lc wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(io.github.cherrywechat.R.id.decor_content_parent);
        this.f7774c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(io.github.cherrywechat.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0492Lc) {
            wrapper = (InterfaceC0492Lc) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f7776e = wrapper;
        this.f7777f = (ActionBarContextView) view.findViewById(io.github.cherrywechat.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(io.github.cherrywechat.R.id.action_bar_container);
        this.f7775d = actionBarContainer;
        InterfaceC0492Lc interfaceC0492Lc = this.f7776e;
        if (interfaceC0492Lc == null || this.f7777f == null || actionBarContainer == null) {
            throw new IllegalStateException(C2229mF.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C2663wB) interfaceC0492Lc).f9213a.getContext();
        this.f7772a = context;
        if ((((C2663wB) this.f7776e).f9214b & 4) != 0) {
            this.f7779h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f7776e.getClass();
        m4515s(context.getResources().getBoolean(io.github.cherrywechat.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f7772a.obtainStyledAttributes(null, AbstractC0982Wu.f3066a, io.github.cherrywechat.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7774c;
            if (!actionBarOverlayLayout2.f3756g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f7793v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f7775d;
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            AbstractC1360eE.m2639k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: s */
    public final void m4515s(boolean z) {
        if (z) {
            this.f7775d.setTabContainer(null);
            ((C2663wB) this.f7776e).getClass();
        } else {
            ((C2663wB) this.f7776e).getClass();
            this.f7775d.setTabContainer(null);
        }
        this.f7776e.getClass();
        ((C2663wB) this.f7776e).f9213a.setCollapsible(false);
        this.f7774c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: t */
    public final void m4516t(boolean z) {
        boolean z2 = this.f7787p;
        boolean z3 = this.f7788q;
        boolean z4 = this.f7789r;
        C1017Xm c1017Xm = this.f7796y;
        View view = this.f7778g;
        if (!z4 && (z2 || z3)) {
            if (this.f7790s) {
                this.f7790s = false;
                C0316HE c0316he = this.f7791t;
                if (c0316he != null) {
                    c0316he.m668a();
                }
                int i = this.f7785n;
                C2138kF c2138kF = this.f7794w;
                if (i != 0 || (!this.f7792u && !z)) {
                    c2138kF.mo796c();
                    return;
                }
                this.f7775d.setAlpha(1.0f);
                this.f7775d.setTransitioning(true);
                C0316HE c0316he2 = new C0316HE();
                float f = -this.f7775d.getHeight();
                if (z) {
                    this.f7775d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0273GE c0273geM4388a = AbstractC2185lE.m4388a(this.f7775d);
                c0273geM4388a.m557e(f);
                View view2 = (View) c0273geM4388a.f890a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c1017Xm != null ? new C0733R2(c1017Xm, view2) : null);
                }
                boolean z5 = c0316he2.f1041e;
                ArrayList arrayList = c0316he2.f1037a;
                if (!z5) {
                    arrayList.add(c0273geM4388a);
                }
                if (this.f7786o && view != null) {
                    C0273GE c0273geM4388a2 = AbstractC2185lE.m4388a(view);
                    c0273geM4388a2.m557e(f);
                    if (!c0316he2.f1041e) {
                        arrayList.add(c0273geM4388a2);
                    }
                }
                boolean z6 = c0316he2.f1041e;
                if (!z6) {
                    c0316he2.f1039c = f7771z;
                }
                if (!z6) {
                    c0316he2.f1038b = 250L;
                }
                if (!z6) {
                    c0316he2.f1040d = c2138kF;
                }
                this.f7791t = c0316he2;
                c0316he2.m669b();
                return;
            }
            return;
        }
        if (this.f7790s) {
            return;
        }
        this.f7790s = true;
        C0316HE c0316he3 = this.f7791t;
        if (c0316he3 != null) {
            c0316he3.m668a();
        }
        this.f7775d.setVisibility(0);
        int i2 = this.f7785n;
        C2138kF c2138kF2 = this.f7795x;
        if (i2 == 0 && (this.f7792u || z)) {
            this.f7775d.setTranslationY(0.0f);
            float f2 = -this.f7775d.getHeight();
            if (z) {
                this.f7775d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f7775d.setTranslationY(f2);
            C0316HE c0316he4 = new C0316HE();
            C0273GE c0273geM4388a3 = AbstractC2185lE.m4388a(this.f7775d);
            c0273geM4388a3.m557e(0.0f);
            View view3 = (View) c0273geM4388a3.f890a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c1017Xm != null ? new C0733R2(c1017Xm, view3) : null);
            }
            boolean z7 = c0316he4.f1041e;
            ArrayList arrayList2 = c0316he4.f1037a;
            if (!z7) {
                arrayList2.add(c0273geM4388a3);
            }
            if (this.f7786o && view != null) {
                view.setTranslationY(f2);
                C0273GE c0273geM4388a4 = AbstractC2185lE.m4388a(view);
                c0273geM4388a4.m557e(0.0f);
                if (!c0316he4.f1041e) {
                    arrayList2.add(c0273geM4388a4);
                }
            }
            boolean z8 = c0316he4.f1041e;
            if (!z8) {
                c0316he4.f1039c = f7770A;
            }
            if (!z8) {
                c0316he4.f1038b = 250L;
            }
            if (!z8) {
                c0316he4.f1040d = c2138kF2;
            }
            this.f7791t = c0316he4;
            c0316he4.m669b();
        } else {
            this.f7775d.setAlpha(1.0f);
            this.f7775d.setTranslationY(0.0f);
            if (this.f7786o && view != null) {
                view.setTranslationY(0.0f);
            }
            c2138kF2.mo796c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7774c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            AbstractC1255cE.m2370c(actionBarOverlayLayout);
        }
    }

    public C2229mF(Dialog dialog) {
        new ArrayList();
        this.f7784m = new ArrayList();
        this.f7785n = 0;
        this.f7786o = true;
        this.f7790s = true;
        this.f7794w = new C2138kF(this, 0);
        this.f7795x = new C2138kF(this, 1);
        this.f7796y = new C1017Xm(19, this);
        m4514r(dialog.getWindow().getDecorView());
    }
}
