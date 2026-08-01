package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9028 {
    public static final C9029 Companion = new C9029();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25310;

    public /* synthetic */ C9028(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C9030.f25311.getDescriptor());
            throw null;
        }
        this.f25310 = str;
        this.f25309 = str2;
        this.f25308 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9028)) {
            return false;
        }
        C9028 c9028 = (C9028) obj;
        return AbstractC4395.m8907(this.f25310, c9028.f25310) && AbstractC4395.m8907(this.f25309, c9028.f25309) && this.f25308 == c9028.f25308;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25308) + AbstractC6183.m11572(this.f25310.hashCode() * 31, 31, this.f25309);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1363));
        AbstractC6183.m11579(sb, this.f25310, 1364);
        AbstractC6183.m11579(sb, this.f25309, 1359);
        return AbstractC0053.m156(sb, this.f25308, ')');
    }

    public C9028(int i, String str, String str2) {
        AbstractC8405.m13972(1361);
        str.getClass();
        AbstractC8405.m13972(1362);
        str2.getClass();
        this.f25310 = str;
        this.f25309 = str2;
        this.f25308 = i;
    }
}
