package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AbstractC0994;
import androidx.core.view.AbstractC3103;
import androidx.core.widget.C3125;
import androidx.recyclerview.widget.C3285;
import androidx.recyclerview.widget.C3325;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.RunnableC3381;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.C3932;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends AbstractC3945 {

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public boolean f10592;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public View f10593;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public View f10594;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public AccessibilityManager f10595;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public C3285 f10596;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public View f10597;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public MaterialButton f10598;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public RecyclerView f10599;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public C3325 f10600;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public View f10601;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public RecyclerView f10602;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public Month f10603;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public CalendarSelector f10604;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public DateSelector f10605;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10606;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public DayViewDecorator f10607;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public CalendarConstraints f10608;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m7661(MaterialCalendar materialCalendar, boolean z) {
        Month month;
        if (materialCalendar.f10592) {
            return false;
        }
        if (materialCalendar.f10602.getScrollState() != 0) {
            return true;
        }
        C3946 c3946 = (C3946) materialCalendar.f10602.getAdapter();
        if (c3946 == null || (month = materialCalendar.f10603) == null) {
            return false;
        }
        int iM7678 = c3946.m7678(month) + (z ? 1 : -1);
        if (iM7678 < 0 || iM7678 >= c3946.f10629.f10582) {
            return false;
        }
        c3946.f10632 = z ? 2 : 1;
        materialCalendar.m7666(c3946.m7679(iM7678));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7662(int i) {
        View view = this.f10594;
        if (view != null) {
            view.setEnabled(i + 1 < this.f10602.getAdapter().mo5354());
        }
        View view2 = this.f10601;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7663() {
        Month month;
        C3946 c3946 = (C3946) this.f10602.getAdapter();
        if (c3946 == null || this.f10592 || (month = this.f10603) == null || month.equals(c3946.f10634)) {
            return;
        }
        int iM7678 = c3946.m7678(c3946.f10634);
        c3946.f10634 = month;
        int iM76782 = c3946.m7678(month);
        c3946.m5364(iM7678);
        c3946.m5364(iM76782);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m7664(View view) {
        if (view == null) {
            return;
        }
        CalendarSelector calendarSelector = this.f10604;
        if (calendarSelector == CalendarSelector.YEAR) {
            AbstractC3103.m4801(view, m5018(C0328R.string.mtrl_picker_pane_title_year_view));
        } else if (calendarSelector == CalendarSelector.DAY) {
            AbstractC3103.m4801(view, m5018(C0328R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m7665(CalendarSelector calendarSelector) {
        this.f10604 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f10599.getLayoutManager().mo5226(this.f10603.f10617 - ((C3944) this.f10599.getAdapter()).f10625.f10608.f10585.f10617);
            this.f10593.setVisibility(0);
            this.f10597.setVisibility(8);
            this.f10601.setVisibility(8);
            this.f10594.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f10593.setVisibility(8);
            this.f10597.setVisibility(0);
            this.f10601.setVisibility(0);
            this.f10594.setVisibility(0);
            m7666(this.f10603);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m7666(Month month) {
        C3946 c3946 = (C3946) this.f10602.getAdapter();
        int iM7678 = c3946.m7678(month);
        AccessibilityManager accessibilityManager = this.f10595;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM76782 = iM7678 - c3946.m7678(this.f10603);
            int i = 1;
            boolean z = Math.abs(iM76782) > 3;
            boolean z2 = iM76782 > 0;
            this.f10603 = month;
            if (z && z2) {
                this.f10602.m5306(iM7678 - 3);
                this.f10602.post(new RunnableC3381(this, iM7678, i));
            } else {
                RecyclerView recyclerView = this.f10602;
                if (z) {
                    recyclerView.m5306(iM7678 + 3);
                    this.f10602.post(new RunnableC3381(this, iM7678, i));
                } else {
                    recyclerView.post(new RunnableC3381(this, iM7678, i));
                }
            }
        } else {
            this.f10603 = month;
            this.f10602.m5306(iM7678);
        }
        m7663();
        m7662(iM7678);
    }

    @Override // com.google.android.material.datepicker.AbstractC3945
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo7667(C3967 c3967) {
        this.f10626.add(c3967);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo5011(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10606);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10605);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10608);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10607);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10603);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5014(Bundle bundle) {
        super.mo5014(bundle);
        if (bundle == null) {
            bundle = this.f7250;
        }
        this.f10606 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10605 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10608 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10607 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10603 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo5015(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m5001(), this.f10606);
        this.f10600 = new C3325(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f10595 = (AccessibilityManager) m4995().getSystemService("accessibility");
        Month month = this.f10608.f10585;
        boolean zM7700 = C3968.m7700(contextThemeWrapper, R.attr.windowFullscreen);
        this.f10592 = zM7700;
        int i3 = 0;
        int i4 = 1;
        if (zM7700) {
            i = C0328R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C0328R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m4995().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C0328R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0328R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = C3950.f10642;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(C0328R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(C0328R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(C0328R.id.mtrl_calendar_days_of_week);
        AbstractC3103.m4804(gridView, new C3125(i4));
        int i6 = this.f10608.f10579;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new C3980(i6) : new C3980()));
        gridView.setNumColumns(month.f10613);
        gridView.setEnabled(false);
        this.f10602 = (RecyclerView) viewInflate.findViewById(C0328R.id.mtrl_calendar_months);
        this.f10602.setLayoutManager(new C3978(this, i2, i2));
        this.f10602.setTag("MONTHS_VIEW_GROUP_TAG");
        C3946 c3946 = new C3946(contextThemeWrapper, this.f10605, this.f10608, this.f10607, new C3970(this), new C3969(this));
        this.f10602.setAdapter(c3946);
        int integer = contextThemeWrapper.getResources().getInteger(C0328R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C0328R.id.mtrl_calendar_year_selector_frame);
        this.f10599 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10599.setLayoutManager(new GridLayoutManager(integer));
            this.f10599.setAdapter(new C3944(this));
            this.f10599.m5291(new C3973(this));
        }
        if (!this.f10592) {
            C3285 c3285 = new C3285();
            this.f10596 = c3285;
            c3285.m5381(this.f10602);
        }
        if (viewInflate.findViewById(C0328R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(C0328R.id.month_navigation_fragment_toggle);
            this.f10598 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC3103.m4804(this.f10598, new C3932(this, i4));
            View viewFindViewById = viewInflate.findViewById(C0328R.id.month_navigation_previous);
            this.f10601 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            AbstractC0994.m1161(this.f10601, m5018(C0328R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(C0328R.id.month_navigation_next);
            this.f10594 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            AbstractC0994.m1161(this.f10594, m5018(C0328R.string.mtrl_picker_next_month_tooltip));
            this.f10593 = viewInflate.findViewById(C0328R.id.mtrl_calendar_year_selector_frame);
            this.f10597 = viewInflate.findViewById(C0328R.id.mtrl_calendar_day_selector_frame);
            m7665(CalendarSelector.DAY);
            this.f10598.setText(this.f10603.m7676());
            this.f10602.addOnScrollListener(new C3974(this, c3946));
            this.f10598.setOnClickListener(new ViewOnClickListenerC3971(this));
            this.f10594.setOnClickListener(new ViewOnClickListenerC3977(this, c3946, i3));
            this.f10601.setOnClickListener(new ViewOnClickListenerC3977(this, c3946, i4));
            m7662(c3946.m7678(this.f10603));
        }
        this.f10602.m5306(c3946.m7678(this.f10603));
        AbstractC3103.m4804(this.f10602, new C3125(2));
        m7664(viewInflate);
        return viewInflate;
    }
}
