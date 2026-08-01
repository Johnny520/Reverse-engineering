package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import androidx.activity.RunnableC0371b;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p004C.C0064h;
import p004C.C0066j;
import p006D.RunnableC0073b;
import p014H.C0142a;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p061e.ViewOnClickListenerC0525a;
import p066g.C0569i;
import p068h.C0596o;
import p068h.MenuC0594m;
import p069i.AbstractC0718t1;
import p069i.C0639P0;
import p069i.C0669d0;
import p069i.C0682h1;
import p069i.C0685i1;
import p069i.C0689k;
import p069i.C0691k1;
import p069i.C0697m1;
import p069i.C0725x;
import p069i.C0729z;
import p069i.InterfaceC0688j1;
import p069i.InterfaceC0702o0;
import p069i.ViewOnClickListenerC0694l1;
import p099y.AbstractC1048L;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1069A;

    /* JADX INFO: renamed from: B */
    public ColorStateList f1070B;

    /* JADX INFO: renamed from: C */
    public boolean f1071C;

    /* JADX INFO: renamed from: D */
    public boolean f1072D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f1073E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f1074F;

    /* JADX INFO: renamed from: G */
    public final int[] f1075G;

    /* JADX INFO: renamed from: H */
    public final C0142a f1076H;

    /* JADX INFO: renamed from: I */
    public ArrayList f1077I;

    /* JADX INFO: renamed from: J */
    public final C0066j f1078J;

    /* JADX INFO: renamed from: K */
    public C0697m1 f1079K;

    /* JADX INFO: renamed from: L */
    public C0689k f1080L;

    /* JADX INFO: renamed from: M */
    public C0682h1 f1081M;

    /* JADX INFO: renamed from: N */
    public boolean f1082N;

    /* JADX INFO: renamed from: O */
    public final RunnableC0073b f1083O;

    /* JADX INFO: renamed from: b */
    public ActionMenuView f1084b;

    /* JADX INFO: renamed from: c */
    public C0669d0 f1085c;

    /* JADX INFO: renamed from: d */
    public C0669d0 f1086d;

    /* JADX INFO: renamed from: e */
    public C0725x f1087e;

    /* JADX INFO: renamed from: f */
    public C0729z f1088f;

    /* JADX INFO: renamed from: g */
    public final Drawable f1089g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f1090h;

    /* JADX INFO: renamed from: i */
    public C0725x f1091i;

    /* JADX INFO: renamed from: j */
    public View f1092j;

    /* JADX INFO: renamed from: k */
    public Context f1093k;

    /* JADX INFO: renamed from: l */
    public int f1094l;

    /* JADX INFO: renamed from: m */
    public int f1095m;

    /* JADX INFO: renamed from: n */
    public int f1096n;

    /* JADX INFO: renamed from: o */
    public final int f1097o;

    /* JADX INFO: renamed from: p */
    public final int f1098p;

    /* JADX INFO: renamed from: q */
    public int f1099q;

    /* JADX INFO: renamed from: r */
    public int f1100r;

    /* JADX INFO: renamed from: s */
    public int f1101s;

    /* JADX INFO: renamed from: t */
    public int f1102t;

    /* JADX INFO: renamed from: u */
    public C0639P0 f1103u;

    /* JADX INFO: renamed from: v */
    public int f1104v;

    /* JADX INFO: renamed from: w */
    public int f1105w;

    /* JADX INFO: renamed from: x */
    public final int f1106x;

    /* JADX INFO: renamed from: y */
    public CharSequence f1107y;

    /* JADX INFO: renamed from: z */
    public CharSequence f1108z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1106x = 8388627;
        this.f1073E = new ArrayList();
        this.f1074F = new ArrayList();
        this.f1075G = new int[2];
        this.f1076H = new C0142a(new RunnableC0371b(4, this));
        this.f1077I = new ArrayList();
        this.f1078J = new C0066j(19, this);
        this.f1083O = new RunnableC0073b(5, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0515a.f1660x;
        C0064h c0064hM114t = C0064h.m114t(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC1048L.m2289h(this, context, iArr, attributeSet, (TypedArray) c0064hM114t.f309c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        this.f1095m = typedArray.getResourceId(28, 0);
        this.f1096n = typedArray.getResourceId(19, 0);
        this.f1106x = typedArray.getInteger(0, 8388627);
        this.f1097o = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1102t = dimensionPixelOffset;
        this.f1101s = dimensionPixelOffset;
        this.f1100r = dimensionPixelOffset;
        this.f1099q = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1099q = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1100r = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1101s = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1102t = dimensionPixelOffset5;
        }
        this.f1098p = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m702d();
        C0639P0 c0639p0 = this.f1103u;
        c0639p0.f2193h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0639p0.f2190e = dimensionPixelSize;
            c0639p0.f2186a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0639p0.f2191f = dimensionPixelSize2;
            c0639p0.f2187b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0639p0.m1258a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1104v = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1105w = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1089g = c0064hM114t.m123m(4);
        this.f1090h = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1093k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM123m = c0064hM114t.m123m(16);
        if (drawableM123m != null) {
            setNavigationIcon(drawableM123m);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM123m2 = c0064hM114t.m123m(11);
        if (drawableM123m2 != null) {
            setLogo(drawableM123m2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0064hM114t.m122l(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0064hM114t.m122l(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0064hM114t.m130v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private MenuInflater getMenuInflater() {
        return new C0569i(getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C0685i1 m695h() {
        C0685i1 c0685i1 = new C0685i1(-2, -2);
        c0685i1.f2300b = 0;
        c0685i1.f2299a = 8388627;
        return c0685i1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C0685i1 m696i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof C0685i1;
        if (z2) {
            C0685i1 c0685i1 = (C0685i1) layoutParams;
            C0685i1 c0685i12 = new C0685i1(c0685i1);
            c0685i12.f2300b = 0;
            c0685i12.f2300b = c0685i1.f2300b;
            return c0685i12;
        }
        if (z2) {
            C0685i1 c0685i13 = new C0685i1((C0685i1) layoutParams);
            c0685i13.f2300b = 0;
            return c0685i13;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C0685i1 c0685i14 = new C0685i1(layoutParams);
            c0685i14.f2300b = 0;
            return c0685i14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C0685i1 c0685i15 = new C0685i1(marginLayoutParams);
        c0685i15.f2300b = 0;
        ((ViewGroup.MarginLayoutParams) c0685i15).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c0685i15).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c0685i15).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c0685i15).bottomMargin = marginLayoutParams.bottomMargin;
        return c0685i15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m697k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static int m698l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m699a(ArrayList arrayList, int i2) {
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0685i1 c0685i1 = (C0685i1) childAt.getLayoutParams();
                if (c0685i1.f2300b == 0 && m713s(childAt)) {
                    int i4 = c0685i1.f2299a;
                    WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
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
            C0685i1 c0685i12 = (C0685i1) childAt2.getLayoutParams();
            if (c0685i12.f2300b == 0 && m713s(childAt2)) {
                int i6 = c0685i12.f2299a;
                WeakHashMap weakHashMap3 = AbstractC1048L.f3662a;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m700b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0685i1 c0685i1M695h = layoutParams == null ? m695h() : !checkLayoutParams(layoutParams) ? m696i(layoutParams) : (C0685i1) layoutParams;
        c0685i1M695h.f2300b = 1;
        if (!z2 || this.f1092j == null) {
            addView(view, c0685i1M695h);
        } else {
            view.setLayoutParams(c0685i1M695h);
            this.f1074F.add(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m701c() {
        if (this.f1091i == null) {
            C0725x c0725x = new C0725x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1091i = c0725x;
            c0725x.setImageDrawable(this.f1089g);
            this.f1091i.setContentDescription(this.f1090h);
            C0685i1 c0685i1M695h = m695h();
            c0685i1M695h.f2299a = (this.f1097o & 112) | 8388611;
            c0685i1M695h.f2300b = 2;
            this.f1091i.setLayoutParams(c0685i1M695h);
            this.f1091i.setOnClickListener(new ViewOnClickListenerC0525a(2, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0685i1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m702d() {
        if (this.f1103u == null) {
            C0639P0 c0639p0 = new C0639P0();
            c0639p0.f2186a = 0;
            c0639p0.f2187b = 0;
            c0639p0.f2188c = Integer.MIN_VALUE;
            c0639p0.f2189d = Integer.MIN_VALUE;
            c0639p0.f2190e = 0;
            c0639p0.f2191f = 0;
            c0639p0.f2192g = false;
            c0639p0.f2193h = false;
            this.f1103u = c0639p0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m703e() {
        m704f();
        ActionMenuView actionMenuView = this.f1084b;
        if (actionMenuView.f1002q == null) {
            MenuC0594m menuC0594m = (MenuC0594m) actionMenuView.getMenu();
            if (this.f1081M == null) {
                this.f1081M = new C0682h1(this);
            }
            this.f1084b.setExpandedActionViewsExclusive(true);
            menuC0594m.m1183b(this.f1081M, this.f1093k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m704f() {
        if (this.f1084b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1084b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1094l);
            this.f1084b.setOnMenuItemClickListener(this.f1078J);
            this.f1084b.getClass();
            C0685i1 c0685i1M695h = m695h();
            c0685i1M695h.f2299a = (this.f1097o & 112) | 8388613;
            this.f1084b.setLayoutParams(c0685i1M695h);
            m700b(this.f1084b, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m705g() {
        if (this.f1087e == null) {
            this.f1087e = new C0725x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0685i1 c0685i1M695h = m695h();
            c0685i1M695h.f2299a = (this.f1097o & 112) | 8388611;
            this.f1087e.setLayoutParams(c0685i1M695h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m695h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m696i(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getCollapseContentDescription() {
        C0725x c0725x = this.f1091i;
        if (c0725x != null) {
            return c0725x.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getCollapseIcon() {
        C0725x c0725x = this.f1091i;
        if (c0725x != null) {
            return c0725x.getDrawable();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetEnd() {
        C0639P0 c0639p0 = this.f1103u;
        if (c0639p0 != null) {
            return c0639p0.f2192g ? c0639p0.f2186a : c0639p0.f2187b;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetEndWithActions() {
        int i2 = this.f1105w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetLeft() {
        C0639P0 c0639p0 = this.f1103u;
        if (c0639p0 != null) {
            return c0639p0.f2186a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetRight() {
        C0639P0 c0639p0 = this.f1103u;
        if (c0639p0 != null) {
            return c0639p0.f2187b;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetStart() {
        C0639P0 c0639p0 = this.f1103u;
        if (c0639p0 != null) {
            return c0639p0.f2192g ? c0639p0.f2187b : c0639p0.f2186a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1104v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetEnd() {
        MenuC0594m menuC0594m;
        ActionMenuView actionMenuView = this.f1084b;
        return (actionMenuView == null || (menuC0594m = actionMenuView.f1002q) == null || !menuC0594m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1105w, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1104v, 0)) : getContentInsetStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getLogo() {
        C0729z c0729z = this.f1088f;
        if (c0729z != null) {
            return c0729z.getDrawable();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getLogoDescription() {
        C0729z c0729z = this.f1088f;
        if (c0729z != null) {
            return c0729z.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Menu getMenu() {
        m703e();
        return this.f1084b.getMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View getNavButtonView() {
        return this.f1087e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getNavigationContentDescription() {
        C0725x c0725x = this.f1087e;
        if (c0725x != null) {
            return c0725x.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getNavigationIcon() {
        C0725x c0725x = this.f1087e;
        if (c0725x != null) {
            return c0725x.getDrawable();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0689k getOuterActionMenuPresenter() {
        return this.f1080L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getOverflowIcon() {
        m703e();
        return this.f1084b.getOverflowIcon();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Context getPopupContext() {
        return this.f1093k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getPopupTheme() {
        return this.f1094l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getSubtitle() {
        return this.f1108z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TextView getSubtitleTextView() {
        return this.f1086d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getTitle() {
        return this.f1107y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginBottom() {
        return this.f1102t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginEnd() {
        return this.f1100r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginStart() {
        return this.f1099q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginTop() {
        return this.f1101s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TextView getTitleTextView() {
        return this.f1085c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0702o0 getWrapper() {
        Drawable drawable;
        if (this.f1079K == null) {
            C0697m1 c0697m1 = new C0697m1();
            c0697m1.f2364n = 0;
            c0697m1.f2351a = this;
            c0697m1.f2358h = getTitle();
            c0697m1.f2359i = getSubtitle();
            c0697m1.f2357g = c0697m1.f2358h != null;
            c0697m1.f2356f = getNavigationIcon();
            C0064h c0064hM114t = C0064h.m114t(getContext(), null, AbstractC0515a.f1637a, R.attr.actionBarStyle);
            c0697m1.f2365o = c0064hM114t.m123m(15);
            TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c0697m1.f2357g = true;
                c0697m1.f2358h = text;
                if ((c0697m1.f2352b & 8) != 0) {
                    Toolbar toolbar = c0697m1.f2351a;
                    toolbar.setTitle(text);
                    if (c0697m1.f2357g) {
                        AbstractC1048L.m2291j(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c0697m1.f2359i = text2;
                if ((c0697m1.f2352b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM123m = c0064hM114t.m123m(20);
            if (drawableM123m != null) {
                c0697m1.f2355e = drawableM123m;
                c0697m1.m1325c();
            }
            Drawable drawableM123m2 = c0064hM114t.m123m(17);
            if (drawableM123m2 != null) {
                c0697m1.f2354d = drawableM123m2;
                c0697m1.m1325c();
            }
            if (c0697m1.f2356f == null && (drawable = c0697m1.f2365o) != null) {
                c0697m1.f2356f = drawable;
                int i2 = c0697m1.f2352b & 4;
                Toolbar toolbar2 = c0697m1.f2351a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c0697m1.m1323a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c0697m1.f2353c;
                if (view != null && (c0697m1.f2352b & 16) != 0) {
                    removeView(view);
                }
                c0697m1.f2353c = viewInflate;
                if (viewInflate != null && (c0697m1.f2352b & 16) != 0) {
                    addView(viewInflate);
                }
                c0697m1.m1323a(c0697m1.f2352b | 16);
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
                m702d();
                this.f1103u.m1258a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1095m = resourceId2;
                C0669d0 c0669d0 = this.f1085c;
                if (c0669d0 != null) {
                    c0669d0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1096n = resourceId3;
                C0669d0 c0669d02 = this.f1086d;
                if (c0669d02 != null) {
                    c0669d02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0064hM114t.m130v();
            if (R.string.abc_action_bar_up_description != c0697m1.f2364n) {
                c0697m1.f2364n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = c0697m1.f2364n;
                    c0697m1.f2360j = i3 != 0 ? getContext().getString(i3) : null;
                    c0697m1.m1324b();
                }
            }
            c0697m1.f2360j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0694l1(c0697m1));
            this.f1079K = c0697m1;
        }
        return this.f1079K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m706j(View view, int i2) {
        C0685i1 c0685i1 = (C0685i1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = c0685i1.f2299a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1106x & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0685i1).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c0685i1).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c0685i1).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m707m() {
        Iterator it = this.f1077I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        C0142a c0142a = this.f1076H;
        Iterator it2 = ((CopyOnWriteArrayList) c0142a.f444c).iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1077I = currentMenuItems2;
        Iterator it3 = ((CopyOnWriteArrayList) c0142a.f444c).iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m708n(View view) {
        return view.getParent() == this || this.f1074F.contains(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m709o(View view, int i2, int i3, int[] iArr) {
        C0685i1 c0685i1 = (C0685i1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0685i1).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iM706j = m706j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM706j, iMax + measuredWidth, view.getMeasuredHeight() + iM706j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0685i1).rightMargin + iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1083O);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1072D = false;
        }
        if (!this.f1072D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1072D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1072D = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295 A[LOOP:0: B:104:0x0293->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ad A[LOOP:1: B:107:0x02ab->B:108:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd A[LOOP:2: B:110:0x02cb->B:111:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0321 A[LOOP:3: B:119:0x031f->B:120:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iM709o;
        int iM710p;
        boolean zM713s;
        boolean zM713s2;
        int i6;
        int measuredHeight;
        int i7;
        boolean z3;
        int paddingTop;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        int size;
        int iM709o2;
        int i12;
        int size2;
        int i13;
        int size3;
        int i14;
        int i15;
        int size4;
        int i16;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = width - paddingRight;
        int[] iArr = this.f1075G;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!m713s(this.f1087e)) {
            iM709o = paddingLeft;
        } else {
            if (z4) {
                iM710p = m710p(this.f1087e, i17, iMin, iArr);
                iM709o = paddingLeft;
                if (m713s(this.f1091i)) {
                    if (z4) {
                        iM710p = m710p(this.f1091i, iM710p, iMin, iArr);
                    } else {
                        iM709o = m709o(this.f1091i, iM709o, iMin, iArr);
                    }
                }
                if (m713s(this.f1084b)) {
                    if (z4) {
                        iM709o = m709o(this.f1084b, iM709o, iMin, iArr);
                    } else {
                        iM710p = m710p(this.f1084b, iM710p, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM709o);
                iArr[1] = Math.max(0, currentContentInsetRight - (i17 - iM710p));
                int iMax2 = Math.max(iM709o, currentContentInsetLeft);
                int iMin2 = Math.min(iM710p, i17 - currentContentInsetRight);
                if (m713s(this.f1092j)) {
                    if (z4) {
                        iMin2 = m710p(this.f1092j, iMin2, iMin, iArr);
                    } else {
                        iMax2 = m709o(this.f1092j, iMax2, iMin, iArr);
                    }
                }
                if (m713s(this.f1088f)) {
                    if (z4) {
                        iMin2 = m710p(this.f1088f, iMin2, iMin, iArr);
                    } else {
                        iMax2 = m709o(this.f1088f, iMax2, iMin, iArr);
                    }
                }
                zM713s = m713s(this.f1085c);
                zM713s2 = m713s(this.f1086d);
                if (zM713s) {
                    i6 = iMax2;
                    measuredHeight = 0;
                } else {
                    C0685i1 c0685i1 = (C0685i1) this.f1085c.getLayoutParams();
                    i6 = iMax2;
                    measuredHeight = this.f1085c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0685i1).topMargin + ((ViewGroup.MarginLayoutParams) c0685i1).bottomMargin;
                }
                if (!zM713s2) {
                    C0685i1 c0685i12 = (C0685i1) this.f1086d.getLayoutParams();
                    measuredHeight = this.f1086d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0685i12).topMargin + ((ViewGroup.MarginLayoutParams) c0685i12).bottomMargin + measuredHeight;
                }
                if (!zM713s || zM713s2) {
                    C0669d0 c0669d0 = !zM713s ? this.f1085c : this.f1086d;
                    C0669d0 c0669d02 = !zM713s2 ? this.f1086d : this.f1085c;
                    C0685i1 c0685i13 = (C0685i1) c0669d0.getLayoutParams();
                    C0685i1 c0685i14 = (C0685i1) c0669d02.getLayoutParams();
                    int i18 = measuredHeight;
                    boolean z5 = (zM713s && this.f1085c.getMeasuredWidth() > 0) || (zM713s2 && this.f1086d.getMeasuredWidth() > 0);
                    i7 = this.f1106x & 112;
                    z3 = z4;
                    if (i7 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0685i13).topMargin + this.f1101s;
                    } else if (i7 != 80) {
                        int iMax3 = (((height - paddingTop2) - paddingBottom) - i18) / 2;
                        int i19 = ((ViewGroup.MarginLayoutParams) c0685i13).topMargin + this.f1101s;
                        if (iMax3 < i19) {
                            iMax3 = i19;
                        } else {
                            int i20 = (((height - paddingBottom) - i18) - iMax3) - paddingTop2;
                            int i21 = ((ViewGroup.MarginLayoutParams) c0685i13).bottomMargin;
                            int i22 = this.f1102t;
                            if (i20 < i21 + i22) {
                                iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0685i14).bottomMargin + i22) - i20));
                            }
                        }
                        paddingTop = paddingTop2 + iMax3;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0685i14).bottomMargin) - this.f1102t) - i18;
                    }
                    if (z3) {
                        int i23 = (z5 ? this.f1099q : 0) - iArr[1];
                        iMin2 -= Math.max(0, i23);
                        iArr[1] = Math.max(0, -i23);
                        if (zM713s) {
                            C0685i1 c0685i15 = (C0685i1) this.f1085c.getLayoutParams();
                            int measuredWidth = iMin2 - this.f1085c.getMeasuredWidth();
                            int measuredHeight2 = this.f1085c.getMeasuredHeight() + paddingTop;
                            this.f1085c.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i10 = measuredWidth - this.f1100r;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0685i15).bottomMargin;
                        } else {
                            i10 = iMin2;
                        }
                        if (zM713s2) {
                            int i24 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0685i1) this.f1086d.getLayoutParams())).topMargin;
                            this.f1086d.layout(iMin2 - this.f1086d.getMeasuredWidth(), i24, iMin2, this.f1086d.getMeasuredHeight() + i24);
                            i11 = iMin2 - this.f1100r;
                        } else {
                            i11 = iMin2;
                        }
                        if (z5) {
                            iMin2 = Math.min(i10, i11);
                        }
                        iMax = i6;
                    } else {
                        int i25 = (z5 ? this.f1099q : 0) - iArr[0];
                        int iMax4 = Math.max(0, i25) + i6;
                        iArr[0] = Math.max(0, -i25);
                        if (zM713s) {
                            C0685i1 c0685i16 = (C0685i1) this.f1085c.getLayoutParams();
                            int measuredWidth2 = this.f1085c.getMeasuredWidth() + iMax4;
                            int measuredHeight3 = this.f1085c.getMeasuredHeight() + paddingTop;
                            this.f1085c.layout(iMax4, paddingTop, measuredWidth2, measuredHeight3);
                            i8 = measuredWidth2 + this.f1100r;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0685i16).bottomMargin;
                        } else {
                            i8 = iMax4;
                        }
                        if (zM713s2) {
                            int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0685i1) this.f1086d.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f1086d.getMeasuredWidth() + iMax4;
                            this.f1086d.layout(iMax4, i26, measuredWidth3, this.f1086d.getMeasuredHeight() + i26);
                            i9 = measuredWidth3 + this.f1100r;
                        } else {
                            i9 = iMax4;
                        }
                        iMax = z5 ? Math.max(i8, i9) : iMax4;
                    }
                } else {
                    iMax = i6;
                }
                ArrayList arrayList = this.f1073E;
                m699a(arrayList, 3);
                size = arrayList.size();
                iM709o2 = iMax;
                for (i12 = 0; i12 < size; i12++) {
                    iM709o2 = m709o((View) arrayList.get(i12), iM709o2, iMin, iArr);
                }
                m699a(arrayList, 5);
                size2 = arrayList.size();
                for (i13 = 0; i13 < size2; i13++) {
                    iMin2 = m710p((View) arrayList.get(i13), iMin2, iMin, iArr);
                }
                m699a(arrayList, 1);
                int i27 = iArr[0];
                int i28 = iArr[1];
                size3 = arrayList.size();
                int i29 = i27;
                i14 = 0;
                int measuredWidth4 = 0;
                while (i14 < size3) {
                    View view = (View) arrayList.get(i14);
                    C0685i1 c0685i17 = (C0685i1) view.getLayoutParams();
                    int i30 = i28;
                    int i31 = ((ViewGroup.MarginLayoutParams) c0685i17).leftMargin - i29;
                    int i32 = ((ViewGroup.MarginLayoutParams) c0685i17).rightMargin - i30;
                    int iMax5 = Math.max(0, i31);
                    int iMax6 = Math.max(0, i32);
                    int iMax7 = Math.max(0, -i31);
                    int iMax8 = Math.max(0, -i32);
                    measuredWidth4 += view.getMeasuredWidth() + iMax5 + iMax6;
                    i14++;
                    i29 = iMax7;
                    i28 = iMax8;
                }
                i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i33 = measuredWidth4 + i15;
                if (i15 >= iM709o2) {
                    iM709o2 = i33 > iMin2 ? i15 - (i33 - iMin2) : i15;
                }
                size4 = arrayList.size();
                for (i16 = 0; i16 < size4; i16++) {
                    iM709o2 = m709o((View) arrayList.get(i16), iM709o2, iMin, iArr);
                }
                arrayList.clear();
            }
            iM709o = m709o(this.f1087e, paddingLeft, iMin, iArr);
        }
        iM710p = i17;
        if (m713s(this.f1091i)) {
        }
        if (m713s(this.f1084b)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM709o);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i17 - iM710p));
        int iMax22 = Math.max(iM709o, currentContentInsetLeft2);
        int iMin22 = Math.min(iM710p, i17 - currentContentInsetRight2);
        if (m713s(this.f1092j)) {
        }
        if (m713s(this.f1088f)) {
        }
        zM713s = m713s(this.f1085c);
        zM713s2 = m713s(this.f1086d);
        if (zM713s) {
        }
        if (!zM713s2) {
        }
        if (zM713s) {
            if (!zM713s) {
            }
            if (!zM713s2) {
            }
            C0685i1 c0685i132 = (C0685i1) c0669d0.getLayoutParams();
            C0685i1 c0685i142 = (C0685i1) c0669d02.getLayoutParams();
            int i182 = measuredHeight;
            if (zM713s) {
                i7 = this.f1106x & 112;
                z3 = z4;
                if (i7 == 48) {
                }
                if (z3) {
                }
            } else {
                i7 = this.f1106x & 112;
                z3 = z4;
                if (i7 == 48) {
                }
                if (z3) {
                }
            }
        }
        ArrayList arrayList2 = this.f1073E;
        m699a(arrayList2, 3);
        size = arrayList2.size();
        iM709o2 = iMax;
        while (i12 < size) {
        }
        m699a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i13 < size2) {
        }
        m699a(arrayList2, 1);
        int i272 = iArr[0];
        int i282 = iArr[1];
        size3 = arrayList2.size();
        int i292 = i272;
        i14 = 0;
        int measuredWidth42 = 0;
        while (i14 < size3) {
        }
        i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i332 = measuredWidth42 + i15;
        if (i15 >= iM709o2) {
        }
        size4 = arrayList2.size();
        while (i16 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iM697k;
        int iMax;
        int iCombineMeasuredStates;
        int iM697k2;
        int iM698l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zM1366a = AbstractC0718t1.m1366a(this);
        int i4 = !zM1366a ? 1 : 0;
        int i5 = 0;
        if (m713s(this.f1087e)) {
            m712r(this.f1087e, i2, 0, i3, this.f1098p);
            iM697k = m697k(this.f1087e) + this.f1087e.getMeasuredWidth();
            iMax = Math.max(0, m698l(this.f1087e) + this.f1087e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1087e.getMeasuredState());
        } else {
            iM697k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m713s(this.f1091i)) {
            m712r(this.f1091i, i2, 0, i3, this.f1098p);
            iM697k = m697k(this.f1091i) + this.f1091i.getMeasuredWidth();
            iMax = Math.max(iMax, m698l(this.f1091i) + this.f1091i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1091i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM697k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM697k);
        int[] iArr = this.f1075G;
        iArr[zM1366a ? 1 : 0] = iMax4;
        if (m713s(this.f1084b)) {
            m712r(this.f1084b, i2, iMax3, i3, this.f1098p);
            iM697k2 = m697k(this.f1084b) + this.f1084b.getMeasuredWidth();
            iMax = Math.max(iMax, m698l(this.f1084b) + this.f1084b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1084b.getMeasuredState());
        } else {
            iM697k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM697k2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - iM697k2);
        if (m713s(this.f1092j)) {
            iMax5 += m711q(this.f1092j, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m698l(this.f1092j) + this.f1092j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1092j.getMeasuredState());
        }
        if (m713s(this.f1088f)) {
            iMax5 += m711q(this.f1088f, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, m698l(this.f1088f) + this.f1088f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1088f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((C0685i1) childAt.getLayoutParams()).f2300b == 0 && m713s(childAt)) {
                iMax5 += m711q(childAt, i2, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, m698l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i7 = iMax5;
        int i8 = this.f1101s + this.f1102t;
        int i9 = this.f1099q + this.f1100r;
        if (m713s(this.f1085c)) {
            m711q(this.f1085c, i2, i7 + i9, i3, i8, iArr);
            int iM697k3 = m697k(this.f1085c) + this.f1085c.getMeasuredWidth();
            iM698l = m698l(this.f1085c) + this.f1085c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1085c.getMeasuredState());
            iMax2 = iM697k3;
        } else {
            iM698l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m713s(this.f1086d)) {
            iMax2 = Math.max(iMax2, m711q(this.f1086d, i2, i7 + i9, i3, i8 + iM698l, iArr));
            iM698l += m698l(this.f1086d) + this.f1086d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1086d.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM698l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i7 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f1082N) {
            i5 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (m713s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i5 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0691k1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0691k1 c0691k1 = (C0691k1) parcelable;
        super.onRestoreInstanceState(c0691k1.f407a);
        ActionMenuView actionMenuView = this.f1084b;
        MenuC0594m menuC0594m = actionMenuView != null ? actionMenuView.f1002q : null;
        int i2 = c0691k1.f2338c;
        if (i2 != 0 && this.f1081M != null && menuC0594m != null && (menuItemFindItem = menuC0594m.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0691k1.f2339d) {
            RunnableC0073b runnableC0073b = this.f1083O;
            removeCallbacks(runnableC0073b);
            post(runnableC0073b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        m702d();
        C0639P0 c0639p0 = this.f1103u;
        boolean z2 = i2 == 1;
        if (z2 == c0639p0.f2192g) {
            return;
        }
        c0639p0.f2192g = z2;
        if (!c0639p0.f2193h) {
            c0639p0.f2186a = c0639p0.f2190e;
            c0639p0.f2187b = c0639p0.f2191f;
            return;
        }
        if (z2) {
            int i3 = c0639p0.f2189d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0639p0.f2190e;
            }
            c0639p0.f2186a = i3;
            int i4 = c0639p0.f2188c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0639p0.f2191f;
            }
            c0639p0.f2187b = i4;
            return;
        }
        int i5 = c0639p0.f2188c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0639p0.f2190e;
        }
        c0639p0.f2186a = i5;
        int i6 = c0639p0.f2189d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c0639p0.f2191f;
        }
        c0639p0.f2187b = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0689k c0689k;
        C0596o c0596o;
        C0691k1 c0691k1 = new C0691k1(super.onSaveInstanceState());
        C0682h1 c0682h1 = this.f1081M;
        if (c0682h1 != null && (c0596o = c0682h1.f2295c) != null) {
            c0691k1.f2338c = c0596o.f2060a;
        }
        ActionMenuView actionMenuView = this.f1084b;
        c0691k1.f2339d = (actionMenuView == null || (c0689k = actionMenuView.f1006u) == null || !c0689k.m1310h()) ? false : true;
        return c0691k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1071C = false;
        }
        if (!this.f1071C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1071C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1071C = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m710p(View view, int i2, int i3, int[] iArr) {
        C0685i1 c0685i1 = (C0685i1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c0685i1).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iM706j = m706j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM706j, iMax, view.getMeasuredHeight() + iM706j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0685i1).leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final int m711q(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m712r(View view, int i2, int i3, int i4, int i5) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m713s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0503h.m992y(getContext(), i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapsible(boolean z2) {
        this.f1082N = z2;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1105w) {
            this.f1105w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1104v) {
            this.f1104v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(int i2) {
        setLogo(AbstractC0503h.m992y(getContext(), i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0503h.m992y(getContext(), i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m705g();
        this.f1087e.setOnClickListener(onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverflowIcon(Drawable drawable) {
        m703e();
        this.f1084b.setOverflowIcon(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPopupTheme(int i2) {
        if (this.f1094l != i2) {
            this.f1094l = i2;
            if (i2 == 0) {
                this.f1093k = getContext();
            } else {
                this.f1093k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginBottom(int i2) {
        this.f1102t = i2;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginEnd(int i2) {
        this.f1100r = i2;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginStart(int i2) {
        this.f1099q = i2;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginTop(int i2) {
        this.f1101s = i2;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0685i1 c0685i1 = new C0685i1(context, attributeSet);
        c0685i1.f2299a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1638b);
        c0685i1.f2299a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c0685i1.f2300b = 0;
        return c0685i1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m701c();
        }
        C0725x c0725x = this.f1091i;
        if (c0725x != null) {
            c0725x.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m701c();
            this.f1091i.setImageDrawable(drawable);
        } else {
            C0725x c0725x = this.f1091i;
            if (c0725x != null) {
                c0725x.setImageDrawable(this.f1089g);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1088f == null) {
                this.f1088f = new C0729z(getContext(), null, 0);
            }
            if (!m708n(this.f1088f)) {
                m700b(this.f1088f, true);
            }
        } else {
            C0729z c0729z = this.f1088f;
            if (c0729z != null && m708n(c0729z)) {
                removeView(this.f1088f);
                this.f1074F.remove(this.f1088f);
            }
        }
        C0729z c0729z2 = this.f1088f;
        if (c0729z2 != null) {
            c0729z2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1088f == null) {
            this.f1088f = new C0729z(getContext(), null, 0);
        }
        C0729z c0729z = this.f1088f;
        if (c0729z != null) {
            c0729z.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m705g();
        }
        C0725x c0725x = this.f1087e;
        if (c0725x != null) {
            c0725x.setContentDescription(charSequence);
            AbstractC0503h.m976N(this.f1087e, charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m705g();
            if (!m708n(this.f1087e)) {
                m700b(this.f1087e, true);
            }
        } else {
            C0725x c0725x = this.f1087e;
            if (c0725x != null && m708n(c0725x)) {
                removeView(this.f1087e);
                this.f1074F.remove(this.f1087e);
            }
        }
        C0725x c0725x2 = this.f1087e;
        if (c0725x2 != null) {
            c0725x2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0669d0 c0669d0 = this.f1086d;
            if (c0669d0 != null && m708n(c0669d0)) {
                removeView(this.f1086d);
                this.f1074F.remove(this.f1086d);
            }
        } else {
            if (this.f1086d == null) {
                Context context = getContext();
                C0669d0 c0669d02 = new C0669d0(context, null);
                this.f1086d = c0669d02;
                c0669d02.setSingleLine();
                this.f1086d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1096n;
                if (i2 != 0) {
                    this.f1086d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1070B;
                if (colorStateList != null) {
                    this.f1086d.setTextColor(colorStateList);
                }
            }
            if (!m708n(this.f1086d)) {
                m700b(this.f1086d, true);
            }
        }
        C0669d0 c0669d03 = this.f1086d;
        if (c0669d03 != null) {
            c0669d03.setText(charSequence);
        }
        this.f1108z = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1070B = colorStateList;
        C0669d0 c0669d0 = this.f1086d;
        if (c0669d0 != null) {
            c0669d0.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0669d0 c0669d0 = this.f1085c;
            if (c0669d0 != null && m708n(c0669d0)) {
                removeView(this.f1085c);
                this.f1074F.remove(this.f1085c);
            }
        } else {
            if (this.f1085c == null) {
                Context context = getContext();
                C0669d0 c0669d02 = new C0669d0(context, null);
                this.f1085c = c0669d02;
                c0669d02.setSingleLine();
                this.f1085c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1095m;
                if (i2 != 0) {
                    this.f1085c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1069A;
                if (colorStateList != null) {
                    this.f1085c.setTextColor(colorStateList);
                }
            }
            if (!m708n(this.f1085c)) {
                m700b(this.f1085c, true);
            }
        }
        C0669d0 c0669d03 = this.f1085c;
        if (c0669d03 != null) {
            c0669d03.setText(charSequence);
        }
        this.f1107y = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1069A = colorStateList;
        C0669d0 c0669d0 = this.f1085c;
        if (c0669d0 != null) {
            c0669d0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC0688j1 interfaceC0688j1) {
    }
}
