package p055;

import com.kongzue.dialogx.interfaces.AbstractC4570;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import p273.C9041;
import p273.RunnableC9044;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7251 extends TimerTask {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17954;

    public /* synthetic */ C7251(Object obj, int i) {
        this.f17954 = i;
        this.f17953 = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.f17954;
        int i2 = 1;
        Object obj = this.f17953;
        switch (i) {
            case 0:
                ((AtomicBoolean) obj).set(true);
                break;
            default:
                AbstractC4570.m8589(new RunnableC9044((C9041) obj, i2));
                break;
        }
    }
}
