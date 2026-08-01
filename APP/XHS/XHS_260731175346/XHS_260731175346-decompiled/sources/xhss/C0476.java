package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛵᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0476 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal f1713 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1068 f1714;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public volatile int f1715;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f1716;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            xhss.C0476.f1713 = r0
            return
    }

    public C0476(xhss.C1068 r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1715 = r0
            r1.f1714 = r2
            r1.f1716 = r3
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            xhss.ᛲᲀᛴᲇ r1 = r5.m874()
            r2 = 4
            int r2 = r1.m880(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.f1739
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.f1737
            int r2 = r2 + r1
            int r1 = r4.getInt(r2)
            goto L2a
        L29:
            r1 = r3
        L2a:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            xhss.ᛲᲀᛴᲇ r1 = r5.m874()
            r2 = 16
            int r2 = r1.m880(r2)
            if (r2 == 0) goto L57
            int r4 = r1.f1737
            int r2 = r2 + r4
            java.lang.Object r4 = r1.f1739
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r2)
            int r4 = r4 + r2
            java.lang.Object r1 = r1.f1739
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            if (r3 >= r1) goto L6d
            int r2 = r5.m875(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0203 m874() {
            r4 = this;
            java.lang.ThreadLocal r0 = xhss.C0476.f1713
            java.lang.Object r1 = r0.get()
            xhss.ᛲᲀᛴᲇ r1 = (xhss.C0203) r1
            if (r1 != 0) goto L12
            xhss.ᛲᲀᛴᲇ r1 = new xhss.ᛲᲀᛴᲇ
            r1.<init>()
            r0.set(r1)
        L12:
            xhss.ᲇᛸᛶ r0 = r4.f1714
            java.lang.Object r0 = r0.f3444
            xhss.ᲁᛸᛱᲀ r0 = (xhss.C0973) r0
            r2 = 6
            int r2 = r0.m880(r2)
            if (r2 == 0) goto L5e
            int r3 = r0.f1737
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f1739
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r4 = r4.f1716
            int r4 = r4 * 4
            int r4 = r4 + r3
            java.lang.Object r2 = r0.f1739
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r4)
            int r2 = r2 + r4
            java.lang.Object r4 = r0.f1739
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.f1739 = r4
            if (r4 == 0) goto L57
            r1.f1737 = r2
            int r4 = r4.getInt(r2)
            int r2 = r2 - r4
            r1.f1738 = r2
            java.lang.Object r4 = r1.f1739
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r4.getShort(r2)
            r1.f1740 = r4
            return r1
        L57:
            r4 = 0
            r1.f1737 = r4
            r1.f1738 = r4
            r1.f1740 = r4
        L5e:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m875(int r3) {
            r2 = this;
            xhss.ᛲᲀᛴᲇ r2 = r2.m874()
            r0 = 16
            int r0 = r2.m880(r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r2.f1739
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.f1737
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            int r2 = r2 + r0
            int r2 = r2 + 4
            int r3 = r3 * 4
            int r3 = r3 + r2
            int r2 = r1.getInt(r3)
            return r2
        L22:
            r2 = 0
            return r2
    }
}
