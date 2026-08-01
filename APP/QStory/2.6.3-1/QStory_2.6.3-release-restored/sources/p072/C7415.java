package p072;

import p103.AbstractC7973;
import p103.C7917;
import p103.C7964;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7415 implements InterfaceC7908 {
    private static final InterfaceC8020 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7415 f18304;

    static {
        C7415 c7415 = new C7415();
        f18304 = c7415;
        C7917 c7917 = new C7917("io.modelcontextprotocol.kotlin.sdk.StopReason.Other", c7415);
        c7917.m12968("value", false);
        descriptor = c7917;
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{C7964.f19434};
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        String strMo11221 = interfaceC8016.mo11248(descriptor).mo11221();
        strMo11221.getClass();
        return new C7413(strMo11221);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        String str = ((C7413) obj).f18303;
        InterfaceC8015 interfaceC8015Mo11275 = interfaceC8015.mo11275(descriptor);
        if (interfaceC8015Mo11275 == null) {
            return;
        }
        interfaceC8015Mo11275.mo11208(str);
    }

    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
