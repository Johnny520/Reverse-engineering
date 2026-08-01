package androidx.compose.ui.platform;

import androidx.collection.C0247;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1958;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p155.C7607;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ C1876 $scrollObservationScope;
    final /* synthetic */ ViewOnAttachStateChangeListenerC1885 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(C1876 c1876, ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885) {
        super(0);
        this.$scrollObservationScope = c1876;
        this.this$0 = viewOnAttachStateChangeListenerC1885;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3435invoke() {
        C1953 c1953;
        C1748 c1748;
        C1876 c1876 = this.$scrollObservationScope;
        C1958 c1958 = c1876.f5380;
        C1958 c19582 = c1876.f5382;
        Float f = c1876.f5384;
        Float f2 = c1876.f5381;
        float fFloatValue = (c1958 == null || f == null) ? 0.0f : ((Number) c1958.f5782.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (c19582 == null || f2 == null) ? 0.0f : ((Number) c19582.f5782.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.this$0;
            int i = this.$scrollObservationScope.f5385;
            C0247 c0247 = ViewOnAttachStateChangeListenerC1885.f5506;
            int iM3570 = viewOnAttachStateChangeListenerC1885.m3570(i);
            C1950 c1950 = (C1950) this.this$0.m3577().m833(this.this$0.f5523);
            if (c1950 != null) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC18852 = this.this$0;
                try {
                    C7607 c7607 = viewOnAttachStateChangeListenerC18852.f5521;
                    if (c7607 != null) {
                        c7607.m12842(viewOnAttachStateChangeListenerC18852.m3587(c1950));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            C1950 c19502 = (C1950) this.this$0.m3577().m833(this.this$0.f5522);
            if (c19502 != null) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC18853 = this.this$0;
                try {
                    C7607 c76072 = viewOnAttachStateChangeListenerC18853.f5520;
                    if (c76072 != null) {
                        c76072.m12842(viewOnAttachStateChangeListenerC18853.m3587(c19502));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            this.this$0.f5532.invalidate();
            C1950 c19503 = (C1950) this.this$0.m3577().m833(iM3570);
            if (c19503 != null && (c1953 = c19503.f5761) != null && (c1748 = c1953.f5770) != null) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC18854 = this.this$0;
                if (c1958 != null) {
                    viewOnAttachStateChangeListenerC18854.f5530.m790(iM3570, c1958);
                }
                if (c19582 != null) {
                    viewOnAttachStateChangeListenerC18854.f5529.m790(iM3570, c19582);
                }
                viewOnAttachStateChangeListenerC18854.m3578(c1748);
            }
        }
        if (c1958 != null) {
            this.$scrollObservationScope.f5384 = (Float) c1958.f5782.invoke();
        }
        if (c19582 != null) {
            this.$scrollObservationScope.f5381 = (Float) c19582.f5782.invoke();
        }
    }

    @Override // p052.InterfaceC6543
    public /* bridge */ /* synthetic */ Object invoke() {
        m3435invoke();
        return C5176.f14739;
    }
}
