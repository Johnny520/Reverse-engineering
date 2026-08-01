package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ut<S> extends px {
    public int S;
    public c8 T;
    public zv U;
    public int V;
    public d4 W;
    public RecyclerView X;
    public RecyclerView Y;
    public View Z;
    public View a0;
    public View b0;
    public View c0;

    public ut() {
    }

    public final void D(zv r7) {
        c r0 = (c) this.Y.getAdapter();
        int r1 = r0.c.a.d(r7);
        int r02 = r1 - r0.c.a.d(this.U);
        boolean r4 = false;
        if (Math.abs(r02) <= 3) goto L5;
        boolean r2 = true;
    L6:
        if (r02 <= 0) goto L8;
        r4 = true;
    L8:
        this.U = r7;
        if (r2 == false) goto L13;
        if (r4 == false) goto L13;
        this.Y.Y(r1 - 3);
        this.Y.post(new e8(this, r1, 2));
        return;
    L13:
        if (r2 == false) goto L16;
        this.Y.Y(r1 + 3);
        this.Y.post(new e8(this, r1, 2));
        return;
    L16:
        this.Y.post(new e8(this, r1, 2));
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void E(int r5) {
        this.V = r5;
        if (r5 != 2) goto L7;
        nz r52 = this.X.getLayoutManager();
        fd0 r0 = (fd0) this.X.getAdapter();
        r52.l0(this.U.c - r0.c.T.a.c);
        this.b0.setVisibility(0);
        this.c0.setVisibility(8);
        this.Z.setVisibility(8);
        this.a0.setVisibility(8);
        return;
    L7:
        if (r5 != 1) goto L10;
        this.b0.setVisibility(8);
        this.c0.setVisibility(0);
        this.Z.setVisibility(0);
        this.a0.setVisibility(0);
        D(this.U);
        return;
    }

    @Override // defpackage.ml
    public final void m(Bundle r2) {
        super.m(r2);
        if (r2 != null) goto L5;
        r2 = this.f;
    L5:
        this.S = r2.getInt("THEME_RES_ID_KEY");
        if (r2.getParcelable("GRID_SELECTOR_KEY") != null) goto L14;
        this.T = (c8) r2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (r2.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) goto L12;
        this.U = (zv) r2.getParcelable("CURRENT_MONTH_KEY");
        return;
    L12:
        throw new ClassCastException();
    L14:
        throw new ClassCastException();
    }

    @Override // defpackage.ml
    public final View n(LayoutInflater r12, ViewGroup r13) {
        ContextThemeWrapper r0 = new ContextThemeWrapper(h(), this.S);
        this.W = new d4(r0);
        LayoutInflater r122 = r12.cloneInContext(r0);
        zv r1 = this.T.a;
        if (bu.G(r0, R.attr.windowFullscreen) == false) goto L5;
        int r3 = com.ljx.wechatmod.R.layout.mtrl_calendar_vertical;
        int r6 = 1;
    L6:
        View r123 = r122.inflate(r3, r13, false);
        Resources r132 = z().getResources();
        int r32 = r132.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_bottom_padding) + (r132.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_top_padding) + r132.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_navigation_height));
        int r7 = r132.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_days_of_week_height);
        int r8 = aw.d;
        int r33 = r32 + r7;
        r123.setMinimumHeight((r33 + ((r132.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_month_vertical_padding) * (r8 - 1)) + (r132.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.mtrl_calendar_day_height) * r8))) + r132.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.mtrl_calendar_bottom_padding));
        GridView r133 = (GridView) r123.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_days_of_week);
        ja0.l(r133, new qt(0));
        int r34 = this.T.e;
        if (r34 <= 0) goto L9;
        df r72 = new df(r34);
    L10:
        r133.setAdapter(r72);
        r133.setNumColumns(r1.d);
        r133.setEnabled(false);
        this.Y = (RecyclerView) r123.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_months);
        this.Y.setLayoutManager(new rt(this, r6, r6));
        this.Y.setTag("MONTHS_VIEW_GROUP_TAG");
        c r134 = new c(r0, this.T, new l0(19, this));
        this.Y.setAdapter(r134);
        int r14 = r0.getResources().getInteger(com.ljx.wechatmod.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView r4 = (RecyclerView) r123.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_year_selector_frame);
        this.X = r4;
        if (r4 == null) goto L14;
        r4.setHasFixedSize(true);
        this.X.setLayoutManager(new GridLayoutManager(r14));
        this.X.setAdapter(new fd0(this));
        RecyclerView r15 = this.X;
        st r42 = new st();
        u80.c(null);
        u80.c(null);
        r15.g(r42);
    L14:
        if (r123.findViewById(com.ljx.wechatmod.R.id.month_navigation_fragment_toggle) == null) goto L17;
        MaterialButton r16 = (MaterialButton) r123.findViewById(com.ljx.wechatmod.R.id.month_navigation_fragment_toggle);
        r16.setTag("SELECTOR_TOGGLE_TAG");
        ja0.l(r16, new aa(2, this));
        View r43 = r123.findViewById(com.ljx.wechatmod.R.id.month_navigation_previous);
        this.Z = r43;
        r43.setTag("NAVIGATION_PREV_TAG");
        View r44 = r123.findViewById(com.ljx.wechatmod.R.id.month_navigation_next);
        this.a0 = r44;
        r44.setTag("NAVIGATION_NEXT_TAG");
        this.b0 = r123.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_year_selector_frame);
        this.c0 = r123.findViewById(com.ljx.wechatmod.R.id.mtrl_calendar_day_selector_frame);
        E(1);
        r16.setText(this.U.c());
        this.Y.h(new tt(this, r134, r16));
        r16.setOnClickListener(new x0(2, this));
        this.a0.setOnClickListener(new pt(this, r134, 1));
        this.Z.setOnClickListener(new pt(this, r134, 0));
    L17:
        if (bu.G(r0, R.attr.windowFullscreen) == true) goto L34;
        hx r02 = new hx();
        RecyclerView r17 = this.Y;
        RecyclerView r2 = r02.a;
        if (r2 == r17) goto L34;
        w30 r35 = r02.b;
        if (r2 == null) goto L27;
        ArrayList r22 = r2.e0;
        if (r22 == null) goto L26;
        r22.remove(r35);
    L26:
        r02.a.setOnFlingListener(null);
    L27:
        r02.a = r17;
        if (r17 == null) goto L34;
        if (r17.getOnFlingListener() != null) goto L33;
        r02.a.h(r35);
        r02.a.setOnFlingListener(r02);
        new Scroller(r02.a.getContext(), new DecelerateInterpolator());
        r02.f();
        goto L34
    L33:
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    L34:
        this.Y.Y(r134.c.a.d(this.U));
        ja0.l(this.Y, new qt(1));
        return r123;
    L9:
        r72 = new df();
        goto L10
    L5:
        r3 = com.ljx.wechatmod.R.layout.mtrl_calendar_horizontal;
        r6 = 0;
        goto L6
    }

    @Override // defpackage.ml
    public final void r(Bundle r4) {
        r4.putInt("THEME_RES_ID_KEY", this.S);
        r4.putParcelable("GRID_SELECTOR_KEY", null);
        r4.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.T);
        r4.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r4.putParcelable("CURRENT_MONTH_KEY", this.U);
    }
}
