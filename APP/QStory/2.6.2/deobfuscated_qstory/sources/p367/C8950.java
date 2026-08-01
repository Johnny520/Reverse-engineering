package p367;

import org.luckypray.dexkit.exceptions.NonUniqueResultException;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8950 implements InterfaceC8955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NonUniqueResultException f25159;

    public C8950(NonUniqueResultException nonUniqueResultException) {
        this.f25159 = nonUniqueResultException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8950) && this.f25159 == ((C8950) obj).f25159;
    }

    public final int hashCode() {
        return this.f25159.hashCode();
    }

    public final String toString() {
        return "NonUnique(exception=" + this.f25159 + ")";
    }
}
