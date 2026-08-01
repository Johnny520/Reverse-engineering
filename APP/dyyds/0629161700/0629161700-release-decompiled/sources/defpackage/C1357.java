package defpackage;

/* JADX INFO: renamed from: ᛷᲀᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1357 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f5941;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f5942;

    public /* synthetic */ C1357(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5941 = r1
            r0.f5942 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.f5941
            r0 = 1
            switch(r1) {
                case 0: goto L14;
                case 1: goto L9;
                default: goto L6;
            }
        L6:
            java.io.File r2 = (java.io.File) r2
            return r0
        L9:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "data:image"
            boolean r1 = r1.startsWith(r2)
            return r1
        L14:
            byte[] r2 = (byte[]) r2
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r2, int r3, int r4, defpackage.C0533 r5) {
            r1 = this;
            int r3 = r1.f5941
            java.lang.Object r1 = r1.f5942
            switch(r3) {
                case 0: goto L32;
                case 1: goto L1c;
                default: goto L7;
            }
        L7:
            java.io.File r2 = (java.io.File) r2
            ᛳᛱᛱᛲ r3 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r4 = new ᛵᛶᲈᛵ
            r4.<init>(r2)
            ᛸᛶᛷᛸ r5 = new ᛸᛶᛷᛸ
            ᛶᛳᛵᛵ r1 = (defpackage.InterfaceC1035) r1
            r0 = 0
            r5.<init>(r2, r1, r0)
            r3.<init>(r4, r5)
            return r3
        L1c:
            ᛳᛱᛱᛲ r3 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r4 = new ᛵᛶᲈᛵ
            r4.<init>(r2)
            ᲈᛶᲀᛴ r5 = new ᲈᛶᲀᛴ
            java.lang.String r2 = r2.toString()
            ᲀᛴᛱᛱ r1 = (defpackage.C1654) r1
            r5.<init>(r2, r1)
            r3.<init>(r4, r5)
            return r3
        L32:
            byte[] r2 = (byte[]) r2
            ᛳᛱᛱᛲ r3 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r4 = new ᛵᛶᲈᛵ
            r4.<init>(r2)
            ᲈᛶᲀᛴ r5 = new ᲈᛶᲀᛴ
            ᛶᛷᲀᲈ r1 = (defpackage.InterfaceC1117) r1
            r0 = 1
            r5.<init>(r2, r0, r1)
            r3.<init>(r4, r5)
            return r3
    }
}
