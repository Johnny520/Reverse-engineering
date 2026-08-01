package p091;

import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.types.AbstractC4921;

/* JADX INFO: renamed from: 飘花落叶言世苏兰楪子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7193 implements InterfaceC7190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f19200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5092 f19201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7189 f19202;

    public C7193(C7189 c7189, InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        this.f19202 = c7189;
        this.f19201 = interfaceC5092;
        this.f19200 = c7189.f19182 + '<' + interfaceC5092.getSimpleName() + '>';
    }

    public final boolean equals(Object obj) {
        C7193 c7193 = obj instanceof C7193 ? (C7193) obj : null;
        return c7193 != null && this.f19202.equals(c7193.f19202) && AbstractC4394.m8917(c7193.f19201, this.f19201);
    }

    @Override // p091.InterfaceC7190
    public final List getAnnotations() {
        return this.f19202.f19179;
    }

    @Override // p091.InterfaceC7190
    public final AbstractC4921 getKind() {
        return this.f19202.f19181;
    }

    public final int hashCode() {
        return this.f19200.hashCode() + (this.f19201.hashCode() * 31);
    }

    @Override // p091.InterfaceC7190
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f19201 + ", original: " + this.f19202 + ')';
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        return this.f19202.f19177[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return this.f19202.f19180;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        return this.f19202.mo12354(str);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo12383() {
        return false;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12355() {
        return this.f19200;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7190 mo12356(int i) {
        return this.f19202.f19184[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        return this.f19202.f19183[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        return this.f19202.f19187[i];
    }
}
