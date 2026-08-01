package p365;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import p025.AbstractC7012;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9677 {
    public static final C9678 Companion = new C9678();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final byte[] f25293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25296;

    public /* synthetic */ C9677(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        if ((i & 1) == 0) {
            this.f25296 = 0;
        } else {
            this.f25296 = i2;
        }
        if ((i & 2) == 0) {
            this.f25295 = 0;
        } else {
            this.f25295 = i3;
        }
        if ((i & 4) == 0) {
            this.f25294 = 0;
        } else {
            this.f25294 = i4;
        }
        if ((i & 8) == 0) {
            this.f25293 = new byte[0];
        } else {
            this.f25293 = bArr;
        }
        if ((i & 16) == 0) {
            this.f25292 = 0;
        } else {
            this.f25292 = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9677.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9234.m14531(2822);
        obj.getClass();
        C9677 c9677 = (C9677) obj;
        return this.f25296 == c9677.f25296 && this.f25295 == c9677.f25295 && Arrays.equals(this.f25293, c9677.f25293);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25293) + (((this.f25296 * 31) + this.f25295) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(2823));
        AbstractC7012.m12137(sb, this.f25296, 2824);
        AbstractC7012.m12137(sb, this.f25295, 2825);
        AbstractC7012.m12137(sb, this.f25294, 2826);
        sb.append(Arrays.toString(this.f25293));
        sb.append(AbstractC9234.m14531(2827));
        return AbstractC0900.m716(sb, this.f25292, ')');
    }

    public C9677(byte[] bArr) {
        AbstractC9234.m14531(2820);
        this.f25296 = 36994;
        this.f25295 = 1;
        this.f25294 = 0;
        this.f25293 = bArr;
        this.f25292 = 1;
    }
}
