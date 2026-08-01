package kotlinx.coroutines.flow;

import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.C6057;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6102 implements InterfaceC6151 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6057 f15203;

    public C6102(C6057 c6057) {
        this.f15203 = c6057;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        StartedLazily$command$$inlined$unsafeFlow$1$1 startedLazily$command$$inlined$unsafeFlow$1$1;
        if (interfaceC5189 instanceof StartedLazily$command$$inlined$unsafeFlow$1$1) {
            startedLazily$command$$inlined$unsafeFlow$1$1 = (StartedLazily$command$$inlined$unsafeFlow$1$1) interfaceC5189;
            int i = startedLazily$command$$inlined$unsafeFlow$1$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startedLazily$command$$inlined$unsafeFlow$1$1.label = i - Integer.MIN_VALUE;
            } else {
                startedLazily$command$$inlined$unsafeFlow$1$1 = new StartedLazily$command$$inlined$unsafeFlow$1$1(this, interfaceC5189);
            }
        }
        Object obj = startedLazily$command$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = startedLazily$command$$inlined$unsafeFlow$1$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C6103 c6103 = new C6103(new Ref$BooleanRef(), interfaceC6150);
            startedLazily$command$$inlined$unsafeFlow$1$1.L$0 = null;
            startedLazily$command$$inlined$unsafeFlow$1$1.L$1 = null;
            startedLazily$command$$inlined$unsafeFlow$1$1.L$2 = null;
            startedLazily$command$$inlined$unsafeFlow$1$1.L$3 = null;
            startedLazily$command$$inlined$unsafeFlow$1$1.I$0 = 0;
            startedLazily$command$$inlined$unsafeFlow$1$1.label = 1;
            if (C6119.m10874(this.f15203, c6103, startedLazily$command$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
