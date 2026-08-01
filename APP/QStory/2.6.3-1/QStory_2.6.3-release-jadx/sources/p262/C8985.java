package p262;

import androidx.activity.AbstractC0900;
import kotlin.coroutines.AbstractC5191;
import kotlin.jvm.internal.AbstractC5227;
import p091.C7790;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8985 extends AbstractC5191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7790 f22834 = new C7790(18);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f22835;

    public C8985(String str) {
        super(f22834);
        this.f22835 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8985) && AbstractC5227.m9466(this.f22835, ((C8985) obj).f22835);
    }

    public final int hashCode() {
        return this.f22835.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("PluginName("), this.f22835, ')');
    }
}
