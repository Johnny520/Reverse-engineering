package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pt implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public pt(defpackage.k70 r4) {
            r3 = this;
            r0 = 2
            r3.a = r0
            r3.<init>()
            r3.c = r4
            c1 r0 = new c1
            androidx.appcompat.widget.Toolbar r1 = r4.a
            android.content.Context r1 = r1.getContext()
            java.lang.CharSequence r4 = r4.h
            r0.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.e = r2
            r0.g = r2
            r2 = 0
            r0.l = r2
            r0.m = r2
            r2 = 0
            r0.n = r2
            r0.o = r2
            r2 = 16
            r0.p = r2
            r0.i = r1
            r0.a = r4
            r3.b = r0
            return
    }

    public /* synthetic */ pt(defpackage.ut r1, com.google.android.material.datepicker.c r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto L60;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.c
            k70 r4 = (defpackage.k70) r4
            android.view.Window$Callback r0 = r4.k
            if (r0 == 0) goto L19
            boolean r4 = r4.l
            if (r4 == 0) goto L19
            java.lang.Object r4 = r3.b
            c1 r4 = (defpackage.c1) r4
            r1 = 0
            r0.onMenuItemSelected(r1, r4)
        L19:
            return
        L1a:
            java.lang.Object r4 = r3.c
            ut r4 = (defpackage.ut) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            nz r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r1 = 0
            int r2 = r0.v()
            android.view.View r0 = r0.K0(r1, r2, r1)
            if (r0 != 0) goto L33
            r0 = -1
            goto L37
        L33:
            int r0 = defpackage.nz.F(r0)
        L37:
            int r0 = r0 + 1
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            fz r1 = r1.getAdapter()
            int r1 = r1.a()
            if (r0 >= r1) goto L5f
            java.lang.Object r1 = r3.b
            com.google.android.material.datepicker.c r1 = (com.google.android.material.datepicker.c) r1
            c8 r1 = r1.c
            zv r1 = r1.a
            java.util.Calendar r1 = r1.a
            java.util.Calendar r1 = defpackage.u80.a(r1)
            r2 = 2
            r1.add(r2, r0)
            zv r0 = new zv
            r0.<init>(r1)
            r4.D(r0)
        L5f:
            return
        L60:
            java.lang.Object r4 = r3.c
            ut r4 = (defpackage.ut) r4
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            nz r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.I0()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L8e
            java.lang.Object r1 = r3.b
            com.google.android.material.datepicker.c r1 = (com.google.android.material.datepicker.c) r1
            c8 r1 = r1.c
            zv r1 = r1.a
            java.util.Calendar r1 = r1.a
            java.util.Calendar r1 = defpackage.u80.a(r1)
            r2 = 2
            r1.add(r2, r0)
            zv r0 = new zv
            r0.<init>(r1)
            r4.D(r0)
        L8e:
            return
    }
}
