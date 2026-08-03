package p000a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C1038a;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC0200L;
import p000a.C0866ug;
import p000a.LayoutInflaterFactory2C0291Q0;

/* JADX INFO: renamed from: a.lh */
/* JADX INFO: loaded from: classes.dex */
public final class C0696lh extends AbstractC0200L implements ActionBarOverlayLayout.InterfaceC1010d {

    /* JADX INFO: renamed from: y */
    public static final AccelerateInterpolator f2601y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z */
    public static final DecelerateInterpolator f2602z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Context f2603a;

    /* JADX INFO: renamed from: b */
    public Context f2604b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f2605c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f2606d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0241N4 f2607e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f2608f;

    /* JADX INFO: renamed from: g */
    public final View f2609g;

    /* JADX INFO: renamed from: h */
    public boolean f2610h;

    /* JADX INFO: renamed from: i */
    public d f2611i;

    /* JADX INFO: renamed from: j */
    public d f2612j;

    /* JADX INFO: renamed from: k */
    public LayoutInflaterFactory2C0291Q0.d f2613k;

    /* JADX INFO: renamed from: l */
    public boolean f2614l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<AbstractC0200L.b> f2615m;

    /* JADX INFO: renamed from: n */
    public int f2616n;

    /* JADX INFO: renamed from: o */
    public boolean f2617o;

    /* JADX INFO: renamed from: p */
    public boolean f2618p;

    /* JADX INFO: renamed from: q */
    public boolean f2619q;

    /* JADX INFO: renamed from: r */
    public boolean f2620r;

    /* JADX INFO: renamed from: s */
    public C0199Kg f2621s;

    /* JADX INFO: renamed from: t */
    public boolean f2622t;

    /* JADX INFO: renamed from: u */
    public boolean f2623u;

    /* JADX INFO: renamed from: v */
    public final a f2624v;

    /* JADX INFO: renamed from: w */
    public final b f2625w;

    /* JADX INFO: renamed from: x */
    public final c f2626x;

