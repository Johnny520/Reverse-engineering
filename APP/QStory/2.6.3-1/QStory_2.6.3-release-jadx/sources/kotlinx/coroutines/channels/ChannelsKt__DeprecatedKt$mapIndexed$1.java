package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", m556f = "Deprecated.kt", m557l = {374, 375, 375}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6031 $this_mapIndexed;
    final /* synthetic */ InterfaceC7380 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(InterfaceC6031 interfaceC6031, InterfaceC7380 interfaceC7380, InterfaceC5189<? super ChannelsKt__DeprecatedKt$mapIndexed$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_mapIndexed = interfaceC6031;
        this.$transform = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, interfaceC5189);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:13:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6044 it;
        int i;
        InterfaceC6044 interfaceC6044;
        Object obj2;
        InterfaceC6044 interfaceC60442;
        InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            it = this.$this_mapIndexed.iterator();
            i = 0;
        } else {
            if (i2 == 1) {
                i = this.I$0;
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                interfaceC60442 = interfaceC60443;
                if (((Boolean) obj).booleanValue()) {
                    return C6008.f15084;
                }
                C6023 c6023 = (C6023) interfaceC60442;
                Object objM10821 = c6023.m10821();
                InterfaceC7380 interfaceC7380 = this.$transform;
                int i3 = i + 1;
                Integer num = new Integer(i);
                this.L$0 = interfaceC6028;
                this.L$1 = c6023;
                this.L$2 = null;
                this.L$3 = interfaceC6028;
                this.I$0 = i3;
                this.label = 2;
                obj = interfaceC7380.invoke(num, objM10821, this);
                if (obj != coroutineSingletons) {
                    interfaceC6044 = c6023;
                    i = i3;
                    obj2 = interfaceC6028;
                    this.L$0 = interfaceC6028;
                    this.L$1 = interfaceC6044;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i;
                    this.label = 3;
                    if (((AbstractC6043) obj2).f15143.mo8992(obj, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 2) {
                i = this.I$0;
                obj2 = (InterfaceC6028) this.L$3;
                interfaceC6044 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                this.L$0 = interfaceC6028;
                this.L$1 = interfaceC6044;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.label = 3;
                if (((AbstractC6043) obj2).f15143.mo8992(obj, this) != coroutineSingletons) {
                    it = interfaceC6044;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            it = interfaceC60444;
        }
        this.L$0 = interfaceC6028;
        this.L$1 = it;
        this.L$2 = null;
        this.I$0 = i;
        this.label = 1;
        C6023 c60232 = (C6023) it;
        obj = c60232.m10823(this);
        interfaceC60442 = c60232;
        if (obj != coroutineSingletons) {
            if (((Boolean) obj).booleanValue()) {
            }
        }
        return coroutineSingletons;
    }
}
