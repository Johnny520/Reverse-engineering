package p056;

import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6674 implements InterfaceC6661 {
    public static final C6673 Companion = new C6673();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6727 f18076;

    public C6674(int i, InterfaceC6727 interfaceC6727, String str, C7152 c7152) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6676.f18078.getDescriptor());
            throw null;
        }
        this.f18076 = interfaceC6727;
        this.f18075 = str;
        if ((i & 4) == 0) {
            this.f18074 = AbstractC6602.f17976;
        } else {
            this.f18074 = c7152;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6674)) {
            return false;
        }
        C6674 c6674 = (C6674) obj;
        return AbstractC4395.m8907(this.f18076, c6674.f18076) && AbstractC4395.m8907(this.f18075, c6674.f18075) && AbstractC4395.m8907(this.f18074, c6674.f18074);
    }

    public final int hashCode() {
        return this.f18074.f19116.hashCode() + AbstractC6183.m11572(this.f18076.hashCode() * 31, 31, this.f18075);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCError(code=");
        sb.append(this.f18076);
        sb.append(", message=");
        sb.append(this.f18075);
        sb.append(", data=");
        return AbstractC6183.m11580(sb, this.f18074, ')');
    }

    public C6674(ErrorCode$Defined errorCode$Defined, String str) {
        C7152 c7152 = AbstractC6602.f17976;
        errorCode$Defined.getClass();
        c7152.getClass();
        this.f18076 = errorCode$Defined;
        this.f18075 = str;
        this.f18074 = c7152;
    }
}
