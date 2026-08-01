package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class qw1 {
    /* JADX INFO: renamed from: α */
    public static final int m4945(java.util.ArrayList r0, int r1, int r2) {
            int r0 = m4949(r0, r1, r2)
            if (r0 < 0) goto L7
            return r0
        L7:
            int r0 = r0 + 1
            int r0 = -r0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final int m4946(int r1, int[] r2) {
            int r1 = r1 * 5
            int r0 = r1 + 4
            r0 = r2[r0]
            int r1 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 >> 28
            int r1 = java.lang.Integer.bitCount(r1)
            int r1 = r1 + r0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static final void m4947(int r2, int r3, int[] r4) {
            if (r3 < 0) goto L5
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
        L5:
            int r2 = r2 * 5
            int r2 = r2 + 1
            r0 = r4[r2]
            r1 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r1
            r3 = r3 | r0
            r4[r2] = r3
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final p000.ow1 m4948(p000.ow1 r1) {
            boolean r0 = r1 instanceof p000.ow1
            if (r0 == 0) goto L5
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.String r1 = "Inconsistent composition"
            p000.AbstractC0804sn.m5527(r1)
            pm r1 = new pm
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ε */
    public static final int m4949(java.util.ArrayList r4, int r5, int r6) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            if (r1 > r0) goto L27
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            java.lang.Object r3 = r4.get(r2)
            q80 r3 = (p000.q80) r3
            int r3 = r3.f8904
            if (r3 >= 0) goto L18
            int r3 = r3 + r6
        L18:
            int r3 = p000.ln0.m3632(r3, r5)
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

    /* JADX INFO: renamed from: ζ */
    public static final void m4950() {
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }
}
