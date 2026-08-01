package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲈᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0329 extends xhss.AbstractC0006 implements xhss.InterfaceC0883, xhss.InterfaceC0957, xhss.InterfaceC0938 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int f1242;

    public AbstractC0329(int r7, java.lang.Class r8, java.lang.Object r9, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            r5 = 0
            r0 = r6
            r2 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f1242 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof xhss.AbstractC0329
            if (r0 == 0) goto L37
            xhss.ᛳᲈᲁᛲ r3 = (xhss.AbstractC0329) r3
            java.lang.String r0 = r2.f144
            java.lang.String r1 = r3.f144
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r2.f147
            java.lang.String r1 = r3.f147
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r2.f143
            java.lang.Object r1 = r3.f143
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L4b
            xhss.ᛲᛵᲀᲈ r2 = r2.m93()
            xhss.ᛲᛵᲀᲈ r3 = r3.m93()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4b
        L35:
            r2 = 1
            return r2
        L37:
            boolean r0 = r3 instanceof xhss.AbstractC0329
            if (r0 == 0) goto L4b
            xhss.ᲁᛶᛳᲀ r0 = r2.f142
            if (r0 != 0) goto L45
            r2.mo92()
            r2.f142 = r2
            goto L46
        L45:
            r2 = r0
        L46:
            boolean r2 = r3.equals(r2)
            return r2
        L4b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            r2.m93()
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
            xhss.ᲁᛶᛳᲀ r0 = r2.f142
            if (r0 != 0) goto La
            r2.mo92()
            r2.f142 = r2
            r0 = r2
        La:
            if (r0 == r2) goto L11
            java.lang.String r2 = r0.toString()
            return r2
        L11:
            java.lang.String r0 = "<init>"
            java.lang.String r2 = r2.f144
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r2 = "constructor (Kotlin reflection is not available)"
            return r2
        L1e:
            java.lang.String r0 = "function "
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.String r2 = xhss.AbstractC0390.m781(r0, r2, r1)
            return r2
    }

    @Override // xhss.InterfaceC0883
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int mo665() {
            r0 = this;
            int r0 = r0.f1242
            return r0
    }

    @Override // xhss.AbstractC0006
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.InterfaceC0957 mo92() {
            r1 = this;
            xhss.ᛷᛸᲈᛳ r0 = xhss.AbstractC0256.f946
            r0.getClass()
            return r1
    }
}
