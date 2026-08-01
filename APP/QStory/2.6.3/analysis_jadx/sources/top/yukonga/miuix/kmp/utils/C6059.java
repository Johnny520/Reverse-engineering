package top.yukonga.miuix.kmp.utils;

import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6059 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$LongRef f16557;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6078 f16558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16559;

    public /* synthetic */ C6059(Ref$LongRef ref$LongRef, C6078 c6078, int i) {
        this.f16559 = i;
        this.f16557 = ref$LongRef;
        this.f16558 = c6078;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        boolean zInvokeSuspend$lambda$0;
        int i = this.f16559;
        C6078 c6078 = this.f16558;
        Ref$LongRef ref$LongRef = this.f16557;
        long jLongValue = ((Long) obj).longValue();
        switch (i) {
            case 0:
                zInvokeSuspend$lambda$0 = MiuixOverscrollEffect$startSpringAnimationX$1.invokeSuspend$lambda$0(ref$LongRef, c6078, jLongValue);
                break;
            default:
                zInvokeSuspend$lambda$0 = MiuixOverscrollEffect$startSpringAnimationY$1.invokeSuspend$lambda$0(ref$LongRef, c6078, jLongValue);
                break;
        }
        return Boolean.valueOf(zInvokeSuspend$lambda$0);
    }
}
