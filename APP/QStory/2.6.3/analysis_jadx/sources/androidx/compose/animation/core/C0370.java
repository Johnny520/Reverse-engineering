package androidx.compose.animation.core;

import kotlin.C5176;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0370 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1266;

    public /* synthetic */ C0370(Object obj, int i) {
        this.f1266 = i;
        this.f1265 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f1266;
        C5176 c5176 = C5176.f14739;
        Object obj = this.f1265;
        switch (i) {
            case 0:
                ((C0350) obj).f1198 = false;
                return c5176;
            case 1:
                ((C0350) obj).f1198 = false;
                return c5176;
            default:
                return Float.valueOf(InfiniteTransition$run$1$1.invokeSuspend$lambda$1((InterfaceC5401) obj));
        }
    }
}
