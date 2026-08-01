package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛶᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0479 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f1737;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f1738;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.lang.Object f1739;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f1740;

    public AbstractC0479() {
            r1 = this;
            r1.<init>()
            xhss.ᛶᛵᲇᛸ r1 = xhss.C0564.f1994
            if (r1 != 0) goto L10
            xhss.ᛶᛵᲇᛸ r1 = new xhss.ᛶᛵᲇᛸ
            r0 = 26
            r1.<init>(r0)
            xhss.C0564.f1994 = r1
        L10:
            return
    }

    public boolean hasNext() {
            r1 = this;
            int r0 = r1.f1737
            java.lang.Object r1 = r1.f1739
            xhss.ᛷᛸᛵᛶ r1 = (xhss.C0686) r1
            int r1 = r1.f2328
            if (r0 >= r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public void remove() {
            r3 = this;
            java.lang.Object r0 = r3.f1739
            xhss.ᛷᛸᛵᛶ r0 = (xhss.C0686) r0
            r3.m878()
            int r1 = r3.f1738
            r2 = -1
            if (r1 == r2) goto L1b
            r0.m1164()
            int r1 = r3.f1738
            r0.m1168(r1)
            r3.f1738 = r2
            int r0 = r0.f2324
            r3.f1740 = r0
            return
        L1b:
            java.lang.String r3 = "Call next() before removing element from the iterator."
            xhss.C0532.m950(r3)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void m878() {
            r1 = this;
            java.lang.Object r0 = r1.f1739
            xhss.ᛷᛸᛵᛶ r0 = (xhss.C0686) r0
            int r0 = r0.f2324
            int r1 = r1.f1740
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void m879() {
            r3 = this;
        L0:
            int r0 = r3.f1737
            java.lang.Object r1 = r3.f1739
            xhss.ᛷᛸᛵᛶ r1 = (xhss.C0686) r1
            int r2 = r1.f2328
            if (r0 >= r2) goto L15
            int[] r1 = r1.f2329
            r1 = r1[r0]
            if (r1 >= 0) goto L15
            int r0 = r0 + 1
            r3.f1737 = r0
            goto L0
        L15:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int m880(int r2) {
            r1 = this;
            int r0 = r1.f1740
            if (r2 >= r0) goto L10
            java.lang.Object r0 = r1.f1739
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r1.f1738
            int r1 = r1 + r2
            short r1 = r0.getShort(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }
}
