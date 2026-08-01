package p087;

import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7141 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7140 f19103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7183 f19104;

    public C7141(InterfaceC7183 interfaceC7183) {
        interfaceC7183.getClass();
        this.f19104 = interfaceC7183;
        this.f19103 = new C7140(interfaceC7183.getDescriptor());
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        if (interfaceC7186.mo6865()) {
            return interfaceC7186.mo10644(this.f19104);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7141.class == obj.getClass() && AbstractC4394.m8917(this.f19104, ((C7141) obj).f19104);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return this.f19103;
    }

    public final int hashCode() {
        return this.f19104.hashCode();
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        if (obj != null) {
            interfaceC7185.mo10670(this.f19104, obj);
        } else {
            interfaceC7185.mo6799();
        }
    }
}
