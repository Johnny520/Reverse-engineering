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
import p000.AbstractC0111co;
import p000.AbstractC0151dh;
import p000.AbstractC0257gd;
import p000.AbstractC0725sy;
import p000.AbstractC0852wd;
import p000.C0009a8;
import p000.C0065be;
import p000.C0101ce;
import p000.C0431l0;
import p000.C0463lw;
import p000.C0761tx;
import p000.C0963zd;
import p000.InterfaceC0389jw;
import p000.InterfaceC0426kw;
import p000.InterfaceC0889xd;
import p000.ViewGroupOnHierarchyChangeListenerC0926yd;
import p000.ViewTreeObserverOnPreDrawListenerC0015ae;
import p000.ja0;
import p000.na0;
import p000.s90;
import p000.t90;
import p000.u30;
import p000.w90;
import p000.wc0;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0389jw, InterfaceC0426kw {

    /* JADX INFO: renamed from: t */
    public static final String f415t;

    /* JADX INFO: renamed from: u */
    public static final Class[] f416u;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f417v;

    /* JADX INFO: renamed from: w */
    public static final C0101ce f418w;

    /* JADX INFO: renamed from: x */
    public static final C0761tx f419x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f420a;

    /* JADX INFO: renamed from: b */
    public final C0009a8 f421b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f422c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f423d;

    /* JADX INFO: renamed from: e */
    public final int[] f424e;

    /* JADX INFO: renamed from: f */
    public final int[] f425f;

    /* JADX INFO: renamed from: g */
    public boolean f426g;

    /* JADX INFO: renamed from: h */
    public boolean f427h;

    /* JADX INFO: renamed from: i */
    public final int[] f428i;

    /* JADX INFO: renamed from: j */
    public View f429j;

    /* JADX INFO: renamed from: k */
    public View f430k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC0015ae f431l;

    /* JADX INFO: renamed from: m */
    public boolean f432m;

    /* JADX INFO: renamed from: n */
    public wc0 f433n;

    /* JADX INFO: renamed from: o */
    public boolean f434o;

    /* JADX INFO: renamed from: p */
    public Drawable f435p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f436q;

    /* JADX INFO: renamed from: r */
    public C0431l0 f437r;

    /* JADX INFO: renamed from: s */
    public final C0463lw f438s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f415t = r0 != null ? r0.getName() : null;
        f418w = new C0101ce(0);
        f416u = new Class[]{Context.class, AttributeSet.class};
        f417v = new ThreadLocal();
        f419x = new C0761tx();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f420a = new ArrayList();
        this.f421b = new C0009a8(1);
        this.f422c = new ArrayList();
        this.f423d = new ArrayList();
        this.f424e = new int[2];
        this.f425f = new int[2];
        this.f438s = new C0463lw();
        int[] iArr = AbstractC0725sy.f4470a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f428i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f428i[i] = (int) (r1[i] * f);
            }
        }
        this.f435p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m228w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0926yd(this));
        WeakHashMap weakHashMap = ja0.f2600a;
        if (s90.m2311c(this) == 0) {
            s90.m2327s(this, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Rect m212g() {
        Rect rect = (Rect) f419x.mo2338a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m213l(int i, Rect rect, Rect rect2, C0963zd c0963zd, int i2, int i3) {
        int i4 = c0963zd.f5541c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0963zd.f5542d;
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
    public static C0963zd m214n(View view) {
        C0963zd c0963zd = (C0963zd) view.getLayoutParams();
        if (!c0963zd.f5540b) {
            InterfaceC0889xd interfaceC0889xd = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0889xd = (InterfaceC0889xd) superclass.getAnnotation(InterfaceC0889xd.class);
                if (interfaceC0889xd != null) {
                    break;
                }
            }
            if (interfaceC0889xd != null) {
                try {
                    AbstractC0852wd abstractC0852wd = (AbstractC0852wd) interfaceC0889xd.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0852wd abstractC0852wd2 = c0963zd.f5539a;
                    if (abstractC0852wd2 != abstractC0852wd) {
                        if (abstractC0852wd2 != null) {
                            abstractC0852wd2.mo725e();
                        }
                        c0963zd.f5539a = abstractC0852wd;
                        c0963zd.f5540b = true;
                        if (abstractC0852wd != null) {
                            abstractC0852wd.mo724c(c0963zd);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0889xd.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c0963zd.f5540b = true;
        }
        return c0963zd;
    }

    /* JADX INFO: renamed from: u */
    public static void m215u(View view, int i) {
        C0963zd c0963zd = (C0963zd) view.getLayoutParams();
        int i2 = c0963zd.f5547i;
        if (i2 != i) {
            WeakHashMap weakHashMap = ja0.f2600a;
            view.offsetLeftAndRight(i - i2);
            c0963zd.f5547i = i;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m216v(View view, int i) {
        C0963zd c0963zd = (C0963zd) view.getLayoutParams();
        int i2 = c0963zd.f5548j;
        if (i2 != i) {
            WeakHashMap weakHashMap = ja0.f2600a;
            view.offsetTopAndBottom(i - i2);
            c0963zd.f5548j = i;
        }
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: a */
    public final void mo149a(View view, View view2, int i, int i2) {
        C0463lw c0463lw = this.f438s;
        if (i2 == 1) {
            c0463lw.f3118b = i;
        } else {
            c0463lw.f3117a = i;
        }
        this.f430k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0963zd) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: b */
    public final void mo150b(View view, int i) {
        C0463lw c0463lw = this.f438s;
        if (i == 1) {
            c0463lw.f3118b = 0;
        } else {
            c0463lw.f3117a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0963zd c0963zd = (C0963zd) childAt.getLayoutParams();
            if (c0963zd.m2802a(i)) {
                AbstractC0852wd abstractC0852wd = c0963zd.f5539a;
                if (abstractC0852wd != null) {
                    abstractC0852wd.mo704p(childAt, view, i);
                }
                if (i == 0) {
                    c0963zd.f5551m = false;
                } else if (i == 1) {
                    c0963zd.f5552n = false;
                }
            }
        }
        this.f430k = null;
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: c */
    public final void mo151c(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0852wd abstractC0852wd;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0963zd c0963zd = (C0963zd) childAt.getLayoutParams();
                if (c0963zd.m2802a(i3) && (abstractC0852wd = c0963zd.f5539a) != null) {
                    int[] iArr2 = this.f424e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0852wd.mo699j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m223p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0963zd) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.InterfaceC0426kw
    /* JADX INFO: renamed from: d */
    public final void mo152d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0852wd abstractC0852wd;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0963zd c0963zd = (C0963zd) childAt.getLayoutParams();
                if (c0963zd.m2802a(i5) && (abstractC0852wd = c0963zd.f5539a) != null) {
                    int[] iArr2 = this.f424e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0852wd.mo700k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m223p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0852wd abstractC0852wd = ((C0963zd) view.getLayoutParams()).f5539a;
        if (abstractC0852wd != null) {
            abstractC0852wd.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f435p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: e */
    public final void mo153e(View view, int i, int i2, int i3, int i4, int i5) {
        mo152d(view, i, i2, i3, i4, 0, this.f425f);
    }

    @Override // p000.InterfaceC0389jw
    /* JADX INFO: renamed from: f */
    public final boolean mo154f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0963zd c0963zd = (C0963zd) childAt.getLayoutParams();
                AbstractC0852wd abstractC0852wd = c0963zd.f5539a;
                if (abstractC0852wd != null) {
                    boolean zMo703o = abstractC0852wd.mo703o(childAt, i, i2);
                    z |= zMo703o;
                    if (i2 == 0) {
                        c0963zd.f5551m = zMo703o;
                    } else if (i2 == 1) {
                        c0963zd.f5552n = zMo703o;
                    }
                } else if (i2 == 0) {
                    c0963zd.f5551m = false;
                } else if (i2 == 1) {
                    c0963zd.f5552n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0963zd();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0963zd(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m226s();
        return Collections.unmodifiableList(this.f420a);
    }

    public final wc0 getLastWindowInsets() {
        return this.f433n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0463lw c0463lw = this.f438s;
        return c0463lw.f3118b | c0463lw.f3117a;
    }

    public Drawable getStatusBarBackground() {
        return this.f435p;
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
    public final void m217h(C0963zd c0963zd, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0963zd).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0963zd).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0963zd).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0963zd).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: i */
    public final void m218i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m220k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m219j(View view) {
        u30 u30Var = (u30) this.f421b.f65b;
        int i = u30Var.f4662c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) u30Var.m2418j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u30Var.m2416h(i2));
            }
        }
        ArrayList arrayList3 = this.f423d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m220k(View view, Rect rect) {
        ThreadLocal threadLocal = na0.f3365a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = na0.f3365a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        na0.m1925a(this, view, matrix);
        ThreadLocal threadLocal3 = na0.f3366b;
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
    public final int m221m(int i) {
        int[] iArr = this.f428i;
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
    public final boolean m222o(View view, int i, int i2) {
        C0761tx c0761tx = f419x;
        Rect rectM212g = m212g();
        m220k(view, rectM212g);
        try {
            return rectM212g.contains(i, i2);
        } finally {
            rectM212g.setEmpty();
            c0761tx.mo2340c(rectM212g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m227t(false);
        if (this.f432m) {
            if (this.f431l == null) {
                this.f431l = new ViewTreeObserverOnPreDrawListenerC0015ae(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f431l);
        }
        if (this.f433n == null) {
            WeakHashMap weakHashMap = ja0.f2600a;
            if (s90.m2310b(this)) {
                w90.m2552c(this);
            }
        }
        this.f427h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m227t(false);
        if (this.f432m && this.f431l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f431l);
        }
        View view = this.f430k;
        if (view != null) {
            mo150b(view, 0);
        }
        this.f427h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f434o || this.f435p == null) {
            return;
        }
        wc0 wc0Var = this.f433n;
        int iM2567d = wc0Var != null ? wc0Var.m2567d() : 0;
        if (iM2567d > 0) {
            this.f435p.setBounds(0, 0, getWidth(), iM2567d);
            this.f435p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m227t(true);
        }
        boolean zM225r = m225r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM225r;
        }
        m227t(true);
        return zM225r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0852wd abstractC0852wd;
        WeakHashMap weakHashMap = ja0.f2600a;
        int iM2367d = t90.m2367d(this);
        ArrayList arrayList = this.f420a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0852wd = ((C0963zd) view.getLayoutParams()).f5539a) == null || !abstractC0852wd.mo697g(this, view, iM2367d))) {
                m224q(view, iM2367d);
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
                C0963zd c0963zd = (C0963zd) childAt.getLayoutParams();
                if (c0963zd.m2802a(0)) {
                    AbstractC0852wd abstractC0852wd = c0963zd.f5539a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0852wd abstractC0852wd;
        int childCount = getChildCount();
        boolean zMo726i = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0963zd c0963zd = (C0963zd) childAt.getLayoutParams();
                if (c0963zd.m2802a(0) && (abstractC0852wd = c0963zd.f5539a) != null) {
                    zMo726i |= abstractC0852wd.mo726i(view);
                }
            }
        }
        return zMo726i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo151c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo153e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo149a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0065be)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0065be c0065be = (C0065be) parcelable;
        super.onRestoreInstanceState(c0065be.f1344a);
        SparseArray sparseArray = c0065be.f809c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0852wd abstractC0852wd = m214n(childAt).f5539a;
            if (id != -1 && abstractC0852wd != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0852wd.mo701m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo702n;
        C0065be c0065be = new C0065be(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0852wd abstractC0852wd = ((C0963zd) childAt.getLayoutParams()).f5539a;
            if (id != -1 && abstractC0852wd != null && (parcelableMo702n = abstractC0852wd.mo702n(childAt)) != null) {
                sparseArray.append(id, parcelableMo702n);
            }
        }
        c0065be.f809c = sparseArray;
        return c0065be;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo154f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo150b(view, 0);
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
            android.view.View r3 = r0.f429j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m225r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f429j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            zd r6 = (p000.C0963zd) r6
            wd r6 = r6.f5539a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f429j
            boolean r6 = r6.mo705q(r7, r1)
        L2a:
            android.view.View r7 = r0.f429j
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
            r0.m227t(r5)
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
    public final void m223p(int r23) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m223p(int):void");
    }

    /* JADX INFO: renamed from: q */
    public final void m224q(View view, int i) {
        Rect rectM212g;
        Rect rectM212g2;
        C0963zd c0963zd = (C0963zd) view.getLayoutParams();
        View view2 = c0963zd.f5549k;
        if (view2 == null && c0963zd.f5544f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0761tx c0761tx = f419x;
        if (view2 != null) {
            rectM212g = m212g();
            rectM212g2 = m212g();
            try {
                m220k(view2, rectM212g);
                C0963zd c0963zd2 = (C0963zd) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m213l(i, rectM212g, rectM212g2, c0963zd2, measuredWidth, measuredHeight);
                m217h(c0963zd2, rectM212g2, measuredWidth, measuredHeight);
                view.layout(rectM212g2.left, rectM212g2.top, rectM212g2.right, rectM212g2.bottom);
                return;
            } finally {
                rectM212g.setEmpty();
                c0761tx.mo2340c(rectM212g);
                rectM212g2.setEmpty();
                c0761tx.mo2340c(rectM212g2);
            }
        }
        int i2 = c0963zd.f5543e;
        if (i2 < 0) {
            C0963zd c0963zd3 = (C0963zd) view.getLayoutParams();
            rectM212g = m212g();
            rectM212g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0963zd3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0963zd3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0963zd3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0963zd3).bottomMargin);
            if (this.f433n != null) {
                WeakHashMap weakHashMap = ja0.f2600a;
                if (s90.m2310b(this) && !s90.m2310b(view)) {
                    rectM212g.left = this.f433n.m2565b() + rectM212g.left;
                    rectM212g.top = this.f433n.m2567d() + rectM212g.top;
                    rectM212g.right -= this.f433n.m2566c();
                    rectM212g.bottom -= this.f433n.m2564a();
                }
            }
            rectM212g2 = m212g();
            int i3 = c0963zd3.f5541c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            AbstractC0111co.m694b(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM212g, rectM212g2, i);
            view.layout(rectM212g2.left, rectM212g2.top, rectM212g2.right, rectM212g2.bottom);
            return;
        }
        C0963zd c0963zd4 = (C0963zd) view.getLayoutParams();
        int i4 = c0963zd4.f5541c;
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
        int iM221m = m221m(i2) - measuredWidth2;
        if (i5 == 1) {
            iM221m += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM221m += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0963zd4).leftMargin, Math.min(iM221m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0963zd4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0963zd4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0963zd4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m225r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f422c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0101ce c0101ce = f418w;
        if (c0101ce != null) {
            Collections.sort(arrayList, c0101ce);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo696f = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0852wd abstractC0852wd = ((C0963zd) view.getLayoutParams()).f5539a;
            if (zMo696f && actionMasked != 0) {
                if (abstractC0852wd != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC0852wd.mo696f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC0852wd.mo705q(view, motionEventObtain);
                    }
                }
            } else if (!zMo696f && abstractC0852wd != null) {
                if (i == 0) {
                    zMo696f = abstractC0852wd.mo696f(this, view, motionEvent);
                } else if (i == 1) {
                    zMo696f = abstractC0852wd.mo705q(view, motionEvent);
                }
                if (zMo696f) {
                    this.f429j = view;
                }
            }
        }
        arrayList.clear();
        return zMo696f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0852wd abstractC0852wd = ((C0963zd) view.getLayoutParams()).f5539a;
        if (abstractC0852wd != null) {
            abstractC0852wd.mo709l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f426g) {
            return;
        }
        m227t(false);
        this.f426g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m226s() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m226s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m228w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f436q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f435p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f435p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f435p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f435p;
                WeakHashMap weakHashMap = ja0.f2600a;
                AbstractC0151dh.m942b(drawable3, t90.m2367d(this));
                this.f435p.setVisible(getVisibility() == 0, false);
                this.f435p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ja0.f2600a;
            s90.m2319k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC0257gd.m1270b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f435p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f435p.setVisible(z, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m227t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0852wd abstractC0852wd = ((C0963zd) childAt.getLayoutParams()).f5539a;
            if (abstractC0852wd != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0852wd.mo696f(this, childAt, motionEventObtain);
                } else {
                    abstractC0852wd.mo705q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0963zd) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f429j = null;
        this.f426g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f435p;
    }

    /* JADX INFO: renamed from: w */
    public final void m228w() {
        WeakHashMap weakHashMap = ja0.f2600a;
        if (!s90.m2310b(this)) {
            y90.m2675u(this, null);
            return;
        }
        if (this.f437r == null) {
            this.f437r = new C0431l0(9, this);
        }
        y90.m2675u(this, this.f437r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0963zd ? new C0963zd((C0963zd) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0963zd((ViewGroup.MarginLayoutParams) layoutParams) : new C0963zd(layoutParams);
    }
}
