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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.C0966;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.ui.platform.C1862;
import androidx.core.view.AbstractC2190;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2250;
import androidx.core.view.C2264;
import androidx.customview.view.AbsSavedState;
import io.ktor.util.C4210;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p141.AbstractC7535;
import p144.C7546;
import p168.InterfaceC7715;
import p175.AbstractC7738;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public static final C2524 f7172;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public static final Class[] f7173;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public static final InterpolatorC2465 f7174;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static boolean f7175 = false;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static boolean f7176 = false;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f7179;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f7180;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ArrayList f7181;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final AccessibilityManager f7182;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f7183;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f7184;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public int f7185;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f7186;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f7187;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f7188;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f7189;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f7190;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ArrayList f7191;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public AbstractC2519 f7192;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC2450 f7193;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final RectF f7194;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Rect f7195;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Rect f7196;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f7197;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f7198;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f7199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public InterfaceC2532 f7200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final ArrayList f7201;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f7202;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final int[] f7203;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final int[] f7204;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final int[] f7205;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public C2482 f7206;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final int[] f7207;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public C2250 f7208;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final C2454 f7209;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public final C2264 f7210;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public ArrayList f7211;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public AbstractC2533 f7212;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final C2454 f7213;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public boolean f7214;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public boolean f7215;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public boolean f7216;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public int f7217;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public boolean f7218;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final boolean f7219;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public int f7220;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final ArrayList f7221;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final RunnableC2455 f7222;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0191 f7223;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public SavedState f7224;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f7225;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final RunnableC2455 f7226;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2495 f7227;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2491 f7228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2526 f7229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2531 f7230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f7231;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int f7232;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int f7233;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public int f7234;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public VelocityTracker f7235;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f7236;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f7237;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public RunnableC2502 f7238;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final RunnableC2480 f7239;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final C2525 f7240;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final C0920 f7241;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final float f7242;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f7243;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final int f7244;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public AbstractC2516 f7245;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final float f7246;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final int f7247;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public int f7248;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public int f7249;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public EdgeEffect f7250;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public AbstractC2539 f7251;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public EdgeEffect f7252;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public AbstractC2536 f7253;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public EdgeEffect f7254;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public EdgeEffect f7255;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public static final int[] f7178 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public static final float f7177 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static final boolean f7171 = true;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public static final boolean f7170 = true;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2527();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public Parcelable f7256;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7256 = parcel.readParcelable(classLoader == null ? AbstractC2519.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f7256, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f7173 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f7174 = new InterpolatorC2465(2);
        f7172 = new C2524();
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
        this.f7229 = new C2526(this);
        this.f7230 = new C2531(this);
        C2491 c2491 = new C2491();
        c2491.f7455 = new C0283(0);
        c2491.f7454 = new C0263((Object) null);
        this.f7228 = c2491;
        this.f7226 = new RunnableC2455(this, 0);
        this.f7196 = new Rect();
        this.f7195 = new Rect();
        this.f7194 = new RectF();
        this.f7191 = new ArrayList();
        this.f7202 = new ArrayList();
        this.f7201 = new ArrayList();
        this.f7188 = 0;
        this.f7184 = false;
        this.f7183 = false;
        this.f7179 = 0;
        this.f7180 = 0;
        this.f7251 = f7172;
        C2505 c2505 = new C2505();
        c2505.f7642 = null;
        c2505.f7641 = new ArrayList();
        c2505.f7640 = 120L;
        c2505.f7639 = 120L;
        c2505.f7638 = 250L;
        c2505.f7637 = 250L;
        int i3 = 1;
        c2505.f7505 = true;
        c2505.f7504 = new ArrayList();
        c2505.f7508 = new ArrayList();
        c2505.f7509 = new ArrayList();
        c2505.f7506 = new ArrayList();
        c2505.f7507 = new ArrayList();
        c2505.f7499 = new ArrayList();
        c2505.f7498 = new ArrayList();
        c2505.f7502 = new ArrayList();
        c2505.f7503 = new ArrayList();
        c2505.f7500 = new ArrayList();
        c2505.f7501 = new ArrayList();
        this.f7253 = c2505;
        this.f7237 = 0;
        this.f7236 = -1;
        this.f7246 = Float.MIN_VALUE;
        this.f7242 = Float.MIN_VALUE;
        this.f7243 = true;
        this.f7239 = new RunnableC2480(this);
        this.f7241 = f7170 ? new C0920(2) : null;
        C2525 c2525 = new C2525();
        c2525.f7612 = -1;
        c2525.f7611 = 0;
        c2525.f7610 = 0;
        c2525.f7609 = 1;
        c2525.f7608 = 0;
        c2525.f7607 = false;
        c2525.f7616 = false;
        c2525.f7615 = false;
        c2525.f7619 = false;
        c2525.f7620 = false;
        c2525.f7617 = false;
        this.f7240 = c2525;
        this.f7215 = false;
        this.f7216 = false;
        C2454 c2454 = new C2454(this);
        this.f7213 = c2454;
        this.f7214 = false;
        this.f7205 = new int[2];
        this.f7207 = new int[2];
        this.f7203 = new int[2];
        this.f7204 = new int[2];
        this.f7221 = new ArrayList();
        this.f7222 = new RunnableC2455(this, i3);
        this.f7217 = 0;
        this.f7220 = 0;
        this.f7209 = new C2454(this);
        this.f7210 = new C2264(getContext(), new C2454(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7249 = viewConfiguration.getScaledTouchSlop();
        this.f7246 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f7242 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f7244 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7247 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7231 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f7253.f7642 = c2454;
        this.f7223 = new C0191(new C2454(this));
        this.f7227 = new C2495(new C2454(this));
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        if (AbstractC2190.m3985(this) == 0) {
            AbstractC2190.m3984(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f7182 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2482(this));
        int[] iArr = AbstractC7535.f20422;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC2270.m4233(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f7225 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                C5919.m11249("Trying to set fast scroller without both required drawables.".concat(m4700()));
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
        this.f7219 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
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
                        Constructor constructor2 = clsAsSubclass.getConstructor(f7173);
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
                    C0276.m845(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    C0276.m845(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    C0276.m845(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    C0276.m845(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    C0276.m845(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = f7178;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC2270.m4233(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(com.davemorrissey.labs.subscaleview.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private C2250 getScrollingChildHelper() {
        if (this.f7208 == null) {
            this.f7208 = new C2250(this);
        }
        return this.f7208;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f7175 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f7176 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static AbstractC2484 m4679(View view) {
        if (view == null) {
            return null;
        }
        return ((C2518) view.getLayoutParams()).f7578;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m4680(Rect rect, View view) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        Rect rect2 = c2518.f7576;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2518).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2518).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2518).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2518).bottomMargin);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static RecyclerView m4681(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM4681 = m4681(viewGroup.getChildAt(i));
            if (recyclerViewM4681 != null) {
                return recyclerViewM4681;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4685(AbstractC2484 abstractC2484) {
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
    public static int m4686(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC7738.m13046(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC7738.m13036(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC7738.m13046(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC7738.m13036(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            abstractC2519.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public void addOnChildAttachStateChangeListener(InterfaceC2517 interfaceC2517) {
        if (this.f7181 == null) {
            this.f7181 = new ArrayList();
        }
        this.f7181.add(interfaceC2517);
    }

    public void addOnItemTouchListener(InterfaceC2532 interfaceC2532) {
        this.f7201.add(interfaceC2532);
    }

    public void addOnScrollListener(AbstractC2533 abstractC2533) {
        if (this.f7211 == null) {
            this.f7211 = new ArrayList();
        }
        this.f7211.add(abstractC2533);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2518) && this.f7192.mo4608((C2518) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null && abstractC2519.mo4666()) {
            return this.f7192.mo4663(this.f7240);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null && abstractC2519.mo4666()) {
            return this.f7192.mo4606(this.f7240);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null && abstractC2519.mo4666()) {
            return this.f7192.mo4607(this.f7240);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null && abstractC2519.mo4665()) {
            return this.f7192.mo4635(this.f7240);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null && abstractC2519.mo4665()) {
            return this.f7192.mo4593(this.f7240);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null && abstractC2519.mo4665()) {
            return this.f7192.mo4592(this.f7240);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC2519 layoutManager = getLayoutManager();
        int iMo4784 = 0;
        if (layoutManager != null) {
            if (layoutManager.mo4665()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        m4738(0, measuredHeight, false);
                        return true;
                    }
                    m4738(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo4670 = layoutManager.mo4670();
                    if (keyCode == 122) {
                        if (zMo4670) {
                            iMo4784 = getAdapter().mo4784();
                        }
                    } else if (!zMo4670) {
                        iMo4784 = getAdapter().mo4784();
                    }
                    m4734(iMo4784);
                    return true;
                }
            } else if (layoutManager.mo4666()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        m4738(measuredWidth, 0, false);
                        return true;
                    }
                    m4738(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo46702 = layoutManager.mo4670();
                    if (keyCode2 == 122) {
                        if (zMo46702) {
                            iMo4784 = getAdapter().mo4784();
                        }
                    } else if (!zMo46702) {
                        iMo4784 = getAdapter().mo4784();
                    }
                    m4734(iMo4784);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m4197(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m4196(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4195(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m4194(i, i2, i3, i4, iArr, 0, null);
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
        ArrayList arrayList = this.f7202;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC2537) arrayList.get(i)).mo4877(canvas, this);
        }
        EdgeEffect edgeEffect = this.f7250;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f7225 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f7250;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f7254;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f7225) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f7254;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f7255;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f7225 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f7255;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f7252;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f7225) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f7252;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.f7253 == null || arrayList.size() <= 0 || !this.f7253.mo4957()) ? z : true) {
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
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            return abstractC2519.mo4591();
        }
        C5919.m11250("RecyclerView has no LayoutManager".concat(m4700()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            return abstractC2519.mo4596(getContext(), attributeSet);
        }
        C5919.m11250("RecyclerView has no LayoutManager".concat(m4700()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC2450 getAdapter() {
        return this.f7193;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2519 abstractC2519 = this.f7192;
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
        return this.f7225;
    }

    public C2482 getCompatAccessibilityDelegate() {
        return this.f7206;
    }

    public AbstractC2539 getEdgeEffectFactory() {
        return this.f7251;
    }

    public AbstractC2536 getItemAnimator() {
        return this.f7253;
    }

    public int getItemDecorationCount() {
        return this.f7202.size();
    }

    public AbstractC2519 getLayoutManager() {
        return this.f7192;
    }

    public int getMaxFlingVelocity() {
        return this.f7247;
    }

    public int getMinFlingVelocity() {
        return this.f7244;
    }

    public long getNanoTime() {
        if (f7170) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2516 getOnFlingListener() {
        return this.f7245;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f7243;
    }

    public C2528 getRecycledViewPool() {
        return this.f7230.m5022();
    }

    public int getScrollState() {
        return this.f7237;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m4192(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f7199;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f7190;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6553;
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
            r5.f7179 = r0
            r1 = 1
            r5.f7199 = r1
            boolean r2 = r5.f7197
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f7197 = r2
            androidx.recyclerview.widget.飘花落叶言子苏哲兰楪世 r2 = r5.f7230
            r2.m5020()
            androidx.recyclerview.widget.飘花落叶言子苏世哲楪兰 r2 = r5.f7192
            if (r2 == 0) goto L26
            r2.f7590 = r1
            r2.mo5006(r5)
        L26:
            r5.f7214 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f7170
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC2502.f7489
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r1 = (androidx.recyclerview.widget.RunnableC2502) r1
            r5.f7238 = r1
            if (r1 != 0) goto L66
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r1 = new androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲
            r1.<init>()
            r5.f7238 = r1
            java.util.WeakHashMap r1 = androidx.core.view.AbstractC2270.f6593
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
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r2 = r5.f7238
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7493 = r3
            r0.set(r2)
        L66:
            androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲 r0 = r5.f7238
            java.util.ArrayList r0 = r0.f7494
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f7175
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r5 = "RecyclerView already present in worker list!"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
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
        AbstractC2536 abstractC2536 = this.f7253;
        if (abstractC2536 != null) {
            abstractC2536.mo4958();
        }
        m4732();
        int i = 0;
        this.f7199 = false;
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            abstractC2519.f7590 = false;
            abstractC2519.mo4668(this);
        }
        this.f7221.clear();
        removeCallbacks(this.f7222);
        this.f7228.getClass();
        while (C2488.f7445.acquire() != null) {
        }
        C2531 c2531 = this.f7230;
        ArrayList arrayList = c2531.f7632;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC0455.m1148(((AbstractC2484) arrayList.get(i2)).itemView);
        }
        c2531.m5019(c2531.f7635.f7193, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = AbstractC0455.m1163(childAt).f20934;
            for (int iM13673 = AbstractC8189.m13673(arrayList2); -1 < iM13673; iM13673--) {
                ((C1862) ((InterfaceC7715) arrayList2.get(iM13673))).f5364.m3485();
            }
            i = i3;
        }
        if (!f7170 || (runnableC2502 = this.f7238) == null) {
            return;
        }
        boolean zRemove = runnableC2502.f7494.remove(this);
        if (!f7175 || zRemove) {
            this.f7238 = null;
        } else {
            C5919.m11250("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f7202;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2537) arrayList.get(i)).mo4878(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.f7192 != null && !this.f7190 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f = this.f7192.mo4665() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f7192.mo4666() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f7192.mo4665()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.f7192.mo4666()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.f7219;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f7242);
            int i3 = (int) (axisValue * this.f7246);
            if (z) {
                OverScroller overScroller = this.f7239.f7431;
                m4738((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                AbstractC2519 abstractC2519 = this.f7192;
                if (abstractC2519 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f7190) {
                    int[] iArr = this.f7204;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zMo4666 = abstractC2519.mo4666();
                    boolean zMo4665 = this.f7192.mo4665();
                    int i4 = zMo4665 ? (zMo4666 ? 1 : 0) | 2 : zMo4666 ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iM4727 = i3 - m4727(y, i3);
                    int iM4726 = i2 - m4726(x, i2);
                    getScrollingChildHelper().m4199(i4, 1);
                    if (m4713(zMo4666 ? iM4727 : 0, zMo4665 ? iM4726 : 0, 1, this.f7204, this.f7207)) {
                        iM4727 -= iArr[0];
                        iM4726 -= iArr[1];
                    }
                    m4741(zMo4666 ? iM4727 : 0, zMo4665 ? iM4726 : 0, motionEvent, 1);
                    RunnableC2502 runnableC2502 = this.f7238;
                    if (runnableC2502 != null && (iM4727 != 0 || iM4726 != 0)) {
                        runnableC2502.m4955(this, iM4727, iM4726);
                    }
                    m4733(1);
                }
            }
            if (i != 0 && !z) {
                this.f7210.m4214(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f7190) {
            this.f7200 = null;
            if (m4708(motionEvent)) {
                VelocityTracker velocityTracker = this.f7235;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                m4733(0);
                m4728();
                setScrollState(0);
                return true;
            }
            AbstractC2519 abstractC2519 = this.f7192;
            if (abstractC2519 != null) {
                boolean zMo4666 = abstractC2519.mo4666();
                boolean zMo4665 = this.f7192.mo4665();
                if (this.f7235 == null) {
                    this.f7235 = VelocityTracker.obtain();
                }
                this.f7235.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f7189) {
                        this.f7189 = false;
                    }
                    this.f7236 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f7232 = x;
                    this.f7234 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f7248 = y;
                    this.f7233 = y;
                    EdgeEffect edgeEffect = this.f7250;
                    if (edgeEffect == null || AbstractC7738.m13046(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC7738.m13036(this.f7250, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.f7255;
                    if (edgeEffect2 != null && AbstractC7738.m13046(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC7738.m13036(this.f7255, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.f7254;
                    if (edgeEffect3 != null && AbstractC7738.m13046(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC7738.m13036(this.f7254, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.f7252;
                    if (edgeEffect4 != null && AbstractC7738.m13046(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC7738.m13036(this.f7252, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.f7237 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m4733(1);
                    }
                    int[] iArr = this.f7203;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m4731(0);
                } else if (actionMasked == 1) {
                    this.f7235.clear();
                    m4733(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f7236);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f7236 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f7237 != 1) {
                        int i = x2 - this.f7234;
                        int i2 = y2 - this.f7233;
                        if (!zMo4666 || Math.abs(i) <= this.f7249) {
                            z2 = false;
                        } else {
                            this.f7232 = x2;
                            z2 = true;
                        }
                        if (zMo4665 && Math.abs(i2) > this.f7249) {
                            this.f7248 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f7235;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    m4733(0);
                    m4728();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f7236 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f7232 = x3;
                    this.f7234 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f7248 = y3;
                    this.f7233 = y3;
                } else if (actionMasked == 6) {
                    m4746(motionEvent);
                }
                if (this.f7237 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        m4711();
        Trace.endSection();
        this.f7197 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 == null) {
            m4719(i, i2);
            return;
        }
        boolean zMo4671 = abstractC2519.mo4671();
        boolean z = false;
        C2525 c2525 = this.f7240;
        if (zMo4671) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f7192.f7591.m4719(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f7218 = z;
            if (z || this.f7193 == null) {
                return;
            }
            if (c2525.f7609 == 1) {
                m4715();
            }
            this.f7192.m4999(i, i2);
            c2525.f7619 = true;
            m4716();
            this.f7192.m5001(i, i2);
            if (this.f7192.mo4658()) {
                this.f7192.m4999(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c2525.f7619 = true;
                m4716();
                this.f7192.m5001(i, i2);
            }
            this.f7217 = getMeasuredWidth();
            this.f7220 = getMeasuredHeight();
            return;
        }
        if (this.f7198) {
            this.f7192.f7591.m4719(i, i2);
            return;
        }
        if (this.f7186) {
            m4735();
            m4743();
            m4744();
            m4742(true);
            if (c2525.f7617) {
                c2525.f7616 = true;
            } else {
                this.f7223.m688();
                c2525.f7616 = false;
            }
            this.f7186 = false;
            m4730(false);
        } else if (c2525.f7617) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC2450 abstractC2450 = this.f7193;
        if (abstractC2450 != null) {
            c2525.f7608 = abstractC2450.mo4784();
        } else {
            c2525.f7608 = 0;
        }
        m4735();
        this.f7192.f7591.m4719(i, i2);
        m4730(false);
        c2525.f7616 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m4695()) {
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
        this.f7224 = savedState;
        super.onRestoreInstanceState(savedState.f6698);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f7224;
        if (savedState2 != null) {
            savedState.f7256 = savedState2.f7256;
            return savedState;
        }
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            savedState.f7256 = abstractC2519.mo4659();
            return savedState;
        }
        savedState.f7256 = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f7252 = null;
        this.f7254 = null;
        this.f7255 = null;
        this.f7250 = null;
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
        AbstractC2484 abstractC2484M4679 = m4679(view);
        if (abstractC2484M4679 != null) {
            if (abstractC2484M4679.isTmpDetached()) {
                abstractC2484M4679.clearTmpDetachFlag();
            } else if (!abstractC2484M4679.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(abstractC2484M4679);
                C4210.m8613(m4700(), sb);
                return;
            }
        } else if (f7175) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            C4210.m8613(m4700(), sb2);
            return;
        }
        view.clearAnimation();
        m4712(view);
        super.removeDetachedView(view, z);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC2517 interfaceC2517) {
        ArrayList arrayList = this.f7181;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC2517);
    }

    public void removeOnItemTouchListener(InterfaceC2532 interfaceC2532) {
        this.f7201.remove(interfaceC2532);
        if (this.f7200 == interfaceC2532) {
            this.f7200 = null;
        }
    }

    public void removeOnScrollListener(AbstractC2533 abstractC2533) {
        ArrayList arrayList = this.f7211;
        if (arrayList != null) {
            arrayList.remove(abstractC2533);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C2459 c2459 = this.f7192.f7585;
        if ((c2459 == null || !c2459.f7312) && !m4695() && view2 != null) {
            m4740(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f7192.mo4992(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f7201;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2532) arrayList.get(i)).mo4860(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f7188 != 0 || this.f7190) {
            this.f7187 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f7190) {
            return;
        }
        boolean zMo4666 = abstractC2519.mo4666();
        boolean zMo4665 = this.f7192.mo4665();
        if (zMo4666 || zMo4665) {
            if (!zMo4666) {
                i = 0;
            }
            if (!zMo4665) {
                i2 = 0;
            }
            m4741(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m4695()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f7185 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C2482 c2482) {
        this.f7206 = c2482;
        AbstractC2270.m4234(this, c2482);
    }

    public void setAdapter(AbstractC2450 abstractC2450) {
        setLayoutFrozen(false);
        AbstractC2450 abstractC24502 = this.f7193;
        C2526 c2526 = this.f7229;
        if (abstractC24502 != null) {
            abstractC24502.f7297.unregisterObserver(c2526);
            this.f7193.mo4787(this);
        }
        AbstractC2536 abstractC2536 = this.f7253;
        if (abstractC2536 != null) {
            abstractC2536.mo4958();
        }
        AbstractC2519 abstractC2519 = this.f7192;
        C2531 c2531 = this.f7230;
        if (abstractC2519 != null) {
            abstractC2519.m4997(c2531);
            this.f7192.m4990(c2531);
        }
        c2531.f7634.clear();
        c2531.m5028();
        C0191 c0191 = this.f7223;
        c0191.m667((ArrayList) c0191.f748);
        c0191.m667((ArrayList) c0191.f747);
        c0191.f750 = 0;
        AbstractC2450 abstractC24503 = this.f7193;
        this.f7193 = abstractC2450;
        if (abstractC2450 != null) {
            abstractC2450.f7297.registerObserver(c2526);
            abstractC2450.mo4798(this);
        }
        AbstractC2519 abstractC25192 = this.f7192;
        if (abstractC25192 != null) {
            abstractC25192.mo4774(this.f7193);
        }
        AbstractC2450 abstractC24504 = this.f7193;
        c2531.f7634.clear();
        c2531.m5028();
        c2531.m5019(abstractC24503, true);
        C2528 c2528M5022 = c2531.m5022();
        if (abstractC24503 != null) {
            c2528M5022.f7623--;
        }
        if (c2528M5022.f7623 == 0) {
            SparseArray sparseArray = c2528M5022.f7624;
            for (int i = 0; i < sparseArray.size(); i++) {
                C2529 c2529 = (C2529) sparseArray.valueAt(i);
                Iterator it = c2529.f7628.iterator();
                while (it.hasNext()) {
                    AbstractC0455.m1148(((AbstractC2484) it.next()).itemView);
                }
                c2529.f7628.clear();
            }
        }
        if (abstractC24504 != null) {
            c2528M5022.f7623++;
        }
        c2531.m5020();
        this.f7240.f7607 = true;
        m4745(false);
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
        if (z != this.f7225) {
            this.f7252 = null;
            this.f7254 = null;
            this.f7255 = null;
            this.f7250 = null;
        }
        this.f7225 = z;
        super.setClipToPadding(z);
        if (this.f7197) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC2539 abstractC2539) {
        abstractC2539.getClass();
        this.f7251 = abstractC2539;
        this.f7252 = null;
        this.f7254 = null;
        this.f7255 = null;
        this.f7250 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f7198 = z;
    }

    public void setItemAnimator(AbstractC2536 abstractC2536) {
        AbstractC2536 abstractC25362 = this.f7253;
        if (abstractC25362 != null) {
            abstractC25362.mo4958();
            this.f7253.f7642 = null;
        }
        this.f7253 = abstractC2536;
        if (abstractC2536 != null) {
            abstractC2536.f7642 = this.f7213;
        }
    }

    public void setItemViewCacheSize(int i) {
        C2531 c2531 = this.f7230;
        c2531.f7630 = i;
        c2531.m5025();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC2519 abstractC2519) {
        RecyclerView recyclerView;
        if (abstractC2519 == this.f7192) {
            return;
        }
        m4732();
        AbstractC2519 abstractC25192 = this.f7192;
        C2531 c2531 = this.f7230;
        if (abstractC25192 != null) {
            AbstractC2536 abstractC2536 = this.f7253;
            if (abstractC2536 != null) {
                abstractC2536.mo4958();
            }
            this.f7192.m4997(c2531);
            this.f7192.m4990(c2531);
            c2531.f7634.clear();
            c2531.m5028();
            if (this.f7199) {
                AbstractC2519 abstractC25193 = this.f7192;
                abstractC25193.f7590 = false;
                abstractC25193.mo4668(this);
            }
            this.f7192.m5000(null);
            this.f7192 = null;
        } else {
            c2531.f7634.clear();
            c2531.m5028();
        }
        C2495 c2495 = this.f7227;
        ((C2496) c2495.f7469).m4946();
        ArrayList arrayList = (ArrayList) c2495.f7468;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C2454) c2495.f7470).f7303;
            if (size < 0) {
                break;
            }
            AbstractC2484 abstractC2484M4679 = m4679((View) arrayList.get(size));
            if (abstractC2484M4679 != null) {
                abstractC2484M4679.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.m4712(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f7192 = abstractC2519;
        if (abstractC2519 != null) {
            if (abstractC2519.f7591 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC2519);
                C5553.m10819(sb, " is already attached to a RecyclerView:", abstractC2519.f7591.m4700());
                return;
            } else {
                abstractC2519.m5000(this);
                if (this.f7199) {
                    AbstractC2519 abstractC25194 = this.f7192;
                    abstractC25194.f7590 = true;
                    abstractC25194.mo5006(this);
                }
            }
        }
        c2531.m5025();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            C5919.m11249("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C2250 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f6553) {
            ViewGroup viewGroup = scrollingChildHelper.f6554;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f6553 = z;
    }

    public void setOnFlingListener(AbstractC2516 abstractC2516) {
        this.f7245 = abstractC2516;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2533 abstractC2533) {
        this.f7212 = abstractC2533;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f7243 = z;
    }

    public void setRecycledViewPool(C2528 c2528) {
        C2531 c2531 = this.f7230;
        RecyclerView recyclerView = c2531.f7635;
        c2531.m5019(recyclerView.f7193, false);
        if (c2531.f7636 != null) {
            r1.f7623--;
        }
        c2531.f7636 = c2528;
        if (c2528 != null && recyclerView.getAdapter() != null) {
            c2531.f7636.f7623++;
        }
        c2531.m5020();
    }

    public void setScrollState(int i) {
        C2459 c2459;
        if (i == this.f7237) {
            return;
        }
        if (f7176) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "setting scroll state to ", " from ");
            sbM148.append(this.f7237);
            Log.d("RecyclerView", sbM148.toString(), new Exception());
        }
        this.f7237 = i;
        if (i != 2) {
            RunnableC2480 runnableC2480 = this.f7239;
            runnableC2480.f7429.removeCallbacks(runnableC2480);
            runnableC2480.f7431.abortAnimation();
            AbstractC2519 abstractC2519 = this.f7192;
            if (abstractC2519 != null && (c2459 = abstractC2519.f7585) != null) {
                c2459.m4852();
            }
        }
        AbstractC2519 abstractC25192 = this.f7192;
        if (abstractC25192 != null) {
            abstractC25192.mo4773(i);
        }
        AbstractC2533 abstractC2533 = this.f7212;
        if (abstractC2533 != null) {
            abstractC2533.mo4889(this, i);
        }
        ArrayList arrayList = this.f7211;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2533) this.f7211.get(size)).mo4889(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f7249 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f7249 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC2481 abstractC2481) {
        this.f7230.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m4199(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m4198(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f7190) {
            m4722("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f7190 = true;
                this.f7189 = true;
                m4732();
                return;
            }
            this.f7190 = false;
            if (this.f7187 && this.f7192 != null && this.f7193 != null) {
                requestLayout();
            }
            this.f7187 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m4690() {
        C2495 c2495 = this.f7227;
        int iM4938 = c2495.m4938();
        for (int i = 0; i < iM4938; i++) {
            ((C2518) c2495.m4934(i).getLayoutParams()).f7577 = true;
        }
        ArrayList arrayList = this.f7230.f7632;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2518 c2518 = (C2518) ((AbstractC2484) arrayList.get(i2)).itemView.getLayoutParams();
            if (c2518 != null) {
                c2518.f7577 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m4691(int i, int i2, boolean z) {
        int i3 = i + i2;
        C2495 c2495 = this.f7227;
        int iM4938 = c2495.m4938();
        for (int i4 = 0; i4 < iM4938; i4++) {
            AbstractC2484 abstractC2484M4679 = m4679(c2495.m4934(i4));
            if (abstractC2484M4679 != null && !abstractC2484M4679.shouldIgnore()) {
                int i5 = abstractC2484M4679.mPosition;
                C2525 c2525 = this.f7240;
                if (i5 >= i3) {
                    if (f7176) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC2484M4679 + " now at position " + (abstractC2484M4679.mPosition - i2));
                    }
                    abstractC2484M4679.offsetPosition(-i2, z);
                    c2525.f7607 = true;
                } else if (i5 >= i) {
                    if (f7176) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + abstractC2484M4679 + " now REMOVED");
                    }
                    abstractC2484M4679.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    c2525.f7607 = true;
                }
            }
        }
        C2531 c2531 = this.f7230;
        ArrayList arrayList = c2531.f7632;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(size);
            if (abstractC2484 != null) {
                int i6 = abstractC2484.mPosition;
                if (i6 >= i3) {
                    if (f7176) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + abstractC2484 + " now at position " + (abstractC2484.mPosition - i2));
                    }
                    abstractC2484.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC2484.addFlags(8);
                    c2531.m5027(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m4692() {
        return !this.f7197 || this.f7184 || this.f7223.m666();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Rect m4693(View view) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        boolean z = c2518.f7577;
        Rect rect = c2518.f7576;
        if (z) {
            C2525 c2525 = this.f7240;
            if (!c2525.f7616 || (!c2518.f7578.isUpdated() && !c2518.f7578.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f7202;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.f7196;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC2537) arrayList.get(i)).mo4869(rect2, view, this, c2525);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                c2518.f7577 = false;
                return rect;
            }
        }
        return rect;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m4694(int i) {
        if (this.f7192 == null) {
            return;
        }
        setScrollState(2);
        this.f7192.mo4656(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean m4695() {
        return this.f7179 > 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int m4696(AbstractC2484 abstractC2484) {
        if (abstractC2484.hasAnyOfTheFlags(524) || !abstractC2484.isBound()) {
            return -1;
        }
        int i = abstractC2484.mPosition;
        ArrayList arrayList = (ArrayList) this.f7223.f748;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2497 c2497 = (C2497) arrayList.get(i2);
            int i3 = c2497.f7479;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c2497.f7478;
                    if (i4 <= i) {
                        int i5 = c2497.f7476;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c2497.f7478;
                    if (i6 == i) {
                        i = c2497.f7476;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c2497.f7476 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c2497.f7478 <= i) {
                i += c2497.f7476;
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
    public final boolean m4697(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4697(int, int, int, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final AbstractC2484 m4698(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4679(view);
        }
        C5553.m10817("View ", view, " is not a direct child of ", this);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long m4699(AbstractC2484 abstractC2484) {
        return this.f7193.f7296 ? abstractC2484.getItemId() : abstractC2484.mPosition;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m4700() {
        return " " + super.toString() + ", adapter:" + this.f7193 + ", layout:" + this.f7192 + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m4701() {
        if (this.f7254 != null) {
            return;
        }
        ((C2524) this.f7251).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7254 = edgeEffect;
        if (this.f7225) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m4702() {
        if (this.f7255 != null) {
            return;
        }
        ((C2524) this.f7251).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7255 = edgeEffect;
        if (this.f7225) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m4703() {
        if (this.f7250 != null) {
            return;
        }
        ((C2524) this.f7251).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7250 = edgeEffect;
        if (this.f7225) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m4704() {
        if (this.f7252 != null) {
            return;
        }
        ((C2524) this.f7251).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f7252 = edgeEffect;
        if (this.f7225) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m4705(int i, int i2) {
        this.f7180++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC2533 abstractC2533 = this.f7212;
        if (abstractC2533 != null) {
            abstractC2533.mo4888(this, i, i2);
        }
        ArrayList arrayList = this.f7211;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC2533) this.f7211.get(size)).mo4888(this, i, i2);
            }
        }
        this.f7180--;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final AbstractC2484 m4706(int i) {
        AbstractC2484 abstractC2484 = null;
        if (this.f7184) {
            return null;
        }
        C2495 c2495 = this.f7227;
        int iM4938 = c2495.m4938();
        for (int i2 = 0; i2 < iM4938; i2++) {
            AbstractC2484 abstractC2484M4679 = m4679(c2495.m4934(i2));
            if (abstractC2484M4679 != null && !abstractC2484M4679.isRemoved() && m4696(abstractC2484M4679) == i) {
                if (!((ArrayList) c2495.f7468).contains(abstractC2484M4679.itemView)) {
                    return abstractC2484M4679;
                }
                abstractC2484 = abstractC2484M4679;
            }
        }
        return abstractC2484;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m4707(int[] iArr) {
        C2495 c2495 = this.f7227;
        int iM4928 = c2495.m4928();
        if (iM4928 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM4928; i3++) {
            AbstractC2484 abstractC2484M4679 = m4679(c2495.m4929(i3));
            if (!abstractC2484M4679.shouldIgnore()) {
                int layoutPosition = abstractC2484M4679.getLayoutPosition();
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
    public final boolean m4708(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f7201;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2532 interfaceC2532 = (InterfaceC2532) arrayList.get(i);
            if (interfaceC2532.mo4861(motionEvent) && action != 3) {
                this.f7200 = interfaceC2532;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final View m4709(View view) {
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
    public final void m4710(C2525 c2525) {
        if (getScrollState() != 2) {
            c2525.getClass();
            return;
        }
        OverScroller overScroller = this.f7239.f7431;
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
    public final void m4711() {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4711():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m4712(View view) {
        AbstractC2484 abstractC2484M4679 = m4679(view);
        AbstractC2450 abstractC2450 = this.f7193;
        if (abstractC2450 != null && abstractC2484M4679 != null) {
            abstractC2450.mo4789(abstractC2484M4679);
        }
        ArrayList arrayList = this.f7181;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC2517) this.f7181.get(size)).mo4871(view);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m4713(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m4195(i, i2, i3, iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m4714(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m4194(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m4715() {
        C2488 c2488;
        View viewM4709;
        C2525 c2525 = this.f7240;
        c2525.m5016(1);
        m4710(c2525);
        c2525.f7619 = false;
        m4735();
        C2491 c2491 = this.f7228;
        C0283 c0283 = (C0283) c2491.f7455;
        C0283 c02832 = (C0283) c2491.f7455;
        c0283.clear();
        C0263 c0263 = (C0263) c2491.f7454;
        c0263.m826();
        m4743();
        m4744();
        AbstractC2484 abstractC2484M4698 = null;
        View focusedChild = (this.f7243 && hasFocus() && this.f7193 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewM4709 = m4709(focusedChild)) != null) {
            abstractC2484M4698 = m4698(viewM4709);
        }
        if (abstractC2484M4698 == null) {
            c2525.f7614 = -1L;
            c2525.f7618 = -1;
            c2525.f7613 = -1;
        } else {
            c2525.f7614 = this.f7193.f7296 ? abstractC2484M4698.getItemId() : -1L;
            c2525.f7618 = this.f7184 ? -1 : abstractC2484M4698.isRemoved() ? abstractC2484M4698.mOldPosition : abstractC2484M4698.getAbsoluteAdapterPosition();
            View focusedChild2 = abstractC2484M4698.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c2525.f7613 = id;
        }
        c2525.f7615 = c2525.f7620 && this.f7216;
        this.f7216 = false;
        this.f7215 = false;
        c2525.f7616 = c2525.f7617;
        c2525.f7608 = this.f7193.mo4784();
        m4707(this.f7205);
        boolean z = c2525.f7620;
        C2495 c2495 = this.f7227;
        if (z) {
            int iM4928 = c2495.m4928();
            for (int i = 0; i < iM4928; i++) {
                AbstractC2484 abstractC2484M4679 = m4679(c2495.m4929(i));
                if (!abstractC2484M4679.shouldIgnore() && (!abstractC2484M4679.isInvalid() || this.f7193.f7296)) {
                    AbstractC2536 abstractC2536 = this.f7253;
                    AbstractC2536.m5034(abstractC2484M4679);
                    abstractC2484M4679.getUnmodifiedPayloads();
                    abstractC2536.getClass();
                    C0966 c0966 = new C0966();
                    c0966.m1871(abstractC2484M4679);
                    C2488 c2488M4903 = (C2488) c02832.get(abstractC2484M4679);
                    if (c2488M4903 == null) {
                        c2488M4903 = C2488.m4903();
                        c02832.put(abstractC2484M4679, c2488M4903);
                    }
                    c2488M4903.f7447 = c0966;
                    c2488M4903.f7448 |= 4;
                    if (c2525.f7615 && abstractC2484M4679.isUpdated() && !abstractC2484M4679.isRemoved() && !abstractC2484M4679.shouldIgnore() && !abstractC2484M4679.isInvalid()) {
                        c0263.m822(abstractC2484M4679, m4699(abstractC2484M4679));
                    }
                }
            }
        }
        if (c2525.f7617) {
            int iM4938 = c2495.m4938();
            for (int i2 = 0; i2 < iM4938; i2++) {
                AbstractC2484 abstractC2484M46792 = m4679(c2495.m4934(i2));
                if (f7175 && abstractC2484M46792.mPosition == -1 && !abstractC2484M46792.isRemoved()) {
                    C5919.m11250("view holder cannot have position -1 unless it is removed".concat(m4700()));
                    return;
                } else {
                    if (!abstractC2484M46792.shouldIgnore()) {
                        abstractC2484M46792.saveOldPosition();
                    }
                }
            }
            boolean z2 = c2525.f7607;
            c2525.f7607 = false;
            this.f7192.mo4610(this.f7230, c2525);
            c2525.f7607 = z2;
            for (int i3 = 0; i3 < c2495.m4928(); i3++) {
                AbstractC2484 abstractC2484M46793 = m4679(c2495.m4929(i3));
                if (!abstractC2484M46793.shouldIgnore() && ((c2488 = (C2488) c02832.get(abstractC2484M46793)) == null || (c2488.f7448 & 4) == 0)) {
                    AbstractC2536.m5034(abstractC2484M46793);
                    boolean zHasAnyOfTheFlags = abstractC2484M46793.hasAnyOfTheFlags(8192);
                    AbstractC2536 abstractC25362 = this.f7253;
                    abstractC2484M46793.getUnmodifiedPayloads();
                    abstractC25362.getClass();
                    C0966 c09662 = new C0966();
                    c09662.m1871(abstractC2484M46793);
                    if (zHasAnyOfTheFlags) {
                        m4729(abstractC2484M46793, c09662);
                    } else {
                        C2488 c2488M49032 = (C2488) c02832.get(abstractC2484M46793);
                        if (c2488M49032 == null) {
                            c2488M49032 = C2488.m4903();
                            c02832.put(abstractC2484M46793, c2488M49032);
                        }
                        c2488M49032.f7448 |= 2;
                        c2488M49032.f7447 = c09662;
                    }
                }
            }
            m4717();
        } else {
            m4717();
        }
        m4742(true);
        m4730(false);
        c2525.f7609 = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m4716() {
        m4735();
        m4743();
        C2525 c2525 = this.f7240;
        c2525.m5016(6);
        this.f7223.m688();
        c2525.f7608 = this.f7193.mo4784();
        c2525.f7610 = 0;
        if (this.f7224 != null) {
            AbstractC2450 abstractC2450 = this.f7193;
            int iOrdinal = abstractC2450.f7295.ordinal();
            if (iOrdinal == 1 ? abstractC2450.mo4784() > 0 : iOrdinal != 2) {
                Parcelable parcelable = this.f7224.f7256;
                if (parcelable != null) {
                    this.f7192.mo4669(parcelable);
                }
                this.f7224 = null;
            }
        }
        c2525.f7616 = false;
        this.f7192.mo4610(this.f7230, c2525);
        c2525.f7607 = false;
        c2525.f7620 = c2525.f7620 && this.f7253 != null;
        c2525.f7609 = 4;
        m4742(true);
        m4730(false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4717() {
        C2495 c2495 = this.f7227;
        int iM4938 = c2495.m4938();
        for (int i = 0; i < iM4938; i++) {
            AbstractC2484 abstractC2484M4679 = m4679(c2495.m4934(i));
            if (!abstractC2484M4679.shouldIgnore()) {
                abstractC2484M4679.clearOldPosition();
            }
        }
        C2531 c2531 = this.f7230;
        ArrayList arrayList = c2531.f7634;
        ArrayList arrayList2 = c2531.f7632;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC2484) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC2484) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c2531.f7633;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC2484) c2531.f7633.get(i4)).clearOldPosition();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m4718() {
        if (!this.f7197 || this.f7184) {
            Trace.beginSection("RV FullInvalidate");
            m4711();
            Trace.endSection();
            return;
        }
        C0191 c0191 = this.f7223;
        if (c0191.m666()) {
            int i = c0191.f750;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (c0191.m666()) {
                    Trace.beginSection("RV FullInvalidate");
                    m4711();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            m4735();
            m4743();
            c0191.m669();
            if (!this.f7187) {
                C2495 c2495 = this.f7227;
                int iM4928 = c2495.m4928();
                int i2 = 0;
                while (true) {
                    if (i2 < iM4928) {
                        AbstractC2484 abstractC2484M4679 = m4679(c2495.m4929(i2));
                        if (abstractC2484M4679 != null && !abstractC2484M4679.shouldIgnore() && abstractC2484M4679.isUpdated()) {
                            m4711();
                            break;
                        }
                        i2++;
                    } else {
                        c0191.m691();
                        break;
                    }
                }
            }
            m4730(true);
            m4742(true);
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m4719(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        setMeasuredDimension(AbstractC2519.m4980(i, paddingRight, getMinimumWidth()), AbstractC2519.m4980(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m4720(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7250;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f7250.onRelease();
            zIsFinished = this.f7250.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f7255;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f7255.onRelease();
            zIsFinished |= this.f7255.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7254;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f7254.onRelease();
            zIsFinished |= this.f7254.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7252;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f7252.onRelease();
            zIsFinished |= this.f7252.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4721(AbstractC2537 abstractC2537) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            abstractC2519.mo4664("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f7202;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC2537);
        m4690();
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4722(String str) {
        if (!m4695()) {
            if (this.f7180 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(m4700()));
            }
        } else if (str == null) {
            C5919.m11250("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(m4700()));
        } else {
            C5919.m11250(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4723(AbstractC2484 abstractC2484) {
        View view = abstractC2484.itemView;
        boolean z = view.getParent() == this;
        this.f7230.m5026(m4698(view));
        boolean zIsTmpDetached = abstractC2484.isTmpDetached();
        C2495 c2495 = this.f7227;
        if (zIsTmpDetached) {
            c2495.m4931(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            c2495.m4932(view, -1, true);
            return;
        }
        int iIndexOfChild = ((C2454) c2495.f7470).f7303.indexOfChild(view);
        if (iIndexOfChild < 0) {
            C4210.m8614(view, "view is not a child, cannot hide ");
        } else {
            ((C2496) c2495.f7469).m4948(iIndexOfChild);
            c2495.m4939(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final void m4724() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount <= 0) {
            C7546.m12743(AbstractC6136.m11556(itemDecorationCount, "0 is an invalid index for size "));
            return;
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (itemDecorationCount2 > 0) {
            m4725((AbstractC2537) this.f7202.get(0));
        } else {
            C7546.m12743(AbstractC6136.m11556(itemDecorationCount2, "0 is an invalid index for size "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m4725(AbstractC2537 abstractC2537) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            abstractC2519.mo4664("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f7202;
        arrayList.remove(abstractC2537);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m4690();
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final int m4726(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f7254;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC7738.m13046(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7252;
            if (edgeEffect2 != null && AbstractC7738.m13046(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.f7252;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fM13036 = AbstractC7738.m13036(edgeEffect3, height, 1.0f - width);
                    if (AbstractC7738.m13046(this.f7252) == 0.0f) {
                        this.f7252.onRelease();
                    }
                    f2 = fM13036;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.f7254;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC7738.m13036(edgeEffect4, -height, width);
                if (AbstractC7738.m13046(this.f7254) == 0.0f) {
                    this.f7254.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final int m4727(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f7250;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC7738.m13046(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f7255;
            if (edgeEffect2 != null && AbstractC7738.m13046(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.f7255;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fM13036 = AbstractC7738.m13036(edgeEffect3, width, height);
                    if (AbstractC7738.m13046(this.f7255) == 0.0f) {
                        this.f7255.onRelease();
                    }
                    f2 = fM13036;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.f7250;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC7738.m13036(edgeEffect4, -width, 1.0f - height);
                if (AbstractC7738.m13046(this.f7250) == 0.0f) {
                    this.f7250.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m4728() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f7250;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f7250.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f7254;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f7254.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7255;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f7255.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7252;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f7252.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m4729(AbstractC2484 abstractC2484, C0966 c0966) {
        abstractC2484.setFlags(0, 8192);
        boolean z = this.f7240.f7615;
        C2491 c2491 = this.f7228;
        if (z && abstractC2484.isUpdated() && !abstractC2484.isRemoved() && !abstractC2484.shouldIgnore()) {
            ((C0263) c2491.f7454).m822(abstractC2484, m4699(abstractC2484));
        }
        C0283 c0283 = (C0283) c2491.f7455;
        C2488 c2488M4903 = (C2488) c0283.get(abstractC2484);
        if (c2488M4903 == null) {
            c2488M4903 = C2488.m4903();
            c0283.put(abstractC2484, c2488M4903);
        }
        c2488M4903.f7447 = c0966;
        c2488M4903.f7448 |= 4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m4730(boolean z) {
        if (this.f7188 < 1) {
            if (f7175) {
                C5919.m11250("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(m4700()));
                return;
            }
            this.f7188 = 1;
        }
        if (!z && !this.f7190) {
            this.f7187 = false;
        }
        if (this.f7188 == 1) {
            if (z && this.f7187 && !this.f7190 && this.f7192 != null && this.f7193 != null) {
                m4711();
            }
            if (!this.f7190) {
                this.f7187 = false;
            }
        }
        this.f7188--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m4731(int i) {
        boolean zMo4666 = this.f7192.mo4666();
        int i2 = zMo4666;
        if (this.f7192.mo4665()) {
            i2 = (zMo4666 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().m4199(i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void m4732() {
        C2459 c2459;
        setScrollState(0);
        RunnableC2480 runnableC2480 = this.f7239;
        runnableC2480.f7429.removeCallbacks(runnableC2480);
        runnableC2480.f7431.abortAnimation();
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 == null || (c2459 = abstractC2519.f7585) == null) {
            return;
        }
        c2459.m4852();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m4733(int i) {
        getScrollingChildHelper().m4198(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void m4734(int i) {
        if (this.f7190) {
            return;
        }
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2519.mo4657(this, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void m4735() {
        int i = this.f7188 + 1;
        this.f7188 = i;
        if (i != 1 || this.f7190) {
            return;
        }
        this.f7187 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m4736(int i) {
        if (this.f7190) {
            return;
        }
        m4732();
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC2519.mo4656(i);
            awakenScrollBars();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void m4737(int[] iArr, int i, int i2) {
        AbstractC2484 abstractC2484;
        m4735();
        m4743();
        Trace.beginSection("RV Scroll");
        C2525 c2525 = this.f7240;
        m4710(c2525);
        C2531 c2531 = this.f7230;
        int iMo4601 = i != 0 ? this.f7192.mo4601(i, c2531, c2525) : 0;
        int iMo4605 = i2 != 0 ? this.f7192.mo4605(i2, c2531, c2525) : 0;
        Trace.endSection();
        C2495 c2495 = this.f7227;
        int iM4928 = c2495.m4928();
        for (int i3 = 0; i3 < iM4928; i3++) {
            View viewM4929 = c2495.m4929(i3);
            AbstractC2484 abstractC2484M4698 = m4698(viewM4929);
            if (abstractC2484M4698 != null && (abstractC2484 = abstractC2484M4698.mShadowingHolder) != null) {
                View view = abstractC2484.itemView;
                int left = viewM4929.getLeft();
                int top2 = viewM4929.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
        m4742(true);
        m4730(false);
        if (iArr != null) {
            iArr[0] = iMo4601;
            iArr[1] = iMo4605;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m4738(int i, int i2, boolean z) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f7190) {
            return;
        }
        if (!abstractC2519.mo4666()) {
            i = 0;
        }
        if (!this.f7192.mo4665()) {
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
            getScrollingChildHelper().m4199(i3, 1);
        }
        this.f7239.m4885(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final boolean m4739(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM13046 = AbstractC7738.m13046(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f7231 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f7177;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM13046;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void m4740(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f7196;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2518) {
            C2518 c2518 = (C2518) layoutParams;
            if (!c2518.f7577) {
                Rect rect2 = c2518.f7576;
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
        this.f7192.mo4992(this, view, this.f7196, !this.f7197, view2 == null);
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
    public final boolean m4741(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4741(int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m4742(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f7179 - 1;
        this.f7179 = i2;
        if (i2 < 1) {
            if (f7175 && i2 < 0) {
                C5919.m11250("layout or scroll counter cannot go below zero.Some calls are not matching".concat(m4700()));
                return;
            }
            this.f7179 = 0;
            if (z) {
                int i3 = this.f7185;
                this.f7185 = 0;
                if (i3 != 0 && (accessibilityManager = this.f7182) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f7221;
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
    public final void m4743() {
        this.f7179++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m4744() {
        boolean z;
        boolean z2 = this.f7184;
        C0191 c0191 = this.f7223;
        boolean z3 = false;
        if (z2) {
            c0191.m667((ArrayList) c0191.f748);
            c0191.m667((ArrayList) c0191.f747);
            c0191.f750 = 0;
            if (this.f7183) {
                this.f7192.mo4617();
            }
        }
        if (this.f7253 != null && this.f7192.mo4602()) {
            c0191.m669();
        } else {
            c0191.m688();
        }
        boolean z4 = this.f7215 || this.f7216;
        boolean z5 = this.f7197 && this.f7253 != null && ((z = this.f7184) || z4 || this.f7192.f7589) && (!z || this.f7193.f7296);
        C2525 c2525 = this.f7240;
        c2525.f7620 = z5;
        if (z5 && z4 && !this.f7184 && this.f7253 != null && this.f7192.mo4602()) {
            z3 = true;
        }
        c2525.f7617 = z3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m4745(boolean z) {
        this.f7183 = z | this.f7183;
        this.f7184 = true;
        C2495 c2495 = this.f7227;
        int iM4938 = c2495.m4938();
        for (int i = 0; i < iM4938; i++) {
            AbstractC2484 abstractC2484M4679 = m4679(c2495.m4934(i));
            if (abstractC2484M4679 != null && !abstractC2484M4679.shouldIgnore()) {
                abstractC2484M4679.addFlags(6);
            }
        }
        m4690();
        C2531 c2531 = this.f7230;
        ArrayList arrayList = c2531.f7632;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(i2);
            if (abstractC2484 != null) {
                abstractC2484.addFlags(6);
                abstractC2484.addChangePayload(null);
            }
        }
        AbstractC2450 abstractC2450 = c2531.f7635.f7193;
        if (abstractC2450 == null || !abstractC2450.f7296) {
            c2531.m5028();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m4746(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7236) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f7236 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f7232 = x;
            this.f7234 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f7248 = y;
            this.f7233 = y;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m4747() {
        if (this.f7214 || !this.f7199) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        postOnAnimation(this.f7222);
        this.f7214 = true;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2530 interfaceC2530) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2519 abstractC2519 = this.f7192;
        if (abstractC2519 != null) {
            return abstractC2519.mo4595(layoutParams);
        }
        C5919.m11250("RecyclerView has no LayoutManager".concat(m4700()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.recyclerViewStyle);
    }
}
