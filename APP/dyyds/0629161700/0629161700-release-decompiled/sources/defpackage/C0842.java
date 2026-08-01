package defpackage;

/* JADX INFO: renamed from: ᛵᛲᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0842 implements defpackage.InterfaceC1901 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f3866;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3867;

    public /* synthetic */ C0842(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3867 = r1
            r0.f3866 = r2
            r0.<init>()
            return
    }

    public C0842(java.lang.Object r2) {
            r1 = this;
            r0 = 2
            r1.f3867 = r0
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r1.f3866 = r2
            return
    }

    public C0842(byte[] r2) {
            r1 = this;
            r0 = 1
            r1.f3867 = r0
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r1.f3866 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m1770() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    private final void m1771() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    private final void m1772() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC1901
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.f3867
            java.lang.Object r1 = r1.f3866
            switch(r0) {
                case 0: goto Ld;
                case 1: goto La;
                case 2: goto L9;
                default: goto L7;
            }
        L7:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L9:
            return r1
        La:
            byte[] r1 = (byte[]) r1
            return r1
        Ld:
            android.graphics.drawable.AnimatedImageDrawable r1 = (android.graphics.drawable.AnimatedImageDrawable) r1
            return r1
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo692() {
            r1 = this;
            int r0 = r1.f3867
            switch(r0) {
                case 0: goto L6;
                case 1: goto L5;
                case 2: goto L5;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r1 = r1.f3866
            android.graphics.drawable.AnimatedImageDrawable r1 = (android.graphics.drawable.AnimatedImageDrawable) r1
            r1.stop()
            r1.clearAnimationCallbacks()
            return
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Class mo693() {
            r1 = this;
            int r0 = r1.f3867
            switch(r0) {
                case 0: goto L12;
                case 1: goto Lf;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            return r1
        L8:
            java.lang.Object r1 = r1.f3866
            java.lang.Class r1 = r1.getClass()
            return r1
        Lf:
            java.lang.Class<byte[]> r1 = byte[].class
            return r1
        L12:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            return r1
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final int mo694() {
            r1 = this;
            int r0 = r1.f3867
            java.lang.Object r1 = r1.f3866
            switch(r0) {
                case 0: goto L14;
                case 1: goto L10;
                case 2: goto Le;
                default: goto L7;
            }
        L7:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = defpackage.AbstractC1754.m3136(r1)
            return r1
        Le:
            r1 = 1
            return r1
        L10:
            byte[] r1 = (byte[]) r1
            int r1 = r1.length
            return r1
        L14:
            android.graphics.drawable.AnimatedImageDrawable r1 = (android.graphics.drawable.AnimatedImageDrawable) r1
            int r0 = r1.getIntrinsicWidth()
            int r1 = r1.getIntrinsicHeight()
            int r1 = r1 * r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            int r0 = defpackage.AbstractC1754.m3137(r0)
            int r0 = r0 * r1
            int r0 = r0 * 2
            return r0
    }
}
