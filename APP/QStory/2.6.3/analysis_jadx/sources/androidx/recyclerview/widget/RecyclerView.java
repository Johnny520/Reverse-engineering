package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
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
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0191;
import androidx.collection.C0263;
import androidx.collection.C0276;
import androidx.collection.C0283;
import androidx.compose.foundation.text.C0966;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.ui.platform.C1862;
import androidx.core.view.AbstractC2190;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2250;
import androidx.core.view.C2264;
import androidx.customview.view.AbsSavedState;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p141.AbstractC7536;
import p144.C7547;
import p168.InterfaceC7716;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public static final C2524 f7173;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static final Class[] f7174;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public static final InterpolatorC2465 f7175;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static boolean f7176 = false;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static boolean f7177 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f7180;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f7181;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ArrayList f7182;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final AccessibilityManager f7183;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7184;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f7185;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f7186;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f7187;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f7188;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f7189;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f7190;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f7191;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ArrayList f7192;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public AbstractC2519 f7193;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC2450 f7194;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final RectF f7195;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Rect f7196;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Rect f7197;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f7198;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f7199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC2532 f7201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final ArrayList f7202;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f7203;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final int[] f7204;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final int[] f7205;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final int[] f7206;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public C2482 f7207;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final int[] f7208;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public C2250 f7209;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final C2454 f7210;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final C2264 f7211;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public ArrayList f7212;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public AbstractC2533 f7213;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final C2454 f7214;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public boolean f7215;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public boolean f7216;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public boolean f7217;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public int f7218;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public boolean f7219;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final boolean f7220;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public int f7221;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final ArrayList f7222;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final RunnableC2455 f7223;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0191 f7224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public SavedState f7225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f7226;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final RunnableC2455 f7227;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2495 f7228;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2491 f7229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2526 f7230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2531 f7231;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f7232;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f7233;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f7234;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f7235;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public VelocityTracker f7236;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f7237;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f7238;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public RunnableC2502 f7239;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final RunnableC2480 f7240;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final C2525 f7241;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final C0920 f7242;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final float f7243;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f7244;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final int f7245;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public AbstractC2516 f7246;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final float f7247;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final int f7248;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f7249;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f7250;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public EdgeEffect f7251;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public AbstractC2539 f7252;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public EdgeEffect f7253;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public AbstractC2536 f7254;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public EdgeEffect f7255;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public EdgeEffect f7256;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static final int[] f7179 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static final float f7178 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static final boolean f7172 = true;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static final boolean f7171 = true;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2527();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public Parcelable f7257;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7257 = parcel.readParcelable(classLoader == null ? AbstractC2519.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f7257, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f7174 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f7175 = new InterpolatorC2465(2);
        f7173 = new C2524();
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
        this.f7230 = new C2526(this);
        this.f7231 = new C2531(this);
        C2491 c2491 = new C2491();
        c2491.f7456 = new C0283(0);
        c2491.f7455 = new C0263((Object) null);
        this.f7229 = c2491;
        this.f7227 = new RunnableC2455(this, 0);
        this.f7197 = new Rect();
        this.f7196 = new Rect();
        this.f7195 = new RectF();
        this.f7192 = new ArrayList();
        this.f7203 = new ArrayList();
        this.f7202 = new ArrayList();
        this.f7189 = 0;
        this.f7185 = false;
        this.f7184 = false;
        this.f7180 = 0;
        this.f7181 = 0;
        this.f7252 = f7173;
        C2505 c2505 = new C2505();
        c2505.f7643 = null;
        c2505.f7642 = new ArrayList();
        c2505.f7641 = 120L;
        c2505.f7640 = 120L;
        c2505.f7639 = 250L;
        c2505.f7638 = 250L;
        int i3 = 1;
        c2505.f7506 = true;
        c2505.f7505 = new ArrayList();
        c2505.f7509 = new ArrayList();
        c2505.f7510 = new ArrayList();
        c2505.f7507 = new ArrayList();
        c2505.f7508 = new ArrayList();
        c2505.f7500 = new ArrayList();
        c2505.f7499 = new ArrayList();
        c2505.f7503 = new ArrayList();
        c2505.f7504 = new ArrayList();
        c2505.f7501 = new ArrayList();
        c2505.f7502 = new ArrayList();
        this.f7254 = c2505;
        this.f7238 = 0;
        this.f7237 = -1;
        this.f7247 = Float.MIN_VALUE;
        this.f7243 = Float.MIN_VALUE;
        this.f7244 = true;
        this.f7240 = new RunnableC2480(this);
        this.f7242 = f7171 ? new C0920(2) : null;
        C2525 c2525 = new C2525();
        c2525.f7613 = -1;
        c2525.f7612 = 0;
        c2525.f7611 = 0;
        c2525.f7610 = 1;
        c2525.f7609 = 0;
        c2525.f7608 = false;
        c2525.f7617 = false;
        c2525.f7616 = false;
        c2525.f7620 = false;
        c2525.f7621 = false;
        c2525.f7618 = false;
        this.f7241 = c2525;
        this.f7216 = false;
        this.f7217 = false;
        C2454 c2454 = new C2454(this);
        this.f7214 = c2454;
        this.f7215 = false;
        this.f7206 = new int[2];
        this.f7208 = new int[2];
        this.f7204 = new int[2];
        this.f7205 = new int[2];
        this.f7222 = new ArrayList();
        this.f7223 = new RunnableC2455(this, i3);
        this.f7218 = 0;
        this.f7221 = 0;
        this.f7210 = new C2454(this);
        this.f7211 = new C2264(getContext(), new C2454(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7250 = viewConfiguration.getScaledTouchSlop();
        this.f7247 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f7243 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f7245 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7248 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7232 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f7254.f7643 = c2454;
        this.f7224 = new C0191(new C2454(this));
        this.f7228 = new C2495(new C2454(this));
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        if (AbstractC2190.m3995(this) == 0) {
            AbstractC2190.m3994(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f7183 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2482(this));
        int[] iArr = AbstractC7536.f20417;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC2270.m4243(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f7226 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                C5925.m11310("Trying to set fast scroller without both required drawables.".concat(m4710()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c3 = 2;
            c2 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
            new C2507(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.davemorrissey.labs.subscaleview.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            c2 = 1;
            c3 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        this.f7220 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
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
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC2519.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f7174);
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
                    setLayoutManager((AbstractC2519) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    C0276.m846(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    C0276.m846(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    C0276.m846(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    C0276.m846(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    C0276.m846(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = f7179;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC2270.m4243(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.davemorrissey.labs.subscaleview.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private C2250 getScrollingChildHelper() {
        if (this.f7209 == null) {
            this.f7209 = new C2250(this);
        }
        return this.f7209;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f7176 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f7177 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static AbstractC2484 m4689(View view) {
        if (view == null) {
            return null;
        }
        return ((C2518) view.getLayoutParams()).f7579;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m4690(Rect rect, View view) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        Rect rect2 = c2518.f7577;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2518).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2518).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2518).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2518).bottomMargin);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static RecyclerView m4691(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM4691 = m4691(viewGroup.getChildAt(i));
            if (recyclerViewM4691 != null) {
                return recyclerViewM4691;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4695(AbstractC2484 abstractC2484) {
        WeakReference<RecyclerView> weakReference = abstractC2484.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC2484.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC2484.mNestedRecyclerView = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static int m4696(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC6347.m11898(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC6347.m11927(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC6347.m11898(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC6347.m11927(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            abstractC2519.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public void addOnChildAttachStateChangeListener(InterfaceC2517 interfaceC2517) {
        if (this.f7182 == null) {
            this.f7182 = new ArrayList();
        }
        this.f7182.add(interfaceC2517);
    }

    public void addOnItemTouchListener(InterfaceC2532 interfaceC2532) {
        this.f7202.add(interfaceC2532);
    }

    public void addOnScrollListener(AbstractC2533 abstractC2533) {
        if (this.f7212 == null) {
            this.f7212 = new ArrayList();
        }
        this.f7212.add(abstractC2533);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2518) && this.f7193.mo4618((C2518) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null && abstractC2519.mo4676()) {
            return this.f7193.mo4673(this.f7241);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null && abstractC2519.mo4676()) {
            return this.f7193.mo4616(this.f7241);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null && abstractC2519.mo4676()) {
            return this.f7193.mo4617(this.f7241);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null && abstractC2519.mo4675()) {
            return this.f7193.mo4645(this.f7241);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null && abstractC2519.mo4675()) {
            return this.f7193.mo4603(this.f7241);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null && abstractC2519.mo4675()) {
            return this.f7193.mo4602(this.f7241);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC2519 layoutManager = getLayoutManager();
        int iMo4794 = 0;
        if (layoutManager != null) {
            if (layoutManager.mo4675()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m4748(0, measuredHeight, false);
                        return true;
                    }
                    m4748(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo4680 = layoutManager.mo4680();
                    if (keyCode == 122) {
                        if (zMo4680) {
                            iMo4794 = getAdapter().mo4794();
                        }
                    } else if (!zMo4680) {
                        iMo4794 = getAdapter().mo4794();
                    }
                    m4744(iMo4794);
                    return true;
                }
            } else if (layoutManager.mo4676()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m4748(measuredWidth, 0, false);
                        return true;
                    }
                    m4748(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo46802 = layoutManager.mo4680();
                    if (keyCode2 == 122) {
                        if (zMo46802) {
                            iMo4794 = getAdapter().mo4794();
                        }
                    } else if (!zMo46802) {
                        iMo4794 = getAdapter().mo4794();
                    }
                    m4744(iMo4794);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m4207(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m4206(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4205(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m4204(i, i2, i3, i4, iArr, 0, null);
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
        ArrayList arrayList = this.f7203;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC2537) arrayList.get(i)).mo4887(canvas, this);
        }
        EdgeEffect edgeEffect = this.f7251;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f7226 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f7251;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f7255;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f7226) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f7255;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f7256;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f7226 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f7256;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f7253;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f7226) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f7253;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f7254 == null || arrayList.size() <= 0 || !this.f7254.mo4967()) ? z : true) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            return abstractC2519.mo4601();
        }
        C5925.m11311("RecyclerView has no LayoutManager".concat(m4710()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            return abstractC2519.mo4606(getContext(), attributeSet);
        }
        C5925.m11311("RecyclerView has no LayoutManager".concat(m4710()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC2450 getAdapter() {
        return this.f7194;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null) {
            return super.getBaseline();
        }
        abstractC2519.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f7226;
    }

    public C2482 getCompatAccessibilityDelegate() {
        return this.f7207;
    }

    public AbstractC2539 getEdgeEffectFactory() {
        return this.f7252;
    }

    public AbstractC2536 getItemAnimator() {
        return this.f7254;
    }

    public int getItemDecorationCount() {
        return this.f7203.size();
    }

    public AbstractC2519 getLayoutManager() {
        return this.f7193;
    }

    public int getMaxFlingVelocity() {
        return this.f7248;
    }

    public int getMinFlingVelocity() {
        return this.f7245;
    }

    public long getNanoTime() {
        if (f7171) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2516 getOnFlingListener() {
        return this.f7246;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f7244;
    }

    public C2528 getRecycledViewPool() {
        return this.f7231.m5032();
    }

    public int getScrollState() {
        return this.f7238;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m4202(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f7200;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f7191;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6554;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f7180 = r0
            r1 = 1
            r5.f7200 = r1
            boolean r2 = r5.f7198
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f7198 = r2
            androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世 r2 = r5.f7231
            r2.m5030()
            androidx.recyclerview.widget.飘花落叶言子苏世哲楪兰 r2 = r5.f7193
            if (r2 == 0) goto L26
            r2.f7591 = r1
            r2.mo5016(r5)
        L26:
            r5.f7215 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f7171
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC2502.f7490
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r1 = (androidx.recyclerview.widget.RunnableC2502) r1
            r5.f7239 = r1
            if (r1 != 0) goto L66
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r1 = new androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲
            r1.<init>()
            r5.f7239 = r1
            java.util.WeakHashMap r1 = androidx.core.view.AbstractC2270.f6594
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r2 = r5.f7239
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7494 = r3
            r0.set(r2)
        L66:
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r0 = r5.f7239
            java.util.ArrayList r0 = r0.f7495
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f7176
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r5 = "RecyclerView already present in worker list!"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return
        L7b:
            r0.add(r5)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC2502 runnableC2502;
        super.onDetachedFromWindow();
        AbstractC2536 abstractC2536 = this.f7254;
        if (abstractC2536 != null) {
            abstractC2536.mo4968();
        }
        m4742();
        int i = 0;
        this.f7200 = false;
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            abstractC2519.f7591 = false;
            abstractC2519.mo4678(this);
        }
        this.f7222.clear();
        removeCallbacks(this.f7223);
        this.f7229.getClass();
        while (C2488.f7446.acquire() != null) {
        }
        C2531 c2531 = this.f7231;
        ArrayList arrayList = c2531.f7633;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC3057.m6741(((AbstractC2484) arrayList.get(i2)).itemView);
        }
        c2531.m5029(c2531.f7636.f7194, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = AbstractC3057.m6749(childAt).f20929;
            for (int iM11901 = AbstractC6347.m11901(arrayList2); -1 < iM11901; iM11901--) {
                ((C1862) ((InterfaceC7716) arrayList2.get(iM11901))).f5365.m3495();
            }
            i = i3;
        }
        if (!f7171 || (runnableC2502 = this.f7239) == null) {
            return;
        }
        boolean zRemove = runnableC2502.f7495.remove(this);
        if (!f7176 || zRemove) {
            this.f7239 = null;
        } else {
            C5925.m11311("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f7203;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2537) arrayList.get(i)).mo4888(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f7193 != null && !this.f7191 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f = this.f7193.mo4675() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f7193.mo4676() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f7193.mo4675()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.f7193.mo4676()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f7220;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f7243);
            int i3 = (int) (axisValue * this.f7247);
            if (z) {
                OverScroller overScroller = this.f7240.f7432;
                m4748((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                AbstractC2519 abstractC2519 = this.f7193;
                if (abstractC2519 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f7191) {
                    int[] iArr = this.f7205;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo4676 = abstractC2519.mo4676();
                    boolean zMo4675 = this.f7193.mo4675();
                    int i4 = zMo4675 ? (zMo4676 ? 1 : 0) | 2 : zMo4676 ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM4737 = i3 - m4737(y, i3);
                    int iM4736 = i2 - m4736(x, i2);
                    getScrollingChildHelper().m4209(i4, 1);
                    if (m4723(zMo4676 ? iM4737 : 0, zMo4675 ? iM4736 : 0, 1, this.f7205, this.f7208)) {
                        iM4737 -= iArr[0];
                        iM4736 -= iArr[1];
                    }
                    m4751(zMo4676 ? iM4737 : 0, zMo4675 ? iM4736 : 0, motionEvent, 1);
                    RunnableC2502 runnableC2502 = this.f7239;
                    if (runnableC2502 != null && (iM4737 != 0 || iM4736 != 0)) {
                        runnableC2502.m4965(this, iM4737, iM4736);
                    }
                    m4743(1);
                }
            }
            if (i != 0 && !z) {
                this.f7211.m4224(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f7191) {
            this.f7201 = null;
            if (m4718(motionEvent)) {
                VelocityTracker velocityTracker = this.f7236;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m4743(0);
                m4738();
                setScrollState(0);
                return true;
            }
            AbstractC2519 abstractC2519 = this.f7193;
            if (abstractC2519 != null) {
                boolean zMo4676 = abstractC2519.mo4676();
                boolean zMo4675 = this.f7193.mo4675();
                if (this.f7236 == null) {
                    this.f7236 = VelocityTracker.obtain();
                }
                this.f7236.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f7190) {
                        this.f7190 = false;
                    }
                    this.f7237 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f7233 = x;
                    this.f7235 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f7249 = y;
                    this.f7234 = y;
                    EdgeEffect edgeEffect = this.f7251;
                    if (edgeEffect == null || AbstractC6347.m11898(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC6347.m11927(this.f7251, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f7256;
                    if (edgeEffect2 != null && AbstractC6347.m11898(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC6347.m11927(this.f7256, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f7255;
                    if (edgeEffect3 != null && AbstractC6347.m11898(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC6347.m11927(this.f7255, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f7253;
                    if (edgeEffect4 != null && AbstractC6347.m11898(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC6347.m11927(this.f7253, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f7238 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m4743(1);
                    }
                    int[] iArr = this.f7204;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m4741(0);
                } else if (actionMasked == 1) {
                    this.f7236.clear();
                    m4743(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f7237);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f7237 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f7238 != 1) {
                        int i = x2 - this.f7235;
                        int i2 = y2 - this.f7234;
                        if (!zMo4676 || Math.abs(i) <= this.f7250) {
                            z2 = false;
                        } else {
                            this.f7233 = x2;
                            z2 = true;
                        }
                        if (zMo4675 && Math.abs(i2) > this.f7250) {
                            this.f7249 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f7236;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m4743(0);
                    m4738();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f7237 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f7233 = x3;
                    this.f7235 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f7249 = y3;
                    this.f7234 = y3;
                } else if (actionMasked == 6) {
                    m4756(motionEvent);
                }
                if (this.f7238 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m4721();
        Trace.endSection();
        this.f7198 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null) {
            m4729(i, i2);
            return;
        }
        boolean zMo4681 = abstractC2519.mo4681();
        boolean z = false;
        C2525 c2525 = this.f7241;
        if (zMo4681) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f7193.f7592.m4729(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f7219 = z;
            if (z || this.f7194 == null) {
                return;
            }
            if (c2525.f7610 == 1) {
                m4725();
            }
            this.f7193.m5009(i, i2);
            c2525.f7620 = true;
            m4726();
            this.f7193.m5011(i, i2);
            if (this.f7193.mo4668()) {
                this.f7193.m5009(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c2525.f7620 = true;
                m4726();
                this.f7193.m5011(i, i2);
            }
            this.f7218 = getMeasuredWidth();
            this.f7221 = getMeasuredHeight();
            return;
        }
        if (this.f7199) {
            this.f7193.f7592.m4729(i, i2);
            return;
        }
        if (this.f7187) {
            m4745();
            m4753();
            m4754();
            m4752(true);
            if (c2525.f7618) {
                c2525.f7617 = true;
            } else {
                this.f7224.m689();
                c2525.f7617 = false;
            }
            this.f7187 = false;
            m4740(false);
        } else if (c2525.f7618) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC2450 abstractC2450 = this.f7194;
        if (abstractC2450 != null) {
            c2525.f7609 = abstractC2450.mo4794();
        } else {
            c2525.f7609 = 0;
        }
        m4745();
        this.f7193.f7592.m4729(i, i2);
        m4740(false);
        c2525.f7617 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m4705()) {
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
        this.f7225 = savedState;
        super.onRestoreInstanceState(savedState.f6699);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f7225;
        if (savedState2 != null) {
            savedState.f7257 = savedState2.f7257;
            return savedState;
        }
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            savedState.f7257 = abstractC2519.mo4669();
            return savedState;
        }
        savedState.f7257 = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f7253 = null;
        this.f7255 = null;
        this.f7256 = null;
        this.f7251 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC2484 abstractC2484M4689 = m4689(view);
        if (abstractC2484M4689 != null) {
            if (abstractC2484M4689.isTmpDetached()) {
                abstractC2484M4689.clearTmpDetachFlag();
            } else if (!abstractC2484M4689.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC2484M4689);
                C4211.m8603(m4710(), sb);
                return;
            }
        } else if (f7176) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            C4211.m8603(m4710(), sb2);
            return;
        }
        view.clearAnimation();
        m4722(view);
        super.removeDetachedView(view, z);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC2517 interfaceC2517) {
        ArrayList arrayList = this.f7182;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC2517);
    }

    public void removeOnItemTouchListener(InterfaceC2532 interfaceC2532) {
        this.f7202.remove(interfaceC2532);
        if (this.f7201 == interfaceC2532) {
            this.f7201 = null;
        }
    }

    public void removeOnScrollListener(AbstractC2533 abstractC2533) {
        ArrayList arrayList = this.f7212;
        if (arrayList != null) {
            arrayList.remove(abstractC2533);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C2459 c2459 = this.f7193.f7586;
        if ((c2459 == null || !c2459.f7313) && !m4705() && view2 != null) {
            m4750(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f7193.mo5002(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f7202;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2532) arrayList.get(i)).mo4870(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f7189 != 0 || this.f7191) {
            this.f7188 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f7191) {
            return;
        }
        boolean zMo4676 = abstractC2519.mo4676();
        boolean zMo4675 = this.f7193.mo4675();
        if (zMo4676 || zMo4675) {
            if (!zMo4676) {
                i = 0;
            }
            if (!zMo4675) {
                i2 = 0;
            }
            m4751(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m4705()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f7186 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C2482 c2482) {
        this.f7207 = c2482;
        AbstractC2270.m4244(this, c2482);
    }

    public void setAdapter(AbstractC2450 abstractC2450) {
        setLayoutFrozen(false);
        AbstractC2450 abstractC24502 = this.f7194;
        C2526 c2526 = this.f7230;
        if (abstractC24502 != null) {
            abstractC24502.f7298.unregisterObserver(c2526);
            this.f7194.mo4797(this);
        }
        AbstractC2536 abstractC2536 = this.f7254;
        if (abstractC2536 != null) {
            abstractC2536.mo4968();
        }
        AbstractC2519 abstractC2519 = this.f7193;
        C2531 c2531 = this.f7231;
        if (abstractC2519 != null) {
            abstractC2519.m5007(c2531);
            this.f7193.m5000(c2531);
        }
        c2531.f7635.clear();
        c2531.m5038();
        C0191 c0191 = this.f7224;
        c0191.m668((ArrayList) c0191.f748);
        c0191.m668((ArrayList) c0191.f747);
        c0191.f750 = 0;
        AbstractC2450 abstractC24503 = this.f7194;
        this.f7194 = abstractC2450;
        if (abstractC2450 != null) {
            abstractC2450.f7298.registerObserver(c2526);
            abstractC2450.mo4808(this);
        }
        AbstractC2519 abstractC25192 = this.f7193;
        if (abstractC25192 != null) {
            abstractC25192.mo4784(this.f7194);
        }
        AbstractC2450 abstractC24504 = this.f7194;
        c2531.f7635.clear();
        c2531.m5038();
        c2531.m5029(abstractC24503, true);
        C2528 c2528M5032 = c2531.m5032();
        if (abstractC24503 != null) {
            c2528M5032.f7624--;
        }
        if (c2528M5032.f7624 == 0) {
            SparseArray sparseArray = c2528M5032.f7625;
            for (int i = 0; i < sparseArray.size(); i++) {
                C2529 c2529 = (C2529) sparseArray.valueAt(i);
                Iterator it = c2529.f7629.iterator();
                while (it.hasNext()) {
                    AbstractC3057.m6741(((AbstractC2484) it.next()).itemView);
                }
                c2529.f7629.clear();
            }
        }
        if (abstractC24504 != null) {
            c2528M5032.f7624++;
        }
        c2531.m5030();
        this.f7241.f7608 = true;
        m4755(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2538 interfaceC2538) {
        if (interfaceC2538 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f7226) {
            this.f7253 = null;
            this.f7255 = null;
            this.f7256 = null;
            this.f7251 = null;
        }
        this.f7226 = z;
        super.setClipToPadding(z);
        if (this.f7198) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC2539 abstractC2539) {
        abstractC2539.getClass();
        this.f7252 = abstractC2539;
        this.f7253 = null;
        this.f7255 = null;
        this.f7256 = null;
        this.f7251 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f7199 = z;
    }

    public void setItemAnimator(AbstractC2536 abstractC2536) {
        AbstractC2536 abstractC25362 = this.f7254;
        if (abstractC25362 != null) {
            abstractC25362.mo4968();
            this.f7254.f7643 = null;
        }
        this.f7254 = abstractC2536;
        if (abstractC2536 != null) {
            abstractC2536.f7643 = this.f7214;
        }
    }

    public void setItemViewCacheSize(int i) {
        C2531 c2531 = this.f7231;
        c2531.f7631 = i;
        c2531.m5035();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC2519 abstractC2519) {
        RecyclerView recyclerView;
        if (abstractC2519 == this.f7193) {
            return;
        }
        m4742();
        AbstractC2519 abstractC25192 = this.f7193;
        C2531 c2531 = this.f7231;
        if (abstractC25192 != null) {
            AbstractC2536 abstractC2536 = this.f7254;
            if (abstractC2536 != null) {
                abstractC2536.mo4968();
            }
            this.f7193.m5007(c2531);
            this.f7193.m5000(c2531);
            c2531.f7635.clear();
            c2531.m5038();
            if (this.f7200) {
                AbstractC2519 abstractC25193 = this.f7193;
                abstractC25193.f7591 = false;
                abstractC25193.mo4678(this);
            }
            this.f7193.m5010(null);
            this.f7193 = null;
        } else {
            c2531.f7635.clear();
            c2531.m5038();
        }
        C2495 c2495 = this.f7228;
        ((C2496) c2495.f7470).m4956();
        ArrayList arrayList = (ArrayList) c2495.f7469;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C2454) c2495.f7471).f7304;
            if (size < 0) {
                break;
            }
            AbstractC2484 abstractC2484M4689 = m4689((View) arrayList.get(size));
            if (abstractC2484M4689 != null) {
                abstractC2484M4689.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.m4722(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f7193 = abstractC2519;
        if (abstractC2519 != null) {
            if (abstractC2519.f7592 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC2519);
                C5554.m10876(sb, " is already attached to a RecyclerView:", abstractC2519.f7592.m4710());
                return;
            } else {
                abstractC2519.m5010(this);
                if (this.f7200) {
                    AbstractC2519 abstractC25194 = this.f7193;
                    abstractC25194.f7591 = true;
                    abstractC25194.mo5016(this);
                }
            }
        }
        c2531.m5035();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            C5925.m11310("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C2250 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f6554) {
            ViewGroup viewGroup = scrollingChildHelper.f6555;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f6554 = z;
    }

    public void setOnFlingListener(AbstractC2516 abstractC2516) {
        this.f7246 = abstractC2516;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2533 abstractC2533) {
        this.f7213 = abstractC2533;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f7244 = z;
    }

    public void setRecycledViewPool(C2528 c2528) {
        C2531 c2531 = this.f7231;
        RecyclerView recyclerView = c2531.f7636;
        c2531.m5029(recyclerView.f7194, false);
        if (c2531.f7637 != null) {
            r1.f7624--;
        }
        c2531.f7637 = c2528;
        if (c2528 != null && recyclerView.getAdapter() != null) {
            c2531.f7637.f7624++;
        }
        c2531.m5030();
    }

    public void setScrollState(int i) {
        C2459 c2459;
        if (i == this.f7238) {
            return;
        }
        if (f7177) {
            StringBuilder sbM150 = AbstractC0053.m150(i, "setting scroll state to ", " from ");
            sbM150.append(this.f7238);
            Log.d("RecyclerView", sbM150.toString(), new Exception());
        }
        this.f7238 = i;
        if (i != 2) {
            RunnableC2480 runnableC2480 = this.f7240;
            runnableC2480.f7430.removeCallbacks(runnableC2480);
            runnableC2480.f7432.abortAnimation();
            AbstractC2519 abstractC2519 = this.f7193;
            if (abstractC2519 != null && (c2459 = abstractC2519.f7586) != null) {
                c2459.m4862();
            }
        }
        AbstractC2519 abstractC25192 = this.f7193;
        if (abstractC25192 != null) {
            abstractC25192.mo4783(i);
        }
        AbstractC2533 abstractC2533 = this.f7213;
        if (abstractC2533 != null) {
            abstractC2533.mo4899(this, i);
        }
        ArrayList arrayList = this.f7212;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2533) this.f7212.get(size)).mo4899(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f7250 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f7250 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC2481 abstractC2481) {
        this.f7231.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m4209(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m4208(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f7191) {
            m4732("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f7191 = true;
                this.f7190 = true;
                m4742();
                return;
            }
            this.f7191 = false;
            if (this.f7188 && this.f7193 != null && this.f7194 != null) {
                requestLayout();
            }
            this.f7188 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m4700() {
        C2495 c2495 = this.f7228;
        int iM4948 = c2495.m4948();
        for (int i = 0; i < iM4948; i++) {
            ((C2518) c2495.m4944(i).getLayoutParams()).f7578 = true;
        }
        ArrayList arrayList = this.f7231.f7633;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2518 c2518 = (C2518) ((AbstractC2484) arrayList.get(i2)).itemView.getLayoutParams();
            if (c2518 != null) {
                c2518.f7578 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m4701(int i, int i2, boolean z) {
        int i3 = i + i2;
        C2495 c2495 = this.f7228;
        int iM4948 = c2495.m4948();
        for (int i4 = 0; i4 < iM4948; i4++) {
            AbstractC2484 abstractC2484M4689 = m4689(c2495.m4944(i4));
            if (abstractC2484M4689 != null && !abstractC2484M4689.shouldIgnore()) {
                int i5 = abstractC2484M4689.mPosition;
                C2525 c2525 = this.f7241;
                if (i5 >= i3) {
                    if (f7177) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC2484M4689 + " now at position " + (abstractC2484M4689.mPosition - i2));
                    }
                    abstractC2484M4689.offsetPosition(-i2, z);
                    c2525.f7608 = true;
                } else if (i5 >= i) {
                    if (f7177) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC2484M4689 + " now REMOVED");
                    }
                    abstractC2484M4689.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    c2525.f7608 = true;
                }
            }
        }
        C2531 c2531 = this.f7231;
        ArrayList arrayList = c2531.f7633;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(size);
            if (abstractC2484 != null) {
                int i6 = abstractC2484.mPosition;
                if (i6 >= i3) {
                    if (f7177) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC2484 + " now at position " + (abstractC2484.mPosition - i2));
                    }
                    abstractC2484.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC2484.addFlags(8);
                    c2531.m5037(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m4702() {
        return !this.f7198 || this.f7185 || this.f7224.m667();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Rect m4703(View view) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        boolean z = c2518.f7578;
        Rect rect = c2518.f7577;
        if (z) {
            C2525 c2525 = this.f7241;
            if (!c2525.f7617 || (!c2518.f7579.isUpdated() && !c2518.f7579.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f7203;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f7197;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC2537) arrayList.get(i)).mo4879(rect2, view, this, c2525);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                c2518.f7578 = false;
                return rect;
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m4704(int i) {
        if (this.f7193 == null) {
            return;
        }
        setScrollState(2);
        this.f7193.mo4666(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean m4705() {
        return this.f7180 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int m4706(AbstractC2484 abstractC2484) {
        if (abstractC2484.hasAnyOfTheFlags(524) || !abstractC2484.isBound()) {
            return -1;
        }
        int i = abstractC2484.mPosition;
        ArrayList arrayList = (ArrayList) this.f7224.f748;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2497 c2497 = (C2497) arrayList.get(i2);
            int i3 = c2497.f7480;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c2497.f7479;
                    if (i4 <= i) {
                        int i5 = c2497.f7477;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c2497.f7479;
                    if (i6 == i) {
                        i = c2497.f7477;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c2497.f7477 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c2497.f7479 <= i) {
                i += c2497.f7477;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4707(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4707(int, int, int, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final AbstractC2484 m4708(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4689(view);
        }
        C5554.m10874("View ", view, " is not a direct child of ", this);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long m4709(AbstractC2484 abstractC2484) {
        return this.f7194.f7297 ? abstractC2484.getItemId() : abstractC2484.mPosition;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m4710() {
        return " " + super.toString() + ", adapter:" + this.f7194 + ", layout:" + this.f7193 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m4711() {
        if (this.f7255 != null) {
            return;
        }
        ((C2524) this.f7252).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7255 = edgeEffect;
        if (this.f7226) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m4712() {
        if (this.f7256 != null) {
            return;
        }
        ((C2524) this.f7252).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7256 = edgeEffect;
        if (this.f7226) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m4713() {
        if (this.f7251 != null) {
            return;
        }
        ((C2524) this.f7252).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7251 = edgeEffect;
        if (this.f7226) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m4714() {
        if (this.f7253 != null) {
            return;
        }
        ((C2524) this.f7252).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7253 = edgeEffect;
        if (this.f7226) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m4715(int i, int i2) {
        this.f7181++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC2533 abstractC2533 = this.f7213;
        if (abstractC2533 != null) {
            abstractC2533.mo4898(this, i, i2);
        }
        ArrayList arrayList = this.f7212;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2533) this.f7212.get(size)).mo4898(this, i, i2);
            }
        }
        this.f7181--;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final AbstractC2484 m4716(int i) {
        AbstractC2484 abstractC2484 = null;
        if (this.f7185) {
            return null;
        }
        C2495 c2495 = this.f7228;
        int iM4948 = c2495.m4948();
        for (int i2 = 0; i2 < iM4948; i2++) {
            AbstractC2484 abstractC2484M4689 = m4689(c2495.m4944(i2));
            if (abstractC2484M4689 != null && !abstractC2484M4689.isRemoved() && m4706(abstractC2484M4689) == i) {
                if (!((ArrayList) c2495.f7469).contains(abstractC2484M4689.itemView)) {
                    return abstractC2484M4689;
                }
                abstractC2484 = abstractC2484M4689;
            }
        }
        return abstractC2484;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m4717(int[] iArr) {
        C2495 c2495 = this.f7228;
        int iM4938 = c2495.m4938();
        if (iM4938 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM4938; i3++) {
            AbstractC2484 abstractC2484M4689 = m4689(c2495.m4939(i3));
            if (!abstractC2484M4689.shouldIgnore()) {
                int layoutPosition = abstractC2484M4689.getLayoutPosition();
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
    public final boolean m4718(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f7202;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2532 interfaceC2532 = (InterfaceC2532) arrayList.get(i);
            if (interfaceC2532.mo4871(motionEvent) && action != 3) {
                this.f7201 = interfaceC2532;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final View m4719(View view) {
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
    public final void m4720(C2525 c2525) {
        if (getScrollState() != 2) {
            c2525.getClass();
            return;
        }
        OverScroller overScroller = this.f7240.f7432;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c2525.getClass();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4721() {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4721():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m4722(View view) {
        AbstractC2484 abstractC2484M4689 = m4689(view);
        AbstractC2450 abstractC2450 = this.f7194;
        if (abstractC2450 != null && abstractC2484M4689 != null) {
            abstractC2450.mo4799(abstractC2484M4689);
        }
        ArrayList arrayList = this.f7182;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC2517) this.f7182.get(size)).mo4881(view);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m4723(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4205(i, i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m4724(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m4204(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m4725() {
        C2488 c2488;
        View viewM4719;
        C2525 c2525 = this.f7241;
        c2525.m5026(1);
        m4720(c2525);
        c2525.f7620 = false;
        m4745();
        C2491 c2491 = this.f7229;
        C0283 c0283 = (C0283) c2491.f7456;
        C0283 c02832 = (C0283) c2491.f7456;
        c0283.clear();
        C0263 c0263 = (C0263) c2491.f7455;
        c0263.m827();
        m4753();
        m4754();
        AbstractC2484 abstractC2484M4708 = null;
        View focusedChild = (this.f7244 && hasFocus() && this.f7194 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM4719 = m4719(focusedChild)) != null) {
            abstractC2484M4708 = m4708(viewM4719);
        }
        if (abstractC2484M4708 == null) {
            c2525.f7615 = -1L;
            c2525.f7619 = -1;
            c2525.f7614 = -1;
        } else {
            c2525.f7615 = this.f7194.f7297 ? abstractC2484M4708.getItemId() : -1L;
            c2525.f7619 = this.f7185 ? -1 : abstractC2484M4708.isRemoved() ? abstractC2484M4708.mOldPosition : abstractC2484M4708.getAbsoluteAdapterPosition();
            View focusedChild2 = abstractC2484M4708.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c2525.f7614 = id;
        }
        c2525.f7616 = c2525.f7621 && this.f7217;
        this.f7217 = false;
        this.f7216 = false;
        c2525.f7617 = c2525.f7618;
        c2525.f7609 = this.f7194.mo4794();
        m4717(this.f7206);
        boolean z = c2525.f7621;
        C2495 c2495 = this.f7228;
        if (z) {
            int iM4938 = c2495.m4938();
            for (int i = 0; i < iM4938; i++) {
                AbstractC2484 abstractC2484M4689 = m4689(c2495.m4939(i));
                if (!abstractC2484M4689.shouldIgnore() && (!abstractC2484M4689.isInvalid() || this.f7194.f7297)) {
                    AbstractC2536 abstractC2536 = this.f7254;
                    AbstractC2536.m5044(abstractC2484M4689);
                    abstractC2484M4689.getUnmodifiedPayloads();
                    abstractC2536.getClass();
                    C0966 c0966 = new C0966();
                    c0966.m1881(abstractC2484M4689);
                    C2488 c2488M4913 = (C2488) c02832.get(abstractC2484M4689);
                    if (c2488M4913 == null) {
                        c2488M4913 = C2488.m4913();
                        c02832.put(abstractC2484M4689, c2488M4913);
                    }
                    c2488M4913.f7448 = c0966;
                    c2488M4913.f7449 |= 4;
                    if (c2525.f7616 && abstractC2484M4689.isUpdated() && !abstractC2484M4689.isRemoved() && !abstractC2484M4689.shouldIgnore() && !abstractC2484M4689.isInvalid()) {
                        c0263.m823(abstractC2484M4689, m4709(abstractC2484M4689));
                    }
                }
            }
        }
        if (c2525.f7618) {
            int iM4948 = c2495.m4948();
            for (int i2 = 0; i2 < iM4948; i2++) {
                AbstractC2484 abstractC2484M46892 = m4689(c2495.m4944(i2));
                if (f7176 && abstractC2484M46892.mPosition == -1 && !abstractC2484M46892.isRemoved()) {
                    C5925.m11311("view holder cannot have position -1 unless it is removed".concat(m4710()));
                    return;
                } else {
                    if (!abstractC2484M46892.shouldIgnore()) {
                        abstractC2484M46892.saveOldPosition();
                    }
                }
            }
            boolean z2 = c2525.f7608;
            c2525.f7608 = false;
            this.f7193.mo4620(this.f7231, c2525);
            c2525.f7608 = z2;
            for (int i3 = 0; i3 < c2495.m4938(); i3++) {
                AbstractC2484 abstractC2484M46893 = m4689(c2495.m4939(i3));
                if (!abstractC2484M46893.shouldIgnore() && ((c2488 = (C2488) c02832.get(abstractC2484M46893)) == null || (c2488.f7449 & 4) == 0)) {
                    AbstractC2536.m5044(abstractC2484M46893);
                    boolean zHasAnyOfTheFlags = abstractC2484M46893.hasAnyOfTheFlags(8192);
                    AbstractC2536 abstractC25362 = this.f7254;
                    abstractC2484M46893.getUnmodifiedPayloads();
                    abstractC25362.getClass();
                    C0966 c09662 = new C0966();
                    c09662.m1881(abstractC2484M46893);
                    if (zHasAnyOfTheFlags) {
                        m4739(abstractC2484M46893, c09662);
                    } else {
                        C2488 c2488M49132 = (C2488) c02832.get(abstractC2484M46893);
                        if (c2488M49132 == null) {
                            c2488M49132 = C2488.m4913();
                            c02832.put(abstractC2484M46893, c2488M49132);
                        }
                        c2488M49132.f7449 |= 2;
                        c2488M49132.f7448 = c09662;
                    }
                }
            }
            m4727();
        } else {
            m4727();
        }
        m4752(true);
        m4740(false);
        c2525.f7610 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m4726() {
        m4745();
        m4753();
        C2525 c2525 = this.f7241;
        c2525.m5026(6);
        this.f7224.m689();
        c2525.f7609 = this.f7194.mo4794();
        c2525.f7611 = 0;
        if (this.f7225 != null) {
            AbstractC2450 abstractC2450 = this.f7194;
            int iOrdinal = abstractC2450.f7296.ordinal();
            if (iOrdinal == 1 ? abstractC2450.mo4794() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f7225.f7257;
                if (parcelable != null) {
                    this.f7193.mo4679(parcelable);
                }
                this.f7225 = null;
            }
        }
        c2525.f7617 = false;
        this.f7193.mo4620(this.f7231, c2525);
        c2525.f7608 = false;
        c2525.f7621 = c2525.f7621 && this.f7254 != null;
        c2525.f7610 = 4;
        m4752(true);
        m4740(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4727() {
        C2495 c2495 = this.f7228;
        int iM4948 = c2495.m4948();
        for (int i = 0; i < iM4948; i++) {
            AbstractC2484 abstractC2484M4689 = m4689(c2495.m4944(i));
            if (!abstractC2484M4689.shouldIgnore()) {
                abstractC2484M4689.clearOldPosition();
            }
        }
        C2531 c2531 = this.f7231;
        ArrayList arrayList = c2531.f7635;
        ArrayList arrayList2 = c2531.f7633;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC2484) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC2484) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c2531.f7634;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC2484) c2531.f7634.get(i4)).clearOldPosition();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4728() {
        if (!this.f7198 || this.f7185) {
            Trace.beginSection("RV FullInvalidate");
            m4721();
            Trace.endSection();
            return;
        }
        C0191 c0191 = this.f7224;
        if (c0191.m667()) {
            int i = c0191.f750;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c0191.m667()) {
                    Trace.beginSection("RV FullInvalidate");
                    m4721();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m4745();
            m4753();
            c0191.m670();
            if (!this.f7188) {
                C2495 c2495 = this.f7228;
                int iM4938 = c2495.m4938();
                int i2 = 0;
                while (true) {
                    if (i2 < iM4938) {
                        AbstractC2484 abstractC2484M4689 = m4689(c2495.m4939(i2));
                        if (abstractC2484M4689 != null && !abstractC2484M4689.shouldIgnore() && abstractC2484M4689.isUpdated()) {
                            m4721();
                            break;
                        }
                        i2++;
                    } else {
                        c0191.m692();
                        break;
                    }
                }
            }
            m4740(true);
            m4752(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m4729(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        setMeasuredDimension(AbstractC2519.m4990(i, paddingRight, getMinimumWidth()), AbstractC2519.m4990(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4730(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7251;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f7251.onRelease();
            zIsFinished = this.f7251.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f7256;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f7256.onRelease();
            zIsFinished |= this.f7256.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7255;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f7255.onRelease();
            zIsFinished |= this.f7255.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7253;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f7253.onRelease();
            zIsFinished |= this.f7253.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4731(AbstractC2537 abstractC2537) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            abstractC2519.mo4674("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f7203;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC2537);
        m4700();
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4732(String str) {
        if (!m4705()) {
            if (this.f7181 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m4710()));
            }
        } else if (str == null) {
            C5925.m11311("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m4710()));
        } else {
            C5925.m11311(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4733(AbstractC2484 abstractC2484) {
        View view = abstractC2484.itemView;
        boolean z = view.getParent() == this;
        this.f7231.m5036(m4708(view));
        boolean zIsTmpDetached = abstractC2484.isTmpDetached();
        C2495 c2495 = this.f7228;
        if (zIsTmpDetached) {
            c2495.m4941(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            c2495.m4942(view, -1, true);
            return;
        }
        int iIndexOfChild = ((C2454) c2495.f7471).f7304.indexOfChild(view);
        if (iIndexOfChild < 0) {
            C4211.m8604(view, "view is not a child, cannot hide ");
        } else {
            ((C2496) c2495.f7470).m4958(iIndexOfChild);
            c2495.m4949(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void m4734() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount <= 0) {
            C7547.m12772(AbstractC6183.m11588(itemDecorationCount, "0 is an invalid index for size "));
            return;
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (itemDecorationCount2 > 0) {
            m4735((AbstractC2537) this.f7203.get(0));
        } else {
            C7547.m12772(AbstractC6183.m11588(itemDecorationCount2, "0 is an invalid index for size "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m4735(AbstractC2537 abstractC2537) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            abstractC2519.mo4674("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f7203;
        arrayList.remove(abstractC2537);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m4700();
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final int m4736(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f7255;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC6347.m11898(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7253;
            if (edgeEffect2 != null && AbstractC6347.m11898(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.f7253;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fM11927 = AbstractC6347.m11927(edgeEffect3, height, 1.0f - width);
                    if (AbstractC6347.m11898(this.f7253) == 0.0f) {
                        this.f7253.onRelease();
                    }
                    f2 = fM11927;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.f7255;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC6347.m11927(edgeEffect4, -height, width);
                if (AbstractC6347.m11898(this.f7255) == 0.0f) {
                    this.f7255.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final int m4737(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f7251;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC6347.m11898(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7256;
            if (edgeEffect2 != null && AbstractC6347.m11898(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.f7256;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fM11927 = AbstractC6347.m11927(edgeEffect3, width, height);
                    if (AbstractC6347.m11898(this.f7256) == 0.0f) {
                        this.f7256.onRelease();
                    }
                    f2 = fM11927;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f7251;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC6347.m11927(edgeEffect4, -width, 1.0f - height);
                if (AbstractC6347.m11898(this.f7251) == 0.0f) {
                    this.f7251.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m4738() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7251;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f7251.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f7255;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f7255.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7256;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f7256.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7253;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f7253.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m4739(AbstractC2484 abstractC2484, C0966 c0966) {
        abstractC2484.setFlags(0, 8192);
        boolean z = this.f7241.f7616;
        C2491 c2491 = this.f7229;
        if (z && abstractC2484.isUpdated() && !abstractC2484.isRemoved() && !abstractC2484.shouldIgnore()) {
            ((C0263) c2491.f7455).m823(abstractC2484, m4709(abstractC2484));
        }
        C0283 c0283 = (C0283) c2491.f7456;
        C2488 c2488M4913 = (C2488) c0283.get(abstractC2484);
        if (c2488M4913 == null) {
            c2488M4913 = C2488.m4913();
            c0283.put(abstractC2484, c2488M4913);
        }
        c2488M4913.f7448 = c0966;
        c2488M4913.f7449 |= 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m4740(boolean z) {
        if (this.f7189 < 1) {
            if (f7176) {
                C5925.m11311("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(m4710()));
                return;
            }
            this.f7189 = 1;
        }
        if (!z && !this.f7191) {
            this.f7188 = false;
        }
        if (this.f7189 == 1) {
            if (z && this.f7188 && !this.f7191 && this.f7193 != null && this.f7194 != null) {
                m4721();
            }
            if (!this.f7191) {
                this.f7188 = false;
            }
        }
        this.f7189--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m4741(int i) {
        boolean zMo4676 = this.f7193.mo4676();
        int i2 = zMo4676;
        if (this.f7193.mo4675()) {
            i2 = (zMo4676 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m4209(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void m4742() {
        C2459 c2459;
        setScrollState(0);
        RunnableC2480 runnableC2480 = this.f7240;
        runnableC2480.f7430.removeCallbacks(runnableC2480);
        runnableC2480.f7432.abortAnimation();
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null || (c2459 = abstractC2519.f7586) == null) {
            return;
        }
        c2459.m4862();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m4743(int i) {
        getScrollingChildHelper().m4208(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m4744(int i) {
        if (this.f7191) {
            return;
        }
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2519.mo4667(this, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void m4745() {
        int i = this.f7189 + 1;
        this.f7189 = i;
        if (i != 1 || this.f7191) {
            return;
        }
        this.f7188 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m4746(int i) {
        if (this.f7191) {
            return;
        }
        m4742();
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2519.mo4666(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void m4747(int[] iArr, int i, int i2) {
        AbstractC2484 abstractC2484;
        m4745();
        m4753();
        Trace.beginSection("RV Scroll");
        C2525 c2525 = this.f7241;
        m4720(c2525);
        C2531 c2531 = this.f7231;
        int iMo4611 = i != 0 ? this.f7193.mo4611(i, c2531, c2525) : 0;
        int iMo4615 = i2 != 0 ? this.f7193.mo4615(i2, c2531, c2525) : 0;
        Trace.endSection();
        C2495 c2495 = this.f7228;
        int iM4938 = c2495.m4938();
        for (int i3 = 0; i3 < iM4938; i3++) {
            View viewM4939 = c2495.m4939(i3);
            AbstractC2484 abstractC2484M4708 = m4708(viewM4939);
            if (abstractC2484M4708 != null && (abstractC2484 = abstractC2484M4708.mShadowingHolder) != null) {
                View view = abstractC2484.itemView;
                int left = viewM4939.getLeft();
                int top2 = viewM4939.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
        m4752(true);
        m4740(false);
        if (iArr != null) {
            iArr[0] = iMo4611;
            iArr[1] = iMo4615;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m4748(int i, int i2, boolean z) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f7191) {
            return;
        }
        if (!abstractC2519.mo4676()) {
            i = 0;
        }
        if (!this.f7193.mo4675()) {
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
            getScrollingChildHelper().m4209(i3, 1);
        }
        this.f7240.m4895(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final boolean m4749(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM11898 = AbstractC6347.m11898(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f7232 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f7178;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM11898;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void m4750(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f7197;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2518) {
            C2518 c2518 = (C2518) layoutParams;
            if (!c2518.f7578) {
                Rect rect2 = c2518.f7577;
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
        this.f7193.mo5002(this, view, this.f7197, !this.f7198, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4751(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4751(int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m4752(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f7180 - 1;
        this.f7180 = i2;
        if (i2 < 1) {
            if (f7176 && i2 < 0) {
                C5925.m11311("layout or scroll counter cannot go below zero.Some calls are not matching".concat(m4710()));
                return;
            }
            this.f7180 = 0;
            if (z) {
                int i3 = this.f7186;
                this.f7186 = 0;
                if (i3 != 0 && (accessibilityManager = this.f7183) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f7222;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(size);
                    if (abstractC2484.itemView.getParent() == this && !abstractC2484.shouldIgnore() && (i = abstractC2484.mPendingAccessibilityState) != -1) {
                        abstractC2484.itemView.setImportantForAccessibility(i);
                        abstractC2484.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m4753() {
        this.f7180++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m4754() {
        boolean z;
        boolean z2 = this.f7185;
        C0191 c0191 = this.f7224;
        boolean z3 = false;
        if (z2) {
            c0191.m668((ArrayList) c0191.f748);
            c0191.m668((ArrayList) c0191.f747);
            c0191.f750 = 0;
            if (this.f7184) {
                this.f7193.mo4627();
            }
        }
        if (this.f7254 != null && this.f7193.mo4612()) {
            c0191.m670();
        } else {
            c0191.m689();
        }
        boolean z4 = this.f7216 || this.f7217;
        boolean z5 = this.f7198 && this.f7254 != null && ((z = this.f7185) || z4 || this.f7193.f7590) && (!z || this.f7194.f7297);
        C2525 c2525 = this.f7241;
        c2525.f7621 = z5;
        if (z5 && z4 && !this.f7185 && this.f7254 != null && this.f7193.mo4612()) {
            z3 = true;
        }
        c2525.f7618 = z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m4755(boolean z) {
        this.f7184 = z | this.f7184;
        this.f7185 = true;
        C2495 c2495 = this.f7228;
        int iM4948 = c2495.m4948();
        for (int i = 0; i < iM4948; i++) {
            AbstractC2484 abstractC2484M4689 = m4689(c2495.m4944(i));
            if (abstractC2484M4689 != null && !abstractC2484M4689.shouldIgnore()) {
                abstractC2484M4689.addFlags(6);
            }
        }
        m4700();
        C2531 c2531 = this.f7231;
        ArrayList arrayList = c2531.f7633;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(i2);
            if (abstractC2484 != null) {
                abstractC2484.addFlags(6);
                abstractC2484.addChangePayload(null);
            }
        }
        AbstractC2450 abstractC2450 = c2531.f7636.f7194;
        if (abstractC2450 == null || !abstractC2450.f7297) {
            c2531.m5038();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m4756(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7237) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f7237 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f7233 = x;
            this.f7235 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f7249 = y;
            this.f7234 = y;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m4757() {
        if (this.f7215 || !this.f7200) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        postOnAnimation(this.f7223);
        this.f7215 = true;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2530 interfaceC2530) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2519 abstractC2519 = this.f7193;
        if (abstractC2519 != null) {
            return abstractC2519.mo4605(layoutParams);
        }
        C5925.m11311("RecyclerView has no LayoutManager".concat(m4710()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.recyclerViewStyle);
    }
}
