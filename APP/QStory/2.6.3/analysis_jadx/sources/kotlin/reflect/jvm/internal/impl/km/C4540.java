package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4540 extends AbstractC4548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13245;

    public C4540(ArrayList arrayList) {
        this.f13245 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4540) && this.f13245.equals(((C4540) obj).f13245);
    }

    public final int hashCode() {
        return this.f13245.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f13245 + ')';
    }
}
