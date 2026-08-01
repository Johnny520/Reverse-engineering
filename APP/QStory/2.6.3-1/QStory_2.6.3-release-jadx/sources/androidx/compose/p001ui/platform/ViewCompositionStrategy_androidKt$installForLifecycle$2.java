package androidx.compose.p001ui.platform;

import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.InterfaceC3213;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ AbstractC3235 $lifecycle;
    final /* synthetic */ InterfaceC3213 $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(AbstractC3235 abstractC3235, InterfaceC3213 interfaceC3213) {
        super(0);
        this.$lifecycle = abstractC3235;
        this.$observer = interfaceC3213;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4005invoke() {
        this.$lifecycle.mo5062(this.$observer);
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m4005invoke();
        return C6008.f15084;
    }
}
