package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲁᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1187 extends xhss.C1181 {

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0819 f3837;

    public C1187(xhss.C0819 r1) {
            r0 = this;
            r0.f3837 = r1
            r0.<init>()
            return
    }

    @Override // xhss.C1181
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final void mo851() {
            r2 = this;
            xhss.ᛸᲇᲇᛶ r2 = r2.f3837
            boolean r0 = r2.f2667
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r2.f2667 = r0
            xhss.ᲇᛸᛵᛴ r0 = r2.f2663
            if (r0 == 0) goto L13
            xhss.ᛷᛶᛷᛲ r0 = r0.f3439
            r0.cancel()
        L13:
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f2660
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            xhss.ᛱᛸᲁᛶ r1 = (xhss.InterfaceC0080) r1
            r1.cancel()
            goto L19
        L29:
            xhss.ᲀᲀᛱᲇ r2 = r2.f2665
            r2.getClass()
            return
    }
}
