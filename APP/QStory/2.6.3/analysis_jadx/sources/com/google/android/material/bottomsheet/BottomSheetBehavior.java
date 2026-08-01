package com.google.android.material.bottomsheet;

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
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0107;
import androidx.appcompat.widget.RunnableC0229;
import androidx.compose.ui.platform.C1908;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2189;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.C2246;
import androidx.core.view.C2247;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.C3158;
import com.google.android.material.internal.ViewOnAttachStateChangeListenerC3157;
import com.google.android.material.textfield.C3177;
import com.lxj.xpopup.widget.C3794;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import net.bytebuddy.jar.asm.Opcodes;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p155.C7610;
import p169.C7717;
import p175.AbstractC7739;
import p201.AbstractC7876;
import p201.C7873;
import p303.C8613;
import p305.C8640;
import p305.C8643;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC7876 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final float f10020;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10021;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f10022;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C7717 f10023;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f10024;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f10025;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean f10026;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f10027;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f10028;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f10029;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f10030;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f10031;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f10032;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final ValueAnimator f10033;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1908 f10034;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10035;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C8640 f10036;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f10037;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10038;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final float f10039;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f10040;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final float f10041;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10042;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f10045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f10046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f10047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f10048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f10050;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f10051;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10053;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f10054;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f10055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10056;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f10057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f10058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f10059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean f10060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f10061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorStateList f10064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f10065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10066;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8643 f10067;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final SparseIntArray f10068;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public HashMap f10069;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean f10070;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public WeakReference f10071;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f10072;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f10073;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C3794 f10074;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final Rect f10075;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final SparseIntArray f10076;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final SparseIntArray f10077;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f10078;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f10079;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final ArrayList f10080;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public VelocityTracker f10081;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WeakReference f10082;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final ArrayList f10083;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f10049 = 0;
        this.f10048 = true;
        this.f10065 = -1;
        this.f10057 = -1;
        this.f10034 = new C1908(this);
        this.f10041 = 0.5f;
        this.f10039 = -1.0f;
        this.f10028 = true;
        this.f10031 = true;
        this.f10026 = true;
        this.f10027 = 4;
        this.f10020 = 0.1f;
        this.f10083 = new ArrayList();
        this.f10080 = new ArrayList();
        this.f10072 = -1;
        this.f10068 = new SparseIntArray();
        this.f10076 = new SparseIntArray();
        this.f10077 = new SparseIntArray();
        this.f10075 = new Rect();
        this.f10074 = new C3794(this, 2);
        this.f10066 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8661.f24428);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10064 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f10036 = C8640.m14321(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m14319();
        }
        C8640 c8640 = this.f10036;
        if (c8640 != null) {
            C8643 c8643 = new C8643(c8640);
            this.f10067 = c8643;
            c8643.m14338(context);
            ColorStateList colorStateList = this.f10064;
            if (colorStateList != null) {
                this.f10067.m14341(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f10067.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m7028(), 1.0f);
        this.f10033 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f10033.addUpdateListener(new C3177(this, 7));
        this.f10039 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f10065 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f10057 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            m7014(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            m7014(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.f10038 != z) {
            this.f10038 = z;
            if (!z && this.f10027 == 5) {
                m7025(4);
            }
            m7021();
        }
        this.f10060 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f10048 != z2) {
            this.f10048 = z2;
            if (this.f10082 != null) {
                m7029();
            }
            m7024((this.f10048 && this.f10027 == 6) ? 3 : this.f10027);
            m7020(this.f10027, true);
            m7021();
        }
        this.f10029 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f10028 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f10031 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f10049 = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            C5925.m11310("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.f10041 = f;
        if (this.f10082 != null) {
            this.f10042 = (int) ((1.0f - f) * this.f10078);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                C5925.m11310("offset must be greater than or equal to 0");
                throw null;
            }
            this.f10032 = dimensionPixelOffset;
            m7020(this.f10027, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                C5925.m11310("offset must be greater than or equal to 0");
                throw null;
            }
            this.f10032 = i2;
            m7020(this.f10027, true);
        }
        this.f10046 = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.f10045 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f10026 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f10061 = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f10058 = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.f10059 = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.f10051 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.f10050 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f10054 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f10055 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f10037 = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f10047 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static View m7010(View view) {
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
            View viewM7010 = m7010(viewGroup.getChildAt(i));
            if (viewM7010 != null) {
                return viewM7010;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static int m7011(int i, int i2, int i3, int i4) {
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
    public final void m7012() {
        View view;
        if (this.f10082 != null) {
            m7029();
            if (this.f10027 != 4 || (view = (View) this.f10082.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7013(boolean z) {
        WeakReference weakReference = this.f10082;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f10069 != null) {
                    return;
                } else {
                    this.f10069 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f10082.get() && z) {
                    this.f10069.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f10069 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m7014(int i) {
        boolean z = this.f10063;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f10063 = true;
            }
        } else {
            if (!z && this.f10044 == i) {
                return;
            }
            this.f10063 = false;
            this.f10044 = Math.max(0, i);
        }
        m7012();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m7015(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f10083.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m7015(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m7016(View view) {
        Iterator it = this.f10083.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m7017() {
        WeakReference weakReference = this.f10082;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f10082.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int m7018(int i) {
        if (i == 3) {
            return m7019();
        }
        if (i == 4) {
            return this.f10040;
        }
        if (i == 5) {
            return this.f10078;
        }
        if (i == 6) {
            return this.f10042;
        }
        C5925.m11310(AbstractC6183.m11588(i, "Invalid state to get top offset: "));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int m7019() {
        if (this.f10048) {
            return this.f10043;
        }
        return Math.max(this.f10032, this.f10051 ? 0 : this.f10053);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m7020(int i, boolean z) {
        C8643 c8643;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f10027 == 3 && (this.f10037 || m7017());
        if (this.f10035 == z2 || (c8643 = this.f10067) == null) {
            return;
        }
        this.f10035 = z2;
        ValueAnimator valueAnimator = this.f10033;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c8643.m14333(this.f10035 ? m7028() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c8643.f24324.f24292, z2 ? m7028() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m7021() {
        View view;
        WeakReference weakReference = this.f10082;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2270.m4248(view, 1048576);
        AbstractC2270.m4249(view, 0);
        AbstractC2270.m4248(view, Opcodes.ASM8);
        AbstractC2270.m4249(view, 0);
        AbstractC2270.m4248(view, 262144);
        AbstractC2270.m4249(view, 0);
        SparseIntArray sparseIntArray = this.f10076;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC2270.m4248(view, i);
            AbstractC2270.m4249(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f10068;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            AbstractC2270.m4248(view, i2);
            AbstractC2270.m4249(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f10077;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            AbstractC2270.m4248(view, i3);
            AbstractC2270.m4249(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f10048 && this.f10027 != 6) {
            sparseIntArray2.put(0, m7032(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f10038) {
            int i4 = 5;
            if (this.f10027 != 5) {
                AbstractC2270.m4239(view, C7610.f20640, new C0107(this, i4, 13));
            }
        }
        int i5 = this.f10027;
        if (i5 == 3) {
            if (this.f10029 && this.f10038) {
                return;
            }
            sparseIntArray3.put(0, m7032(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i5 == 4) {
            sparseIntArray.put(0, m7032(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i5 != 6) {
                return;
            }
            if (!this.f10029 || !this.f10038) {
                sparseIntArray3.put(0, m7032(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, m7032(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m7022(View view, int i, boolean z) {
        int iM7018 = m7018(i);
        C7717 c7717 = this.f10023;
        if (c7717 == null || (!z ? c7717.m13028(view, view.getLeft(), iM7018) : c7717.m13024(view.getLeft(), iM7018))) {
            m7024(i);
            return;
        }
        m7024(2);
        m7020(i, true);
        this.f10034.m3606(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m7023(View view, float f) {
        if (this.f10029) {
            return true;
        }
        if (view.getTop() < this.f10040) {
            return false;
        }
        return Math.abs(((f * this.f10020) + ((float) view.getTop())) - ((float) this.f10040)) / ((float) m7030()) > 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m7024(int i) {
        if (this.f10027 == i) {
            return;
        }
        this.f10027 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f10038;
        }
        WeakReference weakReference = this.f10082;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m7013(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m7013(false);
        }
        m7020(i, true);
        ArrayList arrayList = this.f10080;
        if (arrayList.size() <= 0) {
            m7021();
        } else {
            arrayList.get(0).getClass();
            C2942.m6394();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m7025(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0053.m151(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f10038 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f10048 && m7018(i) <= this.f10043) ? 3 : i;
        WeakReference weakReference = this.f10082;
        if (weakReference == null || weakReference.get() == null) {
            m7024(i);
            return;
        }
        View view = (View) this.f10082.get();
        RunnableC0229 runnableC0229 = new RunnableC0229(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnableC0229);
        } else {
            runnableC0229.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7007(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo7007(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo7026() {
        this.f10082 = null;
        this.f10023 = null;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7027(C7873 c7873) {
        this.f10082 = null;
        this.f10023 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m7028() {
        /*
            r5 = this;
            r0 = 0
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r1 = r5.f10067
            if (r1 == 0) goto L77
            java.lang.ref.WeakReference r2 = r5.f10082
            if (r2 == 0) goto L77
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L77
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L77
            java.lang.ref.WeakReference r2 = r5.f10082
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r5.m7017()
            if (r5 == 0) goto L77
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L77
            float r2 = r1.m14346()
            android.view.RoundedCorner r3 = androidx.core.view.AbstractC2243.m4192(r5)
            if (r3 == 0) goto L42
            int r3 = androidx.core.view.AbstractC2243.m4181(r3)
            float r3 = (float) r3
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 <= 0) goto L42
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L42
            float r3 = r3 / r2
            goto L43
        L42:
            r3 = r0
        L43:
            float[] r2 = r1.f24298
            if (r2 == 0) goto L4b
            r1 = 0
            r1 = r2[r1]
            goto L5d
        L4b:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲 r2 = r1.f24324
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r2 = r2.f24283
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世 r2 = r2.mo14292()
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r2 = r2.f24266
            android.graphics.RectF r1 = r1.m14345()
            float r1 = r2.mo14312(r1)
        L5d:
            android.view.RoundedCorner r5 = androidx.core.view.AbstractC2243.m4182(r5)
            if (r5 == 0) goto L72
            int r5 = androidx.core.view.AbstractC2243.m4181(r5)
            float r5 = (float) r5
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L72
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L72
            float r0 = r5 / r1
        L72:
            float r5 = java.lang.Math.max(r3, r0)
            return r5
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m7028():float");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7029() {
        int iM7030 = m7030();
        boolean z = this.f10048;
        int i = this.f10078;
        if (z) {
            this.f10040 = Math.max(i - iM7030, this.f10043);
        } else {
            this.f10040 = i - iM7030;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int m7030() {
        int iMin;
        int i;
        int i2;
        if (this.f10063) {
            iMin = Math.min(Math.max(this.f10062, this.f10078 - ((this.f10079 * 9) / 16)), this.f10021);
            i = this.f10052;
        } else {
            if (!this.f10060 && !this.f10061 && (i2 = this.f10056) > 0) {
                return Math.max(this.f10044, i2 + this.f10066);
            }
            iMin = this.f10044;
            i = this.f10052;
        }
        return iMin + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7031(int i) {
        if (((View) this.f10082.get()) != null) {
            ArrayList arrayList = this.f10080;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f10040;
            if (i <= i2 && i2 != m7019()) {
                m7019();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            C2942.m6394();
        }
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Parcelable mo6988(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo6989(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f10049;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f10044 = savedState.f10085;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f10048 = savedState.f10084;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f10038 = savedState.f10086;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f10029 = savedState.f10087;
            }
        }
        int i2 = savedState.f10088;
        if (i2 == 1 || i2 == 2) {
            this.f10027 = 4;
        } else {
            this.f10027 = i2;
        }
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7008(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f10027;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C7717 c7717 = this.f10023;
        boolean z = this.f10028;
        if (c7717 != null && (z || i == 1)) {
            c7717.m13033(motionEvent);
        }
        if (actionMasked == 0) {
            this.f10073 = -1;
            this.f10072 = -1;
            this.f10071 = null;
            VelocityTracker velocityTracker = this.f10081;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10081 = null;
            }
        }
        if (this.f10081 == null) {
            this.f10081 = VelocityTracker.obtain();
        }
        this.f10081.addMovement(motionEvent);
        if (this.f10023 != null && ((z || this.f10027 == 1) && actionMasked == 2 && !this.f10022)) {
            float fAbs = Math.abs(this.f10072 - motionEvent.getY());
            C7717 c77172 = this.f10023;
            if (fAbs > c77172.f20935) {
                c77172.m13022(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10022;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m7032(View view, int i, int i2) {
        int iM12849;
        String string = view.getResources().getString(i);
        C0107 c0107 = new C0107(this, i2, 13);
        ArrayList arrayListM4246 = AbstractC2270.m4246(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListM4246.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = AbstractC2270.f6591;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListM4246.size(); i7++) {
                        z &= ((C7610) arrayListM4246.get(i7)).m12849() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iM12849 = i5;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C7610) arrayListM4246.get(i3)).f20647).getLabel())) {
                    iM12849 = ((C7610) arrayListM4246.get(i3)).m12849();
                    break;
                }
                i3++;
            }
        }
        if (iM12849 != -1) {
            C7610 c7610 = new C7610(null, iM12849, string, c0107, null);
            View.AccessibilityDelegate accessibilityDelegateM4234 = AbstractC2270.m4234(view);
            C2246 c2246 = accessibilityDelegateM4234 == null ? null : accessibilityDelegateM4234 instanceof C2247 ? ((C2247) accessibilityDelegateM4234).f6548 : new C2246(accessibilityDelegateM4234);
            if (c2246 == null) {
                c2246 = new C2246();
            }
            AbstractC2270.m4244(view, c2246);
            AbstractC2270.m4248(view, c7610.m12849());
            AbstractC2270.m4246(view).add(c7610);
            AbstractC2270.m4249(view, 0);
        }
        return iM12849;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo6990(View view, int i, int i2) {
        this.f10025 = 0;
        this.f10024 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6991(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m7019()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m7024(r1)
            return
        Lf:
            boolean r5 = r3.m7016(r5)
            if (r5 == 0) goto Lb1
            boolean r5 = r3.f10024
            if (r5 != 0) goto L1b
            goto Lb1
        L1b:
            int r5 = r3.f10025
            r6 = 6
            if (r5 <= 0) goto L30
            boolean r5 = r3.f10048
            if (r5 == 0) goto L26
            goto Lab
        L26:
            int r5 = r4.getTop()
            int r0 = r3.f10042
            if (r5 <= r0) goto Lab
            goto Laa
        L30:
            boolean r5 = r3.f10038
            if (r5 == 0) goto L51
            android.view.VelocityTracker r5 = r3.f10081
            if (r5 != 0) goto L3a
            r5 = 0
            goto L49
        L3a:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f10047
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f10081
            int r0 = r3.f10073
            float r5 = r5.getYVelocity(r0)
        L49:
            boolean r5 = r3.m7023(r4, r5)
            if (r5 == 0) goto L51
            r1 = 5
            goto Lab
        L51:
            int r5 = r3.f10025
            r0 = 4
            if (r5 != 0) goto L8f
            int r5 = r4.getTop()
            boolean r2 = r3.f10048
            if (r2 == 0) goto L70
            int r6 = r3.f10043
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f10040
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L93
            goto Lab
        L70:
            int r2 = r3.f10042
            if (r5 >= r2) goto L7f
            int r0 = r3.f10040
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Laa
            goto Lab
        L7f:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f10040
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L93
            goto Laa
        L8f:
            boolean r5 = r3.f10048
            if (r5 == 0) goto L95
        L93:
            r1 = r0
            goto Lab
        L95:
            int r5 = r4.getTop()
            int r1 = r3.f10042
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f10040
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L93
        Laa:
            r1 = r6
        Lab:
            r5 = 0
            r3.m7022(r4, r1, r5)
            r3.f10024 = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo6991(android.view.View, android.view.View, int):void");
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo6992(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m7011(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f10065, marginLayoutParams.width), m7011(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f10057, marginLayoutParams.height));
        return true;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6993(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 6;
        if (this.f10082 == null) {
            this.f10062 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f10060 || this.f10063) ? false : true;
            if (this.f10061 || this.f10058 || this.f10059 || this.f10050 || this.f10054 || this.f10055 || z) {
                C0064 c0064 = new C0064(this, i2, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C3158 c3158 = new C3158();
                c3158.f10512 = paddingStart;
                c3158.f10511 = paddingEnd;
                c3158.f10510 = paddingBottom;
                C0076 c0076 = new C0076(c0064, 18, c3158);
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                AbstractC2193.m4004(view, c0076);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3157());
                }
            }
            AbstractC2270.m4242(view, new C8613(view));
            this.f10082 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC6347.m11922(context, R.attr.motionDurationMedium2, 300);
            AbstractC6347.m11922(context, R.attr.motionDurationShort3, 150);
            AbstractC6347.m11922(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C8643 c8643 = this.f10067;
            if (c8643 != null) {
                view.setBackground(c8643);
                float elevation = this.f10039;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c8643.m14340(elevation);
            } else {
                ColorStateList colorStateList = this.f10064;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m7021();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f10023 == null) {
            this.f10023 = new C7717(coordinatorLayout.getContext(), coordinatorLayout, this.f10074);
        }
        int top2 = view.getTop();
        coordinatorLayout.m3939(view, i);
        this.f10079 = coordinatorLayout.getWidth();
        this.f10078 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f10021 = height;
        int iMin = this.f10078;
        int i3 = iMin - height;
        int i4 = this.f10053;
        if (i3 < i4) {
            boolean z2 = this.f10051;
            int i5 = this.f10057;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f10021 = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.f10021 = iMin2;
            }
        }
        this.f10043 = Math.max(0, this.f10078 - this.f10021);
        this.f10042 = (int) ((1.0f - this.f10041) * this.f10078);
        m7029();
        int i6 = this.f10027;
        if (i6 == 3) {
            int iM7019 = m7019();
            WeakHashMap weakHashMap2 = AbstractC2270.f6594;
            view.offsetTopAndBottom(iM7019);
        } else if (i6 == 6) {
            int i7 = this.f10042;
            WeakHashMap weakHashMap3 = AbstractC2270.f6594;
            view.offsetTopAndBottom(i7);
        } else if (this.f10038 && i6 == 5) {
            int i8 = this.f10078;
            WeakHashMap weakHashMap4 = AbstractC2270.f6594;
            view.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.f10040;
            WeakHashMap weakHashMap5 = AbstractC2270.f6594;
            view.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top3 = top2 - view.getTop();
            WeakHashMap weakHashMap6 = AbstractC2270.f6594;
            view.offsetTopAndBottom(top3);
        }
        m7020(this.f10027, false);
        ArrayList arrayList = this.f10083;
        arrayList.clear();
        if (this.f10045) {
            m7015(view);
        } else {
            arrayList.add(new WeakReference(m7010(view)));
        }
        ArrayList arrayList2 = this.f10080;
        if (arrayList2.size() <= 0) {
            return true;
        }
        arrayList2.get(0).getClass();
        C2942.m6394();
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo7000(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.f10026 || view.isInTouchMode()) {
            return false;
        }
        int i = this.f10027;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.f10075;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            C2225 c2225M3993 = AbstractC2189.m3993(view);
            if (c2225M3993 != null) {
                rect2.bottom -= c2225M3993.f6521.mo4052(519).f20807;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        m7025(3);
        return true;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo7033(View view) {
        Iterator it = this.f10083.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((WeakReference) it.next()).get() != null) {
                if (!m7016(view) || this.f10027 == 3 || this.f10030) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6995(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean zM7016;
        if (i3 != 1 && (zM7016 = m7016(view2))) {
            int top2 = view.getTop();
            int i4 = top2 - i2;
            boolean z = this.f10028;
            boolean z2 = this.f10031;
            if (i2 > 0) {
                if (!this.f10024 && !z2 && zM7016 && view2.canScrollVertically(1)) {
                    this.f10030 = true;
                    return;
                }
                if (i4 < m7019()) {
                    int iM7019 = top2 - m7019();
                    iArr[1] = iM7019;
                    WeakHashMap weakHashMap = AbstractC2270.f6594;
                    view.offsetTopAndBottom(-iM7019);
                    m7024(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = AbstractC2270.f6594;
                    view.offsetTopAndBottom(-i2);
                    m7024(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f10024 && !z2 && zM7016 && zCanScrollVertically) {
                    this.f10030 = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.f10040;
                    if (i4 > i5 && !this.f10038) {
                        int i6 = top2 - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = AbstractC2270.f6594;
                        view.offsetTopAndBottom(-i6);
                        m7024(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = AbstractC2270.f6594;
                        view.offsetTopAndBottom(-i2);
                        m7024(1);
                    }
                }
            }
            m7031(view.getTop());
            this.f10025 = i2;
            this.f10024 = true;
            this.f10030 = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3091();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public final boolean f10084;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public final int f10085;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public final boolean f10086;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public final boolean f10087;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final int f10088;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10088 = parcel.readInt();
            this.f10085 = parcel.readInt();
            this.f10084 = parcel.readInt() == 1;
            this.f10086 = parcel.readInt() == 1;
            this.f10087 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10088);
            parcel.writeInt(this.f10085);
            parcel.writeInt(this.f10084 ? 1 : 0);
            parcel.writeInt(this.f10086 ? 1 : 0);
            parcel.writeInt(this.f10087 ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f10088 = bottomSheetBehavior.f10027;
            this.f10085 = bottomSheetBehavior.f10044;
            this.f10084 = bottomSheetBehavior.f10048;
            this.f10086 = bottomSheetBehavior.f10038;
            this.f10087 = bottomSheetBehavior.f10029;
        }
    }

    public BottomSheetBehavior() {
        this.f10049 = 0;
        this.f10048 = true;
        this.f10065 = -1;
        this.f10057 = -1;
        this.f10034 = new C1908(this);
        this.f10041 = 0.5f;
        this.f10039 = -1.0f;
        this.f10028 = true;
        this.f10031 = true;
        this.f10026 = true;
        this.f10027 = 4;
        this.f10020 = 0.1f;
        this.f10083 = new ArrayList();
        this.f10080 = new ArrayList();
        this.f10072 = -1;
        this.f10068 = new SparseIntArray();
        this.f10076 = new SparseIntArray();
        this.f10077 = new SparseIntArray();
        this.f10075 = new Rect();
        this.f10074 = new C3794(this, 2);
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo6994(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
