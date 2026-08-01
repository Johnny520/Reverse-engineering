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
import p000.AbstractC0222ff;
import p000.AbstractC0506n1;
import p000.AbstractC0910xy;
import p000.C0000a;
import p000.C0208f1;
import p000.C0358j1;
import p000.InterfaceC0238fv;
import p000.MenuC0424ku;
import p000.ViewOnClickListenerC0876x0;
import p000.cb0;
import p000.ja0;
import p000.s90;
import p000.wa0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C0000a f233a;

    /* JADX INFO: renamed from: b */
    public final Context f234b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f235c;

    /* JADX INFO: renamed from: d */
    public C0358j1 f236d;

    /* JADX INFO: renamed from: e */
    public int f237e;

    /* JADX INFO: renamed from: f */
    public wa0 f238f;

    /* JADX INFO: renamed from: g */
    public boolean f239g;

    /* JADX INFO: renamed from: h */
    public boolean f240h;

    /* JADX INFO: renamed from: i */
    public CharSequence f241i;

    /* JADX INFO: renamed from: j */
    public CharSequence f242j;

    /* JADX INFO: renamed from: k */
    public View f243k;

    /* JADX INFO: renamed from: l */
    public View f244l;

    /* JADX INFO: renamed from: m */
    public View f245m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f246n;

    /* JADX INFO: renamed from: o */
    public TextView f247o;

    /* JADX INFO: renamed from: p */
    public TextView f248p;

    /* JADX INFO: renamed from: q */
    public final int f249q;

    /* JADX INFO: renamed from: r */
    public final int f250r;

    /* JADX INFO: renamed from: s */
    public boolean f251s;

    /* JADX INFO: renamed from: t */
    public final int f252t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f233a = new C0000a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f234b = context;
        } else {
            this.f234b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0910xy.f5220d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0222ff.m1196r(context, resourceId);
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2325q(this, drawable);
        this.f249q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f250r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f237e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f252t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m141f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m142g(View view, int i, int i2, int i3, boolean z) {
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
    public final void m143c(AbstractC0506n1 abstractC0506n1) {
        View view = this.f243k;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f252t, (ViewGroup) this, false);
            this.f243k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f243k);
        }
        View viewFindViewById = this.f243k.findViewById(R.id.action_mode_close_button);
        this.f244l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0876x0(i, abstractC0506n1));
        MenuC0424ku menuC0424kuMo1884c = abstractC0506n1.mo1884c();
        C0358j1 c0358j1 = this.f236d;
        if (c0358j1 != null) {
            c0358j1.m1540f();
            C0208f1 c0208f1 = c0358j1.f2535t;
            if (c0208f1 != null && c0208f1.m2600b()) {
                c0208f1.f5031i.dismiss();
            }
        }
        C0358j1 c0358j12 = new C0358j1(getContext());
        this.f236d = c0358j12;
        c0358j12.f2527l = true;
        c0358j12.f2528m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC0424kuMo1884c.m1717b(this.f236d, this.f234b);
        C0358j1 c0358j13 = this.f236d;
        InterfaceC0238fv interfaceC0238fv = c0358j13.f2523h;
        if (interfaceC0238fv == null) {
            InterfaceC0238fv interfaceC0238fv2 = (InterfaceC0238fv) c0358j13.f2519d.inflate(c0358j13.f2521f, (ViewGroup) this, false);
            c0358j13.f2523h = interfaceC0238fv2;
            interfaceC0238fv2.mo138b(c0358j13.f2518c);
            c0358j13.mo954h();
        }
        InterfaceC0238fv interfaceC0238fv3 = c0358j13.f2523h;
        if (interfaceC0238fv != interfaceC0238fv3) {
            ((ActionMenuView) interfaceC0238fv3).setPresenter(c0358j13);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0238fv3;
        this.f235c = actionMenuView;
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2325q(actionMenuView, null);
        addView(this.f235c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m144d() {
        if (this.f246n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f246n = linearLayout;
            this.f247o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f248p = (TextView) this.f246n.findViewById(R.id.action_bar_subtitle);
            int i = this.f249q;
            if (i != 0) {
                this.f247o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f250r;
            if (i2 != 0) {
                this.f248p.setTextAppearance(getContext(), i2);
            }
        }
        this.f247o.setText(this.f241i);
        this.f248p.setText(this.f242j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f241i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f242j);
        this.f248p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f246n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f246n.getParent() == null) {
            addView(this.f246n);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m145e() {
        removeAllViews();
        this.f245m = null;
        this.f235c = null;
        this.f236d = null;
        View view = this.f244l;
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
        return this.f238f != null ? this.f233a.f1b : getVisibility();
    }

    public int getContentHeight() {
        return this.f237e;
    }

    public CharSequence getSubtitle() {
        return this.f242j;
    }

    public CharSequence getTitle() {
        return this.f241i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            wa0 wa0Var = this.f238f;
            if (wa0Var != null) {
                wa0Var.m2554b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final wa0 m147i(int i, long j) {
        wa0 wa0Var = this.f238f;
        if (wa0Var != null) {
            wa0Var.m2554b();
        }
        C0000a c0000a = this.f233a;
        if (i != 0) {
            wa0 wa0VarM1564a = ja0.m1564a(this);
            wa0VarM1564a.m2553a(0.0f);
            wa0VarM1564a.m2555c(j);
            c0000a.f2c.f238f = wa0VarM1564a;
            c0000a.f1b = i;
            wa0VarM1564a.m2556d(c0000a);
            return wa0VarM1564a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        wa0 wa0VarM1564a2 = ja0.m1564a(this);
        wa0VarM1564a2.m2553a(1.0f);
        wa0VarM1564a2.m2555c(j);
        c0000a.f2c.f238f = wa0VarM1564a2;
        c0000a.f1b = i;
        wa0VarM1564a2.m2556d(c0000a);
        return wa0VarM1564a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0910xy.f5217a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0358j1 c0358j1 = this.f236d;
        if (c0358j1 != null) {
            Configuration configuration2 = c0358j1.f2517b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0358j1.f2531p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0424ku menuC0424ku = c0358j1.f2518c;
            if (menuC0424ku != null) {
                menuC0424ku.m1723p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0358j1 c0358j1 = this.f236d;
        if (c0358j1 != null) {
            c0358j1.m1540f();
            C0208f1 c0208f1 = this.f236d.f2535t;
            if (c0208f1 == null || !c0208f1.m2600b()) {
                return;
            }
            c0208f1.f5031i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f240h = false;
        }
        if (!this.f240h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f240h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f240h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM658a = cb0.m658a(this);
        int paddingRight = zM658a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f243k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f243k.getLayoutParams();
            int i5 = zM658a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM658a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM658a ? paddingRight - i5 : paddingRight + i5;
            int iM142g = m142g(this.f243k, i7, paddingTop, paddingTop2, zM658a) + i7;
            paddingRight = zM658a ? iM142g - i6 : iM142g + i6;
        }
        LinearLayout linearLayout = this.f246n;
        if (linearLayout != null && this.f245m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m142g(this.f246n, paddingRight, paddingTop, paddingTop2, zM658a);
        }
        View view2 = this.f245m;
        if (view2 != null) {
            m142g(view2, paddingRight, paddingTop, paddingTop2, zM658a);
        }
        int paddingLeft = zM658a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f235c;
        if (actionMenuView != null) {
            m142g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM658a);
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
        int size2 = this.f237e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f243k;
        if (view != null) {
            int iM141f = m141f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f243k.getLayoutParams();
            paddingLeft = iM141f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f235c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m141f(this.f235c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f246n;
        if (linearLayout != null && this.f245m == null) {
            if (this.f251s) {
                this.f246n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f246n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f246n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m141f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f245m;
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
            this.f245m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f237e > 0) {
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
            this.f239g = false;
        }
        if (!this.f239g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f239g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f239g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f237e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f245m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f245m = view;
        if (view != null && (linearLayout = this.f246n) != null) {
            removeView(linearLayout);
            this.f246n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f242j = charSequence;
        m144d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f241i = charSequence;
        m144d();
        ja0.m1576m(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f251s) {
            requestLayout();
        }
        this.f251s = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
