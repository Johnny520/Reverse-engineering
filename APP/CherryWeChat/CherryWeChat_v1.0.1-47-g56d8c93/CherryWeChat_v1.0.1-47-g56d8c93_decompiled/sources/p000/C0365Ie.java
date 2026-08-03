package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import io.github.cherrywechat.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: Ie */
/* JADX INFO: loaded from: classes.dex */
public class C0365Ie extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f1235a;

    /* JADX INFO: renamed from: b */
    public int f1236b;

    /* JADX INFO: renamed from: c */
    public int f1237c;

    /* JADX INFO: renamed from: d */
    public int f1238d;

    /* JADX INFO: renamed from: e */
    public int f1239e;

    /* JADX INFO: renamed from: f */
    public int f1240f;

    /* JADX INFO: renamed from: g */
    public C0279Ge f1241g;

    /* JADX INFO: renamed from: h */
    public boolean f1242h;

    /* JADX INFO: renamed from: i */
    public final boolean f1243i;

    /* JADX INFO: renamed from: j */
    public boolean f1244j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0504Lo f1245k;

    /* JADX INFO: renamed from: l */
    public RunnableC0431K0 f1246l;

    public C0365Ie(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1235a = new Rect();
        this.f1236b = 0;
        this.f1237c = 0;
        this.f1238d = 0;
        this.f1239e = 0;
        this.f1243i = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m806a(int i, int i2) {
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

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m807b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM482a;
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
                    this.f1244j = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f1240f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    ViewOnTouchListenerC0504Lo viewOnTouchListenerC0504Lo = this.f1245k;
                    if (viewOnTouchListenerC0504Lo != null) {
                        if (viewOnTouchListenerC0504Lo.f1655p) {
                            viewOnTouchListenerC0504Lo.m987d();
                        }
                        viewOnTouchListenerC0504Lo.f1655p = false;
                    }
                } else {
                    if (this.f1245k == null) {
                        this.f1245k = new ViewOnTouchListenerC0504Lo(this);
                    }
                    ViewOnTouchListenerC0504Lo viewOnTouchListenerC0504Lo2 = this.f1245k;
                    boolean z3 = viewOnTouchListenerC0504Lo2.f1655p;
                    viewOnTouchListenerC0504Lo2.f1655p = true;
                    viewOnTouchListenerC0504Lo2.onTouch(this, motionEvent);
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
                float f = x;
                float f2 = y;
                this.f1244j = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC0150De.m294a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f1240f;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1240f = iPointToPosition;
                AbstractC0150De.m294a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1235a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1236b;
                rect.top -= this.f1237c;
                rect.right += this.f1238d;
                rect.bottom += this.f1239e;
                if (i2 >= 33) {
                    zM482a = AbstractC0236Fe.m482a(this);
                } else {
                    Field field = AbstractC0322He.f1089a;
                    if (field != null) {
                        try {
                            zM482a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM482a = false;
                        }
                    } else {
                        zM482a = false;
                    }
                }
                if (childAt3.isEnabled() != zM482a) {
                    boolean z5 = !zM482a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0236Fe.m483b(this, z5);
                    } else {
                        Field field2 = AbstractC0322He.f1089a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
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
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                C0279Ge c0279Ge = this.f1241g;
                if (c0279Ge != null) {
                    c0279Ge.f906b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.f1244j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1240f - getFirstVisiblePosition());
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
        Rect rect = this.f1235a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1246l != null) {
            return;
        }
        super.drawableStateChanged();
        C0279Ge c0279Ge = this.f1241g;
        if (c0279Ge != null) {
            c0279Ge.f906b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1244j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1243i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1243i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1243i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1243i && this.f1242h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1246l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1246l == null) {
            RunnableC0431K0 runnableC0431K0 = new RunnableC0431K0(5, this);
            this.f1246l = runnableC0431K0;
            post(runnableC0431K0);
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
                if (i < 30 || !AbstractC0193Ee.f592d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0193Ee.f589a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0193Ee.f590b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0193Ee.f591c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f1244j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1240f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0431K0 runnableC0431K0 = this.f1246l;
        if (runnableC0431K0 != null) {
            C0365Ie c0365Ie = (C0365Ie) runnableC0431K0.f1419b;
            c0365Ie.f1246l = null;
            c0365Ie.removeCallbacks(runnableC0431K0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1242h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0279Ge c0279Ge;
        if (drawable != null) {
            c0279Ge = new C0279Ge();
            Drawable drawable2 = c0279Ge.f905a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0279Ge.f905a = drawable;
            if (drawable != null) {
                drawable.setCallback(c0279Ge);
            }
            c0279Ge.f906b = true;
        } else {
            c0279Ge = null;
        }
        this.f1241g = c0279Ge;
        super.setSelector(c0279Ge);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1236b = rect.left;
        this.f1237c = rect.top;
        this.f1238d = rect.right;
        this.f1239e = rect.bottom;
    }
}
