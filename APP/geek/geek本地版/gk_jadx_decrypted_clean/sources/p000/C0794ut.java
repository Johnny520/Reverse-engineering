package p000;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0114c;
import java.util.ArrayList;

/* JADX INFO: renamed from: ut */
/* JADX INFO: loaded from: classes.dex */
public final class C0794ut<S> extends AbstractC0613px {

    /* JADX INFO: renamed from: S */
    public int f4760S;

    /* JADX INFO: renamed from: T */
    public C0095c8 f4761T;

    /* JADX INFO: renamed from: U */
    public C0981zv f4762U;

    /* JADX INFO: renamed from: V */
    public int f4763V;

    /* JADX INFO: renamed from: W */
    public C0138d4 f4764W;

    /* JADX INFO: renamed from: X */
    public RecyclerView f4765X;

    /* JADX INFO: renamed from: Y */
    public RecyclerView f4766Y;

    /* JADX INFO: renamed from: Z */
    public View f4767Z;

    /* JADX INFO: renamed from: a0 */
    public View f4768a0;

    /* JADX INFO: renamed from: b0 */
    public View f4769b0;

    /* JADX INFO: renamed from: c0 */
    public View f4770c0;

    /* JADX INFO: renamed from: D */
    public final void m2469D(C0981zv c0981zv) {
        C0114c c0114c = (C0114c) this.f4766Y.getAdapter();
        int iM2843d = c0114c.f1124c.f909a.m2843d(c0981zv);
        int iM2843d2 = iM2843d - c0114c.f1124c.f909a.m2843d(this.f4762U);
        boolean z = Math.abs(iM2843d2) > 3;
        boolean z2 = iM2843d2 > 0;
        this.f4762U = c0981zv;
        if (z && z2) {
            this.f4766Y.m395Y(iM2843d - 3);
            this.f4766Y.post(new RunnableC0178e8(this, iM2843d, 2));
        } else if (!z) {
            this.f4766Y.post(new RunnableC0178e8(this, iM2843d, 2));
        } else {
            this.f4766Y.m395Y(iM2843d + 3);
            this.f4766Y.post(new RunnableC0178e8(this, iM2843d, 2));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2470E(int i) {
        this.f4763V = i;
        if (i == 2) {
            this.f4765X.getLayoutManager().mo360l0(this.f4762U.f5621c - ((fd0) this.f4765X.getAdapter()).f1933c.f4761T.f909a.f5621c);
            this.f4769b0.setVisibility(0);
            this.f4770c0.setVisibility(8);
            this.f4767Z.setVisibility(8);
            this.f4768a0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f4769b0.setVisibility(8);
            this.f4770c0.setVisibility(0);
            this.f4767Z.setVisibility(0);
            this.f4768a0.setVisibility(0);
            m2469D(this.f4762U);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: m */
    public final void mo574m(Bundle bundle) {
        super.mo574m(bundle);
        if (bundle == null) {
            bundle = this.f3246f;
        }
        this.f4760S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f4761T = (C0095c8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f4762U = (C0981zv) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: n */
    public final View mo575n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0314hx c0314hx;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1835h(), this.f4760S);
        this.f4764W = new C0138d4(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0981zv c0981zv = this.f4761T.f909a;
        if (C0081bu.m571G(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.ljx.wechatmod.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.ljx.wechatmod.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m1848z().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C0046aw.f688d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_days_of_week);
        ja0.m1575l(gridView, new C0646qt(0));
        int i4 = this.f4761T.f913e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0149df(i4) : new C0149df()));
        gridView.setNumColumns(c0981zv.f5622d);
        gridView.setEnabled(false);
        this.f4766Y = (RecyclerView) viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_months);
        this.f4766Y.setLayoutManager(new C0683rt(this, i2, i2));
        this.f4766Y.setTag("MONTHS_VIEW_GROUP_TAG");
        C0114c c0114c = new C0114c(contextThemeWrapper, this.f4761T, new C0431l0(19, this));
        this.f4766Y.setAdapter(c0114c);
        int integer = contextThemeWrapper.getResources().getInteger(com.ljx.wechatmod.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_year_selector_frame);
        this.f4765X = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f4765X.setLayoutManager(new GridLayoutManager(integer));
            this.f4765X.setAdapter(new fd0(this));
            RecyclerView recyclerView4 = this.f4765X;
            C0720st c0720st = new C0720st();
            u80.m2428c(null);
            u80.m2428c(null);
            recyclerView4.m401g(c0720st);
        }
        if (viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ja0.m1575l(materialButton, new C0011aa(2, this));
            View viewFindViewById = viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_previous);
            this.f4767Z = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_next);
            this.f4768a0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f4769b0 = viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_year_selector_frame);
            this.f4770c0 = viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_day_selector_frame);
            m2470E(1);
            materialButton.setText(this.f4762U.m2842c());
            this.f4766Y.m402h(new C0757tt(this, c0114c, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0876x0(2, this));
            this.f4768a0.setOnClickListener(new ViewOnClickListenerC0609pt(this, c0114c, 1));
            this.f4767Z.setOnClickListener(new ViewOnClickListenerC0609pt(this, c0114c, 0));
        }
        if (!C0081bu.m571G(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0314hx = new C0314hx()).f2316a) != (recyclerView = this.f4766Y)) {
            w30 w30Var = c0314hx.f2317b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f592e0;
                if (arrayList != null) {
                    arrayList.remove(w30Var);
                }
                c0314hx.f2316a.setOnFlingListener(null);
            }
            c0314hx.f2316a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0314hx.f2316a.m402h(w30Var);
                c0314hx.f2316a.setOnFlingListener(c0314hx);
                new Scroller(c0314hx.f2316a.getContext(), new DecelerateInterpolator());
                c0314hx.m1381f();
            }
        }
        this.f4766Y.m395Y(c0114c.f1124c.f909a.m2843d(this.f4762U));
        ja0.m1575l(this.f4766Y, new C0646qt(1));
        return viewInflate;
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: r */
    public final void mo576r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f4760S);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4761T);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f4762U);
    }
}
