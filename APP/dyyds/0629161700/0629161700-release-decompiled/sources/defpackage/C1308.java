package defpackage;

/* JADX INFO: renamed from: ᛷᛷᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1308 implements defpackage.InterfaceC2334 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f5779;

    public /* synthetic */ C1308(int r1) {
            r0 = this;
            r0.f5779 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2334
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class mo2436() {
            r1 = this;
            int r1 = r1.f5779
            switch(r1) {
                case 0: goto L10;
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            return r1
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Not implemented"
            r1.<init>(r0)
            throw r1
        L10:
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            return r1
    }

    @Override // defpackage.InterfaceC2334
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0590 mo2437(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.f5779
            switch(r1) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            com.bumptech.glide.load.data.ᛷᲁᛳᛳ r1 = new com.bumptech.glide.load.data.ᛷᲁᛳᛳ
            r1.<init>(r2)
            return r1
        Ld:
            ᛳᲇᲇᛶ r1 = new ᛳᲇᲇᛶ
            r1.<init>(r2)
            return r1
        L13:
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛱᛸᛲ r1 = new ᛱᛸᛲ
            r0 = 0
            r1.<init>(r2, r0)
            return r1
    }
}
