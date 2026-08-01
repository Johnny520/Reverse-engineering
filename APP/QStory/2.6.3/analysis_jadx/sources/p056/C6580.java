package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6580 implements InterfaceC6783 {
    public static final C6577 Companion = new C6577();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17954;

    public /* synthetic */ C6580(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C6578.f17950.getDescriptor());
            throw null;
        }
        this.f17954 = str;
        this.f17953 = str2;
        this.f17952 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6580)) {
            return false;
        }
        C6580 c6580 = (C6580) obj;
        return AbstractC4395.m8907(this.f17954, c6580.f17954) && AbstractC4395.m8907(this.f17953, c6580.f17953) && AbstractC4395.m8907(this.f17952, c6580.f17952);
    }

    public final int hashCode() {
        int iM11572 = AbstractC6183.m11572(this.f17954.hashCode() * 31, 31, this.f17953);
        String str = this.f17952;
        return iM11572 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextResourceContents(text=");
        sb.append(this.f17954);
        sb.append(", uri=");
        sb.append(this.f17953);
        sb.append(", mimeType=");
        return AbstractC0053.m148(sb, this.f17952, ')');
    }
}
