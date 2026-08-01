package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import p015.C6230;
import p046.InterfaceC6480;
import p070.AbstractC6898;
import p070.C6905;
import p070.InterfaceC6907;
import p079.C6991;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4792 extends C6991 implements InterfaceC4784 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C6230 f13959;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC6907 f13960;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final InterfaceC4801 f13961;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C6905 f13962;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final ProtoBuf$Property f13963;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4792(InterfaceC4498 interfaceC4498, InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480, Modality modality, C4489 c4489, boolean z, C4690 c4690, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ProtoBuf$Property protoBuf$Property, InterfaceC6907 interfaceC6907, C6230 c6230, C6905 c6905, InterfaceC4801 interfaceC4801) {
        super(interfaceC4498, interfaceC4472, interfaceC6480, modality, c4489, z, c4690, callableMemberDescriptor$Kind, InterfaceC4461.f13087, z2, z3, z6, z4, z5);
        interfaceC4498.getClass();
        interfaceC6480.getClass();
        modality.getClass();
        c4489.getClass();
        c4690.getClass();
        callableMemberDescriptor$Kind.getClass();
        protoBuf$Property.getClass();
        interfaceC6907.getClass();
        c6230.getClass();
        c6905.getClass();
        this.f13963 = protoBuf$Property;
        this.f13960 = interfaceC6907;
        this.f13959 = c6230;
        this.f13962 = c6905;
        this.f13961 = interfaceC4801;
    }

    @Override // p079.C6991, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return AbstractC6898.f18381.mo12153(this.f13963.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C6230 mo9522() {
        return this.f13959;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC4801 mo9523() {
        return this.f13961;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final InterfaceC6907 mo9524() {
        return this.f13960;
    }

    @Override // p079.C6991
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final C6991 mo9149(InterfaceC4498 interfaceC4498, Modality modality, C4489 c4489, InterfaceC4472 interfaceC4472, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C4690 c4690) {
        interfaceC4498.getClass();
        modality.getClass();
        c4489.getClass();
        callableMemberDescriptor$Kind.getClass();
        c4690.getClass();
        return new C4792(interfaceC4498, interfaceC4472, getAnnotations(), modality, c4489, this.f18733, c4690, callableMemberDescriptor$Kind, this.f18720, this.f18719, isExternal(), this.f18728, this.f18730, this.f13963, this.f13960, this.f13959, this.f13962, this.f13961);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC4700 mo9526() {
        return this.f13963;
    }
}
