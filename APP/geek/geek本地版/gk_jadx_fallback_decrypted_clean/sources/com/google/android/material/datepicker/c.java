package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class c extends defpackage.fz {
    public final defpackage.c8 c;
    public final defpackage.l0 d;
    public final int e;

    public c(android.view.ContextThemeWrapper r5, defpackage.c8 r6, defpackage.l0 r7) {
            r4 = this;
            r4.<init>()
            zv r0 = r6.a
            zv r1 = r6.b
            zv r2 = r6.d
            java.util.Calendar r0 = r0.a
            java.util.Calendar r3 = r2.a
            int r0 = r0.compareTo(r3)
            if (r0 > 0) goto L61
            java.util.Calendar r0 = r2.a
            java.util.Calendar r1 = r1.a
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L59
            int r0 = defpackage.aw.d
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131165809(0x7f070271, float:1.7945846E38)
            int r1 = r1.getDimensionPixelSize(r2)
            int r1 = r1 * r0
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r0 = defpackage.bu.G(r5, r0)
            if (r0 == 0) goto L3d
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r2)
            goto L3e
        L3d:
            r5 = 0
        L3e:
            int r1 = r1 + r5
            r4.e = r1
            r4.c = r6
            r4.d = r7
            gz r5 = r4.a
            boolean r5 = r5.a()
            if (r5 != 0) goto L51
            r5 = 1
            r4.b = r5
            return
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
            r5.<init>(r6)
            throw r5
        L59:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "currentPage cannot be after lastPage"
            r5.<init>(r6)
            throw r5
        L61:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "firstPage cannot be after currentPage"
            r5.<init>(r6)
            throw r5
    }

    @Override // defpackage.fz
    public final int a() {
            r1 = this;
            c8 r0 = r1.c
            int r0 = r0.g
            return r0
    }

    @Override // defpackage.fz
    public final long b(int r4) {
            r3 = this;
            c8 r0 = r3.c
            zv r0 = r0.a
            java.util.Calendar r0 = r0.a
            java.util.Calendar r0 = defpackage.u80.a(r0)
            r1 = 2
            r0.add(r1, r4)
            r4 = 5
            r2 = 1
            r0.set(r4, r2)
            java.util.Calendar r0 = defpackage.u80.a(r0)
            r0.get(r1)
            r0.get(r2)
            r1 = 7
            r0.getMaximum(r1)
            r0.getActualMaximum(r4)
            r0.getTimeInMillis()
            long r0 = r0.getTimeInMillis()
            return r0
    }

    @Override // defpackage.fz
    public final void c(defpackage.b00 r4, int r5) {
            r3 = this;
            com.google.android.material.datepicker.b r4 = (com.google.android.material.datepicker.b) r4
            c8 r0 = r3.c
            zv r1 = r0.a
            java.util.Calendar r1 = r1.a
            java.util.Calendar r1 = defpackage.u80.a(r1)
            r2 = 2
            r1.add(r2, r5)
            zv r5 = new zv
            r5.<init>(r1)
            android.widget.TextView r1 = r4.t
            java.lang.String r2 = r5.c()
            r1.setText(r2)
            com.google.android.material.datepicker.MaterialCalendarGridView r4 = r4.u
            r1 = 2131296494(0x7f0900ee, float:1.8210906E38)
            android.view.View r4 = r4.findViewById(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r4 = (com.google.android.material.datepicker.MaterialCalendarGridView) r4
            aw r1 = r4.a()
            if (r1 == 0) goto L47
            aw r1 = r4.a()
            zv r1 = r1.a
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L47
            r4.invalidate()
            aw r4 = r4.a()
            r4.getClass()
            r4 = 0
            throw r4
        L47:
            aw r4 = new aw
            r4.<init>(r5, r0)
            r4 = 0
            throw r4
    }

    @Override // defpackage.fz
    public final defpackage.b00 d(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131492940(0x7f0c004c, float:1.8609346E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.content.Context r4 = r4.getContext()
            r1 = 16843277(0x101020d, float:2.369503E-38)
            boolean r4 = defpackage.bu.G(r4, r1)
            if (r4 == 0) goto L31
            oz r4 = new oz
            r1 = -1
            int r2 = r3.e
            r4.<init>(r1, r2)
            r0.setLayoutParams(r4)
            com.google.android.material.datepicker.b r4 = new com.google.android.material.datepicker.b
            r1 = 1
            r4.<init>(r0, r1)
            return r4
        L31:
            com.google.android.material.datepicker.b r4 = new com.google.android.material.datepicker.b
            r4.<init>(r0, r2)
            return r4
    }
}
