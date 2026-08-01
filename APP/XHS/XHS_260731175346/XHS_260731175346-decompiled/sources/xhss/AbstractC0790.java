package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛸᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0790 extends xhss.AbstractC0006 implements xhss.InterfaceC0336 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean f2578;

    public AbstractC0790(int r9, java.lang.Class r10, java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
            r8 = this;
            r0 = 1
            r9 = r9 & r0
            r1 = 0
            if (r9 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r4 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f2578 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof xhss.AbstractC0790
            if (r0 == 0) goto L37
            xhss.ᛸᛸᛳᛳ r3 = (xhss.AbstractC0790) r3
            xhss.ᛲᛵᲀᲈ r0 = r2.m93()
            xhss.ᛲᛵᲀᲈ r1 = r3.m93()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.f144
            java.lang.String r1 = r3.f144
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.f147
            java.lang.String r1 = r3.f147
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.Object r2 = r2.f143
            java.lang.Object r3 = r3.f143
            boolean r2 = xhss.AbstractC0007.m97(r2, r3)
            if (r2 == 0) goto L44
        L35:
            r2 = 1
            return r2
        L37:
            boolean r0 = r3 instanceof xhss.InterfaceC0336
            if (r0 == 0) goto L44
            xhss.ᲁᛶᛳᲀ r2 = r2.m1356()
            boolean r2 = r3.equals(r2)
            return r2
        L44:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            xhss.ᛲᛵᲀᲈ r0 = r2.m93()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f144
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.f147
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            xhss.ᲁᛶᛳᲀ r0 = r2.m1356()
            if (r0 == r2) goto Lb
            java.lang.String r2 = r0.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r2 = r2.f144
            r0.append(r2)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.InterfaceC0957 m1356() {
            r1 = this;
            boolean r0 = r1.f2578
            if (r0 == 0) goto L5
            return r1
        L5:
            xhss.ᲁᛶᛳᲀ r0 = r1.f142
            if (r0 != 0) goto Lf
            xhss.ᲁᛶᛳᲀ r0 = r1.mo92()
            r1.f142 = r0
        Lf:
            return r0
    }
}
