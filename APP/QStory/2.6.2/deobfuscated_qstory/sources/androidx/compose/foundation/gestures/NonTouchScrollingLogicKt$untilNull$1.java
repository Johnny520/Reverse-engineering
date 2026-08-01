package androidx.compose.foundation.gestures;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5124;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1", f = "NonTouchScrollingLogic.kt", l = {89}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
final class NonTouchScrollingLogicKt$untilNull$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$untilNull$1(InterfaceC6542 interfaceC6542, InterfaceC4356<? super NonTouchScrollingLogicKt$untilNull$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$builderAction = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        NonTouchScrollingLogicKt$untilNull$1 nonTouchScrollingLogicKt$untilNull$1 = new NonTouchScrollingLogicKt$untilNull$1(this.$builderAction, interfaceC4356);
        nonTouchScrollingLogicKt$untilNull$1.L$0 = obj;
        return nonTouchScrollingLogicKt$untilNull$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NonTouchScrollingLogicKt$untilNull$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            java.lang.Object r1 = r5.L$1
            java.lang.Object r4 = r5.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r4 = (kotlin.sequences.AbstractC5124) r4
            kotlin.AbstractC5184.m10206(r6)
            goto L38
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r2
        L1a:
            kotlin.AbstractC5184.m10206(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r6 = (kotlin.sequences.AbstractC5124) r6
            r4 = r6
        L22:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r6 = r5.$builderAction
            java.lang.Object r1 = r6.invoke()
            if (r1 == 0) goto L37
            r5.L$0 = r4
            r5.L$1 = r1
            r5.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r4.mo10117(r1, r5)
            if (r6 != r0) goto L38
            return r0
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L22
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
