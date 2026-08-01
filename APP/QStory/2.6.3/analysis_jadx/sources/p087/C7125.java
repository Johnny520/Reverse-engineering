package p087;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import p091.C7192;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7125 implements InterfaceC7191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7192 f19062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19063;

    public C7125(String str, C7192 c7192) {
        c7192.getClass();
        this.f19063 = str;
        this.f19062 = c7192;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7125)) {
            return false;
        }
        C7125 c7125 = (C7125) obj;
        return this.f19063.equals(c7125.f19063) && AbstractC4395.m8907(this.f19062, c7125.f19062);
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        return this.f19062;
    }

    public final int hashCode() {
        return (this.f19062.hashCode() * 31) + this.f19063.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("PrimitiveDescriptor("), this.f19063, ')');
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        m12406();
        throw null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return 0;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        m12406();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12406() {
        throw new IllegalStateException(AbstractC0053.m151(new StringBuilder("Primitive descriptor "), this.f19063, " does not have elements"));
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return this.f19063;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        m12406();
        throw null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        m12406();
        throw null;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        m12406();
        throw null;
    }
}
