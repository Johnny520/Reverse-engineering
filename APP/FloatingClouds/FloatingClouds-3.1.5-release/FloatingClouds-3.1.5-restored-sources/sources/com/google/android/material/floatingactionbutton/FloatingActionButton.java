package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C1297b;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0117G6;
import p000a.C0393Vd;
import p000a.C0402W4;
import p000a.C0434Y0;
import p000a.C0468Zg;
import p000a.C0598ge;
import p000a.C0628i6;
import p000a.C0757p2;
import p000a.C0776q2;
import p000a.C0861ub;
import p000a.InterfaceC0465Zd;
import p000a.InterfaceC0590g6;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButton extends C0468Zg implements InterfaceC0590g6, InterfaceC0465Zd, CoordinatorLayout.InterfaceC1058b {

    /* JADX INFO: renamed from: b */
    public ColorStateList f5765b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f5766c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f5767d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f5768e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f5769f;

    /* JADX INFO: renamed from: g */
    public int f5770g;

    /* JADX INFO: renamed from: h */
    public int f5771h;

    /* JADX INFO: renamed from: i */
    public boolean f5772i;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC1294a {
        /* JADX INFO: renamed from: a */
        public void mo1819a(FloatingActionButton floatingActionButton) {
        }

        /* JADX INFO: renamed from: b */
        public void mo1820b() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C1295b<T extends FloatingActionButton> implements C1297b.a {
        @Override // com.google.android.material.floatingactionbutton.C1297b.a
        /* JADX INFO: renamed from: a */
        public final void mo3241a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1295b)) {
                return false;
            }
            ((C1295b) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private C1297b getImpl() {
        return null;
    }

    @Override // p000a.InterfaceC0590g6
    /* JADX INFO: renamed from: a */
    public final boolean mo1425a() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m3230b() {
        C1297b impl = getImpl();
        if (impl.f5794n == null) {
            impl.f5794n = new ArrayList<>();
        }
        impl.f5794n.add(null);
    }

    /* JADX INFO: renamed from: c */
    public final void m3231c(C0757p2 c0757p2) {
        C1297b impl = getImpl();
        if (impl.f5793m == null) {
            impl.f5793m = new ArrayList<>();
        }
        impl.f5793m.add(c0757p2);
    }

    /* JADX INFO: renamed from: d */
    public final void m3232d() {
        C1297b impl = getImpl();
        C1295b c1295b = new C1295b();
        if (impl.f5795o == null) {
            impl.f5795o = new ArrayList<>();
        }
        impl.f5795o.add(c1295b);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1297b impl = getImpl();
        getDrawableState();
        impl.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final int m3233e(int i) {
        int i2 = this.f5771h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(C1247R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(C1247R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m3233e(1) : m3233e(0);
    }

    /* JADX INFO: renamed from: f */
    public final void m3234f(C0776q2 c0776q2, boolean z) {
        C1297b impl = getImpl();
        if (c0776q2 != null) {
            new C1296a(this, c0776q2);
        }
        impl.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3235g() {
        getImpl().getClass();
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f5765b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f5766c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1058b
    public CoordinatorLayout.AbstractC1059c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        getImpl().getClass();
        throw null;
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f5784d;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f5785e;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f5771h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C0861ub getHideMotionSpec() {
        return getImpl().f5788h;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f5769f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f5769f;
    }

    public C0393Vd getShapeAppearanceModel() {
        C0393Vd c0393Vd = getImpl().f5781a;
        c0393Vd.getClass();
        return c0393Vd;
    }

    public C0861ub getShowMotionSpec() {
        return getImpl().f5787g;
    }

    public int getSize() {
        return this.f5770g;
    }

    public int getSizeDimension() {
        return m3233e(this.f5770g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f5767d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f5768e;
    }

    public boolean getUseCompatPadding() {
        return this.f5772i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3236h() {
        getImpl().getClass();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final void m3237i() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f5767d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f5768e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0434Y0.m1081c(colorForState, mode));
    }

    /* JADX INFO: renamed from: j */
    public final void m3238j(C0776q2.a aVar, boolean z) {
        C1297b impl = getImpl();
        if (aVar != null) {
            new C1296a(this, aVar);
        }
        impl.getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1297b impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C0117G6)) {
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        getSizeDimension();
        getImpl().m3247f();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0628i6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0628i6 c0628i6 = (C0628i6) parcelable;
        super.onRestoreInstanceState(c0628i6.f3119a);
        c0628i6.f2305c.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new C0598ge();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f5765b != colorStateList) {
            this.f5765b = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f5766c != mode) {
            this.f5766c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        C1297b impl = getImpl();
        if (impl.f5783c != f) {
            impl.f5783c = f;
            impl.m3245d(f, impl.f5784d, impl.f5785e);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C1297b impl = getImpl();
        if (impl.f5784d != f) {
            impl.f5784d = f;
            impl.m3245d(impl.f5783c, f, impl.f5785e);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C1297b impl = getImpl();
        if (impl.f5785e != f) {
            impl.f5785e = f;
            impl.m3245d(impl.f5783c, impl.f5784d, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f5771h) {
            this.f5771h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f5782b) {
            getImpl().f5782b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C0861ub c0861ub) {
        getImpl().f5788h = c0861ub;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0861ub.m1990a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() == drawable) {
            return;
        }
        super.setImageDrawable(drawable);
        C1297b impl = getImpl();
        float f = impl.f5790j;
        impl.f5790j = f;
        impl.m3242a(f, null);
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setMaxImageSize(int i) {
        C1297b impl = getImpl();
        if (impl.f5791k == i) {
            return;
        }
        impl.f5791k = i;
        float f = impl.f5790j;
        impl.f5790j = f;
        impl.m3242a(f, null);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<C1297b.a> arrayList = getImpl().f5795o;
        if (arrayList != null) {
            Iterator<C1297b.a> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().mo3241a();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<C1297b.a> arrayList = getImpl().f5795o;
        if (arrayList != null) {
            Iterator<C1297b.a> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().mo3241a();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        C1297b impl = getImpl();
        impl.getClass();
        impl.m3247f();
        throw null;
    }

    @Override // p000a.InterfaceC0465Zd
    public void setShapeAppearanceModel(C0393Vd c0393Vd) {
        getImpl().f5781a = c0393Vd;
    }

    public void setShowMotionSpec(C0861ub c0861ub) {
        getImpl().f5787g = c0861ub;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0861ub.m1990a(getContext(), i));
    }

    public void setSize(int i) {
        this.f5771h = 0;
        if (i != this.f5770g) {
            this.f5770g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f5767d != colorStateList) {
            this.f5767d = colorStateList;
            m3237i();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f5768e != mode) {
            this.f5768e = mode;
            m3237i();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m3246e();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m3246e();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m3246e();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5772i == z) {
            return;
        }
        this.f5772i = z;
        getImpl().getClass();
        throw null;
    }

    @Override // p000a.C0468Zg, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC1059c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f5773a;

        /* JADX INFO: renamed from: b */
        public final boolean f5774b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public BaseBehavior() {
            this.f5774b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: a */
        public final boolean mo2454a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: c */
        public final void mo2456c(CoordinatorLayout.C1062f c1062f) {
            if (c1062f.f4411h == 0) {
                c1062f.f4411h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: d */
        public final boolean mo2457d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m3239s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C1062f ? ((CoordinatorLayout.C1062f) layoutParams).f4404a instanceof BottomSheetBehavior : false) {
                    m3240t(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: h */
        public final boolean mo371h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListM2443e = coordinatorLayout.m2443e(floatingActionButton);
            int size = arrayListM2443e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListM2443e.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C1062f ? ((CoordinatorLayout.C1062f) layoutParams).f4404a instanceof BottomSheetBehavior : false) && m3240t(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m3239s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m2448q(floatingActionButton, i);
            return true;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m3239s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f5774b && ((CoordinatorLayout.C1062f) floatingActionButton.getLayoutParams()).f4409f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f5773a == null) {
                this.f5773a = new Rect();
            }
            Rect rect = this.f5773a;
            C0402W4.m1048a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m3234f(null, false);
            } else {
                floatingActionButton.m3238j(null, false);
            }
            return true;
        }

        /* JADX INFO: renamed from: t */
        public final boolean m3240t(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f5774b && ((CoordinatorLayout.C1062f) floatingActionButton.getLayoutParams()).f4409f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1062f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m3234f(null, false);
            } else {
                floatingActionButton.m3238j(null, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.FloatingActionButton_Behavior_Layout);
            this.f5774b = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f5769f != colorStateList) {
            this.f5769f = colorStateList;
            getImpl().getClass();
        }
    }
}
