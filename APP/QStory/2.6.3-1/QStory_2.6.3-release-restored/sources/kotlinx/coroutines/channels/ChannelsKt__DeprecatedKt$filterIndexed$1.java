package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", m556f = "Deprecated.kt", m557l = {241, 242, 242}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $predicate;
    final /* synthetic */ InterfaceC6031 $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(InterfaceC6031 interfaceC6031, InterfaceC7380 interfaceC7380, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_filterIndexed = interfaceC6031;
        this.$predicate = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, interfaceC5189);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r8, r12) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[PHI: r2 r7 r13
  0x005c: PHI (r2v3 int) = (r2v6 int), (r2v8 int) binds: [B:14:0x0059, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r7v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r7v15 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r7v16 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:14:0x0059, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r13v10 java.lang.Object) = (r13v16 java.lang.Object), (r13v0 java.lang.Object) binds: [B:14:0x0059, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:27:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:27:0x00a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 interfaceC60442;
        InterfaceC6044 it;
        InterfaceC6044 interfaceC60443;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            i = 0;
            it = this.$this_filterIndexed.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC60442 = c6023;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i = this.I$0;
                Object obj3 = this.L$2;
                InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                obj2 = obj3;
                interfaceC6044 = interfaceC60444;
                interfaceC60443 = interfaceC6044;
                if (((Boolean) obj).booleanValue()) {
                }
                it = interfaceC60443;
                this.L$0 = interfaceC6233;
                this.L$1 = it;
                this.L$2 = null;
                this.I$0 = i;
                this.label = 1;
                C6023 c60232 = (C6023) it;
                obj = c60232.m10823(this);
                interfaceC60442 = c60232;
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            InterfaceC6044 interfaceC60445 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            interfaceC60443 = interfaceC60445;
            it = interfaceC60443;
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 1;
            C6023 c602322 = (C6023) it;
            obj = c602322.m10823(this);
            interfaceC60442 = c602322;
            if (obj != coroutineSingletons) {
                if (((Boolean) obj).booleanValue()) {
                    return C6008.f15084;
                }
                C6023 c60233 = (C6023) interfaceC60442;
                Object objM10821 = c60233.m10821();
                InterfaceC7380 interfaceC7380 = this.$predicate;
                int i3 = i + 1;
                Integer num = new Integer(i);
                this.L$0 = interfaceC6233;
                this.L$1 = c60233;
                this.L$2 = objM10821;
                this.I$0 = i3;
                this.label = 2;
                Object objInvoke = interfaceC7380.invoke(num, objM10821, this);
                if (objInvoke != coroutineSingletons) {
                    obj2 = objM10821;
                    obj = objInvoke;
                    i = i3;
                    interfaceC6044 = c60233;
                    interfaceC60443 = interfaceC6044;
                    if (((Boolean) obj).booleanValue()) {
                        this.L$0 = interfaceC6233;
                        this.L$1 = interfaceC6044;
                        this.L$2 = null;
                        this.I$0 = i;
                        this.label = 3;
                        interfaceC60443 = interfaceC6044;
                    }
                    it = interfaceC60443;
                    this.L$0 = interfaceC6233;
                    this.L$1 = it;
                    this.L$2 = null;
                    this.I$0 = i;
                    this.label = 1;
                    C6023 c6023222 = (C6023) it;
                    obj = c6023222.m10823(this);
                    interfaceC60442 = c6023222;
                    if (obj != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        i = this.I$0;
        InterfaceC6044 interfaceC60446 = (InterfaceC6044) this.L$1;
        AbstractC6017.m10769(obj);
        interfaceC60442 = interfaceC60446;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
