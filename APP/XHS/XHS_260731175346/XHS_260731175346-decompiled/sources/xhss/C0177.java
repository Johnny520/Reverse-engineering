package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0177 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f700;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f701;

    public /* synthetic */ C0177(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f700 = r1
            r0.f701 = r2
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r3 = this;
            int r0 = r3.f700
            java.lang.Object r3 = r3.f701
            switch(r0) {
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto La;
                default: goto L7;
            }
        L7:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r3
            return r3
        La:
            xhss.ᲁᛲᛵ r3 = (xhss.C0927) r3
            r3.getClass()
            r0 = 2
            xhss.ᲀᛱᛶᛳ r1 = r3.f3003     // Catch: java.io.IOException -> L17
            r2 = 0
            r1.m1413(r0, r2, r2)     // Catch: java.io.IOException -> L17
            goto L1b
        L17:
            r1 = move-exception
            r3.m1520(r0, r0, r1)
        L1b:
            xhss.ᛵᛷᲈᛶ r3 = xhss.C0500.f1817
            return r3
        L1e:
            java.util.List r3 = (java.util.List) r3
            return r3
        L21:
            xhss.ᛱᛳᲇᛶ r3 = (xhss.InterfaceC0030) r3
            java.lang.Object r3 = r3.mo136()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L2a
            java.util.List r3 = (java.util.List) r3     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L2a
            goto L2c
        L2a:
            xhss.ᛵᛷᛶᛱ r3 = xhss.C0492.f1802
        L2c:
            return r3
    }
}
