package p367;

import kotlin.jvm.internal.AbstractC4394;
import org.luckypray.dexkit.exceptions.NoResultException;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8951 implements InterfaceC8955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final NoResultException f25160;

    public /* synthetic */ C8951() {
        this(new NoResultException("No result found for query"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8951) && AbstractC4394.m8917(this.f25160, ((C8951) obj).f25160);
    }

    public final int hashCode() {
        return this.f25160.hashCode();
    }

    public final String toString() {
        return "NoResult(exception=" + this.f25160 + ")";
    }

    public C8951(NoResultException noResultException) {
        this.f25160 = noResultException;
    }
}
