package p273;

import androidx.appcompat.app.RunnableC0909;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.RunnableC4574;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9033 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9029 f22943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22944;

    public /* synthetic */ RunnableC9033(C9029 c9029, int i) {
        this.f22944 = i;
        this.f22943 = c9029;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22944;
        C9029 c9029 = this.f22943;
        switch (i) {
            case 0:
                AbstractC4570.m8589(new RunnableC4574(c9029, 17, c9029.f22937.f22925));
                break;
            default:
                C9027 c9027 = c9029.f22937;
                if (c9027.f22917 == null) {
                    c9027.f22917 = new C9046(c9029, 5);
                }
                c9027.f22917.m14302(c9027);
                AbstractC4570.m8588(c9029.m14275(null), new RunnableC0909(this, 26));
                break;
        }
    }
}
