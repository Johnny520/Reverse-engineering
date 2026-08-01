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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0912;
import androidx.appcompat.app.C0955;
import androidx.appcompat.app.RunnableC0909;
import androidx.appcompat.app.ViewOnClickListenerC0933;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3085;
import androidx.core.view.InterfaceC3086;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.C3158;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p204.AbstractC8602;
import p206.C8629;
import p206.MenuC8631;
import p208.C8646;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int[] f824;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C3085 f825;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f826;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f827;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final ArrayList f828;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final ArrayList f829;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ColorStateList f830;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ColorStateList f831;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int f832;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f833;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public CharSequence f834;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public CharSequence f835;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f836;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f837;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f838;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f839;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f840;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Context f841;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f842;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0996 f843;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f844;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f845;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f846;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f847;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0983 f848;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0973 f849;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C0973 f850;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public View f851;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Drawable f852;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final CharSequence f853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1072 f854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1072 f855;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ActionMenuView f856;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f857;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public OnBackInvokedDispatcher f858;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public OnBackInvokedCallback f859;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean f860;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public C0912 f861;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C0911 f862;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final RunnableC0909 f863;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC1003 f864;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public ArrayList f865;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C1044 f866;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C1006 f867;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C0985 f868;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C0993 f869;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1002();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public boolean f870;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public int f871;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f871 = parcel.readInt();
            this.f870 = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f871);
            parcel.writeInt(this.f870 ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, C0328R.attr.toolbarStyle);
        this.f832 = 8388627;
        this.f829 = new ArrayList();
        this.f828 = new ArrayList();
        this.f824 = new int[2];
        this.f825 = new C3085(new RunnableC0989(this, 1));
        this.f865 = new ArrayList();
        this.f868 = new C0985(this);
        this.f863 = new RunnableC0909(this, 3);
        Context context2 = getContext();
        int[] iArr = AbstractC8602.f21437;
        C0955 c0955M914 = C0955.m914(C0328R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        AbstractC3103.m4803(this, context, iArr, attributeSet, (TypedArray) c0955M914.f665, C0328R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        this.f839 = typedArray.getResourceId(28, 0);
        this.f838 = typedArray.getResourceId(19, 0);
        this.f832 = typedArray.getInteger(0, 8388627);
        this.f837 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f844 = dimensionPixelOffset;
        this.f845 = dimensionPixelOffset;
        this.f846 = dimensionPixelOffset;
        this.f847 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f847 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f846 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f845 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f844 = dimensionPixelOffset5;
        }
        this.f836 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m1055();
        C0996 c0996 = this.f843;
        c0996.f973 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0996.f968 = dimensionPixelSize;
            c0996.f972 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0996.f967 = dimensionPixelSize2;
            c0996.f971 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0996.m1163(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f842 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f833 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f852 = c0955M914.m950(4);
        this.f853 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f841 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM950 = c0955M914.m950(16);
        if (drawableM950 != null) {
            setNavigationIcon(drawableM950);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM9502 = c0955M914.m950(11);
        if (drawableM9502 != null) {
            setLogo(drawableM9502);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0955M914.m945(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0955M914.m945(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0955M914.m923();
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
        return new C8646(getContext());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C1007 m1049() {
        C1007 c1007 = new C1007(-2, -2);
        c1007.f991 = 0;
        c1007.f992 = 8388627;
        return c1007;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m1050(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m1051(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C1007 m1052(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C1007;
        if (z) {
            C1007 c1007 = (C1007) layoutParams;
            C1007 c10072 = new C1007(c1007);
            c10072.f991 = 0;
            c10072.f991 = c1007.f991;
            return c10072;
        }
        if (z) {
            C1007 c10073 = new C1007((C1007) layoutParams);
            c10073.f991 = 0;
            return c10073;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1007 c10074 = new C1007(layoutParams);
            c10074.f991 = 0;
            return c10074;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1007 c10075 = new C1007(marginLayoutParams);
        c10075.f991 = 0;
        ((ViewGroup.MarginLayoutParams) c10075).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c10075).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c10075).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c10075).bottomMargin = marginLayoutParams.bottomMargin;
        return c10075;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1007);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1049();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1007 c1007 = new C1007(context, attributeSet);
        c1007.f992 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21433);
        c1007.f992 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1007.f991 = 0;
        return c1007;
    }

    public CharSequence getCollapseContentDescription() {
        C0973 c0973 = this.f850;
        if (c0973 != null) {
            return c0973.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0973 c0973 = this.f850;
        if (c0973 != null) {
            return c0973.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0996 c0996 = this.f843;
        if (c0996 != null) {
            return c0996.f974 ? c0996.f972 : c0996.f971;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f833;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0996 c0996 = this.f843;
        if (c0996 != null) {
            return c0996.f972;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0996 c0996 = this.f843;
        if (c0996 != null) {
            return c0996.f971;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0996 c0996 = this.f843;
        if (c0996 != null) {
            return c0996.f974 ? c0996.f971 : c0996.f972;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f842;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC8631 menuC8631;
        ActionMenuView actionMenuView = this.f856;
        return (actionMenuView == null || (menuC8631 = actionMenuView.f806) == null || !menuC8631.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f833, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f842, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0983 c0983 = this.f848;
        if (c0983 != null) {
            return c0983.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0983 c0983 = this.f848;
        if (c0983 != null) {
            return c0983.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1054();
        return this.f856.getMenu();
    }

    public View getNavButtonView() {
        return this.f849;
    }

    public CharSequence getNavigationContentDescription() {
        C0973 c0973 = this.f849;
        if (c0973 != null) {
            return c0973.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0973 c0973 = this.f849;
        if (c0973 != null) {
            return c0973.getDrawable();
        }
        return null;
    }

    public C1044 getOuterActionMenuPresenter() {
        return this.f866;
    }

    public Drawable getOverflowIcon() {
        m1054();
        return this.f856.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f841;
    }

    public int getPopupTheme() {
        return this.f840;
    }

    public CharSequence getSubtitle() {
        return this.f834;
    }

    public final TextView getSubtitleTextView() {
        return this.f855;
    }

    public CharSequence getTitle() {
        return this.f835;
    }

    public int getTitleMarginBottom() {
        return this.f844;
    }

    public int getTitleMarginEnd() {
        return this.f846;
    }

    public int getTitleMarginStart() {
        return this.f847;
    }

    public int getTitleMarginTop() {
        return this.f845;
    }

    public final TextView getTitleTextView() {
        return this.f854;
    }

    public InterfaceC1067 getWrapper() {
        if (this.f869 == null) {
            this.f869 = new C0993(this, true);
        }
        return this.f869;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1062();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f863);
        m1062();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f826 = false;
        }
        if (!this.f826) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f826 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f826 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM1068;
        int iM1065;
        int iMax;
        boolean zM1059;
        boolean zM10592;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int iM10682;
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
        int[] iArr = this.f824;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m1059(this.f849)) {
            C0973 c0973 = this.f849;
            if (z3) {
                iM1065 = m1065(c0973, i15, iMin, iArr);
                iM1068 = paddingLeft;
                if (m1059(this.f850)) {
                    C0973 c09732 = this.f850;
                    if (z3) {
                        iM1065 = m1065(c09732, iM1065, iMin, iArr);
                    } else {
                        iM1068 = m1068(c09732, iM1068, iMin, iArr);
                    }
                }
                if (m1059(this.f856)) {
                    ActionMenuView actionMenuView = this.f856;
                    if (z3) {
                        iM1068 = m1068(actionMenuView, iM1068, iMin, iArr);
                    } else {
                        iM1065 = m1065(actionMenuView, iM1065, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM1068);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iM1065));
                iMax = Math.max(iM1068, currentContentInsetLeft);
                int iMin2 = Math.min(iM1065, i15 - currentContentInsetRight);
                if (m1059(this.f851)) {
                    View view = this.f851;
                    if (z3) {
                        iMin2 = m1065(view, iMin2, iMin, iArr);
                    } else {
                        iMax = m1068(view, iMax, iMin, iArr);
                    }
                }
                if (m1059(this.f848)) {
                    C0983 c0983 = this.f848;
                    if (z3) {
                        iMin2 = m1065(c0983, iMin2, iMin, iArr);
                    } else {
                        iMax = m1068(c0983, iMax, iMin, iArr);
                    }
                }
                zM1059 = m1059(this.f854);
                zM10592 = m1059(this.f855);
                if (zM1059) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    C1007 c1007 = (C1007) this.f854.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.f854.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1007).topMargin + ((ViewGroup.MarginLayoutParams) c1007).bottomMargin;
                }
                if (!zM10592) {
                    C1007 c10072 = (C1007) this.f855.getLayoutParams();
                    measuredHeight = this.f855.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10072).topMargin + ((ViewGroup.MarginLayoutParams) c10072).bottomMargin + measuredHeight;
                }
                if (!zM1059 || zM10592) {
                    C1072 c1072 = !zM1059 ? this.f854 : this.f855;
                    C1072 c10722 = !zM10592 ? this.f855 : this.f854;
                    C1007 c10073 = (C1007) c1072.getLayoutParams();
                    C1007 c10074 = (C1007) c10722.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z4 = (zM1059 && this.f854.getMeasuredWidth() > 0) || (zM10592 && this.f855.getMeasuredWidth() > 0);
                    i5 = this.f832 & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c10073).topMargin + this.f845;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) c10073).topMargin + this.f845;
                        if (iMax2 < i18) {
                            iMax2 = i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) c10073).bottomMargin;
                            int i21 = this.f844;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c10074).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c10074).bottomMargin) - this.f844) - i16;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.f847 : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zM1059) {
                            C1007 c10075 = (C1007) this.f854.getLayoutParams();
                            int measuredWidth = iMin2 - this.f854.getMeasuredWidth();
                            int measuredHeight2 = this.f854.getMeasuredHeight() + paddingTop;
                            this.f854.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.f846;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c10075).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zM10592) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1007) this.f855.getLayoutParams())).topMargin;
                            this.f855.layout(iMin2 - this.f855.getMeasuredWidth(), i23, iMin2, this.f855.getMeasuredHeight() + i23);
                            i9 = iMin2 - this.f846;
                        } else {
                            i9 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i24 = (z4 ? this.f847 : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i17;
                        iArr[0] = Math.max(0, -i24);
                        if (zM1059) {
                            C1007 c10076 = (C1007) this.f854.getLayoutParams();
                            int measuredWidth2 = this.f854.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f854.getMeasuredHeight() + paddingTop;
                            this.f854.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.f846;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c10076).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zM10592) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1007) this.f855.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f855.getMeasuredWidth() + iMax;
                            this.f855.layout(iMax, i25, measuredWidth3, this.f855.getMeasuredHeight() + i25);
                            i7 = measuredWidth3 + this.f846;
                        } else {
                            i7 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                ArrayList arrayList = this.f829;
                m1058(3, arrayList);
                size = arrayList.size();
                iM10682 = iMax;
                for (i10 = 0; i10 < size; i10++) {
                    iM10682 = m1068((View) arrayList.get(i10), iM10682, iMin, iArr);
                }
                m1058(5, arrayList);
                size2 = arrayList.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = m1065((View) arrayList.get(i11), iMin2, iMin, iArr);
                }
                m1058(1, arrayList);
                int i26 = iArr[0];
                int i27 = iArr[1];
                size3 = arrayList.size();
                int i28 = i26;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view2 = (View) arrayList.get(i12);
                    C1007 c10077 = (C1007) view2.getLayoutParams();
                    int i29 = i27;
                    int i30 = ((ViewGroup.MarginLayoutParams) c10077).leftMargin - i28;
                    int i31 = ((ViewGroup.MarginLayoutParams) c10077).rightMargin - i29;
                    int iMax3 = Math.max(0, i30);
                    int iMax4 = Math.max(0, i31);
                    int iMax5 = Math.max(0, -i30);
                    int iMax6 = Math.max(0, -i31);
                    measuredWidth4 += view2.getMeasuredWidth() + iMax3 + iMax4;
                    i12++;
                    i28 = iMax5;
                    i27 = iMax6;
                }
                i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i32 = measuredWidth4 + i14;
                if (i14 >= iM10682) {
                    iM10682 = i32 > iMin2 ? i14 - (i32 - iMin2) : i14;
                }
                size4 = arrayList.size();
                for (i13 = 0; i13 < size4; i13++) {
                    iM10682 = m1068((View) arrayList.get(i13), iM10682, iMin, iArr);
                }
                arrayList.clear();
            }
            iM1068 = m1068(c0973, paddingLeft, iMin, iArr);
        } else {
            iM1068 = paddingLeft;
        }
        iM1065 = i15;
        if (m1059(this.f850)) {
        }
        if (m1059(this.f856)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM1068);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iM1065));
        iMax = Math.max(iM1068, currentContentInsetLeft2);
        int iMin22 = Math.min(iM1065, i15 - currentContentInsetRight2);
        if (m1059(this.f851)) {
        }
        if (m1059(this.f848)) {
        }
        zM1059 = m1059(this.f854);
        zM10592 = m1059(this.f855);
        if (zM1059) {
        }
        if (!zM10592) {
        }
        if (!zM1059) {
            if (!zM1059) {
            }
            if (!zM10592) {
            }
            C1007 c100732 = (C1007) c1072.getLayoutParams();
            C1007 c100742 = (C1007) c10722.getLayoutParams();
            int i162 = measuredHeight;
            if (zM1059) {
                i5 = this.f832 & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.f832 & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        ArrayList arrayList2 = this.f829;
        m1058(3, arrayList2);
        size = arrayList2.size();
        iM10682 = iMax;
        while (i10 < size) {
        }
        m1058(5, arrayList2);
        size2 = arrayList2.size();
        while (i11 < size2) {
        }
        m1058(1, arrayList2);
        int i262 = iArr[0];
        int i272 = iArr[1];
        size3 = arrayList2.size();
        int i282 = i262;
        i12 = 0;
        int measuredWidth42 = 0;
        while (i12 < size3) {
        }
        i14 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i322 = measuredWidth42 + i14;
        if (i14 >= iM10682) {
        }
        size4 = arrayList2.size();
        while (i13 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM1050;
        int iMax;
        int iCombineMeasuredStates;
        int iM10502;
        int iM1051;
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
        if (m1059(this.f849)) {
            m1060(this.f849, i, 0, i2, this.f836);
            iM1050 = m1050(this.f849) + this.f849.getMeasuredWidth();
            iMax = Math.max(0, m1051(this.f849) + this.f849.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f849.getMeasuredState());
        } else {
            iM1050 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1059(this.f850)) {
            m1060(this.f850, i, 0, i2, this.f836);
            iM1050 = m1050(this.f850) + this.f850.getMeasuredWidth();
            iMax = Math.max(iMax, m1051(this.f850) + this.f850.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f850.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1050);
        int iMax4 = Math.max(0, currentContentInsetStart - iM1050);
        Object[] objArr2 = objArr;
        int[] iArr = this.f824;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m1059(this.f856)) {
            m1060(this.f856, i, iMax3, i2, this.f836);
            iM10502 = m1050(this.f856) + this.f856.getMeasuredWidth();
            iMax = Math.max(iMax, m1051(this.f856) + this.f856.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f856.getMeasuredState());
        } else {
            iM10502 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM10502);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM10502);
        if (m1059(this.f851)) {
            iMax5 += m1066(this.f851, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m1051(this.f851) + this.f851.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f851.getMeasuredState());
        }
        if (m1059(this.f848)) {
            iMax5 += m1066(this.f848, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m1051(this.f848) + this.f848.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f848.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C1007) childAt.getLayoutParams()).f991 == 0 && m1059(childAt)) {
                iMax5 += m1066(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m1051(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f845 + this.f844;
        int i7 = this.f847 + this.f846;
        if (m1059(this.f854)) {
            m1066(this.f854, i, i5 + i7, i2, i6, iArr);
            int iM10503 = m1050(this.f854) + this.f854.getMeasuredWidth();
            iM1051 = m1051(this.f854) + this.f854.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f854.getMeasuredState());
            iMax2 = iM10503;
        } else {
            iM1051 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m1059(this.f855)) {
            iMax2 = Math.max(iMax2, m1066(this.f855, i, i5 + i7, i2, i6 + iM1051, iArr));
            iM1051 += m1051(this.f855) + this.f855.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f855.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM1051);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f860) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m1059(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f7044);
        ActionMenuView actionMenuView = this.f856;
        MenuC8631 menuC8631 = actionMenuView != null ? actionMenuView.f806 : null;
        int i = savedState.f871;
        if (i != 0 && this.f867 != null && menuC8631 != null && (menuItemFindItem = menuC8631.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f870) {
            RunnableC0909 runnableC0909 = this.f863;
            removeCallbacks(runnableC0909);
            post(runnableC0909);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1055();
        C0996 c0996 = this.f843;
        boolean z = i == 1;
        if (z == c0996.f974) {
            return;
        }
        c0996.f974 = z;
        if (!c0996.f973) {
            c0996.f972 = c0996.f968;
            c0996.f971 = c0996.f967;
            return;
        }
        if (z) {
            int i2 = c0996.f969;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0996.f968;
            }
            c0996.f972 = i2;
            int i3 = c0996.f970;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0996.f967;
            }
            c0996.f971 = i3;
            return;
        }
        int i4 = c0996.f970;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0996.f968;
        }
        c0996.f972 = i4;
        int i5 = c0996.f969;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0996.f967;
        }
        c0996.f971 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C8629 c8629;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C1006 c1006 = this.f867;
        if (c1006 != null && (c8629 = c1006.f988) != null) {
            savedState.f871 = c8629.f21589;
        }
        savedState.f870 = m1067();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f827 = false;
        }
        if (!this.f827) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f827 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f827 = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f857 != z) {
            this.f857 = z;
            m1062();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1056();
        }
        C0973 c0973 = this.f850;
        if (c0973 != null) {
            c0973.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1056();
            this.f850.setImageDrawable(drawable);
        } else {
            C0973 c0973 = this.f850;
            if (c0973 != null) {
                c0973.setImageDrawable(this.f852);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f860 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f833) {
            this.f833 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f842) {
            this.f842 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        C0983 c0983 = this.f848;
        if (drawable != null) {
            if (c0983 == null) {
                this.f848 = new C0983(getContext(), null, 0);
            }
            if (!m1063(this.f848)) {
                m1057(this.f848, true);
            }
        } else if (c0983 != null && m1063(c0983)) {
            removeView(this.f848);
            this.f828.remove(this.f848);
        }
        C0983 c09832 = this.f848;
        if (c09832 != null) {
            c09832.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f848 == null) {
            this.f848 = new C0983(getContext(), null, 0);
        }
        C0983 c0983 = this.f848;
        if (c0983 != null) {
            c0983.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1069();
        }
        C0973 c0973 = this.f849;
        if (c0973 != null) {
            c0973.setContentDescription(charSequence);
            AbstractC0994.m1161(this.f849, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1069();
            if (!m1063(this.f849)) {
                m1057(this.f849, true);
            }
        } else {
            C0973 c0973 = this.f849;
            if (c0973 != null && m1063(c0973)) {
                removeView(this.f849);
                this.f828.remove(this.f849);
            }
        }
        C0973 c09732 = this.f849;
        if (c09732 != null) {
            c09732.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1069();
        this.f849.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1003 interfaceC1003) {
        this.f864 = interfaceC1003;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1054();
        this.f856.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f840 != i) {
            this.f840 = i;
            if (i == 0) {
                this.f841 = getContext();
            } else {
                this.f841 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C1072 c1072 = this.f855;
        if (!zIsEmpty) {
            if (c1072 == null) {
                Context context = getContext();
                C1072 c10722 = new C1072(context, null);
                this.f855 = c10722;
                c10722.setSingleLine();
                this.f855.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f838;
                if (i != 0) {
                    this.f855.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f831;
                if (colorStateList != null) {
                    this.f855.setTextColor(colorStateList);
                }
            }
            if (!m1063(this.f855)) {
                m1057(this.f855, true);
            }
        } else if (c1072 != null && m1063(c1072)) {
            removeView(this.f855);
            this.f828.remove(this.f855);
        }
        C1072 c10723 = this.f855;
        if (c10723 != null) {
            c10723.setText(charSequence);
        }
        this.f834 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f831 = colorStateList;
        C1072 c1072 = this.f855;
        if (c1072 != null) {
            c1072.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C1072 c1072 = this.f854;
        if (!zIsEmpty) {
            if (c1072 == null) {
                Context context = getContext();
                C1072 c10722 = new C1072(context, null);
                this.f854 = c10722;
                c10722.setSingleLine();
                this.f854.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f839;
                if (i != 0) {
                    this.f854.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f830;
                if (colorStateList != null) {
                    this.f854.setTextColor(colorStateList);
                }
            }
            if (!m1063(this.f854)) {
                m1057(this.f854, true);
            }
        } else if (c1072 != null && m1063(c1072)) {
            removeView(this.f854);
            this.f828.remove(this.f854);
        }
        C1072 c10723 = this.f854;
        if (c10723 != null) {
            c10723.setText(charSequence);
        }
        this.f835 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f844 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f846 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f847 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f845 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f830 = colorStateList;
        C1072 c1072 = this.f854;
        if (c1072 != null) {
            c1072.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1053() {
        if (this.f856 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f856 = actionMenuView;
            actionMenuView.setPopupTheme(this.f840);
            this.f856.setOnMenuItemClickListener(this.f868);
            ActionMenuView actionMenuView2 = this.f856;
            C0911 c0911 = this.f862;
            C0985 c0985 = new C0985(this);
            actionMenuView2.f801 = c0911;
            actionMenuView2.f798 = c0985;
            C1007 c1007M1049 = m1049();
            c1007M1049.f992 = (this.f837 & 112) | 8388613;
            this.f856.setLayoutParams(c1007M1049);
            m1057(this.f856, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1054() {
        m1053();
        ActionMenuView actionMenuView = this.f856;
        if (actionMenuView.f806 == null) {
            MenuC8631 menuC8631 = (MenuC8631) actionMenuView.getMenu();
            if (this.f867 == null) {
                this.f867 = new C1006(this);
            }
            this.f856.setExpandedActionViewsExclusive(true);
            menuC8631.m13714(this.f867, this.f841);
            m1062();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1055() {
        if (this.f843 == null) {
            C0996 c0996 = new C0996();
            c0996.f972 = 0;
            c0996.f971 = 0;
            c0996.f970 = Integer.MIN_VALUE;
            c0996.f969 = Integer.MIN_VALUE;
            c0996.f968 = 0;
            c0996.f967 = 0;
            c0996.f974 = false;
            c0996.f973 = false;
            this.f843 = c0996;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1056() {
        if (this.f850 == null) {
            C0973 c0973 = new C0973(getContext(), null, C0328R.attr.toolbarNavigationButtonStyle);
            this.f850 = c0973;
            c0973.setImageDrawable(this.f852);
            this.f850.setContentDescription(this.f853);
            C1007 c1007M1049 = m1049();
            c1007M1049.f992 = (this.f837 & 112) | 8388611;
            c1007M1049.f991 = 2;
            this.f850.setLayoutParams(c1007M1049);
            this.f850.setOnClickListener(new ViewOnClickListenerC0933(this, 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1057(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1007 c1007M1049 = layoutParams == null ? m1049() : !checkLayoutParams(layoutParams) ? m1052(layoutParams) : (C1007) layoutParams;
        c1007M1049.f991 = 1;
        if (!z || this.f851 == null) {
            addView(view, c1007M1049);
        } else {
            view.setLayoutParams(c1007M1049);
            this.f828.add(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1058(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1007 c1007 = (C1007) childAt.getLayoutParams();
                if (c1007.f991 == 0 && m1059(childAt)) {
                    int i3 = c1007.f992;
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
            C1007 c10072 = (C1007) childAt2.getLayoutParams();
            if (c10072.f991 == 0 && m1059(childAt2)) {
                int i5 = c10072.f992;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m1059(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m1060(View view, int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m1061() {
        C1044 c1044;
        ActionMenuView actionMenuView = this.f856;
        return (actionMenuView == null || (c1044 = actionMenuView.f802) == null || !c1044.m1263()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m1062() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM1149 = AbstractC0986.m1149(this);
            C1006 c1006 = this.f867;
            int i = 0;
            boolean z = (c1006 == null || c1006.f988 == null || onBackInvokedDispatcherM1149 == null || !isAttachedToWindow() || !this.f857) ? false : true;
            if (z && this.f858 == null) {
                if (this.f859 == null) {
                    this.f859 = AbstractC0986.m1148(new RunnableC0989(this, i));
                }
                AbstractC0986.m1147(onBackInvokedDispatcherM1149, this.f859);
                this.f858 = onBackInvokedDispatcherM1149;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f858) == null) {
                return;
            }
            AbstractC0986.m1146(onBackInvokedDispatcher, this.f859);
            this.f858 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m1063(View view) {
        return view.getParent() == this || this.f828.contains(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m1064() {
        Iterator it = this.f865.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f825.f6904.iterator();
        while (it2.hasNext()) {
            ((C3158) ((InterfaceC3086) it2.next())).f7171.m4967();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f865 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m1065(View view, int i, int i2, int[] iArr) {
        C1007 c1007 = (C1007) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1007).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM1070 = m1070(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1070, iMax, view.getMeasuredHeight() + iM1070);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1007).leftMargin);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m1066(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m1067() {
        C1044 c1044;
        ActionMenuView actionMenuView = this.f856;
        return (actionMenuView == null || (c1044 = actionMenuView.f802) == null || !c1044.m1262()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m1068(View view, int i, int i2, int[] iArr) {
        C1007 c1007 = (C1007) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1007).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM1070 = m1070(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1070, iMax + measuredWidth, view.getMeasuredHeight() + iM1070);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1007).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1069() {
        if (this.f849 == null) {
            this.f849 = new C0973(getContext(), null, C0328R.attr.toolbarNavigationButtonStyle);
            C1007 c1007M1049 = m1049();
            c1007M1049.f992 = (this.f837 & 112) | 8388611;
            this.f849.setLayoutParams(c1007M1049);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m1070(View view, int i) {
        C1007 c1007 = (C1007) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1007.f992 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f832 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1007).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c1007).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c1007).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC4765.m8871(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1052(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC4765.m8871(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AbstractC4765.m8871(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
