package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6697 {
    public static final C6700 Companion = new C6700();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18109;

    public /* synthetic */ C6697(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18109 = bool;
        } else {
            AbstractC7144.m12420(i, 1, C6699.f18113.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6697) && AbstractC4395.m8907(this.f18109, ((C6697) obj).f18109);
    }

    public final int hashCode() {
        Boolean bool = this.f18109;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Roots(listChanged=" + this.f18109 + ')';
    }
}
