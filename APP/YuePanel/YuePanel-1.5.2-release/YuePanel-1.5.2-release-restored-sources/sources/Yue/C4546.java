package Yue;

import Yue.C6898;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4546 extends ListView {

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f9778 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f9779 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Rect f9780;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f9781;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f9782;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f9783;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f9784;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f9785;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C4548 f9786;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f9787;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f9788;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f9789;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8357 f9790;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C5737 f9791;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public RunnableC4550 f9792;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠$ۥ */
    @InterfaceC7113(21)
    public static class C0435 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1483(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠$ۥ۟ */
    @InterfaceC7113(30)
    public static class C0436 {

        /* JADX INFO: renamed from: ۥ */
        public static Method f960;

        /* JADX INFO: renamed from: ۥ۟ */
        public static Method f961;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Method f9793;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean f9794;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f960 = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f961 = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f9793 = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f9794 = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public static boolean m1484() {
            return f9794;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m1485(C4546 c4546, int i, View view) {
            try {
                f960.invoke(c4546, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f961.invoke(c4546, Integer.valueOf(i));
                f9793.invoke(c4546, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(33)
    public static class C4547 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m1486(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m1487(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C4548 extends C4535 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f9795;

        public C4548(Drawable drawable) {
            super(drawable);
            this.f9795 = true;
        }

        @Override // Yue.C4535, android.graphics.drawable.Drawable
        public void draw(@InterfaceC6391 Canvas canvas) {
            if (this.f9795) {
                super.draw(canvas);
            }
        }

        @Override // Yue.C4535, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f9795) {
                super.setHotspot(f, f2);
            }
        }

        @Override // Yue.C4535, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f9795) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // Yue.C4535, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f9795) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // Yue.C4535, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f9795) {
                return super.setVisible(z, z2);
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m1488(boolean z) {
            this.f9795 = z;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C4549 {

        /* JADX INFO: renamed from: ۥ */
        public static final Field f962;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f962 = declaredField;
        }

        /* JADX INFO: renamed from: ۥ */
        public static boolean m1489(AbsListView absListView) {
            Field field = f962;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m1490(AbsListView absListView, boolean z) {
            Field field = f962;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public class RunnableC4550 implements Runnable {
        public RunnableC4550() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4546 c4546 = C4546.this;
            c4546.f9792 = null;
            c4546.drawableStateChanged();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m1491() {
            C4546 c4546 = C4546.this;
            c4546.f9792 = null;
            c4546.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1492() {
            C4546.this.post(this);
        }
    }

    public C4546(@InterfaceC6391 Context context, boolean z) {
        super(context, null, C6898.C1110.f18469);
        this.f9780 = new Rect();
        this.f9781 = 0;
        this.f9782 = 0;
        this.f9783 = 0;
        this.f9784 = 0;
        this.f9788 = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m13366(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f9792 != null) {
            return;
        }
        super.drawableStateChanged();
        m13374(true);
        m13378();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f9788 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f9788 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f9788 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f9788 && this.f9787) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f9792 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@InterfaceC6391 MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9792 == null) {
            RunnableC4550 runnableC4550 = new RunnableC4550();
            this.f9792 = runnableC4550;
            runnableC4550.m1492();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0436.m1484()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0436.m1485(this, iPointToPosition, childAt);
                    }
                }
                m13378();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9785 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC4550 runnableC4550 = this.f9792;
        if (runnableC4550 != null) {
            runnableC4550.m1491();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f9787 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C4548 c4548 = drawable != null ? new C4548(drawable) : null;
        this.f9786 = c4548;
        super.setSelector(c4548);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9781 = rect.left;
        this.f9782 = rect.top;
        this.f9783 = rect.right;
        this.f9784 = rect.bottom;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1481() {
        this.f9789 = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f9785 - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C8357 c8357 = this.f9790;
        if (c8357 != null) {
            c8357.m27857();
            this.f9790 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1482(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m13366(Canvas canvas) {
        Drawable selector;
        if (this.f9780.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f9780);
        selector.draw(canvas);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int mo13367(int i, boolean z) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    iMin = Math.max(0, i);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int mo13368(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo13369(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    m1481();
                }
                if (z) {
                    C5737 c5737 = this.f9791;
                    if (c5737 != null) {
                        c5737.m9306(false);
                    }
                } else {
                    if (this.f9791 == null) {
                        this.f9791 = new C5737(this);
                    }
                    this.f9791.m9306(true);
                    this.f9791.onTouch(this, motionEvent);
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex >= 0) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                m13373(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    m1482(childAt, iPointToPosition);
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            m1481();
        }
        if (z) {
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m13370(int i, View view) {
        Rect rect = this.f9780;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f9781;
        rect.top -= this.f9782;
        rect.right += this.f9783;
        rect.bottom += this.f9784;
        boolean zM13375 = m13375();
        if (view.isEnabled() != zM13375) {
            m13376(!zM13375);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m13371(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m13370(i, view);
        if (z) {
            Rect rect = this.f9780;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C4520.m13232(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m13372(int i, View view, float f, float f2) {
        m13371(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C4520.m13232(selector, f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m13373(View view, int i, float f, float f2) {
        View childAt;
        this.f9789 = true;
        C0435.m1483(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f9785;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f9785 = i;
        C0435.m1483(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m13372(i, view, f, f2);
        m13374(false);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m13374(boolean z) {
        C4548 c4548 = this.f9786;
        if (c4548 != null) {
            c4548.m1488(z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m13375() {
        return Build.VERSION.SDK_INT >= 33 ? C4547.m1486(this) : C4549.m1489(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m13376(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            C4547.m1487(this, z);
        } else {
            C4549.m1490(this, z);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m13377() {
        return this.f9789;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m13378() {
        Drawable selector = getSelector();
        if (selector != null && m13377() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