    /* JADX INFO: renamed from: a.lh$a */
    public class a extends C0726n9 {
        public a() {
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: a */
        public final void mo553a() {
            View view;
            C0696lh c0696lh = C0696lh.this;
            if (c0696lh.f2617o && (view = c0696lh.f2609g) != null) {
                view.setTranslationY(0.0f);
                c0696lh.f2606d.setTranslationY(0.0f);
            }
            c0696lh.f2606d.setVisibility(8);
            c0696lh.f2606d.setTransitioning(false);
            c0696lh.f2621s = null;
            LayoutInflaterFactory2C0291Q0.d dVar = c0696lh.f2613k;
            if (dVar != null) {
                dVar.mo330b(c0696lh.f2612j);
                c0696lh.f2612j = null;
                c0696lh.f2613k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c0696lh.f2605c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0866ug.c.m2008c(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: a.lh$b */
    public class b extends C0726n9 {
        public b() {
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: a */
        public final void mo553a() {
            C0696lh c0696lh = C0696lh.this;
            c0696lh.f2621s = null;
            c0696lh.f2606d.requestLayout();
        }
    }

    /* JADX INFO: renamed from: a.lh$c */
    public class c {
        public c() {
        }
    }

    /* JADX INFO: renamed from: a.lh$d */
    public class d extends AbstractC0272P implements C0998f.a {

        /* JADX INFO: renamed from: c */
        public final Context f2630c;

        /* JADX INFO: renamed from: d */
        public final C0998f f2631d;

        /* JADX INFO: renamed from: e */
        public LayoutInflaterFactory2C0291Q0.d f2632e;

        /* JADX INFO: renamed from: f */
        public WeakReference<View> f2633f;

        public d(Context context, LayoutInflaterFactory2C0291Q0.d dVar) {
            this.f2630c = context;
            this.f2632e = dVar;
            C0998f c0998f = new C0998f(context);
            c0998f.f3795l = 1;
            this.f2631d = c0998f;
            c0998f.f3788e = this;
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo816a(C0998f c0998f, MenuItem menuItem) {
            LayoutInflaterFactory2C0291Q0.d dVar = this.f2632e;
            if (dVar != null) {
                return dVar.f1044a.mo332d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: b */
        public final void mo817b(C0998f c0998f) {
            if (this.f2632e == null) {
                return;
            }
            mo767i();
            C1038a c1038a = C0696lh.this.f2608f.f3049d;
            if (c1038a != null) {
                c1038a.m2400l();
            }
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: c */
        public final void mo761c() {
            C0696lh c0696lh = C0696lh.this;
            if (c0696lh.f2611i != this) {
                return;
            }
            if (c0696lh.f2618p) {
                c0696lh.f2612j = this;
                c0696lh.f2613k = this.f2632e;
            } else {
                this.f2632e.mo330b(this);
            }
            this.f2632e = null;
            c0696lh.m1584p(false);
            ActionBarContextView actionBarContextView = c0696lh.f2608f;
            if (actionBarContextView.f3889k == null) {
                actionBarContextView.m2350h();
            }
            c0696lh.f2605c.setHideOnContentScrollEnabled(c0696lh.f2623u);
            c0696lh.f2611i = null;
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: d */
        public final View mo762d() {
            WeakReference<View> weakReference = this.f2633f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: e */
        public final C0998f mo763e() {
            return this.f2631d;
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: f */
        public final MenuInflater mo764f() {
            return new C0161Ie(this.f2630c);
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: g */
        public final CharSequence mo765g() {
            return C0696lh.this.f2608f.getSubtitle();
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: h */
        public final CharSequence mo766h() {
            return C0696lh.this.f2608f.getTitle();
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: i */
        public final void mo767i() {
            if (C0696lh.this.f2611i != this) {
                return;
            }
            C0998f c0998f = this.f2631d;
            c0998f.m2338w();
            try {
                this.f2632e.mo331c(this, c0998f);
            } finally {
                c0998f.m2337v();
            }
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: j */
        public final boolean mo768j() {
            return C0696lh.this.f2608f.f3897s;
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: k */
        public final void mo769k(View view) {
            C0696lh.this.f2608f.setCustomView(view);
            this.f2633f = new WeakReference<>(view);
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: l */
        public final void mo770l(int i) {
            mo771m(C0696lh.this.f2603a.getResources().getString(i));
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: m */
        public final void mo771m(CharSequence charSequence) {
            C0696lh.this.f2608f.setSubtitle(charSequence);
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: n */
        public final void mo772n(int i) {
            mo773o(C0696lh.this.f2603a.getResources().getString(i));
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: o */
        public final void mo773o(CharSequence charSequence) {
            C0696lh.this.f2608f.setTitle(charSequence);
        }

        @Override // p000a.AbstractC0272P
        /* JADX INFO: renamed from: p */
        public final void mo774p(boolean z) {
            this.f960b = z;
            C0696lh.this.f2608f.setTitleOptional(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0696lh(Activity activity, boolean z) {
        new ArrayList();
        this.f2615m = new ArrayList<>();
        this.f2616n = 0;
        this.f2617o = true;
        this.f2620r = true;
        this.f2624v = new a();
        this.f2625w = new b();
        this.f2626x = new c();
        View decorView = activity.getWindow().getDecorView();
        m1585q(decorView);
        if (z) {
            return;
        }
        this.f2609g = decorView.findViewById(R.id.content);
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: b */
    public final boolean mo556b() {
        InterfaceC0241N4 interfaceC0241N4 = this.f2607e;
        if (interfaceC0241N4 == null || !interfaceC0241N4.mo678p()) {
            return false;
        }
        this.f2607e.collapseActionView();
        return true;
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: c */
    public final void mo557c(boolean z) {
        if (z == this.f2614l) {
            return;
        }
        this.f2614l = z;
        ArrayList<AbstractC0200L.b> arrayList = this.f2615m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m570a();
        }
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: d */
    public final int mo558d() {
        return this.f2607e.mo674l();
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: e */
    public final Context mo559e() {
        if (this.f2604b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2603a.getTheme().resolveAttribute(C0983R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2604b = new ContextThemeWrapper(this.f2603a, i);
            } else {
                this.f2604b = this.f2603a;
            }
        }
        return this.f2604b;
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: g */
    public final void mo561g() {
        m1586r(this.f2603a.getResources().getBoolean(C0983R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: i */
    public final boolean mo563i(int i, KeyEvent keyEvent) {
        C0998f c0998f;
        d dVar = this.f2611i;
        if (dVar == null || (c0998f = dVar.f2631d) == null) {
            return false;
        }
        c0998f.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return c0998f.performShortcut(i, keyEvent, 0);
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: l */
    public final void mo566l(boolean z) {
        if (this.f2610h) {
            return;
        }
        int i = z ? 4 : 0;
        int iMo674l = this.f2607e.mo674l();
        this.f2610h = true;
        this.f2607e.mo681s((i & 4) | (iMo674l & (-5)));
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: m */
    public final void mo567m(boolean z) {
        C0199Kg c0199Kg;
        this.f2622t = z;
        if (z || (c0199Kg = this.f2621s) == null) {
            return;
        }
        c0199Kg.m551a();
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: n */
    public final void mo568n(CharSequence charSequence) {
        this.f2607e.setWindowTitle(charSequence);
    }

    @Override // p000a.AbstractC0200L
    /* JADX INFO: renamed from: o */
    public final AbstractC0272P mo569o(LayoutInflaterFactory2C0291Q0.d dVar) {
        d dVar2 = this.f2611i;
        if (dVar2 != null) {
            dVar2.mo761c();
        }
        this.f2605c.setHideOnContentScrollEnabled(false);
        this.f2608f.m2350h();
        d dVar3 = new d(this.f2608f.getContext(), dVar);
        C0998f c0998f = dVar3.f2631d;
        c0998f.m2338w();
        try {
            if (!dVar3.f2632e.f1044a.mo329a(dVar3, c0998f)) {
                return null;
            }
            this.f2611i = dVar3;
            dVar3.mo767i();
            this.f2608f.m2348f(dVar3);
            m1584p(true);
            return dVar3;
        } finally {
            c0998f.m2337v();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1584p(boolean z) {
        C0181Jg c0181JgMo673k;
        C0181Jg c0181JgM1818e;
        if (z) {
            if (!this.f2619q) {
                this.f2619q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2605c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m1587s(false);
            }
        } else if (this.f2619q) {
            this.f2619q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2605c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m1587s(false);
        }
        if (!this.f2606d.isLaidOut()) {
            if (z) {
                this.f2607e.mo675m(4);
                this.f2608f.setVisibility(0);
                return;
            } else {
                this.f2607e.mo675m(0);
                this.f2608f.setVisibility(8);
                return;
            }
        }
        if (z) {
            c0181JgM1818e = this.f2607e.mo673k(100L, 4);
            c0181JgMo673k = this.f2608f.m1818e(200L, 0);
        } else {
            c0181JgMo673k = this.f2607e.mo673k(200L, 0);
            c0181JgM1818e = this.f2608f.m1818e(100L, 8);
        }
        C0199Kg c0199Kg = new C0199Kg();
        ArrayList<C0181Jg> arrayList = c0199Kg.f665a;
        arrayList.add(c0181JgM1818e);
        View view = c0181JgM1818e.f628a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = c0181JgMo673k.f628a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0181JgMo673k);
        c0199Kg.m552b();
    }

    /* JADX INFO: renamed from: q */
    public final void m1585q(View view) {
        InterfaceC0241N4 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0983R.id.decor_content_parent);
        this.f2605c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(C0983R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0241N4) {
            wrapper = (InterfaceC0241N4) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f2607e = wrapper;
        this.f2608f = (ActionBarContextView) view.findViewById(C0983R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0983R.id.action_bar_container);
        this.f2606d = actionBarContainer;
        InterfaceC0241N4 interfaceC0241N4 = this.f2607e;
        if (interfaceC0241N4 == null || this.f2608f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0696lh.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f2603a = interfaceC0241N4.mo665c();
        if ((this.f2607e.mo674l() & 4) != 0) {
            this.f2610h = true;
        }
        Context context = this.f2603a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2607e.getClass();
        m1586r(context.getResources().getBoolean(C0983R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f2603a.obtainStyledAttributes(null, C0983R.styleable.ActionBar, C0983R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2605c;
            if (!actionBarOverlayLayout2.f3911g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2623u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0983R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2606d;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.d.m2027s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: r */
    public final void m1586r(boolean z) {
        if (z) {
            this.f2606d.setTabContainer(null);
            this.f2607e.mo672j();
        } else {
            this.f2607e.mo672j();
            this.f2606d.setTabContainer(null);
        }
        this.f2607e.getClass();
        this.f2607e.mo680r(false);
        this.f2605c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m1587s(boolean z) {
        boolean z2 = this.f2619q || !this.f2618p;
        View view = this.f2609g;
        c cVar = this.f2626x;
        if (!z2) {
            if (this.f2620r) {
                this.f2620r = false;
                C0199Kg c0199Kg = this.f2621s;
                if (c0199Kg != null) {
                    c0199Kg.m551a();
                }
                int i = this.f2616n;
                a aVar = this.f2624v;
                if (i != 0 || (!this.f2622t && !z)) {
                    aVar.mo553a();
                    return;
                }
                this.f2606d.setAlpha(1.0f);
                this.f2606d.setTransitioning(true);
                C0199Kg c0199Kg2 = new C0199Kg();
                float f = -this.f2606d.getHeight();
                if (z) {
                    this.f2606d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0181Jg c0181JgM1994a = C0866ug.m1994a(this.f2606d);
                c0181JgM1994a.m492e(f);
                View view2 = c0181JgM1994a.f628a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new C0025B5(cVar, view2) : null);
                }
                boolean z3 = c0199Kg2.f669e;
                ArrayList<C0181Jg> arrayList = c0199Kg2.f665a;
                if (!z3) {
                    arrayList.add(c0181JgM1994a);
                }
                if (this.f2617o && view != null) {
                    C0181Jg c0181JgM1994a2 = C0866ug.m1994a(view);
                    c0181JgM1994a2.m492e(f);
                    if (!c0199Kg2.f669e) {
                        arrayList.add(c0181JgM1994a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2601y;
                boolean z4 = c0199Kg2.f669e;
                if (!z4) {
                    c0199Kg2.f667c = accelerateInterpolator;
                }
                if (!z4) {
                    c0199Kg2.f666b = 250L;
                }
                if (!z4) {
                    c0199Kg2.f668d = aVar;
                }
                this.f2621s = c0199Kg2;
                c0199Kg2.m552b();
                return;
            }
            return;
        }
        if (this.f2620r) {
            return;
        }
        this.f2620r = true;
        C0199Kg c0199Kg3 = this.f2621s;
        if (c0199Kg3 != null) {
            c0199Kg3.m551a();
        }
        this.f2606d.setVisibility(0);
        int i2 = this.f2616n;
        b bVar = this.f2625w;
        if (i2 == 0 && (this.f2622t || z)) {
            this.f2606d.setTranslationY(0.0f);
            float f2 = -this.f2606d.getHeight();
            if (z) {
                this.f2606d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f2606d.setTranslationY(f2);
            C0199Kg c0199Kg4 = new C0199Kg();
            C0181Jg c0181JgM1994a3 = C0866ug.m1994a(this.f2606d);
            c0181JgM1994a3.m492e(0.0f);
            View view3 = c0181JgM1994a3.f628a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new C0025B5(cVar, view3) : null);
            }
            boolean z5 = c0199Kg4.f669e;
            ArrayList<C0181Jg> arrayList2 = c0199Kg4.f665a;
            if (!z5) {
                arrayList2.add(c0181JgM1994a3);
            }
            if (this.f2617o && view != null) {
                view.setTranslationY(f2);
                C0181Jg c0181JgM1994a4 = C0866ug.m1994a(view);
                c0181JgM1994a4.m492e(0.0f);
                if (!c0199Kg4.f669e) {
                    arrayList2.add(c0181JgM1994a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2602z;
            boolean z6 = c0199Kg4.f669e;
            if (!z6) {
                c0199Kg4.f667c = decelerateInterpolator;
            }
            if (!z6) {
                c0199Kg4.f666b = 250L;
            }
            if (!z6) {
                c0199Kg4.f668d = bVar;
            }
            this.f2621s = c0199Kg4;
            c0199Kg4.m552b();
        } else {
            this.f2606d.setAlpha(1.0f);
            this.f2606d.setTranslationY(0.0f);
            if (this.f2617o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.mo553a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2605c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.c.m2008c(actionBarOverlayLayout);
        }
    }

    public C0696lh(Dialog dialog) {
        new ArrayList();
        this.f2615m = new ArrayList<>();
        this.f2616n = 0;
        this.f2617o = true;
        this.f2620r = true;
        this.f2624v = new a();
        this.f2625w = new b();
        this.f2626x = new c();
        m1585q(dialog.getWindow().getDecorView());
    }
}
