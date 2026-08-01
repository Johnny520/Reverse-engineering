package io.ktor.server.cio;

import com.android.dx.io.Opcodes;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.InterfaceC4055;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5439;
import kotlinx.coroutines.InterfaceC5441;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1", f = "CIOApplicationEngine.kt", l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.OR_INT_LIT16, Opcodes.OR_INT_LIT8}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$initServerJob$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5441 $cioConnectors;
    final /* synthetic */ InterfaceC4055 $environment;
    final /* synthetic */ InterfaceC5441 $startupJob;
    final /* synthetic */ InterfaceC5439 $stopRequest;
    final /* synthetic */ AbstractC5432 $userDispatcher;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C4081 this$0;

    /* JADX INFO: renamed from: io.ktor.server.cio.CIOApplicationEngine$initServerJob$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1$5", f = "CIOApplicationEngine.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC4055 $environment;
        int label;
        final /* synthetic */ C4081 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C4081 c4081, InterfaceC4055 interfaceC4055, InterfaceC4357<? super AnonymousClass5> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c4081;
            this.$environment = interfaceC4055;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass5(this.this$0, this.$environment, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass5) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.this$0.f12430.m13532(AbstractC4060.f12355, this.$environment);
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$initServerJob$1(C4081 c4081, InterfaceC5441 interfaceC5441, InterfaceC5439 interfaceC5439, InterfaceC5441 interfaceC54412, AbstractC5432 abstractC5432, InterfaceC4055 interfaceC4055, InterfaceC4357<? super CIOApplicationEngine$initServerJob$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4081;
        this.$cioConnectors = interfaceC5441;
        this.$stopRequest = interfaceC5439;
        this.$startupJob = interfaceC54412;
        this.$userDispatcher = abstractC5432;
        this.$environment = interfaceC4055;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CIOApplicationEngine$initServerJob$1 cIOApplicationEngine$initServerJob$1 = new CIOApplicationEngine$initServerJob$1(this.this$0, this.$cioConnectors, this.$stopRequest, this.$startupJob, this.$userDispatcher, this.$environment, interfaceC4357);
        cIOApplicationEngine$initServerJob$1.L$0 = obj;
        return cIOApplicationEngine$initServerJob$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CIOApplicationEngine$initServerJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
