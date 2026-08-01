package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪哲苏子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6597 implements InterfaceC6782 {
    public static final C6594 Companion = new C6594();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17978;

    public /* synthetic */ C6597(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6595.f17975.getDescriptor());
            throw null;
        }
        this.f17978 = str;
        this.f17977 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6597)) {
            return false;
        }
        C6597 c6597 = (C6597) obj;
        return AbstractC4394.m8917(this.f17978, c6597.f17978) && AbstractC4394.m8917(this.f17977, c6597.f17977);
    }

    public final int hashCode() {
        int iHashCode = this.f17978.hashCode() * 31;
        String str = this.f17977;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownResourceContents(uri=");
        sb.append(this.f17978);
        sb.append(", mimeType=");
        return AbstractC0053.m155(sb, this.f17977, ')');
    }
}
