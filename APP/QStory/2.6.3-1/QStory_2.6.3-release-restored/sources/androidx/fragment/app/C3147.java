package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3147 implements InterfaceC3144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3146 f7150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f7151;

    public C3147(AbstractC3146 abstractC3146, int i) {
        this.f7150 = abstractC3146;
        this.f7151 = i;
    }

    @Override // androidx.fragment.app.InterfaceC3144
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4918(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC3146 abstractC3146 = this.f7150;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = abstractC3146.f7135;
        int i = this.f7151;
        if (abstractComponentCallbacksC3171 == null || i >= 0 || !abstractComponentCallbacksC3171.m5002().m4931(-1, 0)) {
            return abstractC3146.m4927(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
