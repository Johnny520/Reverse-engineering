package p061e;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
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
import p004C.C0066j;
import p014H.C0142a;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p061e.C0524E;
import p066g.C0570j;
import p066g.C0571k;
import p069i.C0697m1;
import p069i.InterfaceC0671e;
import p069i.InterfaceC0702o0;
import p099y.AbstractC1038B;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;
import p099y.C1054S;

/* JADX INFO: renamed from: e.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0524E extends AbstractC0503h implements InterfaceC0671e {

    /* JADX INFO: renamed from: O */
    public static final AccelerateInterpolator f1681O = new AccelerateInterpolator();

    /* JADX INFO: renamed from: P */
    public static final DecelerateInterpolator f1682P = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public boolean f1683A;

    /* JADX INFO: renamed from: B */
    public final ArrayList f1684B;

    /* JADX INFO: renamed from: C */
    public int f1685C;

    /* JADX INFO: renamed from: D */
    public boolean f1686D;

    /* JADX INFO: renamed from: E */
    public boolean f1687E;

    /* JADX INFO: renamed from: F */
    public boolean f1688F;

    /* JADX INFO: renamed from: G */
    public boolean f1689G;

    /* JADX INFO: renamed from: H */
    public boolean f1690H;

    /* JADX INFO: renamed from: I */
    public C0571k f1691I;

    /* JADX INFO: renamed from: J */
    public boolean f1692J;

    /* JADX INFO: renamed from: K */
    public boolean f1693K;

    /* JADX INFO: renamed from: L */
    public final C0522C f1694L;

    /* JADX INFO: renamed from: M */
    public final C0522C f1695M;

    /* JADX INFO: renamed from: N */
    public final C0066j f1696N;

    /* JADX INFO: renamed from: p */
    public Context f1697p;

    /* JADX INFO: renamed from: q */
    public Context f1698q;

    /* JADX INFO: renamed from: r */
    public ActionBarOverlayLayout f1699r;

    /* JADX INFO: renamed from: s */
    public ActionBarContainer f1700s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0702o0 f1701t;

    /* JADX INFO: renamed from: u */
    public ActionBarContextView f1702u;

    /* JADX INFO: renamed from: v */
    public final View f1703v;

    /* JADX INFO: renamed from: w */
    public boolean f1704w;

    /* JADX INFO: renamed from: x */
    public C0523D f1705x;

    /* JADX INFO: renamed from: y */
    public C0523D f1706y;

    /* JADX INFO: renamed from: z */
    public C0142a f1707z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0524E(Activity activity, boolean z2) {
        new ArrayList();
        this.f1684B = new ArrayList();
        this.f1685C = 0;
        this.f1686D = true;
        this.f1690H = true;
        this.f1694L = new C0522C(this, 0);
        this.f1695M = new C0522C(this, 1);
        this.f1696N = new C0066j(14, this);
        View decorView = activity.getWindow().getDecorView();
        m1064S(decorView);
        if (z2) {
            return;
        }
        this.f1703v = decorView.findViewById(R.id.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m1062Q(boolean z2) {
        C1054S c1054sM658i;
        C1054S c1054sM658i2;
        if (z2) {
            if (!this.f1689G) {
                this.f1689G = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1699r;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m1067V(false);
            }
        } else if (this.f1689G) {
            this.f1689G = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1699r;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m1067V(false);
        }
        ActionBarContainer actionBarContainer = this.f1700s;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((C0697m1) this.f1701t).f2351a.setVisibility(4);
                this.f1702u.setVisibility(0);
                return;
            } else {
                ((C0697m1) this.f1701t).f2351a.setVisibility(0);
                this.f1702u.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C0697m1 c0697m1 = (C0697m1) this.f1701t;
            c1054sM658i = AbstractC1048L.m2282a(c0697m1.f2351a);
            c1054sM658i.m2303a(0.0f);
            c1054sM658i.m2305c(100L);
            c1054sM658i.m2306d(new C0570j(c0697m1, 4));
            c1054sM658i2 = this.f1702u.m658i(200L, 0);
        } else {
            C0697m1 c0697m12 = (C0697m1) this.f1701t;
            C1054S c1054sM2282a = AbstractC1048L.m2282a(c0697m12.f2351a);
            c1054sM2282a.m2303a(1.0f);
            c1054sM2282a.m2305c(200L);
            c1054sM2282a.m2306d(new C0570j(c0697m12, 0));
            c1054sM658i = this.f1702u.m658i(100L, 8);
            c1054sM658i2 = c1054sM2282a;
        }
        C0571k c0571k = new C0571k();
        ArrayList arrayList = c0571k.f1934a;
        arrayList.add(c1054sM658i);
        View view = (View) c1054sM658i.f3669a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c1054sM658i2.f3669a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c1054sM658i2);
        c0571k.m1138b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final Context m1063R() {
        if (this.f1698q == null) {
            TypedValue typedValue = new TypedValue();
            this.f1697p.getTheme().resolveAttribute(com.p055lu.wxmask272.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1698q = new ContextThemeWrapper(this.f1697p, i2);
            } else {
                this.f1698q = this.f1697p;
            }
        }
        return this.f1698q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m1064S(View view) {
        InterfaceC0702o0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.p055lu.wxmask272.R.id.decor_content_parent);
        this.f1699r = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.p055lu.wxmask272.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0702o0) {
            wrapper = (InterfaceC0702o0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1701t = wrapper;
        this.f1702u = (ActionBarContextView) view.findViewById(com.p055lu.wxmask272.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.p055lu.wxmask272.R.id.action_bar_container);
        this.f1700s = actionBarContainer;
        InterfaceC0702o0 interfaceC0702o0 = this.f1701t;
        if (interfaceC0702o0 == null || this.f1702u == null || actionBarContainer == null) {
            throw new IllegalStateException(C0524E.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C0697m1) interfaceC0702o0).f2351a.getContext();
        this.f1697p = context;
        if ((((C0697m1) this.f1701t).f2352b & 4) != 0) {
            this.f1704w = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f1701t.getClass();
        m1066U(context.getResources().getBoolean(com.p055lu.wxmask272.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1697p.obtainStyledAttributes(null, AbstractC0515a.f1637a, com.p055lu.wxmask272.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1699r;
            if (!actionBarOverlayLayout2.f984i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1693K = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1700s;
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            AbstractC1038B.m2244s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m1065T(boolean z2) {
        if (this.f1704w) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        C0697m1 c0697m1 = (C0697m1) this.f1701t;
        int i3 = c0697m1.f2352b;
        this.f1704w = true;
        c0697m1.m1323a((i2 & 4) | (i3 & (-5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final void m1066U(boolean z2) {
        if (z2) {
            this.f1700s.setTabContainer(null);
            ((C0697m1) this.f1701t).getClass();
        } else {
            ((C0697m1) this.f1701t).getClass();
            this.f1700s.setTabContainer(null);
        }
        this.f1701t.getClass();
        ((C0697m1) this.f1701t).f2351a.setCollapsible(false);
        this.f1699r.setHasNonEmbeddedTabs(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final void m1067V(boolean z2) {
        boolean z3 = this.f1689G || !(this.f1687E || this.f1688F);
        View view = this.f1703v;
        final C0066j c0066j = this.f1696N;
        if (!z3) {
            if (this.f1690H) {
                this.f1690H = false;
                C0571k c0571k = this.f1691I;
                if (c0571k != null) {
                    c0571k.m1137a();
                }
                int i2 = this.f1685C;
                C0522C c0522c = this.f1694L;
                if (i2 != 0 || (!this.f1692J && !z2)) {
                    c0522c.mo1047a();
                    return;
                }
                this.f1700s.setAlpha(1.0f);
                this.f1700s.setTransitioning(true);
                C0571k c0571k2 = new C0571k();
                float f = -this.f1700s.getHeight();
                if (z2) {
                    this.f1700s.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C1054S c1054sM2282a = AbstractC1048L.m2282a(this.f1700s);
                c1054sM2282a.m2307e(f);
                final View view2 = (View) c1054sM2282a.f3669a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0066j != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: y.Q
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C0524E) this.f3668a.f312c).f1700s.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = c0571k2.f1938e;
                ArrayList arrayList = c0571k2.f1934a;
                if (!z4) {
                    arrayList.add(c1054sM2282a);
                }
                if (this.f1686D && view != null) {
                    C1054S c1054sM2282a2 = AbstractC1048L.m2282a(view);
                    c1054sM2282a2.m2307e(f);
                    if (!c0571k2.f1938e) {
                        arrayList.add(c1054sM2282a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f1681O;
                boolean z5 = c0571k2.f1938e;
                if (!z5) {
                    c0571k2.f1936c = accelerateInterpolator;
                }
                if (!z5) {
                    c0571k2.f1935b = 250L;
                }
                if (!z5) {
                    c0571k2.f1937d = c0522c;
                }
                this.f1691I = c0571k2;
                c0571k2.m1138b();
                return;
            }
            return;
        }
        if (this.f1690H) {
            return;
        }
        this.f1690H = true;
        C0571k c0571k3 = this.f1691I;
        if (c0571k3 != null) {
            c0571k3.m1137a();
        }
        this.f1700s.setVisibility(0);
        int i3 = this.f1685C;
        C0522C c0522c2 = this.f1695M;
        if (i3 == 0 && (this.f1692J || z2)) {
            this.f1700s.setTranslationY(0.0f);
            float f2 = -this.f1700s.getHeight();
            if (z2) {
                this.f1700s.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f1700s.setTranslationY(f2);
            C0571k c0571k4 = new C0571k();
            C1054S c1054sM2282a3 = AbstractC1048L.m2282a(this.f1700s);
            c1054sM2282a3.m2307e(0.0f);
            final View view3 = (View) c1054sM2282a3.f3669a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0066j != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: y.Q
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C0524E) this.f3668a.f312c).f1700s.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = c0571k4.f1938e;
            ArrayList arrayList2 = c0571k4.f1934a;
            if (!z6) {
                arrayList2.add(c1054sM2282a3);
            }
            if (this.f1686D && view != null) {
                view.setTranslationY(f2);
                C1054S c1054sM2282a4 = AbstractC1048L.m2282a(view);
                c1054sM2282a4.m2307e(0.0f);
                if (!c0571k4.f1938e) {
                    arrayList2.add(c1054sM2282a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f1682P;
            boolean z7 = c0571k4.f1938e;
            if (!z7) {
                c0571k4.f1936c = decelerateInterpolator;
            }
            if (!z7) {
                c0571k4.f1935b = 250L;
            }
            if (!z7) {
                c0571k4.f1937d = c0522c2;
            }
            this.f1691I = c0571k4;
            c0571k4.m1138b();
        } else {
            this.f1700s.setAlpha(1.0f);
            this.f1700s.setTranslationY(0.0f);
            if (this.f1686D && view != null) {
                view.setTranslationY(0.0f);
            }
            c0522c2.mo1047a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1699r;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            AbstractC1094z.m2366c(actionBarOverlayLayout);
        }
    }

    public C0524E(Dialog dialog) {
        new ArrayList();
        this.f1684B = new ArrayList();
        this.f1685C = 0;
        this.f1686D = true;
        this.f1690H = true;
        this.f1694L = new C0522C(this, 0);
        this.f1695M = new C0522C(this, 1);
        this.f1696N = new C0066j(14, this);
        m1064S(dialog.getWindow().getDecorView());
    }
}
