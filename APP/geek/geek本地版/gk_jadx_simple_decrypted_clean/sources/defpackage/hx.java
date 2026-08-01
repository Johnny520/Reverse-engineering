package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class hx extends pz {
    public RecyclerView a;
    public final w30 b;
    public ex c;
    public ex d;

    public hx() {
        this.b = new w30(this);
    }

    public static int b(View r1, ai r2) {
        int r0 = r2.e(r1);
        int r12 = (r2.c(r1) / 2) + r0;
        int r02 = r2.k();
        return r12 - ((r2.l() / 2) + r02);
    }

    public static View c(nz r8, ai r9) {
        int r0 = r8.v();
        View r1 = null;
        if (r0 != 0) goto L5;
        return null;
    L5:
        int r2 = r9.k();
        int r3 = (r9.l() / 2) + r2;
        int r22 = Integer.MAX_VALUE;
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L11;
        View r5 = r8.u(r4);
        int r6 = r9.e(r5);
        int r62 = Math.abs(((r9.c(r5) / 2) + r6) - r3);
        if (r62 >= r22) goto L10;
        r1 = r5;
        r22 = r62;
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        return r1;
    }

    public final int[] a(nz r5, View r6) {
        int[] r0 = new int[2];
        if (r5.d() == false) goto L5;
        r0[0] = b(r6, d(r5));
    L7:
        if (r5.e() == false) goto L10;
        r0[1] = b(r6, e(r5));
        return r0;
    L10:
        r0[1] = 0;
        return r0;
    L5:
        r0[0] = 0;
        goto L7
    }

    public final ai d(nz r3) {
        ex r0 = this.d;
        if (r0 != null) goto L5;
    L6:
        this.d = new ex(r3, 0);
    L8:
        return this.d;
    L5:
        if (((nz) r0.b) == r3) goto L8;
        goto L6
    }

    public final ai e(nz r3) {
        ex r0 = this.c;
        if (r0 != null) goto L5;
    L6:
        this.c = new ex(r3, 1);
    L8:
        return this.c;
    L5:
        if (((nz) r0.b) == r3) goto L8;
        goto L6
    }

    public final void f() {
        RecyclerView r0 = this.a;
        if (r0 == null) goto L25;
        nz r02 = r0.getLayoutManager();
        if (r02 != null) goto L9;
        return;
    L9:
        if (r02.e() == false) goto L12;
        View r1 = c(r02, e(r02));
    L15:
        if (r1 == null) goto L27;
        int[] r03 = a(r02, r1);
        int r2 = r03[0];
        if (r2 == 0) goto L20;
    L23:
        this.a.Z(r2, r03[1], false);
        return;
    L20:
        if (r03[1] != 0) goto L23;
        return;
    L27:
        return;
    L12:
        if (r02.d() == false) goto L14;
        r1 = c(r02, d(r02));
        goto L15
    L14:
        r1 = null;
        goto L15
    }
}
