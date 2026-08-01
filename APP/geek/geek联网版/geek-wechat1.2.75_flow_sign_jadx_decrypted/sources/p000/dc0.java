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
public final class dc0 extends g80 implements InterfaceC0002a1 {

    /* JADX INFO: renamed from: T */
    public static final AccelerateInterpolator f1359T = new AccelerateInterpolator();

    /* JADX INFO: renamed from: U */
    public static final DecelerateInterpolator f1360U = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public ActionBarContextView f1361A;

    /* JADX INFO: renamed from: B */
    public final View f1362B;

    /* JADX INFO: renamed from: C */
    public boolean f1363C;

    /* JADX INFO: renamed from: D */
    public cc0 f1364D;

    /* JADX INFO: renamed from: E */
    public cc0 f1365E;

    /* JADX INFO: renamed from: F */
    public C0138d4 f1366F;

    /* JADX INFO: renamed from: G */
    public boolean f1367G;

    /* JADX INFO: renamed from: H */
    public final ArrayList f1368H;

    /* JADX INFO: renamed from: I */
    public int f1369I;

    /* JADX INFO: renamed from: J */
    public boolean f1370J;

    /* JADX INFO: renamed from: K */
    public boolean f1371K;

    /* JADX INFO: renamed from: L */
    public boolean f1372L;

    /* JADX INFO: renamed from: M */
    public boolean f1373M;

    /* JADX INFO: renamed from: N */
    public cb0 f1374N;

    /* JADX INFO: renamed from: O */
    public boolean f1375O;

    /* JADX INFO: renamed from: P */
    public boolean f1376P;

    /* JADX INFO: renamed from: Q */
    public final bc0 f1377Q;

    /* JADX INFO: renamed from: R */
    public final bc0 f1378R;

    /* JADX INFO: renamed from: S */
    public final C0431l0 f1379S;

    /* JADX INFO: renamed from: v */
    public Context f1380v;

    /* JADX INFO: renamed from: w */
    public Context f1381w;

    /* JADX INFO: renamed from: x */
    public ActionBarOverlayLayout f1382x;

    /* JADX INFO: renamed from: y */
    public ActionBarContainer f1383y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0372jf f1384z;

    public dc0(Activity activity, boolean z) {
        new ArrayList();
        this.f1368H = new ArrayList();
        this.f1369I = 0;
        this.f1370J = true;
        this.f1373M = true;
        this.f1377Q = new bc0(this, 0);
        this.f1378R = new bc0(this, 1);
        this.f1379S = new C0431l0(29, this);
        View decorView = activity.getWindow().getDecorView();
        m911S(decorView);
        if (z) {
            return;
        }
        this.f1362B = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: Q */
    public final void m909Q(boolean z) {
        bb0 bb0VarM132i;
        bb0 bb0VarM132i2;
        if (z) {
            if (!this.f1372L) {
                this.f1372L = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1382x;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m914V(false);
            }
        } else if (this.f1372L) {
            this.f1372L = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1382x;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m914V(false);
        }
        ActionBarContainer actionBarContainer = this.f1383y;
        WeakHashMap weakHashMap = oa0.f3426a;
        if (!aa0.m40c(actionBarContainer)) {
            if (z) {
                ((q70) this.f1384z).f3849a.setVisibility(4);
                this.f1361A.setVisibility(0);
                return;
            } else {
                ((q70) this.f1384z).f3849a.setVisibility(0);
                this.f1361A.setVisibility(8);
                return;
            }
        }
        if (z) {
            q70 q70Var = (q70) this.f1384z;
            bb0VarM132i = oa0.m2001a(q70Var.f3849a);
            bb0VarM132i.m507a(0.0f);
            bb0VarM132i.m509c(100L);
            bb0VarM132i.m510d(new p70(q70Var, 4));
            bb0VarM132i2 = this.f1361A.m132i(0, 200L);
        } else {
            q70 q70Var2 = (q70) this.f1384z;
            bb0 bb0VarM2001a = oa0.m2001a(q70Var2.f3849a);
            bb0VarM2001a.m507a(1.0f);
            bb0VarM2001a.m509c(200L);
            bb0VarM2001a.m510d(new p70(q70Var2, 0));
            bb0VarM132i = this.f1361A.m132i(8, 100L);
            bb0VarM132i2 = bb0VarM2001a;
        }
        cb0 cb0Var = new cb0();
        ArrayList arrayList = cb0Var.f870a;
        arrayList.add(bb0VarM132i);
        View view = (View) bb0VarM132i.f708a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) bb0VarM132i2.f708a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(bb0VarM132i2);
        cb0Var.m611b();
    }

