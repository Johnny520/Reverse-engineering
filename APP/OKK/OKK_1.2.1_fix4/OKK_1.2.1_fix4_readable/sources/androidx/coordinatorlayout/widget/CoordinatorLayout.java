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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p004C.C0061b;
import p004C.C0062c;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p006D.C0119p;
import p006D.C0122q0;
import p006D.InterfaceC0115n;
import p006D.InterfaceC0117o;
import p037U.C0375k;
import p043Y.C0463v;
import p063j.C0966k;
import p076q.AbstractC1054a;
import p078r.AbstractC1058a;
import p078r.AbstractC1064g;
import p078r.C1061d;
import p078r.C1063f;
import p078r.InterfaceC1059b;
import p078r.ViewGroupOnHierarchyChangeListenerC1060c;
import p078r.ViewTreeObserverOnPreDrawListenerC1062e;
import p082t.AbstractC1080a;
import p087w.AbstractC1112b;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0115n, InterfaceC0117o {

    /* JADX INFO: renamed from: t */
    public static final String f1273t;

    /* JADX INFO: renamed from: u */
    public static final Class[] f1274u;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f1275v;

    /* JADX INFO: renamed from: w */
    public static final C0375k f1276w;

    /* JADX INFO: renamed from: x */
    public static final C0062c f1277x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1278a;

    /* JADX INFO: renamed from: b */
    public final C0463v f1279b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1280c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f1281d;

    /* JADX INFO: renamed from: e */
    public final int[] f1282e;

    /* JADX INFO: renamed from: f */
    public final int[] f1283f;

    /* JADX INFO: renamed from: g */
    public boolean f1284g;

    /* JADX INFO: renamed from: h */
    public boolean f1285h;

    /* JADX INFO: renamed from: i */
    public final int[] f1286i;

    /* JADX INFO: renamed from: j */
    public View f1287j;

    /* JADX INFO: renamed from: k */
    public View f1288k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC1062e f1289l;

    /* JADX INFO: renamed from: m */
    public boolean f1290m;

    /* JADX INFO: renamed from: n */
    public C0122q0 f1291n;

    /* JADX INFO: renamed from: o */
    public boolean f1292o;

    /* JADX INFO: renamed from: p */
    public Drawable f1293p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f1294q;

    /* JADX INFO: renamed from: r */
    public C0095d f1295r;

    /* JADX INFO: renamed from: s */
    public final C0119p f1296s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1273t = r02 != null ? r02.getName() : null;
        f1276w = new C0375k(3);
        f1274u = new Class[]{Context.class, AttributeSet.class};
        f1275v = new ThreadLocal();
        f1277x = new C0062c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C1031R.attr.coordinatorLayoutStyle);
        this.f1278a = new ArrayList();
        this.f1279b = new C0463v(3);
        this.f1280c = new ArrayList();
        this.f1281d = new ArrayList();
        this.f1282e = new int[2];
        this.f1283f = new int[2];
        this.f1296s = new C0119p();
        int[] iArr = AbstractC1054a.f4061a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, C1031R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1286i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1286i[i2] = (int) (r2[i2] * f2);
            }
        }
        this.f1293p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m1178v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1060c(this));
        Field field = AbstractC0080Q.f219a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Rect m1163g() {
        Rect rect = (Rect) f1277x.mo198a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m1164l(int i2, Rect rect, Rect rect2, C1061d c1061d, int i3, int i4) {
        int i5 = c1061d.f4066c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = c1061d.f4067d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* JADX INFO: renamed from: m */
    public static C1061d m1165m(View view) {
        C1061d c1061d = (C1061d) view.getLayoutParams();
        if (!c1061d.f4065b) {
            InterfaceC1059b interfaceC1059b = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC1059b = (InterfaceC1059b) superclass.getAnnotation(InterfaceC1059b.class);
                if (interfaceC1059b != null) {
                    break;
                }
            }
            if (interfaceC1059b != null) {
                try {
                    AbstractC1058a abstractC1058a = (AbstractC1058a) interfaceC1059b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC1058a abstractC1058a2 = c1061d.f4064a;
                    if (abstractC1058a2 != abstractC1058a) {
                        if (abstractC1058a2 != null) {
                            abstractC1058a2.mo1844e();
                        }
                        c1061d.f4064a = abstractC1058a;
                        c1061d.f4065b = true;
                        if (abstractC1058a != null) {
                            abstractC1058a.mo1843c(c1061d);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC1059b.value().getClass();
                }
            }
            c1061d.f4065b = true;
        }
        return c1061d;
    }

    /* JADX INFO: renamed from: t */
    public static void m1166t(View view, int i2) {
        C1061d c1061d = (C1061d) view.getLayoutParams();
        int i3 = c1061d.f4072i;
        if (i3 != i2) {
            Field field = AbstractC0080Q.f219a;
            view.offsetLeftAndRight(i2 - i3);
            c1061d.f4072i = i2;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m1167u(View view, int i2) {
        C1061d c1061d = (C1061d) view.getLayoutParams();
        int i3 = c1061d.f4073j;
        if (i3 != i2) {
            Field field = AbstractC0080Q.f219a;
            view.offsetTopAndBottom(i2 - i3);
            c1061d.f4073j = i2;
        }
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: a */
    public final void mo421a(View view, View view2, int i2, int i3) {
        C0119p c0119p = this.f1296s;
        if (i3 == 1) {
            c0119p.f307b = i2;
        } else {
            c0119p.f306a = i2;
        }
        this.f1288k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C1061d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // p006D.InterfaceC0117o
    /* JADX INFO: renamed from: b */
    public final void mo426b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        AbstractC1058a abstractC1058a;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1061d c1061d = (C1061d) childAt.getLayoutParams();
                if (c1061d.m2535a(i6) && (abstractC1058a = c1061d.f4064a) != null) {
                    int[] iArr2 = this.f1282e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1058a.mo1819k(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            m1173o(1);
        }
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: c */
    public final void mo422c(View view, int i2, int i3, int i4, int i5, int i6) {
        mo426b(view, i2, i3, i4, i5, 0, this.f1283f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1061d) && super.checkLayoutParams(layoutParams);
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: d */
    public final void mo423d(View view, int i2) {
        C0119p c0119p = this.f1296s;
        if (i2 == 1) {
            c0119p.f307b = 0;
        } else {
            c0119p.f306a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C1061d c1061d = (C1061d) childAt.getLayoutParams();
            if (c1061d.m2535a(i2)) {
                AbstractC1058a abstractC1058a = c1061d.f4064a;
                if (abstractC1058a != null) {
                    abstractC1058a.mo1823p(childAt, view, i2);
                }
                if (i2 == 0) {
                    c1061d.f4077n = false;
                } else if (i2 == 1) {
                    c1061d.f4078o = false;
                }
                c1061d.getClass();
            }
        }
        this.f1288k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC1058a abstractC1058a = ((C1061d) view.getLayoutParams()).f4064a;
        if (abstractC1058a != null) {
            abstractC1058a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1293p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: e */
    public final void mo424e(View view, int i2, int i3, int[] iArr, int i4) {
        AbstractC1058a abstractC1058a;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1061d c1061d = (C1061d) childAt.getLayoutParams();
                if (c1061d.m2535a(i4) && (abstractC1058a = c1061d.f4064a) != null) {
                    int[] iArr2 = this.f1282e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1058a.mo1818j(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            m1173o(1);
        }
    }

    @Override // p006D.InterfaceC0115n
    /* JADX INFO: renamed from: f */
    public final boolean mo425f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1061d c1061d = (C1061d) childAt.getLayoutParams();
                AbstractC1058a abstractC1058a = c1061d.f4064a;
                if (abstractC1058a != null) {
                    boolean zMo1822o = abstractC1058a.mo1822o(childAt, i2, i3);
                    z2 |= zMo1822o;
                    if (i3 == 0) {
                        c1061d.f4077n = zMo1822o;
                    } else if (i3 == 1) {
                        c1061d.f4078o = zMo1822o;
                    }
                } else if (i3 == 0) {
                    c1061d.f4077n = false;
                } else if (i3 == 1) {
                    c1061d.f4078o = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1061d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1061d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m1176r();
        return Collections.unmodifiableList(this.f1278a);
    }

    public final C0122q0 getLastWindowInsets() {
        return this.f1291n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0119p c0119p = this.f1296s;
        return c0119p.f307b | c0119p.f306a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1293p;
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
    public final void m1168h(C1061d c1061d, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1061d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) c1061d).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1061d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) c1061d).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    /* JADX INFO: renamed from: i */
    public final void m1169i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            m1171k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m1170j(View view) {
        C0966k c0966k = (C0966k) this.f1279b.f1045b;
        int i2 = c0966k.f3432c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) c0966k.m2324j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0966k.m2322h(i3));
            }
        }
        ArrayList arrayList3 = this.f1281d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m1171k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC1064g.f4082a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1064g.f4082a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1064g.m2536a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1064g.f4083b;
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
    public final boolean m1172n(View view, int i2, int i3) {
        C0062c c0062c = f1277x;
        Rect rectM1163g = m1163g();
        m1171k(view, rectM1163g);
        try {
            return rectM1163g.contains(i2, i3);
        } finally {
            rectM1163g.setEmpty();
            c0062c.mo200c(rectM1163g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004b A[EDGE_INSN: B:134:0x004b->B:10:0x004b BREAK  A[LOOP:2: B:122:0x02db->B:127:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1173o(int i2) {
        int i3;
        Rect rect;
        int i4;
        Rect rect2;
        int i5;
        Rect rect3;
        int i6;
        int i7;
        ArrayList arrayList;
        boolean z2;
        int i8;
        int i9;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        C1061d c1061d;
        int i16;
        C0062c c0062c;
        int i17;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i18;
        AbstractC1058a abstractC1058a;
        int i19 = i2;
        Field field = AbstractC0080Q.f219a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f1278a;
        int size = arrayList3.size();
        Rect rectM1163g = m1163g();
        Rect rectM1163g2 = m1163g();
        Rect rectM1163g3 = m1163g();
        int i20 = 0;
        while (true) {
            C0062c c0062c2 = f1277x;
            if (i20 >= size) {
                Rect rect7 = rectM1163g3;
                Rect rect8 = rectM1163g2;
                Rect rect9 = rectM1163g;
                rect9.setEmpty();
                c0062c2.mo200c(rect9);
                rect8.setEmpty();
                c0062c2.mo200c(rect8);
                rect7.setEmpty();
                c0062c2.mo200c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i20);
            C1061d c1061d2 = (C1061d) view.getLayoutParams();
            if (i19 == 0 && view.getVisibility() == 8) {
                i5 = i19;
                i4 = layoutDirection;
                i3 = i20;
                rect3 = rectM1163g3;
                rect = rectM1163g2;
                rect2 = rectM1163g;
                arrayList = arrayList3;
                i7 = size;
            } else {
                int i21 = 0;
                while (i21 < i20) {
                    if (c1061d2.f4075l == ((View) arrayList3.get(i21))) {
                        C1061d c1061d3 = (C1061d) view.getLayoutParams();
                        if (c1061d3.f4074k != null) {
                            Rect rectM1163g4 = m1163g();
                            Rect rectM1163g5 = m1163g();
                            arrayList2 = arrayList3;
                            Rect rectM1163g6 = m1163g();
                            m1171k(c1061d3.f4074k, rectM1163g4);
                            m1169i(view, rectM1163g5, false);
                            i18 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c1061d = c1061d2;
                            c0062c = c0062c2;
                            i17 = i20;
                            i16 = layoutDirection;
                            rect4 = rectM1163g3;
                            rect5 = rectM1163g2;
                            rect6 = rectM1163g;
                            m1164l(layoutDirection, rectM1163g4, rectM1163g6, c1061d3, measuredWidth, measuredHeight);
                            boolean z3 = (rectM1163g6.left == rectM1163g5.left && rectM1163g6.top == rectM1163g5.top) ? false : true;
                            m1168h(c1061d3, rectM1163g6, measuredWidth, measuredHeight);
                            int i22 = rectM1163g6.left - rectM1163g5.left;
                            int i23 = rectM1163g6.top - rectM1163g5.top;
                            if (i22 != 0) {
                                Field field2 = AbstractC0080Q.f219a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                Field field3 = AbstractC0080Q.f219a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z3 && (abstractC1058a = c1061d3.f4064a) != null) {
                                abstractC1058a.mo1827d(this, view, c1061d3.f4074k);
                            }
                            rectM1163g4.setEmpty();
                            c0062c.mo200c(rectM1163g4);
                            rectM1163g5.setEmpty();
                            c0062c.mo200c(rectM1163g5);
                            rectM1163g6.setEmpty();
                            c0062c.mo200c(rectM1163g6);
                        } else {
                            c1061d = c1061d2;
                            i16 = layoutDirection;
                            c0062c = c0062c2;
                            i17 = i20;
                            rect4 = rectM1163g3;
                            rect5 = rectM1163g2;
                            rect6 = rectM1163g;
                            arrayList2 = arrayList3;
                            i18 = size;
                        }
                    }
                    i21++;
                    c0062c2 = c0062c;
                    size = i18;
                    arrayList3 = arrayList2;
                    layoutDirection = i16;
                    c1061d2 = c1061d;
                    i20 = i17;
                    rectM1163g3 = rect4;
                    rectM1163g2 = rect5;
                    rectM1163g = rect6;
                }
                C1061d c1061d4 = c1061d2;
                int i24 = layoutDirection;
                C0061b c0061b = c0062c2;
                i3 = i20;
                Rect rect10 = rectM1163g3;
                rect = rectM1163g2;
                Rect rect11 = rectM1163g;
                ArrayList arrayList4 = arrayList3;
                int i25 = size;
                m1169i(view, rect, true);
                if (c1061d4.f4070g == 0 || rect.isEmpty()) {
                    i4 = i24;
                    rect2 = rect11;
                } else {
                    i4 = i24;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c1061d4.f4070g, i4);
                    int i26 = absoluteGravity & 112;
                    if (i26 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i26 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i27 = absoluteGravity & 7;
                    if (i27 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i27 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c1061d4.f4071h == 0 || view.getVisibility() != 0) {
                    i5 = i2;
                    if (i5 != 2) {
                        rect3 = rect10;
                        rect3.set(((C1061d) view.getLayoutParams()).f4079p);
                        if (rect3.equals(rect)) {
                            i7 = i25;
                            arrayList = arrayList4;
                        } else {
                            ((C1061d) view.getLayoutParams()).f4079p.set(rect);
                        }
                    } else {
                        rect3 = rect10;
                    }
                    i6 = i3 + 1;
                    i7 = i25;
                    while (true) {
                        arrayList = arrayList4;
                        if (i6 >= i7) {
                            break;
                        }
                        View view2 = (View) arrayList.get(i6);
                        AbstractC1058a abstractC1058a2 = ((C1061d) view2.getLayoutParams()).f4064a;
                        if (abstractC1058a2 != null) {
                            abstractC1058a2.mo1826b(view2);
                        }
                        i6++;
                        arrayList4 = arrayList;
                    }
                } else {
                    Field field4 = AbstractC0080Q.f219a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C1061d c1061d5 = (C1061d) view.getLayoutParams();
                        AbstractC1058a abstractC1058a3 = c1061d5.f4064a;
                        Rect rectM1163g7 = m1163g();
                        Rect rectM1163g8 = m1163g();
                        rectM1163g8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC1058a3 == null || !abstractC1058a3.mo1881a(view)) {
                            rectM1163g7.set(rectM1163g8);
                        } else if (!rectM1163g8.contains(rectM1163g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1163g7.toShortString() + " | Bounds:" + rectM1163g8.toShortString());
                        }
                        rectM1163g8.setEmpty();
                        c0061b.mo200c(rectM1163g8);
                        if (rectM1163g7.isEmpty()) {
                            rectM1163g7.setEmpty();
                            c0061b.mo200c(rectM1163g7);
                            i5 = i2;
                            if (i5 != 2) {
                            }
                            i6 = i3 + 1;
                            i7 = i25;
                            while (true) {
                                arrayList = arrayList4;
                                if (i6 >= i7) {
                                }
                                i6++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c1061d5.f4071h, i4);
                            if ((absoluteGravity2 & 48) != 48 || (i14 = (rectM1163g7.top - ((ViewGroup.MarginLayoutParams) c1061d5).topMargin) - c1061d5.f4073j) >= (i15 = rect2.top)) {
                                z2 = false;
                            } else {
                                m1167u(view, i15 - i14);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM1163g7.bottom) - ((ViewGroup.MarginLayoutParams) c1061d5).bottomMargin) + c1061d5.f4073j) < (i13 = rect2.bottom)) {
                                m1167u(view, height - i13);
                                z2 = true;
                            }
                            if (z2) {
                                i8 = 0;
                            } else {
                                i8 = 0;
                                m1167u(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i11 = (rectM1163g7.left - ((ViewGroup.MarginLayoutParams) c1061d5).leftMargin) - c1061d5.f4072i) >= (i12 = rect2.left)) {
                                i9 = i8;
                            } else {
                                m1166t(view, i12 - i11);
                                i9 = 1;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM1163g7.right) - ((ViewGroup.MarginLayoutParams) c1061d5).rightMargin) + c1061d5.f4072i) < (i10 = rect2.right)) {
                                m1166t(view, width - i10);
                                i9 = 1;
                            }
                            if (i9 == 0) {
                                m1166t(view, i8);
                            }
                            rectM1163g7.setEmpty();
                            c0061b.mo200c(rectM1163g7);
                            i5 = i2;
                            if (i5 != 2) {
                            }
                            i6 = i3 + 1;
                            i7 = i25;
                            while (true) {
                                arrayList = arrayList4;
                                if (i6 >= i7) {
                                }
                                i6++;
                                arrayList4 = arrayList;
                            }
                        }
                    }
                }
            }
            size = i7;
            i20 = i3 + 1;
            rectM1163g2 = rect;
            i19 = i5;
            rectM1163g3 = rect3;
            arrayList3 = arrayList;
            rectM1163g = rect2;
            layoutDirection = i4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1177s(false);
        if (this.f1290m) {
            if (this.f1289l == null) {
                this.f1289l = new ViewTreeObserverOnPreDrawListenerC1062e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1289l);
        }
        if (this.f1291n == null) {
            Field field = AbstractC0080Q.f219a;
            if (getFitsSystemWindows()) {
                AbstractC0068E.m210c(this);
            }
        }
        this.f1285h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1177s(false);
        if (this.f1290m && this.f1289l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1289l);
        }
        View view = this.f1288k;
        if (view != null) {
            mo423d(view, 0);
        }
        this.f1285h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1292o || this.f1293p == null) {
            return;
        }
        C0122q0 c0122q0 = this.f1291n;
        int iM430a = c0122q0 != null ? c0122q0.m430a() : 0;
        if (iM430a > 0) {
            this.f1293p.setBounds(0, 0, getWidth(), iM430a);
            this.f1293p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1177s(true);
        }
        boolean zM1175q = m1175q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1177s(true);
        }
        return zM1175q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        AbstractC1058a abstractC1058a;
        Field field = AbstractC0080Q.f219a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1278a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((abstractC1058a = ((C1061d) view.getLayoutParams()).f4064a) == null || !abstractC1058a.mo1816g(this, view, layoutDirection))) {
                m1174p(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        AbstractC1058a abstractC1058a;
        int i8;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int absoluteGravity;
        m1176r();
        int childCount = getChildCount();
        int i18 = 0;
        loop0: while (true) {
            if (i18 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = getChildAt(i18);
            C0966k c0966k = (C0966k) this.f1279b.f1045b;
            int i19 = c0966k.f3432c;
            for (int i20 = 0; i20 < i19; i20++) {
                ArrayList arrayList2 = (ArrayList) c0966k.m2324j(i20);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i18++;
        }
        if (z2 != this.f1290m) {
            if (z2) {
                if (this.f1285h) {
                    if (this.f1289l == null) {
                        this.f1289l = new ViewTreeObserverOnPreDrawListenerC1062e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1289l);
                }
                this.f1290m = true;
            } else {
                if (this.f1285h && this.f1289l != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1289l);
                }
                this.f1290m = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Field field = AbstractC0080Q.f219a;
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.f1291n != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f1278a;
        int size3 = arrayList3.size();
        int i23 = suggestedMinimumWidth;
        int i24 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i25 = 0;
        while (i25 < size3) {
            View view = (View) arrayList3.get(i25);
            if (view.getVisibility() == 8) {
                i15 = i25;
                i8 = size3;
                arrayList = arrayList3;
                i13 = paddingLeft;
                i9 = paddingRight;
                i10 = layoutDirection;
            } else {
                C1061d c1061d = (C1061d) view.getLayoutParams();
                int i26 = c1061d.f4068e;
                if (i26 < 0 || mode == 0) {
                    i4 = iCombineMeasuredStates;
                    i5 = i25;
                } else {
                    i4 = iCombineMeasuredStates;
                    int[] iArr = this.f1286i;
                    if (iArr == null) {
                        toString();
                        i5 = i25;
                    } else {
                        i5 = i25;
                        if (i26 < 0 || i26 >= iArr.length) {
                            toString();
                        } else {
                            i16 = iArr[i26];
                            i17 = c1061d.f4066c;
                            if (i17 == 0) {
                                i17 = 8388661;
                            }
                            absoluteGravity = Gravity.getAbsoluteGravity(i17, layoutDirection) & 7;
                            if (!(absoluteGravity == 3 || z3) || (absoluteGravity == 5 && z3)) {
                                iMax = Math.max(0, (size - paddingRight) - i16);
                            } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                                iMax = Math.max(0, i16 - paddingLeft);
                            }
                            if (z4 || view.getFitsSystemWindows()) {
                                i6 = i2;
                                i7 = i3;
                            } else {
                                int i27 = this.f1291n.f309a.mo382j().f4251c + this.f1291n.f309a.mo382j().f4249a;
                                int iM430a = this.f1291n.f309a.mo382j().f4252d + this.f1291n.m430a();
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i27, mode);
                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM430a, mode2);
                                i6 = iMakeMeasureSpec;
                                i7 = iMakeMeasureSpec2;
                            }
                            abstractC1058a = c1061d.f4064a;
                            if (abstractC1058a == null) {
                                int i28 = i4;
                                i15 = i5;
                                i13 = paddingLeft;
                                i14 = i28;
                                i9 = paddingRight;
                                i11 = i24;
                                i10 = layoutDirection;
                                i12 = i23;
                                i8 = size3;
                                arrayList = arrayList3;
                                if (!abstractC1058a.mo1817h(this, view, i6, iMax, i7)) {
                                }
                                int iMax2 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) c1061d).leftMargin + ((ViewGroup.MarginLayoutParams) c1061d).rightMargin);
                                int iMax3 = Math.max(i11, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) c1061d).topMargin + ((ViewGroup.MarginLayoutParams) c1061d).bottomMargin);
                                i23 = iMax2;
                                iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                                i24 = iMax3;
                            } else {
                                i8 = size3;
                                arrayList = arrayList3;
                                i9 = paddingRight;
                                i10 = layoutDirection;
                                i11 = i24;
                                i12 = i23;
                                int i29 = i5;
                                i13 = paddingLeft;
                                i14 = i4;
                                i15 = i29;
                            }
                            measureChildWithMargins(view, i6, iMax, i7, 0);
                            int iMax22 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) c1061d).leftMargin + ((ViewGroup.MarginLayoutParams) c1061d).rightMargin);
                            int iMax32 = Math.max(i11, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) c1061d).topMargin + ((ViewGroup.MarginLayoutParams) c1061d).bottomMargin);
                            i23 = iMax22;
                            iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                            i24 = iMax32;
                        }
                    }
                    i16 = 0;
                    i17 = c1061d.f4066c;
                    if (i17 == 0) {
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i17, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                        if (absoluteGravity == 5) {
                        }
                    } else if (absoluteGravity == 5) {
                    }
                }
                iMax = 0;
                if (z4) {
                    i6 = i2;
                    i7 = i3;
                    abstractC1058a = c1061d.f4064a;
                    if (abstractC1058a == null) {
                    }
                    measureChildWithMargins(view, i6, iMax, i7, 0);
                    int iMax222 = Math.max(i12, view.getMeasuredWidth() + i21 + ((ViewGroup.MarginLayoutParams) c1061d).leftMargin + ((ViewGroup.MarginLayoutParams) c1061d).rightMargin);
                    int iMax322 = Math.max(i11, view.getMeasuredHeight() + i22 + ((ViewGroup.MarginLayoutParams) c1061d).topMargin + ((ViewGroup.MarginLayoutParams) c1061d).bottomMargin);
                    i23 = iMax222;
                    iCombineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    i24 = iMax322;
                }
            }
            i25 = i15 + 1;
            paddingLeft = i13;
            paddingRight = i9;
            layoutDirection = i10;
            size3 = i8;
            arrayList3 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i23, i2, (-16777216) & i30), View.resolveSizeAndState(i24, i3, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1061d c1061d = (C1061d) childAt.getLayoutParams();
                if (c1061d.m2535a(0)) {
                    AbstractC1058a abstractC1058a = c1061d.f4064a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC1058a abstractC1058a;
        int childCount = getChildCount();
        boolean zMo1845i = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C1061d c1061d = (C1061d) childAt.getLayoutParams();
                if (c1061d.m2535a(0) && (abstractC1058a = c1061d.f4064a) != null) {
                    zMo1845i |= abstractC1058a.mo1845i(view);
                }
            }
        }
        return zMo1845i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        mo424e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        mo422c(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        mo421a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1063f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1063f c1063f = (C1063f) parcelable;
        super.onRestoreInstanceState(c1063f.f481a);
        SparseArray sparseArray = c1063f.f4081c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC1058a abstractC1058a = m1165m(childAt).f4064a;
            if (id != -1 && abstractC1058a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1058a.mo1820m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1821n;
        C1063f c1063f = new C1063f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC1058a abstractC1058a = ((C1061d) childAt.getLayoutParams()).f4064a;
            if (id != -1 && abstractC1058a != null && (parcelableMo1821n = abstractC1058a.mo1821n(childAt)) != null) {
                sparseArray.append(id, parcelableMo1821n);
            }
        }
        c1063f.f4081c = sparseArray;
        return c1063f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return mo425f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo423d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1175q;
        boolean zMo1824q;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1287j == null) {
            zM1175q = m1175q(motionEvent, 1);
            if (!zM1175q) {
                zMo1824q = false;
            }
            motionEventObtain = null;
            if (this.f1287j != null) {
                zMo1824q |= super.onTouchEvent(motionEvent);
            } else if (zM1175q) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m1177s(false);
            }
            return zMo1824q;
        }
        zM1175q = false;
        AbstractC1058a abstractC1058a = ((C1061d) this.f1287j.getLayoutParams()).f4064a;
        if (abstractC1058a != null) {
            zMo1824q = abstractC1058a.mo1824q(this.f1287j, motionEvent);
        }
        motionEventObtain = null;
        if (this.f1287j != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked != 1) {
            m1177s(false);
        }
        return zMo1824q;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1174p(View view, int i2) {
        Rect rectM1163g;
        Rect rectM1163g2;
        int i3;
        C1061d c1061d = (C1061d) view.getLayoutParams();
        View view2 = c1061d.f4074k;
        if (view2 == null && c1061d.f4069f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0062c c0062c = f1277x;
        if (view2 != null) {
            rectM1163g = m1163g();
            rectM1163g2 = m1163g();
            try {
                m1171k(view2, rectM1163g);
                C1061d c1061d2 = (C1061d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1164l(i2, rectM1163g, rectM1163g2, c1061d2, measuredWidth, measuredHeight);
                m1168h(c1061d2, rectM1163g2, measuredWidth, measuredHeight);
                view.layout(rectM1163g2.left, rectM1163g2.top, rectM1163g2.right, rectM1163g2.bottom);
                return;
            } finally {
                rectM1163g.setEmpty();
                c0062c.mo200c(rectM1163g);
                rectM1163g2.setEmpty();
                c0062c.mo200c(rectM1163g2);
            }
        }
        int i4 = c1061d.f4068e;
        if (i4 < 0) {
            C1061d c1061d3 = (C1061d) view.getLayoutParams();
            rectM1163g = m1163g();
            rectM1163g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1061d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1061d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1061d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1061d3).bottomMargin);
            if (this.f1291n != null) {
                Field field = AbstractC0080Q.f219a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM1163g.left = this.f1291n.f309a.mo382j().f4249a + rectM1163g.left;
                    rectM1163g.top = this.f1291n.m430a() + rectM1163g.top;
                    rectM1163g.right -= this.f1291n.f309a.mo382j().f4251c;
                    rectM1163g.bottom -= this.f1291n.f309a.mo382j().f4252d;
                }
            }
            rectM1163g2 = m1163g();
            int i5 = c1061d3.f4066c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1163g, rectM1163g2, i2);
            view.layout(rectM1163g2.left, rectM1163g2.top, rectM1163g2.right, rectM1163g2.bottom);
            return;
        }
        C1061d c1061d4 = (C1061d) view.getLayoutParams();
        int i6 = c1061d4.f4066c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int[] iArr = this.f1286i;
        int i9 = 0;
        if (iArr == null || i4 < 0 || i4 >= iArr.length) {
            toString();
            i3 = 0;
            int i10 = i3 - measuredWidth2;
            if (i7 != 1) {
            }
            if (i8 != 16) {
            }
            int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1061d4).leftMargin, Math.min(i10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1061d4).rightMargin));
            int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1061d4).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1061d4).bottomMargin));
            view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
        }
        i3 = iArr[i4];
        int i102 = i3 - measuredWidth2;
        if (i7 != 1) {
            i102 += measuredWidth2 / 2;
        } else if (i7 == 5) {
            i102 += measuredWidth2;
        }
        if (i8 != 16) {
            i9 = measuredHeight2 / 2;
        } else if (i8 == 80) {
            i9 = measuredHeight2;
        }
        int iMax3 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1061d4).leftMargin, Math.min(i102, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1061d4).rightMargin));
        int iMax22 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1061d4).topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1061d4).bottomMargin));
        view.layout(iMax3, iMax22, measuredWidth2 + iMax3, measuredHeight2 + iMax22);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1175q(MotionEvent motionEvent, int i2) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1280c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        C0375k c0375k = f1276w;
        if (c0375k != null) {
            Collections.sort(arrayList, c0375k);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1815f = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            C1061d c1061d = (C1061d) view.getLayoutParams();
            AbstractC1058a abstractC1058a = c1061d.f4064a;
            if (!(zMo1815f || z3) || actionMasked == 0) {
                if (!zMo1815f && abstractC1058a != null) {
                    if (i2 == 0) {
                        zMo1815f = abstractC1058a.mo1815f(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zMo1815f = abstractC1058a.mo1824q(view, motionEvent);
                    }
                    if (zMo1815f) {
                        this.f1287j = view;
                    }
                }
                if (c1061d.f4064a == null) {
                    c1061d.f4076m = false;
                }
                boolean z4 = c1061d.f4076m;
                if (z4) {
                    z2 = true;
                } else {
                    c1061d.f4076m = z4;
                    z2 = z4;
                }
                z3 = z2 && !z4;
                if (z2 && !z3) {
                    break;
                }
            } else if (abstractC1058a != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    abstractC1058a.mo1815f(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    abstractC1058a.mo1824q(view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zMo1815f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1176r() {
        C0061b c0061b;
        View viewFindViewById;
        ArrayList arrayList = this.f1278a;
        arrayList.clear();
        C0463v c0463v = this.f1279b;
        C0966k c0966k = (C0966k) c0463v.f1045b;
        int i2 = c0966k.f3432c;
        int i3 = 0;
        while (true) {
            c0061b = (C0061b) c0463v.f1044a;
            if (i3 >= i2) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c0966k.m2324j(i3);
            if (arrayList2 != null) {
                arrayList2.clear();
                c0061b.mo200c(arrayList2);
            }
            i3++;
        }
        c0966k.clear();
        int childCount = getChildCount();
        int i4 = 0;
        loop1: while (true) {
            C0966k c0966k2 = (C0966k) c0463v.f1045b;
            if (i4 >= childCount) {
                ArrayList arrayList3 = (ArrayList) c0463v.f1046c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) c0463v.f1047d;
                hashSet.clear();
                int i5 = c0966k2.f3432c;
                for (int i6 = 0; i6 < i5; i6++) {
                    c0463v.m1092a(c0966k2.m2322h(i6), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i4);
            C1061d c1061dM1165m = m1165m(childAt);
            int i7 = c1061dM1165m.f4069f;
            if (i7 == -1) {
                c1061dM1165m.f4075l = null;
                c1061dM1165m.f4074k = null;
            } else {
                View view = c1061dM1165m.f4074k;
                if (view == null || view.getId() != i7) {
                    viewFindViewById = findViewById(i7);
                    c1061dM1165m.f4074k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i7) + " to anchor view " + childAt);
                        }
                        c1061dM1165m.f4075l = null;
                        c1061dM1165m.f4074k = null;
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
                                c1061dM1165m.f4075l = null;
                                c1061dM1165m.f4074k = null;
                            }
                        }
                        c1061dM1165m.f4075l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        c1061dM1165m.f4075l = null;
                        c1061dM1165m.f4074k = null;
                    }
                } else {
                    View view2 = c1061dM1165m.f4074k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c1061dM1165m.f4075l = null;
                            c1061dM1165m.f4074k = null;
                            viewFindViewById = findViewById(i7);
                            c1061dM1165m.f4074k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c1061dM1165m.f4075l = view2;
                }
            }
            if (!c0966k2.containsKey(childAt)) {
                c0966k2.put(childAt, null);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i4) {
                    View childAt2 = getChildAt(i8);
                    if (childAt2 != c1061dM1165m.f4075l) {
                        Field field = AbstractC0080Q.f219a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C1061d) childAt2.getLayoutParams()).f4070g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(c1061dM1165m.f4071h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC1058a abstractC1058a = c1061dM1165m.f4064a;
                            if (abstractC1058a != null) {
                                abstractC1058a.mo1826b(childAt);
                            }
                        } else {
                            if (!c0966k2.containsKey(childAt2) && !c0966k2.containsKey(childAt2)) {
                                c0966k2.put(childAt2, null);
                            }
                            if (!c0966k2.containsKey(childAt2) || !c0966k2.containsKey(childAt)) {
                                break loop1;
                            }
                            ArrayList arrayList4 = (ArrayList) c0966k2.getOrDefault(childAt2, null);
                            if (arrayList4 == null) {
                                arrayList4 = (ArrayList) c0061b.mo198a();
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                c0966k2.put(childAt2, arrayList4);
                            }
                            arrayList4.add(childAt);
                        }
                    }
                }
            }
            i4++;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC1058a abstractC1058a = ((C1061d) view.getLayoutParams()).f4064a;
        if (abstractC1058a != null) {
            abstractC1058a.mo1828l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1284g) {
            return;
        }
        m1177s(false);
        this.f1284g = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m1177s(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC1058a abstractC1058a = ((C1061d) childAt.getLayoutParams()).f4064a;
            if (abstractC1058a != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC1058a.mo1815f(this, childAt, motionEventObtain);
                } else {
                    abstractC1058a.mo1824q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1061d) getChildAt(i3).getLayoutParams()).f4076m = false;
        }
        this.f1287j = null;
        this.f1284g = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m1178v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1294q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1293p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1293p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1293p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1293p;
                Field field = AbstractC0080Q.f219a;
                AbstractC1112b.m2629b(drawable3, getLayoutDirection());
                this.f1293p.setVisible(getVisibility() == 0, false);
                this.f1293p.setCallback(this);
            }
            Field field2 = AbstractC0080Q.f219a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? AbstractC1080a.m2560b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1293p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1293p.setVisible(z2, false);
    }

    /* JADX INFO: renamed from: v */
    public final void m1178v() {
        Field field = AbstractC0080Q.f219a;
        if (!getFitsSystemWindows()) {
            AbstractC0070G.m231u(this, null);
            return;
        }
        if (this.f1295r == null) {
            this.f1295r = new C0095d(22, this);
        }
        AbstractC0070G.m231u(this, this.f1295r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1293p;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1061d ? new C1061d((C1061d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1061d((ViewGroup.MarginLayoutParams) layoutParams) : new C1061d(layoutParams);
    }
}
