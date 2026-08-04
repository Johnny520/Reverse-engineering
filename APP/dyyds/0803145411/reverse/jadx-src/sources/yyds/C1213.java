package yyds;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛵᲇᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1213 extends ViewGroup implements InterfaceC1163 {

    /* JADX INFO: renamed from: ᛳᛷᛶᛵ, reason: contains not printable characters */
    public static final Class[] f5509;

    /* JADX INFO: renamed from: ᛶᛵᛸᛳ, reason: contains not printable characters */
    public static boolean f5511;

    /* JADX INFO: renamed from: ᛶᛷᛶᛲ, reason: contains not printable characters */
    public static boolean f5512;

    /* JADX INFO: renamed from: ᛷᛶᛱᛸ, reason: contains not printable characters */
    public static final InterpolatorC2694 f5513;

    /* JADX INFO: renamed from: ᲈᛵᛶᛲ, reason: contains not printable characters */
    public static final C0731 f5516;

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public boolean f5517;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final RectF f5518;

    /* JADX INFO: renamed from: ᛱᛵᛳᛳ, reason: contains not printable characters */
    public final int[] f5519;

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public C0116 f5520;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public EdgeEffect f5521;

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public int f5522;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2791 f5523;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public AbstractC0416 f5524;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Rect f5525;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public boolean f5526;

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public boolean f5527;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0119 f5528;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2808 f5529;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public int f5530;

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public int f5531;

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public AbstractC2411 f5532;

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final int f5533;

    /* JADX INFO: renamed from: ᛳᛵᛶᲀ, reason: contains not printable characters */
    public int f5534;

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public int f5535;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public InterfaceC2310 f5536;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public AbstractC0359 f5537;

    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    public boolean f5538;

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public int f5539;

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public final RunnableC1177 f5540;

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public final float f5541;

    /* JADX INFO: renamed from: ᛵᛲᛶᲁ, reason: contains not printable characters */
    public boolean f5542;

    /* JADX INFO: renamed from: ᛵᛵᛷᲀ, reason: contains not printable characters */
    public final int[] f5543;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final ArrayList f5544;

    /* JADX INFO: renamed from: ᛵᛸᛵᛶ, reason: contains not printable characters */
    public final C2378 f5545;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public boolean f5546;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public boolean f5547;

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public int f5548;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final ArrayList f5549;

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public VelocityTracker f5550;

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public AbstractC2249 f5551;

    /* JADX INFO: renamed from: ᛶᛵᲁᲈ, reason: contains not printable characters */
    public C1566 f5552;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1231 f5553;

    /* JADX INFO: renamed from: ᛶᛸᛱᲁ, reason: contains not printable characters */
    public boolean f5554;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public boolean f5555;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public EdgeEffect f5556;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public boolean f5557;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final RunnableC0086 f5558;

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public int f5559;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Rect f5560;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public boolean f5561;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public int f5562;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public int f5563;

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public RunnableC0737 f5564;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f5565;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public EdgeEffect f5566;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final AccessibilityManager f5567;

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public final C2637 f5568;

    /* JADX INFO: renamed from: ᛸᲇᛱᲇ, reason: contains not printable characters */
    public final int[] f5569;

    /* JADX INFO: renamed from: ᛸᲇᛴᲀ, reason: contains not printable characters */
    public final RunnableC0086 f5570;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public ArrayList f5571;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final ArrayList f5572;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f5573;

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public ArrayList f5574;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public boolean f5575;

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public AbstractC2362 f5576;

    /* JADX INFO: renamed from: ᲀᲇᛱᛲ, reason: contains not printable characters */
    public final boolean f5577;

    /* JADX INFO: renamed from: ᲀᲇᛶᲈ, reason: contains not printable characters */
    public final C2621 f5578;

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public int f5579;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public EdgeEffect f5580;

    /* JADX INFO: renamed from: ᲁᲀᛱᛴ, reason: contains not printable characters */
    public final ArrayList f5581;

    /* JADX INFO: renamed from: ᲁᲁᛵ, reason: contains not printable characters */
    public int f5582;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public AbstractC2551 f5583;

    /* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
    public boolean f5584;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2444 f5585;

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public final int f5586;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2273 f5587;

    /* JADX INFO: renamed from: ᲈᛲᛳᛶ, reason: contains not printable characters */
    public final int[] f5588;

    /* JADX INFO: renamed from: ᲈᛳ */
    public final C2347 f22;

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public final float f5589;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public int f5590;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public boolean f5591;

    /* JADX INFO: renamed from: ᲈᲁᛵᛶ, reason: contains not printable characters */
    public final C2378 f5592;

    /* JADX INFO: renamed from: ᛲᛱᛵᛱ, reason: contains not printable characters */
    public static final int[] f5508 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: ᛵᛸᲈᛷ, reason: contains not printable characters */
    public static final float f5510 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: ᲇᛳᛱ, reason: contains not printable characters */
    public static final boolean f5515 = true;

    /* JADX INFO: renamed from: ᲁᛸᛲᲈ, reason: contains not printable characters */
    public static final boolean f5514 = true;

    static {
        Class cls = Integer.TYPE;
        f5509 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5513 = new InterpolatorC2694(2);
        f5516 = new C0731();
    }

    public C1213(Context context, AttributeSet attributeSet) {
        char c;
        int i;
        char c2;
        int i2;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.recyclerViewStyle);
        this.f5587 = new C2273(this);
        this.f5529 = new C2808(this);
        this.f5528 = new C0119(15);
        this.f5558 = new RunnableC0086(this, 0);
        this.f5560 = new Rect();
        this.f5525 = new Rect();
        this.f5518 = new RectF();
        this.f5549 = new ArrayList();
        this.f5544 = new ArrayList();
        this.f5572 = new ArrayList();
        this.f5530 = 0;
        this.f5575 = false;
        this.f5561 = false;
        this.f5563 = 0;
        this.f5590 = 0;
        this.f5524 = f5516;
        C2446 c2446 = new C2446();
        c2446.f11852 = null;
        c2446.f11853 = new ArrayList();
        c2446.f11854 = 120L;
        c2446.f11856 = 120L;
        c2446.f11851 = 250L;
        c2446.f11855 = 250L;
        int i3 = 1;
        c2446.f12050 = true;
        c2446.f12044 = new ArrayList();
        c2446.f12046 = new ArrayList();
        c2446.f12053 = new ArrayList();
        c2446.f12051 = new ArrayList();
        c2446.f12052 = new ArrayList();
        c2446.f12045 = new ArrayList();
        c2446.f12043 = new ArrayList();
        c2446.f12047 = new ArrayList();
        c2446.f12054 = new ArrayList();
        c2446.f12049 = new ArrayList();
        c2446.f12048 = new ArrayList();
        this.f5532 = c2446;
        this.f5559 = 0;
        this.f5531 = -1;
        this.f5541 = Float.MIN_VALUE;
        this.f5589 = Float.MIN_VALUE;
        this.f5527 = true;
        this.f5540 = new RunnableC1177(this);
        this.f22 = f5514 ? new C2347() : null;
        C2637 c2637 = new C2637();
        c2637.f12975 = -1;
        c2637.f12976 = 0;
        c2637.f12981 = 0;
        c2637.f12983 = 1;
        c2637.f12974 = 0;
        c2637.f12982 = false;
        c2637.f12977 = false;
        c2637.f12971 = false;
        c2637.f12973 = false;
        c2637.f12980 = false;
        c2637.f12978 = false;
        this.f5568 = c2637;
        this.f5538 = false;
        this.f5542 = false;
        C2378 c2378 = new C2378(this);
        this.f5545 = c2378;
        this.f5584 = false;
        this.f5588 = new int[2];
        this.f5519 = new int[2];
        this.f5543 = new int[2];
        this.f5569 = new int[2];
        this.f5581 = new ArrayList();
        this.f5570 = new RunnableC0086(this, i3);
        this.f5582 = 0;
        this.f5534 = 0;
        this.f5592 = new C2378(this);
        this.f5578 = new C2621(getContext(), new C2378(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5548 = viewConfiguration.getScaledTouchSlop();
        this.f5541 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f5589 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f5533 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5586 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5573 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5532.f11852 = c2378;
        this.f5553 = new C1231(new C2378(this));
        this.f5523 = new C2791(new C2378(this));
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        if (AbstractC1795.m3574(this) == 0) {
            AbstractC1795.m3575(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f5567 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1566(this));
        int[] iArr = AbstractC1848.f9317;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.p000ss.android.ugc.aweme.yyds.R.attr.recyclerViewStyle, 0);
        WeakHashMap weakHashMap2 = AbstractC1640.f8352;
        AbstractC1256.m2535(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.p000ss.android.ugc.aweme.yyds.R.attr.recyclerViewStyle, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5565 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                C0188.m798("Trying to set fast scroller without both required drawables.".concat(m2454()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            int dimensionPixelSize = resources.getDimensionPixelSize(com.p000ss.android.ugc.aweme.yyds.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.p000ss.android.ugc.aweme.yyds.R.dimen.fastscroll_minimum_range);
            c2 = 2;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.p000ss.android.ugc.aweme.yyds.R.dimen.fastscroll_margin);
            i2 = 4;
            i = com.p000ss.android.ugc.aweme.yyds.R.attr.recyclerViewStyle;
            new C2777(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            c = 3;
            i = com.p000ss.android.ugc.aweme.yyds.R.attr.recyclerViewStyle;
            c2 = 2;
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f5577 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = C1213.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC2551.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f5509);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC2551) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    C1693.m3445(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    C1693.m3445(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    C1693.m3445(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    C1693.m3445(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    C1693.m3445(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = f5508;
        int i4 = i;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        AbstractC1256.m2535(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i4, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.p000ss.android.ugc.aweme.yyds.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private C0116 getScrollingChildHelper() {
        C0116 c0116 = this.f5520;
        if (c0116 != null) {
            return c0116;
        }
        C0116 c01162 = new C0116(this);
        this.f5520 = c01162;
        return c01162;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f5511 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f5512 = z;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int m2406(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC2328.m4347(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC2328.m4333(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC2328.m4347(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC2328.m4333(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static void m2410(AbstractC0185 abstractC0185) {
        WeakReference weakReference = abstractC0185.f1096;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0185.f1093) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0185.f1096 = null;
        }
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public static C1213 m2411(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C1213) {
            return (C1213) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1213 c1213M2411 = m2411(viewGroup.getChildAt(i));
            if (c1213M2411 != null) {
                return c1213M2411;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public static AbstractC0185 m2412(View view) {
        if (view == null) {
            return null;
        }
        return ((C2526) view.getLayoutParams()).f12448;
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public static void m2414(Rect rect, View view) {
        C2526 c2526 = (C2526) view.getLayoutParams();
        Rect rect2 = c2526.f12449;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2526).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2526).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2526).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2526).bottomMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            abstractC2551.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2526) && this.f5583.mo163((C2526) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null && abstractC2551.mo206()) {
            return this.f5583.mo193(this.f5568);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null && abstractC2551.mo206()) {
            return this.f5583.mo154(this.f5568);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null && abstractC2551.mo206()) {
            return this.f5583.mo155(this.f5568);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null && abstractC2551.mo174()) {
            return this.f5583.mo172(this.f5568);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null && abstractC2551.mo174()) {
            return this.f5583.mo128(this.f5568);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null && abstractC2551.mo174()) {
            return this.f5583.mo144(this.f5568);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC2551 layoutManager = getLayoutManager();
        int iMo531 = 0;
        if (layoutManager != null) {
            if (layoutManager.mo174()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m2434(0, measuredHeight, null, Integer.MIN_VALUE, false);
                        return true;
                    }
                    m2434(0, -measuredHeight, null, Integer.MIN_VALUE, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo190 = layoutManager.mo190();
                    if (keyCode == 122) {
                        if (zMo190) {
                            iMo531 = getAdapter().mo531();
                        }
                    } else if (!zMo190) {
                        iMo531 = getAdapter().mo531();
                    }
                    m2438(iMo531);
                    return true;
                }
            } else if (layoutManager.mo206()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m2434(measuredWidth, 0, null, Integer.MIN_VALUE, false);
                        return true;
                    }
                    m2434(-measuredWidth, 0, null, Integer.MIN_VALUE, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo1902 = layoutManager.mo190();
                    if (keyCode2 == 122) {
                        if (zMo1902) {
                            iMo531 = getAdapter().mo531();
                        }
                    } else if (!zMo1902) {
                        iMo531 = getAdapter().mo531();
                    }
                    m2438(iMo531);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m525(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m526(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m528(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m530(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.f5544;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC1744) arrayList.get(i)).mo3484(canvas, this);
        }
        EdgeEffect edgeEffect = this.f5521;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f5565 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5521;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f5566;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f5565) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5566;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f5580;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5565 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5580;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f5556;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5565) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5556;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f5532 == null || arrayList.size() <= 0 || !this.f5532.mo4466()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0161, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017f, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0182, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0185, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x018d, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0195, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewMo142;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b;
        boolean z;
        this.f5583.getClass();
        boolean z2 = (this.f5537 == null || this.f5583 == null || m2452() || this.f5546) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C2637 c2637 = this.f5568;
        C2808 c2808 = this.f5529;
        if (z2 && (i == 2 || i == 1)) {
            if (this.f5583.mo174()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                }
                if (!z && this.f5583.mo206()) {
                    z = focusFinder.findNextFocus(this, view, !((this.f5583.f12600.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null;
                }
                if (z) {
                    m2433();
                    if (m2458(view) != null) {
                        m2440();
                        this.f5583.mo142(view, i, c2808, c2637);
                        m2447(false);
                    }
                    return null;
                }
                viewMo142 = focusFinder.findNextFocus(this, view, i);
                if (viewMo142 == null) {
                }
                if (viewMo142 != null) {
                    if (view != null) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        Rect rect = this.f5560;
                        rect.set(0, 0, width, height);
                        int width2 = viewMo142.getWidth();
                        int height2 = viewMo142.getHeight();
                        Rect rect2 = this.f5525;
                        rect2.set(0, 0, width2, height2);
                        offsetDescendantRectToMyCoords(view, rect);
                        offsetDescendantRectToMyCoords(viewMo142, rect2);
                        if (this.f5583.f12600.getLayoutDirection() != 1) {
                        }
                        i2 = rect.left;
                        i3 = rect2.left;
                        if (i2 >= i3) {
                        }
                        i5 = 1;
                        i6 = rect.top;
                        i7 = rect2.top;
                        if (i6 >= i7) {
                        }
                        b = 1;
                        if (i == 1) {
                        }
                    }
                    return viewMo142;
                }
                return super.focusSearch(view, i);
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.f5583.f12600.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            viewMo142 = focusFinder.findNextFocus(this, view, i);
            if (viewMo142 == null) {
            }
            if (viewMo142 != null) {
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z2) {
            m2433();
            if (m2458(view) != null) {
                m2440();
                viewMo142 = this.f5583.mo142(view, i, c2808, c2637);
                m2447(false);
            }
            return null;
        }
        viewMo142 = viewFindNextFocus;
        if (viewMo142 == null && !viewMo142.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m2456(viewMo142, null);
            return view;
        }
        if (viewMo142 != null && viewMo142 != this && viewMo142 != view && m2458(viewMo142) != null) {
            if (view != null && m2458(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.f5560;
                rect3.set(0, 0, width3, height3);
                int width22 = viewMo142.getWidth();
                int height22 = viewMo142.getHeight();
                Rect rect22 = this.f5525;
                rect22.set(0, 0, width22, height22);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(viewMo142, rect22);
                int i9 = this.f5583.f12600.getLayoutDirection() != 1 ? -1 : 1;
                i2 = rect3.left;
                i3 = rect22.left;
                if ((i2 >= i3 || (i4 = rect3.right) <= i3) && (i4 = rect3.right) < rect22.right) {
                    i5 = 1;
                } else {
                    int i10 = rect22.right;
                    i5 = ((i4 > i10 || i2 >= i10) && i2 > i3) ? -1 : 0;
                }
                i6 = rect3.top;
                i7 = rect22.top;
                if ((i6 >= i7 || (i8 = rect3.bottom) <= i7) && (i8 = rect3.bottom) < rect22.bottom) {
                    b = 1;
                } else {
                    int i11 = rect22.bottom;
                    b = ((i8 > i11 || i6 >= i11) && i6 > i7) ? (byte) -1 : (byte) 0;
                }
                if (i == 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + m2454());
                                    }
                                }
                            }
                        }
                    } else if (b <= 0) {
                        if (b == 0) {
                        }
                    }
                } else if (b >= 0) {
                    if (b == 0) {
                    }
                }
            }
            return viewMo142;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            return abstractC2551.mo150();
        }
        C0188.m800("RecyclerView has no LayoutManager".concat(m2454()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            return abstractC2551.mo160(getContext(), attributeSet);
        }
        C0188.m800("RecyclerView has no LayoutManager".concat(m2454()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0359 getAdapter() {
        return this.f5537;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            return super.getBaseline();
        }
        abstractC2551.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5565;
    }

    public C1566 getCompatAccessibilityDelegate() {
        return this.f5552;
    }

    public AbstractC0416 getEdgeEffectFactory() {
        return this.f5524;
    }

    public AbstractC2411 getItemAnimator() {
        return this.f5532;
    }

    public int getItemDecorationCount() {
        return this.f5544.size();
    }

    public AbstractC2551 getLayoutManager() {
        return this.f5583;
    }

    public int getMaxFlingVelocity() {
        return this.f5586;
    }

    public int getMinFlingVelocity() {
        return this.f5533;
    }

    public long getNanoTime() {
        if (f5514) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2249 getOnFlingListener() {
        return this.f5551;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5527;
    }

    public C2773 getRecycledViewPool() {
        return this.f5529.m4937();
    }

    public int getScrollState() {
        return this.f5559;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m529(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f5557;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f5546;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f805;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f5563 = 0;
        this.f5557 = true;
        this.f5547 = this.f5547 && !isLayoutRequested();
        this.f5529.m4939();
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            abstractC2551.f12601 = true;
        }
        this.f5584 = false;
        if (f5514) {
            ThreadLocal threadLocal = RunnableC0737.f3421;
            RunnableC0737 runnableC0737 = (RunnableC0737) threadLocal.get();
            this.f5564 = runnableC0737;
            if (runnableC0737 == null) {
                this.f5564 = new RunnableC0737();
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC0737 runnableC07372 = this.f5564;
                    runnableC07372.f3422 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC07372);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC0737 runnableC073722 = this.f5564;
                    runnableC073722.f3422 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC073722);
                }
            }
            ArrayList arrayList = this.f5564.f3423;
            if (f5511 && arrayList.contains(this)) {
                C0188.m800("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0737 runnableC0737;
        super.onDetachedFromWindow();
        AbstractC2411 abstractC2411 = this.f5532;
        if (abstractC2411 != null) {
            abstractC2411.mo4463();
        }
        m2418();
        int i = 0;
        this.f5557 = false;
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            abstractC2551.f12601 = false;
            abstractC2551.mo199(this);
        }
        this.f5581.clear();
        removeCallbacks(this.f5570);
        this.f5528.getClass();
        while (C2229.f11024.mo1548() != null) {
        }
        C2808 c2808 = this.f5529;
        ArrayList arrayList = c2808.f13692;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC1579.m3236(((AbstractC0185) arrayList.get(i2)).f1093);
        }
        c2808.m4930(c2808.f13687.f5537, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C0026 c0026 = (C0026) childAt.getTag(com.p000ss.android.ugc.aweme.yyds.R.id.pooling_container_listener_holder_tag);
            if (c0026 == null) {
                c0026 = new C0026();
                childAt.setTag(com.p000ss.android.ugc.aweme.yyds.R.id.pooling_container_listener_holder_tag, c0026);
            }
            ArrayList arrayList2 = c0026.f9667;
            int iM4850 = AbstractC2725.m4850(arrayList2);
            if (-1 < iM4850) {
                arrayList2.get(iM4850).getClass();
                C0188.m794();
                return;
            }
            i = i3;
        }
        if (!f5514 || (runnableC0737 = this.f5564) == null) {
            return;
        }
        boolean zRemove = runnableC0737.f3423.remove(this);
        if (!f5511 || zRemove) {
            this.f5564 = null;
        } else {
            C0188.m800("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f5544;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1744) arrayList.get(i)).mo1241(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f5583 != null && !this.f5546 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f = this.f5583.mo174() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f5583.mo206() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f5583.mo174()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.f5583.mo206()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f5577;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f5589);
            int i3 = (int) (axisValue * this.f5541);
            if (z) {
                OverScroller overScroller = this.f5540.f5407;
                m2434((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, null, Integer.MIN_VALUE, true);
            } else {
                AbstractC2551 abstractC2551 = this.f5583;
                if (abstractC2551 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f5546) {
                    int[] iArr = this.f5569;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo206 = abstractC2551.mo206();
                    boolean zMo174 = this.f5583.mo174();
                    int i4 = zMo174 ? (zMo206 ? 1 : 0) | 2 : zMo206 ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM2470 = i3 - m2470(i3, y);
                    int iM2425 = i2 - m2425(i2, x);
                    getScrollingChildHelper().m527(i4, 1);
                    if (m2451(zMo206 ? iM2470 : 0, zMo174 ? iM2425 : 0, 1, this.f5569, this.f5519)) {
                        iM2470 -= iArr[0];
                        iM2425 -= iArr[1];
                    }
                    m5(zMo206 ? iM2470 : 0, zMo174 ? iM2425 : 0, motionEvent, 1);
                    RunnableC0737 runnableC0737 = this.f5564;
                    if (runnableC0737 != null && (iM2470 != 0 || iM2425 != 0)) {
                        runnableC0737.m1695(this, iM2470, iM2425);
                    }
                    m2469(1);
                }
            }
            if (i != 0 && !z) {
                this.f5578.m4734(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f5546) {
            this.f5536 = null;
            if (m2460(motionEvent)) {
                VelocityTracker velocityTracker = this.f5550;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m2469(0);
                m2437();
                setScrollState(0);
                return true;
            }
            AbstractC2551 abstractC2551 = this.f5583;
            if (abstractC2551 != null) {
                boolean zMo206 = abstractC2551.mo206();
                boolean zMo174 = this.f5583.mo174();
                VelocityTracker velocityTrackerObtain = this.f5550;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.f5550 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f5526) {
                        this.f5526 = false;
                    }
                    this.f5531 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f5535 = x;
                    this.f5522 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f5539 = y;
                    this.f5579 = y;
                    EdgeEffect edgeEffect = this.f5521;
                    if (edgeEffect == null || AbstractC2328.m4347(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC2328.m4333(this.f5521, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f5580;
                    if (edgeEffect2 != null && AbstractC2328.m4347(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC2328.m4333(this.f5580, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f5566;
                    if (edgeEffect3 != null && AbstractC2328.m4347(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC2328.m4333(this.f5566, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f5556;
                    if (edgeEffect4 != null && AbstractC2328.m4347(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC2328.m4333(this.f5556, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f5559 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m2469(1);
                    }
                    int[] iArr = this.f5543;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m2467(0);
                } else if (actionMasked == 1) {
                    this.f5550.clear();
                    m2469(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f5531);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5531 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f5559 != 1) {
                        int i = x2 - this.f5522;
                        int i2 = y2 - this.f5579;
                        if (!zMo206 || Math.abs(i) <= this.f5548) {
                            z2 = false;
                        } else {
                            this.f5535 = x2;
                            z2 = true;
                        }
                        if (zMo174 && Math.abs(i2) > this.f5548) {
                            this.f5539 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f5550;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m2469(0);
                    m2437();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f5531 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f5535 = x3;
                    this.f5522 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f5539 = y3;
                    this.f5579 = y3;
                } else if (actionMasked == 6) {
                    m2435(motionEvent);
                }
                if (this.f5559 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m2439();
        Trace.endSection();
        this.f5547 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            m2466(i, i2);
            return;
        }
        boolean zMo200 = abstractC2551.mo200();
        boolean z = false;
        C2637 c2637 = this.f5568;
        if (zMo200) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f5583.f12600.m2466(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f5554 = z;
            if (z || this.f5537 == null) {
                return;
            }
            if (c2637.f12983 == 1) {
                m2461();
            }
            this.f5583.m4619(i, i2);
            c2637.f12973 = true;
            m2432();
            this.f5583.m4625(i, i2);
            if (this.f5583.mo211()) {
                this.f5583.m4619(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c2637.f12973 = true;
                m2432();
                this.f5583.m4625(i, i2);
            }
            this.f5582 = getMeasuredWidth();
            this.f5534 = getMeasuredHeight();
            return;
        }
        if (this.f5555) {
            this.f5583.f12600.m2466(i, i2);
            return;
        }
        if (this.f5517) {
            m2440();
            m2465();
            m2446();
            m2431(true);
            if (c2637.f12978) {
                c2637.f12977 = true;
            } else {
                this.f5553.m2525();
                c2637.f12977 = false;
            }
            this.f5517 = false;
            m2447(false);
        } else if (c2637.f12978) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0359 abstractC0359 = this.f5537;
        if (abstractC0359 != null) {
            c2637.f12974 = abstractC0359.mo531();
        } else {
            c2637.f12974 = 0;
        }
        m2440();
        this.f5583.f12600.m2466(i, i2);
        m2447(false);
        c2637.f12977 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m2452()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2444)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2444 c2444 = (C2444) parcelable;
        this.f5585 = c2444;
        super.onRestoreInstanceState(c2444.f8458);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2444 c2444 = new C2444(super.onSaveInstanceState());
        C2444 c24442 = this.f5585;
        if (c24442 != null) {
            c2444.f12025 = c24442.f12025;
            return c2444;
        }
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            c2444.f12025 = abstractC2551.mo198();
            return c2444;
        }
        c2444.f12025 = null;
        return c2444;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f5556 = null;
        this.f5566 = null;
        this.f5580 = null;
        this.f5521 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2460;
        if (!this.f5546 && !this.f5526) {
            InterfaceC2310 interfaceC2310 = this.f5536;
            if (interfaceC2310 == null) {
                zM2460 = motionEvent.getAction() == 0 ? false : m2460(motionEvent);
            } else {
                interfaceC2310.mo3487(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f5536 = null;
                }
                zM2460 = true;
            }
            if (zM2460) {
                VelocityTracker velocityTracker = this.f5550;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m2469(0);
                m2437();
                setScrollState(0);
                return true;
            }
            AbstractC2551 abstractC2551 = this.f5583;
            if (abstractC2551 != null) {
                boolean zMo206 = abstractC2551.mo206();
                boolean zMo174 = this.f5583.mo174();
                if (this.f5550 == null) {
                    this.f5550 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f5543;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.f5531 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f5535 = x;
                    this.f5522 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f5539 = y;
                    this.f5579 = y;
                    m2467(0);
                } else {
                    if (actionMasked == 1) {
                        this.f5550.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f5550;
                        int i = this.f5586;
                        velocityTracker2.computeCurrentVelocity(1000, i);
                        float f = zMo206 ? -this.f5550.getXVelocity(this.f5531) : 0.0f;
                        float f2 = zMo174 ? -this.f5550.getYVelocity(this.f5531) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !m2471((int) f, (int) f2, this.f5533, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f5550;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        m2469(0);
                        m2437();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f5531);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5531 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f5535 - x2;
                        int iMax2 = this.f5539 - y2;
                        if (this.f5559 != 1) {
                            if (zMo206) {
                                int i2 = this.f5548;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                boolean z = iMax != 0;
                                if (zMo174) {
                                    int i3 = this.f5548;
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                    if (iMax2 != 0) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    setScrollState(1);
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.f5559 == 1) {
                            int[] iArr2 = this.f5569;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iM2470 = iMax - m2470(iMax, motionEvent.getY());
                            int iM2425 = iMax2 - m2425(iMax2, motionEvent.getX());
                            boolean zM2451 = m2451(zMo206 ? iM2470 : 0, zMo174 ? iM2425 : 0, 0, this.f5569, this.f5519);
                            int[] iArr3 = this.f5519;
                            if (zM2451) {
                                iM2470 -= iArr2[0];
                                iM2425 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iM2470;
                            int i5 = iM2425;
                            this.f5535 = x2 - iArr3[0];
                            this.f5539 = y2 - iArr3[1];
                            if (m5(zMo206 ? i4 : 0, zMo174 ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC0737 runnableC0737 = this.f5564;
                            if (runnableC0737 != null && (i4 != 0 || i5 != 0)) {
                                runnableC0737.m1695(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f5550;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        m2469(0);
                        m2437();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f5531 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f5535 = x3;
                        this.f5522 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f5539 = y3;
                        this.f5579 = y3;
                    } else if (actionMasked == 6) {
                        m2435(motionEvent);
                    }
                }
                this.f5550.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC0185 abstractC0185M2412 = m2412(view);
        if (abstractC0185M2412 != null) {
            if (abstractC0185M2412.m781()) {
                abstractC0185M2412.f1091 &= -257;
            } else if (!abstractC0185M2412.m785()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC0185M2412);
                C1693.m3440(sb, m2454());
                return;
            }
        } else if (f5511) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            C1693.m3440(sb2, m2454());
            return;
        }
        view.clearAnimation();
        m2444(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0053 c0053 = this.f5583.f12597;
        if ((c0053 == null || !c0053.f556) && !m2452() && view2 != null) {
            m2456(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f5583.m4628(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f5572;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2310) arrayList.get(i)).mo3489(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5530 != 0 || this.f5546) {
            this.f5591 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5546) {
            return;
        }
        boolean zMo206 = abstractC2551.mo206();
        boolean zMo174 = this.f5583.mo174();
        if (zMo206 || zMo174) {
            if (!zMo206) {
                i = 0;
            }
            if (!zMo174) {
                i2 = 0;
            }
            m5(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m2452()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f5562 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C1566 c1566) {
        this.f5552 = c1566;
        AbstractC1640.m3346(this, c1566);
    }

    public void setAdapter(AbstractC0359 abstractC0359) {
        setLayoutFrozen(false);
        AbstractC0359 abstractC03592 = this.f5537;
        C2273 c2273 = this.f5587;
        if (abstractC03592 != null) {
            abstractC03592.f1869.unregisterObserver(c2273);
            this.f5537.getClass();
        }
        AbstractC2411 abstractC2411 = this.f5532;
        if (abstractC2411 != null) {
            abstractC2411.mo4463();
        }
        AbstractC2551 abstractC2551 = this.f5583;
        C2808 c2808 = this.f5529;
        if (abstractC2551 != null) {
            abstractC2551.m4607(c2808);
            this.f5583.m4608(c2808);
        }
        c2808.f13689.clear();
        c2808.m4938();
        C1231 c1231 = this.f5553;
        c1231.m2514((ArrayList) c1231.f5647);
        c1231.m2514((ArrayList) c1231.f5649);
        c1231.f5645 = 0;
        AbstractC0359 abstractC03593 = this.f5537;
        this.f5537 = abstractC0359;
        if (abstractC0359 != null) {
            abstractC0359.f1869.registerObserver(c2273);
        }
        AbstractC2551 abstractC25512 = this.f5583;
        if (abstractC25512 != null) {
            abstractC25512.mo214();
        }
        AbstractC0359 abstractC03594 = this.f5537;
        c2808.f13689.clear();
        c2808.m4938();
        c2808.m4930(abstractC03593, true);
        C2773 c2773M4937 = c2808.m4937();
        if (abstractC03593 != null) {
            c2773M4937.f13523--;
        }
        if (c2773M4937.f13523 == 0) {
            SparseArray sparseArray = c2773M4937.f13522;
            for (int i = 0; i < sparseArray.size(); i++) {
                C2118 c2118 = (C2118) sparseArray.valueAt(i);
                Iterator it = c2118.f10462.iterator();
                while (it.hasNext()) {
                    AbstractC1579.m3236(((AbstractC0185) it.next()).f1093);
                }
                c2118.f10462.clear();
            }
        }
        if (abstractC03594 != null) {
            c2773M4937.f13523++;
        }
        c2808.m4939();
        this.f5568.f12982 = true;
        m2430(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1084 interfaceC1084) {
        if (interfaceC1084 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f5565) {
            this.f5556 = null;
            this.f5566 = null;
            this.f5580 = null;
            this.f5521 = null;
        }
        this.f5565 = z;
        super.setClipToPadding(z);
        if (this.f5547) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0416 abstractC0416) {
        abstractC0416.getClass();
        this.f5524 = abstractC0416;
        this.f5556 = null;
        this.f5566 = null;
        this.f5580 = null;
        this.f5521 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f5555 = z;
    }

    public void setItemAnimator(AbstractC2411 abstractC2411) {
        AbstractC2411 abstractC24112 = this.f5532;
        if (abstractC24112 != null) {
            abstractC24112.mo4463();
            this.f5532.f11852 = null;
        }
        this.f5532 = abstractC2411;
        if (abstractC2411 != null) {
            abstractC2411.f11852 = this.f5545;
        }
    }

    public void setItemViewCacheSize(int i) {
        C2808 c2808 = this.f5529;
        c2808.f13688 = i;
        c2808.m4928();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC2551 abstractC2551) {
        C1213 c1213;
        if (abstractC2551 == this.f5583) {
            return;
        }
        m2418();
        AbstractC2551 abstractC25512 = this.f5583;
        C2808 c2808 = this.f5529;
        if (abstractC25512 != null) {
            AbstractC2411 abstractC2411 = this.f5532;
            if (abstractC2411 != null) {
                abstractC2411.mo4463();
            }
            this.f5583.m4607(c2808);
            this.f5583.m4608(c2808);
            c2808.f13689.clear();
            c2808.m4938();
            if (this.f5557) {
                AbstractC2551 abstractC25513 = this.f5583;
                abstractC25513.f12601 = false;
                abstractC25513.mo199(this);
            }
            this.f5583.m4606(null);
            this.f5583 = null;
        } else {
            c2808.f13689.clear();
            c2808.m4938();
        }
        C2791 c2791 = this.f5523;
        ((C1641) c2791.f13645).m3347();
        ArrayList arrayList = (ArrayList) c2791.f13647;
        int size = arrayList.size() - 1;
        while (true) {
            c1213 = ((C2378) c2791.f13650).f11724;
            if (size < 0) {
                break;
            }
            AbstractC0185 abstractC0185M2412 = m2412((View) arrayList.get(size));
            if (abstractC0185M2412 != null) {
                int i = abstractC0185M2412.f1094;
                if (c1213.m2452()) {
                    abstractC0185M2412.f1103 = i;
                    c1213.f5581.add(abstractC0185M2412);
                } else {
                    abstractC0185M2412.f1093.setImportantForAccessibility(i);
                }
                abstractC0185M2412.f1094 = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = c1213.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c1213.getChildAt(i2);
            c1213.m2444(childAt);
            childAt.clearAnimation();
        }
        c1213.removeAllViews();
        this.f5583 = abstractC2551;
        if (abstractC2551 != null) {
            if (abstractC2551.f12600 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC2551);
                String strM2454 = abstractC2551.f12600.m2454();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strM2454);
                throw new IllegalArgumentException(sb.toString());
            }
            abstractC2551.m4606(this);
            if (this.f5557) {
                this.f5583.f12601 = true;
            }
        }
        c2808.m4928();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            C0188.m798("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0116 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f805) {
            ViewGroup viewGroup = scrollingChildHelper.f804;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f805 = z;
    }

    public void setOnFlingListener(AbstractC2249 abstractC2249) {
        this.f5551 = abstractC2249;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2362 abstractC2362) {
        this.f5576 = abstractC2362;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f5527 = z;
    }

    public void setRecycledViewPool(C2773 c2773) {
        C2808 c2808 = this.f5529;
        C1213 c1213 = c2808.f13687;
        c2808.m4930(c1213.f5537, false);
        if (c2808.f13691 != null) {
            r1.f13523--;
        }
        c2808.f13691 = c2773;
        if (c2773 != null && c1213.getAdapter() != null) {
            c2808.f13691.f13523++;
        }
        c2808.m4939();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0681 interfaceC0681) {
    }

    public void setScrollState(int i) {
        C0053 c0053;
        if (i == this.f5559) {
            return;
        }
        if (f5512) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f5559, new Exception());
        }
        this.f5559 = i;
        if (i != 2) {
            RunnableC1177 runnableC1177 = this.f5540;
            runnableC1177.f5406.removeCallbacks(runnableC1177);
            runnableC1177.f5407.abortAnimation();
            AbstractC2551 abstractC2551 = this.f5583;
            if (abstractC2551 != null && (c0053 = abstractC2551.f12597) != null) {
                c0053.m412();
            }
        }
        AbstractC2551 abstractC25512 = this.f5583;
        if (abstractC25512 != null) {
            abstractC25512.mo231(i);
        }
        AbstractC2362 abstractC2362 = this.f5576;
        if (abstractC2362 != null) {
            abstractC2362.mo4380(i);
        }
        ArrayList arrayList = this.f5574;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2362) this.f5574.get(size)).mo4380(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f5548 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f5548 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC2449 abstractC2449) {
        this.f5529.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m527(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m523(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f5546) {
            m2457("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f5546 = true;
                this.f5526 = true;
                m2418();
                return;
            }
            this.f5546 = false;
            if (this.f5591 && this.f5583 != null && this.f5537 != null) {
                requestLayout();
            }
            this.f5591 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final void m2417(C2637 c2637) {
        if (getScrollState() != 2) {
            c2637.getClass();
            return;
        }
        OverScroller overScroller = this.f5540.f5407;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c2637.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX INFO: renamed from: ᛱᛵᲈᛸ, reason: contains not printable characters */
    public final void m2418() {
        C0053 c0053;
        setScrollState(0);
        RunnableC1177 runnableC1177 = this.f5540;
        runnableC1177.f5406.removeCallbacks(runnableC1177);
        runnableC1177.f5407.abortAnimation();
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null || (c0053 = abstractC2551.f12597) == null) {
            return;
        }
        c0053.m412();
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final AbstractC0185 m2419(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m2412(view);
        }
        C0188.m792("View ", view, " is not a direct child of ", this);
        return null;
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final void m2420(int i, int i2, boolean z) {
        int i3 = i + i2;
        C2791 c2791 = this.f5523;
        int iM4907 = c2791.m4907();
        for (int i4 = 0; i4 < iM4907; i4++) {
            AbstractC0185 abstractC0185M2412 = m2412(c2791.m4909(i4));
            if (abstractC0185M2412 != null && !abstractC0185M2412.m785()) {
                int i5 = abstractC0185M2412.f1102;
                C2637 c2637 = this.f5568;
                if (i5 >= i3) {
                    if (f5512) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC0185M2412 + " now at position " + (abstractC0185M2412.f1102 - i2));
                    }
                    abstractC0185M2412.m773(-i2, z);
                    c2637.f12982 = true;
                } else if (i5 >= i) {
                    if (f5512) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC0185M2412 + " now REMOVED");
                    }
                    abstractC0185M2412.m776(8);
                    abstractC0185M2412.m773(-i2, z);
                    abstractC0185M2412.f1102 = i - 1;
                    c2637.f12982 = true;
                }
            }
        }
        C2808 c2808 = this.f5529;
        ArrayList arrayList = c2808.f13692;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList.get(size);
            if (abstractC0185 != null) {
                int i6 = abstractC0185.f1102;
                if (i6 >= i3) {
                    if (f5512) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC0185 + " now at position " + (abstractC0185.f1102 - i2));
                    }
                    abstractC0185.m773(-i2, z);
                } else if (i6 >= i) {
                    abstractC0185.m776(8);
                    c2808.m4933(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m2421(AbstractC1744 abstractC1744) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            abstractC2551.mo196("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5544;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1744);
        m2445();
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final int m2422(AbstractC0185 abstractC0185) {
        if ((abstractC0185.f1091 & 524) == 0 && abstractC0185.m786()) {
            int i = abstractC0185.f1102;
            ArrayList arrayList = (ArrayList) this.f5553.f5647;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1931 c1931 = (C1931) arrayList.get(i2);
                int i3 = c1931.f9729;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c1931.f9730;
                        if (i4 <= i) {
                            int i5 = c1931.f9732;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c1931.f9730;
                        if (i6 == i) {
                            i = c1931.f9732;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c1931.f9732 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c1931.f9730 <= i) {
                    i += c1931.f9732;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m2423(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5521;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f5521.onRelease();
            zIsFinished = this.f5521.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5580;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f5580.onRelease();
            zIsFinished |= this.f5580.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5566;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f5566.onRelease();
            zIsFinished |= this.f5566.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5556;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f5556.onRelease();
            zIsFinished |= this.f5556.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final void m2424() {
        if (this.f5566 != null) {
            return;
        }
        ((C0731) this.f5524).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5566 = edgeEffect;
        if (this.f5565) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛵᛱ, reason: contains not printable characters */
    public final int m2425(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f5566;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC2328.m4347(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f5556;
            if (edgeEffect2 != null && AbstractC2328.m4347(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.f5556;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fM4333 = AbstractC2328.m4333(edgeEffect3, height, 1.0f - width);
                    if (AbstractC2328.m4347(this.f5556) == 0.0f) {
                        this.f5556.onRelease();
                    }
                    f2 = fM4333;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.f5566;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC2328.m4333(edgeEffect4, -height, width);
                if (AbstractC2328.m4347(this.f5566) == 0.0f) {
                    this.f5566.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m2426(AbstractC2362 abstractC2362) {
        ArrayList arrayList = this.f5574;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f5574 = arrayList;
        }
        arrayList.add(abstractC2362);
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final void m2427() {
        if (this.f5556 != null) {
            return;
        }
        ((C0731) this.f5524).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5556 = edgeEffect;
        if (this.f5565) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final void m2428(int i) {
        if (this.f5583 == null) {
            return;
        }
        setScrollState(2);
        this.f5583.mo183(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final boolean m2429() {
        return !this.f5547 || this.f5575 || this.f5553.m2520();
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final void m2430(boolean z) {
        this.f5561 = z | this.f5561;
        this.f5575 = true;
        C2791 c2791 = this.f5523;
        int iM4907 = c2791.m4907();
        for (int i = 0; i < iM4907; i++) {
            AbstractC0185 abstractC0185M2412 = m2412(c2791.m4909(i));
            if (abstractC0185M2412 != null && !abstractC0185M2412.m785()) {
                abstractC0185M2412.m776(6);
            }
        }
        m2445();
        C2808 c2808 = this.f5529;
        ArrayList arrayList = c2808.f13692;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList.get(i2);
            if (abstractC0185 != null) {
                abstractC0185.m776(6);
                abstractC0185.m776(1024);
            }
        }
        c2808.m4938();
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public final void m2431(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f5563 - 1;
        this.f5563 = i2;
        if (i2 < 1) {
            if (f5511 && i2 < 0) {
                C0188.m800("layout or scroll counter cannot go below zero.Some calls are not matching".concat(m2454()));
                return;
            }
            this.f5563 = 0;
            if (z) {
                int i3 = this.f5562;
                this.f5562 = 0;
                if (i3 != 0 && (accessibilityManager = this.f5567) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f5581;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0185 abstractC0185 = (AbstractC0185) arrayList.get(size);
                    if (abstractC0185.f1093.getParent() == this && !abstractC0185.m785() && (i = abstractC0185.f1103) != -1) {
                        abstractC0185.f1093.setImportantForAccessibility(i);
                        abstractC0185.f1103 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m2432() {
        m2440();
        m2465();
        C2637 c2637 = this.f5568;
        c2637.m4741(6);
        this.f5553.m2525();
        c2637.f12974 = this.f5537.mo531();
        c2637.f12981 = 0;
        if (this.f5585 != null) {
            AbstractC0359 abstractC0359 = this.f5537;
            abstractC0359.getClass();
            int iM4012 = AbstractC2104.m4012(1);
            if (iM4012 == 1 ? abstractC0359.mo531() > 0 : iM4012 != 2) {
                Parcelable parcelable = this.f5585.f12025;
                if (parcelable != null) {
                    this.f5583.mo194(parcelable);
                }
                this.f5585 = null;
            }
        }
        c2637.f12977 = false;
        this.f5583.mo157(this.f5529, c2637);
        c2637.f12982 = false;
        c2637.f12980 = c2637.f12980 && this.f5532 != null;
        c2637.f12983 = 4;
        m2431(true);
        m2447(false);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m2433() {
        if (!this.f5547 || this.f5575) {
            Trace.beginSection("RV FullInvalidate");
            m2439();
            Trace.endSection();
            return;
        }
        C1231 c1231 = this.f5553;
        if (c1231.m2520()) {
            int i = c1231.f5645;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c1231.m2520()) {
                    Trace.beginSection("RV FullInvalidate");
                    m2439();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m2440();
            m2465();
            c1231.m2523();
            if (!this.f5591) {
                C2791 c2791 = this.f5523;
                int iM4917 = c2791.m4917();
                int i2 = 0;
                while (true) {
                    if (i2 < iM4917) {
                        AbstractC0185 abstractC0185M2412 = m2412(c2791.m4919(i2));
                        if (abstractC0185M2412 != null && !abstractC0185M2412.m785() && abstractC0185M2412.m782()) {
                            m2439();
                            break;
                        }
                        i2++;
                    } else {
                        c1231.m2522();
                        break;
                    }
                }
            }
            m2447(true);
            m2431(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ᛴᛵᛷᛳ, reason: contains not printable characters */
    public final void m2434(int i, int i2, PathInterpolator pathInterpolator, int i3, boolean z) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5546) {
            return;
        }
        if (!abstractC2551.mo206()) {
            i = 0;
        }
        if (!this.f5583.mo174()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().m527(i4, 1);
        }
        this.f5540.m2373(i, i2, i3, pathInterpolator);
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public final void m2435(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5531) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5531 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f5535 = x;
            this.f5522 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f5539 = y;
            this.f5579 = y;
        }
    }

    /* JADX INFO: renamed from: ᛴᛸᲁᛵ, reason: contains not printable characters */
    public final void m2436(AbstractC1744 abstractC1744) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            abstractC2551.mo196("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f5544;
        arrayList.remove(abstractC1744);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m2445();
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
    public final void m2437() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5521;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f5521.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f5566;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f5566.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5580;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f5580.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5556;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f5556.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᛵᛲᛶᲁ, reason: contains not printable characters */
    public final void m2438(int i) {
        if (this.f5546) {
            return;
        }
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2551.mo189(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033c  */
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2439() {
        boolean z;
        View viewFindViewById;
        C0988 c0988;
        C2292 c2292;
        int i;
        boolean zM4486;
        boolean z2;
        int i2;
        if (this.f5537 == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f5583 == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C2637 c2637 = this.f5568;
        boolean z3 = false;
        c2637.f12973 = false;
        boolean z4 = true;
        Object[] objArr = this.f5554 && !(this.f5582 == getWidth() && this.f5534 == getHeight());
        this.f5582 = 0;
        this.f5534 = 0;
        this.f5554 = false;
        if (c2637.f12983 == 1) {
            m2461();
            this.f5583.m4624(this);
            m2432();
        } else {
            C1231 c1231 = this.f5553;
            if ((((ArrayList) c1231.f5649).isEmpty() || ((ArrayList) c1231.f5647).isEmpty()) && !objArr == true && this.f5583.f12593 == getWidth() && this.f5583.f12599 == getHeight()) {
                this.f5583.m4624(this);
            } else {
                this.f5583.m4624(this);
                m2432();
            }
        }
        int i3 = 4;
        c2637.m4741(4);
        m2440();
        m2465();
        c2637.f12983 = 1;
        boolean z5 = c2637.f12980;
        C2791 c2791 = this.f5523;
        C2808 c2808 = this.f5529;
        C0119 c0119 = this.f5528;
        if (z5) {
            int iM4917 = c2791.m4917() - 1;
            while (iM4917 >= 0) {
                AbstractC0185 abstractC0185M2412 = m2412(c2791.m4919(iM4917));
                if (abstractC0185M2412.m785()) {
                    z2 = z4;
                } else {
                    this.f5537.getClass();
                    long j = abstractC0185M2412.f1102;
                    this.f5532.getClass();
                    C2292 c22922 = new C2292();
                    c22922.m4295(abstractC0185M2412);
                    C2010 c2010 = (C2010) c0119.f810;
                    z2 = z4;
                    C0988 c09882 = (C0988) c0119.f812;
                    AbstractC0185 abstractC0185 = (AbstractC0185) c2010.m3885(j);
                    if (abstractC0185 == null || abstractC0185.m785()) {
                        c0119.m552(abstractC0185M2412, c22922);
                    } else {
                        C2229 c2229 = (C2229) c09882.get(abstractC0185);
                        boolean z6 = (c2229 == null || (c2229.f11025 & 1) == 0) ? z3 : z2;
                        C2229 c22292 = (C2229) c09882.get(abstractC0185M2412);
                        boolean z7 = (c22292 == null || (c22292.f11025 & 1) == 0) ? z3 : z2;
                        if (z6 && abstractC0185 == abstractC0185M2412) {
                            c0119.m552(abstractC0185M2412, c22922);
                        } else {
                            C2292 c2292M562 = c0119.m562(abstractC0185, i3);
                            c0119.m552(abstractC0185M2412, c22922);
                            C2292 c2292M5622 = c0119.m562(abstractC0185M2412, 8);
                            if (c2292M562 == null) {
                                int iM49172 = c2791.m4917();
                                int i4 = 0;
                                while (i4 < iM49172) {
                                    AbstractC0185 abstractC0185M24122 = m2412(c2791.m4919(i4));
                                    if (abstractC0185M24122 == abstractC0185M2412) {
                                        i2 = i4;
                                    } else {
                                        this.f5537.getClass();
                                        i2 = i4;
                                        if (abstractC0185M24122.f1102 == j) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC0185M24122 + " \n View Holder 2:" + abstractC0185M2412 + m2454());
                                        }
                                    }
                                    i4 = i2 + 1;
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0185 + " cannot be found but it is necessary for " + abstractC0185M2412 + m2454());
                            } else {
                                abstractC0185.m777(false);
                                if (z6) {
                                    m2448(abstractC0185);
                                }
                                if (abstractC0185 != abstractC0185M2412) {
                                    if (z7) {
                                        m2448(abstractC0185M2412);
                                    }
                                    abstractC0185.f1098 = abstractC0185M2412;
                                    m2448(abstractC0185);
                                    c2808.m4935(abstractC0185);
                                    abstractC0185M2412.m777(false);
                                    abstractC0185M2412.f1089 = abstractC0185;
                                }
                                if (this.f5532.mo4464(abstractC0185, abstractC0185M2412, c2292M562, c2292M5622)) {
                                    m2443();
                                }
                            }
                        }
                    }
                }
                iM4917--;
                z4 = z2;
                z3 = false;
                i3 = 4;
            }
            z = z4;
            C0988 c09883 = (C0988) c0119.f812;
            int i5 = c09883.f4500 - 1;
            while (i5 >= 0) {
                AbstractC0185 abstractC01852 = (AbstractC0185) c09883.m2173(i5);
                C2229 c22293 = (C2229) c09883.mo1163(i5);
                int i6 = c22293.f11025;
                int i7 = i6 & 3;
                C2378 c2378 = this.f5592;
                if (i7 == 3) {
                    C1213 c1213 = c2378.f11724;
                    c1213.f5583.m4627(abstractC01852.f1093, c1213.f5529);
                } else if ((i6 & 1) != 0) {
                    C2292 c22923 = c22293.f11026;
                    if (c22923 == null) {
                        C1213 c12132 = c2378.f11724;
                        c12132.f5583.m4627(abstractC01852.f1093, c12132.f5529);
                    } else {
                        c2378.m4415(abstractC01852, c22923, c22293.f11027);
                    }
                } else if ((i6 & 14) == 14) {
                    c2378.m4420(abstractC01852, c22293.f11026, c22293.f11027);
                } else if ((i6 & 12) == 12) {
                    C2292 c22924 = c22293.f11026;
                    C2292 c22925 = c22293.f11027;
                    c2378.getClass();
                    abstractC01852.m777(false);
                    C1213 c12133 = c2378.f11724;
                    boolean z8 = c12133.f5575;
                    AbstractC2411 abstractC2411 = c12133.f5532;
                    if (!z8) {
                        C2446 c2446 = (C2446) abstractC2411;
                        c2446.getClass();
                        int i8 = c22924.f11256;
                        int i9 = c22925.f11256;
                        if (i8 == i9) {
                            c0988 = c09883;
                            if (c22924.f11257 == c22925.f11257) {
                                c2446.m4465(abstractC01852);
                                zM4486 = false;
                            }
                            if (zM4486) {
                                c12133.m2443();
                            }
                            i = 0;
                            c2292 = null;
                            c22293.f11025 = i;
                            c22293.f11026 = c2292;
                            c22293.f11027 = c2292;
                            C2229.f11024.mo1557(c22293);
                            i5--;
                            c09883 = c0988;
                        } else {
                            c0988 = c09883;
                        }
                        zM4486 = c2446.m4486(abstractC01852, i8, c22924.f11257, i9, c22925.f11257);
                        if (zM4486) {
                        }
                        i = 0;
                        c2292 = null;
                        c22293.f11025 = i;
                        c22293.f11026 = c2292;
                        c22293.f11027 = c2292;
                        C2229.f11024.mo1557(c22293);
                        i5--;
                        c09883 = c0988;
                    } else if (abstractC2411.mo4464(abstractC01852, abstractC01852, c22924, c22925)) {
                        c12133.m2443();
                    }
                } else {
                    c0988 = c09883;
                    if ((i6 & 4) != 0) {
                        c2292 = null;
                        c2378.m4415(abstractC01852, c22293.f11026, null);
                    } else {
                        c2292 = null;
                        if ((i6 & 8) != 0) {
                            c2378.m4420(abstractC01852, c22293.f11026, c22293.f11027);
                        }
                    }
                    i = 0;
                    c22293.f11025 = i;
                    c22293.f11026 = c2292;
                    c22293.f11027 = c2292;
                    C2229.f11024.mo1557(c22293);
                    i5--;
                    c09883 = c0988;
                }
                c0988 = c09883;
                i = 0;
                c2292 = null;
                c22293.f11025 = i;
                c22293.f11026 = c2292;
                c22293.f11027 = c2292;
                C2229.f11024.mo1557(c22293);
                i5--;
                c09883 = c0988;
            }
        } else {
            z = true;
        }
        View view = null;
        this.f5583.m4608(c2808);
        c2637.f12976 = c2637.f12974;
        this.f5575 = false;
        this.f5561 = false;
        c2637.f12980 = false;
        c2637.f12978 = false;
        this.f5583.f12606 = false;
        ArrayList arrayList = c2808.f13690;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551.f12602) {
            abstractC2551.f12604 = 0;
            abstractC2551.f12602 = false;
            c2808.m4928();
        }
        this.f5583.mo0(c2637);
        boolean z9 = z;
        m2431(z9);
        m2447(false);
        ((C0988) c0119.f812).clear();
        ((C2010) c0119.f810).m3884();
        int[] iArr = this.f5588;
        int i10 = iArr[0];
        int i11 = iArr[z9 ? 1 : 0];
        m2463(iArr);
        if (iArr[0] != i10 || iArr[z9 ? 1 : 0] != i11) {
            m2442(0, 0);
        }
        if (this.f5527 && this.f5537 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (((ArrayList) c2791.f13647).contains(getFocusedChild())) {
                    if (c2637.f12972 != -1) {
                        this.f5537.getClass();
                    }
                    if (c2791.m4917() > 0) {
                        int i12 = c2637.f12979;
                        if (i12 == -1) {
                            i12 = 0;
                        }
                        int iM4742 = c2637.m4742();
                        for (int i13 = i12; i13 < iM4742; i13++) {
                            AbstractC0185 abstractC0185M2455 = m2455(i13);
                            if (abstractC0185M2455 == null) {
                                break;
                            }
                            View view2 = abstractC0185M2455.f1093;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                        int iMin = Math.min(iM4742, i12) - 1;
                        while (true) {
                            if (iMin < 0) {
                                break;
                            }
                            AbstractC0185 abstractC0185M24552 = m2455(iMin);
                            if (abstractC0185M24552 == null) {
                                break;
                            }
                            View view3 = abstractC0185M24552.f1093;
                            if (view3.hasFocusable()) {
                                view = view3;
                                break;
                            }
                            iMin--;
                        }
                    }
                    if (view != null) {
                        int i14 = c2637.f12970;
                        if (i14 != -1 && (viewFindViewById = view.findViewById(i14)) != null && viewFindViewById.isFocusable()) {
                            view = viewFindViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
        }
        c2637.f12972 = -1L;
        c2637.f12979 = -1;
        c2637.f12970 = -1;
    }

    /* JADX INFO: renamed from: ᛵᛸᛵᛶ, reason: contains not printable characters */
    public final void m2440() {
        int i = this.f5530 + 1;
        this.f5530 = i;
        if (i != 1 || this.f5546) {
            return;
        }
        this.f5591 = false;
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final void m2441() {
        if (this.f5580 != null) {
            return;
        }
        ((C0731) this.f5524).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5580 = edgeEffect;
        if (this.f5565) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m2442(int i, int i2) {
        this.f5590++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC2362 abstractC2362 = this.f5576;
        if (abstractC2362 != null) {
            abstractC2362.mo1335(this, i, i2);
        }
        ArrayList arrayList = this.f5574;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2362) this.f5574.get(size)).mo1335(this, i, i2);
            }
        }
        this.f5590--;
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public final void m2443() {
        if (this.f5584 || !this.f5557) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        postOnAnimation(this.f5570);
        this.f5584 = true;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final void m2444(View view) {
        m2412(view);
        ArrayList arrayList = this.f5571;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1877 c1877 = (C1877) this.f5571.get(size);
                if (view == c1877.f9453) {
                    c1877.f9453 = null;
                }
                AbstractC0185 abstractC0185M2419 = c1877.f9450.m2419(view);
                if (abstractC0185M2419 != null) {
                    AbstractC0185 abstractC0185 = c1877.f9463;
                    if (abstractC0185 == null || abstractC0185M2419 != abstractC0185) {
                        c1877.m3667(abstractC0185M2419, false);
                        if (c1877.f9447.remove(abstractC0185M2419.f1093)) {
                            c1877.f9442.mo1232(c1877.f9450, abstractC0185M2419);
                        }
                    } else {
                        c1877.m3670(null, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public final void m2445() {
        C2791 c2791 = this.f5523;
        int iM4907 = c2791.m4907();
        for (int i = 0; i < iM4907; i++) {
            ((C2526) c2791.m4909(i).getLayoutParams()).f12450 = true;
        }
        ArrayList arrayList = this.f5529.f13692;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2526 c2526 = (C2526) ((AbstractC0185) arrayList.get(i2)).f1093.getLayoutParams();
            if (c2526 != null) {
                c2526.f12450 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public final void m2446() {
        boolean z;
        boolean z2;
        boolean z3 = this.f5575;
        C1231 c1231 = this.f5553;
        boolean z4 = false;
        if (z3) {
            c1231.m2514((ArrayList) c1231.f5647);
            c1231.m2514((ArrayList) c1231.f5649);
            c1231.f5645 = 0;
            if (this.f5561) {
                this.f5583.mo149();
            }
        }
        if (this.f5532 != null && this.f5583.mo133()) {
            c1231.m2523();
        } else {
            c1231.m2525();
        }
        boolean z5 = this.f5538 || this.f5542;
        if (!this.f5547 || this.f5532 == null || (!(z2 = this.f5575) && !z5 && !this.f5583.f12606)) {
            z = false;
        } else if (z2) {
            this.f5537.getClass();
            z = false;
        } else {
            z = true;
        }
        C2637 c2637 = this.f5568;
        c2637.f12980 = z;
        if (z && z5 && !this.f5575 && this.f5532 != null && this.f5583.mo133()) {
            z4 = true;
        }
        c2637.f12978 = z4;
    }

    /* JADX INFO: renamed from: ᛶᛵᲁᲈ, reason: contains not printable characters */
    public final void m2447(boolean z) {
        int i = this.f5530;
        if (i < 1) {
            if (f5511) {
                C0188.m800("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(m2454()));
                return;
            } else {
                this.f5530 = 1;
                i = 1;
            }
        }
        if (!z && !this.f5546) {
            this.f5591 = false;
        }
        if (i == 1) {
            if (z && this.f5591 && !this.f5546 && this.f5583 != null && this.f5537 != null) {
                m2439();
            }
            if (!this.f5546) {
                this.f5591 = false;
            }
        }
        this.f5530--;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2448(AbstractC0185 abstractC0185) {
        View view = abstractC0185.f1093;
        boolean z = view.getParent() == this;
        this.f5529.m4935(m2419(view));
        boolean zM781 = abstractC0185.m781();
        C2791 c2791 = this.f5523;
        if (zM781) {
            c2791.m4915(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            c2791.m4912(view, -1, true);
            return;
        }
        int iIndexOfChild = ((C2378) c2791.f13650).f11724.indexOfChild(view);
        if (iIndexOfChild < 0) {
            C0188.m795(view, "view is not a child, cannot hide ");
        } else {
            ((C1641) c2791.f13645).m3348(iIndexOfChild);
            c2791.m4913(view);
        }
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final void m2449(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m530(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final Rect m2450(View view) {
        C2526 c2526 = (C2526) view.getLayoutParams();
        boolean z = c2526.f12450;
        Rect rect = c2526.f12449;
        if (!z || (this.f5568.f12977 && (c2526.f12448.m782() || c2526.f12448.m780()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f5544;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f5560;
            rect2.set(0, 0, 0, 0);
            ((AbstractC1744) arrayList.get(i)).mo3485(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c2526.f12450 = false;
        return rect;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final boolean m2451(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m528(i, i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final boolean m2452() {
        return this.f5563 > 0;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m2453() {
        C2791 c2791 = this.f5523;
        int iM4907 = c2791.m4907();
        for (int i = 0; i < iM4907; i++) {
            AbstractC0185 abstractC0185M2412 = m2412(c2791.m4909(i));
            if (!abstractC0185M2412.m785()) {
                abstractC0185M2412.f1105 = -1;
                abstractC0185M2412.f1104 = -1;
            }
        }
        C2808 c2808 = this.f5529;
        ArrayList arrayList = c2808.f13689;
        ArrayList arrayList2 = c2808.f13692;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList2.get(i2);
            abstractC0185.f1105 = -1;
            abstractC0185.f1104 = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0185 abstractC01852 = (AbstractC0185) arrayList.get(i3);
            abstractC01852.f1105 = -1;
            abstractC01852.f1104 = -1;
        }
        ArrayList arrayList3 = c2808.f13690;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0185 abstractC01853 = (AbstractC0185) c2808.f13690.get(i4);
                abstractC01853.f1105 = -1;
                abstractC01853.f1104 = -1;
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final String m2454() {
        return " " + super.toString() + ", adapter:" + this.f5537 + ", layout:" + this.f5583 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final AbstractC0185 m2455(int i) {
        AbstractC0185 abstractC0185 = null;
        if (this.f5575) {
            return null;
        }
        C2791 c2791 = this.f5523;
        int iM4907 = c2791.m4907();
        for (int i2 = 0; i2 < iM4907; i2++) {
            AbstractC0185 abstractC0185M2412 = m2412(c2791.m4909(i2));
            if (abstractC0185M2412 != null && !abstractC0185M2412.m774() && m2422(abstractC0185M2412) == i) {
                if (!((ArrayList) c2791.f13647).contains(abstractC0185M2412.f1093)) {
                    return abstractC0185M2412;
                }
                abstractC0185 = abstractC0185M2412;
            }
        }
        return abstractC0185;
    }

    /* JADX INFO: renamed from: ᛷᲈᛳᛲ, reason: contains not printable characters */
    public final void m2456(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f5560;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2526) {
            C2526 c2526 = (C2526) layoutParams;
            if (!c2526.f12450) {
                Rect rect2 = c2526.f12449;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f5583.m4628(this, view, this.f5560, !this.f5547, view2 == null);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m2457(String str) {
        if (!m2452()) {
            if (this.f5590 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m2454()));
            }
        } else if (str == null) {
            C0188.m800("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m2454()));
        } else {
            C0188.m800(str);
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final View m2458(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛸᲀᛷᛲ, reason: contains not printable characters */
    public final void m2459(int i, int i2, int[] iArr) {
        AbstractC0185 abstractC0185;
        m2440();
        m2465();
        Trace.beginSection("RV Scroll");
        C2637 c2637 = this.f5568;
        m2417(c2637);
        C2808 c2808 = this.f5529;
        int iMo129 = i != 0 ? this.f5583.mo129(i, c2808, c2637) : 0;
        int iMo159 = i2 != 0 ? this.f5583.mo159(i2, c2808, c2637) : 0;
        Trace.endSection();
        C2791 c2791 = this.f5523;
        int iM4917 = c2791.m4917();
        for (int i3 = 0; i3 < iM4917; i3++) {
            View viewM4919 = c2791.m4919(i3);
            AbstractC0185 abstractC0185M2419 = m2419(viewM4919);
            if (abstractC0185M2419 != null && (abstractC0185 = abstractC0185M2419.f1089) != null) {
                View view = abstractC0185.f1093;
                int left = viewM4919.getLeft();
                int top = viewM4919.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m2431(true);
        m2447(false);
        if (iArr != null) {
            iArr[0] = iMo129;
            iArr[1] = iMo159;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final boolean m2460(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f5572;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2310 interfaceC2310 = (InterfaceC2310) arrayList.get(i);
            if (interfaceC2310.mo3488(motionEvent) && action != 3) {
                this.f5536 = interfaceC2310;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m2461() {
        C2229 c2229;
        View viewM2458;
        C2637 c2637 = this.f5568;
        c2637.m4741(1);
        m2417(c2637);
        c2637.f12973 = false;
        m2440();
        C0119 c0119 = this.f5528;
        C0988 c0988 = (C0988) c0119.f812;
        C0988 c09882 = (C0988) c0119.f812;
        c0988.clear();
        C2010 c2010 = (C2010) c0119.f810;
        c2010.m3884();
        m2465();
        m2446();
        AbstractC0185 abstractC0185M2419 = null;
        View focusedChild = (this.f5527 && hasFocus() && this.f5537 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM2458 = m2458(focusedChild)) != null) {
            abstractC0185M2419 = m2419(viewM2458);
        }
        if (abstractC0185M2419 == null) {
            c2637.f12972 = -1L;
            c2637.f12979 = -1;
            c2637.f12970 = -1;
        } else {
            this.f5537.getClass();
            c2637.f12972 = -1L;
            c2637.f12979 = this.f5575 ? -1 : abstractC0185M2419.m774() ? abstractC0185M2419.f1105 : abstractC0185M2419.m778();
            View focusedChild2 = abstractC0185M2419.f1093;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c2637.f12970 = id;
        }
        c2637.f12971 = c2637.f12980 && this.f5542;
        this.f5542 = false;
        this.f5538 = false;
        c2637.f12977 = c2637.f12978;
        c2637.f12974 = this.f5537.mo531();
        m2463(this.f5588);
        boolean z = c2637.f12980;
        C2791 c2791 = this.f5523;
        if (z) {
            int iM4917 = c2791.m4917();
            for (int i = 0; i < iM4917; i++) {
                AbstractC0185 abstractC0185M2412 = m2412(c2791.m4919(i));
                if (!abstractC0185M2412.m785()) {
                    if (abstractC0185M2412.m780()) {
                        this.f5537.getClass();
                    } else {
                        AbstractC2411 abstractC2411 = this.f5532;
                        AbstractC2411.m4462(abstractC0185M2412);
                        abstractC0185M2412.m775();
                        abstractC2411.getClass();
                        C2292 c2292 = new C2292();
                        c2292.m4295(abstractC0185M2412);
                        C2229 c2229M4232 = (C2229) c09882.get(abstractC0185M2412);
                        if (c2229M4232 == null) {
                            c2229M4232 = C2229.m4232();
                            c09882.put(abstractC0185M2412, c2229M4232);
                        }
                        c2229M4232.f11026 = c2292;
                        c2229M4232.f11025 |= 4;
                        if (c2637.f12971 && abstractC0185M2412.m782() && !abstractC0185M2412.m774() && !abstractC0185M2412.m785() && !abstractC0185M2412.m780()) {
                            this.f5537.getClass();
                            c2010.m3886(abstractC0185M2412.f1102, abstractC0185M2412);
                        }
                    }
                }
            }
        }
        if (c2637.f12978) {
            int iM4907 = c2791.m4907();
            for (int i2 = 0; i2 < iM4907; i2++) {
                AbstractC0185 abstractC0185M24122 = m2412(c2791.m4909(i2));
                if (f5511 && abstractC0185M24122.f1102 == -1 && !abstractC0185M24122.m774()) {
                    C0188.m800("view holder cannot have position -1 unless it is removed".concat(m2454()));
                    return;
                }
                if (!abstractC0185M24122.m785() && abstractC0185M24122.f1105 == -1) {
                    abstractC0185M24122.f1105 = abstractC0185M24122.f1102;
                }
            }
            boolean z2 = c2637.f12982;
            c2637.f12982 = false;
            this.f5583.mo157(this.f5529, c2637);
            c2637.f12982 = z2;
            for (int i3 = 0; i3 < c2791.m4917(); i3++) {
                AbstractC0185 abstractC0185M24123 = m2412(c2791.m4919(i3));
                if (!abstractC0185M24123.m785() && ((c2229 = (C2229) c09882.get(abstractC0185M24123)) == null || (c2229.f11025 & 4) == 0)) {
                    AbstractC2411.m4462(abstractC0185M24123);
                    boolean z3 = (abstractC0185M24123.f1091 & 8192) != 0;
                    AbstractC2411 abstractC24112 = this.f5532;
                    abstractC0185M24123.m775();
                    abstractC24112.getClass();
                    C2292 c22922 = new C2292();
                    c22922.m4295(abstractC0185M24123);
                    if (z3) {
                        m2468(abstractC0185M24123, c22922);
                    } else {
                        C2229 c2229M42322 = (C2229) c09882.get(abstractC0185M24123);
                        if (c2229M42322 == null) {
                            c2229M42322 = C2229.m4232();
                            c09882.put(abstractC0185M24123, c2229M42322);
                        }
                        c2229M42322.f11025 |= 2;
                        c2229M42322.f11026 = c22922;
                    }
                }
            }
            m2453();
        } else {
            m2453();
        }
        m2431(true);
        m2447(false);
        c2637.f12983 = 2;
    }

    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public final boolean m2462(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM4347 = AbstractC2328.m4347(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f5573 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f5510;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM4347;
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public final void m2463(int[] iArr) {
        C2791 c2791 = this.f5523;
        int iM4917 = c2791.m4917();
        if (iM4917 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM4917; i3++) {
            AbstractC0185 abstractC0185M2412 = m2412(c2791.m4919(i3));
            if (!abstractC0185M2412.m785()) {
                int iM787 = abstractC0185M2412.m787();
                if (iM787 < i) {
                    i = iM787;
                }
                if (iM787 > i2) {
                    i2 = iM787;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: ᲀᛸᲈᲁ, reason: contains not printable characters */
    public final void m2464(int i) {
        if (this.f5546) {
            return;
        }
        m2418();
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2551.mo183(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final void m2465() {
        this.f5563++;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m2466(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        setMeasuredDimension(AbstractC2551.m4600(i, paddingRight, getMinimumWidth()), AbstractC2551.m4600(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᲇᛶᲀᲇ, reason: contains not printable characters */
    public final void m2467(int i) {
        boolean zMo206 = this.f5583.mo206();
        int i2 = zMo206;
        if (this.f5583.mo174()) {
            i2 = (zMo206 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m527(i2, i);
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public final void m2468(AbstractC0185 abstractC0185, C2292 c2292) {
        abstractC0185.f1091 &= -8193;
        boolean z = this.f5568.f12971;
        C0119 c0119 = this.f5528;
        if (z && abstractC0185.m782() && !abstractC0185.m774() && !abstractC0185.m785()) {
            this.f5537.getClass();
            ((C2010) c0119.f810).m3886(abstractC0185.f1102, abstractC0185);
        }
        C0988 c0988 = (C0988) c0119.f812;
        C2229 c2229M4232 = (C2229) c0988.get(abstractC0185);
        if (c2229M4232 == null) {
            c2229M4232 = C2229.m4232();
            c0988.put(abstractC0185, c2229M4232);
        }
        c2229M4232.f11026 = c2292;
        c2229M4232.f11025 |= 4;
    }

    /* JADX INFO: renamed from: ᲈᛲᛳᛶ, reason: contains not printable characters */
    public final void m2469(int i) {
        getScrollingChildHelper().m523(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX INFO: renamed from: ᲈᛳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        m2433();
        AbstractC0359 abstractC0359 = this.f5537;
        int[] iArr = this.f5569;
        if (abstractC0359 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m2459(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f5544.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m2449(i4, i5, i6, i7, this.f5519, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f5535;
        int[] iArr2 = this.f5519;
        int i13 = iArr2[0];
        this.f5535 = i12 - i13;
        int i14 = this.f5539;
        int i15 = iArr2[1];
        this.f5539 = i14 - i15;
        int[] iArr3 = this.f5543;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || AbstractC1367.m2781(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    m2472();
                    z = true;
                    z2 = false;
                    AbstractC2328.m4333(this.f5521, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        m2441();
                        AbstractC2328.m4333(this.f5580, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                        if (f2 >= 0.0f) {
                            m2424();
                            AbstractC2328.m4333(this.f5566, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                m2427();
                                AbstractC2328.m4333(this.f5556, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (z3 || f != 0.0f || f2 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && AbstractC1367.m2781(motionEvent, 4194304)) {
                                m2437();
                            }
                        }
                        z3 = z;
                        if (z3) {
                            postInvalidateOnAnimation();
                            if (Build.VERSION.SDK_INT >= 31) {
                                m2437();
                            }
                        }
                    }
                }
                z3 = z;
                if (f2 >= 0.0f) {
                }
                z3 = z;
                if (z3) {
                }
            }
            m2423(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            m2442(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    /* JADX INFO: renamed from: ᲈᛳᛵᛴ, reason: contains not printable characters */
    public final int m2470(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f5521;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC2328.m4347(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f5580;
            if (edgeEffect2 != null && AbstractC2328.m4347(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.f5580;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fM4333 = AbstractC2328.m4333(edgeEffect3, width, height);
                    if (AbstractC2328.m4347(this.f5580) == 0.0f) {
                        this.f5580.onRelease();
                    }
                    f2 = fM4333;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f5521;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC2328.m4333(edgeEffect4, -width, 1.0f - height);
                if (AbstractC2328.m4347(this.f5521) == 0.0f) {
                    this.f5521.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2471(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        RunnableC1177 runnableC1177;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        int iM4603;
        PointF pointFMo176;
        int i6;
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f5546) {
            boolean zMo206 = abstractC2551.mo206();
            boolean zMo174 = this.f5583.mo174();
            int i7 = (!zMo206 || Math.abs(i) < i3) ? 0 : i;
            int iMax2 = (!zMo174 || Math.abs(i2) < i3) ? 0 : i2;
            if (i7 != 0 || iMax2 != 0) {
                if (i7 == 0) {
                    iMax = 0;
                    if (iMax2 == 0) {
                        i5 = iMax2;
                        iMax2 = 0;
                        runnableC1177 = this.f5540;
                        if (iMax == 0 || iMax2 != 0) {
                            int i8 = -i4;
                            iMax = Math.max(i8, Math.min(iMax, i4));
                            iMax2 = Math.max(i8, Math.min(iMax2, i4));
                            m2467(1);
                            runnableC1177.m2371(iMax, iMax2);
                        }
                        if (i7 == 0 || i5 != 0) {
                            f = i7;
                            f2 = i5;
                            if (!dispatchNestedPreFling(f, f2)) {
                                boolean z5 = zMo206 || zMo174;
                                dispatchNestedFling(f, f2, z5);
                                AbstractC2249 abstractC2249 = this.f5551;
                                if (abstractC2249 != null) {
                                    C0803 c0803 = (C0803) abstractC2249;
                                    AbstractC2551 layoutManager = c0803.f3683.getLayoutManager();
                                    if (layoutManager != 0 && c0803.f3683.getAdapter() != null && ((Math.abs(i5) > (minFlingVelocity = c0803.f3683.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && ((z4 = layoutManager instanceof InterfaceC1180)))) {
                                        View view = null;
                                        C0567 c0567 = !z4 ? null : new C0567(c0803, c0803.f3683.getContext());
                                        if (c0567 == null) {
                                            z = z5;
                                            z2 = false;
                                            z3 = true;
                                        } else {
                                            int iM4618 = layoutManager.m4618();
                                            if (iM4618 != 0) {
                                                AbstractC0353 abstractC0353M1853 = layoutManager.mo174() ? c0803.m1853(layoutManager) : layoutManager.mo206() ? c0803.m1849(layoutManager) : null;
                                                if (abstractC0353M1853 == null) {
                                                    z = z5;
                                                    z2 = false;
                                                    z3 = true;
                                                } else {
                                                    z2 = false;
                                                    int iM4613 = layoutManager.m4613();
                                                    z3 = true;
                                                    int i9 = 0;
                                                    int i10 = Integer.MIN_VALUE;
                                                    int i11 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i9 < iM4613) {
                                                        boolean z6 = z5;
                                                        View viewM4614 = layoutManager.m4614(i9);
                                                        if (viewM4614 == null) {
                                                            i6 = iM4613;
                                                        } else {
                                                            i6 = iM4613;
                                                            int iM1847 = C0803.m1847(viewM4614, abstractC0353M1853);
                                                            if (iM1847 <= 0 && iM1847 > i10) {
                                                                view2 = viewM4614;
                                                                i10 = iM1847;
                                                            }
                                                            if (iM1847 >= 0 && iM1847 < i11) {
                                                                view = viewM4614;
                                                                i11 = iM1847;
                                                            }
                                                        }
                                                        i9++;
                                                        z5 = z6;
                                                        iM4613 = i6;
                                                    }
                                                    z = z5;
                                                    Object[] objArr = !layoutManager.mo206() ? i5 <= 0 : i7 <= 0;
                                                    if (objArr == true && view != null) {
                                                        iM4603 = AbstractC2551.m4603(view);
                                                    } else if (objArr == true || view2 == null) {
                                                        if (objArr != false) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            iM4603 = ((z4 && (pointFMo176 = ((InterfaceC1180) layoutManager).mo176(layoutManager.m4618() + (-1))) != null && ((pointFMo176.x > 0.0f ? 1 : (pointFMo176.x == 0.0f ? 0 : -1)) < 0 || (pointFMo176.y > 0.0f ? 1 : (pointFMo176.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + AbstractC2551.m4603(view);
                                                            if (iM4603 < 0 || iM4603 >= iM4618) {
                                                            }
                                                        }
                                                    } else {
                                                        iM4603 = AbstractC2551.m4603(view2);
                                                    }
                                                    if (iM4603 != -1) {
                                                        c0567.f557 = iM4603;
                                                        layoutManager.m4612(c0567);
                                                        return z3;
                                                    }
                                                }
                                                iM4603 = -1;
                                                if (iM4603 != -1) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z) {
                                    return z2;
                                }
                                boolean z7 = z3;
                                m2467(z7 ? 1 : 0);
                                int i12 = -i4;
                                runnableC1177.m2371(Math.max(i12, Math.min(i7, i4)), Math.max(i12, Math.min(i5, i4)));
                                return z7;
                            }
                        } else if (iMax != 0 || iMax2 != 0) {
                            return true;
                        }
                    } else {
                        EdgeEffect edgeEffect = this.f5566;
                        if (edgeEffect == null || AbstractC2328.m4347(edgeEffect) == 0.0f) {
                            EdgeEffect edgeEffect2 = this.f5556;
                            if (edgeEffect2 != null && AbstractC2328.m4347(edgeEffect2) != 0.0f) {
                                if (m2462(this.f5556, iMax2, getHeight())) {
                                    this.f5556.onAbsorb(iMax2);
                                    iMax2 = 0;
                                }
                                i5 = 0;
                                runnableC1177 = this.f5540;
                                if (iMax == 0) {
                                    int i82 = -i4;
                                    iMax = Math.max(i82, Math.min(iMax, i4));
                                    iMax2 = Math.max(i82, Math.min(iMax2, i4));
                                    m2467(1);
                                    runnableC1177.m2371(iMax, iMax2);
                                    if (i7 == 0) {
                                        f = i7;
                                        f2 = i5;
                                        if (!dispatchNestedPreFling(f, f2)) {
                                        }
                                    }
                                }
                            }
                            i5 = iMax2;
                            iMax2 = 0;
                            runnableC1177 = this.f5540;
                            if (iMax == 0) {
                            }
                        } else {
                            int i13 = -iMax2;
                            if (m2462(this.f5566, i13, getHeight())) {
                                this.f5566.onAbsorb(i13);
                                iMax2 = 0;
                            }
                            i5 = 0;
                            runnableC1177 = this.f5540;
                            if (iMax == 0) {
                            }
                        }
                    }
                } else {
                    EdgeEffect edgeEffect3 = this.f5521;
                    if (edgeEffect3 == null || AbstractC2328.m4347(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f5580;
                        if (edgeEffect4 != null && AbstractC2328.m4347(edgeEffect4) != 0.0f) {
                            if (m2462(this.f5580, i7, getWidth())) {
                                this.f5580.onAbsorb(i7);
                                i7 = 0;
                            }
                            iMax = i7;
                            i7 = 0;
                            if (iMax2 == 0) {
                            }
                        }
                        iMax = 0;
                        if (iMax2 == 0) {
                        }
                    } else {
                        int i14 = -i7;
                        if (m2462(this.f5521, i14, getWidth())) {
                            this.f5521.onAbsorb(i14);
                            i7 = 0;
                        }
                        iMax = i7;
                        i7 = 0;
                        if (iMax2 == 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final void m2472() {
        if (this.f5521 != null) {
            return;
        }
        ((C0731) this.f5524).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f5521 = edgeEffect;
        if (this.f5565) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2551 abstractC2551 = this.f5583;
        if (abstractC2551 != null) {
            return abstractC2551.mo143(layoutParams);
        }
        C0188.m800("RecyclerView has no LayoutManager".concat(m2454()));
        return null;
    }
}
