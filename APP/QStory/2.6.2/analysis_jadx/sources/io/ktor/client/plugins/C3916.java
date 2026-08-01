package io.ktor.client.plugins;

import kotlin.C5175;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5421;
import p052.InterfaceC6557;
import p241.C8139;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3916 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12120;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12121;

    public /* synthetic */ C3916(Object obj, int i) {
        this.f12121 = i;
        this.f12120 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12121;
        Object obj2 = this.f12120;
        switch (i) {
            case 0:
                return HttpTimeoutKt$HttpTimeout$2$1.invokeSuspend$lambda$1$lambda$0((C5416) obj2, (Throwable) obj);
            default:
                Throwable th = (Throwable) obj;
                C5421 c5421 = ((C8139) obj2).f22458;
                c5421.getClass();
                if (th == null) {
                    c5421.m10551();
                } else {
                    c5421.m10550(th);
                }
                return C5175.f14739;
        }
    }
}
