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

/* JADX INFO: renamed from: mh */
/* JADX INFO: loaded from: classes.dex */
public class C0485mh extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f3135a;

    /* JADX INFO: renamed from: b */
    public int f3136b;

    /* JADX INFO: renamed from: c */
    public int f3137c;

    /* JADX INFO: renamed from: d */
    public int f3138d;

    /* JADX INFO: renamed from: e */
    public int f3139e;

    /* JADX INFO: renamed from: f */
    public int f3140f;

    /* JADX INFO: renamed from: g */
    public C0411kh f3141g;

    /* JADX INFO: renamed from: h */
    public boolean f3142h;

    /* JADX INFO: renamed from: i */
    public final boolean f3143i;

    /* JADX INFO: renamed from: j */
    public boolean f3144j;

    /* JADX INFO: renamed from: k */
    public ViewOnTouchListenerC0606pr f3145k;

    /* JADX INFO: renamed from: l */
    public RunnableC0325i7 f3146l;

    public C0485mh(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f3135a = new Rect();
        this.f3136b = 0;
        this.f3137c = 0;
        this.f3138d = 0;
        this.f3139e = 0;
        this.f3143i = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m1822a(int i, int i2) {
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
    public final boolean m1823b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0485mh.m1823b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3135a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3146l != null) {
            return;
        }
        super.drawableStateChanged();
        C0411kh c0411kh = this.f3141g;
        if (c0411kh != null) {
            c0411kh.f2840b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3144j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3143i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3143i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3143i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3143i && this.f3142h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3146l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3146l == null) {
            RunnableC0325i7 runnableC0325i7 = new RunnableC0325i7(5, this);
            this.f3146l = runnableC0325i7;
            post(runnableC0325i7);
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
                if (i < 30 || !AbstractC0334ih.f2542d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0334ih.f2539a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0334ih.f2540b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0334ih.f2541c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f3144j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3140f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0325i7 runnableC0325i7 = this.f3146l;
        if (runnableC0325i7 != null) {
            C0485mh c0485mh = (C0485mh) runnableC0325i7.f2339b;
            c0485mh.f3146l = null;
            c0485mh.removeCallbacks(runnableC0325i7);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f3142h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0411kh c0411kh = null;
        if (drawable != null) {
            C0411kh c0411kh2 = new C0411kh();
            Drawable drawable2 = c0411kh2.f2839a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0411kh2.f2839a = drawable;
            drawable.setCallback(c0411kh2);
            c0411kh2.f2840b = true;
            c0411kh = c0411kh2;
        }
        this.f3141g = c0411kh;
        super.setSelector(c0411kh);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3136b = rect.left;
        this.f3137c = rect.top;
        this.f3138d = rect.right;
        this.f3139e = rect.bottom;
    }
}
