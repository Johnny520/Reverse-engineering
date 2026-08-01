package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛳᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0936 extends xhss.AbstractC0784 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean f3038;

    public C0936() {
            r7 = this;
            r0 = 1
            r7.<init>(r0)
            r1 = 0
            r7.m1329(r1)
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r3 = xhss.AbstractC0784.f2568
            java.lang.Object r2 = r2.getObjectVolatile(r7, r3)
            xhss.ᛶᛷᛴᛶ r2 = (xhss.InterfaceC0573) r2
            boolean r5 = r2 instanceof xhss.C0357
            if (r5 == 0) goto L19
            xhss.ᛴᛴᛷᛲ r2 = (xhss.C0357) r2
            goto L1a
        L19:
            r2 = r1
        L1a:
            r5 = 0
            if (r2 == 0) goto L47
            xhss.ᛸᛷᛳᲈ r2 = r2.f1375
            if (r2 == 0) goto L22
            goto L23
        L22:
            r2 = r1
        L23:
            if (r2 != 0) goto L26
            goto L47
        L26:
            boolean r6 = r2.mo1338()
            if (r6 == 0) goto L2d
            goto L48
        L2d:
            sun.misc.Unsafe r6 = xhss.AbstractC1067.f3442
            java.lang.Object r2 = r6.getObjectVolatile(r2, r3)
            xhss.ᛶᛷᛴᛶ r2 = (xhss.InterfaceC0573) r2
            boolean r6 = r2 instanceof xhss.C0357
            if (r6 == 0) goto L3c
            xhss.ᛴᛴᛷᛲ r2 = (xhss.C0357) r2
            goto L3d
        L3c:
            r2 = r1
        L3d:
            if (r2 == 0) goto L47
            xhss.ᛸᛷᛳᲈ r2 = r2.f1375
            if (r2 == 0) goto L44
            goto L45
        L44:
            r2 = r1
        L45:
            if (r2 != 0) goto L26
        L47:
            r0 = r5
        L48:
            r7.f3038 = r0
            return
    }

    @Override // xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛳᛶᛷᲀ */
    public final boolean mo1334() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛴᲈᛱᛴ */
    public final boolean mo1338() {
            r0 = this;
            boolean r0 = r0.f3038
            return r0
    }
}
