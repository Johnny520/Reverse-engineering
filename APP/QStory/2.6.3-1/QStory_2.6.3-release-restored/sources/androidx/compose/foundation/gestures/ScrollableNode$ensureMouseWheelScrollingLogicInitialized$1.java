package androidx.compose.foundation.gestures;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p221.C8731;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1 extends AdaptedFunctionReference implements InterfaceC7383 {
    public ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(Object obj) {
        super(2, obj, C1358.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1766invokesFctU(((C8731) obj).f22216, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m1766invokesFctU(long j, InterfaceC5189<? super C6008> interfaceC5189) {
        C1358 c1358 = (C1358) this.receiver;
        AbstractC6231.m11036(c1358.f1871.m3551(), null, null, new ScrollableNode$onWheelScrollStopped$1(c1358, j, null), 3);
        return C6008.f15084;
    }
}
