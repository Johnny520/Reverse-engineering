package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import io.ktor.client.plugins.AbstractC3933;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import p007.C6157;
import p070.AbstractC6899;
import p070.C6902;
import p070.InterfaceC6908;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4820 extends AbstractC4808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4688 f14042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4820 f14043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ProtoBuf$Class f14044;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14045;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ProtoBuf$Class.Kind f14046;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4820(ProtoBuf$Class protoBuf$Class, InterfaceC6908 interfaceC6908, C6157 c6157, InterfaceC4462 interfaceC4462, C4820 c4820) {
        super(interfaceC6908, c6157, interfaceC4462);
        protoBuf$Class.getClass();
        interfaceC6908.getClass();
        this.f14044 = protoBuf$Class;
        this.f14043 = c4820;
        this.f14042 = AbstractC3933.m8319(interfaceC6908, protoBuf$Class.getFqName());
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) AbstractC6899.f18379.mo12181(protoBuf$Class.getFlags());
        this.f14046 = kind == null ? ProtoBuf$Class.Kind.CLASS : kind;
        this.f14045 = AbstractC6899.f18398.mo12181(protoBuf$Class.getFlags()).booleanValue();
        C6902 c6902 = AbstractC6899.f18397;
        protoBuf$Class.getFlags();
        c6902.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4808
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4687 mo9543() {
        return this.f14042.m9327();
    }
}
