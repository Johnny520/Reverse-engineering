package p349;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C8848 {
    public static final C8849 Companion = new C8849();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final byte[] f24948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24951;

    public /* synthetic */ C8848(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        if ((i & 1) == 0) {
            this.f24951 = 0;
        } else {
            this.f24951 = i2;
        }
        if ((i & 2) == 0) {
            this.f24950 = 0;
        } else {
            this.f24950 = i3;
        }
        if ((i & 4) == 0) {
            this.f24949 = 0;
        } else {
            this.f24949 = i4;
        }
        if ((i & 8) == 0) {
            this.f24948 = new byte[0];
        } else {
            this.f24948 = bArr;
        }
        if ((i & 16) == 0) {
            this.f24947 = 0;
        } else {
            this.f24947 = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8848.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC8405.m13972(2822);
        obj.getClass();
        C8848 c8848 = (C8848) obj;
        return this.f24951 == c8848.f24951 && this.f24950 == c8848.f24950 && Arrays.equals(this.f24948, c8848.f24948);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24948) + (((this.f24951 * 31) + this.f24950) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2823));
        AbstractC6183.m11578(sb, this.f24951, 2824);
        AbstractC6183.m11578(sb, this.f24950, 2825);
        AbstractC6183.m11578(sb, this.f24949, 2826);
        sb.append(Arrays.toString(this.f24948));
        sb.append(AbstractC8405.m13972(2827));
        return AbstractC0053.m156(sb, this.f24947, ')');
    }

    public C8848(byte[] bArr) {
        AbstractC8405.m13972(2820);
        this.f24951 = 36994;
        this.f24950 = 1;
        this.f24949 = 0;
        this.f24948 = bArr;
        this.f24947 = 1;
    }
}
