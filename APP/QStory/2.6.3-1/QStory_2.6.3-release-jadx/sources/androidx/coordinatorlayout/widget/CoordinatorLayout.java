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
import android.view.ViewParent;
import androidx.collection.C1123;
import androidx.collection.C1130;
import androidx.compose.animation.C1272;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.text.C1804;
import androidx.core.util.C3017;
import androidx.core.util.C3018;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3039;
import androidx.core.view.InterfaceC3084;
import androidx.customview.view.AbsSavedState;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import lin.xposed.hook.javaplugin.C6385;
import p214.AbstractC8679;
import p217.AbstractC8701;
import p217.AbstractC8705;
import p217.C8702;
import p217.InterfaceC8704;
import p217.ViewGroupOnHierarchyChangeListenerC8703;
import p241.ViewTreeObserverOnPreDrawListenerC8830;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC3084, InterfaceC3039 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C1272 f6743;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final ThreadLocal f6744;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C3017 f6745;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Class[] f6746;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final String f6747;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f6748;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C3058 f6749;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f6750;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC8830 f6751;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public View f6752;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public View f6753;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1804 f6754;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C6686 f6755;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f6756;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Drawable f6757;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int[] f6758;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f6759;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f6760;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f6761;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f6762;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f6763;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1171 f6764;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f6765;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6766;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2997();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
        public SparseArray f6767;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f6767 = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f6767.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f6767;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f6767.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f6767.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f6747 = r0 != null ? r0.getName() : null;
        f6743 = new C1272(9);
        f6746 = new Class[]{Context.class, AttributeSet.class};
        f6744 = new ThreadLocal();
        f6745 = new C3017(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0328R.attr.coordinatorLayoutStyle);
        this.f6766 = new ArrayList();
        this.f6764 = new C1171(27);
        this.f6765 = new ArrayList();
        this.f6759 = new ArrayList();
        this.f6758 = new int[2];
        this.f6762 = new int[2];
        this.f6754 = new C1804();
        int[] iArr = AbstractC8679.f21756;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C0328R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, C0328R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f6761 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f6761[i] = (int) (r1[i] * f);
            }
        }
        this.f6757 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m4497();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC8703(this));
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Rect m4489() {
        Rect rect = (Rect) f6745.acquire();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m4490(View view, int i) {
        C8702 c8702 = (C8702) view.getLayoutParams();
        int i2 = c8702.f22010;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            view.offsetLeftAndRight(i - i2);
            c8702.f22010 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m4491(View view, int i) {
        C8702 c8702 = (C8702) view.getLayoutParams();
        int i2 = c8702.f22011;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            view.offsetTopAndBottom(i - i2);
            c8702.f22011 = i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C8702 m4492(View view) {
        C8702 c8702 = (C8702) view.getLayoutParams();
        if (!c8702.f22001) {
            InterfaceC8704 interfaceC8704 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC8704 = (InterfaceC8704) superclass.getAnnotation(InterfaceC8704.class);
                if (interfaceC8704 != null) {
                    break;
                }
            }
            if (interfaceC8704 != null) {
                try {
                    AbstractC8705 abstractC8705 = (AbstractC8705) interfaceC8704.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC8705 abstractC87052 = c8702.f22002;
                    if (abstractC87052 != abstractC8705) {
                        if (abstractC87052 != null) {
                            abstractC87052.mo7585();
                        }
                        c8702.f22002 = abstractC8705;
                        c8702.f22001 = true;
                        if (abstractC8705 != null) {
                            abstractC8705.mo7586(c8702);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC8704.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c8702.f22001 = true;
        }
        return c8702;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m4493(int i, Rect rect, Rect rect2, C8702 c8702, int i2, int i3) {
        int i4 = c8702.f22000;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c8702.f21999;
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
        return (layoutParams instanceof C8702) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC8705 abstractC8705 = ((C8702) view.getLayoutParams()).f22002;
        if (abstractC8705 != null) {
            abstractC8705.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6757;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8702();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8702 ? new C8702((C8702) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C8702((ViewGroup.MarginLayoutParams) layoutParams) : new C8702(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m4496();
        return Collections.unmodifiableList(this.f6766);
    }

    public final C3058 getLastWindowInsets() {
        return this.f6749;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1804 c1804 = this.f6754;
        return c1804.f3100 | c1804.f3101;
    }

    public Drawable getStatusBarBackground() {
        return this.f6757;
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
        m4495(false);
        if (this.f6750) {
            if (this.f6751 == null) {
                this.f6751 = new ViewTreeObserverOnPreDrawListenerC8830(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f6751);
        }
        if (this.f6749 == null) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f6760 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4495(false);
        if (this.f6750 && this.f6751 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f6751);
        }
        View view = this.f6752;
        if (view != null) {
            mo1037(view, 0);
        }
        this.f6760 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6748 || this.f6757 == null) {
            return;
        }
        C3058 c3058 = this.f6749;
        int iM4625 = c3058 != null ? c3058.m4625() : 0;
        if (iM4625 > 0) {
            this.f6757.setBounds(0, 0, getWidth(), iM4625);
            this.f6757.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4495(true);
        }
        boolean zM4500 = m4500(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM4500;
        }
        m4495(true);
        return zM4500;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC8705 abstractC8705;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f6766;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC8705 = ((C8702) view.getLayoutParams()).f22002) == null || !abstractC8705.mo7552(this, view, layoutDirection))) {
                m4499(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
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
        AbstractC8705 abstractC8705;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        View view;
        int i13;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m4496();
        int childCount = coordinatorLayout.getChildCount();
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i14);
            C1130 c1130 = (C1130) coordinatorLayout.f6764.f1441;
            int i15 = c1130.f1339;
            for (int i16 = 0; i16 < i15; i16++) {
                ArrayList arrayList2 = (ArrayList) c1130.m1431(i16);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i14++;
        }
        if (z != coordinatorLayout.f6750) {
            boolean z3 = coordinatorLayout.f6760;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.f6751 == null) {
                        coordinatorLayout.f6751 = new ViewTreeObserverOnPreDrawListenerC8830(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f6751);
                }
                coordinatorLayout.f6750 = true;
            } else {
                if (z3 && coordinatorLayout.f6751 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f6751);
                }
                coordinatorLayout.f6750 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.f6749 != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f6766;
        int size3 = arrayList3.size();
        int i19 = 0;
        int iCombineMeasuredStates = 0;
        while (i19 < size3) {
            View view2 = (View) arrayList3.get(i19);
            int i20 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i13 = i19;
                i7 = paddingLeft;
                suggestedMinimumWidth = i20;
                z2 = false;
                i9 = paddingRight;
            } else {
                C8702 c8702 = (C8702) view2.getLayoutParams();
                int i21 = c8702.f21998;
                if (i21 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM4498 = coordinatorLayout.m4498(i21);
                    int i22 = c8702.f22000;
                    if (i22 == 0) {
                        i22 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z4) || (absoluteGravity == 5 && z4)) {
                        iMax = Math.max(0, (size - paddingRight) - iM4498);
                    } else if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                        iMax = Math.max(0, iM4498 - paddingLeft);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5 || view2.getFitsSystemWindows()) {
                        i6 = i4;
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        i6 = i4;
                        int iM4626 = coordinatorLayout.f6749.m4626() + coordinatorLayout.f6749.m4627();
                        int iM4628 = coordinatorLayout.f6749.m4628() + coordinatorLayout.f6749.m4625();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM4626, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM4628, mode2);
                    }
                    abstractC8705 = c8702.f22002;
                    if (abstractC8705 == null) {
                        z2 = false;
                        i7 = paddingLeft;
                        i8 = i20;
                        i9 = paddingRight;
                        i10 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i13 = i19;
                        int i25 = iMakeMeasureSpec2;
                        boolean zMo7551 = abstractC8705.mo7551(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i11 = i5;
                        i12 = i25;
                        if (zMo7551) {
                            coordinatorLayout = this;
                        }
                        int iMax2 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) c8702).leftMargin + ((ViewGroup.MarginLayoutParams) c8702).rightMargin);
                        int iMax3 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) c8702).topMargin + ((ViewGroup.MarginLayoutParams) c8702).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax2;
                        suggestedMinimumHeight = iMax3;
                    } else {
                        i7 = paddingLeft;
                        i8 = i20;
                        z2 = false;
                        i9 = paddingRight;
                        i10 = i3;
                        arrayList = arrayList3;
                        i11 = i5;
                        i12 = iMakeMeasureSpec2;
                        view = view2;
                        i13 = i19;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i11, i12, 0);
                    int iMax22 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) c8702).leftMargin + ((ViewGroup.MarginLayoutParams) c8702).rightMargin);
                    int iMax32 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) c8702).topMargin + ((ViewGroup.MarginLayoutParams) c8702).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax22;
                    suggestedMinimumHeight = iMax32;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    i6 = i4;
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    abstractC8705 = c8702.f22002;
                    if (abstractC8705 == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i11, i12, 0);
                    int iMax222 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) c8702).leftMargin + ((ViewGroup.MarginLayoutParams) c8702).rightMargin);
                    int iMax322 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) c8702).topMargin + ((ViewGroup.MarginLayoutParams) c8702).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax222;
                    suggestedMinimumHeight = iMax322;
                }
            }
            i19 = i13 + 1;
            paddingLeft = i7;
            paddingRight = i9;
            size3 = i6;
            arrayList3 = arrayList;
        }
        int i26 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i26), View.resolveSizeAndState(suggestedMinimumHeight, i2, i26 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C8702 c8702 = (C8702) childAt.getLayoutParams();
                if (c8702.m13792(0)) {
                    AbstractC8705 abstractC8705 = c8702.f22002;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC8705 abstractC8705;
        int childCount = getChildCount();
        boolean zMo7592 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C8702 c8702 = (C8702) childAt.getLayoutParams();
                if (c8702.m13792(0) && (abstractC8705 = c8702.f22002) != null) {
                    zMo7592 |= abstractC8705.mo7592(view);
                }
            }
        }
        return zMo7592;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1036(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1033(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1031(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f7044);
        SparseArray sparseArray = savedState.f6767;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC8705 abstractC8705 = m4492(childAt).f22002;
            if (id != -1 && abstractC8705 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC8705.mo7548(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo7547;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC8705 abstractC8705 = ((C8702) childAt.getLayoutParams()).f22002;
            if (id != -1 && abstractC8705 != null && (parcelableMo7547 = abstractC8705.mo7547(childAt)) != null) {
                sparseArray.append(id, parcelableMo7547);
            }
        }
        savedState.f6767 = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1032(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo1037(view, 0);
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
        boolean zM4500;
        boolean zMo7567;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6753 == null) {
            zM4500 = m4500(motionEvent, 1);
            if (!zM4500) {
                zMo7567 = false;
            }
            motionEventObtain = null;
            if (this.f6753 != null) {
                zMo7567 |= super.onTouchEvent(motionEvent);
            } else if (zM4500) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo7567;
            }
            m4495(false);
            return zMo7567;
        }
        zM4500 = false;
        AbstractC8705 abstractC8705 = ((C8702) this.f6753.getLayoutParams()).f22002;
        if (abstractC8705 != null) {
            zMo7567 = abstractC8705.mo7567(this.f6753, motionEvent);
        }
        motionEventObtain = null;
        if (this.f6753 != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        m4495(false);
        return zMo7567;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC8705 abstractC8705 = ((C8702) view.getLayoutParams()).f22002;
        if (abstractC8705 == null || !abstractC8705.mo7559(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f6763) {
            return;
        }
        m4495(false);
        this.f6763 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m4497();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6756 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f6757;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f6757 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f6757.setState(getDrawableState());
                }
                Drawable drawable3 = this.f6757;
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f6757.setVisible(getVisibility() == 0, false);
                this.f6757.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC3103.f6939;
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
        Drawable drawable = this.f6757;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f6757.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6757;
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo1031(View view, View view2, int i, int i2) {
        C1804 c1804 = this.f6754;
        if (i2 == 1) {
            c1804.f3100 = i;
        } else {
            c1804.f3101 = i;
        }
        this.f6752 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C8702) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo1032(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C8702 c8702 = (C8702) childAt.getLayoutParams();
                AbstractC8705 abstractC8705 = c8702.f22002;
                if (abstractC8705 != null) {
                    boolean zMo7549 = abstractC8705.mo7549(childAt, i, i2);
                    z |= zMo7549;
                    if (i2 == 0) {
                        c8702.f22004 = zMo7549;
                    } else if (i2 == 1) {
                        c8702.f22003 = zMo7549;
                    }
                } else if (i2 == 0) {
                    c8702.f22004 = false;
                } else if (i2 == 1) {
                    c8702.f22003 = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1033(View view, int i, int i2, int i3, int i4, int i5) {
        mo1034(view, i, i2, i3, i4, 0, this.f6762);
    }

    @Override // androidx.core.view.InterfaceC3039
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1034(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC8705 abstractC8705;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C8702 c8702 = (C8702) childAt.getLayoutParams();
                if (c8702.m13792(i5) && (abstractC8705 = c8702.f22002) != null) {
                    int[] iArr2 = this.f6758;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC8705.mo7553(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m4502(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4494(C8702 c8702, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8702).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c8702).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c8702).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c8702).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m4495(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC8705 abstractC8705 = ((C8702) childAt.getLayoutParams()).f22002;
            if (abstractC8705 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC8705.mo7566(this, childAt, motionEventObtain);
                } else {
                    abstractC8705.mo7567(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C8702) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f6753 = null;
        this.f6763 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4496() {
        View viewFindViewById;
        ArrayList arrayList = this.f6766;
        arrayList.clear();
        C1171 c1171 = this.f6764;
        C1130 c1130 = (C1130) c1171.f1441;
        C3018 c3018 = (C3018) c1171.f1440;
        C1130 c11302 = (C1130) c1171.f1441;
        int i = c1130.f1339;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1130.m1431(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                c3018.mo4549(arrayList2);
            }
        }
        c1130.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C8702 c8702M4492 = m4492(childAt);
            int i4 = c8702M4492.f21997;
            if (i4 == -1) {
                c8702M4492.f22009 = null;
                c8702M4492.f22008 = null;
            } else {
                View view = c8702M4492.f22008;
                if (view == null || view.getId() != i4) {
                    viewFindViewById = findViewById(i4);
                    c8702M4492.f22008 = viewFindViewById;
                    if (viewFindViewById == null) {
                        if (viewFindViewById != this) {
                            for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                                if (parent != childAt) {
                                    if (parent instanceof View) {
                                        viewFindViewById = parent;
                                    }
                                } else if (!isInEditMode()) {
                                    C6755.m11870("Anchor must not be a descendant of the anchored view");
                                    return;
                                } else {
                                    c8702M4492.f22009 = null;
                                    c8702M4492.f22008 = null;
                                }
                            }
                            c8702M4492.f22009 = viewFindViewById;
                        } else if (!isInEditMode()) {
                            C6755.m11870("View can not be anchored to the the parent CoordinatorLayout");
                            return;
                        } else {
                            c8702M4492.f22009 = null;
                            c8702M4492.f22008 = null;
                        }
                    } else if (!isInEditMode()) {
                        C1123.m1407("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                        return;
                    } else {
                        c8702M4492.f22009 = null;
                        c8702M4492.f22008 = null;
                    }
                } else {
                    View view2 = c8702M4492.f22008;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            c8702M4492.f22009 = null;
                            c8702M4492.f22008 = null;
                            viewFindViewById = findViewById(i4);
                            c8702M4492.f22008 = viewFindViewById;
                            if (viewFindViewById == null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    c8702M4492.f22009 = view2;
                }
            }
            if (!c11302.containsKey(childAt)) {
                c11302.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != c8702M4492.f22009) {
                        WeakHashMap weakHashMap = AbstractC3103.f6939;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C8702) childAt2.getLayoutParams()).f22007, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(c8702M4492.f22006, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            AbstractC8705 abstractC8705 = c8702M4492.f22002;
                            if (abstractC8705 != null) {
                                abstractC8705.mo7557(childAt);
                            }
                        } else {
                            if (!c11302.containsKey(childAt2) && !c11302.containsKey(childAt2)) {
                                c11302.put(childAt2, null);
                            }
                            if (!c11302.containsKey(childAt2) || !c11302.containsKey(childAt)) {
                                C6755.m11869("All nodes must be present in the graph before being added as an edge");
                                return;
                            }
                            ArrayList arrayList3 = (ArrayList) c11302.get(childAt2);
                            if (arrayList3 == null) {
                                arrayList3 = (ArrayList) c3018.acquire();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                c11302.put(childAt2, arrayList3);
                            }
                            arrayList3.add(childAt);
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) c1171.f1439;
        arrayList4.clear();
        HashSet hashSet = (HashSet) c1171.f1438;
        hashSet.clear();
        int i6 = c11302.f1339;
        for (int i7 = 0; i7 < i6; i7++) {
            c1171.m1539(c11302.m1422(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m4497() {
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        if (!getFitsSystemWindows()) {
            AbstractC3026.m4564(this, null);
            return;
        }
        if (this.f6755 == null) {
            this.f6755 = new C6686(this, 24);
        }
        AbstractC3026.m4564(this, this.f6755);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m4498(int i) {
        int[] iArr = this.f6761;
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
    public final void m4499(View view, int i) {
        Rect rectM4489;
        Rect rectM44892;
        C8702 c8702 = (C8702) view.getLayoutParams();
        View view2 = c8702.f22008;
        if (view2 == null && c8702.f21997 != -1) {
            C6755.m11870("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        C3017 c3017 = f6745;
        if (view2 != null) {
            rectM4489 = m4489();
            rectM44892 = m4489();
            try {
                m4503(rectM4489, view2);
                C8702 c87022 = (C8702) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m4493(i, rectM4489, rectM44892, c87022, measuredWidth, measuredHeight);
                m4494(c87022, rectM44892, measuredWidth, measuredHeight);
                view.layout(rectM44892.left, rectM44892.top, rectM44892.right, rectM44892.bottom);
                return;
            } finally {
                rectM4489.setEmpty();
                c3017.mo4549(rectM4489);
                rectM44892.setEmpty();
                c3017.mo4549(rectM44892);
            }
        }
        int i2 = c8702.f21998;
        if (i2 < 0) {
            C8702 c87023 = (C8702) view.getLayoutParams();
            rectM4489 = m4489();
            rectM4489.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c87023).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c87023).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c87023).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c87023).bottomMargin);
            if (this.f6749 != null) {
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM4489.left = this.f6749.m4627() + rectM4489.left;
                    rectM4489.top = this.f6749.m4625() + rectM4489.top;
                    rectM4489.right -= this.f6749.m4626();
                    rectM4489.bottom -= this.f6749.m4628();
                }
            }
            rectM44892 = m4489();
            int i3 = c87023.f22000;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM4489, rectM44892, i);
            view.layout(rectM44892.left, rectM44892.top, rectM44892.right, rectM44892.bottom);
            return;
        }
        C8702 c87024 = (C8702) view.getLayoutParams();
        int i4 = c87024.f22000;
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
        int iM4498 = m4498(i2) - measuredWidth2;
        if (i5 == 1) {
            iM4498 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM4498 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c87024).leftMargin, Math.min(iM4498, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c87024).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c87024).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c87024).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m4500(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f6765;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C1272 c1272 = f6743;
        if (c1272 != null) {
            Collections.sort(arrayList, c1272);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo7566 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC8705 abstractC8705 = ((C8702) view.getLayoutParams()).f22002;
            if (zMo7566 && actionMasked != 0) {
                if (abstractC8705 != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC8705.mo7566(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC8705.mo7567(view, motionEventObtain);
                    }
                }
            } else if (!zMo7566 && abstractC8705 != null) {
                if (i == 0) {
                    zMo7566 = abstractC8705.mo7566(this, view, motionEvent);
                } else if (i == 1) {
                    zMo7566 = abstractC8705.mo7567(view, motionEvent);
                }
                if (zMo7566) {
                    this.f6753 = view;
                }
            }
        }
        arrayList.clear();
        return zMo7566;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m4501(View view, int i, int i2) {
        C3017 c3017 = f6745;
        Rect rectM4489 = m4489();
        m4503(rectM4489, view);
        try {
            return rectM4489.contains(i, i2);
        } finally {
            rectM4489.setEmpty();
            c3017.mo4549(rectM4489);
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
    */
    public final void m4502(int i) {
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
        C8702 c8702;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        View view;
        AbstractC8705 abstractC8705;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f6766;
        int size = arrayList3.size();
        Rect rectM4489 = m4489();
        Rect rectM44892 = m4489();
        Rect rectM44893 = m4489();
        int i14 = 0;
        while (true) {
            C3017 c3017 = f6745;
            if (i14 >= size) {
                Rect rect3 = rectM44893;
                rectM4489.setEmpty();
                c3017.mo4549(rectM4489);
                rectM44892.setEmpty();
                c3017.mo4549(rectM44892);
                rect3.setEmpty();
                c3017.mo4549(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i14);
            C8702 c87022 = (C8702) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size;
                rect = rectM44893;
                i2 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (c87022.f22009 == ((View) arrayList3.get(i15))) {
                        C8702 c87023 = (C8702) view2.getLayoutParams();
                        if (c87023.f22008 != null) {
                            Rect rectM44894 = m4489();
                            Rect rectM44895 = m4489();
                            C8702 c87024 = c87022;
                            Rect rectM44896 = m4489();
                            m4503(rectM44894, c87023.f22008);
                            m4504(view2, rectM44895, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            c8702 = c87024;
                            i11 = i15;
                            layoutDirection = layoutDirection;
                            i13 = i14;
                            view = view3;
                            m4493(layoutDirection, rectM44894, rectM44896, c87023, measuredWidth, measuredHeight);
                            i12 = size;
                            rect2 = rectM44893;
                            boolean z3 = (rectM44896.left == rectM44895.left && rectM44896.top == rectM44895.top) ? false : true;
                            m4494(c87023, rectM44896, measuredWidth, measuredHeight);
                            int i16 = rectM44896.left - rectM44895.left;
                            int i17 = rectM44896.top - rectM44895.top;
                            if (i16 != 0) {
                                WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap weakHashMap3 = AbstractC3103.f6939;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z3 && (abstractC8705 = c87023.f22002) != null) {
                                abstractC8705.mo7556(this, view, c87023.f22008);
                            }
                            rectM44894.setEmpty();
                            c3017.mo4549(rectM44894);
                            rectM44895.setEmpty();
                            c3017.mo4549(rectM44895);
                            rectM44896.setEmpty();
                            c3017.mo4549(rectM44896);
                        } else {
                            arrayList2 = arrayList3;
                            c8702 = c87022;
                            i11 = i15;
                            i12 = size;
                            rect2 = rectM44893;
                            i13 = i14;
                            view = view2;
                        }
                    }
                    i15 = i11 + 1;
                    c87022 = c8702;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i12;
                    i14 = i13;
                    rectM44893 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                C8702 c87025 = c87022;
                int i18 = size;
                Rect rect4 = rectM44893;
                i2 = i14;
                View view4 = view2;
                m4504(view4, rectM44892, true);
                if (c87025.f22007 != 0 && !rectM44892.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c87025.f22007, layoutDirection);
                    int i19 = absoluteGravity & 112;
                    if (i19 == 48) {
                        rectM4489.top = Math.max(rectM4489.top, rectM44892.bottom);
                    } else if (i19 == 80) {
                        rectM4489.bottom = Math.max(rectM4489.bottom, getHeight() - rectM44892.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        rectM4489.left = Math.max(rectM4489.left, rectM44892.right);
                    } else if (i20 == 5) {
                        rectM4489.right = Math.max(rectM4489.right, getWidth() - rectM44892.left);
                    }
                }
                if (c87025.f22006 == 0 || view4.getVisibility() != 0) {
                    if (i != 2) {
                        rect = rect4;
                        rect.set(((C8702) view4.getLayoutParams()).f22005);
                        if (rect.equals(rectM44892)) {
                            arrayList = arrayList4;
                            i4 = i18;
                        } else {
                            ((C8702) view4.getLayoutParams()).f22005.set(rectM44892);
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
                            AbstractC8705 abstractC87052 = ((C8702) view5.getLayoutParams()).f22002;
                            if (abstractC87052 != null) {
                                abstractC87052.mo7557(view5);
                            }
                            i3++;
                            arrayList4 = arrayList;
                        }
                    }
                } else {
                    WeakHashMap weakHashMap4 = AbstractC3103.f6939;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C8702 c87026 = (C8702) view4.getLayoutParams();
                        AbstractC8705 abstractC87053 = c87026.f22002;
                        Rect rectM44897 = m4489();
                        Rect rectM44898 = m4489();
                        rectM44898.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC87053 == null || !abstractC87053.mo7706(view4)) {
                            rectM44897.set(rectM44898);
                        } else if (!rectM44898.contains(rectM44897)) {
                            C6385.m11430("Rect should be within the child's bounds. Rect:", rectM44897.toShortString(), " | Bounds:", rectM44898.toShortString());
                            return;
                        }
                        rectM44898.setEmpty();
                        c3017.mo4549(rectM44898);
                        if (rectM44897.isEmpty()) {
                            rectM44897.setEmpty();
                            c3017.mo4549(rectM44897);
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
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c87026.f22006, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (rectM44897.top - ((ViewGroup.MarginLayoutParams) c87026).topMargin) - c87026.f22011) >= (i10 = rectM4489.top)) {
                                z = false;
                            } else {
                                m4491(view4, i10 - i9);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM44897.bottom) - ((ViewGroup.MarginLayoutParams) c87026).bottomMargin) + c87026.f22011) < (i8 = rectM4489.bottom)) {
                                m4491(view4, height - i8);
                                z = true;
                            }
                            if (!z) {
                                m4491(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (rectM44897.left - ((ViewGroup.MarginLayoutParams) c87026).leftMargin) - c87026.f22010) >= (i7 = rectM4489.left)) {
                                z2 = false;
                            } else {
                                m4490(view4, i7 - i6);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM44897.right) - ((ViewGroup.MarginLayoutParams) c87026).rightMargin) + c87026.f22010) < (i5 = rectM4489.right)) {
                                m4490(view4, width - i5);
                                z2 = true;
                            }
                            if (!z2) {
                                m4490(view4, 0);
                            }
                            rectM44897.setEmpty();
                            c3017.mo4549(rectM44897);
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
            rectM44893 = rect;
            arrayList3 = arrayList;
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1036(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC8705 abstractC8705;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C8702 c8702 = (C8702) childAt.getLayoutParams();
                if (c8702.m13792(i3) && (abstractC8705 = c8702.f22002) != null) {
                    int[] iArr2 = this.f6758;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC8705.mo7554(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m4502(1);
        }
    }

    @Override // androidx.core.view.InterfaceC3084
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1037(View view, int i) {
        C1804 c1804 = this.f6754;
        if (i == 1) {
            c1804.f3100 = 0;
        } else {
            c1804.f3101 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C8702 c8702 = (C8702) childAt.getLayoutParams();
            if (c8702.m13792(i)) {
                AbstractC8705 abstractC8705 = c8702.f22002;
                if (abstractC8705 != null) {
                    abstractC8705.mo7550(childAt, view, i);
                }
                if (i == 0) {
                    c8702.f22004 = false;
                } else if (i == 1) {
                    c8702.f22003 = false;
                }
            }
        }
        this.f6752 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4503(Rect rect, View view) {
        ThreadLocal threadLocal = AbstractC8701.f21996;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC8701.f21996;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC8701.m13791(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC8701.f21995;
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
    public final void m4504(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m4503(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final ArrayList m4505(View view) {
        C1130 c1130 = (C1130) this.f6764.f1441;
        int i = c1130.f1339;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1130.m1431(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1130.m1422(i2));
            }
        }
        ArrayList arrayList3 = this.f6759;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8702(getContext(), attributeSet);
    }
}
