package p386;

import kotlin.jvm.internal.AbstractC5227;
import org.luckypray.dexkit.exceptions.NoResultException;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9789 implements InterfaceC9793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NoResultException f25506;

    public /* synthetic */ C9789() {
        this(new NoResultException("No result found for query"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9789) && AbstractC5227.m9466(this.f25506, ((C9789) obj).f25506);
    }

    public final int hashCode() {
        return this.f25506.hashCode();
    }

    public final String toString() {
        return "NoResult(exception=" + this.f25506 + ")";
    }

    public C9789(NoResultException noResultException) {
        this.f25506 = noResultException;
    }
}
