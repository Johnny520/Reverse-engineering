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
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0283;
import androidx.compose.animation.C0426;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.text.C0966;
import androidx.core.util.C2184;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2206;
import androidx.core.view.InterfaceC2251;
import androidx.customview.view.AbsSavedState;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p198.AbstractC7850;
import p201.AbstractC7872;
import p201.AbstractC7876;
import p201.C7873;
import p201.InterfaceC7875;
import p201.ViewGroupOnHierarchyChangeListenerC7874;
import p225.ViewTreeObserverOnPreDrawListenerC8001;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2251, InterfaceC2206 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C0426 f6398;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final ThreadLocal f6399;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C2184 f6400;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Class[] f6401;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final String f6402;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6403;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C2225 f6404;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6405;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC8001 f6406;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public View f6407;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public View f6408;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0966 f6409;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C5856 f6410;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f6411;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Drawable f6412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int[] f6413;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f6414;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f6415;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f6416;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f6417;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f6418;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0325 f6419;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f6420;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6421;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2164();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public SparseArray f6422;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f6422 = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f6422.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f6422;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f6422.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f6422.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f6402 = r0 != null ? r0.getName() : null;
        f6398 = new C0426(9);
        f6401 = new Class[]{Context.class, AttributeSet.class};
        f6399 = new ThreadLocal();
        f6400 = new C2184(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f6421 = new ArrayList();
        this.f6419 = new C0325(27);
        this.f6420 = new ArrayList();
        this.f6414 = new ArrayList();
        this.f6413 = new int[2];
        this.f6417 = new int[2];
        this.f6409 = new C0966();
        int[] iArr = AbstractC7850.f21411;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f6416 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f6416[i] = (int) (r1[i] * f);
            }
        }
        this.f6412 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m3937();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC7874(this));
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Rect m3929() {
        Rect rect = (Rect) f6400.acquire();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m3930(View view, int i) {
        C7873 c7873 = (C7873) view.getLayoutParams();
        int i2 = c7873.f21665;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            view.offsetLeftAndRight(i - i2);
            c7873.f21665 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m3931(View view, int i) {
        C7873 c7873 = (C7873) view.getLayoutParams();
        int i2 = c7873.f21666;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            view.offsetTopAndBottom(i - i2);
            c7873.f21666 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C7873 m3932(View view) {
        C7873 c7873 = (C7873) view.getLayoutParams();
        if (!c7873.f21656) {
            InterfaceC7875 interfaceC7875 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC7875 = (InterfaceC7875) superclass.getAnnotation(InterfaceC7875.class);
                if (interfaceC7875 != null) {
                    break;
                }
            }
            if (interfaceC7875 != null) {
                try {
                    AbstractC7876 abstractC7876 = (AbstractC7876) interfaceC7875.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC7876 abstractC78762 = c7873.f21657;
                    if (abstractC78762 != abstractC7876) {
                        if (abstractC78762 != null) {
                            abstractC78762.mo7026();
                        }
                        c7873.f21657 = abstractC7876;
                        c7873.f21656 = true;
                        if (abstractC7876 != null) {
                            abstractC7876.mo7027(c7873);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC7875.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c7873.f21656 = true;
        }
        return c7873;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m3933(int i, Rect rect, Rect rect2, C7873 c7873, int i2, int i3) {
        int i4 = c7873.f21655;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c7873.f21654;
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

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C7873) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC7876 abstractC7876 = ((C7873) view.getLayoutParams()).f21657;
        if (abstractC7876 != null) {
            abstractC7876.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6412;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7873();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7873 ? new C7873((C7873) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C7873((ViewGroup.MarginLayoutParams) layoutParams) : new C7873(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m3936();
        return Collections.unmodifiableList(this.f6421);
    }

    public final C2225 getLastWindowInsets() {
        return this.f6404;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0966 c0966 = this.f6409;
        return c0966.f2755 | c0966.f2756;
    }

    public Drawable getStatusBarBackground() {
        return this.f6412;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3935(false);
        if (this.f6405) {
            if (this.f6406 == null) {
                this.f6406 = new ViewTreeObserverOnPreDrawListenerC8001(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f6406);
        }
        if (this.f6404 == null) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f6415 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3935(false);
        if (this.f6405 && this.f6406 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f6406);
        }
        View view = this.f6407;
        if (view != null) {
            mo477(view, 0);
        }
        this.f6415 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6403 || this.f6412 == null) {
            return;
        }
        C2225 c2225 = this.f6404;
        int iM4065 = c2225 != null ? c2225.m4065() : 0;
        if (iM4065 > 0) {
            this.f6412.setBounds(0, 0, getWidth(), iM4065);
            this.f6412.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3935(true);
        }
        boolean zM3940 = m3940(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM3940;
        }
        m3935(true);
        return zM3940;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC7876 abstractC7876;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f6421;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC7876 = ((C7873) view.getLayoutParams()).f21657) == null || !abstractC7876.mo6993(this, view, layoutDirection))) {
                m3939(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 499
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
                C7873 c7873 = (C7873) childAt.getLayoutParams();
                if (c7873.m13233(0)) {
                    AbstractC7876 abstractC7876 = c7873.f21657;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC7876 abstractC7876;
        int childCount = getChildCount();
        boolean zMo7033 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C7873 c7873 = (C7873) childAt.getLayoutParams();
                if (c7873.m13233(0) && (abstractC7876 = c7873.f21657) != null) {
                    zMo7033 |= abstractC7876.mo7033(view);
                }
            }
        }
        return zMo7033;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo476(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo473(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo471(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6699);
        SparseArray sparseArray = savedState.f6422;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC7876 abstractC7876 = m3932(childAt).f21657;
            if (id != -1 && abstractC7876 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC7876.mo6989(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo6988;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC7876 abstractC7876 = ((C7873) childAt.getLayoutParams()).f21657;
            if (id != -1 && abstractC7876 != null && (parcelableMo6988 = abstractC7876.mo6988(childAt)) != null) {
                sparseArray.append(id, parcelableMo6988);
            }
        }
        savedState.f6422 = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo472(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo477(view, 0);
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
            android.view.View r3 = r0.f6408
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m3940(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f6408
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            飘花落叶言子苏兰哲楪世.飘花落叶言子楪世哲兰苏 r6 = (p201.C7873) r6
            飘花落叶言子苏兰哲楪世.飘花落叶言子楪世苏哲兰 r6 = r6.f21657
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f6408
            boolean r6 = r6.mo7008(r7, r1)
        L2a:
            android.view.View r7 = r0.f6408
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
            r0.m3935(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC7876 abstractC7876 = ((C7873) view.getLayoutParams()).f21657;
        if (abstractC7876 == null || !abstractC7876.mo7000(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f6418) {
            return;
        }
        m3935(false);
        this.f6418 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m3937();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6411 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f6412;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f6412 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f6412.setState(getDrawableState());
                }
                Drawable drawable3 = this.f6412;
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f6412.setVisible(getVisibility() == 0, false);
                this.f6412.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC2270.f6594;
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
        Drawable drawable = this.f6412;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f6412.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6412;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo471(View view, View view2, int i, int i2) {
        C0966 c0966 = this.f6409;
        if (i2 == 1) {
            c0966.f2755 = i;
        } else {
            c0966.f2756 = i;
        }
        this.f6407 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C7873) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo472(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C7873 c7873 = (C7873) childAt.getLayoutParams();
                AbstractC7876 abstractC7876 = c7873.f21657;
                if (abstractC7876 != null) {
                    boolean zMo6990 = abstractC7876.mo6990(childAt, i, i2);
                    z |= zMo6990;
                    if (i2 == 0) {
                        c7873.f21659 = zMo6990;
                    } else if (i2 == 1) {
                        c7873.f21658 = zMo6990;
                    }
                } else if (i2 == 0) {
                    c7873.f21659 = false;
                } else if (i2 == 1) {
                    c7873.f21658 = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo473(View view, int i, int i2, int i3, int i4, int i5) {
        mo474(view, i, i2, i3, i4, 0, this.f6417);
    }

    @Override // androidx.core.view.InterfaceC2206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo474(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC7876 abstractC7876;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C7873 c7873 = (C7873) childAt.getLayoutParams();
                if (c7873.m13233(i5) && (abstractC7876 = c7873.f21657) != null) {
                    int[] iArr2 = this.f6413;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC7876.mo6994(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m3942(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3934(C7873 c7873, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c7873).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c7873).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c7873).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c7873).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m3935(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC7876 abstractC7876 = ((C7873) childAt.getLayoutParams()).f21657;
            if (abstractC7876 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC7876.mo7007(this, childAt, motionEventObtain);
                } else {
                    abstractC7876.mo7008(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C7873) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f6408 = null;
        this.f6418 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3936() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m3936():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m3937() {
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        if (!getFitsSystemWindows()) {
            AbstractC2193.m4004(this, null);
            return;
        }
        if (this.f6410 == null) {
            this.f6410 = new C5856(this, 24);
        }
        AbstractC2193.m4004(this, this.f6410);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m3938(int i) {
        int[] iArr = this.f6416;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3939(View view, int i) {
        Rect rectM3929;
        Rect rectM39292;
        C7873 c7873 = (C7873) view.getLayoutParams();
        View view2 = c7873.f21663;
        if (view2 == null && c7873.f21652 != -1) {
            C5925.m11311("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        C2184 c2184 = f6400;
        if (view2 != null) {
            rectM3929 = m3929();
            rectM39292 = m3929();
            try {
                m3943(rectM3929, view2);
                C7873 c78732 = (C7873) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m3933(i, rectM3929, rectM39292, c78732, measuredWidth, measuredHeight);
                m3934(c78732, rectM39292, measuredWidth, measuredHeight);
                view.layout(rectM39292.left, rectM39292.top, rectM39292.right, rectM39292.bottom);
                return;
            } finally {
                rectM3929.setEmpty();
                c2184.mo3989(rectM3929);
                rectM39292.setEmpty();
                c2184.mo3989(rectM39292);
            }
        }
        int i2 = c7873.f21653;
        if (i2 < 0) {
            C7873 c78733 = (C7873) view.getLayoutParams();
            rectM3929 = m3929();
            rectM3929.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c78733).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c78733).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c78733).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c78733).bottomMargin);
            if (this.f6404 != null) {
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM3929.left = this.f6404.m4067() + rectM3929.left;
                    rectM3929.top = this.f6404.m4065() + rectM3929.top;
                    rectM3929.right -= this.f6404.m4066();
                    rectM3929.bottom -= this.f6404.m4068();
                }
            }
            rectM39292 = m3929();
            int i3 = c78733.f21655;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM3929, rectM39292, i);
            view.layout(rectM39292.left, rectM39292.top, rectM39292.right, rectM39292.bottom);
            return;
        }
        C7873 c78734 = (C7873) view.getLayoutParams();
        int i4 = c78734.f21655;
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
        int iM3938 = m3938(i2) - measuredWidth2;
        if (i5 == 1) {
            iM3938 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM3938 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c78734).leftMargin, Math.min(iM3938, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c78734).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c78734).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c78734).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3940(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f6420;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0426 c0426 = f6398;
        if (c0426 != null) {
            Collections.sort(arrayList, c0426);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo7007 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC7876 abstractC7876 = ((C7873) view.getLayoutParams()).f21657;
            if (zMo7007 && actionMasked != 0) {
                if (abstractC7876 != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC7876.mo7007(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC7876.mo7008(view, motionEventObtain);
                    }
                }
            } else if (!zMo7007 && abstractC7876 != null) {
                if (i == 0) {
                    zMo7007 = abstractC7876.mo7007(this, view, motionEvent);
                } else if (i == 1) {
                    zMo7007 = abstractC7876.mo7008(view, motionEvent);
                }
                if (zMo7007) {
                    this.f6408 = view;
                }
            }
        }
        arrayList.clear();
        return zMo7007;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m3941(View view, int i, int i2) {
        C2184 c2184 = f6400;
        Rect rectM3929 = m3929();
        m3943(rectM3929, view);
        try {
            return rectM3929.contains(i, i2);
        } finally {
            rectM3929.setEmpty();
            c2184.mo3989(rectM3929);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3942(int r23) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m3942(int):void");
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo476(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC7876 abstractC7876;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C7873 c7873 = (C7873) childAt.getLayoutParams();
                if (c7873.m13233(i3) && (abstractC7876 = c7873.f21657) != null) {
                    int[] iArr2 = this.f6413;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC7876.mo6995(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m3942(1);
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo477(View view, int i) {
        C0966 c0966 = this.f6409;
        if (i == 1) {
            c0966.f2755 = 0;
        } else {
            c0966.f2756 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C7873 c7873 = (C7873) childAt.getLayoutParams();
            if (c7873.m13233(i)) {
                AbstractC7876 abstractC7876 = c7873.f21657;
                if (abstractC7876 != null) {
                    abstractC7876.mo6991(childAt, view, i);
                }
                if (i == 0) {
                    c7873.f21659 = false;
                } else if (i == 1) {
                    c7873.f21658 = false;
                }
            }
        }
        this.f6407 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3943(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC7872.f21651;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC7872.f21651;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC7872.m13232(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC7872.f21650;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3944(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m3943(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList m3945(View view) {
        C0283 c0283 = (C0283) this.f6419.f1096;
        int i = c0283.f994;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c0283.m871(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0283.m862(i2));
            }
        }
        ArrayList arrayList3 = this.f6414;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7873(getContext(), attributeSet);
    }
}
