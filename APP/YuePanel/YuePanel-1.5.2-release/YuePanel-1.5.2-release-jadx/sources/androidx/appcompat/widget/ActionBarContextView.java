package androidx.appcompat.widget;

import Yue.AbstractC2966;
import Yue.AbstractC3086;
import Yue.C6898;
import Yue.C7837;
import Yue.C8273;
import Yue.C8357;
import Yue.C8370;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C8694;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends AbstractC2966 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public CharSequence f26118;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public CharSequence f26119;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public View f26120;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public View f26121;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public View f26122;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public LinearLayout f26123;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public TextView f26124;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public TextView f26125;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f26126;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f26127;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean f26128;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f26129;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$ۥ */
    public class ViewOnClickListenerC1612 implements View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3086 f26130;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ViewOnClickListenerC1612(AbstractC3086 abstractC3086) {
            this.f26130 = abstractC3086;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f26130.mo174();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContextView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // Yue.AbstractC2966
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // Yue.AbstractC2966
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f26119;
    }

    public CharSequence getTitle() {
        return this.f26118;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            c1628.m29195();
            this.f4285.m29196();
        }
    }

    @Override // Yue.AbstractC2966, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM4344 = C8370.m4344(this);
        int paddingRight = zM4344 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f26120;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26120.getLayoutParams();
            int i5 = zM4344 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM4344 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM5697 = AbstractC2966.m5697(paddingRight, i5, zM4344);
            paddingRight = AbstractC2966.m5697(iM5697 + m5706(this.f26120, iM5697, paddingTop, paddingTop2, zM4344), i6, zM4344);
        }
        int iM5706 = paddingRight;
        LinearLayout linearLayout = this.f26123;
        if (linearLayout != null && this.f26122 == null && linearLayout.getVisibility() != 8) {
            iM5706 += m5706(this.f26123, iM5706, paddingTop, paddingTop2, zM4344);
        }
        int i7 = iM5706;
        View view2 = this.f26122;
        if (view2 != null) {
            m5706(view2, i7, paddingTop, paddingTop2, zM4344);
        }
        int paddingLeft = zM4344 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4284;
        if (actionMenuView != null) {
            m5706(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM4344);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f4286;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f26120;
        if (view != null) {
            int iM5705 = m5705(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26120.getLayoutParams();
            paddingLeft = iM5705 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4284;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m5705(this.f4284, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f26123;
        if (linearLayout != null && this.f26122 == null) {
            if (this.f26128) {
                this.f26123.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f26123.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f26123.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m5705(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f26122;
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
            this.f26122.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f4286 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // Yue.AbstractC2966, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // Yue.AbstractC2966
    public void setContentHeight(int i) {
        this.f4286 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f26122;
        if (view2 != null) {
            removeView(view2);
        }
        this.f26122 = view;
        if (view != null && (linearLayout = this.f26123) != null) {
            removeView(linearLayout);
            this.f26123 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f26119 = charSequence;
        m29070();
    }

    public void setTitle(CharSequence charSequence) {
        this.f26118 = charSequence;
        m29070();
        C8273.m27442(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f26128) {
            requestLayout();
        }
        this.f26128 = z;
    }

    @Override // Yue.AbstractC2966, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ void mo5698(int i) {
        super.mo5698(i);
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ boolean mo5699() {
        return super.mo5699();
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ void mo5700() {
        super.mo5700();
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo5701() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29195();
        }
        return false;
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public /* bridge */ /* synthetic */ boolean mo5702() {
        return super.mo5702();
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo5703() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29198();
        }
        return false;
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public /* bridge */ /* synthetic */ boolean mo5704() {
        return super.mo5704();
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public /* bridge */ /* synthetic */ void mo5707() {
        super.mo5707();
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public /* bridge */ /* synthetic */ C8357 mo5708(int i, long j) {
        return super.mo5708(i, j);
    }

    @Override // Yue.AbstractC2966
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo5709() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29207();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29068() {
        if (this.f26120 == null) {
            m29072();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29069(AbstractC3086 abstractC3086) {
        View view = this.f26120;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f26129, (ViewGroup) this, false);
            this.f26120 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f26120);
        }
        View viewFindViewById = this.f26120.findViewById(C6898.C6903.f18897);
        this.f26121 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1612(abstractC3086));
        C8694 c8694 = (C8694) abstractC3086.mo6271();
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            c1628.m29192();
        }
        C1628 c16282 = new C1628(getContext());
        this.f4285 = c16282;
        c16282.m29205(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c8694.addMenuPresenter(this.f4285, this.f4283);
        ActionMenuView actionMenuView = (ActionMenuView) this.f4285.getMenuView(this);
        this.f4284 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4284, layoutParams);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m29070() {
        if (this.f26123 == null) {
            LayoutInflater.from(getContext()).inflate(C6898.C6906.f2454, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f26123 = linearLayout;
            this.f26124 = (TextView) linearLayout.findViewById(C6898.C6903.f18891);
            this.f26125 = (TextView) this.f26123.findViewById(C6898.C6903.f18890);
            if (this.f26126 != 0) {
                this.f26124.setTextAppearance(getContext(), this.f26126);
            }
            if (this.f26127 != 0) {
                this.f26125.setTextAppearance(getContext(), this.f26127);
            }
        }
        this.f26124.setText(this.f26118);
        this.f26125.setText(this.f26119);
        boolean z = !TextUtils.isEmpty(this.f26118);
        boolean z2 = !TextUtils.isEmpty(this.f26119);
        this.f26125.setVisibility(z2 ? 0 : 8);
        this.f26123.setVisibility((z || z2) ? 0 : 8);
        if (this.f26123.getParent() == null) {
            addView(this.f26123);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m29071() {
        return this.f26128;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29072() {
        removeAllViews();
        this.f26122 = null;
        this.f4284 = null;
        this.f4285 = null;
        View view = this.f26121;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionBarContextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18378);
    }

    public ActionBarContextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19400, i, 0);
        setBackground(c7837M24869.m24875(C6898.C6909.f19401));
        this.f26126 = c7837M24869.m24888(C6898.C6909.f19406, 0);
        this.f26127 = c7837M24869.m24888(C6898.C6909.f19405, 0);
        this.f4286 = c7837M24869.m24884(C6898.C6909.f19404, 0);
        this.f26129 = c7837M24869.m24888(C6898.C6909.f19403, C6898.C6906.f18973);
        c7837M24869.m24899();
    }
}
