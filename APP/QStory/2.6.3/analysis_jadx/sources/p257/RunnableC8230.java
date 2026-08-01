package p257;

import androidx.appcompat.app.RunnableC0062;
import androidx.compose.animation.core.C0325;
import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8230 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0325 f22711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22712;

    public /* synthetic */ RunnableC8230(C0325 c0325, int i) {
        this.f22712 = i;
        this.f22711 = c0325;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaxRelativeLayout maxRelativeLayout;
        int i = this.f22712;
        C0325 c0325 = this.f22711;
        switch (i) {
            case 0:
                C8233 c8233 = (C8233) c0325.f1093;
                if (c8233.f22726 == null) {
                    c8233.f22726 = new C8217(c0325, 1);
                }
                C8217 c8217 = c8233.f22726;
                if (c8217 != null) {
                    if (c8217 == null) {
                        c8233.f22726 = new C8217(c0325, 1);
                    }
                    c8233.f22726.m13742(c8233);
                }
                C0325 c03252 = c8233.f22718;
                if (c03252 != null && (maxRelativeLayout = (MaxRelativeLayout) c03252.f1096) != null) {
                    maxRelativeLayout.setVisibility(0);
                }
                c8233.m8046(Lifecycle$State.RESUMED);
                break;
            default:
                C8233 c82332 = (C8233) c0325.f1093;
                if (c82332.f22726 == null) {
                    c82332.f22726 = new C8217(c0325, 1);
                }
                c82332.f22726.m13743(c82332);
                AbstractC3738.m8029(c0325.m963(null), new RunnableC0062(this, 20));
                break;
        }
    }
}
