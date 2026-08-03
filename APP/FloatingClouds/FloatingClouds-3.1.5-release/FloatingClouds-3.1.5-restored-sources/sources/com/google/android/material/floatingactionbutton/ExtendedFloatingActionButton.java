package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0402W4;
import p000a.C0861ub;
import p000a.C0866ug;
import p000a.C0944z;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC1058b {

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C1290a extends Property<View, Float> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C1291b extends Property<View, Float> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C1292c extends Property<View, Float> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            return Float.valueOf(view.getPaddingStart());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C1293d extends Property<View, Float> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            return Float.valueOf(view.getPaddingEnd());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new C1290a(Float.class, "width");
        new C1291b(Float.class, "height");
        new C1292c(Float.class, "paddingStart");
        new C1293d(Float.class, "paddingEnd");
    }

    /* JADX INFO: renamed from: e */
    public static void m3227e(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(C0944z.m2225e("Unknown strategy type: ", i));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1058b
    public CoordinatorLayout.AbstractC1059c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public C0861ub getExtendMotionSpec() {
        throw null;
    }

    public C0861ub getHideMotionSpec() {
        throw null;
    }

    public C0861ub getShowMotionSpec() {
        throw null;
    }

    public C0861ub getShrinkMotionSpec() {
        throw null;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(C0861ub c0861ub) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C0861ub.m1990a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C0861ub c0861ub) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C0861ub.m1990a(getContext(), i));
    }

    public void setShowMotionSpec(C0861ub c0861ub) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C0861ub.m1990a(getContext(), i));
    }

    public void setShrinkMotionSpec(C0861ub c0861ub) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C0861ub.m1990a(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC1059c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f5762a;

        /* JADX INFO: renamed from: b */
        public final boolean f5763b;

        /* JADX INFO: renamed from: c */
        public final boolean f5764c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ExtendedFloatingActionButtonBehavior() {
            this.f5763b = false;
            this.f5764c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo2454a(View view) {
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m3228s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C1062f ? ((CoordinatorLayout.C1062f) layoutParams).f4404a instanceof BottomSheetBehavior : false) {
                    m3229t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
        /* JADX INFO: renamed from: h */
        public final boolean mo371h(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListM2443e = coordinatorLayout.m2443e(extendedFloatingActionButton);
            int size = arrayListM2443e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListM2443e.get(i2);
                if (view2 instanceof AppBarLayout) {
                    m3228s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C1062f ? ((CoordinatorLayout.C1062f) layoutParams).f4404a instanceof BottomSheetBehavior : false) {
                        m3229t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.m2448q(extendedFloatingActionButton, i);
            return true;
        }

        /* JADX INFO: renamed from: s */
        public final void m3228s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C1062f c1062f = (CoordinatorLayout.C1062f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f5763b || this.f5764c) && c1062f.f4409f == appBarLayout.getId()) {
                if (this.f5762a == null) {
                    this.f5762a = new Rect();
                }
                Rect rect = this.f5762a;
                C0402W4.m1048a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.m3227e(extendedFloatingActionButton, this.f5764c ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.m3227e(extendedFloatingActionButton, this.f5764c ? 3 : 0);
                throw null;
            }
        }

        /* JADX INFO: renamed from: t */
        public final void m3229t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C1062f c1062f = (CoordinatorLayout.C1062f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f5763b || this.f5764c) && c1062f.f4409f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1062f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.m3227e(extendedFloatingActionButton, this.f5764c ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.m3227e(extendedFloatingActionButton, this.f5764c ? 3 : 0);
                throw null;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f5763b = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f5764c = typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
