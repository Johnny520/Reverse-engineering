package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛴᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0857 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f2767;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f2768;

    public C0857(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f2767 = r1
            r0.f2768 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0857
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᲀᛴᛳᛸ r5 = (xhss.C0857) r5
            java.lang.Object r1 = r4.f2767
            java.lang.Object r3 = r5.f2767
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r4 = r4.f2768
            java.lang.Object r5 = r5.f2768
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.f2767
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r2.f2768
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r2.f2767
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r2 = r2.f2768
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
