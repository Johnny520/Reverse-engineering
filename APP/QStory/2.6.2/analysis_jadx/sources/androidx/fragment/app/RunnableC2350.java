package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2350 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6958;

    public /* synthetic */ RunnableC2350(Object obj, int i) {
        this.f6958 = i;
        this.f6957 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6958;
        Object obj = this.f6957;
        switch (i) {
            case 0:
                DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343 = (DialogInterfaceOnCancelListenerC2343) obj;
                dialogInterfaceOnCancelListenerC2343.f6939.onDismiss(dialogInterfaceOnCancelListenerC2343.f6927);
                break;
            case 1:
                AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) obj;
                if (abstractComponentCallbacksC2338.f6916 != null) {
                    abstractComponentCallbacksC2338.m4434().getClass();
                }
                break;
            default:
                ((AbstractC2313) obj).m4369(true);
                break;
        }
    }
}
