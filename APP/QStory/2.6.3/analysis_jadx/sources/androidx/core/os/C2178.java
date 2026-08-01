package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2178 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2178 f6452 = new C2178(new C2182(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2182 f6453;

    public C2178(C2182 c2182) {
        this.f6453 = c2182;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2178 m3974(String str) {
        if (str == null || str.isEmpty()) {
            return f6452;
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
            return this.f6453.equals(((C2178) obj).f6453);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6453.f6455.hashCode();
    }

    public final String toString() {
        return this.f6453.f6455.toString();
    }
}
