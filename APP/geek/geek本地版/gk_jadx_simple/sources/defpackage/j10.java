package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j10 {
    public qb0 a;
    public ArrayList b;

    public static long a(jg r9, long r10) {
        qb0 r0 = r9.d;
        ArrayList r1 = r9.k;
        if ((r0 instanceof no) == false) goto L5;
        return r10;
    L5:
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L14;
        hg r6 = (hg) r1.get(r3);
        if ((r6 instanceof jg) == false) goto L13;
        jg r62 = (jg) r6;
        if (r62.d == r0) goto L13;
        r4 = Math.min(r4, a(r62, ((long) r62.f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        jg r12 = r0.i;
        jg r22 = r0.h;
        if (r9 != r12) goto L18;
        long r102 = r10 - r0.j();
        return Math.min(Math.min(r4, a(r22, r102)), r102 - ((long) r22.f));
    L18:
        return r4;
    }

    public static long b(jg r9, long r10) {
        qb0 r0 = r9.d;
        ArrayList r1 = r9.k;
        if ((r0 instanceof no) == false) goto L5;
        return r10;
    L5:
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L14;
        hg r6 = (hg) r1.get(r3);
        if ((r6 instanceof jg) == false) goto L13;
        jg r62 = (jg) r6;
        if (r62.d == r0) goto L13;
        r4 = Math.max(r4, b(r62, ((long) r62.f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        jg r12 = r0.h;
        jg r22 = r0.i;
        if (r9 != r12) goto L18;
        long r02 = r0.j() + r10;
        return Math.max(Math.max(r4, b(r22, r02)), r02 - ((long) r22.f));
    L18:
        return r4;
    }
}
