package p072;

import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7503 implements InterfaceC7490 {
    public static final C7502 Companion = new C7502();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7556 f18421;

    public C7503(int i, InterfaceC7556 interfaceC7556, String str, C7981 c7981) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7505.f18423.getDescriptor());
            throw null;
        }
        this.f18421 = interfaceC7556;
        this.f18420 = str;
        if ((i & 4) == 0) {
            this.f18419 = AbstractC7431.f18321;
        } else {
            this.f18419 = c7981;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7503)) {
            return false;
        }
        C7503 c7503 = (C7503) obj;
        return AbstractC5227.m9466(this.f18421, c7503.f18421) && AbstractC5227.m9466(this.f18420, c7503.f18420) && AbstractC5227.m9466(this.f18419, c7503.f18419);
    }

    public final int hashCode() {
        return this.f18419.f19461.hashCode() + AbstractC7012.m12131(this.f18421.hashCode() * 31, 31, this.f18420);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCError(code=");
        sb.append(this.f18421);
        sb.append(", message=");
        sb.append(this.f18420);
        sb.append(", data=");
        return AbstractC7012.m12139(sb, this.f18419, ')');
    }

    public C7503(ErrorCode$Defined errorCode$Defined, String str) {
        C7981 c7981 = AbstractC7431.f18321;
        errorCode$Defined.getClass();
        c7981.getClass();
        this.f18421 = errorCode$Defined;
        this.f18420 = str;
        this.f18419 = c7981;
    }
}
