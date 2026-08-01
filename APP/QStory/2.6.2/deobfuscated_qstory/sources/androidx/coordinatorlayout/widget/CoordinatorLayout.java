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
import p198.AbstractC7849;
import p201.AbstractC7871;
import p201.AbstractC7875;
import p201.C7872;
import p201.InterfaceC7874;
import p201.ViewGroupOnHierarchyChangeListenerC7873;
import p225.ViewTreeObserverOnPreDrawListenerC8000;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2251, InterfaceC2206 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C0426 f6397;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final ThreadLocal f6398;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C2184 f6399;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Class[] f6400;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final String f6401;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6402;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C2225 f6403;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6404;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC8000 f6405;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public View f6406;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public View f6407;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0966 f6408;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C5851 f6409;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f6410;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Drawable f6411;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int[] f6412;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f6413;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f6414;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f6415;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f6416;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f6417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0325 f6418;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f6419;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6420;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2164();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public SparseArray f6421;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f6421 = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f6421.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f6421;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f6421.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f6421.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f6401 = r0 != null ? r0.getName() : null;
        f6397 = new C0426(9);
        f6400 = new Class[]{Context.class, AttributeSet.class};
        f6398 = new ThreadLocal();
        f6399 = new C2184(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f6420 = new ArrayList();
        this.f6418 = new C0325(27);
        this.f6419 = new ArrayList();
        this.f6413 = new ArrayList();
        this.f6412 = new int[2];
        this.f6416 = new int[2];
        this.f6408 = new C0966();
        int[] iArr = AbstractC7849.f21414;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f6415 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f6415[i] = (int) (r1[i] * f);
            }
        }
        this.f6411 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m3927();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC7873(this));
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Rect m3919() {
        Rect rect = (Rect) f6399.acquire();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m3920(View view, int i) {
        C7872 c7872 = (C7872) view.getLayoutParams();
        int i2 = c7872.f21668;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            view.offsetLeftAndRight(i - i2);
            c7872.f21668 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m3921(View view, int i) {
        C7872 c7872 = (C7872) view.getLayoutParams();
        int i2 = c7872.f21669;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            view.offsetTopAndBottom(i - i2);
            c7872.f21669 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C7872 m3922(View view) {
        C7872 c7872 = (C7872) view.getLayoutParams();
        if (!c7872.f21659) {
            InterfaceC7874 interfaceC7874 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC7874 = (InterfaceC7874) superclass.getAnnotation(InterfaceC7874.class);
                if (interfaceC7874 != null) {
                    break;
                }
            }
            if (interfaceC7874 != null) {
                try {
                    AbstractC7875 abstractC7875 = (AbstractC7875) interfaceC7874.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC7875 abstractC78752 = c7872.f21660;
                    if (abstractC78752 != abstractC7875) {
                        if (abstractC78752 != null) {
                            abstractC78752.mo7039();
                        }
                        c7872.f21660 = abstractC7875;
                        c7872.f21659 = true;
                        if (abstractC7875 != null) {
                            abstractC7875.mo7040(c7872);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC7874.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c7872.f21659 = true;
        }
        return c7872;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m3923(int i, Rect rect, Rect rect2, C7872 c7872, int i2, int i3) {
        int i4 = c7872.f21658;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c7872.f21657;
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
        return (layoutParams instanceof C7872) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC7875 abstractC7875 = ((C7872) view.getLayoutParams()).f21660;
        if (abstractC7875 != null) {
            abstractC7875.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6411;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7872();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7872 ? new C7872((C7872) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C7872((ViewGroup.MarginLayoutParams) layoutParams) : new C7872(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m3926();
        return Collections.unmodifiableList(this.f6420);
    }

    public final C2225 getLastWindowInsets() {
        return this.f6403;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0966 c0966 = this.f6408;
        return c0966.f2754 | c0966.f2755;
    }

    public Drawable getStatusBarBackground() {
        return this.f6411;
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
        m3925(false);
        if (this.f6404) {
            if (this.f6405 == null) {
                this.f6405 = new ViewTreeObserverOnPreDrawListenerC8000(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f6405);
        }
        if (this.f6403 == null) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f6414 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3925(false);
        if (this.f6404 && this.f6405 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f6405);
        }
        View view = this.f6406;
        if (view != null) {
            mo476(view, 0);
        }
        this.f6414 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6402 || this.f6411 == null) {
            return;
        }
        C2225 c2225 = this.f6403;
        int iM4055 = c2225 != null ? c2225.m4055() : 0;
        if (iM4055 > 0) {
            this.f6411.setBounds(0, 0, getWidth(), iM4055);
            this.f6411.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3925(true);
        }
        boolean zM3930 = m3930(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM3930;
        }
        m3925(true);
        return zM3930;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC7875 abstractC7875;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f6420;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC7875 = ((C7872) view.getLayoutParams()).f21660) == null || !abstractC7875.mo7006(this, view, layoutDirection))) {
                m3929(view, layoutDirection);
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
                C7872 c7872 = (C7872) childAt.getLayoutParams();
                if (c7872.m13205(0)) {
                    AbstractC7875 abstractC7875 = c7872.f21660;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC7875 abstractC7875;
        int childCount = getChildCount();
        boolean zMo7046 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C7872 c7872 = (C7872) childAt.getLayoutParams();
                if (c7872.m13205(0) && (abstractC7875 = c7872.f21660) != null) {
                    zMo7046 |= abstractC7875.mo7046(view);
                }
            }
        }
        return zMo7046;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo475(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo472(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo470(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6698);
        SparseArray sparseArray = savedState.f6421;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC7875 abstractC7875 = m3922(childAt).f21660;
            if (id != -1 && abstractC7875 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC7875.mo7002(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo7001;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC7875 abstractC7875 = ((C7872) childAt.getLayoutParams()).f21660;
            if (id != -1 && abstractC7875 != null && (parcelableMo7001 = abstractC7875.mo7001(childAt)) != null) {
                sparseArray.append(id, parcelableMo7001);
            }
        }
        savedState.f6421 = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo471(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo476(view, 0);
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
            android.view.View r3 = r0.f6407
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m3930(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f6407
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            飘花落叶言子苏兰哲楪世.飘花落叶言子楪世哲兰苏 r6 = (p201.C7872) r6
            飘花落叶言子苏兰哲楪世.飘花落叶言子楪世苏哲兰 r6 = r6.f21660
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f6407
            boolean r6 = r6.mo7021(r7, r1)
        L2a:
            android.view.View r7 = r0.f6407
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
            r0.m3925(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC7875 abstractC7875 = ((C7872) view.getLayoutParams()).f21660;
        if (abstractC7875 == null || !abstractC7875.mo7013(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f6417) {
            return;
        }
        m3925(false);
        this.f6417 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m3927();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6410 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f6411;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f6411 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f6411.setState(getDrawableState());
                }
                Drawable drawable3 = this.f6411;
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f6411.setVisible(getVisibility() == 0, false);
                this.f6411.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC2270.f6593;
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
        Drawable drawable = this.f6411;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f6411.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6411;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo470(View view, View view2, int i, int i2) {
        C0966 c0966 = this.f6408;
        if (i2 == 1) {
            c0966.f2754 = i;
        } else {
            c0966.f2755 = i;
        }
        this.f6406 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C7872) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo471(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C7872 c7872 = (C7872) childAt.getLayoutParams();
                AbstractC7875 abstractC7875 = c7872.f21660;
                if (abstractC7875 != null) {
                    boolean zMo7003 = abstractC7875.mo7003(childAt, i, i2);
                    z |= zMo7003;
                    if (i2 == 0) {
                        c7872.f21662 = zMo7003;
                    } else if (i2 == 1) {
                        c7872.f21661 = zMo7003;
                    }
                } else if (i2 == 0) {
                    c7872.f21662 = false;
                } else if (i2 == 1) {
                    c7872.f21661 = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo472(View view, int i, int i2, int i3, int i4, int i5) {
        mo473(view, i, i2, i3, i4, 0, this.f6416);
    }

    @Override // androidx.core.view.InterfaceC2206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo473(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC7875 abstractC7875;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C7872 c7872 = (C7872) childAt.getLayoutParams();
                if (c7872.m13205(i5) && (abstractC7875 = c7872.f21660) != null) {
                    int[] iArr2 = this.f6412;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC7875.mo7007(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m3932(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3924(C7872 c7872, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c7872).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c7872).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c7872).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c7872).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m3925(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC7875 abstractC7875 = ((C7872) childAt.getLayoutParams()).f21660;
            if (abstractC7875 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC7875.mo7020(this, childAt, motionEventObtain);
                } else {
                    abstractC7875.mo7021(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C7872) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f6407 = null;
        this.f6417 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3926() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m3926():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m3927() {
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        if (!getFitsSystemWindows()) {
            AbstractC2193.m3994(this, null);
            return;
        }
        if (this.f6409 == null) {
            this.f6409 = new C5851(this, 24);
        }
        AbstractC2193.m3994(this, this.f6409);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m3928(int i) {
        int[] iArr = this.f6415;
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
    public final void m3929(View view, int i) {
        Rect rectM3919;
        Rect rectM39192;
        C7872 c7872 = (C7872) view.getLayoutParams();
        View view2 = c7872.f21666;
        if (view2 == null && c7872.f21655 != -1) {
            C5919.m11250("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        C2184 c2184 = f6399;
        if (view2 != null) {
            rectM3919 = m3919();
            rectM39192 = m3919();
            try {
                m3933(rectM3919, view2);
                C7872 c78722 = (C7872) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m3923(i, rectM3919, rectM39192, c78722, measuredWidth, measuredHeight);
                m3924(c78722, rectM39192, measuredWidth, measuredHeight);
                view.layout(rectM39192.left, rectM39192.top, rectM39192.right, rectM39192.bottom);
                return;
            } finally {
                rectM3919.setEmpty();
                c2184.mo3979(rectM3919);
                rectM39192.setEmpty();
                c2184.mo3979(rectM39192);
            }
        }
        int i2 = c7872.f21656;
        if (i2 < 0) {
            C7872 c78723 = (C7872) view.getLayoutParams();
            rectM3919 = m3919();
            rectM3919.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c78723).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c78723).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c78723).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c78723).bottomMargin);
            if (this.f6403 != null) {
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM3919.left = this.f6403.m4057() + rectM3919.left;
                    rectM3919.top = this.f6403.m4055() + rectM3919.top;
                    rectM3919.right -= this.f6403.m4056();
                    rectM3919.bottom -= this.f6403.m4058();
                }
            }
            rectM39192 = m3919();
            int i3 = c78723.f21658;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM3919, rectM39192, i);
            view.layout(rectM39192.left, rectM39192.top, rectM39192.right, rectM39192.bottom);
            return;
        }
        C7872 c78724 = (C7872) view.getLayoutParams();
        int i4 = c78724.f21658;
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
        int iM3928 = m3928(i2) - measuredWidth2;
        if (i5 == 1) {
            iM3928 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM3928 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c78724).leftMargin, Math.min(iM3928, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c78724).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c78724).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c78724).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3930(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f6419;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C0426 c0426 = f6397;
        if (c0426 != null) {
            Collections.sort(arrayList, c0426);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo7020 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC7875 abstractC7875 = ((C7872) view.getLayoutParams()).f21660;
            if (zMo7020 && actionMasked != 0) {
                if (abstractC7875 != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC7875.mo7020(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC7875.mo7021(view, motionEventObtain);
                    }
                }
            } else if (!zMo7020 && abstractC7875 != null) {
                if (i == 0) {
                    zMo7020 = abstractC7875.mo7020(this, view, motionEvent);
                } else if (i == 1) {
                    zMo7020 = abstractC7875.mo7021(view, motionEvent);
                }
                if (zMo7020) {
                    this.f6407 = view;
                }
            }
        }
        arrayList.clear();
        return zMo7020;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m3931(View view, int i, int i2) {
        C2184 c2184 = f6399;
        Rect rectM3919 = m3919();
        m3933(rectM3919, view);
        try {
            return rectM3919.contains(i, i2);
        } finally {
            rectM3919.setEmpty();
            c2184.mo3979(rectM3919);
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
    public final void m3932(int r23) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m3932(int):void");
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo475(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC7875 abstractC7875;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C7872 c7872 = (C7872) childAt.getLayoutParams();
                if (c7872.m13205(i3) && (abstractC7875 = c7872.f21660) != null) {
                    int[] iArr2 = this.f6412;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC7875.mo7008(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m3932(1);
        }
    }

    @Override // androidx.core.view.InterfaceC2251
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo476(View view, int i) {
        C0966 c0966 = this.f6408;
        if (i == 1) {
            c0966.f2754 = 0;
        } else {
            c0966.f2755 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C7872 c7872 = (C7872) childAt.getLayoutParams();
            if (c7872.m13205(i)) {
                AbstractC7875 abstractC7875 = c7872.f21660;
                if (abstractC7875 != null) {
                    abstractC7875.mo7004(childAt, view, i);
                }
                if (i == 0) {
                    c7872.f21662 = false;
                } else if (i == 1) {
                    c7872.f21661 = false;
                }
            }
        }
        this.f6406 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3933(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC7871.f21654;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC7871.f21654;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC7871.m13204(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC7871.f21653;
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
    public final void m3934(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m3933(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList m3935(View view) {
        C0283 c0283 = (C0283) this.f6418.f1096;
        int i = c0283.f994;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c0283.m870(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0283.m861(i2));
            }
        }
        ArrayList arrayList3 = this.f6413;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7872(getContext(), attributeSet);
    }
}
