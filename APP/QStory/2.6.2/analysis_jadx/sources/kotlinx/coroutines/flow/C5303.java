package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC5216;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5303 extends C5301 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6553 f14888;

    public C5303(InterfaceC6553 interfaceC6553, InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        super(interfaceC6553, interfaceC4359, i, bufferOverflow);
        this.f14888 = interfaceC6553;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.C5301, kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10286(kotlinx.coroutines.channels.InterfaceC5195 r6, kotlin.coroutines.InterfaceC4356 r7) {
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
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r6 = (kotlinx.coroutines.channels.InterfaceC5195) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L41
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L33:
            kotlin.AbstractC5184.m10206(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r5 = super.mo10286(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r6 = (kotlinx.coroutines.channels.AbstractC5210) r6
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r5 = r6.f14798
            boolean r5 = r5.m10237()
            if (r5 == 0) goto L4e
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        L4e:
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5303.mo10286(kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.C5301, kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5216 mo10290(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        return new C5303(this.f14888, interfaceC4359, i, bufferOverflow);
    }
}
