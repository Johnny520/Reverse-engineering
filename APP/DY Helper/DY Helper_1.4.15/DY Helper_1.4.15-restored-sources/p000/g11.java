package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g11 {

    /* JADX INFO: renamed from: α */
    public int f4205;

    /* JADX INFO: renamed from: β */
    public int f4206;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f4207;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f4208;

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f4209;

    /* JADX INFO: renamed from: α */
    public int m2227(long r8) {
            r7 = this;
            int r0 = r7.f4205
            int r0 = r0 + 1
            java.lang.Object r1 = r7.f4207
            long[] r1 = (long[]) r1
            int r2 = r1.length
            r3 = 14
            r4 = 0
            if (r0 > r2) goto Lf
            goto L24
        Lf:
            int r2 = r2 * 2
            long[] r0 = new long[r2]
            int[] r2 = new int[r2]
            int r5 = r1.length
            p000.AbstractC0312g7.m2237(r1, r0, r4, r4, r5)
            java.lang.Object r1 = r7.f4208
            int[] r1 = (int[]) r1
            p000.AbstractC0312g7.m2239(r4, r4, r3, r1, r2)
            r7.f4207 = r0
            r7.f4208 = r2
        L24:
            int r0 = r7.f4205
            int r1 = r0 + 1
            r7.f4205 = r1
            java.lang.Object r1 = r7.f4209
            int[] r1 = (int[]) r1
            int r1 = r1.length
            int r2 = r7.f4206
            if (r2 < r1) goto L49
            int r1 = r1 * 2
            int[] r2 = new int[r1]
            r5 = r4
        L38:
            if (r5 >= r1) goto L40
            int r6 = r5 + 1
            r2[r5] = r6
            r5 = r6
            goto L38
        L40:
            java.lang.Object r1 = r7.f4209
            int[] r1 = (int[]) r1
            p000.AbstractC0312g7.m2239(r4, r4, r3, r1, r2)
            r7.f4209 = r2
        L49:
            int r1 = r7.f4206
            java.lang.Object r2 = r7.f4209
            int[] r2 = (int[]) r2
            r3 = r2[r1]
            r7.f4206 = r3
            java.lang.Object r3 = r7.f4207
            long[] r3 = (long[]) r3
            r3[r0] = r8
            java.lang.Object r4 = r7.f4208
            int[] r4 = (int[]) r4
            r4[r0] = r1
            r2[r1] = r0
        L61:
            if (r0 <= 0) goto L76
            int r2 = r0 + 1
            int r2 = r2 >> 1
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = p000.ln0.m3633(r4, r8)
            if (r4 <= 0) goto L76
            r7.m2229(r2, r0)
            r0 = r2
            goto L61
        L76:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public void m2228(int r3) {
            r2 = this;
            int r2 = r2.f4206
            r0 = 0
            if (r3 < 0) goto L8
            if (r3 >= r2) goto L8
            r0 = 1
        L8:
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lineIndex("
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ") is out of bounds [0, "
            r0.append(r3)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            p000.bm0.m982(r2)
        L28:
            return
    }

    /* JADX INFO: renamed from: γ */
    public void m2229(int r7, int r8) {
            r6 = this;
            java.lang.Object r0 = r6.f4207
            long[] r0 = (long[]) r0
            java.lang.Object r1 = r6.f4208
            int[] r1 = (int[]) r1
            java.lang.Object r6 = r6.f4209
            int[] r6 = (int[]) r6
            r2 = r0[r7]
            r4 = r0[r8]
            r0[r7] = r4
            r0[r8] = r2
            r0 = r1[r7]
            r2 = r1[r8]
            r1[r7] = r2
            r1[r8] = r0
            r6[r2] = r7
            r6[r0] = r8
            return
    }
}
