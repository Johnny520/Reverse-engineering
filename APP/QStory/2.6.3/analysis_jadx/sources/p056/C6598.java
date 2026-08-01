package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪哲苏子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6598 implements InterfaceC6783 {
    public static final C6595 Companion = new C6595();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17973;

    public /* synthetic */ C6598(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6596.f17970.getDescriptor());
            throw null;
        }
        this.f17973 = str;
        this.f17972 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6598)) {
            return false;
        }
        C6598 c6598 = (C6598) obj;
        return AbstractC4395.m8907(this.f17973, c6598.f17973) && AbstractC4395.m8907(this.f17972, c6598.f17972);
    }

    public final int hashCode() {
        int iHashCode = this.f17973.hashCode() * 31;
        String str = this.f17972;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownResourceContents(uri=");
        sb.append(this.f17973);
        sb.append(", mimeType=");
        return AbstractC0053.m148(sb, this.f17972, ')');
    }
}
