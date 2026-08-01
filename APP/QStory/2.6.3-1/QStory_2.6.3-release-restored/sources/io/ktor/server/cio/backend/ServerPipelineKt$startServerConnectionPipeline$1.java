package io.ktor.server.cio.backend;

import io.ktor.http.cio.AbstractC4805;
import io.ktor.http.cio.C4798;
import io.ktor.http.cio.C4803;
import io.ktor.http.cio.C4806;
import io.ktor.http.cio.ParserException;
import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.http.cio.internals.C4786;
import io.ktor.server.cio.AbstractC4919;
import io.ktor.util.cio.ChannelReadException;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.C5083;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import io.ktor.utils.p007io.charsets.TooLongLineException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6273;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.p010io.C6309;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import p252.C8927;
import p252.C8928;
import p269.AbstractC9019;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1", m556f = "ServerPipeline.kt", m557l = {59, 61, 68, 85, 113, 148, 150, 159, 169}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ServerPipelineKt$startServerConnectionPipeline$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C4907 $connection;
    final /* synthetic */ InterfaceC7380 $handler;
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

    /* JADX INFO: renamed from: io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$1", m556f = "ServerPipeline.kt", m557l = {46}, m558m = "invokeSuspend")
    public static final class C03671 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6039 $actorChannel;
        final /* synthetic */ C4907 $connection;
        final /* synthetic */ long $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03671(InterfaceC6039 interfaceC6039, long j, C4907 c4907, InterfaceC5189<? super C03671> interfaceC5189) {
            super(2, interfaceC5189);
            this.$actorChannel = interfaceC6039;
            this.$timeout = j;
            this.$connection = c4907;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C03671(this.$actorChannel, this.$timeout, this.$connection, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03671) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6039 interfaceC6039 = this.$actorChannel;
                    long j = this.$timeout;
                    C4907 c4907 = this.$connection;
                    this.label = 1;
                    if (AbstractC4906.m9035(interfaceC6039, j, c4907, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
            } finally {
                try {
                } finally {
                }
            }
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.cio.backend.ServerPipelineKt$startServerConnectionPipeline$1$2", m556f = "ServerPipeline.kt", m557l = {137}, m558m = "invokeSuspend")
    public static final class C03682 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C4907 $connection;
        final /* synthetic */ InterfaceC7380 $handler;
        final /* synthetic */ C4798 $request;
        final /* synthetic */ InterfaceC5084 $requestBody;
        final /* synthetic */ C5081 $response;
        final /* synthetic */ InterfaceC6273 $upgraded;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03682(InterfaceC5084 interfaceC5084, C5081 c5081, C4907 c4907, InterfaceC6273 interfaceC6273, InterfaceC7380 interfaceC7380, C4798 c4798, InterfaceC5189<? super C03682> interfaceC5189) {
            super(2, interfaceC5189);
            this.$requestBody = interfaceC5084;
            this.$response = c5081;
            this.$connection = c4907;
            this.$upgraded = interfaceC6273;
            this.$handler = interfaceC7380;
            this.$request = c4798;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C03682 c03682 = new C03682(this.$requestBody, this.$response, this.$connection, this.$upgraded, this.$handler, this.$request, interfaceC5189);
            c03682.L$0 = obj;
            return c03682;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03682) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
                    AbstractC6017.m10769(obj);
                    InterfaceC5192 interfaceC5192Mo2990 = ((InterfaceC6233) this.L$0).mo2990();
                    InterfaceC5084 interfaceC5084 = this.$requestBody;
                    C5081 c5081 = this.$response;
                    C4907 c4907 = this.$connection;
                    C4905 c4905 = new C4905(interfaceC5192Mo2990, interfaceC5084, c5081, c4907.f12721, c4907.f12720, this.$upgraded);
                    InterfaceC7380 interfaceC7380 = this.$handler;
                    C4798 c4798 = this.$request;
                    this.label = 1;
                    if (interfaceC7380.invoke(c4905, c4798, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                this.$response.m9257();
                this = this.$upgraded;
                r10 = this;
            } catch (Throwable th) {
                try {
                    AbstractC5078.m9251(this.$response, th);
                    InterfaceC6273 interfaceC6273 = this.$upgraded;
                    if (interfaceC6273 != null) {
                        ((C6270) interfaceC6273).m11088(th);
                    }
                    this.$response.m9257();
                    InterfaceC6273 interfaceC62732 = this.$upgraded;
                    r10 = interfaceC62732;
                    if (interfaceC62732 != null) {
                    }
                } catch (Throwable th2) {
                    this.$response.m9257();
                    InterfaceC6273 interfaceC62733 = this.$upgraded;
                    if (interfaceC62733 == null) {
                        throw th2;
                    }
                    ((C6270) interfaceC62733).m11147(Boolean.FALSE);
                    throw th2;
                }
            }
            if (this != 0) {
                ((C6270) r10).m11147(Boolean.FALSE);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerPipelineKt$startServerConnectionPipeline$1(C4907 c4907, long j, InterfaceC7380 interfaceC7380, InterfaceC5189<? super ServerPipelineKt$startServerConnectionPipeline$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$connection = c4907;
        this.$timeout = j;
        this.$handler = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ServerPipelineKt$startServerConnectionPipeline$1 serverPipelineKt$startServerConnectionPipeline$1 = new ServerPipelineKt$startServerConnectionPipeline$1(this.$connection, this.$timeout, this.$handler, interfaceC5189);
        serverPipelineKt$startServerConnectionPipeline$1.L$0 = obj;
        return serverPipelineKt$startServerConnectionPipeline$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ServerPipelineKt$startServerConnectionPipeline$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6039 interfaceC6039;
        InterfaceC6039 interfaceC60392;
        Object obj2;
        InterfaceC6039 interfaceC60393;
        InterfaceC6039 interfaceC60394;
        Object obj3;
        Throwable th;
        InterfaceC6284 interfaceC6284;
        Throwable th2;
        InterfaceC6039 interfaceC6039M10841;
        InterfaceC5192 interfaceC5192Plus;
        ?? r0;
        ?? r02;
        ?? r1;
        Object objM8927;
        CharSequence charSequence;
        C4798 c4798;
        CharSequence charSequenceM8939;
        C5081 c5081;
        InterfaceC5192 interfaceC5192;
        C8927 c8927;
        C5081 c50812;
        ?? r2;
        C4803 c4803;
        C5081 c50813;
        char c;
        long j;
        Object objM11132;
        InterfaceC5084 interfaceC5084;
        boolean z;
        ?? r03;
        InterfaceC6233 interfaceC6233;
        ?? r3;
        InterfaceC5084 interfaceC50842;
        Throwable th3;
        C6309 c6309M12640;
        C5081 c50814;
        ?? r04;
        C8927 c89272;
        ?? r12;
        C8927 c89273;
        C4803 c48032;
        InterfaceC6039 interfaceC60395;
        ?? r6;
        InterfaceC5192 interfaceC51922;
        C8928 c8928;
        int iM8940;
        C4803 c4803M14253;
        InterfaceC5084 c50815;
        ?? r4;
        Throwable th4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r05 = this.label;
        Throwable th5 = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } finally {
                            AbstractC5076.m9225((InterfaceC5079) interfaceC50842);
                        }
                    } catch (IOException unused) {
                        r05 = obj3;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    interfaceC60394 = interfaceC60393;
                }
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            interfaceC60392 = interfaceC6039;
            r05 = obj2;
        }
        switch (r05) {
            case 0:
                AbstractC6017.m10769(obj);
                InterfaceC6233 interfaceC62332 = (InterfaceC6233) this.L$0;
                interfaceC6039M10841 = AbstractC6037.m10841(3, 6, null);
                AbstractC6231.m11037(interfaceC62332, AbstractC4919.f12767, CoroutineStart.UNDISPATCHED, new C03671(interfaceC6039M10841, this.$timeout, this.$connection, null));
                ?? r13 = interfaceC62332;
                interfaceC5192Plus = AbstractC4919.f12766.plus(AbstractC6227.f15374);
                try {
                    C5081 c50816 = this.$connection.f12723;
                    this.L$0 = r13;
                    this.L$1 = interfaceC6039M10841;
                    this.L$2 = interfaceC5192Plus;
                    this.L$3 = th5;
                    this.L$4 = th5;
                    this.L$5 = th5;
                    this.L$6 = th5;
                    this.L$7 = th5;
                    this.L$8 = th5;
                    this.label = 1;
                    objM8927 = AbstractC4805.m8927(c50816, this);
                    r1 = r13;
                    break;
                } catch (TooLongLineException unused4) {
                    r02 = r13;
                    interfaceC60392 = interfaceC6039M10841;
                    this.L$0 = r02;
                    this.L$1 = interfaceC60392;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 2;
                    Object objM9034 = AbstractC4906.m9034(interfaceC60392, this);
                    r05 = objM9034;
                    break;
                } catch (IOException e) {
                    throw e;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused5) {
                    r0 = r13;
                    interfaceC60392 = interfaceC6039M10841;
                    this.L$0 = r0;
                    this.L$1 = interfaceC60392;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 3;
                    Object objM90342 = AbstractC4906.m9034(interfaceC60392, this);
                    r05 = objM90342;
                    break;
                }
                if (objM8927 == coroutineSingletons) {
                    c4798 = (C4798) objM8927;
                    if (c4798 != null) {
                        th4 = th5;
                        interfaceC6039M10841.mo8994(th4);
                        return C6008.f15084;
                    }
                    C4806 c4806 = c4798.f12562;
                    C5081 c50817 = new C5081(false);
                    charSequenceM8939 = c4806.m8939("Transfer-Encoding");
                    C4786 c4786M8939 = c4806.m8939("Upgrade");
                    C4786 c4786M89392 = c4806.m8939("Content-Type");
                    C8927 c8927M12600 = AbstractC7390.m12600(c4798.f12547);
                    try {
                        this.L$0 = r1;
                        this.L$1 = interfaceC6039M10841;
                        this.L$2 = interfaceC5192Plus;
                        this.L$3 = c4798;
                        this.L$4 = c50817;
                        this.L$5 = charSequenceM8939;
                        this.L$6 = c4786M8939;
                        this.L$7 = c4786M89392;
                        this.L$8 = c8927M12600;
                        this.label = 4;
                        if (interfaceC6039M10841.mo8992(c50817, this) != coroutineSingletons) {
                            interfaceC5192 = interfaceC5192Plus;
                            r05 = r1;
                            c5081 = c50817;
                            charSequence = c4786M8939;
                            c8927 = c8927M12600;
                            try {
                                C4806 c48062 = c4798.f12562;
                                c8928 = c4798.f12549;
                                iM8940 = c48062.m8940(0);
                                C4803 c48033 = C4803.f12556;
                                c4803M14253 = AbstractC9019.m14253(c48062.m8939("Connection"));
                                if (iM8940 == -1) {
                                    long jM8889 = AbstractC4782.m8889(c48062.m8935(iM8940));
                                    if (c48062.m8940(iM8940 + 1) != -1) {
                                        throw new ParserException("Duplicate Content-Length header");
                                    }
                                    j = jM8889;
                                } else {
                                    j = -1;
                                }
                                c8928.getClass();
                            } catch (Throwable unused6) {
                                C5081 c50818 = c5081;
                                c4798.f12561.m8896();
                                c4798.f12562.m8936();
                                C6309 c6309M126402 = AbstractC7684.m12640(AbstractC4906.f12719);
                                this.L$0 = r05;
                                this.L$1 = interfaceC6039M10841;
                                this.L$2 = c50818;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.label = 5;
                                if (AbstractC5078.m9246(c50818, c6309M126402, this) != coroutineSingletons) {
                                    interfaceC60392 = interfaceC6039M10841;
                                    r2 = r05;
                                    c50812 = c50818;
                                    c50812.m9257();
                                    interfaceC6039M10841 = interfaceC60392;
                                    th4 = null;
                                    interfaceC6039M10841.mo8994(th4);
                                    return C6008.f15084;
                                }
                            }
                            if (charSequenceM8939 == null) {
                                if (j == -1) {
                                    if (!c8928.equals(C8928.f22715) && !c8928.equals(C8928.f22717) && !c8928.equals(C8928.f22716) && c4803M14253 != null && c4803M14253.f12560) {
                                    }
                                    z = false;
                                } else {
                                    if (j > 0) {
                                    }
                                    z = false;
                                }
                                boolean z2 = z && c8928.equals(C8928.f22715) && charSequence != null && c4803M14253 != null && c4803M14253.f12558;
                                if (!z || z2) {
                                    c50815 = new C5081(true);
                                } else {
                                    try {
                                        try {
                                            InterfaceC5084.f13114.getClass();
                                            c50815 = C5083.f13112;
                                        } catch (IOException unused7) {
                                            interfaceC60392 = interfaceC6039M10841;
                                            interfaceC6284 = (InterfaceC6284) r05.mo2990().get(C6285.f15450);
                                            if (interfaceC6284 != null) {
                                            }
                                            interfaceC60392.mo8994(th2);
                                            return C6008.f15084;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        interfaceC60394 = interfaceC6039M10841;
                                        th = th5;
                                        interfaceC60394.mo8994(th);
                                        throw th;
                                    }
                                }
                                InterfaceC5084 interfaceC50843 = c50815;
                                ?? M11049 = z2 ? AbstractC6231.m11049() : th5;
                                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                                C03682 c03682 = new C03682(interfaceC50843, c5081, this.$connection, M11049, this.$handler, c4798, null);
                                interfaceC5084 = interfaceC50843;
                                c50813 = c5081;
                                r4 = M11049;
                                AbstractC6231.m11037(r05, interfaceC5192, coroutineStart, c03682);
                                if (r4 == 0) {
                                    c = 6;
                                    c4803 = c4803M14253;
                                    r04 = r05;
                                    long j2 = j;
                                    InterfaceC6039 interfaceC60396 = interfaceC6039M10841;
                                    ?? r10 = r04;
                                    c89272 = c8927;
                                    if (z) {
                                    }
                                    if (!AbstractC4906.m9033(c89272, c4803)) {
                                    }
                                    th4 = null;
                                    interfaceC6039M10841.mo8994(th4);
                                    return C6008.f15084;
                                }
                                this.L$0 = r05;
                                this.L$1 = interfaceC6039M10841;
                                this.L$2 = interfaceC5192;
                                this.L$3 = c50813;
                                this.L$4 = charSequenceM8939;
                                this.L$5 = c8927;
                                this.L$6 = c4803M14253;
                                this.L$7 = interfaceC5084;
                                this.L$8 = null;
                                this.J$0 = j;
                                this.Z$0 = z;
                                c = 6;
                                this.label = 6;
                                objM11132 = r4.m11132(this);
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (objM11132 != coroutineSingletons) {
                                    c4803 = c4803M14253;
                                    r03 = r05;
                                    if (((Boolean) objM11132).booleanValue()) {
                                        r04 = r03;
                                        if (interfaceC5084 instanceof C5081) {
                                            ((C5081) interfaceC5084).m9257();
                                            r04 = r03;
                                        }
                                        long j22 = j;
                                        InterfaceC6039 interfaceC603962 = interfaceC6039M10841;
                                        ?? r102 = r04;
                                        c89272 = c8927;
                                        if (z) {
                                            interfaceC6039M10841 = interfaceC603962;
                                            r12 = r102;
                                        } else {
                                            try {
                                                if (interfaceC5084 instanceof InterfaceC5079) {
                                                    try {
                                                        C5081 c50819 = this.$connection.f12723;
                                                        this.L$0 = r102;
                                                        this.L$1 = interfaceC603962;
                                                        this.L$2 = interfaceC5192;
                                                        this.L$3 = c50813;
                                                        this.L$4 = c89272;
                                                        this.L$5 = c4803;
                                                        this.L$6 = interfaceC5084;
                                                        this.L$7 = null;
                                                        this.L$8 = null;
                                                        this.label = 8;
                                                        if (C9496.m14925(c89272, j22, charSequenceM8939, c4803, c50819, (InterfaceC5079) interfaceC5084, this) != coroutineSingletons) {
                                                            c89273 = c89272;
                                                            c48032 = c4803;
                                                            interfaceC60395 = interfaceC603962;
                                                            r6 = r102;
                                                            interfaceC50842 = interfaceC5084;
                                                            interfaceC51922 = interfaceC5192;
                                                            try {
                                                                interfaceC5192 = interfaceC51922;
                                                                r12 = r6;
                                                                c4803 = c48032;
                                                                c89272 = c89273;
                                                                interfaceC6039M10841 = interfaceC60395;
                                                            } catch (IOException unused8) {
                                                                interfaceC60392 = interfaceC60395;
                                                                r05 = r6;
                                                                interfaceC6284 = (InterfaceC6284) r05.mo2990().get(C6285.f15450);
                                                                if (interfaceC6284 != null) {
                                                                }
                                                                interfaceC60392.mo8994(th2);
                                                                return C6008.f15084;
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                interfaceC60394 = interfaceC60395;
                                                                th = null;
                                                                interfaceC60394.mo8994(th);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th11) {
                                                        th3 = th11;
                                                        interfaceC6039M10841 = interfaceC603962;
                                                        r3 = r102;
                                                        interfaceC50842 = interfaceC5084;
                                                        AbstractC5078.m9251((InterfaceC5079) interfaceC50842, new ChannelReadException("Failed to read request body", th3));
                                                        c6309M12640 = AbstractC7684.m12640(AbstractC4906.f12719);
                                                        this.L$0 = r3;
                                                        this.L$1 = interfaceC6039M10841;
                                                        this.L$2 = c50813;
                                                        this.L$3 = interfaceC50842;
                                                        this.L$4 = null;
                                                        this.L$5 = null;
                                                        this.L$6 = null;
                                                        this.L$7 = null;
                                                        this.L$8 = null;
                                                        this.label = 9;
                                                        if (AbstractC5078.m9246(c50813, c6309M12640, this) == coroutineSingletons) {
                                                            c50814 = c50813;
                                                            c50814.m9257();
                                                            AbstractC5076.m9225((InterfaceC5079) interfaceC50842);
                                                            th4 = null;
                                                            interfaceC6039M10841.mo8994(th4);
                                                            return C6008.f15084;
                                                        }
                                                    }
                                                }
                                                interfaceC6039M10841 = interfaceC603962;
                                                r12 = r102;
                                            } catch (IOException unused9) {
                                                interfaceC60392 = interfaceC603962;
                                                r05 = r102;
                                                interfaceC6284 = (InterfaceC6284) r05.mo2990().get(C6285.f15450);
                                                if (interfaceC6284 != null) {
                                                }
                                                interfaceC60392.mo8994(th2);
                                                return C6008.f15084;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                interfaceC60394 = interfaceC603962;
                                                th = null;
                                                interfaceC60394.mo8994(th);
                                                throw th;
                                            }
                                        }
                                        if (!AbstractC4906.m9033(c89272, c4803)) {
                                            interfaceC5192Plus = interfaceC5192;
                                            th5 = null;
                                            r13 = r12;
                                            C5081 c508162 = this.$connection.f12723;
                                            this.L$0 = r13;
                                            this.L$1 = interfaceC6039M10841;
                                            this.L$2 = interfaceC5192Plus;
                                            this.L$3 = th5;
                                            this.L$4 = th5;
                                            this.L$5 = th5;
                                            this.L$6 = th5;
                                            this.L$7 = th5;
                                            this.L$8 = th5;
                                            this.label = 1;
                                            objM8927 = AbstractC4805.m8927(c508162, this);
                                            r1 = r13;
                                            if (objM8927 == coroutineSingletons) {
                                            }
                                        }
                                        th4 = null;
                                        interfaceC6039M10841.mo8994(th4);
                                        return C6008.f15084;
                                    }
                                    interfaceC6039M10841.mo8994(null);
                                    C5081 c508110 = this.$connection.f12723;
                                    interfaceC5084.getClass();
                                    this.L$0 = r03;
                                    this.L$1 = interfaceC6039M10841;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.label = 7;
                                    if (AbstractC5076.m9224(c508110, (C5081) interfaceC5084, this) != coroutineSingletons) {
                                        interfaceC60392 = interfaceC6039M10841;
                                        interfaceC6039M10841 = interfaceC60392;
                                        th4 = null;
                                        interfaceC6039M10841.mo8994(th4);
                                        return C6008.f15084;
                                    }
                                }
                            } else {
                                C9496.m14936(charSequenceM8939);
                            }
                            z = true;
                            if (z) {
                            }
                            if (z) {
                            }
                            c50815 = new C5081(true);
                            InterfaceC5084 interfaceC508432 = c50815;
                            if (z2) {
                            }
                            CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
                            C03682 c036822 = new C03682(interfaceC508432, c5081, this.$connection, M11049, this.$handler, c4798, null);
                            interfaceC5084 = interfaceC508432;
                            c50813 = c5081;
                            r4 = M11049;
                            AbstractC6231.m11037(r05, interfaceC5192, coroutineStart2, c036822);
                            if (r4 == 0) {
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        c4798.f12561.m8896();
                        c4798.f12562.m8936();
                        throw th;
                    }
                }
                return coroutineSingletons;
            case 1:
                interfaceC5192Plus = (InterfaceC5192) this.L$2;
                interfaceC60392 = (InterfaceC6039) this.L$1;
                InterfaceC6233 interfaceC62333 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC6039M10841 = interfaceC60392;
                    r1 = interfaceC62333;
                    objM8927 = obj;
                    c4798 = (C4798) objM8927;
                    if (c4798 != null) {
                    }
                } catch (TooLongLineException unused10) {
                    r02 = interfaceC62333;
                    this.L$0 = r02;
                    this.L$1 = interfaceC60392;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 2;
                    Object objM90343 = AbstractC4906.m9034(interfaceC60392, this);
                    r05 = objM90343;
                    break;
                } catch (IOException e3) {
                    throw e3;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable unused11) {
                    r0 = interfaceC62333;
                    this.L$0 = r0;
                    this.L$1 = interfaceC60392;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 3;
                    Object objM903422 = AbstractC4906.m9034(interfaceC60392, this);
                    r05 = objM903422;
                    break;
                }
                break;
            case 2:
                interfaceC60392 = (InterfaceC6039) this.L$1;
                interfaceC6233 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                r05 = interfaceC6233;
                interfaceC6039M10841 = interfaceC60392;
                th4 = null;
                interfaceC6039M10841.mo8994(th4);
                return C6008.f15084;
            case 3:
                interfaceC60392 = (InterfaceC6039) this.L$1;
                interfaceC6233 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                r05 = interfaceC6233;
                interfaceC6039M10841 = interfaceC60392;
                th4 = null;
                interfaceC6039M10841.mo8994(th4);
                return C6008.f15084;
            case 4:
                C8927 c89274 = (C8927) this.L$8;
                charSequence = (CharSequence) this.L$6;
                CharSequence charSequence2 = (CharSequence) this.L$5;
                C5081 c508111 = (C5081) this.L$4;
                c4798 = (C4798) this.L$3;
                InterfaceC5192 interfaceC51923 = (InterfaceC5192) this.L$2;
                InterfaceC6039 interfaceC60397 = (InterfaceC6039) this.L$1;
                InterfaceC6233 interfaceC62334 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    charSequenceM8939 = charSequence2;
                    interfaceC6039M10841 = interfaceC60397;
                    c5081 = c508111;
                    interfaceC5192 = interfaceC51923;
                    c8927 = c89274;
                    r05 = interfaceC62334;
                    C4806 c480622 = c4798.f12562;
                    c8928 = c4798.f12549;
                    iM8940 = c480622.m8940(0);
                    C4803 c480332 = C4803.f12556;
                    c4803M14253 = AbstractC9019.m14253(c480622.m8939("Connection"));
                    if (iM8940 == -1) {
                    }
                    c8928.getClass();
                    if (charSequenceM8939 == null) {
                    }
                    z = true;
                    if (z) {
                    }
                    if (z) {
                    }
                    c50815 = new C5081(true);
                    InterfaceC5084 interfaceC5084322 = c50815;
                    if (z2) {
                    }
                    CoroutineStart coroutineStart22 = CoroutineStart.UNDISPATCHED;
                    C03682 c0368222 = new C03682(interfaceC5084322, c5081, this.$connection, M11049, this.$handler, c4798, null);
                    interfaceC5084 = interfaceC5084322;
                    c50813 = c5081;
                    r4 = M11049;
                    AbstractC6231.m11037(r05, interfaceC5192, coroutineStart22, c0368222);
                    if (r4 == 0) {
                    }
                } catch (Throwable th14) {
                    th = th14;
                    c4798.f12561.m8896();
                    c4798.f12562.m8936();
                    throw th;
                }
                break;
            case 5:
                c50812 = (C5081) this.L$2;
                interfaceC60392 = (InterfaceC6039) this.L$1;
                r2 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    r2 = r2;
                    c50812.m9257();
                    interfaceC6039M10841 = interfaceC60392;
                    th4 = null;
                    interfaceC6039M10841.mo8994(th4);
                } catch (IOException unused12) {
                    r05 = r2;
                    interfaceC6284 = (InterfaceC6284) r05.mo2990().get(C6285.f15450);
                    if (interfaceC6284 != null) {
                        th2 = null;
                        interfaceC6284.mo10815(null);
                    } else {
                        th2 = null;
                    }
                    interfaceC60392.mo8994(th2);
                }
                return C6008.f15084;
            case 6:
                boolean z3 = this.Z$0;
                long j3 = this.J$0;
                InterfaceC5084 interfaceC50844 = (InterfaceC5084) this.L$7;
                c4803 = (C4803) this.L$6;
                c8927 = (C8927) this.L$5;
                charSequenceM8939 = (CharSequence) this.L$4;
                c50813 = (C5081) this.L$3;
                interfaceC5192 = (InterfaceC5192) this.L$2;
                InterfaceC6039 interfaceC60398 = (InterfaceC6039) this.L$1;
                InterfaceC6233 interfaceC62335 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    c = 6;
                    j = j3;
                    interfaceC6039M10841 = interfaceC60398;
                    objM11132 = obj;
                    interfaceC5084 = interfaceC50844;
                    z = z3;
                    r03 = interfaceC62335;
                    if (((Boolean) objM11132).booleanValue()) {
                    }
                } catch (IOException unused13) {
                    interfaceC60392 = interfaceC60398;
                    r05 = interfaceC62335;
                    interfaceC6284 = (InterfaceC6284) r05.mo2990().get(C6285.f15450);
                    if (interfaceC6284 != null) {
                    }
                    interfaceC60392.mo8994(th2);
                    return C6008.f15084;
                } catch (Throwable th15) {
                    th = th15;
                    interfaceC60394 = interfaceC60398;
                    th = th5;
                    interfaceC60394.mo8994(th);
                    throw th;
                }
                break;
            case 7:
                interfaceC60392 = (InterfaceC6039) this.L$1;
                interfaceC6233 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                r05 = interfaceC6233;
                interfaceC6039M10841 = interfaceC60392;
                th4 = null;
                interfaceC6039M10841.mo8994(th4);
                return C6008.f15084;
            case 8:
                interfaceC50842 = (InterfaceC5084) this.L$6;
                c48032 = (C4803) this.L$5;
                c89273 = (C8927) this.L$4;
                C5081 c508112 = (C5081) this.L$3;
                interfaceC51922 = (InterfaceC5192) this.L$2;
                interfaceC60395 = (InterfaceC6039) this.L$1;
                InterfaceC6233 interfaceC62336 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    c = 6;
                    r6 = interfaceC62336;
                    interfaceC5192 = interfaceC51922;
                    r12 = r6;
                    c4803 = c48032;
                    c89272 = c89273;
                    interfaceC6039M10841 = interfaceC60395;
                    if (!AbstractC4906.m9033(c89272, c4803)) {
                    }
                } catch (Throwable th16) {
                    th3 = th16;
                    c50813 = c508112;
                    interfaceC6039M10841 = interfaceC60395;
                    r3 = interfaceC62336;
                    AbstractC5078.m9251((InterfaceC5079) interfaceC50842, new ChannelReadException("Failed to read request body", th3));
                    c6309M12640 = AbstractC7684.m12640(AbstractC4906.f12719);
                    this.L$0 = r3;
                    this.L$1 = interfaceC6039M10841;
                    this.L$2 = c50813;
                    this.L$3 = interfaceC50842;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 9;
                    if (AbstractC5078.m9246(c50813, c6309M12640, this) == coroutineSingletons) {
                    }
                }
                th4 = null;
                interfaceC6039M10841.mo8994(th4);
                return C6008.f15084;
            case 9:
                interfaceC50842 = (InterfaceC5084) this.L$3;
                c50814 = (C5081) this.L$2;
                interfaceC6039M10841 = (InterfaceC6039) this.L$1;
                AbstractC6017.m10769(obj);
                c50814.m9257();
                AbstractC5076.m9225((InterfaceC5079) interfaceC50842);
                th4 = null;
                interfaceC6039M10841.mo8994(th4);
                return C6008.f15084;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
