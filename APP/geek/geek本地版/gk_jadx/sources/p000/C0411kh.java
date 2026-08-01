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
import com.ljx.wechatmod.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: kh */
/* JADX INFO: loaded from: classes.dex */
public class C0411kh extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f2890a;

    /* JADX INFO: renamed from: b */
    public int f2891b;

    /* JADX INFO: renamed from: c */
    public int f2892c;

    /* JADX INFO: renamed from: d */
    public int f2893d;

    /* JADX INFO: renamed from: e */
    public int f2894e;

    /* JADX INFO: renamed from: f */
    public int f2895f;

    /* JADX INFO: renamed from: g */
    public C0334ih f2896g;

    /* JADX INFO: renamed from: h */
    public boolean f2897h;

    /* JADX INFO: renamed from: i */
    public final boolean f2898i;

    /* JADX INFO: renamed from: j */
    public boolean f2899j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0458lr f2900k;

    /* JADX INFO: renamed from: l */
    public RunnableC0919y6 f2901l;

    public C0411kh(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2890a = new Rect();
        this.f2891b = 0;
        this.f2892c = 0;
        this.f2893d = 0;
        this.f2894e = 0;
        this.f2898i = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m1699a(int i, int i2) {
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
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1700b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0411kh.m1700b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2890a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2901l != null) {
            return;
        }
        super.drawableStateChanged();
        C0334ih c0334ih = this.f2896g;
        if (c0334ih != null) {
            c0334ih.f2432b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2899j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2898i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2898i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2898i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2898i && this.f2897h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2901l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2901l == null) {
            RunnableC0919y6 runnableC0919y6 = new RunnableC0919y6(5, this);
            this.f2901l = runnableC0919y6;
            post(runnableC0919y6);
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
                if (i < 30 || !AbstractC0261gh.f2130d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0261gh.f2127a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0261gh.f2128b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0261gh.f2129c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2899j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2895f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0919y6 runnableC0919y6 = this.f2901l;
        if (runnableC0919y6 != null) {
            C0411kh c0411kh = (C0411kh) runnableC0919y6.f5278b;
            c0411kh.f2901l = null;
            c0411kh.removeCallbacks(runnableC0919y6);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f2897h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0334ih c0334ih = null;
        if (drawable != null) {
            C0334ih c0334ih2 = new C0334ih();
            Drawable drawable2 = c0334ih2.f2431a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0334ih2.f2431a = drawable;
            drawable.setCallback(c0334ih2);
            c0334ih2.f2432b = true;
            c0334ih = c0334ih2;
        }
        this.f2896g = c0334ih;
        super.setSelector(c0334ih);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2891b = rect.left;
        this.f2892c = rect.top;
        this.f2893d = rect.right;
        this.f2894e = rect.bottom;
    }
}
