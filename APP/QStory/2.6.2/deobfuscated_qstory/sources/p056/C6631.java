package p056;

import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6631 implements InterfaceC6795 {
    public static final C6623 Companion = new C6623();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6632 f18024;

    public C6631(int i, C6632 c6632, C7151 c7151) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6624.f18014.getDescriptor());
            throw null;
        }
        this.f18024 = c6632;
        if ((i & 2) == 0) {
            this.f18023 = AbstractC6601.f17981;
        } else {
            this.f18023 = c7151;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6631)) {
            return false;
        }
        C6631 c6631 = (C6631) obj;
        return AbstractC4394.m8917(this.f18024, c6631.f18024) && AbstractC4394.m8917(this.f18023, c6631.f18023);
    }

    public final int hashCode() {
        return this.f18023.f19121.hashCode() + (this.f18024.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteResult(completion=");
        sb.append(this.f18024);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18023, ')');
    }
}
