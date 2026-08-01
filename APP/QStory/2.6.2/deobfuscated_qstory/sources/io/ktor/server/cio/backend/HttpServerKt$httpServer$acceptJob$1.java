package io.ktor.server.cio.backend;

import io.ktor.network.selector.InterfaceC4005;
import io.ktor.network.sockets.C4015;
import io.ktor.network.sockets.InterfaceC4021;
import io.ktor.server.cio.C4085;
import java.io.IOException;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p400.InterfaceC9156;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.backend.HttpServerKt$httpServer$acceptJob$1", f = "HttpServer.kt", l = {47, 65, 91, 91}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class HttpServerKt$httpServer$acceptJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6550 $handler;
    final /* synthetic */ InterfaceC9156 $logger;
    final /* synthetic */ InterfaceC4005 $selector;
    final /* synthetic */ InterfaceC5451 $serverJob;
    final /* synthetic */ C4085 $settings;
    final /* synthetic */ InterfaceC5440 $socket;
    final /* synthetic */ long $timeout;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpServerKt$httpServer$acceptJob$1(InterfaceC4005 interfaceC4005, C4085 c4085, InterfaceC5440 interfaceC5440, InterfaceC9156 interfaceC9156, InterfaceC5451 interfaceC5451, long j, InterfaceC6550 interfaceC6550, InterfaceC4356<? super HttpServerKt$httpServer$acceptJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$selector = interfaceC4005;
        this.$settings = c4085;
        this.$socket = interfaceC5440;
        this.$logger = interfaceC9156;
        this.$serverJob = interfaceC5451;
        this.$timeout = j;
        this.$handler = interfaceC6550;
    }

    private static final C5175 invokeSuspend$lambda$0(C4085 c4085, C4015 c4015) {
        c4085.getClass();
        c4015.getClass();
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$2$lambda$1(InterfaceC4021 interfaceC4021, Throwable th) throws IOException {
        interfaceC4021.close();
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        HttpServerKt$httpServer$acceptJob$1 httpServerKt$httpServer$acceptJob$1 = new HttpServerKt$httpServer$acceptJob$1(this.$selector, this.$settings, this.$socket, this.$logger, this.$serverJob, this.$timeout, this.$handler, interfaceC4356);
        httpServerKt$httpServer$acceptJob$1.L$0 = obj;
        return httpServerKt$httpServer$acceptJob$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((HttpServerKt$httpServer$acceptJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:(1:(1:(1:(1:(5:8|9|114|(1:116)|117)(2:14|15))(7:16|17|95|(1:97)|(1:99)|100|101))(16:19|137|20|21|22|153|54|55|133|56|57|135|58|(1:60)(1:62)|63|(6:65|66|151|67|(1:69)(1:70)|(23:72|73|144|74|139|46|146|47|130|48|(1:51)(1:50)|22|153|54|55|133|56|57|135|58|(0)(0)|63|(2:85|86)(0))(2:80|81))(0)))(1:27))(5:28|132|29|30|(1:32)(1:35))|147|39|(1:41)|44|45|139|46|146|47|130|48|(0)(0)|22|153|54|55|133|56|57|135|58|(0)(0)|63|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:0|2|143|(1:(1:(1:(1:(5:8|9|114|(1:116)|117)(2:14|15))(7:16|17|95|(1:97)|(1:99)|100|101))(16:19|137|20|21|22|153|54|55|133|56|57|135|58|(1:60)(1:62)|63|(6:65|66|151|67|(1:69)(1:70)|(23:72|73|144|74|139|46|146|47|130|48|(1:51)(1:50)|22|153|54|55|133|56|57|135|58|(0)(0)|63|(2:85|86)(0))(2:80|81))(0)))(1:27))(5:28|132|29|30|(1:32)(1:35))|38|147|39|(1:41)|44|45|139|46|146|47|130|48|(0)(0)|22|153|54|55|133|56|57|135|58|(0)(0)|63|(0)(0)|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02af A[Catch: all -> 0x0029, TryCatch #7 {all -> 0x0029, blocks: (B:9:0x0024, B:114:0x02a3, B:116:0x02af, B:117:0x02b3, B:17:0x003c, B:95:0x0242, B:97:0x024e), top: B:143:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e A[Catch: all -> 0x006e, IOException -> 0x027a, TryCatch #0 {IOException -> 0x027a, blocks: (B:48:0x0156, B:50:0x015e, B:51:0x0163), top: B:130:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163 A[Catch: all -> 0x006e, IOException -> 0x027a, TRY_LEAVE, TryCatch #0 {IOException -> 0x027a, blocks: (B:48:0x0156, B:50:0x015e, B:51:0x0163), top: B:130:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0197 A[Catch: all -> 0x0203, ClosedChannelException -> 0x0207, TRY_LEAVE, TryCatch #2 {all -> 0x0203, blocks: (B:56:0x016e, B:58:0x0193, B:60:0x0197, B:65:0x01a0), top: B:133:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0 A[Catch: all -> 0x0203, ClosedChannelException -> 0x0207, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0203, blocks: (B:56:0x016e, B:58:0x0193, B:60:0x0197, B:65:0x01a0), top: B:133:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a A[Catch: all -> 0x01ed, ClosedChannelException -> 0x0215, TryCatch #8 {all -> 0x01ed, blocks: (B:74:0x01ce, B:88:0x0215, B:90:0x0221, B:80:0x01fa, B:81:0x0202, B:85:0x020a, B:86:0x0211), top: B:144:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0221 A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #8 {all -> 0x01ed, blocks: (B:74:0x01ce, B:88:0x0215, B:90:0x0221, B:80:0x01fa, B:81:0x0202, B:85:0x020a, B:86:0x0211), top: B:144:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024e A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #7 {all -> 0x0029, blocks: (B:9:0x0024, B:114:0x02a3, B:116:0x02af, B:117:0x02b3, B:17:0x003c, B:95:0x0242, B:97:0x024e), top: B:143:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0254  */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v2, types: [io.ktor.network.sockets.飘花落叶言子楪哲苏兰世] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x02bb -> B:139:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 java.lang.Object, still in use, count: 2, list:
          (r4v9 java.lang.Object) from 0x0167: IF  (r4v9 java.lang.Object) == (r2v0 kotlin.coroutines.intrinsics.CoroutineSingletons)  -> B:112:0x02a0 A[HIDDEN] (LINE:360)
          (r4v9 java.lang.Object) from 0x0060: PHI (r4v10 java.lang.Object) = (r4v8 java.lang.Object), (r4v9 java.lang.Object), (r4v15 java.lang.Object) binds: [B:155:0x0060, B:52:0x0167, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:126)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1120)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.backend.HttpServerKt$httpServer$acceptJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
