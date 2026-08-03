package com.google.android.material.timepicker;

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
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC0295Gu;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1025Xu;
import p000.AbstractC2185lE;
import p000.C2188lb;
import p000.C2231mb;
import p000.C2411qb;
import p000.InterfaceC0655P9;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC1025Xu implements InterfaceC0655P9 {

    /* JADX INFO: renamed from: A */
    public final float[] f4671A;

    /* JADX INFO: renamed from: B */
    public final int f4672B;

    /* JADX INFO: renamed from: C */
    public final int f4673C;

    /* JADX INFO: renamed from: D */
    public final int f4674D;

    /* JADX INFO: renamed from: E */
    public final int f4675E;

    /* JADX INFO: renamed from: F */
    public final String[] f4676F;

    /* JADX INFO: renamed from: G */
    public float f4677G;

    /* JADX INFO: renamed from: H */
    public final ColorStateList f4678H;

    /* JADX INFO: renamed from: t */
    public final ClockHandView f4679t;

    /* JADX INFO: renamed from: u */
    public final Rect f4680u;

    /* JADX INFO: renamed from: v */
    public final RectF f4681v;

    /* JADX INFO: renamed from: w */
    public final Rect f4682w;

    /* JADX INFO: renamed from: x */
    public final SparseArray f4683x;

    /* JADX INFO: renamed from: y */
    public final C1281c f4684y;

    /* JADX INFO: renamed from: z */
    public final int[] f4685z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4680u = new Rect();
        this.f4681v = new RectF();
        this.f4682w = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f4683x = sparseArray;
        this.f4671A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2935d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM1643j = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 1);
        this.f4678H = colorStateListM1643j;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f4679t = clockHandView;
        this.f4672B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM1643j.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM1643j.getDefaultColor());
        this.f4685z = new int[]{colorForState, colorForState, colorStateListM1643j.getDefaultColor()};
        clockHandView.f4689c.add(this);
        int defaultColor = AbstractC0295Gu.m622o(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM1643j2 = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM1643j2 != null ? colorStateListM1643j2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1280b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f4684y = new C1281c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f4676F = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f4676F.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f4676F.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f4676F[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                AbstractC2185lE.m4399l(textView, this.f4684y);
                textView.setTextColor(this.f4678H);
            }
        }
        ClockHandView clockHandView2 = this.f4679t;
        if (clockHandView2.f4688b && !z) {
            clockHandView2.f4699m = 1;
        }
        clockHandView2.f4688b = z;
        clockHandView2.invalidate();
        this.f4673C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f4674D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f4675E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // p000.AbstractC1025Xu
    /* JADX INFO: renamed from: m */
    public final void mo1936m() {
        C2411qb c2411qb = new C2411qb();
        c2411qb.m4854b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3267r * 0.66f) : this.f3267r;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c2411qb.f8456c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C2188lb());
                }
                C2231mb c2231mb = ((C2188lb) map2.get(Integer.valueOf(id))).f7635d;
                c2231mb.f7870z = R.id.circle_center;
                c2231mb.f7804A = iRound;
                c2231mb.f7805B = size;
                size += 360.0f / list.size();
            }
        }
        c2411qb.m4853a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f4683x;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2505n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f4679t.f4693g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f4683x;
            int size = sparseArray.size();
            rect = this.f4680u;
            rectF = this.f4681v;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
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
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f4682w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f4685z, this.f4671A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f4676F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m2505n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f4675E / Math.max(Math.max(this.f4673C / displayMetrics.heightPixels, this.f4674D / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
