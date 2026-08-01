package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import p023.C6986;
import p062.InterfaceC7310;
import p086.AbstractC7728;
import p086.C7735;
import p086.InterfaceC7737;
import p095.C7821;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5625 extends C7821 implements InterfaceC5617 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C6986 f14308;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC7737 f14309;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final InterfaceC5634 f14310;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C7735 f14311;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final ProtoBuf$Property f14312;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5625(InterfaceC5331 interfaceC5331, InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310, Modality modality, C5322 c5322, boolean z, C5523 c5523, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ProtoBuf$Property protoBuf$Property, InterfaceC7737 interfaceC7737, C6986 c6986, C7735 c7735, InterfaceC5634 interfaceC5634) {
        super(interfaceC5331, interfaceC5305, interfaceC7310, modality, c5322, z, c5523, callableMemberDescriptor$Kind, InterfaceC5294.f13436, z2, z3, z6, z4, z5);
        interfaceC5331.getClass();
        interfaceC7310.getClass();
        modality.getClass();
        c5322.getClass();
        c5523.getClass();
        callableMemberDescriptor$Kind.getClass();
        protoBuf$Property.getClass();
        interfaceC7737.getClass();
        c6986.getClass();
        c7735.getClass();
        this.f14312 = protoBuf$Property;
        this.f14309 = interfaceC7737;
        this.f14308 = c6986;
        this.f14311 = c7735;
        this.f14310 = interfaceC5634;
    }

    @Override // p095.C7821, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    public final boolean isExternal() {
        return AbstractC7728.f18721.mo12740(this.f14312.getFlags()).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C6986 mo10071() {
        return this.f14308;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC5634 mo10072() {
        return this.f14310;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final InterfaceC7737 mo10073() {
        return this.f14309;
    }

    @Override // p095.C7821
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final C7821 mo9698(InterfaceC5331 interfaceC5331, Modality modality, C5322 c5322, InterfaceC5305 interfaceC5305, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C5523 c5523) {
        interfaceC5331.getClass();
        modality.getClass();
        c5322.getClass();
        callableMemberDescriptor$Kind.getClass();
        c5523.getClass();
        return new C5625(interfaceC5331, interfaceC5305, getAnnotations(), modality, c5322, this.f19073, c5523, callableMemberDescriptor$Kind, this.f19060, this.f19059, isExternal(), this.f19068, this.f19070, this.f14312, this.f14309, this.f14308, this.f14311, this.f14310);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC5533 mo10075() {
        return this.f14312;
    }
}
