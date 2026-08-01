package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5501 extends AbstractC5553 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value f13980;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13981;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f13982;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13983;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13984;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f13985;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ProtoBuf$Type f13986;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13987;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Type f13988;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$ValueParameter protoBuf$ValueParameterM9845 = m9845();
        if (protoBuf$ValueParameterM9845.isInitialized()) {
            return protoBuf$ValueParameterM9845;
        }
        throw new UninitializedMessageException(protoBuf$ValueParameterM9845);
    }

    public final Object clone() {
        C5501 c5501 = new C5501();
        c5501.f13988 = ProtoBuf$Type.getDefaultInstance();
        c5501.f13986 = ProtoBuf$Type.getDefaultInstance();
        c5501.f13981 = Collections.EMPTY_LIST;
        c5501.f13980 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        c5501.m9844(m9845());
        return c5501;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9844(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.getDefaultInstance()) {
            return;
        }
        if (protoBuf$ValueParameter.hasFlags()) {
            int flags = protoBuf$ValueParameter.getFlags();
            this.f13984 |= 1;
            this.f13983 = flags;
        }
        if (protoBuf$ValueParameter.hasName()) {
            int name = protoBuf$ValueParameter.getName();
            this.f13984 |= 2;
            this.f13987 = name;
        }
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            if ((this.f13984 & 4) != 4 || this.f13988 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13988 = type;
            } else {
                C5502 c5502NewBuilder = ProtoBuf$Type.newBuilder(this.f13988);
                c5502NewBuilder.m9846(type);
                this.f13988 = c5502NewBuilder.m9847();
            }
            this.f13984 |= 4;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            int typeId = protoBuf$ValueParameter.getTypeId();
            this.f13984 |= 8;
            this.f13985 = typeId;
        }
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            ProtoBuf$Type varargElementType = protoBuf$ValueParameter.getVarargElementType();
            if ((this.f13984 & 16) != 16 || this.f13986 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13986 = varargElementType;
            } else {
                C5502 c5502NewBuilder2 = ProtoBuf$Type.newBuilder(this.f13986);
                c5502NewBuilder2.m9846(varargElementType);
                this.f13986 = c5502NewBuilder2.m9847();
            }
            this.f13984 |= 16;
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            int varargElementTypeId = protoBuf$ValueParameter.getVarargElementTypeId();
            this.f13984 |= 32;
            this.f13982 = varargElementTypeId;
        }
        if (!protoBuf$ValueParameter.annotation_.isEmpty()) {
            if (this.f13981.isEmpty()) {
                this.f13981 = protoBuf$ValueParameter.annotation_;
                this.f13984 &= -65;
            } else {
                if ((this.f13984 & 64) != 64) {
                    this.f13981 = new ArrayList(this.f13981);
                    this.f13984 |= 64;
                }
                this.f13981.addAll(protoBuf$ValueParameter.annotation_);
            }
        }
        if (protoBuf$ValueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue = protoBuf$ValueParameter.getAnnotationParameterDefaultValue();
            if ((this.f13984 & 128) != 128 || this.f13980 == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
                this.f13980 = annotationParameterDefaultValue;
            } else {
                C5494 c5494NewBuilder = ProtoBuf$Annotation.Argument.Value.newBuilder(this.f13980);
                c5494NewBuilder.m9838(annotationParameterDefaultValue);
                this.f13980 = c5494NewBuilder.m9839();
            }
            this.f13984 |= 128;
        }
        m9970(protoBuf$ValueParameter);
        this.f14153 = this.f14153.m9960(protoBuf$ValueParameter.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$ValueParameter m9845() {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this);
        int i = this.f13984;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$ValueParameter.flags_ = this.f13983;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$ValueParameter.name_ = this.f13987;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$ValueParameter.type_ = this.f13988;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$ValueParameter.typeId_ = this.f13985;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$ValueParameter.varargElementType_ = this.f13986;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        protoBuf$ValueParameter.varargElementTypeId_ = this.f13982;
        if ((this.f13984 & 64) == 64) {
            this.f13981 = Collections.unmodifiableList(this.f13981);
            this.f13984 &= -65;
        }
        protoBuf$ValueParameter.annotation_ = this.f13981;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$ValueParameter.annotationParameterDefaultValue_ = this.f13980;
        protoBuf$ValueParameter.bitField0_ = i2;
        return protoBuf$ValueParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9844((ProtoBuf$ValueParameter) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = null;
        try {
            try {
                m9844((ProtoBuf$ValueParameter) ProtoBuf$ValueParameter.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter2 = (ProtoBuf$ValueParameter) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$ValueParameter = protoBuf$ValueParameter2;
                    if (protoBuf$ValueParameter != null) {
                        m9844(protoBuf$ValueParameter);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$ValueParameter != null) {
            }
            throw th;
        }
    }
}
