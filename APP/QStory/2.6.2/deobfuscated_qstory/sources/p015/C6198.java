package p015;

import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.AbstractC3055;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4394;
import p017.AbstractC6233;
import p017.C6237;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6198 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6210 f16950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3055 f16951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC6206 f16952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6224 f16953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6222 f16955;

    public C6198(C1245 c1245) {
        c1245.getClass();
        C6222 c6222 = (C6222) c1245.f3619;
        if (c6222 == null) {
            C5919.m11250("url == null");
            throw null;
        }
        this.f16955 = c6222;
        this.f16954 = (String) c1245.f3620;
        this.f16953 = ((C1562) c1245.f3617).m2828();
        this.f16952 = (AbstractC6206) c1245.f3616;
        this.f16951 = (AbstractC3055) c1245.f3618;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f16954);
        sb.append(", url=");
        sb.append(this.f16955);
        C6224 c6224 = this.f16953;
        if (c6224.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c6224) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC8189.m13662();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC6233.m11698(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        C6237 c6237 = C6237.f17188;
        AbstractC3055 abstractC3055 = this.f16951;
        if (!AbstractC4394.m8917(abstractC3055, c6237)) {
            sb.append(", tags=");
            sb.append(abstractC3055);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1245 m11644() {
        C1245 c1245 = new C1245(false);
        c1245.f3619 = this.f16955;
        c1245.f3620 = this.f16954;
        c1245.f3616 = this.f16952;
        c1245.f3618 = this.f16951;
        c1245.f3617 = this.f16953.m11678();
        return c1245;
    }
}
