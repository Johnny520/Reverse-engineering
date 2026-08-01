package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0049 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f102;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f103;

    public /* synthetic */ RunnableC0049(Object obj, int i) {
        this.f103 = i;
        this.f102 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f103;
        Object obj = this.f102;
        switch (i) {
            case 0:
                ViewTreeObserverOnDrawListenerC0048 viewTreeObserverOnDrawListenerC0048 = (ViewTreeObserverOnDrawListenerC0048) obj;
                Runnable runnable = viewTreeObserverOnDrawListenerC0048.f99;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0048.f99 = null;
                    return;
                }
                return;
            case 1:
                DialogC0043.m100((DialogC0043) obj);
                return;
            default:
                C0024 c0024 = (C0024) obj;
                synchronized (c0024.f55) {
                    c0024.f53 = false;
                    if (c0024.f54 == 0 && !c0024.f52) {
                        c0024.f56.invoke();
                        c0024.m30();
                    }
                    break;
                }
                return;
        }
    }
}
