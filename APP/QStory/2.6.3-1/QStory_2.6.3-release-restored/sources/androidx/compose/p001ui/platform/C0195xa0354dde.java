package androidx.compose.p001ui.platform;

import androidx.collection.C1094;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.semantics.C2785;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2793;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p171.C8436;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class C0195xa0354dde extends Lambda implements InterfaceC7372 {
    final /* synthetic */ C2711 $scrollObservationScope;
    final /* synthetic */ ViewOnAttachStateChangeListenerC2720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195xa0354dde(C2711 c2711, ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720) {
        super(0);
        this.$scrollObservationScope = c2711;
        this.this$0 = viewOnAttachStateChangeListenerC2720;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3995invoke() {
        C2788 c2788;
        C2583 c2583;
        C2711 c2711 = this.$scrollObservationScope;
        C2793 c2793 = c2711.f5725;
        C2793 c27932 = c2711.f5727;
        Float f = c2711.f5729;
        Float f2 = c2711.f5726;
        float fFloatValue = (c2793 == null || f == null) ? 0.0f : ((Number) c2793.f6127.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (c27932 == null || f2 == null) ? 0.0f : ((Number) c27932.f6127.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.this$0;
            int i = this.$scrollObservationScope.f5730;
            C1094 c1094 = ViewOnAttachStateChangeListenerC2720.f5851;
            int iM4130 = viewOnAttachStateChangeListenerC2720.m4130(i);
            C2785 c2785 = (C2785) this.this$0.m4137().m1393(this.this$0.f5868);
            if (c2785 != null) {
                ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC27202 = this.this$0;
                try {
                    C8436 c8436 = viewOnAttachStateChangeListenerC27202.f5866;
                    if (c8436 != null) {
                        c8436.m13401(viewOnAttachStateChangeListenerC27202.m4147(c2785));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            C2785 c27852 = (C2785) this.this$0.m4137().m1393(this.this$0.f5867);
            if (c27852 != null) {
                ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC27203 = this.this$0;
                try {
                    C8436 c84362 = viewOnAttachStateChangeListenerC27203.f5865;
                    if (c84362 != null) {
                        c84362.m13401(viewOnAttachStateChangeListenerC27203.m4147(c27852));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            this.this$0.f5877.invalidate();
            C2785 c27853 = (C2785) this.this$0.m4137().m1393(iM4130);
            if (c27853 != null && (c2788 = c27853.f6106) != null && (c2583 = c2788.f6115) != null) {
                ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC27204 = this.this$0;
                if (c2793 != null) {
                    viewOnAttachStateChangeListenerC27204.f5875.m1350(iM4130, c2793);
                }
                if (c27932 != null) {
                    viewOnAttachStateChangeListenerC27204.f5874.m1350(iM4130, c27932);
                }
                viewOnAttachStateChangeListenerC27204.m4138(c2583);
            }
        }
        if (c2793 != null) {
            this.$scrollObservationScope.f5729 = (Float) c2793.f6127.invoke();
        }
        if (c27932 != null) {
            this.$scrollObservationScope.f5726 = (Float) c27932.f6127.invoke();
        }
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m3995invoke();
        return C6008.f15084;
    }
}
