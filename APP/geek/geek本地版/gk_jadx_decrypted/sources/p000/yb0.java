package p000;

import android.R;
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

/* JADX INFO: loaded from: classes.dex */
public final class yb0 extends a80 implements InterfaceC0002a1 {

    /* JADX INFO: renamed from: U */
    public static final AccelerateInterpolator f5305U = new AccelerateInterpolator();

    /* JADX INFO: renamed from: V */
    public static final DecelerateInterpolator f5306V = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public InterfaceC0296hf f5307A;

    /* JADX INFO: renamed from: B */
    public ActionBarContextView f5308B;

    /* JADX INFO: renamed from: C */
    public final View f5309C;

    /* JADX INFO: renamed from: D */
    public boolean f5310D;

    /* JADX INFO: renamed from: E */
    public xb0 f5311E;

    /* JADX INFO: renamed from: F */
    public xb0 f5312F;

    /* JADX INFO: renamed from: G */
    public C0138d4 f5313G;

    /* JADX INFO: renamed from: H */
    public boolean f5314H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f5315I;

    /* JADX INFO: renamed from: J */
    public int f5316J;

    /* JADX INFO: renamed from: K */
    public boolean f5317K;

    /* JADX INFO: renamed from: L */
    public boolean f5318L;

    /* JADX INFO: renamed from: M */
    public boolean f5319M;

    /* JADX INFO: renamed from: N */
    public boolean f5320N;

    /* JADX INFO: renamed from: O */
    public xa0 f5321O;

    /* JADX INFO: renamed from: P */
    public boolean f5322P;

    /* JADX INFO: renamed from: Q */
    public boolean f5323Q;

    /* JADX INFO: renamed from: R */
    public final wb0 f5324R;

    /* JADX INFO: renamed from: S */
    public final wb0 f5325S;

    /* JADX INFO: renamed from: T */
    public final C0431l0 f5326T;

    /* JADX INFO: renamed from: w */
    public Context f5327w;

    /* JADX INFO: renamed from: x */
    public Context f5328x;

    /* JADX INFO: renamed from: y */
    public ActionBarOverlayLayout f5329y;

    /* JADX INFO: renamed from: z */
    public ActionBarContainer f5330z;

    public yb0(Activity activity, boolean z) {
        new ArrayList();
        this.f5315I = new ArrayList();
        this.f5316J = 0;
        this.f5317K = true;
        this.f5320N = true;
        this.f5324R = new wb0(this, 0);
        this.f5325S = new wb0(this, 1);
        this.f5326T = new C0431l0(29, this);
        View decorView = activity.getWindow().getDecorView();
        m2683M(decorView);
        if (z) {
            return;
        }
        this.f5309C = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: K */
    public final void m2681K(boolean z) {
        wa0 wa0VarM147i;
        wa0 wa0VarM147i2;
        if (z) {
            if (!this.f5319M) {
                this.f5319M = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5329y;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2686P(false);
            }
        } else if (this.f5319M) {
            this.f5319M = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5329y;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2686P(false);
        }
        ActionBarContainer actionBarContainer = this.f5330z;
        WeakHashMap weakHashMap = ja0.f2600a;
        if (!v90.m2496c(actionBarContainer)) {
            if (z) {
                ((k70) this.f5307A).f2717a.setVisibility(4);
                this.f5308B.setVisibility(0);
                return;
            } else {
                ((k70) this.f5307A).f2717a.setVisibility(0);
                this.f5308B.setVisibility(8);
                return;
            }
        }
        if (z) {
            k70 k70Var = (k70) this.f5307A;
            wa0VarM147i = ja0.m1564a(k70Var.f2717a);
            wa0VarM147i.m2553a(0.0f);
            wa0VarM147i.m2555c(100L);
            wa0VarM147i.m2556d(new j70(k70Var, 4));
            wa0VarM147i2 = this.f5308B.m147i(0, 200L);
        } else {
            k70 k70Var2 = (k70) this.f5307A;
            wa0 wa0VarM1564a = ja0.m1564a(k70Var2.f2717a);
            wa0VarM1564a.m2553a(1.0f);
            wa0VarM1564a.m2555c(200L);
            wa0VarM1564a.m2556d(new j70(k70Var2, 0));
            wa0VarM147i = this.f5308B.m147i(8, 100L);
            wa0VarM147i2 = wa0VarM1564a;
        }
        xa0 xa0Var = new xa0();
        ArrayList arrayList = xa0Var.f5145a;
        arrayList.add(wa0VarM147i);
        View view = (View) wa0VarM147i.f4948a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) wa0VarM147i2.f4948a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(wa0VarM147i2);
        xa0Var.m2618b();
    }

