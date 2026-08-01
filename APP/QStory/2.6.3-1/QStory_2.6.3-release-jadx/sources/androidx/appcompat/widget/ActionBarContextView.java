package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
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
import androidx.appcompat.app.ViewOnClickListenerC0933;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3115;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import p204.AbstractC8602;
import p206.InterfaceC8617;
import p206.MenuC8631;
import p208.AbstractC8639;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public TextView f743;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public LinearLayout f744;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f745;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public View f746;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public View f747;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public CharSequence f748;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int f749;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f750;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f751;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f752;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public TextView f753;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f754;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1044 f755;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f756;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CharSequence f757;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C3115 f758;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f759;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f760;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ActionMenuView f761;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1037 f762;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, C0328R.attr.actionModeStyle);
        C1037 c1037 = new C1037();
        c1037.f1088 = this;
        c1037.f1089 = false;
        this.f762 = c1037;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0328R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f760 = context;
        } else {
            this.f760 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21431, C0328R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC4765.m8871(context, resourceId));
        this.f752 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f751 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f754 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f749 = typedArrayObtainStyledAttributes.getResourceId(2, C0328R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m1021(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m1024(int i, int i2, int i3, View view, boolean z) {
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

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f758 != null ? this.f762.f1090 : getVisibility();
    }

    public int getContentHeight() {
        return this.f754;
    }

    public CharSequence getSubtitle() {
        return this.f748;
    }

    public CharSequence getTitle() {
        return this.f757;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC8602.f21434, C0328R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1044 c1044 = this.f755;
        if (c1044 != null) {
            Configuration configuration2 = c1044.f1139.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c1044.f1132 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC8631 menuC8631 = c1044.f1140;
            if (menuC8631 != null) {
                menuC8631.m13723(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1044 c1044 = this.f755;
        if (c1044 != null) {
            c1044.m1264();
            C1050 c1050 = this.f755.f1128;
            if (c1050 == null || !c1050.m13704()) {
                return;
            }
            c1050.f21540.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f756 = false;
        }
        if (!this.f756) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f756 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f756 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f747;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f747.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iM1024 = m1024(i7, paddingTop, paddingTop2, this.f747, z2) + i7;
            paddingRight = z2 ? iM1024 - i6 : iM1024 + i6;
        }
        LinearLayout linearLayout = this.f744;
        if (linearLayout != null && this.f745 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1024(paddingRight, paddingTop, paddingTop2, this.f744, z2);
        }
        View view2 = this.f745;
        if (view2 != null) {
            m1024(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f761;
        if (actionMenuView != null) {
            m1024(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C6755.m11870(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C6755.m11870(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f754;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f747;
        if (view != null) {
            int iM1021 = m1021(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f747.getLayoutParams();
            paddingLeft = iM1021 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f761;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1021(this.f761, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f744;
        if (linearLayout != null && this.f745 == null) {
            if (this.f750) {
                this.f744.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f744.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f744.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m1021(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f745;
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
            this.f745.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f754 > 0) {
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
            this.f759 = false;
        }
        if (!this.f759) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f759 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f759 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f754 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f745;
        if (view2 != null) {
            removeView(view2);
        }
        this.f745 = view;
        if (view != null && (linearLayout = this.f744) != null) {
            removeView(linearLayout);
            this.f744 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f748 = charSequence;
        m1026();
    }

    public void setTitle(CharSequence charSequence) {
        this.f757 = charSequence;
        m1026();
        AbstractC3103.m4801(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f750) {
            requestLayout();
        }
        this.f750 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1025() {
        removeAllViews();
        this.f745 = null;
        this.f761 = null;
        this.f755 = null;
        View view = this.f746;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1026() {
        if (this.f744 == null) {
            LayoutInflater.from(getContext()).inflate(C0328R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f744 = linearLayout;
            this.f743 = (TextView) linearLayout.findViewById(C0328R.id.action_bar_title);
            this.f753 = (TextView) this.f744.findViewById(C0328R.id.action_bar_subtitle);
            int i = this.f752;
            if (i != 0) {
                this.f743.setTextAppearance(getContext(), i);
            }
            int i2 = this.f751;
            if (i2 != 0) {
                this.f753.setTextAppearance(getContext(), i2);
            }
        }
        this.f743.setText(this.f757);
        this.f753.setText(this.f748);
        boolean zIsEmpty = TextUtils.isEmpty(this.f757);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f748);
        this.f753.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f744.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f744.getParent() == null) {
            addView(this.f744);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1027(AbstractC8639 abstractC8639) {
        View view = this.f747;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f749, (ViewGroup) this, false);
            this.f747 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f747);
        }
        View viewFindViewById = this.f747.findViewById(C0328R.id.action_mode_close_button);
        this.f746 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0933(abstractC8639, 1));
        MenuC8631 menuC8631Mo969 = abstractC8639.mo969();
        C1044 c1044 = this.f755;
        if (c1044 != null) {
            c1044.m1264();
            C1050 c1050 = c1044.f1128;
            if (c1050 != null && c1050.m13704()) {
                c1050.f21540.dismiss();
            }
        }
        C1044 c10442 = new C1044(getContext());
        this.f755 = c10442;
        c10442.f1124 = true;
        c10442.f1123 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC8631Mo969.m13714(this.f755, this.f760);
        C1044 c10443 = this.f755;
        InterfaceC8617 interfaceC8617 = c10443.f1135;
        if (interfaceC8617 == null) {
            InterfaceC8617 interfaceC86172 = (InterfaceC8617) c10443.f1134.inflate(c10443.f1137, (ViewGroup) this, false);
            c10443.f1135 = interfaceC86172;
            interfaceC86172.mo1020(c10443.f1140);
            c10443.mo1174();
        }
        InterfaceC8617 interfaceC86173 = c10443.f1135;
        if (interfaceC8617 != interfaceC86173) {
            ((ActionMenuView) interfaceC86173).setPresenter(c10443);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC86173;
        this.f761 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f761, layoutParams);
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C3115 c3115 = this.f758;
            if (c3115 != null) {
                c3115.m4831();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C3115 m1029(int i, long j) {
        C3115 c3115 = this.f758;
        if (c3115 != null) {
            c3115.m4831();
        }
        C1037 c1037 = this.f762;
        if (i != 0) {
            C3115 c3115M4797 = AbstractC3103.m4797(this);
            c3115M4797.m4832(0.0f);
            c3115M4797.m4830(j);
            ((ActionBarContextView) c1037.f1088).f758 = c3115M4797;
            c1037.f1090 = i;
            c3115M4797.m4829(c1037);
            return c3115M4797;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C3115 c3115M47972 = AbstractC3103.m4797(this);
        c3115M47972.m4832(1.0f);
        c3115M47972.m4830(j);
        ((ActionBarContextView) c1037.f1088).f758 = c3115M47972;
        c1037.f1090 = i;
        c3115M47972.m4829(c1037);
        return c3115M47972;
    }
}
