package p000;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0861u6 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0381i2 f10605 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.C0381i2 f10606 = null;

    static {
            i2 r0 = new i2
            r1 = 5
            r0.<init>(r1)
            p000.AbstractC0861u6.f10605 = r0
            i2 r0 = new i2
            r1 = 6
            r0.<init>(r1)
            p000.AbstractC0861u6.f10606 = r0
            r6 r0 = new r6
            r1 = 0
            r0.<init>(r1)
            r6 r0 = new r6
            r1 = 3
            r0.<init>(r1)
            r6 r0 = new r6
            r1 = 2
            r0.<init>(r1)
            r6 r0 = new r6
            r1 = 1
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5786(int r5, int[] r6, int[] r7, boolean r8) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto Lc
            r4 = r6[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Lc:
            int r5 = r5 - r3
            float r5 = (float) r5
            r0 = 2
            float r0 = (float) r0
            float r5 = r5 / r0
            if (r8 != 0) goto L27
            int r8 = r6.length
            r0 = r1
        L15:
            if (r1 >= r8) goto L3a
            r2 = r6[r1]
            int r3 = r0 + 1
            int r4 = java.lang.Math.round(r5)
            r7[r0] = r4
            float r0 = (float) r2
            float r5 = r5 + r0
            int r1 = r1 + 1
            r0 = r3
            goto L15
        L27:
            int r8 = r6.length
            int r8 = r8 + (-1)
        L2a:
            r0 = -1
            if (r0 >= r8) goto L3a
            r0 = r6[r8]
            int r1 = java.lang.Math.round(r5)
            r7[r8] = r1
            float r0 = (float) r0
            float r5 = r5 + r0
            int r8 = r8 + (-1)
            goto L2a
        L3a:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m5787(int[] r5, int[] r6, boolean r7) {
            r0 = 0
            if (r7 != 0) goto L13
            int r7 = r5.length
            r1 = r0
            r2 = r1
        L6:
            if (r0 >= r7) goto L21
            r3 = r5[r0]
            int r4 = r1 + 1
            r6[r1] = r2
            int r2 = r2 + r3
            int r0 = r0 + 1
            r1 = r4
            goto L6
        L13:
            int r7 = r5.length
            int r7 = r7 + (-1)
        L16:
            r1 = -1
            if (r1 >= r7) goto L21
            r1 = r5[r7]
            r6[r7] = r0
            int r0 = r0 + r1
            int r7 = r7 + (-1)
            goto L16
        L21:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m5788(int r6, int[] r7, int[] r8, boolean r9) {
            int r0 = r7.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto Lc
            r4 = r7[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Lc:
            int r0 = r7.length
            if (r0 != 0) goto L11
            r6 = 0
            goto L16
        L11:
            int r6 = r6 - r3
            float r6 = (float) r6
            int r0 = r7.length
            float r0 = (float) r0
            float r6 = r6 / r0
        L16:
            r0 = 2
            float r0 = (float) r0
            float r0 = r6 / r0
            if (r9 != 0) goto L31
            int r9 = r7.length
            r2 = r1
        L1e:
            if (r1 >= r9) goto L45
            r3 = r7[r1]
            int r4 = r2 + 1
            int r5 = java.lang.Math.round(r0)
            r8[r2] = r5
            float r2 = (float) r3
            float r2 = r2 + r6
            float r0 = r0 + r2
            int r1 = r1 + 1
            r2 = r4
            goto L1e
        L31:
            int r9 = r7.length
            int r9 = r9 + (-1)
        L34:
            r1 = -1
            if (r1 >= r9) goto L45
            r1 = r7[r9]
            int r2 = java.lang.Math.round(r0)
            r8[r9] = r2
            float r1 = (float) r1
            float r1 = r1 + r6
            float r0 = r0 + r1
            int r9 = r9 + (-1)
            goto L34
        L45:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m5789(int r6, int[] r7, int[] r8, boolean r9) {
            int r0 = r7.length
            if (r0 != 0) goto L4
            goto L4d
        L4:
            int r0 = r7.length
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            if (r2 >= r0) goto L10
            r4 = r7[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L8
        L10:
            int r0 = r7.length
            r2 = 1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r0, r2)
            int r6 = r6 - r3
            float r6 = (float) r6
            float r0 = (float) r0
            float r6 = r6 / r0
            if (r9 == 0) goto L22
            int r0 = r7.length
            if (r0 != r2) goto L22
            r0 = r6
            goto L23
        L22:
            r0 = 0
        L23:
            if (r9 != 0) goto L3a
            int r9 = r7.length
            r2 = r1
        L27:
            if (r1 >= r9) goto L4d
            r3 = r7[r1]
            int r4 = r2 + 1
            int r5 = java.lang.Math.round(r0)
            r8[r2] = r5
            float r2 = (float) r3
            float r2 = r2 + r6
            float r0 = r0 + r2
            int r1 = r1 + 1
            r2 = r4
            goto L27
        L3a:
            int r9 = r7.length
            int r9 = r9 - r2
        L3c:
            r1 = -1
            if (r1 >= r9) goto L4d
            r1 = r7[r9]
            int r2 = java.lang.Math.round(r0)
            r8[r9] = r2
            float r1 = (float) r1
            float r1 = r1 + r6
            float r0 = r0 + r1
            int r9 = r9 + (-1)
            goto L3c
        L4d:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m5790(int r6, int[] r7, int[] r8, boolean r9) {
            int r0 = r7.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto Lc
            r4 = r7[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Lc:
            int r6 = r6 - r3
            float r6 = (float) r6
            int r0 = r7.length
            int r0 = r0 + 1
            float r0 = (float) r0
            float r6 = r6 / r0
            if (r9 != 0) goto L2b
            int r9 = r7.length
            r2 = r6
            r0 = r1
        L18:
            if (r1 >= r9) goto L40
            r3 = r7[r1]
            int r4 = r0 + 1
            int r5 = java.lang.Math.round(r2)
            r8[r0] = r5
            float r0 = (float) r3
            float r0 = r0 + r6
            float r2 = r2 + r0
            int r1 = r1 + 1
            r0 = r4
            goto L18
        L2b:
            int r9 = r7.length
            int r9 = r9 + (-1)
            r0 = r6
        L2f:
            r1 = -1
            if (r1 >= r9) goto L40
            r1 = r7[r9]
            int r2 = java.lang.Math.round(r0)
            r8[r9] = r2
            float r1 = (float) r1
            float r1 = r1 + r6
            float r0 = r0 + r1
            int r9 = r9 + (-1)
            goto L2f
        L40:
            return
    }
}
