package yyds;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛲᲀᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0429 implements InterfaceC2156 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC1823 f2181;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f2182;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2183;

    public AbstractC0429(int i, int i2) {
        if (!AbstractC0181.m751(i, i2)) {
            C0188.m798(AbstractC0897.m1987(i, i2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
            throw null;
        }
        this.f2182 = i;
        this.f2183 = i2;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo1198(InterfaceC1823 interfaceC1823) {
        this.f2181 = interfaceC1823;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo1199(C0397 c0397) throws Throwable {
        c0397.m1148(this.f2182, this.f2183);
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void mo1200(Drawable drawable) {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC1823 mo1201() {
        return this.f2181;
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void mo1202() {
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void mo1203() {
    }

    @Override // yyds.InterfaceC1021
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo1204() {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void mo1205(Drawable drawable) {
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo1206(C0397 c0397) {
    }
}
