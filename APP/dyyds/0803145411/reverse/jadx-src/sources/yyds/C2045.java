package yyds;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: yyds.ᲀᛸᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2045 extends ListView {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public RunnableC0871 f10166;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f10167;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public ViewOnTouchListenerC0386 f10168;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C1266 f10169;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f10170;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f10171;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean f10172;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f10173;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f10174;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Rect f10175;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f10176;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f10177;

    public C2045(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f10175 = new Rect();
        this.f10177 = 0;
        this.f10170 = 0;
        this.f10176 = 0;
        this.f10171 = 0;
        this.f10172 = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f10175;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f10166 != null) {
            return;
        }
        super.drawableStateChanged();
        C1266 c1266 = this.f10169;
        if (c1266 != null) {
            c1266.f5837 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f10173 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f10172 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f10172 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f10172 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f10172 && this.f10174) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f10166 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f10166 == null) {
            RunnableC0871 runnableC0871 = new RunnableC0871(6, this);
            this.f10166 = runnableC0871;
            post(runnableC0871);
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
                if (AbstractC0199.f1172) {
                    try {
                        AbstractC0199.f1169.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0199.f1170.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0199.f1171.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f10173 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10167 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0871 runnableC0871 = this.f10166;
        if (runnableC0871 != null) {
            C2045 c2045 = (C2045) runnableC0871.f3989;
            c2045.f10166 = null;
            c2045.removeCallbacks(runnableC0871);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f10174 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1266 c1266;
        if (drawable != null) {
            c1266 = new C1266(drawable);
            c1266.f5837 = true;
        } else {
            c1266 = null;
        }
        this.f10169 = c1266;
        super.setSelector(c1266);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f10177 = rect.left;
        this.f10170 = rect.top;
        this.f10176 = rect.right;
        this.f10171 = rect.bottom;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m3914(int i, int i2) {
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

    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3915(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM3987;
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
                    this.f10173 = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f10167 - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                ViewOnTouchListenerC0386 viewOnTouchListenerC0386 = this.f10168;
                if (!z) {
                    if (viewOnTouchListenerC0386 == null) {
                        viewOnTouchListenerC0386 = new ViewOnTouchListenerC0386(this);
                        this.f10168 = viewOnTouchListenerC0386;
                    }
                    viewOnTouchListenerC0386.f1977 = true;
                    viewOnTouchListenerC0386.onTouch(this, motionEvent);
                } else if (viewOnTouchListenerC0386 != null) {
                    if (viewOnTouchListenerC0386.f1977) {
                        viewOnTouchListenerC0386.m1112();
                    }
                    viewOnTouchListenerC0386.f1977 = false;
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
                this.f10173 = true;
                AbstractC0167.m732(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f10167;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f10167 = iPointToPosition;
                AbstractC0167.m732(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f10175;
                rect.set(left, top, right, bottom);
                rect.left -= this.f10177;
                rect.top -= this.f10170;
                rect.right += this.f10176;
                rect.bottom += this.f10171;
                if (AbstractC1827.m3586()) {
                    zM3987 = AbstractC2088.m3987(this);
                } else {
                    Field field = AbstractC1103.f5077;
                    if (field != null) {
                        try {
                            zM3987 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM3987 = false;
                        }
                    } else {
                        zM3987 = false;
                    }
                }
                if (childAt3.isEnabled() != zM3987) {
                    boolean z4 = !zM3987;
                    if (AbstractC1827.m3586()) {
                        AbstractC2088.m3988(this, z4);
                    } else {
                        Field field2 = AbstractC1103.f5077;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z4));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                C1266 c1266 = this.f10169;
                if (c1266 != null) {
                    c1266.f5837 = false;
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
            this.f10173 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10167 - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        ViewOnTouchListenerC0386 viewOnTouchListenerC03862 = this.f10168;
        if (!z) {
        }
        return z;
    }
}
