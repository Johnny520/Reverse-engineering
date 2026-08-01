package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5513 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$Expression.ConstantValue f14025;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f14026;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f14027;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f14028;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$Type f14029;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f14030;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14032;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Expression protoBuf$ExpressionM9857 = m9857();
        if (protoBuf$ExpressionM9857.isInitialized()) {
            return protoBuf$ExpressionM9857;
        }
        throw new UninitializedMessageException(protoBuf$ExpressionM9857);
    }

    public final Object clone() {
        C5513 c5513 = new C5513();
        c5513.f14025 = ProtoBuf$Expression.ConstantValue.TRUE;
        c5513.f14029 = ProtoBuf$Type.getDefaultInstance();
        List list = Collections.EMPTY_LIST;
        c5513.f14027 = list;
        c5513.f14028 = list;
        c5513.m9856(m9857());
        return c5513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9856(ProtoBuf$Expression protoBuf$Expression) {
        if (protoBuf$Expression == ProtoBuf$Expression.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Expression.hasFlags()) {
            int flags = protoBuf$Expression.getFlags();
            this.f14031 |= 1;
            this.f14032 = flags;
        }
        if (protoBuf$Expression.hasValueParameterReference()) {
            int valueParameterReference = protoBuf$Expression.getValueParameterReference();
            this.f14031 |= 2;
            this.f14026 = valueParameterReference;
        }
        if (protoBuf$Expression.hasConstantValue()) {
            ProtoBuf$Expression.ConstantValue constantValue = protoBuf$Expression.getConstantValue();
            constantValue.getClass();
            this.f14031 |= 4;
            this.f14025 = constantValue;
        }
        if (protoBuf$Expression.hasIsInstanceType()) {
            ProtoBuf$Type isInstanceType = protoBuf$Expression.getIsInstanceType();
            if ((this.f14031 & 8) != 8 || this.f14029 == ProtoBuf$Type.getDefaultInstance()) {
                this.f14029 = isInstanceType;
            } else {
                C5502 c5502NewBuilder = ProtoBuf$Type.newBuilder(this.f14029);
                c5502NewBuilder.m9846(isInstanceType);
                this.f14029 = c5502NewBuilder.m9847();
            }
            this.f14031 |= 8;
        }
        if (protoBuf$Expression.hasIsInstanceTypeId()) {
            int isInstanceTypeId = protoBuf$Expression.getIsInstanceTypeId();
            this.f14031 |= 16;
            this.f14030 = isInstanceTypeId;
        }
        if (!protoBuf$Expression.andArgument_.isEmpty()) {
            if (this.f14027.isEmpty()) {
                this.f14027 = protoBuf$Expression.andArgument_;
                this.f14031 &= -33;
            } else {
                if ((this.f14031 & 32) != 32) {
                    this.f14027 = new ArrayList(this.f14027);
                    this.f14031 |= 32;
                }
                this.f14027.addAll(protoBuf$Expression.andArgument_);
            }
        }
        if (!protoBuf$Expression.orArgument_.isEmpty()) {
            if (this.f14028.isEmpty()) {
                this.f14028 = protoBuf$Expression.orArgument_;
                this.f14031 &= -65;
            } else {
                if ((this.f14031 & 64) != 64) {
                    this.f14028 = new ArrayList(this.f14028);
                    this.f14031 |= 64;
                }
                this.f14028.addAll(protoBuf$Expression.orArgument_);
            }
        }
        this.f14153 = this.f14153.m9960(protoBuf$Expression.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Expression m9857() {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
        int i = this.f14031;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Expression.flags_ = this.f14032;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        protoBuf$Expression.valueParameterReference_ = this.f14026;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        protoBuf$Expression.constantValue_ = this.f14025;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        protoBuf$Expression.isInstanceType_ = this.f14029;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        protoBuf$Expression.isInstanceTypeId_ = this.f14030;
        if ((this.f14031 & 32) == 32) {
            this.f14027 = Collections.unmodifiableList(this.f14027);
            this.f14031 &= -33;
        }
        protoBuf$Expression.andArgument_ = this.f14027;
        if ((this.f14031 & 64) == 64) {
            this.f14028 = Collections.unmodifiableList(this.f14028);
            this.f14031 &= -65;
        }
        protoBuf$Expression.orArgument_ = this.f14028;
        protoBuf$Expression.bitField0_ = i2;
        return protoBuf$Expression;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9856((ProtoBuf$Expression) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Expression protoBuf$Expression = null;
        try {
            try {
                m9856((ProtoBuf$Expression) ProtoBuf$Expression.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Expression protoBuf$Expression2 = (ProtoBuf$Expression) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Expression = protoBuf$Expression2;
                    if (protoBuf$Expression != null) {
                        m9856(protoBuf$Expression);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Expression != null) {
            }
            throw th;
        }
    }
}
