package p001;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: ۟.kc */
/* JADX INFO: loaded from: classes.dex */
public class C0287kc extends ViewGroup {

    /* JADX INFO: renamed from: ۥۢۨ, reason: contains not printable characters */
    public static final int[] f1636 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: ۥۣ */
    public static final a f919 = new a();

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final b f1637 = new b();

    /* JADX INFO: renamed from: ۥ */
    public int f920;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ArrayList<e> f921;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final e f1638;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final Rect f1639;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public AbstractC0351p7 f1640;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public int f1641;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f1642;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public Scroller f1643;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public boolean f1644;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public i f1645;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public int f1646;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public Drawable f1647;

    /* JADX INFO: renamed from: ۥ۠ */
    public int f922;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public int f1648;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public float f1649;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public float f1650;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public int f1651;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public boolean f1652;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public boolean f1653;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public boolean f1654;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public int f1655;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public boolean f1656;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public boolean f1657;

    /* JADX INFO: renamed from: ۥۡ */
    public int f923;

    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public int f1658;

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public int f1659;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public float f1660;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public float f1661;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public float f1662;

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public float f1663;

    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public int f1664;

    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public VelocityTracker f1665;

    /* JADX INFO: renamed from: ۥۡۧ, reason: contains not printable characters */
    public int f1666;

    /* JADX INFO: renamed from: ۥۡۨ, reason: contains not printable characters */
    public int f1667;

    /* JADX INFO: renamed from: ۥۢ */
    public int f924;

    /* JADX INFO: renamed from: ۥۢ۟, reason: contains not printable characters */
    public int f1668;

    /* JADX INFO: renamed from: ۥۢ۠, reason: contains not printable characters */
    public EdgeEffect f1669;

    /* JADX INFO: renamed from: ۥۢۡ, reason: contains not printable characters */
    public EdgeEffect f1670;

    /* JADX INFO: renamed from: ۥۢۢ, reason: contains not printable characters */
    public boolean f1671;

    /* JADX INFO: renamed from: ۥۣۢ, reason: contains not printable characters */
    public boolean f1672;

    /* JADX INFO: renamed from: ۥۢۤ, reason: contains not printable characters */
    public int f1673;

    /* JADX INFO: renamed from: ۥۢۥ, reason: contains not printable characters */
    public h f1674;

    /* JADX INFO: renamed from: ۥۢۦ, reason: contains not printable characters */
    public final c f1675;

    /* JADX INFO: renamed from: ۥۢۧ, reason: contains not printable characters */
    public int f1676;

