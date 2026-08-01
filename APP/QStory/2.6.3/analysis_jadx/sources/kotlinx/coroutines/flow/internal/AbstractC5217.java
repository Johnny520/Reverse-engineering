package kotlinx.coroutines.flow.internal;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C5204;
import kotlinx.coroutines.channels.InterfaceC5196;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5217 implements InterfaceC5230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BufferOverflow f14803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f14804;

    public AbstractC5217(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        this.f14804 = interfaceC4360;
        this.f14802 = i;
        this.f14803 = bufferOverflow;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC4360 interfaceC4360 = this.f14804;
        if (interfaceC4360 != emptyCoroutineContext) {
            arrayList.add("context=" + interfaceC4360);
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
        return AbstractC0053.m148(sb, AbstractC4344.m8810(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract Object mo10290(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.InterfaceC5230
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC5319 mo10292(kotlin.coroutines.InterfaceC4360 r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7) {
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
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲兰苏 r4 = r4.mo10294(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5217.mo10292(kotlin.coroutines.飘花落叶言子楪苏世兰哲, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo8453(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10507 = AbstractC5399.m10507(new ChannelFlow$collect$2(interfaceC5318, this, null), interfaceC4357);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC5319 mo10293() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract AbstractC5217 mo10294(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC5199 m10295(InterfaceC5401 interfaceC5401) {
        int i = this.f14802;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        C5204 c5204 = new C5204(AbstractC5399.m10476(interfaceC5401, this.f14804), AbstractC5205.m10282(i, 4, this.f14803), true, true);
        coroutineStart.invoke(channelFlow$collectToFun$1, c5204, c5204);
        return c5204;
    }
}
