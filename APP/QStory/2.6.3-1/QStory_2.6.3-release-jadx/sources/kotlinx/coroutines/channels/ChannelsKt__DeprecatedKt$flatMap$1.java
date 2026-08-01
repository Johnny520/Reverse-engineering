package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", m556f = "Deprecated.kt", m557l = {351, 352, 352}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6031 $this_flatMap;
    final /* synthetic */ InterfaceC7383 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$flatMap$1(InterfaceC6031 interfaceC6031, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_flatMap = interfaceC6031;
        this.$transform = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, interfaceC5189);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (kotlinx.coroutines.channels.AbstractC6037.m10842((kotlinx.coroutines.channels.InterfaceC6031) r9, r0, r8) != r1) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[PHI: r2 r9
  0x004e: PHI (r2v2 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v15 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v16 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:15:0x004b, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r9v6 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:15:0x004b, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007b -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 interfaceC60442;
        InterfaceC6044 it;
        InterfaceC6044 interfaceC60443;
        InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            it = this.$this_flatMap.iterator();
            this.L$0 = interfaceC6028;
            this.L$1 = it;
            this.L$2 = null;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC60442 = c6023;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            interfaceC60442 = interfaceC60444;
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC6044 interfaceC60445 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                interfaceC60443 = interfaceC60445;
                it = interfaceC60443;
                this.L$0 = interfaceC6028;
                this.L$1 = it;
                this.L$2 = null;
                this.label = 1;
                C6023 c60232 = (C6023) it;
                obj = c60232.m10823(this);
                interfaceC60442 = c60232;
                if (obj != coroutineSingletons) {
                    if (((Boolean) obj).booleanValue()) {
                        return C6008.f15084;
                    }
                    C6023 c60233 = (C6023) interfaceC60442;
                    Object objM10821 = c60233.m10821();
                    InterfaceC7383 interfaceC7383 = this.$transform;
                    this.L$0 = interfaceC6028;
                    this.L$1 = c60233;
                    this.L$2 = null;
                    this.label = 2;
                    obj = interfaceC7383.invoke(objM10821, this);
                    interfaceC6044 = c60233;
                    if (obj != coroutineSingletons) {
                        this.L$0 = interfaceC6028;
                        this.L$1 = interfaceC6044;
                        this.L$2 = null;
                        this.label = 3;
                        interfaceC60443 = interfaceC6044;
                    }
                }
                return coroutineSingletons;
            }
            InterfaceC6044 interfaceC60446 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            interfaceC6044 = interfaceC60446;
            this.L$0 = interfaceC6028;
            this.L$1 = interfaceC6044;
            this.L$2 = null;
            this.label = 3;
            interfaceC60443 = interfaceC6044;
        }
    }
}
