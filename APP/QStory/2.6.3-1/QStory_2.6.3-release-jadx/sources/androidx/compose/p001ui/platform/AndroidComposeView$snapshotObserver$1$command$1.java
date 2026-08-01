package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.node.InterfaceC2633;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
public final class AndroidComposeView$snapshotObserver$1$command$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ InterfaceC7372 $command;
    final /* synthetic */ InterfaceC2633 $exceptionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1$command$1(InterfaceC7372 interfaceC7372, InterfaceC2633 interfaceC2633) {
        super(0);
        this.$command = interfaceC7372;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3994invoke() {
        try {
            this.$command.invoke();
        } catch (Exception unused) {
            throw null;
        }
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m3994invoke();
        return C6008.f15084;
    }
}
