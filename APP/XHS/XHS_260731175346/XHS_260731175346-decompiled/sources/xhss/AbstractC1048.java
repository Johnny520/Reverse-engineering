package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛶᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1048 extends xhss.AbstractC0784 implements xhss.InterfaceC0038, xhss.InterfaceC0197 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC0362 f3371;

    public AbstractC1048(xhss.InterfaceC0362 r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            xhss.ᛳᛴᲀᲁ r2 = xhss.C0263.f977
            xhss.ᛳᛵᲈᛲ r2 = r1.mo442(r2)
            xhss.ᛸᛷᛳᲈ r2 = (xhss.AbstractC0784) r2
            r0.m1329(r2)
            xhss.ᛴᛵᛳᛵ r1 = r1.mo599(r0)
            r0.f3371 = r1
            return
    }

    @Override // xhss.InterfaceC0197
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.InterfaceC0362 mo22() {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = r0.f3371
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public final void m1701(int r3, xhss.AbstractC1048 r4, xhss.InterfaceC0517 r5) {
            r2 = this;
            int r3 = xhss.AbstractC0390.m784(r3)
            xhss.ᛵᛷᲈᛶ r0 = xhss.C0500.f1817
            if (r3 == 0) goto L51
            r1 = 1
            if (r3 == r1) goto L50
            r1 = 2
            if (r3 == r1) goto L43
            r0 = 3
            if (r3 != r0) goto L3d
            xhss.ᛴᛵᛳᛵ r3 = r2.f3371     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            java.lang.Object r0 = xhss.C0614.m1072(r3, r0)     // Catch: java.lang.Throwable -> L2d
            r1 = r5
            xhss.ᛷᛲᛳᛴ r1 = (xhss.AbstractC0631) r1     // Catch: java.lang.Throwable -> L2f
            xhss.AbstractC0060.m179(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r5.mo115(r4, r2)     // Catch: java.lang.Throwable -> L2f
            xhss.C0614.m1065(r3, r0)     // Catch: java.lang.Throwable -> L2d
            xhss.ᛸᛴᛸᲈ r3 = xhss.EnumC0757.f2533
            if (r4 == r3) goto L50
            r2.mo152(r4)
            return
        L2d:
            r3 = move-exception
            goto L34
        L2f:
            r4 = move-exception
            xhss.C0614.m1065(r3, r0)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.Throwable -> L2d
        L34:
            xhss.ᲈᛳᛱᲇ r4 = new xhss.ᲈᛳᛱᲇ
            r4.<init>(r3)
            r2.mo152(r4)
            return
        L3d:
            xhss.ᛵᛲᛲᲇ r2 = new xhss.ᛵᛲᛲᲇ
            r2.<init>()
            throw r2
        L43:
            xhss.ᛷᛲᛳᛴ r5 = (xhss.AbstractC0631) r5
            xhss.ᛱᛴᛶᛴ r2 = r5.mo117(r4, r2)
            xhss.ᛱᛴᛶᛴ r2 = xhss.AbstractC0561.m1021(r2)
            r2.mo152(r0)
        L50:
            return
        L51:
            xhss.ᛷᛲᛳᛴ r5 = (xhss.AbstractC0631) r5     // Catch: java.lang.Throwable -> L5f
            xhss.ᛱᛴᛶᛴ r3 = r5.mo117(r4, r2)     // Catch: java.lang.Throwable -> L5f
            xhss.ᛱᛴᛶᛴ r3 = xhss.AbstractC0561.m1021(r3)     // Catch: java.lang.Throwable -> L5f
            xhss.AbstractC1178.m1869(r0, r3)     // Catch: java.lang.Throwable -> L5f
            return
        L5f:
            r3 = move-exception
            xhss.ᲈᛳᛱᲇ r4 = new xhss.ᲈᛳᛱᲇ
            r4.<init>(r3)
            r2.mo152(r4)
            throw r3
    }

    @Override // xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛵᛷᛲᛸ */
    public final void mo1340(java.lang.Object r3) {
            r2 = this;
            boolean r2 = r3 instanceof xhss.C0711
            if (r2 == 0) goto Ld
            xhss.ᛷᲁᲇᛷ r3 = (xhss.C0711) r3
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r0 = xhss.C0711.f2384
            r2.getIntVolatile(r3, r0)
        Ld:
            return
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo152(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = xhss.AbstractC0134.m364(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            xhss.ᛷᲁᲇᛷ r3 = new xhss.ᛷᲁᲇᛷ
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            java.lang.Object r3 = r2.m1335(r3)
            xhss.ᛶᛲᛷᛵ r0 = xhss.AbstractC0485.f1784
            if (r3 != r0) goto L16
            return
        L16:
            r2.mo542(r3)
            return
    }

    @Override // xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final java.lang.String mo1346() {
            r1 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r0 = " was cancelled"
            java.lang.String r1 = r1.concat(r0)
            return r1
    }

    @Override // xhss.AbstractC0784
    /* JADX INFO: renamed from: ᲀᛷᲁᲀ */
    public final void mo1347(xhss.C0442 r1) {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = r0.f3371
            xhss.AbstractC0955.m1565(r0, r1)
            return
    }

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final xhss.InterfaceC0362 mo153() {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = r0.f3371
            return r0
    }
}
