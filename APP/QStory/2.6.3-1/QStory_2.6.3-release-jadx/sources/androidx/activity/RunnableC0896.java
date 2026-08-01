package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0896 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f448;

    public /* synthetic */ RunnableC0896(Object obj, int i) {
        this.f448 = i;
        this.f447 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f448;
        Object obj = this.f447;
        switch (i) {
            case 0:
                ViewTreeObserverOnDrawListenerC0895 viewTreeObserverOnDrawListenerC0895 = (ViewTreeObserverOnDrawListenerC0895) obj;
                Runnable runnable = viewTreeObserverOnDrawListenerC0895.f444;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0895.f444 = null;
                    return;
                }
                return;
            case 1:
                DialogC0890.m660((DialogC0890) obj);
                return;
            default:
                C0871 c0871 = (C0871) obj;
                synchronized (c0871.f400) {
                    c0871.f398 = false;
                    if (c0871.f399 == 0 && !c0871.f397) {
                        c0871.f401.invoke();
                        c0871.m590();
                    }
                    break;
                }
                return;
        }
    }
}
