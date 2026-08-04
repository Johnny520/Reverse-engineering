package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᲈᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0497 implements InterfaceC1240 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1240 f2434;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f2435;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1549 f2436;

    public C0497(InterfaceC1240 interfaceC1240, boolean z, InterfaceC1549 interfaceC1549) {
        this.f2434 = interfaceC1240;
        this.f2435 = z;
        this.f2436 = interfaceC1549;
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        return new C1119(this);
    }
}
