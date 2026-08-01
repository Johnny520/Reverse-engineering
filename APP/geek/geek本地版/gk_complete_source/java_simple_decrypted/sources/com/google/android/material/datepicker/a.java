package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.aw;
import defpackage.l0;
import defpackage.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c r1, MaterialCalendarGridView r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        MaterialCalendarGridView r12 = this.a;
        aw r22 = r12.a();
        if (r3 >= r22.a()) goto L5;
        return;
    L5:
        if (r3 > r22.c()) goto L12;
        l0 r23 = this.b.d;
        if (r12.a().b(r3).longValue() >= ((ut) r23.b).T.c.a) goto L10;
        return;
    L10:
        throw null;
    }
}
