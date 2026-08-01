package p007;

import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC4395;
import p013.AbstractC6225;
import p013.C6229;
import p034.AbstractC6347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6137 f16711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC6347 f16712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC6133 f16713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6151 f16714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6149 f16716;

    public C6125(C1245 c1245) {
        c1245.getClass();
        C6149 c6149 = (C6149) c1245.f3620;
        if (c6149 == null) {
            C5925.m11311("url == null");
            throw null;
        }
        this.f16716 = c6149;
        this.f16715 = (String) c1245.f3621;
        this.f16714 = ((C1562) c1245.f3618).m2838();
        this.f16713 = (AbstractC6133) c1245.f3617;
        this.f16712 = (AbstractC6347) c1245.f3619;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f16715);
        sb.append(", url=");
        sb.append(this.f16716);
        C6151 c6151 = this.f16714;
        if (c6151.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c6151) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC6347.m11920();
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
                if (AbstractC6225.m11688(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        C6229 c6229 = C6229.f17165;
        AbstractC6347 abstractC6347 = this.f16712;
        if (!AbstractC4395.m8907(abstractC6347, c6229)) {
            sb.append(", tags=");
            sb.append(abstractC6347);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1245 m11515() {
        C1245 c1245 = new C1245(false);
        c1245.f3620 = this.f16716;
        c1245.f3621 = this.f16715;
        c1245.f3617 = this.f16713;
        c1245.f3619 = this.f16712;
        c1245.f3618 = this.f16714.m11549();
        return c1245;
    }
}
