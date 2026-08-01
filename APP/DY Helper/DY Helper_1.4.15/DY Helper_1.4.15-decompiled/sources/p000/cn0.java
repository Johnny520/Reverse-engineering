package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cn0 {

    /* JADX INFO: renamed from: α */
    public int[] f2210;

    /* JADX INFO: renamed from: β */
    public int f2211;

    public cn0() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.f2210 = r0
            return
    }

    public cn0(int r1) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[r1]
            r0.f2210 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public int m1267(int r2) {
            r1 = this;
            int r0 = r1.f2211
            int r0 = r0 + (-1)
            if (r0 < 0) goto Lb
            int[] r1 = r1.f2210
            r1 = r1[r0]
            return r1
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: β */
    public int m1268() {
            r2 = this;
            int[] r0 = r2.f2210
            int r1 = r2.f2211
            int r1 = r1 + (-1)
            r2.f2211 = r1
            r2 = r0[r1]
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public void m1269(int r4) {
            r3 = this;
            int[] r0 = r3.f2210
            int r1 = r3.f2211
            int r2 = r0.length
            if (r1 < r2) goto L10
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f2210 = r0
        L10:
            int r1 = r3.f2211
            int r2 = r1 + 1
            r3.f2211 = r2
            r0[r1] = r4
            return
    }

    /* JADX INFO: renamed from: δ */
    public void m1270(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.f2211
            int[] r1 = r4.f2210
            int r2 = r0 + 3
            int r3 = r1.length
            if (r2 < r3) goto L12
            int r3 = r1.length
            int r3 = r3 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r3)
            r4.f2210 = r1
        L12:
            int r5 = r5 + r7
            r1[r0] = r5
            int r5 = r0 + 1
            int r6 = r6 + r7
            r1[r5] = r6
            int r0 = r0 + 2
            r1[r0] = r7
            r4.f2211 = r2
            return
    }

    /* JADX INFO: renamed from: ε */
    public void m1271(int r5, int r6, int r7, int r8) {
            r4 = this;
            int r0 = r4.f2211
            int[] r1 = r4.f2210
            int r2 = r0 + 4
            int r3 = r1.length
            if (r2 < r3) goto L12
            int r3 = r1.length
            int r3 = r3 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r3)
            r4.f2210 = r1
        L12:
            r1[r0] = r5
            int r5 = r0 + 1
            r1[r5] = r6
            int r5 = r0 + 2
            r1[r5] = r7
            int r0 = r0 + 3
            r1[r0] = r8
            r4.f2211 = r2
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void m1272(int r6, int r7) {
            r5 = this;
            if (r6 >= r7) goto L30
            int r0 = r6 + (-3)
            r1 = r6
        L5:
            if (r1 >= r7) goto L23
            int[] r2 = r5.f2210
            r3 = r2[r1]
            r4 = r2[r7]
            if (r3 < r4) goto L1b
            if (r3 != r4) goto L20
            int r3 = r1 + 1
            r3 = r2[r3]
            int r4 = r7 + 1
            r2 = r2[r4]
            if (r3 > r2) goto L20
        L1b:
            int r0 = r0 + 3
            r5.m1273(r0, r1)
        L20:
            int r1 = r1 + 3
            goto L5
        L23:
            int r1 = r0 + 3
            r5.m1273(r1, r7)
            r5.m1272(r6, r0)
            int r0 = r0 + 6
            r5.m1272(r0, r7)
        L30:
            return
    }

    /* JADX INFO: renamed from: η */
    public void m1273(int r5, int r6) {
            r4 = this;
            int[] r4 = r4.f2210
            r0 = r4[r5]
            r1 = r4[r6]
            r4[r5] = r1
            r4[r6] = r0
            int r0 = r5 + 1
            int r1 = r6 + 1
            r2 = r4[r0]
            r3 = r4[r1]
            r4[r0] = r3
            r4[r1] = r2
            int r5 = r5 + 2
            int r6 = r6 + 2
            r0 = r4[r5]
            r1 = r4[r6]
            r4[r5] = r1
            r4[r6] = r0
            return
    }
}
