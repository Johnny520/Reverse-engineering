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
import androidx.appcompat.widget.C0993;
import androidx.appcompat.widget.C1004;
import androidx.appcompat.widget.C1006;
import androidx.appcompat.widget.InterfaceC1033;
import androidx.appcompat.widget.InterfaceC1067;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3099;
import androidx.core.view.C3115;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p204.AbstractC8602;
import p206.C8629;
import p206.MenuC8631;
import p208.AbstractC8639;
import p208.C8647;
import p208.InterfaceC8640;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0958 extends AbstractC0935 implements InterfaceC1033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public ActionBarContextView f676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC1067 f677;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ActionBarContainer f678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ActionBarOverlayLayout f679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Context f680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Context f681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f682;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C8647 f683;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0959 f684;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0960 f685;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f686;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0959 f687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f688;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f689;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f690;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f692;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f693;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f694;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final View f695;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C0923 f696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0957 f698;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C0957 f699;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final AccelerateInterpolator f675 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final DecelerateInterpolator f674 = new DecelerateInterpolator();

    public C0958(Activity activity, boolean z) {
        new ArrayList();
        this.f689 = new ArrayList();
        int i = 0;
        this.f688 = 0;
        this.f692 = true;
        this.f691 = true;
        this.f687 = new C0959(this, i);
        this.f684 = new C0959(this, 1);
        this.f685 = new C0960(this, i);
        View decorView = activity.getWindow().getDecorView();
        m981(decorView);
        if (z) {
            return;
        }
        this.f695 = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    public void addOnMenuVisibilityListener(InterfaceC0936 interfaceC0936) {
        this.f689.add(interfaceC0936);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    public void removeOnMenuVisibilityListener(InterfaceC0936 interfaceC0936) {
        this.f689.remove(interfaceC0936);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Context mo729() {
        if (this.f680 == null) {
            TypedValue typedValue = new TypedValue();
            this.f681.getTheme().resolveAttribute(C0328R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f680 = new ContextThemeWrapper(this.f681, i);
            } else {
                this.f680 = this.f681;
            }
        }
        return this.f680;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo730() {
        return ((C0993) this.f677).f956;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo731(boolean z) {
        if (z == this.f697) {
            return;
        }
        this.f697 = z;
        ArrayList arrayList = this.f689;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C3775.m6954();
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo732() {
        C1006 c1006;
        InterfaceC1067 interfaceC1067 = this.f677;
        if (interfaceC1067 == null || (c1006 = ((C0993) interfaceC1067).f957.f867) == null || c1006.f988 == null) {
            return false;
        }
        C1006 c10062 = ((C0993) interfaceC1067).f957.f867;
        C8629 c8629 = c10062 == null ? null : c10062.f988;
        if (c8629 == null) {
            return true;
        }
        c8629.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m980(boolean z) {
        boolean z2 = this.f690 || !this.f693;
        boolean z3 = this.f691;
        C0960 c0960 = this.f685;
        View view = this.f695;
        if (!z2) {
            if (z3) {
                this.f691 = false;
                C8647 c8647 = this.f683;
                if (c8647 != null) {
                    c8647.m13740();
                }
                int i = this.f688;
                C0959 c0959 = this.f687;
                if (i != 0 || (!this.f682 && !z)) {
                    c0959.mo884();
                    return;
                }
                this.f678.setAlpha(1.0f);
                this.f678.setTransitioning(true);
                C8647 c86472 = new C8647();
                float f = -this.f678.getHeight();
                if (z) {
                    this.f678.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C3115 c3115M4797 = AbstractC3103.m4797(this.f678);
                c3115M4797.m4828(f);
                View view2 = (View) c3115M4797.f6975.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0960 != null ? new C3099(c0960, view2) : null);
                }
                boolean z4 = c86472.f21678;
                ArrayList arrayList = c86472.f21682;
                if (!z4) {
                    arrayList.add(c3115M4797);
                }
                if (this.f692 && view != null) {
                    C3115 c3115M47972 = AbstractC3103.m4797(view);
                    c3115M47972.m4828(f);
                    if (!c86472.f21678) {
                        arrayList.add(c3115M47972);
                    }
                }
                boolean z5 = c86472.f21678;
                if (!z5) {
                    c86472.f21680 = f675;
                }
                if (!z5) {
                    c86472.f21681 = 250L;
                }
                if (!z5) {
                    c86472.f21679 = c0959;
                }
                this.f683 = c86472;
                c86472.m13739();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f691 = true;
        C8647 c86473 = this.f683;
        if (c86473 != null) {
            c86473.m13740();
        }
        this.f678.setVisibility(0);
        int i2 = this.f688;
        C0959 c09592 = this.f684;
        if (i2 == 0 && (this.f682 || z)) {
            this.f678.setTranslationY(0.0f);
            float f2 = -this.f678.getHeight();
            if (z) {
                this.f678.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f678.setTranslationY(f2);
            C8647 c86474 = new C8647();
            C3115 c3115M47973 = AbstractC3103.m4797(this.f678);
            c3115M47973.m4828(0.0f);
            View view3 = (View) c3115M47973.f6975.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0960 != null ? new C3099(c0960, view3) : null);
            }
            boolean z6 = c86474.f21678;
            ArrayList arrayList2 = c86474.f21682;
            if (!z6) {
                arrayList2.add(c3115M47973);
            }
            if (this.f692 && view != null) {
                view.setTranslationY(f2);
                C3115 c3115M47974 = AbstractC3103.m4797(view);
                c3115M47974.m4828(0.0f);
                if (!c86474.f21678) {
                    arrayList2.add(c3115M47974);
                }
            }
            boolean z7 = c86474.f21678;
            if (!z7) {
                c86474.f21680 = f674;
            }
            if (!z7) {
                c86474.f21681 = 250L;
            }
            if (!z7) {
                c86474.f21679 = c09592;
            }
            this.f683 = c86474;
            c86474.m13739();
        } else {
            this.f678.setAlpha(1.0f);
            this.f678.setTranslationY(0.0f);
            if (this.f692 && view != null) {
                view.setTranslationY(0.0f);
            }
            c09592.mo884();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f679;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo734(CharSequence charSequence) {
        C0993 c0993 = (C0993) this.f677;
        if (c0993.f962) {
            return;
        }
        Toolbar toolbar = c0993.f957;
        c0993.f961 = charSequence;
        if ((c0993.f956 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0993.f962) {
                AbstractC3103.m4801(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo735(boolean z) {
        C8647 c8647;
        this.f682 = z;
        if (z || (c8647 = this.f683) == null) {
            return;
        }
        c8647.m13740();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m981(View view) {
        InterfaceC1067 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0328R.id.decor_content_parent);
        this.f679 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(C0328R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC1067) {
            wrapper = (InterfaceC1067) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f677 = wrapper;
        this.f676 = (ActionBarContextView) view.findViewById(C0328R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0328R.id.action_bar_container);
        this.f678 = actionBarContainer;
        InterfaceC1067 interfaceC1067 = this.f677;
        if (interfaceC1067 == null || this.f676 == null || actionBarContainer == null) {
            C6755.m11870(C0958.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((C0993) interfaceC1067).f957.getContext();
        this.f681 = context;
        if ((((C0993) this.f677).f956 & 4) != 0) {
            this.f694 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f677.getClass();
        m982(context.getResources().getBoolean(C0328R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f681.obtainStyledAttributes(null, AbstractC8602.f21434, C0328R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f679;
            if (!actionBarOverlayLayout2.f790) {
                C6755.m11870("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f686 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f678;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m982(boolean z) {
        if (z) {
            this.f678.setTabContainer(null);
            ((C0993) this.f677).getClass();
        } else {
            ((C0993) this.f677).getClass();
            this.f678.setTabContainer(null);
        }
        this.f677.getClass();
        ((C0993) this.f677).f957.setCollapsible(false);
        this.f679.setHasNonEmbeddedTabs(false);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC8639 mo882(C0923 c0923) {
        C0957 c0957 = this.f698;
        if (c0957 != null) {
            c0957.mo971();
        }
        this.f679.setHideOnContentScrollEnabled(false);
        this.f676.m1025();
        C0957 c09572 = new C0957(this, this.f676.getContext(), c0923);
        MenuC8631 menuC8631 = c09572.f670;
        menuC8631.m13718();
        try {
            if (!((InterfaceC8640) c09572.f669.f572).mo832(c09572, menuC8631)) {
                return null;
            }
            this.f698 = c09572;
            c09572.mo976();
            this.f676.m1027(c09572);
            m983(true);
            return c09572;
        } finally {
            menuC8631.m13720();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m983(boolean z) {
        C3115 c3115M1029;
        C3115 c3115M10292;
        boolean z2 = this.f690;
        if (z) {
            if (!z2) {
                this.f690 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f679;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m980(false);
            }
        } else if (z2) {
            this.f690 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f679;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m980(false);
        }
        boolean zIsLaidOut = this.f678.isLaidOut();
        InterfaceC1067 interfaceC1067 = this.f677;
        if (!zIsLaidOut) {
            if (z) {
                ((C0993) interfaceC1067).f957.setVisibility(4);
                this.f676.setVisibility(0);
                return;
            } else {
                ((C0993) interfaceC1067).f957.setVisibility(0);
                this.f676.setVisibility(8);
                return;
            }
        }
        if (z) {
            C0993 c0993 = (C0993) interfaceC1067;
            c3115M1029 = AbstractC3103.m4797(c0993.f957);
            c3115M1029.m4832(0.0f);
            c3115M1029.m4830(100L);
            c3115M1029.m4829(new C1004(c0993, 4));
            c3115M10292 = this.f676.m1029(0, 200L);
        } else {
            C0993 c09932 = (C0993) interfaceC1067;
            C3115 c3115M4797 = AbstractC3103.m4797(c09932.f957);
            c3115M4797.m4832(1.0f);
            c3115M4797.m4830(200L);
            c3115M4797.m4829(new C1004(c09932, 0));
            c3115M1029 = this.f676.m1029(8, 100L);
            c3115M10292 = c3115M4797;
        }
        C8647 c8647 = new C8647();
        ArrayList arrayList = c8647.f21682;
        arrayList.add(c3115M1029);
        View view = (View) c3115M1029.f6975.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c3115M10292.f6975.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c3115M10292);
        c8647.m13739();
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo738() {
        m982(this.f681.getResources().getBoolean(C0328R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo740(boolean z) {
        if (this.f694) {
            return;
        }
        int i = z ? 4 : 0;
        C0993 c0993 = (C0993) this.f677;
        int i2 = c0993.f956;
        this.f694 = true;
        c0993.m1160((i & 4) | (i2 & (-5)));
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo741(int i, KeyEvent keyEvent) {
        MenuC8631 menuC8631;
        C0957 c0957 = this.f698;
        if (c0957 == null || (menuC8631 = c0957.f670) == null) {
            return false;
        }
        menuC8631.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC8631.performShortcut(i, keyEvent, 0);
    }

    public C0958(Dialog dialog) {
        new ArrayList();
        this.f689 = new ArrayList();
        this.f688 = 0;
        this.f692 = true;
        this.f691 = true;
        this.f687 = new C0959(this, 0);
        this.f684 = new C0959(this, 1);
        this.f685 = new C0960(this, 0);
        m981(dialog.getWindow().getDecorView());
    }
}
