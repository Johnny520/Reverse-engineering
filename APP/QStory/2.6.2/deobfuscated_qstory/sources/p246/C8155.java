package p246;

import androidx.activity.AbstractC0053;
import kotlin.coroutines.AbstractC4358;
import kotlin.jvm.internal.AbstractC4394;
import p075.C6960;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8155 extends AbstractC4358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6960 f22491 = new C6960(18);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f22492;

    public C8155(String str) {
        super(f22491);
        this.f22492 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8155) && AbstractC4394.m8917(this.f22492, ((C8155) obj).f22492);
    }

    public final int hashCode() {
        return this.f22492.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("PluginName("), this.f22492, ')');
    }
}
