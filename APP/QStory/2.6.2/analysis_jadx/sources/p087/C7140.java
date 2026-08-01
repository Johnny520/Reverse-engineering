package p087;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7140 implements InterfaceC7190, InterfaceC7119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Set f19100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7190 f19102;

    public C7140(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        this.f19102 = interfaceC7190;
        this.f19101 = interfaceC7190.mo12355() + '?';
        this.f19100 = AbstractC7143.m12388(interfaceC7190);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7140) {
            return AbstractC4394.m8917(this.f19102, ((C7140) obj).f19102);
        }
        return false;
    }

    @Override // p091.InterfaceC7190
    public final List getAnnotations() {
        return this.f19102.getAnnotations();
    }

    @Override // p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return this.f19102.getKind();
    }

    public final int hashCode() {
        return this.f19102.hashCode() * 31;
    }

    @Override // p091.InterfaceC7190
    public final boolean isInline() {
        return this.f19102.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19102);
        sb.append('?');
        return sb.toString();
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        return this.f19102.mo12352(i);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return this.f19102.mo12353();
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        return this.f19102.mo12354(str);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo12383() {
        return true;
    }

    @Override // p087.InterfaceC7119
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12378() {
        return this.f19100;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12355() {
        return this.f19101;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        return this.f19102.mo12356(i);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        return this.f19102.mo12357(i);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        return this.f19102.mo12358(i);
    }
}
