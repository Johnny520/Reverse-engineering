package io.ktor.server.cio.backend;

import io.ktor.http.cio.C3965;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1", f = "ServerPipeline.kt", l = {59, 61, 68, 85, 113, 148, 150, 159, 169}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ServerPipelineKt$startServerConnectionPipeline$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C4074 $connection;
    final /* synthetic */ InterfaceC6550 $handler;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$1", f = "ServerPipeline.kt", l = {46}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5206 $actorChannel;
        final /* synthetic */ C4074 $connection;
        final /* synthetic */ long $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5206 interfaceC5206, long j, C4074 c4074, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$actorChannel = interfaceC5206;
            this.$timeout = j;
            this.$connection = c4074;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$actorChannel, this.$timeout, this.$connection, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5206 interfaceC5206 = this.$actorChannel;
                    long j = this.$timeout;
                    C4074 c4074 = this.$connection;
                    this.label = 1;
                    if (AbstractC4073.m8486(interfaceC5206, j, c4074, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
            } finally {
                try {
                } finally {
                }
            }
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$2", f = "ServerPipeline.kt", l = {137}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C4074 $connection;
        final /* synthetic */ InterfaceC6550 $handler;
        final /* synthetic */ C3965 $request;
        final /* synthetic */ InterfaceC4251 $requestBody;
        final /* synthetic */ C4248 $response;
        final /* synthetic */ InterfaceC5440 $upgraded;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC4251 interfaceC4251, C4248 c4248, C4074 c4074, InterfaceC5440 interfaceC5440, InterfaceC6550 interfaceC6550, C3965 c3965, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$requestBody = interfaceC4251;
            this.$response = c4248;
            this.$connection = c4074;
            this.$upgraded = interfaceC5440;
            this.$handler = interfaceC6550;
            this.$request = c3965;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$requestBody, this.$response, this.$connection, this.$upgraded, this.$handler, this.$request, interfaceC4356);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$2, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$2] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v8, types: [kotlinx.coroutines.飘花落叶言子楪哲苏兰世] */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ?? r10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC4359 interfaceC4359Mo2420 = ((InterfaceC5400) this.L$0).mo2420();
                    InterfaceC4251 interfaceC4251 = this.$requestBody;
                    C4248 c4248 = this.$response;
                    C4074 c4074 = this.$connection;
                    C4072 c4072 = new C4072(interfaceC4359Mo2420, interfaceC4251, c4248, c4074.f12372, c4074.f12371, this.$upgraded);
                    InterfaceC6550 interfaceC6550 = this.$handler;
                    C3965 c3965 = this.$request;
                    this.label = 1;
                    if (interfaceC6550.invoke(c4072, c3965, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                this.$response.m8708();
                this = this.$upgraded;
                r10 = this;
            } catch (Throwable th) {
                try {
                    AbstractC4245.m8702(this.$response, th);
                    InterfaceC5440 interfaceC5440 = this.$upgraded;
                    if (interfaceC5440 != null) {
                        ((C5437) interfaceC5440).m10525(th);
                    }
                    this.$response.m8708();
                    InterfaceC5440 interfaceC54402 = this.$upgraded;
                    r10 = interfaceC54402;
                    if (interfaceC54402 != null) {
                    }
                } catch (Throwable th2) {
                    this.$response.m8708();
                    InterfaceC5440 interfaceC54403 = this.$upgraded;
                    if (interfaceC54403 == null) {
                        throw th2;
                    }
                    ((C5437) interfaceC54403).m10585(Boolean.FALSE);
                    throw th2;
                }
            }
            if (this != 0) {
                ((C5437) r10).m10585(Boolean.FALSE);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerPipelineKt$startServerConnectionPipeline$1(C4074 c4074, long j, InterfaceC6550 interfaceC6550, InterfaceC4356<? super ServerPipelineKt$startServerConnectionPipeline$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$connection = c4074;
        this.$timeout = j;
        this.$handler = interfaceC6550;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ServerPipelineKt$startServerConnectionPipeline$1 serverPipelineKt$startServerConnectionPipeline$1 = new ServerPipelineKt$startServerConnectionPipeline$1(this.$connection, this.$timeout, this.$handler, interfaceC4356);
        serverPipelineKt$startServerConnectionPipeline$1.L$0 = obj;
        return serverPipelineKt$startServerConnectionPipeline$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ServerPipelineKt$startServerConnectionPipeline$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x041a, code lost:
    
        if (r0 == r8) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0439, code lost:
    
        if (r0 == r8) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03a1, code lost:
    
        r2 = r9;
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x03af: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:944), block:B:168:0x03af */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x02ed: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:750), block:B:130:0x02ed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x038d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:910), block:B:157:0x038d */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x038e: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:911), block:B:157:0x038d */
    /* JADX WARN: Path cross not found for [B:100:0x0249, B:109:0x025f], limit reached: 221 */
    /* JADX WARN: Path cross not found for [B:109:0x025f, B:100:0x0249], limit reached: 221 */
    /* JADX WARN: Path cross not found for [B:90:0x0233, B:98:0x0246], limit reached: 221 */
    /* JADX WARN: Path cross not found for [B:98:0x0246, B:90:0x0233], limit reached: 221 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0268 A[Catch: IOException -> 0x025a, all -> 0x025d, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IOException -> 0x025a, blocks: (B:102:0x024c, B:112:0x0268, B:115:0x0271, B:117:0x0291, B:121:0x02b6, B:123:0x02be, B:132:0x02f1, B:134:0x02f5, B:109:0x025f, B:169:0x03b2), top: B:219:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0291 A[Catch: IOException -> 0x025a, all -> 0x02ec, TryCatch #7 {all -> 0x02ec, blocks: (B:156:0x0386, B:158:0x0391, B:159:0x0396, B:164:0x03a1, B:54:0x017b, B:115:0x0271, B:117:0x0291, B:121:0x02b6, B:123:0x02be, B:132:0x02f1, B:134:0x02f5, B:109:0x025f, B:169:0x03b2, B:178:0x03eb, B:179:0x03f5, B:189:0x041d, B:190:0x041e), top: B:207:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02be A[Catch: IOException -> 0x025a, all -> 0x02ec, TryCatch #7 {all -> 0x02ec, blocks: (B:156:0x0386, B:158:0x0391, B:159:0x0396, B:164:0x03a1, B:54:0x017b, B:115:0x0271, B:117:0x0291, B:121:0x02b6, B:123:0x02be, B:132:0x02f1, B:134:0x02f5, B:109:0x025f, B:169:0x03b2, B:178:0x03eb, B:179:0x03f5, B:189:0x041d, B:190:0x041e), top: B:207:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f1 A[Catch: IOException -> 0x025a, all -> 0x02ec, TryCatch #7 {all -> 0x02ec, blocks: (B:156:0x0386, B:158:0x0391, B:159:0x0396, B:164:0x03a1, B:54:0x017b, B:115:0x0271, B:117:0x0291, B:121:0x02b6, B:123:0x02be, B:132:0x02f1, B:134:0x02f5, B:109:0x025f, B:169:0x03b2, B:178:0x03eb, B:179:0x03f5, B:189:0x041d, B:190:0x041e), top: B:207:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044e A[Catch: all -> 0x03e7, TRY_LEAVE, TryCatch #2 {all -> 0x03e7, blocks: (B:195:0x0440, B:197:0x044e, B:173:0x03e2, B:186:0x0400, B:191:0x041f), top: B:207:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173 A[Catch: all -> 0x03f6, CancellationException -> 0x03f9, IOException -> 0x03fb, TooLongLineException -> 0x03fd, PHI: r0 r1 r2 r3 r13
  0x0173: PHI (r0v70 kotlin.coroutines.飘花落叶言子楪苏世兰哲) = (r0v21 kotlin.coroutines.飘花落叶言子楪苏世兰哲), (r0v73 kotlin.coroutines.飘花落叶言子楪苏世兰哲) binds: [B:40:0x010d, B:49:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r1v80 ??) = (r1v19 ??), (r1v98 ??) binds: [B:40:0x010d, B:49:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r2v31 kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲) = (r2v9 kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲), (r2v32 kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲) binds: [B:40:0x010d, B:49:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r3v37 java.lang.Object) = (r3v4 java.lang.Object), (r3v44 java.lang.Object) binds: [B:40:0x010d, B:49:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r13v9 java.lang.Throwable) = (r13v0 java.lang.Throwable), (r13v10 java.lang.Throwable) binds: [B:40:0x010d, B:49:0x016f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #21 {TooLongLineException -> 0x03fd, IOException -> 0x03fb, CancellationException -> 0x03f9, all -> 0x03f6, blocks: (B:48:0x0152, B:51:0x0173), top: B:233:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b A[Catch: all -> 0x02ec, IOException -> 0x03af, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x03af, blocks: (B:164:0x03a1, B:54:0x017b, B:178:0x03eb, B:179:0x03f5, B:189:0x041d, B:190:0x041e), top: B:207:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8 A[Catch: all -> 0x01f3, TryCatch #9 {all -> 0x01f3, blocks: (B:59:0x01be, B:61:0x01d8, B:68:0x01f9, B:70:0x01fe, B:90:0x0233, B:94:0x023f, B:78:0x0210, B:80:0x0218, B:82:0x0220, B:86:0x022b, B:64:0x01eb, B:65:0x01f2), top: B:215:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fe A[Catch: all -> 0x01f3, TryCatch #9 {all -> 0x01f3, blocks: (B:59:0x01be, B:61:0x01d8, B:68:0x01f9, B:70:0x01fe, B:90:0x0233, B:94:0x023f, B:78:0x0210, B:80:0x0218, B:82:0x0220, B:86:0x022b, B:64:0x01eb, B:65:0x01f2), top: B:215:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233 A[Catch: all -> 0x01f3, TryCatch #9 {all -> 0x01f3, blocks: (B:59:0x01be, B:61:0x01d8, B:68:0x01f9, B:70:0x01fe, B:90:0x0233, B:94:0x023f, B:78:0x0210, B:80:0x0218, B:82:0x0220, B:86:0x022b, B:64:0x01eb, B:65:0x01f2), top: B:215:0x01be }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [kotlinx.coroutines.飘花落叶言子楪哲苏兰世] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlinx.coroutines.飘花落叶言子世楪哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r4v12, types: [kotlinx.coroutines.飘花落叶言子苏哲世兰楪] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0333 -> B:225:0x0339). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
