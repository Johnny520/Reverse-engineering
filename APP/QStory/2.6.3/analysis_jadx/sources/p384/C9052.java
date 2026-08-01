package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9052 {
    public static final C9053 Companion = new C9053();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25338;

    public /* synthetic */ C9052(int i, int i2, long j, String str) {
        this.f25338 = (i & 1) == 0 ? 0L : j;
        this.f25337 = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.f25336 = "";
        } else {
            this.f25336 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9052)) {
            return false;
        }
        C9052 c9052 = (C9052) obj;
        return this.f25338 == c9052.f25338 && this.f25337 == c9052.f25337 && AbstractC4395.m8907(this.f25336, c9052.f25336);
    }

    public final int hashCode() {
        return this.f25336.hashCode() + AbstractC0053.m144(this.f25337, Long.hashCode(this.f25338) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1460));
        sb.append(this.f25338);
        sb.append(AbstractC8405.m13972(1454));
        AbstractC6183.m11578(sb, this.f25337, 1461);
        return AbstractC0053.m148(sb, this.f25336, ')');
    }
}
