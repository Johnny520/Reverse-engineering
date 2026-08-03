package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends r7.c {
    public final byte[] S(int r4, int r5) {
            r3 = this;
            byte[] r0 = r3.f11553k
            int r1 = r0.length
            int r1 = r1 - r4
            if (r1 < r5) goto L12
            if (r1 > 0) goto L9
            goto L12
        L9:
            byte[] r1 = new byte[r5]
            if (r5 < 0) goto L11
            r2 = 0
            java.lang.System.arraycopy(r0, r4, r1, r2, r5)
        L11:
            return r1
        L12:
            r4 = 0
            return r4
    }

    public final int T(int r4, int r5) {
            r3 = this;
            byte[] r0 = r3.f11553k
            int r1 = r0.length
            int r2 = r4 + r5
            if (r1 >= r2) goto L9
            r4 = 0
            return r4
        L9:
            r1 = 1
            if (r5 != r1) goto L11
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            return r4
        L11:
            r2 = 2
            if (r5 != r2) goto L26
            r5 = r0[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r1
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r5
            short r4 = (short) r4
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            return r4
        L26:
            r0 = 4
            if (r5 != r0) goto L2e
            int r4 = r3.O(r4)
            return r4
        L2e:
            java.lang.String r4 = "Invalid data size "
            java.lang.String r4 = eh.a.l(r5, r4)
            j8.o.t(r4)
            r4 = 0
            return r4
    }
}
