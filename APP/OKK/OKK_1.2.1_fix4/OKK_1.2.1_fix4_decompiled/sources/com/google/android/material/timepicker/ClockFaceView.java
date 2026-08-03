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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p056f0.AbstractC0805P;
import p058g0.AbstractC0942a;
import p075p.C1043i;
import p075p.C1044j;
import p075p.C1048n;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC0727e implements InterfaceC0726d {

    /* JADX INFO: renamed from: A */
    public final int f2517A;

    /* JADX INFO: renamed from: B */
    public final int f2518B;

    /* JADX INFO: renamed from: C */
    public final int f2519C;

    /* JADX INFO: renamed from: D */
    public final int f2520D;

    /* JADX INFO: renamed from: E */
    public final String[] f2521E;

    /* JADX INFO: renamed from: F */
    public float f2522F;

    /* JADX INFO: renamed from: G */
    public final ColorStateList f2523G;

    /* JADX INFO: renamed from: s */
    public final ClockHandView f2524s;

    /* JADX INFO: renamed from: t */
    public final Rect f2525t;

    /* JADX INFO: renamed from: u */
    public final RectF f2526u;

    /* JADX INFO: renamed from: v */
    public final Rect f2527v;

    /* JADX INFO: renamed from: w */
    public final SparseArray f2528w;

    /* JADX INFO: renamed from: x */
    public final C0725c f2529x;

    /* JADX INFO: renamed from: y */
    public final int[] f2530y;

    /* JADX INFO: renamed from: z */
    public final float[] f2531z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2525t = new Rect();
        this.f2526u = new RectF();
        this.f2527v = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f2528w = sparseArray;
        this.f2531z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3332d, C1031R.attr.materialClockStyle, C1031R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM2051r = AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 1);
        this.f2523G = colorStateListM2051r;
        LayoutInflater.from(context).inflate(C1031R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C1031R.id.material_clock_hand);
        this.f2524s = clockHandView;
        this.f2517A = resources.getDimensionPixelSize(C1031R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM2051r.getColorForState(new int[]{R.attr.state_selected}, colorStateListM2051r.getDefaultColor());
        this.f2530y = new int[]{colorForState, colorForState, colorStateListM2051r.getDefaultColor()};
        clockHandView.f2534c.add(this);
        int defaultColor = AbstractC0805P.m2049p(context, C1031R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM2051r2 = AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM2051r2 != null ? colorStateListM2051r2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0724b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2529x = new C0725c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f2521E = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < Math.max(this.f2521E.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f2521E.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C1031R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f2521E[i2]);
                textView.setTag(C1031R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C1031R.id.material_clock_level, Integer.valueOf(i3));
                z2 = i3 > 1 ? true : z2;
                AbstractC0080Q.m291j(textView, this.f2529x);
                textView.setTextColor(this.f2523G);
            }
        }
        ClockHandView clockHandView2 = this.f2524s;
        if (clockHandView2.f2533b && !z2) {
            clockHandView2.f2544m = 1;
        }
        clockHandView2.f2533b = z2;
        clockHandView2.invalidate();
        this.f2518B = resources.getDimensionPixelSize(C1031R.dimen.material_time_picker_minimum_screen_height);
        this.f2519C = resources.getDimensionPixelSize(C1031R.dimen.material_time_picker_minimum_screen_width);
        this.f2520D = resources.getDimensionPixelSize(C1031R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0727e
    /* JADX INFO: renamed from: f */
    public final void mo1912f() {
        C1048n c1048n = new C1048n();
        c1048n.m2529b(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != C1031R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(C1031R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f2551q * 0.66f) : this.f2551q;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c1048n.f4049c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1043i());
                }
                C1044j c1044j = ((C1043i) map2.get(Integer.valueOf(id))).f3958d;
                c1044j.f4019w = C1031R.id.circle_center;
                c1044j.f4020x = iRound;
                c1044j.f4021y = size;
                size += 360.0f / list.size();
            }
        }
        c1048n.m2528a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f2528w;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1913g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f2524s.f2538g;
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f2528w;
            int size = sparseArray.size();
            rectF = this.f2526u;
            rect = this.f2525t;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f2) {
                    textView = textView2;
                    f2 = fHeight;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f2527v);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f2530y, this.f2531z, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2521E.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m1913g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f2520D / Math.max(Math.max(this.f2518B / displayMetrics.heightPixels, this.f2519C / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
