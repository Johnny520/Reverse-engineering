package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4681 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$Expression.ConstantValue f13680;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f13682;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f13683;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$Type f13684;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13685;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13686;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13687;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Expression protoBuf$ExpressionM9298 = m9298();
        if (protoBuf$ExpressionM9298.isInitialized()) {
            return protoBuf$ExpressionM9298;
        }
        throw new UninitializedMessageException(protoBuf$ExpressionM9298);
    }

    public final Object clone() {
        C4681 c4681 = new C4681();
        c4681.f13680 = ProtoBuf$Expression.ConstantValue.TRUE;
        c4681.f13684 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c4681.f13682 = list;
        c4681.f13683 = list;
        c4681.m9297(m9298());
        return c4681;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9297(ProtoBuf$Expression protoBuf$Expression) {
        if (protoBuf$Expression == ProtoBuf$Expression.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Expression.hasFlags()) {
            int flags = protoBuf$Expression.getFlags();
            this.f13686 |= 1;
            this.f13687 = flags;
        }
        if (protoBuf$Expression.hasValueParameterReference()) {
            int valueParameterReference = protoBuf$Expression.getValueParameterReference();
            this.f13686 |= 2;
            this.f13681 = valueParameterReference;
        }
        if (protoBuf$Expression.hasConstantValue()) {
            ProtoBuf$Expression.ConstantValue constantValue = protoBuf$Expression.getConstantValue();
            constantValue.getClass();
            this.f13686 |= 4;
            this.f13680 = constantValue;
        }
        if (protoBuf$Expression.hasIsInstanceType()) {
            ProtoBuf$Type isInstanceType = protoBuf$Expression.getIsInstanceType();
            if ((this.f13686 & 8) != 8 || this.f13684 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13684 = isInstanceType;
            } else {
                C4670 c4670NewBuilder = ProtoBuf$Type.newBuilder(this.f13684);
                c4670NewBuilder.m9287(isInstanceType);
                this.f13684 = c4670NewBuilder.m9288();
            }
            this.f13686 |= 8;
        }
        if (protoBuf$Expression.hasIsInstanceTypeId()) {
            int isInstanceTypeId = protoBuf$Expression.getIsInstanceTypeId();
            this.f13686 |= 16;
            this.f13685 = isInstanceTypeId;
        }
        if (!protoBuf$Expression.andArgument_.isEmpty()) {
            if (this.f13682.isEmpty()) {
                this.f13682 = protoBuf$Expression.andArgument_;
                this.f13686 &= -33;
            } else {
                if ((this.f13686 & 32) != 32) {
                    this.f13682 = new ArrayList(this.f13682);
                    this.f13686 |= 32;
                }
                this.f13682.addAll(protoBuf$Expression.andArgument_);
            }
        }
        if (!protoBuf$Expression.orArgument_.isEmpty()) {
            if (this.f13683.isEmpty()) {
                this.f13683 = protoBuf$Expression.orArgument_;
                this.f13686 &= -65;
            } else {
                if ((this.f13686 & 64) != 64) {
                    this.f13683 = new ArrayList(this.f13683);
                    this.f13686 |= 64;
                }
                this.f13683.addAll(protoBuf$Expression.orArgument_);
            }
        }
        this.f13808 = this.f13808.m9401(protoBuf$Expression.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Expression m9298() {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
        int i = this.f13686;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Expression.flags_ = this.f13687;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Expression.valueParameterReference_ = this.f13681;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Expression.constantValue_ = this.f13680;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$Expression.isInstanceType_ = this.f13684;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$Expression.isInstanceTypeId_ = this.f13685;
        if ((this.f13686 & 32) == 32) {
            this.f13682 = Collections.unmodifiableList(this.f13682);
            this.f13686 &= -33;
        }
        protoBuf$Expression.andArgument_ = this.f13682;
        if ((this.f13686 & 64) == 64) {
            this.f13683 = Collections.unmodifiableList(this.f13683);
            this.f13686 &= -65;
        }
        protoBuf$Expression.orArgument_ = this.f13683;
        protoBuf$Expression.bitField0_ = i2;
        return protoBuf$Expression;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9297((ProtoBuf$Expression) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9297(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4681.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
