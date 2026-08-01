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
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0224fh;
import p000.AbstractC0305ho;
import p000.AbstractC0629qd;
import p000.AbstractC0889xd;
import p000.AbstractC0984zy;
import p000.C0015ae;
import p000.C0101ce;
import p000.C0131cy;
import p000.C0148de;
import p000.C0402k8;
import p000.C0431l0;
import p000.C0759tw;
import p000.InterfaceC0685rw;
import p000.InterfaceC0722sw;
import p000.InterfaceC0926yd;
import p000.ViewGroupOnHierarchyChangeListenerC0963zd;
import p000.ViewTreeObserverOnPreDrawListenerC0065be;
import p000.b40;
import p000.ba0;
import p000.bd0;
import p000.da0;
import p000.oa0;
import p000.sa0;
import p000.x90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0685rw, InterfaceC0722sw {

    /* JADX INFO: renamed from: t */
    public static final String f378t;

    /* JADX INFO: renamed from: u */
    public static final Class[] f379u;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f380v;

    /* JADX INFO: renamed from: w */
    public static final C0148de f381w;

    /* JADX INFO: renamed from: x */
    public static final C0131cy f382x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f383a;

    /* JADX INFO: renamed from: b */
    public final C0402k8 f384b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f385c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f386d;

    /* JADX INFO: renamed from: e */
    public final int[] f387e;

    /* JADX INFO: renamed from: f */
    public final int[] f388f;

    /* JADX INFO: renamed from: g */
    public boolean f389g;

    /* JADX INFO: renamed from: h */
    public boolean f390h;

    /* JADX INFO: renamed from: i */
    public final int[] f391i;

    /* JADX INFO: renamed from: j */
    public View f392j;

    /* JADX INFO: renamed from: k */
    public View f393k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC0065be f394l;

    /* JADX INFO: renamed from: m */
    public boolean f395m;

    /* JADX INFO: renamed from: n */
    public bd0 f396n;

    /* JADX INFO: renamed from: o */
    public boolean f397o;

    /* JADX INFO: renamed from: p */
    public Drawable f398p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f399q;

    /* JADX INFO: renamed from: r */
    public C0431l0 f400r;

    /* JADX INFO: renamed from: s */
    public final C0759tw f401s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f378t = r0 != null ? r0.getName() : null;
        f381w = new C0148de(0);
        f379u = new Class[]{Context.class, AttributeSet.class};
        f380v = new ThreadLocal();
        f382x = new C0131cy();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f383a = new ArrayList();
        this.f384b = new C0402k8(1);
        this.f385c = new ArrayList();
        this.f386d = new ArrayList();
        this.f387e = new int[2];
        this.f388f = new int[2];
        this.f401s = new C0759tw();
        int[] iArr = AbstractC0984zy.f5629a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f391i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f391i[i] = (int) (r1[i] * f);
            }
        }
        this.f398p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m213w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0963zd(this));
        WeakHashMap weakHashMap = oa0.f3426a;
        if (x90.m2655c(this) == 0) {
            x90.m2671s(this, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Rect m197g() {
        Rect rect = (Rect) f382x.mo475a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m198l(int i, Rect rect, Rect rect2, C0015ae c0015ae, int i2, int i3) {
        int i4 = c0015ae.f66c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0015ae.f67d;
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

    /* JADX INFO: renamed from: n */
    public static C0015ae m199n(View view) {
        C0015ae c0015ae = (C0015ae) view.getLayoutParams();
        if (!c0015ae.f65b) {
            InterfaceC0926yd interfaceC0926yd = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0926yd = (InterfaceC0926yd) superclass.getAnnotation(InterfaceC0926yd.class);
                if (interfaceC0926yd != null) {
                    break;
                }
            }
            if (interfaceC0926yd != null) {
                try {
                    AbstractC0889xd abstractC0889xd = (AbstractC0889xd) interfaceC0926yd.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0889xd abstractC0889xd2 = c0015ae.f64a;
                    if (abstractC0889xd2 != abstractC0889xd) {
                        if (abstractC0889xd2 != null) {
                            abstractC0889xd2.mo683e();
                        }
                        c0015ae.f64a = abstractC0889xd;
                        c0015ae.f65b = true;
                        if (abstractC0889xd != null) {
                            abstractC0889xd.mo682c(c0015ae);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0926yd.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0015ae.f65b = true;
        }
        return c0015ae;
    }

    /* JADX INFO: renamed from: u */
    public static void m200u(View view, int i) {
        C0015ae c0015ae = (C0015ae) view.getLayoutParams();
        int i2 = c0015ae.f72i;
        if (i2 != i) {
            WeakHashMap weakHashMap = oa0.f3426a;
            view.offsetLeftAndRight(i - i2);
            c0015ae.f72i = i;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m201v(View view, int i) {
        C0015ae c0015ae = (C0015ae) view.getLayoutParams();
        int i2 = c0015ae.f73j;
        if (i2 != i) {
            WeakHashMap weakHashMap = oa0.f3426a;
            view.offsetTopAndBottom(i - i2);
            c0015ae.f73j = i;
        }
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: a */
    public final void mo134a(View view, View view2, int i, int i2) {
        C0759tw c0759tw = this.f401s;
        if (i2 == 1) {
            c0759tw.f4594b = i;
        } else {
            c0759tw.f4593a = i;
        }
        this.f393k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0015ae) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: b */
    public final void mo135b(View view, int i) {
        C0759tw c0759tw = this.f401s;
        if (i == 1) {
            c0759tw.f4594b = 0;
        } else {
            c0759tw.f4593a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0015ae c0015ae = (C0015ae) childAt.getLayoutParams();
            if (c0015ae.m49a(i)) {
                AbstractC0889xd abstractC0889xd = c0015ae.f64a;
                if (abstractC0889xd != null) {
                    abstractC0889xd.mo662p(childAt, view, i);
                }
                if (i == 0) {
                    c0015ae.f76m = false;
                } else if (i == 1) {
                    c0015ae.f77n = false;
                }
            }
        }
        this.f393k = null;
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: c */
    public final void mo136c(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0889xd abstractC0889xd;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0015ae c0015ae = (C0015ae) childAt.getLayoutParams();
                if (c0015ae.m49a(i3) && (abstractC0889xd = c0015ae.f64a) != null) {
                    int[] iArr2 = this.f387e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0889xd.mo657j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m208p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0015ae) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.InterfaceC0722sw
    /* JADX INFO: renamed from: d */
    public final void mo137d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0889xd abstractC0889xd;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0015ae c0015ae = (C0015ae) childAt.getLayoutParams();
                if (c0015ae.m49a(i5) && (abstractC0889xd = c0015ae.f64a) != null) {
                    int[] iArr2 = this.f387e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0889xd.mo658k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m208p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0889xd abstractC0889xd = ((C0015ae) view.getLayoutParams()).f64a;
        if (abstractC0889xd != null) {
            abstractC0889xd.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f398p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: e */
    public final void mo138e(View view, int i, int i2, int i3, int i4, int i5) {
        mo137d(view, i, i2, i3, i4, 0, this.f388f);
    }

    @Override // p000.InterfaceC0685rw
    /* JADX INFO: renamed from: f */
    public final boolean mo139f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0015ae c0015ae = (C0015ae) childAt.getLayoutParams();
                AbstractC0889xd abstractC0889xd = c0015ae.f64a;
                if (abstractC0889xd != null) {
                    boolean zMo661o = abstractC0889xd.mo661o(childAt, i, i2);
                    z |= zMo661o;
                    if (i2 == 0) {
                        c0015ae.f76m = zMo661o;
                    } else if (i2 == 1) {
                        c0015ae.f77n = zMo661o;
                    }
                } else if (i2 == 0) {
                    c0015ae.f76m = false;
                } else if (i2 == 1) {
                    c0015ae.f77n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0015ae();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0015ae(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m211s();
        return Collections.unmodifiableList(this.f383a);
    }

    public final bd0 getLastWindowInsets() {
        return this.f396n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0759tw c0759tw = this.f401s;
        return c0759tw.f4594b | c0759tw.f4593a;
    }

    public Drawable getStatusBarBackground() {
        return this.f398p;
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
    public final void m202h(C0015ae c0015ae, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0015ae).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0015ae).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0015ae).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0015ae).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: i */
    public final void m203i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m205k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m204j(View view) {
        b40 b40Var = (b40) this.f384b.f2795b;
        int i = b40Var.f681c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) b40Var.m487j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b40Var.m485h(i2));
            }
        }
        ArrayList arrayList3 = this.f386d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m205k(View view, Rect rect) {
        ThreadLocal threadLocal = sa0.f4287a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = sa0.f4287a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        sa0.m2361a(this, view, matrix);
        ThreadLocal threadLocal3 = sa0.f4288b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: m */
    public final int m206m(int i) {
        int[] iArr = this.f391i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m207o(View view, int i, int i2) {
        C0131cy c0131cy = f382x;
        Rect rectM197g = m197g();
        m205k(view, rectM197g);
        try {
            return rectM197g.contains(i, i2);
        } finally {
            rectM197g.setEmpty();
            c0131cy.mo477c(rectM197g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m212t(false);
        if (this.f395m) {
            if (this.f394l == null) {
                this.f394l = new ViewTreeObserverOnPreDrawListenerC0065be(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f394l);
        }
        if (this.f396n == null) {
            WeakHashMap weakHashMap = oa0.f3426a;
            if (x90.m2654b(this)) {
                ba0.m506c(this);
            }
        }
        this.f390h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m212t(false);
        if (this.f395m && this.f394l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f394l);
        }
        View view = this.f393k;
        if (view != null) {
            mo135b(view, 0);
        }
        this.f390h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f397o || this.f398p == null) {
            return;
        }
        bd0 bd0Var = this.f396n;
        int iM519d = bd0Var != null ? bd0Var.m519d() : 0;
        if (iM519d > 0) {
            this.f398p.setBounds(0, 0, getWidth(), iM519d);
            this.f398p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m212t(true);
        }
        boolean zM210r = m210r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM210r;
        }
        m212t(true);
        return zM210r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0889xd abstractC0889xd;
        WeakHashMap weakHashMap = oa0.f3426a;
        int iM2732d = y90.m2732d(this);
        ArrayList arrayList = this.f383a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0889xd = ((C0015ae) view.getLayoutParams()).f64a) == null || !abstractC0889xd.mo655g(this, view, iM2732d))) {
                m209q(view, iM2732d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0015ae c0015ae = (C0015ae) childAt.getLayoutParams();
                if (c0015ae.m49a(0)) {
                    AbstractC0889xd abstractC0889xd = c0015ae.f64a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0889xd abstractC0889xd;
        int childCount = getChildCount();
        boolean zMo684i = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0015ae c0015ae = (C0015ae) childAt.getLayoutParams();
                if (c0015ae.m49a(0) && (abstractC0889xd = c0015ae.f64a) != null) {
                    zMo684i |= abstractC0889xd.mo684i(view);
                }
            }
        }
        return zMo684i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo136c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo138e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo134a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0101ce)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0101ce c0101ce = (C0101ce) parcelable;
        super.onRestoreInstanceState(c0101ce.f1274a);
        SparseArray sparseArray = c0101ce.f891c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0889xd abstractC0889xd = m199n(childAt).f64a;
            if (id != -1 && abstractC0889xd != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0889xd.mo659m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo660n;
        C0101ce c0101ce = new C0101ce(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0889xd abstractC0889xd = ((C0015ae) childAt.getLayoutParams()).f64a;
            if (id != -1 && abstractC0889xd != null && (parcelableMo660n = abstractC0889xd.mo660n(childAt)) != null) {
                sparseArray.append(id, parcelableMo660n);
            }
        }
        c0101ce.f891c = sparseArray;
        return c0101ce;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo139f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo135b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f392j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m210r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f392j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            ae r6 = (p000.C0015ae) r6
            xd r6 = r6.f64a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f392j
            boolean r6 = r6.mo663q(r7, r1)
        L2a:
            android.view.View r7 = r0.f392j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.m212t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m208p(int r23) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m208p(int):void");
    }

    /* JADX INFO: renamed from: q */
    public final void m209q(View view, int i) {
        Rect rectM197g;
        Rect rectM197g2;
        C0015ae c0015ae = (C0015ae) view.getLayoutParams();
        View view2 = c0015ae.f74k;
        if (view2 == null && c0015ae.f69f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0131cy c0131cy = f382x;
        if (view2 != null) {
            rectM197g = m197g();
            rectM197g2 = m197g();
            try {
                m205k(view2, rectM197g);
                C0015ae c0015ae2 = (C0015ae) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m198l(i, rectM197g, rectM197g2, c0015ae2, measuredWidth, measuredHeight);
                m202h(c0015ae2, rectM197g2, measuredWidth, measuredHeight);
                view.layout(rectM197g2.left, rectM197g2.top, rectM197g2.right, rectM197g2.bottom);
                return;
            } finally {
                rectM197g.setEmpty();
                c0131cy.mo477c(rectM197g);
                rectM197g2.setEmpty();
                c0131cy.mo477c(rectM197g2);
            }
        }
        int i2 = c0015ae.f68e;
        if (i2 < 0) {
            C0015ae c0015ae3 = (C0015ae) view.getLayoutParams();
            rectM197g = m197g();
            rectM197g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0015ae3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0015ae3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0015ae3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0015ae3).bottomMargin);
            if (this.f396n != null) {
                WeakHashMap weakHashMap = oa0.f3426a;
                if (x90.m2654b(this) && !x90.m2654b(view)) {
                    rectM197g.left = this.f396n.m517b() + rectM197g.left;
                    rectM197g.top = this.f396n.m519d() + rectM197g.top;
                    rectM197g.right -= this.f396n.m518c();
                    rectM197g.bottom -= this.f396n.m516a();
                }
            }
            rectM197g2 = m197g();
            int i3 = c0015ae3.f66c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            AbstractC0305ho.m1409b(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM197g, rectM197g2, i);
            view.layout(rectM197g2.left, rectM197g2.top, rectM197g2.right, rectM197g2.bottom);
            return;
        }
        C0015ae c0015ae4 = (C0015ae) view.getLayoutParams();
        int i4 = c0015ae4.f66c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iM206m = m206m(i2) - measuredWidth2;
        if (i5 == 1) {
            iM206m += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM206m += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0015ae4).leftMargin, Math.min(iM206m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0015ae4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0015ae4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0015ae4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m210r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f385c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0148de c0148de = f381w;
        if (c0148de != null) {
            Collections.sort(arrayList, c0148de);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo654f = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0889xd abstractC0889xd = ((C0015ae) view.getLayoutParams()).f64a;
            if (zMo654f && actionMasked != 0) {
                if (abstractC0889xd != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0889xd.mo654f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC0889xd.mo663q(view, motionEventObtain);
                    }
                }
            } else if (!zMo654f && abstractC0889xd != null) {
                if (i == 0) {
                    zMo654f = abstractC0889xd.mo654f(this, view, motionEvent);
                } else if (i == 1) {
                    zMo654f = abstractC0889xd.mo663q(view, motionEvent);
                }
                if (zMo654f) {
                    this.f392j = view;
                }
            }
        }
        arrayList.clear();
        return zMo654f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0889xd abstractC0889xd = ((C0015ae) view.getLayoutParams()).f64a;
        if (abstractC0889xd != null) {
            abstractC0889xd.mo667l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f389g) {
            return;
        }
        m212t(false);
        this.f389g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m211s() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m211s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m213w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f399q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f398p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f398p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f398p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f398p;
                WeakHashMap weakHashMap = oa0.f3426a;
                AbstractC0224fh.m1101b(drawable3, y90.m2732d(this));
                this.f398p.setVisible(getVisibility() == 0, false);
                this.f398p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = oa0.f3426a;
            x90.m2663k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC0629qd.m2148b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f398p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f398p.setVisible(z, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m212t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0889xd abstractC0889xd = ((C0015ae) childAt.getLayoutParams()).f64a;
            if (abstractC0889xd != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0889xd.mo654f(this, childAt, motionEventObtain);
                } else {
                    abstractC0889xd.mo663q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0015ae) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f392j = null;
        this.f389g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f398p;
    }

    /* JADX INFO: renamed from: w */
    public final void m213w() {
        WeakHashMap weakHashMap = oa0.f3426a;
        if (!x90.m2654b(this)) {
            da0.m903u(this, null);
            return;
        }
        if (this.f400r == null) {
            this.f400r = new C0431l0(9, this);
        }
        da0.m903u(this, this.f400r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0015ae ? new C0015ae((C0015ae) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0015ae((ViewGroup.MarginLayoutParams) layoutParams) : new C0015ae(layoutParams);
    }
}
