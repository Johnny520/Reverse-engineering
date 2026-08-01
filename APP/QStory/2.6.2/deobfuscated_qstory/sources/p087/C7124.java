package p087;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p091.C7191;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7124 implements InterfaceC7190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7191 f19067;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19068;

    public C7124(String str, C7191 c7191) {
        c7191.getClass();
        this.f19068 = str;
        this.f19067 = c7191;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7124)) {
            return false;
        }
        C7124 c7124 = (C7124) obj;
        return this.f19068.equals(c7124.f19068) && AbstractC4394.m8917(this.f19067, c7124.f19067);
    }

    @Override // p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return this.f19067;
    }

    public final int hashCode() {
        return (this.f19067.hashCode() * 31) + this.f19068.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("PrimitiveDescriptor("), this.f19068, ')');
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        m12379();
        throw null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return 0;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        m12379();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12379() {
        throw new IllegalStateException(AbstractC0053.m146(new StringBuilder("Primitive descriptor "), this.f19068, " does not have elements"));
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12355() {
        return this.f19068;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        m12379();
        throw null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        m12379();
        throw null;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        m12379();
        throw null;
    }
}
