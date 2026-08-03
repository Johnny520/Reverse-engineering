package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1077a;
    public final /* synthetic */ a.Bh b;

    public h(a.Bh r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f1077a = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            a.Bh r6 = r5.b
            com.google.android.material.datepicker.c<?> r0 = r6.d
            a.tb r0 = r0.a0
            int r0 = r0.b
            int r1 = r5.f1077a
            a.tb r0 = a.C0391tb.k(r1, r0)
            com.google.android.material.datepicker.c<?> r6 = r6.d
            com.google.android.material.datepicker.a r1 = r6.Y
            a.tb r2 = r1.f1067a
            java.util.Calendar r3 = r2.f697a
            java.util.Calendar r4 = r0.f697a
            int r3 = r4.compareTo(r3)
            if (r3 >= 0) goto L20
            r0 = r2
            goto L2b
        L20:
            a.tb r1 = r1.b
            java.util.Calendar r2 = r1.f697a
            int r2 = r4.compareTo(r2)
            if (r2 <= 0) goto L2b
            r0 = r1
        L2b:
            r6.G(r0)
            com.google.android.material.datepicker.c$d r0 = com.google.android.material.datepicker.c.d.f1071a
            r6.H(r0)
            return
    }
}
