package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.C4687;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4833 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4830 f14103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f14104;

    public C4833(C4687 c4687, C4830 c4830) {
        c4687.getClass();
        this.f14104 = c4687;
        this.f14103 = c4830;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4833) {
            return AbstractC4394.m8917(this.f14104, ((C4833) obj).f14104);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14104.hashCode();
    }
}
