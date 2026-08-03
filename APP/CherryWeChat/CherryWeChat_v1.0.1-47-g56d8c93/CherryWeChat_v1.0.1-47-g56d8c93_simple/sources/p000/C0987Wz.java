package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Wz */
/* JADX INFO: loaded from: classes.dex */
public final class C0987Wz extends ViewGroup implements InterfaceC0379Is, InterfaceC0336Hs {

    /* JADX INFO: renamed from: K */
    public static final int[] f3121K = null;

    /* JADX INFO: renamed from: A */
    public C0772Rz f3122A;

    /* JADX INFO: renamed from: B */
    public C0772Rz f3123B;

    /* JADX INFO: renamed from: C */
    public C0815Sz f3124C;

    /* JADX INFO: renamed from: D */
    public C0815Sz f3125D;

    /* JADX INFO: renamed from: E */
    public boolean f3126E;

    /* JADX INFO: renamed from: F */
    public int f3127F;

    /* JADX INFO: renamed from: G */
    public boolean f3128G;

    /* JADX INFO: renamed from: H */
    public final AnimationAnimationListenerC0730Qz f3129H;

    /* JADX INFO: renamed from: I */
    public final C0772Rz f3130I;

    /* JADX INFO: renamed from: J */
    public final C0772Rz f3131J;

    /* JADX INFO: renamed from: a */
    public View f3132a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0901Uz f3133b;

    /* JADX INFO: renamed from: c */
    public boolean f3134c;

    /* JADX INFO: renamed from: d */
    public final int f3135d;

    /* JADX INFO: renamed from: e */
    public float f3136e;

    /* JADX INFO: renamed from: f */
    public float f3137f;

    /* JADX INFO: renamed from: g */
    public final C0422Js f3138g;

    /* JADX INFO: renamed from: h */
    public final C0293Gs f3139h;

    /* JADX INFO: renamed from: i */
    public final int[] f3140i;

    /* JADX INFO: renamed from: j */
    public final int[] f3141j;

    /* JADX INFO: renamed from: k */
    public final int[] f3142k;

    /* JADX INFO: renamed from: l */
    public boolean f3143l;

    /* JADX INFO: renamed from: m */
    public final int f3144m;

    /* JADX INFO: renamed from: n */
    public int f3145n;

    /* JADX INFO: renamed from: o */
    public float f3146o;

    /* JADX INFO: renamed from: p */
    public float f3147p;

    /* JADX INFO: renamed from: q */
    public boolean f3148q;

    /* JADX INFO: renamed from: r */
    public int f3149r;

    /* JADX INFO: renamed from: s */
    public final DecelerateInterpolator f3150s;

    /* JADX INFO: renamed from: t */
    public final C2489s9 f3151t;

    /* JADX INFO: renamed from: u */
    public int f3152u;

    /* JADX INFO: renamed from: v */
    public int f3153v;

    /* JADX INFO: renamed from: w */
    public final int f3154w;

    /* JADX INFO: renamed from: x */
    public final int f3155x;

    /* JADX INFO: renamed from: y */
    public int f3156y;

    /* JADX INFO: renamed from: z */
    public final C2661w9 f3157z;

    static {
        f3121K = new int[]{R.attr.enabled};
    }

    public C0987Wz(Activity r8) {
        super(r8, null);
        this.f3134c = false;
        this.f3136e = -1.0f;
        this.f3140i = new int[2];
        this.f3141j = new int[2];
        this.f3142k = new int[2];
        this.f3149r = -1;
        this.f3152u = -1;
        this.f3129H = new AnimationAnimationListenerC0730Qz(this, 0);
        this.f3130I = new C0772Rz(this, 2);
        this.f3131J = new C0772Rz(this, 3);
        this.f3135d = ViewConfiguration.get(r8).getScaledTouchSlop();
        this.f3144m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f3150s = new DecelerateInterpolator(2.0f);
        DisplayMetrics r2 = getResources().getDisplayMetrics();
        this.f3127F = (int) (r2.density * 40.0f);
        C2489s9 r3 = new C2489s9(getContext());
        float r4 = r3.getContext().getResources().getDisplayMetrics().density;
        TypedArray r5 = r3.getContext().obtainStyledAttributes(AbstractC0853Tu.f2703a);
        r3.f8752b = r5.getColor(0, -328966);
        r5.recycle();
        ShapeDrawable r52 = new ShapeDrawable(new OvalShape());
        WeakHashMap r6 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2639k(r3, r4 * 4.0f);
        r52.getPaint().setColor(r3.f8752b);
        r3.setBackground(r52);
        this.f3151t = r3;
        C2661w9 r32 = new C2661w9(getContext());
        this.f3157z = r32;
        r32.m5227c(1);
        this.f3151t.setImageDrawable(this.f3157z);
        this.f3151t.setVisibility(8);
        addView(this.f3151t);
        setChildrenDrawingOrderEnabled(true);
        int r22 = (int) (r2.density * 64.0f);
        this.f3155x = r22;
        this.f3136e = r22;
        this.f3138g = new C0422Js();
        this.f3139h = new C0293Gs(this);
        setNestedScrollingEnabled(true);
        int r23 = -this.f3127F;
        this.f3145n = r23;
        this.f3154w = r23;
        m1871k(1.0f);
        TypedArray r82 = r8.obtainStyledAttributes(null, f3121K);
        setEnabled(r82.getBoolean(0, true));
        r82.recycle();
    }

