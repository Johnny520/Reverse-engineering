package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.name.C4687;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f13892;

    public C4748(C4687 c4687, int i) {
        this.f13892 = c4687;
        this.f13891 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4748)) {
            return false;
        }
        C4748 c4748 = (C4748) obj;
        return this.f13892.equals(c4748.f13892) && this.f13891 == c4748.f13891;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13891) + (this.f13892.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.f13891;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f13892);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
