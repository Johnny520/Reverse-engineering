package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import p000.C0549Mq;
import p000.C1513hs;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1275a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f4530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1277c f4531b;

    public C1275a(C1277c c1277c, MaterialCalendarGridView materialCalendarGridView) {
        this.f4531b = c1277c;
        this.f4530a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f4530a;
        C1513hs c1513hsM2467a = materialCalendarGridView.m2467a();
        if (i < c1513hsM2467a.m2886a() || i > c1513hsM2467a.m2888c()) {
            return;
        }
        if (materialCalendarGridView.m2467a().getItem(i).longValue() >= ((C0549Mq) this.f4531b.f4535b.f3226b).f1775V.f351c.f36a) {
            throw null;
        }
    }
}
