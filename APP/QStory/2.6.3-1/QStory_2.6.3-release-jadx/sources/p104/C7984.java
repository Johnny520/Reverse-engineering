package p104;

import com.bumptech.glide.AbstractC3898;
import java.util.Iterator;
import java.util.List;
import p103.C7932;
import p103.C7933;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7984 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7984 f19465 = new C7984();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7985 f19464 = C7985.f19467;

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC3898.m7410(interfaceC8016);
        return new C7986((List) new C7932(C8000.f19484, 0).m12961(interfaceC8016, null));
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19464;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C7986 c7986 = (C7986) obj;
        c7986.getClass();
        AbstractC3898.m7412(interfaceC8015);
        C8000 c8000 = C8000.f19484;
        InterfaceC8020 descriptor = c8000.getDescriptor();
        descriptor.getClass();
        C7933 c7933 = new C7933(descriptor, 1);
        int size = c7986.size();
        InterfaceC8017 interfaceC8017Mo11328 = interfaceC8015.mo11328(c7933, size);
        Iterator<AbstractC8005> it = c7986.iterator();
        for (int i = 0; i < size; i++) {
            interfaceC8017Mo11328.mo11278(c7933, i, c8000, it.next());
        }
        interfaceC8017Mo11328.mo11270(c7933);
    }
}
