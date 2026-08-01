package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC6271;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7380;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6066 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7380 f15174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6271 f15176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15177;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6031 f15178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5192 f15179;

    public C6066(InterfaceC5192 interfaceC5192, Object obj, InterfaceC6031 interfaceC6031, InterfaceC6150 interfaceC6150, InterfaceC7380 interfaceC7380, InterfaceC6271 interfaceC6271) {
        this.f15179 = interfaceC5192;
        this.f15177 = obj;
        this.f15178 = interfaceC6031;
        this.f15175 = interfaceC6150;
        this.f15174 = interfaceC7380;
        this.f15176 = interfaceC6271;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
        if (interfaceC5189 instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
            combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) interfaceC5189;
            int i = combineKt$zipImpl$1$1$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                combineKt$zipImpl$1$1$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = combineKt$zipImpl$1$1$2$1$emit$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            CombineKt$zipImpl$1$1$2$1$1 combineKt$zipImpl$1$1$2$1$1 = new CombineKt$zipImpl$1$1$2$1$1(this.f15178, this.f15175, this.f15174, obj, this.f15176, null);
            combineKt$zipImpl$1$1$2$1$emit$1.L$0 = null;
            combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
            if (AbstractC6051.m10857(this.f15179, c6008, this.f15177, combineKt$zipImpl$1$1$2$1$1, combineKt$zipImpl$1$1$2$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj2);
        }
        return c6008;
    }
}
