package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.lazy.C1594;
import kotlin.C6008;
import kotlin.coroutines.C5188;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;
import kotlinx.coroutines.internal.AbstractC6185;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6047 extends AbstractC6049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6151 f15146;

    public AbstractC6047(InterfaceC6151 interfaceC6151, InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5192, i, bufferOverflow);
        this.f15146 = interfaceC6151;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    public final String toString() {
        return this.f15146 + " -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object mo10849(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        Object objMo10850 = mo10850(new C6053(interfaceC6028), interfaceC5189);
        return objMo10850 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo10850 : C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // kotlinx.coroutines.flow.internal.AbstractC6049, kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) throws Throwable {
        if (this.f15147 == -3) {
            InterfaceC5192 context = interfaceC5189.getContext();
            Boolean bool = Boolean.FALSE;
            C1594 c1594 = new C1594(17);
            InterfaceC5192 interfaceC5192 = this.f15149;
            InterfaceC5192 interfaceC5192Plus = !((Boolean) interfaceC5192.fold(bool, c1594)).booleanValue() ? context.plus(interfaceC5192) : AbstractC6231.m11062(context, interfaceC5192, false);
            if (AbstractC5227.m9466(interfaceC5192Plus, context)) {
                Object objMo10850 = mo10850(interfaceC6150, interfaceC5189);
                if (objMo10850 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objMo10850;
                }
            } else {
                C5188 c5188 = C5188.f13281;
                if (AbstractC5227.m9466(interfaceC5192Plus.get(c5188), context.get(c5188))) {
                    InterfaceC5192 context2 = interfaceC5189.getContext();
                    if (!(interfaceC6150 instanceof C6053) && !(interfaceC6150 instanceof C6060)) {
                        interfaceC6150 = new C6055(interfaceC6150, context2);
                    }
                    Object objM10857 = AbstractC6051.m10857(interfaceC5192Plus, interfaceC6150, AbstractC6185.m10928(interfaceC5192Plus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), interfaceC5189);
                    if (objM10857 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM10857;
                    }
                } else {
                    Object objMo9012 = super.mo9012(interfaceC6150, interfaceC5189);
                    if (objMo9012 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objMo9012;
                    }
                }
            }
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public abstract Object mo10850(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189);
}
