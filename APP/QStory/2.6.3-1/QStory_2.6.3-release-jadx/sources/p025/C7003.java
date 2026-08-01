package p025;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7003 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f17323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SearchHelper$MatchType f17324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17328;

    public C7003(String str, String str2, String str3, int i, SearchHelper$MatchType searchHelper$MatchType, Object obj) {
        AbstractC9234.m14531(1312);
        AbstractC9234.m14531(1313);
        AbstractC9234.m14531(1314);
        searchHelper$MatchType.getClass();
        AbstractC9234.m14531(1315);
        this.f17328 = str;
        this.f17327 = str2;
        this.f17326 = str3;
        this.f17325 = i;
        this.f17324 = searchHelper$MatchType;
        this.f17323 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7003)) {
            return false;
        }
        C7003 c7003 = (C7003) obj;
        return AbstractC5227.m9466(this.f17328, c7003.f17328) && AbstractC5227.m9466(this.f17327, c7003.f17327) && AbstractC5227.m9466(this.f17326, c7003.f17326) && this.f17325 == c7003.f17325 && this.f17324 == c7003.f17324 && AbstractC5227.m9466(this.f17323, c7003.f17323);
    }

    public final int hashCode() {
        int iHashCode = this.f17328.hashCode() * 31;
        String str = this.f17327;
        return this.f17323.hashCode() + ((this.f17324.hashCode() + AbstractC0900.m704(this.f17325, AbstractC7012.m12131((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17326), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1316));
        AbstractC7012.m12138(sb, this.f17328, 1317);
        AbstractC7012.m12138(sb, this.f17327, 1318);
        AbstractC7012.m12138(sb, this.f17326, 1319);
        AbstractC7012.m12137(sb, this.f17325, 1320);
        sb.append(this.f17324);
        sb.append(AbstractC9234.m14531(1321));
        sb.append(this.f17323);
        sb.append(')');
        return sb.toString();
    }
}
