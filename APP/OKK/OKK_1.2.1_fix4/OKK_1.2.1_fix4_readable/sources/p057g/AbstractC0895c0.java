package p057g;

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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.luckypray.dexkit.C1031R;
import p001A0.RunnableC0019E;
import p017J.ViewOnTouchListenerC0218g;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0895c0 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f3169a;

    /* JADX INFO: renamed from: b */
    public int f3170b;

    /* JADX INFO: renamed from: c */
    public int f3171c;

    /* JADX INFO: renamed from: d */
    public int f3172d;

    /* JADX INFO: renamed from: e */
    public int f3173e;

    /* JADX INFO: renamed from: f */
    public int f3174f;

    /* JADX INFO: renamed from: g */
    public C0891a0 f3175g;

    /* JADX INFO: renamed from: h */
    public boolean f3176h;

    /* JADX INFO: renamed from: i */
    public final boolean f3177i;

    /* JADX INFO: renamed from: j */
    public boolean f3178j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0218g f3179k;

    /* JADX INFO: renamed from: l */
    public RunnableC0019E f3180l;

    public AbstractC0895c0(Context context, boolean z2) {
        super(context, null, C1031R.attr.dropDownListViewStyle);
        this.f3169a = new Rect();
        this.f3170b = 0;
        this.f3171c = 0;
        this.f3172d = 0;
        this.f3173e = 0;
        this.f3177i = z2;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m2229a(int i2, int i3) {
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

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2230b(MotionEvent motionEvent, int i2) {
        boolean z2;
        boolean zM2223a;
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
                    this.f3178j = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f3174f - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    ViewOnTouchListenerC0218g viewOnTouchListenerC0218g = this.f3179k;
                    if (viewOnTouchListenerC0218g != null) {
                        if (viewOnTouchListenerC0218g.f460p) {
                            viewOnTouchListenerC0218g.m609d();
                        }
                        viewOnTouchListenerC0218g.f460p = false;
                    }
                } else {
                    if (this.f3179k == null) {
                        this.f3179k = new ViewOnTouchListenerC0218g(this);
                    }
                    ViewOnTouchListenerC0218g viewOnTouchListenerC0218g2 = this.f3179k;
                    boolean z4 = viewOnTouchListenerC0218g2.f460p;
                    viewOnTouchListenerC0218g2.f460p = true;
                    viewOnTouchListenerC0218g2.onTouch(this, motionEvent);
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex >= 0) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f2 = x;
                float f3 = y;
                this.f3178j = true;
                int i3 = Build.VERSION.SDK_INT;
                AbstractC0887X.m2222a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f3174f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3174f = iPointToPosition;
                AbstractC0887X.m2222a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3169a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3170b;
                rect.top -= this.f3171c;
                rect.right += this.f3172d;
                rect.bottom += this.f3173e;
                if (i3 >= 33) {
                    zM2223a = AbstractC0889Z.m2223a(this);
                } else {
                    Field field = AbstractC0893b0.f3168a;
                    if (field != null) {
                        try {
                            zM2223a = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                            zM2223a = false;
                        }
                    } else {
                        zM2223a = false;
                    }
                }
                if (childAt3.isEnabled() != zM2223a) {
                    boolean z6 = !zM2223a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0889Z.m2224b(this, z6);
                    } else {
                        Field field2 = AbstractC0893b0.f3168a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC1111a.m2623e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    AbstractC1111a.m2623e(selector2, f2, f3);
                }
                C0891a0 c0891a0 = this.f3175g;
                if (c0891a0 != null) {
                    c0891a0.f3165b = false;
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
            this.f3178j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3174f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3169a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3180l != null) {
            return;
        }
        super.drawableStateChanged();
        C0891a0 c0891a0 = this.f3175g;
        if (c0891a0 != null) {
            c0891a0.f3165b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3178j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3177i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3177i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3177i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3177i && this.f3176h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3180l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3180l == null) {
            RunnableC0019E runnableC0019E = new RunnableC0019E(8, this);
            this.f3180l = runnableC0019E;
            post(runnableC0019E);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !AbstractC0888Y.f3162d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0888Y.f3159a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0888Y.f3160b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0888Y.f3161c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3178j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3174f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0019E runnableC0019E = this.f3180l;
        if (runnableC0019E != null) {
            AbstractC0895c0 abstractC0895c0 = (AbstractC0895c0) runnableC0019E.f57b;
            abstractC0895c0.f3180l = null;
            abstractC0895c0.removeCallbacks(runnableC0019E);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f3176h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0891a0 c0891a0 = null;
        if (drawable != null) {
            C0891a0 c0891a02 = new C0891a0();
            Drawable drawable2 = c0891a02.f3164a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0891a02.f3164a = drawable;
            drawable.setCallback(c0891a02);
            c0891a02.f3165b = true;
            c0891a0 = c0891a02;
        }
        this.f3175g = c0891a0;
        super.setSelector(c0891a0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3170b = rect.left;
        this.f3171c = rect.top;
        this.f3172d = rect.right;
        this.f3173e = rect.bottom;
    }
}
