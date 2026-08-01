package p236;

import androidx.activity.AbstractC0053;
import java.util.Locale;
import kotlin.text.AbstractC5139;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22417;

    public C8120(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22417 = str;
        this.f22416 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8120)) {
            return false;
        }
        C8120 c8120 = (C8120) obj;
        return AbstractC5139.m10130(c8120.f22417, this.f22417) && AbstractC5139.m10130(c8120.f22416, this.f22416);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f22417.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f22416.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.f22417);
        sb.append(", value=");
        return AbstractC0053.m151(sb, this.f22416, ", escapeValue=false)");
    }
}
