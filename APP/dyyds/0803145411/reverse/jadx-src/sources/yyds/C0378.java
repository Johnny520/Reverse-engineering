package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᛶᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0378 implements InterfaceC1240 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1240 f1950;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC1549 f1951;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1549 f1952;

    public C0378(InterfaceC1240 interfaceC1240, InterfaceC1549 interfaceC1549, InterfaceC1549 interfaceC15492) {
        this.f1950 = interfaceC1240;
        this.f1951 = interfaceC1549;
        this.f1952 = interfaceC15492;
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        return new C1119(this);
    }
}
