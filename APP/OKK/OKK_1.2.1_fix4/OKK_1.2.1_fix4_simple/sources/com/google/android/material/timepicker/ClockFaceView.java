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

    public ClockFaceView(Context r12, AttributeSet r13) {
        super(r12, r13);
        this.f2525t = new Rect();
        this.f2526u = new RectF();
        this.f2527v = new Rect();
        SparseArray r2 = new SparseArray();
        this.f2528w = r2;
        this.f2531z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray r132 = r12.obtainStyledAttributes(r13, AbstractC0942a.f3332d, C1031R.attr.materialClockStyle, C1031R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources r3 = getResources();
        ColorStateList r4 = AbstractC0805P.m2051r(r12, r132, 1);
        this.f2523G = r4;
        LayoutInflater.from(r12).inflate(C1031R.layout.material_clockface_view, this, true);
        ClockHandView r5 = (ClockHandView) findViewById(C1031R.id.material_clock_hand);
        this.f2524s = r5;
        this.f2517A = r3.getDimensionPixelSize(C1031R.dimen.material_clock_hand_padding);
        int r6 = r4.getColorForState(new int[]{R.attr.state_selected}, r4.getDefaultColor());
        this.f2530y = new int[]{r6, r6, r4.getDefaultColor()};
        r5.f2534c.add(this);
        int r42 = AbstractC0805P.m2049p(r12, C1031R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList r122 = AbstractC0805P.m2051r(r12, r132, 0);
        if (r122 == null) goto L6;
        r42 = r122.getDefaultColor();
    L6:
        setBackgroundColor(r42);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0724b(this));
        setFocusable(true);
        r132.recycle();
        this.f2529x = new C0725c(this);
        String[] r123 = new String[12];
        Arrays.fill(r123, "");
        this.f2521E = r123;
        LayoutInflater r124 = LayoutInflater.from(getContext());
        int r133 = r2.size();
        int r43 = 0;
        boolean r62 = false;
    L8:
        if (r43 >= Math.max(this.f2521E.length, r133)) goto L19;
        TextView r7 = (TextView) r2.get(r43);
        if (r43 < this.f2521E.length) goto L12;
        removeView(r7);
        r2.remove(r43);
    L18:
        r43 = r43 + 1;
        goto L8
    L12:
        if (r7 != null) goto L14;
        r7 = (TextView) r124.inflate(C1031R.layout.material_clockface_textview, this, false);
        r2.put(r43, r7);
        addView(r7);
    L14:
        r7.setText(this.f2521E[r43]);
        r7.setTag(C1031R.id.material_value_index, Integer.valueOf(r43));
        int r8 = (r43 / 12) + 1;
        r7.setTag(C1031R.id.material_clock_level, Integer.valueOf(r8));
        if (r8 <= 1) goto L17;
        r62 = true;
    L17:
        AbstractC0080Q.m291j(r7, this.f2529x);
        r7.setTextColor(this.f2523G);
        goto L18
    L19:
        ClockHandView r125 = this.f2524s;
        if (r125.f2533b == false) goto L23;
        if (r62 == true) goto L23;
        r125.f2544m = 1;
    L23:
        r125.f2533b = r62;
        r125.invalidate();
        this.f2518B = r3.getDimensionPixelSize(C1031R.dimen.material_time_picker_minimum_screen_height);
        this.f2519C = r3.getDimensionPixelSize(C1031R.dimen.material_time_picker_minimum_screen_width);
        this.f2520D = r3.getDimensionPixelSize(C1031R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC0727e
    /* JADX INFO: renamed from: f */
    public final void mo1912f() {
        C1048n r02 = new C1048n();
        r02.m2529b(this);
        HashMap r1 = new HashMap();
        int r3 = 0;
    L4:
        if (r3 >= getChildCount()) goto L18;
        View r4 = getChildAt(r3);
        if (r4.getId() == C1031R.id.circle_center) goto L17;
        if ("skip".equals(r4.getTag()) == true) goto L17;
        int r5 = (Integer) r4.getTag(C1031R.id.material_clock_level);
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
        int r33 = Math.round(this.f2551q * 0.66f);
    L25:
        Iterator r6 = r42.iterator();
        float r7 = 0.0f;
    L27:
        if (r6.hasNext() == false) goto L20;
        int r8 = ((View) r6.next()).getId();
        HashMap r9 = r02.f4049c;
        if (r9.containsKey(Integer.valueOf(r8)) == true) goto L31;
        r9.put(Integer.valueOf(r8), new C1043i());
    L31:
        C1044j r82 = ((C1043i) r9.get(Integer.valueOf(r8))).f3958d;
        r82.f4019w = C1031R.id.circle_center;
        r82.f4020x = r33;
        r82.f4021y = r7;
        r7 = r7 + (360.0f / r42.size());
        goto L27
    L24:
        r33 = this.f2551q;
        goto L25
    L32:
        r02.m2528a(this);
        setConstraintSet(null);
        requestLayout();
        int r03 = 0;
    L33:
        SparseArray r13 = this.f2528w;
        if (r03 >= r13.size()) goto L36;
        ((TextView) r13.get(r03)).setVisibility(0);
        r03 = r03 + 1;
        goto L33
    }

    /* JADX INFO: renamed from: g */
    public final void m1913g() {
        RectF r1 = this.f2524s.f2538g;
        float r4 = Float.MAX_VALUE;
        TextView r6 = null;
        int r5 = 0;
    L3:
        SparseArray r7 = this.f2528w;
        int r8 = r7.size();
        RectF r9 = this.f2526u;
        Rect r10 = this.f2525t;
        if (r5 >= r8) goto L12;
        TextView r72 = (TextView) r7.get(r5);
        if (r72 == null) goto L11;
        r72.getHitRect(r10);
        r9.set(r10);
        r9.union(r1);
        float r92 = r9.height() * r9.width();
        if (r92 >= r4) goto L11;
        r6 = r72;
        r4 = r92;
    L11:
        r5 = r5 + 1;
        goto L3
    L12:
        int r42 = 0;
    L14:
        if (r42 >= r7.size()) goto L27;
        TextView r52 = (TextView) r7.get(r42);
        if (r52 == null) goto L26;
        if (r52 != r6) goto L20;
        boolean r82 = true;
    L21:
        r52.setSelected(r82);
        r52.getHitRect(r10);
        r9.set(r10);
        r52.getLineBounds(0, this.f2527v);
        r9.inset(r8.left, r8.top);
        if (RectF.intersects(r1, r9) == true) goto L24;
        RadialGradient r83 = null;
    L25:
        r52.getPaint().setShader(r83);
        r52.invalidate();
        goto L26
    L24:
        r83 = new RadialGradient(r1.centerX() - r9.left, r1.centerY() - r9.top, 0.5f * r1.width(), this.f2530y, this.f2531z, Shader.TileMode.CLAMP);
        goto L25
    L20:
        r82 = false;
    L26:
        r42 = r42 + 1;
        goto L14
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r4) {
        super.onInitializeAccessibilityNodeInfo(r4);
        r4.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f2521E.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        m1913g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        DisplayMetrics r32 = getResources().getDisplayMetrics();
        int r33 = (int) (this.f2520D / Math.max(Math.max(this.f2518B / r32.heightPixels, this.f2519C / r32.widthPixels), 1.0f));
        int r42 = View.MeasureSpec.makeMeasureSpec(r33, 1073741824);
        setMeasuredDimension(r33, r33);
        super.onMeasure(r42, r42);
    }
}
