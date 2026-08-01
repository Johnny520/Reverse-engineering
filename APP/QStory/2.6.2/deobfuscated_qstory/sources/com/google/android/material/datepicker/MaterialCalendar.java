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
import com.google.android.material.button.C3099;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends AbstractC3112 {

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public boolean f10242;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public View f10243;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public View f10244;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public AccessibilityManager f10245;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public C2452 f10246;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public View f10247;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public MaterialButton f10248;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public RecyclerView f10249;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public C2492 f10250;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public View f10251;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public RecyclerView f10252;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public Month f10253;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public CalendarSelector f10254;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public DateSelector f10255;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10256;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public DayViewDecorator f10257;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public CalendarConstraints f10258;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m7115(MaterialCalendar materialCalendar, boolean z) {
        Month month;
        if (materialCalendar.f10242) {
            return false;
        }
        if (materialCalendar.f10252.getScrollState() != 0) {
            return true;
        }
        C3113 c3113 = (C3113) materialCalendar.f10252.getAdapter();
        if (c3113 == null || (month = materialCalendar.f10253) == null) {
            return false;
        }
        int iM7132 = c3113.m7132(month) + (z ? 1 : -1);
        if (iM7132 < 0 || iM7132 >= c3113.f10279.f10232) {
            return false;
        }
        c3113.f10282 = z ? 2 : 1;
        materialCalendar.m7120(c3113.m7133(iM7132));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m7116(int i) {
        View view = this.f10244;
        if (view != null) {
            view.setEnabled(i + 1 < this.f10252.getAdapter().mo4784());
        }
        View view2 = this.f10251;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m7117() {
        Month month;
        C3113 c3113 = (C3113) this.f10252.getAdapter();
        if (c3113 == null || this.f10242 || (month = this.f10253) == null || month.equals(c3113.f10284)) {
            return;
        }
        int iM7132 = c3113.m7132(c3113.f10284);
        c3113.f10284 = month;
        int iM71322 = c3113.m7132(month);
        c3113.m4794(iM7132);
        c3113.m4794(iM71322);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m7118(View view) {
        if (view == null) {
            return;
        }
        CalendarSelector calendarSelector = this.f10254;
        if (calendarSelector == CalendarSelector.YEAR) {
            AbstractC2270.m4231(view, m4448(R.string.mtrl_picker_pane_title_year_view));
        } else if (calendarSelector == CalendarSelector.DAY) {
            AbstractC2270.m4231(view, m4448(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m7119(CalendarSelector calendarSelector) {
        this.f10254 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f10249.getLayoutManager().mo4656(this.f10253.f10267 - ((C3111) this.f10249.getAdapter()).f10275.f10258.f10235.f10267);
            this.f10243.setVisibility(0);
            this.f10247.setVisibility(8);
            this.f10251.setVisibility(8);
            this.f10244.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f10243.setVisibility(8);
            this.f10247.setVisibility(0);
            this.f10251.setVisibility(0);
            this.f10244.setVisibility(0);
            m7120(this.f10253);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m7120(Month month) {
        C3113 c3113 = (C3113) this.f10252.getAdapter();
        int iM7132 = c3113.m7132(month);
        AccessibilityManager accessibilityManager = this.f10245;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM71322 = iM7132 - c3113.m7132(this.f10253);
            int i = 1;
            boolean z = Math.abs(iM71322) > 3;
            boolean z2 = iM71322 > 0;
            this.f10253 = month;
            if (z && z2) {
                this.f10252.m4736(iM7132 - 3);
                this.f10252.post(new RunnableC2548(this, iM7132, i));
            } else {
                RecyclerView recyclerView = this.f10252;
                if (z) {
                    recyclerView.m4736(iM7132 + 3);
                    this.f10252.post(new RunnableC2548(this, iM7132, i));
                } else {
                    recyclerView.post(new RunnableC2548(this, iM7132, i));
                }
            }
        } else {
            this.f10253 = month;
            this.f10252.m4736(iM7132);
        }
        m7117();
        m7116(iM7132);
    }

    @Override // com.google.android.material.datepicker.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo7121(C3134 c3134) {
        this.f10276.add(c3134);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo4441(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10256);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f10255);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10258);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10257);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f10253);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4444(Bundle bundle) {
        super.mo4444(bundle);
        if (bundle == null) {
            bundle = this.f6904;
        }
        this.f10256 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10255 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f10258 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10257 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10253 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4445(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m4431(), this.f10256);
        this.f10250 = new C2492(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f10245 = (AccessibilityManager) m4425().getSystemService("accessibility");
        Month month = this.f10258.f10235;
        boolean zM7154 = C3135.m7154(contextThemeWrapper, android.R.attr.windowFullscreen);
        this.f10242 = zM7154;
        int i3 = 0;
        int i4 = 1;
        if (zM7154) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m4425().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = C3117.f10292;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        AbstractC2270.m4234(gridView, new C2292(i4));
        int i6 = this.f10258.f10229;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new C3147(i6) : new C3147()));
        gridView.setNumColumns(month.f10263);
        gridView.setEnabled(false);
        this.f10252 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.f10252.setLayoutManager(new C3145(this, i2, i2));
        this.f10252.setTag("MONTHS_VIEW_GROUP_TAG");
        C3113 c3113 = new C3113(contextThemeWrapper, this.f10255, this.f10258, this.f10257, new C3137(this), new C3136(this));
        this.f10252.setAdapter(c3113);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f10249 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f10249.setLayoutManager(new GridLayoutManager(integer));
            this.f10249.setAdapter(new C3111(this));
            this.f10249.m4721(new C3140(this));
        }
        if (!this.f10242) {
            C2452 c2452 = new C2452();
            this.f10246 = c2452;
            c2452.m4811(this.f10252);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f10248 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC2270.m4234(this.f10248, new C3099(this, i4));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.f10251 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            AbstractC0147.m600(this.f10251, m4448(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f10244 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            AbstractC0147.m600(this.f10244, m4448(R.string.mtrl_picker_next_month_tooltip));
            this.f10243 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f10247 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m7119(CalendarSelector.DAY);
            this.f10248.setText(this.f10253.m7130());
            this.f10252.addOnScrollListener(new C3141(this, c3113));
            this.f10248.setOnClickListener(new ViewOnClickListenerC3138(this));
            this.f10244.setOnClickListener(new ViewOnClickListenerC3144(this, c3113, i3));
            this.f10251.setOnClickListener(new ViewOnClickListenerC3144(this, c3113, i4));
            m7116(c3113.m7132(this.f10253));
        }
        this.f10252.m4736(c3113.m7132(this.f10253));
        AbstractC2270.m4234(this.f10252, new C2292(2));
        m7118(viewInflate);
        return viewInflate;
    }
}
