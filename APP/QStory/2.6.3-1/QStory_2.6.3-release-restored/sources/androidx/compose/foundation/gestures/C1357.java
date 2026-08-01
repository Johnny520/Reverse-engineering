package androidx.compose.foundation.gestures;

import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1357 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1862;

    public /* synthetic */ C1357(Object obj, int i, Object obj2) {
        this.f1862 = i;
        this.f1860 = obj;
        this.f1861 = obj2;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1862;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f1861;
        Object obj3 = this.f1860;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C1382) obj3).f1912.m2615((C1376) obj2);
                break;
            default:
                C1328 c1328 = (C1328) obj3;
                ((Long) obj).getClass();
                float f = c1328.f1808;
                c1328.f1808 = 0.0f;
                ((InterfaceC7387) obj2).invoke(Float.valueOf(f));
                break;
        }
        return c6008;
    }
}
