package yyds;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᛴᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948 extends AbstractC1754 implements InterfaceC2798 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0948 f4411 = new C0948(C1586.f8041);

    @Override // yyds.InterfaceC2798
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo2091() {
        return true;
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final CancellationException mo2092() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void mo2093(CancellationException cancellationException) {
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final native InterfaceC0970 mo2094(boolean z, boolean z2, C2635 c2635);

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final InterfaceC2330 mo2095(AbstractC0986 abstractC0986) {
        return C2329.f11479;
    }
}
