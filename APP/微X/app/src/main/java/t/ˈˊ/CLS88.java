// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import t.ˆʿ.CLS33;
import t.ﾞٴ.CLS153;

public final class CLS88 extends ViewGroup {
    public interface CLS87 {
    }

    public Drawable FLD649;
    public boolean FLD650;
    public int FLD651;
    public boolean FLD652;
    public int FLD653;
    public float FLD654;
    public OvershootInterpolator FLD655;
    public ContextThemeWrapper FLD656;
    public int FLD657;
    public boolean FLD658;
    public final AnimatorSet FLD659;
    public final Handler FLD660;
    public int FLD661;
    public int FLD662;
    public int FLD663;
    public int FLD664;
    public String FLD665;
    public int FLD666;
    public int FLD667;
    public int FLD668;
    public ValueAnimator FLD669;
    public ImageView FLD670;
    public int FLD671;
    public ColorStateList FLD672;
    public int FLD673;
    public boolean FLD674;
    public int FLD675;
    public int FLD676;
    public float FLD677;
    public CLS87 FLD678;
    public Typeface FLD679;
    public int FLD680;
    public float FLD681;
    public boolean FLD682;
    public int FLD683;
    public ValueAnimator FLD684;
    public final AnimatorSet FLD685;
    public AnticipateInterpolator FLD686;
    public boolean FLD687;
    public int FLD688;
    public int FLD689;
    public CLS86 FLD690;
    public int FLD691;
    public int FLD692;
    public int FLD693;
    public int FLD694;
    public boolean FLD695;
    public int FLD696;
    public final int FLD697;
    public int FLD698;
    public float FLD699;

