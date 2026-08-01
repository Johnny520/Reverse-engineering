package p257;

import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8224 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8223 f22694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22695;

    public /* synthetic */ RunnableC8224(C8223 c8223, int i) {
        this.f22695 = i;
        this.f22694 = c8223;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22695;
        C8223 c8223 = this.f22694;
        switch (i) {
            case 0:
                c8223.f22683.setY(c8223.f22685.getHeight());
                C8227 c8227 = c8223.f22691;
                if (c8227.f22704 == null) {
                    c8227.f22704 = new C8217(c8223, 2);
                }
                c8227.f22704.m13742(c8227.f22701);
                c8227.m8046(Lifecycle$State.RESUMED);
                break;
            default:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8223.f22685;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC3738.m8031(c8223.f22691.m8055());
                break;
        }
    }
}
