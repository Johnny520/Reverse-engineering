package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5510 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$Expression f14019;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f14020;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$Effect.InvocationKind f14021;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Effect.EffectConditionKind f14022;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14023;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Effect.EffectType f14024;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Effect protoBuf$EffectM9855 = m9855();
        if (protoBuf$EffectM9855.isInitialized()) {
            return protoBuf$EffectM9855;
        }
        throw new UninitializedMessageException(protoBuf$EffectM9855);
    }

    public final Object clone() {
        C5510 c5510 = new C5510();
        c5510.f14024 = ProtoBuf$Effect.EffectType.RETURNS_CONSTANT;
        c5510.f14020 = Collections.EMPTY_LIST;
        c5510.f14019 = ProtoBuf$Expression.getDefaultInstance();
        c5510.f14021 = ProtoBuf$Effect.InvocationKind.AT_MOST_ONCE;
        c5510.f14022 = ProtoBuf$Effect.EffectConditionKind.CONCLUSION_CONDITION;
        c5510.m9854(m9855());
        return c5510;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9854(ProtoBuf$Effect protoBuf$Effect) {
        if (protoBuf$Effect == ProtoBuf$Effect.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Effect.hasEffectType()) {
            ProtoBuf$Effect.EffectType effectType = protoBuf$Effect.getEffectType();
            effectType.getClass();
            this.f14023 |= 1;
            this.f14024 = effectType;
        }
        if (!protoBuf$Effect.effectConstructorArgument_.isEmpty()) {
            if (this.f14020.isEmpty()) {
                this.f14020 = protoBuf$Effect.effectConstructorArgument_;
                this.f14023 &= -3;
            } else {
                if ((this.f14023 & 2) != 2) {
                    this.f14020 = new ArrayList(this.f14020);
                    this.f14023 |= 2;
                }
                this.f14020.addAll(protoBuf$Effect.effectConstructorArgument_);
            }
        }
        if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
            ProtoBuf$Expression conclusionOfConditionalEffect = protoBuf$Effect.getConclusionOfConditionalEffect();
            if ((this.f14023 & 4) != 4 || this.f14019 == ProtoBuf$Expression.getDefaultInstance()) {
                this.f14019 = conclusionOfConditionalEffect;
            } else {
                C5513 c5513NewBuilder = ProtoBuf$Expression.newBuilder(this.f14019);
                c5513NewBuilder.m9856(conclusionOfConditionalEffect);
                this.f14019 = c5513NewBuilder.m9857();
            }
            this.f14023 |= 4;
        }
        if (protoBuf$Effect.hasKind()) {
            ProtoBuf$Effect.InvocationKind kind = protoBuf$Effect.getKind();
            kind.getClass();
            this.f14023 |= 8;
            this.f14021 = kind;
        }
        if (protoBuf$Effect.hasConditionKind()) {
            ProtoBuf$Effect.EffectConditionKind conditionKind = protoBuf$Effect.getConditionKind();
            conditionKind.getClass();
            this.f14023 |= 16;
            this.f14022 = conditionKind;
        }
        this.f14153 = this.f14153.m9960(protoBuf$Effect.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Effect m9855() {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
        int i = this.f14023;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Effect.effectType_ = this.f14024;
        if ((this.f14023 & 2) == 2) {
            this.f14020 = Collections.unmodifiableList(this.f14020);
            this.f14023 &= -3;
        }
        protoBuf$Effect.effectConstructorArgument_ = this.f14020;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        protoBuf$Effect.conclusionOfConditionalEffect_ = this.f14019;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$Effect.kind_ = this.f14021;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$Effect.conditionKind_ = this.f14022;
        protoBuf$Effect.bitField0_ = i2;
        return protoBuf$Effect;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9854((ProtoBuf$Effect) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Effect protoBuf$Effect = null;
        try {
            try {
                m9854((ProtoBuf$Effect) ProtoBuf$Effect.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Effect protoBuf$Effect2 = (ProtoBuf$Effect) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Effect = protoBuf$Effect2;
                    if (protoBuf$Effect != null) {
                        m9854(protoBuf$Effect);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (protoBuf$Effect != null) {
            }
            throw th;
        }
    }
}
