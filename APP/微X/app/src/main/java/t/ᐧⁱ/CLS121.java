// Decompiled by JEB v5.42.0.202606242140

package t.ᐧⁱ;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import t.ˆʿ.CLS33;
import t.ـˏ.CLS115;
import t.ـˏ.CLS116;
import t.ﾞˎ.CLS149;
import t.ﾞٴ.CLS153;

public final class CLS121 extends FrameLayout implements ValueAnimator.AnimatorUpdateListener {
    public final class CLS118 {
        public float FLD843;
        public float FLD844;

        public CLS118() {
            super();
        }
    }

    public final class CLS119 {
        public TextView FLD845;
        public CLS149 FLD846;
        public ImageView FLD847;
        public int FLD848;

        public CLS119() {
            super();
        }
    }

    public final class CLS120 implements TypeEvaluator {
        @Override  // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object object0, Object object1) {
            float f1 = ((CLS118)object0).FLD843;
            float f2 = (((CLS118)object1).FLD843 - f1) * f + f1;
            float f3 = ((CLS118)object0).FLD844;
            float f4 = (((CLS118)object1).FLD844 - f3) * f + f3;
            CLS118 ˆٴ$ˆٴ0 = new CLS118();
            ˆٴ$ˆٴ0.FLD843 = f2;
            ˆٴ$ˆٴ0.FLD844 = f4;
            return ˆٴ$ˆٴ0;
        }
    }

    public int FLD849;
    public final Paint FLD850;
    public int FLD851;
    public float FLD852;
    public int FLD853;
    public long FLD854;
    public float FLD855;
    public int FLD856;
    public CLS116 FLD857;
    public final GradientDrawable FLD858;
    public final Paint FLD859;
    public final Context FLD860;
    public final Paint FLD861;
    public boolean FLD862;
    public int FLD863;
    public int FLD864;
    public int FLD865;
    public int FLD866;
    public float FLD867;
    public boolean FLD868;
    public int FLD869;
    public float FLD870;
    public float FLD871;
    public float FLD872;
    public float FLD873;
    public int FLD874;
    public float FLD875;
    public float FLD876;
    public static final AtomicInteger FLD877;
    public int FLD878;
    public boolean FLD879;
    public final ValueAnimator FLD880;
    public boolean FLD881;
    public final LinearLayout FLD882;
    public int FLD883;
    public float FLD884;
    public final Path FLD885;
    public final LinearInterpolator FLD886;
    public boolean FLD887;
    public final ArrayList FLD888;
    public float FLD889;
    public final CLS118 FLD890;
    public int FLD891;
    public final CLS118 FLD892;
    public float FLD893;
    public float FLD894;
    public int FLD895;
    public float FLD896;
    public final SparseArray FLD897;
    public int FLD898;
    public float FLD899;
    public int FLD900;
    public float FLD901;
    public float FLD902;
    public final Rect FLD903;
    public int FLD904;
    public boolean FLD905;

    static {
        CLS121.FLD877 = new AtomicInteger(1);
    }

    public CLS121(Context context0) {
        super(context0, null, 0);
        this.FLD888 = new ArrayList();
        this.FLD903 = new Rect();
        this.FLD858 = new GradientDrawable();
        this.FLD859 = new Paint(1);
        this.FLD850 = new Paint(1);
        this.FLD861 = new Paint(1);
        this.FLD885 = new Path();
        this.FLD878 = 0;
        this.FLD886 = new LinearInterpolator();
        this.FLD870 = 0.0f;
        this.FLD874 = -1;
        this.FLD853 = 0xFF000000;
        this.FLD856 = -1;
        this.FLD866 = 0xFF888888;
        this.FLD891 = -1;
        this.FLD887 = true;
        new Paint(1);
        this.FLD897 = new SparseArray();
        CLS118 ˆٴ$ˆٴ0 = new CLS118();
        this.FLD890 = ˆٴ$ˆٴ0;
        CLS118 ˆٴ$ˆٴ1 = new CLS118();
        this.FLD892 = ˆٴ$ˆٴ1;
        this.setWillNotDraw(false);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.FLD860 = context0;
        LinearLayout linearLayout0 = new LinearLayout(context0);
        this.FLD882 = linearLayout0;
        this.addView(linearLayout0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, CLS33.FLD456, 0, 0);
        int v = typedArray0.getInt(19, 0);
        this.FLD878 = v;
        this.FLD883 = typedArray0.getColor(11, Color.parseColor((v == 2 ? "#4B6A87" : "#ffffff")));
        this.FLD899 = typedArray0.getDimension(14, ((float)this.MTH1990((this.FLD878 == 1 ? 4.0f : ((float)(this.FLD878 == 2 ? -1 : 2))))));
        this.FLD875 = typedArray0.getDimension(20, ((float)this.MTH1990((this.FLD878 == 1 ? 10.0f : -1.0f))));
        this.FLD894 = typedArray0.getDimension(12, ((float)this.MTH1990((this.FLD878 == 2 ? -1.0f : 0.0f))));
        this.FLD876 = typedArray0.getDimension(16, ((float)this.MTH1990(0.0f)));
        float f = 7.0f;
        this.FLD896 = typedArray0.getDimension(18, ((float)this.MTH1990((this.FLD878 == 2 ? 7.0f : 0.0f))));
        this.FLD884 = typedArray0.getDimension(17, ((float)this.MTH1990(0.0f)));
        if(this.FLD878 != 2) {
            f = 0.0f;
        }
        this.FLD867 = typedArray0.getDimension(15, ((float)this.MTH1990(f)));
        this.FLD905 = typedArray0.getBoolean(9, true);
        this.FLD879 = typedArray0.getBoolean(10, true);
        this.FLD854 = (long)typedArray0.getInt(8, -1);
        this.FLD864 = typedArray0.getInt(13, 80);
        this.FLD851 = typedArray0.getColor(29, Color.parseColor("#ffffff"));
        this.FLD872 = typedArray0.getDimension(0x1F, ((float)this.MTH1990(0.0f)));
        this.FLD849 = typedArray0.getInt(30, 80);
        this.FLD900 = typedArray0.getColor(0, Color.parseColor("#ffffff"));
        this.FLD855 = typedArray0.getDimension(2, ((float)this.MTH1990(0.0f)));
        this.FLD889 = typedArray0.getDimension(1, ((float)this.MTH1990(12.0f)));
        this.FLD852 = typedArray0.getDimension(28, ((float)(((int)(13.0f * context0.getResources().getDisplayMetrics().scaledDensity + 0.5f)))));
        this.FLD898 = typedArray0.getColor(26, Color.parseColor("#ffffff"));
        this.FLD863 = typedArray0.getColor(27, Color.parseColor("#AAffffff"));
        this.FLD865 = typedArray0.getInt(25, 0);
        this.FLD868 = typedArray0.getBoolean(24, false);
        this.FLD881 = typedArray0.getBoolean(6, true);
        this.FLD871 = typedArray0.getDimension(7, ((float)this.MTH1990(0.0f)));
        this.FLD901 = typedArray0.getDimension(4, ((float)this.MTH1990(0.0f)));
        this.FLD893 = typedArray0.getDimension(5, ((float)this.MTH1990(2.5f)));
        this.FLD862 = typedArray0.getBoolean(22, true);
        float f1 = typedArray0.getDimension(23, ((float)this.MTH1990(-1.0f)));
        this.FLD873 = f1;
        this.FLD902 = typedArray0.getDimension(21, ((float)(this.FLD862 || f1 > 0.0f ? this.MTH1990(0.0f) : this.MTH1990(10.0f))));
        typedArray0.recycle();
        ValueAnimator valueAnimator0 = ValueAnimator.ofObject(new CLS120(this), new Object[]{ˆٴ$ˆٴ1, ˆٴ$ˆٴ0});
        this.FLD880 = valueAnimator0;
        valueAnimator0.addUpdateListener(this);
    }

    @Override  // android.view.View
    public static int generateViewId() {
        int v;
        if(Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            v = CLS121.FLD877.get();
        }
        while(!CLS121.FLD877.compareAndSet(v, (v + 1 <= 0xFFFFFF ? v + 1 : 1)));
        return v;
    }

    public int getCurrentTab() {
        return this.FLD895;
    }

    public int getDividerColor() {
        return this.FLD900;
    }

    public float getDividerPadding() {
        return this.FLD889;
    }

    public float getDividerWidth() {
        return this.FLD855;
    }

    public float getIconHeight() {
        return this.FLD901;
    }

    public float getIconMargin() {
        return this.FLD893;
    }

    public float getIconWidth() {
        return this.FLD871;
    }

    public long getIndicatorAnimDuration() {
        return this.FLD854;
    }

    public int getIndicatorColor() {
        return this.FLD883;
    }

    public float getIndicatorCornerRadius() {
        return this.FLD894;
    }

    public float getIndicatorHeight() {
        return this.FLD899;
    }

    public float getIndicatorMarginBottom() {
        return this.FLD867;
    }

    public float getIndicatorMarginLeft() {
        return this.FLD876;
    }

    public float getIndicatorMarginRight() {
        return this.FLD884;
    }

    public float getIndicatorMarginTop() {
        return this.FLD896;
    }

    public float getIndicatorOffset() {
        return this.FLD870;
    }

    public int getIndicatorStyle() {
        return this.FLD878;
    }

    public float getIndicatorWidth() {
        return this.FLD875;
    }

    public int getSelectIconColor() {
        return this.FLD891;
    }

    public int getStartScrollPosition() {
        return this.FLD874;
    }

    public int getTabCount() {
        return this.FLD904;
    }

    public float getTabPadding() {
        return this.FLD902;
    }

    public List getTabViews() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            LinearLayout linearLayout0 = this.FLD882;
            if(v >= linearLayout0.getChildCount()) {
                break;
            }
            View view0 = linearLayout0.getChildAt(v);
            view0.setTag(v);
            arrayList0.add(view0);
        }
        return arrayList0;
    }

    public float getTabWidth() {
        return this.FLD873;
    }

    public int getTextBold() {
        return this.FLD865;
    }

    public int getTextSelectColor() {
        return this.FLD898;
    }

    public int getTextUnselectColor() {
        return this.FLD863;
    }

    public float getTextsize() {
        return this.FLD852;
    }

    public int getUnSelectIconColor() {
        return this.FLD866;
    }

    public int getUnderlineColor() {
        return this.FLD851;
    }

    public float getUnderlineHeight() {
        return this.FLD872;
    }

    public int getUnreadBackground() {
        return this.FLD853;
    }

    public int getUnreadTextColor() {
        return this.FLD856;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        View view0 = this.FLD882.getChildAt(this.FLD895);
        CLS118 ˆٴ$ˆٴ0 = (CLS118)valueAnimator0.getAnimatedValue();
        float f = ˆٴ$ˆٴ0.FLD843;
        Rect rect0 = this.FLD903;
        rect0.left = (int)f;
        rect0.right = (int)ˆٴ$ˆٴ0.FLD844;
        if(this.FLD875 >= 0.0f) {
            int v = (int)((((float)view0.getWidth()) - this.FLD875) / 2.0f + f);
            rect0.left = v;
            rect0.right = (int)(((float)v) + this.FLD875);
        }
        this.invalidate();
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        float f3;
        float f2;
        float f1;
        super.onDraw(canvas0);
        if(!this.isInEditMode() && this.FLD904 > 0) {
            int v = this.getHeight();
            int v1 = this.getPaddingLeft();
            float f = this.FLD855;
            LinearLayout linearLayout0 = this.FLD882;
            if(f > 0.0f) {
                Paint paint0 = this.FLD850;
                paint0.setStrokeWidth(f);
                paint0.setColor(this.FLD900);
                for(int v2 = 0; v2 < this.FLD904 - 1; ++v2) {
                    View view0 = linearLayout0.getChildAt(v2);
                    canvas0.drawLine(((float)(view0.getRight() + v1)), this.FLD889, ((float)(view0.getRight() + v1)), ((float)v) - this.FLD889, paint0);
                }
            }
            if(this.FLD872 > 0.0f) {
                Paint paint1 = this.FLD859;
                paint1.setColor(this.FLD851);
                if(this.FLD849 == 80) {
                    f1 = (float)v;
                    f2 = f1 - this.FLD872;
                    f3 = (float)(linearLayout0.getWidth() + v1);
                }
                else {
                    f2 = 0.0f;
                    f3 = (float)(linearLayout0.getWidth() + v1);
                    f1 = this.FLD872;
                }
                canvas0.drawRect(((float)v1), f2, f3, f1, paint1);
            }
            if(this.FLD905 && this.FLD887) {
                this.FLD887 = false;
            }
            if(this.FLD870 < 0.0f || this.FLD874 < 0) {
                this.FLD874 = this.FLD895;
            }
            View view1 = linearLayout0.getChildAt(this.FLD874);
            float f4 = (float)view1.getLeft();
            float f5 = (float)view1.getRight();
            Rect rect0 = this.FLD903;
            rect0.left = (int)f4;
            rect0.right = (int)f5;
            int v3 = view1.getWidth();
            if(this.FLD875 >= 0.0f) {
                float f6 = (float)view1.getLeft();
                int v4 = (int)((((float)v3) - this.FLD875) / 2.0f + f6);
                rect0.left = v4;
                rect0.right = (int)(((float)v4) + this.FLD875);
            }
            float f7 = ((float)v3) * this.FLD870;
            rect0.left = (int)(((float)rect0.left) + f7);
            rect0.right = (int)(f7 + ((float)rect0.right));
            int v5 = this.FLD878;
            if(v5 != 1) {
                GradientDrawable gradientDrawable0 = this.FLD858;
                if(v5 == 2) {
                    if(this.FLD899 < 0.0f) {
                        this.FLD899 = ((float)v) - this.FLD896 - this.FLD867;
                    }
                    float f8 = this.FLD899;
                    if(f8 > 0.0f) {
                        if(this.FLD894 < 0.0f || this.FLD894 > f8 / 2.0f) {
                            this.FLD894 = f8 / 2.0f;
                        }
                        gradientDrawable0.setColor(this.FLD883);
                        gradientDrawable0.setBounds(((int)this.FLD876) + v1 + rect0.left, ((int)this.FLD896), ((int)(((float)(v1 + rect0.right)) - this.FLD884)), ((int)(this.FLD896 + this.FLD899)));
                        gradientDrawable0.setCornerRadius(this.FLD894);
                        gradientDrawable0.draw(canvas0);
                    }
                }
                else if(this.FLD899 > 0.0f) {
                    gradientDrawable0.setColor(this.FLD883);
                    if(this.FLD864 == 80) {
                        gradientDrawable0.setBounds(((int)this.FLD876) + v1 + rect0.left, v - ((int)this.FLD899) - ((int)this.FLD867), v1 + rect0.right - ((int)this.FLD884), v - ((int)this.FLD867));
                    }
                    else {
                        gradientDrawable0.setBounds(((int)this.FLD876) + v1 + rect0.left, ((int)this.FLD896), v1 + rect0.right - ((int)this.FLD884), ((int)this.FLD899) + ((int)this.FLD896));
                    }
                    gradientDrawable0.setCornerRadius(this.FLD894);
                    gradientDrawable0.draw(canvas0);
                }
            }
            else if(this.FLD899 > 0.0f) {
                this.FLD861.setColor(this.FLD883);
                this.FLD885.reset();
                this.FLD885.moveTo(((float)(rect0.left + v1)), ((float)v));
                this.FLD885.lineTo(((float)(rect0.right / 2 + (rect0.left / 2 + v1))), ((float)v) - this.FLD899);
                this.FLD885.lineTo(((float)(v1 + rect0.right)), ((float)v));
                this.FLD885.close();
                canvas0.drawPath(this.FLD885, this.FLD861);
            }
        }
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            this.FLD895 = ((Bundle)parcelable0).getInt("mCurrentTab");
            parcelable0 = ((Bundle)parcelable0).getParcelable("instanceState");
            if(this.FLD895 != 0 && this.FLD882.getChildCount() > 0) {
                this.MTH1991(this.FLD895);
            }
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("instanceState", super.onSaveInstanceState());
        bundle0.putInt("mCurrentTab", this.FLD895);
        return bundle0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
    }

    public void setCurrentTab(int v) {
        this.FLD869 = this.FLD895;
        this.FLD874 = v;
        this.FLD895 = v;
        this.MTH1991(v);
        if(this.FLD905) {
            View view0 = this.FLD882.getChildAt(this.FLD895);
            float f = (float)view0.getLeft();
            CLS118 ˆٴ$ˆٴ0 = this.FLD890;
            ˆٴ$ˆٴ0.FLD843 = f;
            ˆٴ$ˆٴ0.FLD844 = (float)view0.getRight();
            View view1 = this.FLD882.getChildAt(this.FLD869);
            float f1 = (float)view1.getLeft();
            CLS118 ˆٴ$ˆٴ1 = this.FLD892;
            ˆٴ$ˆٴ1.FLD843 = f1;
            float f2 = (float)view1.getRight();
            ˆٴ$ˆٴ1.FLD844 = f2;
            if(ˆٴ$ˆٴ1.FLD843 == ˆٴ$ˆٴ0.FLD843 && f2 == ˆٴ$ˆٴ0.FLD844) {
                this.invalidate();
                return;
            }
            ValueAnimator valueAnimator0 = this.FLD880;
            valueAnimator0.setObjectValues(new Object[]{ˆٴ$ˆٴ1, ˆٴ$ˆٴ0});
            if(this.FLD879) {
                valueAnimator0.setInterpolator(this.FLD886);
            }
            if(this.FLD854 < 0L) {
                this.FLD854 = this.FLD879 ? 500L : 0xFAL;
            }
            valueAnimator0.setDuration(this.FLD854);
            valueAnimator0.start();
            return;
        }
        this.invalidate();
    }

    public void setDividerColor(int v) {
        this.FLD900 = v;
        this.invalidate();
    }

    public void setDividerPadding(float f) {
        this.FLD889 = (float)this.MTH1990(f);
        this.invalidate();
    }

    public void setDividerWidth(float f) {
        this.FLD855 = (float)this.MTH1990(f);
        this.invalidate();
    }

    public void setIconHeight(float f) {
        this.FLD901 = (float)this.MTH1990(f);
        this.MTH1993();
    }

    public void setIconMargin(float f) {
        this.FLD893 = (float)this.MTH1990(f);
        this.MTH1993();
    }

    public void setIconVisible(boolean z) {
        this.FLD881 = z;
        this.MTH1993();
    }

    public void setIconWidth(float f) {
        this.FLD871 = (float)this.MTH1990(f);
        this.MTH1993();
    }

    public void setIndicatorAnimDuration(long v) {
        this.FLD854 = v;
    }

    public void setIndicatorAnimEnable(boolean z) {
        this.FLD905 = z;
    }

    public void setIndicatorBounceEnable(boolean z) {
        this.FLD879 = z;
    }

    public void setIndicatorColor(int v) {
        this.FLD883 = v;
        this.invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        this.FLD894 = (float)this.MTH1990(f);
        this.invalidate();
    }

    public void setIndicatorGravity(int v) {
        this.FLD864 = v;
        this.invalidate();
    }

    public void setIndicatorHeight(float f) {
        this.FLD899 = (float)this.MTH1990(f);
        this.invalidate();
    }

    public void setIndicatorOffset(float f) {
        this.FLD870 = f;
        this.invalidate();
    }

    public void setIndicatorStyle(int v) {
        this.FLD878 = v;
        this.invalidate();
    }

    public void setIndicatorWidth(float f) {
        this.FLD875 = (float)this.MTH1990(f);
        this.invalidate();
    }

    public void setOnTabSelectListener(CLS116 ᵔʾ0) {
        this.FLD857 = ᵔʾ0;
    }

    public void setSelectIconColor(int v) {
        this.FLD891 = v;
    }

    public void setStartScrollPosition(int v) {
        this.FLD874 = v;
    }

    public void setTabData(ArrayList arrayList0) {
        if(arrayList0 == null || arrayList0.size() == 0) {
            throw new IllegalStateException("TabEntitys can not be NULL or EMPTY !");
        }
        ArrayList arrayList1 = this.FLD888;
        arrayList1.clear();
        arrayList1.addAll(arrayList0);
        LinearLayout linearLayout0 = this.FLD882;
        linearLayout0.removeAllViews();
        this.FLD904 = arrayList1.size();
        for(int v = 0; v < this.FLD904; ++v) {
            RelativeLayout relativeLayout0 = new RelativeLayout(this.FLD860);
            LinearLayout linearLayout1 = new LinearLayout(this.FLD860);
            linearLayout1.setId(CLS121.generateViewId());
            ImageView imageView0 = new ImageView(this.FLD860);
            imageView0.setId(CLS121.generateViewId());
            TextView textView0 = new TextView(this.FLD860);
            textView0.setId(CLS121.generateViewId());
            CLS149 ˆٴ0 = new CLS149(this.FLD860);
            ˆٴ0.setId(CLS121.generateViewId());
            ˆٴ0.setGravity(17);
            ˆٴ0.setTextColor(this.FLD856);
            ˆٴ0.setIsRadiusHalfHeight(true);
            ˆٴ0.setBackgroundColor(this.FLD853);
            ˆٴ0.setTextSize(11.0f);
            ˆٴ0.setVisibility(8);
            int v1 = this.MTH1990(15.0f);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
            linearLayout1.setOrientation(1);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            linearLayout1.setGravity(17);
            linearLayout1.setPadding(v1, 0, v1, 0);
            linearLayout1.addView(imageView0, linearLayout$LayoutParams0);
            linearLayout1.addView(textView0, linearLayout$LayoutParams0);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams0.addRule(13, linearLayout1.getId());
            relativeLayout0.addView(linearLayout1, relativeLayout$LayoutParams0);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout$LayoutParams1.addRule(7, linearLayout1.getId());
            relativeLayout0.addView(ˆٴ0, relativeLayout$LayoutParams1);
            CLS119 ˆٴ$ٴـ0 = new CLS119();
            ˆٴ$ٴـ0.FLD848 = v;
            ˆٴ$ٴـ0.FLD845 = textView0;
            ˆٴ$ٴـ0.FLD847 = imageView0;
            ˆٴ$ٴـ0.FLD846 = ˆٴ0;
            relativeLayout0.setTag(ˆٴ$ٴـ0);
            CLS119 ˆٴ$ٴـ1 = (CLS119)relativeLayout0.getTag();
            TextView textView1 = ˆٴ$ٴـ1.FLD845;
            String s = ((CLS115)arrayList1.get(v)).MTH1902();
            if(TextUtils.isEmpty(s)) {
                textView1.setVisibility(8);
            }
            else {
                textView1.setVisibility(0);
                textView1.setText(s);
            }
            ImageView imageView1 = ˆٴ$ٴـ1.FLD847;
            imageView1.setImageDrawable(((CLS115)arrayList1.get(v)).MTH1901());
            imageView1.setColorFilter(this.FLD866);
            relativeLayout0.setOnClickListener(new CLS153(this, 2));
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = this.FLD862 ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
            if(this.FLD873 > 0.0f) {
                linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(((int)this.FLD873), -1);
            }
            linearLayout0.addView(relativeLayout0, v, linearLayout$LayoutParams1);
        }
        this.MTH1993();
    }

    public void setTabPadding(float f) {
        this.FLD902 = (float)this.MTH1990(f);
        this.MTH1993();
    }

    public void setTabSpaceEqual(boolean z) {
        this.FLD862 = z;
        this.MTH1993();
    }

    public void setTabWidth(float f) {
        this.FLD873 = (float)this.MTH1990(f);
        this.MTH1993();
    }

    public void setTextAllCaps(boolean z) {
        this.FLD868 = z;
        this.MTH1993();
    }

    public void setTextBold(int v) {
        this.FLD865 = v;
        this.MTH1993();
    }

    public void setTextSelectColor(int v) {
        this.FLD898 = v;
        this.MTH1993();
    }

    public void setTextUnselectColor(int v) {
        this.FLD863 = v;
        this.MTH1993();
    }

    public void setTextsize(float f) {
        this.FLD852 = (float)(((int)(f * this.FLD860.getResources().getDisplayMetrics().scaledDensity + 0.5f)));
        this.MTH1993();
    }

    public void setUnSelectIconColor(int v) {
        this.FLD866 = v;
    }

    public void setUnderlineColor(int v) {
        this.FLD851 = v;
        this.invalidate();
    }

    public void setUnderlineGravity(int v) {
        this.FLD849 = v;
        this.invalidate();
    }

    public void setUnderlineHeight(float f) {
        this.FLD872 = (float)this.MTH1990(f);
        this.invalidate();
    }

    public void setUnreadBackground(int v) {
        this.FLD853 = v;
    }

    public void setUnreadTextColor(int v) {
        this.FLD856 = v;
    }

    public final int MTH1990(float f) {
        return (int)(f * this.FLD860.getResources().getDisplayMetrics().density + 0.5f);
    }

    public final void MTH1991(int v) {
        for(int v1 = 0; v1 < this.FLD904; ++v1) {
            boolean z = v1 == v;
            CLS119 ˆٴ$ٴـ0 = (CLS119)this.FLD882.getChildAt(v1).getTag();
            TextView textView0 = ˆٴ$ٴـ0.FLD845;
            textView0.setTextColor((z ? this.FLD898 : this.FLD863));
            ˆٴ$ٴـ0.FLD847.setColorFilter((z ? this.FLD891 : this.FLD866));
            if(this.FLD865 == 1) {
                textView0.getPaint().setFakeBoldText(z);
            }
        }
    }

    public final void MTH1992(int v, int v1) {
        String s;
        StringBuilder stringBuilder0;
        if(v < this.FLD904 && v >= 0) {
            LinearLayout linearLayout0 = this.FLD882;
            CLS119 ˆٴ$ٴـ0 = (CLS119)linearLayout0.getChildAt(v).getTag();
            if(ˆٴ$ٴـ0 == null) {
                return;
            }
            CLS149 ˆٴ0 = ˆٴ$ٴـ0.FLD846;
            if(ˆٴ0 != null) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)ˆٴ0.getLayoutParams();
                DisplayMetrics displayMetrics0 = ˆٴ0.getResources().getDisplayMetrics();
                if(v1 == 0) {
                    ˆٴ0.setVisibility(8);
                }
                else {
                    ˆٴ0.setVisibility(0);
                    if(v1 < 0) {
                        ˆٴ0.setStrokeWidth(0);
                        ˆٴ0.setText("");
                        int v2 = (int)(displayMetrics0.density * 10.0f);
                        relativeLayout$LayoutParams0.width = v2;
                        relativeLayout$LayoutParams0.height = v2;
                    }
                    else {
                        float f = displayMetrics0.density;
                        relativeLayout$LayoutParams0.height = (int)(18.0f * f);
                        if(v1 > 0 && v1 < 10) {
                            relativeLayout$LayoutParams0.width = (int)(18.0f * f);
                            stringBuilder0 = new StringBuilder();
                            goto label_31;
                        }
                        else if(v1 <= 9 || v1 >= 100) {
                            relativeLayout$LayoutParams0.width = -2;
                            int v4 = (int)(f * 6.0f);
                            ˆٴ0.setPadding(v4, 0, v4, 0);
                            s = "99+";
                        }
                        else {
                            relativeLayout$LayoutParams0.width = -2;
                            int v3 = (int)(f * 6.0f);
                            ˆٴ0.setPadding(v3, 0, v3, 0);
                            stringBuilder0 = new StringBuilder();
                        label_31:
                            stringBuilder0.append(v1);
                            stringBuilder0.append("");
                            s = stringBuilder0.toString();
                        }
                        ˆٴ0.setText(s);
                    }
                    ˆٴ0.setLayoutParams(relativeLayout$LayoutParams0);
                }
                SparseArray sparseArray0 = this.FLD897;
                if(sparseArray0.get(v) != null && ((Boolean)sparseArray0.get(v)).booleanValue()) {
                    return;
                }
                CLS119 ˆٴ$ٴـ1 = (CLS119)linearLayout0.getChildAt((v < this.FLD904 ? v : this.FLD904 - 1)).getTag();
                if(ˆٴ$ٴـ1 != null) {
                    CLS149 ˆٴ1 = ˆٴ$ٴـ1.FLD846;
                    if(ˆٴ1 != null) {
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)ˆٴ1.getLayoutParams();
                        viewGroup$MarginLayoutParams0.leftMargin = this.MTH1990(0.0f);
                        viewGroup$MarginLayoutParams0.topMargin = this.MTH1990(4.0f);
                        ˆٴ1.setLayoutParams(viewGroup$MarginLayoutParams0);
                    }
                }
                sparseArray0.put(v, Boolean.TRUE);
            }
        }
    }

    public final void MTH1993() {
        for(int v = 0; v < this.FLD904; ++v) {
            View view0 = this.FLD882.getChildAt(v);
            CLS119 ˆٴ$ٴـ0 = (CLS119)view0.getTag();
            view0.setPadding(((int)this.FLD902), 0, ((int)this.FLD902), 0);
            TextView textView0 = ˆٴ$ٴـ0.FLD845;
            boolean z = v == this.FLD895;
            textView0.setTextColor((z ? this.FLD898 : this.FLD863));
            textView0.setTextSize(0, this.FLD852);
            if(this.FLD868) {
                textView0.setText(textView0.getText().toString().toUpperCase());
            }
            int v1 = this.FLD865;
            if(v1 == 2) {
                textView0.getPaint().setFakeBoldText(true);
            }
            else if(v1 == 0) {
                textView0.getPaint().setFakeBoldText(false);
            }
            ImageView imageView0 = ˆٴ$ٴـ0.FLD847;
            if(this.FLD881) {
                imageView0.setVisibility(0);
                imageView0.setColorFilter((z ? this.FLD891 : this.FLD866));
                int v2 = -2;
                int v3 = this.FLD871 <= 0.0f ? -2 : ((int)this.FLD871);
                float f = this.FLD901;
                if(f > 0.0f) {
                    v2 = (int)f;
                }
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v3, v2);
                linearLayout$LayoutParams0.bottomMargin = (int)this.FLD893;
                imageView0.setLayoutParams(linearLayout$LayoutParams0);
            }
            else {
                imageView0.setVisibility(8);
            }
        }
    }
}

