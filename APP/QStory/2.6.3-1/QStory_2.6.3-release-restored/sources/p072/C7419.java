package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7419 implements InterfaceC7669 {
    public static final C7420 Companion = new C7420();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18310;

    public C7419(int i, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7421.f18311.getDescriptor());
            throw null;
        }
        this.f18310 = str;
        if ((i & 2) == 0) {
            this.f18309 = AbstractC7431.f18321;
        } else {
            this.f18309 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18308 = Method$Defined.ResourcesSubscribe;
        } else {
            this.f18308 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7419)) {
            return false;
        }
        C7419 c7419 = (C7419) obj;
        return AbstractC5227.m9466(this.f18310, c7419.f18310) && AbstractC5227.m9466(this.f18309, c7419.f18309);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18308;
    }

    public final int hashCode() {
        return this.f18309.f19461.hashCode() + (this.f18310.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscribeRequest(uri=");
        sb.append(this.f18310);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18309, ')');
    }
}
