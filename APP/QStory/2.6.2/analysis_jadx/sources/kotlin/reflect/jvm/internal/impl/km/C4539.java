package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4539 extends AbstractC4547 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13241;

    public C4539(ArrayList arrayList) {
        this.f13241 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4539) && this.f13241.equals(((C4539) obj).f13241);
    }

    public final int hashCode() {
        return this.f13241.hashCode();
    }

    public final String toString() {
        return "ArrayValue(" + this.f13241 + ')';
    }
}
