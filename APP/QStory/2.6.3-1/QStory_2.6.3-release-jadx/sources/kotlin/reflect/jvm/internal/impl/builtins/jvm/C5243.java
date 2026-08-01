package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.C5520;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5243 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5520 f13342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5520 f13343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5520 f13344;

    public C5243(C5520 c5520, C5520 c55202, C5520 c55203) {
        this.f13344 = c5520;
        this.f13343 = c55202;
        this.f13342 = c55203;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5243)) {
            return false;
        }
        C5243 c5243 = (C5243) obj;
        return this.f13344.equals(c5243.f13344) && this.f13343.equals(c5243.f13343) && this.f13342.equals(c5243.f13342);
    }

    public final int hashCode() {
        return this.f13342.hashCode() + ((this.f13343.hashCode() + (this.f13344.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f13344 + ", kotlinReadOnly=" + this.f13343 + ", kotlinMutable=" + this.f13342 + ')';
    }
}
