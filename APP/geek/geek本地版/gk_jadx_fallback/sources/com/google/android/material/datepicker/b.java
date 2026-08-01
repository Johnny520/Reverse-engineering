package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class b extends defpackage.b00 {
    public final android.widget.TextView t;
    public final com.google.android.material.datepicker.MaterialCalendarGridView u;

    public b(android.widget.LinearLayout r9, boolean r10) {
            r8 = this;
            r8.<init>(r9)
            r0 = 2131296499(0x7f0900f3, float:1.8210916E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.t = r0
            java.util.WeakHashMap r1 = defpackage.ja0.a
            p90 r2 = new p90
            r5 = 0
            r7 = 2
            r3 = 2131296643(0x7f090183, float:1.8211208E38)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r6 = 28
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.d(r0, r1)
            r1 = 2131296494(0x7f0900ee, float:1.8210906E38)
            android.view.View r9 = r9.findViewById(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r9 = (com.google.android.material.datepicker.MaterialCalendarGridView) r9
            r8.u = r9
            if (r10 != 0) goto L35
            r9 = 8
            r0.setVisibility(r9)
        L35:
            return
    }
}
