package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᛳᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0320 implements InterfaceC1240, InterfaceC2375 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1240 f1693;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f1694;

    public C0320(InterfaceC1240 interfaceC1240, int i) {
        this.f1693 = interfaceC1240;
        this.f1694 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        return new C0862(this);
    }

    @Override // yyds.InterfaceC2375
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1240 mo993(int i) {
        int i2 = this.f1694 + i;
        return i2 < 0 ? new C0320(this, i) : new C0320(this.f1693, i2);
    }
}
