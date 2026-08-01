package p354;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8875 extends AbstractC8874 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25023;

    public C8875(String str, int i, int i2, boolean z) {
        AbstractC8405.m13972(1597);
        this.f25023 = i;
        this.f25022 = str;
        this.f25021 = i2;
        this.f25020 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8875)) {
            return false;
        }
        C8875 c8875 = (C8875) obj;
        return this.f25023 == c8875.f25023 && AbstractC4395.m8907(this.f25022, c8875.f25022) && this.f25021 == c8875.f25021 && this.f25020 == c8875.f25020;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25020) + AbstractC0053.m144(this.f25021, AbstractC6183.m11572(Integer.hashCode(this.f25023) * 31, 31, this.f25022), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(2922));
        AbstractC6183.m11578(sb, this.f25023, 2923);
        AbstractC6183.m11579(sb, this.f25022, 2924);
        AbstractC6183.m11578(sb, this.f25021, 2925);
        return AbstractC0053.m152(sb, this.f25020, ')');
    }
}
