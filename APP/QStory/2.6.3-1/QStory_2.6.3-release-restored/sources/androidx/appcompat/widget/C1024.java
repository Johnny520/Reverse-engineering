package androidx.appcompat.widget;

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
import androidx.appcompat.app.RunnableC0909;
import androidx.core.widget.ViewOnTouchListenerC3126;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1024 extends ListView {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public RunnableC0909 f1037;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ViewOnTouchListenerC3126 f1038;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f1039;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f1040;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f1041;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f1042;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f1043;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f1044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1021 f1045;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f1046;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f1047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f1048;

    public C1024(Context context, boolean z) {
        super(context, null, C0328R.attr.dropDownListViewStyle);
        this.f1048 = new Rect();
        this.f1046 = 0;
        this.f1047 = 0;
        this.f1041 = 0;
        this.f1040 = 0;
        this.f1043 = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1048;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1037 != null) {
            return;
        }
        super.drawableStateChanged();
        C1021 c1021 = this.f1045;
        if (c1021 != null) {
            c1021.f1033 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1039 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1043 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1043 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1043 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1043 && this.f1042) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1037 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1037 == null) {
            RunnableC0909 runnableC0909 = new RunnableC0909(this, 1);
            this.f1037 = runnableC0909;
            post(runnableC0909);
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
                if (Build.VERSION.SDK_INT < 30 || !AbstractC1065.f1174) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1065.f1177.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1065.f1176.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1065.f1175.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f1039 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1044 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0909 runnableC0909 = this.f1037;
        if (runnableC0909 != null) {
            C1024 c1024 = (C1024) runnableC0909.f480;
            c1024.f1037 = null;
            c1024.removeCallbacks(runnableC0909);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1042 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1021 c1021 = null;
        if (drawable != null) {
            C1021 c10212 = new C1021();
            Drawable drawable2 = c10212.f1034;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c10212.f1034 = drawable;
            drawable.setCallback(c10212);
            c10212.f1033 = true;
            c1021 = c10212;
        }
        this.f1045 = c1021;
        super.setSelector(c1021);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1046 = rect.left;
        this.f1047 = rect.top;
        this.f1041 = rect.right;
        this.f1040 = rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1201(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM1285;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z = false;
                    z2 = false;
                }
                if (z || z2) {
                    this.f1039 = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f1044 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                ViewOnTouchListenerC3126 viewOnTouchListenerC3126 = this.f1038;
                if (!z) {
                    if (viewOnTouchListenerC3126 == null) {
                        this.f1038 = new ViewOnTouchListenerC3126(this);
                    }
                    ViewOnTouchListenerC3126 viewOnTouchListenerC31262 = this.f1038;
                    boolean z3 = viewOnTouchListenerC31262.f7018;
                    viewOnTouchListenerC31262.f7018 = true;
                    viewOnTouchListenerC31262.onTouch(this, motionEvent);
                } else if (viewOnTouchListenerC3126 != null) {
                    if (viewOnTouchListenerC3126.f7018) {
                        viewOnTouchListenerC3126.m4868();
                    }
                    viewOnTouchListenerC3126.f7018 = false;
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
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f1039 = true;
                AbstractC1062.m1281(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f1044;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1044 = iPointToPosition;
                AbstractC1062.m1281(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
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
                Rect rect = this.f1048;
                rect.set(left, top2, right, bottom);
                rect.left -= this.f1046;
                rect.top -= this.f1047;
                rect.right += this.f1041;
                rect.bottom += this.f1040;
                if (Build.VERSION.SDK_INT >= 33) {
                    zM1285 = AbstractC1064.m1285(this);
                } else {
                    Field field = AbstractC1020.f1032;
                    if (field != null) {
                        try {
                            zM1285 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM1285 = false;
                        }
                    } else {
                        zM1285 = false;
                    }
                }
                if (childAt3.isEnabled() != zM1285) {
                    boolean z5 = !zM1285;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1064.m1284(this, z5);
                    } else {
                        Field field2 = AbstractC1020.f1032;
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
                C1021 c1021 = this.f1045;
                if (c1021 != null) {
                    c1021.f1033 = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f1039 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1044 - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        ViewOnTouchListenerC3126 viewOnTouchListenerC31263 = this.f1038;
        if (!z) {
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m1202(int i, int i2) {
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
}
