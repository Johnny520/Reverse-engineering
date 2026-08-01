package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p015.C6230;
import p070.AbstractC6898;
import p070.C6901;
import p070.InterfaceC6907;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4819 extends AbstractC4807 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4687 f14038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4819 f14039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ProtoBuf$Class f14040;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14041;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ProtoBuf$Class.Kind f14042;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4819(ProtoBuf$Class protoBuf$Class, InterfaceC6907 interfaceC6907, C6230 c6230, InterfaceC4461 interfaceC4461, C4819 c4819) {
        super(interfaceC6907, c6230, interfaceC4461);
        protoBuf$Class.getClass();
        interfaceC6907.getClass();
        this.f14040 = protoBuf$Class;
        this.f14039 = c4819;
        this.f14038 = AbstractC7738.m13051(interfaceC6907, protoBuf$Class.getFqName());
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) AbstractC6898.f18384.mo12153(protoBuf$Class.getFlags());
        this.f14042 = kind == null ? ProtoBuf$Class.Kind.CLASS : kind;
        this.f14041 = AbstractC6898.f18403.mo12153(protoBuf$Class.getFlags()).booleanValue();
        C6901 c6901 = AbstractC6898.f18402;
        protoBuf$Class.getFlags();
        c6901.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4686 mo9553() {
        return this.f14038.m9337();
    }
}
