package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4576 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f13343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4882 f13346;

    public C4576(AbstractC4882 abstractC4882, List list, ArrayList arrayList, List list2) {
        list.getClass();
        list2.getClass();
        this.f13346 = abstractC4882;
        this.f13345 = list;
        this.f13344 = arrayList;
        this.f13343 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4576)) {
            return false;
        }
        C4576 c4576 = (C4576) obj;
        return this.f13346.equals(c4576.f13346) && AbstractC4395.m8907(this.f13345, c4576.f13345) && this.f13344.equals(c4576.f13344) && AbstractC4395.m8907(this.f13343, c4576.f13343);
    }

    public final int hashCode() {
        return this.f13343.hashCode() + AbstractC0053.m141((this.f13344.hashCode() + AbstractC0053.m160(this.f13345, this.f13346.hashCode() * 961, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f13346 + ", receiverType=null, valueParameters=" + this.f13345 + ", typeParameters=" + this.f13344 + ", hasStableParameterNames=false, errors=" + this.f13343 + ')';
    }
}
