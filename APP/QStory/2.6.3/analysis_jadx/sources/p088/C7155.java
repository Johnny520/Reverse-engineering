package p088;

import com.bumptech.glide.AbstractC3066;
import java.util.Iterator;
import java.util.List;
import p087.C7103;
import p087.C7104;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7155 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7155 f19120 = new C7155();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7156 f19119 = C7156.f19122;

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC3066.m6850(interfaceC7187);
        return new C7157((List) new C7103(C7171.f19139, 0).m12402(interfaceC7187, null));
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19119;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C7157 c7157 = (C7157) obj;
        c7157.getClass();
        AbstractC3066.m6852(interfaceC7186);
        C7171 c7171 = C7171.f19139;
        InterfaceC7191 descriptor = c7171.getDescriptor();
        descriptor.getClass();
        C7104 c7104 = new C7104(descriptor, 1);
        int size = c7157.size();
        InterfaceC7188 interfaceC7188Mo10769 = interfaceC7186.mo10769(c7104, size);
        Iterator<AbstractC7176> it = c7157.iterator();
        for (int i = 0; i < size; i++) {
            interfaceC7188Mo10769.mo10719(c7104, i, c7171, it.next());
        }
        interfaceC7188Mo10769.mo10711(c7104);
    }
}
