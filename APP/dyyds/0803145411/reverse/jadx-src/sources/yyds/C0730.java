package yyds;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: yyds.ᛳᲇᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730 implements InterfaceC1490 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1075 f3410;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f3411;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Bitmap.Config f3412;

    public C0730(C1075 c1075) {
        this.f3410 = c1075;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0730) {
            C0730 c0730 = (C0730) obj;
            if (this.f3411 == c0730.f3411 && AbstractC0181.m757(this.f3412, c0730.f3412)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3411 * 31;
        Bitmap.Config config = this.f3412;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2110.m4024(this.f3411, this.f3412);
    }

    @Override // yyds.InterfaceC1490
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo968() {
        this.f3410.m1677(this);
    }
}
