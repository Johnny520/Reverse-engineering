package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import p007.C6157;
import p046.InterfaceC6481;
import p070.AbstractC6899;
import p070.C6906;
import p070.InterfaceC6908;
import p079.C6992;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4793 extends C6992 implements InterfaceC4785 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C6157 f13963;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC6908 f13964;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final InterfaceC4802 f13965;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C6906 f13966;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final ProtoBuf$Property f13967;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4793(InterfaceC4499 interfaceC4499, InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481, Modality modality, C4490 c4490, boolean z, C4691 c4691, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ProtoBuf$Property protoBuf$Property, InterfaceC6908 interfaceC6908, C6157 c6157, C6906 c6906, InterfaceC4802 interfaceC4802) {
        super(interfaceC4499, interfaceC4473, interfaceC6481, modality, c4490, z, c4691, callableMemberDescriptor$Kind, InterfaceC4462.f13091, z2, z3, z6, z4, z5);
        interfaceC4499.getClass();
        interfaceC6481.getClass();
        modality.getClass();
        c4490.getClass();
        c4691.getClass();
        callableMemberDescriptor$Kind.getClass();
        protoBuf$Property.getClass();
        interfaceC6908.getClass();
        c6157.getClass();
        c6906.getClass();
        this.f13967 = protoBuf$Property;
        this.f13964 = interfaceC6908;
        this.f13963 = c6157;
        this.f13966 = c6906;
        this.f13965 = interfaceC4802;
    }

    @Override // p079.C6992, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    public final boolean isExternal() {
        return AbstractC6899.f18376.mo12181(this.f13967.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C6157 mo9512() {
        return this.f13963;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC4802 mo9513() {
        return this.f13965;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final InterfaceC6908 mo9514() {
        return this.f13964;
    }

    @Override // p079.C6992
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final C6992 mo9139(InterfaceC4499 interfaceC4499, Modality modality, C4490 c4490, InterfaceC4473 interfaceC4473, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C4691 c4691) {
        interfaceC4499.getClass();
        modality.getClass();
        c4490.getClass();
        callableMemberDescriptor$Kind.getClass();
        c4691.getClass();
        return new C4793(interfaceC4499, interfaceC4473, getAnnotations(), modality, c4490, this.f18728, c4691, callableMemberDescriptor$Kind, this.f18715, this.f18714, isExternal(), this.f18723, this.f18725, this.f13967, this.f13964, this.f13963, this.f13966, this.f13965);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC4701 mo9516() {
        return this.f13967;
    }
}
