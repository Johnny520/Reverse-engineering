package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0213 extends java.util.HashMap implements defpackage.InterfaceC0123, defpackage.InterfaceC1798 {
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.lang.String m783(java.util.Map r1, defpackage.C0671 r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            m784(r1, r0, r2)     // Catch: java.io.IOException -> L8
        L8:
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m784(java.util.Map r4, java.lang.StringBuilder r5, defpackage.C0671 r6) {
            r6.getClass()
            r0 = 123(0x7b, float:1.72E-43)
            r5.append(r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto L28
            boolean r3 = r6.f3251
            if (r3 == 0) goto L28
            goto L11
        L28:
            if (r0 == 0) goto L2c
            r0 = 0
            goto L31
        L2c:
            r3 = 44
            r5.append(r3)
        L31:
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = r1.toString()
            defpackage.C0682.m1540(r1, r2, r5, r6)
            goto L11
        L3d:
            r4 = 125(0x7d, float:1.75E-43)
            r5.append(r4)
            return
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
            r1 = this;
            ᛴᛵᛱ r0 = defpackage.AbstractC2325.f9838
            java.lang.String r1 = m783(r1, r0)
            return r1
    }

    @Override // defpackage.InterfaceC1798
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo785(java.lang.StringBuilder r1, defpackage.C0671 r2) {
            r0 = this;
            m784(r0, r1, r2)
            return
    }

    @Override // defpackage.InterfaceC1194
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo786(java.lang.StringBuilder r2) {
            r1 = this;
            ᛴᛵᛱ r0 = defpackage.AbstractC2325.f9838
            m784(r1, r2, r0)
            return
    }

    @Override // defpackage.InterfaceC0123
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo633(defpackage.C0671 r1) {
            r0 = this;
            java.lang.String r0 = m783(r0, r1)
            return r0
    }

    @Override // defpackage.InterfaceC0489
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String mo787() {
            r1 = this;
            ᛴᛵᛱ r0 = defpackage.AbstractC2325.f9838
            java.lang.String r1 = m783(r1, r0)
            return r1
    }
}
