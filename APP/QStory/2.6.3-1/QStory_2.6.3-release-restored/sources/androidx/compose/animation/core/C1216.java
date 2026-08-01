package androidx.compose.animation.core;

import kotlin.C6008;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1216 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1610;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1611;

    public /* synthetic */ C1216(Object obj, int i) {
        this.f1611 = i;
        this.f1610 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f1611;
        C6008 c6008 = C6008.f15084;
        Object obj = this.f1610;
        switch (i) {
            case 0:
                ((C1196) obj).f1543 = false;
                return c6008;
            case 1:
                ((C1196) obj).f1543 = false;
                return c6008;
            default:
                return Float.valueOf(InfiniteTransition$run$1$1.invokeSuspend$lambda$1((InterfaceC6233) obj));
        }
    }
}
