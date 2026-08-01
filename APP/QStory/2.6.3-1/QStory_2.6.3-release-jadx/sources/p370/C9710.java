package p370;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9710 extends AbstractC9711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25387;

    public C9710(String str, int i, int i2, boolean z) {
        AbstractC9234.m14531(1597);
        this.f25387 = i;
        this.f25386 = str;
        this.f25385 = i2;
        this.f25384 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9710)) {
            return false;
        }
        C9710 c9710 = (C9710) obj;
        return this.f25387 == c9710.f25387 && AbstractC5227.m9466(this.f25386, c9710.f25386) && this.f25385 == c9710.f25385 && this.f25384 == c9710.f25384;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25384) + AbstractC0900.m704(this.f25385, AbstractC7012.m12131(Integer.hashCode(this.f25387) * 31, 31, this.f25386), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2922));
        AbstractC7012.m12137(sb, this.f25387, 2923);
        AbstractC7012.m12138(sb, this.f25386, 2924);
        AbstractC7012.m12137(sb, this.f25385, 2925);
        return AbstractC0900.m712(sb, this.f25384, ')');
    }
}
