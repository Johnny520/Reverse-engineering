package defpackage;

/* JADX INFO: renamed from: ᲈᛸᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2302 implements defpackage.InterfaceC1711 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f9735;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.String f9736;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f9737;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.net.URL f9738;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0107 f9739;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.net.URL f9740;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public volatile byte[] f9741;

    public C2302(java.lang.String r4) {
            r3 = this;
            ᲁᲁᲀᛷ r0 = defpackage.InterfaceC0107.f938
            r3.<init>()
            r1 = 0
            r3.f9738 = r1
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L18
            r3.f9737 = r4
            java.lang.String r4 = "Argument must not be null"
            defpackage.C0292.m944(r0, r4)
            r3.f9739 = r0
            return
        L18:
            java.lang.String r3 = "Must not be null or empty"
            defpackage.C2264.m3684(r3)
            throw r1
    }

    public C2302(java.net.URL r3) {
            r2 = this;
            ᲁᲁᲀᛷ r0 = defpackage.InterfaceC0107.f938
            r2.<init>()
            java.lang.String r1 = "Argument must not be null"
            defpackage.C0292.m944(r3, r1)
            r2.f9738 = r3
            r3 = 0
            r2.f9737 = r3
            defpackage.C0292.m944(r0, r1)
            r2.f9739 = r0
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C2302
            if (r0 == 0) goto L20
            ᲈᛸᛳᛲ r3 = (defpackage.C2302) r3
            java.lang.String r0 = r2.m3744()
            java.lang.String r1 = r3.m3744()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            ᛱᛵᲈᲀ r2 = r2.f9739
            ᛱᛵᲈᲀ r3 = r3.f9739
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r2 = this;
            int r0 = r2.f9735
            if (r0 != 0) goto L1a
            java.lang.String r0 = r2.m3744()
            int r0 = r0.hashCode()
            r2.f9735 = r0
            int r0 = r0 * 31
            ᛱᛵᲈᲀ r1 = r2.f9739
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r2.f9735 = r1
            return r1
        L1a:
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.m3744()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.net.URL m3743() {
            r3 = this;
            java.net.URL r0 = r3.f9740
            if (r0 != 0) goto L30
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r3.f9736
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L29
            java.lang.String r1 = r3.f9737
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L21
            java.lang.String r1 = "Argument must not be null"
            java.net.URL r2 = r3.f9738
            defpackage.C0292.m944(r2, r1)
            java.lang.String r1 = r2.toString()
        L21:
            java.lang.String r2 = "@#&=*+-_.,:!?()/~'%;$[]"
            java.lang.String r1 = android.net.Uri.encode(r1, r2)
            r3.f9736 = r1
        L29:
            java.lang.String r1 = r3.f9736
            r0.<init>(r1)
            r3.f9740 = r0
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m3744() {
            r1 = this;
            java.lang.String r0 = r1.f9737
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Argument must not be null"
            java.net.URL r1 = r1.f9738
            defpackage.C0292.m944(r1, r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r3) {
            r2 = this;
            byte[] r0 = r2.f9741
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.m3744()
            java.nio.charset.Charset r1 = defpackage.InterfaceC1711.f7614
            byte[] r0 = r0.getBytes(r1)
            r2.f9741 = r0
        L10:
            byte[] r2 = r2.f9741
            r3.update(r2)
            return
    }
}
