package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1284c;
import java.util.Iterator;
import p000a.AbstractC0577fc;

/* JADX INFO: renamed from: com.google.android.material.datepicker.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1287f implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f5751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1288g f5752b;

    public C1287f(C1288g c1288g, MaterialCalendarGridView materialCalendarGridView) {
        this.f5752b = c1288g;
        this.f5751a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f5751a;
        C1286e c1286eM3212a = materialCalendarGridView.m3212a();
        if (i < c1286eM3212a.m3222b() || i > c1286eM3212a.m3224d()) {
            return;
        }
        C1284c.c cVar = this.f5752b.f5756g;
        long jLongValue = materialCalendarGridView.m3212a().getItem(i).longValue();
        C1284c c1284c = C1284c.this;
        if (c1284c.f5693Y.f5682c.mo3214f(jLongValue)) {
            c1284c.f5692X.m424b();
            Iterator it = c1284c.f3319V.iterator();
            while (it.hasNext()) {
                ((AbstractC0577fc) it.next()).mo997a(c1284c.f5692X.m423a());
            }
            c1284c.f5699e0.getAdapter().f4912a.m2815b();
            RecyclerView recyclerView = c1284c.f5698d0;
            if (recyclerView != null) {
                recyclerView.getAdapter().f4912a.m2815b();
            }
        }
    }
}
