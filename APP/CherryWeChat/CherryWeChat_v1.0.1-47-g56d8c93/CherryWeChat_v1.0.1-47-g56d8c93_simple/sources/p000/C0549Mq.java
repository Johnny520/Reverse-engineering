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
import androidx.recyclerview.widget.AbstractC1160i;
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

    public C0549Mq() {
    }

    /* JADX INFO: renamed from: C */
    public final void m1040C(C1469gs r7) {
        C1277c r0 = (C1277c) this.f1780a0.getAdapter();
        int r1 = r0.f4534a.f349a.m2823d(r7);
        AccessibilityManager r2 = this.f1786g0;
        if (r2 != null) goto L5;
    L7:
        int r02 = r1 - r0.f4534a.f349a.m2823d(this.f1776W);
        boolean r3 = false;
        if (Math.abs(r02) <= 3) goto L10;
        boolean r22 = true;
    L11:
        if (r02 <= 0) goto L13;
        r3 = true;
    L13:
        this.f1776W = r7;
        if (r22 == false) goto L17;
        if (r3 == false) goto L17;
        this.f1780a0.scrollToPosition(r1 - 3);
        this.f1780a0.post(new RunnableC0308H6(r1, 2, this));
    L20:
        m1042E(r1);
        return;
    L17:
        if (r22 == false) goto L19;
        this.f1780a0.scrollToPosition(r1 + 3);
        this.f1780a0.post(new RunnableC0308H6(r1, 2, this));
        goto L20
    L19:
        this.f1780a0.post(new RunnableC0308H6(r1, 2, this));
        goto L20
    L10:
        r22 = false;
        goto L11
    L5:
        if (r2.isEnabled() == false) goto L7;
        this.f1776W = r7;
        this.f1780a0.scrollToPosition(r1);
        goto L20
    }

    /* JADX INFO: renamed from: D */
    public final void m1041D(int r5) {
        this.f1777X = r5;
        if (r5 != 2) goto L7;
        AbstractC1160i r52 = this.f1779Z.getLayoutManager();
        C2139kG r0 = (C2139kG) this.f1779Z.getAdapter();
        r52.scrollToPosition(this.f1776W.f5209c - r0.f7484a.f1775V.f349a.f5209c);
        this.f1783d0.setVisibility(0);
        this.f1784e0.setVisibility(8);
        this.f1781b0.setVisibility(8);
        this.f1782c0.setVisibility(8);
        return;
    L7:
        if (r5 != 1) goto L10;
        this.f1783d0.setVisibility(8);
        this.f1784e0.setVisibility(0);
        this.f1781b0.setVisibility(0);
        this.f1782c0.setVisibility(0);
        m1040C(this.f1776W);
        return;
    }

    /* JADX INFO: renamed from: E */
    public final void m1042E(int r6) {
        View r0 = this.f1782c0;
        boolean r3 = false;
        if ((r6 + 1) >= this.f1780a0.getAdapter().getItemCount()) goto L5;
        boolean r1 = true;
    L6:
        r0.setEnabled(r1);
        View r02 = this.f1781b0;
        if ((r6 - 1) < 0) goto L9;
        r3 = true;
    L9:
        r02.setEnabled(r3);
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public final void mo900n(Bundle r2) {
        super.mo900n(r2);
        if (r2 != null) goto L5;
        r2 = this.f5315f;
    L5:
        this.f1774U = r2.getInt("THEME_RES_ID_KEY");
        if (r2.getParcelable("GRID_SELECTOR_KEY") != null) goto L14;
        this.f1775V = (C0136D6) r2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (r2.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) goto L12;
        this.f1776W = (C1469gs) r2.getParcelable("CURRENT_MONTH_KEY");
        return;
    L12:
        throw new ClassCastException();
    L14:
        throw new ClassCastException();
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: o */
    public final View mo1043o(LayoutInflater r12, ViewGroup r13) {
        ContextThemeWrapper r0 = new ContextThemeWrapper(m2870d(), this.f1774U);
        this.f1778Y = new C0649P3(r0);
        LayoutInflater r122 = r12.cloneInContext(r0);
        this.f1786g0 = (AccessibilityManager) m2878y().getSystemService("accessibility");
        C1469gs r1 = this.f1775V.f349a;
        if (C0806Sq.m1612F(r0, R.attr.windowFullscreen) == false) goto L5;
        int r3 = io.github.cherrywechat.R.layout.mtrl_calendar_vertical;
        int r6 = 1;
    L6:
        View r123 = r122.inflate(r3, r13, false);
        Resources r132 = m2878y().getResources();
        int r32 = r132.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_navigation_bottom_padding) + (r132.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_navigation_top_padding) + r132.getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_calendar_navigation_height));
        int r7 = r132.getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_calendar_days_of_week_height);
        int r8 = C1513hs.f5357d;
        int r33 = r32 + r7;
        r123.setMinimumHeight((r33 + ((r132.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_month_vertical_padding) * (r8 - 1)) + (r132.getDimensionPixelSize(io.github.cherrywechat.R.dimen.mtrl_calendar_day_height) * r8))) + r132.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.mtrl_calendar_bottom_padding));
        GridView r133 = (GridView) r123.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_days_of_week);
        AbstractC2185lE.m4399l(r133, new C0377Iq(0));
        int r34 = this.f1775V.f353e;
        if (r34 <= 0) goto L9;
        C0062Bc r72 = new C0062Bc(r34);
    L10:
        r133.setAdapter(r72);
        r133.setNumColumns(r1.f5210d);
        r133.setEnabled(false);
        this.f1780a0 = (RecyclerView) r123.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_months);
        this.f1780a0.setLayoutManager(new C0420Jq(this, r6, r6));
        this.f1780a0.setTag("MONTHS_VIEW_GROUP_TAG");
        C1277c r134 = new C1277c(r0, this.f1775V, new C1017Xm(4, this));
        this.f1780a0.setAdapter(r134);
        int r14 = r0.getResources().getInteger(io.github.cherrywechat.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView r4 = (RecyclerView) r123.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_year_selector_frame);
        this.f1779Z = r4;
        if (r4 == null) goto L13;
        r4.setHasFixedSize(true);
        this.f1779Z.setLayoutManager(new GridLayoutManager(r14));
        this.f1779Z.setAdapter(new C2139kG(this));
        this.f1779Z.addItemDecoration(new C0463Kq(this));
    L13:
        View r42 = r123.findViewById(io.github.cherrywechat.R.id.month_navigation_fragment_toggle);
        C0136D6 r62 = r134.f4534a;
        if (r42 == null) goto L17;
        MaterialButton r15 = (MaterialButton) r123.findViewById(io.github.cherrywechat.R.id.month_navigation_fragment_toggle);
        this.f1785f0 = r15;
        r15.setTag("SELECTOR_TOGGLE_TAG");
        AbstractC2185lE.m4399l(this.f1785f0, new C1486h8(2, this));
        View r16 = r123.findViewById(io.github.cherrywechat.R.id.month_navigation_previous);
        this.f1781b0 = r16;
        r16.setTag("NAVIGATION_PREV_TAG");
        View r17 = r123.findViewById(io.github.cherrywechat.R.id.month_navigation_next);
        this.f1782c0 = r17;
        r17.setTag("NAVIGATION_NEXT_TAG");
        this.f1783d0 = r123.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_year_selector_frame);
        this.f1784e0 = r123.findViewById(io.github.cherrywechat.R.id.mtrl_calendar_day_selector_frame);
        m1041D(1);
        this.f1785f0.setText(this.f1776W.m2822c());
        this.f1780a0.addOnScrollListener(new C0506Lq(this, r134));
        this.f1785f0.setOnClickListener(new ViewOnClickListenerC2343p0(3, this));
        this.f1782c0.setOnClickListener(new ViewOnClickListenerC0334Hq(this, r134, 1));
        this.f1781b0.setOnClickListener(new ViewOnClickListenerC0334Hq(this, r134, 0));
        m1042E(r62.f349a.m2823d(this.f1776W));
    L17:
        if (C0806Sq.m1612F(r0, R.attr.windowFullscreen) == true) goto L19;
        new C0122Ct().attachToRecyclerView(this.f1780a0);
    L19:
        this.f1780a0.scrollToPosition(r62.f349a.m2823d(this.f1776W));
        AbstractC2185lE.m4399l(this.f1780a0, new C0377Iq(1));
        return r123;
    L9:
        r72 = new C0062Bc();
        goto L10
    L5:
        r3 = io.github.cherrywechat.R.layout.mtrl_calendar_horizontal;
        r6 = 0;
        goto L6
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public final void mo904t(Bundle r4) {
        r4.putInt("THEME_RES_ID_KEY", this.f1774U);
        r4.putParcelable("GRID_SELECTOR_KEY", null);
        r4.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1775V);
        r4.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r4.putParcelable("CURRENT_MONTH_KEY", this.f1776W);
    }
}
