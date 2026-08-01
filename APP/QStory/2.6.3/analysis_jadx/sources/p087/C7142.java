package p087;

import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7142 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7141 f19098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7184 f19099;

    public C7142(InterfaceC7184 interfaceC7184) {
        interfaceC7184.getClass();
        this.f19099 = interfaceC7184;
        this.f19098 = new C7141(interfaceC7184.getDescriptor());
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        if (interfaceC7187.mo10658()) {
            return interfaceC7187.mo10657(this.f19099);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7142.class == obj.getClass() && AbstractC4395.m8907(this.f19099, ((C7142) obj).f19099);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return this.f19098;
    }

    public final int hashCode() {
        return this.f19099.hashCode();
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        if (obj != null) {
            interfaceC7186.mo10705(this.f19099, obj);
        } else {
            interfaceC7186.mo10709();
        }
    }
}
