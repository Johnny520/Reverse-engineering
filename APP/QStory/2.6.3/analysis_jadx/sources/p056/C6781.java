package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6781 {
    public static final C6782 Companion = new C6782();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18218;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18220;

    public /* synthetic */ C6781(String str, String str2, String str3, int i, String str4) {
        if (15 != (i & 15)) {
            AbstractC7144.m12420(i, 15, C6794.f18234.getDescriptor());
            throw null;
        }
        this.f18220 = str;
        this.f18219 = str2;
        this.f18218 = str3;
        this.f18217 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6781)) {
            return false;
        }
        C6781 c6781 = (C6781) obj;
        return AbstractC4395.m8907(this.f18220, c6781.f18220) && AbstractC4395.m8907(this.f18219, c6781.f18219) && AbstractC4395.m8907(this.f18218, c6781.f18218) && AbstractC4395.m8907(this.f18217, c6781.f18217);
    }

    public final int hashCode() {
        int iM11572 = AbstractC6183.m11572(this.f18220.hashCode() * 31, 31, this.f18219);
        String str = this.f18218;
        int iHashCode = (iM11572 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18217;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource(uri=");
        sb.append(this.f18220);
        sb.append(", name=");
        sb.append(this.f18219);
        sb.append(", description=");
        sb.append(this.f18218);
        sb.append(", mimeType=");
        return AbstractC0053.m148(sb, this.f18217, ')');
    }
}
