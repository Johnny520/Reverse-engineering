package p091;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.C5502;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: 飘花落叶言世楪哲苏子兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7782 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public List f18922;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public List f18923;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public List f18924;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f18925;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Type f18926;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f18927;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f18928;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f18929;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f18930;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f18931;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C7782 m12808() {
        C7782 c7782 = new C7782();
        c7782.f18927 = 6;
        List list = Collections.EMPTY_LIST;
        c7782.f18932 = list;
        c7782.f18929 = ProtoBuf$Type.getDefaultInstance();
        c7782.f18926 = ProtoBuf$Type.getDefaultInstance();
        c7782.f18924 = list;
        c7782.f18923 = list;
        c7782.f18922 = list;
        return c7782;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$TypeAlias protoBuf$TypeAliasM12810 = m12810();
        if (protoBuf$TypeAliasM12810.isInitialized()) {
            return protoBuf$TypeAliasM12810;
        }
        throw new UninitializedMessageException(protoBuf$TypeAliasM12810);
    }

    public final Object clone() {
        C7782 c7782M12808 = m12808();
        c7782M12808.m12809(m12810());
        return c7782M12808;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12809(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.getDefaultInstance()) {
            return;
        }
        if (protoBuf$TypeAlias.hasFlags()) {
            int flags = protoBuf$TypeAlias.getFlags();
            this.f18928 |= 1;
            this.f18927 = flags;
        }
        if (protoBuf$TypeAlias.hasName()) {
            int name = protoBuf$TypeAlias.getName();
            this.f18928 |= 2;
            this.f18931 = name;
        }
        if (!protoBuf$TypeAlias.typeParameter_.isEmpty()) {
            if (this.f18932.isEmpty()) {
                this.f18932 = protoBuf$TypeAlias.typeParameter_;
                this.f18928 &= -5;
            } else {
                if ((this.f18928 & 4) != 4) {
                    this.f18932 = new ArrayList(this.f18932);
                    this.f18928 |= 4;
                }
                this.f18932.addAll(protoBuf$TypeAlias.typeParameter_);
            }
        }
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            if ((this.f18928 & 8) != 8 || this.f18929 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18929 = underlyingType;
            } else {
                C5502 c5502NewBuilder = ProtoBuf$Type.newBuilder(this.f18929);
                c5502NewBuilder.m9846(underlyingType);
                this.f18929 = c5502NewBuilder.m9847();
            }
            this.f18928 |= 8;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            int underlyingTypeId = protoBuf$TypeAlias.getUnderlyingTypeId();
            this.f18928 |= 16;
            this.f18930 = underlyingTypeId;
        }
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            if ((this.f18928 & 32) != 32 || this.f18926 == ProtoBuf$Type.getDefaultInstance()) {
                this.f18926 = expandedType;
            } else {
                C5502 c5502NewBuilder2 = ProtoBuf$Type.newBuilder(this.f18926);
                c5502NewBuilder2.m9846(expandedType);
                this.f18926 = c5502NewBuilder2.m9847();
            }
            this.f18928 |= 32;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            int expandedTypeId = protoBuf$TypeAlias.getExpandedTypeId();
            this.f18928 |= 64;
            this.f18925 = expandedTypeId;
        }
        if (!protoBuf$TypeAlias.annotation_.isEmpty()) {
            if (this.f18924.isEmpty()) {
                this.f18924 = protoBuf$TypeAlias.annotation_;
                this.f18928 &= -129;
            } else {
                if ((this.f18928 & 128) != 128) {
                    this.f18924 = new ArrayList(this.f18924);
                    this.f18928 |= 128;
                }
                this.f18924.addAll(protoBuf$TypeAlias.annotation_);
            }
        }
        if (!protoBuf$TypeAlias.versionRequirement_.isEmpty()) {
            if (this.f18923.isEmpty()) {
                this.f18923 = protoBuf$TypeAlias.versionRequirement_;
                this.f18928 &= -257;
            } else {
                if ((this.f18928 & 256) != 256) {
                    this.f18923 = new ArrayList(this.f18923);
                    this.f18928 |= 256;
                }
                this.f18923.addAll(protoBuf$TypeAlias.versionRequirement_);
            }
        }
        if (!protoBuf$TypeAlias.compilerPluginData_.isEmpty()) {
            if (this.f18922.isEmpty()) {
                this.f18922 = protoBuf$TypeAlias.compilerPluginData_;
                this.f18928 &= -513;
            } else {
                if ((this.f18928 & 512) != 512) {
                    this.f18922 = new ArrayList(this.f18922);
                    this.f18928 |= 512;
                }
                this.f18922.addAll(protoBuf$TypeAlias.compilerPluginData_);
            }
        }
        m9970(protoBuf$TypeAlias);
        this.f14153 = this.f14153.m9960(protoBuf$TypeAlias.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$TypeAlias m12810() {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this);
        int i = this.f18928;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$TypeAlias.flags_ = this.f18927;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$TypeAlias.name_ = this.f18931;
        if ((this.f18928 & 4) == 4) {
            this.f18932 = Collections.unmodifiableList(this.f18932);
            this.f18928 &= -5;
        }
        protoBuf$TypeAlias.typeParameter_ = this.f18932;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$TypeAlias.underlyingType_ = this.f18929;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$TypeAlias.underlyingTypeId_ = this.f18930;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        protoBuf$TypeAlias.expandedType_ = this.f18926;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$TypeAlias.expandedTypeId_ = this.f18925;
        if ((this.f18928 & 128) == 128) {
            this.f18924 = Collections.unmodifiableList(this.f18924);
            this.f18928 &= -129;
        }
        protoBuf$TypeAlias.annotation_ = this.f18924;
        if ((this.f18928 & 256) == 256) {
            this.f18923 = Collections.unmodifiableList(this.f18923);
            this.f18928 &= -257;
        }
        protoBuf$TypeAlias.versionRequirement_ = this.f18923;
        if ((this.f18928 & 512) == 512) {
            this.f18922 = Collections.unmodifiableList(this.f18922);
            this.f18928 &= -513;
        }
        protoBuf$TypeAlias.compilerPluginData_ = this.f18922;
        protoBuf$TypeAlias.bitField0_ = i2;
        return protoBuf$TypeAlias;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m12809((ProtoBuf$TypeAlias) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = null;
        try {
            try {
                m12809((ProtoBuf$TypeAlias) ProtoBuf$TypeAlias.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$TypeAlias protoBuf$TypeAlias2 = (ProtoBuf$TypeAlias) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$TypeAlias = protoBuf$TypeAlias2;
                    if (protoBuf$TypeAlias != null) {
                        m12809(protoBuf$TypeAlias);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$TypeAlias != null) {
            }
            throw th;
        }
    }
}
