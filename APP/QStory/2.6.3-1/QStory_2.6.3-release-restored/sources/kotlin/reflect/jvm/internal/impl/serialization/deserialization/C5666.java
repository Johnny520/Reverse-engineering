package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5520;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5666 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5663 f14452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5520 f14453;

    public C5666(C5520 c5520, C5663 c5663) {
        c5520.getClass();
        this.f14453 = c5520;
        this.f14452 = c5663;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5666) {
            return AbstractC5227.m9466(this.f14453, ((C5666) obj).f14453);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14453.hashCode();
    }
}