    /* JADX INFO: renamed from: L */
    public final Context m2682L() {
        if (this.f5328x == null) {
            TypedValue typedValue = new TypedValue();
            this.f5327w.getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f5328x = new ContextThemeWrapper(this.f5327w, i);
            } else {
                this.f5328x = this.f5327w;
            }
        }
        return this.f5328x;
    }

    /* JADX INFO: renamed from: M */
    public final void m2683M(View view) {
        InterfaceC0296hf wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.ljx.wechatmod.R.id.decor_content_parent);
        this.f5329y = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.ljx.wechatmod.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0296hf) {
            wrapper = (InterfaceC0296hf) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f5307A = wrapper;
        this.f5308B = (ActionBarContextView) view.findViewById(com.ljx.wechatmod.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.ljx.wechatmod.R.id.action_bar_container);
        this.f5330z = actionBarContainer;
        InterfaceC0296hf interfaceC0296hf = this.f5307A;
        if (interfaceC0296hf == null || this.f5308B == null || actionBarContainer == null) {
            throw new IllegalStateException(yb0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((k70) interfaceC0296hf).f2717a.getContext();
        this.f5327w = context;
        if ((((k70) this.f5307A).f2718b & 4) != 0) {
            this.f5310D = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f5307A.getClass();
        m2685O(context.getResources().getBoolean(com.ljx.wechatmod.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f5327w.obtainStyledAttributes(null, AbstractC0910xy.f5217a, com.ljx.wechatmod.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5329y;
            if (!actionBarOverlayLayout2.f262h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f5323Q = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f5330z;
            WeakHashMap weakHashMap = ja0.f2600a;
            y90.m2673s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: N */
    public final void m2684N(boolean z) {
        if (this.f5310D) {
            return;
        }
        int i = z ? 4 : 0;
        k70 k70Var = (k70) this.f5307A;
        int i2 = k70Var.f2718b;
        this.f5310D = true;
        k70Var.m1640a((i & 4) | (i2 & (-5)));
    }

    /* JADX INFO: renamed from: O */
    public final void m2685O(boolean z) {
        if (z) {
            this.f5330z.setTabContainer(null);
            ((k70) this.f5307A).getClass();
        } else {
            ((k70) this.f5307A).getClass();
            this.f5330z.setTabContainer(null);
        }
        this.f5307A.getClass();
        ((k70) this.f5307A).f2717a.setCollapsible(false);
        this.f5329y.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: P */
    public final void m2686P(boolean z) {
        boolean z2 = this.f5318L;
        boolean z3 = this.f5319M;
        C0431l0 c0431l0 = this.f5326T;
        View view = this.f5309C;
        if (!z3 && z2) {
            if (this.f5320N) {
                this.f5320N = false;
                xa0 xa0Var = this.f5321O;
                if (xa0Var != null) {
                    xa0Var.m2617a();
                }
                int i = this.f5316J;
                wb0 wb0Var = this.f5324R;
                if (i != 0 || (!this.f5322P && !z)) {
                    wb0Var.mo0a();
                    return;
                }
                this.f5330z.setAlpha(1.0f);
                this.f5330z.setTransitioning(true);
                xa0 xa0Var2 = new xa0();
                float f = -this.f5330z.getHeight();
                if (z) {
                    this.f5330z.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                wa0 wa0VarM1564a = ja0.m1564a(this.f5330z);
                wa0VarM1564a.m2557e(f);
                View view2 = (View) wa0VarM1564a.f4948a.get();
                if (view2 != null) {
                    va0.m2501a(view2.animate(), c0431l0 != null ? new C0448lh(c0431l0, view2) : null);
                }
                boolean z4 = xa0Var2.f5149e;
                ArrayList arrayList = xa0Var2.f5145a;
                if (!z4) {
                    arrayList.add(wa0VarM1564a);
                }
                if (this.f5317K && view != null) {
                    wa0 wa0VarM1564a2 = ja0.m1564a(view);
                    wa0VarM1564a2.m2557e(f);
                    if (!xa0Var2.f5149e) {
                        arrayList.add(wa0VarM1564a2);
                    }
                }
                boolean z5 = xa0Var2.f5149e;
                if (!z5) {
                    xa0Var2.f5147c = f5305U;
                }
                if (!z5) {
                    xa0Var2.f5146b = 250L;
                }
                if (!z5) {
                    xa0Var2.f5148d = wb0Var;
                }
                this.f5321O = xa0Var2;
                xa0Var2.m2618b();
                return;
            }
            return;
        }
        if (this.f5320N) {
            return;
        }
        this.f5320N = true;
        xa0 xa0Var3 = this.f5321O;
        if (xa0Var3 != null) {
            xa0Var3.m2617a();
        }
        this.f5330z.setVisibility(0);
        int i2 = this.f5316J;
        wb0 wb0Var2 = this.f5325S;
        if (i2 == 0 && (this.f5322P || z)) {
            this.f5330z.setTranslationY(0.0f);
            float f2 = -this.f5330z.getHeight();
            if (z) {
                this.f5330z.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f5330z.setTranslationY(f2);
            xa0 xa0Var4 = new xa0();
            wa0 wa0VarM1564a3 = ja0.m1564a(this.f5330z);
            wa0VarM1564a3.m2557e(0.0f);
            View view3 = (View) wa0VarM1564a3.f4948a.get();
            if (view3 != null) {
                va0.m2501a(view3.animate(), c0431l0 != null ? new C0448lh(c0431l0, view3) : null);
            }
            boolean z6 = xa0Var4.f5149e;
            ArrayList arrayList2 = xa0Var4.f5145a;
            if (!z6) {
                arrayList2.add(wa0VarM1564a3);
            }
            if (this.f5317K && view != null) {
                view.setTranslationY(f2);
                wa0 wa0VarM1564a4 = ja0.m1564a(view);
                wa0VarM1564a4.m2557e(0.0f);
                if (!xa0Var4.f5149e) {
                    arrayList2.add(wa0VarM1564a4);
                }
            }
            boolean z7 = xa0Var4.f5149e;
            if (!z7) {
                xa0Var4.f5147c = f5306V;
            }
            if (!z7) {
                xa0Var4.f5146b = 250L;
            }
            if (!z7) {
                xa0Var4.f5148d = wb0Var2;
            }
            this.f5321O = xa0Var4;
            xa0Var4.m2618b();
        } else {
            this.f5330z.setAlpha(1.0f);
            this.f5330z.setTranslationY(0.0f);
            if (this.f5317K && view != null) {
                view.setTranslationY(0.0f);
            }
            wb0Var2.mo0a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5329y;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = ja0.f2600a;
            w90.m2552c(actionBarOverlayLayout);
        }
    }

    public yb0(Dialog dialog) {
        new ArrayList();
        this.f5315I = new ArrayList();
        this.f5316J = 0;
        this.f5317K = true;
        this.f5320N = true;
        this.f5324R = new wb0(this, 0);
        this.f5325S = new wb0(this, 1);
        this.f5326T = new C0431l0(29, this);
        m2683M(dialog.getWindow().getDecorView());
    }
}
