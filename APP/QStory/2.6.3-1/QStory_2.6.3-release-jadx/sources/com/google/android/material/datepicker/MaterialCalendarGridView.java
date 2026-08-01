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
import androidx.appcompat.widget.C1038;
import androidx.core.util.C3020;
import androidx.core.view.AbstractC3103;
import androidx.core.widget.C3125;
import androidx.recyclerview.widget.C3325;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Calendar;
import java.util.Iterator;
import p069.AbstractC7390;
import p321.C9469;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f10609;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC3972 f10610;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Calendar f10611;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10611 = AbstractC3953.m7694(null);
        if (C3968.m7700(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(C0328R.id.cancel_button);
            setNextFocusRightId(C0328R.id.confirm_button);
        }
        this.f10609 = C3968.m7700(getContext(), C0328R.attr.nestedScrollable);
        AbstractC3103.m4804(this, new C3125(3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7668(MaterialCalendarGridView materialCalendarGridView) {
        C3950 c3950 = (C3950) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f10739;
        if (AbstractC7390.m12627(context.getTheme(), C0328R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            C3325 c3325 = c3950.f10645;
            if (c3325 != null) {
                focusRingDrawable.f10740.f24704 = (C9469) ((C1038) c3325.f7807).f1097;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C3950) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C3950) super.getAdapter()).notifyDataSetChanged();
        post(new RunnableC3964(this, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iM7683;
        int width;
        int iM76832;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C3950 c3950 = (C3950) super.getAdapter();
        DateSelector dateSelector = c3950.f10647;
        Month month = c3950.f10648;
        C3325 c3325 = c3950.f10645;
        int iMax = Math.max(c3950.m7683(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(c3950.m7680(), materialCalendarGridView.getLastVisiblePosition());
        Long item = c3950.getItem(iMax);
        Long item2 = c3950.getItem(iMin);
        Iterator it = dateSelector.mo7660().iterator();
        while (it.hasNext()) {
            C3020 c3020 = (C3020) it.next();
            Object obj = c3020.f6805;
            Object obj2 = c3020.f6804;
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
                    c3950 = c3950;
                } else {
                    boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.f10611;
                    if (jLongValue < jLongValue3) {
                        width = iMax % month.f10613 == 0 ? 0 : !z ? materialCalendarGridView.m7671(iMax - 1).getRight() : materialCalendarGridView.m7671(iMax - 1).getLeft();
                        iM7683 = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iM7683 = c3950.m7683() + (calendar.get(5) - 1);
                        View viewM7671 = materialCalendarGridView.m7671(iM7683);
                        width = (viewM7671.getWidth() / 2) + viewM7671.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % month.f10613 == 0 ? materialCalendarGridView.getWidth() : !z ? materialCalendarGridView.m7671(iMin).getRight() : materialCalendarGridView.m7671(iMin).getLeft();
                        iM76832 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iM76832 = c3950.m7683() + (calendar.get(5) - 1);
                        View viewM76712 = materialCalendarGridView.m7671(iM76832);
                        width2 = (viewM76712.getWidth() / 2) + viewM76712.getLeft();
                    }
                    int itemId = (int) c3950.getItemId(iM7683);
                    Iterator it2 = it;
                    Month month2 = month;
                    int itemId2 = (int) c3950.getItemId(iM76832);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        C3950 c39502 = c3950;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewM76713 = materialCalendarGridView.m7671(numColumns);
                        int top2 = viewM76713.getTop() + ((Rect) ((C1038) c3325.f7807).f1094).top;
                        int i2 = itemId2;
                        int bottom = viewM76713.getBottom() - ((Rect) ((C1038) c3325.f7807).f1094).bottom;
                        if (z) {
                            int i3 = iM76832 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iM7683 ? getWidth() : width;
                            i = i3;
                            width3 = width4;
                        } else {
                            i = numColumns > iM7683 ? 0 : width;
                            width3 = iM76832 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top2, width3, bottom, (Paint) c3325.f7808);
                        itemId++;
                        materialCalendarGridView = this;
                        c3950 = c39502;
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
        int iM7684;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            C3950 c3950 = (C3950) super.getAdapter();
            iM7684 = c3950.m7684(c3950.m7680() + 1);
        } else if (i == 130 || i == 2) {
            C3950 c39502 = (C3950) super.getAdapter();
            iM7684 = c39502.m7685(c39502.m7683() - 1);
        } else {
            iM7684 = -1;
        }
        if (iM7684 != -1) {
            setSelection(iM7684);
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
            return m7670(selectedItemPosition, z);
        }
        if (i == 22) {
            return m7670(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iM7684 = keyEvent.isShiftPressed() ? ((C3950) super.getAdapter()).m7684(selectedItemPosition) : ((C3950) super.getAdapter()).m7685(selectedItemPosition);
            if (iM7684 == -1) {
                return false;
            }
            setSelection(iM7684);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        C3950 c3950 = (C3950) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || c3950.m7681(selectedItemPosition2)) {
            return true;
        }
        C3950 c39502 = (C3950) super.getAdapter();
        if (!m7669(selectedItemPosition2)) {
            if (19 == i) {
                int numColumns = getNumColumns();
                while (true) {
                    selectedItemPosition2 -= numColumns;
                    if (selectedItemPosition2 < c39502.m7683()) {
                        break;
                    }
                    if (m7669(selectedItemPosition2)) {
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
                    if (numColumns2 > c39502.m7680()) {
                        break;
                    }
                    if (m7669(numColumns2)) {
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
        if (!this.f10609) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C3950)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3950.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public void setOnMonthNavigationListener(InterfaceC3972 interfaceC3972) {
        this.f10610 = interfaceC3972;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((C3950) super.getAdapter()).m7685(r0.m7683() - 1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7669(int i) {
        C3950 c3950 = (C3950) super.getAdapter();
        if (!c3950.m7681(i)) {
            long itemId = c3950.getItemId(i);
            for (int i2 = 1; i2 < c3950.f10648.f10613; i2++) {
                int i3 = i + i2;
                if ((i3 < C3950.f10641 && c3950.getItemId(i3) == itemId && c3950.m7681(i3)) || ((i3 = i - i2) >= 0 && c3950.getItemId(i3) == itemId && c3950.m7681(i3))) {
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
    public final boolean m7670(int i, boolean z) {
        InterfaceC3972 interfaceC3972;
        InterfaceC3972 interfaceC39722;
        int iM7685 = z ? ((C3950) super.getAdapter()).m7685(i) : ((C3950) super.getAdapter()).m7684(i);
        if (iM7685 != -1) {
            setSelection(iM7685);
            return true;
        }
        if (!z && (interfaceC39722 = this.f10610) != null) {
            return MaterialCalendar.m7661(((C3969) interfaceC39722).f10703, false);
        }
        if (!z || (interfaceC3972 = this.f10610) == null) {
            return true;
        }
        return MaterialCalendar.m7661(((C3969) interfaceC3972).f10703, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View m7671(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3950 m7672() {
        return (C3950) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C3950) super.getAdapter();
    }
}
