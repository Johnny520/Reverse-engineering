package p257;

import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8223 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8222 f22695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22696;

    public /* synthetic */ RunnableC8223(C8222 c8222, int i) {
        this.f22696 = i;
        this.f22695 = c8222;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22696;
        C8222 c8222 = this.f22695;
        switch (i) {
            case 0:
                c8222.f22684.setY(c8222.f22686.getHeight());
                C8226 c8226 = c8222.f22692;
                if (c8226.f22705 == null) {
                    c8226.f22705 = new C8216(c8222, 2);
                }
                c8226.f22705.m13725(c8226.f22702);
                c8226.m8059(Lifecycle$State.RESUMED);
                break;
            default:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8222.f22686;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC3737.m8044(c8222.f22692.m8068());
                break;
        }
    }
}
