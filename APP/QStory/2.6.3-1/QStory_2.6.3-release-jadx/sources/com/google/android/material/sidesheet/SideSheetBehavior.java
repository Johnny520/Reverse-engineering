package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.input.internal.RunnableC1714;
import androidx.compose.p001ui.platform.C2743;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC3103;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lxj.xpopup.widget.C4626;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p171.C8439;
import p171.InterfaceC8444;
import p185.C8546;
import p191.AbstractC8568;
import p217.AbstractC8705;
import p217.C8702;
import p320.C9444;
import p321.C9457;
import p321.C9468;
import p321.C9469;
import p321.C9472;
import p330.AbstractC9490;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC8705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f10894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2743 f10895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9469 f10896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ColorStateList f10897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9472 f10898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC5754 f10899;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10900;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public VelocityTracker f10901;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedHashSet f10902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4626 f10903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f10905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f10906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f10908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f10909;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10910;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f10911;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f10912;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10913;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8546 f10914;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f10915;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f10895 = new C2743(this);
        this.f10911 = true;
        this.f10910 = 5;
        this.f10912 = 0.1f;
        this.f10907 = -1;
        this.f10902 = new LinkedHashSet();
        this.f10903 = new C4626(this, 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24767);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10897 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f10896 = C9469.m14880(context, attributeSet, 0, C0328R.style.Widget_Material3_SideSheet).m14878();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f10907 = resourceId;
            WeakReference weakReference = this.f10906;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f10906 = null;
            WeakReference weakReference2 = this.f10909;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C9469 c9469 = this.f10896;
        if (c9469 != null) {
            C9472 c9472 = new C9472(c9469);
            this.f10898 = c9472;
            c9472.m14897(context);
            ColorStateList colorStateList = this.f10897;
            if (colorStateList != null) {
                this.f10898.m14900(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f10898.setTint(typedValue.data);
            }
        }
        this.f10894 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f10911 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7566(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C8546 c8546;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC3103.m4793(view) == null) || !this.f10911) {
            this.f10915 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f10901) != null) {
            velocityTracker.recycle();
            this.f10901 = null;
        }
        if (this.f10901 == null) {
            this.f10901 = VelocityTracker.obtain();
        }
        this.f10901.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f10900 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f10915) {
            this.f10915 = false;
            return false;
        }
        return (this.f10915 || (c8546 = this.f10914) == null || !c8546.m13586(motionEvent)) ? false : true;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7585() {
        this.f10909 = null;
        this.f10914 = null;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7586(C8702 c8702) {
        this.f10909 = null;
        this.f10914 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7747(View view, int i, boolean z) {
        int iMo10468;
        if (i == 3) {
            iMo10468 = this.f10899.mo10468();
        } else {
            if (i != 5) {
                C6755.m11869(AbstractC7012.m12147(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iMo10468 = this.f10899.mo10469();
        }
        C8546 c8546 = this.f10914;
        if (c8546 == null || (!z ? c8546.m13587(view, iMo10468, view.getTop()) : c8546.m13583(iMo10468, view.getTop()))) {
            m7750(i);
        } else {
            m7750(2);
            this.f10895.m4166(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m7748() {
        if (this.f10914 != null) {
            return this.f10911 || this.f10910 == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7749() {
        View view;
        WeakReference weakReference = this.f10909;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC3103.m4808(view, 262144);
        AbstractC3103.m4809(view, 0);
        AbstractC3103.m4808(view, 1048576);
        AbstractC3103.m4809(view, 0);
        final int i = 5;
        if (this.f10910 != 5) {
            AbstractC3103.m4799(view, C8439.f20985, new InterfaceC8444() { // from class: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏兰哲
                @Override // p171.InterfaceC8444
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
                public final boolean mo901(View view2) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC0900.m711(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f24534;
                    WeakReference weakReference2 = sideSheetBehavior.f10909;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m7750(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f10909.get();
                    RunnableC1714 runnableC1714 = new RunnableC1714(sideSheetBehavior, i2, 4);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(runnableC1714);
                        return true;
                    }
                    runnableC1714.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f10910 != 3) {
            AbstractC3103.m4799(view, C8439.f20988, new InterfaceC8444() { // from class: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏兰哲
                @Override // p171.InterfaceC8444
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
                public final boolean mo901(View view2) {
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(AbstractC0900.m711(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f24534;
                    WeakReference weakReference2 = sideSheetBehavior.f10909;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m7750(i22);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f10909.get();
                    RunnableC1714 runnableC1714 = new RunnableC1714(sideSheetBehavior, i22, 4);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(runnableC1714);
                        return true;
                    }
                    runnableC1714.run();
                    return true;
                }
            });
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
        int i = ((SavedState) parcelable).f10916;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f10910 = i;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7567(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10910 == 1 && actionMasked == 0) {
            return true;
        }
        if (m7748()) {
            this.f10914.m13592(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f10901) != null) {
            velocityTracker.recycle();
            this.f10901 = null;
        }
        if (this.f10901 == null) {
            this.f10901 = VelocityTracker.obtain();
        }
        this.f10901.addMovement(motionEvent);
        if (m7748() && actionMasked == 2 && !this.f10915 && m7748()) {
            float fAbs = Math.abs(this.f10900 - motionEvent.getX());
            C8546 c8546 = this.f10914;
            if (fAbs > c8546.f21280) {
                c8546.m13581(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10915;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7750(int i) {
        View view;
        if (this.f10910 == i) {
            return;
        }
        this.f10910 = i;
        WeakReference weakReference = this.f10909;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f10910 == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f10902.iterator();
        if (it.hasNext()) {
            throw AbstractC3275.m5138(it);
        }
        m7749();
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7551(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7552(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iMo10467;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f10909;
        C9472 c9472 = this.f10898;
        int i4 = 0;
        if (weakReference == null) {
            this.f10909 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC7176.m12481(context, C0328R.attr.motionDurationMedium2, 300);
            AbstractC7176.m12481(context, C0328R.attr.motionDurationShort3, 150);
            AbstractC7176.m12481(context, C0328R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C0328R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(C0328R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(C0328R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c9472 != null) {
                view.setBackground(c9472);
                float elevation = this.f10894;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c9472.m14899(elevation);
            } else {
                ColorStateList colorStateList = this.f10897;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.f10910 == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m7749();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC3103.m4793(view) == null) {
                AbstractC3103.m4801(view, view.getResources().getString(C0328R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C8702) view.getLayoutParams()).f22000, i) == 3 ? 1 : 0;
        AbstractC5754 abstractC5754 = this.f10899;
        if (abstractC5754 == null || abstractC5754.mo10465() != i6) {
            C8702 c8702 = null;
            C9469 c9469 = this.f10896;
            if (i6 == 0) {
                this.f10899 = new C9444(this, i3);
                if (c9469 != null) {
                    WeakReference weakReference2 = this.f10909;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C8702)) {
                        c8702 = (C8702) view3.getLayoutParams();
                    }
                    if (c8702 == null || ((ViewGroup.MarginLayoutParams) c8702).rightMargin <= 0) {
                        C9468 c9468M14882 = c9469.m14882();
                        c9468M14882.f24599 = new C9457(0.0f);
                        c9468M14882.f24606 = new C9457(0.0f);
                        C9469 c9469M14878 = c9468M14882.m14878();
                        if (c9472 != null) {
                            c9472.setShapeAppearanceModel(c9469M14878);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    C6755.m11869(AbstractC0900.m722(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.f10899 = new C9444(this, i4);
                if (c9469 != null) {
                    WeakReference weakReference3 = this.f10909;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C8702)) {
                        c8702 = (C8702) view2.getLayoutParams();
                    }
                    if (c8702 == null || ((ViewGroup.MarginLayoutParams) c8702).leftMargin <= 0) {
                        C9468 c9468M148822 = c9469.m14882();
                        c9468M148822.f24600 = new C9457(0.0f);
                        c9468M148822.f24605 = new C9457(0.0f);
                        C9469 c9469M148782 = c9468M148822.m14878();
                        if (c9472 != null) {
                            c9472.setShapeAppearanceModel(c9469M148782);
                        }
                    }
                }
            }
        }
        if (this.f10914 == null) {
            this.f10914 = new C8546(coordinatorLayout.getContext(), coordinatorLayout, this.f10903);
        }
        int iMo104672 = this.f10899.mo10467(view);
        coordinatorLayout.m4499(view, i);
        this.f10905 = coordinatorLayout.getWidth();
        this.f10904 = this.f10899.mo10464(coordinatorLayout);
        this.f10913 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f10908 = marginLayoutParams != null ? this.f10899.mo10471(marginLayoutParams) : 0;
        int i7 = this.f10910;
        if (i7 == 1 || i7 == 2) {
            iMo10467 = iMo104672 - this.f10899.mo10467(view);
        } else if (i7 == 3) {
            iMo10467 = 0;
        } else {
            if (i7 != 5) {
                C6755.m11864(this.f10910, "Unexpected value: ");
                return false;
            }
            iMo10467 = this.f10899.mo10469();
        }
        WeakHashMap weakHashMap2 = AbstractC3103.f6939;
        view.offsetLeftAndRight(iMo10467);
        if (this.f10906 == null && (i2 = this.f10907) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f10906 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f10902.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4002();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final int f10916;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10916 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10916);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f10916 = sideSheetBehavior.f10910;
        }
    }

    public SideSheetBehavior() {
        this.f10895 = new C2743(this);
        this.f10911 = true;
        this.f10910 = 5;
        this.f10912 = 0.1f;
        this.f10907 = -1;
        this.f10902 = new LinkedHashSet();
        this.f10903 = new C4626(this, 3);
    }
}
