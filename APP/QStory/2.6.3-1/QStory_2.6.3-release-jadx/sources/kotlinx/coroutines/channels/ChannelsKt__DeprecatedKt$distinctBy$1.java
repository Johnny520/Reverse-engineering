package kotlinx.coroutines.channels;

import java.util.HashSet;
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
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", m556f = "Deprecated.kt", m557l = {417, 418, 420}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $selector;
    final /* synthetic */ InterfaceC6031 $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$distinctBy$1(InterfaceC6031 interfaceC6031, InterfaceC7383 interfaceC7383, InterfaceC5189<? super ChannelsKt__DeprecatedKt$distinctBy$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_distinctBy = interfaceC6031;
        this.$selector = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, interfaceC5189);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[PHI: r2 r7 r12
  0x006a: PHI (r2v5 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v20 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v21 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:14:0x0067, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r7v4 java.util.HashSet) = (r7v6 java.util.HashSet), (r7v10 java.util.HashSet) binds: [B:14:0x0067, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r12v3 java.lang.Object) = (r12v8 java.lang.Object), (r12v0 java.lang.Object) binds: [B:14:0x0067, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0093 -> B:29:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:28:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HashSet hashSet;
        HashSet hashSet2;
        Object obj2;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 interfaceC60442;
        InterfaceC6044 it;
        InterfaceC6044 interfaceC60443;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            hashSet = new HashSet();
            it = this.$this_distinctBy.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = hashSet;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC60442 = c6023;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                Object obj3 = this.L$3;
                InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$2;
                hashSet2 = (HashSet) this.L$1;
                AbstractC6017.m10769(obj);
                obj2 = obj3;
                interfaceC6044 = interfaceC60444;
                interfaceC60443 = interfaceC6044;
                if (!hashSet2.contains(obj)) {
                }
                hashSet = hashSet2;
                it = interfaceC60443;
                this.L$0 = interfaceC6233;
                this.L$1 = hashSet;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                C6023 c60232 = (C6023) it;
                obj = c60232.m10823(this);
                interfaceC60442 = c60232;
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = this.L$4;
            InterfaceC6044 interfaceC60445 = (InterfaceC6044) this.L$2;
            hashSet2 = (HashSet) this.L$1;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60446 = interfaceC60445;
            hashSet2.add(obj4);
            interfaceC60443 = interfaceC60446;
            hashSet = hashSet2;
            it = interfaceC60443;
            this.L$0 = interfaceC6233;
            this.L$1 = hashSet;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
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
                InterfaceC7383 interfaceC7383 = this.$selector;
                this.L$0 = interfaceC6233;
                this.L$1 = hashSet;
                this.L$2 = c60233;
                this.L$3 = objM10821;
                this.label = 2;
                Object objInvoke = interfaceC7383.invoke(objM10821, this);
                if (objInvoke != coroutineSingletons) {
                    HashSet hashSet3 = hashSet;
                    obj2 = objM10821;
                    obj = objInvoke;
                    hashSet2 = hashSet3;
                    interfaceC6044 = c60233;
                    interfaceC60443 = interfaceC6044;
                    if (!hashSet2.contains(obj)) {
                        this.L$0 = interfaceC6233;
                        this.L$1 = hashSet2;
                        this.L$2 = interfaceC6044;
                        this.L$3 = null;
                        this.L$4 = obj;
                        this.label = 3;
                        if (((AbstractC6043) interfaceC6233).f15143.mo8992(obj2, this) != coroutineSingletons) {
                            interfaceC60446 = interfaceC6044;
                            obj4 = obj;
                            hashSet2.add(obj4);
                            interfaceC60443 = interfaceC60446;
                        }
                    }
                    hashSet = hashSet2;
                    it = interfaceC60443;
                    this.L$0 = interfaceC6233;
                    this.L$1 = hashSet;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = null;
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
        InterfaceC6044 interfaceC60447 = (InterfaceC6044) this.L$2;
        hashSet = (HashSet) this.L$1;
        AbstractC6017.m10769(obj);
        interfaceC60442 = interfaceC60447;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
