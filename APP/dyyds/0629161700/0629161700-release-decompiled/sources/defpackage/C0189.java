package defpackage;

/* JADX INFO: renamed from: ᛱᲁᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0189 implements defpackage.InterfaceC0721 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f1255;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.os.Handler f1256;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.InterfaceC2076 f1257;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final long f1258;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.graphics.Bitmap f1259;

    public C0189(android.os.Handler r2, int r3, long r4) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = defpackage.AbstractC1754.m3156(r0, r0)
            if (r0 == 0) goto L12
            r1.f1256 = r2
            r1.f1255 = r3
            r1.f1258 = r4
            return
        L12:
            java.lang.String r1 = "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"
            defpackage.C2264.m3684(r1)
            r1 = 0
            throw r1
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void mo729(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r1 = 0
            r0.f1259 = r1
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo321() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void mo730(java.lang.Object r4) {
            r3 = this;
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r3.f1259 = r4
            r4 = 1
            android.os.Handler r0 = r3.f1256
            android.os.Message r4 = r0.obtainMessage(r4, r3)
            long r1 = r3.f1258
            r0.sendMessageAtTime(r4, r1)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo731(defpackage.InterfaceC2076 r1) {
            r0 = this;
            r0.f1257 = r1
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo732(defpackage.C1622 r1) {
            r0 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.m2934(r0, r0)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo733(defpackage.C1622 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo734(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo322() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo323() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void mo735(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC2076 mo736() {
            r0 = this;
            ᲇᛶᲁᛴ r0 = r0.f1257
            return r0
    }
}
