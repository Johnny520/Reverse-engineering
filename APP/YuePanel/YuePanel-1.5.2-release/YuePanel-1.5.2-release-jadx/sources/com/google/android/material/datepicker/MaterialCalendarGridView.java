package com.google.android.material.datepicker;

import Yue.C3024;
import Yue.C3055;
import Yue.C6600;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void gainFocus(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View getChildAtPosition(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static int horizontalMidPoint(@InterfaceC6391 View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean skipMonth(@InterfaceC6490 Long l, @InterfaceC6490 Long l2, @InterfaceC6490 Long l3, @InterfaceC6490 Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@InterfaceC6391 Canvas canvas) {
        int iDayToPosition;
        int iHorizontalMidPoint;
        int iDayToPosition2;
        int iHorizontalMidPoint2;
        int width;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        int iMax = Math.max(adapter.firstPositionInMonth(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.lastPositionInMonth(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<C6600<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            C6600<Long, Long> next = it.next();
            Long l = next.f2165;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.f2166 != null) {
                Long l2 = l;
                long jLongValue = l2.longValue();
                Long l3 = next.f2166;
                long jLongValue2 = l3.longValue();
                if (!skipMonth(item, item2, l2, l3)) {
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (jLongValue < item.longValue()) {
                        iHorizontalMidPoint = adapter.isFirstInRow(iMax) ? 0 : !zIsLayoutRtl ? materialCalendarGridView.getChildAtPosition(iMax - 1).getRight() : materialCalendarGridView.getChildAtPosition(iMax - 1).getLeft();
                        iDayToPosition = iMax;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue);
                        iDayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(iDayToPosition));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iHorizontalMidPoint2 = adapter.isLastInRow(iMin) ? getWidth() : !zIsLayoutRtl ? materialCalendarGridView.getChildAtPosition(iMin).getRight() : materialCalendarGridView.getChildAtPosition(iMin).getLeft();
                        iDayToPosition2 = iMin;
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue2);
                        iDayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        iHorizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(iDayToPosition2));
                    }
                    int itemId = (int) adapter.getItemId(iDayToPosition);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iDayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                        int top = childAtPosition.getTop() + calendarStyle.day.getTopInset();
                        MonthAdapter monthAdapter = adapter;
                        int bottom = childAtPosition.getBottom() - calendarStyle.day.getBottomInset();
                        if (zIsLayoutRtl) {
                            int i4 = iDayToPosition2 > numColumns2 ? 0 : iHorizontalMidPoint2;
                            width = numColumns > iDayToPosition ? getWidth() : iHorizontalMidPoint;
                            i = i4;
                        } else {
                            i = numColumns > iDayToPosition ? 0 : iHorizontalMidPoint;
                            width = iDayToPosition2 > numColumns2 ? getWidth() : iHorizontalMidPoint2;
                        }
                        canvas.drawRect(i, top, width, bottom, calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = monthAdapter;
                    }
                    materialCalendarGridView = this;
                    iMax = i2;
                    iMin = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.nestedScrollable) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C8273.f24691, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(C1980R.id.cancel_button);
            setNextFocusRightId(C1980R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        C8273.m27439(this, new C3024() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
                c3055.m6059(null);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: getAdapter()Landroid/widget/Adapter; */
    /* JADX DEBUG: Method merged with bridge method: getAdapter()Landroid/widget/ListAdapter; */
    @Override // android.widget.GridView, android.widget.AdapterView
    @InterfaceC6391
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }
}
