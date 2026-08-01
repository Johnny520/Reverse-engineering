package p038;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import p022.C6267;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p032.C6316;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6419 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        try {
            C6316 c6316M11826 = C6316.m11826(AbstractC6318.m11838(AbstractC3056.m6668(-3937579975008585127L)));
            String strM6668 = AbstractC3056.m6668(-3937597326676460967L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{View.class, Bundle.class};
            c1245.f3616 = Void.TYPE;
            m11803(c6316M11826.m11827(), new C6267(21));
        } catch (Exception unused) {
            C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937597167762671015L));
            C1245 c12452 = c6316M11825.f17409;
            c12452.f3616 = Boolean.TYPE;
            c12452.f3618 = new Class[]{Bundle.class};
            c6316M11825.f17409.f3617 = AbstractC3056.m6668(-3937569478108513703L);
            m11802(c6316M11825.m11827(), new C8631(28));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937580069497865639L);
    }
}
