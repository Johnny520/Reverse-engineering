package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class vj extends qz {
    public final /* synthetic */ wj a;

    public vj(wj r1) {
        this.a = r1;
    }

    @Override // defpackage.qz
    public final void b(RecyclerView r9, int r10, int r11) {
        int r102 = r9.computeHorizontalScrollOffset();
        int r92 = r9.computeVerticalScrollOffset();
        wj r112 = this.a;
        int r0 = r112.a;
        int r1 = r112.s.computeVerticalScrollRange();
        int r2 = r112.r;
        if ((r1 - r2) <= 0) goto L6;
        if (r2 < r0) goto L6;
        boolean r3 = true;
    L7:
        r112.t = r3;
        int r32 = r112.s.computeHorizontalScrollRange();
        int r6 = r112.q;
        if ((r32 - r6) <= 0) goto L11;
        if (r6 < r0) goto L11;
        boolean r02 = true;
    L12:
        r112.u = r02;
        boolean r7 = r112.t;
        if (r7 == true) goto L20;
        if (r02 == true) goto L20;
        if (r112.v == 0) goto L29;
        r112.f(0);
        return;
    L29:
        return;
    L20:
        if (r7 == false) goto L23;
        float r4 = r2;
        r112.l = (int) ((((r4 / 2.0f) + r92) * r4) / r1);
        r112.k = Math.min(r2, (r2 * r2) / r1);
    L23:
        if (r112.u == false) goto L25;
        float r93 = r102;
        float r103 = r6;
        r112.o = (int) ((((r103 / 2.0f) + r93) * r103) / r32);
        r112.n = Math.min(r6, (r6 * r6) / r32);
    L25:
        int r94 = r112.v;
        if (r94 == 0) goto L30;
        if (r94 == 1) goto L30;
        return;
    L30:
        r112.f(1);
        return;
    L11:
        r02 = false;
    L6:
        r3 = false;
        goto L7
    }
}
