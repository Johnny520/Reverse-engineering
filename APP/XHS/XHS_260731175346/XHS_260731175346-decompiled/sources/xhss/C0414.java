package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0414 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int[] f1467;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f1468;

    public C0414() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.f1467 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m804(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.f1467
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.f1468
            r1 = r1 | r2
            r3.f1468 = r1
            r0[r4] = r5
        L11:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m805() {
            r1 = this;
            int r0 = r1.f1468
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r1 = r1.f1467
            r0 = 4
            r1 = r1[r0]
            return r1
        Lc:
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
    }
}
