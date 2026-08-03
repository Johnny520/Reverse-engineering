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
import io.github.cherrywechat.R;
import p000.AbstractC0345I0;
import p000.AbstractC0982Wu;
import p000.AbstractC1406fG;
import p000.AbstractC2185lE;
import p000.C0130D0;
import p000.C0273GE;
import p000.C2256n;
import p000.C2781z0;
import p000.InterfaceC0292Gr;
import p000.MenuC2204lr;
import p000.ViewOnClickListenerC2343p0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final C2256n f3725a;

    /* JADX INFO: renamed from: b */
    public final Context f3726b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f3727c;

    /* JADX INFO: renamed from: d */
    public C0130D0 f3728d;

    /* JADX INFO: renamed from: e */
    public int f3729e;

    /* JADX INFO: renamed from: f */
    public C0273GE f3730f;

    /* JADX INFO: renamed from: g */
    public boolean f3731g;

    /* JADX INFO: renamed from: h */
    public boolean f3732h;

    /* JADX INFO: renamed from: i */
    public CharSequence f3733i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3734j;

    /* JADX INFO: renamed from: k */
    public View f3735k;

    /* JADX INFO: renamed from: l */
    public View f3736l;

    /* JADX INFO: renamed from: m */
    public View f3737m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f3738n;

    /* JADX INFO: renamed from: o */
    public TextView f3739o;

    /* JADX INFO: renamed from: p */
    public TextView f3740p;

    /* JADX INFO: renamed from: q */
    public final int f3741q;

    /* JADX INFO: renamed from: r */
    public final int f3742r;

    /* JADX INFO: renamed from: s */
    public boolean f3743s;

    /* JADX INFO: renamed from: t */
    public final int f3744t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f3725a = new C2256n(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3726b = context;
        } else {
            this.f3726b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0982Wu.f3069d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC1406fG.m2695U(context, resourceId));
        this.f3741q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3742r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f3729e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f3744t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m2077f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m2078g(int i, int i2, int i3, View view, boolean z) {
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
    public final void m2079c(AbstractC0345I0 abstractC0345I0) {
        View view = this.f3735k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f3744t, (ViewGroup) this, false);
            this.f3735k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f3735k);
        }
        View viewFindViewById = this.f3735k.findViewById(R.id.action_mode_close_button);
        this.f3736l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC2343p0(0, abstractC0345I0));
        MenuC2204lr menuC2204lrMo737c = abstractC0345I0.mo737c();
        C0130D0 c0130d0 = this.f3728d;
        if (c0130d0 != null) {
            c0130d0.m214c();
            C2781z0 c2781z0 = c0130d0.f321t;
            if (c2781z0 != null && c2781z0.m5291b()) {
                c2781z0.f9323i.dismiss();
            }
        }
        C0130D0 c0130d02 = new C0130D0(getContext());
        this.f3728d = c0130d02;
        c0130d02.f313l = true;
        c0130d02.f314m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC2204lrMo737c.m4429b(this.f3728d, this.f3726b);
        C0130D0 c0130d03 = this.f3728d;
        InterfaceC0292Gr interfaceC0292Gr = c0130d03.f309h;
        if (interfaceC0292Gr == null) {
            InterfaceC0292Gr interfaceC0292Gr2 = (InterfaceC0292Gr) c0130d03.f305d.inflate(c0130d03.f307f, (ViewGroup) this, false);
            c0130d03.f309h = interfaceC0292Gr2;
            interfaceC0292Gr2.mo591b(c0130d03.f304c);
            c0130d03.mo218g();
        }
        InterfaceC0292Gr interfaceC0292Gr3 = c0130d03.f309h;
        if (interfaceC0292Gr != interfaceC0292Gr3) {
            ((ActionMenuView) interfaceC0292Gr3).setPresenter(c0130d03);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0292Gr3;
        this.f3727c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f3727c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m2080d() {
        if (this.f3738n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3738n = linearLayout;
            this.f3739o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3740p = (TextView) this.f3738n.findViewById(R.id.action_bar_subtitle);
            int i = this.f3741q;
            if (i != 0) {
                this.f3739o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f3742r;
            if (i2 != 0) {
                this.f3740p.setTextAppearance(getContext(), i2);
            }
        }
        this.f3739o.setText(this.f3733i);
        this.f3740p.setText(this.f3734j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3733i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3734j);
        this.f3740p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3738n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3738n.getParent() == null) {
            addView(this.f3738n);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2081e() {
        removeAllViews();
        this.f3737m = null;
        this.f3727c = null;
        this.f3728d = null;
        View view = this.f3736l;
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
        return this.f3730f != null ? this.f3725a.f7968b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3729e;
    }

    public CharSequence getSubtitle() {
        return this.f3734j;
    }

    public CharSequence getTitle() {
        return this.f3733i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0273GE c0273ge = this.f3730f;
            if (c0273ge != null) {
                c0273ge.m554b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C0273GE m2083i(int i, long j) {
        C0273GE c0273ge = this.f3730f;
        if (c0273ge != null) {
            c0273ge.m554b();
        }
        C2256n c2256n = this.f3725a;
        if (i != 0) {
            C0273GE c0273geM4388a = AbstractC2185lE.m4388a(this);
            c0273geM4388a.m553a(0.0f);
            c0273geM4388a.m555c(j);
            ((ActionBarContextView) c2256n.f7969c).f3730f = c0273geM4388a;
            c2256n.f7968b = i;
            c0273geM4388a.m556d(c2256n);
            return c0273geM4388a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0273GE c0273geM4388a2 = AbstractC2185lE.m4388a(this);
        c0273geM4388a2.m553a(1.0f);
        c0273geM4388a2.m555c(j);
        ((ActionBarContextView) c2256n.f7969c).f3730f = c0273geM4388a2;
        c2256n.f7968b = i;
        c0273geM4388a2.m556d(c2256n);
        return c0273geM4388a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0982Wu.f3066a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0130D0 c0130d0 = this.f3728d;
        if (c0130d0 != null) {
            Configuration configuration2 = c0130d0.f303b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0130d0.f317p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC2204lr menuC2204lr = c0130d0.f304c;
            if (menuC2204lr != null) {
                menuC2204lr.m4435p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0130D0 c0130d0 = this.f3728d;
        if (c0130d0 != null) {
            c0130d0.m214c();
            C2781z0 c2781z0 = this.f3728d.f321t;
            if (c2781z0 == null || !c2781z0.m5291b()) {
                return;
            }
            c2781z0.f9323i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3732h = false;
        }
        if (!this.f3732h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3732h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3732h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3735k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3735k.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iM2078g = m2078g(i7, paddingTop, paddingTop2, this.f3735k, z2) + i7;
            paddingRight = z2 ? iM2078g - i6 : iM2078g + i6;
        }
        LinearLayout linearLayout = this.f3738n;
        if (linearLayout != null && this.f3737m == null && linearLayout.getVisibility() != 8) {
            paddingRight += m2078g(paddingRight, paddingTop, paddingTop2, this.f3738n, z2);
        }
        View view2 = this.f3737m;
        if (view2 != null) {
            m2078g(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3727c;
        if (actionMenuView != null) {
            m2078g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
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
        int size2 = this.f3729e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f3735k;
        if (view != null) {
            int iM2077f = m2077f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3735k.getLayoutParams();
            paddingLeft = iM2077f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3727c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m2077f(this.f3727c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f3738n;
        if (linearLayout != null && this.f3737m == null) {
            if (this.f3743s) {
                this.f3738n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3738n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f3738n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m2077f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f3737m;
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
            this.f3737m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f3729e > 0) {
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
            this.f3731g = false;
        }
        if (!this.f3731g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3731g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3731g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f3729e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3737m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3737m = view;
        if (view != null && (linearLayout = this.f3738n) != null) {
            removeView(linearLayout);
            this.f3738n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3734j = charSequence;
        m2080d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3733i = charSequence;
        m2080d();
        AbstractC2185lE.m4400m(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f3743s) {
            requestLayout();
        }
        this.f3743s = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
