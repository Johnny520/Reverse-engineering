package p009;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f16978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SearchHelper$MatchType f16979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f16981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16983;

    public C6174(String str, String str2, String str3, int i, SearchHelper$MatchType searchHelper$MatchType, Object obj) {
        AbstractC8405.m13972(1312);
        AbstractC8405.m13972(1313);
        AbstractC8405.m13972(1314);
        searchHelper$MatchType.getClass();
        AbstractC8405.m13972(1315);
        this.f16983 = str;
        this.f16982 = str2;
        this.f16981 = str3;
        this.f16980 = i;
        this.f16979 = searchHelper$MatchType;
        this.f16978 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6174)) {
            return false;
        }
        C6174 c6174 = (C6174) obj;
        return AbstractC4395.m8907(this.f16983, c6174.f16983) && AbstractC4395.m8907(this.f16982, c6174.f16982) && AbstractC4395.m8907(this.f16981, c6174.f16981) && this.f16980 == c6174.f16980 && this.f16979 == c6174.f16979 && AbstractC4395.m8907(this.f16978, c6174.f16978);
    }

    public final int hashCode() {
        int iHashCode = this.f16983.hashCode() * 31;
        String str = this.f16982;
        return this.f16978.hashCode() + ((this.f16979.hashCode() + AbstractC0053.m144(this.f16980, AbstractC6183.m11572((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16981), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1316));
        AbstractC6183.m11579(sb, this.f16983, 1317);
        AbstractC6183.m11579(sb, this.f16982, 1318);
        AbstractC6183.m11579(sb, this.f16981, 1319);
        AbstractC6183.m11578(sb, this.f16980, 1320);
        sb.append(this.f16979);
        sb.append(AbstractC8405.m13972(1321));
        sb.append(this.f16978);
        sb.append(')');
        return sb.toString();
    }
}
