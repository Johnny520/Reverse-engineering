package p236;

import androidx.activity.AbstractC0053;
import java.util.Locale;
import kotlin.text.AbstractC5138;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22419;

    public C8119(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22419 = str;
        this.f22418 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8119)) {
            return false;
        }
        C8119 c8119 = (C8119) obj;
        return AbstractC5138.m10130(c8119.f22419, this.f22419) && AbstractC5138.m10130(c8119.f22418, this.f22418);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f22419.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f22418.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.f22419);
        sb.append(", value=");
        return AbstractC0053.m146(sb, this.f22418, ", escapeValue=false)");
    }
}
