package p384;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9035 {
    public static final C9049 Companion = new C9049();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f25317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9043 f25318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f25319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25321;

    public /* synthetic */ C9035(int i, int i2, int i3, byte[] bArr, C9043 c9043, byte[] bArr2) {
        if ((i & 1) == 0) {
            this.f25321 = 0;
        } else {
            this.f25321 = i2;
        }
        if ((i & 2) == 0) {
            this.f25320 = 0;
        } else {
            this.f25320 = i3;
        }
        if ((i & 4) == 0) {
            this.f25319 = null;
        } else {
            this.f25319 = bArr;
        }
        if ((i & 8) == 0) {
            this.f25318 = null;
        } else {
            this.f25318 = c9043;
        }
        if ((i & 16) == 0) {
            this.f25317 = null;
        } else {
            this.f25317 = bArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9035)) {
            return false;
        }
        C9035 c9035 = (C9035) obj;
        return this.f25321 == c9035.f25321 && this.f25320 == c9035.f25320 && AbstractC4395.m8907(this.f25319, c9035.f25319) && AbstractC4395.m8907(this.f25318, c9035.f25318) && AbstractC4395.m8907(this.f25317, c9035.f25317);
    }

    public final int hashCode() {
        int iM144 = AbstractC0053.m144(this.f25320, Integer.hashCode(this.f25321) * 31, 31);
        byte[] bArr = this.f25319;
        int iHashCode = (iM144 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        C9043 c9043 = this.f25318;
        int iHashCode2 = (iHashCode + (c9043 == null ? 0 : c9043.hashCode())) * 31;
        byte[] bArr2 = this.f25317;
        return iHashCode2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1407));
        AbstractC6183.m11578(sb, this.f25321, 1396);
        AbstractC6183.m11578(sb, this.f25320, 1397);
        sb.append(Arrays.toString(this.f25319));
        sb.append(AbstractC8405.m13972(1398));
        sb.append(this.f25318);
        sb.append(AbstractC8405.m13972(1408));
        sb.append(Arrays.toString(this.f25317));
        sb.append(')');
        return sb.toString();
    }

    public C9035(int i, int i2, byte[] bArr, C9043 c9043, byte[] bArr2) {
        this.f25321 = i;
        this.f25320 = i2;
        this.f25319 = bArr;
        this.f25318 = c9043;
        this.f25317 = bArr2;
    }
}
