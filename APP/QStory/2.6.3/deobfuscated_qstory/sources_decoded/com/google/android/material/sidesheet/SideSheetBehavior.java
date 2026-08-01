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
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lxj.xpopup.widget.C3794;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p155.C7610;
import p155.InterfaceC7615;
import p169.C7717;
import p175.AbstractC7739;
import p201.AbstractC7876;
import p201.C7873;
import p304.C8615;
import p305.C8628;
import p305.C8639;
import p305.C8640;
import p305.C8643;
import p314.AbstractC8661;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC7876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f10549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1908 f10550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8640 f10551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ColorStateList f10552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8643 f10553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC4922 f10554;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10555;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public VelocityTracker f10556;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final LinkedHashSet f10557;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3794 f10558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f10559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f10560;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public WeakReference f10561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f10562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f10563;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f10564;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f10565;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f10566;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f10567;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f10568;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7717 f10569;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f10570;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f10550 = new C1908(this);
        this.f10566 = true;
        this.f10565 = 5;
        this.f10567 = 0.1f;
        this.f10562 = -1;
        this.f10557 = new LinkedHashSet();
        this.f10558 = new C3794(this, 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8661.f24422);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10552 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f10551 = C8640.m14321(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m14319();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f10562 = resourceId;
            WeakReference weakReference = this.f10561;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f10561 = null;
            WeakReference weakReference2 = this.f10564;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C8640 c8640 = this.f10551;
        if (c8640 != null) {
            C8643 c8643 = new C8643(c8640);
            this.f10553 = c8643;
            c8643.m14338(context);
            ColorStateList colorStateList = this.f10552;
            if (colorStateList != null) {
                this.f10553.m14341(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f10553.setTint(typedValue.data);
            }
        }
        this.f10549 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f10566 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7007(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C7717 c7717;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC2270.m4233(view) == null) || !this.f10566) {
            this.f10570 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f10556) != null) {
            velocityTracker.recycle();
            this.f10556 = null;
        }
        if (this.f10556 == null) {
            this.f10556 = VelocityTracker.obtain();
        }
        this.f10556.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f10555 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f10570) {
            this.f10570 = false;
            return false;
        }
        return (this.f10570 || (c7717 = this.f10569) == null || !c7717.m13027(motionEvent)) ? false : true;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo7026() {
        this.f10564 = null;
        this.f10569 = null;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7027(C7873 c7873) {
        this.f10564 = null;
        this.f10569 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7188(View view, int i, boolean z) {
        int iMo9909;
        if (i == 3) {
            iMo9909 = this.f10554.mo9909();
        } else {
            if (i != 5) {
                C5925.m11310(AbstractC6183.m11588(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iMo9909 = this.f10554.mo9910();
        }
        C7717 c7717 = this.f10569;
        if (c7717 == null || (!z ? c7717.m13028(view, iMo9909, view.getTop()) : c7717.m13024(iMo9909, view.getTop()))) {
            m7191(i);
        } else {
            m7191(2);
            this.f10550.m3606(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m7189() {
        if (this.f10569 != null) {
            return this.f10566 || this.f10565 == 1;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7190() {
        View view;
        WeakReference weakReference = this.f10564;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2270.m4248(view, 262144);
        AbstractC2270.m4249(view, 0);
        AbstractC2270.m4248(view, 1048576);
        AbstractC2270.m4249(view, 0);
        final int i = 5;
        if (this.f10565 != 5) {
            AbstractC2270.m4239(view, C7610.f20640, new InterfaceC7615() { // from class: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏兰哲
                @Override // p155.InterfaceC7615
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
                public final boolean mo341(View view2) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(AbstractC0053.m151(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f24189;
                    WeakReference weakReference2 = sideSheetBehavior.f10564;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m7191(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f10564.get();
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
        if (this.f10565 != 3) {
            AbstractC2270.m4239(view, C7610.f20643, new InterfaceC7615() { // from class: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏兰哲
                @Override // p155.InterfaceC7615
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
                public final boolean mo341(View view2) {
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(AbstractC0053.m151(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f24189;
                    WeakReference weakReference2 = sideSheetBehavior.f10564;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m7191(i22);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f10564.get();
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

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Parcelable mo6988(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo6989(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).f10571;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f10565 = i;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7008(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10565 == 1 && actionMasked == 0) {
            return true;
        }
        if (m7189()) {
            this.f10569.m13033(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f10556) != null) {
            velocityTracker.recycle();
            this.f10556 = null;
        }
        if (this.f10556 == null) {
            this.f10556 = VelocityTracker.obtain();
        }
        this.f10556.addMovement(motionEvent);
        if (m7189() && actionMasked == 2 && !this.f10570 && m7189()) {
            float fAbs = Math.abs(this.f10555 - motionEvent.getX());
            C7717 c7717 = this.f10569;
            if (fAbs > c7717.f20935) {
                c7717.m13022(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f10570;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m7191(int i) {
        View view;
        if (this.f10565 == i) {
            return;
        }
        this.f10565 = i;
        WeakReference weakReference = this.f10564;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f10565 == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f10557.iterator();
        if (it.hasNext()) {
            throw AbstractC2442.m4578(it);
        }
        m7190();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo6992(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6993(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iMo9908;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f10564;
        C8643 c8643 = this.f10553;
        int i4 = 0;
        if (weakReference == null) {
            this.f10564 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            AbstractC6347.m11922(context, R.attr.motionDurationMedium2, 300);
            AbstractC6347.m11922(context, R.attr.motionDurationShort3, 150);
            AbstractC6347.m11922(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c8643 != null) {
                view.setBackground(c8643);
                float elevation = this.f10549;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                c8643.m14340(elevation);
            } else {
                ColorStateList colorStateList = this.f10552;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = AbstractC2270.f6594;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.f10565 == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m7190();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC2270.m4233(view) == null) {
                AbstractC2270.m4241(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C7873) view.getLayoutParams()).f21655, i) == 3 ? 1 : 0;
        AbstractC4922 abstractC4922 = this.f10554;
        if (abstractC4922 == null || abstractC4922.mo9906() != i6) {
            C7873 c7873 = null;
            C8640 c8640 = this.f10551;
            if (i6 == 0) {
                this.f10554 = new C8615(this, i3);
                if (c8640 != null) {
                    WeakReference weakReference2 = this.f10564;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof C7873)) {
                        c7873 = (C7873) view3.getLayoutParams();
                    }
                    if (c7873 == null || ((ViewGroup.MarginLayoutParams) c7873).rightMargin <= 0) {
                        C8639 c8639M14323 = c8640.m14323();
                        c8639M14323.f24254 = new C8628(0.0f);
                        c8639M14323.f24261 = new C8628(0.0f);
                        C8640 c8640M14319 = c8639M14323.m14319();
                        if (c8643 != null) {
                            c8643.setShapeAppearanceModel(c8640M14319);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    C5925.m11310(AbstractC0053.m162(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.f10554 = new C8615(this, i4);
                if (c8640 != null) {
                    WeakReference weakReference3 = this.f10564;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof C7873)) {
                        c7873 = (C7873) view2.getLayoutParams();
                    }
                    if (c7873 == null || ((ViewGroup.MarginLayoutParams) c7873).leftMargin <= 0) {
                        C8639 c8639M143232 = c8640.m14323();
                        c8639M143232.f24255 = new C8628(0.0f);
                        c8639M143232.f24260 = new C8628(0.0f);
                        C8640 c8640M143192 = c8639M143232.m14319();
                        if (c8643 != null) {
                            c8643.setShapeAppearanceModel(c8640M143192);
                        }
                    }
                }
            }
        }
        if (this.f10569 == null) {
            this.f10569 = new C7717(coordinatorLayout.getContext(), coordinatorLayout, this.f10558);
        }
        int iMo99082 = this.f10554.mo9908(view);
        coordinatorLayout.m3939(view, i);
        this.f10560 = coordinatorLayout.getWidth();
        this.f10559 = this.f10554.mo9905(coordinatorLayout);
        this.f10568 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f10563 = marginLayoutParams != null ? this.f10554.mo9912(marginLayoutParams) : 0;
        int i7 = this.f10565;
        if (i7 == 1 || i7 == 2) {
            iMo9908 = iMo99082 - this.f10554.mo9908(view);
        } else if (i7 == 3) {
            iMo9908 = 0;
        } else {
            if (i7 != 5) {
                C5925.m11305(this.f10565, "Unexpected value: ");
                return false;
            }
            iMo9908 = this.f10554.mo9910();
        }
        WeakHashMap weakHashMap2 = AbstractC2270.f6594;
        view.offsetLeftAndRight(iMo9908);
        if (this.f10561 == null && (i2 = this.f10562) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f10561 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f10557.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                C2942.m6394();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3170();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public final int f10571;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10571 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10571);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f10571 = sideSheetBehavior.f10565;
        }
    }

    public SideSheetBehavior() {
        this.f10550 = new C1908(this);
        this.f10566 = true;
        this.f10565 = 5;
        this.f10567 = 0.1f;
        this.f10562 = -1;
        this.f10557 = new LinkedHashSet();
        this.f10558 = new C3794(this, 3);
    }
}
