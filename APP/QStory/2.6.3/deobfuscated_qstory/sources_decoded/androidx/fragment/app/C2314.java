package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2314 implements InterfaceC2311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2313 f6805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6806;

    public C2314(AbstractC2313 abstractC2313, int i) {
        this.f6805 = abstractC2313;
        this.f6806 = i;
    }

    @Override // androidx.fragment.app.InterfaceC2311
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4358(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2313 abstractC2313 = this.f6805;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = abstractC2313.f6790;
        int i = this.f6806;
        if (abstractComponentCallbacksC2338 == null || i >= 0 || !abstractComponentCallbacksC2338.m4442().m4371(-1, 0)) {
            return abstractC2313.m4367(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
