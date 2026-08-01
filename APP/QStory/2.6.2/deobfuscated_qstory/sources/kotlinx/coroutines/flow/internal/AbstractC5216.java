package kotlinx.coroutines.flow.internal;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C5203;
import kotlinx.coroutines.channels.InterfaceC5195;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5216 implements InterfaceC5229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BufferOverflow f14803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f14804;

    public AbstractC5216(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        this.f14804 = interfaceC4359;
        this.f14802 = i;
        this.f14803 = bufferOverflow;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC4359 interfaceC4359 = this.f14804;
        if (interfaceC4359 != emptyCoroutineContext) {
            arrayList.add("context=" + interfaceC4359);
        }
        int i = this.f14802;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.f14803;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        return AbstractC0053.m155(sb, AbstractC4343.m8813(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract Object mo10286(InterfaceC5195 interfaceC5195, InterfaceC4356 interfaceC4356);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.InterfaceC5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC5318 mo10288(kotlin.coroutines.InterfaceC4359 r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7) {
        /*
            r4 = this;
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r4.f14804
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r5.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.channels.BufferOverflow r2 = r4.f14803
            int r3 = r4.f14802
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲兰苏 r4 = r4.mo10290(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5216.mo10288(kotlin.coroutines.飘花落叶言子楪苏世兰哲, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo8463(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM10503 = AbstractC5398.m10503(new ChannelFlow$collect$2(interfaceC5317, this, null), interfaceC4356);
        return objM10503 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10503 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5318 mo10289() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract AbstractC5216 mo10290(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC5198 m10291(InterfaceC5400 interfaceC5400) {
        int i = this.f14802;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        C5203 c5203 = new C5203(AbstractC5398.m10472(interfaceC5400, this.f14804), AbstractC5204.m10278(i, 4, this.f14803), true, true);
        coroutineStart.invoke(channelFlow$collectToFun$1, c5203, c5203);
        return c5203;
    }
}
