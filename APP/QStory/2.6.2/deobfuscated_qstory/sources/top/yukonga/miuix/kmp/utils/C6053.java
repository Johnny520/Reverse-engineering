package top.yukonga.miuix.kmp.utils;

import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6053 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$LongRef f16548;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6072 f16549;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16550;

    public /* synthetic */ C6053(Ref$LongRef ref$LongRef, C6072 c6072, int i) {
        this.f16550 = i;
        this.f16548 = ref$LongRef;
        this.f16549 = c6072;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        boolean zInvokeSuspend$lambda$0;
        int i = this.f16550;
        C6072 c6072 = this.f16549;
        Ref$LongRef ref$LongRef = this.f16548;
        long jLongValue = ((Long) obj).longValue();
        switch (i) {
            case 0:
                zInvokeSuspend$lambda$0 = MiuixOverscrollEffect$startSpringAnimationX$1.invokeSuspend$lambda$0(ref$LongRef, c6072, jLongValue);
                break;
            default:
                zInvokeSuspend$lambda$0 = MiuixOverscrollEffect$startSpringAnimationY$1.invokeSuspend$lambda$0(ref$LongRef, c6072, jLongValue);
                break;
        }
        return Boolean.valueOf(zInvokeSuspend$lambda$0);
    }
}
