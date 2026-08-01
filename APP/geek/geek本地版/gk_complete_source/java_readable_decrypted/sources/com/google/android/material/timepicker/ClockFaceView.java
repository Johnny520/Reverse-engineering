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
import p000.AbstractC0126ct;
import p000.AbstractC0346ip;
import p000.AbstractC0873wy;
import p000.AbstractC0947yy;
import p000.C0369jc;
import p000.C0406kc;
import p000.C0554oc;
import p000.InterfaceC0812va;
import p000.ja0;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC0947yy implements InterfaceC0812va {

    /* JADX INFO: renamed from: A */
    public final int f1252A;

    /* JADX INFO: renamed from: B */
    public final int f1253B;

    /* JADX INFO: renamed from: C */
    public final int f1254C;

    /* JADX INFO: renamed from: D */
    public final int f1255D;

    /* JADX INFO: renamed from: E */
    public final String[] f1256E;

    /* JADX INFO: renamed from: F */
    public float f1257F;

    /* JADX INFO: renamed from: G */
    public final ColorStateList f1258G;

    /* JADX INFO: renamed from: s */
    public final ClockHandView f1259s;

    /* JADX INFO: renamed from: t */
    public final Rect f1260t;

    /* JADX INFO: renamed from: u */
    public final RectF f1261u;

    /* JADX INFO: renamed from: v */
    public final Rect f1262v;

    /* JADX INFO: renamed from: w */
    public final SparseArray f1263w;

    /* JADX INFO: renamed from: x */
    public final C0118c f1264x;

    /* JADX INFO: renamed from: y */
    public final int[] f1265y;

    /* JADX INFO: renamed from: z */
    public final float[] f1266z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1260t = new Rect();
        this.f1261u = new RectF();
        this.f1262v = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f1263w = sparseArray;
        this.f1266z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5045d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM816n = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 1);
        this.f1258G = colorStateListM816n;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1259s = clockHandView;
        this.f1252A = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM816n.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM816n.getDefaultColor());
        this.f1265y = new int[]{colorForState, colorForState, colorStateListM816n.getDefaultColor()};
        clockHandView.f1269c.add(this);
        int defaultColor = AbstractC0346ip.m1510v(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM816n2 = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM816n2 != null ? colorStateListM816n2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0117b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f1264x = new C0118c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f1256E = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f1256E.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f1256E.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f1256E[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                ja0.m1575l(textView, this.f1264x);
                textView.setTextColor(this.f1258G);
            }
        }
        ClockHandView clockHandView2 = this.f1259s;
        if (clockHandView2.f1268b && !z) {
            clockHandView2.f1279m = 1;
        }
        clockHandView2.f1268b = z;
        clockHandView2.invalidate();
        this.f1253B = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f1254C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f1255D = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // p000.AbstractC0947yy
    /* JADX INFO: renamed from: e */
    public final void mo797e() {
        C0554oc c0554oc = new C0554oc();
        c0554oc.m2010b(this);
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
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f5413q * 0.66f) : this.f5413q;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c0554oc.f3528c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C0369jc());
                }
                C0406kc c0406kc = ((C0369jc) map2.get(Integer.valueOf(id))).f2616d;
                c0406kc.f2874w = R.id.circle_center;
                c0406kc.f2875x = iRound;
                c0406kc.f2876y = size;
                size += 360.0f / list.size();
            }
        }
        c0554oc.m2009a(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f1263w;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m798f() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f1259s.f1273g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f1263w;
            int size = sparseArray.size();
            rect = this.f1260t;
            rectF = this.f1261u;
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
                textView3.getLineBounds(0, this.f1262v);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f1265y, this.f1266z, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f1256E.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m798f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f1255D / Math.max(Math.max(this.f1253B / displayMetrics.heightPixels, this.f1254C / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
