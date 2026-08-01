package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.C5173;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.flow.InterfaceC6150;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6069 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6039 f15183;

    public C6069(InterfaceC6039 interfaceC6039, int i) {
        this.f15183 = interfaceC6039;
        this.f15182 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11031(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
        if (interfaceC5189 instanceof CombineKt$combineInternal$2$1$1$emit$1) {
            combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) interfaceC5189;
            int i = combineKt$combineInternal$2$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                combineKt$combineInternal$2$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, interfaceC5189);
            }
        }
        Object obj2 = combineKt$combineInternal$2$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = combineKt$combineInternal$2$1$1$emit$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            C5173 c5173 = new C5173(this.f15182, obj);
            combineKt$combineInternal$2$1$1$emit$1.L$0 = null;
            combineKt$combineInternal$2$1$1$emit$1.label = 1;
            if (this.f15183.mo8992(c5173, combineKt$combineInternal$2$1$1$emit$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj2);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj2);
        combineKt$combineInternal$2$1$1$emit$1.L$0 = null;
        combineKt$combineInternal$2$1$1$emit$1.label = 2;
    }
}
