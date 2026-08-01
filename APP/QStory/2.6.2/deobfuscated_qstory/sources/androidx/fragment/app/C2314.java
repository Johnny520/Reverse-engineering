package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2314 implements InterfaceC2311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2313 f6804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6805;

    public C2314(AbstractC2313 abstractC2313, int i) {
        this.f6804 = abstractC2313;
        this.f6805 = i;
    }

    @Override // androidx.fragment.app.InterfaceC2311
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4348(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2313 abstractC2313 = this.f6804;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = abstractC2313.f6789;
        int i = this.f6805;
        if (abstractComponentCallbacksC2338 == null || i >= 0 || !abstractComponentCallbacksC2338.m4432().m4361(-1, 0)) {
            return abstractC2313.m4357(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
