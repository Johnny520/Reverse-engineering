package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲苏兰子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6799 implements InterfaceC6826 {
    public static final C6796 Companion = new C6796();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18244;

    public /* synthetic */ C6799(int i, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6797.f18241.getDescriptor());
            throw null;
        }
        this.f18244 = str;
        if ((i & 2) == 0) {
            this.f18243 = "ref/resource";
        } else {
            this.f18243 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6799) && AbstractC4394.m8917(this.f18244, ((C6799) obj).f18244);
    }

    public final int hashCode() {
        return this.f18244.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("ResourceReference(uri="), this.f18244, ')');
    }
}
