package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "command", "invoke", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AndroidComposeView$snapshotObserver$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        super(1);
        this.this$0 = viewTreeObserverOnGlobalLayoutListenerC1884;
    }

    public final void invoke(InterfaceC6543 interfaceC6543) {
        this.this$0.getUncaughtExceptionHandler$ui();
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            interfaceC6543.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new RunnableC1892(interfaceC6543, 0));
        }
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC6543) obj);
        return C5176.f14739;
    }
}
