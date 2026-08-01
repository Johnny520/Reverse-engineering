package p095;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5327;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7812 extends AbstractC7831 implements InterfaceC5327 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final C7814 f19025;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C7847 f19026;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final AbstractC7825 f19027;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C5677 f19028;

    static {
        new PropertyReference1Impl(C7812.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0);
        f19025 = new C7814();
    }

    public C7812(C5677 c5677, AbstractC7825 abstractC7825, C7847 c7847, C7812 c7812, InterfaceC7310 interfaceC7310, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        super(callableMemberDescriptor$Kind, abstractC7825, c7812, interfaceC5294, AbstractC5524.f14052, interfaceC7310);
        this.f19028 = c5677;
        this.f19027 = abstractC7825;
        C5860 c5860 = new C5860(this, 20, c7847);
        c5677.getClass();
        new C5675(c5677, c5860);
        this.f19026 = c7847;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    public final AbstractC5714 getReturnType() {
        AbstractC5714 abstractC5714 = this.f19130;
        abstractC5714.getClass();
        return abstractC5714;
    }

    @Override // p095.AbstractC7837
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final InterfaceC5332 mo9561() {
        InterfaceC5316 interfaceC5316Mo9561 = super.mo9561();
        interfaceC5316Mo9561.getClass();
        return (C7812) interfaceC5316Mo9561;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7812 mo9564(C5751 c5751) {
        c5751.getClass();
        InterfaceC5316 interfaceC5316Mo9564 = super.mo9564(c5751);
        interfaceC5316Mo9564.getClass();
        C7812 c7812 = (C7812) interfaceC5316Mo9564;
        AbstractC5714 abstractC5714 = c7812.f19130;
        abstractC5714.getClass();
        C7847 c7847Mo9564 = this.f19026.mo12848().mo9564(C5751.m10415(abstractC5714));
        if (c7847Mo9564 == null) {
            return null;
        }
        c7812.f19026 = c7847Mo9564;
        return c7812;
    }

    @Override // p095.AbstractC7831
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final AbstractC7831 mo9703(CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5331 interfaceC5331, InterfaceC5316 interfaceC5316, InterfaceC5294 interfaceC5294, C5523 c5523, InterfaceC7310 interfaceC7310) {
        interfaceC5331.getClass();
        callableMemberDescriptor$Kind.getClass();
        interfaceC7310.getClass();
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind2 = CallableMemberDescriptor$Kind.DECLARATION;
        if (callableMemberDescriptor$Kind != callableMemberDescriptor$Kind2) {
            CallableMemberDescriptor$Kind callableMemberDescriptor$Kind3 = CallableMemberDescriptor$Kind.SYNTHESIZED;
        }
        return new C7812(this.f19028, this.f19027, this.f19026, this, interfaceC7310, callableMemberDescriptor$Kind2, interfaceC5294);
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5313 mo9561() {
        InterfaceC5316 interfaceC5316Mo9561 = super.mo9561();
        interfaceC5316Mo9561.getClass();
        return (C7812) interfaceC5316Mo9561;
    }

    @Override // p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5328 mo9587() {
        return this.f19027;
    }

    @Override // p095.AbstractC7831, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC5312 mo9588(AbstractC7818 abstractC7818, Modality modality, C5322 c5322, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) throws Exception {
        abstractC7818.getClass();
        c5322.getClass();
        callableMemberDescriptor$Kind.getClass();
        C7832 c7832M12895 = m12895(C5751.f14593);
        c7832M12895.f19152 = abstractC7818;
        c7832M12895.f19153 = modality;
        c7832M12895.f19147 = c5322;
        c7832M12895.f19150 = callableMemberDescriptor$Kind;
        c7832M12895.f19136 = false;
        AbstractC7831 abstractC7831Mo12549 = c7832M12895.f19133.mo12549(c7832M12895);
        abstractC7831Mo12549.getClass();
        return (C7812) abstractC7831Mo12549;
    }

    @Override // p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        return this.f19027;
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5312 mo9561() {
        InterfaceC5316 interfaceC5316Mo9561 = super.mo9561();
        interfaceC5316Mo9561.getClass();
        return (C7812) interfaceC5316Mo9561;
    }

    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5331 mo9561() {
        InterfaceC5316 interfaceC5316Mo9561 = super.mo9561();
        interfaceC5316Mo9561.getClass();
        return (C7812) interfaceC5316Mo9561;
    }

    @Override // p095.AbstractC7831, p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5316 mo9561() {
        InterfaceC5316 interfaceC5316Mo9561 = super.mo9561();
        interfaceC5316Mo9561.getClass();
        return (C7812) interfaceC5316Mo9561;
    }
}
