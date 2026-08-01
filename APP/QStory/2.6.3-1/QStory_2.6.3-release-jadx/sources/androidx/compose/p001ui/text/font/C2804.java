package androidx.compose.p001ui.text.font;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f6198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f6199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2822 f6201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2827 f6202;

    public C2804(AbstractC2827 abstractC2827, C2822 c2822, int i, int i2, Object obj) {
        this.f6202 = abstractC2827;
        this.f6201 = c2822;
        this.f6200 = i;
        this.f6199 = i2;
        this.f6198 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2804)) {
            return false;
        }
        C2804 c2804 = (C2804) obj;
        return AbstractC5227.m9466(this.f6202, c2804.f6202) && AbstractC5227.m9466(this.f6201, c2804.f6201) && this.f6200 == c2804.f6200 && this.f6199 == c2804.f6199 && AbstractC5227.m9466(this.f6198, c2804.f6198);
    }

    public final int hashCode() {
        AbstractC2827 abstractC2827 = this.f6202;
        int iM704 = AbstractC0900.m704(this.f6199, AbstractC0900.m704(this.f6200, (((abstractC2827 == null ? 0 : abstractC2827.hashCode()) * 31) + this.f6201.f6222) * 31, 31), 31);
        Object obj = this.f6198;
        return iM704 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f6202);
        sb.append(", fontWeight=");
        sb.append(this.f6201);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f6200;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.f6199;
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
        sb.append(this.f6198);
        sb.append(')');
        return sb.toString();
    }
}
