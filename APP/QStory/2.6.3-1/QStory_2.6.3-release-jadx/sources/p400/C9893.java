package p400;

import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;
import p303.AbstractC9234;
import p349.C9616;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9893 {
    public static final C9839 Companion = new C9839();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f25703 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C9616(11))};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f25704;

    public C9893(int i, List list) {
        if ((i & 1) == 0) {
            this.f25704 = EmptyList.INSTANCE;
        } else {
            this.f25704 = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9893) && AbstractC5227.m9466(this.f25704, ((C9893) obj).f25704);
    }

    public final int hashCode() {
        return this.f25704.hashCode();
    }

    public final String toString() {
        return AbstractC9234.m14531(1447) + this.f25704 + ')';
    }
}
