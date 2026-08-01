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
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC0168dz;
import p000.AbstractC0242fz;
import p000.AbstractC0274gu;
import p000.AbstractC0493mp;
import p000.C0702sc;
import p000.C0739tc;
import p000.C0888xc;
import p000.InterfaceC0145db;
import p000.oa0;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC0242fz implements InterfaceC0145db {

    /* JADX INFO: renamed from: A */
    public final int f1177A;

    /* JADX INFO: renamed from: B */
    public final int f1178B;

    /* JADX INFO: renamed from: C */
    public final int f1179C;

    /* JADX INFO: renamed from: D */
    public final int f1180D;

    /* JADX INFO: renamed from: E */
    public final String[] f1181E;

    /* JADX INFO: renamed from: F */
    public float f1182F;

    /* JADX INFO: renamed from: G */
    public final ColorStateList f1183G;

    /* JADX INFO: renamed from: s */
    public final ClockHandView f1184s;

    /* JADX INFO: renamed from: t */
    public final Rect f1185t;

    /* JADX INFO: renamed from: u */
    public final RectF f1186u;

    /* JADX INFO: renamed from: v */
    public final Rect f1187v;

    /* JADX INFO: renamed from: w */
    public final SparseArray f1188w;

    /* JADX INFO: renamed from: x */
    public final C0118c f1189x;

    /* JADX INFO: renamed from: y */
    public final int[] f1190y;

    /* JADX INFO: renamed from: z */
    public final float[] f1191z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1185t = new Rect();
        this.f1186u = new RectF();
        this.f1187v = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f1188w = sparseArray;
        this.f1191z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1441d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM1315i = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 1);
        this.f1183G = colorStateListM1315i;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1184s = clockHandView;
        this.f1177A = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM1315i.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM1315i.getDefaultColor());
        this.f1190y = new int[]{colorForState, colorForState, colorStateListM1315i.getDefaultColor()};
        clockHandView.f1194c.add(this);
        int defaultColor = AbstractC0493mp.m1864n(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM1315i2 = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM1315i2 != null ? colorStateListM1315i2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0117b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f1189x = new C0118c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f1181E = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f1181E.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f1181E.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f1181E[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                oa0.m2012l(textView, this.f1189x);
                textView.setTextColor(this.f1183G);
            }
        }
        ClockHandView clockHandView2 = this.f1184s;
        if (clockHandView2.f1193b && !z) {
            clockHandView2.f1204m = 1;
        }
        clockHandView2.f1193b = z;
        clockHandView2.invalidate();
        this.f1178B = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f1179C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f1180D = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: e */
    public final void mo756e() {
        C0888xc c0888xc = new C0888xc();
        c0888xc.m2679b(this);
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
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f1850q * 0.66f) : this.f1850q;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c0888xc.f5235c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C0702sc());
                }
                C0739tc c0739tc = ((C0702sc) map2.get(Integer.valueOf(id))).f4297d;
                c0739tc.f4498w = R.id.circle_center;
                c0739tc.f4499x = iRound;
                c0739tc.f4500y = size;
                size += 360.0f / list.size();
            }
        }
        c0888xc.m2678a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f1188w;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m757f() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f1184s.f1198g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f1188w;
            int size = sparseArray.size();
            rect = this.f1185t;
            rectF = this.f1186u;
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
                textView3.getLineBounds(0, this.f1187v);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f1190y, this.f1191z, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f1181E.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m757f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f1180D / Math.max(Math.max(this.f1178B / displayMetrics.heightPixels, this.f1179C / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
