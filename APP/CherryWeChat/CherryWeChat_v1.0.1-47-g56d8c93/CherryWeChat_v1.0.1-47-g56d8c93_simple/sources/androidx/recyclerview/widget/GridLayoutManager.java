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

    public GridLayoutManager(Context r3, AttributeSet r4, int r5, int r6) {
        super(r3, r4, r5, r6);
        this.f3981a = false;
        this.f3982b = -1;
        this.f3985e = new SparseIntArray();
        this.f3986f = new SparseIntArray();
        this.f3987g = new C0649P3(20);
        this.f3988h = new Rect();
        m2175y(AbstractC1160i.getProperties(r3, r4, r5, r6).f8389b);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean checkLayoutParams(C2431qv r1) {
        return r1 instanceof C1225bk;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(C0038Av r7, C2110jo r8, InterfaceC2337ov r9) {
        int r0 = this.f3982b;
        int r2 = 0;
    L4:
        if (r2 >= this.f3982b) goto L11;
        int r3 = r8.f7415d;
        if (r3 < 0) goto L16;
        if (r3 >= r7.m58b()) goto L17;
        if (r0 <= 0) goto L18;
        ((C1154c) r9).m2239a(r8.f7415d, Math.max(0, r8.f7418g));
        this.f3987g.getClass();
        r0 = r0 - 1;
        r8.f7415d += r8.f7416e;
        r2 = r2 + 1;
        goto L4
    L18:
        return;
    L17:
        return;
    L16:
        return;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(C1161j r10, C0038Av r11, boolean r12, boolean r13) {
        int r122 = getChildCount();
        int r0 = 1;
        if (r13 == false) goto L5;
        int r123 = getChildCount() - 1;
        int r132 = -1;
        r0 = -1;
    L6:
        int r1 = r11.m58b();
        ensureLayoutState();
        int r2 = this.mOrientationHelper.mo5260k();
        int r3 = this.mOrientationHelper.mo5256g();
        View r4 = null;
        View r5 = null;
    L7:
        if (r123 == r132) goto L27;
        View r6 = getChildAt(r123);
        int r7 = getPosition(r6);
        if (r7 < 0) goto L26;
        if (r7 >= r1) goto L26;
        if (m2172v(r7, r10, r11) != 0) goto L26;
        if (((C2431qv) r6.getLayoutParams()).f8526a.isRemoved() == false) goto L19;
        if (r5 != null) goto L26;
        r5 = r6;
        goto L26
    L19:
        if (this.mOrientationHelper.mo5254e(r6) < r3) goto L21;
    L24:
        if (r4 != null) goto L26;
        r4 = r6;
        goto L26
    L21:
        if (this.mOrientationHelper.mo5251b(r6) < r2) goto L24;
        return r6;
    L26:
        r123 = r123 + r0;
        goto L7
    L27:
        if (r4 == null) goto L29;
        return r4;
    L29:
        return r5;
    L5:
        r132 = r122;
        r123 = 0;
        goto L6
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateDefaultLayoutParams() {
        if (this.mOrientation != 0) goto L7;
        return new C1225bk(-2, -1);
    L7:
        return new C1225bk(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(Context r2, AttributeSet r3) {
        C1225bk r0 = new C1225bk(r2, r3);
        r0.f4181e = -1;
        r0.f4182f = 0;
        return r0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int getColumnCountForAccessibility(C1161j r3, C0038Av r4) {
        if (this.mOrientation != 1) goto L7;
        return this.f3982b;
    L7:
        if (r4.m58b() >= 1) goto L11;
        return 0;
    L11:
        return m2171u(r4.m58b() - 1, r3, r4) + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int getRowCountForAccessibility(C1161j r3, C0038Av r4) {
        if (this.mOrientation != 0) goto L7;
        return this.f3982b;
    L7:
        if (r4.m58b() >= 1) goto L11;
        return 0;
    L11:
        return m2171u(r4.m58b() - 1, r3, r4) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(C1161j r18, C0038Av r19, C2110jo r20, C1552io r21) {
        int r4 = this.mOrientationHelper.mo5259j();
        if (r4 == 1073741824) goto L5;
        boolean r9 = true;
    L7:
        if (getChildCount() <= 0) goto L9;
        int r10 = this.f3983c[this.f3982b];
    L10:
        if (r9 == false) goto L13;
        m2176z();
    L13:
        if (r20.f7416e != 1) goto L15;
        boolean r11 = true;
    L16:
        int r12 = this.f3982b;
        if (r11 == true) goto L19;
        r12 = m2172v(r20.f7415d, r18, r19) + m2173w(r20.f7415d, r18, r19);
    L19:
        int r13 = 0;
    L21:
        if (r13 >= this.f3982b) goto L38;
        int r14 = r20.f7415d;
        if (r14 < 0) goto L38;
        if (r14 >= r19.m58b()) goto L38;
        if (r12 <= 0) goto L38;
        int r142 = r20.f7415d;
        int r15 = m2173w(r142, r18, r19);
        if (r15 > this.f3982b) goto L36;
        r12 = r12 - r15;
        if (r12 < 0) goto L38;
        View r8 = r20.m4299b(r18);
        if (r8 == null) goto L38;
        this.f3984d[r13] = r8;
        r13 = r13 + 1;
        goto L21
    L36:
        StringBuilder r2 = new StringBuilder("Item at position ");
        r2.append(r142);
        r2.append(" requires ");
        r2.append(r15);
        r2.append(" spans but GridLayoutManager has only ");
        throw new IllegalArgumentException(AbstractC0213Ey.m409g(r2, this.f3982b, " spans."));
    L38:
        if (r13 != 0) goto L41;
        r21.f5512b = true;
        return;
    L41:
        if (r11 == false) goto L43;
        int r152 = 1;
        int r143 = r13;
        int r122 = 0;
    L44:
        int r82 = 0;
    L45:
        if (r122 == r143) goto L47;
        View r7 = this.f3984d[r122];
        C1225bk r5 = (C1225bk) r7.getLayoutParams();
        int r72 = m2173w(getPosition(r7), r18, r19);
        r5.f4182f = r72;
        r5.f4181e = r82;
        r82 = r82 + r72;
        r122 = r122 + r152;
        goto L45
    L47:
        float r1 = 0.0f;
        int r22 = 0;
        int r52 = 0;
    L48:
        if (r22 >= r13) goto L65;
        View r73 = this.f3984d[r22];
        if (r20.f7422k != null) goto L54;
        if (r11 == false) goto L53;
        addView(r73);
        boolean r83 = false;
    L58:
        calculateItemDecorationsForChild(r73, this.f3988h);
        m2174x(r73, r4, r83);
        int r84 = this.mOrientationHelper.mo5252c(r73);
        if (r84 <= r52) goto L61;
        r52 = r84;
    L61:
        C1225bk r85 = (C1225bk) r73.getLayoutParams();
        float r74 = (this.mOrientationHelper.mo5253d(r73) * 1.0f) / r85.f4182f;
        if (r74 <= r1) goto L64;
        r1 = r74;
    L64:
        r22 = r22 + 1;
        goto L48
    L53:
        r83 = false;
        addView(r73, 0);
        goto L58
    L54:
        r83 = false;
        if (r11 == false) goto L57;
        addDisappearingView(r73);
        goto L58
    L57:
        addDisappearingView(r73, 0);
        goto L58
    L65:
        if (r9 == false) goto L72;
        m2168r(Math.max(Math.round(r1 * this.f3982b), r10));
        r52 = 0;
        int r86 = 0;
    L67:
        if (r86 >= r13) goto L72;
        View r16 = this.f3984d[r86];
        m2174x(r16, 1073741824, true);
        int r17 = this.mOrientationHelper.mo5252c(r16);
        if (r17 <= r52) goto L71;
        r52 = r17;
    L71:
        r86 = r86 + 1;
    L72:
        int r87 = 0;
    L73:
        if (r87 >= r13) goto L85;
        View r110 = this.f3984d[r87];
        if (this.mOrientationHelper.mo5252c(r110) == r52) goto L84;
        C1225bk r23 = (C1225bk) r110.getLayoutParams();
        Rect r42 = r23.f8527b;
        int r75 = ((r42.top + r42.bottom) + ((ViewGroup.MarginLayoutParams) r23).topMargin) + ((ViewGroup.MarginLayoutParams) r23).bottomMargin;
        int r92 = ((r42.left + r42.right) + ((ViewGroup.MarginLayoutParams) r23).leftMargin) + ((ViewGroup.MarginLayoutParams) r23).rightMargin;
        int r43 = m2170t(r23.f4181e, r23.f4182f);
        if (this.mOrientation != 1) goto L79;
        int r24 = AbstractC1160i.getChildMeasureSpec(r43, 1073741824, r92, ((ViewGroup.MarginLayoutParams) r23).width, false);
        int r44 = View.MeasureSpec.makeMeasureSpec(r52 - r75, 1073741824);
    L81:
        if (shouldReMeasureChild(r110, r24, r44, (C2431qv) r110.getLayoutParams()) == false) goto L84;
        r110.measure(r24, r44);
        goto L84
    L79:
        int r93 = View.MeasureSpec.makeMeasureSpec(r52 - r92, 1073741824);
        r44 = AbstractC1160i.getChildMeasureSpec(r43, 1073741824, r75, ((ViewGroup.MarginLayoutParams) r23).height, false);
        r24 = r93;
    L84:
        r87 = r87 + 1;
        goto L73
    L85:
        int r102 = 0;
        r21.f5511a = r52;
        if (this.mOrientation != 1) goto L92;
        if (r20.f7417f != (-1)) goto L90;
        int r88 = r20.f7413b;
        int r3 = r88 - r52;
        int r111 = 0;
        int r25 = 0;
    L96:
        if (r102 >= r13) goto L113;
        View r45 = this.f3984d[r102];
        C1225bk r76 = (C1225bk) r45.getLayoutParams();
        if (this.mOrientation == 1) goto L100;
        r3 = getPaddingTop() + this.f3983c[r76.f4181e];
        r88 = this.mOrientationHelper.mo5253d(r45) + r3;
    L102:
        int r53 = r25;
        int r26 = r111;
        int r54 = r88;
        layoutDecoratedWithMargins(r45, r26, r3, r53, r54);
        r111 = r26;
        r25 = r53;
        r88 = r54;
        if (r76.f8526a.isRemoved() == true) goto L111;
        if (r76.f8526a.isUpdated() == true) goto L111;
    L112:
        r21.f5514d = r45.hasFocusable() | r21.f5514d;
        r102 = r102 + 1;
    L111:
        r21.f5513c = true;
        goto L112
    L100:
        if (isLayoutRTL() == false) goto L103;
        r25 = this.f3983c[this.f3982b - r76.f4181e] + getPaddingLeft();
        r111 = r25 - this.mOrientationHelper.mo5253d(r45);
        goto L102
    L103:
        r111 = getPaddingLeft() + this.f3983c[r76.f4181e];
        r25 = this.mOrientationHelper.mo5253d(r45) + r111;
        goto L102
    L113:
        Arrays.fill(this.f3984d, null);
        return;
    L90:
        int r89 = r20.f7413b;
        r3 = r89;
        r25 = 0;
        r88 = r89 + r52;
        r111 = 0;
        goto L96
    L92:
        if (r20.f7417f != (-1)) goto L95;
        int r810 = r20.f7413b;
        r111 = r810 - r52;
        r25 = r810;
    L94:
        r3 = 0;
        r88 = 0;
        goto L96
    L95:
        int r811 = r20.f7413b;
        r25 = r811 + r52;
        r111 = r811;
        goto L94
    L43:
        r122 = r13 - 1;
        r143 = -1;
        r152 = -1;
        goto L44
    L15:
        r11 = false;
        goto L16
    L9:
        r10 = 0;
        goto L10
    L5:
        r9 = false;
        goto L7
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(C1161j r5, C0038Av r6, C1509ho r7, int r8) {
        super.onAnchorReady(r5, r6, r7, r8);
        m2176z();
        if (r6.m58b() > 0) goto L5;
    L22:
        m2169s();
        return;
    L5:
        if (r6.f82g == true) goto L22;
        if (r8 != 1) goto L9;
        boolean r82 = true;
    L10:
        int r1 = m2172v(r7.f5347b, r5, r6);
        if (r82 == false) goto L16;
    L12:
        if (r1 <= 0) goto L22;
        int r83 = r7.f5347b;
        if (r83 <= 0) goto L22;
        int r84 = r83 - 1;
        r7.f5347b = r84;
        r1 = m2172v(r84, r5, r6);
        goto L12
    L16:
        int r85 = r6.m58b() - 1;
        int r0 = r7.f5347b;
    L17:
        if (r0 >= r85) goto L21;
        int r2 = r0 + 1;
        int r3 = m2172v(r2, r5, r6);
        if (r3 <= r1) goto L21;
        r0 = r2;
        r1 = r3;
    L21:
        r7.f5347b = r0;
        goto L22
    L9:
        r82 = false;
        goto L10
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final View onFocusSearchFailed(View r24, int r25, C1161j r26, C0038Av r27) {
        C1161j r1 = r26;
        C0038Av r2 = r27;
        View r3 = findContainingItemView(r24);
        View r4 = null;
        if (r3 != null) goto L5;
        return null;
    L5:
        C1225bk r5 = (C1225bk) r3.getLayoutParams();
        int r6 = r5.f4181e;
        int r52 = r5.f4182f + r6;
        if (super.onFocusSearchFailed(r24, r25, r26, r27) != null) goto L9;
        return null;
    L9:
        if (convertFocusDirectionToLayoutDirection(r25) != 1) goto L11;
        boolean r7 = true;
    L13:
        if (r7 == this.mShouldReverseLayout) goto L15;
        int r72 = getChildCount() - 1;
        int r10 = -1;
        int r12 = -1;
    L17:
        if (this.mOrientation == 1) goto L19;
    L21:
        boolean r13 = false;
    L22:
        int r14 = m2171u(r72, r1, r2);
        int r15 = -1;
        int r16 = -1;
        int r8 = 0;
        int r17 = 0;
        int r11 = r72;
        View r73 = null;
    L23:
        if (r11 == r10) goto L26;
        int r9 = m2171u(r11, r1, r2);
        View r18 = getChildAt(r11);
        if (r18 == r3) goto L26;
        if (r18.hasFocusable() == false) goto L35;
        if (r9 == r14) goto L35;
        if (r4 != null) goto L26;
        View r182 = r3;
        View r21 = r4;
    L33:
        View r19 = r73;
        int r20 = r8;
    L34:
        int r42 = r16;
        int r74 = r17;
    L76:
        r16 = r42;
        r17 = r74;
        r73 = r19;
    L74:
        r8 = r20;
        r4 = r21;
    L77:
        r11 = r11 + r12;
        r1 = r26;
        r2 = r27;
        r3 = r182;
    L35:
        C1225bk r92 = (C1225bk) r18.getLayoutParams();
        int r22 = r92.f4181e;
        r182 = r3;
        int r32 = r92.f4182f + r22;
        if (r18.hasFocusable() == false) goto L41;
        if (r22 != r6) goto L41;
        if (r32 != r52) goto L41;
        return r18;
    L41:
        if (r18.hasFocusable() == false) goto L44;
        if (r4 != null) goto L44;
    L46:
        r21 = r4;
    L47:
        r19 = r73;
        r20 = r8;
        r42 = r16;
        r74 = r17;
    L71:
        if (r18.hasFocusable() == false) goto L73;
        r16 = r42;
        r17 = r74;
        r15 = r92.f4181e;
        r73 = r19;
        r4 = r18;
        r8 = Math.min(r32, r52) - Math.max(r22, r6);
        goto L77
    L73:
        int r43 = r92.f4181e;
        r17 = Math.min(r32, r52) - Math.max(r22, r6);
        r73 = r18;
        r16 = r43;
    L44:
        if (r18.hasFocusable() == true) goto L48;
        if (r73 == null) goto L46;
    L48:
        r21 = r4;
        int r44 = Math.min(r32, r52) - Math.max(r22, r6);
        if (r18.hasFocusable() == false) goto L58;
        if (r44 > r8) goto L47;
        if (r44 != r8) goto L33;
        if (r22 <= r15) goto L55;
        boolean r45 = true;
    L56:
        if (r13 != r45) goto L33;
    L55:
        r45 = false;
        goto L56
    L58:
        if (r21 != null) goto L33;
        r19 = r73;
        r20 = r8;
        boolean r82 = true;
        if (isViewPartiallyVisible(r18, false, true) == false) goto L34;
        r74 = r17;
        if (r44 <= r74) goto L64;
        r42 = r16;
        goto L71
    L64:
        if (r44 != r74) goto L75;
        r42 = r16;
        if (r22 > r42) goto L69;
        r82 = false;
    L69:
        if (r13 != r82) goto L76;
    L75:
        r42 = r16;
    L26:
        View r212 = r4;
        View r192 = r73;
        if (r212 == null) goto L80;
        return r212;
    L80:
        return r192;
    L19:
        if (isLayoutRTL() == false) goto L21;
        r13 = true;
        goto L22
    L15:
        r10 = getChildCount();
        r12 = 1;
        r72 = 0;
        goto L17
    L11:
        r7 = false;
        goto L13
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityNodeInfo(C1161j r1, C0038Av r2, C1118a0 r3) {
        super.onInitializeAccessibilityNodeInfo(r1, r2, r3);
        r3.m2046h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityNodeInfoForItem(C1161j r8, C0038Av r9, View r10, C1118a0 r11) {
        ViewGroup.LayoutParams r0 = r10.getLayoutParams();
        if ((r0 instanceof C1225bk) == true) goto L6;
        super.onInitializeAccessibilityNodeInfoForItem(r10, r11);
        return;
    L6:
        C1225bk r02 = (C1225bk) r0;
        int r1 = m2171u(r02.f8526a.getLayoutPosition(), r8, r9);
        if (this.mOrientation != 0) goto L10;
        AccessibilityNodeInfo.CollectionItemInfo r82 = AccessibilityNodeInfo.CollectionItemInfo.obtain(r02.f4181e, r02.f4182f, r1, 1, false, false);
        r11.f3530a.setCollectionItemInfo(r82);
        return;
    L10:
        AccessibilityNodeInfo.CollectionItemInfo r83 = AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, 1, r02.f4181e, r02.f4182f, false, false);
        r11.f3530a.setCollectionItemInfo(r83);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsAdded(RecyclerView r1, int r2, int r3) {
        C0649P3 r12 = this.f3987g;
        r12.m1278I();
        ((SparseIntArray) r12.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsChanged(RecyclerView r1) {
        C0649P3 r12 = this.f3987g;
        r12.m1278I();
        ((SparseIntArray) r12.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsMoved(RecyclerView r1, int r2, int r3, int r4) {
        C0649P3 r12 = this.f3987g;
        r12.m1278I();
        ((SparseIntArray) r12.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsRemoved(RecyclerView r1, int r2, int r3) {
        C0649P3 r12 = this.f3987g;
        r12.m1278I();
        ((SparseIntArray) r12.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsUpdated(RecyclerView r1, int r2, int r3, Object r4) {
        C0649P3 r12 = this.f3987g;
        r12.m1278I();
        ((SparseIntArray) r12.f2090c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutChildren(C1161j r8, C0038Av r9) {
        boolean r0 = r9.f82g;
        SparseIntArray r1 = this.f3986f;
        SparseIntArray r2 = this.f3985e;
        if (r0 == false) goto L7;
        int r02 = getChildCount();
        int r3 = 0;
    L5:
        if (r3 >= r02) goto L7;
        C1225bk r4 = (C1225bk) getChildAt(r3).getLayoutParams();
        int r5 = r4.f8526a.getLayoutPosition();
        r2.put(r5, r4.f4182f);
        r1.put(r5, r4.f4181e);
        r3 = r3 + 1;
    L7:
        super.onLayoutChildren(r8, r9);
        r2.clear();
        r1.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutCompleted(C0038Av r1) {
        super.onLayoutCompleted(r1);
        this.f3981a = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m2168r(int r8) {
        int[] r0 = this.f3983c;
        int r1 = this.f3982b;
        int r2 = 1;
        if (r0 != null) goto L5;
    L8:
        r0 = new int[r1 + 1];
    L9:
        int r3 = 0;
        r0[0] = 0;
        int r4 = r8 / r1;
        int r82 = r8 % r1;
        int r5 = 0;
    L10:
        if (r2 > r1) goto L18;
        r3 = r3 + r82;
        if (r3 > 0) goto L14;
    L16:
        int r6 = r4;
    L17:
        r5 = r5 + r6;
        r0[r2] = r5;
        r2 = r2 + 1;
        goto L10
    L14:
        if ((r1 - r3) >= r82) goto L16;
        r6 = r4 + 1;
        r3 = r3 - r1;
        goto L17
    L18:
        this.f3983c = r0;
        return;
    L5:
        if (r0.length != (r1 + 1)) goto L8;
        if (r0[r0.length - 1] == r8) goto L9;
        goto L8
    }

    /* JADX INFO: renamed from: s */
    public final void m2169s() {
        View[] r0 = this.f3984d;
        if (r0 != null) goto L5;
    L8:
        this.f3984d = new View[this.f3982b];
        return;
    L5:
        if (r0.length != this.f3982b) goto L8;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final int scrollHorizontallyBy(int r1, C1161j r2, C0038Av r3) {
        m2176z();
        m2169s();
        return super.scrollHorizontallyBy(r1, r2, r3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final int scrollVerticallyBy(int r1, C1161j r2, C0038Av r3) {
        m2176z();
        m2169s();
        return super.scrollVerticallyBy(r1, r2, r3);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void setMeasuredDimension(Rect r5, int r6, int r7) {
        if (this.f3983c != null) goto L5;
        super.setMeasuredDimension(r5, r6, r7);
    L5:
        int r0 = getPaddingLeft();
        int r1 = getPaddingRight() + r0;
        int r02 = getPaddingTop();
        int r2 = getPaddingBottom() + r02;
        if (this.mOrientation != 1) goto L8;
        int r52 = AbstractC1160i.chooseSize(r7, r5.height() + r2, getMinimumHeight());
        int[] r72 = this.f3983c;
        int r62 = AbstractC1160i.chooseSize(r6, r72[r72.length - 1] + r1, getMinimumWidth());
    L9:
        setMeasuredDimension(r62, r52);
        return;
    L8:
        r62 = AbstractC1160i.chooseSize(r6, r5.width() + r1, getMinimumWidth());
        int[] r53 = this.f3983c;
        r52 = AbstractC1160i.chooseSize(r7, r53[r53.length - 1] + r2, getMinimumHeight());
        goto L9
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean r2) {
        if (r2 == true) goto L6;
        super.setStackFromEnd(false);
        return;
    L6:
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC1160i
    public final boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null) goto L5;
        return false;
    L5:
        if (this.f3981a == true) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final int m2170t(int r4, int r5) {
        if (this.mOrientation == 1) goto L5;
    L8:
        int[] r0 = this.f3983c;
        return r0[r5 + r4] - r0[r4];
    L5:
        if (isLayoutRTL() == false) goto L8;
        int[] r02 = this.f3983c;
        int r1 = this.f3982b;
        return r02[r1 - r4] - r02[(r1 - r4) - r5];
    }

    /* JADX INFO: renamed from: u */
    public final int m2171u(int r2, C1161j r3, C0038Av r4) {
        boolean r42 = r4.f82g;
        C0649P3 r0 = this.f3987g;
        if (r42 == true) goto L6;
        int r32 = this.f3982b;
        r0.getClass();
        return C0649P3.m1269H(r2, r32);
    L6:
        int r22 = r3.m2256b(r2);
        if (r22 != (-1)) goto L10;
        return 0;
    L10:
        int r33 = this.f3982b;
        r0.getClass();
        return C0649P3.m1269H(r22, r33);
    }

    /* JADX INFO: renamed from: v */
    public final int m2172v(int r3, C1161j r4, C0038Av r5) {
        boolean r52 = r5.f82g;
        C0649P3 r0 = this.f3987g;
        if (r52 == true) goto L6;
        int r42 = this.f3982b;
        r0.getClass();
        return r3 % r42;
    L6:
        int r53 = this.f3986f.get(r3, -1);
        if (r53 == (-1)) goto L9;
        return r53;
    L9:
        int r32 = r4.m2256b(r3);
        if (r32 != (-1)) goto L13;
        return 0;
    L13:
        int r43 = this.f3982b;
        r0.getClass();
        return r32 % r43;
    }

    /* JADX INFO: renamed from: w */
    public final int m2173w(int r4, C1161j r5, C0038Av r6) {
        boolean r62 = r6.f82g;
        C0649P3 r0 = this.f3987g;
        if (r62 == true) goto L6;
        r0.getClass();
        return 1;
    L6:
        int r63 = this.f3985e.get(r4, -1);
        if (r63 == (-1)) goto L10;
        return r63;
    L10:
        if (r5.m2256b(r4) != (-1)) goto L12;
        return 1;
    L12:
        r0.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: x */
    public final void m2174x(View r9, int r10, boolean r11) {
        C1225bk r0 = (C1225bk) r9.getLayoutParams();
        Rect r1 = r0.f8527b;
        int r2 = ((r1.top + r1.bottom) + ((ViewGroup.MarginLayoutParams) r0).topMargin) + ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
        int r3 = ((r1.left + r1.right) + ((ViewGroup.MarginLayoutParams) r0).leftMargin) + ((ViewGroup.MarginLayoutParams) r0).rightMargin;
        int r12 = m2170t(r0.f4181e, r0.f4182f);
        if (this.mOrientation != 1) goto L5;
        int r102 = AbstractC1160i.getChildMeasureSpec(r12, r10, r3, ((ViewGroup.MarginLayoutParams) r0).width, false);
        int r02 = AbstractC1160i.getChildMeasureSpec(this.mOrientationHelper.mo5261l(), getHeightMode(), r2, ((ViewGroup.MarginLayoutParams) r0).height, true);
    L6:
        C2431qv r13 = (C2431qv) r9.getLayoutParams();
        if (r11 == false) goto L9;
        boolean r112 = shouldReMeasureChild(r9, r102, r02, r13);
    L10:
        if (r112 == false) goto L13;
        r9.measure(r102, r02);
        return;
    L13:
        return;
    L9:
        r112 = shouldMeasureChild(r9, r102, r02, r13);
        goto L10
    L5:
        int r103 = AbstractC1160i.getChildMeasureSpec(r12, r10, r2, ((ViewGroup.MarginLayoutParams) r0).height, false);
        int r03 = AbstractC1160i.getChildMeasureSpec(this.mOrientationHelper.mo5261l(), getWidthMode(), r3, ((ViewGroup.MarginLayoutParams) r0).width, true);
        r02 = r103;
        r102 = r03;
        goto L6
    }

    /* JADX INFO: renamed from: y */
    public final void m2175y(int r3) {
        if (r3 != this.f3982b) goto L5;
        return;
    L5:
        this.f3981a = true;
        if (r3 < 1) goto L10;
        this.f3982b = r3;
        this.f3987g.m1278I();
        requestLayout();
        return;
    L10:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "Span count should be at least 1. Provided "));
    }

    /* JADX INFO: renamed from: z */
    public final void m2176z() {
        if (getOrientation() != 1) goto L6;
        int r0 = getWidth() - getPaddingRight();
        int r1 = getPaddingLeft();
    L7:
        m2168r(r0 - r1);
        return;
    L6:
        r0 = getHeight() - getPaddingBottom();
        r1 = getPaddingTop();
        goto L7
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(ViewGroup.LayoutParams r4) {
        if ((r4 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        C1225bk r0 = new C1225bk((ViewGroup.MarginLayoutParams) r4);
        r0.f4181e = -1;
        r0.f4182f = 0;
        return r0;
    L6:
        C1225bk r02 = new C1225bk(r4);
        r02.f4181e = -1;
        r02.f4182f = 0;
        return r02;
    }

    public GridLayoutManager(int r3) {
        super(1);
        this.f3981a = false;
        this.f3982b = -1;
        this.f3985e = new SparseIntArray();
        this.f3986f = new SparseIntArray();
        this.f3987g = new C0649P3(20);
        this.f3988h = new Rect();
        m2175y(r3);
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
