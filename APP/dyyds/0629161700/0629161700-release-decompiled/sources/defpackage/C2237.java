package defpackage;

/* JADX INFO: renamed from: ᲈᛵᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2237 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9533;

    public /* synthetic */ C2237(int r1) {
            r0 = this;
            r0.f9533 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r1, int r2, int r3, defpackage.C0533 r4) {
            r0 = this;
            int r0 = r0.f9533
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            if (r1 == 0) goto L10
            ᛳᲇᛲᛷ r0 = new ᛳᲇᛲᛷ
            r2 = 1
            r0.<init>(r1, r2)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            ᛵᛲᲁᲇ r0 = new ᛵᛲᲁᲇ
            r2 = 3
            r0.<init>(r2, r1)
            return r0
        L1b:
            java.io.File r1 = (java.io.File) r1
            ᛵᛲᲁᲇ r0 = new ᛵᛲᲁᲇ
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r1, defpackage.C0533 r2) {
            r0 = this;
            int r0 = r0.f9533
            switch(r0) {
                case 0: goto Lc;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L7:
            r0 = 1
            return r0
        L9:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L7
        Lc:
            java.io.File r1 = (java.io.File) r1
            goto L7
    }
}
