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
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m556f = "Deprecated.kt", m557l = {194, 199, 200}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements InterfaceC7383 {

    /* JADX INFO: renamed from: $n */
    final /* synthetic */ int f310$n;
    final /* synthetic */ InterfaceC6031 $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, InterfaceC6031 interfaceC6031, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.f310$n = i;
        this.$this_drop = interfaceC6031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f310$n, this.$this_drop, interfaceC5189);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r10, r9) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        InterfaceC6044 it;
        Object objM10823;
        InterfaceC6044 interfaceC6044;
        int i2;
        InterfaceC6044 it2;
        Object objM108232;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            i = this.f310$n;
            if (i < 0) {
                C6755.m11873(AbstractC0900.m722(i, "Requested element count ", " is less than zero."));
                return null;
            }
            if (i > 0) {
                it = this.$this_drop.iterator();
                this.L$0 = interfaceC6233;
                this.L$1 = it;
                this.I$0 = i;
                this.label = 1;
                C6023 c6023 = (C6023) it;
                objM10823 = c6023.m10823(this);
                if (objM10823 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            it2 = this.$this_drop.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it2;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 2;
            C6023 c60232 = (C6023) it2;
            objM108232 = c60232.m10823(this);
            if (objM108232 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i4 = this.I$0;
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60443 = interfaceC60442;
            if (((Boolean) obj).booleanValue()) {
                C6023 c60233 = (C6023) interfaceC60443;
                c60233.m10821();
                i4--;
                if (i4 != 0) {
                    it = c60233;
                    i = i4;
                    this.L$0 = interfaceC6233;
                    this.L$1 = it;
                    this.I$0 = i;
                    this.label = 1;
                    C6023 c60234 = (C6023) it;
                    objM10823 = c60234.m10823(this);
                    if (objM10823 != coroutineSingletons) {
                        i4 = i;
                        obj = objM10823;
                        interfaceC60443 = c60234;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            i = i4;
            it2 = this.$this_drop.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it2;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 2;
            C6023 c602322 = (C6023) it2;
            objM108232 = c602322.m10823(this);
            if (objM108232 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60445 = interfaceC60444;
            i = i2;
            it2 = interfaceC60445;
            this.L$0 = interfaceC6233;
            this.L$1 = it2;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 2;
            C6023 c6023222 = (C6023) it2;
            objM108232 = c6023222.m10823(this);
            if (objM108232 != coroutineSingletons) {
                i2 = i;
                obj = objM108232;
                interfaceC6044 = c6023222;
                if (((Boolean) obj).booleanValue()) {
                    return C6008.f15084;
                }
                C6023 c60235 = (C6023) interfaceC6044;
                Object objM10821 = c60235.m10821();
                this.L$0 = interfaceC6233;
                this.L$1 = c60235;
                this.L$2 = null;
                this.I$0 = i2;
                this.label = 3;
                interfaceC60445 = c60235;
            }
            return coroutineSingletons;
        }
        i2 = this.I$0;
        InterfaceC6044 interfaceC60446 = (InterfaceC6044) this.L$1;
        AbstractC6017.m10769(obj);
        interfaceC6044 = interfaceC60446;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
