package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛶᲀᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1406 implements InterfaceC1240 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final CharSequence f6657;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f6658;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0477 f6659;

    public C1406(CharSequence charSequence, int i, InterfaceC0477 interfaceC0477) {
        this.f6657 = charSequence;
        this.f6658 = i;
        this.f6659 = interfaceC0477;
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        return new C0533(this);
    }
}
