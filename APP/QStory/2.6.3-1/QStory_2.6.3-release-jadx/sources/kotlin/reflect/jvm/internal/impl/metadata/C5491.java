package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5491 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$VersionRequirement.Level f13951;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13952;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$VersionRequirement.VersionKind f13953;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13954;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13955;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13956;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13957;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirementM9835 = m9835();
        if (protoBuf$VersionRequirementM9835.isInitialized()) {
            return protoBuf$VersionRequirementM9835;
        }
        throw new UninitializedMessageException(protoBuf$VersionRequirementM9835);
    }

    public final Object clone() {
        C5491 c5491 = new C5491();
        c5491.f13951 = ProtoBuf$VersionRequirement.Level.ERROR;
        c5491.f13953 = ProtoBuf$VersionRequirement.VersionKind.LANGUAGE_VERSION;
        c5491.m9834(m9835());
        return c5491;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9834(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.getDefaultInstance()) {
            return;
        }
        if (protoBuf$VersionRequirement.hasVersion()) {
            int version = protoBuf$VersionRequirement.getVersion();
            this.f13956 |= 1;
            this.f13957 = version;
        }
        if (protoBuf$VersionRequirement.hasVersionFull()) {
            int versionFull = protoBuf$VersionRequirement.getVersionFull();
            this.f13956 |= 2;
            this.f13952 = versionFull;
        }
        if (protoBuf$VersionRequirement.hasLevel()) {
            ProtoBuf$VersionRequirement.Level level = protoBuf$VersionRequirement.getLevel();
            level.getClass();
            this.f13956 |= 4;
            this.f13951 = level;
        }
        if (protoBuf$VersionRequirement.hasErrorCode()) {
            int errorCode = protoBuf$VersionRequirement.getErrorCode();
            this.f13956 |= 8;
            this.f13954 = errorCode;
        }
        if (protoBuf$VersionRequirement.hasMessage()) {
            int message = protoBuf$VersionRequirement.getMessage();
            this.f13956 |= 16;
            this.f13955 = message;
        }
        if (protoBuf$VersionRequirement.hasVersionKind()) {
            ProtoBuf$VersionRequirement.VersionKind versionKind = protoBuf$VersionRequirement.getVersionKind();
            versionKind.getClass();
            this.f13956 |= 32;
            this.f13953 = versionKind;
        }
        this.f14153 = this.f14153.m9960(protoBuf$VersionRequirement.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$VersionRequirement m9835() {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(this);
        int i = this.f13956;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$VersionRequirement.version_ = this.f13957;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$VersionRequirement.versionFull_ = this.f13952;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$VersionRequirement.level_ = this.f13951;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$VersionRequirement.errorCode_ = this.f13954;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$VersionRequirement.message_ = this.f13955;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        protoBuf$VersionRequirement.versionKind_ = this.f13953;
        protoBuf$VersionRequirement.bitField0_ = i2;
        return protoBuf$VersionRequirement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9834((ProtoBuf$VersionRequirement) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = null;
        try {
            try {
                m9834((ProtoBuf$VersionRequirement) ProtoBuf$VersionRequirement.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$VersionRequirement protoBuf$VersionRequirement2 = (ProtoBuf$VersionRequirement) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$VersionRequirement = protoBuf$VersionRequirement2;
                    if (protoBuf$VersionRequirement != null) {
                        m9834(protoBuf$VersionRequirement);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$VersionRequirement != null) {
            }
            throw th;
        }
    }
}
