package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6137 implements InterfaceC6151 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) throws Throwable {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        SafeCollector safeCollector;
        if (interfaceC5189 instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) interfaceC5189;
            int i = abstractFlow$collect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.label = i - Integer.MIN_VALUE;
            } else {
                abstractFlow$collect$1 = new AbstractFlow$collect$1(this, interfaceC5189);
            }
        }
        Object obj = abstractFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = abstractFlow$collect$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) abstractFlow$collect$1.L$1;
            try {
                AbstractC6017.m10769(obj);
                safeCollector.releaseIntercepted();
                return c6008;
            } catch (Throwable th) {
                th = th;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        SafeCollector safeCollector2 = new SafeCollector(interfaceC6150, abstractFlow$collect$1.getContext());
        try {
            abstractFlow$collect$1.L$0 = null;
            abstractFlow$collect$1.L$1 = safeCollector2;
            abstractFlow$collect$1.label = 1;
            try {
                Object objInvoke = ((C6116) this).f15212.invoke(safeCollector2, abstractFlow$collect$1);
                if (objInvoke != coroutineSingletons) {
                    objInvoke = c6008;
                }
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                return c6008;
            } catch (Throwable th2) {
                th = th2;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
