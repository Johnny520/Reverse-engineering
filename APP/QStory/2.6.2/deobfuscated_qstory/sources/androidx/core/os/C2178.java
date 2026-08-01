package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2178 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2178 f6451 = new C2178(new C2182(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2182 f6452;

    public C2178(C2182 c2182) {
        this.f6452 = c2182;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2178 m3964(String str) {
        if (str == null || str.isEmpty()) {
            return f6451;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new C2178(new C2182(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2178) {
            return this.f6452.equals(((C2178) obj).f6452);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6452.f6454.hashCode();
    }

    public final String toString() {
        return this.f6452.f6454.toString();
    }
}
