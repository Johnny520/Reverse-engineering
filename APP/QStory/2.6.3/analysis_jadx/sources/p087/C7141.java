package p087;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4395;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7141 implements InterfaceC7191, InterfaceC7120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Set f19095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7191 f19097;

    public C7141(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        this.f19097 = interfaceC7191;
        this.f19096 = interfaceC7191.mo12382() + '?';
        this.f19095 = AbstractC7144.m12415(interfaceC7191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7141) {
            return AbstractC4395.m8907(this.f19097, ((C7141) obj).f19097);
        }
        return false;
    }

    @Override // p091.InterfaceC7191
    public final List getAnnotations() {
        return this.f19097.getAnnotations();
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return this.f19097.getKind();
    }

    public final int hashCode() {
        return this.f19097.hashCode() * 31;
    }

    @Override // p091.InterfaceC7191
    public final boolean isInline() {
        return this.f19097.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19097);
        sb.append('?');
        return sb.toString();
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        return this.f19097.mo12379(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return this.f19097.mo12380();
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        return this.f19097.mo12381(str);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo12410() {
        return true;
    }

    @Override // p087.InterfaceC7120
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12405() {
        return this.f19095;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return this.f19096;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        return this.f19097.mo12383(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        return this.f19097.mo12384(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        return this.f19097.mo12385(i);
    }
}
