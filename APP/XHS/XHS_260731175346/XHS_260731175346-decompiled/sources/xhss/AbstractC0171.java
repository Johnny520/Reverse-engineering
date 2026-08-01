package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171 extends xhss.AbstractC0561 {
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L24
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L24
        L15:
            xhss.ᛲᛶᛲᛵ r3 = (xhss.AbstractC0171) r3
            byte[] r2 = r2.m408()
            byte[] r3 = r3.m408()
            boolean r2 = java.util.Arrays.equals(r2, r3)
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r4 = this;
            byte[] r4 = r4.m408()
            int r0 = r4.length
            r1 = -2128831035(0xffffffff811c9dc5, float:-2.876587E-38)
            r2 = 0
        L9:
            if (r2 >= r0) goto L17
            r3 = r4[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r3
            r3 = 16777619(0x1000193, float:2.3511016E-38)
            int r1 = r1 * r3
            int r2 = r2 + 1
            goto L9
        L17:
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public final byte[] m408() {
            r3 = this;
            xhss.ᛱᲁᛴᲈ r0 = new xhss.ᛱᲁᛴᲈ
            r0.<init>()
            r3.mo135(r0)
            int r3 = r0.f455
            java.nio.ByteBuffer r1 = r0.f458
            int r1 = r1.capacity()
            int r2 = r0.f455
            int r1 = r1 - r2
            boolean r2 = r0.f463
            if (r2 == 0) goto L24
            byte[] r1 = new byte[r1]
            java.nio.ByteBuffer r2 = r0.f458
            r2.position(r3)
            java.nio.ByteBuffer r3 = r0.f458
            r3.get(r1)
            return r1
        L24:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r3.<init>(r0)
            throw r3
    }
}
