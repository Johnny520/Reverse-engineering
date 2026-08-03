package p000;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1277c;

/* JADX INFO: renamed from: Mq */
/* JADX INFO: loaded from: classes.dex */
public final class C0549Mq<S> extends AbstractC0595Nt {

    /* JADX INFO: renamed from: U */
    public int f1774U;

    /* JADX INFO: renamed from: V */
    public C0136D6 f1775V;

    /* JADX INFO: renamed from: W */
    public C1469gs f1776W;

    /* JADX INFO: renamed from: X */
    public int f1777X;

    /* JADX INFO: renamed from: Y */
    public C0649P3 f1778Y;

    /* JADX INFO: renamed from: Z */
    public RecyclerView f1779Z;

    /* JADX INFO: renamed from: a0 */
    public RecyclerView f1780a0;

    /* JADX INFO: renamed from: b0 */
    public View f1781b0;

    /* JADX INFO: renamed from: c0 */
    public View f1782c0;

    /* JADX INFO: renamed from: d0 */
    public View f1783d0;

    /* JADX INFO: renamed from: e0 */
    public View f1784e0;

    /* JADX INFO: renamed from: f0 */
    public MaterialButton f1785f0;

    /* JADX INFO: renamed from: g0 */
    public AccessibilityManager f1786g0;

    /* JADX INFO: renamed from: C */
    public final void m1040C(C1469gs c1469gs) {
        C1277c c1277c = (C1277c) this.f1780a0.getAdapter();
        int iM2823d = c1277c.f4534a.f349a.m2823d(c1469gs);
        AccessibilityManager accessibilityManager = this.f1786g0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM2823d2 = iM2823d - c1277c.f4534a.f349a.m2823d(this.f1776W);
            boolean z = Math.abs(iM2823d2) > 3;
            boolean z2 = iM2823d2 > 0;
            this.f1776W = c1469gs;
            if (z && z2) {
                this.f1780a0.scrollToPosition(iM2823d - 3);
                this.f1780a0.post(new RunnableC0308H6(iM2823d, 2, this));
            } else if (z) {
                this.f1780a0.scrollToPosition(iM2823d + 3);
                this.f1780a0.post(new RunnableC0308H6(iM2823d, 2, this));
            } else {
                this.f1780a0.post(new RunnableC0308H6(iM2823d, 2, this));
            }
        } else {
            this.f1776W = c1469gs;
            this.f1780a0.scrollToPosition(iM2823d);
        }
        m1042E(iM2823d);
    }

    /* JADX INFO: renamed from: D */
    public final void m1041D(int i) {
        this.f1777X = i;
        if (i == 2) {
            this.f1779Z.getLayoutManager().scrollToPosition(this.f1776W.f5209c - ((C2139kG) this.f1779Z.getAdapter()).f7484a.f1775V.f349a.f5209c);
            this.f1783d0.setVisibility(0);
            this.f1784e0.setVisibility(8);
            this.f1781b0.setVisibility(8);
            this.f1782c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f1783d0.setVisibility(8);
            this.f1784e0.setVisibility(0);
            this.f1781b0.setVisibility(0);
            this.f1782c0.setVisibility(0);
            m1040C(this.f1776W);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1042E(int i) {
        this.f1782c0.setEnabled(i + 1 < this.f1780a0.getAdapter().getItemCount());
        this.f1781b0.setEnabled(i - 1 >= 0);
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public final void mo900n(Bundle bundle) {
        super.mo900n(bundle);
        if (bundle == null) {
            bundle = this.f5315f;
        }
        this.f1774U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1775V = (C0136D6) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1776W = (C1469gs) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: o */
    public final View mo1043o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m2870d(), this.f1774U);
        this.f1778Y = new C0649P3(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f1786g0 = (AccessibilityManager) m2878y().getSystemService("accessibility");
        C1469gs c1469gs = this.f1775V.f349a;
        if (C0806Sq.m1612F(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = io.github.cherrywechat.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = io.github.cherrywechat.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m2878y().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C1513hs.f5357d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_days_of_week);
        AbstractC2185lE.m4399l(gridView, new C0377Iq(0));
        int i4 = this.f1775V.f353e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0062Bc(i4) : new C0062Bc()));
        gridView.setNumColumns(c1469gs.f5210d);
        gridView.setEnabled(false);
        this.f1780a0 = (RecyclerView) viewInflate.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_months);
        this.f1780a0.setLayoutManager(new C0420Jq(this, i2, i2));
        this.f1780a0.setTag("MONTHS_VIEW_GROUP_TAG");
        C1277c c1277c = new C1277c(contextThemeWrapper, this.f1775V, new C1017Xm(4, this));
        this.f1780a0.setAdapter(c1277c);
        int integer = contextThemeWrapper.getResources().getInteger(io.github.cherrywechat.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_year_selector_frame);
        this.f1779Z = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f1779Z.setLayoutManager(new GridLayoutManager(integer));
            this.f1779Z.setAdapter(new C2139kG(this));
            this.f1779Z.addItemDecoration(new C0463Kq(this));
        }
        View viewFindViewById = viewInflate.findViewById(io.github.cherrywechat.R.id.month_navigation_fragment_toggle);
        C0136D6 c0136d6 = c1277c.f4534a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(io.github.cherrywechat.R.id.month_navigation_fragment_toggle);
            this.f1785f0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC2185lE.m4399l(this.f1785f0, new C1486h8(2, this));
            View viewFindViewById2 = viewInflate.findViewById(io.github.cherrywechat.R.id.month_navigation_previous);
            this.f1781b0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(io.github.cherrywechat.R.id.month_navigation_next);
            this.f1782c0 = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f1783d0 = viewInflate.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_year_selector_frame);
            this.f1784e0 = viewInflate.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_day_selector_frame);
            m1041D(1);
            this.f1785f0.setText(this.f1776W.m2822c());
            this.f1780a0.addOnScrollListener(new C0506Lq(this, c1277c));
            this.f1785f0.setOnClickListener(new ViewOnClickListenerC2343p0(3, this));
            this.f1782c0.setOnClickListener(new ViewOnClickListenerC0334Hq(this, c1277c, 1));
            this.f1781b0.setOnClickListener(new ViewOnClickListenerC0334Hq(this, c1277c, 0));
            m1042E(c0136d6.f349a.m2823d(this.f1776W));
        }
        if (!C0806Sq.m1612F(contextThemeWrapper, R.attr.windowFullscreen)) {
            new C0122Ct().attachToRecyclerView(this.f1780a0);
        }
        this.f1780a0.scrollToPosition(c0136d6.f349a.m2823d(this.f1776W));
        AbstractC2185lE.m4399l(this.f1780a0, new C0377Iq(1));
        return viewInflate;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public final void mo904t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1774U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1775V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1776W);
    }
}
