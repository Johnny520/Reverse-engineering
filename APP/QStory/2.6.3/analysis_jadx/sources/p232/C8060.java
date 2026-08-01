package p232;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.compose.foundation.lazy.layout.C0734;
import com.bumptech.glide.C3063;
import com.bumptech.glide.load.engine.C3004;
import java.util.HashSet;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8060 implements InterfaceC8061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3063 f22240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f22241;

    public C8060(Context context, C3063 c3063) {
        this.f22241 = context.getApplicationContext();
        this.f22240 = c3063;
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6775() {
        C8065 c8065M13547 = C8065.m13547(this.f22241);
        C3063 c3063 = this.f22240;
        synchronized (c8065M13547) {
            ((HashSet) c8065M13547.f22244).add(c3063);
            c8065M13547.m13552();
        }
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6777() {
        C8065 c8065M13547 = C8065.m13547(this.f22241);
        C3063 c3063 = this.f22240;
        synchronized (c8065M13547) {
            ((HashSet) c8065M13547.f22244).remove(c3063);
            if (c8065M13547.f22245 && ((HashSet) c8065M13547.f22244).isEmpty()) {
                C0734 c0734 = (C0734) c8065M13547.f22246;
                ((ConnectivityManager) ((C3004) c0734.f2070).get()).unregisterNetworkCallback((C8068) c0734.f2069);
                c8065M13547.f22245 = false;
            }
        }
    }

    @Override // p232.InterfaceC8073
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo6779() {
    }
}
