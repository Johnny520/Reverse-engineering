package p088;

import java.util.Map;
import p087.C7076;
import p087.C7134;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7149 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7149 f19117 = new C7149();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7150 f19116 = C7150.f19119;

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC9124.m14661(interfaceC7186);
        return new C7151((Map) new C7076(C7134.f19094, C7170.f19144, 1).deserialize(interfaceC7186));
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19116;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C7151 c7151 = (C7151) obj;
        c7151.getClass();
        AbstractC9124.m14663(interfaceC7185);
        new C7076(C7134.f19094, C7170.f19144, 1).serialize(interfaceC7185, c7151);
    }
}
