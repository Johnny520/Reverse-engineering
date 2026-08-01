package p104;

import com.bumptech.glide.AbstractC3898;
import io.ktor.util.C5039;
import io.ktor.util.C5043;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8019;
import p107.C8022;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8000 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8000 f19484 = new C8000();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8019 f19483 = AbstractC9004.m14207("kotlinx.serialization.json.JsonElement", C8022.f19539, new InterfaceC8020[0], new C5039(27));

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        return AbstractC3898.m7410(interfaceC8016).mo11240();
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19483;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        AbstractC8005 abstractC8005 = (AbstractC8005) obj;
        abstractC8005.getClass();
        AbstractC3898.m7412(interfaceC8015);
        if (abstractC8005 instanceof AbstractC7977) {
            interfaceC8015.mo11264(C7983.f19463, abstractC8005);
            return;
        }
        if (abstractC8005 instanceof C7981) {
            interfaceC8015.mo11264(C7979.f19457, abstractC8005);
        } else if (abstractC8005 instanceof C7986) {
            interfaceC8015.mo11264(C7984.f19465, abstractC8005);
        } else {
            C5043.m9170();
        }
    }
}
