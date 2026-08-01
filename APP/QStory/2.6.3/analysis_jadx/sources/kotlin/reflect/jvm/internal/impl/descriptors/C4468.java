package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4688;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f13097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4688 f13098;

    public C4468(C4688 c4688, List list) {
        c4688.getClass();
        list.getClass();
        this.f13098 = c4688;
        this.f13097 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4468)) {
            return false;
        }
        C4468 c4468 = (C4468) obj;
        return AbstractC4395.m8907(this.f13098, c4468.f13098) && AbstractC4395.m8907(this.f13097, c4468.f13097);
    }

    public final int hashCode() {
        return this.f13097.hashCode() + (this.f13098.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f13098 + ", typeParametersCount=" + this.f13097 + ')';
    }
}
