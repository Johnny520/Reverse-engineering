package p384;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9057 {
    public static final C9063 Companion = new C9063();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f25341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25345;

    public /* synthetic */ C9057(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i & 1) == 0) {
            this.f25345 = 0;
        } else {
            this.f25345 = i2;
        }
        if ((i & 2) == 0) {
            this.f25344 = 0;
        } else {
            this.f25344 = i3;
        }
        if ((i & 4) == 0) {
            this.f25343 = 0;
        } else {
            this.f25343 = i4;
        }
        if ((i & 8) == 0) {
            this.f25342 = 0;
        } else {
            this.f25342 = i5;
        }
        if ((i & 16) == 0) {
            this.f25341 = 0L;
        } else {
            this.f25341 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9057)) {
            return false;
        }
        C9057 c9057 = (C9057) obj;
        return this.f25345 == c9057.f25345 && this.f25344 == c9057.f25344 && this.f25343 == c9057.f25343 && this.f25342 == c9057.f25342 && this.f25341 == c9057.f25341;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25341) + AbstractC0053.m144(this.f25342, AbstractC0053.m144(this.f25343, AbstractC0053.m144(this.f25344, Integer.hashCode(this.f25345) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1453));
        AbstractC6183.m11578(sb, this.f25345, 1454);
        AbstractC6183.m11578(sb, this.f25344, 1455);
        AbstractC6183.m11578(sb, this.f25343, 1359);
        AbstractC6183.m11578(sb, this.f25342, 1425);
        sb.append(this.f25341);
        sb.append(')');
        return sb.toString();
    }
}
