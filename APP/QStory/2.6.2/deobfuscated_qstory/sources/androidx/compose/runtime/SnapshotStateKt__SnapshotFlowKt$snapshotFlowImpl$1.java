package androidx.compose.runtime;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {476, 479, 484}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $block;
    final /* synthetic */ C1329 $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(C1329 c1329, InterfaceC6542 interfaceC6542, InterfaceC4356<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$externalManager = c1329;
        this.$block = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.$externalManager, this.$block, interfaceC4356);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5317 interfaceC5317, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1) create(interfaceC5317, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x0073, B:30:0x0090], limit reached: 46 */
    /* JADX WARN: Path cross not found for [B:30:0x0090, B:25:0x0073], limit reached: 46 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: all -> 0x0022, PHI: r1 r4 r6 r7
  0x0084: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r6v4 ??) = (r6v9 ??), (r6v10 ??) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r7v3 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲) = (r7v2 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲), (r7v7 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:15:0x0039, B:28:0x0084, B:25:0x0073, B:30:0x0090, B:8:0x001e), top: B:47:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:15:0x0039, B:28:0x0084, B:25:0x0073, B:30:0x0090, B:8:0x001e), top: B:47:0x0008 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.飘花落叶言子哲世楪兰苏] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.runtime.飘花落叶言子哲世楪兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.飘花落叶言子哲世楪兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:25:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:25:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L10
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
        L10:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r4 = (kotlinx.coroutines.channels.InterfaceC5206) r4
            java.lang.Object r6 = r9.L$1
            androidx.compose.runtime.飘花落叶言子哲世楪兰苏 r6 = (androidx.compose.runtime.C1329) r6
            java.lang.Object r7 = r9.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.flow.InterfaceC5317) r7
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L22
            goto L73
        L22:
            r10 = move-exception
            goto La6
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r5
        L2b:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r4 = (kotlinx.coroutines.channels.InterfaceC5206) r4
            java.lang.Object r6 = r9.L$1
            androidx.compose.runtime.飘花落叶言子哲世楪兰苏 r6 = (androidx.compose.runtime.C1329) r6
            java.lang.Object r7 = r9.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.flow.InterfaceC5317) r7
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L22
            goto L84
        L3d:
            kotlin.AbstractC5184.m10206(r10)
            java.lang.Object r10 = r9.L$0
            r7 = r10
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.flow.InterfaceC5317) r7
            androidx.compose.runtime.飘花落叶言子哲世楪兰苏 r10 = r9.$externalManager
            if (r10 != 0) goto L55
            androidx.compose.runtime.飘花落叶言子哲世楪兰苏 r10 = new androidx.compose.runtime.飘花落叶言子哲世楪兰苏
            r10.<init>()
            androidx.compose.runtime.飘花落叶言子哲世楪苏兰 r1 = new androidx.compose.runtime.飘花落叶言子哲世楪苏兰
            r1.<init>()
            r10.f3885 = r1
        L55:
            r6 = r10
            r10 = 6
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r10 = kotlinx.coroutines.channels.AbstractC5204.m10278(r4, r10, r5)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r1 = r9.$block     // Catch: java.lang.Throwable -> La3
            java.lang.Object r1 = r6.m2389(r10, r1)     // Catch: java.lang.Throwable -> La3
            r9.L$0 = r7     // Catch: java.lang.Throwable -> La3
            r9.L$1 = r6     // Catch: java.lang.Throwable -> La3
            r9.L$2 = r10     // Catch: java.lang.Throwable -> La3
            r9.L$3 = r1     // Catch: java.lang.Throwable -> La3
            r9.label = r4     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r7.emit(r1, r9)     // Catch: java.lang.Throwable -> La3
            if (r4 != r0) goto L72
            goto La0
        L72:
            r4 = r10
        L73:
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L22
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L22
            r9.L$2 = r4     // Catch: java.lang.Throwable -> L22
            r9.L$3 = r1     // Catch: java.lang.Throwable -> L22
            r9.label = r3     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = r4.mo10240(r9)     // Catch: java.lang.Throwable -> L22
            if (r10 != r0) goto L84
            goto La0
        L84:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r10 = r9.$block     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = r6.m2389(r4, r10)     // Catch: java.lang.Throwable -> L22
            boolean r8 = kotlin.jvm.internal.AbstractC4394.m8917(r10, r1)     // Catch: java.lang.Throwable -> L22
            if (r8 != 0) goto L73
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L22
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L22
            r9.L$2 = r4     // Catch: java.lang.Throwable -> L22
            r9.L$3 = r10     // Catch: java.lang.Throwable -> L22
            r9.label = r2     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r7.emit(r10, r9)     // Catch: java.lang.Throwable -> L22
            if (r1 != r0) goto La1
        La0:
            return r0
        La1:
            r1 = r10
            goto L73
        La3:
            r0 = move-exception
            r4 = r10
            r10 = r0
        La6:
            androidx.compose.runtime.飘花落叶言子哲世苏楪兰 r0 = r6.f3885
            if (r0 == 0) goto Lad
            r0.mo2390(r4)
        Lad:
            androidx.compose.runtime.飘花落叶言子哲世楪兰苏 r9 = r9.$externalManager
            if (r9 != 0) goto Lc0
            androidx.compose.runtime.飘花落叶言子哲世苏楪兰 r9 = r6.f3885
            if (r9 == 0) goto Lb6
            goto Lbb
        Lb6:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            androidx.compose.runtime.AbstractC1392.m2527(r0)
        Lbb:
            r9.mo2393()
            r6.f3885 = r5
        Lc0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
