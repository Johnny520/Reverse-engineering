package yyds;

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

/* JADX INFO: renamed from: yyds.ᛳᛲᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0528 implements InterfaceC1379 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f2530;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f2531;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final ArrayList f2532;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C2319 f2533;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC0127 f2534;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final C2014 f2535;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Context f2536;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean f2537;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f2538;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f2539;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Context f2540;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final C0424 f2541;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f2542;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final View f2543;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final C0424 f2544;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f2545;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C2133 f2546;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f2547;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C2319 f2548;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public C2205 f2549;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public ActionBarOverlayLayout f2550;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f2551;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ActionBarContextView f2552;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ActionBarContainer f2553;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final AccelerateInterpolator f2529 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static final DecelerateInterpolator f2528 = new DecelerateInterpolator();

    public C0528(Activity activity, boolean z) {
        new ArrayList();
        this.f2532 = new ArrayList();
        this.f2530 = 0;
        this.f2538 = true;
        this.f2539 = true;
        this.f2544 = new C0424(this, 0);
        this.f2541 = new C0424(this, 1);
        this.f2535 = new C2014(24, this);
        View decorView = activity.getWindow().getDecorView();
        m1368(decorView);
        if (z) {
            return;
        }
        this.f2543 = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m1365(boolean z) {
        boolean z2 = this.f2542 || !this.f2551;
        boolean z3 = this.f2539;
        C2014 c2014 = this.f2535;
        View view = this.f2543;
        if (!z2) {
            if (z3) {
                this.f2539 = false;
                C2205 c2205 = this.f2549;
                if (c2205 != null) {
                    c2205.m4190();
                }
                int i = this.f2530;
                C0424 c0424 = this.f2544;
                if (i != 0 || (!this.f2537 && !z)) {
                    c0424.mo1183();
                    return;
                }
                this.f2553.setAlpha(1.0f);
                this.f2553.setTransitioning(true);
                C2205 c22052 = new C2205();
                float f = -this.f2553.getHeight();
                if (z) {
                    this.f2553.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0140 c0140M3343 = AbstractC1640.m3343(this.f2553);
                c0140M3343.m625(f);
                View view2 = (View) c0140M3343.f849.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c2014 != null ? new C2405(c2014, view2) : null);
                }
                boolean z4 = c22052.f10898;
                ArrayList arrayList = c22052.f10899;
                if (!z4) {
                    arrayList.add(c0140M3343);
                }
                if (this.f2538 && view != null) {
                    C0140 c0140M33432 = AbstractC1640.m3343(view);
                    c0140M33432.m625(f);
                    if (!c22052.f10898) {
                        arrayList.add(c0140M33432);
                    }
                }
                boolean z5 = c22052.f10898;
                if (!z5) {
                    c22052.f10901 = f2529;
                }
                if (!z5) {
                    c22052.f10900 = 250L;
                }
                if (!z5) {
                    c22052.f10903 = c0424;
                }
                this.f2549 = c22052;
                c22052.m4191();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f2539 = true;
        C2205 c22053 = this.f2549;
        if (c22053 != null) {
            c22053.m4190();
        }
        this.f2553.setVisibility(0);
        int i2 = this.f2530;
        C0424 c04242 = this.f2541;
        if (i2 == 0 && (this.f2537 || z)) {
            this.f2553.setTranslationY(0.0f);
            float f2 = -this.f2553.getHeight();
            if (z) {
                this.f2553.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f2553.setTranslationY(f2);
            C2205 c22054 = new C2205();
            C0140 c0140M33433 = AbstractC1640.m3343(this.f2553);
            c0140M33433.m625(0.0f);
            View view3 = (View) c0140M33433.f849.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c2014 != null ? new C2405(c2014, view3) : null);
            }
            boolean z6 = c22054.f10898;
            ArrayList arrayList2 = c22054.f10899;
            if (!z6) {
                arrayList2.add(c0140M33433);
            }
            if (this.f2538 && view != null) {
                view.setTranslationY(f2);
                C0140 c0140M33434 = AbstractC1640.m3343(view);
                c0140M33434.m625(0.0f);
                if (!c22054.f10898) {
                    arrayList2.add(c0140M33434);
                }
            }
            boolean z7 = c22054.f10898;
            if (!z7) {
                c22054.f10901 = f2528;
            }
            if (!z7) {
                c22054.f10900 = 250L;
            }
            if (!z7) {
                c22054.f10903 = c04242;
            }
            this.f2549 = c22054;
            c22054.m4191();
        } else {
            this.f2553.setAlpha(1.0f);
            this.f2553.setTranslationY(0.0f);
            if (this.f2538 && view != null) {
                view.setTranslationY(0.0f);
            }
            c04242.mo1183();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2550;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1366(boolean z) {
        C0140 c0140M37;
        C0140 c0140M372;
        boolean z2 = this.f2542;
        if (z) {
            if (!z2) {
                this.f2542 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2550;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m1365(false);
            }
        } else if (z2) {
            this.f2542 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2550;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m1365(false);
        }
        ActionBarContainer actionBarContainer = this.f2553;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        boolean zIsLaidOut = actionBarContainer.isLaidOut();
        InterfaceC0127 interfaceC0127 = this.f2534;
        if (!zIsLaidOut) {
            if (z) {
                ((C2780) interfaceC0127).f13571.setVisibility(4);
                this.f2552.setVisibility(0);
                return;
            } else {
                ((C2780) interfaceC0127).f13571.setVisibility(0);
                this.f2552.setVisibility(8);
                return;
            }
        }
        if (z) {
            C2780 c2780 = (C2780) interfaceC0127;
            c0140M37 = AbstractC1640.m3343(c2780.f13571);
            c0140M37.m626(0.0f);
            c0140M37.m628(100L);
            c0140M37.m629(new C1609(c2780, 4));
            c0140M372 = this.f2552.m37(0, 200L);
        } else {
            C2780 c27802 = (C2780) interfaceC0127;
            C0140 c0140M3343 = AbstractC1640.m3343(c27802.f13571);
            c0140M3343.m626(1.0f);
            c0140M3343.m628(200L);
            c0140M3343.m629(new C1609(c27802, 0));
            c0140M37 = this.f2552.m37(8, 100L);
            c0140M372 = c0140M3343;
        }
        C2205 c2205 = new C2205();
        ArrayList arrayList = c2205.f10899;
        arrayList.add(c0140M37);
        View view = (View) c0140M37.f849.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0140M372.f849.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0140M372);
        c2205.m4191();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Context m1367() {
        Context context = this.f2540;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.f2536.getTheme().resolveAttribute(com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f2536, i);
            this.f2540 = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.f2536;
        this.f2540 = context2;
        return context2;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1368(View view) {
        InterfaceC0127 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.decor_content_parent);
        this.f2550 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0127) {
            wrapper = (InterfaceC0127) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f2534 = wrapper;
        this.f2552 = (ActionBarContextView) view.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.p000ss.android.ugc.aweme.yyds.R.id.action_bar_container);
        this.f2553 = actionBarContainer;
        InterfaceC0127 interfaceC0127 = this.f2534;
        if (interfaceC0127 == null || this.f2552 == null || actionBarContainer == null) {
            C0188.m800(C0528.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((C2780) interfaceC0127).f13571.getContext();
        this.f2536 = context;
        if ((((C2780) this.f2534).f13573 & 4) != 0) {
            this.f2531 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2534.getClass();
        if (context.getResources().getBoolean(com.p000ss.android.ugc.aweme.yyds.R.bool.abc_action_bar_embed_tabs)) {
            this.f2553.setTabContainer(null);
            ((C2780) this.f2534).getClass();
        } else {
            ((C2780) this.f2534).getClass();
            this.f2553.setTabContainer(null);
        }
        this.f2534.getClass();
        ((C2780) this.f2534).f13571.setCollapsible(false);
        this.f2550.setHasNonEmbeddedTabs(false);
        TypedArray typedArrayObtainStyledAttributes = this.f2536.obtainStyledAttributes(null, AbstractC1592.f8094, com.p000ss.android.ugc.aweme.yyds.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2550;
            if (!actionBarOverlayLayout2.f126) {
                C0188.m800("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f2545 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2553;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1369(boolean z) {
        if (this.f2531) {
            return;
        }
        int i = z ? 4 : 0;
        C2780 c2780 = (C2780) this.f2534;
        int i2 = c2780.f13573;
        this.f2531 = true;
        c2780.m4901((i & 4) | (i2 & (-5)));
    }

    public C0528(Dialog dialog) {
        new ArrayList();
        this.f2532 = new ArrayList();
        this.f2530 = 0;
        this.f2538 = true;
        this.f2539 = true;
        this.f2544 = new C0424(this, 0);
        this.f2541 = new C0424(this, 1);
        this.f2535 = new C2014(24, this);
        m1368(dialog.getWindow().getDecorView());
    }
}
