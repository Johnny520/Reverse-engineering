package p103;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5227;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7970 implements InterfaceC8020, InterfaceC7949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Set f19440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8020 f19442;

    public C7970(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        this.f19442 = interfaceC8020;
        this.f19441 = interfaceC8020.mo12941() + '?';
        this.f19440 = AbstractC7973.m12974(interfaceC8020);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7970) {
            return AbstractC5227.m9466(this.f19442, ((C7970) obj).f19442);
        }
        return false;
    }

    @Override // p107.InterfaceC8020
    public final List getAnnotations() {
        return this.f19442.getAnnotations();
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return this.f19442.getKind();
    }

    public final int hashCode() {
        return this.f19442.hashCode() * 31;
    }

    @Override // p107.InterfaceC8020
    public final boolean isInline() {
        return this.f19442.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19442);
        sb.append('?');
        return sb.toString();
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        return this.f19442.mo12938(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return this.f19442.mo12939();
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        return this.f19442.mo12940(str);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo12969() {
        return true;
    }

    @Override // p103.InterfaceC7949
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12964() {
        return this.f19440;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return this.f19441;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        return this.f19442.mo12942(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        return this.f19442.mo12943(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        return this.f19442.mo12944(i);
    }
}
