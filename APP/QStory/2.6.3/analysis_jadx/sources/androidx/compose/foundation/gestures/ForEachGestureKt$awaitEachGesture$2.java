package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $block;
    final /* synthetic */ InterfaceC4360 $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554, InterfaceC4357<? super ForEachGestureKt$awaitEachGesture$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$currentContext = interfaceC4360;
        this.$block = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, interfaceC4357);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L29
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L17
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r8)
            goto L25
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L1e:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r8)     // Catch: java.util.concurrent.CancellationException -> L27
        L25:
            r8 = r1
            goto L38
        L27:
            r8 = move-exception
            goto L5f
        L29:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r8)     // Catch: java.util.concurrent.CancellationException -> L27
            goto L4e
        L31:
            kotlin.AbstractC5185.m10210(r8)
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r8 = (androidx.compose.ui.input.pointer.InterfaceC1633) r8
        L38:
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r7.$currentContext
            boolean r1 = kotlinx.coroutines.AbstractC5399.m10494(r1)
            if (r1 == 0) goto L75
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r1 = r7.$block     // Catch: java.util.concurrent.CancellationException -> L5b
            r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L5b
            r7.label = r4     // Catch: java.util.concurrent.CancellationException -> L5b
            java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5b
            if (r1 != r0) goto L4d
            goto L73
        L4d:
            r1 = r8
        L4e:
            r7.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L27
            r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L27
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final     // Catch: java.util.concurrent.CancellationException -> L27
            java.lang.Object r8 = androidx.compose.foundation.gestures.AbstractC0521.m1314(r1, r8, r7)     // Catch: java.util.concurrent.CancellationException -> L27
            if (r8 != r0) goto L25
            goto L73
        L5b:
            r1 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
        L5f:
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r7.$currentContext
            boolean r5 = kotlinx.coroutines.AbstractC5399.m10494(r5)
            if (r5 == 0) goto L74
            r7.L$0 = r1
            r7.label = r2
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            java.lang.Object r8 = androidx.compose.foundation.gestures.AbstractC0521.m1314(r1, r8, r7)
            if (r8 != r0) goto L25
        L73:
            return r0
        L74:
            throw r8
        L75:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
