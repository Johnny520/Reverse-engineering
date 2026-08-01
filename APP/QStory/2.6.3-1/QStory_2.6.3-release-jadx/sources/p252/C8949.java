package p252;

import androidx.activity.AbstractC0900;
import java.util.Locale;
import kotlin.text.AbstractC5971;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22762;

    public C8949(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22762 = str;
        this.f22761 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8949)) {
            return false;
        }
        C8949 c8949 = (C8949) obj;
        return AbstractC5971.m10689(c8949.f22762, this.f22762) && AbstractC5971.m10689(c8949.f22761, this.f22761);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f22762.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f22761.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.f22762);
        sb.append(", value=");
        return AbstractC0900.m711(sb, this.f22761, ", escapeValue=false)");
    }
}
