package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0823 extends java.util.ArrayList implements defpackage.InterfaceC0123, defpackage.InterfaceC1798 {
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.lang.String m1750(java.util.List r1, defpackage.C0671 r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            m1751(r1, r0, r2)     // Catch: java.io.IOException -> L8
        L8:
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m1751(java.util.List r3, java.lang.StringBuilder r4, defpackage.C0671 r5) {
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
            defpackage.AbstractC2325.m3798(r1, r4, r5)
            goto Ld
        L2c:
            r3 = 93
            r4.append(r3)
            return
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r1 = this;
            ᛴᛵᛱ r0 = defpackage.AbstractC2325.f9838
            java.lang.String r1 = m1750(r1, r0)
            return r1
    }

    @Override // defpackage.InterfaceC1798
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo785(java.lang.StringBuilder r1, defpackage.C0671 r2) {
            r0 = this;
            m1751(r0, r1, r2)
            return
    }

    @Override // defpackage.InterfaceC1194
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo786(java.lang.StringBuilder r2) {
            r1 = this;
            ᛴᛵᛱ r0 = defpackage.AbstractC2325.f9838
            m1751(r1, r2, r0)
            return
    }

    @Override // defpackage.InterfaceC0123
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo633(defpackage.C0671 r1) {
            r0 = this;
            java.lang.String r0 = m1750(r0, r1)
            return r0
    }

    @Override // defpackage.InterfaceC0489
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo787() {
            r1 = this;
            ᛴᛵᛱ r0 = defpackage.AbstractC2325.f9838
            java.lang.String r1 = m1750(r1, r0)
            return r1
    }
}
