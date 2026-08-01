package androidx.compose.ui.text.font;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f5852;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f5854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1988 f5855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1993 f5856;

    public C1970(AbstractC1993 abstractC1993, C1988 c1988, int i, int i2, Object obj) {
        this.f5856 = abstractC1993;
        this.f5855 = c1988;
        this.f5854 = i;
        this.f5853 = i2;
        this.f5852 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1970)) {
            return false;
        }
        C1970 c1970 = (C1970) obj;
        return AbstractC4394.m8917(this.f5856, c1970.f5856) && AbstractC4394.m8917(this.f5855, c1970.f5855) && this.f5854 == c1970.f5854 && this.f5853 == c1970.f5853 && AbstractC4394.m8917(this.f5852, c1970.f5852);
    }

    public final int hashCode() {
        AbstractC1993 abstractC1993 = this.f5856;
        int iM143 = AbstractC0053.m143(this.f5853, AbstractC0053.m143(this.f5854, (((abstractC1993 == null ? 0 : abstractC1993.hashCode()) * 31) + this.f5855.f5876) * 31, 31), 31);
        Object obj = this.f5852;
        return iM143 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f5856);
        sb.append(", fontWeight=");
        sb.append(this.f5855);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f5854;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.f5853;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f5852);
        sb.append(')');
        return sb.toString();
    }
}
