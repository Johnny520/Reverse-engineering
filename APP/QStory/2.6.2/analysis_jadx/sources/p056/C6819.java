package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6819 {
    public static final C6818 Companion = new C6818();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18262;

    public /* synthetic */ C6819(int i, String str) {
        if (1 == (i & 1)) {
            this.f18262 = str;
        } else {
            AbstractC7143.m12393(i, 1, C6814.f18260.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6819) && AbstractC4394.m8917(this.f18262, ((C6819) obj).f18262);
    }

    public final int hashCode() {
        String str = this.f18262;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("ModelHint(name="), this.f18262, ')');
    }
}
