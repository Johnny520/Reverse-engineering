package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲇᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0992 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1037 f3213;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0819 f3214;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.util.List f3215;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0526 f3216;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f3217;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.util.List f3218;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean f3219;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f3220;

    public C0992(xhss.C0526 r1, xhss.C1037 r2, xhss.C0819 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f3216 = r1
            r0.f3213 = r2
            r0.f3214 = r3
            r0.f3219 = r4
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
            r0.f3215 = r2
            r0.f3218 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f3217 = r2
            xhss.ᛷᛶᲁᛵ r2 = r1.f1924
            xhss.ᲀᲀᛱᲇ r4 = r3.f2665
            r4.getClass()
            java.net.URI r2 = r2.m1158()
            java.lang.String r4 = r2.getHost()
            if (r4 != 0) goto L34
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = xhss.AbstractC0559.m992(r1)
            goto L52
        L34:
            java.net.ProxySelector r1 = r1.f1926
            java.util.List r1 = r1.select(r2)
            if (r1 == 0) goto L48
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L43
            goto L48
        L43:
            java.util.List r1 = xhss.AbstractC0559.m990(r1)
            goto L52
        L48:
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = xhss.AbstractC0559.m992(r1)
        L52:
            r0.f3215 = r1
            r1 = 0
            r0.f3220 = r1
            xhss.ᲀᲀᛱᲇ r0 = r3.f2665
            r0.getClass()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m1627() {
            r2 = this;
            int r0 = r2.f3220
            java.util.List r1 = r2.f3215
            int r1 = r1.size()
            if (r0 >= r1) goto Lb
            goto L13
        Lb:
            java.util.ArrayList r2 = r2.f3217
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L15
        L13:
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }
}
