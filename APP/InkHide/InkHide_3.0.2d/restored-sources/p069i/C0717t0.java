package p069i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.p055lu.wxmask272.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p006D.RunnableC0073b;
import p006D.ViewOnTouchListenerC0081j;
import p087s.AbstractC0962a;

/* JADX INFO: renamed from: i.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C0717t0 extends ListView {

    /* JADX INFO: renamed from: b */
    public final Rect f2423b;

    /* JADX INFO: renamed from: c */
    public int f2424c;

    /* JADX INFO: renamed from: d */
    public int f2425d;

    /* JADX INFO: renamed from: e */
    public int f2426e;

    /* JADX INFO: renamed from: f */
    public int f2427f;

    /* JADX INFO: renamed from: g */
    public int f2428g;

    /* JADX INFO: renamed from: h */
    public final Field f2429h;

    /* JADX INFO: renamed from: i */
    public C0714s0 f2430i;

    /* JADX INFO: renamed from: j */
    public boolean f2431j;

    /* JADX INFO: renamed from: k */
    public final boolean f2432k;

    /* JADX INFO: renamed from: l */
    public boolean f2433l;

    /* JADX INFO: renamed from: m */
    public ViewOnTouchListenerC0081j f2434m;

    /* JADX INFO: renamed from: n */
    public RunnableC0073b f2435n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0717t0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2423b = new Rect();
        this.f2424c = 0;
        this.f2425d = 0;
        this.f2426e = 0;
        this.f2427f = 0;
        this.f2432k = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2429h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1364a(int i2, int i3) {
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
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1365b(MotionEvent motionEvent, int i2) {
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                z2 = actionMasked != 3;
                if (z2 || z3) {
                    this.f2433l = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f2428g - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    ViewOnTouchListenerC0081j viewOnTouchListenerC0081j = this.f2434m;
                    if (viewOnTouchListenerC0081j != null) {
                        if (viewOnTouchListenerC0081j.f356q) {
                            viewOnTouchListenerC0081j.m218d();
                        }
                        viewOnTouchListenerC0081j.f356q = false;
                    }
                } else {
                    if (this.f2434m == null) {
                        this.f2434m = new ViewOnTouchListenerC0081j(this);
                    }
                    ViewOnTouchListenerC0081j viewOnTouchListenerC0081j2 = this.f2434m;
                    boolean z4 = viewOnTouchListenerC0081j2.f356q;
                    viewOnTouchListenerC0081j2.f356q = true;
                    viewOnTouchListenerC0081j2.onTouch(this, motionEvent);
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x2;
                float f2 = y2;
                this.f2433l = true;
                AbstractC0708q0.m1341a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f2428g;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2428g = iPointToPosition;
                AbstractC0708q0.m1341a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                Field field = this.f2429h;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2423b;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2424c;
                rect.top -= this.f2425d;
                rect.right += this.f2426e;
                rect.bottom += this.f2427f;
                try {
                    boolean z6 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z6) {
                        field.set(this, Boolean.valueOf(!z6));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC0962a.m2140e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    AbstractC0962a.m2140e(selector2, f, f2);
                }
                C0714s0 c0714s0 = this.f2430i;
                if (c0714s0 != null) {
                    c0714s0.f2416c = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            this.f2433l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2428g - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2423b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2435n != null) {
            return;
        }
        super.drawableStateChanged();
        C0714s0 c0714s0 = this.f2430i;
        if (c0714s0 != null) {
            c0714s0.f2416c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2433l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2432k || super.hasFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2432k || super.hasWindowFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2432k || super.isFocused();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2432k && this.f2431j) || super.isInTouchMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2435n = null;
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2435n == null) {
            RunnableC0073b runnableC0073b = new RunnableC0073b(4, this);
            this.f2435n = runnableC0073b;
            post(runnableC0073b);
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
                if (i2 < 30 || !AbstractC0711r0.f2409d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0711r0.f2406a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0711r0.f2407b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0711r0.f2408c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2433l && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2428g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0073b runnableC0073b = this.f2435n;
        if (runnableC0073b != null) {
            C0717t0 c0717t0 = (C0717t0) runnableC0073b.f336b;
            c0717t0.f2435n = null;
            c0717t0.removeCallbacks(runnableC0073b);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setListSelectionHidden(boolean z2) {
        this.f2431j = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0714s0 c0714s0 = null;
        if (drawable != null) {
            C0714s0 c0714s02 = new C0714s0();
            Drawable drawable2 = c0714s02.f2415b;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0714s02.f2415b = drawable;
            drawable.setCallback(c0714s02);
            c0714s02.f2416c = true;
            c0714s0 = c0714s02;
        }
        this.f2430i = c0714s0;
        super.setSelector(c0714s0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2424c = rect.left;
        this.f2425d = rect.top;
        this.f2426e = rect.right;
        this.f2427f = rect.bottom;
    }
}
