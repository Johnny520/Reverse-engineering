package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tt extends defpackage.qz {
    public final /* synthetic */ com.google.android.material.datepicker.c a;
    public final /* synthetic */ com.google.android.material.button.MaterialButton b;
    public final /* synthetic */ defpackage.ut c;

    public tt(defpackage.ut r1, com.google.android.material.datepicker.c r2, com.google.android.material.button.MaterialButton r3) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.a = r2
            r0.b = r3
            return
    }

    @Override // defpackage.qz
    public final void a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            if (r2 != 0) goto Lb
            com.google.android.material.button.MaterialButton r2 = r0.b
            java.lang.CharSequence r2 = r2.getText()
            r1.announceForAccessibility(r2)
        Lb:
            return
    }

    @Override // defpackage.qz
    public final void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            r3 = this;
            com.google.android.material.datepicker.c r4 = r3.a
            c8 r4 = r4.c
            ut r6 = r3.c
            if (r5 >= 0) goto L22
            androidx.recyclerview.widget.RecyclerView r5 = r6.Y
            nz r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            r0 = 0
            int r1 = r5.v()
            android.view.View r5 = r5.K0(r0, r1, r0)
            if (r5 != 0) goto L1d
            r5 = -1
            goto L2e
        L1d:
            int r5 = defpackage.nz.F(r5)
            goto L2e
        L22:
            androidx.recyclerview.widget.RecyclerView r5 = r6.Y
            nz r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r5 = r5.I0()
        L2e:
            zv r0 = r4.a
            java.util.Calendar r0 = r0.a
            java.util.Calendar r0 = defpackage.u80.a(r0)
            r1 = 2
            r0.add(r1, r5)
            zv r2 = new zv
            r2.<init>(r0)
            r6.U = r2
            zv r4 = r4.a
            java.util.Calendar r4 = r4.a
            java.util.Calendar r4 = defpackage.u80.a(r4)
            r4.add(r1, r5)
            r5 = 5
            r6 = 1
            r4.set(r5, r6)
            java.util.Calendar r4 = defpackage.u80.a(r4)
            r4.get(r1)
            r4.get(r6)
            r6 = 7
            r4.getMaximum(r6)
            r4.getActualMaximum(r5)
            r4.getTimeInMillis()
            long r4 = r4.getTimeInMillis()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.u80.a
            java.lang.String r0 = "yMMMM"
            android.icu.text.DateFormat r6 = android.icu.text.DateFormat.getInstanceForSkeleton(r0, r6)
            java.lang.String r0 = "UTC"
            android.icu.util.TimeZone r0 = android.icu.util.TimeZone.getTimeZone(r0)
            r6.setTimeZone(r0)
            android.icu.text.DisplayContext r0 = android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE
            r6.setContext(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r4)
            java.lang.String r4 = r6.format(r0)
            com.google.android.material.button.MaterialButton r5 = r3.b
            r5.setText(r4)
            return
    }
}
