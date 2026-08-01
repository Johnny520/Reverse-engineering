package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4669 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f13640;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ProtoBuf$Type f13641;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f13642;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f13643;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f13644;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f13645;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public List f13646;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f13647;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f13648;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ProtoBuf$Type f13649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public List f13650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13651;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f13652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f13653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f13654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13655;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Type protoBuf$TypeM9298 = m9298();
        if (protoBuf$TypeM9298.isInitialized()) {
            return protoBuf$TypeM9298;
        }
        throw new UninitializedMessageException(protoBuf$TypeM9298);
    }

    public final Object clone() {
        C4669 c4669 = new C4669();
        List list = Collections.EMPTY_LIST;
        c4669.f13650 = list;
        c4669.f13652 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13641 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13649 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13646 = list;
        c4669.m9297(m9298());
        return c4669;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4669 m9297(ProtoBuf$Type protoBuf$Type) {
        if (protoBuf$Type == ProtoBuf$Type.getDefaultInstance()) {
            return this;
        }
        if (!protoBuf$Type.argument_.isEmpty()) {
            if (this.f13650.isEmpty()) {
                this.f13650 = protoBuf$Type.argument_;
                this.f13651 &= -2;
            } else {
                if ((this.f13651 & 1) != 1) {
                    this.f13650 = new ArrayList(this.f13650);
                    this.f13651 |= 1;
                }
                this.f13650.addAll(protoBuf$Type.argument_);
            }
        }
        if (protoBuf$Type.hasNullable()) {
            boolean nullable = protoBuf$Type.getNullable();
            this.f13651 |= 2;
            this.f13654 = nullable;
        }
        if (protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            int flexibleTypeCapabilitiesId = protoBuf$Type.getFlexibleTypeCapabilitiesId();
            this.f13651 |= 4;
            this.f13655 = flexibleTypeCapabilitiesId;
        }
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            ProtoBuf$Type flexibleUpperBound = protoBuf$Type.getFlexibleUpperBound();
            if ((this.f13651 & 8) != 8 || this.f13652 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13652 = flexibleUpperBound;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f13652);
                c4669NewBuilder.m9297(flexibleUpperBound);
                this.f13652 = c4669NewBuilder.m9298();
            }
            this.f13651 |= 8;
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            int flexibleUpperBoundId = protoBuf$Type.getFlexibleUpperBoundId();
            this.f13651 |= 16;
            this.f13653 = flexibleUpperBoundId;
        }
        if (protoBuf$Type.hasClassName()) {
            int className = protoBuf$Type.getClassName();
            this.f13651 |= 32;
            this.f13645 = className;
        }
        if (protoBuf$Type.hasTypeParameter()) {
            int typeParameter = protoBuf$Type.getTypeParameter();
            this.f13651 |= 64;
            this.f13644 = typeParameter;
        }
        if (protoBuf$Type.hasTypeParameterName()) {
            int typeParameterName = protoBuf$Type.getTypeParameterName();
            this.f13651 |= 128;
            this.f13643 = typeParameterName;
        }
        if (protoBuf$Type.hasTypeAliasName()) {
            int typeAliasName = protoBuf$Type.getTypeAliasName();
            this.f13651 |= 256;
            this.f13642 = typeAliasName;
        }
        if (protoBuf$Type.hasOuterType()) {
            ProtoBuf$Type outerType = protoBuf$Type.getOuterType();
            if ((this.f13651 & 512) != 512 || this.f13641 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13641 = outerType;
            } else {
                C4669 c4669NewBuilder2 = ProtoBuf$Type.newBuilder(this.f13641);
                c4669NewBuilder2.m9297(outerType);
                this.f13641 = c4669NewBuilder2.m9298();
            }
            this.f13651 |= 512;
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            int outerTypeId = protoBuf$Type.getOuterTypeId();
            this.f13651 |= 1024;
            this.f13640 = outerTypeId;
        }
        if (protoBuf$Type.hasAbbreviatedType()) {
            ProtoBuf$Type abbreviatedType = protoBuf$Type.getAbbreviatedType();
            if ((this.f13651 & 2048) != 2048 || this.f13649 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13649 = abbreviatedType;
            } else {
                C4669 c4669NewBuilder3 = ProtoBuf$Type.newBuilder(this.f13649);
                c4669NewBuilder3.m9297(abbreviatedType);
                this.f13649 = c4669NewBuilder3.m9298();
            }
            this.f13651 |= 2048;
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            int abbreviatedTypeId = protoBuf$Type.getAbbreviatedTypeId();
            this.f13651 |= 4096;
            this.f13648 = abbreviatedTypeId;
        }
        if (protoBuf$Type.hasFlags()) {
            int flags = protoBuf$Type.getFlags();
            this.f13651 |= 8192;
            this.f13647 = flags;
        }
        if (!protoBuf$Type.annotation_.isEmpty()) {
            if (this.f13646.isEmpty()) {
                this.f13646 = protoBuf$Type.annotation_;
                this.f13651 &= -16385;
            } else {
                if ((this.f13651 & 16384) != 16384) {
                    this.f13646 = new ArrayList(this.f13646);
                    this.f13651 |= 16384;
                }
                this.f13646.addAll(protoBuf$Type.annotation_);
            }
        }
        m9421(protoBuf$Type);
        this.f13804 = this.f13804.m9411(protoBuf$Type.unknownFields);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Type m9298() {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this);
        int i = this.f13651;
        if ((i & 1) == 1) {
            this.f13650 = Collections.unmodifiableList(this.f13650);
            this.f13651 &= -2;
        }
        protoBuf$Type.argument_ = this.f13650;
        int i2 = (i & 2) != 2 ? 0 : 1;
        protoBuf$Type.nullable_ = this.f13654;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        protoBuf$Type.flexibleTypeCapabilitiesId_ = this.f13655;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$Type.flexibleUpperBound_ = this.f13652;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$Type.flexibleUpperBoundId_ = this.f13653;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        protoBuf$Type.className_ = this.f13645;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$Type.typeParameter_ = this.f13644;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$Type.typeParameterName_ = this.f13643;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        protoBuf$Type.typeAliasName_ = this.f13642;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        protoBuf$Type.outerType_ = this.f13641;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        protoBuf$Type.outerTypeId_ = this.f13640;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        protoBuf$Type.abbreviatedType_ = this.f13649;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        protoBuf$Type.abbreviatedTypeId_ = this.f13648;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        protoBuf$Type.flags_ = this.f13647;
        if ((this.f13651 & 16384) == 16384) {
            this.f13646 = Collections.unmodifiableList(this.f13646);
            this.f13651 &= -16385;
        }
        protoBuf$Type.annotation_ = this.f13646;
        protoBuf$Type.bitField0_ = i2;
        return protoBuf$Type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9297((ProtoBuf$Type) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9297(r3)
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
            r2.m9297(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4669.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
