package p079;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6983 extends AbstractC7002 implements InterfaceC4495 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final C6985 f18680;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C7018 f18681;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final AbstractC6996 f18682;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C4845 f18683;

    static {
        new PropertyReference1Impl(C6983.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0);
        f18680 = new C6985();
    }

    public C6983(C4845 c4845, AbstractC6996 abstractC6996, C7018 c7018, C6983 c6983, InterfaceC6481 interfaceC6481, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4462 interfaceC4462) {
        super(callableMemberDescriptor$Kind, abstractC6996, c6983, interfaceC4462, AbstractC4692.f13707, interfaceC6481);
        this.f18683 = c4845;
        this.f18682 = abstractC6996;
        C5028 c5028 = new C5028(this, 20, c7018);
        c4845.getClass();
        new C4843(c4845, c5028);
        this.f18681 = c7018;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481
    public final AbstractC4882 getReturnType() {
        AbstractC4882 abstractC4882 = this.f18785;
        abstractC4882.getClass();
        return abstractC4882;
    }

    @Override // p079.AbstractC7008
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final InterfaceC4500 mo9002() {
        InterfaceC4484 interfaceC4484Mo9002 = super.mo9002();
        interfaceC4484Mo9002.getClass();
        return (C6983) interfaceC4484Mo9002;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6983 mo9005(C4919 c4919) {
        c4919.getClass();
        InterfaceC4484 interfaceC4484Mo9005 = super.mo9005(c4919);
        interfaceC4484Mo9005.getClass();
        C6983 c6983 = (C6983) interfaceC4484Mo9005;
        AbstractC4882 abstractC4882 = c6983.f18785;
        abstractC4882.getClass();
        C7018 c7018Mo9005 = this.f18681.mo12289().mo9005(C4919.m9856(abstractC4882));
        if (c7018Mo9005 == null) {
            return null;
        }
        c6983.f18681 = c7018Mo9005;
        return c6983;
    }

    @Override // p079.AbstractC7002
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final AbstractC7002 mo9144(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4499 interfaceC4499, InterfaceC4484 interfaceC4484, InterfaceC4462 interfaceC4462, C4691 c4691, InterfaceC6481 interfaceC6481) {
        interfaceC4499.getClass();
        callableMemberDescriptor$Kind.getClass();
        interfaceC6481.getClass();
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = CallableMemberDescriptor$Kind.DECLARATION;
        if (callableMemberDescriptor$Kind != callableMemberDescriptor$Kind2) {
            CallableMemberDescriptor$Kind callableMemberDescriptor$Kind3 = CallableMemberDescriptor$Kind.SYNTHESIZED;
        }
        return new C6983(this.f18683, this.f18682, this.f18681, this, interfaceC6481, callableMemberDescriptor$Kind2, interfaceC4462);
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4481 mo9002() {
        InterfaceC4484 interfaceC4484Mo9002 = super.mo9002();
        interfaceC4484Mo9002.getClass();
        return (C6983) interfaceC4484Mo9002;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4496 mo9028() {
        return this.f18682;
    }

    @Override // p079.AbstractC7002, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4480 mo9029(AbstractC6989 abstractC6989, Modality modality, C4490 c4490, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) throws Exception {
        abstractC6989.getClass();
        c4490.getClass();
        callableMemberDescriptor$Kind.getClass();
        C7003 c7003M12336 = m12336(C4919.f14248);
        c7003M12336.f18807 = abstractC6989;
        c7003M12336.f18808 = modality;
        c7003M12336.f18802 = c4490;
        c7003M12336.f18805 = callableMemberDescriptor$Kind;
        c7003M12336.f18791 = false;
        AbstractC7002 abstractC7002Mo11990 = c7003M12336.f18788.mo11990(c7003M12336);
        abstractC7002Mo11990.getClass();
        return (C6983) abstractC7002Mo11990;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4499 mo9028() {
        return this.f18682;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4480 mo9002() {
        InterfaceC4484 interfaceC4484Mo9002 = super.mo9002();
        interfaceC4484Mo9002.getClass();
        return (C6983) interfaceC4484Mo9002;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4499 mo9002() {
        InterfaceC4484 interfaceC4484Mo9002 = super.mo9002();
        interfaceC4484Mo9002.getClass();
        return (C6983) interfaceC4484Mo9002;
    }

    @Override // p079.AbstractC7002, p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4484 mo9002() {
        InterfaceC4484 interfaceC4484Mo9002 = super.mo9002();
        interfaceC4484Mo9002.getClass();
        return (C6983) interfaceC4484Mo9002;
    }
}
