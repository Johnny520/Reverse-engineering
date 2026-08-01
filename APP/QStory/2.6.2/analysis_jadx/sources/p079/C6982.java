package p079;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4494;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6982 extends AbstractC7001 implements InterfaceC4494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final C6984 f18685;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C7017 f18686;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final AbstractC6995 f18687;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C4844 f18688;

    static {
        new PropertyReference1Impl(C6982.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0);
        f18685 = new C6984();
    }

    public C6982(C4844 c4844, AbstractC6995 abstractC6995, C7017 c7017, C6982 c6982, InterfaceC6480 interfaceC6480, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4461 interfaceC4461) {
        super(callableMemberDescriptor$Kind, abstractC6995, c6982, interfaceC4461, AbstractC4691.f13703, interfaceC6480);
        this.f18688 = c4844;
        this.f18687 = abstractC6995;
        C5027 c5027 = new C5027(this, 20, c7017);
        c4844.getClass();
        new C4842(c4844, c5027);
        this.f18686 = c7017;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480
    public final AbstractC4881 getReturnType() {
        AbstractC4881 abstractC4881 = this.f18790;
        abstractC4881.getClass();
        return abstractC4881;
    }

    @Override // p079.AbstractC7007
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final InterfaceC4499 mo9012() {
        InterfaceC4483 interfaceC4483Mo9012 = super.mo9012();
        interfaceC4483Mo9012.getClass();
        return (C6982) interfaceC4483Mo9012;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C6982 mo9015(C4918 c4918) {
        c4918.getClass();
        InterfaceC4483 interfaceC4483Mo9015 = super.mo9015(c4918);
        interfaceC4483Mo9015.getClass();
        C6982 c6982 = (C6982) interfaceC4483Mo9015;
        AbstractC4881 abstractC4881 = c6982.f18790;
        abstractC4881.getClass();
        C7017 c7017Mo9015 = this.f18686.mo12262().mo9015(C4918.m9862(abstractC4881));
        if (c7017Mo9015 == null) {
            return null;
        }
        c6982.f18686 = c7017Mo9015;
        return c6982;
    }

    @Override // p079.AbstractC7001
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final AbstractC7001 mo9154(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC4498 interfaceC4498, InterfaceC4483 interfaceC4483, InterfaceC4461 interfaceC4461, C4690 c4690, InterfaceC6480 interfaceC6480) {
        interfaceC4498.getClass();
        callableMemberDescriptor$Kind.getClass();
        interfaceC6480.getClass();
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = CallableMemberDescriptor$Kind.DECLARATION;
        if (callableMemberDescriptor$Kind != callableMemberDescriptor$Kind2) {
            CallableMemberDescriptor$Kind callableMemberDescriptor$Kind3 = CallableMemberDescriptor$Kind.SYNTHESIZED;
        }
        return new C6982(this.f18688, this.f18687, this.f18686, this, interfaceC6480, callableMemberDescriptor$Kind2, interfaceC4461);
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4480 mo9012() {
        InterfaceC4483 interfaceC4483Mo9012 = super.mo9012();
        interfaceC4483Mo9012.getClass();
        return (C6982) interfaceC4483Mo9012;
    }

    @Override // p079.AbstractC7007, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4495 mo9038() {
        return this.f18687;
    }

    @Override // p079.AbstractC7001, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4479 mo9039(AbstractC6988 abstractC6988, Modality modality, C4489 c4489, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) throws Exception {
        abstractC6988.getClass();
        c4489.getClass();
        callableMemberDescriptor$Kind.getClass();
        C7002 c7002M12309 = m12309(C4918.f14244);
        c7002M12309.f18812 = abstractC6988;
        c7002M12309.f18813 = modality;
        c7002M12309.f18807 = c4489;
        c7002M12309.f18810 = callableMemberDescriptor$Kind;
        c7002M12309.f18796 = false;
        AbstractC7001 abstractC7001Mo11947 = c7002M12309.f18793.mo11947(c7002M12309);
        abstractC7001Mo11947.getClass();
        return (C6982) abstractC7001Mo11947;
    }

    @Override // p079.AbstractC7007, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4498 mo9038() {
        return this.f18687;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4479 mo9012() {
        InterfaceC4483 interfaceC4483Mo9012 = super.mo9012();
        interfaceC4483Mo9012.getClass();
        return (C6982) interfaceC4483Mo9012;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4498 mo9012() {
        InterfaceC4483 interfaceC4483Mo9012 = super.mo9012();
        interfaceC4483Mo9012.getClass();
        return (C6982) interfaceC4483Mo9012;
    }

    @Override // p079.AbstractC7001, p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4483 mo9012() {
        InterfaceC4483 interfaceC4483Mo9012 = super.mo9012();
        interfaceC4483Mo9012.getClass();
        return (C6982) interfaceC4483Mo9012;
    }
}
