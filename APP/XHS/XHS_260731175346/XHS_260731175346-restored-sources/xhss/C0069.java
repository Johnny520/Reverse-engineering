package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0069 extends xhss.AbstractC0052 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.util.ArrayList f367;

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof xhss.C0069
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            xhss.ᛱᛸᛱᲁ r2 = (xhss.C0069) r2
            java.util.ArrayList r1 = r1.f367
            java.util.ArrayList r2 = r2.f367
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ArrayList r0 = r0.f367
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.ArrayList r2 = r2.f367
            java.lang.String r0 = ""
            java.lang.String r1 = ","
            java.lang.String r2 = xhss.AbstractC0473.m868(r1, r0, r2)
            java.lang.String r0 = "["
            java.lang.String r1 = "]"
            java.lang.String r2 = xhss.AbstractC0390.m781(r0, r2, r1)
            return r2
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final xhss.C0069 mo165() {
            r0 = this;
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final java.lang.Class mo167(xhss.C1180 r1) {
            r0 = this;
            java.lang.Class<java.util.List> r0 = java.util.List.class
            return r0
    }
}
