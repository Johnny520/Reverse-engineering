package lin.xposed.hook.javaplugin.view;

import android.os.Message;
import p048.DialogC7160;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6372 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DialogC7160 f15638;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15639;

    public /* synthetic */ RunnableC6372(DialogC7160 dialogC7160, int i) {
        this.f15639 = i;
        this.f15638 = dialogC7160;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15639;
        DialogC7160 dialogC7160 = this.f15638;
        switch (i) {
            case 0:
                DownloadPluginItemView.lambda$setDownloadClick$1(dialogC7160);
                return;
        }
        while (!dialogC7160.f17792) {
            Message message = new Message();
            message.obj = Long.valueOf(System.currentTimeMillis());
            dialogC7160.f17795.sendMessage(message);
            try {
                Thread.sleep(20L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
