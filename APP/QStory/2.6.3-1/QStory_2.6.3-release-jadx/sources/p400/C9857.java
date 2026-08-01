package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9857 {
    public static final C9858 Companion = new C9858();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25655;

    public /* synthetic */ C9857(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC7973.m12979(i, 7, C9859.f25656.getDescriptor());
            throw null;
        }
        this.f25655 = str;
        this.f25654 = str2;
        this.f25653 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9857)) {
            return false;
        }
        C9857 c9857 = (C9857) obj;
        return AbstractC5227.m9466(this.f25655, c9857.f25655) && AbstractC5227.m9466(this.f25654, c9857.f25654) && this.f25653 == c9857.f25653;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25653) + AbstractC7012.m12131(this.f25655.hashCode() * 31, 31, this.f25654);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1363));
        AbstractC7012.m12138(sb, this.f25655, 1364);
        AbstractC7012.m12138(sb, this.f25654, 1359);
        return AbstractC0900.m716(sb, this.f25653, ')');
    }

    public C9857(int i, String str, String str2) {
        AbstractC9234.m14531(1361);
        str.getClass();
        AbstractC9234.m14531(1362);
        str2.getClass();
        this.f25655 = str;
        this.f25654 = str2;
        this.f25653 = i;
    }
}
