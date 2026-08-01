package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4669;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6950 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public ProtoBuf$VersionRequirementTable f18558;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public List f18559;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public List f18560;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f18561;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public List f18562;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public ProtoBuf$TypeTable f18563;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public List f18564;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18565;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18566;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public List f18567;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f18568;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public List f18569;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public ProtoBuf$Type f18570;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f18571;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public List f18572;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public List f18573;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public List f18574;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f18575;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18576;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f18578;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f18579;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f18581;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C6950 m12218() {
        C6950 c6950 = new C6950();
        c6950.f18576 = 6;
        List list = Collections.EMPTY_LIST;
        c6950.f18578 = list;
        c6950.f18579 = list;
        c6950.f18569 = list;
        c6950.f18568 = list;
        c6950.f18567 = list;
        c6950.f18566 = list;
        c6950.f18565 = list;
        c6950.f18564 = list;
        c6950.f18575 = list;
        c6950.f18574 = list;
        c6950.f18573 = list;
        c6950.f18572 = list;
        c6950.f18570 = ProtoBuf$Type.getDefaultInstance();
        c6950.f18560 = list;
        c6950.f18563 = ProtoBuf$TypeTable.getDefaultInstance();
        c6950.f18562 = list;
        c6950.f18558 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        c6950.f18559 = list;
        return c6950;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Class protoBuf$ClassM12220 = m12220();
        if (protoBuf$ClassM12220.isInitialized()) {
            return protoBuf$ClassM12220;
        }
        throw new UninitializedMessageException(protoBuf$ClassM12220);
    }

    public final Object clone() {
        C6950 c6950M12218 = m12218();
        c6950M12218.m12219(m12220());
        return c6950M12218;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6950 m12219(ProtoBuf$Class protoBuf$Class) {
        if (protoBuf$Class == ProtoBuf$Class.getDefaultInstance()) {
            return this;
        }
        if (protoBuf$Class.hasFlags()) {
            int flags = protoBuf$Class.getFlags();
            this.f18577 |= 1;
            this.f18576 = flags;
        }
        if (protoBuf$Class.hasFqName()) {
            int fqName = protoBuf$Class.getFqName();
            this.f18577 |= 2;
            this.f18580 = fqName;
        }
        if (protoBuf$Class.hasCompanionObjectName()) {
            int companionObjectName = protoBuf$Class.getCompanionObjectName();
            this.f18577 |= 4;
            this.f18581 = companionObjectName;
        }
        if (!protoBuf$Class.typeParameter_.isEmpty()) {
            if (this.f18578.isEmpty()) {
                this.f18578 = protoBuf$Class.typeParameter_;
                this.f18577 &= -9;
            } else {
                if ((this.f18577 & 8) != 8) {
                    this.f18578 = new ArrayList(this.f18578);
                    this.f18577 |= 8;
                }
                this.f18578.addAll(protoBuf$Class.typeParameter_);
            }
        }
        if (!protoBuf$Class.supertype_.isEmpty()) {
            if (this.f18579.isEmpty()) {
                this.f18579 = protoBuf$Class.supertype_;
                this.f18577 &= -17;
            } else {
                if ((this.f18577 & 16) != 16) {
                    this.f18579 = new ArrayList(this.f18579);
                    this.f18577 |= 16;
                }
                this.f18579.addAll(protoBuf$Class.supertype_);
            }
        }
        if (!protoBuf$Class.supertypeId_.isEmpty()) {
            if (this.f18569.isEmpty()) {
                this.f18569 = protoBuf$Class.supertypeId_;
                this.f18577 &= -33;
            } else {
                if ((this.f18577 & 32) != 32) {
                    this.f18569 = new ArrayList(this.f18569);
                    this.f18577 |= 32;
                }
                this.f18569.addAll(protoBuf$Class.supertypeId_);
            }
        }
        if (!protoBuf$Class.nestedClassName_.isEmpty()) {
            if (this.f18568.isEmpty()) {
                this.f18568 = protoBuf$Class.nestedClassName_;
                this.f18577 &= -65;
            } else {
                if ((this.f18577 & 64) != 64) {
                    this.f18568 = new ArrayList(this.f18568);
                    this.f18577 |= 64;
                }
                this.f18568.addAll(protoBuf$Class.nestedClassName_);
            }
        }
        if (!protoBuf$Class.contextReceiverType_.isEmpty()) {
            if (this.f18567.isEmpty()) {
                this.f18567 = protoBuf$Class.contextReceiverType_;
                this.f18577 &= -129;
            } else {
                if ((this.f18577 & 128) != 128) {
                    this.f18567 = new ArrayList(this.f18567);
                    this.f18577 |= 128;
                }
                this.f18567.addAll(protoBuf$Class.contextReceiverType_);
            }
        }
        if (!protoBuf$Class.contextReceiverTypeId_.isEmpty()) {
            if (this.f18566.isEmpty()) {
                this.f18566 = protoBuf$Class.contextReceiverTypeId_;
                this.f18577 &= -257;
            } else {
                if ((this.f18577 & 256) != 256) {
                    this.f18566 = new ArrayList(this.f18566);
                    this.f18577 |= 256;
                }
                this.f18566.addAll(protoBuf$Class.contextReceiverTypeId_);
            }
        }
        if (!protoBuf$Class.constructor_.isEmpty()) {
            if (this.f18565.isEmpty()) {
                this.f18565 = protoBuf$Class.constructor_;
                this.f18577 &= -513;
            } else {
                if ((this.f18577 & 512) != 512) {
                    this.f18565 = new ArrayList(this.f18565);
                    this.f18577 |= 512;
                }
                this.f18565.addAll(protoBuf$Class.constructor_);
            }
        }
        if (!protoBuf$Class.function_.isEmpty()) {
            if (this.f18564.isEmpty()) {
                this.f18564 = protoBuf$Class.function_;
                this.f18577 &= -1025;
            } else {
                if ((this.f18577 & 1024) != 1024) {
                    this.f18564 = new ArrayList(this.f18564);
                    this.f18577 |= 1024;
                }
                this.f18564.addAll(protoBuf$Class.function_);
            }
        }
        if (!protoBuf$Class.property_.isEmpty()) {
            if (this.f18575.isEmpty()) {
                this.f18575 = protoBuf$Class.property_;
                this.f18577 &= -2049;
            } else {
                if ((this.f18577 & 2048) != 2048) {
                    this.f18575 = new ArrayList(this.f18575);
                    this.f18577 |= 2048;
                }
                this.f18575.addAll(protoBuf$Class.property_);
            }
        }
        if (!protoBuf$Class.typeAlias_.isEmpty()) {
            if (this.f18574.isEmpty()) {
                this.f18574 = protoBuf$Class.typeAlias_;
                this.f18577 &= -4097;
            } else {
                if ((this.f18577 & 4096) != 4096) {
                    this.f18574 = new ArrayList(this.f18574);
                    this.f18577 |= 4096;
                }
                this.f18574.addAll(protoBuf$Class.typeAlias_);
            }
        }
        if (!protoBuf$Class.enumEntry_.isEmpty()) {
            if (this.f18573.isEmpty()) {
                this.f18573 = protoBuf$Class.enumEntry_;
                this.f18577 &= -8193;
            } else {
                if ((this.f18577 & 8192) != 8192) {
                    this.f18573 = new ArrayList(this.f18573);
                    this.f18577 |= 8192;
                }
                this.f18573.addAll(protoBuf$Class.enumEntry_);
            }
        }
        if (!protoBuf$Class.sealedSubclassFqName_.isEmpty()) {
            if (this.f18572.isEmpty()) {
                this.f18572 = protoBuf$Class.sealedSubclassFqName_;
                this.f18577 &= -16385;
            } else {
                if ((this.f18577 & 16384) != 16384) {
                    this.f18572 = new ArrayList(this.f18572);
                    this.f18577 |= 16384;
                }
                this.f18572.addAll(protoBuf$Class.sealedSubclassFqName_);
            }
        }
        if (protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
            int inlineClassUnderlyingPropertyName = protoBuf$Class.getInlineClassUnderlyingPropertyName();
            this.f18577 |= 32768;
            this.f18571 = inlineClassUnderlyingPropertyName;
        }
        if (protoBuf$Class.hasInlineClassUnderlyingType()) {
            ProtoBuf$Type inlineClassUnderlyingType = protoBuf$Class.getInlineClassUnderlyingType();
            if ((this.f18577 & 65536) != 65536 || this.f18570 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18570 = inlineClassUnderlyingType;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f18570);
                c4669NewBuilder.m9297(inlineClassUnderlyingType);
                this.f18570 = c4669NewBuilder.m9298();
            }
            this.f18577 |= 65536;
        }
        if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
            int inlineClassUnderlyingTypeId = protoBuf$Class.getInlineClassUnderlyingTypeId();
            this.f18577 |= 131072;
            this.f18561 = inlineClassUnderlyingTypeId;
        }
        if (!protoBuf$Class.annotation_.isEmpty()) {
            if (this.f18560.isEmpty()) {
                this.f18560 = protoBuf$Class.annotation_;
                this.f18577 &= -262145;
            } else {
                if ((this.f18577 & 262144) != 262144) {
                    this.f18560 = new ArrayList(this.f18560);
                    this.f18577 |= 262144;
                }
                this.f18560.addAll(protoBuf$Class.annotation_);
            }
        }
        if (protoBuf$Class.hasTypeTable()) {
            ProtoBuf$TypeTable typeTable = protoBuf$Class.getTypeTable();
            if ((this.f18577 & Opcodes.ASM8) != 524288 || this.f18563 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f18563 = typeTable;
            } else {
                C6955 c6955NewBuilder = ProtoBuf$TypeTable.newBuilder(this.f18563);
                c6955NewBuilder.m12226(typeTable);
                this.f18563 = c6955NewBuilder.m12227();
            }
            this.f18577 |= Opcodes.ASM8;
        }
        if (!protoBuf$Class.versionRequirement_.isEmpty()) {
            if (this.f18562.isEmpty()) {
                this.f18562 = protoBuf$Class.versionRequirement_;
                this.f18577 &= -1048577;
            } else {
                if ((this.f18577 & 1048576) != 1048576) {
                    this.f18562 = new ArrayList(this.f18562);
                    this.f18577 |= 1048576;
                }
                this.f18562.addAll(protoBuf$Class.versionRequirement_);
            }
        }
        if (protoBuf$Class.hasVersionRequirementTable()) {
            ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Class.getVersionRequirementTable();
            if ((this.f18577 & 2097152) != 2097152 || this.f18558 == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f18558 = versionRequirementTable;
            } else {
                C6956 c6956NewBuilder = ProtoBuf$VersionRequirementTable.newBuilder(this.f18558);
                c6956NewBuilder.m12228(versionRequirementTable);
                this.f18558 = c6956NewBuilder.m12229();
            }
            this.f18577 |= 2097152;
        }
        if (!protoBuf$Class.compilerPluginData_.isEmpty()) {
            if (this.f18559.isEmpty()) {
                this.f18559 = protoBuf$Class.compilerPluginData_;
                this.f18577 &= -4194305;
            } else {
                if ((this.f18577 & 4194304) != 4194304) {
                    this.f18559 = new ArrayList(this.f18559);
                    this.f18577 |= 4194304;
                }
                this.f18559.addAll(protoBuf$Class.compilerPluginData_);
            }
        }
        m9421(protoBuf$Class);
        this.f13804 = this.f13804.m9411(protoBuf$Class.unknownFields);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Class m12220() {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(this);
        int i = this.f18577;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Class.flags_ = this.f18576;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Class.fqName_ = this.f18580;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Class.companionObjectName_ = this.f18581;
        if ((this.f18577 & 8) == 8) {
            this.f18578 = Collections.unmodifiableList(this.f18578);
            this.f18577 &= -9;
        }
        protoBuf$Class.typeParameter_ = this.f18578;
        if ((this.f18577 & 16) == 16) {
            this.f18579 = Collections.unmodifiableList(this.f18579);
            this.f18577 &= -17;
        }
        protoBuf$Class.supertype_ = this.f18579;
        if ((this.f18577 & 32) == 32) {
            this.f18569 = Collections.unmodifiableList(this.f18569);
            this.f18577 &= -33;
        }
        protoBuf$Class.supertypeId_ = this.f18569;
        if ((this.f18577 & 64) == 64) {
            this.f18568 = Collections.unmodifiableList(this.f18568);
            this.f18577 &= -65;
        }
        protoBuf$Class.nestedClassName_ = this.f18568;
        if ((this.f18577 & 128) == 128) {
            this.f18567 = Collections.unmodifiableList(this.f18567);
            this.f18577 &= -129;
        }
        protoBuf$Class.contextReceiverType_ = this.f18567;
        if ((this.f18577 & 256) == 256) {
            this.f18566 = Collections.unmodifiableList(this.f18566);
            this.f18577 &= -257;
        }
        protoBuf$Class.contextReceiverTypeId_ = this.f18566;
        if ((this.f18577 & 512) == 512) {
            this.f18565 = Collections.unmodifiableList(this.f18565);
            this.f18577 &= -513;
        }
        protoBuf$Class.constructor_ = this.f18565;
        if ((this.f18577 & 1024) == 1024) {
            this.f18564 = Collections.unmodifiableList(this.f18564);
            this.f18577 &= -1025;
        }
        protoBuf$Class.function_ = this.f18564;
        if ((this.f18577 & 2048) == 2048) {
            this.f18575 = Collections.unmodifiableList(this.f18575);
            this.f18577 &= -2049;
        }
        protoBuf$Class.property_ = this.f18575;
        if ((this.f18577 & 4096) == 4096) {
            this.f18574 = Collections.unmodifiableList(this.f18574);
            this.f18577 &= -4097;
        }
        protoBuf$Class.typeAlias_ = this.f18574;
        if ((this.f18577 & 8192) == 8192) {
            this.f18573 = Collections.unmodifiableList(this.f18573);
            this.f18577 &= -8193;
        }
        protoBuf$Class.enumEntry_ = this.f18573;
        if ((this.f18577 & 16384) == 16384) {
            this.f18572 = Collections.unmodifiableList(this.f18572);
            this.f18577 &= -16385;
        }
        protoBuf$Class.sealedSubclassFqName_ = this.f18572;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        protoBuf$Class.inlineClassUnderlyingPropertyName_ = this.f18571;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        protoBuf$Class.inlineClassUnderlyingType_ = this.f18570;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        protoBuf$Class.inlineClassUnderlyingTypeId_ = this.f18561;
        if ((this.f18577 & 262144) == 262144) {
            this.f18560 = Collections.unmodifiableList(this.f18560);
            this.f18577 &= -262145;
        }
        protoBuf$Class.annotation_ = this.f18560;
        if ((i & Opcodes.ASM8) == 524288) {
            i2 |= 64;
        }
        protoBuf$Class.typeTable_ = this.f18563;
        if ((this.f18577 & 1048576) == 1048576) {
            this.f18562 = Collections.unmodifiableList(this.f18562);
            this.f18577 &= -1048577;
        }
        protoBuf$Class.versionRequirement_ = this.f18562;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        protoBuf$Class.versionRequirementTable_ = this.f18558;
        if ((this.f18577 & 4194304) == 4194304) {
            this.f18559 = Collections.unmodifiableList(this.f18559);
            this.f18577 &= -4194305;
        }
        protoBuf$Class.compilerPluginData_ = this.f18559;
        protoBuf$Class.bitField0_ = i2;
        return protoBuf$Class;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m12219((ProtoBuf$Class) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12219(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12219(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6950.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
