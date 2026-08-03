package com.google.android.material.datepicker;

import Yue.C3024;
import Yue.C3055;
import Yue.C6600;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C8988;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1980R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";

    @InterfaceC6490
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;

    @InterfaceC6490
    private Month current;

    @InterfaceC6490
    private DateSelector<S> dateSelector;
    private View dayFrame;

    @InterfaceC6490
    private DayViewDecorator dayViewDecorator;
    private View monthNext;
    private View monthPrev;
    private RecyclerView recyclerView;

    @InterfaceC7651
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;

    @InterfaceC8392
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";

    @InterfaceC8392
    static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";

    @InterfaceC8392
    static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";

    @InterfaceC8392
    static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public interface OnDayClickListener {
        void onDayClick(long j);
    }

    private void addActionsToMonthNavigation(@InterfaceC6391 View view, @InterfaceC6391 final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(C1980R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        C8273.m27439(materialButton, new C3024() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view2, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view2, c3055);
                c3055.m6074(MaterialCalendar.this.dayFrame.getVisibility() == 0 ? MaterialCalendar.this.getString(C1980R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(C1980R.string.mtrl_picker_toggle_to_day_selection));
            }
        });
        View viewFindViewById = view.findViewById(C1980R.id.month_navigation_previous);
        this.monthPrev = viewFindViewById;
        viewFindViewById.setTag(NAVIGATION_PREV_TAG);
        View viewFindViewById2 = view.findViewById(C1980R.id.month_navigation_next);
        this.monthNext = viewFindViewById2;
        viewFindViewById2.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(C1980R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(C1980R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new RecyclerView.AbstractC8926() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
            public void onScrollStateChanged(@InterfaceC6391 RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
            public void onScrolled(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
                int iFindFirstVisibleItemPosition = i < 0 ? MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() : MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(iFindFirstVisibleItemPosition));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        this.monthNext.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition));
                }
            }
        });
        this.monthPrev.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                if (iFindLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition));
                }
            }
        });
    }

    @InterfaceC6391
    private RecyclerView.AbstractC8918 createItemDecoration() {
        return new RecyclerView.AbstractC8918() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            private final Calendar startItem = UtcDates.getUtcCalendar();
            private final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
            public void onDraw(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.C8935 c8935) {
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (C6600<Long, Long> c6600 : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        Long l = c6600.f2165;
                        if (l != null && c6600.f2166 != null) {
                            this.startItem.setTimeInMillis(l.longValue());
                            this.endItem.setTimeInMillis(c6600.f2166.longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int iM30156 = positionForYear / gridLayoutManager.m30156();
                            int iM301562 = positionForYear2 / gridLayoutManager.m30156();
                            int i = iM30156;
                            while (i <= iM301562) {
                                if (gridLayoutManager.findViewByPosition(gridLayoutManager.m30156() * i) != null) {
                                    canvas.drawRect((i != iM30156 || viewFindViewByPosition == null) ? 0 : viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2), r9.getTop() + MaterialCalendar.this.calendarStyle.year.getTopInset(), (i != iM301562 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset(), MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        };
    }

    @InterfaceC6844
    public static int getDayHeight(@InterfaceC6391 Context context) {
        return context.getResources().getDimensionPixelSize(C1980R.dimen.mtrl_calendar_day_height);
    }

    private static int getDialogPickerHeight(@InterfaceC6391 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C1980R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C1980R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C1980R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C1980R.dimen.mtrl_calendar_days_of_week_height);
        int i = MonthAdapter.MAXIMUM_WEEKS;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C1980R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C1980R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C1980R.dimen.mtrl_calendar_bottom_padding);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <T> MaterialCalendar<T> newInstance(@InterfaceC6391 DateSelector<T> dateSelector, @InterfaceC7651 int i, @InterfaceC6391 CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }

    private void postSmoothRecyclerViewScroll(final int i) {
        this.recyclerView.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i);
            }
        });
    }

    private void setUpForAccessibility() {
        C8273.m27439(this.recyclerView, new C3024() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
                c3055.m6097(false);
            }
        });
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@InterfaceC6391 OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @InterfaceC6490
    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    @InterfaceC6490
    public Month getCurrentMonth() {
        return this.current;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    @InterfaceC6490
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    @InterfaceC6391
    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@InterfaceC6490 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC6391
    public View onCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = C1980R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C1980R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(C1980R.id.mtrl_calendar_days_of_week);
        C8273.m27439(gridView, new C3024() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
                c3055.m6059(null);
            }
        });
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new DaysOfWeekAdapter(firstDayOfWeek) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) viewInflate.findViewById(C1980R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@InterfaceC6391 RecyclerView.C8935 c8935, @InterfaceC6391 int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                    iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
                }
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: com.google.android.material.datepicker.OnSelectionChangedListener */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j)) {
                    MaterialCalendar.this.dateSelector.select(j);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C1980R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C1980R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (viewInflate.findViewById(C1980R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(viewInflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new C8988().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        setUpForAccessibility();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@InterfaceC6391 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void setCurrentMonth(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = Math.abs(position2) > 3;
        boolean z2 = position2 > 0;
        this.current = month;
        if (z && z2) {
            this.recyclerView.scrollToPosition(position - 3);
            postSmoothRecyclerViewScroll(position);
        } else if (!z) {
            postSmoothRecyclerViewScroll(position);
        } else {
            this.recyclerView.scrollToPosition(position + 3);
            postSmoothRecyclerViewScroll(position);
        }
    }

    public void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector = this.calendarSelector;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            setSelector(calendarSelector2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <T> MaterialCalendar<T> newInstance(@InterfaceC6391 DateSelector<T> dateSelector, @InterfaceC7651 int i, @InterfaceC6391 CalendarConstraints calendarConstraints, @InterfaceC6490 DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}
