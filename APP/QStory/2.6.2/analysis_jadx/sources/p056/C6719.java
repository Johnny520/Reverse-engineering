package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6719 implements InterfaceC6731 {
    public static final C6723 Companion = new C6723();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18155;

    public /* synthetic */ C6719(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6722.f18158.getDescriptor());
            throw null;
        }
        this.f18155 = str;
        this.f18154 = str2;
        if ((i & 4) == 0) {
            this.f18153 = "image";
        } else {
            this.f18153 = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6719)) {
            return false;
        }
        C6719 c6719 = (C6719) obj;
        return AbstractC4394.m8917(this.f18155, c6719.f18155) && AbstractC4394.m8917(this.f18154, c6719.f18154);
    }

    public final int hashCode() {
        return this.f18154.hashCode() + (this.f18155.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageContent(data=");
        sb.append(this.f18155);
        sb.append(", mimeType=");
        return AbstractC0053.m155(sb, this.f18154, ')');
    }
}
