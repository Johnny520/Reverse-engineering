package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4658 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$VersionRequirement.Level f13602;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13603;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$VersionRequirement.VersionKind f13604;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13605;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13608;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirementM9286 = m9286();
        if (protoBuf$VersionRequirementM9286.isInitialized()) {
            return protoBuf$VersionRequirementM9286;
        }
        throw new UninitializedMessageException(protoBuf$VersionRequirementM9286);
    }

    public final Object clone() {
        C4658 c4658 = new C4658();
        c4658.f13602 = ProtoBuf$VersionRequirement.Level.ERROR;
        c4658.f13604 = ProtoBuf$VersionRequirement.VersionKind.LANGUAGE_VERSION;
        c4658.m9285(m9286());
        return c4658;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9285(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.getDefaultInstance()) {
            return;
        }
        if (protoBuf$VersionRequirement.hasVersion()) {
            int version = protoBuf$VersionRequirement.getVersion();
            this.f13607 |= 1;
            this.f13608 = version;
        }
        if (protoBuf$VersionRequirement.hasVersionFull()) {
            int versionFull = protoBuf$VersionRequirement.getVersionFull();
            this.f13607 |= 2;
            this.f13603 = versionFull;
        }
        if (protoBuf$VersionRequirement.hasLevel()) {
            ProtoBuf$VersionRequirement.Level level = protoBuf$VersionRequirement.getLevel();
            level.getClass();
            this.f13607 |= 4;
            this.f13602 = level;
        }
        if (protoBuf$VersionRequirement.hasErrorCode()) {
            int errorCode = protoBuf$VersionRequirement.getErrorCode();
            this.f13607 |= 8;
            this.f13605 = errorCode;
        }
        if (protoBuf$VersionRequirement.hasMessage()) {
            int message = protoBuf$VersionRequirement.getMessage();
            this.f13607 |= 16;
            this.f13606 = message;
        }
        if (protoBuf$VersionRequirement.hasVersionKind()) {
            ProtoBuf$VersionRequirement.VersionKind versionKind = protoBuf$VersionRequirement.getVersionKind();
            versionKind.getClass();
            this.f13607 |= 32;
            this.f13604 = versionKind;
        }
        this.f13804 = this.f13804.m9411(protoBuf$VersionRequirement.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$VersionRequirement m9286() {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(this);
        int i = this.f13607;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$VersionRequirement.version_ = this.f13608;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$VersionRequirement.versionFull_ = this.f13603;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$VersionRequirement.level_ = this.f13602;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$VersionRequirement.errorCode_ = this.f13605;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$VersionRequirement.message_ = this.f13606;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        protoBuf$VersionRequirement.versionKind_ = this.f13604;
        protoBuf$VersionRequirement.bitField0_ = i2;
        return protoBuf$VersionRequirement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9285((ProtoBuf$VersionRequirement) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716 mo9281(kotlin.reflect.jvm.internal.impl.protobuf.C4708 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9285(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9285(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4658.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
