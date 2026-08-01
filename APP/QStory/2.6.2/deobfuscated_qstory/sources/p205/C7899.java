package p205;

import androidx.activity.AbstractC0053;
import p204.InterfaceC7891;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7899 implements InterfaceC7891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21872;

    public C7899(float f) {
        this.f21872 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7899) && Float.compare(this.f21872, ((C7899) obj).f21872) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21872);
    }

    public final String toString() {
        return AbstractC0053.m157(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f21872, ')');
    }

    @Override // p204.InterfaceC7891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo13285(float f) {
        return f * this.f21872;
    }

    @Override // p204.InterfaceC7891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13286(float f) {
        return f / this.f21872;
    }
}
