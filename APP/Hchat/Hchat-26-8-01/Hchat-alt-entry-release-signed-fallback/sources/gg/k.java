package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f4557a = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            gg.k.f4557a = r0
            return
    }

    public static final java.lang.Object[] a(java.util.Collection r4) {
            r4.getClass()
            int r0 = r4.size()
            java.lang.Object[] r1 = gg.k.f4557a
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.util.Iterator r4 = r4.iterator()
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L17
            return r1
        L17:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L1a:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L46
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2c
            return r0
        L2c:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L40
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L3a
            goto L40
        L3a:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L40:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
        L44:
            r1 = r2
            goto L1a
        L46:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L44
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            return r4
    }

    public static final java.lang.Object[] b(java.util.Collection r5, java.lang.Object[] r6) {
            r5.getClass()
            r6.getClass()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L14
            int r5 = r6.length
            if (r5 <= 0) goto L23
            r6[r2] = r1
            return r6
        L14:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L24
            int r5 = r6.length
            if (r5 <= 0) goto L23
            r6[r2] = r1
        L23:
            return r6
        L24:
            int r3 = r6.length
            if (r0 > r3) goto L29
            r0 = r6
            goto L3a
        L29:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3a:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L66
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L4c
            return r0
        L4c:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L60
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L5a
            goto L60
        L5a:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L60:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
        L64:
            r2 = r3
            goto L3a
        L66:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L64
            if (r0 != r6) goto L71
            r6[r3] = r1
            return r6
        L71:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            return r5
    }
}
