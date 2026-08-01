package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛱᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0731 extends java.util.ArrayList implements xhss.InterfaceC0233, xhss.InterfaceC0995 {
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m1274(java.util.List r1, xhss.C1021 r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            m1275(r1, r0, r2)     // Catch: java.io.IOException -> L8
        L8:
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static void m1275(java.util.List r3, java.lang.StringBuilder r4, xhss.C1021 r5) {
            r5.getClass()
            r0 = 91
            r4.append(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 1
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            if (r0 == 0) goto L1b
            r0 = 0
            goto L20
        L1b:
            r2 = 44
            r4.append(r2)
        L20:
            if (r1 != 0) goto L28
            java.lang.String r1 = "null"
            r4.append(r1)
            goto Ld
        L28:
            xhss.AbstractC0518.m927(r1, r4, r5)
            goto Ld
        L2c:
            r3 = 93
            r4.append(r3)
            return
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r1 = this;
            xhss.ᲇᛳᛶ r0 = xhss.AbstractC0518.f1886
            java.lang.String r1 = m1274(r1, r0)
            return r1
    }

    @Override // xhss.InterfaceC0995
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void mo1276(java.lang.StringBuilder r1, xhss.C1021 r2) {
            r0 = this;
            m1275(r0, r1, r2)
            return
    }

    @Override // xhss.InterfaceC0651
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.String mo1143() {
            r1 = this;
            xhss.ᲇᛳᛶ r0 = xhss.AbstractC0518.f1886
            java.lang.String r1 = m1274(r1, r0)
            return r1
    }

    @Override // xhss.InterfaceC0233
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.String mo539(xhss.C1021 r1) {
            r0 = this;
            java.lang.String r0 = m1274(r0, r1)
            return r0
    }

    @Override // xhss.InterfaceC0560
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final void mo996(java.lang.StringBuilder r2) {
            r1 = this;
            xhss.ᲇᛳᛶ r0 = xhss.AbstractC0518.f1886
            m1275(r1, r2, r0)
            return
    }
}
