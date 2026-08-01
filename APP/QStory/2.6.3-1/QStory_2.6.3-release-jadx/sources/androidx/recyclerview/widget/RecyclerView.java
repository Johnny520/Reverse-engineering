package androidx.recyclerview.widget;

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
import android.os.Parcel;
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
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C1038;
import androidx.collection.C1110;
import androidx.collection.C1123;
import androidx.collection.C1130;
import androidx.compose.foundation.text.C1804;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.p001ui.platform.C2697;
import androidx.core.view.AbstractC3023;
import androidx.core.view.AbstractC3100;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3083;
import androidx.core.view.C3097;
import androidx.customview.view.AbsSavedState;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C5043;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p157.AbstractC8365;
import p160.C8376;
import p184.InterfaceC8545;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public static final C3357 f7518;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static final Class[] f7519;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public static final InterpolatorC3298 f7520;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static boolean f7521 = false;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static boolean f7522 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f7525;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f7526;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ArrayList f7527;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final AccessibilityManager f7528;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7529;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f7530;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f7531;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f7532;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f7533;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f7534;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f7535;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f7536;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ArrayList f7537;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public AbstractC3352 f7538;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC3283 f7539;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final RectF f7540;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Rect f7541;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Rect f7542;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f7543;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f7544;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7545;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC3365 f7546;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final ArrayList f7547;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f7548;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final int[] f7549;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final int[] f7550;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final int[] f7551;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public C3315 f7552;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final int[] f7553;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public C3083 f7554;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final C3287 f7555;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final C3097 f7556;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public ArrayList f7557;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public AbstractC3366 f7558;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final C3287 f7559;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public boolean f7560;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public boolean f7561;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public boolean f7562;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public int f7563;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public boolean f7564;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final boolean f7565;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public int f7566;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final ArrayList f7567;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final RunnableC3288 f7568;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1038 f7569;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public SavedState f7570;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f7571;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final RunnableC3288 f7572;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3328 f7573;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3324 f7574;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3359 f7575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3364 f7576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f7577;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f7578;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f7579;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f7580;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public VelocityTracker f7581;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f7582;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f7583;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public RunnableC3335 f7584;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final RunnableC3313 f7585;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final C3358 f7586;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final C1758 f7587;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final float f7588;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f7589;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final int f7590;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public AbstractC3349 f7591;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final float f7592;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final int f7593;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f7594;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f7595;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public EdgeEffect f7596;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public AbstractC3372 f7597;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public EdgeEffect f7598;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public AbstractC3369 f7599;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public EdgeEffect f7600;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public EdgeEffect f7601;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static final int[] f7524 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static final float f7523 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static final boolean f7517 = true;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static final boolean f7516 = true;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3360();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public Parcelable f7602;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7602 = parcel.readParcelable(classLoader == null ? AbstractC3352.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f7602, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f7519 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f7520 = new InterpolatorC3298(2);
        f7518 = new C3357();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        char c;
        char c2;
        char c3;
        TypedArray typedArray;
        int i2;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f7575 = new C3359(this);
        this.f7576 = new C3364(this);
        C3324 c3324 = new C3324();
        c3324.f7801 = new C1130(0);
        c3324.f7800 = new C1110((Object) null);
        this.f7574 = c3324;
        this.f7572 = new RunnableC3288(this, 0);
        this.f7542 = new Rect();
        this.f7541 = new Rect();
        this.f7540 = new RectF();
        this.f7537 = new ArrayList();
        this.f7548 = new ArrayList();
        this.f7547 = new ArrayList();
        this.f7534 = 0;
        this.f7530 = false;
        this.f7529 = false;
        this.f7525 = 0;
        this.f7526 = 0;
        this.f7597 = f7518;
        C3338 c3338 = new C3338();
        c3338.f7988 = null;
        c3338.f7987 = new ArrayList();
        c3338.f7986 = 120L;
        c3338.f7985 = 120L;
        c3338.f7984 = 250L;
        c3338.f7983 = 250L;
        int i3 = 1;
        c3338.f7851 = true;
        c3338.f7850 = new ArrayList();
        c3338.f7854 = new ArrayList();
        c3338.f7855 = new ArrayList();
        c3338.f7852 = new ArrayList();
        c3338.f7853 = new ArrayList();
        c3338.f7845 = new ArrayList();
        c3338.f7844 = new ArrayList();
        c3338.f7848 = new ArrayList();
        c3338.f7849 = new ArrayList();
        c3338.f7846 = new ArrayList();
        c3338.f7847 = new ArrayList();
        this.f7599 = c3338;
        this.f7583 = 0;
        this.f7582 = -1;
        this.f7592 = Float.MIN_VALUE;
        this.f7588 = Float.MIN_VALUE;
        this.f7589 = true;
        this.f7585 = new RunnableC3313(this);
        this.f7587 = f7516 ? new C1758(2) : null;
        C3358 c3358 = new C3358();
        c3358.f7958 = -1;
        c3358.f7957 = 0;
        c3358.f7956 = 0;
        c3358.f7955 = 1;
        c3358.f7954 = 0;
        c3358.f7953 = false;
        c3358.f7962 = false;
        c3358.f7961 = false;
        c3358.f7965 = false;
        c3358.f7966 = false;
        c3358.f7963 = false;
        this.f7586 = c3358;
        this.f7561 = false;
        this.f7562 = false;
        C3287 c3287 = new C3287(this);
        this.f7559 = c3287;
        this.f7560 = false;
        this.f7551 = new int[2];
        this.f7553 = new int[2];
        this.f7549 = new int[2];
        this.f7550 = new int[2];
        this.f7567 = new ArrayList();
        this.f7568 = new RunnableC3288(this, i3);
        this.f7563 = 0;
        this.f7566 = 0;
        this.f7555 = new C3287(this);
        this.f7556 = new C3097(getContext(), new C3287(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7595 = viewConfiguration.getScaledTouchSlop();
        this.f7592 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f7588 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f7590 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7593 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7577 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f7599.f7988 = c3287;
        this.f7569 = new C1038(new C3287(this));
        this.f7573 = new C3328(new C3287(this));
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        if (AbstractC3023.m4555(this) == 0) {
            AbstractC3023.m4554(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f7528 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C3315(this));
        int[] iArr = AbstractC8365.f20762;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC3103.m4803(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f7571 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                C6755.m11869("Trying to set fast scroller without both required drawables.".concat(m5270()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c3 = 2;
            c2 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
            new C3340(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0328R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0328R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0328R.dimen.fastscroll_margin));
        } else {
            c = 3;
            c2 = 1;
            c3 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        this.f7565 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC3352.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f7519);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[c2] = attributeSet;
                        objArr[c3] = Integer.valueOf(i);
                        objArr[c] = 0;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(c2);
                    setLayoutManager((AbstractC3352) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    C1123.m1406(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    C1123.m1406(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    C1123.m1406(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    C1123.m1406(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    C1123.m1406(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = f7524;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC3103.m4803(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(C0328R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private C3083 getScrollingChildHelper() {
        if (this.f7554 == null) {
            this.f7554 = new C3083(this);
        }
        return this.f7554;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f7521 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f7522 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static AbstractC3317 m5249(View view) {
        if (view == null) {
            return null;
        }
        return ((C3351) view.getLayoutParams()).f7924;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m5250(Rect rect, View view) {
        C3351 c3351 = (C3351) view.getLayoutParams();
        Rect rect2 = c3351.f7922;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c3351).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c3351).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c3351).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c3351).bottomMargin);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static RecyclerView m5251(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM5251 = m5251(viewGroup.getChildAt(i));
            if (recyclerViewM5251 != null) {
                return recyclerViewM5251;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m5255(AbstractC3317 abstractC3317) {
        WeakReference<RecyclerView> weakReference = abstractC3317.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC3317.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC3317.mNestedRecyclerView = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m5256(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC7176.m12457(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC7176.m12486(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC7176.m12457(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC7176.m12486(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            abstractC3352.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public void addOnChildAttachStateChangeListener(InterfaceC3350 interfaceC3350) {
        if (this.f7527 == null) {
            this.f7527 = new ArrayList();
        }
        this.f7527.add(interfaceC3350);
    }

    public void addOnItemTouchListener(InterfaceC3365 interfaceC3365) {
        this.f7547.add(interfaceC3365);
    }

    public void addOnScrollListener(AbstractC3366 abstractC3366) {
        if (this.f7557 == null) {
            this.f7557 = new ArrayList();
        }
        this.f7557.add(abstractC3366);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3351) && this.f7538.mo5178((C3351) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null && abstractC3352.mo5236()) {
            return this.f7538.mo5233(this.f7586);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null && abstractC3352.mo5236()) {
            return this.f7538.mo5176(this.f7586);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null && abstractC3352.mo5236()) {
            return this.f7538.mo5177(this.f7586);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null && abstractC3352.mo5235()) {
            return this.f7538.mo5205(this.f7586);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null && abstractC3352.mo5235()) {
            return this.f7538.mo5163(this.f7586);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null && abstractC3352.mo5235()) {
            return this.f7538.mo5162(this.f7586);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC3352 layoutManager = getLayoutManager();
        int iMo5354 = 0;
        if (layoutManager != null) {
            if (layoutManager.mo5235()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m5308(0, measuredHeight, false);
                        return true;
                    }
                    m5308(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo5240 = layoutManager.mo5240();
                    if (keyCode == 122) {
                        if (zMo5240) {
                            iMo5354 = getAdapter().mo5354();
                        }
                    } else if (!zMo5240) {
                        iMo5354 = getAdapter().mo5354();
                    }
                    m5304(iMo5354);
                    return true;
                }
            } else if (layoutManager.mo5236()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m5308(measuredWidth, 0, false);
                        return true;
                    }
                    m5308(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo52402 = layoutManager.mo5240();
                    if (keyCode2 == 122) {
                        if (zMo52402) {
                            iMo5354 = getAdapter().mo5354();
                        }
                    } else if (!zMo52402) {
                        iMo5354 = getAdapter().mo5354();
                    }
                    m5304(iMo5354);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m4767(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m4766(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4765(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m4764(i, i2, i3, i4, iArr, 0, null);
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
        ArrayList arrayList = this.f7548;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC3370) arrayList.get(i)).mo5447(canvas, this);
        }
        EdgeEffect edgeEffect = this.f7596;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f7571 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f7596;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f7600;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f7571) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f7600;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f7601;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f7571 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f7601;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f7598;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f7571) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f7598;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f7599 == null || arrayList.size() <= 0 || !this.f7599.mo5527()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0166, code lost:
    
        if (r16 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0184, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0187, code lost:
    
        if (r16 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018a, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0192, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019a, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewMo5179;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b;
        boolean z;
        this.f7538.getClass();
        boolean z2 = (this.f7539 == null || this.f7538 == null || m5265() || this.f7536) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C3358 c3358 = this.f7586;
        C3364 c3364 = this.f7576;
        if (z2 && (i == 2 || i == 1)) {
            if (this.f7538.mo5235()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                }
                if (!z && this.f7538.mo5236()) {
                    z = focusFinder.findNextFocus(this, view, !((this.f7538.f7937.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null;
                }
                if (z) {
                    m5288();
                    if (m5279(view) != null) {
                        m5305();
                        this.f7538.mo5179(view, i, c3364, c3358);
                        m5300(false);
                    }
                    return null;
                }
                viewMo5179 = focusFinder.findNextFocus(this, view, i);
                if (viewMo5179 == null) {
                }
                if (viewMo5179 != null) {
                    if (view != null) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        Rect rect = this.f7542;
                        rect.set(0, 0, width, height);
                        int width2 = viewMo5179.getWidth();
                        int height2 = viewMo5179.getHeight();
                        Rect rect2 = this.f7541;
                        rect2.set(0, 0, width2, height2);
                        offsetDescendantRectToMyCoords(view, rect);
                        offsetDescendantRectToMyCoords(viewMo5179, rect2);
                        if (this.f7538.f7937.getLayoutDirection() != 1) {
                        }
                        i2 = rect.left;
                        i3 = rect2.left;
                        if (i2 >= i3) {
                        }
                        i4 = 1;
                        i5 = rect.top;
                        i6 = rect2.top;
                        if (i5 >= i6) {
                        }
                        b = 1;
                        if (i == 1) {
                        }
                    }
                    return viewMo5179;
                }
                return super.focusSearch(view, i);
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.f7538.f7937.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            viewMo5179 = focusFinder.findNextFocus(this, view, i);
            if (viewMo5179 == null) {
            }
            if (viewMo5179 != null) {
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z2) {
            m5288();
            if (m5279(view) != null) {
                m5305();
                viewMo5179 = this.f7538.mo5179(view, i, c3364, c3358);
                m5300(false);
            }
            return null;
        }
        viewMo5179 = viewFindNextFocus;
        if (viewMo5179 == null && !viewMo5179.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m5310(viewMo5179, null);
            return view;
        }
        if (viewMo5179 != null && viewMo5179 != this && viewMo5179 != view && m5279(viewMo5179) != null) {
            if (view != null && m5279(view) != null) {
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                Rect rect3 = this.f7542;
                rect3.set(0, 0, width3, height3);
                int width22 = viewMo5179.getWidth();
                int height22 = viewMo5179.getHeight();
                Rect rect22 = this.f7541;
                rect22.set(0, 0, width22, height22);
                offsetDescendantRectToMyCoords(view, rect3);
                offsetDescendantRectToMyCoords(viewMo5179, rect22);
                int i7 = this.f7538.f7937.getLayoutDirection() != 1 ? -1 : 1;
                i2 = rect3.left;
                i3 = rect22.left;
                if ((i2 >= i3 || rect3.right <= i3) && rect3.right < rect22.right) {
                    i4 = 1;
                } else {
                    int i8 = rect3.right;
                    int i9 = rect22.right;
                    i4 = ((i8 > i9 || i2 >= i9) && i2 > i3) ? -1 : 0;
                }
                i5 = rect3.top;
                i6 = rect22.top;
                if ((i5 >= i6 || rect3.bottom <= i6) && rect3.bottom < rect22.bottom) {
                    b = 1;
                } else {
                    int i10 = rect3.bottom;
                    int i11 = rect22.bottom;
                    b = ((i10 > i11 || i5 >= i11) && i5 > i6) ? (byte) -1 : (byte) 0;
                }
                if (i == 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + m5270());
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
            return viewMo5179;
        }
        return super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            return abstractC3352.mo5161();
        }
        C6755.m11870("RecyclerView has no LayoutManager".concat(m5270()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            return abstractC3352.mo5166(getContext(), attributeSet);
        }
        C6755.m11870("RecyclerView has no LayoutManager".concat(m5270()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC3283 getAdapter() {
        return this.f7539;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            return super.getBaseline();
        }
        abstractC3352.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f7571;
    }

    public C3315 getCompatAccessibilityDelegate() {
        return this.f7552;
    }

    public AbstractC3372 getEdgeEffectFactory() {
        return this.f7597;
    }

    public AbstractC3369 getItemAnimator() {
        return this.f7599;
    }

    public int getItemDecorationCount() {
        return this.f7548.size();
    }

    public AbstractC3352 getLayoutManager() {
        return this.f7538;
    }

    public int getMaxFlingVelocity() {
        return this.f7593;
    }

    public int getMinFlingVelocity() {
        return this.f7590;
    }

    public long getNanoTime() {
        if (f7516) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC3349 getOnFlingListener() {
        return this.f7591;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f7589;
    }

    public C3361 getRecycledViewPool() {
        return this.f7576.m5592();
    }

    public int getScrollState() {
        return this.f7583;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m4762(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f7545;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f7536;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6899;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f7525 = 0;
        this.f7545 = true;
        this.f7543 = this.f7543 && !isLayoutRequested();
        this.f7576.m5590();
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            abstractC3352.f7936 = true;
            abstractC3352.mo5576(this);
        }
        this.f7560 = false;
        if (f7516) {
            ThreadLocal threadLocal = RunnableC3335.f7835;
            RunnableC3335 runnableC3335 = (RunnableC3335) threadLocal.get();
            this.f7584 = runnableC3335;
            if (runnableC3335 == null) {
                this.f7584 = new RunnableC3335();
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC3335 runnableC33352 = this.f7584;
                    runnableC33352.f7839 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC33352);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC3335 runnableC333522 = this.f7584;
                    runnableC333522.f7839 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC333522);
                }
            }
            ArrayList arrayList = this.f7584.f7840;
            if (f7521 && arrayList.contains(this)) {
                C6755.m11870("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC3335 runnableC3335;
        super.onDetachedFromWindow();
        AbstractC3369 abstractC3369 = this.f7599;
        if (abstractC3369 != null) {
            abstractC3369.mo5528();
        }
        m5302();
        int i = 0;
        this.f7545 = false;
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            abstractC3352.f7936 = false;
            abstractC3352.mo5238(this);
        }
        this.f7567.clear();
        removeCallbacks(this.f7568);
        this.f7574.getClass();
        while (C3321.f7791.acquire() != null) {
        }
        C3364 c3364 = this.f7576;
        ArrayList arrayList = c3364.f7978;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC3889.m7301(((AbstractC3317) arrayList.get(i2)).itemView);
        }
        c3364.m5589(c3364.f7981.f7539, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = AbstractC3889.m7309(childAt).f21274;
            for (int iM12460 = AbstractC7176.m12460(arrayList2); -1 < iM12460; iM12460--) {
                ((C2697) ((InterfaceC8545) arrayList2.get(iM12460))).f5710.m4055();
            }
            i = i3;
        }
        if (!f7516 || (runnableC3335 = this.f7584) == null) {
            return;
        }
        boolean zRemove = runnableC3335.f7840.remove(this);
        if (!f7521 || zRemove) {
            this.f7584 = null;
        } else {
            C6755.m11870("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f7548;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3370) arrayList.get(i)).mo5448(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f7538 != null && !this.f7536 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f = this.f7538.mo5235() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f7538.mo5236() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f7538.mo5235()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.f7538.mo5236()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f7565;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f7588);
            int i3 = (int) (axisValue * this.f7592);
            if (z) {
                OverScroller overScroller = this.f7585.f7777;
                m5308((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                AbstractC3352 abstractC3352 = this.f7538;
                if (abstractC3352 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f7536) {
                    int[] iArr = this.f7550;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo5236 = abstractC3352.mo5236();
                    boolean zMo5235 = this.f7538.mo5235();
                    int i4 = zMo5235 ? (zMo5236 ? 1 : 0) | 2 : zMo5236 ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM5297 = i3 - m5297(y, i3);
                    int iM5296 = i2 - m5296(x, i2);
                    getScrollingChildHelper().m4769(i4, 1);
                    if (m5283(zMo5236 ? iM5297 : 0, zMo5235 ? iM5296 : 0, 1, this.f7550, this.f7553)) {
                        iM5297 -= iArr[0];
                        iM5296 -= iArr[1];
                    }
                    m5311(zMo5236 ? iM5297 : 0, zMo5235 ? iM5296 : 0, motionEvent, 1);
                    RunnableC3335 runnableC3335 = this.f7584;
                    if (runnableC3335 != null && (iM5297 != 0 || iM5296 != 0)) {
                        runnableC3335.m5525(this, iM5297, iM5296);
                    }
                    m5303(1);
                }
            }
            if (i != 0 && !z) {
                this.f7556.m4784(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f7536) {
            this.f7546 = null;
            if (m5278(motionEvent)) {
                VelocityTracker velocityTracker = this.f7581;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m5303(0);
                m5298();
                setScrollState(0);
                return true;
            }
            AbstractC3352 abstractC3352 = this.f7538;
            if (abstractC3352 != null) {
                boolean zMo5236 = abstractC3352.mo5236();
                boolean zMo5235 = this.f7538.mo5235();
                if (this.f7581 == null) {
                    this.f7581 = VelocityTracker.obtain();
                }
                this.f7581.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f7535) {
                        this.f7535 = false;
                    }
                    this.f7582 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f7578 = x;
                    this.f7580 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f7594 = y;
                    this.f7579 = y;
                    EdgeEffect edgeEffect = this.f7596;
                    if (edgeEffect == null || AbstractC7176.m12457(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC7176.m12486(this.f7596, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f7601;
                    if (edgeEffect2 != null && AbstractC7176.m12457(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC7176.m12486(this.f7601, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f7600;
                    if (edgeEffect3 != null && AbstractC7176.m12457(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC7176.m12486(this.f7600, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f7598;
                    if (edgeEffect4 != null && AbstractC7176.m12457(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC7176.m12486(this.f7598, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f7583 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m5303(1);
                    }
                    int[] iArr = this.f7549;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m5301(0);
                } else if (actionMasked == 1) {
                    this.f7581.clear();
                    m5303(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f7582);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f7582 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f7583 != 1) {
                        int i = x2 - this.f7580;
                        int i2 = y2 - this.f7579;
                        if (!zMo5236 || Math.abs(i) <= this.f7595) {
                            z2 = false;
                        } else {
                            this.f7578 = x2;
                            z2 = true;
                        }
                        if (zMo5235 && Math.abs(i2) > this.f7595) {
                            this.f7594 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f7581;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m5303(0);
                    m5298();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f7582 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f7578 = x3;
                    this.f7580 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f7594 = y3;
                    this.f7579 = y3;
                } else if (actionMasked == 6) {
                    m5316(motionEvent);
                }
                if (this.f7583 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m5281();
        Trace.endSection();
        this.f7543 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            m5289(i, i2);
            return;
        }
        boolean zMo5241 = abstractC3352.mo5241();
        boolean z = false;
        C3358 c3358 = this.f7586;
        if (zMo5241) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f7538.f7937.m5289(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f7564 = z;
            if (z || this.f7539 == null) {
                return;
            }
            if (c3358.f7955 == 1) {
                m5285();
            }
            this.f7538.m5569(i, i2);
            c3358.f7965 = true;
            m5286();
            this.f7538.m5571(i, i2);
            if (this.f7538.mo5228()) {
                this.f7538.m5569(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c3358.f7965 = true;
                m5286();
                this.f7538.m5571(i, i2);
            }
            this.f7563 = getMeasuredWidth();
            this.f7566 = getMeasuredHeight();
            return;
        }
        if (this.f7544) {
            this.f7538.f7937.m5289(i, i2);
            return;
        }
        if (this.f7532) {
            m5305();
            m5313();
            m5314();
            m5312(true);
            if (c3358.f7963) {
                c3358.f7962 = true;
            } else {
                this.f7569.m1249();
                c3358.f7962 = false;
            }
            this.f7532 = false;
            m5300(false);
        } else if (c3358.f7963) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC3283 abstractC3283 = this.f7539;
        if (abstractC3283 != null) {
            c3358.f7954 = abstractC3283.mo5354();
        } else {
            c3358.f7954 = 0;
        }
        m5305();
        this.f7538.f7937.m5289(i, i2);
        m5300(false);
        c3358.f7962 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m5265()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f7570 = savedState;
        super.onRestoreInstanceState(savedState.f7044);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f7570;
        if (savedState2 != null) {
            savedState.f7602 = savedState2.f7602;
            return savedState;
        }
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            savedState.f7602 = abstractC3352.mo5229();
            return savedState;
        }
        savedState.f7602 = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f7598 = null;
        this.f7600 = null;
        this.f7601 = null;
        this.f7596 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM5278;
        if (!this.f7536 && !this.f7535) {
            InterfaceC3365 interfaceC3365 = this.f7546;
            if (interfaceC3365 == null) {
                zM5278 = motionEvent.getAction() == 0 ? false : m5278(motionEvent);
            } else {
                interfaceC3365.mo5432(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f7546 = null;
                }
                zM5278 = true;
            }
            if (zM5278) {
                VelocityTracker velocityTracker = this.f7581;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m5303(0);
                m5298();
                setScrollState(0);
                return true;
            }
            AbstractC3352 abstractC3352 = this.f7538;
            if (abstractC3352 != null) {
                boolean zMo5236 = abstractC3352.mo5236();
                boolean zMo5235 = this.f7538.mo5235();
                if (this.f7581 == null) {
                    this.f7581 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f7549;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked == 0) {
                    this.f7582 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f7578 = x;
                    this.f7580 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f7594 = y;
                    this.f7579 = y;
                    m5301(0);
                } else {
                    if (actionMasked == 1) {
                        this.f7581.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f7581;
                        int i = this.f7593;
                        velocityTracker2.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, i);
                        float f = zMo5236 ? -this.f7581.getXVelocity(this.f7582) : 0.0f;
                        float f2 = zMo5235 ? -this.f7581.getYVelocity(this.f7582) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !m5267((int) f, (int) f2, this.f7590, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f7581;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        m5303(0);
                        m5298();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f7582);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f7582 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f7578 - x2;
                        int iMax2 = this.f7594 - y2;
                        if (this.f7583 != 1) {
                            if (zMo5236) {
                                int i2 = this.f7595;
                                iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                boolean z = iMax != 0;
                                if (zMo5235) {
                                    int i3 = this.f7595;
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
                        if (this.f7583 == 1) {
                            int[] iArr2 = this.f7550;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iM5297 = iMax - m5297(motionEvent.getY(), iMax);
                            int iM5296 = iMax2 - m5296(motionEvent.getX(), iMax2);
                            boolean zM5283 = m5283(zMo5236 ? iM5297 : 0, zMo5235 ? iM5296 : 0, 0, this.f7550, this.f7553);
                            int[] iArr3 = this.f7553;
                            if (zM5283) {
                                iM5297 -= iArr2[0];
                                iM5296 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iM5297;
                            int i5 = iM5296;
                            this.f7578 = x2 - iArr3[0];
                            this.f7594 = y2 - iArr3[1];
                            if (m5311(zMo5236 ? i4 : 0, zMo5235 ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC3335 runnableC3335 = this.f7584;
                            if (runnableC3335 != null && (i4 != 0 || i5 != 0)) {
                                runnableC3335.m5525(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f7581;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        m5303(0);
                        m5298();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f7582 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f7578 = x3;
                        this.f7580 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f7594 = y3;
                        this.f7579 = y3;
                    } else if (actionMasked == 6) {
                        m5316(motionEvent);
                    }
                }
                this.f7581.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC3317 abstractC3317M5249 = m5249(view);
        if (abstractC3317M5249 != null) {
            if (abstractC3317M5249.isTmpDetached()) {
                abstractC3317M5249.clearTmpDetachFlag();
            } else if (!abstractC3317M5249.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC3317M5249);
                C5043.m9162(m5270(), sb);
                return;
            }
        } else if (f7521) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            C5043.m9162(m5270(), sb2);
            return;
        }
        view.clearAnimation();
        m5282(view);
        super.removeDetachedView(view, z);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC3350 interfaceC3350) {
        ArrayList arrayList = this.f7527;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC3350);
    }

    public void removeOnItemTouchListener(InterfaceC3365 interfaceC3365) {
        this.f7547.remove(interfaceC3365);
        if (this.f7546 == interfaceC3365) {
            this.f7546 = null;
        }
    }

    public void removeOnScrollListener(AbstractC3366 abstractC3366) {
        ArrayList arrayList = this.f7557;
        if (arrayList != null) {
            arrayList.remove(abstractC3366);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C3292 c3292 = this.f7538.f7931;
        if ((c3292 == null || !c3292.f7658) && !m5265() && view2 != null) {
            m5310(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f7538.mo5562(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f7547;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC3365) arrayList.get(i)).mo5430(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f7534 != 0 || this.f7536) {
            this.f7533 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f7536) {
            return;
        }
        boolean zMo5236 = abstractC3352.mo5236();
        boolean zMo5235 = this.f7538.mo5235();
        if (zMo5236 || zMo5235) {
            if (!zMo5236) {
                i = 0;
            }
            if (!zMo5235) {
                i2 = 0;
            }
            m5311(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m5265()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f7531 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C3315 c3315) {
        this.f7552 = c3315;
        AbstractC3103.m4804(this, c3315);
    }

    public void setAdapter(AbstractC3283 abstractC3283) {
        setLayoutFrozen(false);
        AbstractC3283 abstractC32832 = this.f7539;
        C3359 c3359 = this.f7575;
        if (abstractC32832 != null) {
            abstractC32832.f7643.unregisterObserver(c3359);
            this.f7539.mo5357(this);
        }
        AbstractC3369 abstractC3369 = this.f7599;
        if (abstractC3369 != null) {
            abstractC3369.mo5528();
        }
        AbstractC3352 abstractC3352 = this.f7538;
        C3364 c3364 = this.f7576;
        if (abstractC3352 != null) {
            abstractC3352.m5567(c3364);
            this.f7538.m5560(c3364);
        }
        c3364.f7980.clear();
        c3364.m5598();
        C1038 c1038 = this.f7569;
        c1038.m1228((ArrayList) c1038.f1093);
        c1038.m1228((ArrayList) c1038.f1092);
        c1038.f1095 = 0;
        AbstractC3283 abstractC32833 = this.f7539;
        this.f7539 = abstractC3283;
        if (abstractC3283 != null) {
            abstractC3283.f7643.registerObserver(c3359);
            abstractC3283.mo5368(this);
        }
        AbstractC3352 abstractC33522 = this.f7538;
        if (abstractC33522 != null) {
            abstractC33522.mo5344(this.f7539);
        }
        AbstractC3283 abstractC32834 = this.f7539;
        c3364.f7980.clear();
        c3364.m5598();
        c3364.m5589(abstractC32833, true);
        C3361 c3361M5592 = c3364.m5592();
        if (abstractC32833 != null) {
            c3361M5592.f7969--;
        }
        if (c3361M5592.f7969 == 0) {
            SparseArray sparseArray = c3361M5592.f7970;
            for (int i = 0; i < sparseArray.size(); i++) {
                C3362 c3362 = (C3362) sparseArray.valueAt(i);
                Iterator it = c3362.f7974.iterator();
                while (it.hasNext()) {
                    AbstractC3889.m7301(((AbstractC3317) it.next()).itemView);
                }
                c3362.f7974.clear();
            }
        }
        if (abstractC32834 != null) {
            c3361M5592.f7969++;
        }
        c3364.m5590();
        this.f7586.f7953 = true;
        m5315(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC3371 interfaceC3371) {
        if (interfaceC3371 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f7571) {
            this.f7598 = null;
            this.f7600 = null;
            this.f7601 = null;
            this.f7596 = null;
        }
        this.f7571 = z;
        super.setClipToPadding(z);
        if (this.f7543) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC3372 abstractC3372) {
        abstractC3372.getClass();
        this.f7597 = abstractC3372;
        this.f7598 = null;
        this.f7600 = null;
        this.f7601 = null;
        this.f7596 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f7544 = z;
    }

    public void setItemAnimator(AbstractC3369 abstractC3369) {
        AbstractC3369 abstractC33692 = this.f7599;
        if (abstractC33692 != null) {
            abstractC33692.mo5528();
            this.f7599.f7988 = null;
        }
        this.f7599 = abstractC3369;
        if (abstractC3369 != null) {
            abstractC3369.f7988 = this.f7559;
        }
    }

    public void setItemViewCacheSize(int i) {
        C3364 c3364 = this.f7576;
        c3364.f7976 = i;
        c3364.m5595();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC3352 abstractC3352) {
        RecyclerView recyclerView;
        if (abstractC3352 == this.f7538) {
            return;
        }
        m5302();
        AbstractC3352 abstractC33522 = this.f7538;
        C3364 c3364 = this.f7576;
        if (abstractC33522 != null) {
            AbstractC3369 abstractC3369 = this.f7599;
            if (abstractC3369 != null) {
                abstractC3369.mo5528();
            }
            this.f7538.m5567(c3364);
            this.f7538.m5560(c3364);
            c3364.f7980.clear();
            c3364.m5598();
            if (this.f7545) {
                AbstractC3352 abstractC33523 = this.f7538;
                abstractC33523.f7936 = false;
                abstractC33523.mo5238(this);
            }
            this.f7538.m5570(null);
            this.f7538 = null;
        } else {
            c3364.f7980.clear();
            c3364.m5598();
        }
        C3328 c3328 = this.f7573;
        ((C3329) c3328.f7815).m5516();
        ArrayList arrayList = (ArrayList) c3328.f7814;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C3287) c3328.f7816).f7649;
            if (size < 0) {
                break;
            }
            AbstractC3317 abstractC3317M5249 = m5249((View) arrayList.get(size));
            if (abstractC3317M5249 != null) {
                abstractC3317M5249.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.m5282(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f7538 = abstractC3352;
        if (abstractC3352 != null) {
            if (abstractC3352.f7937 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC3352);
                C6385.m11435(sb, " is already attached to a RecyclerView:", abstractC3352.f7937.m5270());
                return;
            } else {
                abstractC3352.m5570(this);
                if (this.f7545) {
                    AbstractC3352 abstractC33524 = this.f7538;
                    abstractC33524.f7936 = true;
                    abstractC33524.mo5576(this);
                }
            }
        }
        c3364.m5595();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            C6755.m11869("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C3083 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f6899) {
            ViewGroup viewGroup = scrollingChildHelper.f6900;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f6899 = z;
    }

    public void setOnFlingListener(AbstractC3349 abstractC3349) {
        this.f7591 = abstractC3349;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC3366 abstractC3366) {
        this.f7558 = abstractC3366;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f7589 = z;
    }

    public void setRecycledViewPool(C3361 c3361) {
        C3364 c3364 = this.f7576;
        RecyclerView recyclerView = c3364.f7981;
        c3364.m5589(recyclerView.f7539, false);
        if (c3364.f7982 != null) {
            r1.f7969--;
        }
        c3364.f7982 = c3361;
        if (c3361 != null && recyclerView.getAdapter() != null) {
            c3364.f7982.f7969++;
        }
        c3364.m5590();
    }

    public void setScrollState(int i) {
        C3292 c3292;
        if (i == this.f7583) {
            return;
        }
        if (f7522) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "setting scroll state to ", " from ");
            sbM710.append(this.f7583);
            Log.d("RecyclerView", sbM710.toString(), new Exception());
        }
        this.f7583 = i;
        if (i != 2) {
            RunnableC3313 runnableC3313 = this.f7585;
            runnableC3313.f7775.removeCallbacks(runnableC3313);
            runnableC3313.f7777.abortAnimation();
            AbstractC3352 abstractC3352 = this.f7538;
            if (abstractC3352 != null && (c3292 = abstractC3352.f7931) != null) {
                c3292.m5422();
            }
        }
        AbstractC3352 abstractC33522 = this.f7538;
        if (abstractC33522 != null) {
            abstractC33522.mo5343(i);
        }
        AbstractC3366 abstractC3366 = this.f7558;
        if (abstractC3366 != null) {
            abstractC3366.mo5459(this, i);
        }
        ArrayList arrayList = this.f7557;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC3366) this.f7557.get(size)).mo5459(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f7595 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f7595 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC3314 abstractC3314) {
        this.f7576.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m4769(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m4768(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f7536) {
            m5292("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f7536 = true;
                this.f7535 = true;
                m5302();
                return;
            }
            this.f7536 = false;
            if (this.f7533 && this.f7538 != null && this.f7539 != null) {
                requestLayout();
            }
            this.f7533 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m5260() {
        C3328 c3328 = this.f7573;
        int iM5508 = c3328.m5508();
        for (int i = 0; i < iM5508; i++) {
            ((C3351) c3328.m5504(i).getLayoutParams()).f7923 = true;
        }
        ArrayList arrayList = this.f7576.f7978;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3351 c3351 = (C3351) ((AbstractC3317) arrayList.get(i2)).itemView.getLayoutParams();
            if (c3351 != null) {
                c3351.f7923 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m5261(int i, int i2, boolean z) {
        int i3 = i + i2;
        C3328 c3328 = this.f7573;
        int iM5508 = c3328.m5508();
        for (int i4 = 0; i4 < iM5508; i4++) {
            AbstractC3317 abstractC3317M5249 = m5249(c3328.m5504(i4));
            if (abstractC3317M5249 != null && !abstractC3317M5249.shouldIgnore()) {
                int i5 = abstractC3317M5249.mPosition;
                C3358 c3358 = this.f7586;
                if (i5 >= i3) {
                    if (f7522) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC3317M5249 + " now at position " + (abstractC3317M5249.mPosition - i2));
                    }
                    abstractC3317M5249.offsetPosition(-i2, z);
                    c3358.f7953 = true;
                } else if (i5 >= i) {
                    if (f7522) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC3317M5249 + " now REMOVED");
                    }
                    abstractC3317M5249.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    c3358.f7953 = true;
                }
            }
        }
        C3364 c3364 = this.f7576;
        ArrayList arrayList = c3364.f7978;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(size);
            if (abstractC3317 != null) {
                int i6 = abstractC3317.mPosition;
                if (i6 >= i3) {
                    if (f7522) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC3317 + " now at position " + (abstractC3317.mPosition - i2));
                    }
                    abstractC3317.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC3317.addFlags(8);
                    c3364.m5597(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m5262() {
        return !this.f7543 || this.f7530 || this.f7569.m1227();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Rect m5263(View view) {
        C3351 c3351 = (C3351) view.getLayoutParams();
        boolean z = c3351.f7923;
        Rect rect = c3351.f7922;
        if (z) {
            C3358 c3358 = this.f7586;
            if (!c3358.f7962 || (!c3351.f7924.isUpdated() && !c3351.f7924.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f7548;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f7542;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC3370) arrayList.get(i)).mo5439(rect2, view, this, c3358);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                c3351.f7923 = false;
                return rect;
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m5264(int i) {
        if (this.f7538 == null) {
            return;
        }
        setScrollState(2);
        this.f7538.mo5226(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean m5265() {
        return this.f7525 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int m5266(AbstractC3317 abstractC3317) {
        if (abstractC3317.hasAnyOfTheFlags(524) || !abstractC3317.isBound()) {
            return -1;
        }
        int i = abstractC3317.mPosition;
        ArrayList arrayList = (ArrayList) this.f7569.f1093;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3330 c3330 = (C3330) arrayList.get(i2);
            int i3 = c3330.f7825;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c3330.f7824;
                    if (i4 <= i) {
                        int i5 = c3330.f7822;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c3330.f7824;
                    if (i6 == i) {
                        i = c3330.f7822;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c3330.f7822 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c3330.f7824 <= i) {
                i += c3330.f7822;
            }
        }
        return i;
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
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5267(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        RunnableC3313 runnableC3313;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        int iM5543;
        PointF pointFMo5230;
        int i6;
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f7536) {
            boolean zMo5236 = abstractC3352.mo5236();
            boolean zMo5235 = this.f7538.mo5235();
            int i7 = (!zMo5236 || Math.abs(i) < i3) ? 0 : i;
            int iMax2 = (!zMo5235 || Math.abs(i2) < i3) ? 0 : i2;
            if (i7 != 0 || iMax2 != 0) {
                if (i7 == 0) {
                    iMax = 0;
                    if (iMax2 == 0) {
                        i5 = iMax2;
                        iMax2 = 0;
                        runnableC3313 = this.f7585;
                        if (iMax == 0 || iMax2 != 0) {
                            int i8 = -i4;
                            iMax = Math.max(i8, Math.min(iMax, i4));
                            iMax2 = Math.max(i8, Math.min(iMax2, i4));
                            m5301(1);
                            runnableC3313.m5457(iMax, iMax2);
                        }
                        if (i7 == 0 || i5 != 0) {
                            f = i7;
                            f2 = i5;
                            if (!dispatchNestedPreFling(f, f2)) {
                                boolean z5 = zMo5236 || zMo5235;
                                dispatchNestedFling(f, f2, z5);
                                AbstractC3349 abstractC3349 = this.f7591;
                                if (abstractC3349 != null) {
                                    C3285 c3285 = (C3285) abstractC3349;
                                    AbstractC3352 layoutManager = c3285.f7647.getLayoutManager();
                                    if (layoutManager != 0 && c3285.f7647.getAdapter() != null && ((Math.abs(i5) > (minFlingVelocity = c3285.f7647.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && ((z4 = layoutManager instanceof InterfaceC3355)))) {
                                        View view = null;
                                        C3286 c3286 = !z4 ? null : new C3286(c3285, c3285.f7647.getContext());
                                        if (c3286 == null) {
                                            z = z5;
                                            z2 = false;
                                            z3 = true;
                                        } else {
                                            int iM5554 = layoutManager.m5554();
                                            if (iM5554 != 0) {
                                                AbstractC3290 abstractC3290M5383 = layoutManager.mo5235() ? c3285.m5383(layoutManager) : layoutManager.mo5236() ? c3285.m5378(layoutManager) : null;
                                                if (abstractC3290M5383 == null) {
                                                    z = z5;
                                                    z2 = false;
                                                    z3 = true;
                                                } else {
                                                    z2 = false;
                                                    int iM5557 = layoutManager.m5557();
                                                    z3 = true;
                                                    int i9 = 0;
                                                    int i10 = Integer.MIN_VALUE;
                                                    int i11 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i9 < iM5557) {
                                                        boolean z6 = z5;
                                                        View viewM5558 = layoutManager.m5558(i9);
                                                        if (viewM5558 == null) {
                                                            i6 = iM5557;
                                                        } else {
                                                            i6 = iM5557;
                                                            int iM5377 = C3285.m5377(viewM5558, abstractC3290M5383);
                                                            if (iM5377 <= 0 && iM5377 > i10) {
                                                                view2 = viewM5558;
                                                                i10 = iM5377;
                                                            }
                                                            if (iM5377 >= 0 && iM5377 < i11) {
                                                                view = viewM5558;
                                                                i11 = iM5377;
                                                            }
                                                        }
                                                        i9++;
                                                        z5 = z6;
                                                        iM5557 = i6;
                                                    }
                                                    z = z5;
                                                    Object[] objArr = !layoutManager.mo5236() ? i5 <= 0 : i7 <= 0;
                                                    if (objArr == true && view != null) {
                                                        iM5543 = AbstractC3352.m5543(view);
                                                    } else if (objArr == true || view2 == null) {
                                                        if (objArr != false) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            iM5543 = ((z4 && (pointFMo5230 = ((InterfaceC3355) layoutManager).mo5230(layoutManager.m5554() + (-1))) != null && ((pointFMo5230.x > 0.0f ? 1 : (pointFMo5230.x == 0.0f ? 0 : -1)) < 0 || (pointFMo5230.y > 0.0f ? 1 : (pointFMo5230.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + AbstractC3352.m5543(view);
                                                            if (iM5543 < 0 || iM5543 >= iM5554) {
                                                            }
                                                        }
                                                    } else {
                                                        iM5543 = AbstractC3352.m5543(view2);
                                                    }
                                                    if (iM5543 != -1) {
                                                        c3286.f7662 = iM5543;
                                                        layoutManager.m5565(c3286);
                                                        return z3;
                                                    }
                                                }
                                                iM5543 = -1;
                                                if (iM5543 != -1) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z) {
                                    return z2;
                                }
                                boolean z7 = z3;
                                m5301(z7 ? 1 : 0);
                                int i12 = -i4;
                                runnableC3313.m5457(Math.max(i12, Math.min(i7, i4)), Math.max(i12, Math.min(i5, i4)));
                                return z7;
                            }
                        } else if (iMax != 0 || iMax2 != 0) {
                            return true;
                        }
                    } else {
                        EdgeEffect edgeEffect = this.f7600;
                        if (edgeEffect == null || AbstractC7176.m12457(edgeEffect) == 0.0f) {
                            EdgeEffect edgeEffect2 = this.f7598;
                            if (edgeEffect2 != null && AbstractC7176.m12457(edgeEffect2) != 0.0f) {
                                if (m5309(this.f7598, iMax2, getHeight())) {
                                    this.f7598.onAbsorb(iMax2);
                                    iMax2 = 0;
                                }
                                i5 = 0;
                                runnableC3313 = this.f7585;
                                if (iMax == 0) {
                                    int i82 = -i4;
                                    iMax = Math.max(i82, Math.min(iMax, i4));
                                    iMax2 = Math.max(i82, Math.min(iMax2, i4));
                                    m5301(1);
                                    runnableC3313.m5457(iMax, iMax2);
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
                            runnableC3313 = this.f7585;
                            if (iMax == 0) {
                            }
                        } else {
                            int i13 = -iMax2;
                            if (m5309(this.f7600, i13, getHeight())) {
                                this.f7600.onAbsorb(i13);
                                iMax2 = 0;
                            }
                            i5 = 0;
                            runnableC3313 = this.f7585;
                            if (iMax == 0) {
                            }
                        }
                    }
                } else {
                    EdgeEffect edgeEffect3 = this.f7596;
                    if (edgeEffect3 == null || AbstractC7176.m12457(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f7601;
                        if (edgeEffect4 != null && AbstractC7176.m12457(edgeEffect4) != 0.0f) {
                            if (m5309(this.f7601, i7, getWidth())) {
                                this.f7601.onAbsorb(i7);
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
                        if (m5309(this.f7596, i14, getWidth())) {
                            this.f7596.onAbsorb(i14);
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

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final AbstractC3317 m5268(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m5249(view);
        }
        C6385.m11433("View ", view, " is not a direct child of ", this);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long m5269(AbstractC3317 abstractC3317) {
        return this.f7539.f7642 ? abstractC3317.getItemId() : abstractC3317.mPosition;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m5270() {
        return " " + super.toString() + ", adapter:" + this.f7539 + ", layout:" + this.f7538 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m5271() {
        if (this.f7600 != null) {
            return;
        }
        ((C3357) this.f7597).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7600 = edgeEffect;
        if (this.f7571) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m5272() {
        if (this.f7601 != null) {
            return;
        }
        ((C3357) this.f7597).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7601 = edgeEffect;
        if (this.f7571) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m5273() {
        if (this.f7596 != null) {
            return;
        }
        ((C3357) this.f7597).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7596 = edgeEffect;
        if (this.f7571) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m5274() {
        if (this.f7598 != null) {
            return;
        }
        ((C3357) this.f7597).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7598 = edgeEffect;
        if (this.f7571) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m5275(int i, int i2) {
        this.f7526++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC3366 abstractC3366 = this.f7558;
        if (abstractC3366 != null) {
            abstractC3366.mo5458(this, i, i2);
        }
        ArrayList arrayList = this.f7557;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC3366) this.f7557.get(size)).mo5458(this, i, i2);
            }
        }
        this.f7526--;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final AbstractC3317 m5276(int i) {
        AbstractC3317 abstractC3317 = null;
        if (this.f7530) {
            return null;
        }
        C3328 c3328 = this.f7573;
        int iM5508 = c3328.m5508();
        for (int i2 = 0; i2 < iM5508; i2++) {
            AbstractC3317 abstractC3317M5249 = m5249(c3328.m5504(i2));
            if (abstractC3317M5249 != null && !abstractC3317M5249.isRemoved() && m5266(abstractC3317M5249) == i) {
                if (!((ArrayList) c3328.f7814).contains(abstractC3317M5249.itemView)) {
                    return abstractC3317M5249;
                }
                abstractC3317 = abstractC3317M5249;
            }
        }
        return abstractC3317;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m5277(int[] iArr) {
        C3328 c3328 = this.f7573;
        int iM5498 = c3328.m5498();
        if (iM5498 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM5498; i3++) {
            AbstractC3317 abstractC3317M5249 = m5249(c3328.m5499(i3));
            if (!abstractC3317M5249.shouldIgnore()) {
                int layoutPosition = abstractC3317M5249.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m5278(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f7547;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC3365 interfaceC3365 = (InterfaceC3365) arrayList.get(i);
            if (interfaceC3365.mo5431(motionEvent) && action != 3) {
                this.f7546 = interfaceC3365;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final View m5279(View view) {
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

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m5280(C3358 c3358) {
        if (getScrollState() != 2) {
            c3358.getClass();
            return;
        }
        OverScroller overScroller = this.f7585.f7777;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c3358.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a3  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5281() {
        boolean z;
        AbstractC3317 abstractC3317;
        View viewFindViewById;
        boolean z2;
        C1130 c1130;
        C1804 c1804;
        boolean zM5531;
        boolean z3;
        if (this.f7539 == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f7538 == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C3358 c3358 = this.f7586;
        boolean z4 = false;
        c3358.f7965 = false;
        boolean z5 = true;
        Object[] objArr = this.f7564 && !(this.f7563 == getWidth() && this.f7566 == getHeight());
        this.f7563 = 0;
        this.f7566 = 0;
        this.f7564 = false;
        if (c3358.f7955 == 1) {
            m5285();
            this.f7538.m5572(this);
            m5286();
        } else {
            C1038 c1038 = this.f7569;
            if ((((ArrayList) c1038.f1092).isEmpty() || ((ArrayList) c1038.f1093).isEmpty()) && !objArr == true && this.f7538.f7926 == getWidth() && this.f7538.f7925 == getHeight()) {
                this.f7538.m5572(this);
            } else {
                this.f7538.m5572(this);
                m5286();
            }
        }
        c3358.m5586(4);
        m5305();
        m5313();
        c3358.f7955 = 1;
        boolean z6 = c3358.f7966;
        C3328 c3328 = this.f7573;
        C3364 c3364 = this.f7576;
        C3324 c3324 = this.f7574;
        if (z6) {
            int iM5498 = c3328.m5498() - 1;
            while (iM5498 >= 0) {
                AbstractC3317 abstractC3317M5249 = m5249(c3328.m5499(iM5498));
                if (abstractC3317M5249.shouldIgnore()) {
                    z3 = z5;
                } else {
                    long jM5269 = m5269(abstractC3317M5249);
                    this.f7599.getClass();
                    C1804 c18042 = new C1804();
                    c18042.m2441(abstractC3317M5249);
                    C1110 c1110 = (C1110) c3324.f7800;
                    z3 = z5;
                    C1130 c11302 = (C1130) c3324.f7801;
                    AbstractC3317 abstractC33172 = (AbstractC3317) c1110.m1386(jM5269);
                    if (abstractC33172 == null || abstractC33172.shouldIgnore()) {
                        c3324.m5478(abstractC3317M5249, c18042);
                    } else {
                        C3321 c3321 = (C3321) c11302.get(abstractC33172);
                        boolean z7 = (c3321 == null || (c3321.f7794 & 1) == 0) ? z4 : z3;
                        C3321 c33212 = (C3321) c11302.get(abstractC3317M5249);
                        boolean z8 = (c33212 == null || (c33212.f7794 & 1) == 0) ? z4 : z3;
                        if (z7 && abstractC33172 == abstractC3317M5249) {
                            c3324.m5478(abstractC3317M5249, c18042);
                        } else {
                            C1804 c1804M5480 = c3324.m5480(abstractC33172, 4);
                            c3324.m5478(abstractC3317M5249, c18042);
                            C1804 c1804M54802 = c3324.m5480(abstractC3317M5249, 8);
                            if (c1804M5480 == null) {
                                int iM54982 = c3328.m5498();
                                for (int i = 0; i < iM54982; i++) {
                                    AbstractC3317 abstractC3317M52492 = m5249(c3328.m5499(i));
                                    if (abstractC3317M52492 != abstractC3317M5249 && m5269(abstractC3317M52492) == jM5269) {
                                        AbstractC3283 abstractC3283 = this.f7539;
                                        if (abstractC3283 == null || !abstractC3283.f7642) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(abstractC3317M52492);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(abstractC3317M5249);
                                            C3775.m6967(m5270(), sb);
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(abstractC3317M52492);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(abstractC3317M5249);
                                        C3775.m6967(m5270(), sb2);
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC33172 + " cannot be found but it is necessary for " + abstractC3317M5249 + m5270());
                            } else {
                                abstractC33172.setIsRecyclable(false);
                                if (z7) {
                                    m5293(abstractC33172);
                                }
                                if (abstractC33172 != abstractC3317M5249) {
                                    if (z8) {
                                        m5293(abstractC3317M5249);
                                    }
                                    abstractC33172.mShadowedHolder = abstractC3317M5249;
                                    m5293(abstractC33172);
                                    c3364.m5596(abstractC33172);
                                    abstractC3317M5249.setIsRecyclable(false);
                                    abstractC3317M5249.mShadowingHolder = abstractC33172;
                                }
                                if (this.f7599.mo5530(abstractC33172, abstractC3317M5249, c1804M5480, c1804M54802)) {
                                    m5317();
                                }
                            }
                        }
                    }
                }
                iM5498--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            C1130 c11303 = (C1130) c3324.f7801;
            int i2 = c11303.f1339 - 1;
            while (i2 >= 0) {
                AbstractC3317 abstractC33173 = (AbstractC3317) c11303.m1422(i2);
                C3321 c33213 = (C3321) c11303.mo1428(i2);
                int i3 = c33213.f7794;
                int i4 = i3 & 3;
                C3287 c3287 = this.f7555;
                if (i4 == 3) {
                    RecyclerView recyclerView = c3287.f7649;
                    recyclerView.f7538.m5559(abstractC33173.itemView, recyclerView.f7576);
                } else if ((i3 & 1) != 0) {
                    C1804 c18043 = c33213.f7793;
                    if (c18043 == null) {
                        RecyclerView recyclerView2 = c3287.f7649;
                        recyclerView2.f7538.m5559(abstractC33173.itemView, recyclerView2.f7576);
                    } else {
                        c3287.m5394(abstractC33173, c18043, c33213.f7792);
                    }
                } else if ((i3 & 14) == 14) {
                    c3287.m5387(abstractC33173, c33213.f7793, c33213.f7792);
                } else if ((i3 & 12) == 12) {
                    C1804 c18044 = c33213.f7793;
                    C1804 c18045 = c33213.f7792;
                    c3287.getClass();
                    abstractC33173.setIsRecyclable(false);
                    RecyclerView recyclerView3 = c3287.f7649;
                    boolean z9 = recyclerView3.f7530;
                    AbstractC3369 abstractC3369 = recyclerView3.f7599;
                    if (!z9) {
                        C3338 c3338 = (C3338) abstractC3369;
                        c3338.getClass();
                        int i5 = c18044.f3101;
                        int i6 = c18045.f3101;
                        if (i5 == i6) {
                            c1130 = c11303;
                            if (c18044.f3100 == c18045.f3100) {
                                c3338.m5605(abstractC33173);
                                zM5531 = false;
                            }
                            if (zM5531) {
                                recyclerView3.m5317();
                            }
                            c1804 = null;
                            c33213.f7794 = 0;
                            c33213.f7793 = c1804;
                            c33213.f7792 = c1804;
                            C3321.f7791.mo4549(c33213);
                            i2--;
                            c11303 = c1130;
                        } else {
                            c1130 = c11303;
                        }
                        zM5531 = c3338.m5531(abstractC33173, i5, c18044.f3100, i6, c18045.f3100);
                        if (zM5531) {
                        }
                        c1804 = null;
                        c33213.f7794 = 0;
                        c33213.f7793 = c1804;
                        c33213.f7792 = c1804;
                        C3321.f7791.mo4549(c33213);
                        i2--;
                        c11303 = c1130;
                    } else if (abstractC3369.mo5530(abstractC33173, abstractC33173, c18044, c18045)) {
                        recyclerView3.m5317();
                    }
                } else {
                    c1130 = c11303;
                    if ((i3 & 4) != 0) {
                        c1804 = null;
                        c3287.m5394(abstractC33173, c33213.f7793, null);
                    } else {
                        c1804 = null;
                        if ((i3 & 8) != 0) {
                            c3287.m5387(abstractC33173, c33213.f7793, c33213.f7792);
                        }
                    }
                    c33213.f7794 = 0;
                    c33213.f7793 = c1804;
                    c33213.f7792 = c1804;
                    C3321.f7791.mo4549(c33213);
                    i2--;
                    c11303 = c1130;
                }
                c1130 = c11303;
                c1804 = null;
                c33213.f7794 = 0;
                c33213.f7793 = c1804;
                c33213.f7792 = c1804;
                C3321.f7791.mo4549(c33213);
                i2--;
                c11303 = c1130;
            }
        } else {
            z = true;
        }
        View view = null;
        this.f7538.m5560(c3364);
        c3358.f7957 = c3358.f7954;
        this.f7530 = false;
        this.f7529 = false;
        c3358.f7966 = false;
        c3358.f7963 = false;
        this.f7538.f7935 = false;
        ArrayList arrayList = c3364.f7979;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352.f7929) {
            abstractC3352.f7930 = 0;
            abstractC3352.f7929 = false;
            c3364.m5595();
        }
        this.f7538.mo5182(c3358);
        boolean z10 = z;
        m5312(z10);
        m5300(false);
        ((C1130) c3324.f7801).clear();
        ((C1110) c3324.f7800).m1387();
        int[] iArr = this.f7551;
        int i7 = iArr[0];
        int i8 = iArr[z10 ? 1 : 0];
        m5277(iArr);
        if (iArr[0] != i7 || iArr[z10 ? 1 : 0] != i8) {
            m5275(0, 0);
        }
        if (this.f7589 && this.f7539 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (((ArrayList) c3328.f7814).contains(getFocusedChild())) {
                    long j = c3358.f7960;
                    if (j != -1 && (z2 = this.f7539.f7642) && z2) {
                        int iM5508 = c3328.m5508();
                        abstractC3317 = null;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= iM5508) {
                                break;
                            }
                            AbstractC3317 abstractC3317M52493 = m5249(c3328.m5504(i9));
                            if (abstractC3317M52493 != null && !abstractC3317M52493.isRemoved() && abstractC3317M52493.getItemId() == j) {
                                if (!((ArrayList) c3328.f7814).contains(abstractC3317M52493.itemView)) {
                                    abstractC3317 = abstractC3317M52493;
                                    break;
                                }
                                abstractC3317 = abstractC3317M52493;
                            }
                            i9++;
                        }
                    } else {
                        abstractC3317 = null;
                    }
                    if (abstractC3317 != null) {
                        if (!((ArrayList) c3328.f7814).contains(abstractC3317.itemView) && abstractC3317.itemView.hasFocusable()) {
                            view = abstractC3317.itemView;
                        } else if (c3328.m5498() > 0) {
                            int i10 = c3358.f7964;
                            if (i10 == -1) {
                                i10 = 0;
                            }
                            int iM5585 = c3358.m5585();
                            for (int i11 = i10; i11 < iM5585; i11++) {
                                AbstractC3317 abstractC3317M5276 = m5276(i11);
                                if (abstractC3317M5276 == null) {
                                    break;
                                }
                                if (abstractC3317M5276.itemView.hasFocusable()) {
                                    view = abstractC3317M5276.itemView;
                                    break;
                                }
                            }
                            int iMin = Math.min(iM5585, i10) - 1;
                            while (true) {
                                if (iMin < 0) {
                                    break;
                                }
                                AbstractC3317 abstractC3317M52762 = m5276(iMin);
                                if (abstractC3317M52762 == null) {
                                    break;
                                }
                                if (abstractC3317M52762.itemView.hasFocusable()) {
                                    view = abstractC3317M52762.itemView;
                                    break;
                                }
                                iMin--;
                            }
                        }
                        if (view != null) {
                            int i12 = c3358.f7959;
                            if (i12 != -1 && (viewFindViewById = view.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                                view = viewFindViewById;
                            }
                            view.requestFocus();
                        }
                    }
                }
            }
        }
        c3358.f7960 = -1L;
        c3358.f7964 = -1;
        c3358.f7959 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m5282(View view) {
        AbstractC3317 abstractC3317M5249 = m5249(view);
        AbstractC3283 abstractC3283 = this.f7539;
        if (abstractC3283 != null && abstractC3317M5249 != null) {
            abstractC3283.mo5359(abstractC3317M5249);
        }
        ArrayList arrayList = this.f7527;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC3350) this.f7527.get(size)).mo5441(view);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m5283(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4765(i, i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m5284(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m4764(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m5285() {
        C3321 c3321;
        View viewM5279;
        C3358 c3358 = this.f7586;
        c3358.m5586(1);
        m5280(c3358);
        c3358.f7965 = false;
        m5305();
        C3324 c3324 = this.f7574;
        C1130 c1130 = (C1130) c3324.f7801;
        C1130 c11302 = (C1130) c3324.f7801;
        c1130.clear();
        C1110 c1110 = (C1110) c3324.f7800;
        c1110.m1387();
        m5313();
        m5314();
        AbstractC3317 abstractC3317M5268 = null;
        View focusedChild = (this.f7589 && hasFocus() && this.f7539 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM5279 = m5279(focusedChild)) != null) {
            abstractC3317M5268 = m5268(viewM5279);
        }
        if (abstractC3317M5268 == null) {
            c3358.f7960 = -1L;
            c3358.f7964 = -1;
            c3358.f7959 = -1;
        } else {
            c3358.f7960 = this.f7539.f7642 ? abstractC3317M5268.getItemId() : -1L;
            c3358.f7964 = this.f7530 ? -1 : abstractC3317M5268.isRemoved() ? abstractC3317M5268.mOldPosition : abstractC3317M5268.getAbsoluteAdapterPosition();
            View focusedChild2 = abstractC3317M5268.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c3358.f7959 = id;
        }
        c3358.f7961 = c3358.f7966 && this.f7562;
        this.f7562 = false;
        this.f7561 = false;
        c3358.f7962 = c3358.f7963;
        c3358.f7954 = this.f7539.mo5354();
        m5277(this.f7551);
        boolean z = c3358.f7966;
        C3328 c3328 = this.f7573;
        if (z) {
            int iM5498 = c3328.m5498();
            for (int i = 0; i < iM5498; i++) {
                AbstractC3317 abstractC3317M5249 = m5249(c3328.m5499(i));
                if (!abstractC3317M5249.shouldIgnore() && (!abstractC3317M5249.isInvalid() || this.f7539.f7642)) {
                    AbstractC3369 abstractC3369 = this.f7599;
                    AbstractC3369.m5604(abstractC3317M5249);
                    abstractC3317M5249.getUnmodifiedPayloads();
                    abstractC3369.getClass();
                    C1804 c1804 = new C1804();
                    c1804.m2441(abstractC3317M5249);
                    C3321 c3321M5473 = (C3321) c11302.get(abstractC3317M5249);
                    if (c3321M5473 == null) {
                        c3321M5473 = C3321.m5473();
                        c11302.put(abstractC3317M5249, c3321M5473);
                    }
                    c3321M5473.f7793 = c1804;
                    c3321M5473.f7794 |= 4;
                    if (c3358.f7961 && abstractC3317M5249.isUpdated() && !abstractC3317M5249.isRemoved() && !abstractC3317M5249.shouldIgnore() && !abstractC3317M5249.isInvalid()) {
                        c1110.m1383(abstractC3317M5249, m5269(abstractC3317M5249));
                    }
                }
            }
        }
        if (c3358.f7963) {
            int iM5508 = c3328.m5508();
            for (int i2 = 0; i2 < iM5508; i2++) {
                AbstractC3317 abstractC3317M52492 = m5249(c3328.m5504(i2));
                if (f7521 && abstractC3317M52492.mPosition == -1 && !abstractC3317M52492.isRemoved()) {
                    C6755.m11870("view holder cannot have position -1 unless it is removed".concat(m5270()));
                    return;
                } else {
                    if (!abstractC3317M52492.shouldIgnore()) {
                        abstractC3317M52492.saveOldPosition();
                    }
                }
            }
            boolean z2 = c3358.f7953;
            c3358.f7953 = false;
            this.f7538.mo5180(this.f7576, c3358);
            c3358.f7953 = z2;
            for (int i3 = 0; i3 < c3328.m5498(); i3++) {
                AbstractC3317 abstractC3317M52493 = m5249(c3328.m5499(i3));
                if (!abstractC3317M52493.shouldIgnore() && ((c3321 = (C3321) c11302.get(abstractC3317M52493)) == null || (c3321.f7794 & 4) == 0)) {
                    AbstractC3369.m5604(abstractC3317M52493);
                    boolean zHasAnyOfTheFlags = abstractC3317M52493.hasAnyOfTheFlags(8192);
                    AbstractC3369 abstractC33692 = this.f7599;
                    abstractC3317M52493.getUnmodifiedPayloads();
                    abstractC33692.getClass();
                    C1804 c18042 = new C1804();
                    c18042.m2441(abstractC3317M52493);
                    if (zHasAnyOfTheFlags) {
                        m5299(abstractC3317M52493, c18042);
                    } else {
                        C3321 c3321M54732 = (C3321) c11302.get(abstractC3317M52493);
                        if (c3321M54732 == null) {
                            c3321M54732 = C3321.m5473();
                            c11302.put(abstractC3317M52493, c3321M54732);
                        }
                        c3321M54732.f7794 |= 2;
                        c3321M54732.f7793 = c18042;
                    }
                }
            }
            m5287();
        } else {
            m5287();
        }
        m5312(true);
        m5300(false);
        c3358.f7955 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m5286() {
        m5305();
        m5313();
        C3358 c3358 = this.f7586;
        c3358.m5586(6);
        this.f7569.m1249();
        c3358.f7954 = this.f7539.mo5354();
        c3358.f7956 = 0;
        if (this.f7570 != null) {
            AbstractC3283 abstractC3283 = this.f7539;
            int iOrdinal = abstractC3283.f7641.ordinal();
            if (iOrdinal == 1 ? abstractC3283.mo5354() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f7570.f7602;
                if (parcelable != null) {
                    this.f7538.mo5239(parcelable);
                }
                this.f7570 = null;
            }
        }
        c3358.f7962 = false;
        this.f7538.mo5180(this.f7576, c3358);
        c3358.f7953 = false;
        c3358.f7966 = c3358.f7966 && this.f7599 != null;
        c3358.f7955 = 4;
        m5312(true);
        m5300(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5287() {
        C3328 c3328 = this.f7573;
        int iM5508 = c3328.m5508();
        for (int i = 0; i < iM5508; i++) {
            AbstractC3317 abstractC3317M5249 = m5249(c3328.m5504(i));
            if (!abstractC3317M5249.shouldIgnore()) {
                abstractC3317M5249.clearOldPosition();
            }
        }
        C3364 c3364 = this.f7576;
        ArrayList arrayList = c3364.f7980;
        ArrayList arrayList2 = c3364.f7978;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC3317) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC3317) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c3364.f7979;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC3317) c3364.f7979.get(i4)).clearOldPosition();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m5288() {
        if (!this.f7543 || this.f7530) {
            Trace.beginSection("RV FullInvalidate");
            m5281();
            Trace.endSection();
            return;
        }
        C1038 c1038 = this.f7569;
        if (c1038.m1227()) {
            int i = c1038.f1095;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c1038.m1227()) {
                    Trace.beginSection("RV FullInvalidate");
                    m5281();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m5305();
            m5313();
            c1038.m1230();
            if (!this.f7533) {
                C3328 c3328 = this.f7573;
                int iM5498 = c3328.m5498();
                int i2 = 0;
                while (true) {
                    if (i2 < iM5498) {
                        AbstractC3317 abstractC3317M5249 = m5249(c3328.m5499(i2));
                        if (abstractC3317M5249 != null && !abstractC3317M5249.shouldIgnore() && abstractC3317M5249.isUpdated()) {
                            m5281();
                            break;
                        }
                        i2++;
                    } else {
                        c1038.m1252();
                        break;
                    }
                }
            }
            m5300(true);
            m5312(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m5289(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        setMeasuredDimension(AbstractC3352.m5550(i, paddingRight, getMinimumWidth()), AbstractC3352.m5550(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m5290(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7596;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f7596.onRelease();
            zIsFinished = this.f7596.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f7601;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f7601.onRelease();
            zIsFinished |= this.f7601.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7600;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f7600.onRelease();
            zIsFinished |= this.f7600.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7598;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f7598.onRelease();
            zIsFinished |= this.f7598.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5291(AbstractC3370 abstractC3370) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            abstractC3352.mo5234("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f7548;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC3370);
        m5260();
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5292(String str) {
        if (!m5265()) {
            if (this.f7526 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m5270()));
            }
        } else if (str == null) {
            C6755.m11870("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m5270()));
        } else {
            C6755.m11870(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5293(AbstractC3317 abstractC3317) {
        View view = abstractC3317.itemView;
        boolean z = view.getParent() == this;
        this.f7576.m5596(m5268(view));
        boolean zIsTmpDetached = abstractC3317.isTmpDetached();
        C3328 c3328 = this.f7573;
        if (zIsTmpDetached) {
            c3328.m5501(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            c3328.m5502(view, -1, true);
            return;
        }
        int iIndexOfChild = ((C3287) c3328.f7816).f7649.indexOfChild(view);
        if (iIndexOfChild < 0) {
            C5043.m9163(view, "view is not a child, cannot hide ");
        } else {
            ((C3329) c3328.f7815).m5518(iIndexOfChild);
            c3328.m5509(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void m5294() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount <= 0) {
            C8376.m13331(AbstractC7012.m12147(itemDecorationCount, "0 is an invalid index for size "));
            return;
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (itemDecorationCount2 > 0) {
            m5295((AbstractC3370) this.f7548.get(0));
        } else {
            C8376.m13331(AbstractC7012.m12147(itemDecorationCount2, "0 is an invalid index for size "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m5295(AbstractC3370 abstractC3370) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            abstractC3352.mo5234("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f7548;
        arrayList.remove(abstractC3370);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m5260();
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final int m5296(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f7600;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC7176.m12457(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7598;
            if (edgeEffect2 != null && AbstractC7176.m12457(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.f7598;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fM12486 = AbstractC7176.m12486(edgeEffect3, height, 1.0f - width);
                    if (AbstractC7176.m12457(this.f7598) == 0.0f) {
                        this.f7598.onRelease();
                    }
                    f2 = fM12486;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.f7600;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC7176.m12486(edgeEffect4, -height, width);
                if (AbstractC7176.m12457(this.f7600) == 0.0f) {
                    this.f7600.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final int m5297(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f7596;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC7176.m12457(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7601;
            if (edgeEffect2 != null && AbstractC7176.m12457(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.f7601;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fM12486 = AbstractC7176.m12486(edgeEffect3, width, height);
                    if (AbstractC7176.m12457(this.f7601) == 0.0f) {
                        this.f7601.onRelease();
                    }
                    f2 = fM12486;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f7596;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC7176.m12486(edgeEffect4, -width, 1.0f - height);
                if (AbstractC7176.m12457(this.f7596) == 0.0f) {
                    this.f7596.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m5298() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7596;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f7596.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f7600;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f7600.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7601;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f7601.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7598;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f7598.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m5299(AbstractC3317 abstractC3317, C1804 c1804) {
        abstractC3317.setFlags(0, 8192);
        boolean z = this.f7586.f7961;
        C3324 c3324 = this.f7574;
        if (z && abstractC3317.isUpdated() && !abstractC3317.isRemoved() && !abstractC3317.shouldIgnore()) {
            ((C1110) c3324.f7800).m1383(abstractC3317, m5269(abstractC3317));
        }
        C1130 c1130 = (C1130) c3324.f7801;
        C3321 c3321M5473 = (C3321) c1130.get(abstractC3317);
        if (c3321M5473 == null) {
            c3321M5473 = C3321.m5473();
            c1130.put(abstractC3317, c3321M5473);
        }
        c3321M5473.f7793 = c1804;
        c3321M5473.f7794 |= 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m5300(boolean z) {
        if (this.f7534 < 1) {
            if (f7521) {
                C6755.m11870("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(m5270()));
                return;
            }
            this.f7534 = 1;
        }
        if (!z && !this.f7536) {
            this.f7533 = false;
        }
        if (this.f7534 == 1) {
            if (z && this.f7533 && !this.f7536 && this.f7538 != null && this.f7539 != null) {
                m5281();
            }
            if (!this.f7536) {
                this.f7533 = false;
            }
        }
        this.f7534--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m5301(int i) {
        boolean zMo5236 = this.f7538.mo5236();
        int i2 = zMo5236;
        if (this.f7538.mo5235()) {
            i2 = (zMo5236 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m4769(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void m5302() {
        C3292 c3292;
        setScrollState(0);
        RunnableC3313 runnableC3313 = this.f7585;
        runnableC3313.f7775.removeCallbacks(runnableC3313);
        runnableC3313.f7777.abortAnimation();
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null || (c3292 = abstractC3352.f7931) == null) {
            return;
        }
        c3292.m5422();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m5303(int i) {
        getScrollingChildHelper().m4768(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m5304(int i) {
        if (this.f7536) {
            return;
        }
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC3352.mo5227(this, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void m5305() {
        int i = this.f7534 + 1;
        this.f7534 = i;
        if (i != 1 || this.f7536) {
            return;
        }
        this.f7533 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m5306(int i) {
        if (this.f7536) {
            return;
        }
        m5302();
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC3352.mo5226(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void m5307(int[] iArr, int i, int i2) {
        AbstractC3317 abstractC3317;
        m5305();
        m5313();
        Trace.beginSection("RV Scroll");
        C3358 c3358 = this.f7586;
        m5280(c3358);
        C3364 c3364 = this.f7576;
        int iMo5171 = i != 0 ? this.f7538.mo5171(i, c3364, c3358) : 0;
        int iMo5175 = i2 != 0 ? this.f7538.mo5175(i2, c3364, c3358) : 0;
        Trace.endSection();
        C3328 c3328 = this.f7573;
        int iM5498 = c3328.m5498();
        for (int i3 = 0; i3 < iM5498; i3++) {
            View viewM5499 = c3328.m5499(i3);
            AbstractC3317 abstractC3317M5268 = m5268(viewM5499);
            if (abstractC3317M5268 != null && (abstractC3317 = abstractC3317M5268.mShadowingHolder) != null) {
                View view = abstractC3317.itemView;
                int left = viewM5499.getLeft();
                int top2 = viewM5499.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
        m5312(true);
        m5300(false);
        if (iArr != null) {
            iArr[0] = iMo5171;
            iArr[1] = iMo5175;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m5308(int i, int i2, boolean z) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f7536) {
            return;
        }
        if (!abstractC3352.mo5236()) {
            i = 0;
        }
        if (!this.f7538.mo5235()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m4769(i3, 1);
        }
        this.f7585.m5455(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final boolean m5309(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM12457 = AbstractC7176.m12457(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f7577 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f7523;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM12457;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void m5310(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f7542;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C3351) {
            C3351 c3351 = (C3351) layoutParams;
            if (!c3351.f7923) {
                Rect rect2 = c3351.f7922;
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
        this.f7538.mo5562(this, view, this.f7542, !this.f7543, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5311(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        m5288();
        AbstractC3283 abstractC3283 = this.f7539;
        int[] iArr = this.f7550;
        if (abstractC3283 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m5307(iArr, i, i2);
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
        if (!this.f7548.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m5284(i4, i5, i6, i7, this.f7553, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.f7578;
        int[] iArr2 = this.f7553;
        int i13 = iArr2[0];
        this.f7578 = i12 - i13;
        int i14 = this.f7594;
        int i15 = iArr2[1];
        this.f7594 = i14 - i15;
        int[] iArr3 = this.f7549;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || AbstractC3100.m4792(motionEvent, DexMap.TYPE_STRING_DATA_ITEM)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    m5273();
                    z = true;
                    z2 = false;
                    AbstractC7176.m12486(this.f7596, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        m5272();
                        AbstractC7176.m12486(this.f7601, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                        if (f2 >= 0.0f) {
                            m5271();
                            AbstractC7176.m12486(this.f7600, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                m5274();
                                AbstractC7176.m12486(this.f7598, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (z3 || f != 0.0f || f2 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && AbstractC3100.m4792(motionEvent, 4194304)) {
                                m5298();
                            }
                        }
                        z3 = z;
                        if (z3) {
                            postInvalidateOnAnimation();
                            if (Build.VERSION.SDK_INT >= 31) {
                                m5298();
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
            m5290(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            m5275(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m5312(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f7525 - 1;
        this.f7525 = i2;
        if (i2 < 1) {
            if (f7521 && i2 < 0) {
                C6755.m11870("layout or scroll counter cannot go below zero.Some calls are not matching".concat(m5270()));
                return;
            }
            this.f7525 = 0;
            if (z) {
                int i3 = this.f7531;
                this.f7531 = 0;
                if (i3 != 0 && (accessibilityManager = this.f7528) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f7567;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(size);
                    if (abstractC3317.itemView.getParent() == this && !abstractC3317.shouldIgnore() && (i = abstractC3317.mPendingAccessibilityState) != -1) {
                        abstractC3317.itemView.setImportantForAccessibility(i);
                        abstractC3317.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m5313() {
        this.f7525++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m5314() {
        boolean z;
        boolean z2 = this.f7530;
        C1038 c1038 = this.f7569;
        boolean z3 = false;
        if (z2) {
            c1038.m1228((ArrayList) c1038.f1093);
            c1038.m1228((ArrayList) c1038.f1092);
            c1038.f1095 = 0;
            if (this.f7529) {
                this.f7538.mo5187();
            }
        }
        if (this.f7599 != null && this.f7538.mo5172()) {
            c1038.m1230();
        } else {
            c1038.m1249();
        }
        boolean z4 = this.f7561 || this.f7562;
        boolean z5 = this.f7543 && this.f7599 != null && ((z = this.f7530) || z4 || this.f7538.f7935) && (!z || this.f7539.f7642);
        C3358 c3358 = this.f7586;
        c3358.f7966 = z5;
        if (z5 && z4 && !this.f7530 && this.f7599 != null && this.f7538.mo5172()) {
            z3 = true;
        }
        c3358.f7963 = z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m5315(boolean z) {
        this.f7529 = z | this.f7529;
        this.f7530 = true;
        C3328 c3328 = this.f7573;
        int iM5508 = c3328.m5508();
        for (int i = 0; i < iM5508; i++) {
            AbstractC3317 abstractC3317M5249 = m5249(c3328.m5504(i));
            if (abstractC3317M5249 != null && !abstractC3317M5249.shouldIgnore()) {
                abstractC3317M5249.addFlags(6);
            }
        }
        m5260();
        C3364 c3364 = this.f7576;
        ArrayList arrayList = c3364.f7978;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(i2);
            if (abstractC3317 != null) {
                abstractC3317.addFlags(6);
                abstractC3317.addChangePayload(null);
            }
        }
        AbstractC3283 abstractC3283 = c3364.f7981.f7539;
        if (abstractC3283 == null || !abstractC3283.f7642) {
            c3364.m5598();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m5316(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7582) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f7582 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f7578 = x;
            this.f7580 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f7594 = y;
            this.f7579 = y;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m5317() {
        if (this.f7560 || !this.f7545) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        postOnAnimation(this.f7568);
        this.f7560 = true;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC3363 interfaceC3363) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC3352 abstractC3352 = this.f7538;
        if (abstractC3352 != null) {
            return abstractC3352.mo5165(layoutParams);
        }
        C6755.m11870("RecyclerView has no LayoutManager".concat(m5270()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0328R.attr.recyclerViewStyle);
    }
}
