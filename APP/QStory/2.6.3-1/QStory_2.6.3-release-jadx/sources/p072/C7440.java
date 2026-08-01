package p072;

import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7440 implements InterfaceC7625 {
    public static final C7444 Companion = new C7444();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7981 f18329;

    public C7440(int i, C7981 c7981) {
        if ((i & 1) == 0) {
            this.f18329 = AbstractC7431.f18321;
        } else {
            this.f18329 = c7981;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7440) && AbstractC5227.m9466(this.f18329, ((C7440) obj).f18329);
    }

    public final int hashCode() {
        return this.f18329.f19461.hashCode();
    }

    public final String toString() {
        return AbstractC7012.m12139(new StringBuilder("EmptyRequestResult(_meta="), this.f18329, ')');
    }

    public C7440() {
        C7981 c7981 = AbstractC7431.f18321;
        c7981.getClass();
        this.f18329 = c7981;
    }
}
