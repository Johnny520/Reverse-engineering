package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.AbstractC0507g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.luckypray.dexkit.C1031R;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p018J0.C0234d;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;
import p053e.C0766d;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p057g.AbstractC0863H0;
import p057g.AbstractC0875N0;
import p057g.AbstractC0881Q0;
import p057g.C0859F0;
import p057g.C0865I0;
import p057g.C0867J0;
import p057g.C0868K;
import p057g.C0871L0;
import p057g.C0873M0;
import p057g.C0900f;
import p057g.C0906i;
import p057g.C0934w;
import p057g.C0936x;
import p057g.C0937x0;
import p057g.InterfaceC0869K0;
import p057g.InterfaceC0882S;
import p057g.RunnableC0857E0;
import p057g.ViewOnClickListenerC0861G0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1211A;

    /* JADX INFO: renamed from: B */
    public boolean f1212B;

    /* JADX INFO: renamed from: C */
    public boolean f1213C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f1214D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f1215E;

    /* JADX INFO: renamed from: F */
    public final int[] f1216F;

    /* JADX INFO: renamed from: G */
    public final C0095d f1217G;

    /* JADX INFO: renamed from: H */
    public ArrayList f1218H;

    /* JADX INFO: renamed from: I */
    public final C0859F0 f1219I;

    /* JADX INFO: renamed from: J */
    public C0873M0 f1220J;

    /* JADX INFO: renamed from: K */
    public C0865I0 f1221K;

    /* JADX INFO: renamed from: L */
    public boolean f1222L;

    /* JADX INFO: renamed from: M */
    public OnBackInvokedCallback f1223M;

    /* JADX INFO: renamed from: N */
    public OnBackInvokedDispatcher f1224N;

    /* JADX INFO: renamed from: O */
    public boolean f1225O;

    /* JADX INFO: renamed from: P */
    public final RunnableC0019E f1226P;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1227a;

    /* JADX INFO: renamed from: b */
    public C0868K f1228b;

    /* JADX INFO: renamed from: c */
    public C0868K f1229c;

    /* JADX INFO: renamed from: d */
    public C0934w f1230d;

    /* JADX INFO: renamed from: e */
    public C0936x f1231e;

    /* JADX INFO: renamed from: f */
    public final Drawable f1232f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f1233g;

    /* JADX INFO: renamed from: h */
    public C0934w f1234h;

    /* JADX INFO: renamed from: i */
    public View f1235i;

    /* JADX INFO: renamed from: j */
    public Context f1236j;

    /* JADX INFO: renamed from: k */
    public int f1237k;

    /* JADX INFO: renamed from: l */
    public int f1238l;

    /* JADX INFO: renamed from: m */
    public int f1239m;

    /* JADX INFO: renamed from: n */
    public final int f1240n;

    /* JADX INFO: renamed from: o */
    public final int f1241o;

    /* JADX INFO: renamed from: p */
    public int f1242p;

    /* JADX INFO: renamed from: q */
    public int f1243q;

    /* JADX INFO: renamed from: r */
    public int f1244r;

    /* JADX INFO: renamed from: s */
    public int f1245s;

    /* JADX INFO: renamed from: t */
    public C0937x0 f1246t;

    /* JADX INFO: renamed from: u */
    public int f1247u;

    /* JADX INFO: renamed from: v */
    public int f1248v;

    /* JADX INFO: renamed from: w */
    public final int f1249w;

    /* JADX INFO: renamed from: x */
    public CharSequence f1250x;

    /* JADX INFO: renamed from: y */
    public CharSequence f1251y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f1252z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C0867J0 m1135g() {
        C0867J0 c0867j0 = new C0867J0(-2, -2);
        c0867j0.f3112b = 0;
        c0867j0.f3111a = 8388627;
        return c0867j0;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0766d(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static C0867J0 m1136h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C0867J0;
        if (z2) {
            C0867J0 c0867j0 = (C0867J0) layoutParams;
            C0867J0 c0867j02 = new C0867J0(c0867j0);
            c0867j02.f3112b = 0;
            c0867j02.f3112b = c0867j0.f3112b;
            return c0867j02;
        }
        if (z2) {
            C0867J0 c0867j03 = new C0867J0((C0867J0) layoutParams);
            c0867j03.f3112b = 0;
            return c0867j03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C0867J0 c0867j04 = new C0867J0(layoutParams);
            c0867j04.f3112b = 0;
            return c0867j04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C0867J0 c0867j05 = new C0867J0(marginLayoutParams);
        c0867j05.f3112b = 0;
        ((ViewGroup.MarginLayoutParams) c0867j05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c0867j05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c0867j05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c0867j05).bottomMargin = marginLayoutParams.bottomMargin;
        return c0867j05;
    }

    /* JADX INFO: renamed from: j */
    public static int m1137j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: k */
    public static int m1138k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m1139a(ArrayList arrayList, int i2) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0867J0 c0867j0 = (C0867J0) childAt.getLayoutParams();
                if (c0867j0.f3112b == 0 && m1153s(childAt)) {
                    int i4 = c0867j0.f3111a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
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
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            C0867J0 c0867j02 = (C0867J0) childAt2.getLayoutParams();
            if (c0867j02.f3112b == 0 && m1153s(childAt2)) {
                int i6 = c0867j02.f3111a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1140b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0867J0 c0867j0M1135g = layoutParams == null ? m1135g() : !checkLayoutParams(layoutParams) ? m1136h(layoutParams) : (C0867J0) layoutParams;
        c0867j0M1135g.f3112b = 1;
        if (!z2 || this.f1235i == null) {
            addView(view, c0867j0M1135g);
        } else {
            view.setLayoutParams(c0867j0M1135g);
            this.f1215E.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1141c() {
        if (this.f1234h == null) {
            C0934w c0934w = new C0934w(getContext(), null, C1031R.attr.toolbarNavigationButtonStyle);
            this.f1234h = c0934w;
            c0934w.setImageDrawable(this.f1232f);
            this.f1234h.setContentDescription(this.f1233g);
            C0867J0 c0867j0M1135g = m1135g();
            c0867j0M1135g.f3111a = (this.f1240n & 112) | 8388611;
            c0867j0M1135g.f3112b = 2;
            this.f1234h.setLayoutParams(c0867j0M1135g);
            this.f1234h.setOnClickListener(new ViewOnClickListenerC0861G0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0867J0);
    }

    /* JADX INFO: renamed from: d */
    public final void m1142d() {
        if (this.f1246t == null) {
            C0937x0 c0937x0 = new C0937x0();
            c0937x0.f3321a = 0;
            c0937x0.f3322b = 0;
            c0937x0.f3323c = Integer.MIN_VALUE;
            c0937x0.f3324d = Integer.MIN_VALUE;
            c0937x0.f3325e = 0;
            c0937x0.f3326f = 0;
            c0937x0.f3327g = false;
            c0937x0.f3328h = false;
            this.f1246t = c0937x0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1143e() {
        if (this.f1227a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1227a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1237k);
            this.f1227a.setOnMenuItemClickListener(this.f1219I);
            ActionMenuView actionMenuView2 = this.f1227a;
            C0859F0 c0859f0 = new C0859F0(this);
            actionMenuView2.f1145t = null;
            actionMenuView2.f1146u = c0859f0;
            C0867J0 c0867j0M1135g = m1135g();
            c0867j0M1135g.f3111a = (this.f1240n & 112) | 8388613;
            this.f1227a.setLayoutParams(c0867j0M1135g);
            m1140b(this.f1227a, false);
        }
        ActionMenuView actionMenuView3 = this.f1227a;
        if (actionMenuView3.f1141p == null) {
            MenuC0779j menuC0779j = (MenuC0779j) actionMenuView3.getMenu();
            if (this.f1221K == null) {
                this.f1221K = new C0865I0(this);
            }
            this.f1227a.setExpandedActionViewsExclusive(true);
            menuC0779j.m1996b(this.f1221K, this.f1236j);
            m1154t();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1144f() {
        if (this.f1230d == null) {
            this.f1230d = new C0934w(getContext(), null, C1031R.attr.toolbarNavigationButtonStyle);
            C0867J0 c0867j0M1135g = m1135g();
            c0867j0M1135g.f3111a = (this.f1240n & 112) | 8388611;
            this.f1230d.setLayoutParams(c0867j0M1135g);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1135g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1136h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0934w c0934w = this.f1234h;
        if (c0934w != null) {
            return c0934w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0934w c0934w = this.f1234h;
        if (c0934w != null) {
            return c0934w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0937x0 c0937x0 = this.f1246t;
        if (c0937x0 != null) {
            return c0937x0.f3327g ? c0937x0.f3321a : c0937x0.f3322b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1248v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0937x0 c0937x0 = this.f1246t;
        if (c0937x0 != null) {
            return c0937x0.f3321a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0937x0 c0937x0 = this.f1246t;
        if (c0937x0 != null) {
            return c0937x0.f3322b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0937x0 c0937x0 = this.f1246t;
        if (c0937x0 != null) {
            return c0937x0.f3327g ? c0937x0.f3322b : c0937x0.f3321a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1247u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0779j menuC0779j;
        ActionMenuView actionMenuView = this.f1227a;
        return (actionMenuView == null || (menuC0779j = actionMenuView.f1141p) == null || !menuC0779j.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1248v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1247u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0936x c0936x = this.f1231e;
        if (c0936x != null) {
            return c0936x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0936x c0936x = this.f1231e;
        if (c0936x != null) {
            return c0936x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1143e();
        return this.f1227a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1230d;
    }

    public CharSequence getNavigationContentDescription() {
        C0934w c0934w = this.f1230d;
        if (c0934w != null) {
            return c0934w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0934w c0934w = this.f1230d;
        if (c0934w != null) {
            return c0934w.getDrawable();
        }
        return null;
    }

    public C0906i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        m1143e();
        return this.f1227a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1236j;
    }

    public int getPopupTheme() {
        return this.f1237k;
    }

    public CharSequence getSubtitle() {
        return this.f1251y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1229c;
    }

    public CharSequence getTitle() {
        return this.f1250x;
    }

    public int getTitleMarginBottom() {
        return this.f1245s;
    }

    public int getTitleMarginEnd() {
        return this.f1243q;
    }

    public int getTitleMarginStart() {
        return this.f1242p;
    }

    public int getTitleMarginTop() {
        return this.f1244r;
    }

    public final TextView getTitleTextView() {
        return this.f1228b;
    }

    public InterfaceC0882S getWrapper() {
        Drawable drawable;
        if (this.f1220J == null) {
            C0873M0 c0873m0 = new C0873M0();
            c0873m0.f3133l = 0;
            c0873m0.f3122a = this;
            c0873m0.f3129h = getTitle();
            c0873m0.f3130i = getSubtitle();
            c0873m0.f3128g = c0873m0.f3129h != null;
            c0873m0.f3127f = getNavigationIcon();
            C0234d c0234dM638s = C0234d.m638s(getContext(), null, AbstractC0550a.f1616a, C1031R.attr.actionBarStyle, 0);
            c0873m0.f3134m = c0234dM638s.m646i(15);
            TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c0873m0.f3128g = true;
                c0873m0.f3129h = text;
                if ((c0873m0.f3123b & 8) != 0) {
                    Toolbar toolbar = c0873m0.f3122a;
                    toolbar.setTitle(text);
                    if (c0873m0.f3128g) {
                        AbstractC0080Q.m292k(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c0873m0.f3130i = text2;
                if ((c0873m0.f3123b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM646i = c0234dM638s.m646i(20);
            if (drawableM646i != null) {
                c0873m0.f3126e = drawableM646i;
                c0873m0.m2197c();
            }
            Drawable drawableM646i2 = c0234dM638s.m646i(17);
            if (drawableM646i2 != null) {
                c0873m0.f3125d = drawableM646i2;
                c0873m0.m2197c();
            }
            if (c0873m0.f3127f == null && (drawable = c0873m0.f3134m) != null) {
                c0873m0.f3127f = drawable;
                int i2 = c0873m0.f3123b & 4;
                Toolbar toolbar2 = c0873m0.f3122a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c0873m0.m2195a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c0873m0.f3124c;
                if (view != null && (c0873m0.f3123b & 16) != 0) {
                    removeView(view);
                }
                c0873m0.f3124c = viewInflate;
                if (viewInflate != null && (c0873m0.f3123b & 16) != 0) {
                    addView(viewInflate);
                }
                c0873m0.m2195a(c0873m0.f3123b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m1142d();
                this.f1246t.m2272a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1238l = resourceId2;
                C0868K c0868k = this.f1228b;
                if (c0868k != null) {
                    c0868k.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1239m = resourceId3;
                C0868K c0868k2 = this.f1229c;
                if (c0868k2 != null) {
                    c0868k2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0234dM638s.m657u();
            if (C1031R.string.abc_action_bar_up_description != c0873m0.f3133l) {
                c0873m0.f3133l = C1031R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c0873m0.f3133l;
                    c0873m0.f3131j = i3 != 0 ? getContext().getString(i3) : null;
                    c0873m0.m2196b();
                }
            }
            c0873m0.f3131j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0861G0(c0873m0));
            this.f1220J = c0873m0;
        }
        return this.f1220J;
    }

    /* JADX INFO: renamed from: i */
    public final int m1145i(View view, int i2) {
        C0867J0 c0867j0 = (C0867J0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = c0867j0.f3111a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1249w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0867j0).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c0867j0).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c0867j0).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: l */
    public void mo1146l(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    /* JADX INFO: renamed from: m */
    public final void m1147m() {
        Iterator it = this.f1218H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1217G.f251b).iterator();
        if (it2.hasNext()) {
            ((AbstractC0507g) it2.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1218H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1148n(View view) {
        return view.getParent() == this || this.f1215E.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public final int m1149o(View view, int i2, int i3, int[] iArr) {
        C0867J0 c0867j0 = (C0867J0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0867j0).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iM1145i = m1145i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1145i, iMax + measuredWidth, view.getMeasuredHeight() + iM1145i);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0867j0).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1154t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1226P);
        m1154t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1213C = false;
        }
        if (!this.f1213C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1213C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1213C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iM1149o;
        int iM1150p;
        boolean zM1153s;
        boolean zM1153s2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int iM1149o2;
        int i16;
        int size2;
        int i17;
        int size3;
        int i18;
        int i19;
        int i20;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i21 = width - paddingRight;
        int[] iArr = this.f1216F;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = AbstractC0080Q.f219a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!m1153s(this.f1230d)) {
            iM1149o = paddingLeft;
        } else {
            if (z4) {
                iM1150p = m1150p(this.f1230d, i21, iMin, iArr);
                iM1149o = paddingLeft;
                if (m1153s(this.f1234h)) {
                    if (z4) {
                        iM1150p = m1150p(this.f1234h, iM1150p, iMin, iArr);
                    } else {
                        iM1149o = m1149o(this.f1234h, iM1149o, iMin, iArr);
                    }
                }
                if (m1153s(this.f1227a)) {
                    if (z4) {
                        iM1149o = m1149o(this.f1227a, iM1149o, iMin, iArr);
                    } else {
                        iM1150p = m1150p(this.f1227a, iM1150p, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM1149o);
                iArr[1] = Math.max(0, currentContentInsetRight - (i21 - iM1150p));
                int iMax = Math.max(iM1149o, currentContentInsetLeft);
                int iMin2 = Math.min(iM1150p, i21 - currentContentInsetRight);
                if (m1153s(this.f1235i)) {
                    if (z4) {
                        iMin2 = m1150p(this.f1235i, iMin2, iMin, iArr);
                    } else {
                        iMax = m1149o(this.f1235i, iMax, iMin, iArr);
                    }
                }
                if (m1153s(this.f1231e)) {
                    if (z4) {
                        iMin2 = m1150p(this.f1231e, iMin2, iMin, iArr);
                    } else {
                        iMax = m1149o(this.f1231e, iMax, iMin, iArr);
                    }
                }
                zM1153s = m1153s(this.f1228b);
                zM1153s2 = m1153s(this.f1229c);
                if (zM1153s) {
                    i6 = paddingRight;
                    measuredHeight = 0;
                } else {
                    C0867J0 c0867j0 = (C0867J0) this.f1228b.getLayoutParams();
                    i6 = paddingRight;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) c0867j0).bottomMargin + this.f1228b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0867j0).topMargin;
                }
                if (zM1153s2) {
                    i7 = width;
                } else {
                    C0867J0 c0867j02 = (C0867J0) this.f1229c.getLayoutParams();
                    i7 = width;
                    measuredHeight += this.f1229c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0867j02).topMargin + ((ViewGroup.MarginLayoutParams) c0867j02).bottomMargin;
                }
                if (!zM1153s || zM1153s2) {
                    C0868K c0868k = !zM1153s ? this.f1228b : this.f1229c;
                    C0868K c0868k2 = !zM1153s2 ? this.f1229c : this.f1228b;
                    C0867J0 c0867j03 = (C0867J0) c0868k.getLayoutParams();
                    C0867J0 c0867j04 = (C0867J0) c0868k2.getLayoutParams();
                    if ((zM1153s || this.f1228b.getMeasuredWidth() <= 0) && (!zM1153s2 || this.f1229c.getMeasuredWidth() <= 0)) {
                        i8 = paddingLeft;
                        z3 = false;
                    } else {
                        i8 = paddingLeft;
                        z3 = true;
                    }
                    i9 = this.f1249w & 112;
                    i10 = iMin;
                    if (i9 == 48) {
                        i11 = iMax;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0867j03).topMargin + this.f1244r;
                    } else if (i9 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        i11 = iMax;
                        int i22 = ((ViewGroup.MarginLayoutParams) c0867j03).topMargin + this.f1244r;
                        if (iMax2 < i22) {
                            iMax2 = i22;
                        } else {
                            int i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            int i24 = ((ViewGroup.MarginLayoutParams) c0867j03).bottomMargin;
                            int i25 = this.f1245s;
                            if (i23 < i24 + i25) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0867j04).bottomMargin + i25) - i23));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        i11 = iMax;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0867j04).bottomMargin) - this.f1245s) - measuredHeight;
                    }
                    if (z4) {
                        int i26 = (z3 ? this.f1242p : 0) - iArr[1];
                        iMin2 -= Math.max(0, i26);
                        iArr[1] = Math.max(0, -i26);
                        if (zM1153s) {
                            C0867J0 c0867j05 = (C0867J0) this.f1228b.getLayoutParams();
                            int measuredWidth = iMin2 - this.f1228b.getMeasuredWidth();
                            int measuredHeight2 = this.f1228b.getMeasuredHeight() + paddingTop;
                            this.f1228b.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i14 = measuredWidth - this.f1243q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0867j05).bottomMargin;
                        } else {
                            i14 = iMin2;
                        }
                        if (zM1153s2) {
                            int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0867J0) this.f1229c.getLayoutParams())).topMargin;
                            this.f1229c.layout(iMin2 - this.f1229c.getMeasuredWidth(), i27, iMin2, this.f1229c.getMeasuredHeight() + i27);
                            i15 = iMin2 - this.f1243q;
                        } else {
                            i15 = iMin2;
                        }
                        if (z3) {
                            iMin2 = Math.min(i14, i15);
                        }
                        iMax = i11;
                    } else {
                        int i28 = (z3 ? this.f1242p : 0) - iArr[0];
                        iMax = Math.max(0, i28) + i11;
                        iArr[0] = Math.max(0, -i28);
                        if (zM1153s) {
                            C0867J0 c0867j06 = (C0867J0) this.f1228b.getLayoutParams();
                            int measuredWidth2 = this.f1228b.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f1228b.getMeasuredHeight() + paddingTop;
                            this.f1228b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i12 = measuredWidth2 + this.f1243q;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0867j06).bottomMargin;
                        } else {
                            i12 = iMax;
                        }
                        if (zM1153s2) {
                            int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0867J0) this.f1229c.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f1229c.getMeasuredWidth() + iMax;
                            this.f1229c.layout(iMax, i29, measuredWidth3, this.f1229c.getMeasuredHeight() + i29);
                            i13 = measuredWidth3 + this.f1243q;
                        } else {
                            i13 = iMax;
                        }
                        if (z3) {
                            iMax = Math.max(i12, i13);
                        }
                    }
                } else {
                    i8 = paddingLeft;
                    i10 = iMin;
                }
                ArrayList arrayList = this.f1214D;
                m1139a(arrayList, 3);
                size = arrayList.size();
                iM1149o2 = iMax;
                for (i16 = 0; i16 < size; i16++) {
                    iM1149o2 = m1149o((View) arrayList.get(i16), iM1149o2, i10, iArr);
                }
                int i30 = i10;
                m1139a(arrayList, 5);
                size2 = arrayList.size();
                for (i17 = 0; i17 < size2; i17++) {
                    iMin2 = m1150p((View) arrayList.get(i17), iMin2, i30, iArr);
                }
                m1139a(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i32;
                int i34 = i31;
                i18 = 0;
                int measuredWidth4 = 0;
                while (i18 < size3) {
                    View view = (View) arrayList.get(i18);
                    C0867J0 c0867j07 = (C0867J0) view.getLayoutParams();
                    int i35 = ((ViewGroup.MarginLayoutParams) c0867j07).leftMargin - i34;
                    int i36 = ((ViewGroup.MarginLayoutParams) c0867j07).rightMargin - i33;
                    int iMax3 = Math.max(0, i35);
                    int iMax4 = Math.max(0, i36);
                    int iMax5 = Math.max(0, -i35);
                    int iMax6 = Math.max(0, -i36);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i18++;
                    i33 = iMax6;
                    i34 = iMax5;
                }
                i20 = ((((i7 - i8) - i6) / 2) + i8) - (measuredWidth4 / 2);
                int i37 = measuredWidth4 + i20;
                if (i20 >= iM1149o2) {
                    iM1149o2 = i37 > iMin2 ? i20 - (i37 - iMin2) : i20;
                }
                size4 = arrayList.size();
                for (i19 = 0; i19 < size4; i19++) {
                    iM1149o2 = m1149o((View) arrayList.get(i19), iM1149o2, i30, iArr);
                }
                arrayList.clear();
            }
            iM1149o = m1149o(this.f1230d, paddingLeft, iMin, iArr);
        }
        iM1150p = i21;
        if (m1153s(this.f1234h)) {
        }
        if (m1153s(this.f1227a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM1149o);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i21 - iM1150p));
        int iMax7 = Math.max(iM1149o, currentContentInsetLeft2);
        int iMin22 = Math.min(iM1150p, i21 - currentContentInsetRight2);
        if (m1153s(this.f1235i)) {
        }
        if (m1153s(this.f1231e)) {
        }
        zM1153s = m1153s(this.f1228b);
        zM1153s2 = m1153s(this.f1229c);
        if (zM1153s) {
        }
        if (zM1153s2) {
        }
        if (zM1153s) {
            if (!zM1153s) {
            }
            if (!zM1153s2) {
            }
            C0867J0 c0867j032 = (C0867J0) c0868k.getLayoutParams();
            C0867J0 c0867j042 = (C0867J0) c0868k2.getLayoutParams();
            if (zM1153s) {
                i8 = paddingLeft;
                z3 = false;
                i9 = this.f1249w & 112;
                i10 = iMin;
                if (i9 == 48) {
                }
                if (z4) {
                }
            } else {
                i8 = paddingLeft;
                z3 = false;
                i9 = this.f1249w & 112;
                i10 = iMin;
                if (i9 == 48) {
                }
                if (z4) {
                }
            }
        }
        ArrayList arrayList2 = this.f1214D;
        m1139a(arrayList2, 3);
        size = arrayList2.size();
        iM1149o2 = iMax7;
        while (i16 < size) {
        }
        int i302 = i10;
        m1139a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i17 < size2) {
        }
        m1139a(arrayList2, 1);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i322;
        int i342 = i312;
        i18 = 0;
        int measuredWidth42 = 0;
        while (i18 < size3) {
        }
        i20 = ((((i7 - i8) - i6) / 2) + i8) - (measuredWidth42 / 2);
        int i372 = measuredWidth42 + i20;
        if (i20 >= iM1149o2) {
        }
        size4 = arrayList2.size();
        while (i19 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        char c;
        char c2;
        int iM1137j;
        int iMax;
        int iCombineMeasuredStates;
        int iM1137j2;
        int iM1138k;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z2 = AbstractC0881Q0.f3149a;
        int i4 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (m1153s(this.f1230d)) {
            m1152r(this.f1230d, i2, 0, i3, this.f1241o);
            iM1137j = m1137j(this.f1230d) + this.f1230d.getMeasuredWidth();
            iMax = Math.max(0, m1138k(this.f1230d) + this.f1230d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1230d.getMeasuredState());
        } else {
            iM1137j = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1153s(this.f1234h)) {
            m1152r(this.f1234h, i2, 0, i3, this.f1241o);
            iM1137j = m1137j(this.f1234h) + this.f1234h.getMeasuredWidth();
            iMax = Math.max(iMax, m1138k(this.f1234h) + this.f1234h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1234h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1137j);
        int iMax4 = Math.max(0, currentContentInsetStart - iM1137j);
        int[] iArr = this.f1216F;
        iArr[c2] = iMax4;
        if (m1153s(this.f1227a)) {
            m1152r(this.f1227a, i2, iMax3, i3, this.f1241o);
            iM1137j2 = m1137j(this.f1227a) + this.f1227a.getMeasuredWidth();
            iMax = Math.max(iMax, m1138k(this.f1227a) + this.f1227a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1227a.getMeasuredState());
        } else {
            iM1137j2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM1137j2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM1137j2);
        if (m1153s(this.f1235i)) {
            iMax5 += m1151q(this.f1235i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m1138k(this.f1235i) + this.f1235i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1235i.getMeasuredState());
        }
        if (m1153s(this.f1231e)) {
            iMax5 += m1151q(this.f1231e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m1138k(this.f1231e) + this.f1231e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1231e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((C0867J0) childAt.getLayoutParams()).f3112b == 0 && m1153s(childAt)) {
                iMax5 += m1151q(childAt, i2, iMax5, i3, 0, iArr);
                iMax = Math.max(iMax, m1138k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.f1244r + this.f1245s;
        int i7 = this.f1242p + this.f1243q;
        if (m1153s(this.f1228b)) {
            m1151q(this.f1228b, i2, iMax5 + i7, i3, i6, iArr);
            int iM1137j3 = m1137j(this.f1228b) + this.f1228b.getMeasuredWidth();
            iM1138k = m1138k(this.f1228b) + this.f1228b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1228b.getMeasuredState());
            iMax2 = iM1137j3;
        } else {
            iM1138k = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m1153s(this.f1229c)) {
            iMax2 = Math.max(iMax2, m1151q(this.f1229c, i2, iMax5 + i7, i3, iM1138k + i6, iArr));
            iM1138k = m1138k(this.f1229c) + this.f1229c.getMeasuredHeight() + iM1138k;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1229c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM1138k);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f1222L) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m1153s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0871L0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0871L0 c0871l0 = (C0871L0) parcelable;
        super.onRestoreInstanceState(c0871l0.f481a);
        ActionMenuView actionMenuView = this.f1227a;
        MenuC0779j menuC0779j = actionMenuView != null ? actionMenuView.f1141p : null;
        int i2 = c0871l0.f3120c;
        if (i2 != 0 && this.f1221K != null && menuC0779j != null && (menuItemFindItem = menuC0779j.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0871l0.f3121d) {
            RunnableC0019E runnableC0019E = this.f1226P;
            removeCallbacks(runnableC0019E);
            post(runnableC0019E);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        m1142d();
        C0937x0 c0937x0 = this.f1246t;
        boolean z2 = i2 == 1;
        if (z2 == c0937x0.f3327g) {
            return;
        }
        c0937x0.f3327g = z2;
        if (!c0937x0.f3328h) {
            c0937x0.f3321a = c0937x0.f3325e;
            c0937x0.f3322b = c0937x0.f3326f;
            return;
        }
        if (z2) {
            int i3 = c0937x0.f3324d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0937x0.f3325e;
            }
            c0937x0.f3321a = i3;
            int i4 = c0937x0.f3323c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0937x0.f3326f;
            }
            c0937x0.f3322b = i4;
            return;
        }
        int i5 = c0937x0.f3323c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0937x0.f3325e;
        }
        c0937x0.f3321a = i5;
        int i6 = c0937x0.f3324d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c0937x0.f3326f;
        }
        c0937x0.f3322b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0906i c0906i;
        C0900f c0900f;
        MenuItemC0780k menuItemC0780k;
        C0871L0 c0871l0 = new C0871L0(super.onSaveInstanceState());
        C0865I0 c0865i0 = this.f1221K;
        if (c0865i0 != null && (menuItemC0780k = c0865i0.f3108b) != null) {
            c0871l0.f3120c = menuItemC0780k.f2807a;
        }
        ActionMenuView actionMenuView = this.f1227a;
        c0871l0.f3121d = (actionMenuView == null || (c0906i = actionMenuView.f1144s) == null || (c0900f = c0906i.f3220r) == null || !c0900f.m2027b()) ? false : true;
        return c0871l0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1212B = false;
        }
        if (!this.f1212B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1212B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1212B = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m1150p(View view, int i2, int i3, int[] iArr) {
        C0867J0 c0867j0 = (C0867J0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0867j0).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iM1145i = m1145i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1145i, iMax, view.getMeasuredHeight() + iM1145i);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0867j0).leftMargin);
    }

    /* JADX INFO: renamed from: q */
    public final int m1151q(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: r */
    public final void m1152r(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1153s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1225O != z2) {
            this.f1225O = z2;
            m1154t();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0358S.m916w(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1222L = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1248v) {
            this.f1248v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1247u) {
            this.f1247u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0358S.m916w(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0358S.m916w(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1144f();
        this.f1230d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0869K0 interfaceC0869K0) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m1143e();
        this.f1227a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1237k != i2) {
            this.f1237k = i2;
            if (i2 == 0) {
                this.f1236j = getContext();
            } else {
                this.f1236j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1245s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1243q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1242p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1244r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* JADX INFO: renamed from: t */
    public final void m1154t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM2185a = AbstractC0863H0.m2185a(this);
            C0865I0 c0865i0 = this.f1221K;
            boolean z2 = (c0865i0 == null || c0865i0.f3108b == null || onBackInvokedDispatcherM2185a == null || !isAttachedToWindow() || !this.f1225O) ? false : true;
            if (z2 && this.f1224N == null) {
                if (this.f1223M == null) {
                    this.f1223M = AbstractC0863H0.m2186b(new RunnableC0857E0(this, 0));
                }
                AbstractC0863H0.m2187c(onBackInvokedDispatcherM2185a, this.f1223M);
                this.f1224N = onBackInvokedDispatcherM2185a;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1224N) == null) {
                return;
            }
            AbstractC0863H0.m2188d(onBackInvokedDispatcher, this.f1223M);
            this.f1224N = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, C1031R.attr.toolbarStyle);
        this.f1249w = 8388627;
        this.f1214D = new ArrayList();
        this.f1215E = new ArrayList();
        this.f1216F = new int[2];
        this.f1217G = new C0095d(new RunnableC0857E0(this, 1));
        this.f1218H = new ArrayList();
        this.f1219I = new C0859F0(this);
        this.f1226P = new RunnableC0019E(10, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0550a.f1635t;
        C0234d c0234dM638s = C0234d.m638s(context2, attributeSet, iArr, C1031R.attr.toolbarStyle, 0);
        AbstractC0080Q.m290i(this, context, iArr, attributeSet, (TypedArray) c0234dM638s.f475c, C1031R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        this.f1238l = typedArray.getResourceId(28, 0);
        this.f1239m = typedArray.getResourceId(19, 0);
        this.f1249w = typedArray.getInteger(0, 8388627);
        this.f1240n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1245s = dimensionPixelOffset;
        this.f1244r = dimensionPixelOffset;
        this.f1243q = dimensionPixelOffset;
        this.f1242p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1242p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1243q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1244r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1245s = dimensionPixelOffset5;
        }
        this.f1241o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1142d();
        C0937x0 c0937x0 = this.f1246t;
        c0937x0.f3328h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0937x0.f3325e = dimensionPixelSize;
            c0937x0.f3321a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0937x0.f3326f = dimensionPixelSize2;
            c0937x0.f3322b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0937x0.m2272a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1247u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1248v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1232f = c0234dM638s.m646i(4);
        this.f1233g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1236j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM646i = c0234dM638s.m646i(16);
        if (drawableM646i != null) {
            setNavigationIcon(drawableM646i);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM646i2 = c0234dM638s.m646i(11);
        if (drawableM646i2 != null) {
            setLogo(drawableM646i2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0234dM638s.m645h(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0234dM638s.m645h(20));
        }
        if (typedArray.hasValue(14)) {
            mo1146l(typedArray.getResourceId(14, 0));
        }
        c0234dM638s.m657u();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0867J0 c0867j0 = new C0867J0(context, attributeSet);
        c0867j0.f3111a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0550a.f1617b);
        c0867j0.f3111a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c0867j0.f3112b = 0;
        return c0867j0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1141c();
        }
        C0934w c0934w = this.f1234h;
        if (c0934w != null) {
            c0934w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1141c();
            this.f1234h.setImageDrawable(drawable);
        } else {
            C0934w c0934w = this.f1234h;
            if (c0934w != null) {
                c0934w.setImageDrawable(this.f1232f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1231e == null) {
                this.f1231e = new C0936x(getContext(), 0);
            }
            if (!m1148n(this.f1231e)) {
                m1140b(this.f1231e, true);
            }
        } else {
            C0936x c0936x = this.f1231e;
            if (c0936x != null && m1148n(c0936x)) {
                removeView(this.f1231e);
                this.f1215E.remove(this.f1231e);
            }
        }
        C0936x c0936x2 = this.f1231e;
        if (c0936x2 != null) {
            c0936x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1231e == null) {
            this.f1231e = new C0936x(getContext(), 0);
        }
        C0936x c0936x = this.f1231e;
        if (c0936x != null) {
            c0936x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1144f();
        }
        C0934w c0934w = this.f1230d;
        if (c0934w != null) {
            c0934w.setContentDescription(charSequence);
            AbstractC0875N0.m2199a(this.f1230d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1144f();
            if (!m1148n(this.f1230d)) {
                m1140b(this.f1230d, true);
            }
        } else {
            C0934w c0934w = this.f1230d;
            if (c0934w != null && m1148n(c0934w)) {
                removeView(this.f1230d);
                this.f1215E.remove(this.f1230d);
            }
        }
        C0934w c0934w2 = this.f1230d;
        if (c0934w2 != null) {
            c0934w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0868K c0868k = this.f1229c;
            if (c0868k != null && m1148n(c0868k)) {
                removeView(this.f1229c);
                this.f1215E.remove(this.f1229c);
            }
        } else {
            if (this.f1229c == null) {
                Context context = getContext();
                C0868K c0868k2 = new C0868K(context, null);
                this.f1229c = c0868k2;
                c0868k2.setSingleLine();
                this.f1229c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1239m;
                if (i2 != 0) {
                    this.f1229c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1211A;
                if (colorStateList != null) {
                    this.f1229c.setTextColor(colorStateList);
                }
            }
            if (!m1148n(this.f1229c)) {
                m1140b(this.f1229c, true);
            }
        }
        C0868K c0868k3 = this.f1229c;
        if (c0868k3 != null) {
            c0868k3.setText(charSequence);
        }
        this.f1251y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1211A = colorStateList;
        C0868K c0868k = this.f1229c;
        if (c0868k != null) {
            c0868k.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0868K c0868k = this.f1228b;
            if (c0868k != null && m1148n(c0868k)) {
                removeView(this.f1228b);
                this.f1215E.remove(this.f1228b);
            }
        } else {
            if (this.f1228b == null) {
                Context context = getContext();
                C0868K c0868k2 = new C0868K(context, null);
                this.f1228b = c0868k2;
                c0868k2.setSingleLine();
                this.f1228b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1238l;
                if (i2 != 0) {
                    this.f1228b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1252z;
                if (colorStateList != null) {
                    this.f1228b.setTextColor(colorStateList);
                }
            }
            if (!m1148n(this.f1228b)) {
                m1140b(this.f1228b, true);
            }
        }
        C0868K c0868k3 = this.f1228b;
        if (c0868k3 != null) {
            c0868k3.setText(charSequence);
        }
        this.f1250x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1252z = colorStateList;
        C0868K c0868k = this.f1228b;
        if (c0868k != null) {
            c0868k.setTextColor(colorStateList);
        }
    }
}
