package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.text.C1850;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6271;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;
import kotlinx.coroutines.internal.AbstractC6185;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m556f = "Combine.kt", m557l = {123}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6151 $flow;
    final /* synthetic */ InterfaceC6151 $flow2;
    final /* synthetic */ InterfaceC6150 $this_unsafeFlow;
    final /* synthetic */ InterfaceC7380 $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, m152k = 3, m153mv = {2, 2, 0})
    @InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m556f = "Combine.kt", m557l = {124}, m558m = "invokeSuspend", m559v = 1)
    public static final class C04062 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ InterfaceC6271 $collectJob;
        final /* synthetic */ InterfaceC6151 $flow;
        final /* synthetic */ InterfaceC5192 $scopeContext;
        final /* synthetic */ InterfaceC6031 $second;
        final /* synthetic */ InterfaceC6150 $this_unsafeFlow;
        final /* synthetic */ InterfaceC7380 $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04062(InterfaceC6151 interfaceC6151, InterfaceC5192 interfaceC5192, Object obj, InterfaceC6031 interfaceC6031, InterfaceC6150 interfaceC6150, InterfaceC7380 interfaceC7380, InterfaceC6271 interfaceC6271, InterfaceC5189<? super C04062> interfaceC5189) {
            super(2, interfaceC5189);
            this.$flow = interfaceC6151;
            this.$scopeContext = interfaceC5192;
            this.$cnt = obj;
            this.$second = interfaceC6031;
            this.$this_unsafeFlow = interfaceC6150;
            this.$transform = interfaceC7380;
            this.$collectJob = interfaceC6271;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C04062(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C04062) create(c6008, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6151 interfaceC6151 = this.$flow;
                C6066 c6066 = new C6066(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
                this.label = 1;
                if (interfaceC6151.mo9012(c6066, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(InterfaceC6151 interfaceC6151, InterfaceC6151 interfaceC61512, InterfaceC6150 interfaceC6150, InterfaceC7380 interfaceC7380, InterfaceC5189<? super CombineKt$zipImpl$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$flow2 = interfaceC6151;
        this.$flow = interfaceC61512;
        this.$this_unsafeFlow = interfaceC6150;
        this.$transform = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, interfaceC5189);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CombineKt$zipImpl$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[Catch: all -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:6:0x001f, B:32:0x0095, B:36:0x009d), top: B:41:0x000e }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6271 interfaceC6271;
        InterfaceC6031 interfaceC6031;
        InterfaceC5192 interfaceC5192Mo2990;
        Object objM10928;
        InterfaceC5192 interfaceC5192Plus;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        ?? r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C6036 c6036M10836 = AbstractC6037.m10836(interfaceC6233, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3);
                C6283 c6283M11047 = AbstractC6231.m11047();
                c6036M10836.mo8991(new C1850(c6283M11047, 20));
                try {
                    try {
                        interfaceC5192Mo2990 = interfaceC6233.mo2990();
                        objM10928 = AbstractC6185.m10928(interfaceC5192Mo2990);
                        interfaceC5192Plus = interfaceC6233.mo2990().plus(c6283M11047);
                    } catch (AbortFlowException e) {
                        e = e;
                    }
                    try {
                        C04062 c04062 = new C04062(this.$flow, interfaceC5192Mo2990, objM10928, c6036M10836, this.$this_unsafeFlow, this.$transform, c6283M11047, null);
                        this.L$0 = null;
                        this.L$1 = c6036M10836;
                        this.L$2 = c6283M11047;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 1;
                        if (AbstractC6051.m10857(interfaceC5192Plus, c6008, AbstractC6185.m10928(interfaceC5192Plus), c04062, this) == r2) {
                            return r2;
                        }
                        interfaceC6031 = c6036M10836;
                        interfaceC6031.mo10815(null);
                        return c6008;
                    } catch (AbortFlowException e2) {
                        e = e2;
                        c6283M11047 = c6283M11047;
                        interfaceC6271 = c6283M11047;
                        interfaceC6031 = c6036M10836;
                        if (e.owner == interfaceC6271) {
                            throw e;
                        }
                        interfaceC6031.mo10815(null);
                        return c6008;
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = c6036M10836;
                    r2.mo10815(null);
                    throw th;
                }
            }
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6271 = (InterfaceC6271) this.L$2;
            interfaceC6031 = (InterfaceC6031) this.L$1;
            try {
                AbstractC6017.m10769(obj);
                interfaceC6031.mo10815(null);
                return c6008;
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.owner == interfaceC6271) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
