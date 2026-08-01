package androidx.compose.foundation.gestures;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p205.C7902;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1 extends AdaptedFunctionReference implements InterfaceC6554 {
    public ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(Object obj) {
        super(2, obj, C0517.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1206invokesFctU(((C7902) obj).f21871, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1206invokesFctU(long j, InterfaceC4357<? super C5176> interfaceC4357) {
        C0517 c0517 = (C0517) this.receiver;
        AbstractC5399.m10477(c0517.f1526.m2991(), null, null, new ScrollableNode$onWheelScrollStopped$1(c0517, j, null), 3);
        return C5176.f14739;
    }
}
