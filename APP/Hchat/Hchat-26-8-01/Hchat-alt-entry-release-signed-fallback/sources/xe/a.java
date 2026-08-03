package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
            java.lang.Class<xe.a> r0 = xe.a.class
            mh.d.b(r0)
            return
    }

    public static java.lang.String a(java.lang.String r8, java.lang.String r9) {
            boolean r0 = java.util.Objects.equals(r8, r9)
            if (r0 == 0) goto L7
            return r8
        L7:
            boolean r0 = xe.q.g(r8)
            if (r0 != 0) goto L61
            boolean r0 = xe.q.g(r9)
            if (r0 == 0) goto L14
            goto L61
        L14:
            b5.k r0 = new b5.k
            r0.<init>()
            kd.c r1 = new kd.c
            r2 = 3
            r1.<init>(r0, r2)
            xe.q.j(r8, r1)
            b5.k r1 = new b5.k
            r1.<init>()
            kd.c r2 = new kd.c
            r3 = 3
            r2.<init>(r1, r3)
            xe.q.j(r9, r2)
            int r2 = r0.f489c
            if (r2 != 0) goto L38
            int r3 = r1.f489c
            if (r3 == 0) goto L59
        L38:
            float r2 = (float) r2
            int r3 = r0.f488b
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r1.f489c
            float r3 = (float) r3
            int r4 = r1.f488b
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = r3 - r2
            float r4 = java.lang.Math.abs(r4)
            double r4 = (double) r4
            r6 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L59
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 > 0) goto L60
            goto L5f
        L59:
            int r0 = r0.f488b
            int r1 = r1.f488b
            if (r0 < r1) goto L60
        L5f:
            return r8
        L60:
            return r9
        L61:
            if (r8 == 0) goto L6a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L6a
            return r8
        L6a:
            return r9
    }
}
