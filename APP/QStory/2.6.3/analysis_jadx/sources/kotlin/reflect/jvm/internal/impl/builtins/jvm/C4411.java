package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.C4688;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4411 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4688 f12997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4688 f12998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4688 f12999;

    public C4411(C4688 c4688, C4688 c46882, C4688 c46883) {
        this.f12999 = c4688;
        this.f12998 = c46882;
        this.f12997 = c46883;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4411)) {
            return false;
        }
        C4411 c4411 = (C4411) obj;
        return this.f12999.equals(c4411.f12999) && this.f12998.equals(c4411.f12998) && this.f12997.equals(c4411.f12997);
    }

    public final int hashCode() {
        return this.f12997.hashCode() + ((this.f12998.hashCode() + (this.f12999.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f12999 + ", kotlinReadOnly=" + this.f12998 + ", kotlinMutable=" + this.f12997 + ')';
    }
}
