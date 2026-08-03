package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0682Pu;
import p000.AbstractC0706Qb;
import p000.AbstractC1255cE;
import p000.AbstractC1360eE;
import p000.AbstractC2185lE;
import p000.AbstractC2357pE;
import p000.C0132D2;
import p000.C0422Js;
import p000.C0489LF;
import p000.C0834Tb;
import p000.C0920Vb;
import p000.C0963Wb;
import p000.C1067Yt;
import p000.C1110Zt;
import p000.C2428qs;
import p000.C2520sy;
import p000.InterfaceC0336Hs;
import p000.InterfaceC0379Is;
import p000.InterfaceC0748Rb;
import p000.ViewGroupOnHierarchyChangeListenerC0791Sb;
import p000.ViewTreeObserverOnPreDrawListenerC0877Ub;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0336Hs, InterfaceC0379Is {

    /* JADX INFO: renamed from: t */
    public static final String f3886t;

    /* JADX INFO: renamed from: u */
    public static final Class[] f3887u;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f3888v;

    /* JADX INFO: renamed from: w */
    public static final C0963Wb f3889w;

    /* JADX INFO: renamed from: x */
    public static final C1110Zt f3890x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f3891a;

    /* JADX INFO: renamed from: b */
    public final C2428qs f3892b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3893c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3894d;

    /* JADX INFO: renamed from: e */
    public final int[] f3895e;

    /* JADX INFO: renamed from: f */
    public final int[] f3896f;

    /* JADX INFO: renamed from: g */
    public boolean f3897g;

    /* JADX INFO: renamed from: h */
    public boolean f3898h;

    /* JADX INFO: renamed from: i */
    public final int[] f3899i;

    /* JADX INFO: renamed from: j */
    public View f3900j;

    /* JADX INFO: renamed from: k */
    public View f3901k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC0877Ub f3902l;

    /* JADX INFO: renamed from: m */
    public boolean f3903m;

    /* JADX INFO: renamed from: n */
    public C0489LF f3904n;

    /* JADX INFO: renamed from: o */
    public boolean f3905o;

    /* JADX INFO: renamed from: p */
    public Drawable f3906p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f3907q;

    /* JADX INFO: renamed from: r */
    public C0132D2 f3908r;

    /* JADX INFO: renamed from: s */
    public final C0422Js f3909s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f3886t = r0 != null ? r0.getName() : null;
        f3889w = new C0963Wb(0);
        f3887u = new Class[]{Context.class, AttributeSet.class};
        f3888v = new ThreadLocal();
        f3890x = new C1110Zt(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f3891a = new ArrayList();
        this.f3892b = new C2428qs(3);
        this.f3893c = new ArrayList();
        this.f3894d = new ArrayList();
        this.f3895e = new int[2];
        this.f3896f = new int[2];
        this.f3909s = new C0422Js();
        int[] iArr = AbstractC0682Pu.f2180a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f3899i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f3899i[i] = (int) (r1[i] * f);
            }
        }
        this.f3906p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m2144v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0791Sb(this));
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Rect m2129g() {
        Rect rect = (Rect) f3890x.mo1935c();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m2130l(int i, Rect rect, Rect rect2, C0834Tb c0834Tb, int i2, int i3) {
        int i4 = c0834Tb.f2647c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0834Tb.f2648d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: m */
    public static C0834Tb m2131m(View view) {
        C0834Tb c0834Tb = (C0834Tb) view.getLayoutParams();
        if (!c0834Tb.f2646b) {
            InterfaceC0748Rb interfaceC0748Rb = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0748Rb = (InterfaceC0748Rb) superclass.getAnnotation(InterfaceC0748Rb.class);
                if (interfaceC0748Rb != null) {
                    break;
                }
            }
            if (interfaceC0748Rb != null) {
                try {
                    AbstractC0706Qb abstractC0706Qb = (AbstractC0706Qb) interfaceC0748Rb.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0706Qb abstractC0706Qb2 = c0834Tb.f2645a;
                    if (abstractC0706Qb2 != abstractC0706Qb) {
                        if (abstractC0706Qb2 != null) {
                            abstractC0706Qb2.mo1457e();
                        }
                        c0834Tb.f2645a = abstractC0706Qb;
                        c0834Tb.f2646b = true;
                        if (abstractC0706Qb != null) {
                            abstractC0706Qb.mo1455c(c0834Tb);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC0748Rb.value().getClass();
                }
            }
            c0834Tb.f2646b = true;
        }
        return c0834Tb;
    }

    /* JADX INFO: renamed from: t */
    public static void m2132t(View view, int i) {
        C0834Tb c0834Tb = (C0834Tb) view.getLayoutParams();
        int i2 = c0834Tb.f2653i;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            view.offsetLeftAndRight(i - i2);
            c0834Tb.f2653i = i;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m2133u(View view, int i) {
        C0834Tb c0834Tb = (C0834Tb) view.getLayoutParams();
        int i2 = c0834Tb.f2654j;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(i - i2);
            c0834Tb.f2654j = i;
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: a */
    public final void mo720a(View view, View view2, int i, int i2) {
        C0422Js c0422Js = this.f3909s;
        if (i2 == 1) {
            c0422Js.f1404b = i;
        } else {
            c0422Js.f1403a = i;
        }
        this.f3901k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0834Tb) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: b */
    public final void mo721b(View view, int i) {
        C0422Js c0422Js = this.f3909s;
        if (i == 1) {
            c0422Js.f1404b = 0;
        } else {
            c0422Js.f1403a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0834Tb c0834Tb = (C0834Tb) childAt.getLayoutParams();
            if (c0834Tb.m1659a(i)) {
                AbstractC0706Qb abstractC0706Qb = c0834Tb.f2645a;
                if (abstractC0706Qb != null) {
                    abstractC0706Qb.mo1468p(childAt, view, i);
                }
                if (i == 0) {
                    c0834Tb.f2657m = false;
                } else if (i == 1) {
                    c0834Tb.f2658n = false;
                }
            }
        }
        this.f3901k = null;
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: c */
    public final void mo722c(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0706Qb abstractC0706Qb;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0834Tb c0834Tb = (C0834Tb) childAt.getLayoutParams();
                if (c0834Tb.m1659a(i3) && (abstractC0706Qb = c0834Tb.f2645a) != null) {
                    int[] iArr2 = this.f3895e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0706Qb.mo1462j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m2139o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0834Tb) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.InterfaceC0379Is
    /* JADX INFO: renamed from: d */
    public final void mo820d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0706Qb abstractC0706Qb;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0834Tb c0834Tb = (C0834Tb) childAt.getLayoutParams();
                if (c0834Tb.m1659a(i5) && (abstractC0706Qb = c0834Tb.f2645a) != null) {
                    int[] iArr2 = this.f3895e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0706Qb.mo1463k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m2139o(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0706Qb abstractC0706Qb = ((C0834Tb) view.getLayoutParams()).f2645a;
        if (abstractC0706Qb != null) {
            abstractC0706Qb.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3906p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: e */
    public final void mo723e(View view, int i, int i2, int i3, int i4, int i5) {
        mo820d(view, i, i2, i3, i4, 0, this.f3896f);
    }

    @Override // p000.InterfaceC0336Hs
    /* JADX INFO: renamed from: f */
    public final boolean mo724f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0834Tb c0834Tb = (C0834Tb) childAt.getLayoutParams();
                AbstractC0706Qb abstractC0706Qb = c0834Tb.f2645a;
                if (abstractC0706Qb != null) {
                    boolean zMo1467o = abstractC0706Qb.mo1467o(childAt, i, i2);
                    z |= zMo1467o;
                    if (i2 == 0) {
                        c0834Tb.f2657m = zMo1467o;
                    } else if (i2 == 1) {
                        c0834Tb.f2658n = zMo1467o;
                    }
                } else if (i2 == 0) {
                    c0834Tb.f2657m = false;
                } else if (i2 == 1) {
                    c0834Tb.f2658n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0834Tb();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0834Tb(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m2142r();
        return Collections.unmodifiableList(this.f3891a);
    }

    public final C0489LF getLastWindowInsets() {
        return this.f3904n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0422Js c0422Js = this.f3909s;
        return c0422Js.f1404b | c0422Js.f1403a;
    }

    public Drawable getStatusBarBackground() {
        return this.f3906p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX INFO: renamed from: h */
    public final void m2134h(C0834Tb c0834Tb, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0834Tb).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0834Tb).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0834Tb).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0834Tb).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: i */
    public final void m2135i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m2137k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m2136j(View view) {
        C2520sy c2520sy = (C2520sy) this.f3892b.f8523d;
        int i = c2520sy.f8818c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c2520sy.m5003j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2520sy.m5002f(i2));
            }
        }
        ArrayList arrayList3 = this.f3894d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m2137k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC2357pE.f8243a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC2357pE.f8243a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC2357pE.m4773a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC2357pE.f8244b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2138n(View view, int i, int i2) {
        C1110Zt c1110Zt = f3890x;
        Rect rectM2129g = m2129g();
        m2137k(view, rectM2129g);
        try {
            return rectM2129g.contains(i, i2);
        } finally {
            rectM2129g.setEmpty();
            c1110Zt.mo1934a(rectM2129g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2139o(int i) {
        int i2;
        Rect rect;
        int i3;
        int i4;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList2;
        C0834Tb c0834Tb;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        View view;
        AbstractC0706Qb abstractC0706Qb;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f3891a;
        int size = arrayList3.size();
        Rect rectM2129g = m2129g();
        Rect rectM2129g2 = m2129g();
        Rect rectM2129g3 = m2129g();
        int i14 = 0;
        while (true) {
            C1110Zt c1110Zt = f3890x;
            if (i14 >= size) {
                Rect rect3 = rectM2129g3;
                rectM2129g.setEmpty();
                c1110Zt.mo1934a(rectM2129g);
                rectM2129g2.setEmpty();
                c1110Zt.mo1934a(rectM2129g2);
                rect3.setEmpty();
                c1110Zt.mo1934a(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i14);
            C0834Tb c0834Tb2 = (C0834Tb) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size;
                rect = rectM2129g3;
                i2 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (c0834Tb2.f2656l == ((View) arrayList3.get(i15))) {
                        C0834Tb c0834Tb3 = (C0834Tb) view2.getLayoutParams();
                        if (c0834Tb3.f2655k != null) {
                            Rect rectM2129g4 = m2129g();
                            Rect rectM2129g5 = m2129g();
                            C0834Tb c0834Tb4 = c0834Tb2;
                            Rect rectM2129g6 = m2129g();
                            m2137k(c0834Tb3.f2655k, rectM2129g4);
                            m2135i(view2, rectM2129g5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            c0834Tb = c0834Tb4;
                            i11 = i15;
                            layoutDirection = layoutDirection;
                            i13 = i14;
                            view = view3;
                            m2130l(layoutDirection, rectM2129g4, rectM2129g6, c0834Tb3, measuredWidth, measuredHeight);
                            i12 = size;
                            rect2 = rectM2129g3;
                            boolean z3 = (rectM2129g6.left == rectM2129g5.left && rectM2129g6.top == rectM2129g5.top) ? false : true;
                            m2134h(c0834Tb3, rectM2129g6, measuredWidth, measuredHeight);
                            int i16 = rectM2129g6.left - rectM2129g5.left;
                            int i17 = rectM2129g6.top - rectM2129g5.top;
                            if (i16 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC2185lE.f7617a;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z3 && (abstractC0706Qb = c0834Tb3.f2645a) != null) {
                                abstractC0706Qb.mo1456d(this, view, c0834Tb3.f2655k);
                            }
                            rectM2129g4.setEmpty();
                            c1110Zt.mo1934a(rectM2129g4);
                            rectM2129g5.setEmpty();
                            c1110Zt.mo1934a(rectM2129g5);
                            rectM2129g6.setEmpty();
                            c1110Zt.mo1934a(rectM2129g6);
                        } else {
                            arrayList2 = arrayList3;
                            c0834Tb = c0834Tb2;
                            i11 = i15;
                            i12 = size;
                            rect2 = rectM2129g3;
                            i13 = i14;
                            view = view2;
                        }
                    }
                    i15 = i11 + 1;
                    c0834Tb2 = c0834Tb;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i12;
                    i14 = i13;
                    rectM2129g3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                C0834Tb c0834Tb5 = c0834Tb2;
                int i18 = size;
                Rect rect4 = rectM2129g3;
                i2 = i14;
                View view4 = view2;
                m2135i(view4, rectM2129g2, true);
                if (c0834Tb5.f2651g != 0 && !rectM2129g2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0834Tb5.f2651g, layoutDirection);
                    int i19 = absoluteGravity & 112;
                    if (i19 == 48) {
                        rectM2129g.top = Math.max(rectM2129g.top, rectM2129g2.bottom);
                    } else if (i19 == 80) {
                        rectM2129g.bottom = Math.max(rectM2129g.bottom, getHeight() - rectM2129g2.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        rectM2129g.left = Math.max(rectM2129g.left, rectM2129g2.right);
                    } else if (i20 == 5) {
                        rectM2129g.right = Math.max(rectM2129g.right, getWidth() - rectM2129g2.left);
                    }
                }
                if (c0834Tb5.f2652h == 0 || view4.getVisibility() != 0) {
                    if (i != 2) {
                        rect = rect4;
                        rect.set(((C0834Tb) view4.getLayoutParams()).f2659o);
                        if (rect.equals(rectM2129g2)) {
                            arrayList = arrayList4;
                            i4 = i18;
                        } else {
                            ((C0834Tb) view4.getLayoutParams()).f2659o.set(rectM2129g2);
                        }
                    } else {
                        rect = rect4;
                    }
                    i3 = i2 + 1;
                    i4 = i18;
                    while (true) {
                        arrayList = arrayList4;
                        if (i3 < i4) {
                            View view5 = (View) arrayList.get(i3);
                            AbstractC0706Qb abstractC0706Qb2 = ((C0834Tb) view5.getLayoutParams()).f2645a;
                            if (abstractC0706Qb2 != null) {
                                abstractC0706Qb2.mo1454b(view5);
                            }
                            i3++;
                            arrayList4 = arrayList;
                        }
                    }
                } else {
                    WeakHashMap weakHashMap4 = AbstractC2185lE.f7617a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C0834Tb c0834Tb6 = (C0834Tb) view4.getLayoutParams();
                        AbstractC0706Qb abstractC0706Qb3 = c0834Tb6.f2645a;
                        Rect rectM2129g7 = m2129g();
                        Rect rectM2129g8 = m2129g();
                        rectM2129g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC0706Qb3 == null || !abstractC0706Qb3.mo1453a(view4)) {
                            rectM2129g7.set(rectM2129g8);
                        } else if (!rectM2129g8.contains(rectM2129g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM2129g7.toShortString() + " | Bounds:" + rectM2129g8.toShortString());
                        }
                        rectM2129g8.setEmpty();
                        c1110Zt.mo1934a(rectM2129g8);
                        if (rectM2129g7.isEmpty()) {
                            rectM2129g7.setEmpty();
                            c1110Zt.mo1934a(rectM2129g7);
                            if (i != 2) {
                            }
                            i3 = i2 + 1;
                            i4 = i18;
                            while (true) {
                                arrayList = arrayList4;
                                if (i3 < i4) {
                                    break;
                                }
                                i3++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0834Tb6.f2652h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (rectM2129g7.top - ((ViewGroup.MarginLayoutParams) c0834Tb6).topMargin) - c0834Tb6.f2654j) >= (i10 = rectM2129g.top)) {
                                z = false;
                            } else {
                                m2133u(view4, i10 - i9);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM2129g7.bottom) - ((ViewGroup.MarginLayoutParams) c0834Tb6).bottomMargin) + c0834Tb6.f2654j) < (i8 = rectM2129g.bottom)) {
                                m2133u(view4, height - i8);
                                z = true;
                            }
                            if (!z) {
                                m2133u(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (rectM2129g7.left - ((ViewGroup.MarginLayoutParams) c0834Tb6).leftMargin) - c0834Tb6.f2653i) >= (i7 = rectM2129g.left)) {
                                z2 = false;
                            } else {
                                m2132t(view4, i7 - i6);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM2129g7.right) - ((ViewGroup.MarginLayoutParams) c0834Tb6).rightMargin) + c0834Tb6.f2653i) < (i5 = rectM2129g.right)) {
                                m2132t(view4, width - i5);
                                z2 = true;
                            }
                            if (!z2) {
                                m2132t(view4, 0);
                            }
                            rectM2129g7.setEmpty();
                            c1110Zt.mo1934a(rectM2129g7);
                            if (i != 2) {
                            }
                            i3 = i2 + 1;
                            i4 = i18;
                            while (true) {
                                arrayList = arrayList4;
                                if (i3 < i4) {
                                }
                                i3++;
                                arrayList4 = arrayList;
                            }
                        }
                    }
                }
            }
            i14 = i2 + 1;
            size = i4;
            rectM2129g3 = rect;
            arrayList3 = arrayList;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2143s(false);
        if (this.f3903m) {
            if (this.f3902l == null) {
                this.f3902l = new ViewTreeObserverOnPreDrawListenerC0877Ub(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3902l);
        }
        if (this.f3904n == null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            if (getFitsSystemWindows()) {
                AbstractC1255cE.m2370c(this);
            }
        }
        this.f3898h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2143s(false);
        if (this.f3903m && this.f3902l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3902l);
        }
        View view = this.f3901k;
        if (view != null) {
            mo721b(view, 0);
        }
        this.f3898h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3905o || this.f3906p == null) {
            return;
        }
        C0489LF c0489lf = this.f3904n;
        int iM943d = c0489lf != null ? c0489lf.m943d() : 0;
        if (iM943d > 0) {
            this.f3906p.setBounds(0, 0, getWidth(), iM943d);
            this.f3906p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2143s(true);
        }
        boolean zM2141q = m2141q(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM2141q;
        }
        m2143s(true);
        return zM2141q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0706Qb abstractC0706Qb;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f3891a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0706Qb = ((C0834Tb) view.getLayoutParams()).f2645a) == null || !abstractC0706Qb.mo1459g(this, view, layoutDirection))) {
                m2140p(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0706Qb abstractC0706Qb;
        int i4;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int absoluteGravity;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m2142r();
        int childCount = coordinatorLayout.getChildCount();
        int i13 = 0;
        loop0: while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i13);
            C2520sy c2520sy = (C2520sy) coordinatorLayout.f3892b.f8523d;
            int i14 = c2520sy.f8818c;
            for (int i15 = 0; i15 < i14; i15++) {
                ArrayList arrayList2 = (ArrayList) c2520sy.m5003j(i15);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i13++;
        }
        if (z != coordinatorLayout.f3903m) {
            if (z) {
                if (coordinatorLayout.f3898h) {
                    if (coordinatorLayout.f3902l == null) {
                        coordinatorLayout.f3902l = new ViewTreeObserverOnPreDrawListenerC0877Ub(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f3902l);
                }
                coordinatorLayout.f3903m = true;
            } else {
                if (coordinatorLayout.f3898h && coordinatorLayout.f3902l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f3902l);
                }
                coordinatorLayout.f3903m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.f3904n != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f3891a;
        int size3 = arrayList3.size();
        int i18 = 0;
        int iCombineMeasuredStates = 0;
        while (i18 < size3) {
            View view2 = (View) arrayList3.get(i18);
            int i19 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i5 = size3;
                i10 = i18;
                i8 = paddingRight;
                suggestedMinimumWidth = i19;
                z2 = false;
                i6 = paddingLeft;
            } else {
                C0834Tb c0834Tb = (C0834Tb) view2.getLayoutParams();
                int i20 = c0834Tb.f2649e;
                if (i20 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                    arrayList = arrayList3;
                } else {
                    i3 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.f3899i;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (i20 < 0 || i20 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i11 = iArr[i20];
                            i12 = c0834Tb.f2647c;
                            if (i12 == 0) {
                                i12 = 8388661;
                            }
                            absoluteGravity = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                            if (!(absoluteGravity == 3 || z3) || (absoluteGravity == 5 && z3)) {
                                iMax = Math.max(0, (size - paddingRight) - i11);
                            } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                                iMax = Math.max(0, i11 - paddingLeft);
                            }
                            if (z4 || view2.getFitsSystemWindows()) {
                                iMakeMeasureSpec = i;
                                iMakeMeasureSpec2 = i2;
                            } else {
                                int iM942c = coordinatorLayout.f3904n.m942c() + coordinatorLayout.f3904n.m941b();
                                int iM940a = coordinatorLayout.f3904n.m940a() + coordinatorLayout.f3904n.m943d();
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM942c, mode);
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM940a, mode2);
                            }
                            abstractC0706Qb = c0834Tb.f2645a;
                            if (abstractC0706Qb == null) {
                                int i21 = iMax;
                                int i22 = iMakeMeasureSpec;
                                i5 = size3;
                                i6 = paddingLeft;
                                i7 = i19;
                                int i23 = i3;
                                i8 = paddingRight;
                                i9 = i23;
                                z2 = false;
                                i10 = i18;
                                int i24 = iMakeMeasureSpec2;
                                boolean zMo1460h = abstractC0706Qb.mo1460h(this, view2, i22, i21, i24);
                                view = view2;
                                iMakeMeasureSpec = i22;
                                iMax = i21;
                                i4 = i24;
                                if (zMo1460h) {
                                    coordinatorLayout = this;
                                }
                                int iMax2 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0834Tb).leftMargin + ((ViewGroup.MarginLayoutParams) c0834Tb).rightMargin);
                                int iMax3 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0834Tb).topMargin + ((ViewGroup.MarginLayoutParams) c0834Tb).bottomMargin);
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                                suggestedMinimumWidth = iMax2;
                                suggestedMinimumHeight = iMax3;
                            } else {
                                int i25 = size3;
                                i4 = iMakeMeasureSpec2;
                                view = view2;
                                i5 = i25;
                                i6 = paddingLeft;
                                i7 = i19;
                                int i26 = i3;
                                i8 = paddingRight;
                                i9 = i26;
                                i10 = i18;
                                z2 = false;
                            }
                            coordinatorLayout = this;
                            coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                            int iMax22 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0834Tb).leftMargin + ((ViewGroup.MarginLayoutParams) c0834Tb).rightMargin);
                            int iMax32 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0834Tb).topMargin + ((ViewGroup.MarginLayoutParams) c0834Tb).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax22;
                            suggestedMinimumHeight = iMax32;
                        }
                    }
                    i11 = 0;
                    i12 = c0834Tb.f2647c;
                    if (i12 == 0) {
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                        if (absoluteGravity == 5) {
                        }
                    } else if (absoluteGravity == 5) {
                    }
                }
                iMax = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    abstractC0706Qb = c0834Tb.f2645a;
                    if (abstractC0706Qb == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                    int iMax222 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0834Tb).leftMargin + ((ViewGroup.MarginLayoutParams) c0834Tb).rightMargin);
                    int iMax322 = Math.max(i9, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0834Tb).topMargin + ((ViewGroup.MarginLayoutParams) c0834Tb).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax222;
                    suggestedMinimumHeight = iMax322;
                }
            }
            i18 = i10 + 1;
            size3 = i5;
            paddingLeft = i6;
            paddingRight = i8;
            arrayList3 = arrayList;
        }
        int i27 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i27), View.resolveSizeAndState(suggestedMinimumHeight, i2, i27 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0834Tb c0834Tb = (C0834Tb) childAt.getLayoutParams();
                if (c0834Tb.m1659a(0)) {
                    AbstractC0706Qb abstractC0706Qb = c0834Tb.f2645a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0706Qb abstractC0706Qb;
        int childCount = getChildCount();
        boolean zMo1461i = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0834Tb c0834Tb = (C0834Tb) childAt.getLayoutParams();
                if (c0834Tb.m1659a(0) && (abstractC0706Qb = c0834Tb.f2645a) != null) {
                    zMo1461i |= abstractC0706Qb.mo1461i(view);
                }
            }
        }
        return zMo1461i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo722c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo723e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo720a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0920Vb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0920Vb c0920Vb = (C0920Vb) parcelable;
        super.onRestoreInstanceState(c0920Vb.f8397a);
        SparseArray sparseArray = c0920Vb.f2875c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0706Qb abstractC0706Qb = m2131m(childAt).f2645a;
            if (id != -1 && abstractC0706Qb != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0706Qb.mo1465m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1466n;
        C0920Vb c0920Vb = new C0920Vb(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0706Qb abstractC0706Qb = ((C0834Tb) childAt.getLayoutParams()).f2645a;
            if (id != -1 && abstractC0706Qb != null && (parcelableMo1466n = abstractC0706Qb.mo1466n(childAt)) != null) {
                sparseArray.append(id, parcelableMo1466n);
            }
        }
        c0920Vb.f2875c = sparseArray;
        return c0920Vb;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo724f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo721b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2141q;
        boolean zMo1469q;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3900j == null) {
            zM2141q = m2141q(motionEvent, 1);
            if (!zM2141q) {
                zMo1469q = false;
            }
            motionEventObtain = null;
            if (this.f3900j != null) {
                zMo1469q |= super.onTouchEvent(motionEvent);
            } else if (zM2141q) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo1469q;
            }
            m2143s(false);
            return zMo1469q;
        }
        zM2141q = false;
        AbstractC0706Qb abstractC0706Qb = ((C0834Tb) this.f3900j.getLayoutParams()).f2645a;
        if (abstractC0706Qb != null) {
            zMo1469q = abstractC0706Qb.mo1469q(this.f3900j, motionEvent);
        }
        motionEventObtain = null;
        if (this.f3900j != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        m2143s(false);
        return zMo1469q;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2140p(View view, int i) {
        Rect rectM2129g;
        Rect rectM2129g2;
        int i2;
        C0834Tb c0834Tb = (C0834Tb) view.getLayoutParams();
        View view2 = c0834Tb.f2655k;
        if (view2 == null && c0834Tb.f2650f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C1110Zt c1110Zt = f3890x;
        if (view2 != null) {
            rectM2129g = m2129g();
            rectM2129g2 = m2129g();
            try {
                m2137k(view2, rectM2129g);
                C0834Tb c0834Tb2 = (C0834Tb) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m2130l(i, rectM2129g, rectM2129g2, c0834Tb2, measuredWidth, measuredHeight);
                m2134h(c0834Tb2, rectM2129g2, measuredWidth, measuredHeight);
                view.layout(rectM2129g2.left, rectM2129g2.top, rectM2129g2.right, rectM2129g2.bottom);
                return;
            } finally {
                rectM2129g.setEmpty();
                c1110Zt.mo1934a(rectM2129g);
                rectM2129g2.setEmpty();
                c1110Zt.mo1934a(rectM2129g2);
            }
        }
        int i3 = c0834Tb.f2649e;
        if (i3 < 0) {
            C0834Tb c0834Tb3 = (C0834Tb) view.getLayoutParams();
            rectM2129g = m2129g();
            rectM2129g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0834Tb3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0834Tb3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0834Tb3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0834Tb3).bottomMargin);
            if (this.f3904n != null) {
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM2129g.left = this.f3904n.m941b() + rectM2129g.left;
                    rectM2129g.top = this.f3904n.m943d() + rectM2129g.top;
                    rectM2129g.right -= this.f3904n.m942c();
                    rectM2129g.bottom -= this.f3904n.m940a();
                }
            }
            rectM2129g2 = m2129g();
            int i4 = c0834Tb3.f2647c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM2129g, rectM2129g2, i);
            view.layout(rectM2129g2.left, rectM2129g2.top, rectM2129g2.right, rectM2129g2.bottom);
            return;
        }
        C0834Tb c0834Tb4 = (C0834Tb) view.getLayoutParams();
        int i5 = c0834Tb4.f2647c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int i8 = 0;
        int[] iArr = this.f3899i;
        if (iArr == null || i3 < 0 || i3 >= iArr.length) {
            toString();
            i2 = 0;
            int i9 = i2 - measuredWidth2;
            if (i6 != 1) {
            }
            if (i7 != 16) {
            }
            int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0834Tb4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0834Tb4).rightMargin));
            int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0834Tb4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0834Tb4).bottomMargin));
            view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
        }
        i2 = iArr[i3];
        int i92 = i2 - measuredWidth2;
        if (i6 != 1) {
            i92 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            i92 += measuredWidth2;
        }
        if (i7 != 16) {
            i8 = measuredHeight2 / 2;
        } else if (i7 == 80) {
            i8 = measuredHeight2;
        }
        int iMax3 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0834Tb4).leftMargin, Math.min(i92, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0834Tb4).rightMargin));
        int iMax22 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0834Tb4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0834Tb4).bottomMargin));
        view.layout(iMax3, iMax22, measuredWidth2 + iMax3, measuredHeight2 + iMax22);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2141q(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f3893c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0963Wb c0963Wb = f3889w;
        if (c0963Wb != null) {
            Collections.sort(arrayList, c0963Wb);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1458f = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0706Qb abstractC0706Qb = ((C0834Tb) view.getLayoutParams()).f2645a;
            if (zMo1458f && actionMasked != 0) {
                if (abstractC0706Qb != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0706Qb.mo1458f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC0706Qb.mo1469q(view, motionEventObtain);
                    }
                }
            } else if (!zMo1458f && abstractC0706Qb != null) {
                if (i == 0) {
                    zMo1458f = abstractC0706Qb.mo1458f(this, view, motionEvent);
                } else if (i == 1) {
                    zMo1458f = abstractC0706Qb.mo1469q(view, motionEvent);
                }
                if (zMo1458f) {
                    this.f3900j = view;
                }
            }
        }
        arrayList.clear();
        return zMo1458f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2142r() {
        View viewFindViewById;
        ArrayList arrayList = this.f3891a;
        arrayList.clear();
        C2428qs c2428qs = this.f3892b;
        C2520sy c2520sy = (C2520sy) c2428qs.f8523d;
        C1067Yt c1067Yt = (C1067Yt) c2428qs.f8521b;
        C2520sy c2520sy2 = (C2520sy) c2428qs.f8523d;
        int i = c2520sy.f8818c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c2520sy.m5003j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                c1067Yt.mo1934a(arrayList2);
            }
        }
        c2520sy.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0834Tb c0834TbM2131m = m2131m(childAt);
            int i4 = c0834TbM2131m.f2650f;
            if (i4 == -1) {
                c0834TbM2131m.f2656l = null;
                c0834TbM2131m.f2655k = null;
            } else {
                View view = c0834TbM2131m.f2655k;
                if (view == null || view.getId() != i4) {
                    viewFindViewById = findViewById(i4);
                    c0834TbM2131m.f2655k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                        }
                        c0834TbM2131m.f2656l = null;
                        c0834TbM2131m.f2655k = null;
                    } else if (viewFindViewById != this) {
                        for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    viewFindViewById = parent;
                                }
                            } else {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                c0834TbM2131m.f2656l = null;
                                c0834TbM2131m.f2655k = null;
                            }
                        }
                        c0834TbM2131m.f2656l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        c0834TbM2131m.f2656l = null;
                        c0834TbM2131m.f2655k = null;
                    }
                } else {
                    View view2 = c0834TbM2131m.f2655k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c0834TbM2131m.f2656l = null;
                            c0834TbM2131m.f2655k = null;
                            viewFindViewById = findViewById(i4);
                            c0834TbM2131m.f2655k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c0834TbM2131m.f2656l = view2;
                }
            }
            if (!c2520sy2.containsKey(childAt)) {
                c2520sy2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != c0834TbM2131m.f2656l) {
                        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C0834Tb) childAt2.getLayoutParams()).f2651g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(c0834TbM2131m.f2652h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC0706Qb abstractC0706Qb = c0834TbM2131m.f2645a;
                            if (abstractC0706Qb != null) {
                                abstractC0706Qb.mo1454b(childAt);
                            }
                        } else {
                            if (!c2520sy2.containsKey(childAt2) && !c2520sy2.containsKey(childAt2)) {
                                c2520sy2.put(childAt2, null);
                            }
                            if (!c2520sy2.containsKey(childAt2) || !c2520sy2.containsKey(childAt)) {
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                            ArrayList arrayList3 = (ArrayList) c2520sy2.get(childAt2);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) c1067Yt.mo1935c();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                c2520sy2.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) c2428qs.f8520a;
        arrayList4.clear();
        HashSet hashSet = (HashSet) c2428qs.f8522c;
        hashSet.clear();
        int i6 = c2520sy2.f8818c;
        for (int i7 = 0; i7 < i6; i7++) {
            c2428qs.m4875m(c2520sy2.m5002f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0706Qb abstractC0706Qb = ((C0834Tb) view.getLayoutParams()).f2645a;
        if (abstractC0706Qb != null) {
            abstractC0706Qb.mo1464l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f3897g) {
            return;
        }
        m2143s(false);
        this.f3897g = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m2143s(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0706Qb abstractC0706Qb = ((C0834Tb) childAt.getLayoutParams()).f2645a;
            if (abstractC0706Qb != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0706Qb.mo1458f(this, childAt, motionEventObtain);
                } else {
                    abstractC0706Qb.mo1469q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0834Tb) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f3900j = null;
        this.f3897g = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2144v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3907q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3906p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3906p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f3906p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f3906p;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f3906p.setVisible(getVisibility() == 0, false);
                this.f3906p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3906p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f3906p.setVisible(z, false);
    }

    /* JADX INFO: renamed from: v */
    public final void m2144v() {
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if (!getFitsSystemWindows()) {
            AbstractC1360eE.m2640l(this, null);
            return;
        }
        if (this.f3908r == null) {
            this.f3908r = new C0132D2(13, this);
        }
        AbstractC1360eE.m2640l(this, this.f3908r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3906p;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0834Tb ? new C0834Tb((C0834Tb) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0834Tb((ViewGroup.MarginLayoutParams) layoutParams) : new C0834Tb(layoutParams);
    }
}
