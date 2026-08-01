package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m556f = "ForEachGesture.kt", m557l = {102, 105, 110}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ InterfaceC5192 $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383, InterfaceC5189<? super ForEachGestureKt$awaitEachGesture$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$currentContext = interfaceC5192;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, interfaceC5189);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r8;
        ?? r1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r12 = this.label;
        try {
        } catch (CancellationException e) {
            e = e;
            if (AbstractC6231.m11053(this.$currentContext)) {
            }
        }
        if (r12 == 0) {
            AbstractC6017.m10769(obj);
            r8 = (InterfaceC2468) this.L$0;
            if (AbstractC6231.m11053(this.$currentContext)) {
            }
        } else {
            if (r12 != 1) {
                if (r12 == 2) {
                    InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
                    AbstractC6017.m10769(obj);
                    r1 = interfaceC2468;
                } else {
                    if (r12 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
                    AbstractC6017.m10769(obj);
                    r1 = interfaceC24682;
                }
                r8 = r1;
                if (AbstractC6231.m11053(this.$currentContext)) {
                    return C6008.f15084;
                }
                try {
                } catch (CancellationException e2) {
                    r12 = r8;
                    e = e2;
                    if (AbstractC6231.m11053(this.$currentContext)) {
                        throw e;
                    }
                    this.L$0 = r12;
                    this.label = 3;
                    Object objM1874 = AbstractC1362.m1874(r12, PointerEventPass.Final, this);
                    r1 = r12;
                }
                ?? r13 = this.$block;
                this.L$0 = r8;
                this.label = 1;
                if (r13.invoke(r8, this) != coroutineSingletons) {
                    r12 = r8;
                    this.L$0 = r12;
                    this.label = 2;
                    Object objM18742 = AbstractC1362.m1874(r12, PointerEventPass.Final, this);
                    r1 = r12;
                }
                return coroutineSingletons;
            }
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            r12 = interfaceC24683;
            this.L$0 = r12;
            this.label = 2;
            Object objM187422 = AbstractC1362.m1874(r12, PointerEventPass.Final, this);
            r1 = r12;
        }
    }
}