    /* JADX INFO: renamed from: R */
    public final Context m910R() {
        if (this.f1381w == null) {
            TypedValue typedValue = new TypedValue();
            this.f1380v.getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1381w = new ContextThemeWrapper(this.f1380v, i);
            } else {
                this.f1381w = this.f1380v;
            }
        }
        return this.f1381w;
    }

    /* JADX INFO: renamed from: S */
    public final void m911S(View view) {
        InterfaceC0372jf wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.ljx.wechatmod.R.id.decor_content_parent);
        this.f1382x = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.ljx.wechatmod.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0372jf) {
            wrapper = (InterfaceC0372jf) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1384z = wrapper;
        this.f1361A = (ActionBarContextView) view.findViewById(com.ljx.wechatmod.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.ljx.wechatmod.R.id.action_bar_container);
        this.f1383y = actionBarContainer;
        InterfaceC0372jf interfaceC0372jf = this.f1384z;
        if (interfaceC0372jf == null || this.f1361A == null || actionBarContainer == null) {
            throw new IllegalStateException(dc0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((q70) interfaceC0372jf).f3849a.getContext();
        this.f1380v = context;
        if ((((q70) this.f1384z).f3850b & 4) != 0) {
            this.f1363C = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f1384z.getClass();
        m913U(context.getResources().getBoolean(com.ljx.wechatmod.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1380v.obtainStyledAttributes(null, AbstractC0205ez.f1677a, com.ljx.wechatmod.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1382x;
            if (!actionBarOverlayLayout2.f225h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1376P = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1383y;
            WeakHashMap weakHashMap = oa0.f3426a;
            da0.m901s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: T */
    public final void m912T(boolean z) {
        if (this.f1363C) {
            return;
        }
        int i = z ? 4 : 0;
        q70 q70Var = (q70) this.f1384z;
        int i2 = q70Var.f3850b;
        this.f1363C = true;
        q70Var.m2129a((i & 4) | (i2 & (-5)));
    }

    /* JADX INFO: renamed from: U */
    public final void m913U(boolean z) {
        if (z) {
            this.f1383y.setTabContainer(null);
            ((q70) this.f1384z).getClass();
        } else {
            ((q70) this.f1384z).getClass();
            this.f1383y.setTabContainer(null);
        }
        this.f1384z.getClass();
        ((q70) this.f1384z).f3849a.setCollapsible(false);
        this.f1382x.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m914V(boolean z) {
        boolean z2 = this.f1371K;
        boolean z3 = this.f1372L;
        C0431l0 c0431l0 = this.f1379S;
        View view = this.f1362B;
        if (!z3 && z2) {
            if (this.f1373M) {
                this.f1373M = false;
                cb0 cb0Var = this.f1374N;
                if (cb0Var != null) {
                    cb0Var.m610a();
                }
                int i = this.f1369I;
                bc0 bc0Var = this.f1377Q;
                if (i != 0 || (!this.f1375O && !z)) {
                    bc0Var.mo0a();
                    return;
                }
                this.f1383y.setAlpha(1.0f);
                this.f1383y.setTransitioning(true);
                cb0 cb0Var2 = new cb0();
                float f = -this.f1383y.getHeight();
                if (z) {
                    this.f1383y.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                bb0 bb0VarM2001a = oa0.m2001a(this.f1383y);
                bb0VarM2001a.m511e(f);
                View view2 = (View) bb0VarM2001a.f708a.get();
                if (view2 != null) {
                    ab0.m45a(view2.animate(), c0431l0 != null ? new C0522nh(c0431l0, view2) : null);
                }
                boolean z4 = cb0Var2.f874e;
                ArrayList arrayList = cb0Var2.f870a;
                if (!z4) {
                    arrayList.add(bb0VarM2001a);
                }
                if (this.f1370J && view != null) {
                    bb0 bb0VarM2001a2 = oa0.m2001a(view);
                    bb0VarM2001a2.m511e(f);
                    if (!cb0Var2.f874e) {
                        arrayList.add(bb0VarM2001a2);
                    }
                }
                boolean z5 = cb0Var2.f874e;
                if (!z5) {
                    cb0Var2.f872c = f1359T;
                }
                if (!z5) {
                    cb0Var2.f871b = 250L;
                }
                if (!z5) {
                    cb0Var2.f873d = bc0Var;
                }
                this.f1374N = cb0Var2;
                cb0Var2.m611b();
                return;
            }
            return;
        }
        if (this.f1373M) {
            return;
        }
        this.f1373M = true;
        cb0 cb0Var3 = this.f1374N;
        if (cb0Var3 != null) {
            cb0Var3.m610a();
        }
        this.f1383y.setVisibility(0);
        int i2 = this.f1369I;
        bc0 bc0Var2 = this.f1378R;
        if (i2 == 0 && (this.f1375O || z)) {
            this.f1383y.setTranslationY(0.0f);
            float f2 = -this.f1383y.getHeight();
            if (z) {
                this.f1383y.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f1383y.setTranslationY(f2);
            cb0 cb0Var4 = new cb0();
            bb0 bb0VarM2001a3 = oa0.m2001a(this.f1383y);
            bb0VarM2001a3.m511e(0.0f);
            View view3 = (View) bb0VarM2001a3.f708a.get();
            if (view3 != null) {
                ab0.m45a(view3.animate(), c0431l0 != null ? new C0522nh(c0431l0, view3) : null);
            }
            boolean z6 = cb0Var4.f874e;
            ArrayList arrayList2 = cb0Var4.f870a;
            if (!z6) {
                arrayList2.add(bb0VarM2001a3);
            }
            if (this.f1370J && view != null) {
                view.setTranslationY(f2);
                bb0 bb0VarM2001a4 = oa0.m2001a(view);
                bb0VarM2001a4.m511e(0.0f);
                if (!cb0Var4.f874e) {
                    arrayList2.add(bb0VarM2001a4);
                }
            }
            boolean z7 = cb0Var4.f874e;
            if (!z7) {
                cb0Var4.f872c = f1360U;
            }
            if (!z7) {
                cb0Var4.f871b = 250L;
            }
            if (!z7) {
                cb0Var4.f873d = bc0Var2;
            }
            this.f1374N = cb0Var4;
            cb0Var4.m611b();
        } else {
            this.f1383y.setAlpha(1.0f);
            this.f1383y.setTranslationY(0.0f);
            if (this.f1370J && view != null) {
                view.setTranslationY(0.0f);
            }
            bc0Var2.mo0a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1382x;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = oa0.f3426a;
            ba0.m506c(actionBarOverlayLayout);
        }
    }

    public dc0(Dialog dialog) {
        new ArrayList();
        this.f1368H = new ArrayList();
        this.f1369I = 0;
        this.f1370J = true;
        this.f1373M = true;
        this.f1377Q = new bc0(this, 0);
        this.f1378R = new bc0(this, 1);
        this.f1379S = new C0431l0(29, this);
        m911S(dialog.getWindow().getDecorView());
    }
}
