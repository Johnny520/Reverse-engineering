package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4677 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$Expression f13670;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f13671;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$Effect.InvocationKind f13672;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Effect.EffectConditionKind f13673;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13674;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Effect.EffectType f13675;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Effect protoBuf$EffectM9306 = m9306();
        if (protoBuf$EffectM9306.isInitialized()) {
            return protoBuf$EffectM9306;
        }
        throw new UninitializedMessageException(protoBuf$EffectM9306);
    }

    public final Object clone() {
        C4677 c4677 = new C4677();
        c4677.f13675 = ProtoBuf$Effect.EffectType.RETURNS_CONSTANT;
        c4677.f13671 = Collections.EMPTY_LIST;
        c4677.f13670 = ProtoBuf$Expression.getDefaultInstance();
        c4677.f13672 = ProtoBuf$Effect.InvocationKind.AT_MOST_ONCE;
        c4677.f13673 = ProtoBuf$Effect.EffectConditionKind.CONCLUSION_CONDITION;
        c4677.m9305(m9306());
        return c4677;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9305(ProtoBuf$Effect protoBuf$Effect) {
        if (protoBuf$Effect == ProtoBuf$Effect.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Effect.hasEffectType()) {
            ProtoBuf$Effect.EffectType effectType = protoBuf$Effect.getEffectType();
            effectType.getClass();
            this.f13674 |= 1;
            this.f13675 = effectType;
        }
        if (!protoBuf$Effect.effectConstructorArgument_.isEmpty()) {
            if (this.f13671.isEmpty()) {
                this.f13671 = protoBuf$Effect.effectConstructorArgument_;
                this.f13674 &= -3;
            } else {
                if ((this.f13674 & 2) != 2) {
                    this.f13671 = new ArrayList(this.f13671);
                    this.f13674 |= 2;
                }
                this.f13671.addAll(protoBuf$Effect.effectConstructorArgument_);
            }
        }
        if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
            ProtoBuf$Expression conclusionOfConditionalEffect = protoBuf$Effect.getConclusionOfConditionalEffect();
            if ((this.f13674 & 4) != 4 || this.f13670 == ProtoBuf$Expression.getDefaultInstance()) {
                this.f13670 = conclusionOfConditionalEffect;
            } else {
                C4680 c4680NewBuilder = ProtoBuf$Expression.newBuilder(this.f13670);
                c4680NewBuilder.m9307(conclusionOfConditionalEffect);
                this.f13670 = c4680NewBuilder.m9308();
            }
            this.f13674 |= 4;
        }
        if (protoBuf$Effect.hasKind()) {
            ProtoBuf$Effect.InvocationKind kind = protoBuf$Effect.getKind();
            kind.getClass();
            this.f13674 |= 8;
            this.f13672 = kind;
        }
        if (protoBuf$Effect.hasConditionKind()) {
            ProtoBuf$Effect.EffectConditionKind conditionKind = protoBuf$Effect.getConditionKind();
            conditionKind.getClass();
            this.f13674 |= 16;
            this.f13673 = conditionKind;
        }
        this.f13804 = this.f13804.m9411(protoBuf$Effect.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Effect m9306() {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
        int i = this.f13674;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Effect.effectType_ = this.f13675;
        if ((this.f13674 & 2) == 2) {
            this.f13671 = Collections.unmodifiableList(this.f13671);
            this.f13674 &= -3;
        }
        protoBuf$Effect.effectConstructorArgument_ = this.f13671;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        protoBuf$Effect.conclusionOfConditionalEffect_ = this.f13670;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$Effect.kind_ = this.f13672;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$Effect.conditionKind_ = this.f13673;
        protoBuf$Effect.bitField0_ = i2;
        return protoBuf$Effect;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9305((ProtoBuf$Effect) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9305(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9305(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4677.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
