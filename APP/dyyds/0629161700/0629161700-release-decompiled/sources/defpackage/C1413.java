package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1413 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f6187;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.List f6188;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f6189;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1065 f6190;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0038 f6191;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1180 f6192;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f6193;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.util.List f6194;

    public C1413(defpackage.C0038 r1, defpackage.C1180 r2, defpackage.C1065 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f6191 = r1
            r0.f6192 = r2
            r0.f6190 = r3
            r0.f6189 = r4
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            r0.f6188 = r2
            r0.f6194 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f6187 = r2
            ᛳᛸᛲ r2 = r1.f538
            ᛳᛳᲀᲁ r4 = r3.f4740
            r4.getClass()
            java.net.URI r2 = r2.m1304()
            java.lang.String r4 = r2.getHost()
            if (r4 != 0) goto L34
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = defpackage.AbstractC0508.m1290(r1)
            goto L52
        L34:
            java.net.ProxySelector r1 = r1.f547
            java.util.List r1 = r1.select(r2)
            if (r1 == 0) goto L48
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L43
            goto L48
        L43:
            java.util.List r1 = defpackage.AbstractC0508.m1296(r1)
            goto L52
        L48:
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = defpackage.AbstractC0508.m1290(r1)
        L52:
            r0.f6188 = r1
            r1 = 0
            r0.f6193 = r1
            ᛳᛳᲀᲁ r0 = r3.f4740
            r0.getClass()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m2598() {
            r2 = this;
            int r0 = r2.f6193
            java.util.List r1 = r2.f6188
            int r1 = r1.size()
            if (r0 >= r1) goto Lb
            goto L13
        Lb:
            java.util.ArrayList r2 = r2.f6187
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
