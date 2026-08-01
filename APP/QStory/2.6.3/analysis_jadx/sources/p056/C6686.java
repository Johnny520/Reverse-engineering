package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6686 implements InterfaceC6783 {
    public static final C6687 Companion = new C6687();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18098;

    public /* synthetic */ C6686(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C6688.f18099.getDescriptor());
            throw null;
        }
        this.f18098 = str;
        this.f18097 = str2;
        this.f18096 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6686)) {
            return false;
        }
        C6686 c6686 = (C6686) obj;
        return AbstractC4395.m8907(this.f18098, c6686.f18098) && AbstractC4395.m8907(this.f18097, c6686.f18097) && AbstractC4395.m8907(this.f18096, c6686.f18096);
    }

    public final int hashCode() {
        int iM11572 = AbstractC6183.m11572(this.f18098.hashCode() * 31, 31, this.f18097);
        String str = this.f18096;
        return iM11572 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlobResourceContents(blob=");
        sb.append(this.f18098);
        sb.append(", uri=");
        sb.append(this.f18097);
        sb.append(", mimeType=");
        return AbstractC0053.m148(sb, this.f18096, ')');
    }
}
