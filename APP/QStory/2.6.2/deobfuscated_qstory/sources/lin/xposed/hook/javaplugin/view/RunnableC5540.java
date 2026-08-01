package lin.xposed.hook.javaplugin.view;

import android.os.Message;
import p031.DialogC6312;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5540 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DialogC6312 f15293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15294;

    public /* synthetic */ RunnableC5540(DialogC6312 dialogC6312, int i) {
        this.f15294 = i;
        this.f15293 = dialogC6312;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15294;
        DialogC6312 dialogC6312 = this.f15293;
        switch (i) {
            case 0:
                DownloadPluginItemView.lambda$setDownloadClick$1(dialogC6312);
                return;
        }
        while (!dialogC6312.f17398) {
            Message message = new Message();
            message.obj = Long.valueOf(System.currentTimeMillis());
            dialogC6312.f17401.sendMessage(message);
            try {
                Thread.sleep(20L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
