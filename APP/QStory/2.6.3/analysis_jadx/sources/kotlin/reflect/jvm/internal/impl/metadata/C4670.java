package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4670 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f13644;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ProtoBuf$Type f13645;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f13646;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f13647;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f13648;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f13649;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public List f13650;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f13651;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f13652;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ProtoBuf$Type f13653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public List f13654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13655;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f13656;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f13657;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f13658;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13659;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Type protoBuf$TypeM9288 = m9288();
        if (protoBuf$TypeM9288.isInitialized()) {
            return protoBuf$TypeM9288;
        }
        throw new UninitializedMessageException(protoBuf$TypeM9288);
    }

    public final Object clone() {
        C4670 c4670 = new C4670();
        List list = Collections.EMPTY_LIST;
        c4670.f13654 = list;
        c4670.f13656 = ProtoBuf$Type.getDefaultInstance();
        c4670.f13645 = ProtoBuf$Type.getDefaultInstance();
        c4670.f13653 = ProtoBuf$Type.getDefaultInstance();
        c4670.f13650 = list;
        c4670.m9287(m9288());
        return c4670;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4670 m9287(ProtoBuf$Type protoBuf$Type) {
        if (protoBuf$Type == ProtoBuf$Type.getDefaultInstance()) {
            return this;
        }
        if (!protoBuf$Type.argument_.isEmpty()) {
            if (this.f13654.isEmpty()) {
                this.f13654 = protoBuf$Type.argument_;
                this.f13655 &= -2;
            } else {
                if ((this.f13655 & 1) != 1) {
                    this.f13654 = new ArrayList(this.f13654);
                    this.f13655 |= 1;
                }
                this.f13654.addAll(protoBuf$Type.argument_);
            }
        }
        if (protoBuf$Type.hasNullable()) {
            boolean nullable = protoBuf$Type.getNullable();
            this.f13655 |= 2;
            this.f13658 = nullable;
        }
        if (protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            int flexibleTypeCapabilitiesId = protoBuf$Type.getFlexibleTypeCapabilitiesId();
            this.f13655 |= 4;
            this.f13659 = flexibleTypeCapabilitiesId;
        }
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            ProtoBuf$Type flexibleUpperBound = protoBuf$Type.getFlexibleUpperBound();
            if ((this.f13655 & 8) != 8 || this.f13656 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13656 = flexibleUpperBound;
            } else {
                C4670 c4670NewBuilder = ProtoBuf$Type.newBuilder(this.f13656);
                c4670NewBuilder.m9287(flexibleUpperBound);
                this.f13656 = c4670NewBuilder.m9288();
            }
            this.f13655 |= 8;
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            int flexibleUpperBoundId = protoBuf$Type.getFlexibleUpperBoundId();
            this.f13655 |= 16;
            this.f13657 = flexibleUpperBoundId;
        }
        if (protoBuf$Type.hasClassName()) {
            int className = protoBuf$Type.getClassName();
            this.f13655 |= 32;
            this.f13649 = className;
        }
        if (protoBuf$Type.hasTypeParameter()) {
            int typeParameter = protoBuf$Type.getTypeParameter();
            this.f13655 |= 64;
            this.f13648 = typeParameter;
        }
        if (protoBuf$Type.hasTypeParameterName()) {
            int typeParameterName = protoBuf$Type.getTypeParameterName();
            this.f13655 |= 128;
            this.f13647 = typeParameterName;
        }
        if (protoBuf$Type.hasTypeAliasName()) {
            int typeAliasName = protoBuf$Type.getTypeAliasName();
            this.f13655 |= 256;
            this.f13646 = typeAliasName;
        }
        if (protoBuf$Type.hasOuterType()) {
            ProtoBuf$Type outerType = protoBuf$Type.getOuterType();
            if ((this.f13655 & 512) != 512 || this.f13645 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13645 = outerType;
            } else {
                C4670 c4670NewBuilder2 = ProtoBuf$Type.newBuilder(this.f13645);
                c4670NewBuilder2.m9287(outerType);
                this.f13645 = c4670NewBuilder2.m9288();
            }
            this.f13655 |= 512;
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            int outerTypeId = protoBuf$Type.getOuterTypeId();
            this.f13655 |= 1024;
            this.f13644 = outerTypeId;
        }
        if (protoBuf$Type.hasAbbreviatedType()) {
            ProtoBuf$Type abbreviatedType = protoBuf$Type.getAbbreviatedType();
            if ((this.f13655 & 2048) != 2048 || this.f13653 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13653 = abbreviatedType;
            } else {
                C4670 c4670NewBuilder3 = ProtoBuf$Type.newBuilder(this.f13653);
                c4670NewBuilder3.m9287(abbreviatedType);
                this.f13653 = c4670NewBuilder3.m9288();
            }
            this.f13655 |= 2048;
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            int abbreviatedTypeId = protoBuf$Type.getAbbreviatedTypeId();
            this.f13655 |= 4096;
            this.f13652 = abbreviatedTypeId;
        }
        if (protoBuf$Type.hasFlags()) {
            int flags = protoBuf$Type.getFlags();
            this.f13655 |= 8192;
            this.f13651 = flags;
        }
        if (!protoBuf$Type.annotation_.isEmpty()) {
            if (this.f13650.isEmpty()) {
                this.f13650 = protoBuf$Type.annotation_;
                this.f13655 &= -16385;
            } else {
                if ((this.f13655 & 16384) != 16384) {
                    this.f13650 = new ArrayList(this.f13650);
                    this.f13655 |= 16384;
                }
                this.f13650.addAll(protoBuf$Type.annotation_);
            }
        }
        m9411(protoBuf$Type);
        this.f13808 = this.f13808.m9401(protoBuf$Type.unknownFields);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Type m9288() {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this);
        int i = this.f13655;
        if ((i & 1) == 1) {
            this.f13654 = Collections.unmodifiableList(this.f13654);
            this.f13655 &= -2;
        }
        protoBuf$Type.argument_ = this.f13654;
        int i2 = (i & 2) != 2 ? 0 : 1;
        protoBuf$Type.nullable_ = this.f13658;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        protoBuf$Type.flexibleTypeCapabilitiesId_ = this.f13659;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$Type.flexibleUpperBound_ = this.f13656;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$Type.flexibleUpperBoundId_ = this.f13657;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        protoBuf$Type.className_ = this.f13649;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$Type.typeParameter_ = this.f13648;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$Type.typeParameterName_ = this.f13647;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        protoBuf$Type.typeAliasName_ = this.f13646;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        protoBuf$Type.outerType_ = this.f13645;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        protoBuf$Type.outerTypeId_ = this.f13644;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        protoBuf$Type.abbreviatedType_ = this.f13653;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        protoBuf$Type.abbreviatedTypeId_ = this.f13652;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        protoBuf$Type.flags_ = this.f13651;
        if ((this.f13655 & 16384) == 16384) {
            this.f13650 = Collections.unmodifiableList(this.f13650);
            this.f13655 &= -16385;
        }
        protoBuf$Type.annotation_ = this.f13650;
        protoBuf$Type.bitField0_ = i2;
        return protoBuf$Type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9287((ProtoBuf$Type) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9287(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9287(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4670.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
