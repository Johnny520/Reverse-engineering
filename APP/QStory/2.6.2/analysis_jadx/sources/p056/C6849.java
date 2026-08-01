package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6849 implements InterfaceC6826 {
    public static final C6848 Companion = new C6848();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18292;

    public /* synthetic */ C6849(int i, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6844.f18288.getDescriptor());
            throw null;
        }
        this.f18292 = str;
        if ((i & 2) == 0) {
            this.f18291 = "ref/prompt";
        } else {
            this.f18291 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6849) && AbstractC4394.m8917(this.f18292, ((C6849) obj).f18292);
    }

    public final int hashCode() {
        return this.f18292.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("PromptReference(name="), this.f18292, ')');
    }
}
