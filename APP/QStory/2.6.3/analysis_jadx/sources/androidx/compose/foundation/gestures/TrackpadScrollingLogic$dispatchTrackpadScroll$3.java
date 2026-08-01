package androidx.compose.foundation.gestures;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", f = "TrackpadScrollingLogic.kt", l = {178}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class TrackpadScrollingLogic$dispatchTrackpadScroll$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Ref$ObjectRef<C0505> $targetScrollDelta;
    final /* synthetic */ C0502 $this_dispatchTrackpadScroll;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C0504 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$dispatchTrackpadScroll$3(C0504 c0504, C0502 c0502, Ref$ObjectRef<C0505> ref$ObjectRef, InterfaceC4357<? super TrackpadScrollingLogic$dispatchTrackpadScroll$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0504;
        this.$this_dispatchTrackpadScroll = c0502;
        this.$targetScrollDelta = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TrackpadScrollingLogic$dispatchTrackpadScroll$3 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(this.this$0, this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, interfaceC4357);
        trackpadScrollingLogic$dispatchTrackpadScroll$3.L$0 = obj;
        return trackpadScrollingLogic$dispatchTrackpadScroll$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TrackpadScrollingLogic$dispatchTrackpadScroll$3) create(interfaceC0557, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, androidx.compose.foundation.gestures.飘花落叶言子哲兰苏楪世] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0071 -> B:14:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