    public CLS88(Context context0) {
        super(context0, null, 0);
        this.FLD659 = new AnimatorSet();
        this.FLD685 = new AnimatorSet();
        this.FLD680 = CLS92.MTH1727(this.getContext(), 0.0f);
        this.FLD698 = CLS92.MTH1727(this.getContext(), 0.0f);
        this.FLD697 = CLS92.MTH1727(this.getContext(), 0.0f);
        this.FLD660 = new Handler();
        this.FLD683 = CLS92.MTH1727(this.getContext(), 4.0f);
        this.FLD676 = CLS92.MTH1727(this.getContext(), 8.0f);
        this.FLD696 = CLS92.MTH1727(this.getContext(), 4.0f);
        this.FLD661 = CLS92.MTH1727(this.getContext(), 8.0f);
        this.FLD693 = CLS92.MTH1727(this.getContext(), 3.0f);
        this.FLD654 = 4.0f;
        this.FLD699 = 1.0f;
        this.FLD677 = 3.0f;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, CLS33.FLD457, 0, 0);
        this.FLD680 = typedArray0.getDimensionPixelSize(2, this.FLD680);
        this.FLD698 = typedArray0.getDimensionPixelSize(19, this.FLD698);
        this.FLD653 = typedArray0.getInt(26, 0);
        this.FLD683 = typedArray0.getDimensionPixelSize(25, this.FLD683);
        this.FLD676 = typedArray0.getDimensionPixelSize(24, this.FLD676);
        this.FLD696 = typedArray0.getDimensionPixelSize(22, this.FLD696);
        this.FLD661 = typedArray0.getDimensionPixelSize(23, this.FLD661);
        ColorStateList colorStateList0 = typedArray0.getColorStateList(0x1F);
        this.FLD672 = colorStateList0;
        if(colorStateList0 == null) {
            this.FLD672 = ColorStateList.valueOf(-1);
        }
        this.FLD681 = typedArray0.getDimension(0x20, TypedValue.applyDimension(2, 14.0f, context0.getResources().getDisplayMetrics()));
        this.FLD693 = typedArray0.getDimensionPixelSize(15, this.FLD693);
        this.FLD674 = typedArray0.getBoolean(28, true);
        this.FLD689 = typedArray0.getColor(12, 0xFF333333);
        this.FLD675 = typedArray0.getColor(13, -12303292);
        this.FLD691 = typedArray0.getColor(14, 0x66FFFFFF);
        this.FLD682 = typedArray0.getBoolean(38, true);
        this.FLD666 = typedArray0.getColor(34, 0x66000000);
        this.FLD654 = typedArray0.getDimension(35, this.FLD654);
        this.FLD699 = typedArray0.getDimension(36, this.FLD699);
        this.FLD677 = typedArray0.getDimension(37, this.FLD677);
        this.FLD663 = typedArray0.getColor(4, 0xFFDA4336);
        this.FLD651 = typedArray0.getColor(5, 0xFFE75043);
        this.FLD671 = typedArray0.getColor(6, 0x99FFFFFF);
        this.FLD694 = typedArray0.getInt(0, 50);
        this.FLD649 = typedArray0.getDrawable(11);
        this.FLD652 = typedArray0.getBoolean(29, false);
        this.FLD692 = typedArray0.getInt(17, 0);
        this.FLD662 = typedArray0.getInt(20, -1);
        this.FLD664 = typedArray0.getInt(10, 0);
        this.FLD667 = typedArray0.getResourceId(30, 0);
        String s = typedArray0.getString(16);
        try {
            if(!TextUtils.isEmpty(s)) {
                this.FLD679 = Typeface.createFromAsset(this.getContext().getAssets(), s);
            }
        }
        catch(RuntimeException runtimeException0) {
            throw new IllegalArgumentException("Unable to load specified custom font: " + s, runtimeException0);
        }
        this.FLD688 = typedArray0.getInt(33, 0);
        this.FLD673 = typedArray0.getColor(1, 0);
        if(typedArray0.hasValue(8)) {
            this.FLD687 = true;
            this.FLD665 = typedArray0.getString(8);
        }
        if(typedArray0.hasValue(21)) {
            int v = typedArray0.getDimensionPixelSize(21, 0);
            this.FLD683 = v;
            this.FLD676 = v;
            this.FLD696 = v;
            this.FLD661 = v;
        }
        this.FLD655 = new OvershootInterpolator();
        this.FLD686 = new AnticipateInterpolator();
        this.FLD656 = new ContextThemeWrapper(this.getContext(), this.FLD667);
        int v1 = Color.alpha(this.FLD673);
        int v2 = Color.red(this.FLD673);
        int v3 = Color.green(this.FLD673);
        int v4 = Color.blue(this.FLD673);
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, v1});
        this.FLD684 = valueAnimator0;
        valueAnimator0.setDuration(300L);
        this.FLD684.addUpdateListener(new CLS90(this, v2, v3, v4, 0));
        ValueAnimator valueAnimator1 = ValueAnimator.ofInt(new int[]{v1, 0});
        this.FLD669 = valueAnimator1;
        valueAnimator1.setDuration(300L);
        this.FLD669.addUpdateListener(new CLS90(this, v2, v3, v4, 1));
        CLS86 ˆٴ0 = new CLS86(this.getContext());
        this.FLD690 = ˆٴ0;
        ˆٴ0.FLD635 = this.FLD682;
        if(this.FLD682) {
            ˆٴ0.FLD639 = CLS92.MTH1727(this.getContext(), this.FLD654);
            CLS86 ˆٴ1 = this.FLD690;
            ˆٴ1.FLD618 = CLS92.MTH1727(this.getContext(), this.FLD699);
            CLS86 ˆٴ2 = this.FLD690;
            ˆٴ2.FLD647 = CLS92.MTH1727(this.getContext(), this.FLD677);
        }
        this.FLD690.FLD646 = this.FLD663;
        this.FLD690.FLD608 = this.FLD651;
        this.FLD690.FLD602 = this.FLD671;
        this.FLD690.FLD630 = this.FLD666;
        this.FLD690.FLD610 = this.FLD664;
        this.FLD690.MTH1686();
        this.FLD690.setLabelText(this.FLD665);
        ImageView imageView0 = new ImageView(this.getContext());
        this.FLD670 = imageView0;
        Drawable drawable0 = this.FLD649;
        if(drawable0 != null) {
            imageView0.setImageDrawable(drawable0);
        }
        this.addView(this.FLD690, super.generateDefaultLayoutParams());
        this.addView(this.FLD670);
        this.MTH1718();
        this.setMenuButtonShowAnimation(CLS92.MTH1728("fab_scale_up"));
        this.setMenuButtonHideAnimation(CLS92.MTH1728("fab_scale_down"));
        typedArray0.recycle();
    }

    @Override  // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams;
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new ViewGroup.MarginLayoutParams(viewGroup$LayoutParams0);
    }

    public CLS86 getMenuButton() {
        return this.FLD690;
    }

    public ImageView getMenuIconView() {
        return this.FLD670;
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.MTH1720();
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4;
        if(this.FLD653 == 0) {
            v4 = v2 - v - this.FLD668 / 2 - this.getPaddingRight();
        }
        else {
            int v5 = this.FLD668 / 2;
            v4 = this.getPaddingLeft() + v5;
        }
        boolean z1 = this.FLD688 == 0;
        int v6 = z1 ? v3 - v1 - this.FLD690.getMeasuredHeight() - this.getPaddingBottom() : this.getPaddingTop();
        int v7 = v4 - this.FLD690.getMeasuredWidth() / 2;
        this.FLD690.layout(v7, v6, this.FLD690.getMeasuredWidth() + v7, this.FLD690.getMeasuredHeight() + v6);
        int v8 = v4 - this.FLD670.getMeasuredWidth() / 2;
        int v9 = this.FLD690.getMeasuredHeight() / 2 + v6 - this.FLD670.getMeasuredHeight() / 2;
        this.FLD670.layout(v8, v9, this.FLD670.getMeasuredWidth() + v8, this.FLD670.getMeasuredHeight() + v9);
        if(z1) {
            int v10 = this.FLD690.getMeasuredHeight();
            v6 = this.FLD680 + (v10 + v6);
        }
        for(int v11 = this.FLD657 - 1; v11 >= 0; --v11) {
            View view0 = this.getChildAt(v11);
            if(view0 != this.FLD670 && ((CLS86)view0).getVisibility() != 8) {
                int v12 = v4 - ((CLS86)view0).getMeasuredWidth() / 2;
                if(z1) {
                    v6 = v6 - ((CLS86)view0).getMeasuredHeight() - this.FLD680;
                }
                if(((CLS86)view0) != this.FLD690) {
                    ((CLS86)view0).layout(v12, v6, ((CLS86)view0).getMeasuredWidth() + v12, ((CLS86)view0).getMeasuredHeight() + v6);
                    if(!this.FLD650) {
                        ((CLS86)view0).MTH1694(false);
                    }
                }
                View view1 = (View)((CLS86)view0).getTag(0x7F02000C);
                if(view1 != null) {
                    int v13 = (this.FLD687 ? this.FLD668 : ((CLS86)view0).getMeasuredWidth()) / 2 + this.FLD698;
                    int v14 = this.FLD653 == 0 ? v4 - v13 : v13 + v4;
                    int v15 = this.FLD653 == 0 ? v14 - view1.getMeasuredWidth() : view1.getMeasuredWidth() + v14;
                    int v16 = this.FLD653 == 0 ? v15 : v14;
                    if(this.FLD653 != 0) {
                        v14 = v15;
                    }
                    int v17 = (((CLS86)view0).getMeasuredHeight() - view1.getMeasuredHeight()) / 2 + (v6 - this.FLD697);
                    view1.layout(v16, v17, v14, view1.getMeasuredHeight() + v17);
                    if(!this.FLD650) {
                        view1.setVisibility(4);
                    }
                }
                if(z1) {
                    v6 -= this.FLD680;
                }
                else {
                    int v18 = view0.getMeasuredHeight();
                    v6 = this.FLD680 + (v18 + v6);
                }
            }
        }
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.FLD668 = 0;
        this.measureChildWithMargins(this.FLD670, v, 0, v1, 0);
        for(int v2 = 0; v2 < this.FLD657; ++v2) {
            View view0 = this.getChildAt(v2);
            if(view0.getVisibility() != 8 && view0 != this.FLD670) {
                this.measureChildWithMargins(view0, v, 0, v1, 0);
                this.FLD668 = Math.max(this.FLD668, view0.getMeasuredWidth());
            }
        }
        int v3 = 0;
        int v5 = 0;
        for(int v4 = 0; true; ++v4) {
            int v6 = 1;
            if(v4 >= this.FLD657) {
                break;
            }
            View view1 = this.getChildAt(v4);
            if(view1.getVisibility() != 8 && view1 != this.FLD670) {
                int v7 = view1.getMeasuredWidth();
                int v8 = view1.getMeasuredHeight();
                CLS96 ﾞᐧ0 = (CLS96)view1.getTag(0x7F02000C);
                if(ﾞᐧ0 != null) {
                    int v9 = this.FLD668;
                    int v10 = view1.getMeasuredWidth();
                    if(!this.FLD687) {
                        v6 = 2;
                    }
                    int v11 = (v9 - v10) / v6;
                    int v12 = view1.getMeasuredWidth();
                    this.measureChildWithMargins(ﾞᐧ0, v, (ﾞᐧ0.FLD733 ? Math.abs(ﾞᐧ0.FLD728) + ﾞᐧ0.FLD718 : 0) + v12 + this.FLD698 + v11, v1, 0);
                    v5 = Math.max(v5, ﾞᐧ0.getMeasuredWidth() + v7 + v11);
                }
                v3 = v8 + v3;
            }
        }
        int v13 = Math.max(this.FLD668, v5 + this.FLD698);
        int v14 = this.getPaddingLeft();
        int v15 = this.getPaddingRight() + (v14 + v13);
        int v16 = (this.FLD657 - 1) * this.FLD680;
        int v17 = this.getPaddingTop();
        double f = (double)(this.getPaddingBottom() + (v17 + v16) + v3);
        int v18 = (int)(0.03 * f + f);
        if(this.getLayoutParams().width == -1) {
            v15 = View.getDefaultSize(this.getSuggestedMinimumWidth(), v);
        }
        if(this.getLayoutParams().height == -1) {
            v18 = View.getDefaultSize(this.getSuggestedMinimumHeight(), v1);
        }
        this.setMeasuredDimension(v15, v18);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.FLD695) {
            switch(motionEvent0.getAction()) {
                case 0: {
                    return this.FLD658;
                }
                case 1: {
                    this.MTH1719(true);
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    public void setClosedOnTouchOutside(boolean z) {
        this.FLD695 = z;
    }

    private void setLabelEllipsize(CLS96 ﾞᐧ0) {
        TextUtils.TruncateAt textUtils$TruncateAt0;
        switch(this.FLD692) {
            case 1: {
                textUtils$TruncateAt0 = TextUtils.TruncateAt.START;
                break;
            }
            case 2: {
                textUtils$TruncateAt0 = TextUtils.TruncateAt.MIDDLE;
                break;
            }
            case 3: {
                textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
                break;
            }
            case 4: {
                textUtils$TruncateAt0 = TextUtils.TruncateAt.MARQUEE;
                break;
            }
            default: {
                return;
            }
        }
        ﾞᐧ0.setEllipsize(textUtils$TruncateAt0);
    }

    public void setLabelPosition(int v) {
        this.FLD653 = v;
    }

    public void setMenuButtonColorNormal(int v) {
        this.FLD663 = v;
        this.FLD690.setColorNormal(v);
    }

    public void setMenuButtonColorPressed(int v) {
        this.FLD651 = v;
        this.FLD690.setColorPressed(v);
    }

    public void setMenuButtonHideAnimation(Animation animation0) {
        if(animation0 == null) {
            return;
        }
        this.FLD690.setHideAnimation(animation0);
    }

    public void setMenuButtonShowAnimation(Animation animation0) {
        if(animation0 == null) {
            return;
        }
        this.FLD690.setShowAnimation(animation0);
    }

    public void setMenuIcon(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        this.FLD649 = drawable0;
        this.getMenuIconView().setImageDrawable(drawable0);
    }

    public void setOnMenuToggleListener(CLS87 ˊﾞ$ˆٴ0) {
        this.FLD678 = ˊﾞ$ˆٴ0;
    }

    public void setOpenDirection(int v) {
        this.FLD688 = v;
        this.MTH1718();
    }

    public final void MTH1717(CLS86 ˆٴ0) {
        String s = ˆٴ0.getLabelText();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS96 ﾞᐧ0 = new CLS96(this.FLD656);
        ﾞᐧ0.setClickable(true);
        ﾞᐧ0.setFab(ˆٴ0);
        ﾞᐧ0.setShowAnimation(CLS92.MTH1728((this.FLD653 == 0 ? "fab_slide_in_from_right" : "fab_slide_in_from_left")));
        ﾞᐧ0.setHideAnimation(CLS92.MTH1728((this.FLD653 == 0 ? "fab_slide_out_to_right" : "fab_slide_out_to_left")));
        if(this.FLD667 > 0) {
            ﾞᐧ0.setTextAppearance(this.getContext(), this.FLD667);
            ﾞᐧ0.setShowShadow(false);
            ﾞᐧ0.setUsingStyle(true);
        }
        else {
            ﾞᐧ0.FLD717 = this.FLD689;
            ﾞᐧ0.FLD715 = this.FLD675;
            ﾞᐧ0.FLD719 = this.FLD691;
            ﾞᐧ0.setShowShadow(this.FLD674);
            ﾞᐧ0.setCornerRadius(this.FLD693);
            if(this.FLD692 > 0) {
                this.setLabelEllipsize(ﾞᐧ0);
            }
            ﾞᐧ0.setMaxLines(this.FLD662);
            ﾞᐧ0.MTH1754();
            ﾞᐧ0.setTextSize(0, this.FLD681);
            ﾞᐧ0.setTextColor(this.FLD672);
            int v = this.FLD661;
            int v1 = this.FLD683;
            if(this.FLD674) {
                v += Math.abs(ˆٴ0.getShadowXOffset()) + ˆٴ0.getShadowRadius();
                v1 += Math.abs(ˆٴ0.getShadowYOffset()) + ˆٴ0.getShadowRadius();
            }
            ﾞᐧ0.setPadding(v, v1, this.FLD661, this.FLD683);
            if(this.FLD662 < 0 || this.FLD652) {
                ﾞᐧ0.setSingleLine(this.FLD652);
            }
        }
        Typeface typeface0 = this.FLD679;
        if(typeface0 != null) {
            ﾞᐧ0.setTypeface(typeface0);
        }
        ﾞᐧ0.setText(s);
        ﾞᐧ0.setOnClickListener(ˆٴ0.getOnClickListener());
        ﾞᐧ0.setTextColor(ˆٴ0.getLabelTextColor());
        this.addView(ﾞᐧ0);
        ˆٴ0.setTag(0x7F02000C, ﾞᐧ0);
    }

    public final void MTH1718() {
        float f1;
        float f = -135.0f;
        if(this.FLD688 == 0) {
            f1 = this.FLD653 == 0 ? -135.0f : 135.0f;
            if(this.FLD653 != 0) {
                f = 135.0f;
            }
        }
        else {
            f1 = this.FLD653 == 0 ? 135.0f : -135.0f;
            if(this.FLD653 == 0) {
                f = 135.0f;
            }
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.FLD670, "rotation", new float[]{f1, 0.0f});
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.FLD670, "rotation", new float[]{0.0f, f});
        this.FLD659.play(objectAnimator1);
        this.FLD685.play(objectAnimator0);
        this.FLD659.setInterpolator(this.FLD655);
        this.FLD685.setInterpolator(this.FLD686);
        this.FLD659.setDuration(300L);
        this.FLD685.setDuration(300L);
    }

    public final void MTH1719(boolean z) {
        Handler handler0;
        if(this.FLD658) {
            if(this.FLD673 != 0) {
                this.FLD669.start();
            }
            AnimatorSet animatorSet0 = this.FLD685;
            if(animatorSet0 != null) {
                animatorSet0.start();
            }
            AnimatorSet animatorSet1 = this.FLD659;
            if(animatorSet1 != null) {
                animatorSet1.cancel();
            }
            this.FLD650 = false;
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; true; ++v) {
                int v3 = this.getChildCount();
                handler0 = this.FLD660;
                if(v >= v3) {
                    break;
                }
                View view0 = this.getChildAt(v);
                if(view0 instanceof CLS86 && view0.getVisibility() != 8) {
                    ++v1;
                    handler0.postDelayed(new CLS89(this, ((CLS86)view0), z, 0), ((long)v2));
                    v2 += this.FLD694;
                }
            }
            handler0.postDelayed(new CLS91(this, 0), ((long)((v1 + 1) * this.FLD694)));
        }
    }

    public final void MTH1720() {
        this.bringChildToFront(this.FLD690);
        this.bringChildToFront(this.FLD670);
        this.FLD657 = this.getChildCount();
        for(int v = 0; v < this.FLD657; ++v) {
            if(this.getChildAt(v) != this.FLD670) {
                CLS86 ˆٴ0 = (CLS86)this.getChildAt(v);
                if(ˆٴ0.getTag(0x7F02000C) == null) {
                    this.MTH1717(ˆٴ0);
                    CLS86 ˆٴ1 = this.FLD690;
                    if(ˆٴ0 == ˆٴ1) {
                        ˆٴ1.setOnClickListener(new CLS153(this, 4));
                    }
                }
            }
        }
    }
}

