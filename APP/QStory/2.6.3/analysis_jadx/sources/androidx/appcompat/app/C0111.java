package androidx.appcompat.app;

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
import androidx.appcompat.widget.C0146;
import androidx.appcompat.widget.C0157;
import androidx.appcompat.widget.C0159;
import androidx.appcompat.widget.InterfaceC0186;
import androidx.appcompat.widget.InterfaceC0220;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2266;
import androidx.core.view.C2282;
import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p188.AbstractC7773;
import p190.C7800;
import p190.MenuC7802;
import p192.AbstractC7810;
import p192.C7818;
import p192.InterfaceC7811;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0111 extends AbstractC0088 implements InterfaceC0186 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public ActionBarContextView f331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC0220 f332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ActionBarContainer f333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ActionBarOverlayLayout f334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Context f335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Context f336;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f337;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7818 f338;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0112 f339;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0113 f340;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f341;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0112 f342;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f343;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f344;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f345;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f346;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f347;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f348;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f349;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View f350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C0076 f351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f352;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0110 f353;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C0110 f354;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final AccelerateInterpolator f330 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final DecelerateInterpolator f329 = new DecelerateInterpolator();

    public C0111(Activity activity, boolean z) {
        new ArrayList();
        this.f344 = new ArrayList();
        int i = 0;
        this.f343 = 0;
        this.f347 = true;
        this.f346 = true;
        this.f342 = new C0112(this, i);
        this.f339 = new C0112(this, 1);
        this.f340 = new C0113(this, i);
        View decorView = activity.getWindow().getDecorView();
        m421(decorView);
        if (z) {
            return;
        }
        this.f350 = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    public void addOnMenuVisibilityListener(InterfaceC0089 interfaceC0089) {
        this.f344.add(interfaceC0089);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    public void removeOnMenuVisibilityListener(InterfaceC0089 interfaceC0089) {
        this.f344.remove(interfaceC0089);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Context mo169() {
        if (this.f335 == null) {
            TypedValue typedValue = new TypedValue();
            this.f336.getTheme().resolveAttribute(com.davemorrissey.labs.subscaleview.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f335 = new ContextThemeWrapper(this.f336, i);
            } else {
                this.f335 = this.f336;
            }
        }
        return this.f335;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo170() {
        return ((C0146) this.f332).f611;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo171(boolean z) {
        if (z == this.f352) {
            return;
        }
        this.f352 = z;
        ArrayList arrayList = this.f344;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C2942.m6394();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo172() {
        C0159 c0159;
        InterfaceC0220 interfaceC0220 = this.f332;
        if (interfaceC0220 == null || (c0159 = ((C0146) interfaceC0220).f612.f522) == null || c0159.f643 == null) {
            return false;
        }
        C0159 c01592 = ((C0146) interfaceC0220).f612.f522;
        C7800 c7800 = c01592 == null ? null : c01592.f643;
        if (c7800 == null) {
            return true;
        }
        c7800.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m420(boolean z) {
        boolean z2 = this.f345 || !this.f348;
        boolean z3 = this.f346;
        C0113 c0113 = this.f340;
        View view = this.f350;
        if (!z2) {
            if (z3) {
                this.f346 = false;
                C7818 c7818 = this.f338;
                if (c7818 != null) {
                    c7818.m13181();
                }
                int i = this.f343;
                C0112 c0112 = this.f342;
                if (i != 0 || (!this.f337 && !z)) {
                    c0112.mo324();
                    return;
                }
                this.f333.setAlpha(1.0f);
                this.f333.setTransitioning(true);
                C7818 c78182 = new C7818();
                float f = -this.f333.getHeight();
                if (z) {
                    this.f333.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C2282 c2282M4237 = AbstractC2270.m4237(this.f333);
                c2282M4237.m4268(f);
                View view2 = (View) c2282M4237.f6630.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0113 != null ? new C2266(c0113, view2) : null);
                }
                boolean z4 = c78182.f21333;
                ArrayList arrayList = c78182.f21337;
                if (!z4) {
                    arrayList.add(c2282M4237);
                }
                if (this.f347 && view != null) {
                    C2282 c2282M42372 = AbstractC2270.m4237(view);
                    c2282M42372.m4268(f);
                    if (!c78182.f21333) {
                        arrayList.add(c2282M42372);
                    }
                }
                boolean z5 = c78182.f21333;
                if (!z5) {
                    c78182.f21335 = f330;
                }
                if (!z5) {
                    c78182.f21336 = 250L;
                }
                if (!z5) {
                    c78182.f21334 = c0112;
                }
                this.f338 = c78182;
                c78182.m13180();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f346 = true;
        C7818 c78183 = this.f338;
        if (c78183 != null) {
            c78183.m13181();
        }
        this.f333.setVisibility(0);
        int i2 = this.f343;
        C0112 c01122 = this.f339;
        if (i2 == 0 && (this.f337 || z)) {
            this.f333.setTranslationY(0.0f);
            float f2 = -this.f333.getHeight();
            if (z) {
                this.f333.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f333.setTranslationY(f2);
            C7818 c78184 = new C7818();
            C2282 c2282M42373 = AbstractC2270.m4237(this.f333);
            c2282M42373.m4268(0.0f);
            View view3 = (View) c2282M42373.f6630.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0113 != null ? new C2266(c0113, view3) : null);
            }
            boolean z6 = c78184.f21333;
            ArrayList arrayList2 = c78184.f21337;
            if (!z6) {
                arrayList2.add(c2282M42373);
            }
            if (this.f347 && view != null) {
                view.setTranslationY(f2);
                C2282 c2282M42374 = AbstractC2270.m4237(view);
                c2282M42374.m4268(0.0f);
                if (!c78184.f21333) {
                    arrayList2.add(c2282M42374);
                }
            }
            boolean z7 = c78184.f21333;
            if (!z7) {
                c78184.f21335 = f329;
            }
            if (!z7) {
                c78184.f21336 = 250L;
            }
            if (!z7) {
                c78184.f21334 = c01122;
            }
            this.f338 = c78184;
            c78184.m13180();
        } else {
            this.f333.setAlpha(1.0f);
            this.f333.setTranslationY(0.0f);
            if (this.f347 && view != null) {
                view.setTranslationY(0.0f);
            }
            c01122.mo324();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f334;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo174(CharSequence charSequence) {
        C0146 c0146 = (C0146) this.f332;
        if (c0146.f617) {
            return;
        }
        Toolbar toolbar = c0146.f612;
        c0146.f616 = charSequence;
        if ((c0146.f611 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0146.f617) {
                AbstractC2270.m4241(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo175(boolean z) {
        C7818 c7818;
        this.f337 = z;
        if (z || (c7818 = this.f338) == null) {
            return;
        }
        c7818.m13181();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m421(View view) {
        InterfaceC0220 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.decor_content_parent);
        this.f334 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.davemorrissey.labs.subscaleview.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0220) {
            wrapper = (InterfaceC0220) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f332 = wrapper;
        this.f331 = (ActionBarContextView) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.davemorrissey.labs.subscaleview.R.id.action_bar_container);
        this.f333 = actionBarContainer;
        InterfaceC0220 interfaceC0220 = this.f332;
        if (interfaceC0220 == null || this.f331 == null || actionBarContainer == null) {
            C5925.m11311(C0111.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((C0146) interfaceC0220).f612.getContext();
        this.f336 = context;
        if ((((C0146) this.f332).f611 & 4) != 0) {
            this.f349 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f332.getClass();
        m422(context.getResources().getBoolean(com.davemorrissey.labs.subscaleview.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f336.obtainStyledAttributes(null, AbstractC7773.f21089, com.davemorrissey.labs.subscaleview.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f334;
            if (!actionBarOverlayLayout2.f445) {
                C5925.m11311("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f341 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f333;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m422(boolean z) {
        if (z) {
            this.f333.setTabContainer(null);
            ((C0146) this.f332).getClass();
        } else {
            ((C0146) this.f332).getClass();
            this.f333.setTabContainer(null);
        }
        this.f332.getClass();
        ((C0146) this.f332).f612.setCollapsible(false);
        this.f334.setHasNonEmbeddedTabs(false);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC7810 mo322(C0076 c0076) {
        C0110 c0110 = this.f353;
        if (c0110 != null) {
            c0110.mo411();
        }
        this.f334.setHideOnContentScrollEnabled(false);
        this.f331.m465();
        C0110 c01102 = new C0110(this, this.f331.getContext(), c0076);
        MenuC7802 menuC7802 = c01102.f325;
        menuC7802.m13159();
        try {
            if (!((InterfaceC7811) c01102.f324.f227).mo272(c01102, menuC7802)) {
                return null;
            }
            this.f353 = c01102;
            c01102.mo416();
            this.f331.m467(c01102);
            m423(true);
            return c01102;
        } finally {
            menuC7802.m13161();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m423(boolean z) {
        C2282 c2282M469;
        C2282 c2282M4692;
        boolean z2 = this.f345;
        if (z) {
            if (!z2) {
                this.f345 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f334;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m420(false);
            }
        } else if (z2) {
            this.f345 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f334;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m420(false);
        }
        boolean zIsLaidOut = this.f333.isLaidOut();
        InterfaceC0220 interfaceC0220 = this.f332;
        if (!zIsLaidOut) {
            if (z) {
                ((C0146) interfaceC0220).f612.setVisibility(4);
                this.f331.setVisibility(0);
                return;
            } else {
                ((C0146) interfaceC0220).f612.setVisibility(0);
                this.f331.setVisibility(8);
                return;
            }
        }
        if (z) {
            C0146 c0146 = (C0146) interfaceC0220;
            c2282M469 = AbstractC2270.m4237(c0146.f612);
            c2282M469.m4272(0.0f);
            c2282M469.m4270(100L);
            c2282M469.m4269(new C0157(c0146, 4));
            c2282M4692 = this.f331.m469(0, 200L);
        } else {
            C0146 c01462 = (C0146) interfaceC0220;
            C2282 c2282M4237 = AbstractC2270.m4237(c01462.f612);
            c2282M4237.m4272(1.0f);
            c2282M4237.m4270(200L);
            c2282M4237.m4269(new C0157(c01462, 0));
            c2282M469 = this.f331.m469(8, 100L);
            c2282M4692 = c2282M4237;
        }
        C7818 c7818 = new C7818();
        ArrayList arrayList = c7818.f21337;
        arrayList.add(c2282M469);
        View view = (View) c2282M469.f6630.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c2282M4692.f6630.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c2282M4692);
        c7818.m13180();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo178() {
        m422(this.f336.getResources().getBoolean(com.davemorrissey.labs.subscaleview.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo180(boolean z) {
        if (this.f349) {
            return;
        }
        int i = z ? 4 : 0;
        C0146 c0146 = (C0146) this.f332;
        int i2 = c0146.f611;
        this.f349 = true;
        c0146.m600((i & 4) | (i2 & (-5)));
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo181(int i, KeyEvent keyEvent) {
        MenuC7802 menuC7802;
        C0110 c0110 = this.f353;
        if (c0110 == null || (menuC7802 = c0110.f325) == null) {
            return false;
        }
        menuC7802.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC7802.performShortcut(i, keyEvent, 0);
    }

    public C0111(Dialog dialog) {
        new ArrayList();
        this.f344 = new ArrayList();
        this.f343 = 0;
        this.f347 = true;
        this.f346 = true;
        this.f342 = new C0112(this, 0);
        this.f339 = new C0112(this, 1);
        this.f340 = new C0113(this, 0);
        m421(dialog.getWindow().getDecorView());
    }
}
