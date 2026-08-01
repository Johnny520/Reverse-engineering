package androidx.compose.foundation.gestures;

import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0516 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1516;

    public /* synthetic */ C0516(Object obj, int i, Object obj2) {
        this.f1516 = i;
        this.f1514 = obj;
        this.f1515 = obj2;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1516;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f1515;
        Object obj3 = this.f1514;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C0541) obj3).f1566.m2045((C0535) obj2);
                break;
            default:
                C0487 c0487 = (C0487) obj3;
                ((Long) obj).getClass();
                float f = c0487.f1462;
                c0487.f1462 = 0.0f;
                ((InterfaceC6557) obj2).invoke(Float.valueOf(f));
                break;
        }
        return c5175;
    }
}
