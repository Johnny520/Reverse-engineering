package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0900;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", m556f = "Deprecated.kt", m557l = {284, 285}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements InterfaceC7383 {

    /* JADX INFO: renamed from: $n */
    final /* synthetic */ int f311$n;
    final /* synthetic */ InterfaceC6031 $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, InterfaceC6031 interfaceC6031, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.f311$n = i;
        this.$this_take = interfaceC6031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f311$n, this.$this_take, interfaceC5189);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:24:0x0076). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        InterfaceC6044 interfaceC6044;
        int i2;
        InterfaceC6044 it;
        Object objM10823;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            i = this.f311$n;
            if (i != 0) {
                if (i < 0) {
                    C6755.m11873(AbstractC0900.m722(i, "Requested element count ", " is less than zero."));
                    return null;
                }
                it = this.$this_take.iterator();
                this.L$0 = interfaceC6233;
                this.L$1 = it;
                this.L$2 = null;
                this.I$0 = i;
                this.label = 1;
                C6023 c6023 = (C6023) it;
                objM10823 = c6023.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
        if (i3 == 1) {
            i2 = this.I$0;
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            interfaceC6044 = interfaceC60442;
            if (((Boolean) obj).booleanValue()) {
            }
            return C6008.f15084;
        }
        if (i3 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.I$0;
        InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$1;
        AbstractC6017.m10769(obj);
        InterfaceC6044 interfaceC60444 = interfaceC60443;
        i = i2 - 1;
        if (i != 0) {
            it = interfaceC60444;
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 1;
            C6023 c60232 = (C6023) it;
            objM10823 = c60232.m10823(this);
            if (objM10823 != coroutineSingletons) {
                i2 = i;
                obj = objM10823;
                interfaceC6044 = c60232;
                if (((Boolean) obj).booleanValue()) {
                    C6023 c60233 = (C6023) interfaceC6044;
                    Object objM10821 = c60233.m10821();
                    this.L$0 = interfaceC6233;
                    this.L$1 = c60233;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.label = 2;
                    interfaceC60444 = c60233;
                }
            }
            return coroutineSingletons;
        }
        return C6008.f15084;
    }
}
