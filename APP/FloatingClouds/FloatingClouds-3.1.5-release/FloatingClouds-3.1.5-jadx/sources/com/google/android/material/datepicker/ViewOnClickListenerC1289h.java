package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.C1284c;
import java.util.Calendar;
import p000a.C0037Bh;
import p000a.C0842tb;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1289h implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0037Bh f5761b;

    public ViewOnClickListenerC1289h(C0037Bh c0037Bh, int i) {
        this.f5761b = c0037Bh;
        this.f5760a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0037Bh c0037Bh = this.f5761b;
        C0842tb c0842tbM1964k = C0842tb.m1964k(this.f5760a, c0037Bh.f134d.f5695a0.f3313b);
        C1284c<?> c1284c = c0037Bh.f134d;
        C1282a c1282a = c1284c.f5693Y;
        C0842tb c0842tb = c1282a.f5680a;
        Calendar calendar = c0842tb.f3312a;
        Calendar calendar2 = c0842tbM1964k.f3312a;
        if (calendar2.compareTo(calendar) < 0) {
            c0842tbM1964k = c0842tb;
        } else {
            C0842tb c0842tb2 = c1282a.f5681b;
            if (calendar2.compareTo(c0842tb2.f3312a) > 0) {
                c0842tbM1964k = c0842tb2;
            }
        }
        c1284c.m3215G(c0842tbM1964k);
        c1284c.m3216H(C1284c.d.f5707a);
    }
}
