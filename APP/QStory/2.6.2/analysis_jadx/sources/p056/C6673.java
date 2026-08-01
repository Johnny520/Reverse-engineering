package p056;

import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6673 implements InterfaceC6660 {
    public static final C6672 Companion = new C6672();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6726 f18081;

    public C6673(int i, InterfaceC6726 interfaceC6726, String str, C7151 c7151) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6675.f18083.getDescriptor());
            throw null;
        }
        this.f18081 = interfaceC6726;
        this.f18080 = str;
        if ((i & 4) == 0) {
            this.f18079 = AbstractC6601.f17981;
        } else {
            this.f18079 = c7151;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6673)) {
            return false;
        }
        C6673 c6673 = (C6673) obj;
        return AbstractC4394.m8917(this.f18081, c6673.f18081) && AbstractC4394.m8917(this.f18080, c6673.f18080) && AbstractC4394.m8917(this.f18079, c6673.f18079);
    }

    public final int hashCode() {
        return this.f18079.f19121.hashCode() + AbstractC6136.m11539(this.f18081.hashCode() * 31, 31, this.f18080);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCError(code=");
        sb.append(this.f18081);
        sb.append(", message=");
        sb.append(this.f18080);
        sb.append(", data=");
        return AbstractC6136.m11552(sb, this.f18079, ')');
    }

    public C6673(ErrorCode$Defined errorCode$Defined, String str) {
        C7151 c7151 = AbstractC6601.f17981;
        errorCode$Defined.getClass();
        c7151.getClass();
        this.f18081 = errorCode$Defined;
        this.f18080 = str;
        this.f18079 = c7151;
    }
}
