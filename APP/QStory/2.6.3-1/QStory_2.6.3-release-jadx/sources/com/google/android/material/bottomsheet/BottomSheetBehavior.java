package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0954;
import androidx.appcompat.widget.RunnableC1076;
import androidx.compose.p001ui.platform.C2743;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC3022;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.C3079;
import androidx.core.view.C3080;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.C3990;
import com.google.android.material.internal.ViewOnAttachStateChangeListenerC3989;
import com.google.android.material.textfield.C4009;
import com.google.protobuf.DescriptorProtos$Edition;
import com.lxj.xpopup.widget.C4626;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import net.bytebuddy.jar.asm.Opcodes;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p171.C8439;
import p185.C8546;
import p191.AbstractC8568;
import p217.AbstractC8705;
import p217.C8702;
import p319.C9442;
import p321.C9469;
import p321.C9472;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC8705 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final float f10365;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10366;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f10367;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C8546 f10368;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f10369;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f10370;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean f10371;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f10372;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f10373;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f10374;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f10375;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f10376;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f10377;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final ValueAnimator f10378;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C2743 f10379;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10380;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C9469 f10381;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f10382;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10383;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final float f10384;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f10385;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final float f10386;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10387;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f10390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f10391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f10392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f10393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f10395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f10396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f10399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f10400;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f10402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f10403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f10404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean f10405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f10406;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorStateList f10409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f10410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10411;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C9472 f10412;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final SparseIntArray f10413;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public HashMap f10414;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean f10415;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public WeakReference f10416;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f10417;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f10418;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C4626 f10419;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final Rect f10420;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final SparseIntArray f10421;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final SparseIntArray f10422;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f10423;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f10424;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final ArrayList f10425;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public VelocityTracker f10426;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WeakReference f10427;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final ArrayList f10428;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f10394 = 0;
        this.f10393 = true;
        this.f10410 = -1;
        this.f10402 = -1;
        this.f10379 = new C2743(this);
        this.f10386 = 0.5f;
        this.f10384 = -1.0f;
        this.f10373 = true;
        this.f10376 = true;
        this.f10371 = true;
        this.f10372 = 4;
        this.f10365 = 0.1f;
        this.f10428 = new ArrayList();
        this.f10425 = new ArrayList();
        this.f10417 = -1;
        this.f10413 = new SparseIntArray();
        this.f10421 = new SparseIntArray();
        this.f10422 = new SparseIntArray();
        this.f10420 = new Rect();
        this.f10419 = new C4626(this, 2);
        this.f10411 = context.getResources().getDimensionPixelSize(C0328R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24773);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10409 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f10381 = C9469.m14880(context, attributeSet, C0328R.attr.bottomSheetStyle, C0328R.style.Widget_Design_BottomSheet_Modal).m14878();
        }
        C9469 c9469 = this.f10381;
        if (c9469 != null) {
            C9472 c9472 = new C9472(c9469);
            this.f10412 = c9472;
            c9472.m14897(context);
            ColorStateList colorStateList = this.f10409;
            if (colorStateList != null) {
                this.f10412.m14900(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f10412.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m7587(), 1.0f);
        this.f10378 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f10378.addUpdateListener(new C4009(this, 7));
        this.f10384 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f10410 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f10402 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            m7573(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            m7573(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.f10383 != z) {
            this.f10383 = z;
            if (!z && this.f10372 == 5) {
                m7584(4);
            }
            m7580();
        }
        this.f10405 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f10393 != z2) {
            this.f10393 = z2;
            if (this.f10427 != null) {
                m7588();
            }
            m7583((this.f10393 && this.f10372 == 6) ? 3 : this.f10372);
            m7579(this.f10372, true);
            m7580();
        }
        this.f10374 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f10373 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f10376 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f10394 = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            C6755.m11869("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.f10386 = f;
        if (this.f10427 != null) {
            this.f10387 = (int) ((1.0f - f) * this.f10423);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                C6755.m11869("offset must be greater than or equal to 0");
                throw null;
            }
            this.f10377 = dimensionPixelOffset;
            m7579(this.f10372, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                C6755.m11869("offset must be greater than or equal to 0");
                throw null;
            }
            this.f10377 = i2;
            m7579(this.f10372, true);
        }
        this.f10391 = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.f10390 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f10371 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f10406 = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f10403 = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.f10404 = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.f10396 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.f10395 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f10399 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f10400 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f10382 = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f10392 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static View m7569(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewM7569 = m7569(viewGroup.getChildAt(i));
            if (viewM7569 != null) {
                return viewM7569;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static int m7570(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7571() {
        View view;
        if (this.f10427 != null) {
            m7588();
            if (this.f10372 != 4 || (view = (View) this.f10427.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7572(boolean z) {
        WeakReference weakReference = this.f10427;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f10414 != null) {
                    return;
                } else {
                    this.f10414 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f10427.get() && z) {
                    this.f10414.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f10414 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m7573(int i) {
        boolean z = this.f10408;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f10408 = true;
            }
        } else {
            if (!z && this.f10389 == i) {
                return;
            }
            this.f10408 = false;
            this.f10389 = Math.max(0, i);
        }
        m7571();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m7574(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f10428.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m7574(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m7575(View view) {
        Iterator it = this.f10428.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m7576() {
        WeakReference weakReference = this.f10427;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f10427.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int m7577(int i) {
        if (i == 3) {
            return m7578();
        }
        if (i == 4) {
            return this.f10385;
        }
        if (i == 5) {
            return this.f10423;
        }
        if (i == 6) {
            return this.f10387;
        }
        C6755.m11869(AbstractC7012.m12147(i, "Invalid state to get top offset: "));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int m7578() {
        if (this.f10393) {
            return this.f10388;
        }
        return Math.max(this.f10377, this.f10396 ? 0 : this.f10398);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m7579(int i, boolean z) {
        C9472 c9472;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f10372 == 3 && (this.f10382 || m7576());
        if (this.f10380 == z2 || (c9472 = this.f10412) == null) {
            return;
        }
        this.f10380 = z2;
        ValueAnimator valueAnimator = this.f10378;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c9472.m14892(this.f10380 ? m7587() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c9472.f24669.f24637, z2 ? m7587() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m7580() {
        View view;
        WeakReference weakReference = this.f10427;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC3103.m4808(view, 1048576);
        AbstractC3103.m4809(view, 0);
        AbstractC3103.m4808(view, Opcodes.ASM8);
        AbstractC3103.m4809(view, 0);
        AbstractC3103.m4808(view, 262144);
        AbstractC3103.m4809(view, 0);
        SparseIntArray sparseIntArray = this.f10421;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC3103.m4808(view, i);
            AbstractC3103.m4809(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f10413;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            AbstractC3103.m4808(view, i2);
            AbstractC3103.m4809(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f10422;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            AbstractC3103.m4808(view, i3);
            AbstractC3103.m4809(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f10393 && this.f10372 != 6) {
            sparseIntArray2.put(0, m7591(view, C0328R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f10383) {
            int i4 = 5;
            if (this.f10372 != 5) {
                AbstractC3103.m4799(view, C8439.f20985, new C0954(this, i4, 13));
            }
        }
        int i5 = this.f10372;
        if (i5 == 3) {
            if (this.f10374 && this.f10383) {
                return;
            }
            sparseIntArray3.put(0, m7591(view, C0328R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i5 == 4) {
            sparseIntArray.put(0, m7591(view, C0328R.string.bottomsheet_action_expand, 3));
        } else {
            if (i5 != 6) {
                return;
            }
            if (!this.f10374 || !this.f10383) {
                sparseIntArray3.put(0, m7591(view, C0328R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, m7591(view, C0328R.string.bottomsheet_action_expand, 3));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m7581(View view, int i, boolean z) {
        int iM7577 = m7577(i);
        C8546 c8546 = this.f10368;
        if (c8546 == null || (!z ? c8546.m13587(view, view.getLeft(), iM7577) : c8546.m13583(view.getLeft(), iM7577))) {
            m7583(i);
            return;
        }
        m7583(2);
        m7579(i, true);
        this.f10379.m4166(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m7582(View view, float f) {
        if (this.f10374) {
            return true;
        }
        if (view.getTop() < this.f10385) {
            return false;
        }
        return Math.abs(((f * this.f10365) + ((float) view.getTop())) - ((float) this.f10385)) / ((float) m7589()) > 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m7583(int i) {
        if (this.f10372 == i) {
            return;
        }
        this.f10372 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f10383;
        }
        WeakReference weakReference = this.f10427;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m7572(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m7572(false);
        }
        m7579(i, true);
        ArrayList arrayList = this.f10425;
        if (arrayList.size() <= 0) {
            m7580();
        } else {
            arrayList.get(0).getClass();
            C3775.m6954();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m7584(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0900.m711(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f10383 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f10393 && m7577(i) <= this.f10388) ? 3 : i;
        WeakReference weakReference = this.f10427;
        if (weakReference == null || weakReference.get() == null) {
            m7583(i);
            return;
        }
        View view = (View) this.f10427.get();
        RunnableC1076 runnableC1076 = new RunnableC1076(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnableC1076);
        } else {
            runnableC1076.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo7566(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        C8546 c8546;
        if (!view.isShown() || !this.f10373) {
            this.f10367 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10418 = -1;
            this.f10417 = -1;
            this.f10416 = null;
            VelocityTracker velocityTracker = this.f10426;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10426 = null;
            }
        }
        if (this.f10426 == null) {
            this.f10426 = VelocityTracker.obtain();
        }
        this.f10426.addMovement(motionEvent);
        ArrayList arrayList = this.f10428;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f10417 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (arrayList.isEmpty()) {
                view2 = null;
                WeakReference weakReference = new WeakReference(view2);
                this.f10416 = weakReference;
                if (this.f10372 != 2 && weakReference.get() != null) {
                    this.f10418 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f10415 = true;
                }
                this.f10367 = (this.f10418 == -1 || coordinatorLayout.m4501(view, x, this.f10417)) ? false : true;
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.m4501(view2, x2, y)) {
                        break;
                    }
                }
                view2 = null;
                WeakReference weakReference2 = new WeakReference(view2);
                this.f10416 = weakReference2;
                if (this.f10372 != 2) {
                    this.f10418 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f10415 = true;
                }
                if (this.f10418 == -1) {
                    this.f10367 = (this.f10418 == -1 || coordinatorLayout.m4501(view, x, this.f10417)) ? false : true;
                }
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10415 = false;
            this.f10416 = null;
            this.f10418 = -1;
            if (this.f10367) {
                this.f10367 = false;
                return false;
            }
        }
        if (this.f10367 || (c8546 = this.f10368) == null || !c8546.m13586(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.f10367 && this.f10372 != 1) {
                            if (this.f10390) {
                                WeakReference weakReference3 = this.f10416;
                                if (weakReference3 == null || weakReference3.get() == null) {
                                    if (this.f10368 == null || (i = this.f10417) == -1 || Math.abs(i - motionEvent.getY()) <= this.f10368.f21280) {
                                        break;
                                    }
                                }
                            } else {
                                View view3 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view3 == null || !coordinatorLayout.m4501(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo7585() {
        this.f10427 = null;
        this.f10368 = null;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7586(C8702 c8702) {
        this.f10427 = null;
        this.f10368 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m7587() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        C9472 c9472 = this.f10412;
        if (c9472 != null && (weakReference = this.f10427) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f10427.get();
            if (m7576() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fM14905 = c9472.m14905();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f = (radius <= 0.0f || fM14905 <= 0.0f) ? 0.0f : radius / fM14905;
                }
                float[] fArr = c9472.f24643;
                float fMo14871 = fArr != null ? fArr[0] : c9472.f24669.f24628.mo14851().f24611.mo14871(c9472.m14904());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo14871 > 0.0f) {
                        f2 = radius2 / fMo14871;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7588() {
        int iM7589 = m7589();
        boolean z = this.f10393;
        int i = this.f10423;
        if (z) {
            this.f10385 = Math.max(i - iM7589, this.f10388);
        } else {
            this.f10385 = i - iM7589;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int m7589() {
        int iMin;
        int i;
        int i2;
        if (this.f10408) {
            iMin = Math.min(Math.max(this.f10407, this.f10423 - ((this.f10424 * 9) / 16)), this.f10366);
            i = this.f10397;
        } else {
            if (!this.f10405 && !this.f10406 && (i2 = this.f10401) > 0) {
                return Math.max(this.f10389, i2 + this.f10411);
            }
            iMin = this.f10389;
            i = this.f10397;
        }
        return iMin + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7590(int i) {
        if (((View) this.f10427.get()) != null) {
            ArrayList arrayList = this.f10425;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f10385;
            if (i <= i2 && i2 != m7578()) {
                m7578();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            C3775.m6954();
        }
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Parcelable mo7547(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7548(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f10394;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f10389 = savedState.f10430;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f10393 = savedState.f10429;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f10383 = savedState.f10431;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f10374 = savedState.f10432;
            }
        }
        int i2 = savedState.f10433;
        if (i2 == 1 || i2 == 2) {
            this.f10372 = 4;
        } else {
            this.f10372 = i2;
        }
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7567(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f10372;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C8546 c8546 = this.f10368;
        boolean z = this.f10373;
        if (c8546 != null && (z || i == 1)) {
            c8546.m13592(motionEvent);
        }
        if (actionMasked == 0) {
            this.f10418 = -1;
            this.f10417 = -1;
            this.f10416 = null;
            VelocityTracker velocityTracker = this.f10426;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10426 = null;
            }
        }
        if (this.f10426 == null) {
            this.f10426 = VelocityTracker.obtain();
        }
        this.f10426.addMovement(motionEvent);
        if (this.f10368 != null && ((z || this.f10372 == 1) && actionMasked == 2 && !this.f10367)) {
            float fAbs = Math.abs(this.f10417 - motionEvent.getY());
            C8546 c85462 = this.f10368;
            if (fAbs > c85462.f21280) {
                c85462.m13581(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10367;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m7591(View view, int i, int i2) {
        int iM13408;
        String string = view.getResources().getString(i);
        C0954 c0954 = new C0954(this, i2, 13);
        ArrayList arrayListM4806 = AbstractC3103.m4806(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListM4806.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = AbstractC3103.f6936;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListM4806.size(); i7++) {
                        z &= ((C8439) arrayListM4806.get(i7)).m13408() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iM13408 = i5;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C8439) arrayListM4806.get(i3)).f20992).getLabel())) {
                    iM13408 = ((C8439) arrayListM4806.get(i3)).m13408();
                    break;
                }
                i3++;
            }
        }
        if (iM13408 != -1) {
            C8439 c8439 = new C8439(null, iM13408, string, c0954, null);
            View.AccessibilityDelegate accessibilityDelegateM4794 = AbstractC3103.m4794(view);
            C3079 c3079 = accessibilityDelegateM4794 == null ? null : accessibilityDelegateM4794 instanceof C3080 ? ((C3080) accessibilityDelegateM4794).f6893 : new C3079(accessibilityDelegateM4794);
            if (c3079 == null) {
                c3079 = new C3079();
            }
            AbstractC3103.m4804(view, c3079);
            AbstractC3103.m4808(view, c8439.m13408());
            AbstractC3103.m4806(view).add(c8439);
            AbstractC3103.m4809(view, 0);
        }
        return iM13408;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo7549(View view, int i, int i2) {
        this.f10370 = 0;
        this.f10369 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7550(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == m7578()) {
            m7583(3);
            return;
        }
        if (m7575(view2) && this.f10369) {
            if (this.f10370 > 0) {
                if (!this.f10393 && view.getTop() > this.f10387) {
                    i2 = 6;
                }
            } else if (this.f10383) {
                VelocityTracker velocityTracker = this.f10426;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(DescriptorProtos$Edition.EDITION_2023_VALUE, this.f10392);
                    yVelocity = this.f10426.getYVelocity(this.f10418);
                }
                if (m7582(view, yVelocity)) {
                    i2 = 5;
                }
            } else if (this.f10370 == 0) {
                int top2 = view.getTop();
                if (!this.f10393) {
                    int i3 = this.f10387;
                    if (top2 < i3) {
                        if (top2 >= Math.abs(top2 - this.f10385)) {
                        }
                    } else if (Math.abs(top2 - i3) < Math.abs(top2 - this.f10385)) {
                    }
                    i2 = 6;
                } else if (Math.abs(top2 - this.f10388) >= Math.abs(top2 - this.f10385)) {
                    i2 = 4;
                }
            } else {
                if (!this.f10393) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - this.f10387) < Math.abs(top3 - this.f10385)) {
                    }
                }
                i2 = 4;
            }
            m7581(view, i2, false);
            this.f10369 = false;
        }
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7551(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m7570(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f10410, marginLayoutParams.width), m7570(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f10402, marginLayoutParams.height));
        return true;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7552(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 6;
        if (this.f10427 == null) {
            this.f10407 = coordinatorLayout.getResources().getDimensionPixelSize(C0328R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f10405 || this.f10408) ? false : true;
            if (this.f10406 || this.f10403 || this.f10404 || this.f10395 || this.f10399 || this.f10400 || z) {
                C0911 c0911 = new C0911(this, i2, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C3990 c3990 = new C3990();
                c3990.f10857 = paddingStart;
                c3990.f10856 = paddingEnd;
                c3990.f10855 = paddingBottom;
                C0923 c0923 = new C0923(c0911, 18, c3990);
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                AbstractC3026.m4564(view, c0923);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3989());
                }
            }
            AbstractC3103.m4802(view, new C9442(view));
            this.f10427 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC7176.m12481(context, C0328R.attr.motionDurationMedium2, 300);
            AbstractC7176.m12481(context, C0328R.attr.motionDurationShort3, 150);
            AbstractC7176.m12481(context, C0328R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C0328R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(C0328R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C9472 c9472 = this.f10412;
            if (c9472 != null) {
                view.setBackground(c9472);
                float elevation = this.f10384;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c9472.m14899(elevation);
            } else {
                ColorStateList colorStateList = this.f10409;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m7580();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f10368 == null) {
            this.f10368 = new C8546(coordinatorLayout.getContext(), coordinatorLayout, this.f10419);
        }
        int top2 = view.getTop();
        coordinatorLayout.m4499(view, i);
        this.f10424 = coordinatorLayout.getWidth();
        this.f10423 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f10366 = height;
        int iMin = this.f10423;
        int i3 = iMin - height;
        int i4 = this.f10398;
        if (i3 < i4) {
            boolean z2 = this.f10396;
            int i5 = this.f10402;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f10366 = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.f10366 = iMin2;
            }
        }
        this.f10388 = Math.max(0, this.f10423 - this.f10366);
        this.f10387 = (int) ((1.0f - this.f10386) * this.f10423);
        m7588();
        int i6 = this.f10372;
        if (i6 == 3) {
            int iM7578 = m7578();
            WeakHashMap weakHashMap2 = AbstractC3103.f6939;
            view.offsetTopAndBottom(iM7578);
        } else if (i6 == 6) {
            int i7 = this.f10387;
            WeakHashMap weakHashMap3 = AbstractC3103.f6939;
            view.offsetTopAndBottom(i7);
        } else if (this.f10383 && i6 == 5) {
            int i8 = this.f10423;
            WeakHashMap weakHashMap4 = AbstractC3103.f6939;
            view.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.f10385;
            WeakHashMap weakHashMap5 = AbstractC3103.f6939;
            view.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top3 = top2 - view.getTop();
            WeakHashMap weakHashMap6 = AbstractC3103.f6939;
            view.offsetTopAndBottom(top3);
        }
        m7579(this.f10372, false);
        ArrayList arrayList = this.f10428;
        arrayList.clear();
        if (this.f10390) {
            m7574(view);
        } else {
            arrayList.add(new WeakReference(m7569(view)));
        }
        ArrayList arrayList2 = this.f10425;
        if (arrayList2.size() <= 0) {
            return true;
        }
        arrayList2.get(0).getClass();
        C3775.m6954();
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo7559(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.f10371 || view.isInTouchMode()) {
            return false;
        }
        int i = this.f10372;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.f10420;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            C3058 c3058M4553 = AbstractC3022.m4553(view);
            if (c3058M4553 != null) {
                rect2.bottom -= c3058M4553.f6866.mo4612(519).f21152;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        m7584(3);
        return true;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo7592(View view) {
        Iterator it = this.f10428.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((WeakReference) it.next()).get() != null) {
                if (!m7575(view) || this.f10372 == 3 || this.f10375) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7554(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean zM7575;
        if (i3 != 1 && (zM7575 = m7575(view2))) {
            int top2 = view.getTop();
            int i4 = top2 - i2;
            boolean z = this.f10373;
            boolean z2 = this.f10376;
            if (i2 > 0) {
                if (!this.f10369 && !z2 && zM7575 && view2.canScrollVertically(1)) {
                    this.f10375 = true;
                    return;
                }
                if (i4 < m7578()) {
                    int iM7578 = top2 - m7578();
                    iArr[1] = iM7578;
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    view.offsetTopAndBottom(-iM7578);
                    m7583(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                    view.offsetTopAndBottom(-i2);
                    m7583(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f10369 && !z2 && zM7575 && zCanScrollVertically) {
                    this.f10375 = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.f10385;
                    if (i4 > i5 && !this.f10383) {
                        int i6 = top2 - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = AbstractC3103.f6939;
                        view.offsetTopAndBottom(-i6);
                        m7583(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = AbstractC3103.f6939;
                        view.offsetTopAndBottom(-i2);
                        m7583(1);
                    }
                }
            }
            m7590(view.getTop());
            this.f10370 = i2;
            this.f10369 = true;
            this.f10375 = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3923();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public final boolean f10429;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public final int f10430;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public final boolean f10431;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public final boolean f10432;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final int f10433;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10433 = parcel.readInt();
            this.f10430 = parcel.readInt();
            this.f10429 = parcel.readInt() == 1;
            this.f10431 = parcel.readInt() == 1;
            this.f10432 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10433);
            parcel.writeInt(this.f10430);
            parcel.writeInt(this.f10429 ? 1 : 0);
            parcel.writeInt(this.f10431 ? 1 : 0);
            parcel.writeInt(this.f10432 ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f10433 = bottomSheetBehavior.f10372;
            this.f10430 = bottomSheetBehavior.f10389;
            this.f10429 = bottomSheetBehavior.f10393;
            this.f10431 = bottomSheetBehavior.f10383;
            this.f10432 = bottomSheetBehavior.f10374;
        }
    }

    public BottomSheetBehavior() {
        this.f10394 = 0;
        this.f10393 = true;
        this.f10410 = -1;
        this.f10402 = -1;
        this.f10379 = new C2743(this);
        this.f10386 = 0.5f;
        this.f10384 = -1.0f;
        this.f10373 = true;
        this.f10376 = true;
        this.f10371 = true;
        this.f10372 = 4;
        this.f10365 = 0.1f;
        this.f10428 = new ArrayList();
        this.f10425 = new ArrayList();
        this.f10417 = -1;
        this.f10413 = new SparseIntArray();
        this.f10421 = new SparseIntArray();
        this.f10422 = new SparseIntArray();
        this.f10420 = new Rect();
        this.f10419 = new C4626(this, 2);
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7553(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
