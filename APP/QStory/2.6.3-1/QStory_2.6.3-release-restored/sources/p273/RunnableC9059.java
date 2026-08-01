package p273;

import androidx.appcompat.app.RunnableC0909;
import androidx.compose.animation.core.C1171;
import androidx.lifecycle.Lifecycle$State;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9059 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1171 f23056;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23057;

    public /* synthetic */ RunnableC9059(C1171 c1171, int i) {
        this.f23057 = i;
        this.f23056 = c1171;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaxRelativeLayout maxRelativeLayout;
        int i = this.f23057;
        C1171 c1171 = this.f23056;
        switch (i) {
            case 0:
                C9062 c9062 = (C9062) c1171.f1438;
                if (c9062.f23071 == null) {
                    c9062.f23071 = new C9046(c1171, 1);
                }
                C9046 c9046 = c9062.f23071;
                if (c9046 != null) {
                    if (c9046 == null) {
                        c9062.f23071 = new C9046(c1171, 1);
                    }
                    c9062.f23071.m14301(c9062);
                }
                C1171 c11712 = c9062.f23063;
                if (c11712 != null && (maxRelativeLayout = (MaxRelativeLayout) c11712.f1441) != null) {
                    maxRelativeLayout.setVisibility(0);
                }
                c9062.m8605(Lifecycle$State.RESUMED);
                break;
            default:
                C9062 c90622 = (C9062) c1171.f1438;
                if (c90622.f23071 == null) {
                    c90622.f23071 = new C9046(c1171, 1);
                }
                c90622.f23071.m14302(c90622);
                AbstractC4570.m8588(c1171.m1523(null), new RunnableC0909(this, 20));
                break;
        }
    }
}
