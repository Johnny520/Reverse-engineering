package p088;

import java.util.Iterator;
import java.util.List;
import p087.C7102;
import p087.C7103;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7154 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7154 f19125 = new C7154();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7155 f19124 = C7155.f19127;

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC9124.m14661(interfaceC7186);
        return new C7156((List) new C7102(C7170.f19144, 0).m12375(interfaceC7186, null));
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19124;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C7156 c7156 = (C7156) obj;
        c7156.getClass();
        AbstractC9124.m14663(interfaceC7185);
        C7170 c7170 = C7170.f19144;
        InterfaceC7190 descriptor = c7170.getDescriptor();
        descriptor.getClass();
        C7103 c7103 = new C7103(descriptor, 1);
        int size = c7156.size();
        InterfaceC7187 interfaceC7187Mo10712 = interfaceC7185.mo10712(c7103, size);
        Iterator<AbstractC7175> it = c7156.iterator();
        for (int i = 0; i < size; i++) {
            interfaceC7187Mo10712.mo6791(c7103, i, c7170, it.next());
        }
        interfaceC7187Mo10712.mo6801(c7103);
    }
}
