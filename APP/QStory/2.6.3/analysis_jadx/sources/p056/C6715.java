package p056;

import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6715 implements InterfaceC6796 {
    public static final C6716 Companion = new C6716();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7152 f18142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6721 f18143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6761 f18144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18145;

    public C6715(int i, String str, C6761 c6761, C6721 c6721, C7152 c7152) {
        if (4 != (i & 4)) {
            AbstractC7144.m12420(i, 4, C6713.f18136.getDescriptor());
            throw null;
        }
        this.f18145 = (i & 1) == 0 ? "2024-11-05" : str;
        if ((i & 2) == 0) {
            this.f18144 = new C6761(null, null, null, 63);
        } else {
            this.f18144 = c6761;
        }
        this.f18143 = c6721;
        if ((i & 8) == 0) {
            this.f18142 = AbstractC6602.f17976;
        } else {
            this.f18142 = c7152;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6715)) {
            return false;
        }
        C6715 c6715 = (C6715) obj;
        return AbstractC4395.m8907(this.f18145, c6715.f18145) && AbstractC4395.m8907(this.f18144, c6715.f18144) && AbstractC4395.m8907(this.f18143, c6715.f18143) && AbstractC4395.m8907(this.f18142, c6715.f18142);
    }

    public final int hashCode() {
        return this.f18142.f19116.hashCode() + ((this.f18143.hashCode() + ((this.f18144.hashCode() + (this.f18145.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitializeResult(protocolVersion=");
        sb.append(this.f18145);
        sb.append(", capabilities=");
        sb.append(this.f18144);
        sb.append(", serverInfo=");
        sb.append(this.f18143);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18142, ')');
    }

    public C6715(String str, C6761 c6761, C6721 c6721) {
        C7152 c7152 = AbstractC6602.f17976;
        str.getClass();
        c6761.getClass();
        c6721.getClass();
        c7152.getClass();
        this.f18145 = str;
        this.f18144 = c6761;
        this.f18143 = c6721;
        this.f18142 = c7152;
    }
}
