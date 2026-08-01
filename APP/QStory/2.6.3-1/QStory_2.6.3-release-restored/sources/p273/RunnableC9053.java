package p273;

import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9053 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9052 f23039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23040;

    public /* synthetic */ RunnableC9053(C9052 c9052, int i) {
        this.f23040 = i;
        this.f23039 = c9052;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23040;
        C9052 c9052 = this.f23039;
        switch (i) {
            case 0:
                c9052.f23028.setY(c9052.f23030.getHeight());
                C9056 c9056 = c9052.f23036;
                if (c9056.f23049 == null) {
                    c9056.f23049 = new C9046(c9052, 2);
                }
                c9056.f23049.m14301(c9056.f23046);
                c9056.m8605(Lifecycle$State.RESUMED);
                break;
            default:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c9052.f23030;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC4570.m8590(c9052.f23036.m8614());
                break;
        }
    }
}
