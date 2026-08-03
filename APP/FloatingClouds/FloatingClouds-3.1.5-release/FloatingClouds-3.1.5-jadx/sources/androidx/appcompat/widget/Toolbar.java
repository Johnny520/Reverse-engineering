package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.view.menu.SubMenuC1005m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.AbstractC0200L;
import p000a.AbstractC0792r;
import p000a.C0033Bd;
import p000a.C0161Ie;
import p000a.C0181Jg;
import p000a.C0380V0;
import p000a.C0481ab;
import p000a.C0509c1;
import p000a.C0547e1;
import p000a.C0751of;
import p000a.C0794r1;
import p000a.C0865uf;
import p000a.C0866ug;
import p000a.C0889w1;
import p000a.C0922xf;
import p000a.InterfaceC0241N4;
import p000a.InterfaceC0426Xa;
import p000a.InterfaceC0595gb;
import p000a.InterfaceC0701m3;
import p000a.RunnableC0846tf;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0426Xa {

    /* JADX INFO: renamed from: A */
    public ColorStateList f4025A;

    /* JADX INFO: renamed from: B */
    public boolean f4026B;

    /* JADX INFO: renamed from: C */
    public boolean f4027C;

    /* JADX INFO: renamed from: D */
    public final ArrayList<View> f4028D;

    /* JADX INFO: renamed from: E */
    public final ArrayList<View> f4029E;

    /* JADX INFO: renamed from: F */
    public final int[] f4030F;

    /* JADX INFO: renamed from: G */
    public final C0481ab f4031G;

    /* JADX INFO: renamed from: H */
    public ArrayList<MenuItem> f4032H;

    /* JADX INFO: renamed from: I */
    public InterfaceC1035h f4033I;

    /* JADX INFO: renamed from: J */
    public final C1028a f4034J;

    /* JADX INFO: renamed from: K */
    public C1041d f4035K;

    /* JADX INFO: renamed from: L */
    public C1038a f4036L;

    /* JADX INFO: renamed from: M */
    public C1033f f4037M;

    /* JADX INFO: renamed from: N */
    public C0865uf.c f4038N;

    /* JADX INFO: renamed from: O */
    public C0865uf.d f4039O;

    /* JADX INFO: renamed from: P */
    public boolean f4040P;

    /* JADX INFO: renamed from: Q */
    public OnBackInvokedCallback f4041Q;

    /* JADX INFO: renamed from: R */
    public OnBackInvokedDispatcher f4042R;

    /* JADX INFO: renamed from: S */
    public boolean f4043S;

    /* JADX INFO: renamed from: T */
    public final RunnableC1029b f4044T;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f4045a;

    /* JADX INFO: renamed from: b */
    public C0794r1 f4046b;

    /* JADX INFO: renamed from: c */
    public C0794r1 f4047c;

    /* JADX INFO: renamed from: d */
    public C0509c1 f4048d;

    /* JADX INFO: renamed from: e */
    public C0547e1 f4049e;

    /* JADX INFO: renamed from: f */
    public final Drawable f4050f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f4051g;

    /* JADX INFO: renamed from: h */
    public C0509c1 f4052h;

    /* JADX INFO: renamed from: i */
    public View f4053i;

    /* JADX INFO: renamed from: j */
    public Context f4054j;

    /* JADX INFO: renamed from: k */
    public int f4055k;

    /* JADX INFO: renamed from: l */
    public int f4056l;

    /* JADX INFO: renamed from: m */
    public int f4057m;

    /* JADX INFO: renamed from: n */
    public final int f4058n;

    /* JADX INFO: renamed from: o */
    public final int f4059o;

    /* JADX INFO: renamed from: p */
    public int f4060p;

    /* JADX INFO: renamed from: q */
    public int f4061q;

    /* JADX INFO: renamed from: r */
    public int f4062r;

    /* JADX INFO: renamed from: s */
    public int f4063s;

    /* JADX INFO: renamed from: t */
    public C0033Bd f4064t;

    /* JADX INFO: renamed from: u */
    public int f4065u;

    /* JADX INFO: renamed from: v */
    public int f4066v;

    /* JADX INFO: renamed from: w */
    public final int f4067w;

    /* JADX INFO: renamed from: x */
    public CharSequence f4068x;

    /* JADX INFO: renamed from: y */
    public CharSequence f4069y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f4070z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C1028a implements ActionMenuView.InterfaceC1017e {
        public C1028a() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC1029b implements Runnable {
        public RunnableC1029b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.m2390u();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C1030c implements C0998f.a {
        public C1030c() {
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo816a(C0998f c0998f, MenuItem menuItem) {
            C0865uf.d dVar = Toolbar.this.f4039O;
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0998f.a
        /* JADX INFO: renamed from: b */
        public final void mo817b(C0998f c0998f) {
            Toolbar toolbar = Toolbar.this;
            C1038a c1038a = toolbar.f4045a.f3939t;
            if (c1038a == null || !c1038a.m2399k()) {
                Iterator<InterfaceC0595gb> it = toolbar.f4031G.f1803b.iterator();
                while (it.hasNext()) {
                    it.next().mo1388b(c0998f);
                }
            }
            C0865uf.d dVar = toolbar.f4039O;
            if (dVar != null) {
                dVar.mo817b(c0998f);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    public class ViewOnClickListenerC1031d implements View.OnClickListener {
        public ViewOnClickListenerC1031d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1033f c1033f = Toolbar.this.f4037M;
            C1000h c1000h = c1033f == null ? null : c1033f.f4076b;
            if (c1000h != null) {
                c1000h.collapseActionView();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C1032e {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m2392a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m2393b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0380V0(2, runnable);
        }

        /* JADX INFO: renamed from: c */
        public static void m2394c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: d */
        public static void m2395d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    public class C1033f implements InterfaceC1002j {

        /* JADX INFO: renamed from: a */
        public C0998f f4075a;

        /* JADX INFO: renamed from: b */
        public C1000h f4076b;

        public C1033f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: a */
        public final void mo2306a(C0998f c0998f, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: c */
        public final boolean mo1396c(C1000h c1000h) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.f4053i;
            if (callback instanceof InterfaceC0701m3) {
                ((InterfaceC0701m3) callback).mo1310e();
            }
            toolbar.removeView(toolbar.f4053i);
            toolbar.removeView(toolbar.f4052h);
            toolbar.f4053i = null;
            ArrayList<View> arrayList = toolbar.f4029E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                toolbar.addView(arrayList.get(size));
            }
            arrayList.clear();
            this.f4076b = null;
            toolbar.requestLayout();
            c1000h.f3813C = false;
            c1000h.f3827n.m2331p(false);
            toolbar.m2391v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: d */
        public final boolean mo2307d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: e */
        public final void mo1397e(Context context, C0998f c0998f) {
            C1000h c1000h;
            C0998f c0998f2 = this.f4075a;
            if (c0998f2 != null && (c1000h = this.f4076b) != null) {
                c0998f2.mo2319d(c1000h);
            }
            this.f4075a = c0998f;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: g */
        public final void mo2308g() {
            if (this.f4076b != null) {
                C0998f c0998f = this.f4075a;
                if (c0998f != null) {
                    int size = c0998f.f3789f.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f4075a.getItem(i) == this.f4076b) {
                            return;
                        }
                    }
                }
                mo1396c(this.f4076b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: i */
        public final boolean mo1398i(C1000h c1000h) {
            Toolbar toolbar = Toolbar.this;
            toolbar.m2376c();
            ViewParent parent = toolbar.f4052h.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f4052h);
                }
                toolbar.addView(toolbar.f4052h);
            }
            View actionView = c1000h.getActionView();
            toolbar.f4053i = actionView;
            this.f4076b = c1000h;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f4053i);
                }
                C1034g c1034gM2370h = Toolbar.m2370h();
                c1034gM2370h.f674a = (toolbar.f4058n & 112) | 8388611;
                c1034gM2370h.f4078b = 2;
                toolbar.f4053i.setLayoutParams(c1034gM2370h);
                toolbar.addView(toolbar.f4053i);
            }
            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar.getChildAt(childCount);
                if (((C1034g) childAt.getLayoutParams()).f4078b != 2 && childAt != toolbar.f4045a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.f4029E.add(childAt);
                }
            }
            toolbar.requestLayout();
            c1000h.f3813C = true;
            c1000h.f3827n.m2331p(false);
            KeyEvent.Callback callback = toolbar.f4053i;
            if (callback instanceof InterfaceC0701m3) {
                ((InterfaceC0701m3) callback).mo1309d();
            }
            toolbar.m2391v();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j
        /* JADX INFO: renamed from: j */
        public final boolean mo2310j(SubMenuC1005m subMenuC1005m) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C1034g extends AbstractC0200L.a {

        /* JADX INFO: renamed from: b */
        public int f4078b;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface InterfaceC1035h {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$i */
    public static class C1036i extends AbstractC0792r {
        public static final Parcelable.Creator<C1036i> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public int f4079c;

        /* JADX INFO: renamed from: d */
        public boolean f4080d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$i$a */
        public class a implements Parcelable.ClassLoaderCreator<C1036i> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1036i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1036i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1036i[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1036i(parcel, null);
            }
        }

        public C1036i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4079c = parcel.readInt();
            this.f4080d = parcel.readInt() != 0;
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4079c);
            parcel.writeInt(this.f4080d ? 1 : 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0983R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0161Ie(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C1034g m2370h() {
        C1034g c1034g = new C1034g(-2, -2);
        c1034g.f4078b = 0;
        c1034g.f674a = 8388627;
        return c1034g;
    }

    /* JADX INFO: renamed from: i */
    public static C1034g m2371i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1034g) {
            C1034g c1034g = (C1034g) layoutParams;
            C1034g c1034g2 = new C1034g(c1034g);
            c1034g2.f4078b = 0;
            c1034g2.f4078b = c1034g.f4078b;
            return c1034g2;
        }
        if (layoutParams instanceof AbstractC0200L.a) {
            C1034g c1034g3 = new C1034g((AbstractC0200L.a) layoutParams);
            c1034g3.f4078b = 0;
            return c1034g3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1034g c1034g4 = new C1034g(layoutParams);
            c1034g4.f4078b = 0;
            return c1034g4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1034g c1034g5 = new C1034g(marginLayoutParams);
        c1034g5.f4078b = 0;
        ((ViewGroup.MarginLayoutParams) c1034g5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1034g5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1034g5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1034g5).bottomMargin = marginLayoutParams.bottomMargin;
        return c1034g5;
    }

    /* JADX INFO: renamed from: k */
    public static int m2372k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m2373l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m2374a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1034g c1034g = (C1034g) childAt.getLayoutParams();
                if (c1034g.f4078b == 0 && m2389t(childAt)) {
                    int i3 = c1034g.f674a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C1034g c1034g2 = (C1034g) childAt2.getLayoutParams();
            if (c1034g2.f4078b == 0 && m2389t(childAt2)) {
                int i5 = c1034g2.f674a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // p000a.InterfaceC0426Xa
    public final void addMenuProvider(InterfaceC0595gb interfaceC0595gb) {
        C0481ab c0481ab = this.f4031G;
        c0481ab.f1803b.add(interfaceC0595gb);
        c0481ab.f1802a.run();
    }

    /* JADX INFO: renamed from: b */
    public final void m2375b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1034g c1034gM2370h = layoutParams == null ? m2370h() : !checkLayoutParams(layoutParams) ? m2371i(layoutParams) : (C1034g) layoutParams;
        c1034gM2370h.f4078b = 1;
        if (!z || this.f4053i == null) {
            addView(view, c1034gM2370h);
        } else {
            view.setLayoutParams(c1034gM2370h);
            this.f4029E.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2376c() {
        if (this.f4052h == null) {
            C0509c1 c0509c1 = new C0509c1(getContext(), null, C0983R.attr.toolbarNavigationButtonStyle);
            this.f4052h = c0509c1;
            c0509c1.setImageDrawable(this.f4050f);
            this.f4052h.setContentDescription(this.f4051g);
            C1034g c1034gM2370h = m2370h();
            c1034gM2370h.f674a = (this.f4058n & 112) | 8388611;
            c1034gM2370h.f4078b = 2;
            this.f4052h.setLayoutParams(c1034gM2370h);
            this.f4052h.setOnClickListener(new ViewOnClickListenerC1031d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1034g);
    }

    /* JADX INFO: renamed from: d */
    public final void m2377d() {
        if (this.f4064t == null) {
            C0033Bd c0033Bd = new C0033Bd();
            c0033Bd.f120a = 0;
            c0033Bd.f121b = 0;
            c0033Bd.f122c = Integer.MIN_VALUE;
            c0033Bd.f123d = Integer.MIN_VALUE;
            c0033Bd.f124e = 0;
            c0033Bd.f125f = 0;
            c0033Bd.f126g = false;
            c0033Bd.f127h = false;
            this.f4064t = c0033Bd;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2378e() {
        m2379f();
        ActionMenuView actionMenuView = this.f4045a;
        if (actionMenuView.f3935p == null) {
            C0998f c0998f = (C0998f) actionMenuView.getMenu();
            if (this.f4037M == null) {
                this.f4037M = new C1033f();
            }
            this.f4045a.setExpandedActionViewsExclusive(true);
            c0998f.m2317b(this.f4037M, this.f4054j);
            m2391v();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2379f() {
        if (this.f4045a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4045a = actionMenuView;
            actionMenuView.setPopupTheme(this.f4055k);
            this.f4045a.setOnMenuItemClickListener(this.f4034J);
            ActionMenuView actionMenuView2 = this.f4045a;
            C0865uf.c cVar = this.f4038N;
            C1030c c1030c = new C1030c();
            actionMenuView2.f3940u = cVar;
            actionMenuView2.f3941v = c1030c;
            C1034g c1034gM2370h = m2370h();
            c1034gM2370h.f674a = (this.f4058n & 112) | 8388613;
            this.f4045a.setLayoutParams(c1034gM2370h);
            m2375b(this.f4045a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2380g() {
        if (this.f4048d == null) {
            this.f4048d = new C0509c1(getContext(), null, C0983R.attr.toolbarNavigationButtonStyle);
            C1034g c1034gM2370h = m2370h();
            c1034gM2370h.f674a = (this.f4058n & 112) | 8388611;
            this.f4048d.setLayoutParams(c1034gM2370h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2370h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m2371i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0509c1 c0509c1 = this.f4052h;
        if (c0509c1 != null) {
            return c0509c1.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0509c1 c0509c1 = this.f4052h;
        if (c0509c1 != null) {
            return c0509c1.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0033Bd c0033Bd = this.f4064t;
        if (c0033Bd != null) {
            return c0033Bd.f126g ? c0033Bd.f120a : c0033Bd.f121b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f4066v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0033Bd c0033Bd = this.f4064t;
        if (c0033Bd != null) {
            return c0033Bd.f120a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0033Bd c0033Bd = this.f4064t;
        if (c0033Bd != null) {
            return c0033Bd.f121b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0033Bd c0033Bd = this.f4064t;
        if (c0033Bd != null) {
            return c0033Bd.f126g ? c0033Bd.f121b : c0033Bd.f120a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f4065u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0998f c0998f;
        ActionMenuView actionMenuView = this.f4045a;
        return (actionMenuView == null || (c0998f = actionMenuView.f3935p) == null || !c0998f.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4066v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4065u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0547e1 c0547e1 = this.f4049e;
        if (c0547e1 != null) {
            return c0547e1.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0547e1 c0547e1 = this.f4049e;
        if (c0547e1 != null) {
            return c0547e1.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2378e();
        return this.f4045a.getMenu();
    }

    public View getNavButtonView() {
        return this.f4048d;
    }

    public CharSequence getNavigationContentDescription() {
        C0509c1 c0509c1 = this.f4048d;
        if (c0509c1 != null) {
            return c0509c1.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0509c1 c0509c1 = this.f4048d;
        if (c0509c1 != null) {
            return c0509c1.getDrawable();
        }
        return null;
    }

    public C1038a getOuterActionMenuPresenter() {
        return this.f4036L;
    }

    public Drawable getOverflowIcon() {
        m2378e();
        return this.f4045a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4054j;
    }

    public int getPopupTheme() {
        return this.f4055k;
    }

    public CharSequence getSubtitle() {
        return this.f4069y;
    }

    public final TextView getSubtitleTextView() {
        return this.f4047c;
    }

    public CharSequence getTitle() {
        return this.f4068x;
    }

    public int getTitleMarginBottom() {
        return this.f4063s;
    }

    public int getTitleMarginEnd() {
        return this.f4061q;
    }

    public int getTitleMarginStart() {
        return this.f4060p;
    }

    public int getTitleMarginTop() {
        return this.f4062r;
    }

    public final TextView getTitleTextView() {
        return this.f4046b;
    }

    public InterfaceC0241N4 getWrapper() {
        if (this.f4035K == null) {
            this.f4035K = new C1041d(this, true);
        }
        return this.f4035K;
    }

    /* JADX INFO: renamed from: j */
    public final int m2381j(View view, int i) {
        C1034g c1034g = (C1034g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1034g.f674a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f4067w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1034g).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c1034g).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c1034g).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public void mo2382m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX INFO: renamed from: n */
    public final void m2383n() {
        Iterator<MenuItem> it = this.f4032H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC0595gb> it2 = this.f4031G.f1803b.iterator();
        while (it2.hasNext()) {
            it2.next().mo1387a(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4032H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2384o(View view) {
        return view.getParent() == this || this.f4029E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2391v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4044T);
        m2391v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4027C = false;
        }
        if (!this.f4027C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4027C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4027C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8 A[LOOP:2: B:108:0x02c6->B:109:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0318 A[LOOP:3: B:117:0x0316->B:118:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM2385p;
        int iM2386q;
        int iMax;
        boolean zM2389t;
        boolean zM2389t2;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int iM2385p2;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int i14;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.f4030F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!m2389t(this.f4048d)) {
            iM2385p = paddingLeft;
        } else {
            if (z3) {
                iM2386q = m2386q(this.f4048d, i15, iMin, iArr);
                iM2385p = paddingLeft;
                if (m2389t(this.f4052h)) {
                    if (z3) {
                        iM2386q = m2386q(this.f4052h, iM2386q, iMin, iArr);
                    } else {
                        iM2385p = m2385p(this.f4052h, iM2385p, iMin, iArr);
                    }
                }
                if (m2389t(this.f4045a)) {
                    if (z3) {
                        iM2385p = m2385p(this.f4045a, iM2385p, iMin, iArr);
                    } else {
                        iM2386q = m2386q(this.f4045a, iM2386q, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM2385p);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iM2386q));
                iMax = Math.max(iM2385p, currentContentInsetLeft);
                int iMin2 = Math.min(iM2386q, i15 - currentContentInsetRight);
                if (m2389t(this.f4053i)) {
                    if (z3) {
                        iMin2 = m2386q(this.f4053i, iMin2, iMin, iArr);
                    } else {
                        iMax = m2385p(this.f4053i, iMax, iMin, iArr);
                    }
                }
                if (m2389t(this.f4049e)) {
                    if (z3) {
                        iMin2 = m2386q(this.f4049e, iMin2, iMin, iArr);
                    } else {
                        iMax = m2385p(this.f4049e, iMax, iMin, iArr);
                    }
                }
                zM2389t = m2389t(this.f4046b);
                zM2389t2 = m2389t(this.f4047c);
                if (zM2389t) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    C1034g c1034g = (C1034g) this.f4046b.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.f4046b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1034g).topMargin + ((ViewGroup.MarginLayoutParams) c1034g).bottomMargin;
                }
                if (!zM2389t2) {
                    C1034g c1034g2 = (C1034g) this.f4047c.getLayoutParams();
                    measuredHeight = this.f4047c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1034g2).topMargin + ((ViewGroup.MarginLayoutParams) c1034g2).bottomMargin + measuredHeight;
                }
                if (!zM2389t || zM2389t2) {
                    C0794r1 c0794r1 = !zM2389t ? this.f4046b : this.f4047c;
                    C0794r1 c0794r12 = !zM2389t2 ? this.f4047c : this.f4046b;
                    C1034g c1034g3 = (C1034g) c0794r1.getLayoutParams();
                    C1034g c1034g4 = (C1034g) c0794r12.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z4 = (zM2389t && this.f4046b.getMeasuredWidth() > 0) || (zM2389t2 && this.f4047c.getMeasuredWidth() > 0);
                    i5 = this.f4067w & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1034g3).topMargin + this.f4062r;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) c1034g3).topMargin + this.f4062r;
                        if (iMax2 < i18) {
                            iMax2 = i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) c1034g3).bottomMargin;
                            int i21 = this.f4063s;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1034g4).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1034g4).bottomMargin) - this.f4063s) - i16;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.f4060p : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zM2389t) {
                            C1034g c1034g5 = (C1034g) this.f4046b.getLayoutParams();
                            int measuredWidth = iMin2 - this.f4046b.getMeasuredWidth();
                            int measuredHeight2 = this.f4046b.getMeasuredHeight() + paddingTop;
                            this.f4046b.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.f4061q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1034g5).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zM2389t2) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1034g) this.f4047c.getLayoutParams())).topMargin;
                            this.f4047c.layout(iMin2 - this.f4047c.getMeasuredWidth(), i23, iMin2, this.f4047c.getMeasuredHeight() + i23);
                            i9 = iMin2 - this.f4061q;
                        } else {
                            i9 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i24 = (z4 ? this.f4060p : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i17;
                        iArr[0] = Math.max(0, -i24);
                        if (zM2389t) {
                            C1034g c1034g6 = (C1034g) this.f4046b.getLayoutParams();
                            int measuredWidth2 = this.f4046b.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f4046b.getMeasuredHeight() + paddingTop;
                            this.f4046b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.f4061q;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1034g6).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zM2389t2) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1034g) this.f4047c.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f4047c.getMeasuredWidth() + iMax;
                            this.f4047c.layout(iMax, i25, measuredWidth3, this.f4047c.getMeasuredHeight() + i25);
                            i7 = measuredWidth3 + this.f4061q;
                        } else {
                            i7 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                ArrayList<View> arrayList = this.f4028D;
                m2374a(arrayList, 3);
                size = arrayList.size();
                iM2385p2 = iMax;
                for (i10 = 0; i10 < size; i10++) {
                    iM2385p2 = m2385p(arrayList.get(i10), iM2385p2, iMin, iArr);
                }
                m2374a(arrayList, 5);
                size2 = arrayList.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = m2386q(arrayList.get(i11), iMin2, iMin, iArr);
                }
                m2374a(arrayList, 1);
                int i26 = iArr[0];
                int i27 = iArr[1];
                size3 = arrayList.size();
                int i28 = i27;
                int i29 = i26;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view = arrayList.get(i12);
                    C1034g c1034g7 = (C1034g) view.getLayoutParams();
                    int i30 = i12;
                    int i31 = ((ViewGroup.MarginLayoutParams) c1034g7).leftMargin - i29;
                    int i32 = ((ViewGroup.MarginLayoutParams) c1034g7).rightMargin - i28;
                    int iMax3 = Math.max(0, i31);
                    int iMax4 = Math.max(0, i32);
                    int iMax5 = Math.max(0, -i31);
                    int iMax6 = Math.max(0, -i32);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i28 = iMax6;
                    i29 = iMax5;
                    i12 = i30 + 1;
                }
                i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i33 = measuredWidth4 + i14;
                if (i14 >= iM2385p2) {
                    iM2385p2 = i33 > iMin2 ? i14 - (i33 - iMin2) : i14;
                }
                size4 = arrayList.size();
                for (i13 = 0; i13 < size4; i13++) {
                    iM2385p2 = m2385p(arrayList.get(i13), iM2385p2, iMin, iArr);
                }
                arrayList.clear();
            }
            iM2385p = m2385p(this.f4048d, paddingLeft, iMin, iArr);
        }
        iM2386q = i15;
        if (m2389t(this.f4052h)) {
        }
        if (m2389t(this.f4045a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM2385p);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iM2386q));
        iMax = Math.max(iM2385p, currentContentInsetLeft2);
        int iMin22 = Math.min(iM2386q, i15 - currentContentInsetRight2);
        if (m2389t(this.f4053i)) {
        }
        if (m2389t(this.f4049e)) {
        }
        zM2389t = m2389t(this.f4046b);
        zM2389t2 = m2389t(this.f4047c);
        if (zM2389t) {
        }
        if (!zM2389t2) {
        }
        if (!zM2389t) {
            if (!zM2389t) {
            }
            if (!zM2389t2) {
            }
            C1034g c1034g32 = (C1034g) c0794r1.getLayoutParams();
            C1034g c1034g42 = (C1034g) c0794r12.getLayoutParams();
            int i162 = measuredHeight;
            if (zM2389t) {
                i5 = this.f4067w & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.f4067w & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        ArrayList<View> arrayList2 = this.f4028D;
        m2374a(arrayList2, 3);
        size = arrayList2.size();
        iM2385p2 = iMax;
        while (i10 < size) {
        }
        m2374a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i11 < size2) {
        }
        m2374a(arrayList2, 1);
        int i262 = iArr[0];
        int i272 = iArr[1];
        size3 = arrayList2.size();
        int i282 = i272;
        int i292 = i262;
        i12 = 0;
        int measuredWidth42 = 0;
        while (i12 < size3) {
        }
        i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i332 = measuredWidth42 + i14;
        if (i14 >= iM2385p2) {
        }
        size4 = arrayList2.size();
        while (i13 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM2372k;
        int iMax;
        int iCombineMeasuredStates;
        int iM2372k2;
        int iM2373l;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (m2389t(this.f4048d)) {
            m2388s(this.f4048d, i, 0, i2, this.f4059o);
            iM2372k = m2372k(this.f4048d) + this.f4048d.getMeasuredWidth();
            iMax = Math.max(0, m2373l(this.f4048d) + this.f4048d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4048d.getMeasuredState());
        } else {
            iM2372k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m2389t(this.f4052h)) {
            m2388s(this.f4052h, i, 0, i2, this.f4059o);
            iM2372k = m2372k(this.f4052h) + this.f4052h.getMeasuredWidth();
            iMax = Math.max(iMax, m2373l(this.f4052h) + this.f4052h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4052h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM2372k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM2372k);
        Object[] objArr2 = objArr;
        int[] iArr = this.f4030F;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m2389t(this.f4045a)) {
            m2388s(this.f4045a, i, iMax3, i2, this.f4059o);
            iM2372k2 = m2372k(this.f4045a) + this.f4045a.getMeasuredWidth();
            iMax = Math.max(iMax, m2373l(this.f4045a) + this.f4045a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4045a.getMeasuredState());
        } else {
            iM2372k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM2372k2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM2372k2);
        if (m2389t(this.f4053i)) {
            iMax5 += m2387r(this.f4053i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m2373l(this.f4053i) + this.f4053i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4053i.getMeasuredState());
        }
        if (m2389t(this.f4049e)) {
            iMax5 += m2387r(this.f4049e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m2373l(this.f4049e) + this.f4049e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4049e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C1034g) childAt.getLayoutParams()).f4078b == 0 && m2389t(childAt)) {
                iMax5 += m2387r(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m2373l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f4062r + this.f4063s;
        int i7 = this.f4060p + this.f4061q;
        if (m2389t(this.f4046b)) {
            m2387r(this.f4046b, i, i5 + i7, i2, i6, iArr);
            int iM2372k3 = m2372k(this.f4046b) + this.f4046b.getMeasuredWidth();
            iM2373l = m2373l(this.f4046b) + this.f4046b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4046b.getMeasuredState());
            iMax2 = iM2372k3;
        } else {
            iM2373l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m2389t(this.f4047c)) {
            iMax2 = Math.max(iMax2, m2387r(this.f4047c, i, i5 + i7, i2, i6 + iM2373l, iArr));
            iM2373l += m2373l(this.f4047c) + this.f4047c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f4047c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM2373l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f4040P) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m2389t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1036i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1036i c1036i = (C1036i) parcelable;
        super.onRestoreInstanceState(c1036i.f3119a);
        ActionMenuView actionMenuView = this.f4045a;
        C0998f c0998f = actionMenuView != null ? actionMenuView.f3935p : null;
        int i = c1036i.f4079c;
        if (i != 0 && this.f4037M != null && c0998f != null && (menuItemFindItem = c0998f.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1036i.f4080d) {
            RunnableC1029b runnableC1029b = this.f4044T;
            removeCallbacks(runnableC1029b);
            post(runnableC1029b);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m2377d();
        C0033Bd c0033Bd = this.f4064t;
        boolean z = i == 1;
        if (z == c0033Bd.f126g) {
            return;
        }
        c0033Bd.f126g = z;
        if (!c0033Bd.f127h) {
            c0033Bd.f120a = c0033Bd.f124e;
            c0033Bd.f121b = c0033Bd.f125f;
            return;
        }
        if (z) {
            int i2 = c0033Bd.f123d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0033Bd.f124e;
            }
            c0033Bd.f120a = i2;
            int i3 = c0033Bd.f122c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0033Bd.f125f;
            }
            c0033Bd.f121b = i3;
            return;
        }
        int i4 = c0033Bd.f122c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0033Bd.f124e;
        }
        c0033Bd.f120a = i4;
        int i5 = c0033Bd.f123d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0033Bd.f125f;
        }
        c0033Bd.f121b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1038a c1038a;
        C1000h c1000h;
        C1036i c1036i = new C1036i(super.onSaveInstanceState());
        C1033f c1033f = this.f4037M;
        if (c1033f != null && (c1000h = c1033f.f4076b) != null) {
            c1036i.f4079c = c1000h.f3814a;
        }
        ActionMenuView actionMenuView = this.f4045a;
        c1036i.f4080d = (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null || !c1038a.m2399k()) ? false : true;
        return c1036i;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4026B = false;
        }
        if (!this.f4026B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4026B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4026B = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m2385p(View view, int i, int i2, int[] iArr) {
        C1034g c1034g = (C1034g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1034g).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM2381j = m2381j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM2381j, iMax + measuredWidth, view.getMeasuredHeight() + iM2381j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1034g).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final int m2386q(View view, int i, int i2, int[] iArr) {
        C1034g c1034g = (C1034g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1034g).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM2381j = m2381j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM2381j, iMax, view.getMeasuredHeight() + iM2381j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1034g).leftMargin);
    }

    /* JADX INFO: renamed from: r */
    public final int m2387r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    @Override // p000a.InterfaceC0426Xa
    public final void removeMenuProvider(InterfaceC0595gb interfaceC0595gb) {
        this.f4031G.m1171a(interfaceC0595gb);
    }

    /* JADX INFO: renamed from: s */
    public final void m2388s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f4043S != z) {
            this.f4043S = z;
            m2391v();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseIcon(int i) {
        setCollapseIcon(C0889w1.m2115A(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f4040P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4066v) {
            this.f4066v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4065u) {
            this.f4065u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(int i) {
        setLogo(C0889w1.m2115A(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationIcon(int i) {
        setNavigationIcon(C0889w1.m2115A(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m2380g();
        this.f4048d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1035h interfaceC1035h) {
        this.f4033I = interfaceC1035h;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2378e();
        this.f4045a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f4055k != i) {
            this.f4055k = i;
            if (i == 0) {
                this.f4054j = getContext();
            } else {
                this.f4054j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f4063s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f4061q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f4060p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f4062r = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2389t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2390u() {
        C1038a c1038a;
        ActionMenuView actionMenuView = this.f4045a;
        return (actionMenuView == null || (c1038a = actionMenuView.f3939t) == null || !c1038a.m2400l()) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final void m2391v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM2392a = C1032e.m2392a(this);
            C1033f c1033f = this.f4037M;
            boolean z = (c1033f == null || c1033f.f4076b == null || onBackInvokedDispatcherM2392a == null || !isAttachedToWindow() || !this.f4043S) ? false : true;
            if (z && this.f4042R == null) {
                if (this.f4041Q == null) {
                    this.f4041Q = C1032e.m2393b(new RunnableC0846tf(this, 0));
                }
                C1032e.m2394c(onBackInvokedDispatcherM2392a, this.f4041Q);
                this.f4042R = onBackInvokedDispatcherM2392a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f4042R) == null) {
                return;
            }
            C1032e.m2395d(onBackInvokedDispatcher, this.f4041Q);
            this.f4042R = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4067w = 8388627;
        this.f4028D = new ArrayList<>();
        this.f4029E = new ArrayList<>();
        this.f4030F = new int[2];
        this.f4031G = new C0481ab(new RunnableC0846tf(this, 1));
        this.f4032H = new ArrayList<>();
        this.f4034J = new C1028a();
        this.f4044T = new RunnableC1029b();
        C0751of c0751ofM1768e = C0751of.m1768e(getContext(), attributeSet, C0983R.styleable.Toolbar, i);
        C0866ug.m2002i(this, context, C0983R.styleable.Toolbar, attributeSet, c0751ofM1768e.f2960b, i);
        int i2 = C0983R.styleable.Toolbar_titleTextAppearance;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        this.f4056l = typedArray.getResourceId(i2, 0);
        this.f4057m = typedArray.getResourceId(C0983R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f4067w = typedArray.getInteger(C0983R.styleable.Toolbar_android_gravity, 8388627);
        this.f4058n = typedArray.getInteger(C0983R.styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(C0983R.styleable.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4063s = dimensionPixelOffset;
        this.f4062r = dimensionPixelOffset;
        this.f4061q = dimensionPixelOffset;
        this.f4060p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4060p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4061q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4062r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4063s = dimensionPixelOffset5;
        }
        this.f4059o = typedArray.getDimensionPixelSize(C0983R.styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C0983R.styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C0983R.styleable.Toolbar_contentInsetRight, 0);
        m2377d();
        C0033Bd c0033Bd = this.f4064t;
        c0033Bd.f127h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0033Bd.f124e = dimensionPixelSize;
            c0033Bd.f120a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0033Bd.f125f = dimensionPixelSize2;
            c0033Bd.f121b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0033Bd.m93a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4065u = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f4066v = typedArray.getDimensionPixelOffset(C0983R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f4050f = c0751ofM1768e.m1770b(C0983R.styleable.Toolbar_collapseIcon);
        this.f4051g = typedArray.getText(C0983R.styleable.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(C0983R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(C0983R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4054j = getContext();
        setPopupTheme(typedArray.getResourceId(C0983R.styleable.Toolbar_popupTheme, 0));
        Drawable drawableM1770b = c0751ofM1768e.m1770b(C0983R.styleable.Toolbar_navigationIcon);
        if (drawableM1770b != null) {
            setNavigationIcon(drawableM1770b);
        }
        CharSequence text3 = typedArray.getText(C0983R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM1770b2 = c0751ofM1768e.m1770b(C0983R.styleable.Toolbar_logo);
        if (drawableM1770b2 != null) {
            setLogo(drawableM1770b2);
        }
        CharSequence text4 = typedArray.getText(C0983R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(C0983R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(c0751ofM1768e.m1769a(C0983R.styleable.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(C0983R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(c0751ofM1768e.m1769a(C0983R.styleable.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(C0983R.styleable.Toolbar_menu)) {
            mo2382m(typedArray.getResourceId(C0983R.styleable.Toolbar_menu, 0));
        }
        c0751ofM1768e.m1773f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1034g c1034g = new C1034g(context, attributeSet);
        c1034g.f674a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0983R.styleable.ActionBarLayout);
        c1034g.f674a = typedArrayObtainStyledAttributes.getInt(C0983R.styleable.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1034g.f4078b = 0;
        return c1034g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2376c();
        }
        C0509c1 c0509c1 = this.f4052h;
        if (c0509c1 != null) {
            c0509c1.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m2376c();
            this.f4052h.setImageDrawable(drawable);
        } else {
            C0509c1 c0509c1 = this.f4052h;
            if (c0509c1 != null) {
                c0509c1.setImageDrawable(this.f4050f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4049e == null) {
                this.f4049e = new C0547e1(getContext(), null, 0);
            }
            if (!m2384o(this.f4049e)) {
                m2375b(this.f4049e, true);
            }
        } else {
            C0547e1 c0547e1 = this.f4049e;
            if (c0547e1 != null && m2384o(c0547e1)) {
                removeView(this.f4049e);
                this.f4029E.remove(this.f4049e);
            }
        }
        C0547e1 c0547e12 = this.f4049e;
        if (c0547e12 != null) {
            c0547e12.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4049e == null) {
            this.f4049e = new C0547e1(getContext(), null, 0);
        }
        C0547e1 c0547e1 = this.f4049e;
        if (c0547e1 != null) {
            c0547e1.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2380g();
        }
        C0509c1 c0509c1 = this.f4048d;
        if (c0509c1 != null) {
            c0509c1.setContentDescription(charSequence);
            C0922xf.m2208a(this.f4048d, charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2380g();
            if (!m2384o(this.f4048d)) {
                m2375b(this.f4048d, true);
            }
        } else {
            C0509c1 c0509c1 = this.f4048d;
            if (c0509c1 != null && m2384o(c0509c1)) {
                removeView(this.f4048d);
                this.f4029E.remove(this.f4048d);
            }
        }
        C0509c1 c0509c12 = this.f4048d;
        if (c0509c12 != null) {
            c0509c12.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0794r1 c0794r1 = this.f4047c;
            if (c0794r1 != null && m2384o(c0794r1)) {
                removeView(this.f4047c);
                this.f4029E.remove(this.f4047c);
            }
        } else {
            if (this.f4047c == null) {
                Context context = getContext();
                C0794r1 c0794r12 = new C0794r1(context, null);
                this.f4047c = c0794r12;
                c0794r12.setSingleLine();
                this.f4047c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4057m;
                if (i != 0) {
                    this.f4047c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4025A;
                if (colorStateList != null) {
                    this.f4047c.setTextColor(colorStateList);
                }
            }
            if (!m2384o(this.f4047c)) {
                m2375b(this.f4047c, true);
            }
        }
        C0794r1 c0794r13 = this.f4047c;
        if (c0794r13 != null) {
            c0794r13.setText(charSequence);
        }
        this.f4069y = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4025A = colorStateList;
        C0794r1 c0794r1 = this.f4047c;
        if (c0794r1 != null) {
            c0794r1.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0794r1 c0794r1 = this.f4046b;
            if (c0794r1 != null && m2384o(c0794r1)) {
                removeView(this.f4046b);
                this.f4029E.remove(this.f4046b);
            }
        } else {
            if (this.f4046b == null) {
                Context context = getContext();
                C0794r1 c0794r12 = new C0794r1(context, null);
                this.f4046b = c0794r12;
                c0794r12.setSingleLine();
                this.f4046b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4056l;
                if (i != 0) {
                    this.f4046b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4070z;
                if (colorStateList != null) {
                    this.f4046b.setTextColor(colorStateList);
                }
            }
            if (!m2384o(this.f4046b)) {
                m2375b(this.f4046b, true);
            }
        }
        C0794r1 c0794r13 = this.f4046b;
        if (c0794r13 != null) {
            c0794r13.setText(charSequence);
        }
        this.f4068x = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4070z = colorStateList;
        C0794r1 c0794r1 = this.f4046b;
        if (c0794r1 != null) {
            c0794r1.setTextColor(colorStateList);
        }
    }
}
