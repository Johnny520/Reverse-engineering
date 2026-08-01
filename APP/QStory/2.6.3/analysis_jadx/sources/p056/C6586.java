package p056;

import p087.AbstractC7144;
import p087.C7088;
import p087.C7135;
import p087.InterfaceC7079;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6586 implements InterfaceC7079 {
    private static final InterfaceC7191 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6586 f17959;

    static {
        C6586 c6586 = new C6586();
        f17959 = c6586;
        C7088 c7088 = new C7088("io.modelcontextprotocol.kotlin.sdk.StopReason.Other", c6586);
        c7088.m12409("value", false);
        descriptor = c7088;
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] childSerializers() {
        return new InterfaceC7184[]{C7135.f19089};
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        String strMo10662 = interfaceC7187.mo10689(descriptor).mo10662();
        strMo10662.getClass();
        return new C6584(strMo10662);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        String str = ((C6584) obj).f17958;
        InterfaceC7186 interfaceC7186Mo10716 = interfaceC7186.mo10716(descriptor);
        if (interfaceC7186Mo10716 == null) {
            return;
        }
        interfaceC7186Mo10716.mo10649(str);
    }

    @Override // p087.InterfaceC7079
    public final InterfaceC7184[] typeParametersSerializers() {
        return AbstractC7144.f19103;
    }
}
