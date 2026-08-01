package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1194 extends xhss.C0333 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f3851;

    public C1194(xhss.InterfaceC0362 r3, xhss.AbstractC0748 r4) {
            r2 = this;
            xhss.ᲈᲁᲇ r0 = xhss.C1189.f3838
            xhss.ᛳᛵᲈᛲ r1 = r3.mo442(r0)
            if (r1 != 0) goto Ld
            xhss.ᛴᛵᛳᛵ r0 = r3.mo599(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f3851 = r0
            xhss.ᛴᛵᛳᛵ r4 = r4.f2508
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f972
            xhss.ᛳᛵᲈᛲ r4 = r4.mo442(r0)
            boolean r4 = r4 instanceof xhss.AbstractC0180
            if (r4 != 0) goto L2f
            r4 = 0
            java.lang.Object r4 = xhss.C0614.m1072(r3, r4)
            xhss.C0614.m1065(r3, r4)
            r2.m1918(r3, r4)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ᛴᛷᛵᛴ, reason: contains not printable characters */
    public final boolean m1917() {
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal r0 = r2.f3851
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal r2 = r2.f3851
            r2.remove()
            r2 = r0 ^ 1
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛷ, reason: contains not printable characters */
    public final void m1918(xhss.InterfaceC0362 r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.threadLocalIsSet = r0
            java.lang.ThreadLocal r1 = r1.f3851
            xhss.ᲀᛴᛳᛸ r0 = new xhss.ᲀᛴᛳᛸ
            r0.<init>(r2, r3)
            r1.set(r0)
            return
    }

    @Override // xhss.C0333, xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final void mo542(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L1c
            java.lang.ThreadLocal r0 = r5.f3851
            java.lang.Object r0 = r0.get()
            xhss.ᲀᛴᛳᛸ r0 = (xhss.C0857) r0
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.f2767
            xhss.ᛴᛵᛳᛵ r1 = (xhss.InterfaceC0362) r1
            java.lang.Object r0 = r0.f2768
            xhss.C0614.m1065(r1, r0)
        L17:
            java.lang.ThreadLocal r0 = r5.f3851
            r0.remove()
        L1c:
            java.lang.Object r6 = xhss.AbstractC1178.m1886(r6)
            xhss.ᛸᛴᛳᛷ r0 = r5.f1247
            xhss.ᛴᛵᛳᛵ r1 = r0.f2508
            r2 = 0
            java.lang.Object r3 = xhss.C0614.m1072(r1, r2)
            xhss.ᛶᛲᛷᛵ r4 = xhss.C0614.f2112
            if (r3 == r4) goto L31
            xhss.ᲈᲇᛵ r2 = xhss.AbstractC0485.m891(r0, r1, r3)
        L31:
            xhss.ᛸᛴᛳᛷ r5 = r5.f1247     // Catch: java.lang.Throwable -> L44
            r5.mo152(r6)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L40
            boolean r5 = r2.m1917()
            if (r5 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            xhss.C0614.m1065(r1, r3)
            return
        L44:
            r5 = move-exception
            if (r2 == 0) goto L4d
            boolean r6 = r2.m1917()
            if (r6 == 0) goto L50
        L4d:
            xhss.C0614.m1065(r1, r3)
        L50:
            throw r5
    }
}
