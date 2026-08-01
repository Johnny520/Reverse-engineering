package androidx.compose.ui.platform;

import androidx.collection.C0247;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1958;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p155.C7606;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ C1876 $scrollObservationScope;
    final /* synthetic */ ViewOnAttachStateChangeListenerC1885 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(C1876 c1876, ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885) {
        super(0);
        this.$scrollObservationScope = c1876;
        this.this$0 = viewOnAttachStateChangeListenerC1885;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3425invoke() {
        C1953 c1953;
        C1748 c1748;
        C1876 c1876 = this.$scrollObservationScope;
        C1958 c1958 = c1876.f5379;
        C1958 c19582 = c1876.f5381;
        Float f = c1876.f5383;
        Float f2 = c1876.f5380;
        float fFloatValue = (c1958 == null || f == null) ? 0.0f : ((Number) c1958.f5781.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (c19582 == null || f2 == null) ? 0.0f : ((Number) c19582.f5781.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.this$0;
            int i = this.$scrollObservationScope.f5384;
            C0247 c0247 = ViewOnAttachStateChangeListenerC1885.f5505;
            int iM3560 = viewOnAttachStateChangeListenerC1885.m3560(i);
            C1950 c1950 = (C1950) this.this$0.m3567().m832(this.this$0.f5522);
            if (c1950 != null) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC18852 = this.this$0;
                try {
                    C7606 c7606 = viewOnAttachStateChangeListenerC18852.f5520;
                    if (c7606 != null) {
                        c7606.m12813(viewOnAttachStateChangeListenerC18852.m3577(c1950));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            C1950 c19502 = (C1950) this.this$0.m3567().m832(this.this$0.f5521);
            if (c19502 != null) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC18853 = this.this$0;
                try {
                    C7606 c76062 = viewOnAttachStateChangeListenerC18853.f5519;
                    if (c76062 != null) {
                        c76062.m12813(viewOnAttachStateChangeListenerC18853.m3577(c19502));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            this.this$0.f5531.invalidate();
            C1950 c19503 = (C1950) this.this$0.m3567().m832(iM3560);
            if (c19503 != null && (c1953 = c19503.f5760) != null && (c1748 = c1953.f5769) != null) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC18854 = this.this$0;
                if (c1958 != null) {
                    viewOnAttachStateChangeListenerC18854.f5529.m789(iM3560, c1958);
                }
                if (c19582 != null) {
                    viewOnAttachStateChangeListenerC18854.f5528.m789(iM3560, c19582);
                }
                viewOnAttachStateChangeListenerC18854.m3568(c1748);
            }
        }
        if (c1958 != null) {
            this.$scrollObservationScope.f5383 = (Float) c1958.f5781.invoke();
        }
        if (c19582 != null) {
            this.$scrollObservationScope.f5380 = (Float) c19582.f5781.invoke();
        }
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m3425invoke();
        return C5175.f14739;
    }
}
