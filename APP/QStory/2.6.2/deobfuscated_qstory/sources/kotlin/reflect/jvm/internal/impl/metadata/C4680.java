package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4680 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$Expression.ConstantValue f13676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f13678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f13679;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$Type f13680;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13683;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Expression protoBuf$ExpressionM9308 = m9308();
        if (protoBuf$ExpressionM9308.isInitialized()) {
            return protoBuf$ExpressionM9308;
        }
        throw new UninitializedMessageException(protoBuf$ExpressionM9308);
    }

    public final Object clone() {
        C4680 c4680 = new C4680();
        c4680.f13676 = ProtoBuf$Expression.ConstantValue.TRUE;
        c4680.f13680 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c4680.f13678 = list;
        c4680.f13679 = list;
        c4680.m9307(m9308());
        return c4680;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9307(ProtoBuf$Expression protoBuf$Expression) {
        if (protoBuf$Expression == ProtoBuf$Expression.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Expression.hasFlags()) {
            int flags = protoBuf$Expression.getFlags();
            this.f13682 |= 1;
            this.f13683 = flags;
        }
        if (protoBuf$Expression.hasValueParameterReference()) {
            int valueParameterReference = protoBuf$Expression.getValueParameterReference();
            this.f13682 |= 2;
            this.f13677 = valueParameterReference;
        }
        if (protoBuf$Expression.hasConstantValue()) {
            ProtoBuf$Expression.ConstantValue constantValue = protoBuf$Expression.getConstantValue();
            constantValue.getClass();
            this.f13682 |= 4;
            this.f13676 = constantValue;
        }
        if (protoBuf$Expression.hasIsInstanceType()) {
            ProtoBuf$Type isInstanceType = protoBuf$Expression.getIsInstanceType();
            if ((this.f13682 & 8) != 8 || this.f13680 == ProtoBuf$Type.getDefaultInstance()) {
                this.f13680 = isInstanceType;
            } else {
                C4669 c4669NewBuilder = ProtoBuf$Type.newBuilder(this.f13680);
                c4669NewBuilder.m9297(isInstanceType);
                this.f13680 = c4669NewBuilder.m9298();
            }
            this.f13682 |= 8;
        }
        if (protoBuf$Expression.hasIsInstanceTypeId()) {
            int isInstanceTypeId = protoBuf$Expression.getIsInstanceTypeId();
            this.f13682 |= 16;
            this.f13681 = isInstanceTypeId;
        }
        if (!protoBuf$Expression.andArgument_.isEmpty()) {
            if (this.f13678.isEmpty()) {
                this.f13678 = protoBuf$Expression.andArgument_;
                this.f13682 &= -33;
            } else {
                if ((this.f13682 & 32) != 32) {
                    this.f13678 = new ArrayList(this.f13678);
                    this.f13682 |= 32;
                }
                this.f13678.addAll(protoBuf$Expression.andArgument_);
            }
        }
        if (!protoBuf$Expression.orArgument_.isEmpty()) {
            if (this.f13679.isEmpty()) {
                this.f13679 = protoBuf$Expression.orArgument_;
                this.f13682 &= -65;
            } else {
                if ((this.f13682 & 64) != 64) {
                    this.f13679 = new ArrayList(this.f13679);
                    this.f13682 |= 64;
                }
                this.f13679.addAll(protoBuf$Expression.orArgument_);
            }
        }
        this.f13804 = this.f13804.m9411(protoBuf$Expression.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Expression m9308() {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
        int i = this.f13682;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Expression.flags_ = this.f13683;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Expression.valueParameterReference_ = this.f13677;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Expression.constantValue_ = this.f13676;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$Expression.isInstanceType_ = this.f13680;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$Expression.isInstanceTypeId_ = this.f13681;
        if ((this.f13682 & 32) == 32) {
            this.f13678 = Collections.unmodifiableList(this.f13678);
            this.f13682 &= -33;
        }
        protoBuf$Expression.andArgument_ = this.f13678;
        if ((this.f13682 & 64) == 64) {
            this.f13679 = Collections.unmodifiableList(this.f13679);
            this.f13682 &= -65;
        }
        protoBuf$Expression.orArgument_ = this.f13679;
        protoBuf$Expression.bitField0_ = i2;
        return protoBuf$Expression;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9307((ProtoBuf$Expression) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9307(r3)
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
            r2.m9307(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4680.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
