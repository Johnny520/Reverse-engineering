package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int r6, int r7) {
            r5 = this;
            if (r6 < 0) goto L3a
            if (r7 < 0) goto L32
            int r0 = r5.d
            int r1 = r0 * 2
            int[] r2 = r5.c
            r3 = 4
            if (r2 != 0) goto L16
            int[] r0 = new int[r3]
            r5.c = r0
            r2 = -1
            java.util.Arrays.fill(r0, r2)
            goto L23
        L16:
            int r4 = r2.length
            if (r1 < r4) goto L23
            int r0 = r0 * r3
            int[] r0 = new int[r0]
            r5.c = r0
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r0, r4, r3)
        L23:
            int[] r0 = r5.c
            r0[r1] = r6
            int r1 = r1 + 1
            r0[r1] = r7
            int r6 = r5.d
            int r6 = r6 + 1
            r5.d = r6
            return
        L32:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Pixel distance must be non-negative"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Layout positions must be non-negative"
            r6.<init>(r7)
            throw r6
    }

    public final void b(androidx.recyclerview.widget.RecyclerView r5, boolean r6) {
            r4 = this;
            r0 = 0
            r4.d = r0
            int[] r0 = r4.c
            if (r0 == 0) goto Lb
            r1 = -1
            java.util.Arrays.fill(r0, r1)
        Lb:
            nz r0 = r5.l
            fz r1 = r5.k
            if (r1 == 0) goto L49
            if (r0 == 0) goto L49
            boolean r1 = r0.i
            if (r1 == 0) goto L49
            if (r6 == 0) goto L2b
            y1 r1 = r5.d
            boolean r1 = r1.f()
            if (r1 != 0) goto L3a
            fz r1 = r5.k
            int r1 = r1.a()
            r0.i(r1, r4)
            goto L3a
        L2b:
            boolean r1 = r5.K()
            if (r1 != 0) goto L3a
            int r1 = r4.a
            int r2 = r4.b
            yz r3 = r5.c0
            r0.h(r1, r2, r3, r4)
        L3a:
            int r1 = r4.d
            int r2 = r0.j
            if (r1 <= r2) goto L49
            r0.j = r1
            r0.k = r6
            tz r5 = r5.b
            r5.k()
        L49:
            return
    }
}
