package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class sg extends jg {
    public int m;

    public sg(qb0 r1) {
        super(r1);
        if ((r1 instanceof po) == false) goto L6;
        this.e = 2;
        return;
    L6:
        this.e = 3;
    }

    @Override // defpackage.jg
    public final void d(int r4) {
        if (this.j == true) goto L8;
        this.j = true;
        this.g = r4;
        ArrayList r42 = this.k;
        int r0 = r42.size();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L10;
        Object r2 = r42.get(r1);
        r1 = r1 + 1;
        hg r22 = (hg) r2;
        r22.a(r22);
        goto L6
    L10:
        return;
    }
}
