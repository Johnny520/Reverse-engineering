package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2226 extends defpackage.AbstractC0758 {
    public C2226() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.net.URL r2 = (java.net.URL) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toExternalForm()
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
            java.lang.String r2 = r3.m2096()
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L1a
            return r1
        L1a:
            java.net.URL r3 = new java.net.URL
            r3.<init>(r2)
            return r3
    }
}
