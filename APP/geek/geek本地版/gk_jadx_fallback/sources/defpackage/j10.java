package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j10 {
    public defpackage.qb0 a;
    public java.util.ArrayList b;

    public static long a(defpackage.jg r9, long r10) {
            qb0 r0 = r9.d
            java.util.ArrayList r1 = r9.k
            boolean r2 = r0 instanceof defpackage.no
            if (r2 == 0) goto L9
            return r10
        L9:
            int r2 = r1.size()
            r3 = 0
            r4 = r10
        Lf:
            if (r3 >= r2) goto L31
            java.lang.Object r6 = r1.get(r3)
            hg r6 = (defpackage.hg) r6
            boolean r7 = r6 instanceof defpackage.jg
            if (r7 == 0) goto L2e
            jg r6 = (defpackage.jg) r6
            qb0 r7 = r6.d
            if (r7 != r0) goto L22
            goto L2e
        L22:
            int r7 = r6.f
            long r7 = (long) r7
            long r7 = r7 + r10
            long r6 = a(r6, r7)
            long r4 = java.lang.Math.min(r4, r6)
        L2e:
            int r3 = r3 + 1
            goto Lf
        L31:
            jg r1 = r0.i
            jg r2 = r0.h
            if (r9 != r1) goto L4d
            long r0 = r0.j()
            long r10 = r10 - r0
            long r0 = a(r2, r10)
            long r0 = java.lang.Math.min(r4, r0)
            int r9 = r2.f
            long r2 = (long) r9
            long r10 = r10 - r2
            long r9 = java.lang.Math.min(r0, r10)
            return r9
        L4d:
            return r4
    }

    public static long b(defpackage.jg r9, long r10) {
            qb0 r0 = r9.d
            java.util.ArrayList r1 = r9.k
            boolean r2 = r0 instanceof defpackage.no
            if (r2 == 0) goto L9
            return r10
        L9:
            int r2 = r1.size()
            r3 = 0
            r4 = r10
        Lf:
            if (r3 >= r2) goto L31
            java.lang.Object r6 = r1.get(r3)
            hg r6 = (defpackage.hg) r6
            boolean r7 = r6 instanceof defpackage.jg
            if (r7 == 0) goto L2e
            jg r6 = (defpackage.jg) r6
            qb0 r7 = r6.d
            if (r7 != r0) goto L22
            goto L2e
        L22:
            int r7 = r6.f
            long r7 = (long) r7
            long r7 = r7 + r10
            long r6 = b(r6, r7)
            long r4 = java.lang.Math.max(r4, r6)
        L2e:
            int r3 = r3 + 1
            goto Lf
        L31:
            jg r1 = r0.h
            jg r2 = r0.i
            if (r9 != r1) goto L4d
            long r0 = r0.j()
            long r0 = r0 + r10
            long r9 = b(r2, r0)
            long r9 = java.lang.Math.max(r4, r9)
            int r11 = r2.f
            long r2 = (long) r11
            long r0 = r0 - r2
            long r9 = java.lang.Math.max(r9, r0)
            return r9
        L4d:
            return r4
    }
}
