package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4669 extends AbstractC4721 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value f13635;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13636;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f13637;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13638;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13639;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f13640;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public ProtoBuf$Type f13641;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f13642;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Type f13643;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$ValueParameter protoBuf$ValueParameterM9286 = m9286();
        if (protoBuf$ValueParameterM9286.isInitialized()) {
            return protoBuf$ValueParameterM9286;
        }
        throw new UninitializedMessageException(protoBuf$ValueParameterM9286);
    }

    public final Object clone() {
        C4669 c4669 = new C4669();
        c4669.f13643 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13641 = ProtoBuf$Type.getDefaultInstance();
        c4669.f13636 = Collections.EMPTY_LIST;
        c4669.f13635 = ProtoBuf$Annotation.Argument.Value.getDefaultInstance();
        c4669.m9285(m9286());
        return c4669;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9285(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.getDefaultInstance()) {
            return;
        }
        if (protoBuf$ValueParameter.hasFlags()) {
            int flags = protoBuf$ValueParameter.getFlags();
            this.f13639 |= 1;
            this.f13638 = flags;
        }
        if (protoBuf$ValueParameter.hasName()) {
            int name = protoBuf$ValueParameter.getName();
            this.f13639 |= 2;
            this.f13642 = name;
        }
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            if ((this.f13639 & 4) != 4 || this.f13643 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13643 = type;
            } else {
                C4670 c4670NewBuilder = ProtoBuf$Type.newBuilder(this.f13643);
                c4670NewBuilder.m9287(type);
                this.f13643 = c4670NewBuilder.m9288();
            }
            this.f13639 |= 4;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            int typeId = protoBuf$ValueParameter.getTypeId();
            this.f13639 |= 8;
            this.f13640 = typeId;
        }
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            ProtoBuf$Type varargElementType = protoBuf$ValueParameter.getVarargElementType();
            if ((this.f13639 & 16) != 16 || this.f13641 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13641 = varargElementType;
            } else {
                C4670 c4670NewBuilder2 = ProtoBuf$Type.newBuilder(this.f13641);
                c4670NewBuilder2.m9287(varargElementType);
                this.f13641 = c4670NewBuilder2.m9288();
            }
            this.f13639 |= 16;
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            int varargElementTypeId = protoBuf$ValueParameter.getVarargElementTypeId();
            this.f13639 |= 32;
            this.f13637 = varargElementTypeId;
        }
        if (!protoBuf$ValueParameter.annotation_.isEmpty()) {
            if (this.f13636.isEmpty()) {
                this.f13636 = protoBuf$ValueParameter.annotation_;
                this.f13639 &= -65;
            } else {
                if ((this.f13639 & 64) != 64) {
                    this.f13636 = new ArrayList(this.f13636);
                    this.f13639 |= 64;
                }
                this.f13636.addAll(protoBuf$ValueParameter.annotation_);
            }
        }
        if (protoBuf$ValueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue = protoBuf$ValueParameter.getAnnotationParameterDefaultValue();
            if ((this.f13639 & 128) != 128 || this.f13635 == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
                this.f13635 = annotationParameterDefaultValue;
            } else {
                C4662 c4662NewBuilder = ProtoBuf$Annotation.Argument.Value.newBuilder(this.f13635);
                c4662NewBuilder.m9279(annotationParameterDefaultValue);
                this.f13635 = c4662NewBuilder.m9280();
            }
            this.f13639 |= 128;
        }
        m9411(protoBuf$ValueParameter);
        this.f13808 = this.f13808.m9401(protoBuf$ValueParameter.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$ValueParameter m9286() {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this);
        int i = this.f13639;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$ValueParameter.flags_ = this.f13638;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$ValueParameter.name_ = this.f13642;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$ValueParameter.type_ = this.f13643;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$ValueParameter.typeId_ = this.f13640;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$ValueParameter.varargElementType_ = this.f13641;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        protoBuf$ValueParameter.varargElementTypeId_ = this.f13637;
        if ((this.f13639 & 64) == 64) {
            this.f13636 = Collections.unmodifiableList(this.f13636);
            this.f13639 &= -65;
        }
        protoBuf$ValueParameter.annotation_ = this.f13636;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        protoBuf$ValueParameter.annotationParameterDefaultValue_ = this.f13635;
        protoBuf$ValueParameter.bitField0_ = i2;
        return protoBuf$ValueParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9285((ProtoBuf$ValueParameter) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9285(r3)
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
            r2.m9285(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4669.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
