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
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.C1056R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.AbstractC0792r;
import p000a.C0003A2;
import p000a.C0036Bg;
import p000a.C0051Cc;
import p000a.C0069Dc;
import p000a.C0181Jg;
import p000a.C0230Mb;
import p000a.C0437Y3;
import p000a.C0598ge;
import p000a.C0734nh;
import p000a.C0866ug;
import p000a.C0893w5;
import p000a.C0944z;
import p000a.InterfaceC0194Kb;
import p000a.InterfaceC0212Lb;
import p000a.InterfaceC0355Tb;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0194Kb, InterfaceC0212Lb {

    /* JADX INFO: renamed from: t */
    public static final String f4378t;

    /* JADX INFO: renamed from: u */
    public static final Class<?>[] f4379u;

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal<Map<String, Constructor<AbstractC1059c>>> f4380v;

    /* JADX INFO: renamed from: w */
    public static final C1065i f4381w;

    /* JADX INFO: renamed from: x */
    public static final C0069Dc f4382x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f4383a;

    /* JADX INFO: renamed from: b */
    public final C0003A2 f4384b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4385c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f4386d;

    /* JADX INFO: renamed from: e */
    public final int[] f4387e;

    /* JADX INFO: renamed from: f */
    public final int[] f4388f;

    /* JADX INFO: renamed from: g */
    public boolean f4389g;

    /* JADX INFO: renamed from: h */
    public boolean f4390h;

    /* JADX INFO: renamed from: i */
    public final int[] f4391i;

    /* JADX INFO: renamed from: j */
    public View f4392j;

    /* JADX INFO: renamed from: k */
    public View f4393k;

    /* JADX INFO: renamed from: l */
    public ViewTreeObserverOnPreDrawListenerC1063g f4394l;

    /* JADX INFO: renamed from: m */
    public boolean f4395m;

    /* JADX INFO: renamed from: n */
    public C0734nh f4396n;

    /* JADX INFO: renamed from: o */
    public boolean f4397o;

    /* JADX INFO: renamed from: p */
    public Drawable f4398p;

    /* JADX INFO: renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f4399q;

    /* JADX INFO: renamed from: r */
    public C1057a f4400r;

    /* JADX INFO: renamed from: s */
    public final C0230Mb f4401s;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C1057a implements InterfaceC0355Tb {
        public C1057a() {
        }

        @Override // p000a.InterfaceC0355Tb
        /* JADX INFO: renamed from: a */
        public final C0734nh mo691a(View view, C0734nh c0734nh) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f4396n, c0734nh)) {
                coordinatorLayout.f4396n = c0734nh;
                boolean z = c0734nh.m1694d() > 0;
                coordinatorLayout.f4397o = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                C0734nh.k kVar = c0734nh.f2857a;
                if (!kVar.mo1721m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        if (childAt.getFitsSystemWindows() && ((C1062f) childAt.getLayoutParams()).f4404a != null && kVar.mo1721m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c0734nh;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC1058b {
        AbstractC1059c getBehavior();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC1059c<V extends View> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC1059c() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo2454a(View view) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo2455b(View view, View view2) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void mo2456c(C1062f c1062f) {
        }

        /* JADX INFO: renamed from: d */
        public boolean mo2457d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public void mo2458e(CoordinatorLayout coordinatorLayout, View view) {
        }

        /* JADX INFO: renamed from: f */
        public void mo2459f() {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo1271g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public boolean mo371h(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* JADX INFO: renamed from: i */
        public boolean mo1305i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        /* JADX INFO: renamed from: j */
        public boolean mo2460j(View view) {
            return false;
        }

        /* JADX INFO: renamed from: k */
        public void mo2461k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        /* JADX INFO: renamed from: l */
        public void mo2462l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        /* JADX INFO: renamed from: m */
        public boolean mo2463m(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public void mo2464n(View view, Parcelable parcelable) {
        }

        /* JADX INFO: renamed from: o */
        public Parcelable mo2465o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX INFO: renamed from: p */
        public boolean mo2466p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        /* JADX INFO: renamed from: q */
        public void mo2467q(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        /* JADX INFO: renamed from: r */
        public boolean mo1272r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC1059c(Context context, AttributeSet attributeSet) {
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface InterfaceC1060d {
        Class<? extends AbstractC1059c> value();
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC1061e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC1061e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4399q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.m2447p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f4399q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC1063g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC1063g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.m2447p(0);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C1064h extends AbstractC0792r {
        public static final Parcelable.Creator<C1064h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public SparseArray<Parcelable> f4421c;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C1064h> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1064h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1064h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1064h[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1064h(parcel, null);
            }
        }

        public C1064h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f4421c = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f4421c.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f4421c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f4421c.keyAt(i2);
                parcelableArr[i2] = this.f4421c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C1065i implements Comparator<View> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            float fM2021m = C0866ug.d.m2021m(view);
            float fM2021m2 = C0866ug.d.m2021m(view2);
            if (fM2021m > fM2021m2) {
                return -1;
            }
            return fM2021m < fM2021m2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f4378t = r0 != null ? r0.getName() : null;
        f4381w = new C1065i();
        f4379u = new Class[]{Context.class, AttributeSet.class};
        f4380v = new ThreadLocal<>();
        f4382x = new C0069Dc();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        int i = C1056R.attr.coordinatorLayoutStyle;
        super(context, attributeSet, i);
        this.f4383a = new ArrayList();
        this.f4384b = new C0003A2(1);
        this.f4385c = new ArrayList();
        this.f4386d = new ArrayList();
        this.f4387e = new int[2];
        this.f4388f = new int[2];
        this.f4401s = new C0230Mb();
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, C1056R.styleable.CoordinatorLayout, 0, C1056R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, C1056R.styleable.CoordinatorLayout, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C1056R.styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, 0, C1056R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C1056R.styleable.CoordinatorLayout, attributeSet, typedArrayObtainStyledAttributes, i, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1056R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4391i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f4391i[i2] = (int) (r3[i2] * f);
            }
        }
        this.f4398p = typedArrayObtainStyledAttributes.getDrawable(C1056R.styleable.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        m2453x();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1061e());
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m2436a() {
        Rect rect = (Rect) f4382x.mo128a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: g */
    public static void m2437g(int i, Rect rect, Rect rect2, C1062f c1062f, int i2, int i3) {
        int i4 = c1062f.f4406c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c1062f.f4407d;
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

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static C1062f m2438k(View view) {
        C1062f c1062f = (C1062f) view.getLayoutParams();
        if (!c1062f.f4405b) {
            if (view instanceof InterfaceC1058b) {
                AbstractC1059c behavior = ((InterfaceC1058b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                AbstractC1059c abstractC1059c = c1062f.f4404a;
                if (abstractC1059c != behavior) {
                    if (abstractC1059c != null) {
                        abstractC1059c.mo2459f();
                    }
                    c1062f.f4404a = behavior;
                    c1062f.f4405b = true;
                    if (behavior != null) {
                        behavior.mo2456c(c1062f);
                    }
                }
                c1062f.f4405b = true;
                return c1062f;
            }
            InterfaceC1060d interfaceC1060d = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC1060d = (InterfaceC1060d) superclass.getAnnotation(InterfaceC1060d.class);
                if (interfaceC1060d != null) {
                    break;
                }
            }
            if (interfaceC1060d != null) {
                try {
                    AbstractC1059c abstractC1059cNewInstance = interfaceC1060d.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC1059c abstractC1059c2 = c1062f.f4404a;
                    if (abstractC1059c2 != abstractC1059cNewInstance) {
                        if (abstractC1059c2 != null) {
                            abstractC1059c2.mo2459f();
                        }
                        c1062f.f4404a = abstractC1059cNewInstance;
                        c1062f.f4405b = true;
                        if (abstractC1059cNewInstance != null) {
                            abstractC1059cNewInstance.mo2456c(c1062f);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC1060d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c1062f.f4405b = true;
        }
        return c1062f;
    }

    /* JADX INFO: renamed from: v */
    public static void m2439v(View view, int i) {
        C1062f c1062f = (C1062f) view.getLayoutParams();
        int i2 = c1062f.f4412i;
        if (i2 != i) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            view.offsetLeftAndRight(i - i2);
            c1062f.f4412i = i;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m2440w(View view, int i) {
        C1062f c1062f = (C1062f) view.getLayoutParams();
        int i2 = c1062f.f4413j;
        if (i2 != i) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            view.offsetTopAndBottom(i - i2);
            c1062f.f4413j = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2441b(C1062f c1062f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1062f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1062f).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1062f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c1062f).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: c */
    public final void mo528c(View view, View view2, int i, int i2) {
        C0230Mb c0230Mb = this.f4401s;
        if (i2 == 1) {
            c0230Mb.f768b = i;
        } else {
            c0230Mb.f767a = i;
        }
        this.f4393k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1062f) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1062f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m2442d(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m2444f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC1059c abstractC1059c = ((C1062f) view.getLayoutParams()).f4404a;
        if (abstractC1059c != null) {
            abstractC1059c.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4398p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m2443e(View view) {
        C0598ge c0598ge = (C0598ge) this.f4384b.f24b;
        int i = c0598ge.f2221c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c0598ge.m1438j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0598ge.m1436h(i2));
            }
        }
        ArrayList arrayList3 = this.f4386d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: f */
    public final void m2444f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C0036Bg.f132a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C0036Bg.f132a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C0036Bg.m108a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C0036Bg.f133b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1062f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1062f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m2451t();
        return Collections.unmodifiableList(this.f4383a);
    }

    public final C0734nh getLastWindowInsets() {
        return this.f4396n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0230Mb c0230Mb = this.f4401s;
        return c0230Mb.f768b | c0230Mb.f767a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4398p;
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
    public final int m2445h(int i) {
        int[] iArr = this.f4391i;
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

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: i */
    public final void mo529i(View view, int i) {
        C0230Mb c0230Mb = this.f4401s;
        if (i == 1) {
            c0230Mb.f768b = 0;
        } else {
            c0230Mb.f767a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1062f c1062f = (C1062f) childAt.getLayoutParams();
            if (c1062f.m2468a(i)) {
                AbstractC1059c abstractC1059c = c1062f.f4404a;
                if (abstractC1059c != null) {
                    abstractC1059c.mo2467q(this, childAt, view, i);
                }
                if (i == 0) {
                    c1062f.f4416m = false;
                } else if (i == 1) {
                    c1062f.f4417n = false;
                }
                c1062f.f4418o = false;
            }
        }
        this.f4393k = null;
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: j */
    public final void mo530j(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC1059c abstractC1059c;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1062f c1062f = (C1062f) childAt.getLayoutParams();
                if (c1062f.m2468a(i3) && (abstractC1059c = c1062f.f4404a) != null) {
                    int[] iArr2 = this.f4387e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1059c.mo2461k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m2447p(1);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2446l(View view, int i, int i2) {
        C0069Dc c0069Dc = f4382x;
        Rect rectM2436a = m2436a();
        m2444f(view, rectM2436a);
        try {
            return rectM2436a.contains(i, i2);
        } finally {
            rectM2436a.setEmpty();
            c0069Dc.mo130c(rectM2436a);
        }
    }

    @Override // p000a.InterfaceC0212Lb
    /* JADX INFO: renamed from: m */
    public final void mo591m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC1059c abstractC1059c;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1062f c1062f = (C1062f) childAt.getLayoutParams();
                if (c1062f.m2468a(i5) && (abstractC1059c = c1062f.f4404a) != null) {
                    int[] iArr2 = this.f4387e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1059c.mo2462l(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m2447p(1);
        }
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: n */
    public final void mo531n(View view, int i, int i2, int i3, int i4, int i5) {
        mo591m(view, i, i2, i3, i4, 0, this.f4388f);
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: o */
    public final boolean mo532o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1062f c1062f = (C1062f) childAt.getLayoutParams();
                AbstractC1059c abstractC1059c = c1062f.f4404a;
                if (abstractC1059c != null) {
                    boolean zMo2466p = abstractC1059c.mo2466p(this, childAt, view, view2, i, i2);
                    z |= zMo2466p;
                    if (i2 == 0) {
                        c1062f.f4416m = zMo2466p;
                    } else if (i2 == 1) {
                        c1062f.f4417n = zMo2466p;
                    }
                } else if (i2 == 0) {
                    c1062f.f4416m = false;
                } else if (i2 == 1) {
                    c1062f.f4417n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2452u(false);
        if (this.f4395m) {
            if (this.f4394l == null) {
                this.f4394l = new ViewTreeObserverOnPreDrawListenerC1063g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4394l);
        }
        if (this.f4396n == null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            if (getFitsSystemWindows()) {
                C0866ug.c.m2008c(this);
            }
        }
        this.f4390h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2452u(false);
        if (this.f4395m && this.f4394l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4394l);
        }
        View view = this.f4393k;
        if (view != null) {
            mo529i(view, 0);
        }
        this.f4390h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4397o || this.f4398p == null) {
            return;
        }
        C0734nh c0734nh = this.f4396n;
        int iM1694d = c0734nh != null ? c0734nh.m1694d() : 0;
        if (iM1694d > 0) {
            this.f4398p.setBounds(0, 0, getWidth(), iM1694d);
            this.f4398p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2452u(true);
        }
        boolean zM2450s = m2450s(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM2450s;
        }
        m2452u(true);
        return zM2450s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC1059c abstractC1059c;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f4383a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC1059c = ((C1062f) view.getLayoutParams()).f4404a) == null || !abstractC1059c.mo371h(this, view, layoutDirection))) {
                m2448q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC1059c abstractC1059c;
        int i7;
        View view;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m2451t();
        int childCount = coordinatorLayout.getChildCount();
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i14);
            C0598ge c0598ge = (C0598ge) coordinatorLayout.f4384b.f24b;
            int i15 = c0598ge.f2221c;
            for (int i16 = 0; i16 < i15; i16++) {
                ArrayList arrayList2 = (ArrayList) c0598ge.m1438j(i16);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i14++;
        }
        if (z != coordinatorLayout.f4395m) {
            if (z) {
                if (coordinatorLayout.f4390h) {
                    if (coordinatorLayout.f4394l == null) {
                        coordinatorLayout.f4394l = coordinatorLayout.new ViewTreeObserverOnPreDrawListenerC1063g();
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f4394l);
                }
                coordinatorLayout.f4395m = true;
            } else {
                if (coordinatorLayout.f4390h && coordinatorLayout.f4394l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f4394l);
                }
                coordinatorLayout.f4395m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.f4396n != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f4383a;
        int size3 = arrayList3.size();
        int i19 = 0;
        int iCombineMeasuredStates = 0;
        while (i19 < size3) {
            View view2 = (View) arrayList3.get(i19);
            int i20 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i11 = paddingLeft;
                i9 = paddingRight;
                suggestedMinimumWidth = i20;
                z2 = false;
                i13 = i19;
            } else {
                C1062f c1062f = (C1062f) view2.getLayoutParams();
                int i21 = c1062f.f4408e;
                if (i21 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM2445h = coordinatorLayout.m2445h(i21);
                    int i22 = c1062f.f4406c;
                    if (i22 == 0) {
                        i22 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM2445h);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM2445h - paddingLeft);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z4 || view2.getFitsSystemWindows()) {
                        i6 = i4;
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        i6 = i4;
                        int iM1693c = coordinatorLayout.f4396n.m1693c() + coordinatorLayout.f4396n.m1692b();
                        int iM1691a = coordinatorLayout.f4396n.m1691a() + coordinatorLayout.f4396n.m1694d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM1693c, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM1691a, mode2);
                    }
                    abstractC1059c = c1062f.f4404a;
                    if (abstractC1059c == null) {
                        ArrayList arrayList4 = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        arrayList = arrayList4;
                        z2 = false;
                        i9 = paddingRight;
                        i10 = i3;
                        i11 = paddingLeft;
                        i12 = i20;
                        i13 = i19;
                        int i25 = iMakeMeasureSpec2;
                        boolean zMo1305i = abstractC1059c.mo1305i(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i8 = i5;
                        i7 = i25;
                        if (zMo1305i) {
                            coordinatorLayout = this;
                        }
                        int iMax2 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) c1062f).leftMargin + ((ViewGroup.MarginLayoutParams) c1062f).rightMargin);
                        int iMax3 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) c1062f).topMargin + ((ViewGroup.MarginLayoutParams) c1062f).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax2;
                        suggestedMinimumHeight = iMax3;
                    } else {
                        int i26 = i5;
                        i7 = iMakeMeasureSpec2;
                        view = view2;
                        arrayList = arrayList3;
                        i8 = i26;
                        i9 = paddingRight;
                        i10 = i3;
                        z2 = false;
                        i11 = paddingLeft;
                        i12 = i20;
                        i13 = i19;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                    int iMax22 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) c1062f).leftMargin + ((ViewGroup.MarginLayoutParams) c1062f).rightMargin);
                    int iMax32 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) c1062f).topMargin + ((ViewGroup.MarginLayoutParams) c1062f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax22;
                    suggestedMinimumHeight = iMax32;
                }
                i4 = size3;
                i5 = 0;
                if (z4) {
                    i6 = i4;
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    abstractC1059c = c1062f.f4404a;
                    if (abstractC1059c == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                    int iMax222 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) c1062f).leftMargin + ((ViewGroup.MarginLayoutParams) c1062f).rightMargin);
                    int iMax322 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) c1062f).topMargin + ((ViewGroup.MarginLayoutParams) c1062f).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax222;
                    suggestedMinimumHeight = iMax322;
                }
            }
            i19 = i13 + 1;
            arrayList3 = arrayList;
            size3 = i6;
            paddingLeft = i11;
            paddingRight = i9;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(suggestedMinimumHeight, i2, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1062f c1062f = (C1062f) childAt.getLayoutParams();
                if (c1062f.m2468a(0)) {
                    AbstractC1059c abstractC1059c = c1062f.f4404a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC1059c abstractC1059c;
        int childCount = getChildCount();
        boolean zMo2460j = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1062f c1062f = (C1062f) childAt.getLayoutParams();
                if (c1062f.m2468a(0) && (abstractC1059c = c1062f.f4404a) != null) {
                    zMo2460j |= abstractC1059c.mo2460j(view);
                }
            }
        }
        return zMo2460j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo530j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo531n(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo528c(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1064h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1064h c1064h = (C1064h) parcelable;
        super.onRestoreInstanceState(c1064h.f3119a);
        SparseArray<Parcelable> sparseArray = c1064h.f4421c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1059c abstractC1059c = m2438k(childAt).f4404a;
            if (id != -1 && abstractC1059c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC1059c.mo2464n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo2465o;
        C1064h c1064h = new C1064h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1059c abstractC1059c = ((C1062f) childAt.getLayoutParams()).f4404a;
            if (id != -1 && abstractC1059c != null && (parcelableMo2465o = abstractC1059c.mo2465o(childAt)) != null) {
                sparseArray.append(id, parcelableMo2465o);
            }
        }
        c1064h.f4421c = sparseArray;
        return c1064h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo532o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo529i(view, 0);
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
        boolean zM2450s;
        boolean zMo1272r;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4392j == null) {
            zM2450s = m2450s(motionEvent, 1);
            if (!zM2450s) {
                zMo1272r = false;
            }
            motionEventObtain = null;
            if (this.f4392j != null) {
                zMo1272r |= super.onTouchEvent(motionEvent);
            } else if (zM2450s) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo1272r;
            }
            m2452u(false);
            return zMo1272r;
        }
        zM2450s = false;
        AbstractC1059c abstractC1059c = ((C1062f) this.f4392j.getLayoutParams()).f4404a;
        if (abstractC1059c != null) {
            zMo1272r = abstractC1059c.mo1272r(this, this.f4392j, motionEvent);
        }
        motionEventObtain = null;
        if (this.f4392j != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        m2452u(false);
        return zMo1272r;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0291 A[EDGE_INSN: B:147:0x0291->B:113:0x0291 BREAK  A[LOOP:2: B:118:0x02a9->B:136:0x02e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2447p(int i) {
        Rect rect;
        int i2;
        Rect rect2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        boolean zMo2457d;
        boolean z;
        boolean z2;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        Rect rect3;
        Rect rect4;
        int i13;
        C0069Dc c0069Dc;
        int i14;
        AbstractC1059c abstractC1059c;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f4383a;
        int size = arrayList3.size();
        Rect rectM2436a = m2436a();
        Rect rectM2436a2 = m2436a();
        Rect rectM2436a3 = m2436a();
        int i15 = 0;
        while (true) {
            C0069Dc c0069Dc2 = f4382x;
            if (i15 >= size) {
                Rect rect5 = rectM2436a2;
                Rect rect6 = rectM2436a3;
                rectM2436a.setEmpty();
                c0069Dc2.mo130c(rectM2436a);
                rect5.setEmpty();
                c0069Dc2.mo130c(rect5);
                rect6.setEmpty();
                c0069Dc2.mo130c(rect6);
                return;
            }
            View view = (View) arrayList3.get(i15);
            C1062f c1062f = (C1062f) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                int i16 = size;
                arrayList = arrayList3;
                i4 = i16;
                rect = rectM2436a2;
                rect2 = rectM2436a3;
                i2 = i15;
            } else {
                int i17 = 0;
                while (i17 < i15) {
                    if (c1062f.f4415l == ((View) arrayList3.get(i17))) {
                        C1062f c1062f2 = (C1062f) view.getLayoutParams();
                        if (c1062f2.f4414k != null) {
                            rect3 = rectM2436a2;
                            Rect rectM2436a4 = m2436a();
                            Rect rectM2436a5 = m2436a();
                            Rect rect7 = rectM2436a3;
                            Rect rectM2436a6 = m2436a();
                            i12 = i17;
                            m2444f(c1062f2.f4414k, rectM2436a4);
                            m2442d(view, rectM2436a5, false);
                            i13 = i15;
                            int measuredWidth = view.getMeasuredWidth();
                            C0069Dc c0069Dc3 = c0069Dc2;
                            int measuredHeight = view.getMeasuredHeight();
                            c0069Dc = c0069Dc3;
                            arrayList2 = arrayList3;
                            m2437g(layoutDirection, rectM2436a4, rectM2436a6, c1062f2, measuredWidth, measuredHeight);
                            i14 = size;
                            rect4 = rect7;
                            boolean z3 = (rectM2436a6.left == rectM2436a5.left && rectM2436a6.top == rectM2436a5.top) ? false : true;
                            m2441b(c1062f2, rectM2436a6, measuredWidth, measuredHeight);
                            int i18 = rectM2436a6.left - rectM2436a5.left;
                            int i19 = rectM2436a6.top - rectM2436a5.top;
                            if (i18 != 0) {
                                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                                view.offsetLeftAndRight(i18);
                            }
                            if (i19 != 0) {
                                WeakHashMap<View, C0181Jg> weakHashMap3 = C0866ug.f3395a;
                                view.offsetTopAndBottom(i19);
                            }
                            if (z3 && (abstractC1059c = c1062f2.f4404a) != null) {
                                abstractC1059c.mo2457d(this, view, c1062f2.f4414k);
                            }
                            rectM2436a4.setEmpty();
                            c0069Dc.mo130c(rectM2436a4);
                            rectM2436a5.setEmpty();
                            c0069Dc.mo130c(rectM2436a5);
                            rectM2436a6.setEmpty();
                            c0069Dc.mo130c(rectM2436a6);
                        } else {
                            i12 = i17;
                            arrayList2 = arrayList3;
                            rect3 = rectM2436a2;
                            rect4 = rectM2436a3;
                            i13 = i15;
                            c0069Dc = c0069Dc2;
                            i14 = size;
                        }
                    }
                    c0069Dc2 = c0069Dc;
                    i17 = i12 + 1;
                    rectM2436a2 = rect3;
                    i15 = i13;
                    arrayList3 = arrayList2;
                    size = i14;
                    rectM2436a3 = rect4;
                }
                ArrayList arrayList4 = arrayList3;
                rect = rectM2436a2;
                Rect rect8 = rectM2436a3;
                i2 = i15;
                C0069Dc c0069Dc4 = c0069Dc2;
                int i20 = size;
                m2442d(view, rect, true);
                if (c1062f.f4410g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c1062f.f4410g, layoutDirection);
                    int i21 = absoluteGravity & 112;
                    if (i21 == 48) {
                        rectM2436a.top = Math.max(rectM2436a.top, rect.bottom);
                    } else if (i21 == 80) {
                        rectM2436a.bottom = Math.max(rectM2436a.bottom, getHeight() - rect.top);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 == 3) {
                        rectM2436a.left = Math.max(rectM2436a.left, rect.right);
                    } else if (i22 == 5) {
                        rectM2436a.right = Math.max(rectM2436a.right, getWidth() - rect.left);
                    }
                }
                if (c1062f.f4411h == 0 || view.getVisibility() != 0) {
                    if (i != 2) {
                        rect2 = rect8;
                        rect2.set(((C1062f) view.getLayoutParams()).f4419p);
                        if (rect2.equals(rect)) {
                            arrayList = arrayList4;
                            i4 = i20;
                        } else {
                            ((C1062f) view.getLayoutParams()).f4419p.set(rect);
                        }
                    } else {
                        rect2 = rect8;
                    }
                    i3 = i2 + 1;
                    i4 = i20;
                    while (true) {
                        arrayList = arrayList4;
                        if (i3 >= i4) {
                            break;
                        }
                        View view2 = (View) arrayList.get(i3);
                        C1062f c1062f3 = (C1062f) view2.getLayoutParams();
                        AbstractC1059c abstractC1059c2 = c1062f3.f4404a;
                        if (abstractC1059c2 == null || !abstractC1059c2.mo2455b(view2, view)) {
                            i5 = 1;
                        } else if (i == 0 && c1062f3.f4418o) {
                            c1062f3.f4418o = false;
                            i5 = 1;
                        } else {
                            if (i != 2) {
                                zMo2457d = abstractC1059c2.mo2457d(this, view2, view);
                            } else {
                                abstractC1059c2.mo2458e(this, view);
                                zMo2457d = true;
                            }
                            i5 = 1;
                            if (i == 1) {
                                c1062f3.f4418o = zMo2457d;
                            }
                        }
                        i3 += i5;
                        arrayList4 = arrayList;
                    }
                } else {
                    WeakHashMap<View, C0181Jg> weakHashMap4 = C0866ug.f3395a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        C1062f c1062f4 = (C1062f) view.getLayoutParams();
                        AbstractC1059c abstractC1059c3 = c1062f4.f4404a;
                        Rect rectM2436a7 = m2436a();
                        Rect rectM2436a8 = m2436a();
                        rectM2436a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC1059c3 == null || !abstractC1059c3.mo2454a(view)) {
                            rectM2436a7.set(rectM2436a8);
                        } else if (!rectM2436a8.contains(rectM2436a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM2436a7.toShortString() + " | Bounds:" + rectM2436a8.toShortString());
                        }
                        rectM2436a8.setEmpty();
                        c0069Dc4.mo130c(rectM2436a8);
                        if (rectM2436a7.isEmpty()) {
                            rectM2436a7.setEmpty();
                            c0069Dc4.mo130c(rectM2436a7);
                            if (i != 2) {
                            }
                            i3 = i2 + 1;
                            i4 = i20;
                            while (true) {
                                arrayList = arrayList4;
                                if (i3 >= i4) {
                                }
                                i3 += i5;
                                arrayList4 = arrayList;
                            }
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c1062f4.f4411h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i10 = (rectM2436a7.top - ((ViewGroup.MarginLayoutParams) c1062f4).topMargin) - c1062f4.f4413j) >= (i11 = rectM2436a.top)) {
                                z = false;
                            } else {
                                m2440w(view, i11 - i10);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM2436a7.bottom) - ((ViewGroup.MarginLayoutParams) c1062f4).bottomMargin) + c1062f4.f4413j) < (i9 = rectM2436a.bottom)) {
                                m2440w(view, height - i9);
                                z = true;
                            }
                            if (!z) {
                                m2440w(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i7 = (rectM2436a7.left - ((ViewGroup.MarginLayoutParams) c1062f4).leftMargin) - c1062f4.f4412i) >= (i8 = rectM2436a.left)) {
                                z2 = false;
                            } else {
                                m2439v(view, i8 - i7);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM2436a7.right) - ((ViewGroup.MarginLayoutParams) c1062f4).rightMargin) + c1062f4.f4412i) < (i6 = rectM2436a.right)) {
                                m2439v(view, width - i6);
                                z2 = true;
                            }
                            if (!z2) {
                                m2439v(view, 0);
                            }
                            rectM2436a7.setEmpty();
                            c0069Dc4.mo130c(rectM2436a7);
                            if (i != 2) {
                            }
                            i3 = i2 + 1;
                            i4 = i20;
                            while (true) {
                                arrayList = arrayList4;
                                if (i3 >= i4) {
                                }
                                i3 += i5;
                                arrayList4 = arrayList;
                            }
                        }
                    }
                }
            }
            i15 = i2 + 1;
            ArrayList arrayList5 = arrayList;
            size = i4;
            arrayList3 = arrayList5;
            rectM2436a3 = rect2;
            rectM2436a2 = rect;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2448q(View view, int i) {
        Rect rectM2436a;
        Rect rectM2436a2;
        C1062f c1062f = (C1062f) view.getLayoutParams();
        View view2 = c1062f.f4414k;
        if (view2 == null && c1062f.f4409f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0069Dc c0069Dc = f4382x;
        if (view2 != null) {
            rectM2436a = m2436a();
            rectM2436a2 = m2436a();
            try {
                m2444f(view2, rectM2436a);
                C1062f c1062f2 = (C1062f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m2437g(i, rectM2436a, rectM2436a2, c1062f2, measuredWidth, measuredHeight);
                m2441b(c1062f2, rectM2436a2, measuredWidth, measuredHeight);
                view.layout(rectM2436a2.left, rectM2436a2.top, rectM2436a2.right, rectM2436a2.bottom);
                return;
            } finally {
                rectM2436a.setEmpty();
                c0069Dc.mo130c(rectM2436a);
                rectM2436a2.setEmpty();
                c0069Dc.mo130c(rectM2436a2);
            }
        }
        int i2 = c1062f.f4408e;
        if (i2 < 0) {
            C1062f c1062f3 = (C1062f) view.getLayoutParams();
            rectM2436a = m2436a();
            rectM2436a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1062f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1062f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1062f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1062f3).bottomMargin);
            if (this.f4396n != null) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM2436a.left = this.f4396n.m1692b() + rectM2436a.left;
                    rectM2436a.top = this.f4396n.m1694d() + rectM2436a.top;
                    rectM2436a.right -= this.f4396n.m1693c();
                    rectM2436a.bottom -= this.f4396n.m1691a();
                }
            }
            rectM2436a2 = m2436a();
            int i3 = c1062f3.f4406c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM2436a, rectM2436a2, i);
            view.layout(rectM2436a2.left, rectM2436a2.top, rectM2436a2.right, rectM2436a2.bottom);
            return;
        }
        C1062f c1062f4 = (C1062f) view.getLayoutParams();
        int i4 = c1062f4.f4406c;
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
        int iM2445h = m2445h(i2) - measuredWidth2;
        if (i5 == 1) {
            iM2445h += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM2445h += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1062f4).leftMargin, Math.min(iM2445h, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1062f4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1062f4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1062f4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final void m2449r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC1059c abstractC1059c = ((C1062f) view.getLayoutParams()).f4404a;
        if (abstractC1059c == null || !abstractC1059c.mo2463m(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f4389g) {
            return;
        }
        m2452u(false);
        this.f4389g = true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2450s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4385c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C1065i c1065i = f4381w;
        if (c1065i != null) {
            Collections.sort(arrayList, c1065i);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1271g = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC1059c abstractC1059c = ((C1062f) view.getLayoutParams()).f4404a;
            if (zMo1271g && actionMasked != 0) {
                if (abstractC1059c != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC1059c.mo1271g(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC1059c.mo1272r(this, view, motionEventObtain);
                    }
                }
            } else if (!zMo1271g && abstractC1059c != null) {
                if (i == 0) {
                    zMo1271g = abstractC1059c.mo1271g(this, view, motionEvent);
                } else if (i == 1) {
                    zMo1271g = abstractC1059c.mo1272r(this, view, motionEvent);
                }
                if (zMo1271g) {
                    this.f4392j = view;
                }
            }
        }
        arrayList.clear();
        return zMo1271g;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2453x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4399q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4398p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f4398p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f4398p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f4398p;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0893w5.b.m2179b(drawable3, getLayoutDirection());
                this.f4398p.setVisible(getVisibility() == 0, false);
                this.f4398p.setCallback(this);
            }
            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0437Y3.a.m1093b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f4398p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f4398p.setVisible(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2451t() {
        C0051Cc c0051Cc;
        View viewFindViewById;
        AbstractC1059c abstractC1059c;
        ArrayList arrayList = this.f4383a;
        arrayList.clear();
        C0003A2 c0003a2 = this.f4384b;
        C0598ge c0598ge = (C0598ge) c0003a2.f24b;
        int i = c0598ge.f2221c;
        int i2 = 0;
        while (true) {
            c0051Cc = (C0051Cc) c0003a2.f23a;
            if (i2 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c0598ge.m1438j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                c0051Cc.mo130c(arrayList2);
            }
            i2++;
        }
        c0598ge.clear();
        int childCount = getChildCount();
        int i3 = 0;
        loop1: while (true) {
            C0598ge c0598ge2 = (C0598ge) c0003a2.f24b;
            if (i3 >= childCount) {
                ArrayList arrayList3 = (ArrayList) c0003a2.f25c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) c0003a2.f26d;
                hashSet.clear();
                int i4 = c0598ge2.f2221c;
                for (int i5 = 0; i5 < i4; i5++) {
                    c0003a2.m22b(c0598ge2.m1436h(i5), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i3);
            C1062f c1062fM2438k = m2438k(childAt);
            int i6 = c1062fM2438k.f4409f;
            if (i6 == -1) {
                c1062fM2438k.f4415l = null;
                c1062fM2438k.f4414k = null;
            } else {
                View view = c1062fM2438k.f4414k;
                if (view == null || view.getId() != i6) {
                    viewFindViewById = findViewById(i6);
                    c1062fM2438k.f4414k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                        }
                        c1062fM2438k.f4415l = null;
                        c1062fM2438k.f4414k = null;
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
                                c1062fM2438k.f4415l = null;
                                c1062fM2438k.f4414k = null;
                            }
                        }
                        c1062fM2438k.f4415l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        c1062fM2438k.f4415l = null;
                        c1062fM2438k.f4414k = null;
                    }
                } else {
                    View view2 = c1062fM2438k.f4414k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c1062fM2438k.f4415l = null;
                            c1062fM2438k.f4414k = null;
                            viewFindViewById = findViewById(i6);
                            c1062fM2438k.f4414k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c1062fM2438k.f4415l = view2;
                }
            }
            if (!c0598ge2.containsKey(childAt)) {
                c0598ge2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i3) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != c1062fM2438k.f4415l) {
                        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C1062f) childAt2.getLayoutParams()).f4410g, layoutDirection);
                        if ((absoluteGravity != 0 && (Gravity.getAbsoluteGravity(c1062fM2438k.f4411h, layoutDirection) & absoluteGravity) == absoluteGravity) || ((abstractC1059c = c1062fM2438k.f4404a) != null && abstractC1059c.mo2455b(childAt, childAt2))) {
                            if (!c0598ge2.containsKey(childAt2) && !c0598ge2.containsKey(childAt2)) {
                                c0598ge2.put(childAt2, null);
                            }
                            if (!c0598ge2.containsKey(childAt2) || !c0598ge2.containsKey(childAt)) {
                                break loop1;
                            }
                            ArrayList arrayList4 = (ArrayList) c0598ge2.getOrDefault(childAt2, null);
                            if (arrayList4 == null) {
                                arrayList4 = (ArrayList) c0051Cc.mo128a();
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                c0598ge2.put(childAt2, arrayList4);
                            }
                            arrayList4.add(childAt);
                        }
                    }
                }
            }
            i3++;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* JADX INFO: renamed from: u */
    public final void m2452u(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC1059c abstractC1059c = ((C1062f) childAt.getLayoutParams()).f4404a;
            if (abstractC1059c != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC1059c.mo1271g(this, childAt, motionEventObtain);
                } else {
                    abstractC1059c.mo1272r(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1062f) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f4392j = null;
        this.f4389g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4398p;
    }

    /* JADX INFO: renamed from: x */
    public final void m2453x() {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (!getFitsSystemWindows()) {
            C0866ug.d.m2029u(this, null);
            return;
        }
        if (this.f4400r == null) {
            this.f4400r = new C1057a();
        }
        C0866ug.d.m2029u(this, this.f4400r);
        setSystemUiVisibility(1280);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1062f ? new C1062f((C1062f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1062f((ViewGroup.MarginLayoutParams) layoutParams) : new C1062f(layoutParams);
    }

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C1062f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public AbstractC1059c f4404a;

        /* JADX INFO: renamed from: b */
        public boolean f4405b;

        /* JADX INFO: renamed from: c */
        public final int f4406c;

        /* JADX INFO: renamed from: d */
        public int f4407d;

        /* JADX INFO: renamed from: e */
        public final int f4408e;

        /* JADX INFO: renamed from: f */
        public final int f4409f;

        /* JADX INFO: renamed from: g */
        public final int f4410g;

        /* JADX INFO: renamed from: h */
        public int f4411h;

        /* JADX INFO: renamed from: i */
        public int f4412i;

        /* JADX INFO: renamed from: j */
        public int f4413j;

        /* JADX INFO: renamed from: k */
        public View f4414k;

        /* JADX INFO: renamed from: l */
        public View f4415l;

        /* JADX INFO: renamed from: m */
        public boolean f4416m;

        /* JADX INFO: renamed from: n */
        public boolean f4417n;

        /* JADX INFO: renamed from: o */
        public boolean f4418o;

        /* JADX INFO: renamed from: p */
        public final Rect f4419p;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1062f() {
            super(-2, -2);
            this.f4405b = false;
            this.f4406c = 0;
            this.f4407d = 0;
            this.f4408e = -1;
            this.f4409f = -1;
            this.f4410g = 0;
            this.f4411h = 0;
            this.f4419p = new Rect();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m2468a(int i) {
            if (i == 0) {
                return this.f4416m;
            }
            if (i != 1) {
                return false;
            }
            return this.f4417n;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.lang.Class<?> */
        /* JADX WARN: Multi-variable type inference failed */
        public C1062f(Context context, AttributeSet attributeSet) {
            AbstractC1059c abstractC1059cNewInstance;
            super(context, attributeSet);
            this.f4405b = false;
            this.f4406c = 0;
            this.f4407d = 0;
            this.f4408e = -1;
            this.f4409f = -1;
            this.f4410g = 0;
            this.f4411h = 0;
            this.f4419p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1056R.styleable.CoordinatorLayout_Layout);
            this.f4406c = typedArrayObtainStyledAttributes.getInteger(C1056R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f4409f = typedArrayObtainStyledAttributes.getResourceId(C1056R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f4407d = typedArrayObtainStyledAttributes.getInteger(C1056R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f4408e = typedArrayObtainStyledAttributes.getInteger(C1056R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f4410g = typedArrayObtainStyledAttributes.getInt(C1056R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f4411h = typedArrayObtainStyledAttributes.getInt(C1056R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C1056R.styleable.CoordinatorLayout_Layout_layout_behavior);
            this.f4405b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(C1056R.styleable.CoordinatorLayout_Layout_layout_behavior);
                String str = CoordinatorLayout.f4378t;
                if (TextUtils.isEmpty(string)) {
                    abstractC1059cNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f4378t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC1059c>>> threadLocal = CoordinatorLayout.f4380v;
                        Map<String, Constructor<AbstractC1059c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC1059c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4379u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        abstractC1059cNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(C0944z.m2231k("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f4404a = abstractC1059cNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            AbstractC1059c abstractC1059c = this.f4404a;
            if (abstractC1059c != null) {
                abstractC1059c.mo2456c(this);
            }
        }

        public C1062f(C1062f c1062f) {
            super((ViewGroup.MarginLayoutParams) c1062f);
            this.f4405b = false;
            this.f4406c = 0;
            this.f4407d = 0;
            this.f4408e = -1;
            this.f4409f = -1;
            this.f4410g = 0;
            this.f4411h = 0;
            this.f4419p = new Rect();
        }

        public C1062f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4405b = false;
            this.f4406c = 0;
            this.f4407d = 0;
            this.f4408e = -1;
            this.f4409f = -1;
            this.f4410g = 0;
            this.f4411h = 0;
            this.f4419p = new Rect();
        }

        public C1062f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4405b = false;
            this.f4406c = 0;
            this.f4407d = 0;
            this.f4408e = -1;
            this.f4409f = -1;
            this.f4410g = 0;
            this.f4411h = 0;
            this.f4419p = new Rect();
        }
    }
}
