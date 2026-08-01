package p039;

import com.kongzue.dialogx.interfaces.AbstractC3738;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import p257.C8212;
import p257.RunnableC8215;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6422 extends TimerTask {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17609;

    public /* synthetic */ C6422(Object obj, int i) {
        this.f17609 = i;
        this.f17608 = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f17609;
        int i2 = 1;
        Object obj = this.f17608;
        switch (i) {
            case 0:
                ((AtomicBoolean) obj).set(true);
                break;
            default:
                AbstractC3738.m8030(new RunnableC8215((C8212) obj, i2));
                break;
        }
    }
}
