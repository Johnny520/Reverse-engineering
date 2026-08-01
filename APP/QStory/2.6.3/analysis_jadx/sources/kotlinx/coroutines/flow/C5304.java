package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC5217;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5304 extends C5302 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6554 f14888;

    public C5304(InterfaceC6554 interfaceC6554, InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        super(interfaceC6554, interfaceC4360, i, bufferOverflow);
        this.f14888 = interfaceC6554;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.C5302, kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10290(kotlinx.coroutines.channels.InterfaceC5196 r6, kotlin.coroutines.InterfaceC4357 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            java.lang.Object r5 = r0.L$0
            r6 = r5
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r6 = (kotlinx.coroutines.channels.InterfaceC5196) r6
            kotlin.AbstractC5185.m10210(r7)
            goto L41
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L33:
            kotlin.AbstractC5185.m10210(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r5 = super.mo10290(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r6 = (kotlinx.coroutines.channels.AbstractC5211) r6
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r5 = r6.f14798
            boolean r5 = r5.m10241()
            if (r5 == 0) goto L4e
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        L4e:
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5304.mo10290(kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.C5302, kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5217 mo10294(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        return new C5304(this.f14888, interfaceC4360, i, bufferOverflow);
    }
}
