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
import p053.AbstractC6561;
import p305.C8640;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f10264;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC3140 f10265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Calendar f10266;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10266 = AbstractC3121.m7135(null);
        if (C3136.m7141(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.davemorrissey.labs.subscaleview.R.id.cancel_button);
            setNextFocusRightId(com.davemorrissey.labs.subscaleview.R.id.confirm_button);
        }
        this.f10264 = C3136.m7141(getContext(), com.davemorrissey.labs.subscaleview.R.attr.nestedScrollable);
        AbstractC2270.m4244(this, new C2292(3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7109(MaterialCalendarGridView materialCalendarGridView) {
        C3118 c3118 = (C3118) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f10394;
        if (AbstractC6561.m12068(context.getTheme(), com.davemorrissey.labs.subscaleview.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            C2492 c2492 = c3118.f10300;
            if (c2492 != null) {
                focusRingDrawable.f10395.f24359 = (C8640) ((C0191) c2492.f7462).f752;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C3118) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C3118) super.getAdapter()).notifyDataSetChanged();
        post(new RunnableC3132(this, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM7124;
        int width;
        int iM71242;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C3118 c3118 = (C3118) super.getAdapter();
        DateSelector dateSelector = c3118.f10302;
        Month month = c3118.f10303;
        C2492 c2492 = c3118.f10300;
        int iMax = Math.max(c3118.m7124(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(c3118.m7121(), materialCalendarGridView.getLastVisiblePosition());
        Long item = c3118.getItem(iMax);
        Long item2 = c3118.getItem(iMin);
        Iterator it = dateSelector.mo7101().iterator();
        while (it.hasNext()) {
            C2187 c2187 = (C2187) it.next();
            Object obj = c2187.f6460;
            Object obj2 = c2187.f6459;
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
                    c3118 = c3118;
                } else {
                    boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.f10266;
                    if (jLongValue < jLongValue3) {
                        width = iMax % month.f10268 == 0 ? 0 : !z ? materialCalendarGridView.m7112(iMax - 1).getRight() : materialCalendarGridView.m7112(iMax - 1).getLeft();
                        iM7124 = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iM7124 = c3118.m7124() + (calendar.get(5) - 1);
                        View viewM7112 = materialCalendarGridView.m7112(iM7124);
                        width = (viewM7112.getWidth() / 2) + viewM7112.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % month.f10268 == 0 ? materialCalendarGridView.getWidth() : !z ? materialCalendarGridView.m7112(iMin).getRight() : materialCalendarGridView.m7112(iMin).getLeft();
                        iM71242 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iM71242 = c3118.m7124() + (calendar.get(5) - 1);
                        View viewM71122 = materialCalendarGridView.m7112(iM71242);
                        width2 = (viewM71122.getWidth() / 2) + viewM71122.getLeft();
                    }
                    int itemId = (int) c3118.getItemId(iM7124);
                    Iterator it2 = it;
                    Month month2 = month;
                    int itemId2 = (int) c3118.getItemId(iM71242);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        C3118 c31182 = c3118;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewM71123 = materialCalendarGridView.m7112(numColumns);
                        int top2 = viewM71123.getTop() + ((Rect) ((C0191) c2492.f7462).f749).top;
                        int i2 = itemId2;
                        int bottom = viewM71123.getBottom() - ((Rect) ((C0191) c2492.f7462).f749).bottom;
                        if (z) {
                            int i3 = iM71242 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iM7124 ? getWidth() : width;
                            i = i3;
                            width3 = width4;
                        } else {
                            i = numColumns > iM7124 ? 0 : width;
                            width3 = iM71242 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top2, width3, bottom, (Paint) c2492.f7463);
                        itemId++;
                        materialCalendarGridView = this;
                        c3118 = c31182;
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
        int iM7125;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            C3118 c3118 = (C3118) super.getAdapter();
            iM7125 = c3118.m7125(c3118.m7121() + 1);
        } else if (i == 130 || i == 2) {
            C3118 c31182 = (C3118) super.getAdapter();
            iM7125 = c31182.m7126(c31182.m7124() - 1);
        } else {
            iM7125 = -1;
        }
        if (iM7125 != -1) {
            setSelection(iM7125);
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
            return m7111(selectedItemPosition, z);
        }
        if (i == 22) {
            return m7111(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iM7125 = keyEvent.isShiftPressed() ? ((C3118) super.getAdapter()).m7125(selectedItemPosition) : ((C3118) super.getAdapter()).m7126(selectedItemPosition);
            if (iM7125 == -1) {
                return false;
            }
            setSelection(iM7125);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        C3118 c3118 = (C3118) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || c3118.m7122(selectedItemPosition2)) {
            return true;
        }
        C3118 c31182 = (C3118) super.getAdapter();
        if (!m7110(selectedItemPosition2)) {
            if (19 == i) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 -= numColumns;
                    if (selectedItemPosition2 < c31182.m7124()) {
                        break;
                    }
                    if (m7110(selectedItemPosition2)) {
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
                    if (numColumns2 > c31182.m7121()) {
                        break;
                    }
                    if (m7110(numColumns2)) {
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
        if (!this.f10264) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C3118)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3118.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public void setOnMonthNavigationListener(InterfaceC3140 interfaceC3140) {
        this.f10265 = interfaceC3140;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((C3118) super.getAdapter()).m7126(r0.m7124() - 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7110(int i) {
        C3118 c3118 = (C3118) super.getAdapter();
        if (!c3118.m7122(i)) {
            long itemId = c3118.getItemId(i);
            for (int i2 = 1; i2 < c3118.f10303.f10268; i2++) {
                int i3 = i + i2;
                if ((i3 < C3118.f10296 && c3118.getItemId(i3) == itemId && c3118.m7122(i3)) || ((i3 = i - i2) >= 0 && c3118.getItemId(i3) == itemId && c3118.m7122(i3))) {
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
    public final boolean m7111(int i, boolean z) {
        InterfaceC3140 interfaceC3140;
        InterfaceC3140 interfaceC31402;
        int iM7126 = z ? ((C3118) super.getAdapter()).m7126(i) : ((C3118) super.getAdapter()).m7125(i);
        if (iM7126 != -1) {
            setSelection(iM7126);
            return true;
        }
        if (!z && (interfaceC31402 = this.f10265) != null) {
            return MaterialCalendar.m7102(((C3137) interfaceC31402).f10358, false);
        }
        if (!z || (interfaceC3140 = this.f10265) == null) {
            return true;
        }
        return MaterialCalendar.m7102(((C3137) interfaceC3140).f10358, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m7112(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3118 m7113() {
        return (C3118) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C3118) super.getAdapter();
    }
}
