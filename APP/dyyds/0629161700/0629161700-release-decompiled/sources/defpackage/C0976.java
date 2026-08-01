package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0976 extends defpackage.AbstractC0758 {
    public C0976() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.net.URI r2 = (java.net.URI) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toASCIIString()
        La:
            r1.m1075(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r3) {
            r2 = this;
            int r2 = r3.m2090()
            r0 = 9
            r1 = 0
            if (r2 != r0) goto Ld
            r3.m2108()
            return r1
        Ld:
            java.lang.String r2 = r3.m2096()     // Catch: java.net.URISyntaxException -> L20
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> L20
            if (r3 == 0) goto L1a
            return r1
        L1a:
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L20
            r3.<init>(r2)     // Catch: java.net.URISyntaxException -> L20
            return r3
        L20:
            r2 = move-exception
            ᛲᛱᛶᲀ r3 = new ᛲᛱᛶᲀ
            r3.<init>(r2)
            throw r3
    }
}
