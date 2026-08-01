package p400;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9886 {
    public static final C9892 Companion = new C9892();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f25686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25690;

    public /* synthetic */ C9886(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i & 1) == 0) {
            this.f25690 = 0;
        } else {
            this.f25690 = i2;
        }
        if ((i & 2) == 0) {
            this.f25689 = 0;
        } else {
            this.f25689 = i3;
        }
        if ((i & 4) == 0) {
            this.f25688 = 0;
        } else {
            this.f25688 = i4;
        }
        if ((i & 8) == 0) {
            this.f25687 = 0;
        } else {
            this.f25687 = i5;
        }
        if ((i & 16) == 0) {
            this.f25686 = 0L;
        } else {
            this.f25686 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9886)) {
            return false;
        }
        C9886 c9886 = (C9886) obj;
        return this.f25690 == c9886.f25690 && this.f25689 == c9886.f25689 && this.f25688 == c9886.f25688 && this.f25687 == c9886.f25687 && this.f25686 == c9886.f25686;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25686) + AbstractC0900.m704(this.f25687, AbstractC0900.m704(this.f25688, AbstractC0900.m704(this.f25689, Integer.hashCode(this.f25690) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1453));
        AbstractC7012.m12137(sb, this.f25690, 1454);
        AbstractC7012.m12137(sb, this.f25689, 1455);
        AbstractC7012.m12137(sb, this.f25688, 1359);
        AbstractC7012.m12137(sb, this.f25687, 1425);
        sb.append(this.f25686);
        sb.append(')');
        return sb.toString();
    }
}
