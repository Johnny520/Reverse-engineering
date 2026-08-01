package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5195;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5214 extends AbstractC5216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5318 f14801;

    public AbstractC5214(InterfaceC5318 interfaceC5318, InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        super(interfaceC4359, i, bufferOverflow);
        this.f14801 = interfaceC5318;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    public final String toString() {
        return this.f14801 + " -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object mo10286(InterfaceC5195 interfaceC5195, InterfaceC4356 interfaceC4356) {
        Object objMo10287 = mo10287(new C5220(interfaceC5195), interfaceC4356);
        return objMo10287 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo10287 : C5175.f14739;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // kotlinx.coroutines.flow.internal.AbstractC5216, kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8463(kotlinx.coroutines.flow.InterfaceC5317 r5, kotlin.coroutines.InterfaceC4356 r6) throws java.lang.Throwable {
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
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = kotlinx.coroutines.AbstractC5398.m10499(r0, r3, r1)
        L2a:
            boolean r2 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r0)
            if (r2 == 0) goto L39
            java.lang.Object r4 = r4.mo10287(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r5) goto L78
            return r4
        L39:
            kotlin.coroutines.飘花落叶言子楪世哲兰苏 r2 = kotlin.coroutines.C4355.f12932
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r3 = r1.get(r2)
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r3, r0)
            if (r0 == 0) goto L6f
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r6.getContext()
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.internal.C5220
            if (r2 != 0) goto L5c
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.internal.C5227
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
            java.lang.Object r4 = kotlinx.coroutines.internal.AbstractC5352.m10365(r1)
            java.lang.Object r4 = kotlinx.coroutines.flow.internal.AbstractC5218.m10294(r1, r5, r4, r0, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r5) goto L78
            return r4
        L6f:
            java.lang.Object r4 = super.mo8463(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r5) goto L78
            return r4
        L78:
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5214.mo8463(kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public abstract Object mo10287(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356);
}
