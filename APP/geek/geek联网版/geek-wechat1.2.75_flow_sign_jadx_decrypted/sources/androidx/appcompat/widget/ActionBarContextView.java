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
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.AbstractC0205ez;
import p000.AbstractC0259gf;
import p000.AbstractC0506n1;
import p000.C0000a;
import p000.C0208f1;
import p000.C0358j1;
import p000.InterfaceC0536nv;
import p000.MenuC0646qu;
import p000.ViewOnClickListenerC0876x0;
import p000.bb0;
import p000.hb0;
import p000.oa0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0000a f196a;

    /* JADX INFO: renamed from: b */
    public final Context f197b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f198c;

    /* JADX INFO: renamed from: d */
    public C0358j1 f199d;

    /* JADX INFO: renamed from: e */
    public int f200e;

    /* JADX INFO: renamed from: f */
    public bb0 f201f;

    /* JADX INFO: renamed from: g */
    public boolean f202g;

    /* JADX INFO: renamed from: h */
    public boolean f203h;

    /* JADX INFO: renamed from: i */
    public CharSequence f204i;

    /* JADX INFO: renamed from: j */
    public CharSequence f205j;

    /* JADX INFO: renamed from: k */
    public View f206k;

    /* JADX INFO: renamed from: l */
    public View f207l;

    /* JADX INFO: renamed from: m */
    public View f208m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f209n;

    /* JADX INFO: renamed from: o */
    public TextView f210o;

    /* JADX INFO: renamed from: p */
    public TextView f211p;

    /* JADX INFO: renamed from: q */
    public final int f212q;

    /* JADX INFO: renamed from: r */
    public final int f213r;

    /* JADX INFO: renamed from: s */
    public boolean f214s;

    /* JADX INFO: renamed from: t */
    public final int f215t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f196a = new C0000a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f197b = context;
        } else {
            this.f197b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0205ez.f1680d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0259gf.m1261w(context, resourceId);
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2669q(this, drawable);
        this.f212q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f213r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f200e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f215t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m126f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m127g(View view, int i, int i2, int i3, boolean z) {
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

    /* JADX INFO: renamed from: c */
    public final void m128c(AbstractC0506n1 abstractC0506n1) {
        View view = this.f206k;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f215t, (ViewGroup) this, false);
            this.f206k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f206k);
        }
        View viewFindViewById = this.f206k.findViewById(R.id.action_mode_close_button);
        this.f207l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0876x0(i, abstractC0506n1));
        MenuC0646qu menuC0646quMo615c = abstractC0506n1.mo615c();
        C0358j1 c0358j1 = this.f199d;
        if (c0358j1 != null) {
            c0358j1.m1560f();
            C0208f1 c0208f1 = c0358j1.f2642t;
            if (c0208f1 != null && c0208f1.m1029b()) {
                c0208f1.f1669i.dismiss();
            }
        }
        C0358j1 c0358j12 = new C0358j1(getContext());
        this.f199d = c0358j12;
        c0358j12.f2634l = true;
        c0358j12.f2635m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC0646quMo615c.m2166b(this.f199d, this.f197b);
        C0358j1 c0358j13 = this.f199d;
        InterfaceC0536nv interfaceC0536nv = c0358j13.f2630h;
        if (interfaceC0536nv == null) {
            InterfaceC0536nv interfaceC0536nv2 = (InterfaceC0536nv) c0358j13.f2626d.inflate(c0358j13.f2628f, (ViewGroup) this, false);
            c0358j13.f2630h = interfaceC0536nv2;
            interfaceC0536nv2.mo123b(c0358j13.f2625c);
            c0358j13.mo977h();
        }
        InterfaceC0536nv interfaceC0536nv3 = c0358j13.f2630h;
        if (interfaceC0536nv != interfaceC0536nv3) {
            ((ActionMenuView) interfaceC0536nv3).setPresenter(c0358j13);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0536nv3;
        this.f198c = actionMenuView;
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2669q(actionMenuView, null);
        addView(this.f198c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m129d() {
        if (this.f209n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f209n = linearLayout;
            this.f210o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f211p = (TextView) this.f209n.findViewById(R.id.action_bar_subtitle);
            int i = this.f212q;
            if (i != 0) {
                this.f210o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f213r;
            if (i2 != 0) {
                this.f211p.setTextAppearance(getContext(), i2);
            }
        }
        this.f210o.setText(this.f204i);
        this.f211p.setText(this.f205j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f204i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f205j);
        this.f211p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f209n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f209n.getParent() == null) {
            addView(this.f209n);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m130e() {
        removeAllViews();
        this.f208m = null;
        this.f198c = null;
        this.f199d = null;
        View view = this.f207l;
        if (view != null) {
            view.setOnClickListener(null);
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

    public int getAnimatedVisibility() {
        return this.f201f != null ? this.f196a.f1b : getVisibility();
    }

    public int getContentHeight() {
        return this.f200e;
    }

    public CharSequence getSubtitle() {
        return this.f205j;
    }

    public CharSequence getTitle() {
        return this.f204i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            bb0 bb0Var = this.f201f;
            if (bb0Var != null) {
                bb0Var.m508b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final bb0 m132i(int i, long j) {
        bb0 bb0Var = this.f201f;
        if (bb0Var != null) {
            bb0Var.m508b();
        }
        C0000a c0000a = this.f196a;
        if (i != 0) {
            bb0 bb0VarM2001a = oa0.m2001a(this);
            bb0VarM2001a.m507a(0.0f);
            bb0VarM2001a.m509c(j);
            c0000a.f2c.f201f = bb0VarM2001a;
            c0000a.f1b = i;
            bb0VarM2001a.m510d(c0000a);
            return bb0VarM2001a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        bb0 bb0VarM2001a2 = oa0.m2001a(this);
        bb0VarM2001a2.m507a(1.0f);
        bb0VarM2001a2.m509c(j);
        c0000a.f2c.f201f = bb0VarM2001a2;
        c0000a.f1b = i;
        bb0VarM2001a2.m510d(c0000a);
        return bb0VarM2001a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0205ez.f1677a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0358j1 c0358j1 = this.f199d;
        if (c0358j1 != null) {
            Configuration configuration2 = c0358j1.f2624b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0358j1.f2638p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0646qu menuC0646qu = c0358j1.f2625c;
            if (menuC0646qu != null) {
                menuC0646qu.m2172p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0358j1 c0358j1 = this.f199d;
        if (c0358j1 != null) {
            c0358j1.m1560f();
            C0208f1 c0208f1 = this.f199d.f2642t;
            if (c0208f1 == null || !c0208f1.m1029b()) {
                return;
            }
            c0208f1.f1669i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f203h = false;
        }
        if (!this.f203h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f203h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f203h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM1385a = hb0.m1385a(this);
        int paddingRight = zM1385a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f206k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f206k.getLayoutParams();
            int i5 = zM1385a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM1385a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM1385a ? paddingRight - i5 : paddingRight + i5;
            int iM127g = m127g(this.f206k, i7, paddingTop, paddingTop2, zM1385a) + i7;
            paddingRight = zM1385a ? iM127g - i6 : iM127g + i6;
        }
        LinearLayout linearLayout = this.f209n;
        if (linearLayout != null && this.f208m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m127g(this.f209n, paddingRight, paddingTop, paddingTop2, zM1385a);
        }
        View view2 = this.f208m;
        if (view2 != null) {
            m127g(view2, paddingRight, paddingTop, paddingTop2, zM1385a);
        }
        int paddingLeft = zM1385a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f198c;
        if (actionMenuView != null) {
            m127g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM1385a);
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
        int size2 = this.f200e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f206k;
        if (view != null) {
            int iM126f = m126f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f206k.getLayoutParams();
            paddingLeft = iM126f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f198c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m126f(this.f198c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f209n;
        if (linearLayout != null && this.f208m == null) {
            if (this.f214s) {
                this.f209n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f209n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f209n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m126f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f208m;
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
            this.f208m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f200e > 0) {
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
            this.f202g = false;
        }
        if (!this.f202g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f202g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f202g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f200e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f208m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f208m = view;
        if (view != null && (linearLayout = this.f209n) != null) {
            removeView(linearLayout);
            this.f209n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f205j = charSequence;
        m129d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f204i = charSequence;
        m129d();
        oa0.m2013m(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f214s) {
            requestLayout();
        }
        this.f214s = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
