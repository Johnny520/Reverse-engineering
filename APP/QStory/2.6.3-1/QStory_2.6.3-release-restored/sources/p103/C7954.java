package p103;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p107.C8021;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7954 implements InterfaceC8020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8021 f19407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19408;

    public C7954(String str, C8021 c8021) {
        c8021.getClass();
        this.f19408 = str;
        this.f19407 = c8021;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7954)) {
            return false;
        }
        C7954 c7954 = (C7954) obj;
        return this.f19408.equals(c7954.f19408) && AbstractC5227.m9466(this.f19407, c7954.f19407);
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return this.f19407;
    }

    public final int hashCode() {
        return (this.f19407.hashCode() * 31) + this.f19408.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("PrimitiveDescriptor("), this.f19408, ')');
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        m12965();
        throw null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return 0;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        m12965();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12965() {
        throw new IllegalStateException(AbstractC0900.m711(new StringBuilder("Primitive descriptor "), this.f19408, " does not have elements"));
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return this.f19408;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        m12965();
        throw null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        m12965();
        throw null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        m12965();
        throw null;
    }
}
