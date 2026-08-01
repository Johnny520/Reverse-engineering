package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9847 {
    public static final C9848 Companion = new C9848();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f25645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f25646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25648;

    public /* synthetic */ C9847(int i, String str, String str2, long j, long j2, int i2) {
        if ((i & 1) == 0) {
            this.f25648 = "";
        } else {
            this.f25648 = str;
        }
        if ((i & 2) == 0) {
            this.f25647 = "";
        } else {
            this.f25647 = str2;
        }
        if ((i & 4) == 0) {
            this.f25646 = 0L;
        } else {
            this.f25646 = j;
        }
        if ((i & 8) == 0) {
            this.f25645 = 0L;
        } else {
            this.f25645 = j2;
        }
        if ((i & 16) == 0) {
            this.f25644 = 0;
        } else {
            this.f25644 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9847)) {
            return false;
        }
        C9847 c9847 = (C9847) obj;
        return AbstractC5227.m9466(this.f25648, c9847.f25648) && AbstractC5227.m9466(this.f25647, c9847.f25647) && this.f25646 == c9847.f25646 && this.f25645 == c9847.f25645 && this.f25644 == c9847.f25644;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25644) + AbstractC0900.m702(AbstractC0900.m702(AbstractC7012.m12131(this.f25648.hashCode() * 31, 31, this.f25647), 31, this.f25646), 31, this.f25645);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Info(operatorUid=");
        AbstractC7012.m12138(sb, this.f25648, 1424);
        AbstractC7012.m12138(sb, this.f25647, 1425);
        sb.append(this.f25646);
        sb.append(", msgRandom=");
        sb.append(this.f25645);
        sb.append(", msgSeq=");
        return AbstractC0900.m716(sb, this.f25644, ')');
    }

    public C9847(String str, String str2, long j, long j2, int i) {
        "operatorUid";
        str.getClass();
        "receiverUid";
        str2.getClass();
        this.f25648 = str;
        this.f25647 = str2;
        this.f25646 = j;
        this.f25645 = j2;
        this.f25644 = i;
    }
}
