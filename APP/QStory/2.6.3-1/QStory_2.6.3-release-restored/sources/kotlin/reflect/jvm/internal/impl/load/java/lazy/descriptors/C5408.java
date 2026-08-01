package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5408 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f13688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5714 f13691;

    public C5408(AbstractC5714 abstractC5714, List list, ArrayList arrayList, List list2) {
        list.getClass();
        list2.getClass();
        this.f13691 = abstractC5714;
        this.f13690 = list;
        this.f13689 = arrayList;
        this.f13688 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5408)) {
            return false;
        }
        C5408 c5408 = (C5408) obj;
        return this.f13691.equals(c5408.f13691) && AbstractC5227.m9466(this.f13690, c5408.f13690) && this.f13689.equals(c5408.f13689) && AbstractC5227.m9466(this.f13688, c5408.f13688);
    }

    public final int hashCode() {
        return this.f13688.hashCode() + AbstractC0900.m701((this.f13689.hashCode() + AbstractC0900.m720(this.f13690, this.f13691.hashCode() * 961, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f13691 + ", receiverType=null, valueParameters=" + this.f13690 + ", typeParameters=" + this.f13689 + ", hasStableParameterNames=false, errors=" + this.f13688 + ')';
    }
}
