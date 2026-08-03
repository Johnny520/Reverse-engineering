package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
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
    public static final int[] f3121K = {R.attr.enabled};

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

    public C0987Wz(Activity activity) {
        super(activity, null);
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
        this.f3135d = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.f3144m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f3150s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3127F = (int) (displayMetrics.density * 40.0f);
        C2489s9 c2489s9 = new C2489s9(getContext());
        float f = c2489s9.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = c2489s9.getContext().obtainStyledAttributes(AbstractC0853Tu.f2703a);
        c2489s9.f8752b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2639k(c2489s9, f * 4.0f);
        shapeDrawable.getPaint().setColor(c2489s9.f8752b);
        c2489s9.setBackground(shapeDrawable);
        this.f3151t = c2489s9;
        C2661w9 c2661w9 = new C2661w9(getContext());
        this.f3157z = c2661w9;
        c2661w9.m5227c(1);
        this.f3151t.setImageDrawable(this.f3157z);
        this.f3151t.setVisibility(8);
        addView(this.f3151t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f3155x = i;
        this.f3136e = i;
        this.f3138g = new C0422Js();
        this.f3139h = new C0293Gs(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f3127F;
        this.f3145n = i2;
        this.f3154w = i2;
        m1871k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = activity.obtainStyledAttributes((AttributeSet) null, f3121K);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f3151t.getBackground().setAlpha(i);
        this.f3157z.setAlpha(i);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.f3139h.m595d(i, i2, i3, i4, this.f3141j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.f3141j[1] : i7) >= 0 || m1867g()) {
            return;
        }
        float fAbs = this.f3137f + Math.abs(r14);
        this.f3137f = fAbs;
        m1870j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3139h.m592a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3139h.m593b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3139h.m594c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3139h.m595d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View view, int i, int i2, int i3, int i4, int i5) {
        mo820d(view, i, i2, i3, i4, i5, this.f3142k);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1867g() {
        View view = this.f3132a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f3152u;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0422Js c0422Js = this.f3138g;
        return c0422Js.f1404b | c0422Js.f1403a;
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
        if (this.f3132a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f3151t)) {
                    this.f3132a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3139h.m597f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m1869i(float f) {
        if (f > this.f3136e) {
            m1873m(true, true);
            return;
        }
        this.f3134c = false;
        C2661w9 c2661w9 = this.f3157z;
        C2618v9 c2618v9 = c2661w9.f9207a;
        c2618v9.f9078e = 0.0f;
        c2618v9.f9079f = 0.0f;
        c2661w9.invalidateSelf();
        AnimationAnimationListenerC0730Qz animationAnimationListenerC0730Qz = new AnimationAnimationListenerC0730Qz(this, 1);
        this.f3153v = this.f3145n;
        C0772Rz c0772Rz = this.f3131J;
        c0772Rz.reset();
        c0772Rz.setDuration(200L);
        c0772Rz.setInterpolator(this.f3150s);
        C2489s9 c2489s9 = this.f3151t;
        c2489s9.f8751a = animationAnimationListenerC0730Qz;
        c2489s9.clearAnimation();
        this.f3151t.startAnimation(c0772Rz);
        C2661w9 c2661w92 = this.f3157z;
        C2618v9 c2618v92 = c2661w92.f9207a;
        if (c2618v92.f9087n) {
            c2618v92.f9087n = false;
        }
        c2661w92.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3139h.f992d;
    }

    /* JADX INFO: renamed from: j */
    public final void m1870j(float f) {
        C0815Sz c0815Sz;
        C0815Sz c0815Sz2;
        C2661w9 c2661w9 = this.f3157z;
        C2618v9 c2618v9 = c2661w9.f9207a;
        if (!c2618v9.f9087n) {
            c2618v9.f9087n = true;
        }
        c2661w9.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f3136e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f3136e;
        int i = this.f3156y;
        if (i <= 0) {
            i = this.f3155x;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.f3154w + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.f3151t.getVisibility() != 0) {
            this.f3151t.setVisibility(0);
        }
        this.f3151t.setScaleX(1.0f);
        this.f3151t.setScaleY(1.0f);
        if (f < this.f3136e) {
            if (this.f3157z.f9207a.f9093t > 76 && ((c0815Sz2 = this.f3124C) == null || !c0815Sz2.hasStarted() || c0815Sz2.hasEnded())) {
                C0815Sz c0815Sz3 = new C0815Sz(this, this.f3157z.f9207a.f9093t, 76);
                c0815Sz3.setDuration(300L);
                C2489s9 c2489s9 = this.f3151t;
                c2489s9.f8751a = null;
                c2489s9.clearAnimation();
                this.f3151t.startAnimation(c0815Sz3);
                this.f3124C = c0815Sz3;
            }
        } else if (this.f3157z.f9207a.f9093t < 255 && ((c0815Sz = this.f3125D) == null || !c0815Sz.hasStarted() || c0815Sz.hasEnded())) {
            C0815Sz c0815Sz4 = new C0815Sz(this, this.f3157z.f9207a.f9093t, 255);
            c0815Sz4.setDuration(300L);
            C2489s9 c2489s92 = this.f3151t;
            c2489s92.f8751a = null;
            c2489s92.clearAnimation();
            this.f3151t.startAnimation(c0815Sz4);
            this.f3125D = c0815Sz4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        C2661w9 c2661w92 = this.f3157z;
        C2618v9 c2618v92 = c2661w92.f9207a;
        c2618v92.f9078e = 0.0f;
        c2618v92.f9079f = fMin2;
        c2661w92.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        C2661w9 c2661w93 = this.f3157z;
        C2618v9 c2618v93 = c2661w93.f9207a;
        if (fMin3 != c2618v93.f9089p) {
            c2618v93.f9089p = fMin3;
        }
        c2661w93.invalidateSelf();
        C2661w9 c2661w94 = this.f3157z;
        c2661w94.f9207a.f9080g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        c2661w94.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.f3145n);
    }

    /* JADX INFO: renamed from: k */
    public final void m1871k(float f) {
        setTargetOffsetTopAndBottom((this.f3153v + ((int) ((this.f3154w - r0) * f))) - this.f3151t.getTop());
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
    public final void m1873m(boolean z, boolean z2) {
        if (this.f3134c != z) {
            this.f3126E = z2;
            m1868h();
            this.f3134c = z;
            AnimationAnimationListenerC0730Qz animationAnimationListenerC0730Qz = this.f3129H;
            if (!z) {
                C0772Rz c0772Rz = new C0772Rz(this, 1);
                this.f3123B = c0772Rz;
                c0772Rz.setDuration(150L);
                C2489s9 c2489s9 = this.f3151t;
                c2489s9.f8751a = animationAnimationListenerC0730Qz;
                c2489s9.clearAnimation();
                this.f3151t.startAnimation(this.f3123B);
                return;
            }
            this.f3153v = this.f3145n;
            C0772Rz c0772Rz2 = this.f3130I;
            c0772Rz2.reset();
            c0772Rz2.setDuration(200L);
            c0772Rz2.setInterpolator(this.f3150s);
            if (animationAnimationListenerC0730Qz != null) {
                this.f3151t.f8751a = animationAnimationListenerC0730Qz;
            }
            this.f3151t.clearAnimation();
            this.f3151t.startAnimation(c0772Rz2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1874n(float f) {
        float f2 = this.f3147p;
        float f3 = f - f2;
        float f4 = this.f3135d;
        if (f3 <= f4 || this.f3148q) {
            return;
        }
        this.f3146o = f2 + f4;
        this.f3148q = true;
        this.f3157z.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1872l();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m1868h();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m1867g() && !this.f3134c && !this.f3143l) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.f3148q = false;
                    this.f3149r = -1;
                } else if (actionMasked == 2) {
                    int i = this.f3149r;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        m1874n(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f3149r) {
                            this.f3149r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
                return this.f3148q;
            }
            setTargetOffsetTopAndBottom(this.f3154w - this.f3151t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3149r = pointerId;
            this.f3148q = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.f3147p = motionEvent.getY(iFindPointerIndex2);
                return this.f3148q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3132a == null) {
            m1868h();
        }
        View view = this.f3132a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f3151t.getMeasuredWidth();
        int measuredHeight2 = this.f3151t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f3145n;
        this.f3151t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3132a == null) {
            m1868h();
        }
        View view = this.f3132a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f3151t.measure(View.MeasureSpec.makeMeasureSpec(this.f3127F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3127F, 1073741824));
        this.f3152u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f3151t) {
                this.f3152u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f3139h.m592a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f3139h.m593b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f3137f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f3137f = 0.0f;
                } else {
                    this.f3137f = f - f2;
                    iArr[1] = i2;
                }
                m1870j(this.f3137f);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.f3140i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo820d(view, i, i2, i3, i4, 0, this.f3142k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3138g.f1403a = i;
        startNestedScroll(i & 2);
        this.f3137f = 0.0f;
        this.f3143l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0944Vz c0944Vz = (C0944Vz) parcelable;
        super.onRestoreInstanceState(c0944Vz.getSuperState());
        setRefreshing(c0944Vz.f2964a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C0944Vz(super.onSaveInstanceState(), this.f3134c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f3134c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f3138g.f1403a = 0;
        this.f3143l = false;
        float f = this.f3137f;
        if (f > 0.0f) {
            m1869i(f);
            this.f3137f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !m1867g() && !this.f3134c && !this.f3143l) {
            if (actionMasked == 0) {
                this.f3149r = motionEvent.getPointerId(0);
                this.f3148q = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3149r);
                if (iFindPointerIndex >= 0) {
                    if (this.f3148q) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.f3146o) * 0.5f;
                        this.f3148q = false;
                        m1869i(y);
                    }
                    this.f3149r = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f3149r);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    m1874n(y2);
                    if (this.f3148q) {
                        float f = (y2 - this.f3146o) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m1870j(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f3149r) {
                            this.f3149r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.f3149r = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f3132a;
        if (view != null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            if (!AbstractC1360eE.m2636h(view)) {
                if (this.f3128G || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.f3151t.setScaleX(f);
        this.f3151t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m1868h();
        C2661w9 c2661w9 = this.f3157z;
        C2618v9 c2618v9 = c2661w9.f9207a;
        c2618v9.f9082i = iArr;
        c2618v9.m5129a(0);
        c2618v9.m5129a(0);
        c2661w9.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f3136e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m1872l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f3128G = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0293Gs c0293Gs = this.f3139h;
        if (c0293Gs.f992d) {
            ViewGroup viewGroup = c0293Gs.f991c;
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            AbstractC1360eE.m2641m(viewGroup);
        }
        c0293Gs.f992d = z;
    }

    public void setOnChildScrollUpCallback(InterfaceC0858Tz interfaceC0858Tz) {
    }

    public void setOnRefreshListener(InterfaceC0901Uz interfaceC0901Uz) {
        this.f3133b = interfaceC0901Uz;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f3151t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f3134c == z) {
            m1873m(z, false);
            return;
        }
        this.f3134c = z;
        setTargetOffsetTopAndBottom((this.f3155x + this.f3154w) - this.f3145n);
        this.f3126E = false;
        this.f3151t.setVisibility(0);
        this.f3157z.setAlpha(255);
        C0772Rz c0772Rz = new C0772Rz(this, 0);
        this.f3122A = c0772Rz;
        c0772Rz.setDuration(this.f3144m);
        AnimationAnimationListenerC0730Qz animationAnimationListenerC0730Qz = this.f3129H;
        if (animationAnimationListenerC0730Qz != null) {
            this.f3151t.f8751a = animationAnimationListenerC0730Qz;
        }
        this.f3151t.clearAnimation();
        this.f3151t.startAnimation(this.f3122A);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f3127F = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f3127F = (int) (displayMetrics.density * 40.0f);
            }
            this.f3151t.setImageDrawable(null);
            this.f3157z.m5227c(i);
            this.f3151t.setImageDrawable(this.f3157z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f3156y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C2489s9 c2489s9 = this.f3151t;
        c2489s9.bringToFront();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        c2489s9.offsetTopAndBottom(i);
        this.f3145n = c2489s9.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f3139h.m598g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f3139h.m599h(0);
    }
}
