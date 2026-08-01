package androidx.compose.foundation.gestures;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1", m556f = "NonTouchScrollingLogic.kt", m557l = {89}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class NonTouchScrollingLogicKt$untilNull$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$untilNull$1(InterfaceC7372 interfaceC7372, InterfaceC5189<? super NonTouchScrollingLogicKt$untilNull$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$builderAction = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        NonTouchScrollingLogicKt$untilNull$1 nonTouchScrollingLogicKt$untilNull$1 = new NonTouchScrollingLogicKt$untilNull$1(this.$builderAction, interfaceC5189);
        nonTouchScrollingLogicKt$untilNull$1.L$0 = obj;
        return nonTouchScrollingLogicKt$untilNull$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((NonTouchScrollingLogicKt$untilNull$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
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
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r4 = (kotlin.sequences.AbstractC5957) r4
            kotlin.AbstractC6017.m10769(r6)
            goto L38
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C6755.m11870(r5)
            return r2
        L1a:
            kotlin.AbstractC6017.m10769(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r6 = (kotlin.sequences.AbstractC5957) r6
            r4 = r6
        L22:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r6 = r5.$builderAction
            java.lang.Object r1 = r6.invoke()
            if (r1 == 0) goto L37
            r5.L$0 = r4
            r5.L$1 = r1
            r5.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r4.mo10680(r1, r5)
            if (r6 != r0) goto L38
            return r0
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L22
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C6008.f15084
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
