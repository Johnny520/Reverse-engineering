package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p070.AbstractC6903;
import p070.InterfaceC6908;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4831 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4462 f14082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6903 f14083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Class f14084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6908 f14085;

    public C4831(InterfaceC6908 interfaceC6908, ProtoBuf$Class protoBuf$Class, AbstractC6903 abstractC6903, InterfaceC4462 interfaceC4462) {
        interfaceC6908.getClass();
        protoBuf$Class.getClass();
        abstractC6903.getClass();
        interfaceC4462.getClass();
        this.f14085 = interfaceC6908;
        this.f14084 = protoBuf$Class;
        this.f14083 = abstractC6903;
        this.f14082 = interfaceC4462;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4831)) {
            return false;
        }
        C4831 c4831 = (C4831) obj;
        return AbstractC4395.m8907(this.f14085, c4831.f14085) && AbstractC4395.m8907(this.f14084, c4831.f14084) && AbstractC4395.m8907(this.f14083, c4831.f14083) && AbstractC4395.m8907(this.f14082, c4831.f14082);
    }

    public final int hashCode() {
        return this.f14082.hashCode() + ((this.f14083.hashCode() + ((this.f14084.hashCode() + (this.f14085.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f14085 + ", classProto=" + this.f14084 + ", metadataVersion=" + this.f14083 + ", sourceElement=" + this.f14082 + ')';
    }
}
