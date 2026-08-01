package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0039 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f77;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f78;

    public /* synthetic */ RunnableC0039(ComponentActivity componentActivity, int i) {
        this.f78 = i;
        this.f77 = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f78;
        ComponentActivity componentActivity = this.f77;
        switch (i) {
            case 0:
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(componentActivity);
                break;
            default:
                componentActivity.invalidateMenu();
                break;
        }
    }
}
