package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2350 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6959;

    public /* synthetic */ RunnableC2350(Object obj, int i) {
        this.f6959 = i;
        this.f6958 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6959;
        Object obj = this.f6958;
        switch (i) {
            case 0:
                DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343 = (DialogInterfaceOnCancelListenerC2343) obj;
                dialogInterfaceOnCancelListenerC2343.f6940.onDismiss(dialogInterfaceOnCancelListenerC2343.f6928);
                break;
            case 1:
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) obj;
                if (abstractComponentCallbacksC2338.f6917 != null) {
                    abstractComponentCallbacksC2338.m4444().getClass();
                }
                break;
            default:
                ((AbstractC2313) obj).m4379(true);
                break;
        }
    }
}
