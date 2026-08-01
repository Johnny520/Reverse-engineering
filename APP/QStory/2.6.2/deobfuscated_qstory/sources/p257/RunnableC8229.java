package p257;

import androidx.appcompat.app.RunnableC0062;
import androidx.compose.animation.core.C0325;
import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8229 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0325 f22712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22713;

    public /* synthetic */ RunnableC8229(C0325 c0325, int i) {
        this.f22713 = i;
        this.f22712 = c0325;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaxRelativeLayout maxRelativeLayout;
        int i = this.f22713;
        C0325 c0325 = this.f22712;
        switch (i) {
            case 0:
                C8232 c8232 = (C8232) c0325.f1093;
                if (c8232.f22727 == null) {
                    c8232.f22727 = new C8216(c0325, 1);
                }
                C8216 c8216 = c8232.f22727;
                if (c8216 != null) {
                    if (c8216 == null) {
                        c8232.f22727 = new C8216(c0325, 1);
                    }
                    c8232.f22727.m13725(c8232);
                }
                C0325 c03252 = c8232.f22719;
                if (c03252 != null && (maxRelativeLayout = (MaxRelativeLayout) c03252.f1096) != null) {
                    maxRelativeLayout.setVisibility(0);
                }
                c8232.m8059(Lifecycle$State.RESUMED);
                break;
            default:
                C8232 c82322 = (C8232) c0325.f1093;
                if (c82322.f22727 == null) {
                    c82322.f22727 = new C8216(c0325, 1);
                }
                c82322.f22727.m13726(c82322);
                AbstractC3737.m8042(c0325.m962(null), new RunnableC0062(this, 20));
                break;
        }
    }
}
