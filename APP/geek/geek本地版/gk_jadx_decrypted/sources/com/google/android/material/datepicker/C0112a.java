package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import p000.C0046aw;
import p000.C0794ut;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0112a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f1120a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0114c f1121b;

    public C0112a(C0114c c0114c, MaterialCalendarGridView materialCalendarGridView) {
        this.f1121b = c0114c;
        this.f1120a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f1120a;
        C0046aw c0046awM756a = materialCalendarGridView.m756a();
        if (i < c0046awM756a.m475a() || i > c0046awM756a.m477c()) {
            return;
        }
        if (materialCalendarGridView.m756a().getItem(i).longValue() >= ((C0794ut) this.f1121b.f1125d.f2980b).f4761T.f911c.f956a) {
            throw null;
        }
    }
}
