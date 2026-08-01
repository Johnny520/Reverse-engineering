package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛶᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0569 implements xhss.InterfaceC0142 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2002;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.InterfaceC0645 f2003;

    public /* synthetic */ C0569(xhss.InterfaceC0645 r1, xhss.AbstractC1008 r2, int r3) {
            r0 = this;
            r0.f2002 = r3
            r0.f2003 = r1
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0142
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo373(xhss.C0803 r3) {
            r2 = this;
            int r0 = r2.f2002
            switch(r0) {
                case 0: goto L3f;
                default: goto L5;
            }
        L5:
            r0 = -321848131029061(0xfffedb47e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᛷᛴᛲᛲ r2 = r2.f2003
            r2.mo112(r3)     // Catch: java.lang.Throwable -> L15
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L1c:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r2)
            if (r2 == 0) goto L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = -321886785734725(0xfffedb3ee47a77bb, double:NaN)
            java.lang.String r0 = "Hook before failed: "
            r3.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            xhss.AbstractC1008.m1651(r3, r2)
        L3e:
            return
        L3f:
            r2 = -353300176537669(0xfffebeace47a77bb, double:NaN)
        /* removed unused decoded string */ 
            return
    }

    @Override // xhss.InterfaceC0142
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final void mo374(xhss.C0466 r3) {
            r2 = this;
            int r0 = r2.f2002
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r2 = -353338831243333(0xfffebea3e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            return
        Le:
            r0 = -288656623765573(0xfffef977e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᛷᛴᛲᛲ r2 = r2.f2003
            r2.mo112(r3)     // Catch: java.lang.Throwable -> L1e
            xhss.ᛵᛷᲈᛶ r2 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r2 = move-exception
            xhss.ᲈᛳᛱᲇ r3 = new xhss.ᲈᛳᛱᲇ
            r3.<init>(r2)
            r2 = r3
        L25:
            java.lang.Throwable r2 = xhss.AbstractC0134.m364(r2)
            if (r2 == 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = -288695278471237(0xfffef96ee47a77bb, double:NaN)
            java.lang.String r0 = "Hook after failed: "
            r3.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            xhss.AbstractC1008.m1651(r3, r2)
        L47:
            return
    }
}
