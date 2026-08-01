package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13901;

    public AbstractC4767(Object obj) {
        this.f13901 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo9507 = mo9507();
        AbstractC4767 abstractC4767 = obj instanceof AbstractC4767 ? (AbstractC4767) obj : null;
        return AbstractC4394.m8917(objMo9507, abstractC4767 != null ? abstractC4767.mo9507() : null);
    }

    public final int hashCode() {
        Object objMo9507 = mo9507();
        if (objMo9507 != null) {
            return objMo9507.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo9507());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo9507() {
        return this.f13901;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC4881 mo9501(InterfaceC4485 interfaceC4485);
}
