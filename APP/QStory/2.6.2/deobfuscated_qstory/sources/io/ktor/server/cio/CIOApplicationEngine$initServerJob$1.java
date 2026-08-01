package io.ktor.server.cio;

import com.android.dx.io.Opcodes;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.InterfaceC4054;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5438;
import kotlinx.coroutines.InterfaceC5440;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1", f = "CIOApplicationEngine.kt", l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.OR_INT_LIT16, Opcodes.OR_INT_LIT8}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$initServerJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5440 $cioConnectors;
    final /* synthetic */ InterfaceC4054 $environment;
    final /* synthetic */ InterfaceC5440 $startupJob;
    final /* synthetic */ InterfaceC5438 $stopRequest;
    final /* synthetic */ AbstractC5431 $userDispatcher;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C4080 this$0;

    /* JADX INFO: renamed from: io.ktor.server.cio.CIOApplicationEngine$initServerJob$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1$5", f = "CIOApplicationEngine.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC4054 $environment;
        int label;
        final /* synthetic */ C4080 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C4080 c4080, InterfaceC4054 interfaceC4054, InterfaceC4356<? super AnonymousClass5> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c4080;
            this.$environment = interfaceC4054;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass5(this.this$0, this.$environment, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass5) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.this$0.f12426.m13505(AbstractC4059.f12351, this.$environment);
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$initServerJob$1(C4080 c4080, InterfaceC5440 interfaceC5440, InterfaceC5438 interfaceC5438, InterfaceC5440 interfaceC54402, AbstractC5431 abstractC5431, InterfaceC4054 interfaceC4054, InterfaceC4356<? super CIOApplicationEngine$initServerJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4080;
        this.$cioConnectors = interfaceC5440;
        this.$stopRequest = interfaceC5438;
        this.$startupJob = interfaceC54402;
        this.$userDispatcher = abstractC5431;
        this.$environment = interfaceC4054;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CIOApplicationEngine$initServerJob$1 cIOApplicationEngine$initServerJob$1 = new CIOApplicationEngine$initServerJob$1(this.this$0, this.$cioConnectors, this.$stopRequest, this.$startupJob, this.$userDispatcher, this.$environment, interfaceC4356);
        cIOApplicationEngine$initServerJob$1.L$0 = obj;
        return cIOApplicationEngine$initServerJob$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CIOApplicationEngine$initServerJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01f1: INVOKE (r2 I:java.util.Iterator) = (r12 I:java.lang.Iterable) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)] (LINE:498), block:B:66:0x01f1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x003d, B:41:0x013c, B:35:0x0109, B:37:0x010f, B:42:0x0146, B:43:0x0157, B:45:0x015d, B:47:0x0177, B:50:0x017d, B:51:0x018f, B:52:0x0196, B:53:0x0197, B:18:0x005e, B:19:0x0068, B:21:0x006e, B:24:0x0081, B:25:0x0088, B:26:0x0089, B:27:0x009c, B:29:0x00a2, B:30:0x00d1, B:31:0x00e0, B:33:0x00e6, B:34:0x00f6), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x003d, B:41:0x013c, B:35:0x0109, B:37:0x010f, B:42:0x0146, B:43:0x0157, B:45:0x015d, B:47:0x0177, B:50:0x017d, B:51:0x018f, B:52:0x0196, B:53:0x0197, B:18:0x005e, B:19:0x0068, B:21:0x006e, B:24:0x0081, B:25:0x0088, B:26:0x0089, B:27:0x009c, B:29:0x00a2, B:30:0x00d1, B:31:0x00e0, B:33:0x00e6, B:34:0x00f6), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8 A[LOOP:0: B:59:0x01c2->B:61:0x01c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:41:0x013c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.CIOApplicationEngine$initServerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
