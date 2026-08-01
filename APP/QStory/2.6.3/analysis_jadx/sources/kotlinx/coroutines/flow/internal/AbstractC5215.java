package kotlinx.coroutines.flow.internal;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5196;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5215 extends AbstractC5217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5319 f14801;

    public AbstractC5215(InterfaceC5319 interfaceC5319, InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        super(interfaceC4360, i, bufferOverflow);
        this.f14801 = interfaceC5319;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    public final String toString() {
        return this.f14801 + " -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object mo10290(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357) {
        Object objMo10291 = mo10291(new C5221(interfaceC5196), interfaceC4357);
        return objMo10291 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo10291 : C5176.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // kotlinx.coroutines.flow.internal.AbstractC5217, kotlinx.coroutines.flow.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8453(kotlinx.coroutines.flow.InterfaceC5318 r5, kotlin.coroutines.InterfaceC4357 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.f14802
            r1 = -3
            if (r0 != r1) goto L6f
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r6.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            androidx.compose.foundation.lazy.飘花落叶言子楪兰苏哲世 r2 = new androidx.compose.foundation.lazy.飘花落叶言子楪兰苏哲世
            r3 = 17
            r2.<init>(r3)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r3 = r4.f14804
            java.lang.Object r1 = r3.fold(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L25
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r0.plus(r3)
            goto L2a
        L25:
            r1 = 0
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = kotlinx.coroutines.AbstractC5399.m10503(r0, r3, r1)
        L2a:
            boolean r2 = kotlin.jvm.internal.AbstractC4395.m8907(r1, r0)
            if (r2 == 0) goto L39
            java.lang.Object r4 = r4.mo10291(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r5) goto L78
            return r4
        L39:
            kotlin.coroutines.飘花落叶言子楪世哲兰苏 r2 = kotlin.coroutines.C4356.f12936
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r3 = r1.get(r2)
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r3, r0)
            if (r0 == 0) goto L6f
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r6.getContext()
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.internal.C5221
            if (r2 != 0) goto L5c
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.internal.C5228
            if (r2 == 0) goto L56
            goto L5c
        L56:
            kotlinx.coroutines.flow.internal.飘花落叶言子楪兰哲世苏 r2 = new kotlinx.coroutines.flow.internal.飘花落叶言子楪兰哲世苏
            r2.<init>(r5, r0)
            r5 = r2
        L5c:
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r2 = 0
            r0.<init>(r4, r2)
            java.lang.Object r4 = kotlinx.coroutines.internal.AbstractC5353.m10369(r1)
            java.lang.Object r4 = kotlinx.coroutines.flow.internal.AbstractC5219.m10298(r1, r5, r4, r0, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r5) goto L78
            return r4
        L6f:
            java.lang.Object r4 = super.mo8453(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r5) goto L78
            return r4
        L78:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5215.mo8453(kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public abstract Object mo10291(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357);
}
