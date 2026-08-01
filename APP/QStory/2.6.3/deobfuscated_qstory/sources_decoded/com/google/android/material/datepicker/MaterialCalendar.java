package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AbstractC0147;
import androidx.core.view.AbstractC2270;
import androidx.core.widget.C2292;
import androidx.recyclerview.widget.C2452;
import androidx.recyclerview.widget.C2492;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.RunnableC2548;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.button.C3100;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends AbstractC3113 {

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public boolean f10247;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public View f10248;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public View f10249;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public AccessibilityManager f10250;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public C2452 f10251;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public View f10252;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public MaterialButton f10253;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public RecyclerView f10254;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public C2492 f10255;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public View f10256;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public RecyclerView f10257;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public Month f10258;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public CalendarSelector f10259;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public DateSelector f10260;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10261;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public DayViewDecorator f10262;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public CalendarConstraints f10263;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m7102(MaterialCalendar materialCalendar, boolean z) {
        Month month;
        if (materialCalendar.f10247) {
            return false;
        }
        if (materialCalendar.f10257.getScrollState() != 0) {
            return true;
        }
        C3114 c3114 = (C3114) materialCalendar.f10257.getAdapter();
        if (c3114 == null || (month = materialCalendar.f10258) == null) {
            return false;
        }
        int iM7119 = c3114.m7119(month) + (z ? 1 : -1);
        if (iM7119 < 0 || iM7119 >= c3114.f10284.f10237) {
            return false;
        }
        c3114.f10287 = z ? 2 : 1;
        materialCalendar.m7107(c3114.m7120(iM7119));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7103(int i) {
        View view = this.f10249;
        if (view != null) {
            view.setEnabled(i + 1 < this.f10257.getAdapter().mo4794());
        }
        View view2 = this.f10256;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7104() {
        Month month;
        C3114 c3114 = (C3114) this.f10257.getAdapter();
        if (c3114 == null || this.f10247 || (month = this.f10258) == null || month.equals(c3114.f10289)) {
            return;
        }
        int iM7119 = c3114.m7119(c3114.f10289);
        c3114.f10289 = month;
        int iM71192 = c3114.m7119(month);
        c3114.m4804(iM7119);
        c3114.m4804(iM71192);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m7105(View view) {
        if (view == null) {
            return;
        }
        CalendarSelector calendarSelector = this.f10259;
        if (calendarSelector == CalendarSelector.YEAR) {
            AbstractC2270.m4241(view, m4458(R.string.mtrl_picker_pane_title_year_view));
        } else if (calendarSelector == CalendarSelector.DAY) {
            AbstractC2270.m4241(view, m4458(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m7106(CalendarSelector calendarSelector) {
        this.f10259 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f10254.getLayoutManager().mo4666(this.f10258.f10272 - ((C3112) this.f10254.getAdapter()).f10280.f10263.f10240.f10272);
            this.f10248.setVisibility(0);
            this.f10252.setVisibility(8);
            this.f10256.setVisibility(8);
            this.f10249.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f10248.setVisibility(8);
            this.f10252.setVisibility(0);
            this.f10256.setVisibility(0);
            this.f10249.setVisibility(0);
            m7107(this.f10258);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m7107(Month month) {
        C3114 c3114 = (C3114) this.f10257.getAdapter();
        int iM7119 = c3114.m7119(month);
        AccessibilityManager accessibilityManager = this.f10250;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM71192 = iM7119 - c3114.m7119(this.f10258);
            int i = 1;
            boolean z = Math.abs(iM71192) > 3;
            boolean z2 = iM71192 > 0;
            this.f10258 = month;
            if (z && z2) {
                this.f10257.m4746(iM7119 - 3);
                this.f10257.post(new RunnableC2548(this, iM7119, i));
            } else {
                RecyclerView recyclerView = this.f10257;
                if (z) {
                    recyclerView.m4746(iM7119 + 3);
                    this.f10257.post(new RunnableC2548(this, iM7119, i));
                } else {
                    recyclerView.post(new RunnableC2548(this, iM7119, i));
                }
            }
        } else {
            this.f10258 = month;
            this.f10257.m4746(iM7119);
        }
        m7104();
        m7103(iM7119);
    }

    @Override // com.google.android.material.datepicker.AbstractC3113
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo7108(C3135 c3135) {
        this.f10281.add(c3135);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo4451(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10261);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10260);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10263);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10262);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10258);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4454(Bundle bundle) {
        super.mo4454(bundle);
        if (bundle == null) {
            bundle = this.f6905;
        }
        this.f10261 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10260 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10263 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10262 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10258 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m4441(), this.f10261);
        this.f10255 = new C2492(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f10250 = (AccessibilityManager) m4435().getSystemService("accessibility");
        Month month = this.f10263.f10240;
        boolean zM7141 = C3136.m7141(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.f10247 = zM7141;
        int i3 = 0;
        int i4 = 1;
        if (zM7141) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m4435().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = C3118.f10297;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        AbstractC2270.m4244(gridView, new C2292(i4));
        int i6 = this.f10263.f10234;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new C3148(i6) : new C3148()));
        gridView.setNumColumns(month.f10268);
        gridView.setEnabled(false);
        this.f10257 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f10257.setLayoutManager(new C3146(this, i2, i2));
        this.f10257.setTag("MONTHS_VIEW_GROUP_TAG");
        C3114 c3114 = new C3114(contextThemeWrapper, this.f10260, this.f10263, this.f10262, new C3138(this), new C3137(this));
        this.f10257.setAdapter(c3114);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f10254 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10254.setLayoutManager(new GridLayoutManager(integer));
            this.f10254.setAdapter(new C3112(this));
            this.f10254.m4731(new C3141(this));
        }
        if (!this.f10247) {
            C2452 c2452 = new C2452();
            this.f10251 = c2452;
            c2452.m4821(this.f10257);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f10253 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC2270.m4244(this.f10253, new C3100(this, i4));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.f10256 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            AbstractC0147.m601(this.f10256, m4458(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f10249 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            AbstractC0147.m601(this.f10249, m4458(R.string.mtrl_picker_next_month_tooltip));
            this.f10248 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f10252 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m7106(CalendarSelector.DAY);
            this.f10253.setText(this.f10258.m7117());
            this.f10257.addOnScrollListener(new C3142(this, c3114));
            this.f10253.setOnClickListener(new ViewOnClickListenerC3139(this));
            this.f10249.setOnClickListener(new ViewOnClickListenerC3145(this, c3114, i3));
            this.f10256.setOnClickListener(new ViewOnClickListenerC3145(this, c3114, i4));
            m7103(c3114.m7119(this.f10258));
        }
        this.f10257.m4746(c3114.m7119(this.f10258));
        AbstractC2270.m4244(this.f10257, new C2292(2));
        m7105(viewInflate);
        return viewInflate;
    }
}
