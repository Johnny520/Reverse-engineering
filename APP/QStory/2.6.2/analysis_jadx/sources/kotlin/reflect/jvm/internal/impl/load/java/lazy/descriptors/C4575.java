package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f13339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4881 f13342;

    public C4575(AbstractC4881 abstractC4881, List list, ArrayList arrayList, List list2) {
        list.getClass();
        list2.getClass();
        this.f13342 = abstractC4881;
        this.f13341 = list;
        this.f13340 = arrayList;
        this.f13339 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4575)) {
            return false;
        }
        C4575 c4575 = (C4575) obj;
        return this.f13342.equals(c4575.f13342) && AbstractC4394.m8917(this.f13341, c4575.f13341) && this.f13340.equals(c4575.f13340) && AbstractC4394.m8917(this.f13339, c4575.f13339);
    }

    public final int hashCode() {
        return this.f13339.hashCode() + AbstractC0053.m140((this.f13340.hashCode() + AbstractC0053.m159(this.f13341, this.f13342.hashCode() * 961, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f13342 + ", receiverType=null, valueParameters=" + this.f13341 + ", typeParameters=" + this.f13340 + ", hasStableParameterNames=false, errors=" + this.f13339 + ')';
    }
}
