package defpackage;

/* JADX INFO: renamed from: ᲈᛲᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2198 extends defpackage.AbstractC1552 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final byte[] f9344 = null;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.FitCenter"
            java.nio.charset.Charset r1 = defpackage.InterfaceC1711.f7614
            byte[] r0 = r0.getBytes(r1)
            defpackage.C2198.f9344 = r0
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C2198
            return r0
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            r0 = 1572326941(0x5db7ce1d, float:1.6555694E18)
            return r0
    }

    @Override // defpackage.AbstractC1552
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final android.graphics.Bitmap mo1821(defpackage.InterfaceC1612 r1, android.graphics.Bitmap r2, int r3, int r4) {
            r0 = this;
            android.graphics.Bitmap r0 = defpackage.AbstractC1538.m2797(r1, r2, r3, r4)
            return r0
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            byte[] r0 = defpackage.C2198.f9344
            r1.update(r0)
            return
    }
}
