package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14250;

    public AbstractC5600(Object obj) {
        this.f14250 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo10056 = mo10056();
        AbstractC5600 abstractC5600 = obj instanceof AbstractC5600 ? (AbstractC5600) obj : null;
        return AbstractC5227.m9466(objMo10056, abstractC5600 != null ? abstractC5600.mo10056() : null);
    }

    public final int hashCode() {
        Object objMo10056 = mo10056();
        if (objMo10056 != null) {
            return objMo10056.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo10056());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo10056() {
        return this.f14250;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC5714 mo10050(InterfaceC5318 interfaceC5318);
}
