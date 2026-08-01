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

/* JADX INFO: renamed from: yt */
/* JADX INFO: loaded from: classes.dex */
public final class C0942yt<S> extends AbstractC0909xx {

    /* JADX INFO: renamed from: S */
    public int f5492S;

    /* JADX INFO: renamed from: T */
    public C0476m8 f5493T;

    /* JADX INFO: renamed from: U */
    public C0276gw f5494U;

    /* JADX INFO: renamed from: V */
    public int f5495V;

    /* JADX INFO: renamed from: W */
    public C0138d4 f5496W;

    /* JADX INFO: renamed from: X */
    public RecyclerView f5497X;

    /* JADX INFO: renamed from: Y */
    public RecyclerView f5498Y;

    /* JADX INFO: renamed from: Z */
    public View f5499Z;

    /* JADX INFO: renamed from: a0 */
    public View f5500a0;

    /* JADX INFO: renamed from: b0 */
    public View f5501b0;

    /* JADX INFO: renamed from: c0 */
    public View f5502c0;

    /* JADX INFO: renamed from: D */
    public final void m2780D(C0276gw c0276gw) {
        C0114c c0114c = (C0114c) this.f5498Y.getAdapter();
        int iM1344d = c0114c.f1049c.f3099a.m1344d(c0276gw);
        int iM1344d2 = iM1344d - c0114c.f1049c.f3099a.m1344d(this.f5494U);
        boolean z = Math.abs(iM1344d2) > 3;
        boolean z2 = iM1344d2 > 0;
        this.f5494U = c0276gw;
        if (z && z2) {
            this.f5498Y.m380Y(iM1344d - 3);
            this.f5498Y.post(new RunnableC0550o8(this, iM1344d, 2));
        } else if (!z) {
            this.f5498Y.post(new RunnableC0550o8(this, iM1344d, 2));
        } else {
            this.f5498Y.m380Y(iM1344d + 3);
            this.f5498Y.post(new RunnableC0550o8(this, iM1344d, 2));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2781E(int i) {
        this.f5495V = i;
        if (i == 2) {
            this.f5497X.getLayoutManager().mo345l0(this.f5494U.f2062c - ((kd0) this.f5497X.getAdapter()).f2824c.f5493T.f3099a.f2062c);
            this.f5501b0.setVisibility(0);
            this.f5502c0.setVisibility(8);
            this.f5499Z.setVisibility(8);
            this.f5500a0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f5501b0.setVisibility(8);
            this.f5502c0.setVisibility(0);
            this.f5499Z.setVisibility(0);
            this.f5500a0.setVisibility(0);
            m2780D(this.f5494U);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: m */
    public final void mo1023m(Bundle bundle) {
        super.mo1023m(bundle);
        if (bundle == null) {
            bundle = this.f3491f;
        }
        this.f5492S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5493T = (C0476m8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f5494U = (C0276gw) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: n */
    public final View mo1024n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0612px c0612px;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m2037h(), this.f5492S);
        this.f5496W = new C0138d4(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0276gw c0276gw = this.f5493T.f3099a;
        if (C0200eu.m1020G(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.ljx.wechatmod.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.ljx.wechatmod.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m2050z().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C0313hw.f2282d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_days_of_week);
        oa0.m2012l(gridView, new C0793ut(0));
        int i4 = this.f5493T.f3103e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0185ef(i4) : new C0185ef()));
        gridView.setNumColumns(c0276gw.f2063d);
        gridView.setEnabled(false);
        this.f5498Y = (RecyclerView) viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_months);
        this.f5498Y.setLayoutManager(new C0830vt(this, i2, i2));
        this.f5498Y.setTag("MONTHS_VIEW_GROUP_TAG");
        C0114c c0114c = new C0114c(contextThemeWrapper, this.f5493T, new C0431l0(19, this));
        this.f5498Y.setAdapter(c0114c);
        int integer = contextThemeWrapper.getResources().getInteger(com.ljx.wechatmod.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_year_selector_frame);
        this.f5497X = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f5497X.setLayoutManager(new GridLayoutManager(integer));
            this.f5497X.setAdapter(new kd0(this));
            RecyclerView recyclerView4 = this.f5497X;
            C0868wt c0868wt = new C0868wt();
            z80.m2821c(null);
            z80.m2821c(null);
            recyclerView4.m386g(c0868wt);
        }
        if (viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            oa0.m2012l(materialButton, new C0328ia(2, this));
            View viewFindViewById = viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_previous);
            this.f5499Z = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.ljx.wechatmod.R.id.month_navigation_next);
            this.f5500a0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f5501b0 = viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_year_selector_frame);
            this.f5502c0 = viewInflate.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_day_selector_frame);
            m2781E(1);
            materialButton.setText(this.f5494U.m1343c());
            this.f5498Y.m387h(new C0905xt(this, c0114c, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0876x0(2, this));
            this.f5500a0.setOnClickListener(new ViewOnClickListenerC0756tt(this, c0114c, 1));
            this.f5499Z.setOnClickListener(new ViewOnClickListenerC0756tt(this, c0114c, 0));
        }
        if (!C0200eu.m1020G(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0612px = new C0612px()).f3758a) != (recyclerView = this.f5498Y)) {
            d40 d40Var = c0612px.f3759b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f555e0;
                if (arrayList != null) {
                    arrayList.remove(d40Var);
                }
                c0612px.f3758a.setOnFlingListener(null);
            }
            c0612px.f3758a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0612px.f3758a.m387h(d40Var);
                c0612px.f3758a.setOnFlingListener(c0612px);
                new Scroller(c0612px.f3758a.getContext(), new DecelerateInterpolator());
                c0612px.m2102f();
            }
        }
        this.f5498Y.m380Y(c0114c.f1049c.f3099a.m1344d(this.f5494U));
        oa0.m2012l(this.f5498Y, new C0793ut(1));
        return viewInflate;
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: r */
    public final void mo1025r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5492S);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5493T);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5494U);
    }
}
