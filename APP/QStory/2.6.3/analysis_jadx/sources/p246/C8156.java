package p246;

import androidx.activity.AbstractC0053;
import kotlin.coroutines.AbstractC4359;
import kotlin.jvm.internal.AbstractC4395;
import p075.C6961;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8156 extends AbstractC4359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6961 f22489 = new C6961(18);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f22490;

    public C8156(String str) {
        super(f22489);
        this.f22490 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8156) && AbstractC4395.m8907(this.f22490, ((C8156) obj).f22490);
    }

    public final int hashCode() {
        return this.f22490.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("PluginName("), this.f22490, ')');
    }
}
