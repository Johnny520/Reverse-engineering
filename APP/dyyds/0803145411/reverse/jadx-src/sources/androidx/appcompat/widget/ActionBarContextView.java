package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;
import yyds.AbstractC0451;
import yyds.AbstractC1367;
import yyds.AbstractC1592;
import yyds.AbstractC1603;
import yyds.AbstractC1640;
import yyds.C0140;
import yyds.C0188;
import yyds.C0640;
import yyds.C1313;
import yyds.C1934;
import yyds.InterfaceC0665;
import yyds.MenuC0836;
import yyds.ViewOnClickListenerC2759;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public View f85;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C0140 f86;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public View f87;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f88;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public ActionMenuView f89;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final int f90;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public View f91;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public TextView f92;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public TextView f93;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f94;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final int f95;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f96;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public CharSequence f97;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public CharSequence f98;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f99;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final int f100;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1934 f101;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public LinearLayout f102;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C1313 f103;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Context f104;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f101 = new C1934(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f104 = context;
        } else {
            this.f104 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8112, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC1367.m2767(context, resourceId);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        setBackground(drawable);
        this.f100 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f90 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f94 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f95 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static int m34(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static int m35(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f86 != null ? this.f101.f9735 : getVisibility();
    }

    public int getContentHeight() {
        return this.f94;
    }

    public CharSequence getSubtitle() {
        return this.f98;
    }

    public CharSequence getTitle() {
        return this.f97;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1592.f8094, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1313 c1313 = this.f103;
        if (c1313 != null) {
            Configuration configuration2 = c1313.f6021.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c1313.f6008 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0836 menuC0836 = c1313.f6004;
            if (menuC0836 != null) {
                menuC0836.m1915(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1313 c1313 = this.f103;
        if (c1313 != null) {
            c1313.m2605();
            C0640 c0640 = this.f103.f6012;
            if (c0640 == null || !c0640.m3361()) {
                return;
            }
            c0640.f8390.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f99 = false;
        }
        if (!this.f99) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f99 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f99 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM3289 = AbstractC1603.m3289(this);
        int paddingRight = zM3289 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f87;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f87.getLayoutParams();
            int i5 = zM3289 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM3289 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM3289 ? paddingRight - i5 : paddingRight + i5;
            int iM34 = m34(this.f87, i7, paddingTop, paddingTop2, zM3289) + i7;
            paddingRight = zM3289 ? iM34 - i6 : iM34 + i6;
        }
        LinearLayout linearLayout = this.f102;
        if (linearLayout != null && this.f91 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m34(this.f102, paddingRight, paddingTop, paddingTop2, zM3289);
        }
        View view2 = this.f91;
        if (view2 != null) {
            m34(view2, paddingRight, paddingTop, paddingTop2, zM3289);
        }
        int paddingLeft = zM3289 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f89;
        if (actionMenuView != null) {
            m34(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM3289);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C0188.m800(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C0188.m800(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f94;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f87;
        if (view != null) {
            int iM35 = m35(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f87.getLayoutParams();
            paddingLeft = iM35 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f89;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m35(this.f89, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f102;
        if (linearLayout != null && this.f91 == null) {
            if (this.f96) {
                this.f102.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f102.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f102.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m35(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f91;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f91.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f94 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f88 = false;
        }
        if (!this.f88) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f88 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f88 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f94 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f91;
        if (view2 != null) {
            removeView(view2);
        }
        this.f91 = view;
        if (view != null && (linearLayout = this.f102) != null) {
            removeView(linearLayout);
            this.f102 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f98 = charSequence;
        m40();
    }

    public void setTitle(CharSequence charSequence) {
        this.f97 = charSequence;
        m40();
        AbstractC1640.m3342(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f96) {
            requestLayout();
        }
        this.f96 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0140 c0140 = this.f86;
            if (c0140 != null) {
                c0140.m627();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0140 m37(int i, long j) {
        C0140 c0140 = this.f86;
        if (c0140 != null) {
            c0140.m627();
        }
        C1934 c1934 = this.f101;
        if (i != 0) {
            C0140 c0140M3343 = AbstractC1640.m3343(this);
            c0140M3343.m626(0.0f);
            c0140M3343.m628(j);
            c1934.f9736.f86 = c0140M3343;
            c1934.f9735 = i;
            c0140M3343.m629(c1934);
            return c0140M3343;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0140 c0140M33432 = AbstractC1640.m3343(this);
        c0140M33432.m626(1.0f);
        c0140M33432.m628(j);
        c1934.f9736.f86 = c0140M33432;
        c1934.f9735 = i;
        c0140M33432.m629(c1934);
        return c0140M33432;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m38() {
        removeAllViews();
        this.f91 = null;
        this.f89 = null;
        this.f103 = null;
        View view = this.f85;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m39(AbstractC0451 abstractC0451) {
        View view = this.f87;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f95, (ViewGroup) this, false);
            this.f87 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f87);
        }
        View viewFindViewById = this.f87.findViewById(R.id.action_mode_close_button);
        this.f85 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC2759(i, abstractC0451));
        MenuC0836 menuC0836Mo841 = abstractC0451.mo841();
        C1313 c1313 = this.f103;
        if (c1313 != null) {
            c1313.m2605();
            C0640 c0640 = c1313.f6012;
            if (c0640 != null && c0640.m3361()) {
                c0640.f8390.dismiss();
            }
        }
        C1313 c13132 = new C1313(getContext());
        this.f103 = c13132;
        c13132.f6000 = true;
        c13132.f6007 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC0836Mo841.m1904(this.f103, this.f104);
        C1313 c13133 = this.f103;
        InterfaceC0665 interfaceC0665 = c13133.f6016;
        if (interfaceC0665 == null) {
            InterfaceC0665 interfaceC06652 = (InterfaceC0665) c13133.f6020.inflate(c13133.f6001, (ViewGroup) this, false);
            c13133.f6016 = interfaceC06652;
            interfaceC06652.mo31(c13133.f6004);
            c13133.mo1503();
        }
        InterfaceC0665 interfaceC06653 = c13133.f6016;
        if (interfaceC0665 != interfaceC06653) {
            ((ActionMenuView) interfaceC06653).setPresenter(c13133);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC06653;
        this.f89 = actionMenuView;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        actionMenuView.setBackground(null);
        addView(this.f89, layoutParams);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m40() {
        if (this.f102 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f102 = linearLayout;
            this.f93 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f92 = (TextView) this.f102.findViewById(R.id.action_bar_subtitle);
            int i = this.f100;
            if (i != 0) {
                this.f93.setTextAppearance(getContext(), i);
            }
            int i2 = this.f90;
            if (i2 != 0) {
                this.f92.setTextAppearance(getContext(), i2);
            }
        }
        this.f93.setText(this.f97);
        this.f92.setText(this.f98);
        boolean zIsEmpty = TextUtils.isEmpty(this.f97);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f98);
        this.f92.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f102.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f102.getParent() == null) {
            addView(this.f102);
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
