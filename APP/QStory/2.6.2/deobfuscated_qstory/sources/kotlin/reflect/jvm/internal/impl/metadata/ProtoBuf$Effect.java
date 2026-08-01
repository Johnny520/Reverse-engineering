package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Effect extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(9);
    private static final ProtoBuf$Effect defaultInstance;
    private int bitField0_;
    private ProtoBuf$Expression conclusionOfConditionalEffect_;
    private EffectConditionKind conditionKind_;
    private List<ProtoBuf$Expression> effectConstructorArgument_;
    private EffectType effectType_;
    private InvocationKind kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC4709 unknownFields;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum EffectConditionKind implements InterfaceC4721 {
        CONCLUSION_CONDITION(0, 0),
        RETURNS_CONDITION(1, 1),
        HOLDSIN_CONDITION(2, 2);

        private static InterfaceC4722 internalValueMap = new C4681();
        private final int value;

        EffectConditionKind(int i, int i2) {
            this.value = i2;
        }

        public static EffectConditionKind valueOf(int i) {
            if (i == 0) {
                return CONCLUSION_CONDITION;
            }
            if (i == 1) {
                return RETURNS_CONDITION;
            }
            if (i != 2) {
                return null;
            }
            return HOLDSIN_CONDITION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum EffectType implements InterfaceC4721 {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

        private static InterfaceC4722 internalValueMap = new C4682();
        private final int value;

        EffectType(int i, int i2) {
            this.value = i2;
        }

        public static EffectType valueOf(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum InvocationKind implements InterfaceC4721 {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static InterfaceC4722 internalValueMap = new C4679();
        private final int value;

        InvocationKind(int i, int i2) {
            this.value = i2;
        }

        public static InvocationKind valueOf(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(true);
        defaultInstance = protoBuf$Effect;
        protoBuf$Effect.initFields();
    }

    private ProtoBuf$Effect(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 8) {
                            int iM9407 = c4708.m9407();
                            EffectType effectTypeValueOf = EffectType.valueOf(iM9407);
                            if (effectTypeValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM9407);
                            } else {
                                this.bitField0_ |= 1;
                                this.effectType_ = effectTypeValueOf;
                            }
                        } else if (iM9397 == 18) {
                            if ((c & 2) != 2) {
                                this.effectConstructorArgument_ = new ArrayList();
                                c = 2;
                            }
                            this.effectConstructorArgument_.add((ProtoBuf$Expression) c4708.m9390(ProtoBuf$Expression.PARSER, c4725));
                        } else if (iM9397 == 26) {
                            C4680 builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                            ProtoBuf$Expression protoBuf$Expression = (ProtoBuf$Expression) c4708.m9390(ProtoBuf$Expression.PARSER, c4725);
                            this.conclusionOfConditionalEffect_ = protoBuf$Expression;
                            if (builder != null) {
                                builder.m9307(protoBuf$Expression);
                                this.conclusionOfConditionalEffect_ = builder.m9308();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9397 == 32) {
                            int iM94072 = c4708.m9407();
                            InvocationKind invocationKindValueOf = InvocationKind.valueOf(iM94072);
                            if (invocationKindValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM94072);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = invocationKindValueOf;
                            }
                        } else if (iM9397 == 40) {
                            int iM94073 = c4708.m9407();
                            EffectConditionKind effectConditionKindValueOf = EffectConditionKind.valueOf(iM94073);
                            if (effectConditionKindValueOf == null) {
                                c4707M9375.m9376(iM9397);
                                c4707M9375.m9376(iM94073);
                            } else {
                                this.bitField0_ |= 8;
                                this.conditionKind_ = effectConditionKindValueOf;
                            }
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 2) == 2) {
                        this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                    }
                    try {
                        c4707M9375.m9386();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c4710.m9413();
                        throw th2;
                    }
                    this.unknownFields = c4710.m9413();
                    makeExtensionsImmutable();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            }
        }
        if ((c & 2) == 2) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
        }
        try {
            c4707M9375.m9386();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4710.m9413();
            throw th3;
        }
        this.unknownFields = c4710.m9413();
        makeExtensionsImmutable();
    }

    public static ProtoBuf$Effect getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.effectType_ = EffectType.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.EMPTY_LIST;
        this.conclusionOfConditionalEffect_ = ProtoBuf$Expression.getDefaultInstance();
        this.kind_ = InvocationKind.AT_MOST_ONCE;
        this.conditionKind_ = EffectConditionKind.CONCLUSION_CONDITION;
    }

    public static C4677 newBuilder() {
        C4677 c4677 = new C4677();
        c4677.f13675 = EffectType.RETURNS_CONSTANT;
        c4677.f13671 = Collections.EMPTY_LIST;
        c4677.f13670 = ProtoBuf$Expression.getDefaultInstance();
        c4677.f13672 = InvocationKind.AT_MOST_ONCE;
        c4677.f13673 = EffectConditionKind.CONCLUSION_CONDITION;
        return c4677;
    }

    public ProtoBuf$Expression getConclusionOfConditionalEffect() {
        return this.conclusionOfConditionalEffect_;
    }

    public EffectConditionKind getConditionKind() {
        return this.conditionKind_;
    }

    public ProtoBuf$Expression getEffectConstructorArgument(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    public int getEffectConstructorArgumentCount() {
        return this.effectConstructorArgument_.size();
    }

    public List<ProtoBuf$Expression> getEffectConstructorArgumentList() {
        return this.effectConstructorArgument_;
    }

    public EffectType getEffectType() {
        return this.effectType_;
    }

    public InvocationKind getKind() {
        return this.kind_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9373 = (this.bitField0_ & 1) == 1 ? C4707.m9373(1, this.effectType_.getNumber()) : 0;
        for (int i2 = 0; i2 < this.effectConstructorArgument_.size(); i2++) {
            iM9373 += C4707.m9370(2, this.effectConstructorArgument_.get(i2));
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9373 += C4707.m9370(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9373 += C4707.m9373(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9373 += C4707.m9373(5, this.conditionKind_.getNumber());
        }
        int size = this.unknownFields.size() + iM9373;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasConclusionOfConditionalEffect() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasConditionKind() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasEffectType() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
            if (!getEffectConstructorArgument(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9387(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            c4707.m9380(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9380(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9387(4, this.kind_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9387(5, this.conditionKind_.getNumber());
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Effect getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4677 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4677 toBuilder() {
        return newBuilder(this);
    }

    public static C4677 newBuilder(ProtoBuf$Effect protoBuf$Effect) {
        C4677 c4677NewBuilder = newBuilder();
        c4677NewBuilder.m9305(protoBuf$Effect);
        return c4677NewBuilder;
    }

    private ProtoBuf$Effect(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private ProtoBuf$Effect(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
