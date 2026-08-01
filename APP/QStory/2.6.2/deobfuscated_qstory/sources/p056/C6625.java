package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6625 implements InterfaceC6839 {
    public static final C6626 Companion = new C6626();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6815 f18015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6627 f18017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6826 f18018;

    public C6625(int i, InterfaceC6826 interfaceC6826, C6627 c6627, C7151 c7151, InterfaceC6815 interfaceC6815) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6693.f18112.getDescriptor());
            throw null;
        }
        this.f18018 = interfaceC6826;
        this.f18017 = c6627;
        if ((i & 4) == 0) {
            this.f18016 = AbstractC6601.f17981;
        } else {
            this.f18016 = c7151;
        }
        if ((i & 8) == 0) {
            this.f18015 = Method$Defined.CompletionComplete;
        } else {
            this.f18015 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6625)) {
            return false;
        }
        C6625 c6625 = (C6625) obj;
        return AbstractC4394.m8917(this.f18018, c6625.f18018) && AbstractC4394.m8917(this.f18017, c6625.f18017) && AbstractC4394.m8917(this.f18016, c6625.f18016);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18015;
    }

    public final int hashCode() {
        return this.f18016.f19121.hashCode() + ((this.f18017.hashCode() + (this.f18018.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteRequest(ref=");
        sb.append(this.f18018);
        sb.append(", argument=");
        sb.append(this.f18017);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18016, ')');
    }
}