    /* JADX INFO: renamed from: ۟.kc$a */
    public static class a implements Comparator<e> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f927 - eVar2.f927;
        }
    }

    /* JADX INFO: renamed from: ۟.kc$b */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: ۟.kc$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0287kc.this.setScrollState(0);
            C0287kc.this.m1130();
        }
    }

    /* JADX INFO: renamed from: ۟.kc$d */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    /* JADX INFO: renamed from: ۟.kc$e */
    public static class e {

        /* JADX INFO: renamed from: ۥ */
        public Object f926;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f927;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f1677;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public float f1678;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public float f1679;
    }

    /* JADX INFO: renamed from: ۟.kc$f */
    public static class f extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: ۥ */
        public boolean f928;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f929;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f1680;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public boolean f1681;

        public f() {
            super(-1, -1);
            this.f1680 = 0.0f;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1680 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0287kc.f1636);
            this.f929 = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۟.kc$g */
    public class g extends AccessibilityDelegateCompat {
        public g() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0351p7 abstractC0351p7;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0287kc.class.getName());
            AbstractC0351p7 abstractC0351p72 = C0287kc.this.f1640;
            accessibilityEvent.setScrollable(abstractC0351p72 != null && abstractC0351p72.mo918() > 1);
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0351p7 = C0287kc.this.f1640) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0351p7.mo918());
            accessibilityEvent.setFromIndex(C0287kc.this.f1641);
            accessibilityEvent.setToIndex(C0287kc.this.f1641);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(C0287kc.class.getName());
            AbstractC0351p7 abstractC0351p7 = C0287kc.this.f1640;
            accessibilityNodeInfoCompat.setScrollable(abstractC0351p7 != null && abstractC0351p7.mo918() > 1);
            if (C0287kc.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (C0287kc.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            C0287kc c0287kc;
            int i2;
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C0287kc.this.canScrollHorizontally(-1)) {
                    return false;
                }
                c0287kc = C0287kc.this;
                i2 = c0287kc.f1641 - 1;
            } else {
                if (!C0287kc.this.canScrollHorizontally(1)) {
                    return false;
                }
                c0287kc = C0287kc.this;
                i2 = c0287kc.f1641 + 1;
            }
            c0287kc.setCurrentItem(i2);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۟.kc$h */
    public interface h {
        /* JADX INFO: renamed from: ۥ */
        void mo890();

        /* JADX INFO: renamed from: ۥ۟ */
        void mo891();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void mo1136(int i);
    }

    /* JADX INFO: renamed from: ۟.kc$i */
    public class i extends DataSetObserver {
        public i() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C0287kc.this.m1121();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C0287kc.this.m1121();
        }
    }

    /* JADX INFO: renamed from: ۟.kc$j */
    public static class j extends AbstractC0148b {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f1682;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public Parcelable f1683;

        /* JADX INFO: renamed from: ۟.kc$j$a */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new j[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
            this.f1682 = parcel.readInt();
            this.f1683 = parcel.readParcelable(classLoader);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            StringBuilder sbM1039 = C0167c4.m1039("FragmentPager.SavedState{");
            sbM1039.append(Integer.toHexString(System.identityHashCode(this)));
            sbM1039.append(" position=");
            sbM1039.append(this.f1682);
            sbM1039.append("}");
            return sbM1039.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p001.AbstractC0148b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f694, i);
            parcel.writeInt(this.f1682);
            parcel.writeParcelable(this.f1683, i);
        }
    }

    /* JADX INFO: renamed from: ۟.kc$k */
    public static class k implements h {
        @Override // p001.C0287kc.h
        /* JADX INFO: renamed from: ۥ */
        public final void mo890() {
        }

        @Override // p001.C0287kc.h
        /* JADX INFO: renamed from: ۥ۟ */
        public final void mo891() {
        }
    }

    public C0287kc(Context context) {
        super(context);
        this.f921 = new ArrayList<>();
        this.f1638 = new e();
        this.f1639 = new Rect();
        this.f1642 = -1;
        this.f1649 = -3.4028235E38f;
        this.f1650 = Float.MAX_VALUE;
        this.f1655 = 1;
        this.f1664 = -1;
        this.f1671 = true;
        this.f1675 = new c();
        this.f1676 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f1643 = new Scroller(context2, f1637);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.f1659 = viewConfiguration.getScaledPagingTouchSlop();
        this.f1666 = (int) (400.0f * f2);
        this.f1667 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1669 = new EdgeEffect(context2);
        this.f1670 = new EdgeEffect(context2);
        this.f924 = (int) (25.0f * f2);
        this.f1668 = (int) (2.0f * f2);
        this.f923 = (int) (f2 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new g());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new C0301lc(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1653 != z) {
            this.f1653 = z;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m1119(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m1119(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        e eVarM1123;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (eVarM1123 = m1123(childAt)) != null && eVarM1123.f927 == this.f1641) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e eVarM1123;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (eVarM1123 = m1123(childAt)) != null && eVarM1123.f927 == this.f1641) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new f();
        }
        f fVar = (f) layoutParams;
        boolean z = fVar.f928 | (view.getClass().getAnnotation(d.class) != null);
        fVar.f928 = z;
        if (!this.f1652) {
            super.addView(view, i2, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f1681 = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.f1640 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1649)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f1650));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f1644 = true;
        if (this.f1643.isFinished() || !this.f1643.computeScrollOffset()) {
            m1120(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1643.getCurrX();
        int currY = this.f1643.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m889(currX)) {
                this.f1643.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM888;
        int i2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            zM888 = false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            zM888 = m888(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zM888 = m888(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    zM888 = m1128();
                } else {
                    i2 = 66;
                    zM888 = m888(i2);
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i3 = this.f1641;
                if (i3 > 0) {
                    this.f1654 = false;
                    m1135(i3 - 1, 0, true, false);
                    zM888 = true;
                }
            } else {
                i2 = 17;
                zM888 = m888(i2);
            }
        }
        return zM888;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e eVarM1123;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (eVarM1123 = m1123(childAt)) != null && eVarM1123.f927 == this.f1641 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC0351p7 abstractC0351p7;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0351p7 = this.f1640) != null && abstractC0351p7.mo918() > 1)) {
            if (!this.f1669.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f1649 * width);
                this.f1669.setSize(height, width);
                zDraw = false | this.f1669.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f1670.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f1650 + 1.0f)) * width2);
                this.f1670.setSize(height2, width2);
                zDraw |= this.f1670.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f1669.finish();
            this.f1670.finish();
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1647;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f();
    }

    public AbstractC0351p7 getAdapter() {
        return this.f1640;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f1641;
    }

    public int getOffscreenPageLimit() {
        return this.f1655;
    }

    public int getPageMargin() {
        return this.f1646;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1671 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1675);
        Scroller scroller = this.f1643;
        if (scroller != null && !scroller.isFinished()) {
            this.f1643.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f1646 <= 0 || this.f1647 == null || this.f921.size() <= 0 || this.f1640 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f1646 / width;
        int i3 = 0;
        e eVar = this.f921.get(0);
        float f5 = eVar.f1679;
        int size = this.f921.size();
        int i4 = eVar.f927;
        int i5 = this.f921.get(size - 1).f927;
        while (i4 < i5) {
            while (true) {
                i2 = eVar.f927;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                eVar = this.f921.get(i3);
            }
            if (i4 == i2) {
                float f6 = eVar.f1679;
                float f7 = eVar.f1678;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                this.f1640.getClass();
                f2 = (f5 + 1.0f) * width;
                f5 = 1.0f + f4 + f5;
            }
            if (this.f1646 + f2 > scrollX) {
                f3 = f4;
                this.f1647.setBounds(Math.round(f2), this.f922, Math.round(this.f1646 + f2), this.f1648);
                this.f1647.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m1133();
            return false;
        }
        if (action != 0) {
            if (this.f1656) {
                return true;
            }
            if (this.f1657) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1662 = x;
            this.f1660 = x;
            float y = motionEvent.getY();
            this.f1663 = y;
            this.f1661 = y;
            this.f1664 = motionEvent.getPointerId(0);
            this.f1657 = false;
            this.f1644 = true;
            this.f1643.computeScrollOffset();
            if (this.f1676 != 2 || Math.abs(this.f1643.getFinalX() - this.f1643.getCurrX()) <= this.f1668) {
                m1120(false);
                this.f1656 = false;
            } else {
                this.f1643.abortAnimation();
                this.f1654 = false;
                m1130();
                this.f1656 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.f1664;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.f1660;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f1663);
                if (f2 != 0.0f) {
                    float f3 = this.f1660;
                    if (!((f3 < ((float) this.f1658) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.f1658)) && f2 < 0.0f)) && m1119(this, false, (int) f2, (int) x2, (int) y2)) {
                        this.f1660 = x2;
                        this.f1661 = y2;
                        this.f1657 = true;
                        return false;
                    }
                }
                float f4 = this.f1659;
                if (fAbs > f4 && fAbs * 0.5f > fAbs2) {
                    this.f1656 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f5 = this.f1662;
                    float f6 = this.f1659;
                    this.f1660 = f2 > 0.0f ? f5 + f6 : f5 - f6;
                    this.f1661 = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f4) {
                    this.f1657 = true;
                }
                if (this.f1656 && m1129(x2)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            m1127(motionEvent);
        }
        if (this.f1665 == null) {
            this.f1665 = VelocityTracker.obtain();
        }
        this.f1665.addMovement(motionEvent);
        return this.f1656;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        e eVarM1123;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f928) {
                    int i10 = fVar.f929;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 == 16) {
                            if (i12 == 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i132 = paddingLeft + scrollX;
                        childAt.layout(i132, paddingTop, childAt.getMeasuredWidth() + i132, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i12 == 16) {
                    }
                    int i142 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i142;
                    int i1322 = paddingLeft + scrollX;
                    childAt.layout(i1322, paddingTop, childAt.getMeasuredWidth() + i1322, childAt.getMeasuredHeight() + paddingTop);
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i16 = (i6 - paddingLeft) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.f928 && (eVarM1123 = m1123(childAt2)) != null) {
                    float f2 = i16;
                    int i18 = ((int) (eVarM1123.f1679 * f2)) + paddingLeft;
                    if (fVar2.f1681) {
                        fVar2.f1681 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * fVar2.f1680), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i18, paddingTop, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f922 = paddingTop;
        this.f1648 = i7 - paddingBottom;
        this.f1673 = i8;
        if (this.f1671) {
            z2 = false;
            m1134(this.f1641, 0, false, false);
        } else {
            z2 = false;
        }
        this.f1671 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        f fVar;
        f fVar2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.f1658 = Math.min(measuredWidth / 10, this.f923);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f928) {
                int i7 = fVar2.f929;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f1651 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1652 = true;
        m1130();
        this.f1652 = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f928)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f1680), 1073741824), this.f1651);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        e eVarM1123;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (eVarM1123 = m1123(childAt)) != null && eVarM1123.f927 == this.f1641 && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f694);
        AbstractC0351p7 abstractC0351p7 = this.f1640;
        int i2 = jVar.f1682;
        if (abstractC0351p7 != null) {
            m1135(i2, 0, false, true);
        } else {
            this.f1642 = i2;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f1682 = this.f1641;
        AbstractC0351p7 abstractC0351p7 = this.f1640;
        if (abstractC0351p7 != null) {
            abstractC0351p7.getClass();
            jVar.f1683 = null;
        }
        return jVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f1646;
            m1132(i2, i4, i6, i6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0351p7 abstractC0351p7;
        int pointerId;
        boolean zM1133 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC0351p7 = this.f1640) == null || abstractC0351p7.mo918() == 0) {
            return false;
        }
        if (this.f1665 == null) {
            this.f1665 = VelocityTracker.obtain();
        }
        this.f1665.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f1656) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1664);
                        if (iFindPointerIndex != -1) {
                            float x = motionEvent.getX(iFindPointerIndex);
                            float fAbs = Math.abs(x - this.f1660);
                            float y = motionEvent.getY(iFindPointerIndex);
                            float fAbs2 = Math.abs(y - this.f1661);
                            if (fAbs > this.f1659 && fAbs > fAbs2) {
                                this.f1656 = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f2 = this.f1662;
                                this.f1660 = x - f2 > 0.0f ? f2 + this.f1659 : f2 - this.f1659;
                                this.f1661 = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        zM1133 = m1133();
                    }
                    if (this.f1656) {
                        zM1133 = false | m1129(motionEvent.getX(motionEvent.findPointerIndex(this.f1664)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f1660 = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m1127(motionEvent);
                        this.f1660 = motionEvent.getX(motionEvent.findPointerIndex(this.f1664));
                    }
                } else if (this.f1656) {
                    m1134(this.f1641, 0, true, false);
                    zM1133 = m1133();
                }
            } else if (this.f1656) {
                VelocityTracker velocityTracker = this.f1665;
                velocityTracker.computeCurrentVelocity(1000, this.f1667);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f1664);
                this.f1654 = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                e eVarM1124 = m1124();
                float f3 = clientWidth;
                int iMax = eVarM1124.f927;
                float f4 = ((scrollX / f3) - eVarM1124.f1679) / (eVarM1124.f1678 + (this.f1646 / f3));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f1664)) - this.f1662)) <= this.f924 || Math.abs(xVelocity) <= this.f1666) {
                    iMax += (int) (f4 + (iMax >= this.f1641 ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.f921.size() > 0) {
                    iMax = Math.max(this.f921.get(0).f927, Math.min(iMax, this.f921.get(r1.size() - 1).f927));
                }
                m1135(iMax, xVelocity, true, true);
                zM1133 = m1133();
            }
            if (zM1133) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            return true;
        }
        this.f1643.abortAnimation();
        this.f1654 = false;
        m1130();
        float x2 = motionEvent.getX();
        this.f1662 = x2;
        this.f1660 = x2;
        float y2 = motionEvent.getY();
        this.f1663 = y2;
        this.f1661 = y2;
        pointerId = motionEvent.getPointerId(0);
        this.f1664 = pointerId;
        if (zM1133) {
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f1652) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAdapter(AbstractC0351p7 abstractC0351p7) {
        AbstractC0351p7 abstractC0351p72 = this.f1640;
        if (abstractC0351p72 != null) {
            synchronized (abstractC0351p72) {
            }
            this.f1640.getClass();
            for (int i2 = 0; i2 < this.f921.size(); i2++) {
                e eVar = this.f921.get(i2);
                AbstractC0351p7 abstractC0351p73 = this.f1640;
                int i3 = eVar.f927;
                abstractC0351p73.mo917(this, eVar.f926);
            }
            this.f1640.getClass();
            this.f921.clear();
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (!((f) getChildAt(i4).getLayoutParams()).f928) {
                    removeViewAt(i4);
                    i4--;
                }
                i4++;
            }
            this.f1641 = 0;
            scrollTo(0, 0);
        }
        this.f1640 = abstractC0351p7;
        this.f920 = 0;
        if (abstractC0351p7 != null) {
            if (this.f1645 == null) {
                this.f1645 = new i();
            }
            synchronized (this.f1640) {
            }
            this.f1654 = false;
            boolean z = this.f1671;
            this.f1671 = true;
            this.f920 = this.f1640.mo918();
            if (this.f1642 >= 0) {
                this.f1640.getClass();
                m1135(this.f1642, 0, false, true);
                this.f1642 = -1;
            } else if (z) {
                requestLayout();
            } else {
                m1130();
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.f1654 = false;
        m1135(i2, 0, !this.f1671, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f1655) {
            this.f1655 = i2;
            m1130();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f1674 = hVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f1646;
        this.f1646 = i2;
        int width = getWidth();
        m1132(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1647 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.f1676 == i2) {
            return;
        }
        this.f1676 = i2;
        h hVar = this.f1674;
        if (hVar != null) {
            hVar.mo890();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1647;
    }

    /* JADX INFO: renamed from: ۥ */
    public final e m887(int i2, int i3) {
        e eVar = new e();
        eVar.f927 = i2;
        eVar.f926 = this.f1640.mo1187(this, i2);
        this.f1640.getClass();
        eVar.f1678 = 1.0f;
        if (i3 < 0 || i3 >= this.f921.size()) {
            this.f921.add(eVar);
        } else {
            this.f921.add(i3, eVar);
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[PHI: r0
  0x00c2: PHI (r0v5 int) = (r0v3 int), (r0v10 int) binds: [B:45:0x00c0, B:28:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m888(int i2) {
        int i3;
        boolean zRequestFocus;
        boolean z;
        View viewFindFocus = findFocus();
        boolean zM1128 = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sbM1039 = C0167c4.m1039("arrowScroll tried to find focus based on non-child current focused view ");
                sbM1039.append(sb.toString());
                Log.e("ViewPager", sbM1039.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i2 == 17) {
                int i4 = m1122(this.f1639, viewFindNextFocus).left;
                int i5 = m1122(this.f1639, viewFindFocus).left;
                if (viewFindFocus != null && i4 >= i5) {
                    i3 = this.f1641;
                    if (i3 > 0) {
                    }
                }
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || m1122(this.f1639, viewFindNextFocus).left > m1122(this.f1639, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m1128();
            }
            zM1128 = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            i3 = this.f1641;
            if (i3 > 0) {
                this.f1654 = false;
                m1135(i3 - 1, 0, true, false);
                zM1128 = true;
            }
        } else if (i2 == 66 || i2 == 2) {
            zM1128 = m1128();
        }
        if (zM1128) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zM1128;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m1120(boolean z) {
        boolean z2 = this.f1676 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1643.isFinished()) {
                this.f1643.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1643.getCurrX();
                int currY = this.f1643.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m889(currX);
                    }
                }
            }
        }
        this.f1654 = false;
        for (int i2 = 0; i2 < this.f921.size(); i2++) {
            e eVar = this.f921.get(i2);
            if (eVar.f1677) {
                eVar.f1677 = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.postOnAnimation(this, this.f1675);
            } else {
                this.f1675.run();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void m1121() {
        int iMo918 = this.f1640.mo918();
        this.f920 = iMo918;
        boolean z = this.f921.size() < (this.f1655 * 2) + 1 && this.f921.size() < iMo918;
        int i2 = this.f1641;
        for (int i3 = 0; i3 < this.f921.size(); i3++) {
            e eVar = this.f921.get(i3);
            AbstractC0351p7 abstractC0351p7 = this.f1640;
            Object obj = eVar.f926;
            abstractC0351p7.getClass();
        }
        Collections.sort(this.f921, f919);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                f fVar = (f) getChildAt(i4).getLayoutParams();
                if (!fVar.f928) {
                    fVar.f1680 = 0.0f;
                }
            }
            m1135(i2, 0, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final Rect m1122(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final e m1123(View view) {
        for (int i2 = 0; i2 < this.f921.size(); i2++) {
            e eVar = this.f921.get(i2);
            if (this.f1640.mo1188(view, eVar.f926)) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final e m1124() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.f1646 / clientWidth : 0.0f;
        e eVar = null;
        int i3 = 0;
        int i4 = -1;
        boolean z = true;
        float f4 = 0.0f;
        while (i3 < this.f921.size()) {
            e eVar2 = this.f921.get(i3);
            if (!z && eVar2.f927 != (i2 = i4 + 1)) {
                eVar2 = this.f1638;
                eVar2.f1679 = f2 + f4 + f3;
                eVar2.f927 = i2;
                this.f1640.getClass();
                eVar2.f1678 = 1.0f;
                i3--;
            }
            f2 = eVar2.f1679;
            float f5 = eVar2.f1678 + f2 + f3;
            if (!z && scrollX < f2) {
                return eVar;
            }
            if (scrollX < f5 || i3 == this.f921.size() - 1) {
                return eVar2;
            }
            i4 = eVar2.f927;
            f4 = eVar2.f1678;
            i3++;
            z = false;
            eVar = eVar2;
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final e m1125(int i2) {
        for (int i3 = 0; i3 < this.f921.size(); i3++) {
            e eVar = this.f921.get(i3);
            if (eVar.f927 == i2) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1126(int i2, float f2, int i3) {
        int iMax;
        int width;
        int left;
        if (this.f1673 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f928) {
                    int i5 = fVar.f929 & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = width;
                }
            }
        }
        h hVar = this.f1674;
        if (hVar != null) {
            hVar.mo891();
        }
        this.f1672 = true;
    }

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final void m1127(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1664) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1660 = motionEvent.getX(i2);
            this.f1664 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1665;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final boolean m1128() {
        AbstractC0351p7 abstractC0351p7 = this.f1640;
        if (abstractC0351p7 == null || this.f1641 >= abstractC0351p7.mo918() - 1) {
            return false;
        }
        int i2 = this.f1641 + 1;
        this.f1654 = false;
        m1135(i2, 0, true, false);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۠ */
    public final boolean m889(int i2) {
        if (this.f921.size() == 0) {
            if (this.f1671) {
                return false;
            }
            this.f1672 = false;
            m1126(0, 0.0f, 0);
            if (this.f1672) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e eVarM1124 = m1124();
        int clientWidth = getClientWidth();
        int i3 = this.f1646;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = eVarM1124.f927;
        float f3 = ((i2 / f2) - eVarM1124.f1679) / (eVarM1124.f1678 + (i3 / f2));
        this.f1672 = false;
        m1126(i5, f3, (int) (i4 * f3));
        if (this.f1672) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final boolean m1129(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.f1660 - f2;
        this.f1660 = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f1649 * clientWidth;
        float f5 = this.f1650 * clientWidth;
        boolean z3 = false;
        e eVar = this.f921.get(0);
        ArrayList<e> arrayList = this.f921;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f927 != 0) {
            f4 = eVar.f1679 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (eVar2.f927 != this.f1640.mo918() - 1) {
            f5 = eVar2.f1679 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.f1669.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.f1670.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.f1660 = (scrollX - i2) + this.f1660;
        scrollTo(i2, getScrollY());
        m889(i2);
        return z3;
    }

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public final void m1130() {
        m1131(this.f1641);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3 A[PHI: r2 r6 r12
  0x00d3: PHI (r2v20 int) = (r2v19 int), (r2v8 int), (r2v23 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r6v6 int) = (r6v1 int), (r6v5 int), (r6v9 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r12v5 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc A[PHI: r2 r6 r12
  0x00dc: PHI (r2v22 int) = (r2v19 int), (r2v8 int), (r2v23 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r6v8 int) = (r6v1 int), (r6v5 int), (r6v9 int) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r12v7 float) = (r12v3 float), (r12v4 float), (r12v2 float) binds: [B:59:0x00d1, B:56:0x00c3, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158 A[PHI: r1 r9
  0x0158: PHI (r1v18 float) = (r1v16 float), (r1v17 float), (r1v15 float) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0158: PHI (r9v22 int) = (r9v20 int), (r9v21 int), (r9v19 int) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161 A[PHI: r1 r9
  0x0161: PHI (r1v20 float) = (r1v16 float), (r1v17 float), (r1v15 float) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0161: PHI (r9v24 int) = (r9v20 int), (r9v21 int), (r9v19 int) binds: [B:93:0x0156, B:90:0x0144, B:84:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1131(int i2) {
        e eVarM1125;
        String hexString;
        e eVarM887;
        e eVarM1123;
        e eVarM11232;
        int i3;
        int i4;
        e eVar;
        e eVar2;
        int i5 = this.f1641;
        if (i5 != i2) {
            eVarM1125 = m1125(i5);
            this.f1641 = i2;
        } else {
            eVarM1125 = null;
        }
        if (this.f1640 == null || this.f1654 || getWindowToken() == null) {
            return;
        }
        this.f1640.getClass();
        int i6 = this.f1655;
        int i7 = 0;
        int iMax = Math.max(0, this.f1641 - i6);
        int iMo918 = this.f1640.mo918();
        int iMin = Math.min(iMo918 - 1, this.f1641 + i6);
        if (iMo918 != this.f920) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sbM1039 = C0167c4.m1039("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            sbM1039.append(this.f920);
            sbM1039.append(", found: ");
            sbM1039.append(iMo918);
            sbM1039.append(" Pager id: ");
            sbM1039.append(hexString);
            sbM1039.append(" Pager class: ");
            sbM1039.append(getClass());
            sbM1039.append(" Problematic adapter: ");
            sbM1039.append(this.f1640.getClass());
            throw new IllegalStateException(sbM1039.toString());
        }
        while (true) {
            if (i7 >= this.f921.size()) {
                break;
            }
            eVarM887 = this.f921.get(i7);
            int i8 = eVarM887.f927;
            int i9 = this.f1641;
            if (i8 >= i9) {
                if (i8 != i9) {
                    break;
                }
            } else {
                i7++;
            }
        }
        if (eVarM887 == null && iMo918 > 0) {
            eVarM887 = m887(this.f1641, i7);
        }
        if (eVarM887 != null) {
            int i10 = i7 - 1;
            e eVar3 = i10 >= 0 ? this.f921.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - eVarM887.f1678);
            float f2 = 0.0f;
            for (int i11 = this.f1641 - 1; i11 >= 0; i11--) {
                if (f2 >= paddingLeft && i11 < iMax) {
                    if (eVar3 == null) {
                        break;
                    }
                    if (i11 == eVar3.f927 && !eVar3.f1677) {
                        this.f921.remove(i10);
                        this.f1640.mo917(this, eVar3.f926);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                        }
                    }
                } else if (eVar3 == null || i11 != eVar3.f927) {
                    f2 += m887(i11, i10 + 1).f1678;
                    i7++;
                    eVar3 = i10 >= 0 ? this.f921.get(i10) : null;
                } else {
                    f2 += eVar3.f1678;
                    i10--;
                    if (i10 >= 0) {
                    }
                }
            }
            float f3 = eVarM887.f1678;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                e eVar4 = i12 < this.f921.size() ? this.f921.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = i12;
                for (int i14 = this.f1641 + 1; i14 < iMo918; i14++) {
                    if (f3 >= paddingRight && i14 > iMin) {
                        if (eVar4 == null) {
                            break;
                        }
                        if (i14 == eVar4.f927 && !eVar4.f1677) {
                            this.f921.remove(i13);
                            this.f1640.mo917(this, eVar4.f926);
                            if (i13 < this.f921.size()) {
                            }
                        }
                    } else if (eVar4 == null || i14 != eVar4.f927) {
                        e eVarM8872 = m887(i14, i13);
                        i13++;
                        f3 += eVarM8872.f1678;
                        eVar4 = i13 < this.f921.size() ? this.f921.get(i13) : null;
                    } else {
                        f3 += eVar4.f1678;
                        i13++;
                        if (i13 < this.f921.size()) {
                        }
                    }
                }
            }
            int iMo9182 = this.f1640.mo918();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.f1646 / clientWidth2 : 0.0f;
            if (eVarM1125 != null) {
                int i15 = eVarM1125.f927;
                int i16 = eVarM887.f927;
                if (i15 < i16) {
                    float f5 = eVarM1125.f1679 + eVarM1125.f1678 + f4;
                    int i17 = 0;
                    while (true) {
                        i15++;
                        if (i15 > eVarM887.f927 || i17 >= this.f921.size()) {
                            break;
                        }
                        while (true) {
                            eVar2 = this.f921.get(i17);
                            if (i15 <= eVar2.f927 || i17 >= this.f921.size() - 1) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        while (i15 < eVar2.f927) {
                            this.f1640.getClass();
                            f5 += 1.0f + f4;
                            i15++;
                        }
                        eVar2.f1679 = f5;
                        f5 += eVar2.f1678 + f4;
                    }
                } else if (i15 > i16) {
                    int size = this.f921.size() - 1;
                    float f6 = eVarM1125.f1679;
                    while (true) {
                        i15--;
                        if (i15 < eVarM887.f927 || size < 0) {
                            break;
                        }
                        while (true) {
                            eVar = this.f921.get(size);
                            if (i15 >= eVar.f927 || size <= 0) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        while (i15 > eVar.f927) {
                            this.f1640.getClass();
                            f6 -= 1.0f + f4;
                            i15--;
                        }
                        f6 -= eVar.f1678 + f4;
                        eVar.f1679 = f6;
                    }
                }
            }
            int size2 = this.f921.size();
            float f7 = eVarM887.f1679;
            int i18 = eVarM887.f927;
            int i19 = i18 - 1;
            this.f1649 = i18 == 0 ? f7 : -3.4028235E38f;
            int i20 = iMo9182 - 1;
            this.f1650 = i18 == i20 ? (eVarM887.f1678 + f7) - 1.0f : Float.MAX_VALUE;
            int i21 = i7 - 1;
            while (i21 >= 0) {
                e eVar5 = this.f921.get(i21);
                while (true) {
                    i4 = eVar5.f927;
                    if (i19 <= i4) {
                        break;
                    }
                    i19--;
                    this.f1640.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= eVar5.f1678 + f4;
                eVar5.f1679 = f7;
                if (i4 == 0) {
                    this.f1649 = f7;
                }
                i21--;
                i19--;
            }
            float f8 = eVarM887.f1679 + eVarM887.f1678 + f4;
            int i22 = eVarM887.f927;
            while (true) {
                i22++;
                if (i12 >= size2) {
                    break;
                }
                e eVar6 = this.f921.get(i12);
                while (true) {
                    i3 = eVar6.f927;
                    if (i22 >= i3) {
                        break;
                    }
                    i22++;
                    this.f1640.getClass();
                    f8 += 1.0f + f4;
                }
                if (i3 == i20) {
                    this.f1650 = (eVar6.f1678 + f8) - 1.0f;
                }
                eVar6.f1679 = f8;
                f8 += eVar6.f1678 + f4;
                i12++;
            }
            this.f1640.getClass();
        }
        this.f1640.getClass();
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            f fVar = (f) childAt.getLayoutParams();
            fVar.getClass();
            if (!fVar.f928 && fVar.f1680 == 0.0f && (eVarM11232 = m1123(childAt)) != null) {
                fVar.f1680 = eVarM11232.f1678;
                int i24 = eVarM11232.f927;
                fVar.getClass();
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                while (true) {
                    Object parent = viewFindFocus.getParent();
                    if (parent == this) {
                        eVarM1123 = m1123(viewFindFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        viewFindFocus = (View) parent;
                    }
                }
                eVarM1123 = null;
            } else {
                eVarM1123 = null;
            }
            if (eVarM1123 == null || eVarM1123.f927 != this.f1641) {
                for (int i25 = 0; i25 < getChildCount(); i25++) {
                    View childAt2 = getChildAt(i25);
                    e eVarM11233 = m1123(childAt2);
                    if (eVarM11233 != null && eVarM11233.f927 == this.f1641 && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public final void m1132(int i2, int i3, int i4, int i5) {
        int iMin;
        if (i3 <= 0 || this.f921.isEmpty()) {
            e eVarM1125 = m1125(this.f1641);
            iMin = (int) ((eVarM1125 != null ? Math.min(eVarM1125.f1679, this.f1650) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                m1120(false);
            }
        } else if (!this.f1643.isFinished()) {
            this.f1643.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(iMin, getScrollY());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final boolean m1133() {
        this.f1664 = -1;
        this.f1656 = false;
        this.f1657 = false;
        VelocityTracker velocityTracker = this.f1665;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1665 = null;
        }
        this.f1669.onRelease();
        this.f1670.onRelease();
        return this.f1669.isFinished() || this.f1670.isFinished();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final void m1134(int i2, int i3, boolean z, boolean z2) {
        h hVar;
        int scrollX;
        int iAbs;
        h hVar2;
        e eVarM1125 = m1125(i2);
        int iMax = eVarM1125 != null ? (int) (Math.max(this.f1649, Math.min(eVarM1125.f1679, this.f1650)) * getClientWidth()) : 0;
        if (!z) {
            if (z2 && (hVar = this.f1674) != null) {
                hVar.mo1136(i2);
            }
            m1120(false);
            scrollTo(iMax, 0);
            m889(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f1643;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f1644 ? this.f1643.getCurrX() : this.f1643.getStartX();
                this.f1643.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = iMax - i4;
            int i6 = 0 - scrollY;
            if (i5 == 0 && i6 == 0) {
                m1120(false);
                m1130();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i7 = clientWidth / 2;
                float f2 = clientWidth;
                float f3 = i7;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                int iAbs2 = Math.abs(i3);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f1640.getClass();
                    iAbs = (int) (((Math.abs(i5) / ((f2 * 1.0f) + this.f1646)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f1644 = false;
                this.f1643.startScroll(i4, scrollY, i5, i6, iMin);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
        if (!z2 || (hVar2 = this.f1674) == null) {
            return;
        }
        hVar2.mo1136(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final void m1135(int i2, int i3, boolean z, boolean z2) {
        h hVar;
        AbstractC0351p7 abstractC0351p7 = this.f1640;
        if (abstractC0351p7 == null || abstractC0351p7.mo918() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f1641 == i2 && this.f921.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f1640.mo918()) {
            i2 = this.f1640.mo918() - 1;
        }
        int i4 = this.f1655;
        int i5 = this.f1641;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f921.size(); i6++) {
                this.f921.get(i6).f1677 = true;
            }
        }
        boolean z3 = this.f1641 != i2;
        if (!this.f1671) {
            m1131(i2);
            m1134(i2, i3, z, z3);
            return;
        }
        this.f1641 = i2;
        if (z3 && (hVar = this.f1674) != null) {
            hVar.mo1136(i2);
        }
        requestLayout();
    }
}
