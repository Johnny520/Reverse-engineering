package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6720 {
    public static final C6721 Companion = new C6721();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18157;

    public /* synthetic */ C6720(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6718.f18152.getDescriptor());
            throw null;
        }
        this.f18157 = str;
        this.f18156 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6720)) {
            return false;
        }
        C6720 c6720 = (C6720) obj;
        return AbstractC4394.m8917(this.f18157, c6720.f18157) && AbstractC4394.m8917(this.f18156, c6720.f18156);
    }

    public final int hashCode() {
        return this.f18156.hashCode() + (this.f18157.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Implementation(name=");
        sb.append(this.f18157);
        sb.append(", version=");
        return AbstractC0053.m155(sb, this.f18156, ')');
    }

    public C6720() {
        this.f18157 = "mcp-ktor";
        this.f18156 = "0.5.0";
    }
}
