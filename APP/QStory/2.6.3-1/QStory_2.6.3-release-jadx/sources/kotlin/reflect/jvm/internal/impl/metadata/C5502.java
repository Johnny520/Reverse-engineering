package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5502 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f13989;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public ProtoBuf$Type f13990;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f13991;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f13992;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f13993;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f13994;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public List f13995;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f13996;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f13997;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public ProtoBuf$Type f13998;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public List f13999;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f14000;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public ProtoBuf$Type f14001;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f14002;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f14003;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f14004;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Type protoBuf$TypeM9847 = m9847();
        if (protoBuf$TypeM9847.isInitialized()) {
            return protoBuf$TypeM9847;
        }
        throw new UninitializedMessageException(protoBuf$TypeM9847);
    }

    public final Object clone() {
        C5502 c5502 = new C5502();
        List list = Collections.EMPTY_LIST;
        c5502.f13999 = list;
        c5502.f14001 = ProtoBuf$Type.getDefaultInstance();
        c5502.f13990 = ProtoBuf$Type.getDefaultInstance();
        c5502.f13998 = ProtoBuf$Type.getDefaultInstance();
        c5502.f13995 = list;
        c5502.m9846(m9847());
        return c5502;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5502 m9846(ProtoBuf$Type protoBuf$Type) {
        if (protoBuf$Type == ProtoBuf$Type.getDefaultInstance()) {
            return this;
        }
        if (!protoBuf$Type.argument_.isEmpty()) {
            if (this.f13999.isEmpty()) {
                this.f13999 = protoBuf$Type.argument_;
                this.f14000 &= -2;
            } else {
                if ((this.f14000 & 1) != 1) {
                    this.f13999 = new ArrayList(this.f13999);
                    this.f14000 |= 1;
                }
                this.f13999.addAll(protoBuf$Type.argument_);
            }
        }
        if (protoBuf$Type.hasNullable()) {
            boolean nullable = protoBuf$Type.getNullable();
            this.f14000 |= 2;
            this.f14003 = nullable;
        }
        if (protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
            int flexibleTypeCapabilitiesId = protoBuf$Type.getFlexibleTypeCapabilitiesId();
            this.f14000 |= 4;
            this.f14004 = flexibleTypeCapabilitiesId;
        }
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            ProtoBuf$Type flexibleUpperBound = protoBuf$Type.getFlexibleUpperBound();
            if ((this.f14000 & 8) != 8 || this.f14001 == ProtoBuf$Type.getDefaultInstance()) {
                this.f14001 = flexibleUpperBound;
            } else {
                C5502 c5502NewBuilder = ProtoBuf$Type.newBuilder(this.f14001);
                c5502NewBuilder.m9846(flexibleUpperBound);
                this.f14001 = c5502NewBuilder.m9847();
            }
            this.f14000 |= 8;
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            int flexibleUpperBoundId = protoBuf$Type.getFlexibleUpperBoundId();
            this.f14000 |= 16;
            this.f14002 = flexibleUpperBoundId;
        }
        if (protoBuf$Type.hasClassName()) {
            int className = protoBuf$Type.getClassName();
            this.f14000 |= 32;
            this.f13994 = className;
        }
        if (protoBuf$Type.hasTypeParameter()) {
            int typeParameter = protoBuf$Type.getTypeParameter();
            this.f14000 |= 64;
            this.f13993 = typeParameter;
        }
        if (protoBuf$Type.hasTypeParameterName()) {
            int typeParameterName = protoBuf$Type.getTypeParameterName();
            this.f14000 |= 128;
            this.f13992 = typeParameterName;
        }
        if (protoBuf$Type.hasTypeAliasName()) {
            int typeAliasName = protoBuf$Type.getTypeAliasName();
            this.f14000 |= 256;
            this.f13991 = typeAliasName;
        }
        if (protoBuf$Type.hasOuterType()) {
            ProtoBuf$Type outerType = protoBuf$Type.getOuterType();
            if ((this.f14000 & 512) != 512 || this.f13990 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13990 = outerType;
            } else {
                C5502 c5502NewBuilder2 = ProtoBuf$Type.newBuilder(this.f13990);
                c5502NewBuilder2.m9846(outerType);
                this.f13990 = c5502NewBuilder2.m9847();
            }
            this.f14000 |= 512;
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            int outerTypeId = protoBuf$Type.getOuterTypeId();
            this.f14000 |= 1024;
            this.f13989 = outerTypeId;
        }
        if (protoBuf$Type.hasAbbreviatedType()) {
            ProtoBuf$Type abbreviatedType = protoBuf$Type.getAbbreviatedType();
            if ((this.f14000 & 2048) != 2048 || this.f13998 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13998 = abbreviatedType;
            } else {
                C5502 c5502NewBuilder3 = ProtoBuf$Type.newBuilder(this.f13998);
                c5502NewBuilder3.m9846(abbreviatedType);
                this.f13998 = c5502NewBuilder3.m9847();
            }
            this.f14000 |= 2048;
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            int abbreviatedTypeId = protoBuf$Type.getAbbreviatedTypeId();
            this.f14000 |= 4096;
            this.f13997 = abbreviatedTypeId;
        }
        if (protoBuf$Type.hasFlags()) {
            int flags = protoBuf$Type.getFlags();
            this.f14000 |= 8192;
            this.f13996 = flags;
        }
        if (!protoBuf$Type.annotation_.isEmpty()) {
            if (this.f13995.isEmpty()) {
                this.f13995 = protoBuf$Type.annotation_;
                this.f14000 &= -16385;
            } else {
                if ((this.f14000 & 16384) != 16384) {
                    this.f13995 = new ArrayList(this.f13995);
                    this.f14000 |= 16384;
                }
                this.f13995.addAll(protoBuf$Type.annotation_);
            }
        }
        m9970(protoBuf$Type);
        this.f14153 = this.f14153.m9960(protoBuf$Type.unknownFields);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Type m9847() {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this);
        int i = this.f14000;
        if ((i & 1) == 1) {
            this.f13999 = Collections.unmodifiableList(this.f13999);
            this.f14000 &= -2;
        }
        protoBuf$Type.argument_ = this.f13999;
        int i2 = (i & 2) != 2 ? 0 : 1;
        protoBuf$Type.nullable_ = this.f14003;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        protoBuf$Type.flexibleTypeCapabilitiesId_ = this.f14004;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$Type.flexibleUpperBound_ = this.f14001;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$Type.flexibleUpperBoundId_ = this.f14002;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        protoBuf$Type.className_ = this.f13994;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        protoBuf$Type.typeParameter_ = this.f13993;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$Type.typeParameterName_ = this.f13992;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        protoBuf$Type.typeAliasName_ = this.f13991;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        protoBuf$Type.outerType_ = this.f13990;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        protoBuf$Type.outerTypeId_ = this.f13989;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        protoBuf$Type.abbreviatedType_ = this.f13998;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        protoBuf$Type.abbreviatedTypeId_ = this.f13997;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        protoBuf$Type.flags_ = this.f13996;
        if ((this.f14000 & 16384) == 16384) {
            this.f13995 = Collections.unmodifiableList(this.f13995);
            this.f14000 &= -16385;
        }
        protoBuf$Type.annotation_ = this.f13995;
        protoBuf$Type.bitField0_ = i2;
        return protoBuf$Type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9846((ProtoBuf$Type) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Type protoBuf$Type = null;
        try {
            try {
                m9846((ProtoBuf$Type) ProtoBuf$Type.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Type = protoBuf$Type2;
                    if (protoBuf$Type != null) {
                        m9846(protoBuf$Type);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Type != null) {
            }
            throw th;
        }
    }
}
