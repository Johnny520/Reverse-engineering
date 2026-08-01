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
import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p188.AbstractC7772;
import p190.C7799;
import p190.MenuC7801;
import p192.AbstractC7809;
import p192.C7817;
import p192.InterfaceC7810;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
    public C7817 f338;

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
        m420(decorView);
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
    public final Context mo168() {
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
    public final int mo169() {
        return ((C0146) this.f332).f611;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo170(boolean z) {
        if (z == this.f352) {
            return;
        }
        this.f352 = z;
        ArrayList arrayList = this.f344;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C2941.m6336();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo171() {
        C0159 c0159;
        InterfaceC0220 interfaceC0220 = this.f332;
        if (interfaceC0220 == null || (c0159 = ((C0146) interfaceC0220).f612.f522) == null || c0159.f643 == null) {
            return false;
        }
        C0159 c01592 = ((C0146) interfaceC0220).f612.f522;
        C7799 c7799 = c01592 == null ? null : c01592.f643;
        if (c7799 == null) {
            return true;
        }
        c7799.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m419(boolean z) {
        boolean z2 = this.f345 || !this.f348;
        boolean z3 = this.f346;
        C0113 c0113 = this.f340;
        View view = this.f350;
        if (!z2) {
            if (z3) {
                this.f346 = false;
                C7817 c7817 = this.f338;
                if (c7817 != null) {
                    c7817.m13153();
                }
                int i = this.f343;
                C0112 c0112 = this.f342;
                if (i != 0 || (!this.f337 && !z)) {
                    c0112.mo323();
                    return;
                }
                this.f333.setAlpha(1.0f);
                this.f333.setTransitioning(true);
                C7817 c78172 = new C7817();
                float f = -this.f333.getHeight();
                if (z) {
                    this.f333.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C2282 c2282M4227 = AbstractC2270.m4227(this.f333);
                c2282M4227.m4258(f);
                View view2 = (View) c2282M4227.f6629.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0113 != null ? new C2266(c0113, view2) : null);
                }
                boolean z4 = c78172.f21336;
                ArrayList arrayList = c78172.f21340;
                if (!z4) {
                    arrayList.add(c2282M4227);
                }
                if (this.f347 && view != null) {
                    C2282 c2282M42272 = AbstractC2270.m4227(view);
                    c2282M42272.m4258(f);
                    if (!c78172.f21336) {
                        arrayList.add(c2282M42272);
                    }
                }
                boolean z5 = c78172.f21336;
                if (!z5) {
                    c78172.f21338 = f330;
                }
                if (!z5) {
                    c78172.f21339 = 250L;
                }
                if (!z5) {
                    c78172.f21337 = c0112;
                }
                this.f338 = c78172;
                c78172.m13152();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f346 = true;
        C7817 c78173 = this.f338;
        if (c78173 != null) {
            c78173.m13153();
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
            C7817 c78174 = new C7817();
            C2282 c2282M42273 = AbstractC2270.m4227(this.f333);
            c2282M42273.m4258(0.0f);
            View view3 = (View) c2282M42273.f6629.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0113 != null ? new C2266(c0113, view3) : null);
            }
            boolean z6 = c78174.f21336;
            ArrayList arrayList2 = c78174.f21340;
            if (!z6) {
                arrayList2.add(c2282M42273);
            }
            if (this.f347 && view != null) {
                view.setTranslationY(f2);
                C2282 c2282M42274 = AbstractC2270.m4227(view);
                c2282M42274.m4258(0.0f);
                if (!c78174.f21336) {
                    arrayList2.add(c2282M42274);
                }
            }
            boolean z7 = c78174.f21336;
            if (!z7) {
                c78174.f21338 = f329;
            }
            if (!z7) {
                c78174.f21339 = 250L;
            }
            if (!z7) {
                c78174.f21337 = c01122;
            }
            this.f338 = c78174;
            c78174.m13152();
        } else {
            this.f333.setAlpha(1.0f);
            this.f333.setTranslationY(0.0f);
            if (this.f347 && view != null) {
                view.setTranslationY(0.0f);
            }
            c01122.mo323();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f334;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo173(CharSequence charSequence) {
        C0146 c0146 = (C0146) this.f332;
        if (c0146.f617) {
            return;
        }
        Toolbar toolbar = c0146.f612;
        c0146.f616 = charSequence;
        if ((c0146.f611 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0146.f617) {
                AbstractC2270.m4231(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo174(boolean z) {
        C7817 c7817;
        this.f337 = z;
        if (z || (c7817 = this.f338) == null) {
            return;
        }
        c7817.m13153();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m420(View view) {
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
            C5919.m11250(C0111.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((C0146) interfaceC0220).f612.getContext();
        this.f336 = context;
        if ((((C0146) this.f332).f611 & 4) != 0) {
            this.f349 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f332.getClass();
        m421(context.getResources().getBoolean(com.davemorrissey.labs.subscaleview.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f336.obtainStyledAttributes(null, AbstractC7772.f21092, com.davemorrissey.labs.subscaleview.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f334;
            if (!actionBarOverlayLayout2.f445) {
                C5919.m11250("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f341 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f333;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m421(boolean z) {
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
    public final AbstractC7809 mo321(C0076 c0076) {
        C0110 c0110 = this.f353;
        if (c0110 != null) {
            c0110.mo410();
        }
        this.f334.setHideOnContentScrollEnabled(false);
        this.f331.m464();
        C0110 c01102 = new C0110(this, this.f331.getContext(), c0076);
        MenuC7801 menuC7801 = c01102.f325;
        menuC7801.m13131();
        try {
            if (!((InterfaceC7810) c01102.f324.f227).mo271(c01102, menuC7801)) {
                return null;
            }
            this.f353 = c01102;
            c01102.mo415();
            this.f331.m466(c01102);
            m422(true);
            return c01102;
        } finally {
            menuC7801.m13133();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m422(boolean z) {
        C2282 c2282M468;
        C2282 c2282M4682;
        boolean z2 = this.f345;
        if (z) {
            if (!z2) {
                this.f345 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f334;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m419(false);
            }
        } else if (z2) {
            this.f345 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f334;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m419(false);
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
            c2282M468 = AbstractC2270.m4227(c0146.f612);
            c2282M468.m4262(0.0f);
            c2282M468.m4260(100L);
            c2282M468.m4259(new C0157(c0146, 4));
            c2282M4682 = this.f331.m468(0, 200L);
        } else {
            C0146 c01462 = (C0146) interfaceC0220;
            C2282 c2282M4227 = AbstractC2270.m4227(c01462.f612);
            c2282M4227.m4262(1.0f);
            c2282M4227.m4260(200L);
            c2282M4227.m4259(new C0157(c01462, 0));
            c2282M468 = this.f331.m468(8, 100L);
            c2282M4682 = c2282M4227;
        }
        C7817 c7817 = new C7817();
        ArrayList arrayList = c7817.f21340;
        arrayList.add(c2282M468);
        View view = (View) c2282M468.f6629.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c2282M4682.f6629.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c2282M4682);
        c7817.m13152();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo177() {
        m421(this.f336.getResources().getBoolean(com.davemorrissey.labs.subscaleview.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo179(boolean z) {
        if (this.f349) {
            return;
        }
        int i = z ? 4 : 0;
        C0146 c0146 = (C0146) this.f332;
        int i2 = c0146.f611;
        this.f349 = true;
        c0146.m599((i & 4) | (i2 & (-5)));
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo180(int i, KeyEvent keyEvent) {
        MenuC7801 menuC7801;
        C0110 c0110 = this.f353;
        if (c0110 == null || (menuC7801 = c0110.f325) == null) {
            return false;
        }
        menuC7801.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC7801.performShortcut(i, keyEvent, 0);
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
        m420(dialog.getWindow().getDecorView());
    }
}