    private void setColorViewAlpha(int r2) {
        this.f3151t.getBackground().setAlpha(r2);
        this.f3157z.setAlpha(r2);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View r1, View r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        onNestedScrollAccepted(r1, r2, r3);
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View r1, int r2) {
        if (r2 != 0) goto L5;
        onStopNestedScroll(r1);
        return;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View r1, int r2, int r3, int[] r4, int r5) {
        if (r5 != 0) goto L5;
        onNestedPreScroll(r1, r2, r3, r4);
        return;
    }

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View r10, int r11, int r12, int r13, int r14, int r15, int[] r16) {
        if (r15 != 0) goto L18;
        int r0 = r16[1];
        if (r15 != 0) goto L7;
        this.f3139h.m595d(r11, r12, r13, r14, this.f3141j, r15, r16);
    L7:
        int r112 = r14 - (r16[1] - r0);
        if (r112 != 0) goto L10;
        int r142 = r14 + this.f3141j[1];
    L11:
        if (r142 < 0) goto L13;
        return;
    L13:
        if (m1867g() == true) goto L17;
        float r122 = this.f3137f + Math.abs(r142);
        this.f3137f = r122;
        m1870j(r122);
        r16[1] = r16[1] + r112;
        return;
    L17:
        return;
    L10:
        r142 = r112;
        goto L11
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return this.f3139h.m592a(r2, r3, r4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
        return this.f3139h.m593b(r2, r3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return this.f3139h.m594c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return this.f3139h.m595d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View r9, int r10, int r11, int r12, int r13, int r14) {
        mo820d(r9, r10, r11, r12, r13, r14, this.f3142k);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View r1, View r2, int r3, int r4) {
        if (r4 == 0) goto L4;
        return false;
    L4:
        return onStartNestedScroll(r1, r2, r3);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1867g() {
        View r0 = this.f3132a;
        if ((r0 instanceof ListView) == false) goto L7;
        return ((ListView) r0).canScrollList(-1);
    L7:
        return r0.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
        int r0 = this.f3152u;
        if (r0 >= 0) goto L6;
        return r3;
    L6:
        if (r3 != (r2 - 1)) goto L8;
        return r0;
    L8:
        if (r3 >= r0) goto L10;
        return r3;
    L10:
        return r3 + 1;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0422Js r0 = this.f3138g;
        int r1 = r0.f1403a;
        return r0.f1404b | r1;
    }

    public int getProgressCircleDiameter() {
        return this.f3127F;
    }

    public int getProgressViewEndOffset() {
        return this.f3155x;
    }

    public int getProgressViewStartOffset() {
        return this.f3154w;
    }

    /* JADX INFO: renamed from: h */
    public final void m1868h() {
        if (this.f3132a != null) goto L12;
        int r0 = 0;
    L6:
        if (r0 >= getChildCount()) goto L15;
        View r1 = getChildAt(r0);
        if (r1.equals(this.f3151t) == false) goto L9;
        r0 = r0 + 1;
        goto L6
    L9:
        this.f3132a = r1;
        return;
    L15:
        return;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3139h.m597f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1869i(float r5) {
        if (r5 <= this.f3136e) goto L6;
        m1873m(true, true);
        return;
    L6:
        this.f3134c = false;
        C2661w9 r0 = this.f3157z;
        C2618v9 r1 = r0.f9207a;
        r1.f9078e = 0.0f;
        r1.f9079f = 0.0f;
        r0.invalidateSelf();
        AnimationAnimationListenerC0730Qz r02 = new AnimationAnimationListenerC0730Qz(this, 1);
        this.f3153v = this.f3145n;
        C0772Rz r12 = this.f3131J;
        r12.reset();
        r12.setDuration(200);
        r12.setInterpolator(this.f3150s);
        C2489s9 r2 = this.f3151t;
        r2.f8751a = r02;
        r2.clearAnimation();
        this.f3151t.startAnimation(r12);
        C2661w9 r03 = this.f3157z;
        C2618v9 r13 = r03.f9207a;
        if (r13.f9087n == false) goto L9;
        r13.f9087n = false;
    L9:
        r03.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3139h.f992d;
    }

    /* JADX INFO: renamed from: j */
    public final void m1870j(float r12) {
        C2661w9 r0 = this.f3157z;
        C2618v9 r1 = r0.f9207a;
        if (r1.f9087n == true) goto L5;
        r1.f9087n = true;
    L5:
        r0.invalidateSelf();
        float r02 = Math.min(1.0f, Math.abs(r12 / this.f3136e));
        float r2 = (((float) Math.max(((double) r02) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float r3 = Math.abs(r12) - this.f3136e;
        int r4 = this.f3156y;
        if (r4 <= 0) goto L8;
    L7:
        float r42 = r4;
        double r7 = Math.max(0.0f, Math.min(r3, r42 * 2.0f) / r42) / 4.0f;
        float r32 = ((float) (r7 - Math.pow(r7, 2.0d))) * 2.0f;
        int r43 = this.f3154w + ((int) ((r42 * r02) + ((r42 * r32) * 2.0f)));
        if (this.f3151t.getVisibility() == 0) goto L12;
        this.f3151t.setVisibility(0);
    L12:
        this.f3151t.setScaleX(1.0f);
        this.f3151t.setScaleY(1.0f);
        if (r12 >= this.f3136e) goto L25;
        if (this.f3157z.f9207a.f9093t <= 76) goto L34;
        C0815Sz r122 = this.f3124C;
        if (r122 != null) goto L19;
    L23:
        C0815Sz r10 = new C0815Sz(this, this.f3157z.f9207a.f9093t, 76);
        r10.setDuration(300);
        C2489s9 r123 = this.f3151t;
        r123.f8751a = null;
        r123.clearAnimation();
        this.f3151t.startAnimation(r10);
        this.f3124C = r10;
        goto L34
    L19:
        if (r122.hasStarted() == false) goto L23;
        if (r122.hasEnded() == true) goto L23;
    L34:
        float r124 = Math.min(0.8f, r2 * 0.8f);
        C2661w9 r03 = this.f3157z;
        C2618v9 r72 = r03.f9207a;
        r72.f9078e = 0.0f;
        r72.f9079f = r124;
        r03.invalidateSelf();
        float r125 = Math.min(1.0f, r2);
        C2661w9 r04 = this.f3157z;
        C2618v9 r13 = r04.f9207a;
        if (r125 == r13.f9089p) goto L37;
        r13.f9089p = r125;
    L37:
        r04.invalidateSelf();
        C2661w9 r126 = this.f3157z;
        r126.f9207a.f9080g = ((r32 * 2.0f) + ((r2 * 0.4f) - 0.25f)) * 0.5f;
        r126.invalidateSelf();
        setTargetOffsetTopAndBottom(r43 - this.f3145n);
        return;
    L25:
        if (this.f3157z.f9207a.f9093t >= 255) goto L34;
        C0815Sz r127 = this.f3125D;
        if (r127 != null) goto L29;
    L33:
        C0815Sz r102 = new C0815Sz(this, this.f3157z.f9207a.f9093t, 255);
        r102.setDuration(300);
        C2489s9 r128 = this.f3151t;
        r128.f8751a = null;
        r128.clearAnimation();
        this.f3151t.startAnimation(r102);
        this.f3125D = r102;
        goto L34
    L29:
        if (r127.hasStarted() == false) goto L33;
        if (r127.hasEnded() == true) goto L33;
    L8:
        r4 = this.f3155x;
        goto L7
    }

    /* JADX INFO: renamed from: k */
    public final void m1871k(float r3) {
        setTargetOffsetTopAndBottom((this.f3153v + ((int) ((this.f3154w - r0) * r3))) - this.f3151t.getTop());
    }

    /* JADX INFO: renamed from: l */
    public final void m1872l() {
        this.f3151t.clearAnimation();
        this.f3157z.stop();
        this.f3151t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f3154w - this.f3145n);
        this.f3145n = this.f3151t.getTop();
    }

    /* JADX INFO: renamed from: m */
    public final void m1873m(boolean r3, boolean r4) {
        if (this.f3134c == r3) goto L13;
        this.f3126E = r4;
        m1868h();
        this.f3134c = r3;
        AnimationAnimationListenerC0730Qz r42 = this.f3129H;
        if (r3 == false) goto L11;
        this.f3153v = this.f3145n;
        C0772Rz r32 = this.f3130I;
        r32.reset();
        r32.setDuration(200);
        r32.setInterpolator(this.f3150s);
        if (r42 == null) goto L9;
        this.f3151t.f8751a = r42;
    L9:
        this.f3151t.clearAnimation();
        this.f3151t.startAnimation(r32);
        return;
    L11:
        C0772Rz r33 = new C0772Rz(this, 1);
        this.f3123B = r33;
        r33.setDuration(150);
        C2489s9 r34 = this.f3151t;
        r34.f8751a = r42;
        r34.clearAnimation();
        this.f3151t.startAnimation(this.f3123B);
        return;
    }

    /* JADX INFO: renamed from: n */
    public final void m1874n(float r3) {
        float r0 = this.f3147p;
        float r32 = r3 - r0;
        float r1 = this.f3135d;
        if (r32 > r1) goto L5;
        return;
    L5:
        if (this.f3148q == true) goto L9;
        this.f3146o = r0 + r1;
        this.f3148q = true;
        this.f3157z.setAlpha(76);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1872l();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r6) {
        m1868h();
        int r0 = r6.getActionMasked();
        int r2 = 0;
        if (isEnabled() == true) goto L5;
    L40:
        return false;
    L5:
        if (m1867g() == true) goto L40;
        if (this.f3134c == true) goto L40;
        if (this.f3143l == true) goto L40;
        if (r0 != 0) goto L13;
        setTargetOffsetTopAndBottom(this.f3154w - this.f3151t.getTop());
        int r02 = r6.getPointerId(0);
        this.f3149r = r02;
        this.f3148q = false;
        int r03 = r6.findPointerIndex(r02);
        if (r03 < 0) goto L40;
        this.f3147p = r6.getY(r03);
    L39:
        return this.f3148q;
    L13:
        if (r0 != 1) goto L15;
    L33:
        this.f3148q = false;
        this.f3149r = -1;
        goto L39
    L15:
        if (r0 != 2) goto L17;
        int r04 = this.f3149r;
        if (r04 == (-1)) goto L40;
        int r05 = r6.findPointerIndex(r04);
        if (r05 < 0) goto L40;
        m1874n(r6.getY(r05));
        goto L39
    L17:
        if (r0 == 3) goto L33;
        if (r0 != 6) goto L39;
        int r06 = r6.getActionIndex();
        if (r6.getPointerId(r06) != this.f3149r) goto L39;
        if (r06 != 0) goto L25;
        r2 = 1;
    L25:
        this.f3149r = r6.getPointerId(r2);
        goto L39
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        int r32 = getMeasuredWidth();
        int r42 = getMeasuredHeight();
        if (getChildCount() != 0) goto L6;
        return;
    L6:
        if (this.f3132a != null) goto L8;
        m1868h();
    L8:
        View r52 = this.f3132a;
        if (r52 != null) goto L11;
        return;
    L11:
        int r62 = getPaddingLeft();
        int r72 = getPaddingTop();
        int r0 = (r32 - getPaddingLeft()) - getPaddingRight();
        r52.layout(r62, r72, r0 + r62, ((r42 - getPaddingTop()) - getPaddingBottom()) + r72);
        int r43 = this.f3151t.getMeasuredWidth();
        int r53 = this.f3151t.getMeasuredHeight();
        int r33 = r32 / 2;
        int r44 = r43 / 2;
        int r73 = this.f3145n;
        C2489s9 r45 = this.f3151t;
        r45.layout(r33 - r44, r73, r33 + r44, r53 + r73);
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
        super.onMeasure(r4, r5);
        if (this.f3132a != null) goto L5;
        m1868h();
    L5:
        View r42 = this.f3132a;
        if (r42 == null) goto L16;
        r42.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        int r43 = View.MeasureSpec.makeMeasureSpec(this.f3127F, 1073741824);
        int r52 = View.MeasureSpec.makeMeasureSpec(this.f3127F, 1073741824);
        this.f3151t.measure(r43, r52);
        this.f3152u = -1;
        int r44 = 0;
    L10:
        if (r44 >= getChildCount()) goto L19;
        if (getChildAt(r44) == this.f3151t) goto L13;
        r44 = r44 + 1;
        goto L10
    L13:
        this.f3152u = r44;
        return;
    L19:
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View r1, float r2, float r3, boolean r4) {
        return this.f3139h.m592a(r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View r1, float r2, float r3) {
        return this.f3139h.m593b(r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View r5, int r6, int r7, int[] r8) {
        if (r7 <= 0) goto L11;
        float r0 = this.f3137f;
        if (r0 <= 0.0f) goto L11;
        float r2 = r7;
        if (r2 <= r0) goto L9;
        r8[1] = (int) r0;
        this.f3137f = 0.0f;
    L10:
        m1870j(this.f3137f);
        goto L11
    L9:
        this.f3137f = r0 - r2;
        r8[1] = r7;
    L11:
        int r62 = r6 - r8[0];
        int r72 = r7 - r8[1];
        int[] r22 = this.f3140i;
        if (dispatchNestedPreScroll(r62, r72, r22, null) == false) goto L15;
        r8[0] = r8[0] + r22[0];
        r8[1] = r8[1] + r22[1];
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View r9, int r10, int r11, int r12, int r13) {
        mo820d(r9, r10, r11, r12, r13, 0, this.f3142k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View r1, View r2, int r3) {
        this.f3138g.f1403a = r3;
        startNestedScroll(r3 & 2);
        this.f3137f = 0.0f;
        this.f3143l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        C0944Vz r22 = (C0944Vz) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        setRefreshing(r22.f2964a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C0944Vz(super.onSaveInstanceState(), this.f3134c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View r1, View r2, int r3) {
        if (isEnabled() == true) goto L5;
        return false;
    L5:
        if (this.f3134c == false) goto L7;
        return false;
    L7:
        if ((r3 & 2) == 0) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View r3) {
        this.f3138g.f1403a = 0;
        this.f3143l = false;
        float r32 = this.f3137f;
        if (r32 <= 0.0f) goto L5;
        m1869i(r32);
        this.f3137f = 0.0f;
    L5:
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r6) {
        int r0 = r6.getActionMasked();
        int r2 = 0;
        if (isEnabled() == true) goto L5;
    L54:
        return false;
    L5:
        if (m1867g() == true) goto L54;
        if (this.f3134c == true) goto L54;
        if (this.f3143l == true) goto L54;
        if (r0 != 0) goto L14;
        this.f3149r = r6.getPointerId(0);
        this.f3148q = false;
        return true;
    L14:
        if (r0 != 1) goto L16;
        int r02 = r6.findPointerIndex(this.f3149r);
        if (r02 < 0) goto L54;
        if (this.f3148q == false) goto L50;
        float r62 = (r6.getY(r02) - this.f3146o) * 0.5f;
        this.f3148q = false;
        m1869i(r62);
    L50:
        this.f3149r = -1;
        return false;
    L16:
        if (r0 != 2) goto L18;
        int r03 = r6.findPointerIndex(this.f3149r);
        if (r03 < 0) goto L54;
        float r63 = r6.getY(r03);
        m1874n(r63);
        if (this.f3148q == false) goto L43;
        float r64 = (r63 - this.f3146o) * 0.5f;
        if (r64 <= 0.0f) goto L54;
        getParent().requestDisallowInterceptTouchEvent(true);
        m1870j(r64);
    L43:
        return true;
    L18:
        if (r0 == 3) goto L54;
        if (r0 != 5) goto L22;
        int r04 = r6.getActionIndex();
        if (r04 < 0) goto L54;
        this.f3149r = r6.getPointerId(r04);
        return true;
    L22:
        if (r0 != 6) goto L43;
        int r05 = r6.getActionIndex();
        if (r6.getPointerId(r05) != this.f3149r) goto L43;
        if (r05 != 0) goto L28;
        r2 = 1;
    L28:
        this.f3149r = r6.getPointerId(r2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r3) {
        View r0 = this.f3132a;
        if (r0 == null) goto L13;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        if (AbstractC1360eE.m2636h(r0) == true) goto L13;
        if (this.f3128G == true) goto L16;
        ViewParent r02 = getParent();
        if (r02 == null) goto L15;
        r02.requestDisallowInterceptTouchEvent(r3);
        return;
    L15:
        return;
    L16:
        return;
    L13:
        super.requestDisallowInterceptTouchEvent(r3);
    }

    public void setAnimationProgress(float r2) {
        this.f3151t.setScaleX(r2);
        this.f3151t.setScaleY(r2);
    }

    @Deprecated
    public void setColorScheme(int... r1) {
        setColorSchemeResources(r1);
    }

    public void setColorSchemeColors(int... r3) {
        m1868h();
        C2661w9 r0 = this.f3157z;
        C2618v9 r1 = r0.f9207a;
        r1.f9082i = r3;
        r1.m5129a(0);
        r1.m5129a(0);
        r0.invalidateSelf();
    }

    public void setColorSchemeResources(int... r5) {
        Context r0 = getContext();
        int[] r1 = new int[r5.length];
        int r2 = 0;
    L4:
        if (r2 >= r5.length) goto L6;
        r1[r2] = r0.getColor(r5[r2]);
        r2 = r2 + 1;
        goto L4
    L6:
        setColorSchemeColors(r1);
    }

    public void setDistanceToTriggerSync(int r1) {
        this.f3136e = r1;
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
        super.setEnabled(r1);
        if (r1 == true) goto L6;
        m1872l();
        return;
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean r1) {
        this.f3128G = r1;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
        C0293Gs r0 = this.f3139h;
        if (r0.f992d == false) goto L5;
        ViewGroup r1 = r0.f991c;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2641m(r1);
    L5:
        r0.f992d = r4;
    }

    public void setOnChildScrollUpCallback(InterfaceC0858Tz r1) {
    }

    public void setOnRefreshListener(InterfaceC0901Uz r1) {
        this.f3133b = r1;
    }

    @Deprecated
    public void setProgressBackgroundColor(int r1) {
        setProgressBackgroundColorSchemeResource(r1);
    }

    public void setProgressBackgroundColorSchemeColor(int r2) {
        this.f3151t.setBackgroundColor(r2);
    }

    public void setProgressBackgroundColorSchemeResource(int r2) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(r2));
    }

    public void setRefreshing(boolean r3) {
        if (r3 == true) goto L5;
    L11:
        m1873m(r3, false);
        return;
    L5:
        if (this.f3134c == r3) goto L11;
        this.f3134c = r3;
        setTargetOffsetTopAndBottom((this.f3155x + this.f3154w) - this.f3145n);
        this.f3126E = false;
        this.f3151t.setVisibility(0);
        this.f3157z.setAlpha(255);
        C0772Rz r32 = new C0772Rz(this, 0);
        this.f3122A = r32;
        r32.setDuration(this.f3144m);
        AnimationAnimationListenerC0730Qz r33 = this.f3129H;
        if (r33 == null) goto L9;
        this.f3151t.f8751a = r33;
    L9:
        this.f3151t.clearAnimation();
        this.f3151t.startAnimation(this.f3122A);
    }

    public void setSize(int r3) {
        if (r3 != 0) goto L4;
    L6:
        DisplayMetrics r0 = getResources().getDisplayMetrics();
        if (r3 != 0) goto L9;
        this.f3127F = (int) (r0.density * 56.0f);
    L10:
        this.f3151t.setImageDrawable(null);
        this.f3157z.m5227c(r3);
        this.f3151t.setImageDrawable(this.f3157z);
        return;
    L9:
        this.f3127F = (int) (r0.density * 40.0f);
        goto L10
    L4:
        if (r3 == 1) goto L6;
    }

    public void setSlingshotDistance(int r1) {
        this.f3156y = r1;
    }

    public void setTargetOffsetTopAndBottom(int r3) {
        C2489s9 r0 = this.f3151t;
        r0.bringToFront();
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        r0.offsetTopAndBottom(r3);
        this.f3145n = r0.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return this.f3139h.m598g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f3139h.m599h(0);
    }
}
