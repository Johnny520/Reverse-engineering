package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.os.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3011 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3011 f6797 = new C3011(new C3015(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3015 f6798;

    public C3011(C3015 c3015) {
        this.f6798 = c3015;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3011 m4534(String str) {
        if (str == null || str.isEmpty()) {
            return f6797;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new C3011(new C3015(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3011) {
            return this.f6798.equals(((C3011) obj).f6798);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6798.f6800.hashCode();
    }

    public final String toString() {
        return this.f6798.f6800.toString();
    }
}
