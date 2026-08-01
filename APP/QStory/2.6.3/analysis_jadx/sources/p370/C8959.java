package p370;

import org.luckypray.dexkit.exceptions.NonUniqueResultException;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8959 implements InterfaceC8964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NonUniqueResultException f25160;

    public C8959(NonUniqueResultException nonUniqueResultException) {
        this.f25160 = nonUniqueResultException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8959) && this.f25160 == ((C8959) obj).f25160;
    }

    public final int hashCode() {
        return this.f25160.hashCode();
    }

    public final String toString() {
        return "NonUnique(exception=" + this.f25160 + ")";
    }
}
