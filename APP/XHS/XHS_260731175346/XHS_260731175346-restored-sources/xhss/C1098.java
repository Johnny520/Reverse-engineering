package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲇᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1098 extends xhss.AbstractC0660 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f3533;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f3534;

    public C1098(int r2, java.util.ArrayList r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3534 = r0
            r0.addAll(r3)
            r1.f3533 = r2
            return
    }

    public C1098(xhss.AbstractC0660 r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3534 = r0
            r0.add(r2)
            r2 = 0
            r0.add(r2)
            r2 = 2
            r1.f3533 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            r0 = 1
            int r1 = r2.f3533
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
            java.lang.String r0 = xhss.AbstractC0390.m781(r1, r0, r1)
            java.util.ArrayList r2 = r2.f3534
            java.lang.String r1 = ""
            java.lang.String r2 = xhss.AbstractC0473.m868(r0, r1, r2)
            java.lang.String r0 = "("
            java.lang.String r1 = ")"
            java.lang.String r2 = xhss.AbstractC0390.m781(r0, r2, r1)
            return r2
    }

    @Override // xhss.InterfaceC0786
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo223(xhss.C1180 r5) {
            r4 = this;
            r0 = 3
            java.util.ArrayList r1 = r4.f3534
            r2 = 0
            r3 = 1
            int r4 = r4.f3533
            if (r4 != r0) goto L20
            java.util.Iterator r4 = r1.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()
            xhss.ᛷᛵᲁᲁ r0 = (xhss.AbstractC0660) r0
            boolean r0 = r0.mo223(r5)
            if (r0 == 0) goto Ld
            goto L39
        L20:
            if (r4 != r3) goto L3a
            java.util.Iterator r4 = r1.iterator()
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            xhss.ᛷᛵᲁᲁ r0 = (xhss.AbstractC0660) r0
            boolean r0 = r0.mo223(r5)
            if (r0 != 0) goto L26
        L38:
            return r2
        L39:
            return r3
        L3a:
            java.lang.Object r4 = r1.get(r2)
            xhss.ᛷᛵᲁᲁ r4 = (xhss.AbstractC0660) r4
            boolean r4 = r4.mo223(r5)
            r4 = r4 ^ r3
            return r4
    }
}
