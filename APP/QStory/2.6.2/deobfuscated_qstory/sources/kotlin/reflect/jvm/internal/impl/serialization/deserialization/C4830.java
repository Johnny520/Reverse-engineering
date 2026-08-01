package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p070.AbstractC6902;
import p070.InterfaceC6907;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4830 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4461 f14078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6902 f14079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Class f14080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6907 f14081;

    public C4830(InterfaceC6907 interfaceC6907, ProtoBuf$Class protoBuf$Class, AbstractC6902 abstractC6902, InterfaceC4461 interfaceC4461) {
        interfaceC6907.getClass();
        protoBuf$Class.getClass();
        abstractC6902.getClass();
        interfaceC4461.getClass();
        this.f14081 = interfaceC6907;
        this.f14080 = protoBuf$Class;
        this.f14079 = abstractC6902;
        this.f14078 = interfaceC4461;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4830)) {
            return false;
        }
        C4830 c4830 = (C4830) obj;
        return AbstractC4394.m8917(this.f14081, c4830.f14081) && AbstractC4394.m8917(this.f14080, c4830.f14080) && AbstractC4394.m8917(this.f14079, c4830.f14079) && AbstractC4394.m8917(this.f14078, c4830.f14078);
    }

    public final int hashCode() {
        return this.f14078.hashCode() + ((this.f14079.hashCode() + ((this.f14080.hashCode() + (this.f14081.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f14081 + ", classProto=" + this.f14080 + ", metadataVersion=" + this.f14079 + ", sourceElement=" + this.f14078 + ')';
    }
}
