package p038;

import com.kongzue.dialogx.interfaces.AbstractC3737;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import p257.C8211;
import p257.RunnableC8214;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6400 extends TimerTask {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17557;

    public /* synthetic */ C6400(Object obj, int i) {
        this.f17557 = i;
        this.f17556 = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f17557;
        int i2 = 1;
        Object obj = this.f17556;
        switch (i) {
            case 0:
                ((AtomicBoolean) obj).set(true);
                break;
            default:
                AbstractC3737.m8043(new RunnableC8214((C8211) obj, i2));
                break;
        }
    }
}
