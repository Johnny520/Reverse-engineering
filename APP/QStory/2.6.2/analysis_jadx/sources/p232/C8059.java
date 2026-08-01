package p232;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.compose.foundation.lazy.layout.C0734;
import com.bumptech.glide.C3062;
import com.bumptech.glide.load.engine.C3003;
import java.util.HashSet;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8059 implements InterfaceC8060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3062 f22242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f22243;

    public C8059(Context context, C3062 c3062) {
        this.f22243 = context.getApplicationContext();
        this.f22242 = c3062;
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6730() {
        C8064 c8064M13518 = C8064.m13518(this.f22243);
        C3062 c3062 = this.f22242;
        synchronized (c8064M13518) {
            ((HashSet) c8064M13518.f22246).add(c3062);
            c8064M13518.m13523();
        }
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6732() {
        C8064 c8064M13518 = C8064.m13518(this.f22243);
        C3062 c3062 = this.f22242;
        synchronized (c8064M13518) {
            ((HashSet) c8064M13518.f22246).remove(c3062);
            if (c8064M13518.f22247 && ((HashSet) c8064M13518.f22246).isEmpty()) {
                C0734 c0734 = (C0734) c8064M13518.f22248;
                ((ConnectivityManager) ((C3003) c0734.f2069).get()).unregisterNetworkCallback((C8067) c0734.f2068);
                c8064M13518.f22247 = false;
            }
        }
    }

    @Override // p232.InterfaceC8072
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6734() {
    }
}
