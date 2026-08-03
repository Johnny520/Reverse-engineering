package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.InterfaceC1003k;
import androidx.appcompat.widget.C1038a;
import p000a.AbstractC0272P;
import p000a.AbstractC0773q;
import p000a.C0866ug;
import p000a.C0889w1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0773q {

    /* JADX INFO: renamed from: i */
    public CharSequence f3887i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3888j;

    /* JADX INFO: renamed from: k */
    public View f3889k;

    /* JADX INFO: renamed from: l */
    public View f3890l;

    /* JADX INFO: renamed from: m */
    public View f3891m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f3892n;

    /* JADX INFO: renamed from: o */
    public TextView f3893o;

    /* JADX INFO: renamed from: p */
    public TextView f3894p;

    /* JADX INFO: renamed from: q */
    public final int f3895q;

    /* JADX INFO: renamed from: r */
    public final int f3896r;

    /* JADX INFO: renamed from: s */
    public boolean f3897s;

    /* JADX INFO: renamed from: t */
    public final int f3898t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC1006a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0272P f3899a;

        public ViewOnClickListenerC1006a(AbstractC0272P abstractC0272P) {
            this.f3899a = abstractC0272P;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f3899a.mo761c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i = C0983R.attr.actionModeStyle;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0983R.styleable.ActionMode, i, 0);
        int i2 = C0983R.styleable.ActionMode_background;
        setBackground((!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : C0889w1.m2115A(context, resourceId));
        this.f3895q = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.ActionMode_titleTextStyle, 0);
        this.f3896r = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.ActionMode_subtitleTextStyle, 0);
        this.f3050e = typedArrayObtainStyledAttributes.getLayoutDimension(C0983R.styleable.ActionMode_height, 0);
        this.f3898t = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.ActionMode_closeItemLayout, C0983R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public final void m2348f(AbstractC0272P abstractC0272P) {
        View view = this.f3889k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f3898t, (ViewGroup) this, false);
            this.f3889k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f3889k);
        }
        View viewFindViewById = this.f3889k.findViewById(C0983R.id.action_mode_close_button);
        this.f3890l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1006a(abstractC0272P));
        C0998f c0998fMo763e = abstractC0272P.mo763e();
        C1038a c1038a = this.f3049d;
        if (c1038a != null) {
            c1038a.m2398f();
            C1038a.a aVar = c1038a.f4096t;
            if (aVar != null && aVar.m2344b()) {
                aVar.f3849i.dismiss();
            }
        }
        C1038a c1038a2 = new C1038a(getContext());
        this.f3049d = c1038a2;
        c1038a2.f4088l = true;
        c1038a2.f4089m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0998fMo763e.m2317b(this.f3049d, this.f3047b);
        C1038a c1038a3 = this.f3049d;
        InterfaceC1003k interfaceC1003k = c1038a3.f3731h;
        if (interfaceC1003k == null) {
            InterfaceC1003k interfaceC1003k2 = (InterfaceC1003k) c1038a3.f3727d.inflate(c1038a3.f3729f, (ViewGroup) this, false);
            c1038a3.f3731h = interfaceC1003k2;
            interfaceC1003k2.mo2305c(c1038a3.f3726c);
            c1038a3.mo2308g();
        }
        InterfaceC1003k interfaceC1003k3 = c1038a3.f3731h;
        if (interfaceC1003k != interfaceC1003k3) {
            ((ActionMenuView) interfaceC1003k3).setPresenter(c1038a3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1003k3;
        this.f3048c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f3048c, layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public final void m2349g() {
        if (this.f3892n == null) {
            LayoutInflater.from(getContext()).inflate(C0983R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3892n = linearLayout;
            this.f3893o = (TextView) linearLayout.findViewById(C0983R.id.action_bar_title);
            this.f3894p = (TextView) this.f3892n.findViewById(C0983R.id.action_bar_subtitle);
            int i = this.f3895q;
            if (i != 0) {
                this.f3893o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f3896r;
            if (i2 != 0) {
                this.f3894p.setTextAppearance(getContext(), i2);
            }
        }
        this.f3893o.setText(this.f3887i);
        this.f3894p.setText(this.f3888j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3887i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3888j);
        this.f3894p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3892n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3892n.getParent() == null) {
            addView(this.f3892n);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p000a.AbstractC0773q
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p000a.AbstractC0773q
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f3888j;
    }

    public CharSequence getTitle() {
        return this.f3887i;
    }

    /* JADX INFO: renamed from: h */
    public final void m2350h() {
        removeAllViews();
        this.f3891m = null;
        this.f3048c = null;
        this.f3049d = null;
        View view = this.f3890l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1038a c1038a = this.f3049d;
        if (c1038a != null) {
            c1038a.m2398f();
            C1038a.a aVar = this.f3049d.f4096t;
            if (aVar == null || !aVar.m2344b()) {
                return;
            }
            aVar.f3849i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3889k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3889k.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iM1817d = AbstractC0773q.m1817d(this.f3889k, i7, paddingTop, paddingTop2, z2) + i7;
            paddingRight = z2 ? iM1817d - i6 : iM1817d + i6;
        }
        LinearLayout linearLayout = this.f3892n;
        if (linearLayout != null && this.f3891m == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0773q.m1817d(this.f3892n, paddingRight, paddingTop, paddingTop2, z2);
        }
        View view2 = this.f3891m;
        if (view2 != null) {
            AbstractC0773q.m1817d(view2, paddingRight, paddingTop, paddingTop2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3048c;
        if (actionMenuView != null) {
            AbstractC0773q.m1817d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f3050e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f3889k;
        if (view != null) {
            int iM1816c = AbstractC0773q.m1816c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3889k.getLayoutParams();
            paddingLeft = iM1816c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3048c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC0773q.m1816c(this.f3048c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f3892n;
        if (linearLayout != null && this.f3891m == null) {
            if (this.f3897s) {
                this.f3892n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3892n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f3892n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC0773q.m1816c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f3891m;
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
            this.f3891m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f3050e > 0) {
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

    @Override // p000a.AbstractC0773q
    public void setContentHeight(int i) {
        this.f3050e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3891m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3891m = view;
        if (view != null && (linearLayout = this.f3892n) != null) {
            removeView(linearLayout);
            this.f3892n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3888j = charSequence;
        m2349g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3887i = charSequence;
        m2349g();
        C0866ug.m2004k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f3897s) {
            requestLayout();
        }
        this.f3897s = z;
    }

    @Override // p000a.AbstractC0773q, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
