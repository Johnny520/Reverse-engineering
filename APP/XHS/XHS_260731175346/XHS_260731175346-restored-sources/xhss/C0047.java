package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛵᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0047 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final xhss.C0289 f319 = null;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final xhss.C0289 f320 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final xhss.C0289 f321 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0289 f322 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0289 f323 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final xhss.C0289 f324 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0289 f325;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f326;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0289 f327;

    static {
            java.lang.String r0 = ":"
            xhss.ᛳᛶᲈᲈ r0 = xhss.AbstractC1178.m1887(r0)
            xhss.C0047.f323 = r0
            java.lang.String r0 = ":status"
            xhss.ᛳᛶᲈᲈ r0 = xhss.AbstractC1178.m1887(r0)
            xhss.C0047.f319 = r0
            java.lang.String r0 = ":method"
            xhss.ᛳᛶᲈᲈ r0 = xhss.AbstractC1178.m1887(r0)
            xhss.C0047.f324 = r0
            java.lang.String r0 = ":path"
            xhss.ᛳᛶᲈᲈ r0 = xhss.AbstractC1178.m1887(r0)
            xhss.C0047.f322 = r0
            java.lang.String r0 = ":scheme"
            xhss.ᛳᛶᲈᲈ r0 = xhss.AbstractC1178.m1887(r0)
            xhss.C0047.f321 = r0
            java.lang.String r0 = ":authority"
            xhss.ᛳᛶᲈᲈ r0 = xhss.AbstractC1178.m1887(r0)
            xhss.C0047.f320 = r0
            return
    }

    public C0047(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            byte[] r2 = r4.getBytes(r1)
            r0.<init>(r2)
            r0.f1120 = r4
            xhss.ᛳᛶᲈᲈ r4 = new xhss.ᛳᛶᲈᲈ
            byte[] r1 = r5.getBytes(r1)
            r4.<init>(r1)
            r4.f1120 = r5
            r3.<init>(r0, r4)
            return
    }

    public C0047(xhss.C0289 r3, java.lang.String r4) {
            r2 = this;
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.f1120 = r4
            r2.<init>(r3, r0)
            return
    }

    public C0047(xhss.C0289 r1, xhss.C0289 r2) {
            r0 = this;
            r0.<init>()
            r0.f327 = r1
            r0.f325 = r2
            int r1 = r1.mo611()
            int r1 = r1 + 32
            int r2 = r2.mo611()
            int r2 = r2 + r1
            r0.f326 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0047
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᛱᛵᲀᛱ r5 = (xhss.C0047) r5
            xhss.ᛳᛶᲈᲈ r1 = r4.f327
            xhss.ᛳᛶᲈᲈ r3 = r5.f327
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            xhss.ᛳᛶᲈᲈ r4 = r4.f325
            xhss.ᛳᛶᲈᲈ r5 = r5.f325
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            xhss.ᛳᛶᲈᲈ r0 = r1.f327
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xhss.ᛳᛶᲈᲈ r1 = r1.f325
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            xhss.ᛳᛶᲈᲈ r1 = r2.f327
            java.lang.String r1 = r1.m614()
            r0.<init>(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            xhss.ᛳᛶᲈᲈ r2 = r2.f325
            java.lang.String r2 = r2.m614()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
