package lin.xposed.hook.javaplugin.view;

import android.os.Message;
import p032.DialogC6331;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5541 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DialogC6331 f15293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15294;

    public /* synthetic */ RunnableC5541(DialogC6331 dialogC6331, int i) {
        this.f15294 = i;
        this.f15293 = dialogC6331;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15294;
        DialogC6331 dialogC6331 = this.f15293;
        switch (i) {
            case 0:
                DownloadPluginItemView.lambda$setDownloadClick$1(dialogC6331);
                return;
        }
        while (!dialogC6331.f17447) {
            Message message = new Message();
            message.obj = Long.valueOf(System.currentTimeMillis());
            dialogC6331.f17450.sendMessage(message);
            try {
                Thread.sleep(20L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
