package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1370 implements defpackage.InterfaceC0933, defpackage.InterfaceC0696 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.res.Resources f5995;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5996;

    public /* synthetic */ C1370(android.content.res.Resources r1, int r2) {
            r0 = this;
            r0.f5996 = r2
            r0.f5995 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0933
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public defpackage.InterfaceC1901 mo1886(defpackage.InterfaceC1901 r1, defpackage.C0533 r2) {
            r0 = this;
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            ᛱᲀᛴᲁ r2 = new ᛱᲀᛴᲁ
            android.content.res.Resources r0 = r0.f5995
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r4) {
            r3 = this;
            int r0 = r3.f5996
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            android.content.res.Resources r3 = r3.f5995
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            ᛶᛷᛷᛷ r4 = new ᛶᛷᛷᛷ
            ᲈᛶᛷᛱ r0 = defpackage.C2266.f9605
            r4.<init>(r3, r0)
            return r4
        L11:
            ᛶᛷᛷᛷ r0 = new ᛶᛷᛷᛷ
            java.lang.Class<java.io.InputStream> r2 = java.io.InputStream.class
            ᲈᛶᲀᛳ r4 = r4.m2475(r1, r2)
            r0.<init>(r3, r4)
            return r0
        L1d:
            ᛶᛷᛷᛷ r0 = new ᛶᛷᛷᛷ
            java.lang.Class<android.content.res.AssetFileDescriptor> r2 = android.content.res.AssetFileDescriptor.class
            ᲈᛶᲀᛳ r4 = r4.m2475(r1, r2)
            r0.<init>(r3, r4)
            return r0
    }
}
