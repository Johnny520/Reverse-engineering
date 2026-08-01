package p257;

import android.widget.LinearLayout;
import androidx.appcompat.app.RunnableC0062;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.C2492;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8212 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2492 f22664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22665;

    public /* synthetic */ RunnableC8212(C2492 c2492, int i) {
        this.f22665 = i;
        this.f22664 = c2492;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout linearLayout;
        int i = this.f22665;
        int i2 = 4;
        C2492 c2492 = this.f22664;
        switch (i) {
            case 0:
                C8211 c8211 = (C8211) c2492.f7462;
                if (c8211.f22659 == null) {
                    c8211.f22659 = new C8216(c2492, i2);
                }
                c8211.f22659.m13725(c8211.f22657);
                c8211.m8059(Lifecycle$State.RESUMED);
                break;
            default:
                C8211 c82112 = (C8211) c2492.f7462;
                if (c82112.f22659 == null) {
                    c82112.f22659 = new C8216(c2492, i2);
                }
                c82112.f22659.m13726(c82112.f22657);
                AbstractC3737.m8042(c2492.m4921(null), new RunnableC0062(this, 24));
                ArrayList arrayList = C8211.f22650;
                if (arrayList != null) {
                    int iIndexOf = arrayList.indexOf(c82112.f22657);
                    for (int i3 = 0; i3 < iIndexOf; i3++) {
                        C8211 c82113 = (C8211) C8211.f22650.get(i3);
                        C2492 c24922 = c82113.f22654;
                        if (c24922 != null && (linearLayout = (LinearLayout) c24922.f7460) != null) {
                            linearLayout.post(new RunnableC8215(c82113, linearLayout, 1));
                        }
                    }
                }
                break;
        }
    }
}
