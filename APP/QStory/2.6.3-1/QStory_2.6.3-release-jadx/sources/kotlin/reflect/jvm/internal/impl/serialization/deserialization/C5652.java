package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import io.ktor.client.plugins.AbstractC4765;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import p023.C6986;
import p086.AbstractC7728;
import p086.C7731;
import p086.InterfaceC7737;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5652 extends AbstractC5640 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5520 f14387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5652 f14388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ProtoBuf$Class f14389;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14390;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ProtoBuf$Class.Kind f14391;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5652(ProtoBuf$Class protoBuf$Class, InterfaceC7737 interfaceC7737, C6986 c6986, InterfaceC5294 interfaceC5294, C5652 c5652) {
        super(interfaceC7737, c6986, interfaceC5294);
        protoBuf$Class.getClass();
        interfaceC7737.getClass();
        this.f14389 = protoBuf$Class;
        this.f14388 = c5652;
        this.f14387 = AbstractC4765.m8878(interfaceC7737, protoBuf$Class.getFqName());
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) AbstractC7728.f18724.mo12740(protoBuf$Class.getFlags());
        this.f14391 = kind == null ? ProtoBuf$Class.Kind.CLASS : kind;
        this.f14390 = AbstractC7728.f18743.mo12740(protoBuf$Class.getFlags()).booleanValue();
        C7731 c7731 = AbstractC7728.f18742;
        protoBuf$Class.getFlags();
        c7731.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5640
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5519 mo10102() {
        return this.f14387.m9886();
    }
}
