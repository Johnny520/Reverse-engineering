package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13905;

    public AbstractC4768(Object obj) {
        this.f13905 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo9497 = mo9497();
        AbstractC4768 abstractC4768 = obj instanceof AbstractC4768 ? (AbstractC4768) obj : null;
        return AbstractC4395.m8907(objMo9497, abstractC4768 != null ? abstractC4768.mo9497() : null);
    }

    public final int hashCode() {
        Object objMo9497 = mo9497();
        if (objMo9497 != null) {
            return objMo9497.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo9497());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo9497() {
        return this.f13905;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC4882 mo9491(InterfaceC4486 interfaceC4486);
}
