package p107;

import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5925;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8023 implements InterfaceC8020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f19540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5925 f19541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8019 f19542;

    public C8023(C8019 c8019, InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        this.f19542 = c8019;
        this.f19541 = interfaceC5925;
        this.f19540 = c8019.f19522 + '<' + interfaceC5925.getSimpleName() + '>';
    }

    public final boolean equals(Object obj) {
        C8023 c8023 = obj instanceof C8023 ? (C8023) obj : null;
        return c8023 != null && this.f19542.equals(c8023.f19542) && AbstractC5227.m9466(c8023.f19541, this.f19541);
    }

    @Override // p107.InterfaceC8020
    public final List getAnnotations() {
        return this.f19542.f19519;
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return this.f19542.f19521;
    }

    public final int hashCode() {
        return this.f19540.hashCode() + (this.f19541.hashCode() * 31);
    }

    @Override // p107.InterfaceC8020
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f19541 + ", original: " + this.f19542 + ')';
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        return this.f19542.f19517[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return this.f19542.f19520;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        return this.f19542.mo12940(str);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo12969() {
        return false;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return this.f19540;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        return this.f19542.f19524[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        return this.f19542.f19523[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        return this.f19542.f19527[i];
    }
}
