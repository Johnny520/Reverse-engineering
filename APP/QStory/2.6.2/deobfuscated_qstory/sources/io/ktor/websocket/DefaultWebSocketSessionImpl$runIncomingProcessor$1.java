package io.ktor.websocket;

import com.android.dx.io.Opcodes;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5199;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", l = {377, 183, 236, 189, 190, 192, Opcodes.REM_DOUBLE_2ADDR, Opcodes.OR_INT_LIT8, 236, 236, 236, 236}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5199 $ponger;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ C4260 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runIncomingProcessor$1(C4260 c4260, InterfaceC5199 interfaceC5199, InterfaceC4356<? super DefaultWebSocketSessionImpl$runIncomingProcessor$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4260;
        this.$ponger = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.this$0, this.$ponger, interfaceC4356);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0431, code lost:
    
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0243, code lost:
    
        if (io.ktor.websocket.AbstractC4256.m8724(r0, r4, r27) == r3) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0081: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:130), block:B:20:0x007f */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0305 A[Catch: all -> 0x0453, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0453, blocks: (B:93:0x02d5, B:103:0x0305, B:114:0x0357), top: B:195:0x02d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040b A[Catch: all -> 0x0442, TryCatch #1 {all -> 0x0442, blocks: (B:116:0x03a8, B:126:0x03bd, B:136:0x03fb, B:138:0x040b, B:147:0x0446, B:148:0x0452, B:129:0x03c6, B:130:0x03cb, B:131:0x03cc, B:132:0x03d3, B:133:0x03db, B:135:0x03ec), top: B:192:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0446 A[Catch: all -> 0x0442, TryCatch #1 {all -> 0x0442, blocks: (B:116:0x03a8, B:126:0x03bd, B:136:0x03fb, B:138:0x040b, B:147:0x0446, B:148:0x0452, B:129:0x03c6, B:130:0x03cb, B:131:0x03cc, B:132:0x03d3, B:133:0x03db, B:135:0x03ec), top: B:192:0x03a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:11:0x0047, B:45:0x019b, B:47:0x01a3, B:49:0x01b3, B:50:0x01cf, B:52:0x01d3, B:54:0x01db, B:56:0x01e7, B:57:0x01e9, B:60:0x0208, B:74:0x0256, B:76:0x025a, B:78:0x0260, B:84:0x028c, B:86:0x0290, B:89:0x02ab, B:33:0x011b), top: B:193:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0208 A[Catch: all -> 0x0051, PHI: r2 r4 r12 r15
  0x0208: PHI (r2v29 kotlin.飘花落叶言子楪兰苏哲世) = (r2v0 kotlin.飘花落叶言子楪兰苏哲世), (r2v30 kotlin.飘花落叶言子楪兰苏哲世), (r2v30 kotlin.飘花落叶言子楪兰苏哲世) binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r4v43 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r4v19 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v45 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v45 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r12v21 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) = 
  (r12v7 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r12v22 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r12v22 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
 binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE]
  0x0208: PHI (r15v27 kotlin.jvm.internal.Ref$BooleanRef) = 
  (r15v13 kotlin.jvm.internal.Ref$BooleanRef)
  (r15v28 kotlin.jvm.internal.Ref$BooleanRef)
  (r15v28 kotlin.jvm.internal.Ref$BooleanRef)
 binds: [B:33:0x011b, B:53:0x01d9, B:58:0x0204] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:11:0x0047, B:45:0x019b, B:47:0x01a3, B:49:0x01b3, B:50:0x01cf, B:52:0x01d3, B:54:0x01db, B:56:0x01e7, B:57:0x01e9, B:60:0x0208, B:74:0x0256, B:76:0x025a, B:78:0x0260, B:84:0x028c, B:86:0x0290, B:89:0x02ab, B:33:0x011b), top: B:193:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d9 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #9 {all -> 0x00b5, blocks: (B:95:0x02d9, B:97:0x02dd, B:98:0x02df, B:100:0x02e3, B:101:0x02ea, B:105:0x0309, B:107:0x0317, B:112:0x034a, B:113:0x0356, B:22:0x00a9), top: B:197:0x00a9 }] */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v47, types: [T, io.ktor.websocket.飘花落叶言子楪苏兰哲世, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r8v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02f8 -> B:144:0x043c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x042a -> B:142:0x042d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
