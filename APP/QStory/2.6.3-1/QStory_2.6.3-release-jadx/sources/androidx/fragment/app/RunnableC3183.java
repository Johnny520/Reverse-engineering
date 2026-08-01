package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3183 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7304;

    public /* synthetic */ RunnableC3183(Object obj, int i) {
        this.f7304 = i;
        this.f7303 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7304;
        Object obj = this.f7303;
        switch (i) {
            case 0:
                DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176 = (DialogInterfaceOnCancelListenerC3176) obj;
                dialogInterfaceOnCancelListenerC3176.f7285.onDismiss(dialogInterfaceOnCancelListenerC3176.f7273);
                break;
            case 1:
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) obj;
                if (abstractComponentCallbacksC3171.f7262 != null) {
                    abstractComponentCallbacksC3171.m5004().getClass();
                }
                break;
            default:
                ((AbstractC3146) obj).m4939(true);
                break;
        }
    }
}
