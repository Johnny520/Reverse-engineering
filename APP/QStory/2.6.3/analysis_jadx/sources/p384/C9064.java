package p384;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7181;
import p287.AbstractC8405;
import p333.C8787;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9064 {
    public static final C9010 Companion = new C9010();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f25358 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C8787(11))};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f25359;

    public C9064(int i, List list) {
        if ((i & 1) == 0) {
            this.f25359 = EmptyList.INSTANCE;
        } else {
            this.f25359 = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9064) && AbstractC4395.m8907(this.f25359, ((C9064) obj).f25359);
    }

    public final int hashCode() {
        return this.f25359.hashCode();
    }

    public final String toString() {
        return AbstractC8405.m13972(1447) + this.f25359 + ')';
    }
}
