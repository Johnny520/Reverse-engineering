package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import p000.C0313hw;
import p000.C0942yt;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0112a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f1045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0114c f1046b;

    public C0112a(C0114c c0114c, MaterialCalendarGridView materialCalendarGridView) {
        this.f1046b = c0114c;
        this.f1045a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f1045a;
        C0313hw c0313hwM714a = materialCalendarGridView.m714a();
        if (i < c0313hwM714a.m1415a() || i > c0313hwM714a.m1417c()) {
            return;
        }
        if (materialCalendarGridView.m714a().getItem(i).longValue() >= ((C0942yt) this.f1046b.f1050d.f2886b).f5493T.f3101c.f1389a) {
            throw null;
        }
    }
}
