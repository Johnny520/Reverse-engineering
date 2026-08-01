package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6103 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15204;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$BooleanRef f15205;

    public C6103(Ref$BooleanRef ref$BooleanRef, InterfaceC6150 interfaceC6150) {
        this.f15205 = ref$BooleanRef;
        this.f15204 = interfaceC6150;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        return m10873(((Number) obj).intValue(), interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10873(int i, InterfaceC5189 interfaceC5189) {
        StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
        if (interfaceC5189 instanceof StartedLazily$command$1$1$emit$1) {
            startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) interfaceC5189;
            int i2 = startedLazily$command$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startedLazily$command$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj = startedLazily$command$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = startedLazily$command$1$1$emit$1.label;
        C6008 c6008 = C6008.f15084;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (i > 0) {
            Ref$BooleanRef ref$BooleanRef = this.f15205;
            if (!ref$BooleanRef.element) {
                ref$BooleanRef.element = true;
                SharingCommand sharingCommand = SharingCommand.START;
                startedLazily$command$1$1$emit$1.I$0 = i;
                startedLazily$command$1$1$emit$1.label = 1;
                if (this.f15204.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return c6008;
    }
}
