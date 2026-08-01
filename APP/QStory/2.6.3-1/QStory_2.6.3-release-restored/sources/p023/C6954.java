package p023;

import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.runtime.internal.C2080;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5227;
import p029.AbstractC7054;
import p029.C7058;
import p050.AbstractC7176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6954 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6966 f17056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC7176 f17057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC6962 f17058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6980 f17059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6978 f17061;

    public C6954(C2080 c2080) {
        c2080.getClass();
        C6978 c6978 = (C6978) c2080.f3965;
        if (c6978 == null) {
            C6755.m11870("url == null");
            throw null;
        }
        this.f17061 = c6978;
        this.f17060 = (String) c2080.f3966;
        this.f17059 = ((C2397) c2080.f3963).m3398();
        this.f17058 = (AbstractC6962) c2080.f3962;
        this.f17057 = (AbstractC7176) c2080.f3964;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f17060);
        sb.append(", url=");
        sb.append(this.f17061);
        C6980 c6980 = this.f17059;
        if (c6980.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c6980) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC7176.m12479();
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
                if (AbstractC7054.m12247(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        C7058 c7058 = C7058.f17510;
        AbstractC7176 abstractC7176 = this.f17057;
        if (!AbstractC5227.m9466(abstractC7176, c7058)) {
            sb.append(", tags=");
            sb.append(abstractC7176);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2080 m12074() {
        C2080 c2080 = new C2080(false);
        c2080.f3965 = this.f17061;
        c2080.f3966 = this.f17060;
        c2080.f3962 = this.f17058;
        c2080.f3964 = this.f17057;
        c2080.f3963 = this.f17059.m12108();
        return c2080;
    }
}
