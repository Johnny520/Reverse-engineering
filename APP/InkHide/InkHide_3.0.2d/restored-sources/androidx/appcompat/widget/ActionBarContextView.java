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
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p061e.ViewOnClickListenerC0525a;
import p066g.AbstractC0561a;
import p068h.InterfaceC0577B;
import p068h.MenuC0594m;
import p069i.AbstractC0718t1;
import p069i.C0659a;
import p069i.C0677g;
import p069i.C0689k;
import p099y.AbstractC1048L;
import p099y.C1054S;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public final C0659a f954b;

    /* JADX INFO: renamed from: c */
    public final Context f955c;

    /* JADX INFO: renamed from: d */
    public ActionMenuView f956d;

    /* JADX INFO: renamed from: e */
    public C0689k f957e;

    /* JADX INFO: renamed from: f */
    public int f958f;

    /* JADX INFO: renamed from: g */
    public C1054S f959g;

    /* JADX INFO: renamed from: h */
    public boolean f960h;

    /* JADX INFO: renamed from: i */
    public boolean f961i;

    /* JADX INFO: renamed from: j */
    public CharSequence f962j;

    /* JADX INFO: renamed from: k */
    public CharSequence f963k;

    /* JADX INFO: renamed from: l */
    public View f964l;

    /* JADX INFO: renamed from: m */
    public View f965m;

    /* JADX INFO: renamed from: n */
    public View f966n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f967o;

    /* JADX INFO: renamed from: p */
    public TextView f968p;

    /* JADX INFO: renamed from: q */
    public TextView f969q;

    /* JADX INFO: renamed from: r */
    public final int f970r;

    /* JADX INFO: renamed from: s */
    public final int f971s;

    /* JADX INFO: renamed from: t */
    public boolean f972t;

    /* JADX INFO: renamed from: u */
    public final int f973u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f954b = new C0659a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f955c = context;
        } else {
            this.f955c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1640d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0503h.m992y(context, resourceId);
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        setBackground(drawable);
        this.f970r = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f971s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f958f = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f973u = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m652f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m653g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m654c(AbstractC0561a abstractC0561a) {
        int i2 = 1;
        View view = this.f964l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f973u, (ViewGroup) this, false);
            this.f964l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f964l);
        }
        View viewFindViewById = this.f964l.findViewById(R.id.action_mode_close_button);
        this.f965m = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0525a(i2, abstractC0561a));
        MenuC0594m menuC0594mMo1050c = abstractC0561a.mo1050c();
        C0689k c0689k = this.f957e;
        if (c0689k != null) {
            c0689k.m1309f();
            C0677g c0677g = c0689k.f2321u;
            if (c0677g != null && c0677g.m1206b()) {
                c0677g.f2106i.dismiss();
            }
        }
        C0689k c0689k2 = new C0689k(getContext());
        this.f957e = c0689k2;
        c0689k2.f2313m = true;
        c0689k2.f2314n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC0594mMo1050c.m1183b(this.f957e, this.f955c);
        C0689k c0689k3 = this.f957e;
        InterfaceC0577B interfaceC0577B = c0689k3.f2309i;
        if (interfaceC0577B == null) {
            InterfaceC0577B interfaceC0577B2 = (InterfaceC0577B) c0689k3.f2305e.inflate(c0689k3.f2307g, (ViewGroup) this, false);
            c0689k3.f2309i = interfaceC0577B2;
            interfaceC0577B2.mo648b(c0689k3.f2304d);
            c0689k3.mo1148c();
        }
        InterfaceC0577B interfaceC0577B3 = c0689k3.f2309i;
        if (interfaceC0577B != interfaceC0577B3) {
            ((ActionMenuView) interfaceC0577B3).setPresenter(c0689k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0577B3;
        this.f956d = actionMenuView;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        actionMenuView.setBackground(null);
        addView(this.f956d, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m655d() {
        if (this.f967o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f967o = linearLayout;
            this.f968p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f969q = (TextView) this.f967o.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f970r;
            if (i2 != 0) {
                this.f968p.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f971s;
            if (i3 != 0) {
                this.f969q.setTextAppearance(getContext(), i3);
            }
        }
        this.f968p.setText(this.f962j);
        this.f969q.setText(this.f963k);
        boolean zIsEmpty = TextUtils.isEmpty(this.f962j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f963k);
        this.f969q.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f967o.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f967o.getParent() == null) {
            addView(this.f967o);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m656e() {
        removeAllViews();
        this.f966n = null;
        this.f956d = null;
        this.f957e = null;
        View view = this.f965m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getAnimatedVisibility() {
        return this.f959g != null ? this.f954b.f2225b : getVisibility();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentHeight() {
        return this.f958f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getSubtitle() {
        return this.f963k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getTitle() {
        return this.f962j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: setVisibility(I)V */
    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            C1054S c1054s = this.f959g;
            if (c1054s != null) {
                c1054s.m2304b();
            }
            super.setVisibility(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C1054S m658i(long j2, int i2) {
        C1054S c1054s = this.f959g;
        if (c1054s != null) {
            c1054s.m2304b();
        }
        C0659a c0659a = this.f954b;
        if (i2 != 0) {
            C1054S c1054sM2282a = AbstractC1048L.m2282a(this);
            c1054sM2282a.m2303a(0.0f);
            c1054sM2282a.m2305c(j2);
            c0659a.f2226c.f959g = c1054sM2282a;
            c0659a.f2225b = i2;
            c1054sM2282a.m2306d(c0659a);
            return c1054sM2282a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1054S c1054sM2282a2 = AbstractC1048L.m2282a(this);
        c1054sM2282a2.m2303a(1.0f);
        c1054sM2282a2.m2305c(j2);
        c0659a.f2226c.f959g = c1054sM2282a2;
        c0659a.f2225b = i2;
        c1054sM2282a2.m2306d(c0659a);
        return c1054sM2282a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0515a.f1637a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0689k c0689k = this.f957e;
        if (c0689k != null) {
            Configuration configuration2 = c0689k.f2303c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c0689k.f2317q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            MenuC0594m menuC0594m = c0689k.f2304d;
            if (menuC0594m != null) {
                menuC0594m.m1189p(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0689k c0689k = this.f957e;
        if (c0689k != null) {
            c0689k.m1309f();
            C0677g c0677g = this.f957e.f2321u;
            if (c0677g == null || !c0677g.m1206b()) {
                return;
            }
            c0677g.f2106i.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f961i = false;
        }
        if (!this.f961i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f961i = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f961i = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean zM1366a = AbstractC0718t1.m1366a(this);
        int paddingRight = zM1366a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f964l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f964l.getLayoutParams();
            int i6 = zM1366a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zM1366a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = zM1366a ? paddingRight - i6 : paddingRight + i6;
            int iM653g = m653g(this.f964l, i8, paddingTop, paddingTop2, zM1366a) + i8;
            paddingRight = zM1366a ? iM653g - i7 : iM653g + i7;
        }
        LinearLayout linearLayout = this.f967o;
        if (linearLayout != null && this.f966n == null && linearLayout.getVisibility() != 8) {
            paddingRight += m653g(this.f967o, paddingRight, paddingTop, paddingTop2, zM1366a);
        }
        View view2 = this.f966n;
        if (view2 != null) {
            m653g(view2, paddingRight, paddingTop, paddingTop2, zM1366a);
        }
        int paddingLeft = zM1366a ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f956d;
        if (actionMenuView != null) {
            m653g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM1366a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f958f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f964l;
        if (view != null) {
            int iM652f = m652f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f964l.getLayoutParams();
            paddingLeft = iM652f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f956d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m652f(this.f956d, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f967o;
        if (linearLayout != null && this.f966n == null) {
            if (this.f972t) {
                this.f967o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f967o.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f967o.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m652f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f966n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f966n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f958f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f960h = false;
        }
        if (!this.f960h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f960h = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f960h = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setContentHeight(int i2) {
        this.f958f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f966n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f966n = view;
        if (view != null && (linearLayout = this.f967o) != null) {
            removeView(linearLayout);
            this.f967o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(CharSequence charSequence) {
        this.f963k = charSequence;
        m655d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        this.f962j = charSequence;
        m655d();
        AbstractC1048L.m2291j(this, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleOptional(boolean z2) {
        if (z2 != this.f972t) {
            requestLayout();
        }
        this.f972t = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
