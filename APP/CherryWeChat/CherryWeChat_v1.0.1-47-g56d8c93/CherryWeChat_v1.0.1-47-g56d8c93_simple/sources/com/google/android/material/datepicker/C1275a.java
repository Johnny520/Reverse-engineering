package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import p000.C0549Mq;
import p000.C1017Xm;
import p000.C1513hs;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1275a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f4530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1277c f4531b;

    public C1275a(C1277c r1, MaterialCalendarGridView r2) {
        this.f4531b = r1;
        this.f4530a = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        MaterialCalendarGridView r12 = this.f4530a;
        C1513hs r22 = r12.m2467a();
        if (r3 >= r22.m2886a()) goto L5;
        return;
    L5:
        if (r3 > r22.m2888c()) goto L12;
        C1017Xm r23 = this.f4531b.f4535b;
        if (r12.m2467a().m2887b(r3).longValue() >= ((C0549Mq) r23.f3226b).f1775V.f351c.f36a) goto L10;
        return;
    L10:
        throw null;
    }
}
