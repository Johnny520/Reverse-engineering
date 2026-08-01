package p056;

import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6632 implements InterfaceC6796 {
    public static final C6624 Companion = new C6624();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6633 f18019;

    public C6632(int i, C6633 c6633, C7152 c7152) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6625.f18009.getDescriptor());
            throw null;
        }
        this.f18019 = c6633;
        if ((i & 2) == 0) {
            this.f18018 = AbstractC6602.f17976;
        } else {
            this.f18018 = c7152;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6632)) {
            return false;
        }
        C6632 c6632 = (C6632) obj;
        return AbstractC4395.m8907(this.f18019, c6632.f18019) && AbstractC4395.m8907(this.f18018, c6632.f18018);
    }

    public final int hashCode() {
        return this.f18018.f19116.hashCode() + (this.f18019.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteResult(completion=");
        sb.append(this.f18019);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18018, ')');
    }
}
