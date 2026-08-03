package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final int a(java.util.ArrayList r0, int r1, int r2) {
            int r0 = e(r0, r1, r2)
            if (r0 < 0) goto L7
            return r0
        L7:
            int r0 = r0 + 1
            int r0 = -r0
            return r0
    }

    public static final int b(int[] r1, int r2) {
            int r2 = r2 * 5
            int r0 = r2 + 4
            r0 = r1[r0]
            int r2 = r2 + 1
            r1 = r1[r2]
            int r1 = r1 >> 28
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 + r0
            return r1
    }

    public static final void c(int[] r2, int r3, int r4) {
            if (r4 < 0) goto L5
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
        L5:
            int r3 = r3 * 5
            int r3 = r3 + 1
            r0 = r2[r3]
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r4 = r4 | r0
            r2[r3] = r4
            return
    }

    public static final l0.h d(l0.h r1) {
            boolean r0 = r1 instanceof l0.h
            if (r0 == 0) goto L5
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.String r1 = "Inconsistent composition"
            i0.m.b(r1)
            okio.a.c()
            r1 = 0
            return r1
    }

    public static final int e(java.util.ArrayList r4, int r5, int r6) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            if (r1 > r0) goto L27
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            java.lang.Object r3 = r4.get(r2)
            l0.b r3 = (l0.b) r3
            int r3 = r3.f7654a
            if (r3 >= 0) goto L18
            int r3 = r3 + r6
        L18:
            int r3 = gg.l.c(r3, r5)
            if (r3 >= 0) goto L21
            int r1 = r2 + 1
            goto L7
        L21:
            if (r3 <= 0) goto L26
            int r0 = r2 + (-1)
            goto L7
        L26:
            return r2
        L27:
            int r1 = r1 + 1
            int r4 = -r1
            return r4
    }

    public static final void f() {
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }
}
