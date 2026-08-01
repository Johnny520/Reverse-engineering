package androidx.compose.runtime;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", m556f = "SnapshotFlow.kt", m557l = {476, 479, 484}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $block;
    final /* synthetic */ C2164 $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(C2164 c2164, InterfaceC7372 interfaceC7372, InterfaceC5189<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$externalManager = c2164;
        this.$block = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.$externalManager, this.$block, interfaceC5189);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
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
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r6;
        InterfaceC6150 interfaceC6150;
        Object objM2959;
        ?? r4;
        ?? r62;
        Object objM29592;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r42 = 1;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC6150 = (InterfaceC6150) this.L$0;
                C2164 c2164 = this.$externalManager;
                if (c2164 == null) {
                    c2164 = new C2164();
                    c2164.f4231 = new C2165();
                }
                r6 = c2164;
                C6022 c6022M10841 = AbstractC6037.m10841(1, 6, null);
                try {
                    objM2959 = r6.m2959(c6022M10841, this.$block);
                    this.L$0 = interfaceC6150;
                    this.L$1 = r6;
                    this.L$2 = c6022M10841;
                    this.L$3 = objM2959;
                    this.label = 1;
                    if (interfaceC6150.emit(objM2959, this) != coroutineSingletons) {
                        r4 = c6022M10841;
                        r62 = r6;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    r42 = c6022M10841;
                    th = th;
                    ?? r0 = r6.f4231;
                    if (r0 != 0) {
                        r0.mo2960(r42);
                    }
                    if (this.$externalManager == null) {
                        AbstractC2167 abstractC2167 = r6.f4231;
                        if (abstractC2167 == null) {
                            AbstractC2227.m3097("Called dispose on a manager that has been disposed of");
                        }
                        abstractC2167.mo2963();
                        r6.f4231 = null;
                    }
                    throw th;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    objM2959 = this.L$3;
                    InterfaceC6039 interfaceC6039 = (InterfaceC6039) this.L$2;
                    C2164 c21642 = (C2164) this.L$1;
                    interfaceC6150 = (InterfaceC6150) this.L$0;
                    AbstractC6017.m10769(obj);
                    r42 = interfaceC6039;
                    r6 = c21642;
                    objM29592 = r6.m2959(r42, this.$block);
                    r4 = r42;
                    r62 = r6;
                    if (!AbstractC5227.m9466(objM29592, objM2959)) {
                        this.L$0 = interfaceC6150;
                        this.L$1 = r6;
                        this.L$2 = r42;
                        this.L$3 = objM29592;
                        this.label = 3;
                        if (interfaceC6150.emit(objM29592, this) != coroutineSingletons) {
                            objM2959 = objM29592;
                            r4 = r42;
                            r62 = r6;
                        }
                        return coroutineSingletons;
                    }
                } else if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            objM2959 = this.L$3;
            InterfaceC6039 interfaceC60392 = (InterfaceC6039) this.L$2;
            C2164 c21643 = (C2164) this.L$1;
            interfaceC6150 = (InterfaceC6150) this.L$0;
            AbstractC6017.m10769(obj);
            r4 = interfaceC60392;
            r62 = c21643;
            this.L$0 = interfaceC6150;
            this.L$1 = r62;
            this.L$2 = r4;
            this.L$3 = objM2959;
            this.label = 2;
            Object objMo10803 = r4.mo10803(this);
            r42 = r4;
            r6 = r62;
            if (objMo10803 == coroutineSingletons) {
                objM29592 = r6.m2959(r42, this.$block);
                r4 = r42;
                r62 = r6;
                if (!AbstractC5227.m9466(objM29592, objM2959)) {
                }
                this.L$0 = interfaceC6150;
                this.L$1 = r62;
                this.L$2 = r4;
                this.L$3 = objM2959;
                this.label = 2;
                Object objMo108032 = r4.mo10803(this);
                r42 = r4;
                r6 = r62;
                if (objMo108032 == coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
