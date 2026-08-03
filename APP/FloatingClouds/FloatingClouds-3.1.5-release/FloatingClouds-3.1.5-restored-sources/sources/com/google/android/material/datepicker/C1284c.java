package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.AbstractC1153A;
import androidx.recyclerview.widget.C1216u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1247R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1285d;
import java.util.ArrayList;
import p000a.AbstractC0169J4;
import p000a.AbstractC0843tc;
import p000a.C0037Bh;
import p000a.C0038C;
import p000a.C0059D2;
import p000a.C0103Fa;
import p000a.C0121Ga;
import p000a.C0139Ha;
import p000a.C0146I;
import p000a.C0157Ia;
import p000a.C0187K4;
import p000a.C0636ie;
import p000a.C0842tb;
import p000a.C0866ug;
import p000a.InterfaceC0151I4;
import p000a.RunnableC0113G2;
import p000a.ViewOnClickListenerC0085Ea;
import p000a.ViewOnClickListenerC0175Ja;
import p000a.ViewOnClickListenerC0193Ka;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1284c<S> extends AbstractC0843tc<S> {

    /* JADX INFO: renamed from: W */
    public int f5691W;

    /* JADX INFO: renamed from: X */
    public InterfaceC0151I4<S> f5692X;

    /* JADX INFO: renamed from: Y */
    public C1282a f5693Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC0169J4 f5694Z;

    /* JADX INFO: renamed from: a0 */
    public C0842tb f5695a0;

    /* JADX INFO: renamed from: b0 */
    public d f5696b0;

    /* JADX INFO: renamed from: c0 */
    public C0059D2 f5697c0;

    /* JADX INFO: renamed from: d0 */
    public RecyclerView f5698d0;

    /* JADX INFO: renamed from: e0 */
    public RecyclerView f5699e0;

    /* JADX INFO: renamed from: f0 */
    public View f5700f0;

    /* JADX INFO: renamed from: g0 */
    public View f5701g0;

    /* JADX INFO: renamed from: h0 */
    public View f5702h0;

    /* JADX INFO: renamed from: i0 */
    public View f5703i0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$a */
    public class a extends C0038C {
        @Override // p000a.C0038C
        /* JADX INFO: renamed from: d */
        public final void mo115d(View view, C0146I c0146i) {
            View.AccessibilityDelegate accessibilityDelegate = this.f137a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$b */
    public class b extends C0636ie {

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ int f5704E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(i);
            this.f5704E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: C0 */
        public final void mo2687C0(RecyclerView.C1186w c1186w, int[] iArr) {
            int i = this.f5704E;
            C1284c c1284c = C1284c.this;
            if (i == 0) {
                iArr[0] = c1284c.f5699e0.getWidth();
                iArr[1] = c1284c.f5699e0.getWidth();
            } else {
                iArr[0] = c1284c.f5699e0.getHeight();
                iArr[1] = c1284c.f5699e0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$c */
    public class c {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f5707a;

        /* JADX INFO: renamed from: b */
        public static final d f5708b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ d[] f5709c;

        static {
            d dVar = new d("DAY", 0);
            f5707a = dVar;
            d dVar2 = new d("YEAR", 1);
            f5708b = dVar2;
            f5709c = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f5709c.clone();
        }
    }

    @Override // p000a.AbstractC0843tc
    /* JADX INFO: renamed from: F */
    public final void mo1968F(C1285d.c cVar) {
        this.f3319V.add(cVar);
    }

    /* JADX INFO: renamed from: G */
    public final void m3215G(C0842tb c0842tb) {
        C1288g c1288g = (C1288g) this.f5699e0.getAdapter();
        int iM1967n = c1288g.f5753d.f5680a.m1967n(c0842tb);
        int iM1967n2 = iM1967n - c1288g.f5753d.f5680a.m1967n(this.f5695a0);
        boolean z = Math.abs(iM1967n2) > 3;
        boolean z2 = iM1967n2 > 0;
        this.f5695a0 = c0842tb;
        if (z && z2) {
            this.f5699e0.m2772e0(iM1967n - 3);
            this.f5699e0.post(new RunnableC0113G2(this, iM1967n, 1));
        } else if (!z) {
            this.f5699e0.post(new RunnableC0113G2(this, iM1967n, 1));
        } else {
            this.f5699e0.m2772e0(iM1967n + 3);
            this.f5699e0.post(new RunnableC0113G2(this, iM1967n, 1));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3216H(d dVar) {
        this.f5696b0 = dVar;
        if (dVar == d.f5708b) {
            this.f5698d0.getLayoutManager().mo2725p0(this.f5695a0.f3314c - ((C0037Bh) this.f5698d0.getAdapter()).f134d.f5693Y.f5680a.f3314c);
            this.f5702h0.setVisibility(0);
            this.f5703i0.setVisibility(8);
            this.f5700f0.setVisibility(8);
            this.f5701g0.setVisibility(8);
            return;
        }
        if (dVar == d.f5707a) {
            this.f5702h0.setVisibility(8);
            this.f5703i0.setVisibility(0);
            this.f5700f0.setVisibility(0);
            this.f5701g0.setVisibility(0);
            m3215G(this.f5695a0);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: o */
    public final void mo994o(Bundle bundle) {
        super.mo994o(bundle);
        if (bundle == null) {
            bundle = this.f4562f;
        }
        this.f5691W = bundle.getInt("THEME_RES_ID_KEY");
        this.f5692X = (InterfaceC0151I4) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f5693Y = (C1282a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5694Z = (AbstractC0169J4) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f5695a0 = (C0842tb) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: p */
    public final View mo995p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C1216u c1216u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m2531d(), this.f5691W);
        this.f5697c0 = new C0059D2(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0842tb c0842tb = this.f5693Y.f5680a;
        if (C1285d.m3218J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = C1247R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C1247R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m2524A().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C1247R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C1247R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C1286e.f5743g;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(C1247R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(C1247R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(C1247R.id.mtrl_calendar_days_of_week);
        C0866ug.m2003j(gridView, new a());
        int i4 = this.f5693Y.f5684e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0187K4(i4) : new C0187K4()));
        gridView.setNumColumns(c0842tb.f3315d);
        gridView.setEnabled(false);
        this.f5699e0 = (RecyclerView) viewInflate.findViewById(C1247R.id.mtrl_calendar_months);
        this.f5699e0.setLayoutManager(new b(i2, i2));
        this.f5699e0.setTag("MONTHS_VIEW_GROUP_TAG");
        C1288g c1288g = new C1288g(contextThemeWrapper, this.f5692X, this.f5693Y, this.f5694Z, new c());
        this.f5699e0.setAdapter(c1288g);
        int integer = contextThemeWrapper.getResources().getInteger(C1247R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(C1247R.id.mtrl_calendar_year_selector_frame);
        this.f5698d0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f5698d0.setLayoutManager(new GridLayoutManager(integer));
            this.f5698d0.setAdapter(new C0037Bh(this));
            this.f5698d0.m2777i(new C0121Ga(this));
        }
        if (viewInflate.findViewById(C1247R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(C1247R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C0866ug.m2003j(materialButton, new C0139Ha(this));
            View viewFindViewById = viewInflate.findViewById(C1247R.id.month_navigation_previous);
            this.f5700f0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(C1247R.id.month_navigation_next);
            this.f5701g0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f5702h0 = viewInflate.findViewById(C1247R.id.mtrl_calendar_year_selector_frame);
            this.f5703i0 = viewInflate.findViewById(C1247R.id.mtrl_calendar_day_selector_frame);
            m3216H(d.f5707a);
            materialButton.setText(this.f5695a0.m1966m());
            this.f5699e0.m2779j(new C0157Ia(this, c1288g, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0175Ja(this));
            this.f5701g0.setOnClickListener(new ViewOnClickListenerC0193Ka(this, c1288g));
            this.f5700f0.setOnClickListener(new ViewOnClickListenerC0085Ea(this, c1288g));
        }
        if (!C1285d.m3218J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c1216u = new C1216u()).f4740a) != (recyclerView = this.f5699e0)) {
            AbstractC1153A.a aVar = c1216u.f4741b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f4855h0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                c1216u.f4740a.setOnFlingListener(null);
            }
            c1216u.f4740a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c1216u.f4740a.m2779j(aVar);
                c1216u.f4740a.setOnFlingListener(c1216u);
                new Scroller(c1216u.f4740a.getContext(), new DecelerateInterpolator());
                c1216u.m2633b();
            }
        }
        this.f5699e0.m2772e0(c1288g.f5753d.f5680a.m1967n(this.f5695a0));
        C0866ug.m2003j(this.f5699e0, new C0103Fa(0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: t */
    public final void mo996t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5691W);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f5692X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5693Y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f5694Z);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5695a0);
    }
}
