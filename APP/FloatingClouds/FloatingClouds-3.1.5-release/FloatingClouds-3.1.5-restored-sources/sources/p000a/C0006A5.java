package p000a;

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
import androidx.appcompat.C0983R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.A5 */
/* JADX INFO: loaded from: classes.dex */
public class C0006A5 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f31a;

    /* JADX INFO: renamed from: b */
    public int f32b;

    /* JADX INFO: renamed from: c */
    public int f33c;

    /* JADX INFO: renamed from: d */
    public int f34d;

    /* JADX INFO: renamed from: e */
    public int f35e;

    /* JADX INFO: renamed from: f */
    public int f36f;

    /* JADX INFO: renamed from: g */
    public d f37g;

    /* JADX INFO: renamed from: h */
    public boolean f38h;

    /* JADX INFO: renamed from: i */
    public final boolean f39i;

    /* JADX INFO: renamed from: j */
    public boolean f40j;

    /* JADX INFO: renamed from: k */
    public C0120G9 f41k;

    /* JADX INFO: renamed from: l */
    public f f42l;

    /* JADX INFO: renamed from: a.A5$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m34a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: renamed from: a.A5$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Method f43a;

        /* JADX INFO: renamed from: b */
        public static final Method f44b;

        /* JADX INFO: renamed from: c */
        public static final Method f45c;

        /* JADX INFO: renamed from: d */
        public static final boolean f46d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f43a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f44b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f45c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f46d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a.A5$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static boolean m35a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* JADX INFO: renamed from: b */
        public static void m36b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: renamed from: a.A5$d */
    public static class d extends C0950z5 {

        /* JADX INFO: renamed from: b */
        public boolean f47b;

        @Override // p000a.C0950z5, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f47b) {
                super.draw(canvas);
            }
        }

        @Override // p000a.C0950z5, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f47b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000a.C0950z5, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f47b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f47b) {
                return this.f3562a.setState(iArr);
            }
            return false;
        }

        @Override // p000a.C0950z5, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f47b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a.A5$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static final Field f48a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f48a = declaredField;
        }
    }

    /* JADX INFO: renamed from: a.A5$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0006A5 c0006a5 = C0006A5.this;
            c0006a5.f42l = null;
            c0006a5.drawableStateChanged();
        }
    }

    public C0006A5(Context context, boolean z) {
        super(context, null, C0983R.attr.dropDownListViewStyle);
        this.f31a = new Rect();
        this.f32b = 0;
        this.f33c = 0;
        this.f34d = 0;
        this.f35e = 0;
        this.f39i = z;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z) {
        d dVar = this.f37g;
        if (dVar != null) {
            dVar.f47b = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m32a(int i, int i2) {
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
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m33b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM35a;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                z = actionMasked != 3;
                if (z || z2) {
                    this.f40j = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f36f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    C0120G9 c0120g9 = this.f41k;
                    if (c0120g9 != null) {
                        if (c0120g9.f915p) {
                            c0120g9.m727d();
                        }
                        c0120g9.f915p = false;
                    }
                } else {
                    if (this.f41k == null) {
                        this.f41k = new C0120G9(this);
                    }
                    C0120G9 c0120g92 = this.f41k;
                    boolean z3 = c0120g92.f915p;
                    c0120g92.f915p = true;
                    c0120g92.onTouch(this, motionEvent);
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
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f2 = x;
                float f3 = y;
                this.f40j = true;
                int i2 = Build.VERSION.SDK_INT;
                a.m34a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f36f;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f36f = iPointToPosition;
                a.m34a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top2 = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f31a;
                rect.set(left, top2, right, bottom);
                rect.left -= this.f32b;
                rect.top -= this.f33c;
                rect.right += this.f34d;
                rect.bottom += this.f35e;
                if (i2 >= 33) {
                    zM35a = c.m35a(this);
                } else {
                    Field field = e.f48a;
                    if (field != null) {
                        try {
                            zM35a = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                            zM35a = false;
                        }
                    } else {
                        zM35a = false;
                    }
                }
                if (childAt3.isEnabled() != zM35a) {
                    boolean z5 = !zM35a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c.m36b(this, z5);
                    } else {
                        Field field2 = e.f48a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    C0893w5.a.m2173e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    C0893w5.a.m2173e(selector2, f2, f3);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.f40j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f36f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f31a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f42l != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f40j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f39i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f39i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f39i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f39i && this.f38h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f42l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f42l == null) {
            f fVar = new f();
            this.f42l = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !b.f46d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        b.f43a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b.f44b.invoke(this, Integer.valueOf(iPointToPosition));
                        b.f45c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f40j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f36f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f42l;
        if (fVar != null) {
            C0006A5 c0006a5 = C0006A5.this;
            c0006a5.f42l = null;
            c0006a5.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f38h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = null;
        if (drawable != null) {
            d dVar2 = new d();
            Drawable drawable2 = dVar2.f3562a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            dVar2.f3562a = drawable;
            drawable.setCallback(dVar2);
            dVar2.f47b = true;
            dVar = dVar2;
        }
        this.f37g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f32b = rect.left;
        this.f33c = rect.top;
        this.f34d = rect.right;
        this.f35e = rect.bottom;
    }
}
