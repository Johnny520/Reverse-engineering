package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4678 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ProtoBuf$Expression f13674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f13675;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public ProtoBuf$Effect.InvocationKind f13676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public ProtoBuf$Effect.EffectConditionKind f13677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13678;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Effect.EffectType f13679;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Effect protoBuf$EffectM9296 = m9296();
        if (protoBuf$EffectM9296.isInitialized()) {
            return protoBuf$EffectM9296;
        }
        throw new UninitializedMessageException(protoBuf$EffectM9296);
    }

    public final Object clone() {
        C4678 c4678 = new C4678();
        c4678.f13679 = ProtoBuf$Effect.EffectType.RETURNS_CONSTANT;
        c4678.f13675 = Collections.EMPTY_LIST;
        c4678.f13674 = ProtoBuf$Expression.getDefaultInstance();
        c4678.f13676 = ProtoBuf$Effect.InvocationKind.AT_MOST_ONCE;
        c4678.f13677 = ProtoBuf$Effect.EffectConditionKind.CONCLUSION_CONDITION;
        c4678.m9295(m9296());
        return c4678;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9295(ProtoBuf$Effect protoBuf$Effect) {
        if (protoBuf$Effect == ProtoBuf$Effect.getDefaultInstance()) {
            return;
        }
        if (protoBuf$Effect.hasEffectType()) {
            ProtoBuf$Effect.EffectType effectType = protoBuf$Effect.getEffectType();
            effectType.getClass();
            this.f13678 |= 1;
            this.f13679 = effectType;
        }
        if (!protoBuf$Effect.effectConstructorArgument_.isEmpty()) {
            if (this.f13675.isEmpty()) {
                this.f13675 = protoBuf$Effect.effectConstructorArgument_;
                this.f13678 &= -3;
            } else {
                if ((this.f13678 & 2) != 2) {
                    this.f13675 = new ArrayList(this.f13675);
                    this.f13678 |= 2;
                }
                this.f13675.addAll(protoBuf$Effect.effectConstructorArgument_);
            }
        }
        if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
            ProtoBuf$Expression conclusionOfConditionalEffect = protoBuf$Effect.getConclusionOfConditionalEffect();
            if ((this.f13678 & 4) != 4 || this.f13674 == ProtoBuf$Expression.getDefaultInstance()) {
                this.f13674 = conclusionOfConditionalEffect;
            } else {
                C4681 c4681NewBuilder = ProtoBuf$Expression.newBuilder(this.f13674);
                c4681NewBuilder.m9297(conclusionOfConditionalEffect);
                this.f13674 = c4681NewBuilder.m9298();
            }
            this.f13678 |= 4;
        }
        if (protoBuf$Effect.hasKind()) {
            ProtoBuf$Effect.InvocationKind kind = protoBuf$Effect.getKind();
            kind.getClass();
            this.f13678 |= 8;
            this.f13676 = kind;
        }
        if (protoBuf$Effect.hasConditionKind()) {
            ProtoBuf$Effect.EffectConditionKind conditionKind = protoBuf$Effect.getConditionKind();
            conditionKind.getClass();
            this.f13678 |= 16;
            this.f13677 = conditionKind;
        }
        this.f13808 = this.f13808.m9401(protoBuf$Effect.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Effect m9296() {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
        int i = this.f13678;
        int i2 = (i & 1) != 1 ? 0 : 1;
        protoBuf$Effect.effectType_ = this.f13679;
        if ((this.f13678 & 2) == 2) {
            this.f13675 = Collections.unmodifiableList(this.f13675);
            this.f13678 &= -3;
        }
        protoBuf$Effect.effectConstructorArgument_ = this.f13675;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        protoBuf$Effect.conclusionOfConditionalEffect_ = this.f13674;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        protoBuf$Effect.kind_ = this.f13676;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        protoBuf$Effect.conditionKind_ = this.f13677;
        protoBuf$Effect.bitField0_ = i2;
        return protoBuf$Effect;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9295((ProtoBuf$Effect) generatedMessageLite);
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
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9295(r3)
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
            r2.m9295(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4678.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
