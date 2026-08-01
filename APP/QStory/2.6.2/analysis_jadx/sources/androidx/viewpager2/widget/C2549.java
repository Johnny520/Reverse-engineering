package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.animation.core.C0325;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2242;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.AbstractC2536;
import bsh.C2632;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p124.C7412;
import p146.AbstractC7561;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2549 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2542 f7671;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C2242 f7672;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C2543 f7673;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C2540 f7674;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2546 f7675;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C2550 f7676;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0325 f7677;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f7678;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f7679;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f7680;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC2536 f7681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7682;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f7683;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f7684;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Parcelable f7685;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2553 f7686;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2557 f7687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Rect f7688;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2543 f7689;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f7690;

    public C2549(Context context) {
        super(context);
        this.f7690 = new Rect();
        this.f7688 = new Rect();
        C2543 c2543 = new C2543();
        this.f7689 = c2543;
        int i = 0;
        this.f7682 = false;
        this.f7686 = new C2553(this, i);
        this.f7684 = -1;
        this.f7681 = null;
        this.f7680 = false;
        int i2 = 1;
        this.f7679 = true;
        this.f7678 = -1;
        this.f7677 = new C0325(this);
        C2550 c2550 = new C2550(this, context);
        this.f7676 = c2550;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        c2550.setId(View.generateViewId());
        this.f7676.setDescendantFocusability(131072);
        C2557 c2557 = new C2557(this);
        this.f7687 = c2557;
        this.f7676.setLayoutManager(c2557);
        this.f7676.setScrollingTouchSlop(1);
        int[] iArr = AbstractC7561.f20476;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        AbstractC2270.m4233(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f7676.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f7676.addOnChildAttachStateChangeListener(new C2556());
            C2540 c2540 = new C2540(this);
            this.f7674 = c2540;
            this.f7672 = new C2242(c2540, 5);
            C2546 c2546 = new C2546(this);
            this.f7675 = c2546;
            c2546.m4811(this.f7676);
            this.f7676.addOnScrollListener(this.f7674);
            C2543 c25432 = new C2543();
            this.f7673 = c25432;
            this.f7674.f7654 = c25432;
            C2552 c2552 = new C2552(this, i);
            C2552 c25522 = new C2552(this, i2);
            ((ArrayList) c25432.f7664).add(c2552);
            ((ArrayList) this.f7673.f7664).add(c25522);
            C0325 c0325 = this.f7677;
            C2550 c25502 = this.f7676;
            c0325.getClass();
            c25502.setImportantForAccessibility(2);
            c0325.f1094 = new C2553(c0325, i2);
            C2549 c2549 = (C2549) c0325.f1093;
            if (c2549.getImportantForAccessibility() == 0) {
                c2549.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f7673.f7664).add(c2543);
            C2542 c2542 = new C2542();
            this.f7671 = c2542;
            ((ArrayList) this.f7673.f7664).add(c2542);
            C2550 c25503 = this.f7676;
            attachViewToParent(c25503, 0, c25503.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f7676.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f7676.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof ViewPager2$SavedState) {
            int i = ((ViewPager2$SavedState) parcelable).f7648;
            sparseArray.put(this.f7676.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m5045();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f7677.getClass();
        this.f7677.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC2450 getAdapter() {
        return this.f7676.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7683;
    }

    public int getItemDecorationCount() {
        return this.f7676.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7678;
    }

    public int getOrientation() {
        return this.f7687.f7166 == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        C2550 c2550 = this.f7676;
        if (orientation == 0) {
            height = c2550.getWidth() - c2550.getPaddingLeft();
            paddingBottom = c2550.getPaddingRight();
        } else {
            height = c2550.getHeight() - c2550.getPaddingTop();
            paddingBottom = c2550.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7674.f7649;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo4784;
        int iMo47842;
        int iMo47843;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2549 c2549 = (C2549) this.f7677.f1093;
        if (c2549.getAdapter() == null) {
            iMo4784 = 0;
            iMo47842 = 0;
        } else if (c2549.getOrientation() == 1) {
            iMo4784 = c2549.getAdapter().mo4784();
            iMo47842 = 1;
        } else {
            iMo47842 = c2549.getAdapter().mo4784();
            iMo4784 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C7412.m12616(iMo4784, iMo47842, 0).f20104);
        AbstractC2450 adapter = c2549.getAdapter();
        if (adapter == null || (iMo47843 = adapter.mo4784()) == 0 || !c2549.f7679) {
            return;
        }
        if (c2549.f7683 > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (c2549.f7683 < iMo47843 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2550 c2550 = this.f7676;
        int measuredWidth = c2550.getMeasuredWidth();
        int measuredHeight = c2550.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7690;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f7688;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        c2550.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7682) {
            m5043();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f7676, i, i2);
        int measuredWidth = this.f7676.getMeasuredWidth();
        int measuredHeight = this.f7676.getMeasuredHeight();
        int measuredState = this.f7676.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager2$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager2$SavedState viewPager2$SavedState = (ViewPager2$SavedState) parcelable;
        super.onRestoreInstanceState(viewPager2$SavedState.getSuperState());
        this.f7684 = viewPager2$SavedState.f7646;
        this.f7685 = viewPager2$SavedState.f7647;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager2$SavedState viewPager2$SavedState = new ViewPager2$SavedState(super.onSaveInstanceState());
        C2550 c2550 = this.f7676;
        viewPager2$SavedState.f7648 = c2550.getId();
        int i = this.f7684;
        if (i == -1) {
            i = this.f7683;
        }
        viewPager2$SavedState.f7646 = i;
        Parcelable parcelable = this.f7685;
        if (parcelable != null) {
            viewPager2$SavedState.f7647 = parcelable;
            return viewPager2$SavedState;
        }
        c2550.getAdapter();
        return viewPager2$SavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(C2549.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        C0325 c0325 = this.f7677;
        c0325.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        c0325.getClass();
        C2549 c2549 = (C2549) c0325.f1093;
        if (i != 8192 && i != 4096) {
            C2632.m5296();
            return false;
        }
        int currentItem = i == 8192 ? c2549.getCurrentItem() - 1 : c2549.getCurrentItem() + 1;
        if (c2549.f7679) {
            c2549.m5044(currentItem);
        }
        return true;
    }

    public void setAdapter(AbstractC2450 abstractC2450) {
        C2550 c2550 = this.f7676;
        AbstractC2450 adapter = c2550.getAdapter();
        C0325 c0325 = this.f7677;
        if (adapter != null) {
            adapter.f7297.unregisterObserver((C2553) c0325.f1094);
        } else {
            c0325.getClass();
        }
        C2553 c2553 = this.f7686;
        if (adapter != null) {
            adapter.f7297.unregisterObserver(c2553);
        }
        c2550.setAdapter(abstractC2450);
        this.f7683 = 0;
        m5045();
        c0325.m993();
        if (abstractC2450 != null) {
            abstractC2450.f7297.registerObserver((C2553) c0325.f1094);
        }
        if (abstractC2450 != null) {
            abstractC2450.f7297.registerObserver(c2553);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.f7672.f6536;
        m5044(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f7677.m993();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            C5919.m11249("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f7678 = i;
            this.f7676.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.f7687.m4673(i);
        this.f7677.m993();
    }

    public void setPageTransformer(InterfaceC2547 interfaceC2547) {
        boolean z = this.f7680;
        if (interfaceC2547 != null) {
            if (!z) {
                this.f7681 = this.f7676.getItemAnimator();
                this.f7680 = true;
            }
            this.f7676.setItemAnimator(null);
        } else if (z) {
            this.f7676.setItemAnimator(this.f7681);
            this.f7681 = null;
            this.f7680 = false;
        }
        this.f7671.getClass();
        if (interfaceC2547 == null) {
            return;
        }
        this.f7671.getClass();
        this.f7671.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.f7679 = z;
        this.f7677.m993();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5043() {
        C2546 c2546 = this.f7675;
        if (c2546 == null) {
            C5919.m11250("Design assumption violated.");
            return;
        }
        C2557 c2557 = this.f7687;
        View viewMo4809 = c2546.mo4809(c2557);
        if (viewMo4809 == null) {
            return;
        }
        c2557.getClass();
        int iM4973 = AbstractC2519.m4973(viewMo4809);
        if (iM4973 != this.f7683 && getScrollState() == 0) {
            this.f7673.mo5039(iM4973);
        }
        this.f7682 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5044(int i) {
        C2543 c2543;
        AbstractC2450 adapter = getAdapter();
        if (adapter == null) {
            if (this.f7684 != -1) {
                this.f7684 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo4784() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.mo4784() - 1);
        int i2 = this.f7683;
        C2540 c2540 = this.f7674;
        if ((iMin == i2 && c2540.f7649 == 0) || iMin == i2) {
            return;
        }
        double d = i2;
        this.f7683 = iMin;
        this.f7677.m993();
        if (c2540.f7649 != 0) {
            c2540.m5036();
            C2541 c2541 = c2540.f7656;
            d = ((double) c2541.f7663) + ((double) c2541.f7662);
        }
        c2540.getClass();
        c2540.f7650 = 2;
        boolean z = c2540.f7659 != iMin;
        c2540.f7659 = iMin;
        c2540.m5038(2);
        if (z && (c2543 = c2540.f7654) != null) {
            c2543.mo5039(iMin);
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        C2550 c2550 = this.f7676;
        if (dAbs <= 3.0d) {
            c2550.m4734(iMin);
        } else {
            c2550.m4736(d2 > d ? iMin - 3 : iMin + 3);
            c2550.post(new RunnableC2548(iMin, c2550));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5045() {
        AbstractC2450 adapter;
        if (this.f7684 == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f7685 != null) {
            this.f7685 = null;
        }
        int iMax = Math.max(0, Math.min(this.f7684, adapter.mo4784() - 1));
        this.f7683 = iMax;
        this.f7684 = -1;
        this.f7676.m4736(iMax);
        this.f7677.m993();
    }
}
