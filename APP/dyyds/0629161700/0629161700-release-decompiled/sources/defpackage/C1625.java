package defpackage;

/* JADX INFO: renamed from: ᲀᛲᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1625 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7221;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0043 f7222;

    public C1625(int r1) {
            r0 = this;
            r0.f7221 = r1
            switch(r1) {
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0.<init>()
            ᛱᛲᲀᛱ r1 = new ᛱᛲᲀᛱ
            r1.<init>()
            r0.f7222 = r1
            return
        L10:
            r0.<init>()
            ᛱᛲᲀᛱ r1 = new ᛱᛲᲀᛱ
            r1.<init>()
            r0.f7222 = r1
            return
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r2, int r3, int r4, defpackage.C0533 r5) {
            r1 = this;
            int r0 = r1.f7221
            ᛱᛲᲀᛱ r1 = r1.f7222
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            java.io.InputStream r2 = (java.io.InputStream) r2
            java.nio.ByteBuffer r2 = defpackage.AbstractC0036.m364(r2)
            android.graphics.ImageDecoder$Source r2 = android.graphics.ImageDecoder.createSource(r2)
            ᛱᲀᛴᲁ r1 = r1.m381(r2, r3, r4, r5)
            return r1
        L16:
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            android.graphics.ImageDecoder$Source r2 = android.graphics.ImageDecoder.createSource(r2)
            ᛱᲀᛴᲁ r1 = r1.m381(r2, r3, r4, r5)
            return r1
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r1, defpackage.C0533 r2) {
            r0 = this;
            int r0 = r0.f7221
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            java.io.InputStream r1 = (java.io.InputStream) r1
        L7:
            r0 = 1
            return r0
        L9:
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            goto L7
    }
}
