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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import yyds.AbstractC0146;
import yyds.AbstractC0271;
import yyds.AbstractC0624;
import yyds.AbstractC1256;
import yyds.AbstractC1367;
import yyds.AbstractC1592;
import yyds.AbstractC1603;
import yyds.AbstractC1640;
import yyds.C0580;
import yyds.C0592;
import yyds.C0644;
import yyds.C0968;
import yyds.C1026;
import yyds.C1148;
import yyds.C1154;
import yyds.C1313;
import yyds.C1623;
import yyds.C1904;
import yyds.C2014;
import yyds.C2264;
import yyds.C2780;
import yyds.C2784;
import yyds.InterfaceC0127;
import yyds.InterfaceC2599;
import yyds.MenuC0836;
import yyds.RunnableC0871;
import yyds.RunnableC2652;
import yyds.ViewOnClickListenerC0616;
import yyds.ViewOnClickListenerC2759;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public ColorStateList f199;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f200;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final C1154 f201;

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final RunnableC0871 f202;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Drawable f203;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public ArrayList f204;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f205;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public CharSequence f206;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final CharSequence f207;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0580 f208;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f209;

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f210;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public boolean f211;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public int f212;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f213;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f214;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public CharSequence f215;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public int f216;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final int f217;

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public boolean f218;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2264 f219;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public C1904 f220;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public C2784 f221;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public int f222;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public View f223;

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public OnBackInvokedCallback f224;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Context f225;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final ArrayList f226;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public ColorStateList f227;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final int[] f228;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C0592 f229;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public C2780 f230;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public boolean f231;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public boolean f232;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public int f233;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public ActionMenuView f234;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final ArrayList f235;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public C1313 f236;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final int f237;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0592 f238;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C0580 f239;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final C2014 f240;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final int f241;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f241 = 8388627;
        this.f235 = new ArrayList();
        this.f226 = new ArrayList();
        this.f228 = new int[2];
        this.f240 = new C2014(new RunnableC2652(this, 1));
        this.f204 = new ArrayList();
        this.f201 = new C1154(this);
        this.f202 = new RunnableC0871(17, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1592.f8093;
        C0644 c0644M1535 = C0644.m1535(context2, attributeSet, iArr, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        this.f200 = typedArray2.getResourceId(28, 0);
        this.f213 = typedArray2.getResourceId(19, 0);
        this.f241 = typedArray2.getInteger(0, 8388627);
        this.f237 = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f222 = dimensionPixelOffset;
        this.f212 = dimensionPixelOffset;
        this.f233 = dimensionPixelOffset;
        this.f214 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f214 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f233 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f212 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f222 = dimensionPixelOffset5;
        }
        this.f217 = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        m92();
        C1904 c1904 = this.f220;
        c1904.f9633 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1904.f9634 = dimensionPixelSize;
            c1904.f9635 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1904.f9639 = dimensionPixelSize2;
            c1904.f9636 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1904.m3687(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f216 = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f209 = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f203 = c0644M1535.m1554(4);
        this.f207 = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f225 = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable drawableM1554 = c0644M1535.m1554(16);
        if (drawableM1554 != null) {
            setNavigationIcon(drawableM1554);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM15542 = c0644M1535.m1554(11);
        if (drawableM15542 != null) {
            setLogo(drawableM15542);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(c0644M1535.m1556(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(c0644M1535.m1556(20));
        }
        if (typedArray2.hasValue(14)) {
            getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
        }
        c0644M1535.m1568();
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
        return new C1623(getContext());
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static C1026 m73() {
        C1026 c1026 = new C1026(-2, -2);
        c1026.f4676 = 0;
        c1026.f4675 = 8388627;
        return c1026;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static C1026 m74(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C1026;
        if (z) {
            C1026 c1026 = (C1026) layoutParams;
            C1026 c10262 = new C1026(c1026);
            c10262.f4676 = 0;
            c10262.f4676 = c1026.f4676;
            return c10262;
        }
        if (z) {
            C1026 c10263 = new C1026((C1026) layoutParams);
            c10263.f4676 = 0;
            return c10263;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1026 c10264 = new C1026(layoutParams);
            c10264.f4676 = 0;
            return c10264;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1026 c10265 = new C1026(marginLayoutParams);
        c10265.f4676 = 0;
        ((ViewGroup.MarginLayoutParams) c10265).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c10265).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c10265).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c10265).bottomMargin = marginLayoutParams.bottomMargin;
        return c10265;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static int m75(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static int m76(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1026);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m73();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1026 c1026 = new C1026(context, attributeSet);
        c1026.f4675 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8098);
        c1026.f4675 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1026.f4676 = 0;
        return c1026;
    }

    public CharSequence getCollapseContentDescription() {
        C0592 c0592 = this.f229;
        if (c0592 != null) {
            return c0592.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0592 c0592 = this.f229;
        if (c0592 != null) {
            return c0592.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1904 c1904 = this.f220;
        if (c1904 != null) {
            return c1904.f9637 ? c1904.f9635 : c1904.f9636;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f209;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1904 c1904 = this.f220;
        if (c1904 != null) {
            return c1904.f9635;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1904 c1904 = this.f220;
        if (c1904 != null) {
            return c1904.f9636;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1904 c1904 = this.f220;
        if (c1904 != null) {
            return c1904.f9637 ? c1904.f9636 : c1904.f9635;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f216;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0836 menuC0836;
        ActionMenuView actionMenuView = this.f234;
        return (actionMenuView == null || (menuC0836 = actionMenuView.f136) == null || !menuC0836.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f209, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f216, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C2264 c2264 = this.f219;
        if (c2264 != null) {
            return c2264.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C2264 c2264 = this.f219;
        if (c2264 != null) {
            return c2264.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m79();
        return this.f234.getMenu();
    }

    public View getNavButtonView() {
        return this.f238;
    }

    public CharSequence getNavigationContentDescription() {
        C0592 c0592 = this.f238;
        if (c0592 != null) {
            return c0592.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0592 c0592 = this.f238;
        if (c0592 != null) {
            return c0592.getDrawable();
        }
        return null;
    }

    public C1313 getOuterActionMenuPresenter() {
        return this.f236;
    }

    public Drawable getOverflowIcon() {
        m79();
        return this.f234.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f225;
    }

    public int getPopupTheme() {
        return this.f205;
    }

    public CharSequence getSubtitle() {
        return this.f206;
    }

    public final TextView getSubtitleTextView() {
        return this.f208;
    }

    public CharSequence getTitle() {
        return this.f215;
    }

    public int getTitleMarginBottom() {
        return this.f222;
    }

    public int getTitleMarginEnd() {
        return this.f233;
    }

    public int getTitleMarginStart() {
        return this.f214;
    }

    public int getTitleMarginTop() {
        return this.f212;
    }

    public final TextView getTitleTextView() {
        return this.f239;
    }

    public InterfaceC0127 getWrapper() {
        Drawable drawable;
        C2780 c2780 = this.f230;
        if (c2780 == null) {
            c2780 = new C2780();
            c2780.f13566 = 0;
            c2780.f13571 = this;
            c2780.f13567 = getTitle();
            c2780.f13569 = getSubtitle();
            c2780.f13574 = c2780.f13567 != null;
            c2780.f13579 = getNavigationIcon();
            C0644 c0644M1535 = C0644.m1535(getContext(), null, AbstractC1592.f8094, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c0644M1535.f3099;
            c2780.f13572 = c0644M1535.m1554(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c2780.f13574 = true;
                c2780.f13567 = text;
                if ((c2780.f13573 & 8) != 0) {
                    setTitle(text);
                    if (c2780.f13574) {
                        AbstractC1640.m3342(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c2780.f13569 = text2;
                if ((c2780.f13573 & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM1554 = c0644M1535.m1554(20);
            if (drawableM1554 != null) {
                c2780.f13570 = drawableM1554;
                c2780.m4903();
            }
            Drawable drawableM15542 = c0644M1535.m1554(17);
            if (drawableM15542 != null) {
                c2780.f13580 = drawableM15542;
                c2780.m4903();
            }
            if (c2780.f13579 == null && (drawable = c2780.f13572) != null) {
                c2780.f13579 = drawable;
                if ((c2780.f13573 & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c2780.m4901(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c2780.f13578;
                if (view != null && (c2780.f13573 & 16) != 0) {
                    removeView(view);
                }
                c2780.f13578 = viewInflate;
                if (viewInflate != null && (c2780.f13573 & 16) != 0) {
                    addView(viewInflate);
                }
                c2780.m4901(c2780.f13573 | 16);
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
                m92();
                this.f220.m3687(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f200 = resourceId2;
                C0580 c0580 = this.f239;
                if (c0580 != null) {
                    c0580.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f213 = resourceId3;
                C0580 c05802 = this.f208;
                if (c05802 != null) {
                    c05802.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0644M1535.m1568();
            if (R.string.abc_action_bar_up_description != c2780.f13566) {
                c2780.f13566 = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c2780.f13566;
                    c2780.f13577 = i != 0 ? getContext().getString(i) : null;
                    c2780.m4902();
                }
            }
            c2780.f13577 = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0616(c2780));
            this.f230 = c2780;
        }
        return c2780;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f202);
        m81();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f232 = false;
        }
        if (!this.f232) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f232 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f232 = false;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM82;
        int iM90;
        int iMax;
        boolean zM88;
        boolean zM882;
        boolean z2;
        int measuredHeight;
        int i5;
        int paddingTop;
        int i6;
        int i7;
        int i8;
        int i9;
        int size;
        int iM822;
        int i10;
        int size2;
        int i11;
        int size3;
        int i12;
        int i13;
        int i14;
        int size4;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.f228;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m88(this.f238)) {
            C0592 c0592 = this.f238;
            if (z3) {
                iM90 = m90(c0592, i15, iMin, iArr);
                iM82 = paddingLeft;
                if (m88(this.f229)) {
                    C0592 c05922 = this.f229;
                    if (z3) {
                        iM90 = m90(c05922, iM90, iMin, iArr);
                    } else {
                        iM82 = m82(c05922, iM82, iMin, iArr);
                    }
                }
                if (m88(this.f234)) {
                    ActionMenuView actionMenuView = this.f234;
                    if (z3) {
                        iM82 = m82(actionMenuView, iM82, iMin, iArr);
                    } else {
                        iM90 = m90(actionMenuView, iM90, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM82);
                iArr[1] = Math.max(0, currentContentInsetRight - (i15 - iM90));
                iMax = Math.max(iM82, currentContentInsetLeft);
                int iMin2 = Math.min(iM90, i15 - currentContentInsetRight);
                if (m88(this.f223)) {
                    View view = this.f223;
                    if (z3) {
                        iMin2 = m90(view, iMin2, iMin, iArr);
                    } else {
                        iMax = m82(view, iMax, iMin, iArr);
                    }
                }
                if (m88(this.f219)) {
                    C2264 c2264 = this.f219;
                    if (z3) {
                        iMin2 = m90(c2264, iMin2, iMin, iArr);
                    } else {
                        iMax = m82(c2264, iMax, iMin, iArr);
                    }
                }
                zM88 = m88(this.f239);
                zM882 = m88(this.f208);
                if (zM88) {
                    z2 = z3;
                    measuredHeight = 0;
                } else {
                    C1026 c1026 = (C1026) this.f239.getLayoutParams();
                    z2 = z3;
                    measuredHeight = this.f239.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1026).topMargin + ((ViewGroup.MarginLayoutParams) c1026).bottomMargin;
                }
                if (!zM882) {
                    C1026 c10262 = (C1026) this.f208.getLayoutParams();
                    measuredHeight = this.f208.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10262).topMargin + ((ViewGroup.MarginLayoutParams) c10262).bottomMargin + measuredHeight;
                }
                if (!zM88 || zM882) {
                    C0580 c0580 = !zM88 ? this.f239 : this.f208;
                    C0580 c05802 = !zM882 ? this.f208 : this.f239;
                    C1026 c10263 = (C1026) c0580.getLayoutParams();
                    C1026 c10264 = (C1026) c05802.getLayoutParams();
                    int i16 = measuredHeight;
                    boolean z4 = (zM88 && this.f239.getMeasuredWidth() > 0) || (zM882 && this.f208.getMeasuredWidth() > 0);
                    i5 = this.f241 & 112;
                    int i17 = iMax;
                    if (i5 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c10263).topMargin + this.f212;
                    } else if (i5 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) c10263).topMargin + this.f212;
                        if (iMax2 < i18) {
                            iMax2 = i18;
                        } else {
                            int i19 = (((height - paddingBottom) - i16) - iMax2) - paddingTop2;
                            int i20 = ((ViewGroup.MarginLayoutParams) c10263).bottomMargin;
                            int i21 = this.f222;
                            if (i19 < i20 + i21) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c10264).bottomMargin + i21) - i19));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c10264).bottomMargin) - this.f222) - i16;
                    }
                    if (z2) {
                        int i22 = (z4 ? this.f214 : 0) - iArr[1];
                        iMin2 -= Math.max(0, i22);
                        iArr[1] = Math.max(0, -i22);
                        if (zM88) {
                            C1026 c10265 = (C1026) this.f239.getLayoutParams();
                            int measuredWidth = iMin2 - this.f239.getMeasuredWidth();
                            int measuredHeight2 = this.f239.getMeasuredHeight() + paddingTop;
                            this.f239.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i8 = measuredWidth - this.f233;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c10265).bottomMargin;
                        } else {
                            i8 = iMin2;
                        }
                        if (zM882) {
                            int i23 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1026) this.f208.getLayoutParams())).topMargin;
                            this.f208.layout(iMin2 - this.f208.getMeasuredWidth(), i23, iMin2, this.f208.getMeasuredHeight() + i23);
                            i9 = iMin2 - this.f233;
                        } else {
                            i9 = iMin2;
                        }
                        if (z4) {
                            iMin2 = Math.min(i8, i9);
                        }
                        iMax = i17;
                    } else {
                        int i24 = (z4 ? this.f214 : 0) - iArr[0];
                        iMax = Math.max(0, i24) + i17;
                        iArr[0] = Math.max(0, -i24);
                        if (zM88) {
                            C1026 c10266 = (C1026) this.f239.getLayoutParams();
                            int measuredWidth2 = this.f239.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f239.getMeasuredHeight() + paddingTop;
                            this.f239.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i6 = measuredWidth2 + this.f233;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c10266).bottomMargin;
                        } else {
                            i6 = iMax;
                        }
                        if (zM882) {
                            int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1026) this.f208.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f208.getMeasuredWidth() + iMax;
                            this.f208.layout(iMax, i25, measuredWidth3, this.f208.getMeasuredHeight() + i25);
                            i7 = measuredWidth3 + this.f233;
                        } else {
                            i7 = iMax;
                        }
                        if (z4) {
                            iMax = Math.max(i6, i7);
                        }
                    }
                }
                ArrayList arrayList = this.f235;
                m80(3, arrayList);
                size = arrayList.size();
                iM822 = iMax;
                for (i10 = 0; i10 < size; i10++) {
                    iM822 = m82((View) arrayList.get(i10), iM822, iMin, iArr);
                }
                m80(5, arrayList);
                size2 = arrayList.size();
                for (i11 = 0; i11 < size2; i11++) {
                    iMin2 = m90((View) arrayList.get(i11), iMin2, iMin, iArr);
                }
                m80(1, arrayList);
                int i26 = iArr[0];
                int i27 = iArr[1];
                size3 = arrayList.size();
                int i28 = i26;
                i12 = 0;
                int measuredWidth4 = 0;
                while (i12 < size3) {
                    View view2 = (View) arrayList.get(i12);
                    C1026 c10267 = (C1026) view2.getLayoutParams();
                    int i29 = i27;
                    int i30 = ((ViewGroup.MarginLayoutParams) c10267).leftMargin - i28;
                    int i31 = ((ViewGroup.MarginLayoutParams) c10267).rightMargin - i29;
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
                if (i14 >= iM822) {
                    iM822 = i32 > iMin2 ? i14 - (i32 - iMin2) : i14;
                }
                size4 = arrayList.size();
                for (i13 = 0; i13 < size4; i13++) {
                    iM822 = m82((View) arrayList.get(i13), iM822, iMin, iArr);
                }
                arrayList.clear();
            }
            iM82 = m82(c0592, paddingLeft, iMin, iArr);
        } else {
            iM82 = paddingLeft;
        }
        iM90 = i15;
        if (m88(this.f229)) {
        }
        if (m88(this.f234)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM82);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i15 - iM90));
        iMax = Math.max(iM82, currentContentInsetLeft2);
        int iMin22 = Math.min(iM90, i15 - currentContentInsetRight2);
        if (m88(this.f223)) {
        }
        if (m88(this.f219)) {
        }
        zM88 = m88(this.f239);
        zM882 = m88(this.f208);
        if (zM88) {
        }
        if (!zM882) {
        }
        if (!zM88) {
            if (!zM88) {
            }
            if (!zM882) {
            }
            C1026 c102632 = (C1026) c0580.getLayoutParams();
            C1026 c102642 = (C1026) c05802.getLayoutParams();
            int i162 = measuredHeight;
            if (zM88) {
                i5 = this.f241 & 112;
                int i172 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            } else {
                i5 = this.f241 & 112;
                int i1722 = iMax;
                if (i5 == 48) {
                }
                if (z2) {
                }
            }
        }
        ArrayList arrayList2 = this.f235;
        m80(3, arrayList2);
        size = arrayList2.size();
        iM822 = iMax;
        while (i10 < size) {
        }
        m80(5, arrayList2);
        size2 = arrayList2.size();
        while (i11 < size2) {
        }
        m80(1, arrayList2);
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
        if (i14 >= iM822) {
        }
        size4 = arrayList2.size();
        while (i13 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM75;
        int iMax;
        int iCombineMeasuredStates;
        int iM752;
        int iM76;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zM3289 = AbstractC1603.m3289(this);
        int i3 = !zM3289 ? 1 : 0;
        int i4 = 0;
        if (m88(this.f238)) {
            m83(this.f238, i, 0, i2, this.f217);
            iM75 = m75(this.f238) + this.f238.getMeasuredWidth();
            iMax = Math.max(0, m76(this.f238) + this.f238.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f238.getMeasuredState());
        } else {
            iM75 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m88(this.f229)) {
            m83(this.f229, i, 0, i2, this.f217);
            iM75 = m75(this.f229) + this.f229.getMeasuredWidth();
            iMax = Math.max(iMax, m76(this.f229) + this.f229.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f229.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM75);
        int iMax4 = Math.max(0, currentContentInsetStart - iM75);
        int[] iArr = this.f228;
        iArr[zM3289 ? 1 : 0] = iMax4;
        if (m88(this.f234)) {
            m83(this.f234, i, iMax3, i2, this.f217);
            iM752 = m75(this.f234) + this.f234.getMeasuredWidth();
            iMax = Math.max(iMax, m76(this.f234) + this.f234.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f234.getMeasuredState());
        } else {
            iM752 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM752);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iM752);
        if (m88(this.f223)) {
            iMax5 += m85(this.f223, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m76(this.f223) + this.f223.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f223.getMeasuredState());
        }
        if (m88(this.f219)) {
            iMax5 += m85(this.f219, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m76(this.f219) + this.f219.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f219.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((C1026) childAt.getLayoutParams()).f4676 == 0 && m88(childAt)) {
                iMax5 += m85(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m76(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f212 + this.f222;
        int i8 = this.f214 + this.f233;
        if (m88(this.f239)) {
            m85(this.f239, i, i6 + i8, i2, i7, iArr);
            int iM753 = m75(this.f239) + this.f239.getMeasuredWidth();
            iM76 = m76(this.f239) + this.f239.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f239.getMeasuredState());
            iMax2 = iM753;
        } else {
            iM76 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m88(this.f208)) {
            iMax2 = Math.max(iMax2, m85(this.f208, i, i6 + i8, i2, i7 + iM76, iArr));
            iM76 += m76(this.f208) + this.f208.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f208.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM76);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f211) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (m88(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0968)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0968 c0968 = (C0968) parcelable;
        super.onRestoreInstanceState(c0968.f8458);
        ActionMenuView actionMenuView = this.f234;
        MenuC0836 menuC0836 = actionMenuView != null ? actionMenuView.f136 : null;
        int i = c0968.f4448;
        if (i != 0 && this.f221 != null && menuC0836 != null && (menuItemFindItem = menuC0836.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0968.f4449) {
            RunnableC0871 runnableC0871 = this.f202;
            removeCallbacks(runnableC0871);
            post(runnableC0871);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m92();
        C1904 c1904 = this.f220;
        boolean z = i == 1;
        if (z == c1904.f9637) {
            return;
        }
        c1904.f9637 = z;
        if (!c1904.f9633) {
            c1904.f9635 = c1904.f9634;
            c1904.f9636 = c1904.f9639;
            return;
        }
        if (z) {
            int i2 = c1904.f9640;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c1904.f9634;
            }
            c1904.f9635 = i2;
            int i3 = c1904.f9638;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c1904.f9639;
            }
            c1904.f9636 = i3;
            return;
        }
        int i4 = c1904.f9638;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c1904.f9634;
        }
        c1904.f9635 = i4;
        int i5 = c1904.f9640;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c1904.f9639;
        }
        c1904.f9636 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1313 c1313;
        C1148 c1148;
        C0968 c0968 = new C0968(super.onSaveInstanceState());
        C2784 c2784 = this.f221;
        if (c2784 != null && (c1148 = c2784.f13608) != null) {
            c0968.f4448 = c1148.f5275;
        }
        ActionMenuView actionMenuView = this.f234;
        c0968.f4449 = (actionMenuView == null || (c1313 = actionMenuView.f139) == null || !c1313.m2603()) ? false : true;
        return c0968;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f231 = false;
        }
        if (!this.f231) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f231 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f231 = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f218 != z) {
            this.f218 = z;
            m81();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m89();
        }
        C0592 c0592 = this.f229;
        if (c0592 != null) {
            c0592.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m89();
            this.f229.setImageDrawable(drawable);
        } else {
            C0592 c0592 = this.f229;
            if (c0592 != null) {
                c0592.setImageDrawable(this.f203);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f211 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f209) {
            this.f209 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f216) {
            this.f216 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        C2264 c2264 = this.f219;
        if (drawable != null) {
            if (c2264 == null) {
                c2264 = new C2264(getContext(), null, 0);
                this.f219 = c2264;
            }
            if (!m77(c2264)) {
                m84(this.f219, true);
            }
        } else if (c2264 != null && m77(c2264)) {
            removeView(this.f219);
            this.f226.remove(this.f219);
        }
        C2264 c22642 = this.f219;
        if (c22642 != null) {
            c22642.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f219 == null) {
            this.f219 = new C2264(getContext(), null, 0);
        }
        C2264 c2264 = this.f219;
        if (c2264 != null) {
            c2264.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m86();
        }
        C0592 c0592 = this.f238;
        if (c0592 != null) {
            c0592.setContentDescription(charSequence);
            AbstractC0146.m690(this.f238, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m86();
            if (!m77(this.f238)) {
                m84(this.f238, true);
            }
        } else {
            C0592 c0592 = this.f238;
            if (c0592 != null && m77(c0592)) {
                removeView(this.f238);
                this.f226.remove(this.f238);
            }
        }
        C0592 c05922 = this.f238;
        if (c05922 != null) {
            c05922.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m86();
        this.f238.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC2599 interfaceC2599) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m79();
        this.f234.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f205 != i) {
            this.f205 = i;
            if (i == 0) {
                this.f225 = getContext();
            } else {
                this.f225 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0580 c0580 = this.f208;
        if (!zIsEmpty) {
            if (c0580 == null) {
                Context context = getContext();
                C0580 c05802 = new C0580(context, null);
                this.f208 = c05802;
                c05802.setSingleLine();
                this.f208.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f213;
                if (i != 0) {
                    this.f208.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f199;
                if (colorStateList != null) {
                    this.f208.setTextColor(colorStateList);
                }
            }
            if (!m77(this.f208)) {
                m84(this.f208, true);
            }
        } else if (c0580 != null && m77(c0580)) {
            removeView(this.f208);
            this.f226.remove(this.f208);
        }
        C0580 c05803 = this.f208;
        if (c05803 != null) {
            c05803.setText(charSequence);
        }
        this.f206 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f199 = colorStateList;
        C0580 c0580 = this.f208;
        if (c0580 != null) {
            c0580.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0580 c0580 = this.f239;
        if (!zIsEmpty) {
            if (c0580 == null) {
                Context context = getContext();
                C0580 c05802 = new C0580(context, null);
                this.f239 = c05802;
                c05802.setSingleLine();
                this.f239.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f200;
                if (i != 0) {
                    this.f239.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f227;
                if (colorStateList != null) {
                    this.f239.setTextColor(colorStateList);
                }
            }
            if (!m77(this.f239)) {
                m84(this.f239, true);
            }
        } else if (c0580 != null && m77(c0580)) {
            removeView(this.f239);
            this.f226.remove(this.f239);
        }
        C0580 c05803 = this.f239;
        if (c05803 != null) {
            c05803.setText(charSequence);
        }
        this.f215 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f222 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f233 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f214 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f212 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f227 = colorStateList;
        C0580 c0580 = this.f239;
        if (c0580 != null) {
            c0580.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final boolean m77(View view) {
        return view.getParent() == this || this.f226.contains(view);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m78() {
        Iterator it = this.f204.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f240.f10074).iterator();
        if (it2.hasNext()) {
            ((AbstractC0624) it2.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f204 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m79() {
        m91();
        ActionMenuView actionMenuView = this.f234;
        if (actionMenuView.f136 == null) {
            MenuC0836 menuC0836 = (MenuC0836) actionMenuView.getMenu();
            if (this.f221 == null) {
                this.f221 = new C2784(this);
            }
            this.f234.setExpandedActionViewsExclusive(true);
            menuC0836.m1904(this.f221, this.f225);
            m81();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m80(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1026 c1026 = (C1026) childAt.getLayoutParams();
                if (c1026.f4676 == 0 && m88(childAt)) {
                    int i3 = c1026.f4675;
                    WeakHashMap weakHashMap2 = AbstractC1640.f8352;
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
            C1026 c10262 = (C1026) childAt2.getLayoutParams();
            if (c10262.f4676 == 0 && m88(childAt2)) {
                int i5 = c10262.f4675;
                WeakHashMap weakHashMap3 = AbstractC1640.f8352;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m81() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM913 = AbstractC0271.m913(this);
            C2784 c2784 = this.f221;
            int i = 0;
            if (c2784 == null || c2784.f13608 == null || onBackInvokedDispatcherM913 == null) {
                z = false;
            } else {
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                if (isAttachedToWindow() && this.f218) {
                    z = true;
                }
            }
            if (!z || this.f210 != null) {
                if (z || (onBackInvokedDispatcher = this.f210) == null) {
                    return;
                }
                AbstractC0271.m916(onBackInvokedDispatcher, this.f224);
                this.f210 = null;
                return;
            }
            OnBackInvokedCallback onBackInvokedCallbackM914 = this.f224;
            if (onBackInvokedCallbackM914 == null) {
                onBackInvokedCallbackM914 = AbstractC0271.m914(new RunnableC2652(this, i));
                this.f224 = onBackInvokedCallbackM914;
            }
            AbstractC0271.m915(onBackInvokedDispatcherM913, onBackInvokedCallbackM914);
            this.f210 = onBackInvokedDispatcherM913;
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int m82(View view, int i, int i2, int[] iArr) {
        C1026 c1026 = (C1026) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1026).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM87 = m87(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM87, iMax + measuredWidth, view.getMeasuredHeight() + iM87);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1026).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m83(View view, int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m84(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1026 c1026M73 = layoutParams == null ? m73() : !checkLayoutParams(layoutParams) ? m74(layoutParams) : (C1026) layoutParams;
        c1026M73.f4676 = 1;
        if (!z || this.f223 == null) {
            addView(view, c1026M73);
        } else {
            view.setLayoutParams(c1026M73);
            this.f226.add(view);
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final int m85(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m86() {
        if (this.f238 == null) {
            this.f238 = new C0592(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1026 c1026M73 = m73();
            c1026M73.f4675 = (this.f237 & 112) | 8388611;
            this.f238.setLayoutParams(c1026M73);
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int m87(View view, int i) {
        C1026 c1026 = (C1026) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c1026.f4675 & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f241 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1026).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c1026).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c1026).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final boolean m88(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m89() {
        if (this.f229 == null) {
            C0592 c0592 = new C0592(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f229 = c0592;
            c0592.setImageDrawable(this.f203);
            this.f229.setContentDescription(this.f207);
            C1026 c1026M73 = m73();
            c1026M73.f4675 = (this.f237 & 112) | 8388611;
            c1026M73.f4676 = 2;
            this.f229.setLayoutParams(c1026M73);
            this.f229.setOnClickListener(new ViewOnClickListenerC2759(2, this));
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final int m90(View view, int i, int i2, int[] iArr) {
        C1026 c1026 = (C1026) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1026).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM87 = m87(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM87, iMax, view.getMeasuredHeight() + iM87);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1026).leftMargin);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m91() {
        if (this.f234 == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f234 = actionMenuView;
            actionMenuView.setPopupTheme(this.f205);
            this.f234.setOnMenuItemClickListener(this.f201);
            ActionMenuView actionMenuView2 = this.f234;
            C1154 c1154 = new C1154(this);
            actionMenuView2.getClass();
            actionMenuView2.f138 = c1154;
            C1026 c1026M73 = m73();
            c1026M73.f4675 = (this.f237 & 112) | 8388613;
            this.f234.setLayoutParams(c1026M73);
            m84(this.f234, false);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m92() {
        if (this.f220 == null) {
            C1904 c1904 = new C1904();
            c1904.f9635 = 0;
            c1904.f9636 = 0;
            c1904.f9638 = Integer.MIN_VALUE;
            c1904.f9640 = Integer.MIN_VALUE;
            c1904.f9634 = 0;
            c1904.f9639 = 0;
            c1904.f9637 = false;
            c1904.f9633 = false;
            this.f220 = c1904;
        }
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
        setCollapseIcon(AbstractC1367.m2767(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m74(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC1367.m2767(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AbstractC1367.m2767(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
