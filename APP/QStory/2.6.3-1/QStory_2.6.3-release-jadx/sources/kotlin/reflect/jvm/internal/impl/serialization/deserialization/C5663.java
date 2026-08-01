package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p086.AbstractC7732;
import p086.InterfaceC7737;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5663 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5294 f14427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7732 f14428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Class f14429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7737 f14430;

    public C5663(InterfaceC7737 interfaceC7737, ProtoBuf$Class protoBuf$Class, AbstractC7732 abstractC7732, InterfaceC5294 interfaceC5294) {
        interfaceC7737.getClass();
        protoBuf$Class.getClass();
        abstractC7732.getClass();
        interfaceC5294.getClass();
        this.f14430 = interfaceC7737;
        this.f14429 = protoBuf$Class;
        this.f14428 = abstractC7732;
        this.f14427 = interfaceC5294;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5663)) {
            return false;
        }
        C5663 c5663 = (C5663) obj;
        return AbstractC5227.m9466(this.f14430, c5663.f14430) && AbstractC5227.m9466(this.f14429, c5663.f14429) && AbstractC5227.m9466(this.f14428, c5663.f14428) && AbstractC5227.m9466(this.f14427, c5663.f14427);
    }

    public final int hashCode() {
        return this.f14427.hashCode() + ((this.f14428.hashCode() + ((this.f14429.hashCode() + (this.f14430.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f14430 + ", classProto=" + this.f14429 + ", metadataVersion=" + this.f14428 + ", sourceElement=" + this.f14427 + ')';
    }
}
