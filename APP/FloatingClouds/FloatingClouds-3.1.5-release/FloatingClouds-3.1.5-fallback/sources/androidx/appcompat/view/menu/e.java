package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class e extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f821a;
    public int b;
    public boolean c;
    public final boolean d;
    public final android.view.LayoutInflater e;
    public final int f;

    public e(androidx.appcompat.view.menu.f r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.b = r0
            r1.d = r4
            r1.e = r3
            r1.f821a = r2
            r1.f = r5
            r1.b()
            return
    }

    public final void b() {
            r5 = this;
            androidx.appcompat.view.menu.f r0 = r5.f821a
            androidx.appcompat.view.menu.h r1 = r0.v
            if (r1 == 0) goto L20
            r0.i()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.j
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.h r4 = (androidx.appcompat.view.menu.h) r4
            if (r4 != r1) goto L1d
            r5.b = r3
            return
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            r0 = -1
            r5.b = r0
            return
    }

    public final androidx.appcompat.view.menu.h c(int r3) {
            r2 = this;
            androidx.appcompat.view.menu.f r0 = r2.f821a
            boolean r1 = r2.d
            if (r1 == 0) goto Lc
            r0.i()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.j
            goto L10
        Lc:
            java.util.ArrayList r0 = r0.l()
        L10:
            int r1 = r2.b
            if (r1 < 0) goto L18
            if (r3 < r1) goto L18
            int r3 = r3 + 1
        L18:
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.view.menu.h r3 = (androidx.appcompat.view.menu.h) r3
            return r3
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            androidx.appcompat.view.menu.f r0 = r2.f821a
            boolean r1 = r2.d
            if (r1 == 0) goto Lc
            r0.i()
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r0.j
            goto L10
        Lc:
            java.util.ArrayList r0 = r0.l()
        L10:
            int r1 = r2.b
            if (r1 >= 0) goto L19
            int r0 = r0.size()
            return r0
        L19:
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.h r1 = r0.c(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.e
            int r1 = r5.f
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            androidx.appcompat.view.menu.h r8 = r5.c(r6)
            int r8 = r8.b
            int r1 = r6 + (-1)
            if (r1 < 0) goto L1c
            androidx.appcompat.view.menu.h r1 = r5.c(r1)
            int r1 = r1.b
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            androidx.appcompat.view.menu.f r3 = r5.f821a
            boolean r3 = r3.m()
            r4 = 1
            if (r3 == 0) goto L2c
            if (r8 == r1) goto L2c
            r0 = r4
        L2c:
            r2.setGroupDividerEnabled(r0)
            r8 = r7
            androidx.appcompat.view.menu.k$a r8 = (androidx.appcompat.view.menu.k.a) r8
            boolean r0 = r5.c
            if (r0 == 0) goto L39
            r2.setForceShowIcon(r4)
        L39:
            androidx.appcompat.view.menu.h r6 = r5.c(r6)
            r8.b(r6)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.b()
            super.notifyDataSetChanged()
            return
    }
}
