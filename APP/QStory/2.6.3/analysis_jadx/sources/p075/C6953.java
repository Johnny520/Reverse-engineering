package p075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C4670;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6953 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18577;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18578;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public List f18579;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f18580;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Type f18581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f18584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f18585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C6953 m12249() {
        C6953 c6953 = new C6953();
        c6953.f18582 = 6;
        List list = Collections.EMPTY_LIST;
        c6953.f18587 = list;
        c6953.f18584 = ProtoBuf$Type.getDefaultInstance();
        c6953.f18581 = ProtoBuf$Type.getDefaultInstance();
        c6953.f18579 = list;
        c6953.f18578 = list;
        c6953.f18577 = list;
        return c6953;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$TypeAlias protoBuf$TypeAliasM12251 = m12251();
        if (protoBuf$TypeAliasM12251.isInitialized()) {
            return protoBuf$TypeAliasM12251;
        }
        throw new UninitializedMessageException(protoBuf$TypeAliasM12251);
    }

    public final Object clone() {
        C6953 c6953M12249 = m12249();
        c6953M12249.m12250(m12251());
        return c6953M12249;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12250(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.getDefaultInstance()) {
            return;
        }
        if (protoBuf$TypeAlias.hasFlags()) {
            int flags = protoBuf$TypeAlias.getFlags();
            this.f18583 |= 1;
            this.f18582 = flags;
        }
        if (protoBuf$TypeAlias.hasName()) {
            int name = protoBuf$TypeAlias.getName();
            this.f18583 |= 2;
            this.f18586 = name;
        }
        if (!protoBuf$TypeAlias.typeParameter_.isEmpty()) {
            if (this.f18587.isEmpty()) {
                this.f18587 = protoBuf$TypeAlias.typeParameter_;
                this.f18583 &= -5;
            } else {
                if ((this.f18583 & 4) != 4) {
                    this.f18587 = new ArrayList(this.f18587);
                    this.f18583 |= 4;
                }
                this.f18587.addAll(protoBuf$TypeAlias.typeParameter_);
            }
        }
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            if ((this.f18583 & 8) != 8 || this.f18584 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18584 = underlyingType;
            } else {
                C4670 c4670NewBuilder = ProtoBuf$Type.newBuilder(this.f18584);
                c4670NewBuilder.m9287(underlyingType);
                this.f18584 = c4670NewBuilder.m9288();
            }
            this.f18583 |= 8;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            int underlyingTypeId = protoBuf$TypeAlias.getUnderlyingTypeId();
            this.f18583 |= 16;
            this.f18585 = underlyingTypeId;
        }
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            if ((this.f18583 & 32) != 32 || this.f18581 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18581 = expandedType;
            } else {
                C4670 c4670NewBuilder2 = ProtoBuf$Type.newBuilder(this.f18581);
                c4670NewBuilder2.m9287(expandedType);
                this.f18581 = c4670NewBuilder2.m9288();
            }
            this.f18583 |= 32;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            int expandedTypeId = protoBuf$TypeAlias.getExpandedTypeId();
            this.f18583 |= 64;
            this.f18580 = expandedTypeId;
        }
        if (!protoBuf$TypeAlias.annotation_.isEmpty()) {
            if (this.f18579.isEmpty()) {
                this.f18579 = protoBuf$TypeAlias.annotation_;
                this.f18583 &= -129;
            } else {
                if ((this.f18583 & 128) != 128) {
                    this.f18579 = new ArrayList(this.f18579);
                    this.f18583 |= 128;
                }
                this.f18579.addAll(protoBuf$TypeAlias.annotation_);
            }
        }
        if (!protoBuf$TypeAlias.versionRequirement_.isEmpty()) {
            if (this.f18578.isEmpty()) {
                this.f18578 = protoBuf$TypeAlias.versionRequirement_;
                this.f18583 &= -257;
            } else {
                if ((this.f18583 & 256) != 256) {
                    this.f18578 = new ArrayList(this.f18578);
                    this.f18583 |= 256;
                }
                this.f18578.addAll(protoBuf$TypeAlias.versionRequirement_);
            }
        }
        if (!protoBuf$TypeAlias.compilerPluginData_.isEmpty()) {
            if (this.f18577.isEmpty()) {
                this.f18577 = protoBuf$TypeAlias.compilerPluginData_;
                this.f18583 &= -513;
            } else {
                if ((this.f18583 & 512) != 512) {
                    this.f18577 = new ArrayList(this.f18577);
                    this.f18583 |= 512;
                }
                this.f18577.addAll(protoBuf$TypeAlias.compilerPluginData_);
            }
        }
        m9411(protoBuf$TypeAlias);
        this.f13808 = this.f13808.m9401(protoBuf$TypeAlias.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeAlias m12251() {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this);
        int i = this.f18583;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$TypeAlias.flags_ = this.f18582;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$TypeAlias.name_ = this.f18586;
        if ((this.f18583 & 4) == 4) {
            this.f18587 = Collections.unmodifiableList(this.f18587);
            this.f18583 &= -5;
        }
        protoBuf$TypeAlias.typeParameter_ = this.f18587;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$TypeAlias.underlyingType_ = this.f18584;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$TypeAlias.underlyingTypeId_ = this.f18585;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        protoBuf$TypeAlias.expandedType_ = this.f18581;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$TypeAlias.expandedTypeId_ = this.f18580;
        if ((this.f18583 & 128) == 128) {
            this.f18579 = Collections.unmodifiableList(this.f18579);
            this.f18583 &= -129;
        }
        protoBuf$TypeAlias.annotation_ = this.f18579;
        if ((this.f18583 & 256) == 256) {
            this.f18578 = Collections.unmodifiableList(this.f18578);
            this.f18583 &= -257;
        }
        protoBuf$TypeAlias.versionRequirement_ = this.f18578;
        if ((this.f18583 & 512) == 512) {
            this.f18577 = Collections.unmodifiableList(this.f18577);
            this.f18583 &= -513;
        }
        protoBuf$TypeAlias.compilerPluginData_ = this.f18577;
        protoBuf$TypeAlias.bitField0_ = i2;
        return protoBuf$TypeAlias;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m12250((ProtoBuf$TypeAlias) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717 mo9271(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m12250(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m12250(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p075.C6953.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
