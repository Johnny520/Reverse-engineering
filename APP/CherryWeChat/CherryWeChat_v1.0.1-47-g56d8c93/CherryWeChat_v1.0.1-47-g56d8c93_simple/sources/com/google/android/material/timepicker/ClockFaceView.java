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

    public ClockFaceView(Context r11, AttributeSet r12) {
        super(r11, r12);
        this.f4680u = new Rect();
        this.f4681v = new RectF();
        this.f4682w = new Rect();
        SparseArray r0 = new SparseArray();
        this.f4683x = r0;
        this.f4671A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray r122 = r11.obtainStyledAttributes(r12, AbstractC0939Vu.f2935d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources r1 = getResources();
        ColorStateList r3 = AbstractC0828TB.m1643j(r11, r122, 1);
        this.f4678H = r3;
        LayoutInflater.from(r11).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView r4 = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f4679t = r4;
        this.f4672B = r1.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int r5 = r3.getColorForState(new int[]{android.R.attr.state_selected}, r3.getDefaultColor());
        this.f4685z = new int[]{r5, r5, r3.getDefaultColor()};
        r4.f4689c.add(this);
        int r32 = AbstractC0295Gu.m622o(r11, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList r112 = AbstractC0828TB.m1643j(r11, r122, 0);
        if (r112 == null) goto L6;
        r32 = r112.getDefaultColor();
    L6:
        setBackgroundColor(r32);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1280b(this));
        setFocusable(false);
        r122.recycle();
        this.f4684y = new C1281c(this);
        String[] r113 = new String[12];
        Arrays.fill(r113, "");
        this.f4676F = r113;
        LayoutInflater r114 = LayoutInflater.from(getContext());
        int r123 = r0.size();
        int r33 = 0;
        boolean r52 = false;
    L8:
        if (r33 >= Math.max(this.f4676F.length, r123)) goto L19;
        TextView r6 = (TextView) r0.get(r33);
        if (r33 < this.f4676F.length) goto L12;
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
        r6.setText(this.f4676F[r33]);
        r6.setTag(R.id.material_value_index, Integer.valueOf(r33));
        int r7 = (r33 / 12) + 1;
        r6.setTag(R.id.material_clock_level, Integer.valueOf(r7));
        if (r7 <= 1) goto L17;
        r52 = true;
    L17:
        AbstractC2185lE.m4399l(r6, this.f4684y);
        r6.setTextColor(this.f4678H);
        goto L18
    L19:
        ClockHandView r115 = this.f4679t;
        if (r115.f4688b == false) goto L23;
        if (r52 == true) goto L23;
        r115.f4699m = 1;
    L23:
        r115.f4688b = r52;
        r115.invalidate();
        this.f4673C = r1.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f4674D = r1.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f4675E = r1.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // p000.AbstractC1025Xu
    /* JADX INFO: renamed from: m */
    public final void mo1936m() {
        C2411qb r0 = new C2411qb();
        r0.m4854b(this);
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
        int r33 = Math.round(this.f3267r * 0.66f);
    L25:
        Iterator r6 = r42.iterator();
        float r7 = 0.0f;
    L27:
        if (r6.hasNext() == false) goto L20;
        int r8 = ((View) r6.next()).getId();
        Integer r9 = Integer.valueOf(r8);
        HashMap r10 = r0.f8456c;
        if (r10.containsKey(r9) == true) goto L31;
        r10.put(Integer.valueOf(r8), new C2188lb());
    L31:
        C2231mb r82 = ((C2188lb) r10.get(Integer.valueOf(r8))).f7635d;
        r82.f7870z = R.id.circle_center;
        r82.f7804A = r33;
        r82.f7805B = r7;
        r7 = r7 + (360.0f / r42.size());
        goto L27
    L24:
        r33 = this.f3267r;
        goto L25
    L32:
        r0.m4853a(this);
        setConstraintSet(null);
        requestLayout();
        int r02 = 0;
    L33:
        SparseArray r13 = this.f4683x;
        if (r02 >= r13.size()) goto L36;
        ((TextView) r13.get(r02)).setVisibility(0);
        r02 = r02 + 1;
        goto L33
    }

    /* JADX INFO: renamed from: n */
    public final void m2505n() {
        RectF r1 = this.f4679t.f4693g;
        float r2 = Float.MAX_VALUE;
        TextView r6 = null;
        int r5 = 0;
    L3:
        SparseArray r7 = this.f4683x;
        int r8 = r7.size();
        Rect r9 = this.f4680u;
        RectF r10 = this.f4681v;
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
        r52.getLineBounds(0, this.f4682w);
        r10.inset(r8.left, r8.top);
        if (RectF.intersects(r1, r10) == true) goto L24;
        RadialGradient r11 = null;
    L25:
        r52.getPaint().setShader(r11);
        r52.invalidate();
        goto L26
    L24:
        r11 = new RadialGradient(r1.centerX() - r10.left, r1.centerY() - r10.top, 0.5f * r1.width(), this.f4685z, this.f4671A, Shader.TileMode.CLAMP);
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
        r4.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f4676F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        m2505n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        DisplayMetrics r32 = getResources().getDisplayMetrics();
        int r33 = (int) (this.f4675E / Math.max(Math.max(this.f4673C / r32.heightPixels, this.f4674D / r32.widthPixels), 1.0f));
        int r42 = View.MeasureSpec.makeMeasureSpec(r33, 1073741824);
        setMeasuredDimension(r33, r33);
        super.onMeasure(r42, r42);
    }
}
