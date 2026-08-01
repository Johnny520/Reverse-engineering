package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4551 extends AbstractC4547 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13300;

    public C4551(String str) {
        str.getClass();
        this.f13300 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4551) && AbstractC4394.m8917(this.f13300, ((C4551) obj).f13300);
    }

    public final int hashCode() {
        return this.f13300.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("KClassValue("), this.f13300, ')');
    }
}
