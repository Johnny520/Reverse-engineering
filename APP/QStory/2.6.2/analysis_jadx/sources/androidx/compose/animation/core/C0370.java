package androidx.compose.animation.core;

import kotlin.C5175;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0370 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1265;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1266;

    public /* synthetic */ C0370(Object obj, int i) {
        this.f1266 = i;
        this.f1265 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f1266;
        C5175 c5175 = C5175.f14739;
        Object obj = this.f1265;
        switch (i) {
            case 0:
                ((C0350) obj).f1198 = false;
                return c5175;
            case 1:
                ((C0350) obj).f1198 = false;
                return c5175;
            default:
                return Float.valueOf(InfiniteTransition$run$1$1.invokeSuspend$lambda$1((InterfaceC5400) obj));
        }
    }
}
