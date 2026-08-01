package defpackage;

/* JADX INFO: renamed from: ᛲᛱᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0229 extends defpackage.AbstractC2000 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f1388;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f1389;

    public C0229(int r2, java.util.ArrayList r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1388 = r0
            r0.addAll(r3)
            r1.f1389 = r2
            return
    }

    public C0229(defpackage.AbstractC2000 r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1388 = r0
            r0.add(r2)
            r2 = 0
            r0.add(r2)
            r2 = 2
            r1.f1389 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            r0 = 1
            int r1 = r2.f1389
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L10
            r0 = 3
            if (r1 != r0) goto Le
            java.lang.String r0 = "||"
            goto L15
        Le:
            r2 = 0
            throw r2
        L10:
            java.lang.String r0 = "!"
            goto L15
        L13:
            java.lang.String r0 = "&&"
        L15:
            java.lang.String r1 = " "
            java.lang.String r0 = defpackage.AbstractC0225.m817(r1, r0, r1)
            java.util.ArrayList r2 = r2.f1388
            java.lang.String r1 = ""
            java.lang.String r2 = defpackage.AbstractC1849.m3251(r0, r1, r2)
            java.lang.String r0 = "("
            java.lang.String r1 = ")"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r2, r1)
            return r2
    }

    @Override // defpackage.InterfaceC1644
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo837(defpackage.C1412 r5) {
            r4 = this;
            r0 = 3
            java.util.ArrayList r1 = r4.f1388
            r2 = 0
            r3 = 1
            int r4 = r4.f1389
            if (r4 != r0) goto L20
            java.util.Iterator r4 = r1.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()
            ᲇᛲᛶ r0 = (defpackage.AbstractC2000) r0
            boolean r0 = r0.mo837(r5)
            if (r0 == 0) goto Ld
            goto L39
        L20:
            if (r4 != r3) goto L3a
            java.util.Iterator r4 = r1.iterator()
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            ᲇᛲᛶ r0 = (defpackage.AbstractC2000) r0
            boolean r0 = r0.mo837(r5)
            if (r0 != 0) goto L26
        L38:
            return r2
        L39:
            return r3
        L3a:
            java.lang.Object r4 = r1.get(r2)
            ᲇᛲᛶ r4 = (defpackage.AbstractC2000) r4
            boolean r4 = r4.mo837(r5)
            r4 = r4 ^ r3
            return r4
    }
}
