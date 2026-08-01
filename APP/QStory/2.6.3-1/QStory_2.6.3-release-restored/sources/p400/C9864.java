package p400;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9864 {
    public static final C9878 Companion = new C9878();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f25662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9872 f25663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f25664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25666;

    public /* synthetic */ C9864(int i, int i2, int i3, byte[] bArr, C9872 c9872, byte[] bArr2) {
        if ((i & 1) == 0) {
            this.f25666 = 0;
        } else {
            this.f25666 = i2;
        }
        if ((i & 2) == 0) {
            this.f25665 = 0;
        } else {
            this.f25665 = i3;
        }
        if ((i & 4) == 0) {
            this.f25664 = null;
        } else {
            this.f25664 = bArr;
        }
        if ((i & 8) == 0) {
            this.f25663 = null;
        } else {
            this.f25663 = c9872;
        }
        if ((i & 16) == 0) {
            this.f25662 = null;
        } else {
            this.f25662 = bArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9864)) {
            return false;
        }
        C9864 c9864 = (C9864) obj;
        return this.f25666 == c9864.f25666 && this.f25665 == c9864.f25665 && AbstractC5227.m9466(this.f25664, c9864.f25664) && AbstractC5227.m9466(this.f25663, c9864.f25663) && AbstractC5227.m9466(this.f25662, c9864.f25662);
    }

    public final int hashCode() {
        int iM704 = AbstractC0900.m704(this.f25665, Integer.hashCode(this.f25666) * 31, 31);
        byte[] bArr = this.f25664;
        int iHashCode = (iM704 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        C9872 c9872 = this.f25663;
        int iHashCode2 = (iHashCode + (c9872 == null ? 0 : c9872.hashCode())) * 31;
        byte[] bArr2 = this.f25662;
        return iHashCode2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NewSyncPush(type=");
        AbstractC7012.m12137(sb, this.f25666, 1396);
        AbstractC7012.m12137(sb, this.f25665, 1397);
        sb.append(Arrays.toString(this.f25664));
        sb.append(", syncRecallContent=");
        sb.append(this.f25663);
        sb.append(", syncPushExtra=");
        sb.append(Arrays.toString(this.f25662));
        sb.append(')');
        return sb.toString();
    }

    public C9864(int i, int i2, byte[] bArr, C9872 c9872, byte[] bArr2) {
        this.f25666 = i;
        this.f25665 = i2;
        this.f25664 = bArr;
        this.f25663 = c9872;
        this.f25662 = bArr2;
    }
}
