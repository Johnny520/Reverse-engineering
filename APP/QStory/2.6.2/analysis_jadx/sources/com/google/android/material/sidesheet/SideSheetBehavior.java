package com.google.android.material.sidesheet;

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
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.input.internal.RunnableC0876;
import androidx.compose.ui.platform.C1908;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2270;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lxj.xpopup.widget.C3793;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p155.C7609;
import p155.InterfaceC7614;
import p169.C7716;
import p175.AbstractC7738;
import p201.AbstractC7875;
import p201.C7872;
import p253.AbstractC8189;
import p304.C8623;
import p305.C8636;
import p305.C8647;
import p305.C8648;
import p305.C8651;
import p314.AbstractC8669;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC7875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f10544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1908 f10545;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8648 f10546;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ColorStateList f10547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8651 f10548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC6087 f10549;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public VelocityTracker f10551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedHashSet f10552;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3793 f10553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f10555;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f10556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10557;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f10558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f10559;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10560;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f10561;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f10562;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10563;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7716 f10564;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f10565;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f10545 = new C1908(this);
        this.f10561 = true;
        this.f10560 = 5;
        this.f10562 = 0.1f;
        this.f10557 = -1;
        this.f10552 = new LinkedHashSet();
        this.f10553 = new C3793(this, 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24431);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10547 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f10546 = C8648.m14303(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m14301();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f10557 = resourceId;
            WeakReference weakReference = this.f10556;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f10556 = null;
            WeakReference weakReference2 = this.f10559;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C8648 c8648 = this.f10546;
        if (c8648 != null) {
            C8651 c8651 = new C8651(c8648);
            this.f10548 = c8651;
            c8651.m14320(context);
            ColorStateList colorStateList = this.f10547;
            if (colorStateList != null) {
                this.f10548.m14323(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f10548.setTint(typedValue.data);
            }
        }
        this.f10544 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f10561 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7020(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C7716 c7716;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC2270.m4223(view) == null) || !this.f10561) {
            this.f10565 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f10551) != null) {
            velocityTracker.recycle();
            this.f10551 = null;
        }
        if (this.f10551 == null) {
            this.f10551 = VelocityTracker.obtain();
        }
        this.f10551.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f10550 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f10565) {
            this.f10565 = false;
            return false;
        }
        return (this.f10565 || (c7716 = this.f10564) == null || !c7716.m12997(motionEvent)) ? false : true;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7039() {
        this.f10559 = null;
        this.f10564 = null;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7040(C7872 c7872) {
        this.f10559 = null;
        this.f10564 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7201(View view, int i, boolean z) {
        int iMo11437;
        if (i == 3) {
            iMo11437 = this.f10549.mo11437();
        } else {
            if (i != 5) {
                C5919.m11249(AbstractC6136.m11556(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iMo11437 = this.f10549.mo11436();
        }
        C7716 c7716 = this.f10564;
        if (c7716 == null || (!z ? c7716.m12998(view, iMo11437, view.getTop()) : c7716.m12994(iMo11437, view.getTop()))) {
            m7204(i);
        } else {
            m7204(2);
            this.f10545.m3596(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m7202() {
        if (this.f10564 != null) {
            return this.f10561 || this.f10560 == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7203() {
        View view;
        WeakReference weakReference = this.f10559;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2270.m4238(view, 262144);
        AbstractC2270.m4239(view, 0);
        AbstractC2270.m4238(view, 1048576);
        AbstractC2270.m4239(view, 0);
        final int i = 5;
        if (this.f10560 != 5) {
            AbstractC2270.m4229(view, C7609.f20645, new InterfaceC7614() { // from class: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏兰哲
                @Override // p155.InterfaceC7614
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
                public final boolean mo340(View view2) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC0053.m146(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f24198;
                    WeakReference weakReference2 = sideSheetBehavior.f10559;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m7204(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f10559.get();
                    RunnableC0876 runnableC0876 = new RunnableC0876(sideSheetBehavior, i2, 4);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(runnableC0876);
                        return true;
                    }
                    runnableC0876.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f10560 != 3) {
            AbstractC2270.m4229(view, C7609.f20648, new InterfaceC7614() { // from class: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏兰哲
                @Override // p155.InterfaceC7614
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
                public final boolean mo340(View view2) {
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(AbstractC0053.m146(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f24198;
                    WeakReference weakReference2 = sideSheetBehavior.f10559;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m7204(i22);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f10559.get();
                    RunnableC0876 runnableC0876 = new RunnableC0876(sideSheetBehavior, i22, 4);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(runnableC0876);
                        return true;
                    }
                    runnableC0876.run();
                    return true;
                }
            });
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
        int i = ((SavedState) parcelable).f10566;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f10560 = i;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7021(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10560 == 1 && actionMasked == 0) {
            return true;
        }
        if (m7202()) {
            this.f10564.m13003(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f10551) != null) {
            velocityTracker.recycle();
            this.f10551 = null;
        }
        if (this.f10551 == null) {
            this.f10551 = VelocityTracker.obtain();
        }
        this.f10551.addMovement(motionEvent);
        if (m7202() && actionMasked == 2 && !this.f10565 && m7202()) {
            float fAbs = Math.abs(this.f10550 - motionEvent.getX());
            C7716 c7716 = this.f10564;
            if (fAbs > c7716.f20940) {
                c7716.m12992(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10565;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7204(int i) {
        View view;
        if (this.f10560 == i) {
            return;
        }
        this.f10560 = i;
        WeakReference weakReference = this.f10559;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f10560 == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f10552.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4568(it);
        }
        m7203();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7005(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iMo11433;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f10559;
        C8651 c8651 = this.f10548;
        int i4 = 0;
        if (weakReference == null) {
            this.f10559 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC7738.m13024(context, R.attr.motionDurationMedium2, 300);
            AbstractC7738.m13024(context, R.attr.motionDurationShort3, 150);
            AbstractC7738.m13024(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c8651 != null) {
                view.setBackground(c8651);
                float elevation = this.f10544;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c8651.m14322(elevation);
            } else {
                ColorStateList colorStateList = this.f10547;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = AbstractC2270.f6593;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.f10560 == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m7203();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC2270.m4223(view) == null) {
                AbstractC2270.m4231(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C7872) view.getLayoutParams()).f21658, i) == 3 ? 1 : 0;
        AbstractC6087 abstractC6087 = this.f10549;
        if (abstractC6087 == null || abstractC6087.mo11439() != i6) {
            C7872 c7872 = null;
            C8648 c8648 = this.f10546;
            if (i6 == 0) {
                this.f10549 = new C8623(this, i3);
                if (c8648 != null) {
                    WeakReference weakReference2 = this.f10559;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C7872)) {
                        c7872 = (C7872) view3.getLayoutParams();
                    }
                    if (c7872 == null || ((ViewGroup.MarginLayoutParams) c7872).rightMargin <= 0) {
                        C8647 c8647M14305 = c8648.m14305();
                        c8647M14305.f24263 = new C8636(0.0f);
                        c8647M14305.f24270 = new C8636(0.0f);
                        C8648 c8648M14301 = c8647M14305.m14301();
                        if (c8651 != null) {
                            c8651.setShapeAppearanceModel(c8648M14301);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    C5919.m11249(AbstractC0053.m161(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.f10549 = new C8623(this, i4);
                if (c8648 != null) {
                    WeakReference weakReference3 = this.f10559;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C7872)) {
                        c7872 = (C7872) view2.getLayoutParams();
                    }
                    if (c7872 == null || ((ViewGroup.MarginLayoutParams) c7872).leftMargin <= 0) {
                        C8647 c8647M143052 = c8648.m14305();
                        c8647M143052.f24264 = new C8636(0.0f);
                        c8647M143052.f24269 = new C8636(0.0f);
                        C8648 c8648M143012 = c8647M143052.m14301();
                        if (c8651 != null) {
                            c8651.setShapeAppearanceModel(c8648M143012);
                        }
                    }
                }
            }
        }
        if (this.f10564 == null) {
            this.f10564 = new C7716(coordinatorLayout.getContext(), coordinatorLayout, this.f10553);
        }
        int iMo114332 = this.f10549.mo11433(view);
        coordinatorLayout.m3929(view, i);
        this.f10555 = coordinatorLayout.getWidth();
        this.f10554 = this.f10549.mo11440(coordinatorLayout);
        this.f10563 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f10558 = marginLayoutParams != null ? this.f10549.mo11442(marginLayoutParams) : 0;
        int i7 = this.f10560;
        if (i7 == 1 || i7 == 2) {
            iMo11433 = iMo114332 - this.f10549.mo11433(view);
        } else if (i7 == 3) {
            iMo11433 = 0;
        } else {
            if (i7 != 5) {
                C5919.m11244(this.f10560, "Unexpected value: ");
                return false;
            }
            iMo11433 = this.f10549.mo11436();
        }
        WeakHashMap weakHashMap2 = AbstractC2270.f6593;
        view.offsetLeftAndRight(iMo11433);
        if (this.f10556 == null && (i2 = this.f10557) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f10556 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f10552.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                C2941.m6336();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3169();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final int f10566;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10566 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10566);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f10566 = sideSheetBehavior.f10560;
        }
    }

    public SideSheetBehavior() {
        this.f10545 = new C1908(this);
        this.f10561 = true;
        this.f10560 = 5;
        this.f10562 = 0.1f;
        this.f10557 = -1;
        this.f10552 = new LinkedHashSet();
        this.f10553 = new C3793(this, 3);
    }
}
