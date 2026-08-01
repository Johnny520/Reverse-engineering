package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0191;
import androidx.core.util.C2187;
import androidx.core.view.AbstractC2270;
import androidx.core.widget.C2292;
import androidx.recyclerview.widget.C2492;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Calendar;
import java.util.Iterator;
import p251.AbstractC8174;
import p305.C8648;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f10259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC3139 f10260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Calendar f10261;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10261 = AbstractC3120.m7148(null);
        if (C3135.m7154(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.davemorrissey.labs.subscaleview.R.id.cancel_button);
            setNextFocusRightId(com.davemorrissey.labs.subscaleview.R.id.confirm_button);
        }
        this.f10259 = C3135.m7154(getContext(), com.davemorrissey.labs.subscaleview.R.attr.nestedScrollable);
        AbstractC2270.m4234(this, new C2292(3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7122(MaterialCalendarGridView materialCalendarGridView) {
        C3117 c3117 = (C3117) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f10389;
        if (AbstractC8174.m13596(context.getTheme(), com.davemorrissey.labs.subscaleview.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            C2492 c2492 = c3117.f10295;
            if (c2492 != null) {
                focusRingDrawable.f10390.f24368 = (C8648) ((C0191) c2492.f7461).f752;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C3117) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C3117) super.getAdapter()).notifyDataSetChanged();
        post(new RunnableC3131(this, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM7137;
        int width;
        int iM71372;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C3117 c3117 = (C3117) super.getAdapter();
        DateSelector dateSelector = c3117.f10297;
        Month month = c3117.f10298;
        C2492 c2492 = c3117.f10295;
        int iMax = Math.max(c3117.m7137(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(c3117.m7134(), materialCalendarGridView.getLastVisiblePosition());
        Long item = c3117.getItem(iMax);
        Long item2 = c3117.getItem(iMin);
        Iterator it = dateSelector.mo7114().iterator();
        while (it.hasNext()) {
            C2187 c2187 = (C2187) it.next();
            Object obj = c2187.f6459;
            Object obj2 = c2187.f6458;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (obj2 != null) {
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj2;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    month = month;
                    it = it;
                    c3117 = c3117;
                } else {
                    boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.f10261;
                    if (jLongValue < jLongValue3) {
                        width = iMax % month.f10263 == 0 ? 0 : !z ? materialCalendarGridView.m7125(iMax - 1).getRight() : materialCalendarGridView.m7125(iMax - 1).getLeft();
                        iM7137 = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iM7137 = c3117.m7137() + (calendar.get(5) - 1);
                        View viewM7125 = materialCalendarGridView.m7125(iM7137);
                        width = (viewM7125.getWidth() / 2) + viewM7125.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % month.f10263 == 0 ? materialCalendarGridView.getWidth() : !z ? materialCalendarGridView.m7125(iMin).getRight() : materialCalendarGridView.m7125(iMin).getLeft();
                        iM71372 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iM71372 = c3117.m7137() + (calendar.get(5) - 1);
                        View viewM71252 = materialCalendarGridView.m7125(iM71372);
                        width2 = (viewM71252.getWidth() / 2) + viewM71252.getLeft();
                    }
                    int itemId = (int) c3117.getItemId(iM7137);
                    Iterator it2 = it;
                    Month month2 = month;
                    int itemId2 = (int) c3117.getItemId(iM71372);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        C3117 c31172 = c3117;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewM71253 = materialCalendarGridView.m7125(numColumns);
                        int top2 = viewM71253.getTop() + ((Rect) ((C0191) c2492.f7461).f749).top;
                        int i2 = itemId2;
                        int bottom = viewM71253.getBottom() - ((Rect) ((C0191) c2492.f7461).f749).bottom;
                        if (z) {
                            int i3 = iM71372 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iM7137 ? getWidth() : width;
                            i = i3;
                            width3 = width4;
                        } else {
                            i = numColumns > iM7137 ? 0 : width;
                            width3 = iM71372 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top2, width3, bottom, (Paint) c2492.f7462);
                        itemId++;
                        materialCalendarGridView = this;
                        c3117 = c31172;
                        itemId2 = i2;
                    }
                    materialCalendarGridView = this;
                    month = month2;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iM7138;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            C3117 c3117 = (C3117) super.getAdapter();
            iM7138 = c3117.m7138(c3117.m7134() + 1);
        } else if (i == 130 || i == 2) {
            C3117 c31172 = (C3117) super.getAdapter();
            iM7138 = c31172.m7139(c31172.m7137() - 1);
        } else {
            iM7138 = -1;
        }
        if (iM7138 != -1) {
            setSelection(iM7138);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return m7124(selectedItemPosition, z);
        }
        if (i == 22) {
            return m7124(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iM7138 = keyEvent.isShiftPressed() ? ((C3117) super.getAdapter()).m7138(selectedItemPosition) : ((C3117) super.getAdapter()).m7139(selectedItemPosition);
            if (iM7138 == -1) {
                return false;
            }
            setSelection(iM7138);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        C3117 c3117 = (C3117) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || c3117.m7135(selectedItemPosition2)) {
            return true;
        }
        C3117 c31172 = (C3117) super.getAdapter();
        if (!m7123(selectedItemPosition2)) {
            if (19 == i) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 -= numColumns;
                    if (selectedItemPosition2 < c31172.m7137()) {
                        break;
                    }
                    if (m7123(selectedItemPosition2)) {
                        break;
                    }
                    numColumns = getNumColumns();
                }
                return false;
            }
            if (i == 20) {
                int numColumns2 = getNumColumns();
                while (true) {
                    numColumns2 += selectedItemPosition2;
                    if (numColumns2 > c31172.m7134()) {
                        break;
                    }
                    if (m7123(numColumns2)) {
                        break;
                    }
                    selectedItemPosition2 = getNumColumns();
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f10259) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C3117)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3117.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public void setOnMonthNavigationListener(InterfaceC3139 interfaceC3139) {
        this.f10260 = interfaceC3139;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((C3117) super.getAdapter()).m7139(r0.m7137() - 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7123(int i) {
        C3117 c3117 = (C3117) super.getAdapter();
        if (!c3117.m7135(i)) {
            long itemId = c3117.getItemId(i);
            for (int i2 = 1; i2 < c3117.f10298.f10263; i2++) {
                int i3 = i + i2;
                if ((i3 < C3117.f10291 && c3117.getItemId(i3) == itemId && c3117.m7135(i3)) || ((i3 = i - i2) >= 0 && c3117.getItemId(i3) == itemId && c3117.m7135(i3))) {
                    i = i3;
                    break;
                }
            }
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m7124(int i, boolean z) {
        InterfaceC3139 interfaceC3139;
        InterfaceC3139 interfaceC31392;
        int iM7139 = z ? ((C3117) super.getAdapter()).m7139(i) : ((C3117) super.getAdapter()).m7138(i);
        if (iM7139 != -1) {
            setSelection(iM7139);
            return true;
        }
        if (!z && (interfaceC31392 = this.f10260) != null) {
            return MaterialCalendar.m7115(((C3136) interfaceC31392).f10353, false);
        }
        if (!z || (interfaceC3139 = this.f10260) == null) {
            return true;
        }
        return MaterialCalendar.m7115(((C3136) interfaceC3139).f10353, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m7125(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3117 m7126() {
        return (C3117) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C3117) super.getAdapter();
    }
}
