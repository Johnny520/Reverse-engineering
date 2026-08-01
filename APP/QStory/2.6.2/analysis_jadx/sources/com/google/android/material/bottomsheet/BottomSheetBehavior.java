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
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.C3157;
import com.google.android.material.internal.ViewOnAttachStateChangeListenerC3156;
import com.google.android.material.textfield.C3176;
import com.lxj.xpopup.widget.C3793;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import net.bytebuddy.jar.asm.Opcodes;
import p007.AbstractC6136;
import p155.C7609;
import p169.C7716;
import p175.AbstractC7738;
import p201.AbstractC7875;
import p201.C7872;
import p253.AbstractC8189;
import p303.C8621;
import p305.C8648;
import p305.C8651;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC7875 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final float f10015;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10016;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public boolean f10017;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C7716 f10018;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public boolean f10019;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f10020;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean f10021;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public int f10022;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f10023;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f10024;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f10025;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f10026;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final int f10027;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final ValueAnimator f10028;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1908 f10029;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f10030;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C8648 f10031;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean f10032;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10033;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final float f10034;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f10035;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final float f10036;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f10037;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f10039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f10040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f10041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f10042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f10043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f10044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f10045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f10046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f10047;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f10048;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f10049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f10050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f10052;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f10053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f10054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean f10055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f10056;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10057;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10058;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorStateList f10059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f10060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8651 f10062;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final SparseIntArray f10063;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public HashMap f10064;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean f10065;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public WeakReference f10066;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public int f10067;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public int f10068;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C3793 f10069;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final Rect f10070;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final SparseIntArray f10071;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final SparseIntArray f10072;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public int f10073;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f10074;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final ArrayList f10075;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public VelocityTracker f10076;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public WeakReference f10077;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final ArrayList f10078;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f10044 = 0;
        this.f10043 = true;
        this.f10060 = -1;
        this.f10052 = -1;
        this.f10029 = new C1908(this);
        this.f10036 = 0.5f;
        this.f10034 = -1.0f;
        this.f10023 = true;
        this.f10026 = true;
        this.f10021 = true;
        this.f10022 = 4;
        this.f10015 = 0.1f;
        this.f10078 = new ArrayList();
        this.f10075 = new ArrayList();
        this.f10067 = -1;
        this.f10063 = new SparseIntArray();
        this.f10071 = new SparseIntArray();
        this.f10072 = new SparseIntArray();
        this.f10070 = new Rect();
        this.f10069 = new C3793(this, 2);
        this.f10061 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24437);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10059 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.f10031 = C8648.m14303(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m14301();
        }
        C8648 c8648 = this.f10031;
        if (c8648 != null) {
            C8651 c8651 = new C8651(c8648);
            this.f10062 = c8651;
            c8651.m14320(context);
            ColorStateList colorStateList = this.f10059;
            if (colorStateList != null) {
                this.f10062.m14323(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f10062.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m7041(), 1.0f);
        this.f10028 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f10028.addUpdateListener(new C3176(this, 7));
        this.f10034 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f10060 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f10052 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            m7027(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            m7027(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.f10033 != z) {
            this.f10033 = z;
            if (!z && this.f10022 == 5) {
                m7038(4);
            }
            m7034();
        }
        this.f10055 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.f10043 != z2) {
            this.f10043 = z2;
            if (this.f10077 != null) {
                m7042();
            }
            m7037((this.f10043 && this.f10022 == 6) ? 3 : this.f10022);
            m7033(this.f10022, true);
            m7034();
        }
        this.f10024 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f10023 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f10026 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f10044 = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            C5919.m11249("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.f10036 = f;
        if (this.f10077 != null) {
            this.f10037 = (int) ((1.0f - f) * this.f10073);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                C5919.m11249("offset must be greater than or equal to 0");
                throw null;
            }
            this.f10027 = dimensionPixelOffset;
            m7033(this.f10022, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                C5919.m11249("offset must be greater than or equal to 0");
                throw null;
            }
            this.f10027 = i2;
            m7033(this.f10022, true);
        }
        this.f10041 = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.f10040 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.f10021 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f10056 = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f10053 = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.f10054 = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.f10046 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.f10045 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f10049 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f10050 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f10032 = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f10042 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static View m7023(View view) {
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
            View viewM7023 = m7023(viewGroup.getChildAt(i));
            if (viewM7023 != null) {
                return viewM7023;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static int m7024(int i, int i2, int i3, int i4) {
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
    public final void m7025() {
        View view;
        if (this.f10077 != null) {
            m7042();
            if (this.f10022 != 4 || (view = (View) this.f10077.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7026(boolean z) {
        WeakReference weakReference = this.f10077;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f10064 != null) {
                    return;
                } else {
                    this.f10064 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f10077.get() && z) {
                    this.f10064.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f10064 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m7027(int i) {
        boolean z = this.f10058;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f10058 = true;
            }
        } else {
            if (!z && this.f10039 == i) {
                return;
            }
            this.f10058 = false;
            this.f10039 = Math.max(0, i);
        }
        m7025();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m7028(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.f10078.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m7028(viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m7029(View view) {
        Iterator it = this.f10078.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m7030() {
        WeakReference weakReference = this.f10077;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f10077.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int m7031(int i) {
        if (i == 3) {
            return m7032();
        }
        if (i == 4) {
            return this.f10035;
        }
        if (i == 5) {
            return this.f10073;
        }
        if (i == 6) {
            return this.f10037;
        }
        C5919.m11249(AbstractC6136.m11556(i, "Invalid state to get top offset: "));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int m7032() {
        if (this.f10043) {
            return this.f10038;
        }
        return Math.max(this.f10027, this.f10046 ? 0 : this.f10048);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m7033(int i, boolean z) {
        C8651 c8651;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f10022 == 3 && (this.f10032 || m7030());
        if (this.f10030 == z2 || (c8651 = this.f10062) == null) {
            return;
        }
        this.f10030 = z2;
        ValueAnimator valueAnimator = this.f10028;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            c8651.m14315(this.f10030 ? m7041() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(c8651.f24333.f24301, z2 ? m7041() : 1.0f);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m7034() {
        View view;
        WeakReference weakReference = this.f10077;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2270.m4238(view, 1048576);
        AbstractC2270.m4239(view, 0);
        AbstractC2270.m4238(view, Opcodes.ASM8);
        AbstractC2270.m4239(view, 0);
        AbstractC2270.m4238(view, 262144);
        AbstractC2270.m4239(view, 0);
        SparseIntArray sparseIntArray = this.f10071;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC2270.m4238(view, i);
            AbstractC2270.m4239(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.f10063;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            AbstractC2270.m4238(view, i2);
            AbstractC2270.m4239(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.f10072;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            AbstractC2270.m4238(view, i3);
            AbstractC2270.m4239(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f10043 && this.f10022 != 6) {
            sparseIntArray2.put(0, m7045(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f10033) {
            int i4 = 5;
            if (this.f10022 != 5) {
                AbstractC2270.m4229(view, C7609.f20645, new C0107(this, i4, 13));
            }
        }
        int i5 = this.f10022;
        if (i5 == 3) {
            if (this.f10024 && this.f10033) {
                return;
            }
            sparseIntArray3.put(0, m7045(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i5 == 4) {
            sparseIntArray.put(0, m7045(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i5 != 6) {
                return;
            }
            if (!this.f10024 || !this.f10033) {
                sparseIntArray3.put(0, m7045(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, m7045(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m7035(View view, int i, boolean z) {
        int iM7031 = m7031(i);
        C7716 c7716 = this.f10018;
        if (c7716 == null || (!z ? c7716.m12998(view, view.getLeft(), iM7031) : c7716.m12994(view.getLeft(), iM7031))) {
            m7037(i);
            return;
        }
        m7037(2);
        m7033(i, true);
        this.f10029.m3596(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m7036(View view, float f) {
        if (this.f10024) {
            return true;
        }
        if (view.getTop() < this.f10035) {
            return false;
        }
        return Math.abs(((f * this.f10015) + ((float) view.getTop())) - ((float) this.f10035)) / ((float) m7043()) > 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m7037(int i) {
        if (this.f10022 == i) {
            return;
        }
        this.f10022 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f10033;
        }
        WeakReference weakReference = this.f10077;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m7026(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m7026(false);
        }
        m7033(i, true);
        ArrayList arrayList = this.f10075;
        if (arrayList.size() <= 0) {
            m7034();
        } else {
            arrayList.get(0).getClass();
            C2941.m6336();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m7038(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(AbstractC0053.m146(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f10033 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f10043 && m7031(i) <= this.f10038) ? 3 : i;
        WeakReference weakReference = this.f10077;
        if (weakReference == null || weakReference.get() == null) {
            m7037(i);
            return;
        }
        View view = (View) this.f10077.get();
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
    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7020(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo7020(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo7039() {
        this.f10077 = null;
        this.f10018 = null;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo7040(C7872 c7872) {
        this.f10077 = null;
        this.f10018 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m7041() {
        /*
            r5 = this;
            r0 = 0
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰世哲 r1 = r5.f10062
            if (r1 == 0) goto L77
            java.lang.ref.WeakReference r2 = r5.f10077
            if (r2 == 0) goto L77
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L77
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L77
            java.lang.ref.WeakReference r2 = r5.f10077
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r5.m7030()
            if (r5 == 0) goto L77
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L77
            float r2 = r1.m14328()
            android.view.RoundedCorner r3 = androidx.core.view.AbstractC2243.m4182(r5)
            if (r3 == 0) goto L42
            int r3 = androidx.core.view.AbstractC2243.m4171(r3)
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
            float[] r2 = r1.f24307
            if (r2 == 0) goto L4b
            r1 = 0
            r1 = r2[r1]
            goto L5d
        L4b:
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏世兰哲 r2 = r1.f24333
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世兰苏 r2 = r2.f24292
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世 r2 = r2.mo14273()
            飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲兰苏 r2 = r2.f24275
            android.graphics.RectF r1 = r1.m14327()
            float r1 = r2.mo14294(r1)
        L5d:
            android.view.RoundedCorner r5 = androidx.core.view.AbstractC2243.m4172(r5)
            if (r5 == 0) goto L72
            int r5 = androidx.core.view.AbstractC2243.m4171(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m7041():float");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7042() {
        int iM7043 = m7043();
        boolean z = this.f10043;
        int i = this.f10073;
        if (z) {
            this.f10035 = Math.max(i - iM7043, this.f10038);
        } else {
            this.f10035 = i - iM7043;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int m7043() {
        int iMin;
        int i;
        int i2;
        if (this.f10058) {
            iMin = Math.min(Math.max(this.f10057, this.f10073 - ((this.f10074 * 9) / 16)), this.f10016);
            i = this.f10047;
        } else {
            if (!this.f10055 && !this.f10056 && (i2 = this.f10051) > 0) {
                return Math.max(this.f10039, i2 + this.f10061);
            }
            iMin = this.f10039;
            i = this.f10047;
        }
        return iMin + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7044(int i) {
        if (((View) this.f10077.get()) != null) {
            ArrayList arrayList = this.f10075;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f10035;
            if (i <= i2 && i2 != m7032()) {
                m7032();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            C2941.m6336();
        }
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Parcelable mo7001(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo7002(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f10044;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f10039 = savedState.f10080;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f10043 = savedState.f10079;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f10033 = savedState.f10081;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f10024 = savedState.f10082;
            }
        }
        int i2 = savedState.f10083;
        if (i2 == 1 || i2 == 2) {
            this.f10022 = 4;
        } else {
            this.f10022 = i2;
        }
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7021(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f10022;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C7716 c7716 = this.f10018;
        boolean z = this.f10023;
        if (c7716 != null && (z || i == 1)) {
            c7716.m13003(motionEvent);
        }
        if (actionMasked == 0) {
            this.f10068 = -1;
            this.f10067 = -1;
            this.f10066 = null;
            VelocityTracker velocityTracker = this.f10076;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10076 = null;
            }
        }
        if (this.f10076 == null) {
            this.f10076 = VelocityTracker.obtain();
        }
        this.f10076.addMovement(motionEvent);
        if (this.f10018 != null && ((z || this.f10022 == 1) && actionMasked == 2 && !this.f10017)) {
            float fAbs = Math.abs(this.f10067 - motionEvent.getY());
            C7716 c77162 = this.f10018;
            if (fAbs > c77162.f20940) {
                c77162.m12992(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10017;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m7045(View view, int i, int i2) {
        int iM12820;
        String string = view.getResources().getString(i);
        C0107 c0107 = new C0107(this, i2, 13);
        ArrayList arrayListM4236 = AbstractC2270.m4236(view);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayListM4236.size()) {
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    int[] iArr = AbstractC2270.f6590;
                    if (i4 >= 32 || i5 != -1) {
                        break;
                    }
                    int i6 = iArr[i4];
                    boolean z = true;
                    for (int i7 = 0; i7 < arrayListM4236.size(); i7++) {
                        z &= ((C7609) arrayListM4236.get(i7)).m12820() != i6;
                    }
                    if (z) {
                        i5 = i6;
                    }
                    i4++;
                }
                iM12820 = i5;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C7609) arrayListM4236.get(i3)).f20652).getLabel())) {
                    iM12820 = ((C7609) arrayListM4236.get(i3)).m12820();
                    break;
                }
                i3++;
            }
        }
        if (iM12820 != -1) {
            C7609 c7609 = new C7609(null, iM12820, string, c0107, null);
            View.AccessibilityDelegate accessibilityDelegateM4224 = AbstractC2270.m4224(view);
            C2246 c2246 = accessibilityDelegateM4224 == null ? null : accessibilityDelegateM4224 instanceof C2247 ? ((C2247) accessibilityDelegateM4224).f6547 : new C2246(accessibilityDelegateM4224);
            if (c2246 == null) {
                c2246 = new C2246();
            }
            AbstractC2270.m4234(view, c2246);
            AbstractC2270.m4238(view, c7609.m12820());
            AbstractC2270.m4236(view).add(c7609);
            AbstractC2270.m4239(view, 0);
        }
        return iM12820;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo7003(View view, int i, int i2) {
        this.f10020 = 0;
        this.f10019 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7004(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m7032()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m7037(r1)
            return
        Lf:
            boolean r5 = r3.m7029(r5)
            if (r5 == 0) goto Lb1
            boolean r5 = r3.f10019
            if (r5 != 0) goto L1b
            goto Lb1
        L1b:
            int r5 = r3.f10020
            r6 = 6
            if (r5 <= 0) goto L30
            boolean r5 = r3.f10043
            if (r5 == 0) goto L26
            goto Lab
        L26:
            int r5 = r4.getTop()
            int r0 = r3.f10037
            if (r5 <= r0) goto Lab
            goto Laa
        L30:
            boolean r5 = r3.f10033
            if (r5 == 0) goto L51
            android.view.VelocityTracker r5 = r3.f10076
            if (r5 != 0) goto L3a
            r5 = 0
            goto L49
        L3a:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f10042
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f10076
            int r0 = r3.f10068
            float r5 = r5.getYVelocity(r0)
        L49:
            boolean r5 = r3.m7036(r4, r5)
            if (r5 == 0) goto L51
            r1 = 5
            goto Lab
        L51:
            int r5 = r3.f10020
            r0 = 4
            if (r5 != 0) goto L8f
            int r5 = r4.getTop()
            boolean r2 = r3.f10043
            if (r2 == 0) goto L70
            int r6 = r3.f10038
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f10035
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L93
            goto Lab
        L70:
            int r2 = r3.f10037
            if (r5 >= r2) goto L7f
            int r0 = r3.f10035
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Laa
            goto Lab
        L7f:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f10035
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L93
            goto Laa
        L8f:
            boolean r5 = r3.f10043
            if (r5 == 0) goto L95
        L93:
            r1 = r0
            goto Lab
        L95:
            int r5 = r4.getTop()
            int r1 = r3.f10037
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f10035
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L93
        Laa:
            r1 = r6
        Lab:
            r5 = 0
            r3.m7035(r4, r1, r5)
            r3.f10019 = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo7004(android.view.View, android.view.View, int):void");
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7005(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m7024(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f10060, marginLayoutParams.width), m7024(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f10052, marginLayoutParams.height));
        return true;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 6;
        if (this.f10077 == null) {
            this.f10057 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.f10055 || this.f10058) ? false : true;
            if (this.f10056 || this.f10053 || this.f10054 || this.f10045 || this.f10049 || this.f10050 || z) {
                C0064 c0064 = new C0064(this, i2, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C3157 c3157 = new C3157();
                c3157.f10507 = paddingStart;
                c3157.f10506 = paddingEnd;
                c3157.f10505 = paddingBottom;
                C0076 c0076 = new C0076(c0064, 18, c3157);
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                AbstractC2193.m3994(view, c0076);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3156());
                }
            }
            AbstractC2270.m4232(view, new C8621(view));
            this.f10077 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC7738.m13024(context, R.attr.motionDurationMedium2, 300);
            AbstractC7738.m13024(context, R.attr.motionDurationShort3, 150);
            AbstractC7738.m13024(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            C8651 c8651 = this.f10062;
            if (c8651 != null) {
                view.setBackground(c8651);
                float elevation = this.f10034;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c8651.m14322(elevation);
            } else {
                ColorStateList colorStateList = this.f10059;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            m7034();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f10018 == null) {
            this.f10018 = new C7716(coordinatorLayout.getContext(), coordinatorLayout, this.f10069);
        }
        int top2 = view.getTop();
        coordinatorLayout.m3929(view, i);
        this.f10074 = coordinatorLayout.getWidth();
        this.f10073 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f10016 = height;
        int iMin = this.f10073;
        int i3 = iMin - height;
        int i4 = this.f10048;
        if (i3 < i4) {
            boolean z2 = this.f10046;
            int i5 = this.f10052;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.f10016 = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.f10016 = iMin2;
            }
        }
        this.f10038 = Math.max(0, this.f10073 - this.f10016);
        this.f10037 = (int) ((1.0f - this.f10036) * this.f10073);
        m7042();
        int i6 = this.f10022;
        if (i6 == 3) {
            int iM7032 = m7032();
            WeakHashMap weakHashMap2 = AbstractC2270.f6593;
            view.offsetTopAndBottom(iM7032);
        } else if (i6 == 6) {
            int i7 = this.f10037;
            WeakHashMap weakHashMap3 = AbstractC2270.f6593;
            view.offsetTopAndBottom(i7);
        } else if (this.f10033 && i6 == 5) {
            int i8 = this.f10073;
            WeakHashMap weakHashMap4 = AbstractC2270.f6593;
            view.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.f10035;
            WeakHashMap weakHashMap5 = AbstractC2270.f6593;
            view.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top3 = top2 - view.getTop();
            WeakHashMap weakHashMap6 = AbstractC2270.f6593;
            view.offsetTopAndBottom(top3);
        }
        m7033(this.f10022, false);
        ArrayList arrayList = this.f10078;
        arrayList.clear();
        if (this.f10040) {
            m7028(view);
        } else {
            arrayList.add(new WeakReference(m7023(view)));
        }
        ArrayList arrayList2 = this.f10075;
        if (arrayList2.size() <= 0) {
            return true;
        }
        arrayList2.get(0).getClass();
        C2941.m6336();
        return false;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo7013(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (!this.f10021 || view.isInTouchMode()) {
            return false;
        }
        int i = this.f10022;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.f10070;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            C2225 c2225M3983 = AbstractC2189.m3983(view);
            if (c2225M3983 != null) {
                rect2.bottom -= c2225M3983.f6520.mo4042(519).f20812;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        m7038(3);
        return true;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo7046(View view) {
        Iterator it = this.f10078.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((WeakReference) it.next()).get() != null) {
                if (!m7029(view) || this.f10022 == 3 || this.f10025) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7008(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean zM7029;
        if (i3 != 1 && (zM7029 = m7029(view2))) {
            int top2 = view.getTop();
            int i4 = top2 - i2;
            boolean z = this.f10023;
            boolean z2 = this.f10026;
            if (i2 > 0) {
                if (!this.f10019 && !z2 && zM7029 && view2.canScrollVertically(1)) {
                    this.f10025 = true;
                    return;
                }
                if (i4 < m7032()) {
                    int iM7032 = top2 - m7032();
                    iArr[1] = iM7032;
                    WeakHashMap weakHashMap = AbstractC2270.f6593;
                    view.offsetTopAndBottom(-iM7032);
                    m7037(3);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = AbstractC2270.f6593;
                    view.offsetTopAndBottom(-i2);
                    m7037(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f10019 && !z2 && zM7029 && zCanScrollVertically) {
                    this.f10025 = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    int i5 = this.f10035;
                    if (i4 > i5 && !this.f10033) {
                        int i6 = top2 - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = AbstractC2270.f6593;
                        view.offsetTopAndBottom(-i6);
                        m7037(4);
                    } else {
                        if (!z) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = AbstractC2270.f6593;
                        view.offsetTopAndBottom(-i2);
                        m7037(1);
                    }
                }
            }
            m7044(view.getTop());
            this.f10020 = i2;
            this.f10019 = true;
            this.f10025 = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3090();

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public final boolean f10079;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
        public final int f10080;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public final boolean f10081;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public final boolean f10082;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final int f10083;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10083 = parcel.readInt();
            this.f10080 = parcel.readInt();
            this.f10079 = parcel.readInt() == 1;
            this.f10081 = parcel.readInt() == 1;
            this.f10082 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10083);
            parcel.writeInt(this.f10080);
            parcel.writeInt(this.f10079 ? 1 : 0);
            parcel.writeInt(this.f10081 ? 1 : 0);
            parcel.writeInt(this.f10082 ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f10083 = bottomSheetBehavior.f10022;
            this.f10080 = bottomSheetBehavior.f10039;
            this.f10079 = bottomSheetBehavior.f10043;
            this.f10081 = bottomSheetBehavior.f10033;
            this.f10082 = bottomSheetBehavior.f10024;
        }
    }

    public BottomSheetBehavior() {
        this.f10044 = 0;
        this.f10043 = true;
        this.f10060 = -1;
        this.f10052 = -1;
        this.f10029 = new C1908(this);
        this.f10036 = 0.5f;
        this.f10034 = -1.0f;
        this.f10023 = true;
        this.f10026 = true;
        this.f10021 = true;
        this.f10022 = 4;
        this.f10015 = 0.1f;
        this.f10078 = new ArrayList();
        this.f10075 = new ArrayList();
        this.f10067 = -1;
        this.f10063 = new SparseIntArray();
        this.f10071 = new SparseIntArray();
        this.f10072 = new SparseIntArray();
        this.f10070 = new Rect();
        this.f10069 = new C3793(this, 2);
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7007(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
