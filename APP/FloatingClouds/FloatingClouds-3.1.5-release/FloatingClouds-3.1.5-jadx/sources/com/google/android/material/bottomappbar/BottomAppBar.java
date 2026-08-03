package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0181Jg;
import p000a.C0324Rg;
import p000a.C0598ge;
import p000a.C0726n9;
import p000a.C0757p2;
import p000a.C0776q2;
import p000a.C0795r2;
import p000a.C0814s2;
import p000a.C0866ug;
import p000a.C0888w0;
import p000a.C0893w5;
import p000a.C0899wb;

/* JADX INFO: loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC1058b {

    /* JADX INFO: renamed from: i0 */
    public static final int f5410i0 = C1247R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: j0 */
    public static final int f5411j0 = C1247R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: U */
    public Integer f5412U;

    /* JADX INFO: renamed from: V */
    public AnimatorSet f5413V;

    /* JADX INFO: renamed from: W */
    public AnimatorSet f5414W;

    /* JADX INFO: renamed from: a0 */
    public int f5415a0;

    /* JADX INFO: renamed from: b0 */
    public int f5416b0;

    /* JADX INFO: renamed from: c0 */
    public int f5417c0;

    /* JADX INFO: renamed from: d0 */
    public int f5418d0;

    /* JADX INFO: renamed from: e0 */
    public int f5419e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f5420f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f5421g0;

    /* JADX INFO: renamed from: h0 */
    public Behavior f5422h0;

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class RunnableC1258a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActionMenuView f5428a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5429b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f5430c;

        public RunnableC1258a(ActionMenuView actionMenuView, int i, boolean z) {
            this.f5428a = actionMenuView;
            this.f5429b = i;
            this.f5430c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f5429b;
            boolean z = this.f5430c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.f5428a.setTranslationX(bottomAppBar.m3089A(r3, i, z));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public static class C1259b extends AbstractC0792r {
        public static final Parcelable.Creator<C1259b> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public int f5432c;

        /* JADX INFO: renamed from: d */
        public boolean f5433d;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        public class a implements Parcelable.ClassLoaderCreator<C1259b> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1259b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1259b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1259b[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1259b(parcel, null);
            }
        }

        public C1259b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5432c = parcel.readInt();
            this.f5433d = parcel.readInt() != 0;
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5432c);
            parcel.writeInt(this.f5433d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C0899wb.m2187c(getContext(), f5410i0, 300);
    }

    private float getFabTranslationX() {
        return m3090B(this.f5415a0);
    }

    private float getFabTranslationY() {
        if (this.f5417c0 == 1) {
            return -getTopEdgeTreatment().f3215c;
        }
        return m3094z() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private C0814s2 getTopEdgeTreatment() {
        throw null;
    }

    /* JADX INFO: renamed from: A */
    public final int m3089A(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.f5419e0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zM895a = C0324Rg.m895a(this);
        int measuredWidth = zM895a ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C1034g) && (((Toolbar.C1034g) childAt.getLayoutParams()).f674a & 8388615) == 8388611) {
                measuredWidth = zM895a ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zM895a ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C1247R.dimen.m3_bottomappbar_horizontal_padding);
            i2 = zM895a ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - (right + i2);
    }

    /* JADX INFO: renamed from: B */
    public final float m3090B(int i) {
        boolean zM895a = C0324Rg.m895a(this);
        if (i != 1) {
            return 0.0f;
        }
        return ((getMeasuredWidth() / 2) - ((this.f5418d0 == -1 || m3094z() == null) ? 0 : (r5.getMeasuredWidth() / 2) + this.f5418d0)) * (zM895a ? -1 : 1);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m3091C() {
        View viewM3094z = m3094z();
        FloatingActionButton floatingActionButton = viewM3094z instanceof FloatingActionButton ? (FloatingActionButton) viewM3094z : null;
        return floatingActionButton != null && floatingActionButton.m3236h();
    }

    /* JADX INFO: renamed from: D */
    public final void m3092D() {
        C0814s2 topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f5421g0 && m3091C()) {
            int i = this.f5417c0;
        }
        throw null;
    }

    /* JADX INFO: renamed from: E */
    public final void m3093E(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC1258a runnableC1258a = new RunnableC1258a(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC1258a);
        } else {
            runnableC1258a.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f3215c;
    }

    public int getFabAlignmentMode() {
        return this.f5415a0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f5418d0;
    }

    public int getFabAnchorMode() {
        return this.f5417c0;
    }

    public int getFabAnimationMode() {
        return this.f5416b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f3214b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f3213a;
    }

    public boolean getHideOnScroll() {
        return this.f5420f0;
    }

    public int getMenuAlignmentMode() {
        return this.f5419e0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0726n9.m1659A(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.f5414W;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f5413V;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            m3092D();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f5414W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m3091C()) {
            m3093E(actionMenuView, this.f5415a0, this.f5421g0, false);
        } else {
            m3093E(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1259b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1259b c1259b = (C1259b) parcelable;
        super.onRestoreInstanceState(c1259b.f3119a);
        this.f5415a0 = c1259b.f5432c;
        this.f5421g0 = c1259b.f5433d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1259b c1259b = new C1259b(super.onSaveInstanceState());
        c1259b.f5432c = this.f5415a0;
        c1259b.f5433d = this.f5421g0;
        return c1259b;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0893w5.a.m2176h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C0814s2 topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.f3215c = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        boolean z = this.f5421g0;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.f5414W;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (m3091C()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - m3089A(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new C0795r2(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.f5414W = animatorSet3;
            animatorSet3.addListener(new C0757p2(this, 1));
            this.f5414W.start();
        }
        if (this.f5415a0 != i && isLaidOut()) {
            AnimatorSet animatorSet4 = this.f5413V;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f5416b0 == 1) {
                View viewM3094z = m3094z();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewM3094z instanceof FloatingActionButton ? (FloatingActionButton) viewM3094z : null, "translationX", m3090B(i));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewM3094z2 = m3094z();
                FloatingActionButton floatingActionButton = viewM3094z2 instanceof FloatingActionButton ? (FloatingActionButton) viewM3094z2 : null;
                if (floatingActionButton != null && !floatingActionButton.m3235g()) {
                    floatingActionButton.m3234f(new C0776q2(this, i), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(C0899wb.m2188d(getContext(), f5411j0, C0888w0.f3468a));
            this.f5413V = animatorSet5;
            animatorSet5.addListener(new C0757p2(this, 0));
            this.f5413V.start();
        }
        this.f5415a0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.f5418d0 == i) {
            return;
        }
        this.f5418d0 = i;
        m3092D();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.f5417c0 = i;
        m3092D();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.f5416b0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().f3216d) {
            return;
        }
        getTopEdgeTreatment().f3216d = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f3214b = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f3213a = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f5420f0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f5419e0 != i) {
            this.f5419e0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m3093E(actionMenuView, this.f5415a0, m3091C(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f5412U != null) {
            drawable = drawable.mutate();
            C0893w5.a.m2175g(drawable, this.f5412U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f5412U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: z */
    public final View m3094z() {
        if (getParent() instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
            List list = (List) ((C0598ge) coordinatorLayout.f4384b.f24b).getOrDefault(this, null);
            ArrayList<View> arrayList = coordinatorLayout.f4386d;
            arrayList.clear();
            if (list != null) {
                arrayList.addAll(list);
            }
            for (View view : arrayList) {
                if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                    return view;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c; */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1058b
    public Behavior getBehavior() {
        if (this.f5422h0 == null) {
            this.f5422h0 = new Behavior();
        }
        return this.f5422h0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: l */
        public final Rect f5423l;

        /* JADX INFO: renamed from: m */
        public WeakReference<BottomAppBar> f5424m;

        /* JADX INFO: renamed from: n */
        public int f5425n;

        /* JADX INFO: renamed from: o */
        public final ViewOnLayoutChangeListenerC1257a f5426o;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC1257a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC1257a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f5424m.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f5423l.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                CoordinatorLayout.C1062f c1062f = (CoordinatorLayout.C1062f) view.getLayoutParams();
                if (behavior.f5425n == 0) {
                    if (bottomAppBar.f5417c0 == 1) {
                        ((ViewGroup.MarginLayoutParams) c1062f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C1247R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) c1062f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c1062f).rightMargin = bottomAppBar.getRightInset();
                    if (C0324Rg.m895a(view)) {
                        ((ViewGroup.MarginLayoutParams) c1062f).leftMargin = ((ViewGroup.MarginLayoutParams) c1062f).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c1062f).rightMargin = ((ViewGroup.MarginLayoutParams) c1062f).rightMargin;
                    }
                }
                int i9 = BottomAppBar.f5410i0;
                bottomAppBar.m3092D();
                throw null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
            this.f5426o = new ViewOnLayoutChangeListenerC1257a();
            this.f5423l = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: h */
        public final boolean mo371h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f5424m = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f5410i0;
            View viewM3094z = bottomAppBar.m3094z();
            if (viewM3094z != null) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                if (!viewM3094z.isLaidOut()) {
                    CoordinatorLayout.C1062f c1062f = (CoordinatorLayout.C1062f) viewM3094z.getLayoutParams();
                    c1062f.f4407d = 17;
                    int i3 = bottomAppBar.f5417c0;
                    if (i3 == 1) {
                        c1062f.f4407d = 49;
                    }
                    if (i3 == 0) {
                        c1062f.f4407d |= 80;
                    }
                    this.f5425n = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1062f) viewM3094z.getLayoutParams())).bottomMargin;
                    if (viewM3094z instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewM3094z;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(C1247R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(C1247R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.m3230b();
                        floatingActionButton.m3231c(new C0757p2(bottomAppBar, 2));
                        floatingActionButton.m3232d();
                    }
                    viewM3094z.addOnLayoutChangeListener(this.f5426o);
                    bottomAppBar.m3092D();
                    throw null;
                }
            }
            coordinatorLayout.m2448q(bottomAppBar, i);
            super.mo371h(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: p */
        public final boolean mo2466p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.mo2466p(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5426o = new ViewOnLayoutChangeListenerC1257a();
            this.f5423l = new Rect();
        }
    }
}
