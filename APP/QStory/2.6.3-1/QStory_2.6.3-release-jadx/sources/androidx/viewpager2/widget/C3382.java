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
import androidx.compose.animation.core.C1171;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3075;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.AbstractC3369;
import bsh.C3466;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p140.C8242;
import p162.AbstractC8391;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3382 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3375 f8017;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C3075 f8018;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C3376 f8019;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C3373 f8020;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C3379 f8021;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C3383 f8022;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1171 f8023;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f8024;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f8025;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f8026;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AbstractC3369 f8027;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f8028;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f8029;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f8030;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Parcelable f8031;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3386 f8032;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3390 f8033;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Rect f8034;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3376 f8035;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f8036;

    public C3382(Context context) {
        super(context);
        this.f8036 = new Rect();
        this.f8034 = new Rect();
        C3376 c3376 = new C3376();
        this.f8035 = c3376;
        int i = 0;
        this.f8028 = false;
        this.f8032 = new C3386(this, i);
        this.f8030 = -1;
        this.f8027 = null;
        this.f8026 = false;
        int i2 = 1;
        this.f8025 = true;
        this.f8024 = -1;
        this.f8023 = new C1171(this);
        C3383 c3383 = new C3383(this, context);
        this.f8022 = c3383;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        c3383.setId(View.generateViewId());
        this.f8022.setDescendantFocusability(131072);
        C3390 c3390 = new C3390(this);
        this.f8033 = c3390;
        this.f8022.setLayoutManager(c3390);
        this.f8022.setScrollingTouchSlop(1);
        int[] iArr = AbstractC8391.f20816;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        AbstractC3103.m4803(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f8022.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f8022.addOnChildAttachStateChangeListener(new C3389());
            C3373 c3373 = new C3373(this);
            this.f8020 = c3373;
            this.f8018 = new C3075(c3373, 5);
            C3379 c3379 = new C3379(this);
            this.f8021 = c3379;
            c3379.m5381(this.f8022);
            this.f8022.addOnScrollListener(this.f8020);
            C3376 c33762 = new C3376();
            this.f8019 = c33762;
            this.f8020.f8000 = c33762;
            C3385 c3385 = new C3385(this, i);
            C3385 c33852 = new C3385(this, i2);
            ((ArrayList) c33762.f8010).add(c3385);
            ((ArrayList) this.f8019.f8010).add(c33852);
            C1171 c1171 = this.f8023;
            C3383 c33832 = this.f8022;
            c1171.getClass();
            c33832.setImportantForAccessibility(2);
            c1171.f1439 = new C3386(c1171, i2);
            C3382 c3382 = (C3382) c1171.f1438;
            if (c3382.getImportantForAccessibility() == 0) {
                c3382.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f8019.f8010).add(c3376);
            C3375 c3375 = new C3375();
            this.f8017 = c3375;
            ((ArrayList) this.f8019.f8010).add(c3375);
            C3383 c33833 = this.f8022;
            attachViewToParent(c33833, 0, c33833.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f8022.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f8022.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof ViewPager2$SavedState) {
            int i = ((ViewPager2$SavedState) parcelable).f7994;
            sparseArray.put(this.f8022.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m5615();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f8023.getClass();
        this.f8023.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC3283 getAdapter() {
        return this.f8022.getAdapter();
    }

    public int getCurrentItem() {
        return this.f8029;
    }

    public int getItemDecorationCount() {
        return this.f8022.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f8024;
    }

    public int getOrientation() {
        return this.f8033.f7512 == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        C3383 c3383 = this.f8022;
        if (orientation == 0) {
            height = c3383.getWidth() - c3383.getPaddingLeft();
            paddingBottom = c3383.getPaddingRight();
        } else {
            height = c3383.getHeight() - c3383.getPaddingTop();
            paddingBottom = c3383.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f8020.f7995;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo5354;
        int iMo53542;
        int iMo53543;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3382 c3382 = (C3382) this.f8023.f1438;
        if (c3382.getAdapter() == null) {
            iMo5354 = 0;
            iMo53542 = 0;
        } else if (c3382.getOrientation() == 1) {
            iMo5354 = c3382.getAdapter().mo5354();
            iMo53542 = 1;
        } else {
            iMo53542 = c3382.getAdapter().mo5354();
            iMo5354 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C8242.m13202(iMo5354, iMo53542, 0).f20444);
        AbstractC3283 adapter = c3382.getAdapter();
        if (adapter == null || (iMo53543 = adapter.mo5354()) == 0 || !c3382.f8025) {
            return;
        }
        if (c3382.f8029 > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (c3382.f8029 < iMo53543 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3383 c3383 = this.f8022;
        int measuredWidth = c3383.getMeasuredWidth();
        int measuredHeight = c3383.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f8036;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.f8034;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        c3383.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f8028) {
            m5613();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.f8022, i, i2);
        int measuredWidth = this.f8022.getMeasuredWidth();
        int measuredHeight = this.f8022.getMeasuredHeight();
        int measuredState = this.f8022.getMeasuredState();
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
        this.f8030 = viewPager2$SavedState.f7992;
        this.f8031 = viewPager2$SavedState.f7993;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager2$SavedState viewPager2$SavedState = new ViewPager2$SavedState(super.onSaveInstanceState());
        C3383 c3383 = this.f8022;
        viewPager2$SavedState.f7994 = c3383.getId();
        int i = this.f8030;
        if (i == -1) {
            i = this.f8029;
        }
        viewPager2$SavedState.f7992 = i;
        Parcelable parcelable = this.f8031;
        if (parcelable != null) {
            viewPager2$SavedState.f7993 = parcelable;
            return viewPager2$SavedState;
        }
        c3383.getAdapter();
        return viewPager2$SavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(C3382.class.getSimpleName().concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        C1171 c1171 = this.f8023;
        c1171.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        c1171.getClass();
        C3382 c3382 = (C3382) c1171.f1438;
        if (i != 8192 && i != 4096) {
            C3466.m5901();
            return false;
        }
        int currentItem = i == 8192 ? c3382.getCurrentItem() - 1 : c3382.getCurrentItem() + 1;
        if (c3382.f8025) {
            c3382.m5614(currentItem);
        }
        return true;
    }

    public void setAdapter(AbstractC3283 abstractC3283) {
        C3383 c3383 = this.f8022;
        AbstractC3283 adapter = c3383.getAdapter();
        C1171 c1171 = this.f8023;
        if (adapter != null) {
            adapter.f7643.unregisterObserver((C3386) c1171.f1439);
        } else {
            c1171.getClass();
        }
        C3386 c3386 = this.f8032;
        if (adapter != null) {
            adapter.f7643.unregisterObserver(c3386);
        }
        c3383.setAdapter(abstractC3283);
        this.f8029 = 0;
        m5615();
        c1171.m1554();
        if (abstractC3283 != null) {
            abstractC3283.f7643.registerObserver((C3386) c1171.f1439);
        }
        if (abstractC3283 != null) {
            abstractC3283.f7643.registerObserver(c3386);
        }
    }

    public void setCurrentItem(int i) {
        Object obj = this.f8018.f6882;
        m5614(i);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f8023.m1554();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            C6755.m11869("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.f8024 = i;
            this.f8022.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.f8033.m5243(i);
        this.f8023.m1554();
    }

    public void setPageTransformer(InterfaceC3380 interfaceC3380) {
        boolean z = this.f8026;
        if (interfaceC3380 != null) {
            if (!z) {
                this.f8027 = this.f8022.getItemAnimator();
                this.f8026 = true;
            }
            this.f8022.setItemAnimator(null);
        } else if (z) {
            this.f8022.setItemAnimator(this.f8027);
            this.f8027 = null;
            this.f8026 = false;
        }
        this.f8017.getClass();
        if (interfaceC3380 == null) {
            return;
        }
        this.f8017.getClass();
        this.f8017.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.f8025 = z;
        this.f8023.m1554();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5613() {
        C3379 c3379 = this.f8021;
        if (c3379 == null) {
            C6755.m11870("Design assumption violated.");
            return;
        }
        C3390 c3390 = this.f8033;
        View viewMo5379 = c3379.mo5379(c3390);
        if (viewMo5379 == null) {
            return;
        }
        c3390.getClass();
        int iM5543 = AbstractC3352.m5543(viewMo5379);
        if (iM5543 != this.f8029 && getScrollState() == 0) {
            this.f8019.mo5609(iM5543);
        }
        this.f8028 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5614(int i) {
        C3376 c3376;
        AbstractC3283 adapter = getAdapter();
        if (adapter == null) {
            if (this.f8030 != -1) {
                this.f8030 = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.mo5354() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.mo5354() - 1);
        int i2 = this.f8029;
        C3373 c3373 = this.f8020;
        if ((iMin == i2 && c3373.f7995 == 0) || iMin == i2) {
            return;
        }
        double d = i2;
        this.f8029 = iMin;
        this.f8023.m1554();
        if (c3373.f7995 != 0) {
            c3373.m5606();
            C3374 c3374 = c3373.f8002;
            d = ((double) c3374.f8009) + ((double) c3374.f8008);
        }
        c3373.getClass();
        c3373.f7996 = 2;
        boolean z = c3373.f8005 != iMin;
        c3373.f8005 = iMin;
        c3373.m5608(2);
        if (z && (c3376 = c3373.f8000) != null) {
            c3376.mo5609(iMin);
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        C3383 c3383 = this.f8022;
        if (dAbs <= 3.0d) {
            c3383.m5304(iMin);
        } else {
            c3383.m5306(d2 > d ? iMin - 3 : iMin + 3);
            c3383.post(new RunnableC3381(iMin, c3383));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5615() {
        AbstractC3283 adapter;
        if (this.f8030 == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f8031 != null) {
            this.f8031 = null;
        }
        int iMax = Math.max(0, Math.min(this.f8030, adapter.mo5354() - 1));
        this.f8029 = iMax;
        this.f8030 = -1;
        this.f8022.m5306(iMax);
        this.f8023.m1554();
    }
}
