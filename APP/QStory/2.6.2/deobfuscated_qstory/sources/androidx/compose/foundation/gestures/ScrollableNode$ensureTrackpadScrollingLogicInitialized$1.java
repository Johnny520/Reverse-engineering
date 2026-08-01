package androidx.compose.foundation.gestures;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p205.C7901;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScrollableNode$ensureTrackpadScrollingLogicInitialized$1 extends AdaptedFunctionReference implements InterfaceC6553 {
    public ScrollableNode$ensureTrackpadScrollingLogicInitialized$1(Object obj) {
        super(2, obj, C0517.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1197invokesFctU(((C7901) obj).f21874, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1197invokesFctU(long j, InterfaceC4356<? super C5175> interfaceC4356) {
        C0517 c0517 = (C0517) this.receiver;
        AbstractC5398.m10473(c0517.f1525.m2981(), null, null, new ScrollableNode$onTrackpadScrollStopped$1(c0517, j, null), 3);
        return C5175.f14739;
    }
}
