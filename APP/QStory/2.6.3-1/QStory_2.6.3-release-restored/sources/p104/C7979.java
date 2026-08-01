package p104;

import com.bumptech.glide.AbstractC3898;
import java.util.Map;
import p103.C7906;
import p103.C7964;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7979 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7979 f19457 = new C7979();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7980 f19456 = C7980.f19459;

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC3898.m7410(interfaceC8016);
        return new C7981((Map) new C7906(C7964.f19434, C8000.f19484, 1).deserialize(interfaceC8016));
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19456;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7981 c7981 = (C7981) obj;
        c7981.getClass();
        AbstractC3898.m7412(interfaceC8015);
        new C7906(C7964.f19434, C8000.f19484, 1).serialize(interfaceC8015, c7981);
    }
}
