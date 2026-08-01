package defpackage;

/* JADX INFO: renamed from: ᛴᛱᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0608 extends defpackage.AbstractC0758 {
    public C0608() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.getHostAddress()
        La:
            r1.m1075(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r2) {
            r1 = this;
            int r1 = r2.m2090()
            r0 = 9
            if (r1 != r0) goto Ld
            r2.m2108()
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = r2.m2096()
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
            return r1
    }
}
