package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6626 implements InterfaceC6840 {
    public static final C6627 Companion = new C6627();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6816 f18010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6628 f18012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6827 f18013;

    public C6626(int i, InterfaceC6827 interfaceC6827, C6628 c6628, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6694.f18107.getDescriptor());
            throw null;
        }
        this.f18013 = interfaceC6827;
        this.f18012 = c6628;
        if ((i & 4) == 0) {
            this.f18011 = AbstractC6602.f17976;
        } else {
            this.f18011 = c7152;
        }
        if ((i & 8) == 0) {
            this.f18010 = Method$Defined.CompletionComplete;
        } else {
            this.f18010 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6626)) {
            return false;
        }
        C6626 c6626 = (C6626) obj;
        return AbstractC4395.m8907(this.f18013, c6626.f18013) && AbstractC4395.m8907(this.f18012, c6626.f18012) && AbstractC4395.m8907(this.f18011, c6626.f18011);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18010;
    }

    public final int hashCode() {
        return this.f18011.f19116.hashCode() + ((this.f18012.hashCode() + (this.f18013.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteRequest(ref=");
        sb.append(this.f18013);
        sb.append(", argument=");
        sb.append(this.f18012);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18011, ')');
    }
}
