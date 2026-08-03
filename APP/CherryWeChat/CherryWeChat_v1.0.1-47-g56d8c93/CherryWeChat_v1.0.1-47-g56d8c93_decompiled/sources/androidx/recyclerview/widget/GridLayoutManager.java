package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import java.util.Arrays;
import p000.AbstractC0213Ey;
import p000.AbstractC2374ph;
import p000.C0038Av;
import p000.C0649P3;
import p000.C1118a0;
import p000.C1225bk;
import p000.C1509ho;
import p000.C1552io;
import p000.C2110jo;
import p000.C2431qv;
import p000.InterfaceC2337ov;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public boolean f3981a;

    /* JADX INFO: renamed from: b */
    public int f3982b;

    /* JADX INFO: renamed from: c */
    public int[] f3983c;

    /* JADX INFO: renamed from: d */
    public View[] f3984d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f3985e;

    /* JADX INFO: renamed from: f */
    public final SparseIntArray f3986f;

    /* JADX INFO: renamed from: g */
    public final C0649P3 f3987g;

    /* JADX INFO: renamed from: h */
    public final Rect f3988h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3981a = false;
        this.f3982b = -1;
        this.f3985e = new SparseIntArray();
        this.f3986f = new SparseIntArray();
        this.f3987g = new C0649P3(20);
        this.f3988h = new Rect();
        m2175y(AbstractC1160i.getProperties(context, attributeSet, i, i2).f8389b);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean checkLayoutParams(C2431qv c2431qv) {
        return c2431qv instanceof C1225bk;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(C0038Av c0038Av, C2110jo c2110jo, InterfaceC2337ov interfaceC2337ov) {
        int i;
        int i2 = this.f3982b;
        for (int i3 = 0; i3 < this.f3982b && (i = c2110jo.f7415d) >= 0 && i < c0038Av.m58b() && i2 > 0; i3++) {
            ((C1154c) interfaceC2337ov).m2239a(c2110jo.f7415d, Math.max(0, c2110jo.f7418g));
            this.f3987g.getClass();
            i2--;
            c2110jo.f7415d += c2110jo.f7416e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(C1161j c1161j, C0038Av c0038Av, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iM58b = c0038Av.m58b();
        ensureLayoutState();
        int iMo5260k = this.mOrientationHelper.mo5260k();
        int iMo5256g = this.mOrientationHelper.mo5256g();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM58b && m2172v(position, c1161j, c0038Av) == 0) {
                if (((C2431qv) childAt.getLayoutParams()).f8526a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo5254e(childAt) < iMo5256g && this.mOrientationHelper.mo5251b(childAt) >= iMo5260k) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C1225bk(-2, -1) : new C1225bk(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(Context context, AttributeSet attributeSet) {
        C1225bk c1225bk = new C1225bk(context, attributeSet);
        c1225bk.f4181e = -1;
        c1225bk.f4182f = 0;
        return c1225bk;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int getColumnCountForAccessibility(C1161j c1161j, C0038Av c0038Av) {
        if (this.mOrientation == 1) {
            return this.f3982b;
        }
        if (c0038Av.m58b() < 1) {
            return 0;
        }
        return m2171u(c0038Av.m58b() - 1, c1161j, c0038Av) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int getRowCountForAccessibility(C1161j c1161j, C0038Av c0038Av) {
        if (this.mOrientation == 0) {
            return this.f3982b;
        }
        if (c0038Av.m58b() < 1) {
            return 0;
        }
        return m2171u(c0038Av.m58b() - 1, c1161j, c0038Av) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(C1161j c1161j, C0038Av c0038Av, C2110jo c2110jo, C1552io c1552io) {
        int i;
        int i2;
        int i3;
        int iMo5253d;
        int paddingLeft;
        int paddingTop;
        int iMo5253d2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z;
        int i4;
        View viewM4299b;
        int iMo5259j = this.mOrientationHelper.mo5259j();
        boolean z2 = iMo5259j != 1073741824;
        int i5 = getChildCount() > 0 ? this.f3983c[this.f3982b] : 0;
        if (z2) {
            m2176z();
        }
        boolean z3 = c2110jo.f7416e == 1;
        int iM2172v = this.f3982b;
        if (!z3) {
            iM2172v = m2172v(c2110jo.f7415d, c1161j, c0038Av) + m2173w(c2110jo.f7415d, c1161j, c0038Av);
        }
        int i6 = 0;
        while (i6 < this.f3982b && (i4 = c2110jo.f7415d) >= 0 && i4 < c0038Av.m58b() && iM2172v > 0) {
            int i7 = c2110jo.f7415d;
            int iM2173w = m2173w(i7, c1161j, c0038Av);
            if (iM2173w > this.f3982b) {
                StringBuilder sb = new StringBuilder("Item at position ");
                sb.append(i7);
                sb.append(" requires ");
                sb.append(iM2173w);
                sb.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(AbstractC0213Ey.m409g(sb, this.f3982b, " spans."));
            }
            iM2172v -= iM2173w;
            if (iM2172v < 0 || (viewM4299b = c2110jo.m4299b(c1161j)) == null) {
                break;
            }
            this.f3984d[i6] = viewM4299b;
            i6++;
        }
        if (i6 == 0) {
            c1552io.f5512b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f3984d[i];
            C1225bk c1225bk = (C1225bk) view.getLayoutParams();
            int iM2173w2 = m2173w(getPosition(view), c1161j, c0038Av);
            c1225bk.f4182f = iM2173w2;
            c1225bk.f4181e = i8;
            i8 += iM2173w2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f3984d[i10];
            if (c2110jo.f7422k != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f3988h);
            m2174x(view2, iMo5259j, z);
            int iMo5252c = this.mOrientationHelper.mo5252c(view2);
            if (iMo5252c > i9) {
                i9 = iMo5252c;
            }
            float fMo5253d = (this.mOrientationHelper.mo5253d(view2) * 1.0f) / ((C1225bk) view2.getLayoutParams()).f4182f;
            if (fMo5253d > f) {
                f = fMo5253d;
            }
        }
        if (z2) {
            m2168r(Math.max(Math.round(f * this.f3982b), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f3984d[i11];
                m2174x(view3, 1073741824, true);
                int iMo5252c2 = this.mOrientationHelper.mo5252c(view3);
                if (iMo5252c2 > i9) {
                    i9 = iMo5252c2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f3984d[i12];
            if (this.mOrientationHelper.mo5252c(view4) != i9) {
                C1225bk c1225bk2 = (C1225bk) view4.getLayoutParams();
                Rect rect = c1225bk2.f8527b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1225bk2).topMargin + ((ViewGroup.MarginLayoutParams) c1225bk2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1225bk2).leftMargin + ((ViewGroup.MarginLayoutParams) c1225bk2).rightMargin;
                int iM2170t = m2170t(c1225bk2.f4181e, c1225bk2.f4182f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = AbstractC1160i.getChildMeasureSpec(iM2170t, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c1225bk2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    childMeasureSpec = AbstractC1160i.getChildMeasureSpec(iM2170t, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c1225bk2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (C2431qv) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        c1552io.f5511a = i9;
        if (this.mOrientation != 1) {
            if (c2110jo.f7417f == -1) {
                int i15 = c2110jo.f7413b;
                paddingLeft = i15 - i9;
                iMo5253d = i15;
            } else {
                int i16 = c2110jo.f7413b;
                iMo5253d = i16 + i9;
                paddingLeft = i16;
            }
            paddingTop = 0;
            iMo5253d2 = 0;
        } else if (c2110jo.f7417f == -1) {
            iMo5253d2 = c2110jo.f7413b;
            paddingTop = iMo5253d2 - i9;
            paddingLeft = 0;
            iMo5253d = 0;
        } else {
            int i17 = c2110jo.f7413b;
            paddingTop = i17;
            iMo5253d = 0;
            iMo5253d2 = i17 + i9;
            paddingLeft = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f3984d[i18];
            C1225bk c1225bk3 = (C1225bk) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f3983c[c1225bk3.f4181e];
                iMo5253d2 = this.mOrientationHelper.mo5253d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iMo5253d = this.f3983c[this.f3982b - c1225bk3.f4181e] + getPaddingLeft();
                paddingLeft = iMo5253d - this.mOrientationHelper.mo5253d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f3983c[c1225bk3.f4181e];
                iMo5253d = this.mOrientationHelper.mo5253d(view5) + paddingLeft;
            }
            int i19 = iMo5253d;
            int i20 = paddingLeft;
            int i21 = iMo5253d2;
            layoutDecoratedWithMargins(view5, i20, paddingTop, i19, i21);
            paddingLeft = i20;
            iMo5253d = i19;
            iMo5253d2 = i21;
            if (c1225bk3.f8526a.isRemoved() || c1225bk3.f8526a.isUpdated()) {
                c1552io.f5513c = true;
            }
            c1552io.f5514d = view5.hasFocusable() | c1552io.f5514d;
        }
        Arrays.fill(this.f3984d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(C1161j c1161j, C0038Av c0038Av, C1509ho c1509ho, int i) {
        super.onAnchorReady(c1161j, c0038Av, c1509ho, i);
        m2176z();
        if (c0038Av.m58b() > 0 && !c0038Av.f82g) {
            boolean z = i == 1;
            int iM2172v = m2172v(c1509ho.f5347b, c1161j, c0038Av);
            if (z) {
                while (iM2172v > 0) {
                    int i2 = c1509ho.f5347b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1509ho.f5347b = i3;
                    iM2172v = m2172v(i3, c1161j, c0038Av);
                }
            } else {
                int iM58b = c0038Av.m58b() - 1;
                int i4 = c1509ho.f5347b;
                while (i4 < iM58b) {
                    int i5 = i4 + 1;
                    int iM2172v2 = m2172v(i5, c1161j, c0038Av);
                    if (iM2172v2 <= iM2172v) {
                        break;
                    }
                    i4 = i5;
                    iM2172v = iM2172v2;
                }
                c1509ho.f5347b = i4;
            }
        }
        m2169s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, C1161j c1161j, C0038Av c0038Av) {
        int childCount;
        int i2;
        int childCount2;
        View view2;
        View view3;
        View view4;
        int i3;
        int i4;
        int i5;
        C1161j c1161j2 = c1161j;
        C0038Av c0038Av2 = c0038Av;
        View viewFindContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C1225bk c1225bk = (C1225bk) viewFindContainingItemView.getLayoutParams();
        int i6 = c1225bk.f4181e;
        int i7 = c1225bk.f4182f + i6;
        if (super.onFocusSearchFailed(view, i, c1161j, c0038Av) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            childCount2 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iM2171u = m2171u(childCount2, c1161j2, c0038Av2);
        int i8 = -1;
        int i9 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = childCount2;
        View view6 = null;
        while (i10 != childCount) {
            int iM2171u2 = m2171u(i10, c1161j2, c0038Av2);
            View childAt = getChildAt(i10);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM2171u2 == iM2171u) {
                C1225bk c1225bk2 = (C1225bk) childAt.getLayoutParams();
                int i11 = c1225bk2.f4181e;
                view2 = viewFindContainingItemView;
                int i12 = c1225bk2.f4182f + i11;
                if (childAt.hasFocusable() && i11 == i6 && i12 == i7) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i12, i7) - Math.max(i11, i6);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i3 = iMin;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i4 = iMin2;
                                if (iMin3 > i4) {
                                    i5 = i9;
                                } else if (iMin3 == i4) {
                                    i5 = i9;
                                    if (z == (i11 > i5)) {
                                    }
                                    iMin = i3;
                                    view5 = view3;
                                    i10 += i2;
                                    c1161j2 = c1161j;
                                    c0038Av2 = c0038Av;
                                    viewFindContainingItemView = view2;
                                } else {
                                    i5 = i9;
                                }
                                if (childAt.hasFocusable()) {
                                    int i13 = c1225bk2.f4181e;
                                    iMin2 = Math.min(i12, i7) - Math.max(i11, i6);
                                    view6 = childAt;
                                    i9 = i13;
                                    iMin = i3;
                                    view5 = view3;
                                    i10 += i2;
                                    c1161j2 = c1161j;
                                    c0038Av2 = c0038Av;
                                    viewFindContainingItemView = view2;
                                } else {
                                    i9 = i5;
                                    iMin2 = i4;
                                    i8 = c1225bk2.f4181e;
                                    view6 = view4;
                                    view5 = childAt;
                                    iMin = Math.min(i12, i7) - Math.max(i11, i6);
                                    i10 += i2;
                                    c1161j2 = c1161j;
                                    c0038Av2 = c0038Av;
                                    viewFindContainingItemView = view2;
                                }
                            }
                            i9 = i5;
                            iMin2 = i4;
                            view6 = view4;
                            iMin = i3;
                            view5 = view3;
                            i10 += i2;
                            c1161j2 = c1161j;
                            c0038Av2 = c0038Av;
                            viewFindContainingItemView = view2;
                        }
                        i5 = i9;
                        i4 = iMin2;
                        i9 = i5;
                        iMin2 = i4;
                        view6 = view4;
                        iMin = i3;
                        view5 = view3;
                        i10 += i2;
                        c1161j2 = c1161j;
                        c0038Av2 = c0038Av;
                        viewFindContainingItemView = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i3 = iMin;
                i5 = i9;
                i4 = iMin2;
                if (childAt.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i3 = iMin;
            i5 = i9;
            i4 = iMin2;
            i9 = i5;
            iMin2 = i4;
            view6 = view4;
            iMin = i3;
            view5 = view3;
            i10 += i2;
            c1161j2 = c1161j;
            c0038Av2 = c0038Av;
            viewFindContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityNodeInfo(C1161j c1161j, C0038Av c0038Av, C1118a0 c1118a0) {
        super.onInitializeAccessibilityNodeInfo(c1161j, c0038Av, c1118a0);
        c1118a0.m2046h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityNodeInfoForItem(C1161j c1161j, C0038Av c0038Av, View view, C1118a0 c1118a0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1225bk)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1118a0);
            return;
        }
        C1225bk c1225bk = (C1225bk) layoutParams;
        int iM2171u = m2171u(c1225bk.f8526a.getLayoutPosition(), c1161j, c0038Av);
        if (this.mOrientation == 0) {
            c1118a0.f3530a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c1225bk.f4181e, c1225bk.f4182f, iM2171u, 1, false, false));
        } else {
            c1118a0.f3530a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM2171u, 1, c1225bk.f4181e, c1225bk.f4182f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        C0649P3 c0649p3 = this.f3987g;
        c0649p3.m1278I();
        ((SparseIntArray) c0649p3.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsChanged(RecyclerView recyclerView) {
        C0649P3 c0649p3 = this.f3987g;
        c0649p3.m1278I();
        ((SparseIntArray) c0649p3.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        C0649P3 c0649p3 = this.f3987g;
        c0649p3.m1278I();
        ((SparseIntArray) c0649p3.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        C0649P3 c0649p3 = this.f3987g;
        c0649p3.m1278I();
        ((SparseIntArray) c0649p3.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        C0649P3 c0649p3 = this.f3987g;
        c0649p3.m1278I();
        ((SparseIntArray) c0649p3.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutChildren(C1161j c1161j, C0038Av c0038Av) {
        boolean z = c0038Av.f82g;
        SparseIntArray sparseIntArray = this.f3986f;
        SparseIntArray sparseIntArray2 = this.f3985e;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1225bk c1225bk = (C1225bk) getChildAt(i).getLayoutParams();
                int layoutPosition = c1225bk.f8526a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c1225bk.f4182f);
                sparseIntArray.put(layoutPosition, c1225bk.f4181e);
            }
        }
        super.onLayoutChildren(c1161j, c0038Av);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutCompleted(C0038Av c0038Av) {
        super.onLayoutCompleted(c0038Av);
        this.f3981a = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m2168r(int i) {
        int i2;
        int[] iArr = this.f3983c;
        int i3 = this.f3982b;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f3983c = iArr;
    }

    /* JADX INFO: renamed from: s */
    public final void m2169s() {
        View[] viewArr = this.f3984d;
        if (viewArr == null || viewArr.length != this.f3982b) {
            this.f3984d = new View[this.f3982b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final int scrollHorizontallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        m2176z();
        m2169s();
        return super.scrollHorizontallyBy(i, c1161j, c0038Av);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final int scrollVerticallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        m2176z();
        m2169s();
        return super.scrollVerticallyBy(i, c1161j, c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f3983c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = AbstractC1160i.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f3983c;
            iChooseSize = AbstractC1160i.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = AbstractC1160i.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f3983c;
            iChooseSize2 = AbstractC1160i.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f3981a;
    }

    /* JADX INFO: renamed from: t */
    public final int m2170t(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f3983c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3983c;
        int i3 = this.f3982b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: u */
    public final int m2171u(int i, C1161j c1161j, C0038Av c0038Av) {
        boolean z = c0038Av.f82g;
        C0649P3 c0649p3 = this.f3987g;
        if (!z) {
            int i2 = this.f3982b;
            c0649p3.getClass();
            return C0649P3.m1269H(i, i2);
        }
        int iM2256b = c1161j.m2256b(i);
        if (iM2256b == -1) {
            return 0;
        }
        int i3 = this.f3982b;
        c0649p3.getClass();
        return C0649P3.m1269H(iM2256b, i3);
    }

    /* JADX INFO: renamed from: v */
    public final int m2172v(int i, C1161j c1161j, C0038Av c0038Av) {
        boolean z = c0038Av.f82g;
        C0649P3 c0649p3 = this.f3987g;
        if (!z) {
            int i2 = this.f3982b;
            c0649p3.getClass();
            return i % i2;
        }
        int i3 = this.f3986f.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM2256b = c1161j.m2256b(i);
        if (iM2256b == -1) {
            return 0;
        }
        int i4 = this.f3982b;
        c0649p3.getClass();
        return iM2256b % i4;
    }

    /* JADX INFO: renamed from: w */
    public final int m2173w(int i, C1161j c1161j, C0038Av c0038Av) {
        boolean z = c0038Av.f82g;
        C0649P3 c0649p3 = this.f3987g;
        if (!z) {
            c0649p3.getClass();
            return 1;
        }
        int i2 = this.f3985e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c1161j.m2256b(i) == -1) {
            return 1;
        }
        c0649p3.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: x */
    public final void m2174x(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C1225bk c1225bk = (C1225bk) view.getLayoutParams();
        Rect rect = c1225bk.f8527b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1225bk).topMargin + ((ViewGroup.MarginLayoutParams) c1225bk).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1225bk).leftMargin + ((ViewGroup.MarginLayoutParams) c1225bk).rightMargin;
        int iM2170t = m2170t(c1225bk.f4181e, c1225bk.f4182f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = AbstractC1160i.getChildMeasureSpec(iM2170t, i, i3, ((ViewGroup.MarginLayoutParams) c1225bk).width, false);
            childMeasureSpec = AbstractC1160i.getChildMeasureSpec(this.mOrientationHelper.mo5261l(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c1225bk).height, true);
        } else {
            int childMeasureSpec3 = AbstractC1160i.getChildMeasureSpec(iM2170t, i, i2, ((ViewGroup.MarginLayoutParams) c1225bk).height, false);
            int childMeasureSpec4 = AbstractC1160i.getChildMeasureSpec(this.mOrientationHelper.mo5261l(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c1225bk).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, c2431qv) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, c2431qv)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2175y(int i) {
        if (i == this.f3982b) {
            return;
        }
        this.f3981a = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Span count should be at least 1. Provided "));
        }
        this.f3982b = i;
        this.f3987g.m1278I();
        requestLayout();
    }

    /* JADX INFO: renamed from: z */
    public final void m2176z() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m2168r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1225bk c1225bk = new C1225bk((ViewGroup.MarginLayoutParams) layoutParams);
            c1225bk.f4181e = -1;
            c1225bk.f4182f = 0;
            return c1225bk;
        }
        C1225bk c1225bk2 = new C1225bk(layoutParams);
        c1225bk2.f4181e = -1;
        c1225bk2.f4182f = 0;
        return c1225bk2;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f3981a = false;
        this.f3982b = -1;
        this.f3985e = new SparseIntArray();
        this.f3986f = new SparseIntArray();
        this.f3987g = new C0649P3(20);
        this.f3988h = new Rect();
        m2175y(i);
    }

    public GridLayoutManager() {
        super(1);
        this.f3981a = false;
        this.f3982b = -1;
        this.f3985e = new SparseIntArray();
        this.f3986f = new SparseIntArray();
        this.f3987g = new C0649P3(20);
        this.f3988h = new Rect();
        m2175y(2);
    }
}
