package p091;

import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5093;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7194 implements InterfaceC7191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f19195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5093 f19196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7190 f19197;

    public C7194(C7190 c7190, InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        this.f19197 = c7190;
        this.f19196 = interfaceC5093;
        this.f19195 = c7190.f19177 + '<' + interfaceC5093.getSimpleName() + '>';
    }

    public final boolean equals(Object obj) {
        C7194 c7194 = obj instanceof C7194 ? (C7194) obj : null;
        return c7194 != null && this.f19197.equals(c7194.f19197) && AbstractC4395.m8907(c7194.f19196, this.f19196);
    }

    @Override // p091.InterfaceC7191
    public final List getAnnotations() {
        return this.f19197.f19174;
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return this.f19197.f19176;
    }

    public final int hashCode() {
        return this.f19195.hashCode() + (this.f19196.hashCode() * 31);
    }

    @Override // p091.InterfaceC7191
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f19196 + ", original: " + this.f19197 + ')';
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        return this.f19197.f19172[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return this.f19197.f19175;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        return this.f19197.mo12381(str);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo12410() {
        return false;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return this.f19195;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        return this.f19197.f19179[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        return this.f19197.f19178[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        return this.f19197.f19182[i];
    }
}
