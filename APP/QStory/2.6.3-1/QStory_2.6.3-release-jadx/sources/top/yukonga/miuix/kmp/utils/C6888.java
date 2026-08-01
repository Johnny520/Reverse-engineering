package top.yukonga.miuix.kmp.utils;

import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6888 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$LongRef f16902;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6907 f16903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16904;

    public /* synthetic */ C6888(Ref$LongRef ref$LongRef, C6907 c6907, int i) {
        this.f16904 = i;
        this.f16902 = ref$LongRef;
        this.f16903 = c6907;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        boolean zInvokeSuspend$lambda$0;
        int i = this.f16904;
        C6907 c6907 = this.f16903;
        Ref$LongRef ref$LongRef = this.f16902;
        long jLongValue = ((Long) obj).longValue();
        switch (i) {
            case 0:
                zInvokeSuspend$lambda$0 = MiuixOverscrollEffect$startSpringAnimationX$1.invokeSuspend$lambda$0(ref$LongRef, c6907, jLongValue);
                break;
            default:
                zInvokeSuspend$lambda$0 = MiuixOverscrollEffect$startSpringAnimationY$1.invokeSuspend$lambda$0(ref$LongRef, c6907, jLongValue);
                break;
        }
        return Boolean.valueOf(zInvokeSuspend$lambda$0);
    }
}
