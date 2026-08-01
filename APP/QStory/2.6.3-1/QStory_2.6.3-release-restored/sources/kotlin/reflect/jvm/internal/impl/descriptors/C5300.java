package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5520;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5300 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5520 f13443;

    public C5300(C5520 c5520, List list) {
        c5520.getClass();
        list.getClass();
        this.f13443 = c5520;
        this.f13442 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5300)) {
            return false;
        }
        C5300 c5300 = (C5300) obj;
        return AbstractC5227.m9466(this.f13443, c5300.f13443) && AbstractC5227.m9466(this.f13442, c5300.f13442);
    }

    public final int hashCode() {
        return this.f13442.hashCode() + (this.f13443.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f13443 + ", typeParametersCount=" + this.f13442 + ')';
    }
}
