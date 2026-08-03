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
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;
import p057g.AbstractC0881Q0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f1101a;

    /* JADX INFO: renamed from: b */
    public boolean f1102b;

    /* JADX INFO: renamed from: c */
    public boolean f1103c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1104d;

    /* JADX INFO: renamed from: e */
    public CharSequence f1105e;

    /* JADX INFO: renamed from: f */
    public View f1106f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f1107g;

    /* JADX INFO: renamed from: h */
    public TextView f1108h;

    /* JADX INFO: renamed from: i */
    public TextView f1109i;

    /* JADX INFO: renamed from: j */
    public final int f1110j;

    /* JADX INFO: renamed from: k */
    public final int f1111k;

    /* JADX INFO: renamed from: l */
    public boolean f1112l;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, C1031R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C1031R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0550a.f1619d, C1031R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0358S.m916w(context, resourceId));
        this.f1110j = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1111k = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1101a = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, C1031R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static int m1117b(View view, int i2, int i3, int i4, boolean z2) {
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

    /* JADX INFO: renamed from: a */
    public final void m1118a() {
        if (this.f1107g == null) {
            LayoutInflater.from(getContext()).inflate(C1031R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1107g = linearLayout;
            this.f1108h = (TextView) linearLayout.findViewById(C1031R.id.action_bar_title);
            this.f1109i = (TextView) this.f1107g.findViewById(C1031R.id.action_bar_subtitle);
            int i2 = this.f1110j;
            if (i2 != 0) {
                this.f1108h.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f1111k;
            if (i3 != 0) {
                this.f1109i.setTextAppearance(getContext(), i3);
            }
        }
        this.f1108h.setText(this.f1104d);
        this.f1109i.setText(this.f1105e);
        boolean z2 = !TextUtils.isEmpty(this.f1104d);
        boolean z3 = !TextUtils.isEmpty(this.f1105e);
        this.f1109i.setVisibility(z3 ? 0 : 8);
        this.f1107g.setVisibility((z2 || z3) ? 0 : 8);
        if (this.f1107g.getParent() == null) {
            addView(this.f1107g);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
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
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1101a;
    }

    public CharSequence getSubtitle() {
        return this.f1105e;
    }

    public CharSequence getTitle() {
        return this.f1104d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0550a.f1616a, C1031R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1103c = false;
        }
        if (!this.f1103c) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1103c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1103c = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = AbstractC0881Q0.f3149a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1107g;
        if (linearLayout != null && this.f1106f == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1117b(this.f1107g, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view = this.f1106f;
        if (view != null) {
            m1117b(view, paddingRight, paddingTop, paddingTop2, z4);
        }
        if (z4) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f1101a;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f1107g;
        if (linearLayout != null && this.f1106f == null) {
            if (this.f1112l) {
                this.f1107g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1107g.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1107g.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f1106f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
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
            this.f1106f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f1101a > 0) {
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

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1102b = false;
        }
        if (!this.f1102b) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1102b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1102b = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1101a = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1106f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1106f = view;
        if (view != null && (linearLayout = this.f1107g) != null) {
            removeView(linearLayout);
            this.f1107g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1105e = charSequence;
        m1118a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1104d = charSequence;
        m1118a();
        AbstractC0080Q.m292k(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1112l) {
            requestLayout();
        }
        this.f1112l = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
