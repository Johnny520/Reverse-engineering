package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.C1247R;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p000a.C0231Mc;
import p000a.C0336Sa;
import p000a.C0437Y3;
import p000a.C0866ug;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends C0231Mc implements ClockHandView.InterfaceC1320a {

    /* JADX INFO: renamed from: A */
    public final float[] f5996A;

    /* JADX INFO: renamed from: B */
    public final int f5997B;

    /* JADX INFO: renamed from: C */
    public final int f5998C;

    /* JADX INFO: renamed from: D */
    public final int f5999D;

    /* JADX INFO: renamed from: E */
    public final int f6000E;

    /* JADX INFO: renamed from: F */
    public final String[] f6001F;

    /* JADX INFO: renamed from: G */
    public float f6002G;

    /* JADX INFO: renamed from: H */
    public final ColorStateList f6003H;

    /* JADX INFO: renamed from: t */
    public final ClockHandView f6004t;

    /* JADX INFO: renamed from: u */
    public final Rect f6005u;

    /* JADX INFO: renamed from: v */
    public final RectF f6006v;

    /* JADX INFO: renamed from: w */
    public final Rect f6007w;

    /* JADX INFO: renamed from: x */
    public final SparseArray<TextView> f6008x;

    /* JADX INFO: renamed from: y */
    public final C1323b f6009y;

    /* JADX INFO: renamed from: z */
    public final int[] f6010z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.materialClockStyle;
        super(context, attributeSet, i);
        this.f6005u = new Rect();
        this.f6006v = new RectF();
        this.f6007w = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f6008x = sparseArray;
        this.f5996A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.ClockFaceView, i, C1247R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM925b = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.ClockFaceView_clockNumberTextColor);
        this.f6003H = colorStateListM925b;
        LayoutInflater.from(context).inflate(C1247R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C1247R.id.material_clock_hand);
        this.f6004t = clockHandView;
        this.f5997B = resources.getDimensionPixelSize(C1247R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM925b.getColorForState(new int[]{R.attr.state_selected}, colorStateListM925b.getDefaultColor());
        this.f6010z = new int[]{colorForState, colorForState, colorStateListM925b.getDefaultColor()};
        clockHandView.f6013c.add(this);
        int defaultColor = C0437Y3.m1091a(context, C1247R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM925b2 = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListM925b2 != null ? colorStateListM925b2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1322a(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f6009y = new C1323b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6001F = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f6001F.length, size); i2++) {
            TextView textView = sparseArray.get(i2);
            if (i2 >= this.f6001F.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C1247R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f6001F[i2]);
                textView.setTag(C1247R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C1247R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                C0866ug.m2003j(textView, this.f6009y);
                textView.setTextColor(this.f6003H);
            }
        }
        ClockHandView clockHandView2 = this.f6004t;
        if (clockHandView2.f6012b && !z) {
            clockHandView2.f6023m = 1;
        }
        clockHandView2.f6012b = z;
        clockHandView2.invalidate();
        this.f5998C = resources.getDimensionPixelSize(C1247R.dimen.material_time_picker_minimum_screen_height);
        this.f5999D = resources.getDimensionPixelSize(C1247R.dimen.material_time_picker_minimum_screen_width);
        this.f6000E = resources.getDimensionPixelSize(C1247R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC1320a
    /* JADX INFO: renamed from: a */
    public final void mo3297a(float f) {
        if (Math.abs(this.f6002G - f) > 0.001f) {
            this.f6002G = f;
            m3298g();
        }
    }

    @Override // p000a.C0231Mc
    /* JADX INFO: renamed from: f */
    public final void mo622f() {
        super.mo622f();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f6008x;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3298g() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f6004t.f6017g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f6008x;
            int size = sparseArray.size();
            rectF = this.f6006v;
            rect = this.f6005u;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f6007w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f6010z, this.f5996A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f6001F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m3298g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f6000E / Math.max(Math.max(this.f5998C / displayMetrics.heightPixels, this.f5999D / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
