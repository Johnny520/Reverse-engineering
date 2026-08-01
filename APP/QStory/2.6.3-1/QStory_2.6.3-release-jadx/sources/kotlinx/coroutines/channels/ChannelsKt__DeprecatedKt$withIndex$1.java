package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.C5173;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", m556f = "Deprecated.kt", m557l = {400, 401}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/collections/飘花落叶言子楪兰苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6031 $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(InterfaceC6031 interfaceC6031, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_withIndex = interfaceC6031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, interfaceC5189);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[PHI: r2 r6 r10
  0x004a: PHI (r2v2 int) = (r2v4 int), (r2v6 int) binds: [B:13:0x0047, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r6v0 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r6v11 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r6v12 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:13:0x0047, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r10v3 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:13:0x0047, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 it;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            i = 0;
            it = this.$this_withIndex.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC6044 = c6023;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60443 = interfaceC60442;
            it = interfaceC60443;
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 1;
            C6023 c60232 = (C6023) it;
            obj = c60232.m10823(this);
            interfaceC6044 = c60232;
            if (obj != coroutineSingletons) {
                if (((Boolean) obj).booleanValue()) {
                    return C6008.f15084;
                }
                C6023 c60233 = (C6023) interfaceC6044;
                int i3 = i + 1;
                C5173 c5173 = new C5173(i, c60233.m10821());
                this.L$0 = interfaceC6233;
                this.L$1 = c60233;
                this.L$2 = null;
                this.I$0 = i3;
                this.label = 2;
                if (((AbstractC6043) interfaceC6233).f15143.mo8992(c5173, this) != coroutineSingletons) {
                    i = i3;
                    interfaceC60443 = c60233;
                    it = interfaceC60443;
                    this.L$0 = interfaceC6233;
                    this.L$1 = it;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.label = 1;
                    C6023 c602322 = (C6023) it;
                    obj = c602322.m10823(this);
                    interfaceC6044 = c602322;
                    if (obj != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        i = this.I$0;
        InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$1;
        AbstractC6017.m10769(obj);
        interfaceC6044 = interfaceC60444;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
