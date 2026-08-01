package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9058 {
    public static final C9055 Companion = new C9055();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9052 f25346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f25347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f25348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25350;

    public /* synthetic */ C9058(int i, long j, String str, long j2, String str2, C9052 c9052) {
        if ((i & 1) == 0) {
            this.f25350 = 0L;
        } else {
            this.f25350 = j;
        }
        if ((i & 2) == 0) {
            this.f25349 = "";
        } else {
            this.f25349 = str;
        }
        if ((i & 4) == 0) {
            this.f25348 = 0L;
        } else {
            this.f25348 = j2;
        }
        if ((i & 8) == 0) {
            this.f25347 = "";
        } else {
            this.f25347 = str2;
        }
        if ((i & 16) == 0) {
            this.f25346 = null;
        } else {
            this.f25346 = c9052;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9058)) {
            return false;
        }
        C9058 c9058 = (C9058) obj;
        return this.f25350 == c9058.f25350 && AbstractC4395.m8907(this.f25349, c9058.f25349) && this.f25348 == c9058.f25348 && AbstractC4395.m8907(this.f25347, c9058.f25347) && AbstractC4395.m8907(this.f25346, c9058.f25346);
    }

    public final int hashCode() {
        int iM11572 = AbstractC6183.m11572(AbstractC0053.m142(AbstractC6183.m11572(Long.hashCode(this.f25350) * 31, 31, this.f25349), 31, this.f25348), 31, this.f25347);
        C9052 c9052 = this.f25346;
        return iM11572 + (c9052 == null ? 0 : c9052.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1462));
        sb.append(this.f25350);
        sb.append(AbstractC8405.m13972(1433));
        AbstractC6183.m11579(sb, this.f25349, 1463);
        sb.append(this.f25348);
        sb.append(AbstractC8405.m13972(1424));
        AbstractC6183.m11579(sb, this.f25347, 1464);
        sb.append(this.f25346);
        sb.append(')');
        return sb.toString();
    }
}
