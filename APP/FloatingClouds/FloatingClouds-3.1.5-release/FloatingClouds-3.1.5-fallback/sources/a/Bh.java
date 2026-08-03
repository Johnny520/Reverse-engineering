package a;

/* JADX INFO: loaded from: classes.dex */
public final class Bh extends androidx.recyclerview.widget.RecyclerView.d<a.Bh.a> {
    public final com.google.android.material.datepicker.c<?> d;

    public static class a extends androidx.recyclerview.widget.RecyclerView.A {
        public final android.widget.TextView u;

        public a(android.widget.TextView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.u = r1
                return
        }
    }

    public Bh(com.google.android.material.datepicker.c<?> r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final int a() {
            r1 = this;
            com.google.android.material.datepicker.c<?> r0 = r1.d
            com.google.android.material.datepicker.a r0 = r0.Y
            int r0 = r0.f
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(androidx.recyclerview.widget.RecyclerView.A r8, int r9) {
            r7 = this;
            a.Bh$a r8 = (a.Bh.a) r8
            com.google.android.material.datepicker.c<?> r0 = r7.d
            com.google.android.material.datepicker.a r1 = r0.Y
            a.tb r1 = r1.f1067a
            int r1 = r1.c
            int r1 = r1 + r9
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "%d"
            java.lang.String r9 = java.lang.String.format(r9, r3, r2)
            android.widget.TextView r8 = r8.u
            r8.setText(r9)
            android.content.Context r9 = r8.getContext()
            java.util.Calendar r2 = a.Zf.d()
            r3 = 1
            int r2 = r2.get(r3)
            if (r2 != r1) goto L44
            int r2 = com.google.android.material.R.string.mtrl_picker_navigate_to_current_year_description
            java.lang.String r9 = r9.getString(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r9 = java.lang.String.format(r9, r2)
            goto L56
        L44:
            int r2 = com.google.android.material.R.string.mtrl_picker_navigate_to_year_description
            java.lang.String r9 = r9.getString(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r9 = java.lang.String.format(r9, r2)
        L56:
            r8.setContentDescription(r9)
            a.D2 r9 = r0.c0
            java.util.Calendar r2 = a.Zf.d()
            int r4 = r2.get(r3)
            if (r4 != r1) goto L68
            a.C2 r4 = r9.f
            goto L6a
        L68:
            a.C2 r4 = r9.d
        L6a:
            a.I4<S> r0 = r0.X
            java.util.Collection r0 = r0.j()
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r0.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r2.setTimeInMillis(r5)
            int r5 = r2.get(r3)
            if (r5 != r1) goto L74
            a.C2 r4 = r9.e
            goto L74
        L90:
            r4.b(r8)
            com.google.android.material.datepicker.h r9 = new com.google.android.material.datepicker.h
            r9.<init>(r7, r1)
            r8.setOnClickListener(r9)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final androidx.recyclerview.widget.RecyclerView.A e(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_year
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            a.Bh$a r4 = new a.Bh$a
            r4.<init>(r3)
            return r4
    }
}
