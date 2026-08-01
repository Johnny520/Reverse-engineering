package p103;

import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7971 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7970 f19443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8013 f19444;

    public C7971(InterfaceC8013 interfaceC8013) {
        interfaceC8013.getClass();
        this.f19444 = interfaceC8013;
        this.f19443 = new C7970(interfaceC8013.getDescriptor());
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        if (interfaceC8016.mo11217()) {
            return interfaceC8016.mo11216(this.f19444);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7971.class == obj.getClass() && AbstractC5227.m9466(this.f19444, ((C7971) obj).f19444);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return this.f19443;
    }

    public final int hashCode() {
        return this.f19444.hashCode();
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        if (obj != null) {
            interfaceC8015.mo11264(this.f19444, obj);
        } else {
            interfaceC8015.mo11268();
        }
    }
}
