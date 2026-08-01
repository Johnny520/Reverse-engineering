package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0886 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f423;

    public /* synthetic */ RunnableC0886(ComponentActivity componentActivity, int i) {
        this.f423 = i;
        this.f422 = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f423;
        ComponentActivity componentActivity = this.f422;
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
