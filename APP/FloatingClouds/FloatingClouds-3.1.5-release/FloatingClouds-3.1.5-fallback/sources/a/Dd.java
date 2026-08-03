package a;

/* JADX INFO: loaded from: classes.dex */
public final class Dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.ih f60a;
    public java.util.ArrayList<a.ih> b;

    public static long a(a.V4 r9, long r10) {
            a.ih r0 = r9.d
            boolean r1 = r0 instanceof a.C0120e8
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.ArrayList r1 = r9.k
            int r2 = r1.size()
            r3 = 0
            r4 = r10
        Lf:
            if (r3 >= r2) goto L31
            java.lang.Object r6 = r1.get(r3)
            a.T4 r6 = (a.T4) r6
            boolean r7 = r6 instanceof a.V4
            if (r7 == 0) goto L2e
            a.V4 r6 = (a.V4) r6
            a.ih r7 = r6.d
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
            a.V4 r1 = r0.i
            if (r9 != r1) goto L4d
            long r1 = r0.j()
            a.V4 r9 = r0.h
            long r10 = r10 - r1
            long r0 = a(r9, r10)
            long r0 = java.lang.Math.min(r4, r0)
            int r9 = r9.f
            long r2 = (long) r9
            long r10 = r10 - r2
            long r9 = java.lang.Math.min(r0, r10)
            return r9
        L4d:
            return r4
    }

    public static long b(a.V4 r9, long r10) {
            a.ih r0 = r9.d
            boolean r1 = r0 instanceof a.C0120e8
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.ArrayList r1 = r9.k
            int r2 = r1.size()
            r3 = 0
            r4 = r10
        Lf:
            if (r3 >= r2) goto L31
            java.lang.Object r6 = r1.get(r3)
            a.T4 r6 = (a.T4) r6
            boolean r7 = r6 instanceof a.V4
            if (r7 == 0) goto L2e
            a.V4 r6 = (a.V4) r6
            a.ih r7 = r6.d
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
            a.V4 r1 = r0.h
            if (r9 != r1) goto L4d
            long r1 = r0.j()
            a.V4 r9 = r0.i
            long r10 = r10 + r1
            long r0 = b(r9, r10)
            long r0 = java.lang.Math.max(r4, r0)
            int r9 = r9.f
            long r2 = (long) r9
            long r10 = r10 - r2
            long r9 = java.lang.Math.max(r0, r10)
            return r9
        L4d:
            return r4
    }
}
