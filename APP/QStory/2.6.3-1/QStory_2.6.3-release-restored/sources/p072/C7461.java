package p072;

import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7461 implements InterfaceC7625 {
    public static final C7453 Companion = new C7453();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7462 f18364;

    public C7461(int i, C7462 c7462, C7981 c7981) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7454.f18354.getDescriptor());
            throw null;
        }
        this.f18364 = c7462;
        if ((i & 2) == 0) {
            this.f18363 = AbstractC7431.f18321;
        } else {
            this.f18363 = c7981;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7461)) {
            return false;
        }
        C7461 c7461 = (C7461) obj;
        return AbstractC5227.m9466(this.f18364, c7461.f18364) && AbstractC5227.m9466(this.f18363, c7461.f18363);
    }

    public final int hashCode() {
        return this.f18363.f19461.hashCode() + (this.f18364.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteResult(completion=");
        sb.append(this.f18364);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18363, ')');
    }
}
