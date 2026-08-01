package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6586 implements InterfaceC6731 {
    public static final C6587 Companion = new C6587();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17966;

    public /* synthetic */ C6586(int i, String str, String str2) {
        this.f17966 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f17965 = "text";
        } else {
            this.f17965 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6586) && AbstractC4394.m8917(this.f17966, ((C6586) obj).f17966);
    }

    public final int hashCode() {
        String str = this.f17966;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("TextContent(text="), this.f17966, ')');
    }
}
