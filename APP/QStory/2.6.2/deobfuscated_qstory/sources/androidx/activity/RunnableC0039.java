package androidx.activity;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
