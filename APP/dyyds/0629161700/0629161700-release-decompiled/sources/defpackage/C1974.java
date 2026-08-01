package defpackage;

/* JADX INFO: renamed from: ᲇᛱᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1974 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8556;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC2267 f8557;

    public /* synthetic */ C1974(defpackage.InterfaceC2267 r1, int r2) {
            r0 = this;
            r0.f8556 = r2
            r0.f8557 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f8556
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            java.net.URL r1 = (java.net.URL) r1
        L7:
            r0 = 1
            return r0
        L9:
            java.lang.String r1 = (java.lang.String) r1
            goto L7
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r4, int r5, int r6, defpackage.C0533 r7) {
            r3 = this;
            int r0 = r3.f8556
            ᲈᛶᲀᛳ r3 = r3.f8557
            switch(r0) {
                case 0: goto L13;
                default: goto L7;
            }
        L7:
            java.net.URL r4 = (java.net.URL) r4
            ᲈᛸᛳᛲ r0 = new ᲈᛸᛳᛲ
            r0.<init>(r4)
            ᛳᛱᛱᛲ r3 = r3.mo1266(r0, r5, r6, r7)
            return r3
        L13:
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L1e
            r4 = r1
            goto L46
        L1e:
            r0 = 0
            char r0 = r4.charAt(r0)
            r2 = 47
            if (r0 != r2) goto L31
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            goto L46
        L31:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r2 = r0.getScheme()
            if (r2 != 0) goto L45
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            goto L46
        L45:
            r4 = r0
        L46:
            if (r4 == 0) goto L53
            boolean r0 = r3.mo1265(r4)
            if (r0 != 0) goto L4f
            goto L53
        L4f:
            ᛳᛱᛱᛲ r1 = r3.mo1266(r4, r5, r6, r7)
        L53:
            return r1
    }
}
