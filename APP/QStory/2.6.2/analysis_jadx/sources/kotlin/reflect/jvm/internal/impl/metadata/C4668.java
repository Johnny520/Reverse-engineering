package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4668 extends AbstractC4720 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value f13631;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13632;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f13633;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13634;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13635;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f13636;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ProtoBuf$Type f13637;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13638;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Type f13639;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$ValueParameter protoBuf$ValueParameterM9296 = m9296();
        if (protoBuf$ValueParameterM9296.isInitialized()) {
            return protoBuf$ValueParameterM9296;
        }
        throw new UninitializedMessageException(protoBuf$ValueParameterM9296);
    }

    public final Object clone() {
        C4668 c4668 = new C4668();
        c4668.f13639 = ProtoBuf$Type.getDefaultInstance();
        c4668.f13637 = ProtoBuf$Type.getDefaultInstance();
        c4668.f13632 = Collections.EMPTY_LIST;
        c4668.f13631 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        c4668.m9295(m9296());
        return c4668;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9295(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.getDefaultInstance()) {
            return;
        }
        if (protoBuf$ValueParameter.hasFlags()) {
            int flags = protoBuf$ValueParameter.getFlags();
            this.f13635 |= 1;
            this.f13634 = flags;
        }
        if (protoBuf$ValueParameter.hasName()) {
            int name = protoBuf$ValueParameter.getName();
            this.f13635 |= 2;
            this.f13638 = name;
        }
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            if ((this.f13635 & 4) != 4 || this.f13639 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13639 = type;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f13639);
                c4669NewBuilder.m9297(type);
                this.f13639 = c4669NewBuilder.m9298();
            }
            this.f13635 |= 4;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            int typeId = protoBuf$ValueParameter.getTypeId();
            this.f13635 |= 8;
            this.f13636 = typeId;
        }
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            ProtoBuf$Type varargElementType = protoBuf$ValueParameter.getVarargElementType();
            if ((this.f13635 & 16) != 16 || this.f13637 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13637 = varargElementType;
            } else {
                C4669 c4669NewBuilder2 = ProtoBuf$Type.newBuilder(this.f13637);
                c4669NewBuilder2.m9297(varargElementType);
                this.f13637 = c4669NewBuilder2.m9298();
            }
            this.f13635 |= 16;
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            int varargElementTypeId = protoBuf$ValueParameter.getVarargElementTypeId();
            this.f13635 |= 32;
            this.f13633 = varargElementTypeId;
        }
        if (!protoBuf$ValueParameter.annotation_.isEmpty()) {
            if (this.f13632.isEmpty()) {
                this.f13632 = protoBuf$ValueParameter.annotation_;
                this.f13635 &= -65;
            } else {
                if ((this.f13635 & 64) != 64) {
                    this.f13632 = new ArrayList(this.f13632);
                    this.f13635 |= 64;
                }
                this.f13632.addAll(protoBuf$ValueParameter.annotation_);
            }
        }
        if (protoBuf$ValueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue = protoBuf$ValueParameter.getAnnotationParameterDefaultValue();
            if ((this.f13635 & 128) != 128 || this.f13631 == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
                this.f13631 = annotationParameterDefaultValue;
            } else {
                C4661 c4661NewBuilder = ProtoBuf$Annotation.Argument.Value.newBuilder(this.f13631);
                c4661NewBuilder.m9289(annotationParameterDefaultValue);
                this.f13631 = c4661NewBuilder.m9290();
            }
            this.f13635 |= 128;
        }
        m9421(protoBuf$ValueParameter);
        this.f13804 = this.f13804.m9411(protoBuf$ValueParameter.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$ValueParameter m9296() {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this);
        int i = this.f13635;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$ValueParameter.flags_ = this.f13634;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$ValueParameter.name_ = this.f13638;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$ValueParameter.type_ = this.f13639;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$ValueParameter.typeId_ = this.f13636;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$ValueParameter.varargElementType_ = this.f13637;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        protoBuf$ValueParameter.varargElementTypeId_ = this.f13633;
        if ((this.f13635 & 64) == 64) {
            this.f13632 = Collections.unmodifiableList(this.f13632);
            this.f13635 &= -65;
        }
        protoBuf$ValueParameter.annotation_ = this.f13632;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$ValueParameter.annotationParameterDefaultValue_ = this.f13631;
        protoBuf$ValueParameter.bitField0_ = i2;
        return protoBuf$ValueParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9295((ProtoBuf$ValueParameter) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9295(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9295(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4668.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
