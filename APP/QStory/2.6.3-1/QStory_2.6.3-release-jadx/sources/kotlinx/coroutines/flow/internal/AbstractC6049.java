package kotlinx.coroutines.flow.internal;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6049 implements InterfaceC6062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f15147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BufferOverflow f15148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f15149;

    public AbstractC6049(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        this.f15149 = interfaceC5192;
        this.f15147 = i;
        this.f15148 = bufferOverflow;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC5192 interfaceC5192 = this.f15149;
        if (interfaceC5192 != emptyCoroutineContext) {
            arrayList.add("context=" + interfaceC5192);
        }
        int i = this.f15147;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.f15148;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        return AbstractC0900.m708(sb, AbstractC5176.m9369(arrayList, ", ", null, null, null, 62), ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract Object mo10849(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.InterfaceC6062
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC6151 mo10851(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        InterfaceC5192 interfaceC51922 = this.f15149;
        InterfaceC5192 interfaceC5192Plus = interfaceC5192.plus(interfaceC51922);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.f15148;
        int i2 = this.f15147;
        if (bufferOverflow == bufferOverflow2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            bufferOverflow = bufferOverflow3;
        }
        return (AbstractC5227.m9466(interfaceC5192Plus, interfaceC51922) && i == i2 && bufferOverflow == bufferOverflow3) ? this : mo10853(interfaceC5192Plus, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new ChannelFlow$collect$2(interfaceC6150, this, null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6151 mo10852() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract AbstractC6049 mo10853(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC6031 m10854(InterfaceC6233 interfaceC6233) {
        int i = this.f15147;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        C6036 c6036 = new C6036(AbstractC6231.m11035(interfaceC6233, this.f15149), AbstractC6037.m10841(i, 4, this.f15148), true, true);
        coroutineStart.invoke(channelFlow$collectToFun$1, c6036, c6036);
        return c6036;
    }
}
