package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0162 implements defpackage.InterfaceC1901, defpackage.InterfaceC0655 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f1135;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f1136;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1137;

    public C0162(android.content.res.Resources r2, defpackage.InterfaceC1901 r3) {
            r1 = this;
            r0 = 1
            r1.f1137 = r0
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r1.f1136 = r2
            defpackage.C0292.m944(r3, r0)
            r1.f1135 = r3
            return
    }

    public C0162(defpackage.InterfaceC1612 r2, android.graphics.Bitmap r3) {
            r1 = this;
            r0 = 0
            r1.f1137 = r0
            r1.<init>()
            java.lang.String r0 = "Bitmap must not be null"
            defpackage.C0292.m944(r3, r0)
            r1.f1136 = r3
            java.lang.String r3 = "BitmapPool must not be null"
            defpackage.C0292.m944(r2, r3)
            r1.f1135 = r2
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0162 m691(defpackage.InterfaceC1612 r1, android.graphics.Bitmap r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            ᛱᲀᛴᲁ r0 = new ᛱᲀᛴᲁ
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.InterfaceC1901
    public final java.lang.Object get() {
            r2 = this;
            int r0 = r2.f1137
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            java.lang.Object r1 = r2.f1136
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.Object r2 = r2.f1135
            ᲁᛸᛸ r2 = (defpackage.InterfaceC1901) r2
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0.<init>(r1, r2)
            return r0
        L19:
            java.lang.Object r2 = r2.f1136
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo692() {
            r1 = this;
            int r0 = r1.f1137
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f1135
            ᲁᛸᛸ r1 = (defpackage.InterfaceC1901) r1
            r1.mo692()
            return
        Ld:
            java.lang.Object r0 = r1.f1135
            ᛸᲈᲇᲁ r0 = (defpackage.InterfaceC1612) r0
            java.lang.Object r1 = r1.f1136
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.mo1257(r1)
            return
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Class mo693() {
            r0 = this;
            int r0 = r0.f1137
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r0 = android.graphics.drawable.BitmapDrawable.class
            return r0
        L8:
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            return r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int mo694() {
            r1 = this;
            int r0 = r1.f1137
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f1135
            ᲁᛸᛸ r1 = (defpackage.InterfaceC1901) r1
            int r1 = r1.mo694()
            return r1
        Le:
            java.lang.Object r1 = r1.f1136
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = defpackage.AbstractC1754.m3136(r1)
            return r1
    }

    @Override // defpackage.InterfaceC0655
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo695() {
            r1 = this;
            int r0 = r1.f1137
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f1135
            ᲁᛸᛸ r1 = (defpackage.InterfaceC1901) r1
            boolean r0 = r1 instanceof defpackage.InterfaceC0655
            if (r0 == 0) goto L12
            ᛴᛴᛷᛱ r1 = (defpackage.InterfaceC0655) r1
            r1.mo695()
        L12:
            return
        L13:
            java.lang.Object r1 = r1.f1136
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r1.prepareToDraw()
            return
    }
}
