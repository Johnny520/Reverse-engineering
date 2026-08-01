package p370;

import kotlin.jvm.internal.AbstractC4395;
import org.luckypray.dexkit.exceptions.NoResultException;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8960 implements InterfaceC8964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NoResultException f25161;

    public /* synthetic */ C8960() {
        this(new NoResultException("No result found for query"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8960) && AbstractC4395.m8907(this.f25161, ((C8960) obj).f25161);
    }

    public final int hashCode() {
        return this.f25161.hashCode();
    }

    public final String toString() {
        return "NoResult(exception=" + this.f25161 + ")";
    }

    public C8960(NoResultException noResultException) {
        this.f25161 = noResultException;
    }
}
