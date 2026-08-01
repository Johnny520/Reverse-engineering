package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4688;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4831 f14107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4688 f14108;

    public C4834(C4688 c4688, C4831 c4831) {
        c4688.getClass();
        this.f14108 = c4688;
        this.f14107 = c4831;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4834) {
            return AbstractC4395.m8907(this.f14108, ((C4834) obj).f14108);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14108.hashCode();
    }
}
