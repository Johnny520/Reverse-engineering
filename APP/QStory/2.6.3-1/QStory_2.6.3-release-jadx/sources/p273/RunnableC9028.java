package p273;

import androidx.appcompat.app.RunnableC0909;
import com.kongzue.dialogx.interfaces.RunnableC4574;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9028 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RunnableC4574 f22926;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22927;

    public /* synthetic */ RunnableC9028(RunnableC4574 runnableC4574, int i) {
        this.f22927 = i;
        this.f22926 = runnableC4574;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22927;
        RunnableC4574 runnableC4574 = this.f22926;
        switch (i) {
            case 0:
                C9050 c9050 = new C9050(5);
                C9029 c9029 = (C9029) runnableC4574.f11953;
                c9050.mo8625(c9029.f22937);
                c9029.m14274();
                long j = c9029.f22937.f22915;
                if (j > 0) {
                    c9029.f22929.postDelayed(new RunnableC0909(this, 27), j);
                }
                break;
            default:
                C9029 c90292 = (C9029) runnableC4574.f11953;
                if (c90292.f22937.f22923 > -1) {
                    c90292.m14276(null);
                }
                break;
        }
    }
}
