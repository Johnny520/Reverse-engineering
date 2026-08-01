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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import defpackage.ct;
import defpackage.ip;
import defpackage.ja0;
import defpackage.jc;
import defpackage.kc;
import defpackage.oc;
import defpackage.va;
import defpackage.wy;
import defpackage.yy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends yy implements va {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final String[] E;
    public float F;
    public final ColorStateList G;
    public final ClockHandView s;
    public final Rect t;
    public final RectF u;
    public final Rect v;
    public final SparseArray w;
    public final c x;
    public final int[] y;
    public final float[] z;

    public ClockFaceView(Context r11, AttributeSet r12) {
        super(r11, r12);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new Rect();
        SparseArray r0 = new SparseArray();
        this.w = r0;
        this.z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray r122 = r11.obtainStyledAttributes(r12, wy.d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources r1 = getResources();
        ColorStateList r3 = ct.n(r11, r122, 1);
        this.G = r3;
        LayoutInflater.from(r11).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView r4 = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.s = r4;
        this.A = r1.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int r5 = r3.getColorForState(new int[]{android.R.attr.state_selected}, r3.getDefaultColor());
        this.y = new int[]{r5, r5, r3.getDefaultColor()};
        r4.c.add(this);
        int r32 = ip.v(r11, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList r112 = ct.n(r11, r122, 0);
        if (r112 == null) goto L6;
        r32 = r112.getDefaultColor();
    L6:
        setBackgroundColor(r32);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        r122.recycle();
        this.x = new c(this);
        String[] r113 = new String[12];
        Arrays.fill(r113, "");
        this.E = r113;
        LayoutInflater r114 = LayoutInflater.from(getContext());
        int r123 = r0.size();
        int r33 = 0;
        boolean r52 = false;
    L8:
        if (r33 >= Math.max(this.E.length, r123)) goto L19;
        TextView r6 = (TextView) r0.get(r33);
        if (r33 < this.E.length) goto L12;
        removeView(r6);
        r0.remove(r33);
    L18:
        r33 = r33 + 1;
        goto L8
    L12:
        if (r6 != null) goto L14;
        r6 = (TextView) r114.inflate(R.layout.material_clockface_textview, this, false);
        r0.put(r33, r6);
        addView(r6);
    L14:
        r6.setText(this.E[r33]);
        r6.setTag(R.id.material_value_index, Integer.valueOf(r33));
        int r7 = (r33 / 12) + 1;
        r6.setTag(R.id.material_clock_level, Integer.valueOf(r7));
        if (r7 <= 1) goto L17;
        r52 = true;
    L17:
        ja0.l(r6, this.x);
        r6.setTextColor(this.G);
        goto L18
    L19:
        ClockHandView r115 = this.s;
        if (r115.b == false) goto L23;
        if (r52 == true) goto L23;
        r115.m = 1;
    L23:
        r115.b = r52;
        r115.invalidate();
        this.B = r1.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.C = r1.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.D = r1.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // defpackage.yy
    public final void e() {
        oc r0 = new oc();
        r0.b(this);
        HashMap r1 = new HashMap();
        int r3 = 0;
    L4:
        if (r3 >= getChildCount()) goto L18;
        View r4 = getChildAt(r3);
        if (r4.getId() == R.id.circle_center) goto L17;
        if ("skip".equals(r4.getTag()) == true) goto L17;
        int r5 = (Integer) r4.getTag(R.id.material_clock_level);
        if (r5 != null) goto L14;
        r5 = 1;
    L14:
        if (r1.containsKey(r5) == true) goto L16;
        r1.put(r5, new ArrayList());
    L16:
        ((List) r1.get(r5)).add(r4);
    L17:
        r3 = r3 + 1;
        goto L4
    L18:
        Iterator r12 = r1.entrySet().iterator();
    L20:
        if (r12.hasNext() == false) goto L32;
        Map.Entry r32 = (Map.Entry) r12.next();
        List r42 = (List) r32.getValue();
        if (((Integer) r32.getKey()).intValue() != 2) goto L24;
        int r33 = Math.round(this.q * 0.66f);
    L25:
        Iterator r6 = r42.iterator();
        float r7 = 0.0f;
    L27:
        if (r6.hasNext() == false) goto L20;
        int r8 = ((View) r6.next()).getId();
        Integer r9 = Integer.valueOf(r8);
        HashMap r10 = r0.c;
        if (r10.containsKey(r9) == true) goto L31;
        r10.put(Integer.valueOf(r8), new jc());
    L31:
        kc r82 = ((jc) r10.get(Integer.valueOf(r8))).d;
        r82.w = R.id.circle_center;
        r82.x = r33;
        r82.y = r7;
        r7 = r7 + (360.0f / r42.size());
        goto L27
    L24:
        r33 = this.q;
        goto L25
    L32:
        r0.a(this);
        setConstraintSet(null);
        requestLayout();
        int r02 = 0;
    L33:
        SparseArray r13 = this.w;
        if (r02 >= r13.size()) goto L36;
        ((TextView) r13.get(r02)).setVisibility(0);
        r02 = r02 + 1;
        goto L33
    }

    public final void f() {
        RectF r1 = this.s.g;
        float r2 = Float.MAX_VALUE;
        TextView r6 = null;
        int r5 = 0;
    L3:
        SparseArray r7 = this.w;
        int r8 = r7.size();
        Rect r9 = this.t;
        RectF r10 = this.u;
        if (r5 >= r8) goto L12;
        TextView r72 = (TextView) r7.get(r5);
        if (r72 == null) goto L11;
        r72.getHitRect(r9);
        r10.set(r9);
        r10.union(r1);
        float r92 = r10.height() * r10.width();
        if (r92 >= r2) goto L11;
        r6 = r72;
        r2 = r92;
    L11:
        r5 = r5 + 1;
        goto L3
    L12:
        int r22 = 0;
    L14:
        if (r22 >= r7.size()) goto L27;
        TextView r52 = (TextView) r7.get(r22);
        if (r52 == null) goto L26;
        if (r52 != r6) goto L20;
        boolean r82 = true;
    L21:
        r52.setSelected(r82);
        r52.getHitRect(r9);
        r10.set(r9);
        r52.getLineBounds(0, this.v);
        r10.inset(r8.left, r8.top);
        if (RectF.intersects(r1, r10) == true) goto L24;
        RadialGradient r11 = null;
    L25:
        r52.getPaint().setShader(r11);
        r52.invalidate();
        goto L26
    L24:
        r11 = new RadialGradient(r1.centerX() - r10.left, r1.centerY() - r10.top, 0.5f * r1.width(), this.y, this.z, Shader.TileMode.CLAMP);
        goto L25
    L20:
        r82 = false;
    L26:
        r22 = r22 + 1;
        goto L14
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r4) {
        super.onInitializeAccessibilityNodeInfo(r4);
        r4.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.E.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        DisplayMetrics r32 = getResources().getDisplayMetrics();
        int r33 = (int) (this.D / Math.max(Math.max(this.B / r32.heightPixels, this.C / r32.widthPixels), 1.0f));
        int r42 = View.MeasureSpec.makeMeasureSpec(r33, 1073741824);
        setMeasuredDimension(r33, r33);
        super.onMeasure(r42, r42);
    }
}
