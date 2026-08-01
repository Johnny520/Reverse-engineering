package kotlin.reflect.jvm.internal.impl.p009km;

import java.util.ArrayList;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5372 extends AbstractC5380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13590;

    public C5372(ArrayList arrayList) {
        this.f13590 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5372) && this.f13590.equals(((C5372) obj).f13590);
    }

    public final int hashCode() {
        return this.f13590.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f13590 + ')';
    }
}
