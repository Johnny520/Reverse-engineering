package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xs1 {

    /* JADX INFO: renamed from: α */
    public int f12278;

    /* JADX INFO: renamed from: β */
    public final int[] f12279;

    public xs1() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.f12279 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final int m6782() {
            r1 = this;
            int r0 = r1.f12278
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r1 = r1.f12279
            r0 = 4
            r1 = r1[r0]
            return r1
        Lc:
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m6783(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.f12279
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.f12278
            r1 = r1 | r2
            r3.f12278 = r1
            r0[r4] = r5
        L11:
            return
    }
}
