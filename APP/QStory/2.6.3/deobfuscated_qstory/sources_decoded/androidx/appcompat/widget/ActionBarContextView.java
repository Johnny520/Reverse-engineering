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
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2282;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import p188.AbstractC7773;
import p190.InterfaceC7788;
import p190.MenuC7802;
import p192.AbstractC7810;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public TextView f398;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public LinearLayout f399;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public View f400;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public View f401;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public View f402;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public CharSequence f403;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int f404;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f405;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f406;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f407;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public TextView f408;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f409;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0197 f410;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f411;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public CharSequence f412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2282 f413;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f414;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f415;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ActionMenuView f416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0190 f417;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        C0190 c0190 = new C0190();
        c0190.f743 = this;
        c0190.f744 = false;
        this.f417 = c0190;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f415 = context;
        } else {
            this.f415 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7773.f21086, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC3933.m8312(context, resourceId));
        this.f407 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f406 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f409 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f404 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m461(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m464(int i, int i2, int i3, View view, boolean z) {
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
        return this.f413 != null ? this.f417.f745 : getVisibility();
    }

    public int getContentHeight() {
        return this.f409;
    }

    public CharSequence getSubtitle() {
        return this.f403;
    }

    public CharSequence getTitle() {
        return this.f412;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC7773.f21089, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0197 c0197 = this.f410;
        if (c0197 != null) {
            Configuration configuration2 = c0197.f794.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0197.f787 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC7802 menuC7802 = c0197.f795;
            if (menuC7802 != null) {
                menuC7802.m13164(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0197 c0197 = this.f410;
        if (c0197 != null) {
            c0197.m704();
            C0203 c0203 = this.f410.f783;
            if (c0203 == null || !c0203.m13145()) {
                return;
            }
            c0203.f21195.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f411 = false;
        }
        if (!this.f411) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f411 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f411 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f402;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f402.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iM464 = m464(i7, paddingTop, paddingTop2, this.f402, z2) + i7;
            paddingRight = z2 ? iM464 - i6 : iM464 + i6;
        }
        LinearLayout linearLayout = this.f399;
        if (linearLayout != null && this.f400 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m464(paddingRight, paddingTop, paddingTop2, this.f399, z2);
        }
        View view2 = this.f400;
        if (view2 != null) {
            m464(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f416;
        if (actionMenuView != null) {
            m464(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C5925.m11311(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C5925.m11311(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f409;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f402;
        if (view != null) {
            int iM461 = m461(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f402.getLayoutParams();
            paddingLeft = iM461 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f416;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m461(this.f416, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f399;
        if (linearLayout != null && this.f400 == null) {
            if (this.f405) {
                this.f399.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f399.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f399.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m461(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f400;
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
            this.f400.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f409 > 0) {
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
            this.f414 = false;
        }
        if (!this.f414) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f414 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f414 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f409 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f400;
        if (view2 != null) {
            removeView(view2);
        }
        this.f400 = view;
        if (view != null && (linearLayout = this.f399) != null) {
            removeView(linearLayout);
            this.f399 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f403 = charSequence;
        m466();
    }

    public void setTitle(CharSequence charSequence) {
        this.f412 = charSequence;
        m466();
        AbstractC2270.m4241(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f405) {
            requestLayout();
        }
        this.f405 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m465() {
        removeAllViews();
        this.f400 = null;
        this.f416 = null;
        this.f410 = null;
        View view = this.f401;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m466() {
        if (this.f399 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f399 = linearLayout;
            this.f398 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f408 = (TextView) this.f399.findViewById(R.id.action_bar_subtitle);
            int i = this.f407;
            if (i != 0) {
                this.f398.setTextAppearance(getContext(), i);
            }
            int i2 = this.f406;
            if (i2 != 0) {
                this.f408.setTextAppearance(getContext(), i2);
            }
        }
        this.f398.setText(this.f412);
        this.f408.setText(this.f403);
        boolean zIsEmpty = TextUtils.isEmpty(this.f412);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f403);
        this.f408.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f399.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f399.getParent() == null) {
            addView(this.f399);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m467(AbstractC7810 abstractC7810) {
        View view = this.f402;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f404, (ViewGroup) this, false);
            this.f402 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f402);
        }
        View viewFindViewById = this.f402.findViewById(R.id.action_mode_close_button);
        this.f401 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0086(abstractC7810, 1));
        MenuC7802 menuC7802Mo409 = abstractC7810.mo409();
        C0197 c0197 = this.f410;
        if (c0197 != null) {
            c0197.m704();
            C0203 c0203 = c0197.f783;
            if (c0203 != null && c0203.m13145()) {
                c0203.f21195.dismiss();
            }
        }
        C0197 c01972 = new C0197(getContext());
        this.f410 = c01972;
        c01972.f779 = true;
        c01972.f778 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC7802Mo409.m13155(this.f410, this.f415);
        C0197 c01973 = this.f410;
        InterfaceC7788 interfaceC7788 = c01973.f790;
        if (interfaceC7788 == null) {
            InterfaceC7788 interfaceC77882 = (InterfaceC7788) c01973.f789.inflate(c01973.f792, (ViewGroup) this, false);
            c01973.f790 = interfaceC77882;
            interfaceC77882.mo460(c01973.f795);
            c01973.mo614();
        }
        InterfaceC7788 interfaceC77883 = c01973.f790;
        if (interfaceC7788 != interfaceC77883) {
            ((ActionMenuView) interfaceC77883).setPresenter(c01973);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC77883;
        this.f416 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f416, layoutParams);
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C2282 c2282 = this.f413;
            if (c2282 != null) {
                c2282.m4271();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2282 m469(int i, long j) {
        C2282 c2282 = this.f413;
        if (c2282 != null) {
            c2282.m4271();
        }
        C0190 c0190 = this.f417;
        if (i != 0) {
            C2282 c2282M4237 = AbstractC2270.m4237(this);
            c2282M4237.m4272(0.0f);
            c2282M4237.m4270(j);
            ((ActionBarContextView) c0190.f743).f413 = c2282M4237;
            c0190.f745 = i;
            c2282M4237.m4269(c0190);
            return c2282M4237;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2282 c2282M42372 = AbstractC2270.m4237(this);
        c2282M42372.m4272(1.0f);
        c2282M42372.m4270(j);
        ((ActionBarContextView) c0190.f743).f413 = c2282M42372;
        c0190.f745 = i;
        c2282M42372.m4269(c0190);
        return c2282M42372;
    }
}
