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
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0065;
import androidx.appcompat.app.C0108;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2252;
import androidx.core.view.InterfaceC2253;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.C2325;
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import p188.AbstractC7772;
import p190.C7799;
import p190.MenuC7801;
import p192.C7816;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int[] f479;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C2252 f480;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f481;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public boolean f482;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final ArrayList f483;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final ArrayList f484;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ColorStateList f485;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ColorStateList f486;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int f487;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f488;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public CharSequence f489;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public CharSequence f490;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f491;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f492;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f493;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f494;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f495;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Context f496;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f497;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C0149 f498;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f499;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f500;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f501;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f502;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0136 f503;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0126 f504;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C0126 f505;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public View f506;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Drawable f507;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final CharSequence f508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0225 f509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0225 f510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public ActionMenuView f511;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f512;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public OnBackInvokedDispatcher f513;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public OnBackInvokedCallback f514;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean f515;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public C0065 f516;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public C0064 f517;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final RunnableC0062 f518;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public InterfaceC0156 f519;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public ArrayList f520;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public C0197 f521;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public C0159 f522;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C0138 f523;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public C0146 f524;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0155();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public boolean f525;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public int f526;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f526 = parcel.readInt();
            this.f525 = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f526);
            parcel.writeInt(this.f525 ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f487 = 8388627;
        this.f484 = new ArrayList();
        this.f483 = new ArrayList();
        this.f479 = new int[2];
        this.f480 = new C2252(new RunnableC0142(this, 1));
        this.f520 = new ArrayList();
        this.f523 = new C0138(this);
        this.f518 = new RunnableC0062(this, 3);
        Context context2 = getContext();
        int[] iArr = AbstractC7772.f21095;
        C0108 c0108M353 = C0108.m353(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        AbstractC2270.m4233(this, context, iArr, attributeSet, (TypedArray) c0108M353.f320, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0108M353.f320;
        this.f494 = typedArray.getResourceId(28, 0);
        this.f493 = typedArray.getResourceId(19, 0);
        this.f487 = typedArray.getInteger(0, 8388627);
        this.f492 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f499 = dimensionPixelOffset;
        this.f500 = dimensionPixelOffset;
        this.f501 = dimensionPixelOffset;
        this.f502 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f502 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f501 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f500 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f499 = dimensionPixelOffset5;
        }
        this.f491 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m494();
        C0149 c0149 = this.f498;
        c0149.f628 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0149.f623 = dimensionPixelSize;
            c0149.f627 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0149.f622 = dimensionPixelSize2;
            c0149.f626 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0149.m602(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f497 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f488 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f507 = c0108M353.m389(4);
        this.f508 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f496 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM389 = c0108M353.m389(16);
        if (drawableM389 != null) {
            setNavigationIcon(drawableM389);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM3892 = c0108M353.m389(11);
        if (drawableM3892 != null) {
            setLogo(drawableM3892);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0108M353.m384(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0108M353.m384(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0108M353.m362();
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
        return new C7816(getContext());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C0160 m488() {
        C0160 c0160 = new C0160(-2, -2);
        c0160.f646 = 0;
        c0160.f647 = 8388627;
        return c0160;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m489(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m490(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C0160 m491(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C0160;
        if (z) {
            C0160 c0160 = (C0160) layoutParams;
            C0160 c01602 = new C0160(c0160);
            c01602.f646 = 0;
            c01602.f646 = c0160.f646;
            return c01602;
        }
        if (z) {
            C0160 c01603 = new C0160((C0160) layoutParams);
            c01603.f646 = 0;
            return c01603;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C0160 c01604 = new C0160(layoutParams);
            c01604.f646 = 0;
            return c01604;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C0160 c01605 = new C0160(marginLayoutParams);
        c01605.f646 = 0;
        ((ViewGroup.MarginLayoutParams) c01605).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c01605).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c01605).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c01605).bottomMargin = marginLayoutParams.bottomMargin;
        return c01605;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0160);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m488();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0160 c0160 = new C0160(context, attributeSet);
        c0160.f647 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7772.f21091);
        c0160.f647 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c0160.f646 = 0;
        return c0160;
    }

    public CharSequence getCollapseContentDescription() {
        C0126 c0126 = this.f505;
        if (c0126 != null) {
            return c0126.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0126 c0126 = this.f505;
        if (c0126 != null) {
            return c0126.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0149 c0149 = this.f498;
        if (c0149 != null) {
            return c0149.f629 ? c0149.f627 : c0149.f626;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f488;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0149 c0149 = this.f498;
        if (c0149 != null) {
            return c0149.f627;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0149 c0149 = this.f498;
        if (c0149 != null) {
            return c0149.f626;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0149 c0149 = this.f498;
        if (c0149 != null) {
            return c0149.f629 ? c0149.f626 : c0149.f627;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f497;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC7801 menuC7801;
        ActionMenuView actionMenuView = this.f511;
        return (actionMenuView == null || (menuC7801 = actionMenuView.f461) == null || !menuC7801.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f488, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f497, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0136 c0136 = this.f503;
        if (c0136 != null) {
            return c0136.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0136 c0136 = this.f503;
        if (c0136 != null) {
            return c0136.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m493();
        return this.f511.getMenu();
    }

    public View getNavButtonView() {
        return this.f504;
    }

    public CharSequence getNavigationContentDescription() {
        C0126 c0126 = this.f504;
        if (c0126 != null) {
            return c0126.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0126 c0126 = this.f504;
        if (c0126 != null) {
            return c0126.getDrawable();
        }
        return null;
    }

    public C0197 getOuterActionMenuPresenter() {
        return this.f521;
    }

    public Drawable getOverflowIcon() {
        m493();
        return this.f511.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f496;
    }

    public int getPopupTheme() {
        return this.f495;
    }

    public CharSequence getSubtitle() {
        return this.f489;
    }

    public final TextView getSubtitleTextView() {
        return this.f510;
    }

    public CharSequence getTitle() {
        return this.f490;
    }

    public int getTitleMarginBottom() {
        return this.f499;
    }

    public int getTitleMarginEnd() {
        return this.f501;
    }

    public int getTitleMarginStart() {
        return this.f502;
    }

    public int getTitleMarginTop() {
        return this.f500;
    }

    public final TextView getTitleTextView() {
        return this.f509;
    }

    public InterfaceC0220 getWrapper() {
        if (this.f524 == null) {
            this.f524 = new C0146(this, true);
        }
        return this.f524;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m501();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f518);
        m501();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f481 = false;
        }
        if (!this.f481) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f481 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f481 = false;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM489;
        int iMax;
        int iCombineMeasuredStates;
        int iM4892;
        int iM490;
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
        if (m498(this.f504)) {
            m499(this.f504, i, 0, i2, this.f491);
            iM489 = m489(this.f504) + this.f504.getMeasuredWidth();
            iMax = Math.max(0, m490(this.f504) + this.f504.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f504.getMeasuredState());
        } else {
            iM489 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m498(this.f505)) {
            m499(this.f505, i, 0, i2, this.f491);
            iM489 = m489(this.f505) + this.f505.getMeasuredWidth();
            iMax = Math.max(iMax, m490(this.f505) + this.f505.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f505.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM489);
        int iMax4 = Math.max(0, currentContentInsetStart - iM489);
        Object[] objArr2 = objArr;
        int[] iArr = this.f479;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m498(this.f511)) {
            m499(this.f511, i, iMax3, i2, this.f491);
            iM4892 = m489(this.f511) + this.f511.getMeasuredWidth();
            iMax = Math.max(iMax, m490(this.f511) + this.f511.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f511.getMeasuredState());
        } else {
            iM4892 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM4892);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM4892);
        if (m498(this.f506)) {
            iMax5 += m505(this.f506, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m490(this.f506) + this.f506.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f506.getMeasuredState());
        }
        if (m498(this.f503)) {
            iMax5 += m505(this.f503, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m490(this.f503) + this.f503.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f503.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C0160) childAt.getLayoutParams()).f646 == 0 && m498(childAt)) {
                iMax5 += m505(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m490(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f500 + this.f499;
        int i7 = this.f502 + this.f501;
        if (m498(this.f509)) {
            m505(this.f509, i, i5 + i7, i2, i6, iArr);
            int iM4893 = m489(this.f509) + this.f509.getMeasuredWidth();
            iM490 = m490(this.f509) + this.f509.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f509.getMeasuredState());
            iMax2 = iM4893;
        } else {
            iM490 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m498(this.f510)) {
            iMax2 = Math.max(iMax2, m505(this.f510, i, i5 + i7, i2, i6 + iM490, iArr));
            iM490 += m490(this.f510) + this.f510.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f510.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM490);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f515) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m498(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
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
        super.onRestoreInstanceState(savedState.f6698);
        ActionMenuView actionMenuView = this.f511;
        MenuC7801 menuC7801 = actionMenuView != null ? actionMenuView.f461 : null;
        int i = savedState.f526;
        if (i != 0 && this.f522 != null && menuC7801 != null && (menuItemFindItem = menuC7801.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f525) {
            RunnableC0062 runnableC0062 = this.f518;
            removeCallbacks(runnableC0062);
            post(runnableC0062);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m494();
        C0149 c0149 = this.f498;
        boolean z = i == 1;
        if (z == c0149.f629) {
            return;
        }
        c0149.f629 = z;
        if (!c0149.f628) {
            c0149.f627 = c0149.f623;
            c0149.f626 = c0149.f622;
            return;
        }
        if (z) {
            int i2 = c0149.f624;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0149.f623;
            }
            c0149.f627 = i2;
            int i3 = c0149.f625;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0149.f622;
            }
            c0149.f626 = i3;
            return;
        }
        int i4 = c0149.f625;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0149.f623;
        }
        c0149.f627 = i4;
        int i5 = c0149.f624;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0149.f622;
        }
        c0149.f626 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C7799 c7799;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0159 c0159 = this.f522;
        if (c0159 != null && (c7799 = c0159.f643) != null) {
            savedState.f526 = c7799.f21247;
        }
        savedState.f525 = m506();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f482 = false;
        }
        if (!this.f482) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f482 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f482 = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f512 != z) {
            this.f512 = z;
            m501();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m495();
        }
        C0126 c0126 = this.f505;
        if (c0126 != null) {
            c0126.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m495();
            this.f505.setImageDrawable(drawable);
        } else {
            C0126 c0126 = this.f505;
            if (c0126 != null) {
                c0126.setImageDrawable(this.f507);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f515 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f488) {
            this.f488 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f497) {
            this.f497 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        C0136 c0136 = this.f503;
        if (drawable != null) {
            if (c0136 == null) {
                this.f503 = new C0136(getContext(), null, 0);
            }
            if (!m502(this.f503)) {
                m496(this.f503, true);
            }
        } else if (c0136 != null && m502(c0136)) {
            removeView(this.f503);
            this.f483.remove(this.f503);
        }
        C0136 c01362 = this.f503;
        if (c01362 != null) {
            c01362.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f503 == null) {
            this.f503 = new C0136(getContext(), null, 0);
        }
        C0136 c0136 = this.f503;
        if (c0136 != null) {
            c0136.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m508();
        }
        C0126 c0126 = this.f504;
        if (c0126 != null) {
            c0126.setContentDescription(charSequence);
            AbstractC0147.m600(this.f504, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m508();
            if (!m502(this.f504)) {
                m496(this.f504, true);
            }
        } else {
            C0126 c0126 = this.f504;
            if (c0126 != null && m502(c0126)) {
                removeView(this.f504);
                this.f483.remove(this.f504);
            }
        }
        C0126 c01262 = this.f504;
        if (c01262 != null) {
            c01262.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m508();
        this.f504.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0156 interfaceC0156) {
        this.f519 = interfaceC0156;
    }

    public void setOverflowIcon(Drawable drawable) {
        m493();
        this.f511.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f495 != i) {
            this.f495 = i;
            if (i == 0) {
                this.f496 = getContext();
            } else {
                this.f496 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0225 c0225 = this.f510;
        if (!zIsEmpty) {
            if (c0225 == null) {
                Context context = getContext();
                C0225 c02252 = new C0225(context, null);
                this.f510 = c02252;
                c02252.setSingleLine();
                this.f510.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f493;
                if (i != 0) {
                    this.f510.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f486;
                if (colorStateList != null) {
                    this.f510.setTextColor(colorStateList);
                }
            }
            if (!m502(this.f510)) {
                m496(this.f510, true);
            }
        } else if (c0225 != null && m502(c0225)) {
            removeView(this.f510);
            this.f483.remove(this.f510);
        }
        C0225 c02253 = this.f510;
        if (c02253 != null) {
            c02253.setText(charSequence);
        }
        this.f489 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f486 = colorStateList;
        C0225 c0225 = this.f510;
        if (c0225 != null) {
            c0225.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0225 c0225 = this.f509;
        if (!zIsEmpty) {
            if (c0225 == null) {
                Context context = getContext();
                C0225 c02252 = new C0225(context, null);
                this.f509 = c02252;
                c02252.setSingleLine();
                this.f509.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f494;
                if (i != 0) {
                    this.f509.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f485;
                if (colorStateList != null) {
                    this.f509.setTextColor(colorStateList);
                }
            }
            if (!m502(this.f509)) {
                m496(this.f509, true);
            }
        } else if (c0225 != null && m502(c0225)) {
            removeView(this.f509);
            this.f483.remove(this.f509);
        }
        C0225 c02253 = this.f509;
        if (c02253 != null) {
            c02253.setText(charSequence);
        }
        this.f490 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f499 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f501 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f502 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f500 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f485 = colorStateList;
        C0225 c0225 = this.f509;
        if (c0225 != null) {
            c0225.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m492() {
        if (this.f511 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f511 = actionMenuView;
            actionMenuView.setPopupTheme(this.f495);
            this.f511.setOnMenuItemClickListener(this.f523);
            ActionMenuView actionMenuView2 = this.f511;
            C0064 c0064 = this.f517;
            C0138 c0138 = new C0138(this);
            actionMenuView2.f456 = c0064;
            actionMenuView2.f453 = c0138;
            C0160 c0160M488 = m488();
            c0160M488.f647 = (this.f492 & 112) | 8388613;
            this.f511.setLayoutParams(c0160M488);
            m496(this.f511, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m493() {
        m492();
        ActionMenuView actionMenuView = this.f511;
        if (actionMenuView.f461 == null) {
            MenuC7801 menuC7801 = (MenuC7801) actionMenuView.getMenu();
            if (this.f522 == null) {
                this.f522 = new C0159(this);
            }
            this.f511.setExpandedActionViewsExclusive(true);
            menuC7801.m13127(this.f522, this.f496);
            m501();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m494() {
        if (this.f498 == null) {
            C0149 c0149 = new C0149();
            c0149.f627 = 0;
            c0149.f626 = 0;
            c0149.f625 = Integer.MIN_VALUE;
            c0149.f624 = Integer.MIN_VALUE;
            c0149.f623 = 0;
            c0149.f622 = 0;
            c0149.f629 = false;
            c0149.f628 = false;
            this.f498 = c0149;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m495() {
        if (this.f505 == null) {
            C0126 c0126 = new C0126(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f505 = c0126;
            c0126.setImageDrawable(this.f507);
            this.f505.setContentDescription(this.f508);
            C0160 c0160M488 = m488();
            c0160M488.f647 = (this.f492 & 112) | 8388611;
            c0160M488.f646 = 2;
            this.f505.setLayoutParams(c0160M488);
            this.f505.setOnClickListener(new ViewOnClickListenerC0086(this, 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m496(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0160 c0160M488 = layoutParams == null ? m488() : !checkLayoutParams(layoutParams) ? m491(layoutParams) : (C0160) layoutParams;
        c0160M488.f646 = 1;
        if (!z || this.f506 == null) {
            addView(view, c0160M488);
        } else {
            view.setLayoutParams(c0160M488);
            this.f483.add(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m497(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0160 c0160 = (C0160) childAt.getLayoutParams();
                if (c0160.f646 == 0 && m498(childAt)) {
                    int i3 = c0160.f647;
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
            C0160 c01602 = (C0160) childAt2.getLayoutParams();
            if (c01602.f646 == 0 && m498(childAt2)) {
                int i5 = c01602.f647;
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
    public final boolean m498(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m499(View view, int i, int i2, int i3, int i4) {
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
    public final boolean m500() {
        C0197 c0197;
        ActionMenuView actionMenuView = this.f511;
        return (actionMenuView == null || (c0197 = actionMenuView.f457) == null || !c0197.m702()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m501() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM588 = AbstractC0139.m588(this);
            C0159 c0159 = this.f522;
            int i = 0;
            boolean z = (c0159 == null || c0159.f643 == null || onBackInvokedDispatcherM588 == null || !isAttachedToWindow() || !this.f512) ? false : true;
            if (z && this.f513 == null) {
                if (this.f514 == null) {
                    this.f514 = AbstractC0139.m587(new RunnableC0142(this, i));
                }
                AbstractC0139.m586(onBackInvokedDispatcherM588, this.f514);
                this.f513 = onBackInvokedDispatcherM588;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f513) == null) {
                return;
            }
            AbstractC0139.m585(onBackInvokedDispatcher, this.f514);
            this.f513 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m502(View view) {
        return view.getParent() == this || this.f483.contains(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m503() {
        Iterator it = this.f520.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f480.f6558.iterator();
        while (it2.hasNext()) {
            ((C2325) ((InterfaceC2253) it2.next())).f6825.m4397();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f520 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m504(View view, int i, int i2, int[] iArr) {
        C0160 c0160 = (C0160) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0160).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM509 = m509(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM509, iMax, view.getMeasuredHeight() + iM509);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0160).leftMargin);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m505(View view, int i, int i2, int i3, int i4, int[] iArr) {
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
    public final boolean m506() {
        C0197 c0197;
        ActionMenuView actionMenuView = this.f511;
        return (actionMenuView == null || (c0197 = actionMenuView.f457) == null || !c0197.m701()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m507(View view, int i, int i2, int[] iArr) {
        C0160 c0160 = (C0160) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0160).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM509 = m509(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM509, iMax + measuredWidth, view.getMeasuredHeight() + iM509);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0160).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m508() {
        if (this.f504 == null) {
            this.f504 = new C0126(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0160 c0160M488 = m488();
            c0160M488.f647 = (this.f492 & 112) | 8388611;
            this.f504.setLayoutParams(c0160M488);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m509(View view, int i) {
        C0160 c0160 = (C0160) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0160.f647 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f487 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0160).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0160).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0160).bottomMargin;
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
        setCollapseIcon(AbstractC3054.m6607(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m491(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC3054.m6607(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AbstractC3054.m6607(getContext(), i));
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
