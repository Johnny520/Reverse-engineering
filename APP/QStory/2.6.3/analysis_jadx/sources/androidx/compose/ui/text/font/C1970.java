package androidx.compose.ui.text.font;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f5853;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f5855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1988 f5856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1993 f5857;

    public C1970(AbstractC1993 abstractC1993, C1988 c1988, int i, int i2, Object obj) {
        this.f5857 = abstractC1993;
        this.f5856 = c1988;
        this.f5855 = i;
        this.f5854 = i2;
        this.f5853 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1970)) {
            return false;
        }
        C1970 c1970 = (C1970) obj;
        return AbstractC4395.m8907(this.f5857, c1970.f5857) && AbstractC4395.m8907(this.f5856, c1970.f5856) && this.f5855 == c1970.f5855 && this.f5854 == c1970.f5854 && AbstractC4395.m8907(this.f5853, c1970.f5853);
    }

    public final int hashCode() {
        AbstractC1993 abstractC1993 = this.f5857;
        int iM144 = AbstractC0053.m144(this.f5854, AbstractC0053.m144(this.f5855, (((abstractC1993 == null ? 0 : abstractC1993.hashCode()) * 31) + this.f5856.f5877) * 31, 31), 31);
        Object obj = this.f5853;
        return iM144 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f5857);
        sb.append(", fontWeight=");
        sb.append(this.f5856);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f5855;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.f5854;
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
        sb.append(this.f5853);
        sb.append(')');
        return sb.toString();
    }
}
