package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5206;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
final class CombineKt$combineInternal$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $arrayFactory;
    final /* synthetic */ InterfaceC5318[] $flows;
    final /* synthetic */ InterfaceC5317 $this_combineInternal;
    final /* synthetic */ InterfaceC6550 $transform;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 2, 0})
    @InterfaceC6861(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5318[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ InterfaceC5206 $resultChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5318[] interfaceC5318Arr, int i, AtomicInteger atomicInteger, InterfaceC5206 interfaceC5206, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$flows = interfaceC5318Arr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = interfaceC5206;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5318[] interfaceC5318Arr = this.$flows;
                    int i2 = this.$i;
                    InterfaceC5318 interfaceC5318 = interfaceC5318Arr[i2];
                    C5236 c5236 = new C5236(this.$resultChannel, i2);
                    this.label = 1;
                    if (interfaceC5318.mo8463(c5236, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.$resultChannel.mo8446(null);
                }
                return C5175.f14739;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.mo8446(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(InterfaceC5318[] interfaceC5318Arr, InterfaceC6542 interfaceC6542, InterfaceC6550 interfaceC6550, InterfaceC5317 interfaceC5317, InterfaceC4356<? super CombineKt$combineInternal$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$flows = interfaceC5318Arr;
        this.$arrayFactory = interfaceC6542;
        this.$transform = interfaceC6550;
        this.$this_combineInternal = interfaceC5317;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, interfaceC4356);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CombineKt$combineInternal$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if (r8.invoke(r14, r11, r19) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
    
        if (r14.invoke(r15, r8, r19) == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc A[LOOP:0: B:28:0x00fc->B:36:0x011d, LOOP_START, PHI: r4 r14
  0x00fc: PHI (r4v4 int) = (r4v3 int), (r4v5 int) binds: [B:25:0x00f7, B:36:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r14v6 kotlin.collections.飘花落叶言子楪兰苏哲世) = (r14v5 kotlin.collections.飘花落叶言子楪兰苏哲世), (r14v12 kotlin.collections.飘花落叶言子楪兰苏哲世) binds: [B:25:0x00f7, B:36:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0149 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0172 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0175 -> B:43:0x014c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
