package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ia extends androidx.recyclerview.widget.RecyclerView.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.datepicker.g f124a;
    public final /* synthetic */ com.google.android.material.button.MaterialButton b;
    public final /* synthetic */ com.google.android.material.datepicker.c c;

    public Ia(com.google.android.material.datepicker.c r1, com.google.android.material.datepicker.g r2, com.google.android.material.button.MaterialButton r3) {
            r0 = this;
            r0.c = r1
            r0.f124a = r2
            r0.b = r3
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            if (r2 != 0) goto Lb
            com.google.android.material.button.MaterialButton r2 = r0.b
            java.lang.CharSequence r2 = r2.getText()
            r1.announceForAccessibility(r2)
        Lb:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            r3 = this;
            com.google.android.material.datepicker.c r4 = r3.c
            if (r5 >= 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r5 = r4.e0
            androidx.recyclerview.widget.RecyclerView$l r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r6 = r5.v()
            r0 = 0
            android.view.View r5 = r5.O0(r0, r6, r0)
            if (r5 != 0) goto L19
            r5 = -1
            goto L2a
        L19:
            int r5 = androidx.recyclerview.widget.RecyclerView.l.H(r5)
            goto L2a
        L1e:
            androidx.recyclerview.widget.RecyclerView r5 = r4.e0
            androidx.recyclerview.widget.RecyclerView$l r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r5 = r5.M0()
        L2a:
            com.google.android.material.datepicker.g r6 = r3.f124a
            com.google.android.material.datepicker.a r6 = r6.d
            a.tb r0 = r6.f1067a
            java.util.Calendar r0 = r0.f697a
            java.util.Calendar r0 = a.Zf.c(r0)
            r1 = 2
            r0.add(r1, r5)
            a.tb r2 = new a.tb
            r2.<init>(r0)
            r4.a0 = r2
            a.tb r4 = r6.f1067a
            java.util.Calendar r4 = r4.f697a
            java.util.Calendar r4 = a.Zf.c(r4)
            r4.add(r1, r5)
            r5 = 5
            r6 = 1
            r4.set(r5, r6)
            java.util.Calendar r4 = a.Zf.c(r4)
            r4.get(r1)
            r4.get(r6)
            r6 = 7
            r4.getMaximum(r6)
            r4.getActualMaximum(r5)
            r4.getTimeInMillis()
            long r4 = r4.getTimeInMillis()
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r0 = "yMMMM"
            android.icu.text.DateFormat r6 = a.Zf.b(r0, r6)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r4)
            java.lang.String r4 = r6.format(r0)
            com.google.android.material.button.MaterialButton r5 = r3.b
            r5.setText(r4)
            return
    }
}
